package com.epam.noteBookProject;

import com.epam.dao.NoteBookProvider;
import com.epam.logic.*;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/29/2015.
 */
public class AddNoteCommandTest {
    @Test
    public void AddNoteCommandTest() throws IOException {
        Object expected;
        Command command = new AddNoteCommand();
        Request request = new Request();
        request.putParam(RequestParamName.NOTE_CONTENT, "FFFFF");
        request.putParam(RequestParamName.NOTE_AUTHOR, "Liza");
        request.putParam(RequestParamName.NOTE_DAY, 3);
        request.putParam(RequestParamName.NOTE_MONTH, 4);
        request.putParam(RequestParamName.NOTE_YEAR, 2015);
        int i = NoteBookProvider.getNoteBook().getNotes().size();
        Response response = command.execute(request);
        expected = response.getNote();
        Object actual = NoteBookProvider.getNoteBook().getNotes().get(i);
        org.junit.Assert.assertEquals(expected, actual);

    }
}
