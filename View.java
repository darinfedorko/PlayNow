package playnow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {

    private final Controller finalCntl;
    private JPanel viewPanel;
    private JPanel buttonPanel;
    private JButton createPlaylist;
    private JButton scrapeButton;
    private PlaylistTable contentPane; //temp

    public View(Controller finalCntl) {

        this.finalCntl = finalCntl;
        initComponents();

    }

    private void initComponents() {
        setTitle("PlayNow!");
        setSize(600, 400);
        setLocationRelativeTo(null);  // center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        viewPanel = new JPanel(new GridLayout(5, 1));
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        viewPanel.add(new JLabel("Click button below to create playlist:"));
        createPlaylist = new JButton("Create Playlist");
        buttonPanel.add(createPlaylist);
        scrapeButton = new JButton("Scrape for Songs");
        buttonPanel.add(scrapeButton);

        createPlaylist.addActionListener(event -> createSamplePlaylist());
        scrapeButton.addActionListener(event -> scrapeSongs());

        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(viewPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        //Below is table info
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Playlist View");
        contentPane = new PlaylistTable();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setOpaque(true);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
        //Above is table info
    }

    private void createSamplePlaylist() {
        finalCntl.createSamplePlaylist();
    }

    private void scrapeSongs() {
        finalCntl.scrapeSongs();
    }

    public PlaylistTable getContentPanel() {
        return contentPane;
    }

}
