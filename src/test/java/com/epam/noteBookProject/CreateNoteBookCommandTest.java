package com.epam.noteBookProject;

import com.epam.dao.NoteBookProvider;
import com.epam.logic.Command;
import com.epam.logic.CreateNoteBookCommand;
import com.epam.logic.Request;
import com.epam.logic.Response;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/29/2015.
 */
public class CreateNoteBookCommandTest {
    @Test
    public void CreateNoteBookCommandTest() throws IOException {
        Object expected;
        Command command = new CreateNoteBookCommand();
        Request request = new Request();
        Response response = command.execute(request);
        expected = response.getNoteBook();
        Object actual = NoteBookProvider.getNoteBook();
        org.junit.Assert.assertEquals(expected, actual);

    }
}
