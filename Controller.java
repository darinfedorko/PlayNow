package playnow;

class Controller {

    private final SongList songList;
    private final PlayNowView fullView;
    private final Scraper songScraper;

    public Controller() {

        songList = new SongList();
        songScraper = new Scraper(this);
        fullView = new PlayNowView(this);
        fullView.setVisible(true);

    }

    public SongList getSongList() {
        return songList;
    }

    public void createSamplePlaylist() {
        getSongList().getListOfSongs().forEach((song) -> {

            System.out.println(song.getInfo() + "\n");
        });
    }

    public void scrapeSongs() {
        songList.clearList();
        for (Song song : songScraper.getSongs()) {
            songList.getListOfSongs().add(song);
        }
    }

}
