package com.codegym.module4.springmvcsong.controller;
import com.codegym.module4.springmvcsong.model.Song;
import com.codegym.module4.springmvcsong.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/songs")
    public String getAllSongs(Model model) {
        List<Song> songs = songService.getAllSongs();
        model.addAttribute("songs", songs);
        return "song"; // Thymeleaf template name
    }
    @PostMapping("/songs")
    public String saveSong(@ModelAttribute("song") Song song) {
        songService.saveSong(song);
        return "redirect:/songs";
    }
    @GetMapping("/songs/delete/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
        songService.deleteSong(id);
        return "redirect:/songs";
    }
}
