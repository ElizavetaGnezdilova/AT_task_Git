package dao;

import com.jscape.inet.ftp.*;


/**
 * Created by Elizaveta_Gnezdilova on 5/14/2015.
 */
public class FtpProvider {
    private static Ftp ftp = null;

    public static Ftp getFtpClientAndConnect() {
        if (ftp == null) {
            ftp = new Ftp("ftp.mozilla.org", "anonymous", "");
            try {
                ftp.connect();
            } catch (FtpException e) {
                System.out.println("Can't connect FTP due to: " + e.getMessage());
            }
        }

        return ftp;
    }

}
