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
 * The DB meta of E_CORDDTAAM_SEND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ECorddtaamSendDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ECorddtaamSendDbm _instance = new ECorddtaamSendDbm();
    private ECorddtaamSendDbm() {}
    public static ECorddtaamSendDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCorddtaamSendId(), (et, vl) -> ((ECorddtaamSend)et).setCorddtaamSendId(ctl(vl)), "corddtaamSendId");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSendCd(), (et, vl) -> ((ECorddtaamSend)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSendRowId(), (et, vl) -> ((ECorddtaamSend)et).setSendRowId(ctl(vl)), "sendRowId");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getWorkFlg(), (et, vl) -> ((ECorddtaamSend)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCenterCd(), (et, vl) -> ((ECorddtaamSend)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDelivayCenterCd(), (et, vl) -> ((ECorddtaamSend)et).setDelivayCenterCd((String)vl), "delivayCenterCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDeliveryDatetime(), (et, vl) -> ((ECorddtaamSend)et).setDeliveryDatetime((String)vl), "deliveryDatetime");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDirectionCd(), (et, vl) -> ((ECorddtaamSend)et).setDirectionCd((String)vl), "directionCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getPistonType(), (et, vl) -> ((ECorddtaamSend)et).setPistonType((String)vl), "pistonType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCapDirectionCd(), (et, vl) -> ((ECorddtaamSend)et).setCapDirectionCd((String)vl), "capDirectionCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCapPistonType(), (et, vl) -> ((ECorddtaamSend)et).setCapPistonType((String)vl), "capPistonType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSortLineCd(), (et, vl) -> ((ECorddtaamSend)et).setSortLineCd((String)vl), "sortLineCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSortOrder(), (et, vl) -> ((ECorddtaamSend)et).setSortOrder((String)vl), "sortOrder");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCustomerCd(), (et, vl) -> ((ECorddtaamSend)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCustomerNm(), (et, vl) -> ((ECorddtaamSend)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getProductCd(), (et, vl) -> ((ECorddtaamSend)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSlqacb(), (et, vl) -> ((ECorddtaamSend)et).setSlqacb((String)vl), "slqacb");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSlqact(), (et, vl) -> ((ECorddtaamSend)et).setSlqact((String)vl), "slqact");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getLineBlock(), (et, vl) -> ((ECorddtaamSend)et).setLineBlock((String)vl), "lineBlock");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getLocationNo(), (et, vl) -> ((ECorddtaamSend)et).setLocationNo((String)vl), "locationNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getLocationType(), (et, vl) -> ((ECorddtaamSend)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDeliveryPrintRank(), (et, vl) -> ((ECorddtaamSend)et).setDeliveryPrintRank((String)vl), "deliveryPrintRank");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDeliverySeqNo(), (et, vl) -> ((ECorddtaamSend)et).setDeliverySeqNo((String)vl), "deliverySeqNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDeliveryBranchNo(), (et, vl) -> ((ECorddtaamSend)et).setDeliveryBranchNo((String)vl), "deliveryBranchNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getSortWorkDt(), (et, vl) -> ((ECorddtaamSend)et).setSortWorkDt((String)vl), "sortWorkDt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCsroprtcnt(), (et, vl) -> ((ECorddtaamSend)et).setCsroprtcnt((String)vl), "csroprtcnt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getCuttopdirassord(), (et, vl) -> ((ECorddtaamSend)et).setCuttopdirassord((String)vl), "cuttopdirassord");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getProductType(), (et, vl) -> ((ECorddtaamSend)et).setProductType((String)vl), "productType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getBoxNo(), (et, vl) -> ((ECorddtaamSend)et).setBoxNo((String)vl), "boxNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getBoxNoSeqNo(), (et, vl) -> ((ECorddtaamSend)et).setBoxNoSeqNo((String)vl), "boxNoSeqNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getBoxType(), (et, vl) -> ((ECorddtaamSend)et).setBoxType((String)vl), "boxType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getMergeBoxVisibleType(), (et, vl) -> ((ECorddtaamSend)et).setMergeBoxVisibleType((String)vl), "mergeBoxVisibleType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDmVisibleType(), (et, vl) -> ((ECorddtaamSend)et).setDmVisibleType((String)vl), "dmVisibleType");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getTotalBoxCnt(), (et, vl) -> ((ECorddtaamSend)et).setTotalBoxCnt((String)vl), "totalBoxCnt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getBoxCartonSum(), (et, vl) -> ((ECorddtaamSend)et).setBoxCartonSum((String)vl), "boxCartonSum");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getBoxCartonSortNum(), (et, vl) -> ((ECorddtaamSend)et).setBoxCartonSortNum((String)vl), "boxCartonSortNum");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getTttopdedrnk(), (et, vl) -> ((ECorddtaamSend)et).setTttopdedrnk((String)vl), "tttopdedrnk");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getLineBlockBoxNo(), (et, vl) -> ((ECorddtaamSend)et).setLineBlockBoxNo((String)vl), "lineBlockBoxNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getLineBlockTotalBoxCnt(), (et, vl) -> ((ECorddtaamSend)et).setLineBlockTotalBoxCnt((String)vl), "lineBlockTotalBoxCnt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getDelFlg(), (et, vl) -> ((ECorddtaamSend)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getVersionNo(), (et, vl) -> ((ECorddtaamSend)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getControlNo(), (et, vl) -> ((ECorddtaamSend)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getAddDt(), (et, vl) -> ((ECorddtaamSend)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getAddUser(), (et, vl) -> ((ECorddtaamSend)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getAddProcess(), (et, vl) -> ((ECorddtaamSend)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getUpdDt(), (et, vl) -> ((ECorddtaamSend)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getUpdUser(), (et, vl) -> ((ECorddtaamSend)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ECorddtaamSend)et).getUpdProcess(), (et, vl) -> ((ECorddtaamSend)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_CORDDTAAM_SEND";
    protected final String _tableDispName = "E_CORDDTAAM_SEND";
    protected final String _tablePropertyName = "ECorddtaamSend";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_CORDDTAAM_SEND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCorddtaamSendId = cci("CORDDTAAM_SEND_ID", "CORDDTAAM_SEND_ID", null, null, Long.class, "corddtaamSendId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendRowId = cci("SEND_ROW_ID", "SEND_ROW_ID", null, null, Long.class, "sendRowId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, true, "char", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivayCenterCd = cci("DELIVAY_CENTER_CD", "DELIVAY_CENTER_CD", null, null, String.class, "delivayCenterCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryDatetime = cci("DELIVERY_DATETIME", "DELIVERY_DATETIME", null, null, String.class, "deliveryDatetime", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectionCd = cci("DIRECTION_CD", "DIRECTION_CD", null, null, String.class, "directionCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPistonType = cci("PISTON_TYPE", "PISTON_TYPE", null, null, String.class, "pistonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapDirectionCd = cci("CAP_DIRECTION_CD", "CAP_DIRECTION_CD", null, null, String.class, "capDirectionCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCapPistonType = cci("CAP_PISTON_TYPE", "CAP_PISTON_TYPE", null, null, String.class, "capPistonType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortLineCd = cci("SORT_LINE_CD", "SORT_LINE_CD", null, null, String.class, "sortLineCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortOrder = cci("SORT_ORDER", "SORT_ORDER", null, null, String.class, "sortOrder", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqacb = cci("SLQACB", "SLQACB", null, null, String.class, "slqacb", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlqact = cci("SLQACT", "SLQACT", null, null, String.class, "slqact", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlock = cci("LINE_BLOCK", "LINE_BLOCK", null, null, String.class, "lineBlock", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNo = cci("LOCATION_NO", "LOCATION_NO", null, null, String.class, "locationNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryPrintRank = cci("DELIVERY_PRINT_RANK", "DELIVERY_PRINT_RANK", null, null, String.class, "deliveryPrintRank", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverySeqNo = cci("DELIVERY_SEQ_NO", "DELIVERY_SEQ_NO", null, null, String.class, "deliverySeqNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryBranchNo = cci("DELIVERY_BRANCH_NO", "DELIVERY_BRANCH_NO", null, null, String.class, "deliveryBranchNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortWorkDt = cci("SORT_WORK_DT", "SORT_WORK_DT", null, null, String.class, "sortWorkDt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCsroprtcnt = cci("CSROPRTCNT", "CSROPRTCNT", null, null, String.class, "csroprtcnt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCuttopdirassord = cci("CUTTOPDIRASSORD", "CUTTOPDIRASSORD", null, null, String.class, "cuttopdirassord", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductType = cci("PRODUCT_TYPE", "PRODUCT_TYPE", null, null, String.class, "productType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNo = cci("BOX_NO", "BOX_NO", null, null, String.class, "boxNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNoSeqNo = cci("BOX_NO_SEQ_NO", "BOX_NO_SEQ_NO", null, null, String.class, "boxNoSeqNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxType = cci("BOX_TYPE", "BOX_TYPE", null, null, String.class, "boxType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeBoxVisibleType = cci("MERGE_BOX_VISIBLE_TYPE", "MERGE_BOX_VISIBLE_TYPE", null, null, String.class, "mergeBoxVisibleType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDmVisibleType = cci("DM_VISIBLE_TYPE", "DM_VISIBLE_TYPE", null, null, String.class, "dmVisibleType", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalBoxCnt = cci("TOTAL_BOX_CNT", "TOTAL_BOX_CNT", null, null, String.class, "totalBoxCnt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCartonSum = cci("BOX_CARTON_SUM", "BOX_CARTON_SUM", null, null, String.class, "boxCartonSum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCartonSortNum = cci("BOX_CARTON_SORT_NUM", "BOX_CARTON_SORT_NUM", null, null, String.class, "boxCartonSortNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTttopdedrnk = cci("TTTOPDEDRNK", "TTTOPDEDRNK", null, null, String.class, "tttopdedrnk", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlockBoxNo = cci("LINE_BLOCK_BOX_NO", "LINE_BLOCK_BOX_NO", null, null, String.class, "lineBlockBoxNo", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineBlockTotalBoxCnt = cci("LINE_BLOCK_TOTAL_BOX_CNT", "LINE_BLOCK_TOTAL_BOX_CNT", null, null, String.class, "lineBlockTotalBoxCnt", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * CORDDTAAM_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorddtaamSendId() { return _columnCorddtaamSendId; }
    /**
     * SEND_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendRowId() { return _columnSendRowId; }
    /**
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * CENTER_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * DELIVAY_CENTER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivayCenterCd() { return _columnDelivayCenterCd; }
    /**
     * DELIVERY_DATETIME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryDatetime() { return _columnDeliveryDatetime; }
    /**
     * DIRECTION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectionCd() { return _columnDirectionCd; }
    /**
     * PISTON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPistonType() { return _columnPistonType; }
    /**
     * CAP_DIRECTION_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapDirectionCd() { return _columnCapDirectionCd; }
    /**
     * CAP_PISTON_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCapPistonType() { return _columnCapPistonType; }
    /**
     * SORT_LINE_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortLineCd() { return _columnSortLineCd; }
    /**
     * SORT_ORDER: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortOrder() { return _columnSortOrder; }
    /**
     * CUSTOMER_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * SLQACB: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlqacb() { return _columnSlqacb; }
    /**
     * SLQACT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlqact() { return _columnSlqact; }
    /**
     * LINE_BLOCK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlock() { return _columnLineBlock; }
    /**
     * LOCATION_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNo() { return _columnLocationNo; }
    /**
     * LOCATION_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * DELIVERY_PRINT_RANK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryPrintRank() { return _columnDeliveryPrintRank; }
    /**
     * DELIVERY_SEQ_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverySeqNo() { return _columnDeliverySeqNo; }
    /**
     * DELIVERY_BRANCH_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryBranchNo() { return _columnDeliveryBranchNo; }
    /**
     * SORT_WORK_DT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortWorkDt() { return _columnSortWorkDt; }
    /**
     * CSROPRTCNT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCsroprtcnt() { return _columnCsroprtcnt; }
    /**
     * CUTTOPDIRASSORD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCuttopdirassord() { return _columnCuttopdirassord; }
    /**
     * PRODUCT_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductType() { return _columnProductType; }
    /**
     * BOX_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNo() { return _columnBoxNo; }
    /**
     * BOX_NO_SEQ_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNoSeqNo() { return _columnBoxNoSeqNo; }
    /**
     * BOX_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxType() { return _columnBoxType; }
    /**
     * MERGE_BOX_VISIBLE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeBoxVisibleType() { return _columnMergeBoxVisibleType; }
    /**
     * DM_VISIBLE_TYPE: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDmVisibleType() { return _columnDmVisibleType; }
    /**
     * TOTAL_BOX_CNT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalBoxCnt() { return _columnTotalBoxCnt; }
    /**
     * BOX_CARTON_SUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCartonSum() { return _columnBoxCartonSum; }
    /**
     * BOX_CARTON_SORT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCartonSortNum() { return _columnBoxCartonSortNum; }
    /**
     * TTTOPDEDRNK: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTttopdedrnk() { return _columnTttopdedrnk; }
    /**
     * LINE_BLOCK_BOX_NO: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlockBoxNo() { return _columnLineBlockBoxNo; }
    /**
     * LINE_BLOCK_TOTAL_BOX_CNT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineBlockTotalBoxCnt() { return _columnLineBlockTotalBoxCnt; }
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
        ls.add(columnCorddtaamSendId());
        ls.add(columnSendCd());
        ls.add(columnSendRowId());
        ls.add(columnWorkFlg());
        ls.add(columnCenterCd());
        ls.add(columnDelivayCenterCd());
        ls.add(columnDeliveryDatetime());
        ls.add(columnDirectionCd());
        ls.add(columnPistonType());
        ls.add(columnCapDirectionCd());
        ls.add(columnCapPistonType());
        ls.add(columnSortLineCd());
        ls.add(columnSortOrder());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnProductCd());
        ls.add(columnSlqacb());
        ls.add(columnSlqact());
        ls.add(columnLineBlock());
        ls.add(columnLocationNo());
        ls.add(columnLocationType());
        ls.add(columnDeliveryPrintRank());
        ls.add(columnDeliverySeqNo());
        ls.add(columnDeliveryBranchNo());
        ls.add(columnSortWorkDt());
        ls.add(columnCsroprtcnt());
        ls.add(columnCuttopdirassord());
        ls.add(columnProductType());
        ls.add(columnBoxNo());
        ls.add(columnBoxNoSeqNo());
        ls.add(columnBoxType());
        ls.add(columnMergeBoxVisibleType());
        ls.add(columnDmVisibleType());
        ls.add(columnTotalBoxCnt());
        ls.add(columnBoxCartonSum());
        ls.add(columnBoxCartonSortNum());
        ls.add(columnTttopdedrnk());
        ls.add(columnLineBlockBoxNo());
        ls.add(columnLineBlockTotalBoxCnt());
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
    protected UniqueInfo cpui() { return hpcpui(columnCorddtaamSendId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ECorddtaamSend"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ECorddtaamSendCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ECorddtaamSendBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ECorddtaamSend> getEntityType() { return ECorddtaamSend.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ECorddtaamSend newEntity() { return new ECorddtaamSend(); }
    public ECorddtaamSend newMyEntity() { return new ECorddtaamSend(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ECorddtaamSend)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ECorddtaamSend)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
