/**
 * CarrierEDIWebServiceSoapStub.java
 *
 * このファイルはWSDLから自動生成されました / [en]-(This file was auto-generated from WSDL)
 * Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java生成器によって / [en]-(by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.)
 */

package com.hitachitransport;

public class CarrierEDIWebServiceSoapStub extends org.apache.axis.client.Stub implements com.hitachitransport.CarrierEDIWebServiceSoap {
	@SuppressWarnings("rawtypes")
	private java.util.Vector cachedSerClasses = new java.util.Vector();
    @SuppressWarnings("rawtypes")
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    @SuppressWarnings("rawtypes")
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    @SuppressWarnings("rawtypes")
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShipmentRequestMain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestHeader"), com.hitachitransport.ShipmentRequestHeader.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestProduct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestProduct"), com.hitachitransport.ShipmentRequestProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestPackage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestPackage"), com.hitachitransport.ShipmentRequestPackage.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentResponse"));
        oper.setReturnClass(com.hitachitransport.ShipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestMainResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoidRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objVoidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "VoidRequest"), com.hitachitransport.VoidRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitachitransport.com", "VoidResponse"));
        oper.setReturnClass(com.hitachitransport.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hitachitransport.com", "VoidRequestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShipmentRequestGWMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestHeader"), com.hitachitransport.ShipmentRequestHeader.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestProduct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestProduct"), com.hitachitransport.ShipmentRequestProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestPackage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestPackage"), com.hitachitransport.ShipmentRequestPackage.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentResponse"));
        oper.setReturnClass(com.hitachitransport.ShipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestGWMSResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShipmentRequestCES");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestHeader"), com.hitachitransport.ShipmentRequestHeader.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestProduct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestProduct"), com.hitachitransport.ShipmentRequestProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://hitachitransport.com", "objShipmentRequestPackage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestPackage"), com.hitachitransport.ShipmentRequestPackage.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentResponse"));
        oper.setReturnClass(com.hitachitransport.ShipmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestCESResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public CarrierEDIWebServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CarrierEDIWebServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    @SuppressWarnings("unchecked")
	public CarrierEDIWebServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            @SuppressWarnings("rawtypes")
			java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            @SuppressWarnings("rawtypes")
			java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            @SuppressWarnings("rawtypes")
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            @SuppressWarnings({ "unused", "rawtypes" })
			java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            @SuppressWarnings({ "rawtypes", "unused" })
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ArrayOfDouble");
            cachedSerQNames.add(qName);
            cls = double[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double");
            qName2 = new javax.xml.namespace.QName("http://hitachitransport.com", "double");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://hitachitransport.com", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.ShipmentRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestPackage");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.ShipmentRequestPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestProduct");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.ShipmentRequestProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentResponse");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.ShipmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "VoidRequest");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.VoidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitachitransport.com", "VoidResponse");
            cachedSerQNames.add(qName);
            cls = com.hitachitransport.VoidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            @SuppressWarnings("rawtypes")
			java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // 全てのtypeマッピング情報は登録されています / [en]-(All the type mapping information is registered)
            // それらは最初に呼出される時に登録されます / [en]-(when the first call is made.)
            // typeマッピング情報は実際には登録されています / [en]-(The type mapping information is actually registered in)
            // サービスのTypeMappingRegistryに登録されています, / [en]-(the TypeMappingRegistry of the service, which)
            // その理由は登録が最初の呼び出しに必要とされるときだけであるからです. / [en]-(is the reason why registration is only needed for the first call.)
            synchronized (this) {
                if (firstCall()) {
                    // シリアライザを登録する前にエンコードスタイルをセットしなくてはなりません / [en]-(must set encoding style before registering serializers)
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        @SuppressWarnings("rawtypes")
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            @SuppressWarnings("rawtypes")
							java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            @SuppressWarnings("rawtypes")
							java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Callオブジェクトの取得失敗 / [en]-(Failure trying to get the Call object)", _t);
        }
    }

    public com.hitachitransport.ShipmentResponse shipmentRequestMain(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://hitachitransport.com/ShipmentRequestMain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestMain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hitachitransport.ShipmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hitachitransport.ShipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hitachitransport.ShipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hitachitransport.VoidResponse voidRequest(com.hitachitransport.VoidRequest objVoidRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://hitachitransport.com/VoidRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitachitransport.com", "VoidRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objVoidRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hitachitransport.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hitachitransport.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hitachitransport.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hitachitransport.ShipmentResponse shipmentRequestGWMS(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://hitachitransport.com/ShipmentRequestGWMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestGWMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hitachitransport.ShipmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hitachitransport.ShipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hitachitransport.ShipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hitachitransport.ShipmentResponse shipmentRequestCES(com.hitachitransport.ShipmentRequestHeader objShipmentRequestHeader, com.hitachitransport.ShipmentRequestProduct objShipmentRequestProduct, com.hitachitransport.ShipmentRequestPackage objShipmentRequestPackage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://hitachitransport.com/ShipmentRequestCES");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitachitransport.com", "ShipmentRequestCES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objShipmentRequestHeader, objShipmentRequestProduct, objShipmentRequestPackage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hitachitransport.ShipmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hitachitransport.ShipmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.hitachitransport.ShipmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
