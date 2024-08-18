package com.example.NoteManager.service;






import com.example.NoteManager.entity.Note;
import com.example.NoteManager.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor

public class NoteService {


    private  final NoteRepository noteRepository;



    public List<Note> listAll(){
        return noteRepository.findAll();
    }
    public Note add(Note note){

        noteRepository.save(note);

        return note;
    }
    public void deleteById(long id){
        if (noteRepository.existsById(id)) {
            noteRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("Note with id " + id + " not found.");
        }
    }
    public void update(Note note){
        if (noteRepository.existsById(note.getId())) {
            noteRepository.save(note);
        } else {
            throw new NoSuchElementException("Note with id " + note.getId() + " not found.");
        }
    }
    public Note getById(long id){
        return noteRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Note with id " + id + " not found."));
    }



}
