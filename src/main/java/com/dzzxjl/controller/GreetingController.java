package com.dzzxjl.controller;

import com.dzzxjl.repository.SongRepository;
import com.dzzxjl.domain.Greeting;
import com.dzzxjl.domain.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dzzxjl on 2017/7/13.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
//    ConfiBean confiBean;

    SongRepository songRepository;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


//    @RequestMapping("/index")
//    public Song index() {
//        Song song = null;
//
//
////        songRepository.save(new Song(2, "111", "111"));
//        song = (Song) this.songRepository.findOne(1);
//
////        song = new Song();
////        song.setId(2);
////        song.setName("sss");
////        song.setSinger("sss");
//        return song;
//    }
}
