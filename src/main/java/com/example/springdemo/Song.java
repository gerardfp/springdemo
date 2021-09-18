package com.example.springdemo;


import lombok.Builder;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
//    UUID id;

    public String title;
    public String artist;

    public Song(){

    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
