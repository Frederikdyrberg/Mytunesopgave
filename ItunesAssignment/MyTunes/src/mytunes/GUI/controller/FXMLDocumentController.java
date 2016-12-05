/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import mytunes.be.MyTunes;

/**
 *
 * @author Patrick
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button newPlaylist;
    @FXML
    private Button editPlaylist;
    @FXML
    private Button deletePlaylist;
    @FXML
    private Button moveSongUp;
    @FXML
    private Button moveSongDown;
    @FXML
    private Label label1;
    @FXML
    private Button deleteSongs;
    @FXML
    private Button editSongs;
    @FXML
    private Button newSong;
    @FXML
    private Button moveSong;
    @FXML
    private Button close;
    @FXML
    private Slider slider;
    @FXML
    private Button deletePlaylistSong;
    
    private MyTunes currentSong;
    @FXML
    private Font x1;
    @FXML
    private TableColumn<MyTunes, String> columnSong;
    @FXML
    private TableColumn<MyTunes, String> columnArtist;
    @FXML
    private TableColumn<MyTunes, Integer> columnTime;
    @FXML
    private TableColumn<MyTunes, String> columnTitle;
    @FXML
    private TableColumn<MyTunes, String> columnArtist2;
    @FXML
    private TableColumn<MyTunes, String> columnCategory;
    @FXML
    private TableColumn<MyTunes, Integer> columnTime2;
    
    MediaPlayer mediaPlayer = null;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    public void setSong(MyTunes song)
    {
        currentSong = song;
    }
    @FXML
    private void stopSong(ActionEvent event) {
        if(mediaPlayer != null)
        {
             mediaPlayer.stop();
        } 
    }    

    @FXML
    private void pauseSong(ActionEvent event) 
    {
        if(mediaPlayer == null)
        {
        String path = "C:/Users/FrederikD/Music/Music/Radiogaga.mp3";
        File file = new File(path);
        Media hit = new Media(file.toURI().toString());
        if(mediaPlayer != null)
            mediaPlayer.stop();
            mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
        }
        if(mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING)
        {
            mediaPlayer.pause();
        }
        else
        {
            mediaPlayer.play();
        }
    }
}
