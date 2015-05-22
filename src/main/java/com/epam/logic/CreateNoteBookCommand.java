package com.epam.logic;


import com.epam.dao.NoteBookProvider;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class CreateNoteBookCommand implements Command {
    public Response execute(Request request) {
        Response resp = new Response();
        resp.setNoteBook(NoteBookProvider.getNoteBook());
        return resp;
    }
}
