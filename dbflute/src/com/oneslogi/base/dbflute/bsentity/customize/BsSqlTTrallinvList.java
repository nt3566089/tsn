package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTTrallinvList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, EXECUTEDATE, INOUTKBN, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, YDAYTLEQULYTMPLOCINV, YDAYTLEQULYAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, TDAYEQYTMPLOCINV, TDAYEQYAUTOINV, CAPITEMFLG, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * Long trallinvId = entity.getTrallinvId();
 * Long centerId = entity.getCenterId();
 * Long clientId = entity.getClientId();
 * String executedate = entity.getExecutedate();
 * String inoutkbn = entity.getInoutkbn();
 * java.math.BigDecimal sysinvtotalinv = entity.getSysinvtotalinv();
 * java.math.BigDecimal sysinvkeeplocinv = entity.getSysinvkeeplocinv();
 * java.math.BigDecimal sysinvreceivelocinv = entity.getSysinvreceivelocinv();
 * java.math.BigDecimal sysinvdamageitem = entity.getSysinvdamageitem();
 * java.math.BigDecimal sysinvclssifylocinv = entity.getSysinvclssifylocinv();
 * java.math.BigDecimal sysinvtmplocinv = entity.getSysinvtmplocinv();
 * java.math.BigDecimal sysinvautoinv = entity.getSysinvautoinv();
 * java.math.BigDecimal investtotalinv = entity.getInvesttotalinv();
 * java.math.BigDecimal investkeeplocinv = entity.getInvestkeeplocinv();
 * java.math.BigDecimal investreceivelocinv = entity.getInvestreceivelocinv();
 * java.math.BigDecimal investdamageitem = entity.getInvestdamageitem();
 * java.math.BigDecimal investclssifylocinv = entity.getInvestclssifylocinv();
 * java.math.BigDecimal investtmplocinv = entity.getInvesttmplocinv();
 * java.math.BigDecimal investautoinv = entity.getInvestautoinv();
 * java.math.BigDecimal ydaytlequlytotalinv = entity.getYdaytlequlytotalinv();
 * java.math.BigDecimal ydaytlequlykeeplocinv = entity.getYdaytlequlykeeplocinv();
 * java.math.BigDecimal ydaytlequlyreceivelocinv = entity.getYdaytlequlyreceivelocinv();
 * java.math.BigDecimal ydaytlequlydamageitem = entity.getYdaytlequlydamageitem();
 * java.math.BigDecimal ydaytlequlyclssifylocinv = entity.getYdaytlequlyclssifylocinv();
 * java.math.BigDecimal ydaytlequlytmplocinv = entity.getYdaytlequlytmplocinv();
 * java.math.BigDecimal ydaytlequlyautoinv = entity.getYdaytlequlyautoinv();
 * java.math.BigDecimal tdayeqytotalinv = entity.getTdayeqytotalinv();
 * java.math.BigDecimal tdayeqykeeplocinv = entity.getTdayeqykeeplocinv();
 * java.math.BigDecimal tdayeqyreceivelocinv = entity.getTdayeqyreceivelocinv();
 * java.math.BigDecimal tdayeqydamageitem = entity.getTdayeqydamageitem();
 * java.math.BigDecimal tdayeqyclssifylocinv = entity.getTdayeqyclssifylocinv();
 * java.math.BigDecimal tdayeqytmplocinv = entity.getTdayeqytmplocinv();
 * java.math.BigDecimal tdayeqyautoinv = entity.getTdayeqyautoinv();
 * Long capitemflg = entity.getCapitemflg();
 * Long productId = entity.getProductId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setTrallinvId(trallinvId);
 * entity.setCenterId(centerId);
 * entity.setClientId(clientId);
 * entity.setExecutedate(executedate);
 * entity.setInoutkbn(inoutkbn);
 * entity.setSysinvtotalinv(sysinvtotalinv);
 * entity.setSysinvkeeplocinv(sysinvkeeplocinv);
 * entity.setSysinvreceivelocinv(sysinvreceivelocinv);
 * entity.setSysinvdamageitem(sysinvdamageitem);
 * entity.setSysinvclssifylocinv(sysinvclssifylocinv);
 * entity.setSysinvtmplocinv(sysinvtmplocinv);
 * entity.setSysinvautoinv(sysinvautoinv);
 * entity.setInvesttotalinv(investtotalinv);
 * entity.setInvestkeeplocinv(investkeeplocinv);
 * entity.setInvestreceivelocinv(investreceivelocinv);
 * entity.setInvestdamageitem(investdamageitem);
 * entity.setInvestclssifylocinv(investclssifylocinv);
 * entity.setInvesttmplocinv(investtmplocinv);
 * entity.setInvestautoinv(investautoinv);
 * entity.setYdaytlequlytotalinv(ydaytlequlytotalinv);
 * entity.setYdaytlequlykeeplocinv(ydaytlequlykeeplocinv);
 * entity.setYdaytlequlyreceivelocinv(ydaytlequlyreceivelocinv);
 * entity.setYdaytlequlydamageitem(ydaytlequlydamageitem);
 * entity.setYdaytlequlyclssifylocinv(ydaytlequlyclssifylocinv);
 * entity.setYdaytlequlytmplocinv(ydaytlequlytmplocinv);
 * entity.setYdaytlequlyautoinv(ydaytlequlyautoinv);
 * entity.setTdayeqytotalinv(tdayeqytotalinv);
 * entity.setTdayeqykeeplocinv(tdayeqykeeplocinv);
 * entity.setTdayeqyreceivelocinv(tdayeqyreceivelocinv);
 * entity.setTdayeqydamageitem(tdayeqydamageitem);
 * entity.setTdayeqyclssifylocinv(tdayeqyclssifylocinv);
 * entity.setTdayeqytmplocinv(tdayeqytmplocinv);
 * entity.setTdayeqyautoinv(tdayeqyautoinv);
 * entity.setCapitemflg(capitemflg);
 * entity.setProductId(productId);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTTrallinvList extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRALLINV_ID: {bigint(19)} */
    protected Long _trallinvId;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** EXECUTEDATE: {varchar(8)} */
    protected String _executedate;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvtotalinv;

    /** SYSINVKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvkeeplocinv;

    /** SYSINVRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvreceivelocinv;

    /** SYSINVDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvdamageitem;

    /** SYSINVCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvclssifylocinv;

    /** SYSINVTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvtmplocinv;

    /** SYSINVAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvautoinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investautoinv;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlykeeplocinv;

    /** YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlyreceivelocinv;

    /** YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlydamageitem;

    /** YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlyclssifylocinv;

    /** YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlytmplocinv;

    /** YDAYTLEQULYAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlyautoinv;

    /** TDAYEQYTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqytotalinv;

    /** TDAYEQYKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqykeeplocinv;

    /** TDAYEQYRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqyreceivelocinv;

    /** TDAYEQYDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqydamageitem;

    /** TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqyclssifylocinv;

    /** TDAYEQYTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqytmplocinv;

    /** TDAYEQYAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _tdayeqyautoinv;

    /** CAPITEMFLG: {bigint(19)} */
    protected Long _capitemflg;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** DEL_FLG: {char(1), classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTTrallinvListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTTrallinvList";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {char(1), classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlTTrallinvList) {
            BsSqlTTrallinvList other = (BsSqlTTrallinvList)obj;
            if (!xSV(_trallinvId, other._trallinvId)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_executedate, other._executedate)) { return false; }
            if (!xSV(_inoutkbn, other._inoutkbn)) { return false; }
            if (!xSV(_sysinvtotalinv, other._sysinvtotalinv)) { return false; }
            if (!xSV(_sysinvkeeplocinv, other._sysinvkeeplocinv)) { return false; }
            if (!xSV(_sysinvreceivelocinv, other._sysinvreceivelocinv)) { return false; }
            if (!xSV(_sysinvdamageitem, other._sysinvdamageitem)) { return false; }
            if (!xSV(_sysinvclssifylocinv, other._sysinvclssifylocinv)) { return false; }
            if (!xSV(_sysinvtmplocinv, other._sysinvtmplocinv)) { return false; }
            if (!xSV(_sysinvautoinv, other._sysinvautoinv)) { return false; }
            if (!xSV(_investtotalinv, other._investtotalinv)) { return false; }
            if (!xSV(_investkeeplocinv, other._investkeeplocinv)) { return false; }
            if (!xSV(_investreceivelocinv, other._investreceivelocinv)) { return false; }
            if (!xSV(_investdamageitem, other._investdamageitem)) { return false; }
            if (!xSV(_investclssifylocinv, other._investclssifylocinv)) { return false; }
            if (!xSV(_investtmplocinv, other._investtmplocinv)) { return false; }
            if (!xSV(_investautoinv, other._investautoinv)) { return false; }
            if (!xSV(_ydaytlequlytotalinv, other._ydaytlequlytotalinv)) { return false; }
            if (!xSV(_ydaytlequlykeeplocinv, other._ydaytlequlykeeplocinv)) { return false; }
            if (!xSV(_ydaytlequlyreceivelocinv, other._ydaytlequlyreceivelocinv)) { return false; }
            if (!xSV(_ydaytlequlydamageitem, other._ydaytlequlydamageitem)) { return false; }
            if (!xSV(_ydaytlequlyclssifylocinv, other._ydaytlequlyclssifylocinv)) { return false; }
            if (!xSV(_ydaytlequlytmplocinv, other._ydaytlequlytmplocinv)) { return false; }
            if (!xSV(_ydaytlequlyautoinv, other._ydaytlequlyautoinv)) { return false; }
            if (!xSV(_tdayeqytotalinv, other._tdayeqytotalinv)) { return false; }
            if (!xSV(_tdayeqykeeplocinv, other._tdayeqykeeplocinv)) { return false; }
            if (!xSV(_tdayeqyreceivelocinv, other._tdayeqyreceivelocinv)) { return false; }
            if (!xSV(_tdayeqydamageitem, other._tdayeqydamageitem)) { return false; }
            if (!xSV(_tdayeqyclssifylocinv, other._tdayeqyclssifylocinv)) { return false; }
            if (!xSV(_tdayeqytmplocinv, other._tdayeqytmplocinv)) { return false; }
            if (!xSV(_tdayeqyautoinv, other._tdayeqyautoinv)) { return false; }
            if (!xSV(_capitemflg, other._capitemflg)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_delFlg, other._delFlg)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_controlNo, other._controlNo)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_addUser, other._addUser)) { return false; }
            if (!xSV(_addProcess, other._addProcess)) { return false; }
            if (!xSV(_updDt, other._updDt)) { return false; }
            if (!xSV(_updUser, other._updUser)) { return false; }
            if (!xSV(_updProcess, other._updProcess)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trallinvId);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _executedate);
        hs = xCH(hs, _inoutkbn);
        hs = xCH(hs, _sysinvtotalinv);
        hs = xCH(hs, _sysinvkeeplocinv);
        hs = xCH(hs, _sysinvreceivelocinv);
        hs = xCH(hs, _sysinvdamageitem);
        hs = xCH(hs, _sysinvclssifylocinv);
        hs = xCH(hs, _sysinvtmplocinv);
        hs = xCH(hs, _sysinvautoinv);
        hs = xCH(hs, _investtotalinv);
        hs = xCH(hs, _investkeeplocinv);
        hs = xCH(hs, _investreceivelocinv);
        hs = xCH(hs, _investdamageitem);
        hs = xCH(hs, _investclssifylocinv);
        hs = xCH(hs, _investtmplocinv);
        hs = xCH(hs, _investautoinv);
        hs = xCH(hs, _ydaytlequlytotalinv);
        hs = xCH(hs, _ydaytlequlykeeplocinv);
        hs = xCH(hs, _ydaytlequlyreceivelocinv);
        hs = xCH(hs, _ydaytlequlydamageitem);
        hs = xCH(hs, _ydaytlequlyclssifylocinv);
        hs = xCH(hs, _ydaytlequlytmplocinv);
        hs = xCH(hs, _ydaytlequlyautoinv);
        hs = xCH(hs, _tdayeqytotalinv);
        hs = xCH(hs, _tdayeqykeeplocinv);
        hs = xCH(hs, _tdayeqyreceivelocinv);
        hs = xCH(hs, _tdayeqydamageitem);
        hs = xCH(hs, _tdayeqyclssifylocinv);
        hs = xCH(hs, _tdayeqytmplocinv);
        hs = xCH(hs, _tdayeqyautoinv);
        hs = xCH(hs, _capitemflg);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _delFlg);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _controlNo);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _addUser);
        hs = xCH(hs, _addProcess);
        hs = xCH(hs, _updDt);
        hs = xCH(hs, _updUser);
        hs = xCH(hs, _updProcess);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trallinvId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_executedate));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_sysinvtotalinv));
        sb.append(dm).append(xfND(_sysinvkeeplocinv));
        sb.append(dm).append(xfND(_sysinvreceivelocinv));
        sb.append(dm).append(xfND(_sysinvdamageitem));
        sb.append(dm).append(xfND(_sysinvclssifylocinv));
        sb.append(dm).append(xfND(_sysinvtmplocinv));
        sb.append(dm).append(xfND(_sysinvautoinv));
        sb.append(dm).append(xfND(_investtotalinv));
        sb.append(dm).append(xfND(_investkeeplocinv));
        sb.append(dm).append(xfND(_investreceivelocinv));
        sb.append(dm).append(xfND(_investdamageitem));
        sb.append(dm).append(xfND(_investclssifylocinv));
        sb.append(dm).append(xfND(_investtmplocinv));
        sb.append(dm).append(xfND(_investautoinv));
        sb.append(dm).append(xfND(_ydaytlequlytotalinv));
        sb.append(dm).append(xfND(_ydaytlequlykeeplocinv));
        sb.append(dm).append(xfND(_ydaytlequlyreceivelocinv));
        sb.append(dm).append(xfND(_ydaytlequlydamageitem));
        sb.append(dm).append(xfND(_ydaytlequlyclssifylocinv));
        sb.append(dm).append(xfND(_ydaytlequlytmplocinv));
        sb.append(dm).append(xfND(_ydaytlequlyautoinv));
        sb.append(dm).append(xfND(_tdayeqytotalinv));
        sb.append(dm).append(xfND(_tdayeqykeeplocinv));
        sb.append(dm).append(xfND(_tdayeqyreceivelocinv));
        sb.append(dm).append(xfND(_tdayeqydamageitem));
        sb.append(dm).append(xfND(_tdayeqyclssifylocinv));
        sb.append(dm).append(xfND(_tdayeqytmplocinv));
        sb.append(dm).append(xfND(_tdayeqyautoinv));
        sb.append(dm).append(xfND(_capitemflg));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
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
    public SqlTTrallinvList clone() {
        return (SqlTTrallinvList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRALLINV_ID: {bigint(19)} <br>
     * @return The value of the column 'TRALLINV_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrallinvId() {
        checkSpecifiedProperty("trallinvId");
        return _trallinvId;
    }

    /**
     * [set] TRALLINV_ID: {bigint(19)} <br>
     * @param trallinvId The value of the column 'TRALLINV_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrallinvId(Long trallinvId) {
        registerModifiedProperty("trallinvId");
        _trallinvId = trallinvId;
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
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] EXECUTEDATE: {varchar(8)} <br>
     * @return The value of the column 'EXECUTEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getExecutedate() {
        checkSpecifiedProperty("executedate");
        return convertEmptyToNull(_executedate);
    }

    /**
     * [set] EXECUTEDATE: {varchar(8)} <br>
     * @param executedate The value of the column 'EXECUTEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExecutedate(String executedate) {
        registerModifiedProperty("executedate");
        _executedate = executedate;
    }

    /**
     * [get] INOUTKBN: {varchar(30)} <br>
     * @return The value of the column 'INOUTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getInoutkbn() {
        checkSpecifiedProperty("inoutkbn");
        return convertEmptyToNull(_inoutkbn);
    }

    /**
     * [set] INOUTKBN: {varchar(30)} <br>
     * @param inoutkbn The value of the column 'INOUTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInoutkbn(String inoutkbn) {
        registerModifiedProperty("inoutkbn");
        _inoutkbn = inoutkbn;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        checkSpecifiedProperty("sysinvtotalinv");
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        registerModifiedProperty("sysinvtotalinv");
        _sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvkeeplocinv() {
        checkSpecifiedProperty("sysinvkeeplocinv");
        return _sysinvkeeplocinv;
    }

    /**
     * [set] SYSINVKEEPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvkeeplocinv The value of the column 'SYSINVKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvkeeplocinv(java.math.BigDecimal sysinvkeeplocinv) {
        registerModifiedProperty("sysinvkeeplocinv");
        _sysinvkeeplocinv = sysinvkeeplocinv;
    }

    /**
     * [get] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvreceivelocinv() {
        checkSpecifiedProperty("sysinvreceivelocinv");
        return _sysinvreceivelocinv;
    }

    /**
     * [set] SYSINVRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param sysinvreceivelocinv The value of the column 'SYSINVRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvreceivelocinv(java.math.BigDecimal sysinvreceivelocinv) {
        registerModifiedProperty("sysinvreceivelocinv");
        _sysinvreceivelocinv = sysinvreceivelocinv;
    }

    /**
     * [get] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvdamageitem() {
        checkSpecifiedProperty("sysinvdamageitem");
        return _sysinvdamageitem;
    }

    /**
     * [set] SYSINVDAMAGEITEM: {decimal(16, 6)} <br>
     * @param sysinvdamageitem The value of the column 'SYSINVDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvdamageitem(java.math.BigDecimal sysinvdamageitem) {
        registerModifiedProperty("sysinvdamageitem");
        _sysinvdamageitem = sysinvdamageitem;
    }

    /**
     * [get] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvclssifylocinv() {
        checkSpecifiedProperty("sysinvclssifylocinv");
        return _sysinvclssifylocinv;
    }

    /**
     * [set] SYSINVCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param sysinvclssifylocinv The value of the column 'SYSINVCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvclssifylocinv(java.math.BigDecimal sysinvclssifylocinv) {
        registerModifiedProperty("sysinvclssifylocinv");
        _sysinvclssifylocinv = sysinvclssifylocinv;
    }

    /**
     * [get] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvtmplocinv() {
        checkSpecifiedProperty("sysinvtmplocinv");
        return _sysinvtmplocinv;
    }

    /**
     * [set] SYSINVTMPLOCINV: {decimal(16, 6)} <br>
     * @param sysinvtmplocinv The value of the column 'SYSINVTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvtmplocinv(java.math.BigDecimal sysinvtmplocinv) {
        registerModifiedProperty("sysinvtmplocinv");
        _sysinvtmplocinv = sysinvtmplocinv;
    }

    /**
     * [get] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvautoinv() {
        checkSpecifiedProperty("sysinvautoinv");
        return _sysinvautoinv;
    }

    /**
     * [set] SYSINVAUTOINV: {decimal(16, 6)} <br>
     * @param sysinvautoinv The value of the column 'SYSINVAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvautoinv(java.math.BigDecimal sysinvautoinv) {
        registerModifiedProperty("sysinvautoinv");
        _sysinvautoinv = sysinvautoinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        checkSpecifiedProperty("investtotalinv");
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        registerModifiedProperty("investtotalinv");
        _investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        checkSpecifiedProperty("investkeeplocinv");
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        registerModifiedProperty("investkeeplocinv");
        _investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        checkSpecifiedProperty("investreceivelocinv");
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        registerModifiedProperty("investreceivelocinv");
        _investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        checkSpecifiedProperty("investdamageitem");
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        registerModifiedProperty("investdamageitem");
        _investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        checkSpecifiedProperty("investclssifylocinv");
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        registerModifiedProperty("investclssifylocinv");
        _investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        checkSpecifiedProperty("investtmplocinv");
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        registerModifiedProperty("investtmplocinv");
        _investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestautoinv() {
        checkSpecifiedProperty("investautoinv");
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        registerModifiedProperty("investautoinv");
        _investautoinv = investautoinv;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        checkSpecifiedProperty("ydaytlequlytotalinv");
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        registerModifiedProperty("ydaytlequlytotalinv");
        _ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlykeeplocinv() {
        checkSpecifiedProperty("ydaytlequlykeeplocinv");
        return _ydaytlequlykeeplocinv;
    }

    /**
     * [set] YDAYTLEQULYKEEPLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlykeeplocinv The value of the column 'YDAYTLEQULYKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlykeeplocinv(java.math.BigDecimal ydaytlequlykeeplocinv) {
        registerModifiedProperty("ydaytlequlykeeplocinv");
        _ydaytlequlykeeplocinv = ydaytlequlykeeplocinv;
    }

    /**
     * [get] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlyreceivelocinv() {
        checkSpecifiedProperty("ydaytlequlyreceivelocinv");
        return _ydaytlequlyreceivelocinv;
    }

    /**
     * [set] YDAYTLEQULYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyreceivelocinv The value of the column 'YDAYTLEQULYRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlyreceivelocinv(java.math.BigDecimal ydaytlequlyreceivelocinv) {
        registerModifiedProperty("ydaytlequlyreceivelocinv");
        _ydaytlequlyreceivelocinv = ydaytlequlyreceivelocinv;
    }

    /**
     * [get] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlydamageitem() {
        checkSpecifiedProperty("ydaytlequlydamageitem");
        return _ydaytlequlydamageitem;
    }

    /**
     * [set] YDAYTLEQULYDAMAGEITEM: {decimal(16, 6)} <br>
     * @param ydaytlequlydamageitem The value of the column 'YDAYTLEQULYDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlydamageitem(java.math.BigDecimal ydaytlequlydamageitem) {
        registerModifiedProperty("ydaytlequlydamageitem");
        _ydaytlequlydamageitem = ydaytlequlydamageitem;
    }

    /**
     * [get] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlyclssifylocinv() {
        checkSpecifiedProperty("ydaytlequlyclssifylocinv");
        return _ydaytlequlyclssifylocinv;
    }

    /**
     * [set] YDAYTLEQULYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyclssifylocinv The value of the column 'YDAYTLEQULYCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlyclssifylocinv(java.math.BigDecimal ydaytlequlyclssifylocinv) {
        registerModifiedProperty("ydaytlequlyclssifylocinv");
        _ydaytlequlyclssifylocinv = ydaytlequlyclssifylocinv;
    }

    /**
     * [get] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlytmplocinv() {
        checkSpecifiedProperty("ydaytlequlytmplocinv");
        return _ydaytlequlytmplocinv;
    }

    /**
     * [set] YDAYTLEQULYTMPLOCINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytmplocinv The value of the column 'YDAYTLEQULYTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlytmplocinv(java.math.BigDecimal ydaytlequlytmplocinv) {
        registerModifiedProperty("ydaytlequlytmplocinv");
        _ydaytlequlytmplocinv = ydaytlequlytmplocinv;
    }

    /**
     * [get] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlyautoinv() {
        checkSpecifiedProperty("ydaytlequlyautoinv");
        return _ydaytlequlyautoinv;
    }

    /**
     * [set] YDAYTLEQULYAUTOINV: {decimal(16, 6)} <br>
     * @param ydaytlequlyautoinv The value of the column 'YDAYTLEQULYAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlyautoinv(java.math.BigDecimal ydaytlequlyautoinv) {
        registerModifiedProperty("ydaytlequlyautoinv");
        _ydaytlequlyautoinv = ydaytlequlyautoinv;
    }

    /**
     * [get] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqytotalinv() {
        checkSpecifiedProperty("tdayeqytotalinv");
        return _tdayeqytotalinv;
    }

    /**
     * [set] TDAYEQYTOTALINV: {decimal(16, 6)} <br>
     * @param tdayeqytotalinv The value of the column 'TDAYEQYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqytotalinv(java.math.BigDecimal tdayeqytotalinv) {
        registerModifiedProperty("tdayeqytotalinv");
        _tdayeqytotalinv = tdayeqytotalinv;
    }

    /**
     * [get] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqykeeplocinv() {
        checkSpecifiedProperty("tdayeqykeeplocinv");
        return _tdayeqykeeplocinv;
    }

    /**
     * [set] TDAYEQYKEEPLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqykeeplocinv The value of the column 'TDAYEQYKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqykeeplocinv(java.math.BigDecimal tdayeqykeeplocinv) {
        registerModifiedProperty("tdayeqykeeplocinv");
        _tdayeqykeeplocinv = tdayeqykeeplocinv;
    }

    /**
     * [get] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqyreceivelocinv() {
        checkSpecifiedProperty("tdayeqyreceivelocinv");
        return _tdayeqyreceivelocinv;
    }

    /**
     * [set] TDAYEQYRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param tdayeqyreceivelocinv The value of the column 'TDAYEQYRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqyreceivelocinv(java.math.BigDecimal tdayeqyreceivelocinv) {
        registerModifiedProperty("tdayeqyreceivelocinv");
        _tdayeqyreceivelocinv = tdayeqyreceivelocinv;
    }

    /**
     * [get] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqydamageitem() {
        checkSpecifiedProperty("tdayeqydamageitem");
        return _tdayeqydamageitem;
    }

    /**
     * [set] TDAYEQYDAMAGEITEM: {decimal(16, 6)} <br>
     * @param tdayeqydamageitem The value of the column 'TDAYEQYDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqydamageitem(java.math.BigDecimal tdayeqydamageitem) {
        registerModifiedProperty("tdayeqydamageitem");
        _tdayeqydamageitem = tdayeqydamageitem;
    }

    /**
     * [get] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqyclssifylocinv() {
        checkSpecifiedProperty("tdayeqyclssifylocinv");
        return _tdayeqyclssifylocinv;
    }

    /**
     * [set] TDAYEQYCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqyclssifylocinv The value of the column 'TDAYEQYCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqyclssifylocinv(java.math.BigDecimal tdayeqyclssifylocinv) {
        registerModifiedProperty("tdayeqyclssifylocinv");
        _tdayeqyclssifylocinv = tdayeqyclssifylocinv;
    }

    /**
     * [get] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqytmplocinv() {
        checkSpecifiedProperty("tdayeqytmplocinv");
        return _tdayeqytmplocinv;
    }

    /**
     * [set] TDAYEQYTMPLOCINV: {decimal(16, 6)} <br>
     * @param tdayeqytmplocinv The value of the column 'TDAYEQYTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqytmplocinv(java.math.BigDecimal tdayeqytmplocinv) {
        registerModifiedProperty("tdayeqytmplocinv");
        _tdayeqytmplocinv = tdayeqytmplocinv;
    }

    /**
     * [get] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'TDAYEQYAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayeqyautoinv() {
        checkSpecifiedProperty("tdayeqyautoinv");
        return _tdayeqyautoinv;
    }

    /**
     * [set] TDAYEQYAUTOINV: {decimal(16, 6)} <br>
     * @param tdayeqyautoinv The value of the column 'TDAYEQYAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayeqyautoinv(java.math.BigDecimal tdayeqyautoinv) {
        registerModifiedProperty("tdayeqyautoinv");
        _tdayeqyautoinv = tdayeqyautoinv;
    }

    /**
     * [get] CAPITEMFLG: {bigint(19)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCapitemflg() {
        checkSpecifiedProperty("capitemflg");
        return _capitemflg;
    }

    /**
     * [set] CAPITEMFLG: {bigint(19)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapitemflg(Long capitemflg) {
        registerModifiedProperty("capitemflg");
        _capitemflg = capitemflg;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @return The value of the column 'DEL_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {char(1), classification=DelFlg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
