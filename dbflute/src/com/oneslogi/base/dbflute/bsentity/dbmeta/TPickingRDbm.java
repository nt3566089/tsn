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
 * The DB meta of T_PICKING_R. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPickingRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPickingRDbm _instance = new TPickingRDbm();
    private TPickingRDbm() {}
    public static TPickingRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPickingR)et).getPickingHId(), (et, vl) -> ((TPickingR)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getOplOutFlg(), (et, vl) -> ((TPickingR)et).setOplOutFlg((String)vl), "oplOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getTplOutFlg(), (et, vl) -> ((TPickingR)et).setTplOutFlg((String)vl), "tplOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getMltOutFlg(), (et, vl) -> ((TPickingR)et).setMltOutFlg((String)vl), "mltOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSplOutFlg(), (et, vl) -> ((TPickingR)et).setSplOutFlg((String)vl), "splOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutFlg(), (et, vl) -> ((TPickingR)et).setPl1OutFlg((String)vl), "pl1OutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutUserId(), (et, vl) -> ((TPickingR)et).setPl1OutUserId(ctl(vl)), "pl1OutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl1OutDt(), (et, vl) -> ((TPickingR)et).setPl1OutDt(cttp(vl)), "pl1OutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPlOutFlg(), (et, vl) -> ((TPickingR)et).setPlOutFlg((String)vl), "plOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlOutFlg(), (et, vl) -> ((TPickingR)et).setSlOutFlg((String)vl), "slOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutFlg(), (et, vl) -> ((TPickingR)et).setPl2OutFlg((String)vl), "pl2OutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutUserId(), (et, vl) -> ((TPickingR)et).setPl2OutUserId(ctl(vl)), "pl2OutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPl2OutDt(), (et, vl) -> ((TPickingR)et).setPl2OutDt(cttp(vl)), "pl2OutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutFlg(), (et, vl) -> ((TPickingR)et).setCaseOutFlg((String)vl), "caseOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutUserId(), (et, vl) -> ((TPickingR)et).setCaseOutUserId(ctl(vl)), "caseOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getCaseOutDt(), (et, vl) -> ((TPickingR)et).setCaseOutDt(cttp(vl)), "caseOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutFlg(), (et, vl) -> ((TPickingR)et).setPackingOutFlg((String)vl), "packingOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutUserId(), (et, vl) -> ((TPickingR)et).setPackingOutUserId(ctl(vl)), "packingOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getPackingOutDt(), (et, vl) -> ((TPickingR)et).setPackingOutDt(cttp(vl)), "packingOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutFlg(), (et, vl) -> ((TPickingR)et).setSlipOutFlg((String)vl), "slipOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutUserId(), (et, vl) -> ((TPickingR)et).setSlipOutUserId(ctl(vl)), "slipOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getSlipOutDt(), (et, vl) -> ((TPickingR)et).setSlipOutDt(cttp(vl)), "slipOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceCreateFlg(), (et, vl) -> ((TPickingR)et).setInvoiceCreateFlg((String)vl), "invoiceCreateFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceCreateDt(), (et, vl) -> ((TPickingR)et).setInvoiceCreateDt(cttp(vl)), "invoiceCreateDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getInvoiceIssueNum(), (et, vl) -> ((TPickingR)et).setInvoiceIssueNum(ctl(vl)), "invoiceIssueNum");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutFlg(), (et, vl) -> ((TPickingR)et).setShippingRecordOutFlg((String)vl), "shippingRecordOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutUserId(), (et, vl) -> ((TPickingR)et).setShippingRecordOutUserId(ctl(vl)), "shippingRecordOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getShippingRecordOutDt(), (et, vl) -> ((TPickingR)et).setShippingRecordOutDt(cttp(vl)), "shippingRecordOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutFlg(), (et, vl) -> ((TPickingR)et).setBolOutFlg((String)vl), "bolOutFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutUserId(), (et, vl) -> ((TPickingR)et).setBolOutUserId(ctl(vl)), "bolOutUserId");
        setupEpg(_epgMap, et -> ((TPickingR)et).getBolOutDt(), (et, vl) -> ((TPickingR)et).setBolOutDt(cttp(vl)), "bolOutDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getDelFlg(), (et, vl) -> ((TPickingR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPickingR)et).getVersionNo(), (et, vl) -> ((TPickingR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPickingR)et).getControlNo(), (et, vl) -> ((TPickingR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddDt(), (et, vl) -> ((TPickingR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddUser(), (et, vl) -> ((TPickingR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPickingR)et).getAddProcess(), (et, vl) -> ((TPickingR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdDt(), (et, vl) -> ((TPickingR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdUser(), (et, vl) -> ((TPickingR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPickingR)et).getUpdProcess(), (et, vl) -> ((TPickingR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPl1OutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPl1OutUserId((BUser)vl), "BUserByPl1OutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByCaseOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByCaseOutUserId((BUser)vl), "BUserByCaseOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByShippingRecordOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByShippingRecordOutUserId((BUser)vl), "BUserByShippingRecordOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getTPickingH(), (et, vl) -> ((TPickingR)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPl2OutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPl2OutUserId((BUser)vl), "BUserByPl2OutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserBySlipOutUserId(), (et, vl) -> ((TPickingR)et).setBUserBySlipOutUserId((BUser)vl), "BUserBySlipOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBUserByPackingOutUserId(), (et, vl) -> ((TPickingR)et).setBUserByPackingOutUserId((BUser)vl), "BUserByPackingOutUserId");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByInvoiceCreateFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByInvoiceCreateFlg((BClassDtl)vl), "BClassDtlByInvoiceCreateFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByOplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByOplOutFlg((BClassDtl)vl), "BClassDtlByOplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByTplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByTplOutFlg((BClassDtl)vl), "BClassDtlByTplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByCaseOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByCaseOutFlg((BClassDtl)vl), "BClassDtlByCaseOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByMltOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByMltOutFlg((BClassDtl)vl), "BClassDtlByMltOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySplOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySplOutFlg((BClassDtl)vl), "BClassDtlBySplOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPlOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPlOutFlg((BClassDtl)vl), "BClassDtlByPlOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySlOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySlOutFlg((BClassDtl)vl), "BClassDtlBySlOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPl1OutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPl1OutFlg((BClassDtl)vl), "BClassDtlByPl1OutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPl2OutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPl2OutFlg((BClassDtl)vl), "BClassDtlByPl2OutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByPackingOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByPackingOutFlg((BClassDtl)vl), "BClassDtlByPackingOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlBySlipOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlBySlipOutFlg((BClassDtl)vl), "BClassDtlBySlipOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByShippingRecordOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByShippingRecordOutFlg((BClassDtl)vl), "BClassDtlByShippingRecordOutFlg");
        setupEfpg(_efpgMap, et -> ((TPickingR)et).getBClassDtlByBolOutFlg(), (et, vl) -> ((TPickingR)et).setBClassDtlByBolOutFlg((BClassDtl)vl), "BClassDtlByBolOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_PICKING_R";
    protected final String _tableDispName = "T_PICKING_R";
    protected final String _tablePropertyName = "TPickingR";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_PICKING_R", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnOplOutFlg = cci("OPL_OUT_FLG", "OPL_OUT_FLG", null, null, String.class, "oplOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByOplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnTplOutFlg = cci("TPL_OUT_FLG", "TPL_OUT_FLG", null, null, String.class, "tplOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByTplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnMltOutFlg = cci("MLT_OUT_FLG", "MLT_OUT_FLG", null, null, String.class, "mltOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByMltOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnSplOutFlg = cci("SPL_OUT_FLG", "SPL_OUT_FLG", null, null, String.class, "splOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySplOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl1OutFlg = cci("PL1_OUT_FLG", "PL1_OUT_FLG", null, null, String.class, "pl1OutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPl1OutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl1OutUserId = cci("PL1_OUT_USER_ID", "PL1_OUT_USER_ID", null, null, Long.class, "pl1OutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByPl1OutUserId", null, null, false);
    protected final ColumnInfo _columnPl1OutDt = cci("PL1_OUT_DT", "PL1_OUT_DT", null, null, java.sql.Timestamp.class, "pl1OutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlOutFlg = cci("PL_OUT_FLG", "PL_OUT_FLG", null, null, String.class, "plOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPlOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnSlOutFlg = cci("SL_OUT_FLG", "SL_OUT_FLG", null, null, String.class, "slOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySlOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl2OutFlg = cci("PL2_OUT_FLG", "PL2_OUT_FLG", null, null, String.class, "pl2OutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPl2OutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPl2OutUserId = cci("PL2_OUT_USER_ID", "PL2_OUT_USER_ID", null, null, Long.class, "pl2OutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByPl2OutUserId", null, null, false);
    protected final ColumnInfo _columnPl2OutDt = cci("PL2_OUT_DT", "PL2_OUT_DT", null, null, java.sql.Timestamp.class, "pl2OutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseOutFlg = cci("CASE_OUT_FLG", "CASE_OUT_FLG", null, null, String.class, "caseOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByCaseOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnCaseOutUserId = cci("CASE_OUT_USER_ID", "CASE_OUT_USER_ID", null, null, Long.class, "caseOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByCaseOutUserId", null, null, false);
    protected final ColumnInfo _columnCaseOutDt = cci("CASE_OUT_DT", "CASE_OUT_DT", null, null, java.sql.Timestamp.class, "caseOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingOutFlg = cci("PACKING_OUT_FLG", "PACKING_OUT_FLG", null, null, String.class, "packingOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByPackingOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnPackingOutUserId = cci("PACKING_OUT_USER_ID", "PACKING_OUT_USER_ID", null, null, Long.class, "packingOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByPackingOutUserId", null, null, false);
    protected final ColumnInfo _columnPackingOutDt = cci("PACKING_OUT_DT", "PACKING_OUT_DT", null, null, java.sql.Timestamp.class, "packingOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipOutFlg = cci("SLIP_OUT_FLG", "SLIP_OUT_FLG", null, null, String.class, "slipOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlBySlipOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnSlipOutUserId = cci("SLIP_OUT_USER_ID", "SLIP_OUT_USER_ID", null, null, Long.class, "slipOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserBySlipOutUserId", null, null, false);
    protected final ColumnInfo _columnSlipOutDt = cci("SLIP_OUT_DT", "SLIP_OUT_DT", null, null, java.sql.Timestamp.class, "slipOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceCreateFlg = cci("INVOICE_CREATE_FLG", "INVOICE_CREATE_FLG", null, null, String.class, "invoiceCreateFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByInvoiceCreateFlg", null, CDef.DefMeta.InvoiceCreateFlg, false);
    protected final ColumnInfo _columnInvoiceCreateDt = cci("INVOICE_CREATE_DT", "INVOICE_CREATE_DT", null, null, java.sql.Timestamp.class, "invoiceCreateDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvoiceIssueNum = cci("INVOICE_ISSUE_NUM", "INVOICE_ISSUE_NUM", null, null, Long.class, "invoiceIssueNum", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingRecordOutFlg = cci("SHIPPING_RECORD_OUT_FLG", "SHIPPING_RECORD_OUT_FLG", null, null, String.class, "shippingRecordOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByShippingRecordOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnShippingRecordOutUserId = cci("SHIPPING_RECORD_OUT_USER_ID", "SHIPPING_RECORD_OUT_USER_ID", null, null, Long.class, "shippingRecordOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, "BUserByShippingRecordOutUserId", null, null, false);
    protected final ColumnInfo _columnShippingRecordOutDt = cci("SHIPPING_RECORD_OUT_DT", "SHIPPING_RECORD_OUT_DT", null, null, java.sql.Timestamp.class, "shippingRecordOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutFlg = cci("BOL_OUT_FLG", "BOL_OUT_FLG", null, null, String.class, "bolOutFlg", null, false, false, false, "char", 1, 0, null, null, false, null, null, "BClassDtlByBolOutFlg", null, CDef.DefMeta.BolOutFlg, false);
    protected final ColumnInfo _columnBolOutUserId = cci("BOL_OUT_USER_ID", "BOL_OUT_USER_ID", null, null, Long.class, "bolOutUserId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBolOutDt = cci("BOL_OUT_DT", "BOL_OUT_DT", null, null, java.sql.Timestamp.class, "bolOutDt", null, false, false, false, "datetime2", 26, 6, null, null, false, null, null, null, null, null, false);
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
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOplOutFlg() { return _columnOplOutFlg; }
    /**
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTplOutFlg() { return _columnTplOutFlg; }
    /**
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMltOutFlg() { return _columnMltOutFlg; }
    /**
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSplOutFlg() { return _columnSplOutFlg; }
    /**
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutFlg() { return _columnPl1OutFlg; }
    /**
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutUserId() { return _columnPl1OutUserId; }
    /**
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl1OutDt() { return _columnPl1OutDt; }
    /**
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlOutFlg() { return _columnPlOutFlg; }
    /**
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlOutFlg() { return _columnSlOutFlg; }
    /**
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutFlg() { return _columnPl2OutFlg; }
    /**
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutUserId() { return _columnPl2OutUserId; }
    /**
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPl2OutDt() { return _columnPl2OutDt; }
    /**
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutFlg() { return _columnCaseOutFlg; }
    /**
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutUserId() { return _columnCaseOutUserId; }
    /**
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseOutDt() { return _columnCaseOutDt; }
    /**
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutFlg() { return _columnPackingOutFlg; }
    /**
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutUserId() { return _columnPackingOutUserId; }
    /**
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingOutDt() { return _columnPackingOutDt; }
    /**
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutFlg() { return _columnSlipOutFlg; }
    /**
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutUserId() { return _columnSlipOutUserId; }
    /**
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipOutDt() { return _columnSlipOutDt; }
    /**
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateFlg() { return _columnInvoiceCreateFlg; }
    /**
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceCreateDt() { return _columnInvoiceCreateDt; }
    /**
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvoiceIssueNum() { return _columnInvoiceIssueNum; }
    /**
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutFlg() { return _columnShippingRecordOutFlg; }
    /**
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutUserId() { return _columnShippingRecordOutUserId; }
    /**
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordOutDt() { return _columnShippingRecordOutDt; }
    /**
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutFlg() { return _columnBolOutFlg; }
    /**
     * BOL_OUT_USER_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutUserId() { return _columnBolOutUserId; }
    /**
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBolOutDt() { return _columnBolOutDt; }
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
        ls.add(columnPickingHId());
        ls.add(columnOplOutFlg());
        ls.add(columnTplOutFlg());
        ls.add(columnMltOutFlg());
        ls.add(columnSplOutFlg());
        ls.add(columnPl1OutFlg());
        ls.add(columnPl1OutUserId());
        ls.add(columnPl1OutDt());
        ls.add(columnPlOutFlg());
        ls.add(columnSlOutFlg());
        ls.add(columnPl2OutFlg());
        ls.add(columnPl2OutUserId());
        ls.add(columnPl2OutDt());
        ls.add(columnCaseOutFlg());
        ls.add(columnCaseOutUserId());
        ls.add(columnCaseOutDt());
        ls.add(columnPackingOutFlg());
        ls.add(columnPackingOutUserId());
        ls.add(columnPackingOutDt());
        ls.add(columnSlipOutFlg());
        ls.add(columnSlipOutUserId());
        ls.add(columnSlipOutDt());
        ls.add(columnInvoiceCreateFlg());
        ls.add(columnInvoiceCreateDt());
        ls.add(columnInvoiceIssueNum());
        ls.add(columnShippingRecordOutFlg());
        ls.add(columnShippingRecordOutUserId());
        ls.add(columnShippingRecordOutDt());
        ls.add(columnBolOutFlg());
        ls.add(columnBolOutUserId());
        ls.add(columnBolOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingHId()); }
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
     * B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPl1OutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl1OutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK3", "BUserByPl1OutUserId", this, BUserDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPickingRByPl1OutUserIdList", false);
    }
    /**
     * B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByCaseOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK5", "BUserByCaseOutUserId", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPickingRByCaseOutUserIdList", false);
    }
    /**
     * B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByShippingRecordOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingRecordOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK4", "BUserByShippingRecordOutUserId", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPickingRByShippingRecordOutUserIdList", false);
    }
    /**
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_PICKING_R_FK1", "TPickingH", this, TPickingHDbm.getInstance(), mp, 3, null, true, false, false, false, null, null, false, "TPickingRAsOne", false);
    }
    /**
     * B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPl2OutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl2OutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK2", "BUserByPl2OutUserId", this, BUserDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TPickingRByPl2OutUserIdList", false);
    }
    /**
     * B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserBySlipOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK6", "BUserBySlipOutUserId", this, BUserDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TPickingRBySlipOutUserIdList", false);
    }
    /**
     * B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByPackingOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_PICKING_R_FK7", "BUserByPackingOutUserId", this, BUserDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TPickingRByPackingOutUserIdList", false);
    }
    /**
     * B_CLASS_DTL by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInvoiceCreateFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInvoiceCreateFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_INVOICE_CREATE_FLG", "BClassDtlByInvoiceCreateFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INVOICE_CREATE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_OPL_OUT_FLG", "BClassDtlByOplOutFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_TPL_OUT_FLG", "BClassDtlByTplOutFlg", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByCaseOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCaseOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_CASE_OUT_FLG", "BClassDtlByCaseOutFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMltOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMltOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_MLT_OUT_FLG", "BClassDtlByMltOutFlg", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySplOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSplOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SPL_OUT_FLG", "BClassDtlBySplOutFlg", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPlOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL_OUT_FLG", "BClassDtlByPlOutFlg", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySlOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SL_OUT_FLG", "BClassDtlBySlOutFlg", this, BClassDtlDbm.getInstance(), mp, 14, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPl1OutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl1OutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL1_OUT_FLG", "BClassDtlByPl1OutFlg", this, BClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPl2OutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPl2OutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PL2_OUT_FLG", "BClassDtlByPl2OutFlg", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPackingOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPackingOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_PACKING_OUT_FLG", "BClassDtlByPackingOutFlg", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlBySlipOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSlipOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SLIP_OUT_FLG", "BClassDtlBySlipOutFlg", this, BClassDtlDbm.getInstance(), mp, 18, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingRecordOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingRecordOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_SHIPPING_RECORD_OUT_FLG", "BClassDtlByShippingRecordOutFlg", this, BClassDtlDbm.getInstance(), mp, 19, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * B_CLASS_DTL by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByBolOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBolOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_PICKING_R_BOL_OUT_FLG", "BClassDtlByBolOutFlg", this, BClassDtlDbm.getInstance(), mp, 20, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'BOL_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPickingR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPickingRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPickingRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPickingR> getEntityType() { return TPickingR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPickingR newEntity() { return new TPickingR(); }
    public TPickingR newMyEntity() { return new TPickingR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPickingR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPickingR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
