
package playnow;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritePlaylist {
    
    public static void writePlay(Playlist samplePlaylist) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Playlist.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(samplePlaylist);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
