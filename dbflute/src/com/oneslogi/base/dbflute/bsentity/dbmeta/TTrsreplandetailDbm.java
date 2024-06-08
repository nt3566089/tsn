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
 * The DB meta of T_TRSREPLANDETAIL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TTrsreplandetailDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TTrsreplandetailDbm _instance = new TTrsreplandetailDbm();
    private TTrsreplandetailDbm() {}
    public static TTrsreplandetailDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getTrsreplandetailId(), (et, vl) -> ((TTrsreplandetail)et).setTrsreplandetailId(ctl(vl)), "trsreplandetailId");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getTrsreplanId(), (et, vl) -> ((TTrsreplandetail)et).setTrsreplanId(ctl(vl)), "trsreplanId");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getRcvlineno(), (et, vl) -> ((TTrsreplandetail)et).setRcvlineno(ctl(vl)), "rcvlineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getSupplierrcvlineno(), (et, vl) -> ((TTrsreplandetail)et).setSupplierrcvlineno(ctl(vl)), "supplierrcvlineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getXdocflg(), (et, vl) -> ((TTrsreplandetail)et).setXdocflg(ctb(vl)), "xdocflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPokey(), (et, vl) -> ((TTrsreplandetail)et).setPokey(ctb(vl)), "pokey");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPolineno(), (et, vl) -> ((TTrsreplandetail)et).setPolineno(ctl(vl)), "polineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPotype(), (et, vl) -> ((TTrsreplandetail)et).setPotype((String)vl), "potype");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOwnerpono(), (et, vl) -> ((TTrsreplandetail)et).setOwnerpono((String)vl), "ownerpono");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOwnerpolineno(), (et, vl) -> ((TTrsreplandetail)et).setOwnerpolineno(ctl(vl)), "ownerpolineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOriginalpono(), (et, vl) -> ((TTrsreplandetail)et).setOriginalpono((String)vl), "originalpono");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOriginalpolineno(), (et, vl) -> ((TTrsreplandetail)et).setOriginalpolineno(ctl(vl)), "originalpolineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPodate(), (et, vl) -> ((TTrsreplandetail)et).setPodate((String)vl), "podate");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOwnercd(), (et, vl) -> ((TTrsreplandetail)et).setOwnercd((String)vl), "ownercd");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getItemadmin(), (et, vl) -> ((TTrsreplandetail)et).setItemadmin((String)vl), "itemadmin");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getProductCd(), (et, vl) -> ((TTrsreplandetail)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getIfitemcd(), (et, vl) -> ((TTrsreplandetail)et).setIfitemcd((String)vl), "ifitemcd");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLot1(), (et, vl) -> ((TTrsreplandetail)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLot2(), (et, vl) -> ((TTrsreplandetail)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLot3(), (et, vl) -> ((TTrsreplandetail)et).setLot3((String)vl), "lot3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLot4(), (et, vl) -> ((TTrsreplandetail)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLot5(), (et, vl) -> ((TTrsreplandetail)et).setLot5((String)vl), "lot5");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOtherlot1(), (et, vl) -> ((TTrsreplandetail)et).setOtherlot1((String)vl), "otherlot1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOtherlot2(), (et, vl) -> ((TTrsreplandetail)et).setOtherlot2((String)vl), "otherlot2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOtherlot3(), (et, vl) -> ((TTrsreplandetail)et).setOtherlot3((String)vl), "otherlot3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOtherlot4(), (et, vl) -> ((TTrsreplandetail)et).setOtherlot4((String)vl), "otherlot4");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOtherlot5(), (et, vl) -> ((TTrsreplandetail)et).setOtherlot5(ctb(vl)), "otherlot5");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getDamageflg(), (et, vl) -> ((TTrsreplandetail)et).setDamageflg(ctb(vl)), "damageflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getNoshippingflg(), (et, vl) -> ((TTrsreplandetail)et).setNoshippingflg(ctb(vl)), "noshippingflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getForeigncargoflg(), (et, vl) -> ((TTrsreplandetail)et).setForeigncargoflg(ctb(vl)), "foreigncargoflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getCustomsreleaseflg(), (et, vl) -> ((TTrsreplandetail)et).setCustomsreleaseflg(ctb(vl)), "customsreleaseflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getTaxflg(), (et, vl) -> ((TTrsreplandetail)et).setTaxflg(ctb(vl)), "taxflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getExpectqty1(), (et, vl) -> ((TTrsreplandetail)et).setExpectqty1(ctb(vl)), "expectqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getExpectqty2(), (et, vl) -> ((TTrsreplandetail)et).setExpectqty2(ctl(vl)), "expectqty2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getExpectqty3(), (et, vl) -> ((TTrsreplandetail)et).setExpectqty3(ctl(vl)), "expectqty3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getReceivedqty1(), (et, vl) -> ((TTrsreplandetail)et).setReceivedqty1(ctb(vl)), "receivedqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getReceivedqty2(), (et, vl) -> ((TTrsreplandetail)et).setReceivedqty2(ctl(vl)), "receivedqty2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getReceivedqty3(), (et, vl) -> ((TTrsreplandetail)et).setReceivedqty3(ctl(vl)), "receivedqty3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAdjustqty1(), (et, vl) -> ((TTrsreplandetail)et).setAdjustqty1(ctb(vl)), "adjustqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAdjustqty2(), (et, vl) -> ((TTrsreplandetail)et).setAdjustqty2(ctl(vl)), "adjustqty2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAdjustqty3(), (et, vl) -> ((TTrsreplandetail)et).setAdjustqty3(ctl(vl)), "adjustqty3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getRcvtagqty1(), (et, vl) -> ((TTrsreplandetail)et).setRcvtagqty1(ctb(vl)), "rcvtagqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getXdocfreeqty1(), (et, vl) -> ((TTrsreplandetail)et).setXdocfreeqty1(ctb(vl)), "xdocfreeqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getInspectedqty1(), (et, vl) -> ((TTrsreplandetail)et).setInspectedqty1(ctb(vl)), "inspectedqty1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getInspectedqty2(), (et, vl) -> ((TTrsreplandetail)et).setInspectedqty2(ctl(vl)), "inspectedqty2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getInspectedqty3(), (et, vl) -> ((TTrsreplandetail)et).setInspectedqty3(ctl(vl)), "inspectedqty3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPriceBuy(), (et, vl) -> ((TTrsreplandetail)et).setPriceBuy(ctl(vl)), "priceBuy");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPriceWholesale(), (et, vl) -> ((TTrsreplandetail)et).setPriceWholesale(ctl(vl)), "priceWholesale");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getPriceSale(), (et, vl) -> ((TTrsreplandetail)et).setPriceSale(ctl(vl)), "priceSale");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getNotes(), (et, vl) -> ((TTrsreplandetail)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getIcdate(), (et, vl) -> ((TTrsreplandetail)et).setIcdate((String)vl), "icdate");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOrderkey(), (et, vl) -> ((TTrsreplandetail)et).setOrderkey(ctb(vl)), "orderkey");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOrderlineno(), (et, vl) -> ((TTrsreplandetail)et).setOrderlineno(ctl(vl)), "orderlineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOwnerorderno(), (et, vl) -> ((TTrsreplandetail)et).setOwnerorderno((String)vl), "ownerorderno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOwnerorderlineno(), (et, vl) -> ((TTrsreplandetail)et).setOwnerorderlineno(ctl(vl)), "ownerorderlineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getCustorderno(), (et, vl) -> ((TTrsreplandetail)et).setCustorderno((String)vl), "custorderno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getCustorderlineno(), (et, vl) -> ((TTrsreplandetail)et).setCustorderlineno(ctl(vl)), "custorderlineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getOrdertype(), (et, vl) -> ((TTrsreplandetail)et).setOrdertype((String)vl), "ordertype");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getRcvqtyerrorflg(), (et, vl) -> ((TTrsreplandetail)et).setRcvqtyerrorflg(ctb(vl)), "rcvqtyerrorflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLogicflg1(), (et, vl) -> ((TTrsreplandetail)et).setLogicflg1(ctb(vl)), "logicflg1");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLogicflg2(), (et, vl) -> ((TTrsreplandetail)et).setLogicflg2(ctb(vl)), "logicflg2");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getLogicflg3(), (et, vl) -> ((TTrsreplandetail)et).setLogicflg3(ctb(vl)), "logicflg3");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getMovelineno(), (et, vl) -> ((TTrsreplandetail)et).setMovelineno(ctl(vl)), "movelineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAssylineno(), (et, vl) -> ((TTrsreplandetail)et).setAssylineno(ctl(vl)), "assylineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getProducelineno(), (et, vl) -> ((TTrsreplandetail)et).setProducelineno(ctl(vl)), "producelineno");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getChecklastlotflg(), (et, vl) -> ((TTrsreplandetail)et).setChecklastlotflg(ctb(vl)), "checklastlotflg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getCenterId(), (et, vl) -> ((TTrsreplandetail)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getClientId(), (et, vl) -> ((TTrsreplandetail)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getDelFlg(), (et, vl) -> ((TTrsreplandetail)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getVersionNo(), (et, vl) -> ((TTrsreplandetail)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getControlNo(), (et, vl) -> ((TTrsreplandetail)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAddDt(), (et, vl) -> ((TTrsreplandetail)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAddUser(), (et, vl) -> ((TTrsreplandetail)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getAddProcess(), (et, vl) -> ((TTrsreplandetail)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getUpdDt(), (et, vl) -> ((TTrsreplandetail)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getUpdUser(), (et, vl) -> ((TTrsreplandetail)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TTrsreplandetail)et).getUpdProcess(), (et, vl) -> ((TTrsreplandetail)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "T_TRSREPLANDETAIL";
    protected final String _tableDispName = "T_TRSREPLANDETAIL";
    protected final String _tablePropertyName = "TTrsreplandetail";
    protected final TableSqlName _tableSqlName = new TableSqlName("T_TRSREPLANDETAIL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTrsreplandetailId = cci("TRSREPLANDETAIL_ID", "TRSREPLANDETAIL_ID", null, null, Long.class, "trsreplandetailId", null, true, true, true, "bigint identity", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrsreplanId = cci("TRSREPLAN_ID", "TRSREPLAN_ID", null, null, Long.class, "trsreplanId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvlineno = cci("RCVLINENO", "RCVLINENO", null, null, Long.class, "rcvlineno", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierrcvlineno = cci("SUPPLIERRCVLINENO", "SUPPLIERRCVLINENO", null, null, Long.class, "supplierrcvlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnXdocflg = cci("XDOCFLG", "XDOCFLG", null, null, java.math.BigDecimal.class, "xdocflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPokey = cci("POKEY", "POKEY", null, null, java.math.BigDecimal.class, "pokey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPolineno = cci("POLINENO", "POLINENO", null, null, Long.class, "polineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPotype = cci("POTYPE", "POTYPE", null, null, String.class, "potype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerpono = cci("OWNERPONO", "OWNERPONO", null, null, String.class, "ownerpono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerpolineno = cci("OWNERPOLINENO", "OWNERPOLINENO", null, null, Long.class, "ownerpolineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalpono = cci("ORIGINALPONO", "ORIGINALPONO", null, null, String.class, "originalpono", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOriginalpolineno = cci("ORIGINALPOLINENO", "ORIGINALPOLINENO", null, null, Long.class, "originalpolineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPodate = cci("PODATE", "PODATE", null, null, String.class, "podate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnercd = cci("OWNERCD", "OWNERCD", null, null, String.class, "ownercd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemadmin = cci("ITEMADMIN", "ITEMADMIN", null, null, String.class, "itemadmin", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfitemcd = cci("IFITEMCD", "IFITEMCD", null, null, String.class, "ifitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot3 = cci("LOT3", "LOT3", null, null, String.class, "lot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot5 = cci("LOT5", "LOT5", null, null, String.class, "lot5", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot1 = cci("OTHERLOT1", "OTHERLOT1", null, null, String.class, "otherlot1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot2 = cci("OTHERLOT2", "OTHERLOT2", null, null, String.class, "otherlot2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot3 = cci("OTHERLOT3", "OTHERLOT3", null, null, String.class, "otherlot3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot4 = cci("OTHERLOT4", "OTHERLOT4", null, null, String.class, "otherlot4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOtherlot5 = cci("OTHERLOT5", "OTHERLOT5", null, null, java.math.BigDecimal.class, "otherlot5", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDamageflg = cci("DAMAGEFLG", "DAMAGEFLG", null, null, java.math.BigDecimal.class, "damageflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNoshippingflg = cci("NOSHIPPINGFLG", "NOSHIPPINGFLG", null, null, java.math.BigDecimal.class, "noshippingflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeigncargoflg = cci("FOREIGNCARGOFLG", "FOREIGNCARGOFLG", null, null, java.math.BigDecimal.class, "foreigncargoflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomsreleaseflg = cci("CUSTOMSRELEASEFLG", "CUSTOMSRELEASEFLG", null, null, java.math.BigDecimal.class, "customsreleaseflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxflg = cci("TAXFLG", "TAXFLG", null, null, java.math.BigDecimal.class, "taxflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty1 = cci("EXPECTQTY1", "EXPECTQTY1", null, null, java.math.BigDecimal.class, "expectqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty2 = cci("EXPECTQTY2", "EXPECTQTY2", null, null, Long.class, "expectqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpectqty3 = cci("EXPECTQTY3", "EXPECTQTY3", null, null, Long.class, "expectqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty1 = cci("RECEIVEDQTY1", "RECEIVEDQTY1", null, null, java.math.BigDecimal.class, "receivedqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty2 = cci("RECEIVEDQTY2", "RECEIVEDQTY2", null, null, Long.class, "receivedqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivedqty3 = cci("RECEIVEDQTY3", "RECEIVEDQTY3", null, null, Long.class, "receivedqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustqty1 = cci("ADJUSTQTY1", "ADJUSTQTY1", null, null, java.math.BigDecimal.class, "adjustqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustqty2 = cci("ADJUSTQTY2", "ADJUSTQTY2", null, null, Long.class, "adjustqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustqty3 = cci("ADJUSTQTY3", "ADJUSTQTY3", null, null, Long.class, "adjustqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvtagqty1 = cci("RCVTAGQTY1", "RCVTAGQTY1", null, null, java.math.BigDecimal.class, "rcvtagqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnXdocfreeqty1 = cci("XDOCFREEQTY1", "XDOCFREEQTY1", null, null, java.math.BigDecimal.class, "xdocfreeqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty1 = cci("INSPECTEDQTY1", "INSPECTEDQTY1", null, null, java.math.BigDecimal.class, "inspectedqty1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty2 = cci("INSPECTEDQTY2", "INSPECTEDQTY2", null, null, Long.class, "inspectedqty2", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInspectedqty3 = cci("INSPECTEDQTY3", "INSPECTEDQTY3", null, null, Long.class, "inspectedqty3", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceBuy = cci("PRICE_BUY", "PRICE_BUY", null, null, Long.class, "priceBuy", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceWholesale = cci("PRICE_WHOLESALE", "PRICE_WHOLESALE", null, null, Long.class, "priceWholesale", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceSale = cci("PRICE_SALE", "PRICE_SALE", null, null, Long.class, "priceSale", null, false, false, true, "bigint", 19, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIcdate = cci("ICDATE", "ICDATE", null, null, String.class, "icdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderkey = cci("ORDERKEY", "ORDERKEY", null, null, java.math.BigDecimal.class, "orderkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderlineno = cci("ORDERLINENO", "ORDERLINENO", null, null, Long.class, "orderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderno = cci("OWNERORDERNO", "OWNERORDERNO", null, null, String.class, "ownerorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerorderlineno = cci("OWNERORDERLINENO", "OWNERORDERLINENO", null, null, Long.class, "ownerorderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderno = cci("CUSTORDERNO", "CUSTORDERNO", null, null, String.class, "custorderno", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustorderlineno = cci("CUSTORDERLINENO", "CUSTORDERLINENO", null, null, Long.class, "custorderlineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrdertype = cci("ORDERTYPE", "ORDERTYPE", null, null, String.class, "ordertype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRcvqtyerrorflg = cci("RCVQTYERRORFLG", "RCVQTYERRORFLG", null, null, java.math.BigDecimal.class, "rcvqtyerrorflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg1 = cci("LOGICFLG1", "LOGICFLG1", null, null, java.math.BigDecimal.class, "logicflg1", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg2 = cci("LOGICFLG2", "LOGICFLG2", null, null, java.math.BigDecimal.class, "logicflg2", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogicflg3 = cci("LOGICFLG3", "LOGICFLG3", null, null, java.math.BigDecimal.class, "logicflg3", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMovelineno = cci("MOVELINENO", "MOVELINENO", null, null, Long.class, "movelineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAssylineno = cci("ASSYLINENO", "ASSYLINENO", null, null, Long.class, "assylineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProducelineno = cci("PRODUCELINENO", "PRODUCELINENO", null, null, Long.class, "producelineno", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChecklastlotflg = cci("CHECKLASTLOTFLG", "CHECKLASTLOTFLG", null, null, java.math.BigDecimal.class, "checklastlotflg", null, false, false, true, "decimal", 16, 6, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsreplandetailId() { return _columnTrsreplandetailId; }
    /**
     * TRSREPLAN_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrsreplanId() { return _columnTrsreplanId; }
    /**
     * RCVLINENO: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvlineno() { return _columnRcvlineno; }
    /**
     * SUPPLIERRCVLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierrcvlineno() { return _columnSupplierrcvlineno; }
    /**
     * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnXdocflg() { return _columnXdocflg; }
    /**
     * POKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPokey() { return _columnPokey; }
    /**
     * POLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPolineno() { return _columnPolineno; }
    /**
     * POTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPotype() { return _columnPotype; }
    /**
     * OWNERPONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerpono() { return _columnOwnerpono; }
    /**
     * OWNERPOLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerpolineno() { return _columnOwnerpolineno; }
    /**
     * ORIGINALPONO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalpono() { return _columnOriginalpono; }
    /**
     * ORIGINALPOLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOriginalpolineno() { return _columnOriginalpolineno; }
    /**
     * PODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPodate() { return _columnPodate; }
    /**
     * OWNERCD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnercd() { return _columnOwnercd; }
    /**
     * ITEMADMIN: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemadmin() { return _columnItemadmin; }
    /**
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * IFITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfitemcd() { return _columnIfitemcd; }
    /**
     * LOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * LOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot3() { return _columnLot3; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT5: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot5() { return _columnLot5; }
    /**
     * OTHERLOT1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot1() { return _columnOtherlot1; }
    /**
     * OTHERLOT2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot2() { return _columnOtherlot2; }
    /**
     * OTHERLOT3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot3() { return _columnOtherlot3; }
    /**
     * OTHERLOT4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot4() { return _columnOtherlot4; }
    /**
     * OTHERLOT5: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOtherlot5() { return _columnOtherlot5; }
    /**
     * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDamageflg() { return _columnDamageflg; }
    /**
     * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoshippingflg() { return _columnNoshippingflg; }
    /**
     * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeigncargoflg() { return _columnForeigncargoflg; }
    /**
     * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomsreleaseflg() { return _columnCustomsreleaseflg; }
    /**
     * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxflg() { return _columnTaxflg; }
    /**
     * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty1() { return _columnExpectqty1; }
    /**
     * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty2() { return _columnExpectqty2; }
    /**
     * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpectqty3() { return _columnExpectqty3; }
    /**
     * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty1() { return _columnReceivedqty1; }
    /**
     * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty2() { return _columnReceivedqty2; }
    /**
     * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivedqty3() { return _columnReceivedqty3; }
    /**
     * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustqty1() { return _columnAdjustqty1; }
    /**
     * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustqty2() { return _columnAdjustqty2; }
    /**
     * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustqty3() { return _columnAdjustqty3; }
    /**
     * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvtagqty1() { return _columnRcvtagqty1; }
    /**
     * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnXdocfreeqty1() { return _columnXdocfreeqty1; }
    /**
     * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty1() { return _columnInspectedqty1; }
    /**
     * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty2() { return _columnInspectedqty2; }
    /**
     * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInspectedqty3() { return _columnInspectedqty3; }
    /**
     * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceBuy() { return _columnPriceBuy; }
    /**
     * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceWholesale() { return _columnPriceWholesale; }
    /**
     * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceSale() { return _columnPriceSale; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * ICDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIcdate() { return _columnIcdate; }
    /**
     * ORDERKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderkey() { return _columnOrderkey; }
    /**
     * ORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderlineno() { return _columnOrderlineno; }
    /**
     * OWNERORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderno() { return _columnOwnerorderno; }
    /**
     * OWNERORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerorderlineno() { return _columnOwnerorderlineno; }
    /**
     * CUSTORDERNO: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderno() { return _columnCustorderno; }
    /**
     * CUSTORDERLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustorderlineno() { return _columnCustorderlineno; }
    /**
     * ORDERTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrdertype() { return _columnOrdertype; }
    /**
     * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvqtyerrorflg() { return _columnRcvqtyerrorflg; }
    /**
     * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg1() { return _columnLogicflg1; }
    /**
     * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg2() { return _columnLogicflg2; }
    /**
     * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogicflg3() { return _columnLogicflg3; }
    /**
     * MOVELINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMovelineno() { return _columnMovelineno; }
    /**
     * ASSYLINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssylineno() { return _columnAssylineno; }
    /**
     * PRODUCELINENO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProducelineno() { return _columnProducelineno; }
    /**
     * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChecklastlotflg() { return _columnChecklastlotflg; }
    /**
     * CENTER_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
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
        ls.add(columnTrsreplandetailId());
        ls.add(columnTrsreplanId());
        ls.add(columnRcvlineno());
        ls.add(columnSupplierrcvlineno());
        ls.add(columnXdocflg());
        ls.add(columnPokey());
        ls.add(columnPolineno());
        ls.add(columnPotype());
        ls.add(columnOwnerpono());
        ls.add(columnOwnerpolineno());
        ls.add(columnOriginalpono());
        ls.add(columnOriginalpolineno());
        ls.add(columnPodate());
        ls.add(columnOwnercd());
        ls.add(columnItemadmin());
        ls.add(columnProductCd());
        ls.add(columnIfitemcd());
        ls.add(columnLot1());
        ls.add(columnLot2());
        ls.add(columnLot3());
        ls.add(columnLot4());
        ls.add(columnLot5());
        ls.add(columnOtherlot1());
        ls.add(columnOtherlot2());
        ls.add(columnOtherlot3());
        ls.add(columnOtherlot4());
        ls.add(columnOtherlot5());
        ls.add(columnDamageflg());
        ls.add(columnNoshippingflg());
        ls.add(columnForeigncargoflg());
        ls.add(columnCustomsreleaseflg());
        ls.add(columnTaxflg());
        ls.add(columnExpectqty1());
        ls.add(columnExpectqty2());
        ls.add(columnExpectqty3());
        ls.add(columnReceivedqty1());
        ls.add(columnReceivedqty2());
        ls.add(columnReceivedqty3());
        ls.add(columnAdjustqty1());
        ls.add(columnAdjustqty2());
        ls.add(columnAdjustqty3());
        ls.add(columnRcvtagqty1());
        ls.add(columnXdocfreeqty1());
        ls.add(columnInspectedqty1());
        ls.add(columnInspectedqty2());
        ls.add(columnInspectedqty3());
        ls.add(columnPriceBuy());
        ls.add(columnPriceWholesale());
        ls.add(columnPriceSale());
        ls.add(columnNotes());
        ls.add(columnIcdate());
        ls.add(columnOrderkey());
        ls.add(columnOrderlineno());
        ls.add(columnOwnerorderno());
        ls.add(columnOwnerorderlineno());
        ls.add(columnCustorderno());
        ls.add(columnCustorderlineno());
        ls.add(columnOrdertype());
        ls.add(columnRcvqtyerrorflg());
        ls.add(columnLogicflg1());
        ls.add(columnLogicflg2());
        ls.add(columnLogicflg3());
        ls.add(columnMovelineno());
        ls.add(columnAssylineno());
        ls.add(columnProducelineno());
        ls.add(columnChecklastlotflg());
        ls.add(columnCenterId());
        ls.add(columnClientId());
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
    protected UniqueInfo cpui() { return hpcpui(columnTrsreplandetailId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TTrsreplandetail"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TTrsreplandetailCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TTrsreplandetailBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TTrsreplandetail> getEntityType() { return TTrsreplandetail.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TTrsreplandetail newEntity() { return new TTrsreplandetail(); }
    public TTrsreplandetail newMyEntity() { return new TTrsreplandetail(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TTrsreplandetail)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TTrsreplandetail)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
