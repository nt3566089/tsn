package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of T_EC_ORDER_H. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TEcOrderHDbm _instance = new TEcOrderHDbm();
    private TEcOrderHDbm() {}
    public static TEcOrderHDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getEcOrderHId(), (et, vl) -> ((TEcOrderH)et).setEcOrderHId(ctl(vl)), "ecOrderHId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getClientId(), (et, vl) -> ((TEcOrderH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getCenterId(), (et, vl) -> ((TEcOrderH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getImportDt(), (et, vl) -> ((TEcOrderH)et).setImportDt((String)vl), "importDt");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderNo(), (et, vl) -> ((TEcOrderH)et).setOrderNo((String)vl), "orderNo");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getPriorityFlg(), (et, vl) -> ((TEcOrderH)et).setPriorityFlg((String)vl), "priorityFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderDt(), (et, vl) -> ((TEcOrderH)et).setOrderDt((String)vl), "orderDt");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderTime(), (et, vl) -> ((TEcOrderH)et).setOrderTime((String)vl), "orderTime");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivDt(), (et, vl) -> ((TEcOrderH)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivTz(), (et, vl) -> ((TEcOrderH)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getComment1(), (et, vl) -> ((TEcOrderH)et).setComment1((String)vl), "comment1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getComment2(), (et, vl) -> ((TEcOrderH)et).setComment2((String)vl), "comment2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getGiftFlg(), (et, vl) -> ((TEcOrderH)et).setGiftFlg((String)vl), "giftFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getNoshi(), (et, vl) -> ((TEcOrderH)et).setNoshi((String)vl), "noshi");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderZipCd(), (et, vl) -> ((TEcOrderH)et).setOrderZipCd((String)vl), "orderZipCd");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderAddress1(), (et, vl) -> ((TEcOrderH)et).setOrderAddress1((String)vl), "orderAddress1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderAddress2(), (et, vl) -> ((TEcOrderH)et).setOrderAddress2((String)vl), "orderAddress2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderAddress3(), (et, vl) -> ((TEcOrderH)et).setOrderAddress3((String)vl), "orderAddress3");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderCustomerNm(), (et, vl) -> ((TEcOrderH)et).setOrderCustomerNm((String)vl), "orderCustomerNm");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderCustomerNmKana(), (et, vl) -> ((TEcOrderH)et).setOrderCustomerNmKana((String)vl), "orderCustomerNmKana");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOrderTelNo(), (et, vl) -> ((TEcOrderH)et).setOrderTelNo((String)vl), "orderTelNo");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivMatchFlg(), (et, vl) -> ((TEcOrderH)et).setDelivMatchFlg((String)vl), "delivMatchFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeId(), (et, vl) -> ((TEcOrderH)et).setMergeId((String)vl), "mergeId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeStatus(), (et, vl) -> ((TEcOrderH)et).setMergeStatus((String)vl), "mergeStatus");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivZipCd(), (et, vl) -> ((TEcOrderH)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivAddress1(), (et, vl) -> ((TEcOrderH)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivAddress2(), (et, vl) -> ((TEcOrderH)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivAddress3(), (et, vl) -> ((TEcOrderH)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getInvoiceDelivAddress1(), (et, vl) -> ((TEcOrderH)et).setInvoiceDelivAddress1((String)vl), "invoiceDelivAddress1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getInvoiceDelivAddress2(), (et, vl) -> ((TEcOrderH)et).setInvoiceDelivAddress2((String)vl), "invoiceDelivAddress2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getInvoiceDelivAddress3(), (et, vl) -> ((TEcOrderH)et).setInvoiceDelivAddress3((String)vl), "invoiceDelivAddress3");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivCustomerNm(), (et, vl) -> ((TEcOrderH)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivCustomerNmKana(), (et, vl) -> ((TEcOrderH)et).setDelivCustomerNmKana((String)vl), "delivCustomerNmKana");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivTelNo(), (et, vl) -> ((TEcOrderH)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivMethod(), (et, vl) -> ((TEcOrderH)et).setDelivMethod((String)vl), "delivMethod");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivType(), (et, vl) -> ((TEcOrderH)et).setDelivType((String)vl), "delivType");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelivCompany(), (et, vl) -> ((TEcOrderH)et).setDelivCompany((String)vl), "delivCompany");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getPaymentMethod(), (et, vl) -> ((TEcOrderH)et).setPaymentMethod((String)vl), "paymentMethod");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getCardType(), (et, vl) -> ((TEcOrderH)et).setCardType((String)vl), "cardType");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getTotal(), (et, vl) -> ((TEcOrderH)et).setTotal(ctl(vl)), "total");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getTax(), (et, vl) -> ((TEcOrderH)et).setTax(ctl(vl)), "tax");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getCarriage(), (et, vl) -> ((TEcOrderH)et).setCarriage(ctl(vl)), "carriage");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getCod(), (et, vl) -> ((TEcOrderH)et).setCod(ctl(vl)), "cod");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getTotalAmount(), (et, vl) -> ((TEcOrderH)et).setTotalAmount(ctl(vl)), "totalAmount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getCouponDiscount(), (et, vl) -> ((TEcOrderH)et).setCouponDiscount(ctl(vl)), "couponDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getPointDiscount(), (et, vl) -> ((TEcOrderH)et).setPointDiscount(ctl(vl)), "pointDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getOtherDiscount(), (et, vl) -> ((TEcOrderH)et).setOtherDiscount(ctl(vl)), "otherDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getAmountBilled(), (et, vl) -> ((TEcOrderH)et).setAmountBilled(ctl(vl)), "amountBilled");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeTotal(), (et, vl) -> ((TEcOrderH)et).setMergeTotal(ctl(vl)), "mergeTotal");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeCarriage(), (et, vl) -> ((TEcOrderH)et).setMergeCarriage(ctl(vl)), "mergeCarriage");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeCod(), (et, vl) -> ((TEcOrderH)et).setMergeCod(ctl(vl)), "mergeCod");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeTax(), (et, vl) -> ((TEcOrderH)et).setMergeTax(ctl(vl)), "mergeTax");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeAmountBilled(), (et, vl) -> ((TEcOrderH)et).setMergeAmountBilled(ctl(vl)), "mergeAmountBilled");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeTotalAmount(), (et, vl) -> ((TEcOrderH)et).setMergeTotalAmount(ctl(vl)), "mergeTotalAmount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeCouponDiscount(), (et, vl) -> ((TEcOrderH)et).setMergeCouponDiscount(ctl(vl)), "mergeCouponDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergePointDiscount(), (et, vl) -> ((TEcOrderH)et).setMergePointDiscount(ctl(vl)), "mergePointDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getMergeOtherDiscount(), (et, vl) -> ((TEcOrderH)et).setMergeOtherDiscount(ctl(vl)), "mergeOtherDiscount");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getPackingQty(), (et, vl) -> ((TEcOrderH)et).setPackingQty(ctl(vl)), "packingQty");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemNm1(), (et, vl) -> ((TEcOrderH)et).setSlipItemNm1((String)vl), "slipItemNm1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemNm2(), (et, vl) -> ((TEcOrderH)et).setSlipItemNm2((String)vl), "slipItemNm2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemNm3(), (et, vl) -> ((TEcOrderH)et).setSlipItemNm3((String)vl), "slipItemNm3");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemNm4(), (et, vl) -> ((TEcOrderH)et).setSlipItemNm4((String)vl), "slipItemNm4");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemNm5(), (et, vl) -> ((TEcOrderH)et).setSlipItemNm5((String)vl), "slipItemNm5");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemCd1(), (et, vl) -> ((TEcOrderH)et).setSlipItemCd1((String)vl), "slipItemCd1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getSlipItemCd2(), (et, vl) -> ((TEcOrderH)et).setSlipItemCd2((String)vl), "slipItemCd2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getFreightHandling1(), (et, vl) -> ((TEcOrderH)et).setFreightHandling1((String)vl), "freightHandling1");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getFreightHandling2(), (et, vl) -> ((TEcOrderH)et).setFreightHandling2((String)vl), "freightHandling2");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getArticle(), (et, vl) -> ((TEcOrderH)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getReceiveId(), (et, vl) -> ((TEcOrderH)et).setReceiveId(ctl(vl)), "receiveId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getErrorFlg(), (et, vl) -> ((TEcOrderH)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getErrorMessageCd(), (et, vl) -> ((TEcOrderH)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getImportFlg(), (et, vl) -> ((TEcOrderH)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getImportTypeId(), (et, vl) -> ((TEcOrderH)et).setImportTypeId(ctl(vl)), "importTypeId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getShippingInstHId(), (et, vl) -> ((TEcOrderH)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getDelFlg(), (et, vl) -> ((TEcOrderH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getVersionNo(), (et, vl) -> ((TEcOrderH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getControlNo(), (et, vl) -> ((TEcOrderH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getAddDt(), (et, vl) -> ((TEcOrderH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getAddUser(), (et, vl) -> ((TEcOrderH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getAddProcess(), (et, vl) -> ((TEcOrderH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getUpdDt(), (et, vl) -> ((TEcOrderH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getUpdUser(), (et, vl) -> ((TEcOrderH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TEcOrderH)et).getUpdProcess(), (et, vl) -> ((TEcOrderH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getMImportType(), (et, vl) -> ((TEcOrderH)et).setMImportType((MImportType)vl), "MImportType");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getTShippingInstH(), (et, vl) -> ((TEcOrderH)et).setTShippingInstH((TShippingInstH)vl), "TShippingInstH");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getMCenter(), (et, vl) -> ((TEcOrderH)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getMClient(), (et, vl) -> ((TEcOrderH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getBClassDtlByDelivMatchFlg(), (et, vl) -> ((TEcOrderH)et).setBClassDtlByDelivMatchFlg((BClassDtl)vl), "BClassDtlByDelivMatchFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TEcOrderH)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getBClassDtlByGiftFlg(), (et, vl) -> ((TEcOrderH)et).setBClassDtlByGiftFlg((BClassDtl)vl), "BClassDtlByGiftFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getBClassDtlByImportFlg(), (et, vl) -> ((TEcOrderH)et).setBClassDtlByImportFlg((BClassDtl)vl), "BClassDtlByImportFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getBClassDtlByPriorityFlg(), (et, vl) -> ((TEcOrderH)et).setBClassDtlByPriorityFlg((BClassDtl)vl), "BClassDtlByPriorityFlg");
        setupEfpg(_efpgMap, et -> ((TEcOrderH)et).getTEcOrderRAsOne(), (et, vl) -> ((TEcOrderH)et).setTEcOrderRAsOne((TEcOrderR)vl), "TEcOrderRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_EC_ORDER_H";
    protected final String _tableDispName = "T_EC_ORDER_H";
    protected final String _tablePropertyName = "TEcOrderH";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_EC_ORDER_H", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEcOrderHId = cci("EC_ORDER_H_ID", "EC_ORDER_H_ID", null, null, Long.class, "ecOrderHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "TEcOrderBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnImportDt = cci("IMPORT_DT", "IMPORT_DT", null, null, String.class, "importDt", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNo = cci("ORDER_NO", "ORDER_NO", null, null, String.class, "orderNo", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriorityFlg = cci("PRIORITY_FLG", "PRIORITY_FLG", null, null, String.class, "priorityFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPriorityFlg", null, CDef.DefMeta.PriorityFlg, false);
    protected final ColumnInfo _columnOrderDt = cci("ORDER_DT", "ORDER_DT", null, null, String.class, "orderDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTime = cci("ORDER_TIME", "ORDER_TIME", null, null, String.class, "orderTime", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment1 = cci("COMMENT1", "COMMENT1", null, null, String.class, "comment1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnComment2 = cci("COMMENT2", "COMMENT2", null, null, String.class, "comment2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGiftFlg = cci("GIFT_FLG", "GIFT_FLG", null, null, String.class, "giftFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByGiftFlg", null, CDef.DefMeta.GiftFlg, false);
    protected final ColumnInfo _columnNoshi = cci("NOSHI", "NOSHI", null, null, String.class, "noshi", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderZipCd = cci("ORDER_ZIP_CD", "ORDER_ZIP_CD", null, null, String.class, "orderZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress1 = cci("ORDER_ADDRESS1", "ORDER_ADDRESS1", null, null, String.class, "orderAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress2 = cci("ORDER_ADDRESS2", "ORDER_ADDRESS2", null, null, String.class, "orderAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderAddress3 = cci("ORDER_ADDRESS3", "ORDER_ADDRESS3", null, null, String.class, "orderAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerNm = cci("ORDER_CUSTOMER_NM", "ORDER_CUSTOMER_NM", null, null, String.class, "orderCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderCustomerNmKana = cci("ORDER_CUSTOMER_NM_KANA", "ORDER_CUSTOMER_NM_KANA", null, null, String.class, "orderCustomerNmKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderTelNo = cci("ORDER_TEL_NO", "ORDER_TEL_NO", null, null, String.class, "orderTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivMatchFlg = cci("DELIV_MATCH_FLG", "DELIV_MATCH_FLG", null, null, String.class, "delivMatchFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByDelivMatchFlg", null, CDef.DefMeta.DelivMatchFlg, false);
    protected final ColumnInfo _columnMergeId = cci("MERGE_ID", "MERGE_ID", null, null, String.class, "mergeId", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeStatus = cci("MERGE_STATUS", "MERGE_STATUS", null, null, String.class, "mergeStatus", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceDelivAddress1 = cci("INVOICE_DELIV_ADDRESS1", "INVOICE_DELIV_ADDRESS1", null, null, String.class, "invoiceDelivAddress1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceDelivAddress2 = cci("INVOICE_DELIV_ADDRESS2", "INVOICE_DELIV_ADDRESS2", null, null, String.class, "invoiceDelivAddress2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceDelivAddress3 = cci("INVOICE_DELIV_ADDRESS3", "INVOICE_DELIV_ADDRESS3", null, null, String.class, "invoiceDelivAddress3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNmKana = cci("DELIV_CUSTOMER_NM_KANA", "DELIV_CUSTOMER_NM_KANA", null, null, String.class, "delivCustomerNmKana", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivMethod = cci("DELIV_METHOD", "DELIV_METHOD", null, null, String.class, "delivMethod", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivType = cci("DELIV_TYPE", "DELIV_TYPE", null, null, String.class, "delivType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCompany = cci("DELIV_COMPANY", "DELIV_COMPANY", null, null, String.class, "delivCompany", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentMethod = cci("PAYMENT_METHOD", "PAYMENT_METHOD", null, null, String.class, "paymentMethod", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCardType = cci("CARD_TYPE", "CARD_TYPE", null, null, String.class, "cardType", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotal = cci("TOTAL", "TOTAL", null, null, Long.class, "total", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, Long.class, "tax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarriage = cci("CARRIAGE", "CARRIAGE", null, null, Long.class, "carriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCod = cci("COD", "COD", null, null, Long.class, "cod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalAmount = cci("TOTAL_AMOUNT", "TOTAL_AMOUNT", null, null, Long.class, "totalAmount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCouponDiscount = cci("COUPON_DISCOUNT", "COUPON_DISCOUNT", null, null, Long.class, "couponDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointDiscount = cci("POINT_DISCOUNT", "POINT_DISCOUNT", null, null, Long.class, "pointDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherDiscount = cci("OTHER_DISCOUNT", "OTHER_DISCOUNT", null, null, Long.class, "otherDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmountBilled = cci("AMOUNT_BILLED", "AMOUNT_BILLED", null, null, Long.class, "amountBilled", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeTotal = cci("MERGE_TOTAL", "MERGE_TOTAL", null, null, Long.class, "mergeTotal", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCarriage = cci("MERGE_CARRIAGE", "MERGE_CARRIAGE", null, null, Long.class, "mergeCarriage", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCod = cci("MERGE_COD", "MERGE_COD", null, null, Long.class, "mergeCod", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeTax = cci("MERGE_TAX", "MERGE_TAX", null, null, Long.class, "mergeTax", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeAmountBilled = cci("MERGE_AMOUNT_BILLED", "MERGE_AMOUNT_BILLED", null, null, Long.class, "mergeAmountBilled", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeTotalAmount = cci("MERGE_TOTAL_AMOUNT", "MERGE_TOTAL_AMOUNT", null, null, Long.class, "mergeTotalAmount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCouponDiscount = cci("MERGE_COUPON_DISCOUNT", "MERGE_COUPON_DISCOUNT", null, null, Long.class, "mergeCouponDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergePointDiscount = cci("MERGE_POINT_DISCOUNT", "MERGE_POINT_DISCOUNT", null, null, Long.class, "mergePointDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeOtherDiscount = cci("MERGE_OTHER_DISCOUNT", "MERGE_OTHER_DISCOUNT", null, null, Long.class, "mergeOtherDiscount", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingQty = cci("PACKING_QTY", "PACKING_QTY", null, null, Long.class, "packingQty", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm1 = cci("SLIP_ITEM_NM1", "SLIP_ITEM_NM1", null, null, String.class, "slipItemNm1", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm2 = cci("SLIP_ITEM_NM2", "SLIP_ITEM_NM2", null, null, String.class, "slipItemNm2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm3 = cci("SLIP_ITEM_NM3", "SLIP_ITEM_NM3", null, null, String.class, "slipItemNm3", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm4 = cci("SLIP_ITEM_NM4", "SLIP_ITEM_NM4", null, null, String.class, "slipItemNm4", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm5 = cci("SLIP_ITEM_NM5", "SLIP_ITEM_NM5", null, null, String.class, "slipItemNm5", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd1 = cci("SLIP_ITEM_CD1", "SLIP_ITEM_CD1", null, null, String.class, "slipItemCd1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemCd2 = cci("SLIP_ITEM_CD2", "SLIP_ITEM_CD2", null, null, String.class, "slipItemCd2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling1 = cci("FREIGHT_HANDLING1", "FREIGHT_HANDLING1", null, null, String.class, "freightHandling1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightHandling2 = cci("FREIGHT_HANDLING2", "FREIGHT_HANDLING2", null, null, String.class, "freightHandling2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticle = cci("ARTICLE", "ARTICLE", null, null, String.class, "article", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveId = cci("RECEIVE_ID", "RECEIVE_ID", null, null, Long.class, "receiveId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByImportFlg", null, CDef.DefMeta.ImportFlg, false);
    protected final ColumnInfo _columnImportTypeId = cci("IMPORT_TYPE_ID", "IMPORT_TYPE_ID", null, null, Long.class, "importTypeId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "MImportType", null, null, false);
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "TShippingInstH", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderHId() { return _columnEcOrderHId; }
    /**
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * IMPORT_DT: {IX, varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportDt() { return _columnImportDt; }
    /**
     * ORDER_NO: {IX, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNo() { return _columnOrderNo; }
    /**
     * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriorityFlg() { return _columnPriorityFlg; }
    /**
     * ORDER_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderDt() { return _columnOrderDt; }
    /**
     * ORDER_TIME: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTime() { return _columnOrderTime; }
    /**
     * DELIV_DT: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * COMMENT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment1() { return _columnComment1; }
    /**
     * COMMENT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnComment2() { return _columnComment2; }
    /**
     * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGiftFlg() { return _columnGiftFlg; }
    /**
     * NOSHI: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshi() { return _columnNoshi; }
    /**
     * ORDER_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderZipCd() { return _columnOrderZipCd; }
    /**
     * ORDER_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress1() { return _columnOrderAddress1; }
    /**
     * ORDER_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress2() { return _columnOrderAddress2; }
    /**
     * ORDER_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderAddress3() { return _columnOrderAddress3; }
    /**
     * ORDER_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerNm() { return _columnOrderCustomerNm; }
    /**
     * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderCustomerNmKana() { return _columnOrderCustomerNmKana; }
    /**
     * ORDER_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderTelNo() { return _columnOrderTelNo; }
    /**
     * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivMatchFlg() { return _columnDelivMatchFlg; }
    /**
     * MERGE_ID: {IX, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeId() { return _columnMergeId; }
    /**
     * MERGE_STATUS: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeStatus() { return _columnMergeStatus; }
    /**
     * DELIV_ZIP_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * DELIV_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress1() { return _columnDelivAddress1; }
    /**
     * DELIV_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress2() { return _columnDelivAddress2; }
    /**
     * DELIV_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress3() { return _columnDelivAddress3; }
    /**
     * INVOICE_DELIV_ADDRESS1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceDelivAddress1() { return _columnInvoiceDelivAddress1; }
    /**
     * INVOICE_DELIV_ADDRESS2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceDelivAddress2() { return _columnInvoiceDelivAddress2; }
    /**
     * INVOICE_DELIV_ADDRESS3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceDelivAddress3() { return _columnInvoiceDelivAddress3; }
    /**
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNmKana() { return _columnDelivCustomerNmKana; }
    /**
     * DELIV_TEL_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * DELIV_METHOD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivMethod() { return _columnDelivMethod; }
    /**
     * DELIV_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivType() { return _columnDelivType; }
    /**
     * DELIV_COMPANY: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCompany() { return _columnDelivCompany; }
    /**
     * PAYMENT_METHOD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethod() { return _columnPaymentMethod; }
    /**
     * CARD_TYPE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCardType() { return _columnCardType; }
    /**
     * TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotal() { return _columnTotal; }
    /**
     * TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarriage() { return _columnCarriage; }
    /**
     * COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCod() { return _columnCod; }
    /**
     * TOTAL_AMOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalAmount() { return _columnTotalAmount; }
    /**
     * COUPON_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCouponDiscount() { return _columnCouponDiscount; }
    /**
     * POINT_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointDiscount() { return _columnPointDiscount; }
    /**
     * OTHER_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherDiscount() { return _columnOtherDiscount; }
    /**
     * AMOUNT_BILLED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmountBilled() { return _columnAmountBilled; }
    /**
     * MERGE_TOTAL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeTotal() { return _columnMergeTotal; }
    /**
     * MERGE_CARRIAGE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCarriage() { return _columnMergeCarriage; }
    /**
     * MERGE_COD: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCod() { return _columnMergeCod; }
    /**
     * MERGE_TAX: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeTax() { return _columnMergeTax; }
    /**
     * MERGE_AMOUNT_BILLED: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeAmountBilled() { return _columnMergeAmountBilled; }
    /**
     * MERGE_TOTAL_AMOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeTotalAmount() { return _columnMergeTotalAmount; }
    /**
     * MERGE_COUPON_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCouponDiscount() { return _columnMergeCouponDiscount; }
    /**
     * MERGE_POINT_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergePointDiscount() { return _columnMergePointDiscount; }
    /**
     * MERGE_OTHER_DISCOUNT: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeOtherDiscount() { return _columnMergeOtherDiscount; }
    /**
     * PACKING_QTY: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingQty() { return _columnPackingQty; }
    /**
     * SLIP_ITEM_NM1: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm1() { return _columnSlipItemNm1; }
    /**
     * SLIP_ITEM_NM2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm2() { return _columnSlipItemNm2; }
    /**
     * SLIP_ITEM_NM3: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm3() { return _columnSlipItemNm3; }
    /**
     * SLIP_ITEM_NM4: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm4() { return _columnSlipItemNm4; }
    /**
     * SLIP_ITEM_NM5: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm5() { return _columnSlipItemNm5; }
    /**
     * SLIP_ITEM_CD1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd1() { return _columnSlipItemCd1; }
    /**
     * SLIP_ITEM_CD2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemCd2() { return _columnSlipItemCd2; }
    /**
     * FREIGHT_HANDLING1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling1() { return _columnFreightHandling1; }
    /**
     * FREIGHT_HANDLING2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightHandling2() { return _columnFreightHandling2; }
    /**
     * ARTICLE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticle() { return _columnArticle; }
    /**
     * RECEIVE_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveId() { return _columnReceiveId; }
    /**
     * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportTypeId() { return _columnImportTypeId; }
    /**
     * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEcOrderHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnImportDt());
        ls.add(columnOrderNo());
        ls.add(columnPriorityFlg());
        ls.add(columnOrderDt());
        ls.add(columnOrderTime());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnComment1());
        ls.add(columnComment2());
        ls.add(columnGiftFlg());
        ls.add(columnNoshi());
        ls.add(columnOrderZipCd());
        ls.add(columnOrderAddress1());
        ls.add(columnOrderAddress2());
        ls.add(columnOrderAddress3());
        ls.add(columnOrderCustomerNm());
        ls.add(columnOrderCustomerNmKana());
        ls.add(columnOrderTelNo());
        ls.add(columnDelivMatchFlg());
        ls.add(columnMergeId());
        ls.add(columnMergeStatus());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnInvoiceDelivAddress1());
        ls.add(columnInvoiceDelivAddress2());
        ls.add(columnInvoiceDelivAddress3());
        ls.add(columnDelivCustomerNm());
        ls.add(columnDelivCustomerNmKana());
        ls.add(columnDelivTelNo());
        ls.add(columnDelivMethod());
        ls.add(columnDelivType());
        ls.add(columnDelivCompany());
        ls.add(columnPaymentMethod());
        ls.add(columnCardType());
        ls.add(columnTotal());
        ls.add(columnTax());
        ls.add(columnCarriage());
        ls.add(columnCod());
        ls.add(columnTotalAmount());
        ls.add(columnCouponDiscount());
        ls.add(columnPointDiscount());
        ls.add(columnOtherDiscount());
        ls.add(columnAmountBilled());
        ls.add(columnMergeTotal());
        ls.add(columnMergeCarriage());
        ls.add(columnMergeCod());
        ls.add(columnMergeTax());
        ls.add(columnMergeAmountBilled());
        ls.add(columnMergeTotalAmount());
        ls.add(columnMergeCouponDiscount());
        ls.add(columnMergePointDiscount());
        ls.add(columnMergeOtherDiscount());
        ls.add(columnPackingQty());
        ls.add(columnSlipItemNm1());
        ls.add(columnSlipItemNm2());
        ls.add(columnSlipItemNm3());
        ls.add(columnSlipItemNm4());
        ls.add(columnSlipItemNm5());
        ls.add(columnSlipItemCd1());
        ls.add(columnSlipItemCd2());
        ls.add(columnFreightHandling1());
        ls.add(columnFreightHandling2());
        ls.add(columnArticle());
        ls.add(columnReceiveId());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnImportFlg());
        ls.add(columnImportTypeId());
        ls.add(columnShippingInstHId());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEcOrderHId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMImportType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportTypeId(), MImportTypeDbm.getInstance().columnImportTypeId());
        return cfi("T_EC_ORDER_H_FK4", "MImportType", this, MImportTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TEcOrderHList", false);
    }
    /**
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstHId(), TShippingInstHDbm.getInstance().columnShippingInstHId());
        return cfi("T_EC_ORDER_H_FK2", "TShippingInstH", this, TShippingInstHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TEcOrderHList", false);
    }
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_EC_ORDER_H_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TEcOrderHList", false);
    }
    /**
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_EC_ORDER_H_FK3", "MClient", this, MClientDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TEcOrderHList", false);
    }
    /**
     * B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelivMatchFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelivMatchFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_H_DELIV_MATCH_FLG", "BClassDtlByDelivMatchFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DELIV_MATCH_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_H_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByGiftFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGiftFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_H_GIFT_FLG", "BClassDtlByGiftFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'GIFT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByImportFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImportFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_H_IMPORT_FLG", "BClassDtlByImportFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'IMPORT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPriorityFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPriorityFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_EC_ORDER_H_PRIORITY_FLG", "BClassDtlByPriorityFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PRIORITY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTEcOrderRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderHId(), TEcOrderRDbm.getInstance().columnEcOrderHId());
        return cfi("T_EC_ORDER_R_FK1", "TEcOrderRAsOne", this, TEcOrderRDbm.getInstance(), mp, 9, null, true, false, true, false, null, null, false, "TEcOrderH", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEcOrderHId(), TEcOrderBDbm.getInstance().columnEcOrderHId());
        return cri("T_EC_ORDER_B_FK1", "TEcOrderBList", this, TEcOrderBDbm.getInstance(), mp, false, "TEcOrderH");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TEcOrderH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TEcOrderHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TEcOrderH> getEntityType() { return TEcOrderH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TEcOrderH newEntity() { return new TEcOrderH(); }
    public TEcOrderH newMyEntity() { return new TEcOrderH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TEcOrderH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TEcOrderH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
