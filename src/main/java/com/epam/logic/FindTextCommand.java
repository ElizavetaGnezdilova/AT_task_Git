package com.epam.logic;


import com.epam.bean.Note;
import com.epam.dao.NoteBookProvider;

import java.util.ArrayList;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class FindTextCommand implements Command {
    public Response execute(Request request) {
        Response resp = new Response();
        ArrayList<Note> notes = new ArrayList<Note>();
        String content = (String) request.getParam(RequestParamName.NOTE_CONTENT);
        for (Note i : NoteBookProvider.getNoteBook().getNotes()) {
            if (i.getContent().indexOf(content) != -1) {
                notes.add(i);
            }

        }
        resp.setNotes(notes);
        return resp;
    }
}
