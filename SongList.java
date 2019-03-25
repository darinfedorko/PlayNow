package playnow;

import java.util.ArrayList;

public class SongList {

    private final ArrayList<Song> songList;

    public SongList() {
        songList = new ArrayList<>();
        //addTempSongsToList();
    }
    //Remove the Below method
    private void addTempSongsToList() {
        getListOfSongs().add(new Song(new String[]{"Mo Bamba", "Sheck Wes", "Mud Boy", "Rap/Hip-Hop"}));
        getListOfSongs().add(new Song(new String[]{"SICKO MODE", "Travis Scott", "ASTROWORLD", "Rap/Hip-Hop"}));
        getListOfSongs().add(new Song(new String[]{"All Star", "Smash Mouth", "Astro Lounge", "Rock"}));
    }

    public ArrayList<Song> getListOfSongs() {
        return songList;
    }
    
    public void clearList() {
        songList.removeAll(songList);
    }
            

}
