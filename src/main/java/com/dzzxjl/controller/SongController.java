package com.dzzxjl.controller;

import com.dzzxjl.domain.Song;
import com.dzzxjl.service.SongService;
import com.dzzxjl.service.impl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/17.
 */

@RestController
public class SongController {

    @Autowired
    SongServiceImpl songService;


//    @RequestMapping("/getsong")
//    public List<Song> getSongList() {
//        List<Song> songList = songService.getSongList();
//        return songList;
//    }

    @RequestMapping("/addSong")
    public boolean addSong(@RequestParam(value = "id") int id,
                           @RequestParam(value = "name") String name,
                           @RequestParam(value = "singer") String singer) {
        Song song = new Song(id, name, singer);
        songService.addSong(song);
        return true;
    }


}
