package com.example.notesapp;

import java.util.ArrayList;
public class NoteStorage {
    private static NoteStorage instance = null;
    private ArrayList<Note> notes;
    private NoteStorage(){
        notes = new ArrayList<>();
    }
    public static NoteStorage getInstance(){
        if (instance == null){
            instance = new NoteStorage();
        }
        return instance;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void addNote(Note note){
        notes.add(note);
    }
}

