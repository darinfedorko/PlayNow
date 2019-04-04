package playnow;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PlaylistTable extends JPanel {

    PlaylistTableModel model1;

    public PlaylistTable() {

        model1 = new PlaylistTableModel();

        JTable table = new JTable(model1);
        table.setPreferredScrollableViewportSize(new Dimension(500, 140));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane); //Not sure how to configure, this statement came from an in class example
    }

    public PlaylistTableModel getTableModel() {
        return model1;
    }

}
