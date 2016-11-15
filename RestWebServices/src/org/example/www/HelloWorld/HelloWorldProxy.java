package org.example.www.HelloWorld;

public class HelloWorldProxy implements org.example.www.HelloWorld.HelloWorld_PortType {
  private String _endpoint = null;
  private org.example.www.HelloWorld.HelloWorld_PortType helloWorld_PortType = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld_PortType = (new org.example.www.HelloWorld.HelloWorld_ServiceLocator()).getHelloWorldSOAP();
      if (helloWorld_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld_PortType != null)
      ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.HelloWorld.HelloWorld_PortType getHelloWorld_PortType() {
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType;
  }
  
  public org.example.www.HelloWorldResponse.Helloworld_response newOper(org.example.www.HelloWorldRequest.HelloWorldRequestType parameters) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.newOper(parameters);
  }
  
  
}