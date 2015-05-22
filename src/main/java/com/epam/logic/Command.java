package com.epam.logic;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elizaveta_Gnezdilova on 4/27/2015.
 */

public interface Command {
    public Response execute(Request request) throws IOException;
}

