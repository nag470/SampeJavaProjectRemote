/**
 * HelloWorldSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HelloWorld;

public class HelloWorldSOAPSkeleton implements org.example.www.HelloWorld.HelloWorld_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.HelloWorld.HelloWorld_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/HelloWorldRequest", "HelloWorldRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/HelloWorldRequest", ">HelloWorldRequestType"), org.example.www.HelloWorldRequest.HelloWorldRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("newOper", _params, new javax.xml.namespace.QName("http://www.example.org/HelloWorldResponse", "helloworld_response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/HelloWorldResponse", ">helloworld_response"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "NewOper"));
        _oper.setSoapAction("http://www.example.org/HelloWorld/NewOper");
        _myOperationsList.add(_oper);
        if (_myOperations.get("newOper") == null) {
            _myOperations.put("newOper", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("newOper")).add(_oper);
    }

    public HelloWorldSOAPSkeleton() {
        this.impl = new org.example.www.HelloWorld.HelloWorldSOAPImpl();
    }

    public HelloWorldSOAPSkeleton(org.example.www.HelloWorld.HelloWorld_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.HelloWorldResponse.Helloworld_response newOper(org.example.www.HelloWorldRequest.HelloWorldRequestType parameters) throws java.rmi.RemoteException
    {
        org.example.www.HelloWorldResponse.Helloworld_response ret = impl.newOper(parameters);
        return ret;
    }

}
