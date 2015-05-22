package com.epam.bean;

import java.util.ArrayList;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class NoteBook implements java.io.Serializable {
    private ArrayList<Note> noteBook;

    public NoteBook() {
        noteBook = new ArrayList();
    }

    public ArrayList<Note> getNotes() {
        return noteBook;
    }

    public void addNote(Note note) {
        noteBook.add(note);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!noteBook.equals(obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = 0;
        for (int i = 0; i < noteBook.size(); i++) {
            result = (int) (7 * ((null == noteBook.get(i)) ? 2 : noteBook.get(i).hashCode()));
        }
        return result;
    }

    public String toString() {
        String result = getClass().getName() + "@";
        for (int i = 0; i < noteBook.size(); i++) {
            result = result + noteBook.get(i).toString();
        }
        return result;
    }
}

