package com.example.NoteManager;



import com.example.NoteManager.entity.Note;
import com.example.NoteManager.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteManagerApplication  {

	public static void main(String[] args) {
		SpringApplication.run(NoteManagerApplication.class, args);
	}


}


