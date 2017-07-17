package com.dzzxjl.controller;

import com.dzzxjl.model.Song;
import com.dzzxjl.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/17.
 */

@RestController
public class SongController {



//    public SongService songService = new SongService();

    @Autowired
    public SongService songService;

    @RequestMapping("/getsong")
    public List<Song> getSongList() {
        List<Song> songList = songService.getSongList();
        return songList;
    }

    @RequestMapping("/addSong")
    public boolean addSong(@RequestParam(value = "id") int id,
                           @RequestParam(value = "name") String name,
                           @RequestParam(value = "singer") String singer) {
        Song song = new Song(id, name, singer);
        songService.addSong(song);
        return true;
    }
}
