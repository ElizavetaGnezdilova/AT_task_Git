package com.epam.noteBookProject;


import  com.epam.bean.Note;
import com.epam.controller.Controller;
import  com.epam.dao.NoteBookProvider;
import  com.epam.logic.Request;
import  com.epam.logic.RequestParamName;
import  com.epam.logic.Response;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/29/2015.
 */
public class ControllerTest {
    @Test
    public void ControllerTest() throws IOException {
        Object expected;
        Note note = new Note("A", "l", 1, 2, 2015);
        Note note1 = new Note("K", "C", 3, 4, 2015);
        Note note2 = new Note("A", "D", 1, 11, 2015);
        NoteBookProvider.getNoteBook().addNote(note);
        Controller cont = new Controller();
        Request request = new Request();
        request.putParam(RequestParamName.NOTE_CONTENT, "C");
        request.putParam(RequestParamName.COMMAND_NAME, "FIND_TEXT");
        cont._do(request);
//        expected = response.getNotes().get(0);
//        Note actual = new Note("K","C",3,4,2015);
//        org.junit.Assert.assertEquals(expected,actual);

    }
}
