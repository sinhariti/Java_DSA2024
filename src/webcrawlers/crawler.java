package webcrawlers;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

public class crawler {
    public static void main(String[] args){
        String url="https://takeuforward.com";
        crawl(1,url, new ArrayList<String>());
    }
    private static void crawl(int level,String url, ArrayList<String> visited){
        if(level<=5){
            Document doc = request(url,visited);
            if(doc!=null){
                for(Element link :doc.select("a[href]")){
                    String next_link=link.absUrl("href");
                    if(!visited.contains(next_link)){
                        crawl(level++,next_link,visited);
                    }
                }
            }
        }
    }
    private static Document request(String url, ArrayList<String> v){
        try{
            Connection con= Jsoup.connect(url);
            Document doc = con.get();
            if(con.response().statusCode()==200){
                System.out.println("Link: "+url);
                System.out.println(doc.title() );
                v.add(url);
                return doc;
            }
            return null;
        }
        catch(IOException e){
            return null;
        }
    }
}
