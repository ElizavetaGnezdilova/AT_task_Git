package com.epam.noteBookProject;

import com.epam.bean.Note;
import com.epam.dao.NoteBookProvider;
import com.epam.logic.*;
import org.junit.Test;


import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/29/2015.
 */
public class FindDateCommandTest {
    @Test
    public void FindDateCommandTest() throws IOException {
        Object expected;
        Note n = new Note("A", "C", 1, 2, 2015);
        Note n1 = new Note("K", "C", 3, 4, 2015);
        Note n2 = new Note("A", "D", 1, 11, 2015);
        NoteBookProvider.getNoteBook().addNote(n);
        Command command = new FindDateCommand();
        Request request = new Request();
        request.putParam(RequestParamName.NOTE_DATE, 342015);
        Response response = command.execute(request);
        expected = response.getNotes().get(0);
        Note actual = new Note("K", "C", 3, 4, 2015);
        org.junit.Assert.assertEquals(expected, actual);

    }
}
