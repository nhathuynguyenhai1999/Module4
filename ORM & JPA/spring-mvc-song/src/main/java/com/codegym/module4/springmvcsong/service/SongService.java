package com.codegym.module4.springmvcsong.service;

import com.codegym.module4.springmvcsong.model.Song;
import com.codegym.module4.springmvcsong.repository.SongRepository; // Import repository

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository; // Khai báo final để inject dependency

//    @Autowired // Annotation để Spring inject dependency tự động
//    public SongService(SongRepository songRepository) {
//        this.songRepository = songRepository;
//    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public void saveSong(Song song) {
        songRepository.save(song);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}

