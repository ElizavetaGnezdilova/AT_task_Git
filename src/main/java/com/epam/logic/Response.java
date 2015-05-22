package com.epam.logic;

import com.epam.bean.Note;
import com.epam.bean.NoteBook;

import java.util.ArrayList;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class Response {

    private Note note;
    private ArrayList<Note> notes;
    private String content;
    private Boolean result;
    private NoteBook noteBook;

    public Response() {
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public ArrayList<Note> getNotes() {
        return this.notes;
    }

    public Boolean getResult() {
        return result;
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBook noteBook) {
        this.noteBook = noteBook;
    }
}
