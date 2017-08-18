package com.dzzxjl.service.impl;

import com.dzzxjl.domain.Song;
import com.dzzxjl.repository.SongRepository;
import com.dzzxjl.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dzzxjl on 2017/8/14.
 */
@Service
public class SongServiceImpl implements SongService{
    @Autowired
//    SongRepository songRepository;
    RedisTemplate redisTemplate;

    public void addSong(Song song) {
//        this.songRepository.save(song);
        ValueOperations<String, Song> valueOper = redisTemplate.opsForValue();
        valueOper.set(song.getName(), song);
    }



    @Override
    public Song getSong() {
        return null;
    }
}
