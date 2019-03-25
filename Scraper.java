package playnow;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {

    private final Controller finalCntl;
    private final ArrayList<Song> songList;
    private ArrayList<String> textList;

    public Scraper(Controller finalCntl) {

        this.finalCntl = finalCntl;
        songList = new ArrayList<>();
        textList = new ArrayList<>();
        textListBuilder(textList);
        listCleaner(textList);
        songListBuilder(textList, songList);
//        for (String data : textList) {
//            System.out.println(data);
//        }

    }

    public static void textListBuilder(ArrayList<String> textList) {
        Document document;
        try {
            //Get Document object after parsing the html from given url.
            document = Jsoup.connect("https://snkhan.co.uk/stuff/iTunes.php?chart=US").get();

            Elements links = document.select("a[href]");
            //Add to music list
            for (Element link : links) {
                textList.add(link.text());
            }

        } catch (IOException e) {
            System.out.println(e + "-IO Exception");
        }
    }

    public static void listCleaner(ArrayList<String> textList) {
        for (int i = 0; i < 7; i++) {
            textList.remove(0);
        }
        for (int i = 0; i < 230; i++) {
            textList.remove(textList.size() - 1);
        }
    }
    
    public static void songListBuilder(ArrayList<String> textList, ArrayList<Song> songList) {
        int textListSize = textList.size();
        String[] tempArray = new String[4];
        for (int i = 0; i < textListSize; i=i+5) {
            tempArray[0] = textList.get(i);
            tempArray[2] = textList.get(i + 1);
            tempArray[1] = textList.get(i + 2);
            tempArray[3] = textList.get(i + 3);
            
            Song tempSong = new Song(tempArray);
            songList.add(tempSong);
        }
    }
    
    public ArrayList<Song> getSongs() {

        return songList;
    }

}
