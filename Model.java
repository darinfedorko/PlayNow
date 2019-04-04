package playnow;

import java.util.ArrayList;

public class Model {

    private final ArrayList<Song> songList;
    private final Scraper songScraper;

    public Model() {
        songList = new ArrayList<>();
        songScraper = new Scraper();
    }

    public ArrayList<Song> getListOfSongs() {
        return songList;
    }

    public void clearList() {
        songList.removeAll(songList);
    }

    public void scrapeSongs() {
        clearList();
        for (Song song : songScraper.getSongs()) {
            songList.add(song);
        }
        System.out.println("Scrape Complete!");
    }

}
