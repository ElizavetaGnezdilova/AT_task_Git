package com.epam;


import com.epam.bean.*;
import com.epam.controller.*;
import com.epam.view.*;
import com.epam.logic.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;



/**
 * Created by Elizaveta_Gnezdilova on 5/5/2015.
 */
public class main {
    public static void main(String[] args) throws IOException {

        //Обязательно ли чистить request после каждого controller._do(request)?


        NoteBookConsoleView view = new NoteBookConsoleView();
        Controller controller = new Controller();
        controller.setView(view);
        Request request = new Request();
        request.putParam(RequestParamName.COMMAND_NAME, "CREATE_NOTEBOOK");
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "DOWNLOAD_NB");
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "ADD_NOTE");
        request.putParam(RequestParamName.NOTE_AUTHOR, "Liza Gnezdilova");
        request.putParam(RequestParamName.NOTE_CONTENT, "String 333");
        request.putParam(RequestParamName.NOTE_DAY, 01);
        request.putParam(RequestParamName.NOTE_MONTH, 02);
        request.putParam(RequestParamName.NOTE_YEAR, 2015);
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "ADD_NOTE");
        request.putParam(RequestParamName.NOTE_AUTHOR, "Liza");
        request.putParam(RequestParamName.NOTE_CONTENT, "String 745");
        request.putParam(RequestParamName.NOTE_DAY, 05);
        request.putParam(RequestParamName.NOTE_MONTH, 06);
        request.putParam(RequestParamName.NOTE_YEAR, 2015);
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "SHOW_NB");
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "FIND_DATE");
        request.putParam(RequestParamName.NOTE_DATE, Note.getDateCreation(01, 02, 2015));
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME, "FIND_TEXT");
        request.putParam(RequestParamName.NOTE_CONTENT, "String 25");
        controller._do(request);

        request.putParam(RequestParamName.COMMAND_NAME,"UPLOAD_NB" );
        controller._do(request);

    }
}
