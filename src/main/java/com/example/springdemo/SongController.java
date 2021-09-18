package com.example.springdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SongController {
    @GetMapping("/itworks")
    public String itworks() {
        return "It works DDD";
    }

    private final SongRepository songRepository;

    @GetMapping
    public List<Song> getAll() {
        return songRepository.findAll();
    }

    @GetMapping("/{title}")
    public List<Song> getOne(@PathVariable String title) {
        return songRepository.findByTitle(title);
    }

    @GetMapping("/save")
    public Song save(@RequestParam("title") String title, @RequestParam("artist") String artist) {
        return songRepository.save(Song.builder().title(title).artist(artist).build());
    }
}