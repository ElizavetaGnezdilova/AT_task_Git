package com.epam.controller;


import com.epam.logic.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class CommandHelper {
    private Map<NBCommandName, Command> map = new HashMap<NBCommandName, Command>();

    CommandHelper() {
        map.put(NBCommandName.CREATE_NOTEBOOK, new CreateNoteBookCommand());
        map.put(NBCommandName.ADD_NOTE, new AddNoteCommand());
        map.put(NBCommandName.FIND_TEXT, new FindTextCommand());
        map.put(NBCommandName.FIND_DATE, new FindDateCommand());
        map.put(NBCommandName.SHOW_NB, new ShowNBCommand());
        map.put(NBCommandName.DOWNLOAD_NB, new DownloadNBCommand());
        map.put(NBCommandName.UPLOAD_NB, new UploadNBCommand());


    }

    Command getCommand(String name) {// "ADD_NOTE"
        NBCommandName command = NBCommandName.valueOf(name);
        Command c = map.get(command);
        return c;
    }
}

