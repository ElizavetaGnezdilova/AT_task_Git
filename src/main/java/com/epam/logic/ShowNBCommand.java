package com.epam.logic;


import com.epam.dao.NoteBookProvider;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class ShowNBCommand implements Command {
    public Response execute(Request request) {
        Response resp = new Response();
        resp.setNotes(NoteBookProvider.getNoteBook().getNotes());
        return resp;
    }
}

