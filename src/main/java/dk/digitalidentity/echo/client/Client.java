package dk.digitalidentity.echo.client;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dto
 */
public class Client {
    static Logger logger;
    
    public static void main (String [] args){
        try { 
            Echo_Service service = new Echo_Service();
            Echo port = service.getEchoPort();
            
            String result = port.echo("echo");
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            logger.log(Level.INFO, "client was unable to call service ," + ex.getMessage());
        }

    }
    
}
