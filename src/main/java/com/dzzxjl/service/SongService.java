package com.dzzxjl.service;

import com.dzzxjl.domain.Song;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dzzxjl on 2017/7/17.
 */
@Service
public interface SongService {
    // 不需要加访问权限
    List<Song> getSongList();
    void addSong(Song song);
}
