package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES<br><b>Note:</b>ICD 9 CM code format is 3 digit before degimal point.But this web service retun this code as integer .Please prefix with 0 and make as three character
 *
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-06T20:18:08.079-06:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "ICD9", 
                  wsdlLocation = "http://www.webservicex.net/icd9.asmx?WSDL",
                  targetNamespace = "http://www.webserviceX.NET") 
public class ICD9 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.webserviceX.NET", "ICD9");
    public final static QName ICD9Soap = new QName("http://www.webserviceX.NET", "ICD9Soap");
    public final static QName ICD9Soap12 = new QName("http://www.webserviceX.NET", "ICD9Soap12");
    public final static QName ICD9HttpGet = new QName("http://www.webserviceX.NET", "ICD9HttpGet");
    public final static QName ICD9HttpPost = new QName("http://www.webserviceX.NET", "ICD9HttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://www.webservicex.net/icd9.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ICD9.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.webservicex.net/icd9.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public ICD9(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ICD9(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ICD9() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ICD9(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ICD9(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ICD9(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ICD9Soap
     */
    @WebEndpoint(name = "ICD9Soap")
    public ICD9Soap getICD9Soap() {
        return super.getPort(ICD9Soap, ICD9Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICD9Soap
     */
    @WebEndpoint(name = "ICD9Soap")
    public ICD9Soap getICD9Soap(WebServiceFeature... features) {
        return super.getPort(ICD9Soap, ICD9Soap.class, features);
    }


    /**
     *
     * @return
     *     returns ICD9Soap
     */
    @WebEndpoint(name = "ICD9Soap12")
    public ICD9Soap getICD9Soap12() {
        return super.getPort(ICD9Soap12, ICD9Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICD9Soap
     */
    @WebEndpoint(name = "ICD9Soap12")
    public ICD9Soap getICD9Soap12(WebServiceFeature... features) {
        return super.getPort(ICD9Soap12, ICD9Soap.class, features);
    }


    /**
     *
     * @return
     *     returns ICD9HttpGet
     */
    @WebEndpoint(name = "ICD9HttpGet")
    public ICD9HttpGet getICD9HttpGet() {
        return super.getPort(ICD9HttpGet, ICD9HttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICD9HttpGet
     */
    @WebEndpoint(name = "ICD9HttpGet")
    public ICD9HttpGet getICD9HttpGet(WebServiceFeature... features) {
        return super.getPort(ICD9HttpGet, ICD9HttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns ICD9HttpPost
     */
    @WebEndpoint(name = "ICD9HttpPost")
    public ICD9HttpPost getICD9HttpPost() {
        return super.getPort(ICD9HttpPost, ICD9HttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICD9HttpPost
     */
    @WebEndpoint(name = "ICD9HttpPost")
    public ICD9HttpPost getICD9HttpPost(WebServiceFeature... features) {
        return super.getPort(ICD9HttpPost, ICD9HttpPost.class, features);
    }

}
