/**
 * CarrierEDIWebServiceLocator.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class CarrierEDIWebServiceLocator extends org.apache.axis.client.Service implements com.hitachitransport.CarrierEDIWebService {

    public CarrierEDIWebServiceLocator() {
    }


    public CarrierEDIWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CarrierEDIWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // CarrierEDIWebServiceSoapのプロキシクラスの取得に使用します / [en]-(Use to get a proxy class for CarrierEDIWebServiceSoap)
    private java.lang.String CarrierEDIWebServiceSoap_address = "http://172.19.203.7/CarrierEDIWebServiceTest/CarrierEDIWebService.asmx";

    public java.lang.String getCarrierEDIWebServiceSoapAddress() {
        return CarrierEDIWebServiceSoap_address;
    }

    // WSDDサービス名のデフォルトはポート名です / [en]-(The WSDD service name defaults to the port name.)
    private java.lang.String CarrierEDIWebServiceSoapWSDDServiceName = "CarrierEDIWebServiceSoap";

    public java.lang.String getCarrierEDIWebServiceSoapWSDDServiceName() {
        return CarrierEDIWebServiceSoapWSDDServiceName;
    }

    public void setCarrierEDIWebServiceSoapWSDDServiceName(java.lang.String name) {
        CarrierEDIWebServiceSoapWSDDServiceName = name;
    }

    public com.hitachitransport.CarrierEDIWebServiceSoap getCarrierEDIWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CarrierEDIWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCarrierEDIWebServiceSoap(endpoint);
    }

    public com.hitachitransport.CarrierEDIWebServiceSoap getCarrierEDIWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hitachitransport.CarrierEDIWebServiceSoapStub _stub = new com.hitachitransport.CarrierEDIWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getCarrierEDIWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCarrierEDIWebServiceSoapEndpointAddress(java.lang.String address) {
        CarrierEDIWebServiceSoap_address = address;
    }

    /**
    * 指定したポート名に対するエンドポイントのアドレスをセットします / [en]-(Set the endpoint address for the specified port name.)
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

if ("CarrierEDIWebServiceSoap".equals(portName)) {
            setCarrierEDIWebServiceSoapEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" 未知のポートに対してはエンドポイントのアドレスをセットできません / [en]-(Cannot set Endpoint Address for Unknown Port)" + portName);
        }
    }

    /**
    * 指定したポート名に対するエンドポイントのアドレスをセットします / [en]-(Set the endpoint address for the specified port name.)
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
