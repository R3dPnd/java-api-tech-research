package com.inertia.controllers;

import com.inertia.entities.JournalEntryEntity;
import com.inertia.service.data.implimentation.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/Journal")
@CrossOrigin(origins = "http://localhost:4200")
public class JournalController implements CrudControllerBase<JournalEntryEntity>{

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public JournalEntryEntity get(@RequestParam int id){
        return journalEntryService.get(id);
    }

    @PostMapping
    public JournalEntryEntity saveOrUpdate(@RequestParam  JournalEntryEntity entry) {
        return this.journalEntryService.saveOrUpdate(entry);
    }

    @DeleteMapping
    public JournalEntryEntity delete(@RequestParam  int id) {
        return null;
    }

    @RequestMapping(name="/All")
    public List<JournalEntryEntity> getAll(){
        return journalEntryService.getAll();
    }
}
