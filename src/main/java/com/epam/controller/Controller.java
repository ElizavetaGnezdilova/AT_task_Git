package com.epam.controller;

import com.epam.logic.*;
import com.epam.view.NoteBookConsoleView;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class Controller {
    private CommandHelper ch = new CommandHelper();
    private NoteBookConsoleView view = new NoteBookConsoleView();

    public void _do(Request request) throws IOException {
        String commandName = (String) request.getParam(RequestParamName.COMMAND_NAME);
        Command command = ch.getCommand(commandName);
        Response resp = command.execute(request);
        System.out.println(commandName);
        view.print(resp);

    }

    public void setView(NoteBookConsoleView view) {
        this.view = view;
    }

}
