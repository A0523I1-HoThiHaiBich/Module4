package com.example.bt1_simple_music.service;

import com.example.bt1_simple_music.model.Songs;
import com.example.bt1_simple_music.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository repository;
    @Override
    public List<Songs> findAll() {

        return repository.findAll();
    }

    @Override
    public void save(Songs song) {
        repository.save(song);

    }

    @Override
    public void delete(Songs song) {
        repository.delete(song);

    }


}
