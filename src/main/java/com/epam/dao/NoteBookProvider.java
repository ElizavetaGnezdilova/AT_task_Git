package com.epam.dao;

import com.epam.bean.*;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class NoteBookProvider {
    private NoteBookProvider() {
    }

    private static NoteBook instance = null;

    public static NoteBook getNoteBook() {
        if (instance == null) {
            instance = new NoteBook();
        }
        return instance;
    }
}

