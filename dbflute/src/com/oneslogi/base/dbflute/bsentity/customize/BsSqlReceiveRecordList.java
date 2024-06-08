package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlReceiveRecordList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SUPPLIERRCVNO, SUPPLIERCD, WAREHOUSE_CD, ITEMCD, EXPECTQTY1_SUM
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
 * String supplierrcvno = entity.getSupplierrcvno();
 * String suppliercd = entity.getSuppliercd();
 * String warehouseCd = entity.getWarehouseCd();
 * String itemcd = entity.getItemcd();
 * java.math.BigDecimal expectqty1Sum = entity.getExpectqty1Sum();
 * entity.setSupplierrcvno(supplierrcvno);
 * entity.setSuppliercd(suppliercd);
 * entity.setWarehouseCd(warehouseCd);
 * entity.setItemcd(itemcd);
 * entity.setExpectqty1Sum(expectqty1Sum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlReceiveRecordList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SUPPLIERRCVNO: {varchar(60)} */
    protected String _supplierrcvno;

    /** SUPPLIERCD: {varchar(30)} */
    protected String _suppliercd;

    /** WAREHOUSE_CD: {varchar(30)} */
    protected String _warehouseCd;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** EXPECTQTY1_SUM: {decimal(38, 6)} */
    protected java.math.BigDecimal _expectqty1Sum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlReceiveRecordListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlReceiveRecordList";
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
        if (obj instanceof BsSqlReceiveRecordList) {
            BsSqlReceiveRecordList other = (BsSqlReceiveRecordList)obj;
            if (!xSV(_supplierrcvno, other._supplierrcvno)) { return false; }
            if (!xSV(_suppliercd, other._suppliercd)) { return false; }
            if (!xSV(_warehouseCd, other._warehouseCd)) { return false; }
            if (!xSV(_itemcd, other._itemcd)) { return false; }
            if (!xSV(_expectqty1Sum, other._expectqty1Sum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _supplierrcvno);
        hs = xCH(hs, _suppliercd);
        hs = xCH(hs, _warehouseCd);
        hs = xCH(hs, _itemcd);
        hs = xCH(hs, _expectqty1Sum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_supplierrcvno));
        sb.append(dm).append(xfND(_suppliercd));
        sb.append(dm).append(xfND(_warehouseCd));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_expectqty1Sum));
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
    public SqlReceiveRecordList clone() {
        return (SqlReceiveRecordList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUPPLIERRCVNO: {varchar(60)} <br>
     * @return The value of the column 'SUPPLIERRCVNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplierrcvno() {
        checkSpecifiedProperty("supplierrcvno");
        return convertEmptyToNull(_supplierrcvno);
    }

    /**
     * [set] SUPPLIERRCVNO: {varchar(60)} <br>
     * @param supplierrcvno The value of the column 'SUPPLIERRCVNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplierrcvno(String supplierrcvno) {
        registerModifiedProperty("supplierrcvno");
        _supplierrcvno = supplierrcvno;
    }

    /**
     * [get] SUPPLIERCD: {varchar(30)} <br>
     * @return The value of the column 'SUPPLIERCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSuppliercd() {
        checkSpecifiedProperty("suppliercd");
        return convertEmptyToNull(_suppliercd);
    }

    /**
     * [set] SUPPLIERCD: {varchar(30)} <br>
     * @param suppliercd The value of the column 'SUPPLIERCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuppliercd(String suppliercd) {
        registerModifiedProperty("suppliercd");
        _suppliercd = suppliercd;
    }

    /**
     * [get] WAREHOUSE_CD: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWarehouseCd() {
        checkSpecifiedProperty("warehouseCd");
        return convertEmptyToNull(_warehouseCd);
    }

    /**
     * [set] WAREHOUSE_CD: {varchar(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWarehouseCd(String warehouseCd) {
        registerModifiedProperty("warehouseCd");
        _warehouseCd = warehouseCd;
    }

    /**
     * [get] ITEMCD: {varchar(30)} <br>
     * @return The value of the column 'ITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemcd() {
        checkSpecifiedProperty("itemcd");
        return convertEmptyToNull(_itemcd);
    }

    /**
     * [set] ITEMCD: {varchar(30)} <br>
     * @param itemcd The value of the column 'ITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemcd(String itemcd) {
        registerModifiedProperty("itemcd");
        _itemcd = itemcd;
    }

    /**
     * [get] EXPECTQTY1_SUM: {decimal(38, 6)} <br>
     * @return The value of the column 'EXPECTQTY1_SUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty1Sum() {
        checkSpecifiedProperty("expectqty1Sum");
        return _expectqty1Sum;
    }

    /**
     * [set] EXPECTQTY1_SUM: {decimal(38, 6)} <br>
     * @param expectqty1Sum The value of the column 'EXPECTQTY1_SUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1Sum(java.math.BigDecimal expectqty1Sum) {
        registerModifiedProperty("expectqty1Sum");
        _expectqty1Sum = expectqty1Sum;
    }
}
