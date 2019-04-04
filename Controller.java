package playnow;

class Controller {

    private final Model model;
    private final View fullView;

    public Controller() {

        model = new Model();
        fullView = new View(this);
        fullView.setVisible(true);

    }

    public void createSamplePlaylist() {

        if (model.getListOfSongs().size() > 0) {
            Playlist samplePlaylist = new Playlist(model.getListOfSongs());

            for (int i = 0; i < 10; i++) {

                fullView.getContentPanel().getTableModel().setValueAt(samplePlaylist.getPlaylist().get(i).getSongName(), i, 0);
                fullView.getContentPanel().getTableModel().setValueAt(samplePlaylist.getPlaylist().get(i).getSongArtist(), i, 1);
                fullView.getContentPanel().getTableModel().setValueAt(samplePlaylist.getPlaylist().get(i).getSongAlbum(), i, 2);
                fullView.getContentPanel().getTableModel().setValueAt(samplePlaylist.getPlaylist().get(i).getSongGenre(), i, 3);

            }
        } else {
            System.out.println("Please scrape for songs first!");
        }
    }

    public void scrapeSongs() {
        model.scrapeSongs();
    }

}
