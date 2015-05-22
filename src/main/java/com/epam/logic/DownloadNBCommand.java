package com.epam.logic;

import com.epam.bean.Note;
import com.epam.bean.NoteBook;
import com.epam.dao.NoteBookProvider;

import java.io.*;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class DownloadNBCommand implements Command {
    public static final String TEST_DAT = "NoteBook.dat";

    public Response execute(Request request) throws IOException {
        Response resp = new Response();
        try {
            FileInputStream inputStream = new FileInputStream(TEST_DAT);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            for (Note i : ((NoteBook) objectInputStream.readObject()).getNotes()) {
                NoteBookProvider.getNoteBook().addNote(i);
            }
            resp.setNoteBook(NoteBookProvider.getNoteBook());
            resp.setResult(true);
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            resp.setResult(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            resp.setResult(false);
        } catch (IOException e) {
            e.printStackTrace();
            resp.setResult(false);
        }
        return resp;
    }
}
