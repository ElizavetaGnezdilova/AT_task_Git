package com.epam.logic;

import com.epam.bean.Note;
import com.epam.dao.NoteBookProvider;

import java.util.ArrayList;


/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class FindDateCommand implements Command {
    public Response execute(Request request) {
        Response resp = new Response();
        ArrayList<Note> notes = new ArrayList<Note>();
        String date = request.getParam(RequestParamName.NOTE_DATE).toString();
        for (Note i : NoteBookProvider.getNoteBook().getNotes()) {
            if (i.getDateCreation().equals(date)) {
                notes.add(i);
            }

        }
        if (notes.size() > 0) {
            resp.setResult(true);

            resp.setNotes(notes);
            return resp;
        } else {
            resp.setResult(false);
            return resp;
        }


    }
}
