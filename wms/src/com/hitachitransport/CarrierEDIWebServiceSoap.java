/**
 * CarrierEDIWebServiceSoap.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public interface CarrierEDIWebServiceSoap extends java.rmi.Remote {
    public com.hitachitransport.ShipmentResponse shipmentRequestMain(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException;
    public com.hitachitransport.VoidResponse voidRequest(com.hitachitransport.VoidRequest objVoidRequest) throws java.rmi.RemoteException;
    public com.hitachitransport.ShipmentResponse shipmentRequestGWMS(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException;
    public com.hitachitransport.ShipmentResponse shipmentRequestCES(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException;
}
