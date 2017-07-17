package com.dzzxjl.service;

import com.dzzxjl.model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/7/17.
 */
@Service
public class SongService {
    private List<Song> songList = new ArrayList<>();

    public List<Song> getSongList() {
        Song song_jay = new Song(1,"juhuxtai","jay");
        Song song_eason = new Song(2,"mandishang","eason");

        songList.add(song_eason);
        songList.add(song_jay);

        return  songList;
    }

    public boolean addSong(Song song) {
        Song temp = song;
        System.out.println(temp);

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(new SongService().getSongList());
    }
}
