package webcrawlers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class webcrawlersThreads implements Runnable {

    private static final int MAX_THREADS = 10;
    private static final int MAX_DEPTH = 20;
    private final Set<String> visitedLinks = new HashSet<>();
    private String url;
    private int depth;
    private ExecutorService executor;

    public webcrawlersThreads(String startUrl,int initialdepth) {
        this.url = startUrl;
        this.depth = initialdepth;
        executor = Executors.newFixedThreadPool(MAX_THREADS);
    }

    @Override
    public void run() {
        long thread = Thread.currentThread().getId();
        System.out.println(thread);
        crawl(url, depth);
        executor.shutdown();
    }

    private void crawl(String url,int depth) {

        if(visitedLinks.contains(url)) {
            return; // Already visited this URL
        }

            try {
                Document doc = Jsoup.connect(url).get();
                Elements linksOnPage = doc.select("a[href]");

                System.out.println("Found ( " + linksOnPage.size() + ") links on: " + url);
                long thread = Thread.currentThread().getId();
                System.out.println("Thread id is :" + thread);
                visitedLinks.add(url);

                for (Element link : linksOnPage) {
                    String nextLink = link.absUrl("href");

                    if (notVisited(nextLink)) {
                        System.out.println(nextLink);
                        if(depth<=MAX_DEPTH) {
                            executor.execute(new webcrawlersThreads(nextLink, depth++));
                        }
                        System.out.println("depth :"+depth);
                    }
                }
            } catch (IOException e) {
                System.err.println("For" + url + ": " + e.getMessage());
            }
        }


    private synchronized boolean notVisited(String nextLink) {
        if (visitedLinks.contains(nextLink)) {
            return false;
        } else {
            visitedLinks.add(nextLink);
            return true;
        }
    }

    public static void main(String[] args) {
        new Thread(new webcrawlersThreads("https://justbake.in/",0)).start();
    }
}