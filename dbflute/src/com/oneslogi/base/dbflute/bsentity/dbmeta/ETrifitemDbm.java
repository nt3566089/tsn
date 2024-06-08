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
 * The DB meta of E_TRIFITEM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETrifitemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETrifitemDbm _instance = new ETrifitemDbm();
    private ETrifitemDbm() {}
    public static ETrifitemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETrifitem)et).getImportkey(), (et, vl) -> ((ETrifitem)et).setImportkey(ctb(vl)), "importkey");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getSts(), (et, vl) -> ((ETrifitem)et).setSts(ctl(vl)), "sts");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getImpcheckkey(), (et, vl) -> ((ETrifitem)et).setImpcheckkey(ctb(vl)), "impcheckkey");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getItemadmin(), (et, vl) -> ((ETrifitem)et).setItemadmin((String)vl), "itemadmin");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getProductCd(), (et, vl) -> ((ETrifitem)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getItemgroup(), (et, vl) -> ((ETrifitem)et).setItemgroup((String)vl), "itemgroup");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getActflg(), (et, vl) -> ((ETrifitem)et).setActflg((String)vl), "actflg");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getInvtype(), (et, vl) -> ((ETrifitem)et).setInvtype((String)vl), "invtype");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getSetitemflg(), (et, vl) -> ((ETrifitem)et).setSetitemflg((String)vl), "setitemflg");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getName(), (et, vl) -> ((ETrifitem)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getSname(), (et, vl) -> ((ETrifitem)et).setSname((String)vl), "sname");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getAname(), (et, vl) -> ((ETrifitem)et).setAname((String)vl), "aname");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getOwneritemcd(), (et, vl) -> ((ETrifitem)et).setOwneritemcd((String)vl), "owneritemcd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getSupplieritemcd(), (et, vl) -> ((ETrifitem)et).setSupplieritemcd((String)vl), "supplieritemcd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPositemcd(), (et, vl) -> ((ETrifitem)et).setPositemcd((String)vl), "positemcd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getItfcd(), (et, vl) -> ((ETrifitem)et).setItfcd((String)vl), "itfcd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getManuitemcd(), (et, vl) -> ((ETrifitem)et).setManuitemcd((String)vl), "manuitemcd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPriceBuy(), (et, vl) -> ((ETrifitem)et).setPriceBuy((String)vl), "priceBuy");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPriceWholesale(), (et, vl) -> ((ETrifitem)et).setPriceWholesale((String)vl), "priceWholesale");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPriceSale(), (et, vl) -> ((ETrifitem)et).setPriceSale((String)vl), "priceSale");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getAbctype(), (et, vl) -> ((ETrifitem)et).setAbctype((String)vl), "abctype");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getQty1type(), (et, vl) -> ((ETrifitem)et).setQty1type((String)vl), "qty1type");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit1(), (et, vl) -> ((ETrifitem)et).setUnit1((String)vl), "unit1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit1style(), (et, vl) -> ((ETrifitem)et).setUnit1style((String)vl), "unit1style");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLength1(), (et, vl) -> ((ETrifitem)et).setLength1((String)vl), "length1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getWidth1(), (et, vl) -> ((ETrifitem)et).setWidth1((String)vl), "width1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getHeight1(), (et, vl) -> ((ETrifitem)et).setHeight1((String)vl), "height1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getGrossweight1(), (et, vl) -> ((ETrifitem)et).setGrossweight1((String)vl), "grossweight1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getNetweight1(), (et, vl) -> ((ETrifitem)et).setNetweight1((String)vl), "netweight1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getCube1(), (et, vl) -> ((ETrifitem)et).setCube1((String)vl), "cube1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLiter1(), (et, vl) -> ((ETrifitem)et).setLiter1((String)vl), "liter1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit2(), (et, vl) -> ((ETrifitem)et).setUnit2((String)vl), "unit2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit2style(), (et, vl) -> ((ETrifitem)et).setUnit2style((String)vl), "unit2style");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLength2(), (et, vl) -> ((ETrifitem)et).setLength2((String)vl), "length2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getWidth2(), (et, vl) -> ((ETrifitem)et).setWidth2((String)vl), "width2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getHeight2(), (et, vl) -> ((ETrifitem)et).setHeight2((String)vl), "height2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getGrossweight2(), (et, vl) -> ((ETrifitem)et).setGrossweight2((String)vl), "grossweight2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getNetweight2(), (et, vl) -> ((ETrifitem)et).setNetweight2((String)vl), "netweight2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getCube2(), (et, vl) -> ((ETrifitem)et).setCube2((String)vl), "cube2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLiter2(), (et, vl) -> ((ETrifitem)et).setLiter2((String)vl), "liter2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit3(), (et, vl) -> ((ETrifitem)et).setUnit3((String)vl), "unit3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUnit3style(), (et, vl) -> ((ETrifitem)et).setUnit3style((String)vl), "unit3style");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLength3(), (et, vl) -> ((ETrifitem)et).setLength3((String)vl), "length3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getWidth3(), (et, vl) -> ((ETrifitem)et).setWidth3((String)vl), "width3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getHeight3(), (et, vl) -> ((ETrifitem)et).setHeight3((String)vl), "height3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getGrossweight3(), (et, vl) -> ((ETrifitem)et).setGrossweight3((String)vl), "grossweight3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getNetweight3(), (et, vl) -> ((ETrifitem)et).setNetweight3((String)vl), "netweight3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getCube3(), (et, vl) -> ((ETrifitem)et).setCube3((String)vl), "cube3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLiter3(), (et, vl) -> ((ETrifitem)et).setLiter3((String)vl), "liter3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPQty(), (et, vl) -> ((ETrifitem)et).setPQty((String)vl), "PQty");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPHeight(), (et, vl) -> ((ETrifitem)et).setPHeight((String)vl), "PHeight");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPOdd(), (et, vl) -> ((ETrifitem)et).setPOdd((String)vl), "POdd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getNotes(), (et, vl) -> ((ETrifitem)et).setNotes((String)vl), "notes");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getFUser1(), (et, vl) -> ((ETrifitem)et).setFUser1((String)vl), "FUser1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getFUser2(), (et, vl) -> ((ETrifitem)et).setFUser2((String)vl), "FUser2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getFUser3(), (et, vl) -> ((ETrifitem)et).setFUser3((String)vl), "FUser3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getFUser4(), (et, vl) -> ((ETrifitem)et).setFUser4((String)vl), "FUser4");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getFUser5(), (et, vl) -> ((ETrifitem)et).setFUser5((String)vl), "FUser5");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPriceInsurance(), (et, vl) -> ((ETrifitem)et).setPriceInsurance((String)vl), "priceInsurance");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getLimitday(), (et, vl) -> ((ETrifitem)et).setLimitday((String)vl), "limitday");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getSuppliercd(), (et, vl) -> ((ETrifitem)et).setSuppliercd((String)vl), "suppliercd");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUseruse1(), (et, vl) -> ((ETrifitem)et).setUseruse1((String)vl), "useruse1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUseruse2(), (et, vl) -> ((ETrifitem)et).setUseruse2((String)vl), "useruse2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUseruse3(), (et, vl) -> ((ETrifitem)et).setUseruse3((String)vl), "useruse3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUseruse4(), (et, vl) -> ((ETrifitem)et).setUseruse4((String)vl), "useruse4");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUseruse5(), (et, vl) -> ((ETrifitem)et).setUseruse5((String)vl), "useruse5");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getPricelevel(), (et, vl) -> ((ETrifitem)et).setPricelevel((String)vl), "pricelevel");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getItemcatalogurl(), (et, vl) -> ((ETrifitem)et).setItemcatalogurl((String)vl), "itemcatalogurl");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUsernum1(), (et, vl) -> ((ETrifitem)et).setUsernum1((String)vl), "usernum1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUsernum2(), (et, vl) -> ((ETrifitem)et).setUsernum2((String)vl), "usernum2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUsernum3(), (et, vl) -> ((ETrifitem)et).setUsernum3((String)vl), "usernum3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUsernum4(), (et, vl) -> ((ETrifitem)et).setUsernum4((String)vl), "usernum4");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUsernum5(), (et, vl) -> ((ETrifitem)et).setUsernum5((String)vl), "usernum5");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUserdate1(), (et, vl) -> ((ETrifitem)et).setUserdate1((String)vl), "userdate1");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUserdate2(), (et, vl) -> ((ETrifitem)et).setUserdate2((String)vl), "userdate2");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUserdate3(), (et, vl) -> ((ETrifitem)et).setUserdate3((String)vl), "userdate3");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUserdate4(), (et, vl) -> ((ETrifitem)et).setUserdate4((String)vl), "userdate4");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUserdate5(), (et, vl) -> ((ETrifitem)et).setUserdate5((String)vl), "userdate5");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getDelFlg(), (et, vl) -> ((ETrifitem)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getVersionNo(), (et, vl) -> ((ETrifitem)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getControlNo(), (et, vl) -> ((ETrifitem)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getAddDt(), (et, vl) -> ((ETrifitem)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getAddUser(), (et, vl) -> ((ETrifitem)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getAddProcess(), (et, vl) -> ((ETrifitem)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUpdDt(), (et, vl) -> ((ETrifitem)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUpdUser(), (et, vl) -> ((ETrifitem)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETrifitem)et).getUpdProcess(), (et, vl) -> ((ETrifitem)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "E_TRIFITEM";
    protected final String _tableDispName = "E_TRIFITEM";
    protected final String _tablePropertyName = "ETrifitem";
    protected final TableSqlName _tableSqlName = new TableSqlName("E_TRIFITEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImportkey = cci("IMPORTKEY", "IMPORTKEY", null, null, java.math.BigDecimal.class, "importkey", null, true, false, true, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSts = cci("STS", "STS", null, null, Long.class, "sts", null, false, false, true, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImpcheckkey = cci("IMPCHECKKEY", "IMPCHECKKEY", null, null, java.math.BigDecimal.class, "impcheckkey", null, false, false, false, "decimal", 16, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemadmin = cci("ITEMADMIN", "ITEMADMIN", null, null, String.class, "itemadmin", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemgroup = cci("ITEMGROUP", "ITEMGROUP", null, null, String.class, "itemgroup", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnActflg = cci("ACTFLG", "ACTFLG", null, null, String.class, "actflg", null, false, false, false, "char", 1, 0, null, "(1)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInvtype = cci("INVTYPE", "INVTYPE", null, null, String.class, "invtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSetitemflg = cci("SETITEMFLG", "SETITEMFLG", null, null, String.class, "setitemflg", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSname = cci("SNAME", "SNAME", null, null, String.class, "sname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAname = cci("ANAME", "ANAME", null, null, String.class, "aname", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwneritemcd = cci("OWNERITEMCD", "OWNERITEMCD", null, null, String.class, "owneritemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplieritemcd = cci("SUPPLIERITEMCD", "SUPPLIERITEMCD", null, null, String.class, "supplieritemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPositemcd = cci("POSITEMCD", "POSITEMCD", null, null, String.class, "positemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItfcd = cci("ITFCD", "ITFCD", null, null, String.class, "itfcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManuitemcd = cci("MANUITEMCD", "MANUITEMCD", null, null, String.class, "manuitemcd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceBuy = cci("PRICE_BUY", "PRICE_BUY", null, null, String.class, "priceBuy", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceWholesale = cci("PRICE_WHOLESALE", "PRICE_WHOLESALE", null, null, String.class, "priceWholesale", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceSale = cci("PRICE_SALE", "PRICE_SALE", null, null, String.class, "priceSale", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAbctype = cci("ABCTYPE", "ABCTYPE", null, null, String.class, "abctype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQty1type = cci("QTY1TYPE", "QTY1TYPE", null, null, String.class, "qty1type", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1 = cci("UNIT1", "UNIT1", null, null, String.class, "unit1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit1style = cci("UNIT1STYLE", "UNIT1STYLE", null, null, String.class, "unit1style", null, false, false, false, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength1 = cci("LENGTH1", "LENGTH1", null, null, String.class, "length1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth1 = cci("WIDTH1", "WIDTH1", null, null, String.class, "width1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight1 = cci("HEIGHT1", "HEIGHT1", null, null, String.class, "height1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight1 = cci("GROSSWEIGHT1", "GROSSWEIGHT1", null, null, String.class, "grossweight1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight1 = cci("NETWEIGHT1", "NETWEIGHT1", null, null, String.class, "netweight1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube1 = cci("CUBE1", "CUBE1", null, null, String.class, "cube1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter1 = cci("LITER1", "LITER1", null, null, String.class, "liter1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2 = cci("UNIT2", "UNIT2", null, null, String.class, "unit2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit2style = cci("UNIT2STYLE", "UNIT2STYLE", null, null, String.class, "unit2style", null, false, false, false, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength2 = cci("LENGTH2", "LENGTH2", null, null, String.class, "length2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth2 = cci("WIDTH2", "WIDTH2", null, null, String.class, "width2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight2 = cci("HEIGHT2", "HEIGHT2", null, null, String.class, "height2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight2 = cci("GROSSWEIGHT2", "GROSSWEIGHT2", null, null, String.class, "grossweight2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight2 = cci("NETWEIGHT2", "NETWEIGHT2", null, null, String.class, "netweight2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube2 = cci("CUBE2", "CUBE2", null, null, String.class, "cube2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter2 = cci("LITER2", "LITER2", null, null, String.class, "liter2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit3 = cci("UNIT3", "UNIT3", null, null, String.class, "unit3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnit3style = cci("UNIT3STYLE", "UNIT3STYLE", null, null, String.class, "unit3style", null, false, false, false, "varchar", 60, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLength3 = cci("LENGTH3", "LENGTH3", null, null, String.class, "length3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWidth3 = cci("WIDTH3", "WIDTH3", null, null, String.class, "width3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeight3 = cci("HEIGHT3", "HEIGHT3", null, null, String.class, "height3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrossweight3 = cci("GROSSWEIGHT3", "GROSSWEIGHT3", null, null, String.class, "grossweight3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNetweight3 = cci("NETWEIGHT3", "NETWEIGHT3", null, null, String.class, "netweight3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCube3 = cci("CUBE3", "CUBE3", null, null, String.class, "cube3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLiter3 = cci("LITER3", "LITER3", null, null, String.class, "liter3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPQty = cci("P_QTY", "P_QTY", null, null, String.class, "PQty", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPHeight = cci("P_HEIGHT", "P_HEIGHT", null, null, String.class, "PHeight", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPOdd = cci("P_ODD", "P_ODD", null, null, String.class, "POdd", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotes = cci("NOTES", "NOTES", null, null, String.class, "notes", null, false, false, false, "varchar", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser1 = cci("F_USER1", "F_USER1", null, null, String.class, "FUser1", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser2 = cci("F_USER2", "F_USER2", null, null, String.class, "FUser2", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser3 = cci("F_USER3", "F_USER3", null, null, String.class, "FUser3", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser4 = cci("F_USER4", "F_USER4", null, null, String.class, "FUser4", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFUser5 = cci("F_USER5", "F_USER5", null, null, String.class, "FUser5", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPriceInsurance = cci("PRICE_INSURANCE", "PRICE_INSURANCE", null, null, String.class, "priceInsurance", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitday = cci("LIMITDAY", "LIMITDAY", null, null, String.class, "limitday", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuppliercd = cci("SUPPLIERCD", "SUPPLIERCD", null, null, String.class, "suppliercd", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse1 = cci("USERUSE1", "USERUSE1", null, null, String.class, "useruse1", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse2 = cci("USERUSE2", "USERUSE2", null, null, String.class, "useruse2", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse3 = cci("USERUSE3", "USERUSE3", null, null, String.class, "useruse3", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse4 = cci("USERUSE4", "USERUSE4", null, null, String.class, "useruse4", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUseruse5 = cci("USERUSE5", "USERUSE5", null, null, String.class, "useruse5", null, false, false, false, "varchar", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPricelevel = cci("PRICELEVEL", "PRICELEVEL", null, null, String.class, "pricelevel", null, false, false, false, "char", 1, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemcatalogurl = cci("ITEMCATALOGURL", "ITEMCATALOGURL", null, null, String.class, "itemcatalogurl", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum1 = cci("USERNUM1", "USERNUM1", null, null, String.class, "usernum1", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum2 = cci("USERNUM2", "USERNUM2", null, null, String.class, "usernum2", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum3 = cci("USERNUM3", "USERNUM3", null, null, String.class, "usernum3", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum4 = cci("USERNUM4", "USERNUM4", null, null, String.class, "usernum4", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsernum5 = cci("USERNUM5", "USERNUM5", null, null, String.class, "usernum5", null, false, false, false, "varchar", 30, 0, null, "(0)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate1 = cci("USERDATE1", "USERDATE1", null, null, String.class, "userdate1", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate2 = cci("USERDATE2", "USERDATE2", null, null, String.class, "userdate2", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate3 = cci("USERDATE3", "USERDATE3", null, null, String.class, "userdate3", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate4 = cci("USERDATE4", "USERDATE4", null, null, String.class, "userdate4", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserdate5 = cci("USERDATE5", "USERDATE5", null, null, String.class, "userdate5", null, false, false, false, "varchar", 30, 0, null, " ", false, null, null, null, null, null, false);
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
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportkey() { return _columnImportkey; }
    /**
     * STS: {NotNull, bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSts() { return _columnSts; }
    /**
     * IMPCHECKKEY: {decimal(16, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImpcheckkey() { return _columnImpcheckkey; }
    /**
     * ITEMADMIN: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemadmin() { return _columnItemadmin; }
    /**
     * PRODUCT_CD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * ITEMGROUP: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemgroup() { return _columnItemgroup; }
    /**
     * ACTFLG: {char(1), default=[(1)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnActflg() { return _columnActflg; }
    /**
     * INVTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInvtype() { return _columnInvtype; }
    /**
     * SETITEMFLG: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSetitemflg() { return _columnSetitemflg; }
    /**
     * NAME: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * SNAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSname() { return _columnSname; }
    /**
     * ANAME: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAname() { return _columnAname; }
    /**
     * OWNERITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwneritemcd() { return _columnOwneritemcd; }
    /**
     * SUPPLIERITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplieritemcd() { return _columnSupplieritemcd; }
    /**
     * POSITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPositemcd() { return _columnPositemcd; }
    /**
     * ITFCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItfcd() { return _columnItfcd; }
    /**
     * MANUITEMCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManuitemcd() { return _columnManuitemcd; }
    /**
     * PRICE_BUY: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceBuy() { return _columnPriceBuy; }
    /**
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceWholesale() { return _columnPriceWholesale; }
    /**
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceSale() { return _columnPriceSale; }
    /**
     * ABCTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbctype() { return _columnAbctype; }
    /**
     * QTY1TYPE: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQty1type() { return _columnQty1type; }
    /**
     * UNIT1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1() { return _columnUnit1; }
    /**
     * UNIT1STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit1style() { return _columnUnit1style; }
    /**
     * LENGTH1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength1() { return _columnLength1; }
    /**
     * WIDTH1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth1() { return _columnWidth1; }
    /**
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight1() { return _columnHeight1; }
    /**
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight1() { return _columnGrossweight1; }
    /**
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight1() { return _columnNetweight1; }
    /**
     * CUBE1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube1() { return _columnCube1; }
    /**
     * LITER1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter1() { return _columnLiter1; }
    /**
     * UNIT2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2() { return _columnUnit2; }
    /**
     * UNIT2STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit2style() { return _columnUnit2style; }
    /**
     * LENGTH2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength2() { return _columnLength2; }
    /**
     * WIDTH2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth2() { return _columnWidth2; }
    /**
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight2() { return _columnHeight2; }
    /**
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight2() { return _columnGrossweight2; }
    /**
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight2() { return _columnNetweight2; }
    /**
     * CUBE2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube2() { return _columnCube2; }
    /**
     * LITER2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter2() { return _columnLiter2; }
    /**
     * UNIT3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit3() { return _columnUnit3; }
    /**
     * UNIT3STYLE: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnit3style() { return _columnUnit3style; }
    /**
     * LENGTH3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLength3() { return _columnLength3; }
    /**
     * WIDTH3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWidth3() { return _columnWidth3; }
    /**
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeight3() { return _columnHeight3; }
    /**
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrossweight3() { return _columnGrossweight3; }
    /**
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNetweight3() { return _columnNetweight3; }
    /**
     * CUBE3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCube3() { return _columnCube3; }
    /**
     * LITER3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLiter3() { return _columnLiter3; }
    /**
     * P_QTY: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPQty() { return _columnPQty; }
    /**
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPHeight() { return _columnPHeight; }
    /**
     * P_ODD: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPOdd() { return _columnPOdd; }
    /**
     * NOTES: {varchar(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotes() { return _columnNotes; }
    /**
     * F_USER1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser1() { return _columnFUser1; }
    /**
     * F_USER2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser2() { return _columnFUser2; }
    /**
     * F_USER3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser3() { return _columnFUser3; }
    /**
     * F_USER4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser4() { return _columnFUser4; }
    /**
     * F_USER5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFUser5() { return _columnFUser5; }
    /**
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPriceInsurance() { return _columnPriceInsurance; }
    /**
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitday() { return _columnLimitday; }
    /**
     * SUPPLIERCD: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuppliercd() { return _columnSuppliercd; }
    /**
     * USERUSE1: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse1() { return _columnUseruse1; }
    /**
     * USERUSE2: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse2() { return _columnUseruse2; }
    /**
     * USERUSE3: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse3() { return _columnUseruse3; }
    /**
     * USERUSE4: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse4() { return _columnUseruse4; }
    /**
     * USERUSE5: {varchar(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUseruse5() { return _columnUseruse5; }
    /**
     * PRICELEVEL: {char(1), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPricelevel() { return _columnPricelevel; }
    /**
     * ITEMCATALOGURL: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemcatalogurl() { return _columnItemcatalogurl; }
    /**
     * USERNUM1: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum1() { return _columnUsernum1; }
    /**
     * USERNUM2: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum2() { return _columnUsernum2; }
    /**
     * USERNUM3: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum3() { return _columnUsernum3; }
    /**
     * USERNUM4: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum4() { return _columnUsernum4; }
    /**
     * USERNUM5: {varchar(30), default=[(0)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsernum5() { return _columnUsernum5; }
    /**
     * USERDATE1: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate1() { return _columnUserdate1; }
    /**
     * USERDATE2: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate2() { return _columnUserdate2; }
    /**
     * USERDATE3: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate3() { return _columnUserdate3; }
    /**
     * USERDATE4: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate4() { return _columnUserdate4; }
    /**
     * USERDATE5: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserdate5() { return _columnUserdate5; }
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
        ls.add(columnImportkey());
        ls.add(columnSts());
        ls.add(columnImpcheckkey());
        ls.add(columnItemadmin());
        ls.add(columnProductCd());
        ls.add(columnItemgroup());
        ls.add(columnActflg());
        ls.add(columnInvtype());
        ls.add(columnSetitemflg());
        ls.add(columnName());
        ls.add(columnSname());
        ls.add(columnAname());
        ls.add(columnOwneritemcd());
        ls.add(columnSupplieritemcd());
        ls.add(columnPositemcd());
        ls.add(columnItfcd());
        ls.add(columnManuitemcd());
        ls.add(columnPriceBuy());
        ls.add(columnPriceWholesale());
        ls.add(columnPriceSale());
        ls.add(columnAbctype());
        ls.add(columnQty1type());
        ls.add(columnUnit1());
        ls.add(columnUnit1style());
        ls.add(columnLength1());
        ls.add(columnWidth1());
        ls.add(columnHeight1());
        ls.add(columnGrossweight1());
        ls.add(columnNetweight1());
        ls.add(columnCube1());
        ls.add(columnLiter1());
        ls.add(columnUnit2());
        ls.add(columnUnit2style());
        ls.add(columnLength2());
        ls.add(columnWidth2());
        ls.add(columnHeight2());
        ls.add(columnGrossweight2());
        ls.add(columnNetweight2());
        ls.add(columnCube2());
        ls.add(columnLiter2());
        ls.add(columnUnit3());
        ls.add(columnUnit3style());
        ls.add(columnLength3());
        ls.add(columnWidth3());
        ls.add(columnHeight3());
        ls.add(columnGrossweight3());
        ls.add(columnNetweight3());
        ls.add(columnCube3());
        ls.add(columnLiter3());
        ls.add(columnPQty());
        ls.add(columnPHeight());
        ls.add(columnPOdd());
        ls.add(columnNotes());
        ls.add(columnFUser1());
        ls.add(columnFUser2());
        ls.add(columnFUser3());
        ls.add(columnFUser4());
        ls.add(columnFUser5());
        ls.add(columnPriceInsurance());
        ls.add(columnLimitday());
        ls.add(columnSuppliercd());
        ls.add(columnUseruse1());
        ls.add(columnUseruse2());
        ls.add(columnUseruse3());
        ls.add(columnUseruse4());
        ls.add(columnUseruse5());
        ls.add(columnPricelevel());
        ls.add(columnItemcatalogurl());
        ls.add(columnUsernum1());
        ls.add(columnUsernum2());
        ls.add(columnUsernum3());
        ls.add(columnUsernum4());
        ls.add(columnUsernum5());
        ls.add(columnUserdate1());
        ls.add(columnUserdate2());
        ls.add(columnUserdate3());
        ls.add(columnUserdate4());
        ls.add(columnUserdate5());
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
    protected UniqueInfo cpui() { return hpcpui(columnImportkey()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETrifitem"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETrifitemCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETrifitemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETrifitem> getEntityType() { return ETrifitem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETrifitem newEntity() { return new ETrifitem(); }
    public ETrifitem newMyEntity() { return new ETrifitem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETrifitem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETrifitem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
