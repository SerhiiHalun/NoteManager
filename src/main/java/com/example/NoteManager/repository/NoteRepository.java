package com.example.NoteManager.repository;



import com.example.NoteManager.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
