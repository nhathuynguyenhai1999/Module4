package com.codegym.module4.springmvcsong.repository;
import com.codegym.module4.springmvcsong.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository implements JpaRepository<Song,Long> {
    List<Song> findAll();

    void save(Song song);

    void deleteById(Long id);
}