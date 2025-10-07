package com.rencber.notesapi.repository;

import com.rencber.notesapi.model.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // Bu sinifin veri erisimiyle ilgilendigini springe'e bildirir.

public class NoteRepository {
    //Bu liste simdilik fake database gibi davranacak
    private final List<Note> notes = new ArrayList<>();

    //Tum notlari getir
    public List<Note> findAll() {
        return notes;
    }

    //yeni not ekle
    public  Note save(Note note) {
        notes.add(note);
        return note;
    }
}
