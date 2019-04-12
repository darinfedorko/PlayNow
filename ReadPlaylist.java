
package playnow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadPlaylist {
    
    public ArrayList<Song> ReadUsername() {
        Playlist p = null;
        try {
            FileInputStream fileIn = new FileInputStream("Username.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p = (Playlist) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();

        } catch (ClassNotFoundException c) {

            c.printStackTrace();

        }

        return p.getPlaylist();
    }
    
}
