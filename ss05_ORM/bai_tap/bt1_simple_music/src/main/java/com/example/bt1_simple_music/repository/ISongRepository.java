package com.example.bt1_simple_music.repository;


import com.example.bt1_simple_music.model.Songs;

import java.util.List;

public interface ISongRepository {
    List<Songs> findAll();

    Songs findById(int id);
    void save(Songs song);
    void delete( Songs song);

}
