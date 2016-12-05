/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.bll;

import mytunes.be.MyTunes;
import mytunes.dal.MytunesDAO;

/**
 *
 * @author FrederikD
 */
public class MyTunesManager {
    private MytunesDAO SongDAO;
    
    public MyTunesManager()
    {
        SongDAO = new MytunesDAO();
    }
    /**
     * Creates a new song object
     * @param songName
     * @param artistName
     * @param songCategory
     * @param playTime
     * @return 
     */
    public MyTunes createNewSong(String songName,String artistName,String songCategory, int playTime)
    {
        return new MyTunes(songName, artistName, songCategory, playTime);
    }
}
