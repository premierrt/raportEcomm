/**
 * QueueMessage1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.playmobile.channel.utils;

public class QueueMessage1Locator extends org.apache.axis.client.Service implements pl.playmobile.channel.utils.QueueMessage1 {

    public QueueMessage1Locator() {
    }


    public QueueMessage1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueueMessage1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for _default
    private java.lang.String _default_address = "http://smxlb:8040/queuemessage";

    public java.lang.String get_defaultAddress() {
        return _default_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String _defaultWSDDServiceName = "default";

    public java.lang.String get_defaultWSDDServiceName() {
        return _defaultWSDDServiceName;
    }

    public void set_defaultWSDDServiceName(java.lang.String name) {
        _defaultWSDDServiceName = name;
    }

    public pl.playmobile.channel.utils.QueueMessagePortType get_default() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(_default_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return get_default(endpoint);
    }

    public pl.playmobile.channel.utils.QueueMessagePortType get_default(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.playmobile.channel.utils.QueueMessageBindingStub _stub = new pl.playmobile.channel.utils.QueueMessageBindingStub(portAddress, this);
            _stub.setPortName(get_defaultWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void set_defaultEndpointAddress(java.lang.String address) {
        _default_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.playmobile.channel.utils.QueueMessagePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.playmobile.channel.utils.QueueMessageBindingStub _stub = new pl.playmobile.channel.utils.QueueMessageBindingStub(new java.net.URL(_default_address), this);
                _stub.setPortName(get_defaultWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("default".equals(inputPortName)) {
            return get_default();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://playmobile.pl/channel/utils", "queueMessage-1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://playmobile.pl/channel/utils", "default"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("_default".equals(portName)) {
            set_defaultEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
