package com.example.bt1_simple_music.repository;

import com.example.bt1_simple_music.model.Songs;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SongRepository implements ISongRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Songs> findAll() {
        String sql="select s from Songs s";
        TypedQuery<Songs> query=entityManager.createQuery(sql,Songs.class);
        return query.getResultList();
    }

    @Override
    public Songs findById(int id) {
        return entityManager.find(Songs.class, id);
    }

    @Override
    @Transactional
    public void save(Songs song) {
        if(findById(song.getId())==null){
            entityManager.persist(song);
        }
        else{
            entityManager.merge(song);
        }
    }

    @Override
    public void delete(Songs song) {
        entityManager.remove(song);

    }


}
