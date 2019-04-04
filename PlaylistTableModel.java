package playnow;

import javax.swing.table.AbstractTableModel;

public class PlaylistTableModel extends AbstractTableModel {

    final String[] columnNames = {"Title", "Artist", "Album", "Genre"};
    private final Object[][] data = new Object[11][4];

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;

    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public Object[][] getData() {
        return data;
    }

}
