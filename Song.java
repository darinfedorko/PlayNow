package playnow;

public class Song {

    private final String songName;
    private final String songArtist;
    private final String songAlbum;
    private final String songGenre;

    public Song(String[] songInfo) {

        this.songName = songInfo[0];
        this.songArtist = songInfo[1];
        this.songAlbum = songInfo[2];
        this.songGenre = songInfo[3];

    }

    public String getInfo() {

        String songOutput = "Title: " + songName + " | Artist: " + songArtist + "  | Album: " + songAlbum + " | Genre: " + songGenre;
        return songOutput;
    }

}
