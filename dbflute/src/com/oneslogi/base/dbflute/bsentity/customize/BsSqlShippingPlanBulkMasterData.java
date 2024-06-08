package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingPlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_H_ID, SHIPPING_INST_B_ID, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_DELIVERY_FLG, DELIVERY_CUSTOMER_ID, DELIVERY_CUSTOMER_CD, DELIVERY_CUSTOMER_NM, DELIVERY_ZIP_CD, DELIVERY_TEL_NO, DELIVERY_ADDRESS1, DELIVERY_ADDRESS2, DELIVERY_ADDRESS3, DELIVERY_DELIVERY_FLG, DELIVERY_ONETIME_FLG, CLIENT_CENTER_ID, MCLIENT_CENTER_CENTER_ID, MCLIENT_CENTER_CLIENT_ID, MCLIENT_CENTER_CUSTOMER_ID, MCENTER_CENTER_ID, MCUSTOMER_CC_CUSTOMER_ID, MZIP_ZIP_ID, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, MDELIV_COURSE_CARRIER_ID, MCARRIER_CARRIER_CD, MCARRIER_DEL_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_CUSTOMER_CD, DEPOSIT_CUSTOMER_NM, DEPOSIT_DEPOSIT_FLG, STOCK_TYPE_ID, STOCK_TYPE_CD, MPRODUCT_PRODUCT_ID, MPRODUCT_PRODUCT_CD, MPRODUCT_PRODUCT_NM, MS_DECIMAL_EXIST_FLG, MW_WAREHOUSE_ID, MW_WAREHOUSE_CD, MW_WAREHOUSE_NM, ML_LOCATION_ID, ML_LOCATION_CD, ML_LOCATION_NM, MZ_MW_WAREHOUSE_ID, MZ_MW_WAREHOUSE_CD, CENTER_CUSTOMER_ID, DELIV_COURSE_ID_BY_CUSTOMER, CENTER_ID, DELIV_COURSE_CD_BY_CUSTOMER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstHId = entity.getShippingInstHId();
 * Long shippingInstBId = entity.getShippingInstBId();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * String supplyDeliveryFlg = entity.getSupplyDeliveryFlg();
 * Long deliveryCustomerId = entity.getDeliveryCustomerId();
 * String deliveryCustomerCd = entity.getDeliveryCustomerCd();
 * String deliveryCustomerNm = entity.getDeliveryCustomerNm();
 * String deliveryZipCd = entity.getDeliveryZipCd();
 * String deliveryTelNo = entity.getDeliveryTelNo();
 * String deliveryAddress1 = entity.getDeliveryAddress1();
 * String deliveryAddress2 = entity.getDeliveryAddress2();
 * String deliveryAddress3 = entity.getDeliveryAddress3();
 * String deliveryDeliveryFlg = entity.getDeliveryDeliveryFlg();
 * String deliveryOnetimeFlg = entity.getDeliveryOnetimeFlg();
 * Long clientCenterId = entity.getClientCenterId();
 * Long mclientCenterCenterId = entity.getMclientCenterCenterId();
 * Long mclientCenterClientId = entity.getMclientCenterClientId();
 * Long mclientCenterCustomerId = entity.getMclientCenterCustomerId();
 * Long mcenterCenterId = entity.getMcenterCenterId();
 * Long mcustomerCcCustomerId = entity.getMcustomerCcCustomerId();
 * Long mzipZipId = entity.getMzipZipId();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String deliveryCourseNm = entity.getDeliveryCourseNm();
 * Long mdelivCourseCarrierId = entity.getMdelivCourseCarrierId();
 * String mcarrierCarrierCd = entity.getMcarrierCarrierCd();
 * String mcarrierDelFlg = entity.getMcarrierDelFlg();
 * Long depositCustomerId = entity.getDepositCustomerId();
 * String depositCustomerCd = entity.getDepositCustomerCd();
 * String depositCustomerNm = entity.getDepositCustomerNm();
 * String depositDepositFlg = entity.getDepositDepositFlg();
 * Long stockTypeId = entity.getStockTypeId();
 * String stockTypeCd = entity.getStockTypeCd();
 * Long mproductProductId = entity.getMproductProductId();
 * String mproductProductCd = entity.getMproductProductCd();
 * String mproductProductNm = entity.getMproductProductNm();
 * String msDecimalExistFlg = entity.getMsDecimalExistFlg();
 * Long mwWarehouseId = entity.getMwWarehouseId();
 * String mwWarehouseCd = entity.getMwWarehouseCd();
 * String mwWarehouseNm = entity.getMwWarehouseNm();
 * Long mlLocationId = entity.getMlLocationId();
 * String mlLocationCd = entity.getMlLocationCd();
 * String mlLocationNm = entity.getMlLocationNm();
 * Long mzMwWarehouseId = entity.getMzMwWarehouseId();
 * String mzMwWarehouseCd = entity.getMzMwWarehouseCd();
 * Long centerCustomerId = entity.getCenterCustomerId();
 * Long delivCourseIdByCustomer = entity.getDelivCourseIdByCustomer();
 * Long centerId = entity.getCenterId();
 * String delivCourseCdByCustomer = entity.getDelivCourseCdByCustomer();
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setShippingInstBId(shippingInstBId);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setSupplyDeliveryFlg(supplyDeliveryFlg);
 * entity.setDeliveryCustomerId(deliveryCustomerId);
 * entity.setDeliveryCustomerCd(deliveryCustomerCd);
 * entity.setDeliveryCustomerNm(deliveryCustomerNm);
 * entity.setDeliveryZipCd(deliveryZipCd);
 * entity.setDeliveryTelNo(deliveryTelNo);
 * entity.setDeliveryAddress1(deliveryAddress1);
 * entity.setDeliveryAddress2(deliveryAddress2);
 * entity.setDeliveryAddress3(deliveryAddress3);
 * entity.setDeliveryDeliveryFlg(deliveryDeliveryFlg);
 * entity.setDeliveryOnetimeFlg(deliveryOnetimeFlg);
 * entity.setClientCenterId(clientCenterId);
 * entity.setMclientCenterCenterId(mclientCenterCenterId);
 * entity.setMclientCenterClientId(mclientCenterClientId);
 * entity.setMclientCenterCustomerId(mclientCenterCustomerId);
 * entity.setMcenterCenterId(mcenterCenterId);
 * entity.setMcustomerCcCustomerId(mcustomerCcCustomerId);
 * entity.setMzipZipId(mzipZipId);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setDeliveryCourseNm(deliveryCourseNm);
 * entity.setMdelivCourseCarrierId(mdelivCourseCarrierId);
 * entity.setMcarrierCarrierCd(mcarrierCarrierCd);
 * entity.setMcarrierDelFlg(mcarrierDelFlg);
 * entity.setDepositCustomerId(depositCustomerId);
 * entity.setDepositCustomerCd(depositCustomerCd);
 * entity.setDepositCustomerNm(depositCustomerNm);
 * entity.setDepositDepositFlg(depositDepositFlg);
 * entity.setStockTypeId(stockTypeId);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setMproductProductId(mproductProductId);
 * entity.setMproductProductCd(mproductProductCd);
 * entity.setMproductProductNm(mproductProductNm);
 * entity.setMsDecimalExistFlg(msDecimalExistFlg);
 * entity.setMwWarehouseId(mwWarehouseId);
 * entity.setMwWarehouseCd(mwWarehouseCd);
 * entity.setMwWarehouseNm(mwWarehouseNm);
 * entity.setMlLocationId(mlLocationId);
 * entity.setMlLocationCd(mlLocationCd);
 * entity.setMlLocationNm(mlLocationNm);
 * entity.setMzMwWarehouseId(mzMwWarehouseId);
 * entity.setMzMwWarehouseCd(mzMwWarehouseCd);
 * entity.setCenterCustomerId(centerCustomerId);
 * entity.setDelivCourseIdByCustomer(delivCourseIdByCustomer);
 * entity.setCenterId(centerId);
 * entity.setDelivCourseCdByCustomer(delivCourseCdByCustomer);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingPlanBulkMasterData extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_H_ID: {bigint(19)} */
    protected Long _shippingInstHId;

    /** SHIPPING_INST_B_ID: {bigint(19)} */
    protected Long _shippingInstBId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {varchar(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {varchar(60)} */
    protected String _supplyCustomerNm;

    /** SUPPLY_DELIVERY_FLG: {char(1)} */
    protected String _supplyDeliveryFlg;

    /** DELIVERY_CUSTOMER_ID: {bigint(19)} */
    protected Long _deliveryCustomerId;

    /** DELIVERY_CUSTOMER_CD: {varchar(30)} */
    protected String _deliveryCustomerCd;

    /** DELIVERY_CUSTOMER_NM: {varchar(60)} */
    protected String _deliveryCustomerNm;

    /** DELIVERY_ZIP_CD: {varchar(30)} */
    protected String _deliveryZipCd;

    /** DELIVERY_TEL_NO: {varchar(30)} */
    protected String _deliveryTelNo;

    /** DELIVERY_ADDRESS1: {varchar(60)} */
    protected String _deliveryAddress1;

    /** DELIVERY_ADDRESS2: {varchar(60)} */
    protected String _deliveryAddress2;

    /** DELIVERY_ADDRESS3: {varchar(60)} */
    protected String _deliveryAddress3;

    /** DELIVERY_DELIVERY_FLG: {char(1)} */
    protected String _deliveryDeliveryFlg;

    /** DELIVERY_ONETIME_FLG: {char(1)} */
    protected String _deliveryOnetimeFlg;

    /** CLIENT_CENTER_ID: {bigint(19)} */
    protected Long _clientCenterId;

    /** MCLIENT_CENTER_CENTER_ID: {bigint(19)} */
    protected Long _mclientCenterCenterId;

    /** MCLIENT_CENTER_CLIENT_ID: {bigint(19)} */
    protected Long _mclientCenterClientId;

    /** MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} */
    protected Long _mclientCenterCustomerId;

    /** MCENTER_CENTER_ID: {bigint(19)} */
    protected Long _mcenterCenterId;

    /** MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} */
    protected Long _mcustomerCcCustomerId;

    /** MZIP_ZIP_ID: {bigint(19)} */
    protected Long _mzipZipId;

    /** DELIVERY_COURSE_ID: {bigint(19)} */
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {varchar(60)} */
    protected String _deliveryCourseNm;

    /** MDELIV_COURSE_CARRIER_ID: {bigint(19)} */
    protected Long _mdelivCourseCarrierId;

    /** MCARRIER_CARRIER_CD: {varchar(30)} */
    protected String _mcarrierCarrierCd;

    /** MCARRIER_DEL_FLG: {char(1)} */
    protected String _mcarrierDelFlg;

    /** DEPOSIT_CUSTOMER_ID: {bigint(19)} */
    protected Long _depositCustomerId;

    /** DEPOSIT_CUSTOMER_CD: {varchar(30)} */
    protected String _depositCustomerCd;

    /** DEPOSIT_CUSTOMER_NM: {varchar(60)} */
    protected String _depositCustomerNm;

    /** DEPOSIT_DEPOSIT_FLG: {char(1)} */
    protected String _depositDepositFlg;

    /** STOCK_TYPE_ID: {bigint(19)} */
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** MPRODUCT_PRODUCT_ID: {bigint(19)} */
    protected Long _mproductProductId;

    /** MPRODUCT_PRODUCT_CD: {varchar(100)} */
    protected String _mproductProductCd;

    /** MPRODUCT_PRODUCT_NM: {varchar(255)} */
    protected String _mproductProductNm;

    /** MS_DECIMAL_EXIST_FLG: {char(1)} */
    protected String _msDecimalExistFlg;

    /** MW_WAREHOUSE_ID: {bigint(19)} */
    protected Long _mwWarehouseId;

    /** MW_WAREHOUSE_CD: {varchar(30)} */
    protected String _mwWarehouseCd;

    /** MW_WAREHOUSE_NM: {varchar(60)} */
    protected String _mwWarehouseNm;

    /** ML_LOCATION_ID: {bigint(19)} */
    protected Long _mlLocationId;

    /** ML_LOCATION_CD: {varchar(30)} */
    protected String _mlLocationCd;

    /** ML_LOCATION_NM: {varchar(60)} */
    protected String _mlLocationNm;

    /** MZ_MW_WAREHOUSE_ID: {bigint(19)} */
    protected Long _mzMwWarehouseId;

    /** MZ_MW_WAREHOUSE_CD: {varchar(30)} */
    protected String _mzMwWarehouseCd;

    /** CENTER_CUSTOMER_ID: {bigint(19)} */
    protected Long _centerCustomerId;

    /** DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} */
    protected Long _delivCourseIdByCustomer;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} */
    protected String _delivCourseCdByCustomer;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingPlanBulkMasterDataDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingPlanBulkMasterData";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlShippingPlanBulkMasterData) {
            BsSqlShippingPlanBulkMasterData other = (BsSqlShippingPlanBulkMasterData)obj;
            if (!xSV(_shippingInstHId, other._shippingInstHId)) { return false; }
            if (!xSV(_shippingInstBId, other._shippingInstBId)) { return false; }
            if (!xSV(_supplyCustomerId, other._supplyCustomerId)) { return false; }
            if (!xSV(_supplyCustomerCd, other._supplyCustomerCd)) { return false; }
            if (!xSV(_supplyCustomerNm, other._supplyCustomerNm)) { return false; }
            if (!xSV(_supplyDeliveryFlg, other._supplyDeliveryFlg)) { return false; }
            if (!xSV(_deliveryCustomerId, other._deliveryCustomerId)) { return false; }
            if (!xSV(_deliveryCustomerCd, other._deliveryCustomerCd)) { return false; }
            if (!xSV(_deliveryCustomerNm, other._deliveryCustomerNm)) { return false; }
            if (!xSV(_deliveryZipCd, other._deliveryZipCd)) { return false; }
            if (!xSV(_deliveryTelNo, other._deliveryTelNo)) { return false; }
            if (!xSV(_deliveryAddress1, other._deliveryAddress1)) { return false; }
            if (!xSV(_deliveryAddress2, other._deliveryAddress2)) { return false; }
            if (!xSV(_deliveryAddress3, other._deliveryAddress3)) { return false; }
            if (!xSV(_deliveryDeliveryFlg, other._deliveryDeliveryFlg)) { return false; }
            if (!xSV(_deliveryOnetimeFlg, other._deliveryOnetimeFlg)) { return false; }
            if (!xSV(_clientCenterId, other._clientCenterId)) { return false; }
            if (!xSV(_mclientCenterCenterId, other._mclientCenterCenterId)) { return false; }
            if (!xSV(_mclientCenterClientId, other._mclientCenterClientId)) { return false; }
            if (!xSV(_mclientCenterCustomerId, other._mclientCenterCustomerId)) { return false; }
            if (!xSV(_mcenterCenterId, other._mcenterCenterId)) { return false; }
            if (!xSV(_mcustomerCcCustomerId, other._mcustomerCcCustomerId)) { return false; }
            if (!xSV(_mzipZipId, other._mzipZipId)) { return false; }
            if (!xSV(_deliveryCourseId, other._deliveryCourseId)) { return false; }
            if (!xSV(_deliveryCourseCd, other._deliveryCourseCd)) { return false; }
            if (!xSV(_deliveryCourseNm, other._deliveryCourseNm)) { return false; }
            if (!xSV(_mdelivCourseCarrierId, other._mdelivCourseCarrierId)) { return false; }
            if (!xSV(_mcarrierCarrierCd, other._mcarrierCarrierCd)) { return false; }
            if (!xSV(_mcarrierDelFlg, other._mcarrierDelFlg)) { return false; }
            if (!xSV(_depositCustomerId, other._depositCustomerId)) { return false; }
            if (!xSV(_depositCustomerCd, other._depositCustomerCd)) { return false; }
            if (!xSV(_depositCustomerNm, other._depositCustomerNm)) { return false; }
            if (!xSV(_depositDepositFlg, other._depositDepositFlg)) { return false; }
            if (!xSV(_stockTypeId, other._stockTypeId)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_mproductProductId, other._mproductProductId)) { return false; }
            if (!xSV(_mproductProductCd, other._mproductProductCd)) { return false; }
            if (!xSV(_mproductProductNm, other._mproductProductNm)) { return false; }
            if (!xSV(_msDecimalExistFlg, other._msDecimalExistFlg)) { return false; }
            if (!xSV(_mwWarehouseId, other._mwWarehouseId)) { return false; }
            if (!xSV(_mwWarehouseCd, other._mwWarehouseCd)) { return false; }
            if (!xSV(_mwWarehouseNm, other._mwWarehouseNm)) { return false; }
            if (!xSV(_mlLocationId, other._mlLocationId)) { return false; }
            if (!xSV(_mlLocationCd, other._mlLocationCd)) { return false; }
            if (!xSV(_mlLocationNm, other._mlLocationNm)) { return false; }
            if (!xSV(_mzMwWarehouseId, other._mzMwWarehouseId)) { return false; }
            if (!xSV(_mzMwWarehouseCd, other._mzMwWarehouseCd)) { return false; }
            if (!xSV(_centerCustomerId, other._centerCustomerId)) { return false; }
            if (!xSV(_delivCourseIdByCustomer, other._delivCourseIdByCustomer)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_delivCourseCdByCustomer, other._delivCourseCdByCustomer)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstHId);
        hs = xCH(hs, _shippingInstBId);
        hs = xCH(hs, _supplyCustomerId);
        hs = xCH(hs, _supplyCustomerCd);
        hs = xCH(hs, _supplyCustomerNm);
        hs = xCH(hs, _supplyDeliveryFlg);
        hs = xCH(hs, _deliveryCustomerId);
        hs = xCH(hs, _deliveryCustomerCd);
        hs = xCH(hs, _deliveryCustomerNm);
        hs = xCH(hs, _deliveryZipCd);
        hs = xCH(hs, _deliveryTelNo);
        hs = xCH(hs, _deliveryAddress1);
        hs = xCH(hs, _deliveryAddress2);
        hs = xCH(hs, _deliveryAddress3);
        hs = xCH(hs, _deliveryDeliveryFlg);
        hs = xCH(hs, _deliveryOnetimeFlg);
        hs = xCH(hs, _clientCenterId);
        hs = xCH(hs, _mclientCenterCenterId);
        hs = xCH(hs, _mclientCenterClientId);
        hs = xCH(hs, _mclientCenterCustomerId);
        hs = xCH(hs, _mcenterCenterId);
        hs = xCH(hs, _mcustomerCcCustomerId);
        hs = xCH(hs, _mzipZipId);
        hs = xCH(hs, _deliveryCourseId);
        hs = xCH(hs, _deliveryCourseCd);
        hs = xCH(hs, _deliveryCourseNm);
        hs = xCH(hs, _mdelivCourseCarrierId);
        hs = xCH(hs, _mcarrierCarrierCd);
        hs = xCH(hs, _mcarrierDelFlg);
        hs = xCH(hs, _depositCustomerId);
        hs = xCH(hs, _depositCustomerCd);
        hs = xCH(hs, _depositCustomerNm);
        hs = xCH(hs, _depositDepositFlg);
        hs = xCH(hs, _stockTypeId);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _mproductProductId);
        hs = xCH(hs, _mproductProductCd);
        hs = xCH(hs, _mproductProductNm);
        hs = xCH(hs, _msDecimalExistFlg);
        hs = xCH(hs, _mwWarehouseId);
        hs = xCH(hs, _mwWarehouseCd);
        hs = xCH(hs, _mwWarehouseNm);
        hs = xCH(hs, _mlLocationId);
        hs = xCH(hs, _mlLocationCd);
        hs = xCH(hs, _mlLocationNm);
        hs = xCH(hs, _mzMwWarehouseId);
        hs = xCH(hs, _mzMwWarehouseCd);
        hs = xCH(hs, _centerCustomerId);
        hs = xCH(hs, _delivCourseIdByCustomer);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _delivCourseCdByCustomer);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_shippingInstBId));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_supplyDeliveryFlg));
        sb.append(dm).append(xfND(_deliveryCustomerId));
        sb.append(dm).append(xfND(_deliveryCustomerCd));
        sb.append(dm).append(xfND(_deliveryCustomerNm));
        sb.append(dm).append(xfND(_deliveryZipCd));
        sb.append(dm).append(xfND(_deliveryTelNo));
        sb.append(dm).append(xfND(_deliveryAddress1));
        sb.append(dm).append(xfND(_deliveryAddress2));
        sb.append(dm).append(xfND(_deliveryAddress3));
        sb.append(dm).append(xfND(_deliveryDeliveryFlg));
        sb.append(dm).append(xfND(_deliveryOnetimeFlg));
        sb.append(dm).append(xfND(_clientCenterId));
        sb.append(dm).append(xfND(_mclientCenterCenterId));
        sb.append(dm).append(xfND(_mclientCenterClientId));
        sb.append(dm).append(xfND(_mclientCenterCustomerId));
        sb.append(dm).append(xfND(_mcenterCenterId));
        sb.append(dm).append(xfND(_mcustomerCcCustomerId));
        sb.append(dm).append(xfND(_mzipZipId));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_deliveryCourseNm));
        sb.append(dm).append(xfND(_mdelivCourseCarrierId));
        sb.append(dm).append(xfND(_mcarrierCarrierCd));
        sb.append(dm).append(xfND(_mcarrierDelFlg));
        sb.append(dm).append(xfND(_depositCustomerId));
        sb.append(dm).append(xfND(_depositCustomerCd));
        sb.append(dm).append(xfND(_depositCustomerNm));
        sb.append(dm).append(xfND(_depositDepositFlg));
        sb.append(dm).append(xfND(_stockTypeId));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_mproductProductId));
        sb.append(dm).append(xfND(_mproductProductCd));
        sb.append(dm).append(xfND(_mproductProductNm));
        sb.append(dm).append(xfND(_msDecimalExistFlg));
        sb.append(dm).append(xfND(_mwWarehouseId));
        sb.append(dm).append(xfND(_mwWarehouseCd));
        sb.append(dm).append(xfND(_mwWarehouseNm));
        sb.append(dm).append(xfND(_mlLocationId));
        sb.append(dm).append(xfND(_mlLocationCd));
        sb.append(dm).append(xfND(_mlLocationNm));
        sb.append(dm).append(xfND(_mzMwWarehouseId));
        sb.append(dm).append(xfND(_mzMwWarehouseCd));
        sb.append(dm).append(xfND(_centerCustomerId));
        sb.append(dm).append(xfND(_delivCourseIdByCustomer));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_delivCourseCdByCustomer));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlShippingPlanBulkMasterData clone() {
        return (SqlShippingPlanBulkMasterData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {bigint(19)} <br>
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingInstBId() {
        checkSpecifiedProperty("shippingInstBId");
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {bigint(19)} <br>
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        registerModifiedProperty("shippingInstBId");
        _shippingInstBId = shippingInstBId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {varchar(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {varchar(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'SUPPLY_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyDeliveryFlg() {
        checkSpecifiedProperty("supplyDeliveryFlg");
        return convertEmptyToNull(_supplyDeliveryFlg);
    }

    /**
     * [set] SUPPLY_DELIVERY_FLG: {char(1)} <br>
     * @param supplyDeliveryFlg The value of the column 'SUPPLY_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyDeliveryFlg(String supplyDeliveryFlg) {
        registerModifiedProperty("supplyDeliveryFlg");
        _supplyDeliveryFlg = supplyDeliveryFlg;
    }

    /**
     * [get] DELIVERY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCustomerId() {
        checkSpecifiedProperty("deliveryCustomerId");
        return _deliveryCustomerId;
    }

    /**
     * [set] DELIVERY_CUSTOMER_ID: {bigint(19)} <br>
     * @param deliveryCustomerId The value of the column 'DELIVERY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCustomerId(Long deliveryCustomerId) {
        registerModifiedProperty("deliveryCustomerId");
        _deliveryCustomerId = deliveryCustomerId;
    }

    /**
     * [get] DELIVERY_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCustomerCd() {
        checkSpecifiedProperty("deliveryCustomerCd");
        return convertEmptyToNull(_deliveryCustomerCd);
    }

    /**
     * [set] DELIVERY_CUSTOMER_CD: {varchar(30)} <br>
     * @param deliveryCustomerCd The value of the column 'DELIVERY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCustomerCd(String deliveryCustomerCd) {
        registerModifiedProperty("deliveryCustomerCd");
        _deliveryCustomerCd = deliveryCustomerCd;
    }

    /**
     * [get] DELIVERY_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCustomerNm() {
        checkSpecifiedProperty("deliveryCustomerNm");
        return convertEmptyToNull(_deliveryCustomerNm);
    }

    /**
     * [set] DELIVERY_CUSTOMER_NM: {varchar(60)} <br>
     * @param deliveryCustomerNm The value of the column 'DELIVERY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCustomerNm(String deliveryCustomerNm) {
        registerModifiedProperty("deliveryCustomerNm");
        _deliveryCustomerNm = deliveryCustomerNm;
    }

    /**
     * [get] DELIVERY_ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryZipCd() {
        checkSpecifiedProperty("deliveryZipCd");
        return convertEmptyToNull(_deliveryZipCd);
    }

    /**
     * [set] DELIVERY_ZIP_CD: {varchar(30)} <br>
     * @param deliveryZipCd The value of the column 'DELIVERY_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryZipCd(String deliveryZipCd) {
        registerModifiedProperty("deliveryZipCd");
        _deliveryZipCd = deliveryZipCd;
    }

    /**
     * [get] DELIVERY_TEL_NO: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryTelNo() {
        checkSpecifiedProperty("deliveryTelNo");
        return convertEmptyToNull(_deliveryTelNo);
    }

    /**
     * [set] DELIVERY_TEL_NO: {varchar(30)} <br>
     * @param deliveryTelNo The value of the column 'DELIVERY_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryTelNo(String deliveryTelNo) {
        registerModifiedProperty("deliveryTelNo");
        _deliveryTelNo = deliveryTelNo;
    }

    /**
     * [get] DELIVERY_ADDRESS1: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryAddress1() {
        checkSpecifiedProperty("deliveryAddress1");
        return convertEmptyToNull(_deliveryAddress1);
    }

    /**
     * [set] DELIVERY_ADDRESS1: {varchar(60)} <br>
     * @param deliveryAddress1 The value of the column 'DELIVERY_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryAddress1(String deliveryAddress1) {
        registerModifiedProperty("deliveryAddress1");
        _deliveryAddress1 = deliveryAddress1;
    }

    /**
     * [get] DELIVERY_ADDRESS2: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryAddress2() {
        checkSpecifiedProperty("deliveryAddress2");
        return convertEmptyToNull(_deliveryAddress2);
    }

    /**
     * [set] DELIVERY_ADDRESS2: {varchar(60)} <br>
     * @param deliveryAddress2 The value of the column 'DELIVERY_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryAddress2(String deliveryAddress2) {
        registerModifiedProperty("deliveryAddress2");
        _deliveryAddress2 = deliveryAddress2;
    }

    /**
     * [get] DELIVERY_ADDRESS3: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryAddress3() {
        checkSpecifiedProperty("deliveryAddress3");
        return convertEmptyToNull(_deliveryAddress3);
    }

    /**
     * [set] DELIVERY_ADDRESS3: {varchar(60)} <br>
     * @param deliveryAddress3 The value of the column 'DELIVERY_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryAddress3(String deliveryAddress3) {
        registerModifiedProperty("deliveryAddress3");
        _deliveryAddress3 = deliveryAddress3;
    }

    /**
     * [get] DELIVERY_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'DELIVERY_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryDeliveryFlg() {
        checkSpecifiedProperty("deliveryDeliveryFlg");
        return convertEmptyToNull(_deliveryDeliveryFlg);
    }

    /**
     * [set] DELIVERY_DELIVERY_FLG: {char(1)} <br>
     * @param deliveryDeliveryFlg The value of the column 'DELIVERY_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryDeliveryFlg(String deliveryDeliveryFlg) {
        registerModifiedProperty("deliveryDeliveryFlg");
        _deliveryDeliveryFlg = deliveryDeliveryFlg;
    }

    /**
     * [get] DELIVERY_ONETIME_FLG: {char(1)} <br>
     * @return The value of the column 'DELIVERY_ONETIME_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryOnetimeFlg() {
        checkSpecifiedProperty("deliveryOnetimeFlg");
        return convertEmptyToNull(_deliveryOnetimeFlg);
    }

    /**
     * [set] DELIVERY_ONETIME_FLG: {char(1)} <br>
     * @param deliveryOnetimeFlg The value of the column 'DELIVERY_ONETIME_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryOnetimeFlg(String deliveryOnetimeFlg) {
        registerModifiedProperty("deliveryOnetimeFlg");
        _deliveryOnetimeFlg = deliveryOnetimeFlg;
    }

    /**
     * [get] CLIENT_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientCenterId() {
        checkSpecifiedProperty("clientCenterId");
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {bigint(19)} <br>
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCenterId(Long clientCenterId) {
        registerModifiedProperty("clientCenterId");
        _clientCenterId = clientCenterId;
    }

    /**
     * [get] MCLIENT_CENTER_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMclientCenterCenterId() {
        checkSpecifiedProperty("mclientCenterCenterId");
        return _mclientCenterCenterId;
    }

    /**
     * [set] MCLIENT_CENTER_CENTER_ID: {bigint(19)} <br>
     * @param mclientCenterCenterId The value of the column 'MCLIENT_CENTER_CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMclientCenterCenterId(Long mclientCenterCenterId) {
        registerModifiedProperty("mclientCenterCenterId");
        _mclientCenterCenterId = mclientCenterCenterId;
    }

    /**
     * [get] MCLIENT_CENTER_CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMclientCenterClientId() {
        checkSpecifiedProperty("mclientCenterClientId");
        return _mclientCenterClientId;
    }

    /**
     * [set] MCLIENT_CENTER_CLIENT_ID: {bigint(19)} <br>
     * @param mclientCenterClientId The value of the column 'MCLIENT_CENTER_CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMclientCenterClientId(Long mclientCenterClientId) {
        registerModifiedProperty("mclientCenterClientId");
        _mclientCenterClientId = mclientCenterClientId;
    }

    /**
     * [get] MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCLIENT_CENTER_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMclientCenterCustomerId() {
        checkSpecifiedProperty("mclientCenterCustomerId");
        return _mclientCenterCustomerId;
    }

    /**
     * [set] MCLIENT_CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @param mclientCenterCustomerId The value of the column 'MCLIENT_CENTER_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMclientCenterCustomerId(Long mclientCenterCustomerId) {
        registerModifiedProperty("mclientCenterCustomerId");
        _mclientCenterCustomerId = mclientCenterCustomerId;
    }

    /**
     * [get] MCENTER_CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCENTER_CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMcenterCenterId() {
        checkSpecifiedProperty("mcenterCenterId");
        return _mcenterCenterId;
    }

    /**
     * [set] MCENTER_CENTER_ID: {bigint(19)} <br>
     * @param mcenterCenterId The value of the column 'MCENTER_CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcenterCenterId(Long mcenterCenterId) {
        registerModifiedProperty("mcenterCenterId");
        _mcenterCenterId = mcenterCenterId;
    }

    /**
     * [get] MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'MCUSTOMER_CC_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMcustomerCcCustomerId() {
        checkSpecifiedProperty("mcustomerCcCustomerId");
        return _mcustomerCcCustomerId;
    }

    /**
     * [set] MCUSTOMER_CC_CUSTOMER_ID: {bigint(19)} <br>
     * @param mcustomerCcCustomerId The value of the column 'MCUSTOMER_CC_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcustomerCcCustomerId(Long mcustomerCcCustomerId) {
        registerModifiedProperty("mcustomerCcCustomerId");
        _mcustomerCcCustomerId = mcustomerCcCustomerId;
    }

    /**
     * [get] MZIP_ZIP_ID: {bigint(19)} <br>
     * @return The value of the column 'MZIP_ZIP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMzipZipId() {
        checkSpecifiedProperty("mzipZipId");
        return _mzipZipId;
    }

    /**
     * [set] MZIP_ZIP_ID: {bigint(19)} <br>
     * @param mzipZipId The value of the column 'MZIP_ZIP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMzipZipId(Long mzipZipId) {
        registerModifiedProperty("mzipZipId");
        _mzipZipId = mzipZipId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseNm() {
        checkSpecifiedProperty("deliveryCourseNm");
        return convertEmptyToNull(_deliveryCourseNm);
    }

    /**
     * [set] DELIVERY_COURSE_NM: {varchar(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        registerModifiedProperty("deliveryCourseNm");
        _deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] MDELIV_COURSE_CARRIER_ID: {bigint(19)} <br>
     * @return The value of the column 'MDELIV_COURSE_CARRIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMdelivCourseCarrierId() {
        checkSpecifiedProperty("mdelivCourseCarrierId");
        return _mdelivCourseCarrierId;
    }

    /**
     * [set] MDELIV_COURSE_CARRIER_ID: {bigint(19)} <br>
     * @param mdelivCourseCarrierId The value of the column 'MDELIV_COURSE_CARRIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMdelivCourseCarrierId(Long mdelivCourseCarrierId) {
        registerModifiedProperty("mdelivCourseCarrierId");
        _mdelivCourseCarrierId = mdelivCourseCarrierId;
    }

    /**
     * [get] MCARRIER_CARRIER_CD: {varchar(30)} <br>
     * @return The value of the column 'MCARRIER_CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMcarrierCarrierCd() {
        checkSpecifiedProperty("mcarrierCarrierCd");
        return convertEmptyToNull(_mcarrierCarrierCd);
    }

    /**
     * [set] MCARRIER_CARRIER_CD: {varchar(30)} <br>
     * @param mcarrierCarrierCd The value of the column 'MCARRIER_CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcarrierCarrierCd(String mcarrierCarrierCd) {
        registerModifiedProperty("mcarrierCarrierCd");
        _mcarrierCarrierCd = mcarrierCarrierCd;
    }

    /**
     * [get] MCARRIER_DEL_FLG: {char(1)} <br>
     * @return The value of the column 'MCARRIER_DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMcarrierDelFlg() {
        checkSpecifiedProperty("mcarrierDelFlg");
        return convertEmptyToNull(_mcarrierDelFlg);
    }

    /**
     * [set] MCARRIER_DEL_FLG: {char(1)} <br>
     * @param mcarrierDelFlg The value of the column 'MCARRIER_DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMcarrierDelFlg(String mcarrierDelFlg) {
        registerModifiedProperty("mcarrierDelFlg");
        _mcarrierDelFlg = mcarrierDelFlg;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositCustomerId() {
        checkSpecifiedProperty("depositCustomerId");
        return _depositCustomerId;
    }

    /**
     * [set] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @param depositCustomerId The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCustomerId(Long depositCustomerId) {
        registerModifiedProperty("depositCustomerId");
        _depositCustomerId = depositCustomerId;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCustomerCd() {
        checkSpecifiedProperty("depositCustomerCd");
        return convertEmptyToNull(_depositCustomerCd);
    }

    /**
     * [set] DEPOSIT_CUSTOMER_CD: {varchar(30)} <br>
     * @param depositCustomerCd The value of the column 'DEPOSIT_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCustomerCd(String depositCustomerCd) {
        registerModifiedProperty("depositCustomerCd");
        _depositCustomerCd = depositCustomerCd;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_NM: {varchar(60)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCustomerNm() {
        checkSpecifiedProperty("depositCustomerNm");
        return convertEmptyToNull(_depositCustomerNm);
    }

    /**
     * [set] DEPOSIT_CUSTOMER_NM: {varchar(60)} <br>
     * @param depositCustomerNm The value of the column 'DEPOSIT_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCustomerNm(String depositCustomerNm) {
        registerModifiedProperty("depositCustomerNm");
        _depositCustomerNm = depositCustomerNm;
    }

    /**
     * [get] DEPOSIT_DEPOSIT_FLG: {char(1)} <br>
     * @return The value of the column 'DEPOSIT_DEPOSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositDepositFlg() {
        checkSpecifiedProperty("depositDepositFlg");
        return convertEmptyToNull(_depositDepositFlg);
    }

    /**
     * [set] DEPOSIT_DEPOSIT_FLG: {char(1)} <br>
     * @param depositDepositFlg The value of the column 'DEPOSIT_DEPOSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositDepositFlg(String depositDepositFlg) {
        registerModifiedProperty("depositDepositFlg");
        _depositDepositFlg = depositDepositFlg;
    }

    /**
     * [get] STOCK_TYPE_ID: {bigint(19)} <br>
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockTypeId() {
        checkSpecifiedProperty("stockTypeId");
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {bigint(19)} <br>
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeId(Long stockTypeId) {
        registerModifiedProperty("stockTypeId");
        _stockTypeId = stockTypeId;
    }

    /**
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] MPRODUCT_PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMproductProductId() {
        checkSpecifiedProperty("mproductProductId");
        return _mproductProductId;
    }

    /**
     * [set] MPRODUCT_PRODUCT_ID: {bigint(19)} <br>
     * @param mproductProductId The value of the column 'MPRODUCT_PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMproductProductId(Long mproductProductId) {
        registerModifiedProperty("mproductProductId");
        _mproductProductId = mproductProductId;
    }

    /**
     * [get] MPRODUCT_PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMproductProductCd() {
        checkSpecifiedProperty("mproductProductCd");
        return convertEmptyToNull(_mproductProductCd);
    }

    /**
     * [set] MPRODUCT_PRODUCT_CD: {varchar(100)} <br>
     * @param mproductProductCd The value of the column 'MPRODUCT_PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMproductProductCd(String mproductProductCd) {
        registerModifiedProperty("mproductProductCd");
        _mproductProductCd = mproductProductCd;
    }

    /**
     * [get] MPRODUCT_PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'MPRODUCT_PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMproductProductNm() {
        checkSpecifiedProperty("mproductProductNm");
        return convertEmptyToNull(_mproductProductNm);
    }

    /**
     * [set] MPRODUCT_PRODUCT_NM: {varchar(255)} <br>
     * @param mproductProductNm The value of the column 'MPRODUCT_PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMproductProductNm(String mproductProductNm) {
        registerModifiedProperty("mproductProductNm");
        _mproductProductNm = mproductProductNm;
    }

    /**
     * [get] MS_DECIMAL_EXIST_FLG: {char(1)} <br>
     * @return The value of the column 'MS_DECIMAL_EXIST_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getMsDecimalExistFlg() {
        checkSpecifiedProperty("msDecimalExistFlg");
        return convertEmptyToNull(_msDecimalExistFlg);
    }

    /**
     * [set] MS_DECIMAL_EXIST_FLG: {char(1)} <br>
     * @param msDecimalExistFlg The value of the column 'MS_DECIMAL_EXIST_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMsDecimalExistFlg(String msDecimalExistFlg) {
        registerModifiedProperty("msDecimalExistFlg");
        _msDecimalExistFlg = msDecimalExistFlg;
    }

    /**
     * [get] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMwWarehouseId() {
        checkSpecifiedProperty("mwWarehouseId");
        return _mwWarehouseId;
    }

    /**
     * [set] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @param mwWarehouseId The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMwWarehouseId(Long mwWarehouseId) {
        registerModifiedProperty("mwWarehouseId");
        _mwWarehouseId = mwWarehouseId;
    }

    /**
     * [get] MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'MW_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMwWarehouseCd() {
        checkSpecifiedProperty("mwWarehouseCd");
        return convertEmptyToNull(_mwWarehouseCd);
    }

    /**
     * [set] MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @param mwWarehouseCd The value of the column 'MW_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMwWarehouseCd(String mwWarehouseCd) {
        registerModifiedProperty("mwWarehouseCd");
        _mwWarehouseCd = mwWarehouseCd;
    }

    /**
     * [get] MW_WAREHOUSE_NM: {varchar(60)} <br>
     * @return The value of the column 'MW_WAREHOUSE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMwWarehouseNm() {
        checkSpecifiedProperty("mwWarehouseNm");
        return convertEmptyToNull(_mwWarehouseNm);
    }

    /**
     * [set] MW_WAREHOUSE_NM: {varchar(60)} <br>
     * @param mwWarehouseNm The value of the column 'MW_WAREHOUSE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMwWarehouseNm(String mwWarehouseNm) {
        registerModifiedProperty("mwWarehouseNm");
        _mwWarehouseNm = mwWarehouseNm;
    }

    /**
     * [get] ML_LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'ML_LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMlLocationId() {
        checkSpecifiedProperty("mlLocationId");
        return _mlLocationId;
    }

    /**
     * [set] ML_LOCATION_ID: {bigint(19)} <br>
     * @param mlLocationId The value of the column 'ML_LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMlLocationId(Long mlLocationId) {
        registerModifiedProperty("mlLocationId");
        _mlLocationId = mlLocationId;
    }

    /**
     * [get] ML_LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'ML_LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMlLocationCd() {
        checkSpecifiedProperty("mlLocationCd");
        return convertEmptyToNull(_mlLocationCd);
    }

    /**
     * [set] ML_LOCATION_CD: {varchar(30)} <br>
     * @param mlLocationCd The value of the column 'ML_LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMlLocationCd(String mlLocationCd) {
        registerModifiedProperty("mlLocationCd");
        _mlLocationCd = mlLocationCd;
    }

    /**
     * [get] ML_LOCATION_NM: {varchar(60)} <br>
     * @return The value of the column 'ML_LOCATION_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getMlLocationNm() {
        checkSpecifiedProperty("mlLocationNm");
        return convertEmptyToNull(_mlLocationNm);
    }

    /**
     * [set] ML_LOCATION_NM: {varchar(60)} <br>
     * @param mlLocationNm The value of the column 'ML_LOCATION_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMlLocationNm(String mlLocationNm) {
        registerModifiedProperty("mlLocationNm");
        _mlLocationNm = mlLocationNm;
    }

    /**
     * [get] MZ_MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'MZ_MW_WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMzMwWarehouseId() {
        checkSpecifiedProperty("mzMwWarehouseId");
        return _mzMwWarehouseId;
    }

    /**
     * [set] MZ_MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @param mzMwWarehouseId The value of the column 'MZ_MW_WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMzMwWarehouseId(Long mzMwWarehouseId) {
        registerModifiedProperty("mzMwWarehouseId");
        _mzMwWarehouseId = mzMwWarehouseId;
    }

    /**
     * [get] MZ_MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'MZ_MW_WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getMzMwWarehouseCd() {
        checkSpecifiedProperty("mzMwWarehouseCd");
        return convertEmptyToNull(_mzMwWarehouseCd);
    }

    /**
     * [set] MZ_MW_WAREHOUSE_CD: {varchar(30)} <br>
     * @param mzMwWarehouseCd The value of the column 'MZ_MW_WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMzMwWarehouseCd(String mzMwWarehouseCd) {
        registerModifiedProperty("mzMwWarehouseCd");
        _mzMwWarehouseCd = mzMwWarehouseCd;
    }

    /**
     * [get] CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterCustomerId() {
        checkSpecifiedProperty("centerCustomerId");
        return _centerCustomerId;
    }

    /**
     * [set] CENTER_CUSTOMER_ID: {bigint(19)} <br>
     * @param centerCustomerId The value of the column 'CENTER_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCustomerId(Long centerCustomerId) {
        registerModifiedProperty("centerCustomerId");
        _centerCustomerId = centerCustomerId;
    }

    /**
     * [get] DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} <br>
     * @return The value of the column 'DELIV_COURSE_ID_BY_CUSTOMER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCourseIdByCustomer() {
        checkSpecifiedProperty("delivCourseIdByCustomer");
        return _delivCourseIdByCustomer;
    }

    /**
     * [set] DELIV_COURSE_ID_BY_CUSTOMER: {bigint(19)} <br>
     * @param delivCourseIdByCustomer The value of the column 'DELIV_COURSE_ID_BY_CUSTOMER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCourseIdByCustomer(Long delivCourseIdByCustomer) {
        registerModifiedProperty("delivCourseIdByCustomer");
        _delivCourseIdByCustomer = delivCourseIdByCustomer;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} <br>
     * @return The value of the column 'DELIV_COURSE_CD_BY_CUSTOMER'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCourseCdByCustomer() {
        checkSpecifiedProperty("delivCourseCdByCustomer");
        return convertEmptyToNull(_delivCourseCdByCustomer);
    }

    /**
     * [set] DELIV_COURSE_CD_BY_CUSTOMER: {varchar(30)} <br>
     * @param delivCourseCdByCustomer The value of the column 'DELIV_COURSE_CD_BY_CUSTOMER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCourseCdByCustomer(String delivCourseCdByCustomer) {
        registerModifiedProperty("delivCourseCdByCustomer");
        _delivCourseCdByCustomer = delivCourseCdByCustomer;
    }
}
