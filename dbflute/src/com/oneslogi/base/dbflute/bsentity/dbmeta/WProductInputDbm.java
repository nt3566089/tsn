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
 * The DB meta of W_PRODUCT_INPUT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WProductInputDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WProductInputDbm _instance = new WProductInputDbm();
    private WProductInputDbm() {}
    public static WProductInputDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WProductInput)et).getProductInputId(), (et, vl) -> ((WProductInput)et).setProductInputId(ctl(vl)), "productInputId");
        setupEpg(_epgMap, et -> ((WProductInput)et).getClientCd(), (et, vl) -> ((WProductInput)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((WProductInput)et).getProductCd(), (et, vl) -> ((WProductInput)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WProductInput)et).getProductNm(), (et, vl) -> ((WProductInput)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WProductInput)et).getProductAbbr(), (et, vl) -> ((WProductInput)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((WProductInput)et).getJanCd(), (et, vl) -> ((WProductInput)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLotManagFlg(), (et, vl) -> ((WProductInput)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLimitDtManagFlg(), (et, vl) -> ((WProductInput)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getReceiveLimitNum(), (et, vl) -> ((WProductInput)et).setReceiveLimitNum((String)vl), "receiveLimitNum");
        setupEpg(_epgMap, et -> ((WProductInput)et).getShippingLimitNum(), (et, vl) -> ((WProductInput)et).setShippingLimitNum((String)vl), "shippingLimitNum");
        setupEpg(_epgMap, et -> ((WProductInput)et).getMergeCls(), (et, vl) -> ((WProductInput)et).setMergeCls((String)vl), "mergeCls");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLotReverseFlg(), (et, vl) -> ((WProductInput)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLimitDtReverseFlg(), (et, vl) -> ((WProductInput)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getShippingStopFlg(), (et, vl) -> ((WProductInput)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getShapeGrpCd(), (et, vl) -> ((WProductInput)et).setShapeGrpCd((String)vl), "shapeGrpCd");
        setupEpg(_epgMap, et -> ((WProductInput)et).getFixedPoint(), (et, vl) -> ((WProductInput)et).setFixedPoint((String)vl), "fixedPoint");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLength(), (et, vl) -> ((WProductInput)et).setLength((String)vl), "length");
        setupEpg(_epgMap, et -> ((WProductInput)et).getWidth(), (et, vl) -> ((WProductInput)et).setWidth((String)vl), "width");
        setupEpg(_epgMap, et -> ((WProductInput)et).getHeight(), (et, vl) -> ((WProductInput)et).setHeight((String)vl), "height");
        setupEpg(_epgMap, et -> ((WProductInput)et).getVolume(), (et, vl) -> ((WProductInput)et).setVolume((String)vl), "volume");
        setupEpg(_epgMap, et -> ((WProductInput)et).getNetWeight(), (et, vl) -> ((WProductInput)et).setNetWeight((String)vl), "netWeight");
        setupEpg(_epgMap, et -> ((WProductInput)et).getGrossWeight(), (et, vl) -> ((WProductInput)et).setGrossWeight((String)vl), "grossWeight");
        setupEpg(_epgMap, et -> ((WProductInput)et).getLineNo(), (et, vl) -> ((WProductInput)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((WProductInput)et).getWorkFlg(), (et, vl) -> ((WProductInput)et).setWorkFlg((String)vl), "workFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getErrorFlg(), (et, vl) -> ((WProductInput)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getErrorMsg(), (et, vl) -> ((WProductInput)et).setErrorMsg((String)vl), "errorMsg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getDelFlg(), (et, vl) -> ((WProductInput)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WProductInput)et).getVersionNo(), (et, vl) -> ((WProductInput)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WProductInput)et).getControlNo(), (et, vl) -> ((WProductInput)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WProductInput)et).getAddDt(), (et, vl) -> ((WProductInput)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WProductInput)et).getAddUser(), (et, vl) -> ((WProductInput)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WProductInput)et).getAddProcess(), (et, vl) -> ((WProductInput)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WProductInput)et).getUpdDt(), (et, vl) -> ((WProductInput)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WProductInput)et).getUpdUser(), (et, vl) -> ((WProductInput)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WProductInput)et).getUpdProcess(), (et, vl) -> ((WProductInput)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "W_PRODUCT_INPUT";
    protected final String _tableDispName = "W_PRODUCT_INPUT";
    protected final String _tablePropertyName = "WProductInput";
    protected final TableSqlName _tableSqlName = new TableSqlName("W_PRODUCT_INPUT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductInputId = cci("PRODUCT_INPUT_ID", "PRODUCT_INPUT_ID", null, null, Long.class, "productInputId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveLimitNum = cci("RECEIVE_LIMIT_NUM", "RECEIVE_LIMIT_NUM", null, null, String.class, "receiveLimitNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingLimitNum = cci("SHIPPING_LIMIT_NUM", "SHIPPING_LIMIT_NUM", null, null, String.class, "shippingLimitNum", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCls = cci("MERGE_CLS", "MERGE_CLS", null, null, String.class, "mergeCls", null, false, false, false, "varchar", 255, 0, null, "02", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "varchar", 255, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeGrpCd = cci("SHAPE_GRP_CD", "SHAPE_GRP_CD", null, null, String.class, "shapeGrpCd", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixedPoint = cci("FIXED_POINT", "FIXED_POINT", null, null, String.class, "fixedPoint", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, String.class, "length", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, String.class, "width", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, String.class, "height", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolume = cci("VOLUME", "VOLUME", null, null, String.class, "volume", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetWeight = cci("NET_WEIGHT", "NET_WEIGHT", null, null, String.class, "netWeight", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossWeight = cci("GROSS_WEIGHT", "GROSS_WEIGHT", null, null, String.class, "grossWeight", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkFlg = cci("WORK_FLG", "WORK_FLG", null, null, String.class, "workFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMsg = cci("ERROR_MSG", "ERROR_MSG", null, null, String.class, "errorMsg", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductInputId() { return _columnProductInputId; }
    /**
     * CLIENT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * PRODUCT_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * LOT_MANAG_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
    /**
     * RECEIVE_LIMIT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLimitNum() { return _columnReceiveLimitNum; }
    /**
     * SHIPPING_LIMIT_NUM: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingLimitNum() { return _columnShippingLimitNum; }
    /**
     * MERGE_CLS: {varchar(255), default=[02]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCls() { return _columnMergeCls; }
    /**
     * LOT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_STOP_FLG: {varchar(255), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * SHAPE_GRP_CD: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpCd() { return _columnShapeGrpCd; }
    /**
     * FIXED_POINT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedPoint() { return _columnFixedPoint; }
    /**
     * LENGTH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * VOLUME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolume() { return _columnVolume; }
    /**
     * NET_WEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetWeight() { return _columnNetWeight; }
    /**
     * GROSS_WEIGHT: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossWeight() { return _columnGrossWeight; }
    /**
     * LINE_NO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WORK_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkFlg() { return _columnWorkFlg; }
    /**
     * ERROR_FLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MSG: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMsg() { return _columnErrorMsg; }
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
        ls.add(columnProductInputId());
        ls.add(columnClientCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnReceiveLimitNum());
        ls.add(columnShippingLimitNum());
        ls.add(columnMergeCls());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingStopFlg());
        ls.add(columnShapeGrpCd());
        ls.add(columnFixedPoint());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnVolume());
        ls.add(columnNetWeight());
        ls.add(columnGrossWeight());
        ls.add(columnLineNo());
        ls.add(columnWorkFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMsg());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductInputId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WProductInput"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WProductInputCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WProductInputBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WProductInput> getEntityType() { return WProductInput.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WProductInput newEntity() { return new WProductInput(); }
    public WProductInput newMyEntity() { return new WProductInput(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WProductInput)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WProductInput)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
