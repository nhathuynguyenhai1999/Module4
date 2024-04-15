package com.codegym.module4.springmvcsong.repository;
import com.codegym.module4.springmvcsong.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song,Long> {
    List<Song> findAll();

    Object save(Song song);

    void deleteById(Long id);
}