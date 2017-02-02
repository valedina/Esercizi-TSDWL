
package netsixservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://netsixService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param episodio
     * @param serieInput
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDisponibilita", targetNamespace = "http://netsixService/", className = "netsixservice.GetDisponibilita")
    @ResponseWrapper(localName = "getDisponibilitaResponse", targetNamespace = "http://netsixService/", className = "netsixservice.GetDisponibilitaResponse")
    @Action(input = "http://netsixService/NewWebService/getDisponibilitaRequest", output = "http://netsixService/NewWebService/getDisponibilitaResponse")
    public boolean getDisponibilita(
        @WebParam(name = "serieInput", targetNamespace = "")
        String serieInput,
        @WebParam(name = "episodio", targetNamespace = "")
        int episodio);

}
