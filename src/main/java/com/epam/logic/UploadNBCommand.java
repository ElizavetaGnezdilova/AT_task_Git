package com.epam.logic;

import com.epam.dao.NoteBookProvider;

import java.io.*;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class UploadNBCommand implements Command {

    public static final String TEST_DAT = "NoteBook.dat";

    public Response execute(Request request) throws IOException {
        Response resp = new Response();
        try {
            FileOutputStream outputStream = new FileOutputStream(TEST_DAT);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(NoteBookProvider.getNoteBook());
            objectOutputStream.close();
            resp.setResult(true);
        } catch (FileNotFoundException e) {
            resp.setResult(false);
        } catch (IOException e) {
            e.printStackTrace();
            resp.setResult(false);
        }
        return resp;
    }

}
