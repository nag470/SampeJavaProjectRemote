/**
 * HelloWorld_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HelloWorld;

public interface HelloWorld_Service extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldSOAPAddress();

    public org.example.www.HelloWorld.HelloWorld_PortType getHelloWorldSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.HelloWorld.HelloWorld_PortType getHelloWorldSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
