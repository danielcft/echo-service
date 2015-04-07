package dk.digitalidentity.echo.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author dto
 */
@WebService(serviceName = "Echo")
public class Echo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "echo")
    public String echo(@WebParam(name = "name") String input) {
        return input ;
    }
}
