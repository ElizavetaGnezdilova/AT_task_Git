package controller;

import com.jscape.inet.ftp.Ftp;
import dao.FtpProvider;
import logic.Action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Elizaveta_Gnezdilova on 5/14/2015.
 */
public class Navigator {
    public static void showMenu() {

        System.out.println();
        System.out.println("Please,enter...");
        System.out.println("`list` if you would like see the content;");
        System.out.println("name of a directory to change current directory;");
        System.out.println("`up` if you would like change current directory to the parent;");
        System.out.println("name of a file to download it;");
        System.out.println("`exit` to exit the program;");
        System.out.println();

        processMenu();

    }

    private static void processMenu() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String menu = null;
        try {
            menu = reader.readLine();
            switch (menu) {
                case "list": {
                    Action.printFiles();
                    showMenu();
                    break;
                }
                case "up": {
                    Action.changeDirUp();
                    showMenu();
                    break;
                }
                case "exit": {
                    Action.exit();
                    showMenu();
                    break;
                }

                default: {
                    Action.dirOrFile(menu);
                    showMenu();
                }
            }
            reader.reset();
        } catch (IOException e1) {
            System.out.println("Error: " + e1.getMessage());
            processMenu();
        }
    }
}
