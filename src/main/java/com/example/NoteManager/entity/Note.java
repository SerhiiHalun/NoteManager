package com.example.NoteManager.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "content")
    private String content;
}
