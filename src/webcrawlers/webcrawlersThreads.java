package webcrawlers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class webcrawlersThreads {
    private static final int max_d = 2;// Maximum depth for crawling
    private static final int max_t = 4; // Maximum number of threads

    private final Set < String > visitedUrls = new HashSet < > ();

    public void crawl(String url, int depth) {
        if (depth > max_d || visitedUrls.contains(url)) {
            return;
        }

        visitedUrls.add(url);
        System.out.println("Crawling: " + url);

        try {
            Document doc = Jsoup.connect(url).get();
            processPage(doc);

            Elements links = doc.select("a[href]");
            for (Element link: links) {
                String nextUrl = link.absUrl("href");
                crawl(nextUrl, depth + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processPage(Document doc) {
        // Process the web page content as needed
        System.out.println("Processing: " + doc.title());
    }

    public void startcrawl(String[] seedUrls) {
        ExecutorService executor = Executors.newFixedThreadPool(max_t);

        for (String url: seedUrls) {
            executor.execute(() -> crawl(url, 0));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Crawling completed.");
    }

    public static void main(String[] args) {
        // Add URLs here
        String[] startURL = {
                "https://takeuforward.com",
        };

        webcrawlersThreads webcrawl = new webcrawlersThreads();
        webcrawl.startcrawl(startURL);
    }
}
