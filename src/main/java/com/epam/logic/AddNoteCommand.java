package com.epam.logic;

import com.epam.bean.Note;
import com.epam.dao.NoteBookProvider;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class AddNoteCommand implements Command {

    public Response execute(Request request) {
        String content = (String) request.getParam(RequestParamName.NOTE_CONTENT);
        String author = (String) request.getParam(RequestParamName.NOTE_AUTHOR);
        int day = ((Integer) request.getParam(RequestParamName.NOTE_DAY));
        int month =  ((Integer)request.getParam(RequestParamName.NOTE_MONTH));
        int year =  ((Integer)request.getParam(RequestParamName.NOTE_YEAR));
        Note note = new Note(author, content, day,month,year);
        Response resp = new Response();
        resp.setNote(note);
        return resp;
    }
}
