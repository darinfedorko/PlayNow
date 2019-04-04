package playnow;

import java.util.ArrayList;
import java.util.Random;

public class Playlist {

    private final ArrayList<Song> songList;
    private final ArrayList<Song> fullList;

    public Playlist(ArrayList<Song> fullList) {

        this.songList = new ArrayList<>();
        this.fullList = fullList;

        populatePlaylist();

    }

    private void populatePlaylist() {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            songList.add(fullList.get(rand.nextInt(fullList.size())));
        }

    }

    public ArrayList<Song> getPlaylist() {
        return songList;
    }

}
