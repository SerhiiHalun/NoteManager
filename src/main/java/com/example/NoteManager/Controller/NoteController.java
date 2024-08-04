package com.example.NoteManager.Controller;

import com.example.NoteManager.Entity.Note;
import com.example.NoteManager.Service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RequiredArgsConstructor
@Controller
@RequestMapping( "/note")
public class NoteController {
    private final NoteService noteService;


    @GetMapping("/list")
    public ModelAndView allNotes() {
        ModelAndView model = new ModelAndView("note-list");
        model.addObject("notes", noteService.listAll());
        return model;
    }

    @GetMapping("/edit")
    public ModelAndView editNotePage(@RequestParam(name = "id") long id) {
        Note note = noteService.getById(id);
        ModelAndView model = new ModelAndView("note-edit");

        model.addObject("note", note);
        return model;
    }

    @PostMapping("/delete")
    public ModelAndView deleteNote(@RequestParam(name = "id") long id) {

        noteService.deleteById(id);
        return new ModelAndView("redirect:/note/list");
    }

    @PostMapping("/edit")
    public ModelAndView editNote(@ModelAttribute Note note) {
        noteService.update(note);
        return new ModelAndView("redirect:/note/list");
    }

    @PostMapping("/create")
    public ModelAndView createNote(@ModelAttribute Note note) {
        noteService.add(note);
        return new ModelAndView("redirect:/note/list");
    }
}
