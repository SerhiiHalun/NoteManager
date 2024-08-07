package com.example.NoteManager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "note")
public class Note {
    @Id
    private long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "content")
    private String content;
}
