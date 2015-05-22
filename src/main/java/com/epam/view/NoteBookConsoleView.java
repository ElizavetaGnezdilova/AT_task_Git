package com.epam.view;


import com.epam.bean.Note;
import com.epam.bean.NoteBook;
import com.epam.logic.Response;

/**
 * Created by Elizaveta_Gnezdilova on 4/23/2015.
 */
public class NoteBookConsoleView {

    public NoteBookConsoleView() {
    }

    public void print(Note... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + " " + args[i].toString());
        }
    }

    public void print(NoteBook nb) {
        System.out.println("NoteBook");
        for (int i = 0; i < nb.getNotes().size(); i++) {
            System.out.println(nb.getNotes().get(i).toString());
        }


    }

    public void print(Response response) {
        if (response.getNote() != null) {
            this.print(response.getNote());
        }
        if (response.getNotes() != null) {
            for (Note i : response.getNotes()) {
                this.print(i);
            }
        }
        if (response.getNoteBook() != null) {
            this.print(response.getNoteBook());
        }
        if (response.getResult() != null) {
            System.out.println(response.getResult());
        }

    }
}
