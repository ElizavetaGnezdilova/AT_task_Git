package logic;

import com.jscape.inet.ftp.FtpFile;
import dao.*;
import com.jscape.inet.ftp.FtpException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Elizaveta_Gnezdilova on 5/14/2015.
 */
public class Action {
    public static final String LOCAL_DIRECTORY = System.getenv("HOMEDRIVE") + System.getenv("HOMEPATH") + "/Downloads";
    public static final String ERROR = "Sorry, we have a problem =( ";

    public static void dirOrFile(String fileName) {

        boolean foundFileWithFileName = false;


        try {
            java.util.Enumeration files = FtpProvider.getFtpClientAndConnect().getDirListing();
            while (files.hasMoreElements()) {
                FtpFile ftpFile = (FtpFile) files.nextElement();
                if (fileName.equals(ftpFile.getFilename())) {
                    foundFileWithFileName = true;

                    if (ftpFile.isDirectory()) {
                        changeDir(fileName);
                    } else {
                        download(ftpFile);
                    }
                }
            }
            if (!foundFileWithFileName) {
                System.out.println(fileName + " was not recognized as command or file/dir");
            }
        } catch (FtpException e) {
            System.out.println(ERROR + e.getMessage());
        }
        return;
    }


    private static void changeDir(String nameDir) {
        try {

            FtpProvider.getFtpClientAndConnect().setDir(nameDir);
            System.out.println("Directory was successfully changed");
        } catch (FtpException e) {
            System.out.println(ERROR + e.getMessage());
        }
    }


    public static void changeDirUp() {
        try {
            FtpProvider.getFtpClientAndConnect().setDirUp();
            System.out.println("Directory was successfully changed");
        } catch (FtpException e) {
            System.out.println(ERROR + e.getMessage());
        }
    }


    public static void exit() {
        FtpProvider.getFtpClientAndConnect().disconnect();
        System.exit(0);
    }


    public static void printFiles() {
        try {
            System.out.println("Current directory: " + FtpProvider.getFtpClientAndConnect().getDir());

            java.util.Enumeration files = FtpProvider.getFtpClientAndConnect().getDirListing();
            while (files.hasMoreElements()) {
                FtpFile ftpFile = (FtpFile) files.nextElement();
                System.out.print(ftpFile.getFilename());
                System.out.print(",  size: ");
                System.out.println(ftpFile.getFilesize() + " K");
            }
        } catch (FtpException e) {
            System.out.println(ERROR + e.getMessage());
        }


    }


    private static void download(FtpFile ftpFile) {
        FtpProvider.getFtpClientAndConnect().setLocalDir(new File(LOCAL_DIRECTORY));
        if (downloadDialog(ftpFile)) {
            try {
                FtpProvider.getFtpClientAndConnect().download(ftpFile.getFilename());
                System.out.println("File was successfully downloaded");
            } catch (FtpException e) {
                System.out.println(ERROR + e.getMessage());
            }
        }
    }


    private static boolean downloadDialog(FtpFile ftpFile) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("File: ");
        System.out.print(ftpFile.getFilename());
        System.out.print(" size: ");
        System.out.println(ftpFile.getFilesize() + "K");
        System.out.print("Please, write `y` if you want download this file and `n` if don`t.");
        try {
            String answer = reader.readLine();
            if (answer.equals("y")) {
                return true;
            }
        } catch (IOException e) {
            System.out.println(ERROR + e.getMessage());
        }
        return false;
    }
}
