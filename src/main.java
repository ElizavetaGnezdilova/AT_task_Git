import com.jscape.inet.ftp.*;
import controller.Navigator;
import dao.FtpProvider;
import logic.Action;

/**
 * Created by Elizaveta_Gnezdilova on 5/5/2015.
 */
public class main {
    public static void main(String[] args) {

        int reply = FtpProvider.getFtpClientAndConnect().getResponseCode();
        System.out.print("Status code :");
        System.out.println(reply);
        try {
            FtpProvider.getFtpClientAndConnect().setDir("/");
        } catch (FtpException e) {
            System.out.println(Action.ERROR + e.getMessage());
        }
        Navigator.showMenu();


    }


}
