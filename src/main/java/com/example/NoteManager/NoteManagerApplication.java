package com.example.NoteManager;

import com.example.NoteManager.Entity.Note;
import com.example.NoteManager.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteManagerApplication implements CommandLineRunner {

	private final NoteService noteService;

	@Autowired
	public NoteManagerApplication(NoteService noteService) {
		this.noteService = noteService;
	}

	public static void main(String[] args) {
		SpringApplication.run(NoteManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Note note1 = new Note();
		note1.setTitle("First Note");
		note1.setContent("This is the content of the first note.");
		noteService.add(note1);

		Note note2 = new Note();
		note2.setTitle("Second Note");
		note2.setContent("This is the content of the second note.");
		noteService.add(note2);



	}
}
