package com.hitachitransport;

public class CarrierEDIWebServiceSoapProxy implements com.hitachitransport.CarrierEDIWebServiceSoap {
  private String _endpoint = null;
  private com.hitachitransport.CarrierEDIWebServiceSoap carrierEDIWebServiceSoap = null;
  
  public CarrierEDIWebServiceSoapProxy() {
    _initCarrierEDIWebServiceSoapProxy();
  }
  
  public CarrierEDIWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCarrierEDIWebServiceSoapProxy();
  }
  
  private void _initCarrierEDIWebServiceSoapProxy() {
    try {
      carrierEDIWebServiceSoap = (new com.hitachitransport.CarrierEDIWebServiceLocator()).getCarrierEDIWebServiceSoap();
      if (carrierEDIWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)carrierEDIWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)carrierEDIWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (carrierEDIWebServiceSoap != null)
      ((javax.xml.rpc.Stub)carrierEDIWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hitachitransport.CarrierEDIWebServiceSoap getCarrierEDIWebServiceSoap() {
    if (carrierEDIWebServiceSoap == null)
      _initCarrierEDIWebServiceSoapProxy();
    return carrierEDIWebServiceSoap;
  }
  
  public com.hitachitransport.ShipmentResponse shipmentRequestMain(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException{
    if (carrierEDIWebServiceSoap == null)
      _initCarrierEDIWebServiceSoapProxy();
    return carrierEDIWebServiceSoap.shipmentRequestMain(objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage);
  }
  
  public com.hitachitransport.VoidResponse voidRequest(com.hitachitransport.VoidRequest objVoidRequest) throws java.rmi.RemoteException{
    if (carrierEDIWebServiceSoap == null)
      _initCarrierEDIWebServiceSoapProxy();
    return carrierEDIWebServiceSoap.voidRequest(objVoidRequest);
  }
  
  public com.hitachitransport.ShipmentResponse shipmentRequestGWMS(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException{
    if (carrierEDIWebServiceSoap == null)
      _initCarrierEDIWebServiceSoapProxy();
    return carrierEDIWebServiceSoap.shipmentRequestGWMS(objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage);
  }
  
  public com.hitachitransport.ShipmentResponse shipmentRequestCES(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException{
    if (carrierEDIWebServiceSoap == null)
      _initCarrierEDIWebServiceSoapProxy();
    return carrierEDIWebServiceSoap.shipmentRequestCES(objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage);
  }
  
  
}