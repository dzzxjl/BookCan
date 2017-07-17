package com.dzzxjl.controller;

import com.dzzxjl.model.Song;
import com.dzzxjl.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
