package com.example.bt1_simple_music.service;

import com.example.bt1_simple_music.model.Songs;

import java.util.List;

public interface ISongService {
    List<Songs> findAll();
    void save(Songs song);
    void delete(Songs song);
}
