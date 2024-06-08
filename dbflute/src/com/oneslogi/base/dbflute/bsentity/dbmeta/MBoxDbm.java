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
 * The DB meta of M_BOX. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MBoxDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MBoxDbm _instance = new MBoxDbm();
    private MBoxDbm() {}
    public static MBoxDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MBox)et).getBoxId(), (et, vl) -> ((MBox)et).setBoxId(ctl(vl)), "boxId");
        setupEpg(_epgMap, et -> ((MBox)et).getCenterId(), (et, vl) -> ((MBox)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MBox)et).getBoxCd(), (et, vl) -> ((MBox)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((MBox)et).getBoxNm(), (et, vl) -> ((MBox)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((MBox)et).getLength(), (et, vl) -> ((MBox)et).setLength(ctb(vl)), "length");
        setupEpg(_epgMap, et -> ((MBox)et).getWidth(), (et, vl) -> ((MBox)et).setWidth(ctb(vl)), "width");
        setupEpg(_epgMap, et -> ((MBox)et).getHeight(), (et, vl) -> ((MBox)et).setHeight(ctb(vl)), "height");
        setupEpg(_epgMap, et -> ((MBox)et).getVolume(), (et, vl) -> ((MBox)et).setVolume(ctb(vl)), "volume");
        setupEpg(_epgMap, et -> ((MBox)et).getVolumeRate(), (et, vl) -> ((MBox)et).setVolumeRate(ctl(vl)), "volumeRate");
        setupEpg(_epgMap, et -> ((MBox)et).getPermitVolume(), (et, vl) -> ((MBox)et).setPermitVolume(ctb(vl)), "permitVolume");
        setupEpg(_epgMap, et -> ((MBox)et).getPermitWeight(), (et, vl) -> ((MBox)et).setPermitWeight(ctb(vl)), "permitWeight");
        setupEpg(_epgMap, et -> ((MBox)et).getBoxType(), (et, vl) -> ((MBox)et).setBoxType((String)vl), "boxType");
        setupEpg(_epgMap, et -> ((MBox)et).getBxoszl(), (et, vl) -> ((MBox)et).setBxoszl(ctl(vl)), "bxoszl");
        setupEpg(_epgMap, et -> ((MBox)et).getBxoszw(), (et, vl) -> ((MBox)et).setBxoszw(ctl(vl)), "bxoszw");
        setupEpg(_epgMap, et -> ((MBox)et).getBxoszh(), (et, vl) -> ((MBox)et).setBxoszh(ctl(vl)), "bxoszh");
        setupEpg(_epgMap, et -> ((MBox)et).getBxweight(), (et, vl) -> ((MBox)et).setBxweight(ctb(vl)), "bxweight");
        setupEpg(_epgMap, et -> ((MBox)et).getBxcpy(), (et, vl) -> ((MBox)et).setBxcpy(ctb(vl)), "bxcpy");
        setupEpg(_epgMap, et -> ((MBox)et).getDelFlg(), (et, vl) -> ((MBox)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MBox)et).getVersionNo(), (et, vl) -> ((MBox)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MBox)et).getControlNo(), (et, vl) -> ((MBox)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MBox)et).getAddDt(), (et, vl) -> ((MBox)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MBox)et).getAddUser(), (et, vl) -> ((MBox)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MBox)et).getAddProcess(), (et, vl) -> ((MBox)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MBox)et).getUpdDt(), (et, vl) -> ((MBox)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MBox)et).getUpdUser(), (et, vl) -> ((MBox)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MBox)et).getUpdProcess(), (et, vl) -> ((MBox)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MBox)et).getMCenter(), (et, vl) -> ((MBox)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MBox)et).getBClassDtlByDelFlg(), (et, vl) -> ((MBox)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "M_BOX";
    protected final String _tableDispName = "M_BOX";
    protected final String _tablePropertyName = "MBox";
    protected final TableSqlName _tableSqlName = new TableSqlName("M_BOX", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBoxId = cci("BOX_ID", "BOX_ID", null, null, Long.class, "boxId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, "MBoxGrpList,MBoxGrpDtlList,MCarrierBoxList,MParamList,TPackingHList,WHtShippingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, true, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength = cci("LENGTH", "LENGTH", null, null, java.math.BigDecimal.class, "length", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth = cci("WIDTH", "WIDTH", null, null, java.math.BigDecimal.class, "width", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight = cci("HEIGHT", "HEIGHT", null, null, java.math.BigDecimal.class, "height", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolume = cci("VOLUME", "VOLUME", null, null, java.math.BigDecimal.class, "volume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVolumeRate = cci("VOLUME_RATE", "VOLUME_RATE", null, null, Long.class, "volumeRate", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPermitVolume = cci("PERMIT_VOLUME", "PERMIT_VOLUME", null, null, java.math.BigDecimal.class, "permitVolume", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPermitWeight = cci("PERMIT_WEIGHT", "PERMIT_WEIGHT", null, null, java.math.BigDecimal.class, "permitWeight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxType = cci("BOX_TYPE", "BOX_TYPE", null, null, String.class, "boxType", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszl = cci("BXOSZL", "BXOSZL", null, null, Long.class, "bxoszl", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszw = cci("BXOSZW", "BXOSZW", null, null, Long.class, "bxoszw", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxoszh = cci("BXOSZH", "BXOSZH", null, null, Long.class, "bxoszh", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxweight = cci("BXWEIGHT", "BXWEIGHT", null, null, java.math.BigDecimal.class, "bxweight", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBxcpy = cci("bxcpy", "bxcpy", null, null, java.math.BigDecimal.class, "bxcpy", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "char", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "bigint", 19, 0, null, "(0)", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "bigint", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "datetime2", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "varchar", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "varchar", 4000, 0, null, null, true, null, null, null, null, null, false);

    /**
     * BOX_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxId() { return _columnBoxId; }
    /**
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BOX_CD: {+UQ, IX, NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {NotNull, varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * LENGTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength() { return _columnLength; }
    /**
     * WIDTH: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth() { return _columnWidth; }
    /**
     * HEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight() { return _columnHeight; }
    /**
     * VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolume() { return _columnVolume; }
    /**
     * VOLUME_RATE: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVolumeRate() { return _columnVolumeRate; }
    /**
     * PERMIT_VOLUME: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPermitVolume() { return _columnPermitVolume; }
    /**
     * PERMIT_WEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPermitWeight() { return _columnPermitWeight; }
    /**
     * BOX_TYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxType() { return _columnBoxType; }
    /**
     * BXOSZL: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszl() { return _columnBxoszl; }
    /**
     * BXOSZW: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszw() { return _columnBxoszw; }
    /**
     * BXOSZH: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxoszh() { return _columnBxoszh; }
    /**
     * BXWEIGHT: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxweight() { return _columnBxweight; }
    /**
     * bxcpy: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBxcpy() { return _columnBxcpy; }
    /**
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnBoxId());
        ls.add(columnCenterId());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnLength());
        ls.add(columnWidth());
        ls.add(columnHeight());
        ls.add(columnVolume());
        ls.add(columnVolumeRate());
        ls.add(columnPermitVolume());
        ls.add(columnPermitWeight());
        ls.add(columnBoxType());
        ls.add(columnBxoszl());
        ls.add(columnBxoszw());
        ls.add(columnBxoszh());
        ls.add(columnBxweight());
        ls.add(columnBxcpy());
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
    protected UniqueInfo cpui() { return hpcpui(columnBoxId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnBoxCd());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_BOX_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MBoxList", false);
    }
    /**
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_BOX_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 1, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxGrpDbm.getInstance().columnStandardBoxId());
        return cri("M_BOX_GRP_FK1", "MBoxGrpList", this, MBoxGrpDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxGrpDtlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MBoxGrpDtlDbm.getInstance().columnBoxId());
        return cri("M_BOX_GRP_DTL_FK2", "MBoxGrpDtlList", this, MBoxGrpDtlDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierBoxList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MCarrierBoxDbm.getInstance().columnBoxId());
        return cri("M_CARRIER_BOX_FK1", "MCarrierBoxList", this, MCarrierBoxDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMParamList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), MParamDbm.getInstance().columnDefaultBoxId());
        return cri("M_PARAM_FK1", "MParamList", this, MParamDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), TPackingHDbm.getInstance().columnBoxId());
        return cri("T_PACKING_H_FK2", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), WHtShippingDbm.getInstance().columnBoxId());
        return cri("W_HT_SHIPPING_FK3", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), WSglRowShipInspHDbm.getInstance().columnBoxId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK2", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MBox");
    }
    /**
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBoxId(), WShippingInterruptDbm.getInstance().columnBoxId());
        return cri("W_SHIPPING_INTERRUPT_FK4", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MBox");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MBox"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MBoxCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MBoxBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MBox> getEntityType() { return MBox.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MBox newEntity() { return new MBox(); }
    public MBox newMyEntity() { return new MBox(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MBox)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MBox)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
