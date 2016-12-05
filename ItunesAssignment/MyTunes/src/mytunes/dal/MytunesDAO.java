/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import mytunes.be.MyTunes;

/**
 *
 * @author FrederikD
 */
public class MytunesDAO {
    
    public List<MyTunes> loadMusicFromFile(File file) throws IOException, ClassNotFoundException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            return (List<MyTunes>) ois.readObject();
        }
    }
    
}
