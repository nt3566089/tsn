package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of H_STOCK_REPORT as TABLE. <br>
 * 在庫日報履歴
 * <pre>
 * [primary-key]
 *     STOCK_REPORT_ID
 *
 * [column]
 *     STOCK_REPORT_ID, HIST_DT, STOCK_ID, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, STORE_NUM_DAY, PICKING_NUM_DAY, MOVE_PLS_NUM_DAY, MOVE_MNS_NUM_DAY, ADJ_PLS_NUM_DAY, ADJ_MNS_NUM_DAY, P_CHARGE_NUM_DAY, P_ALLOC_NUM_DAY, P_MOVE_NUM_DAY, P_TRANSIT_NUM_DAY, STORE_NUM_MONTH, PICKING_NUM_MONTH, MOVE_PLS_NUM_MONTH, MOVE_MNS_NUM_MONTH, ADJ_PLS_NUM_MONTH, ADJ_MNS_NUM_MONTH, P_CHARGE_NUM_MONTH, P_ALLOC_NUM_MONTH, P_MOVE_NUM_MONTH, P_TRANSIT_NUM_MONTH, CHARGE_NUM_10, ALLOC_NUM_10, MOVE_NUM_10, TRANSIT_NUM_10, CHARGE_NUM_15, ALLOC_NUM_15, MOVE_NUM_15, TRANSIT_NUM_15, CHARGE_NUM_20, ALLOC_NUM_20, MOVE_NUM_20, TRANSIT_NUM_20, CHARGE_NUM_LAST, ALLOC_NUM_LAST, MOVE_NUM_LAST, TRANSIT_NUM_LAST, LAST_STORE_DT, LAST_PICKING_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_REPORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     H_STOCK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     hStock
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stockReportId = entity.getStockReportId();
 * String histDt = entity.getHistDt();
 * Long stockId = entity.getStockId();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal allocNum = entity.getAllocNum();
 * java.math.BigDecimal moveNum = entity.getMoveNum();
 * java.math.BigDecimal transitNum = entity.getTransitNum();
 * java.math.BigDecimal storeNumDay = entity.getStoreNumDay();
 * java.math.BigDecimal pickingNumDay = entity.getPickingNumDay();
 * java.math.BigDecimal movePlsNumDay = entity.getMovePlsNumDay();
 * java.math.BigDecimal moveMnsNumDay = entity.getMoveMnsNumDay();
 * java.math.BigDecimal adjPlsNumDay = entity.getAdjPlsNumDay();
 * java.math.BigDecimal adjMnsNumDay = entity.getAdjMnsNumDay();
 * java.math.BigDecimal pChargeNumDay = entity.getPChargeNumDay();
 * java.math.BigDecimal pAllocNumDay = entity.getPAllocNumDay();
 * java.math.BigDecimal pMoveNumDay = entity.getPMoveNumDay();
 * java.math.BigDecimal pTransitNumDay = entity.getPTransitNumDay();
 * java.math.BigDecimal storeNumMonth = entity.getStoreNumMonth();
 * java.math.BigDecimal pickingNumMonth = entity.getPickingNumMonth();
 * java.math.BigDecimal movePlsNumMonth = entity.getMovePlsNumMonth();
 * java.math.BigDecimal moveMnsNumMonth = entity.getMoveMnsNumMonth();
 * java.math.BigDecimal adjPlsNumMonth = entity.getAdjPlsNumMonth();
 * java.math.BigDecimal adjMnsNumMonth = entity.getAdjMnsNumMonth();
 * java.math.BigDecimal pChargeNumMonth = entity.getPChargeNumMonth();
 * java.math.BigDecimal pAllocNumMonth = entity.getPAllocNumMonth();
 * java.math.BigDecimal pMoveNumMonth = entity.getPMoveNumMonth();
 * java.math.BigDecimal pTransitNumMonth = entity.getPTransitNumMonth();
 * java.math.BigDecimal chargeNum10 = entity.getChargeNum10();
 * java.math.BigDecimal allocNum10 = entity.getAllocNum10();
 * java.math.BigDecimal moveNum10 = entity.getMoveNum10();
 * java.math.BigDecimal transitNum10 = entity.getTransitNum10();
 * java.math.BigDecimal chargeNum15 = entity.getChargeNum15();
 * java.math.BigDecimal allocNum15 = entity.getAllocNum15();
 * java.math.BigDecimal moveNum15 = entity.getMoveNum15();
 * java.math.BigDecimal transitNum15 = entity.getTransitNum15();
 * java.math.BigDecimal chargeNum20 = entity.getChargeNum20();
 * java.math.BigDecimal allocNum20 = entity.getAllocNum20();
 * java.math.BigDecimal moveNum20 = entity.getMoveNum20();
 * java.math.BigDecimal transitNum20 = entity.getTransitNum20();
 * java.math.BigDecimal chargeNumLast = entity.getChargeNumLast();
 * java.math.BigDecimal allocNumLast = entity.getAllocNumLast();
 * java.math.BigDecimal moveNumLast = entity.getMoveNumLast();
 * java.math.BigDecimal transitNumLast = entity.getTransitNumLast();
 * String lastStoreDt = entity.getLastStoreDt();
 * String lastPickingDt = entity.getLastPickingDt();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setStockReportId(stockReportId);
 * entity.setHistDt(histDt);
 * entity.setStockId(stockId);
 * entity.setChargeNum(chargeNum);
 * entity.setAllocNum(allocNum);
 * entity.setMoveNum(moveNum);
 * entity.setTransitNum(transitNum);
 * entity.setStoreNumDay(storeNumDay);
 * entity.setPickingNumDay(pickingNumDay);
 * entity.setMovePlsNumDay(movePlsNumDay);
 * entity.setMoveMnsNumDay(moveMnsNumDay);
 * entity.setAdjPlsNumDay(adjPlsNumDay);
 * entity.setAdjMnsNumDay(adjMnsNumDay);
 * entity.setPChargeNumDay(pChargeNumDay);
 * entity.setPAllocNumDay(pAllocNumDay);
 * entity.setPMoveNumDay(pMoveNumDay);
 * entity.setPTransitNumDay(pTransitNumDay);
 * entity.setStoreNumMonth(storeNumMonth);
 * entity.setPickingNumMonth(pickingNumMonth);
 * entity.setMovePlsNumMonth(movePlsNumMonth);
 * entity.setMoveMnsNumMonth(moveMnsNumMonth);
 * entity.setAdjPlsNumMonth(adjPlsNumMonth);
 * entity.setAdjMnsNumMonth(adjMnsNumMonth);
 * entity.setPChargeNumMonth(pChargeNumMonth);
 * entity.setPAllocNumMonth(pAllocNumMonth);
 * entity.setPMoveNumMonth(pMoveNumMonth);
 * entity.setPTransitNumMonth(pTransitNumMonth);
 * entity.setChargeNum10(chargeNum10);
 * entity.setAllocNum10(allocNum10);
 * entity.setMoveNum10(moveNum10);
 * entity.setTransitNum10(transitNum10);
 * entity.setChargeNum15(chargeNum15);
 * entity.setAllocNum15(allocNum15);
 * entity.setMoveNum15(moveNum15);
 * entity.setTransitNum15(transitNum15);
 * entity.setChargeNum20(chargeNum20);
 * entity.setAllocNum20(allocNum20);
 * entity.setMoveNum20(moveNum20);
 * entity.setTransitNum20(transitNum20);
 * entity.setChargeNumLast(chargeNumLast);
 * entity.setAllocNumLast(allocNumLast);
 * entity.setMoveNumLast(moveNumLast);
 * entity.setTransitNumLast(transitNumLast);
 * entity.setLastStoreDt(lastStoreDt);
 * entity.setLastPickingDt(lastPickingDt);
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
public abstract class BsHStockReport extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _stockReportId;

    /** HIST_DT: {UQ+, IX, NotNull, varchar(8)} */
    protected String _histDt;

    /** STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK} */
    protected Long _stockId;

    /** CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum;

    /** TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNum;

    /** STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _storeNumDay;

    /** PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pickingNumDay;

    /** MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _movePlsNumDay;

    /** MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveMnsNumDay;

    /** ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _adjPlsNumDay;

    /** ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _adjMnsNumDay;

    /** P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pChargeNumDay;

    /** P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pAllocNumDay;

    /** P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pMoveNumDay;

    /** P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pTransitNumDay;

    /** STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _storeNumMonth;

    /** PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pickingNumMonth;

    /** MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _movePlsNumMonth;

    /** MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveMnsNumMonth;

    /** ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _adjPlsNumMonth;

    /** ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _adjMnsNumMonth;

    /** P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pChargeNumMonth;

    /** P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pAllocNumMonth;

    /** P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pMoveNumMonth;

    /** P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _pTransitNumMonth;

    /** CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum10;

    /** ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum10;

    /** MOVE_NUM_10: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum10;

    /** TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNum10;

    /** CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum15;

    /** ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum15;

    /** MOVE_NUM_15: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum15;

    /** TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNum15;

    /** CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNum20;

    /** ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNum20;

    /** MOVE_NUM_20: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNum20;

    /** TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNum20;

    /** CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _chargeNumLast;

    /** ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _allocNumLast;

    /** MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _moveNumLast;

    /** TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} */
    protected java.math.BigDecimal _transitNumLast;

    /** LAST_STORE_DT: {varchar(8)} */
    protected String _lastStoreDt;

    /** LAST_PICKING_DT: {varchar(8)} */
    protected String _lastPickingDt;

    /** DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
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
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "H_STOCK_REPORT";
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
        if (_stockReportId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param histDt : UQ+, IX, NotNull, varchar(8). (NotNull)
     * @param stockId : +UQ, IX, NotNull, bigint(19), FK to H_STOCK. (NotNull)
     */
    public void uniqueBy(String histDt, Long stockId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("histDt");
        __uniqueDrivenProperties.addPropertyName("stockId");
        setHistDt(histDt);setStockId(stockId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
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
    /** H_STOCK by my STOCK_ID, named 'HStock'. */
    protected HStock _hStock;

    /**
     * [get] H_STOCK by my STOCK_ID, named 'HStock'. <br>
     * @return The entity of foreign property 'HStock'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public HStock getHStock() {
        return _hStock;
    }

    /**
     * [set] H_STOCK by my STOCK_ID, named 'HStock'.
     * @param hStock The entity of foreign property 'HStock'. (NullAllowed)
     */
    public void setHStock(HStock hStock) {
        _hStock = hStock;
    }

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
        if (obj instanceof BsHStockReport) {
            BsHStockReport other = (BsHStockReport)obj;
            if (!xSV(_stockReportId, other._stockReportId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stockReportId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_hStock != null)
        { sb.append(li).append(xbRDS(_hStock, "hStock")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stockReportId));
        sb.append(dm).append(xfND(_histDt));
        sb.append(dm).append(xfND(_stockId));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_allocNum));
        sb.append(dm).append(xfND(_moveNum));
        sb.append(dm).append(xfND(_transitNum));
        sb.append(dm).append(xfND(_storeNumDay));
        sb.append(dm).append(xfND(_pickingNumDay));
        sb.append(dm).append(xfND(_movePlsNumDay));
        sb.append(dm).append(xfND(_moveMnsNumDay));
        sb.append(dm).append(xfND(_adjPlsNumDay));
        sb.append(dm).append(xfND(_adjMnsNumDay));
        sb.append(dm).append(xfND(_pChargeNumDay));
        sb.append(dm).append(xfND(_pAllocNumDay));
        sb.append(dm).append(xfND(_pMoveNumDay));
        sb.append(dm).append(xfND(_pTransitNumDay));
        sb.append(dm).append(xfND(_storeNumMonth));
        sb.append(dm).append(xfND(_pickingNumMonth));
        sb.append(dm).append(xfND(_movePlsNumMonth));
        sb.append(dm).append(xfND(_moveMnsNumMonth));
        sb.append(dm).append(xfND(_adjPlsNumMonth));
        sb.append(dm).append(xfND(_adjMnsNumMonth));
        sb.append(dm).append(xfND(_pChargeNumMonth));
        sb.append(dm).append(xfND(_pAllocNumMonth));
        sb.append(dm).append(xfND(_pMoveNumMonth));
        sb.append(dm).append(xfND(_pTransitNumMonth));
        sb.append(dm).append(xfND(_chargeNum10));
        sb.append(dm).append(xfND(_allocNum10));
        sb.append(dm).append(xfND(_moveNum10));
        sb.append(dm).append(xfND(_transitNum10));
        sb.append(dm).append(xfND(_chargeNum15));
        sb.append(dm).append(xfND(_allocNum15));
        sb.append(dm).append(xfND(_moveNum15));
        sb.append(dm).append(xfND(_transitNum15));
        sb.append(dm).append(xfND(_chargeNum20));
        sb.append(dm).append(xfND(_allocNum20));
        sb.append(dm).append(xfND(_moveNum20));
        sb.append(dm).append(xfND(_transitNum20));
        sb.append(dm).append(xfND(_chargeNumLast));
        sb.append(dm).append(xfND(_allocNumLast));
        sb.append(dm).append(xfND(_moveNumLast));
        sb.append(dm).append(xfND(_transitNumLast));
        sb.append(dm).append(xfND(_lastStoreDt));
        sb.append(dm).append(xfND(_lastPickingDt));
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
        StringBuilder sb = new StringBuilder();
        if (_hStock != null)
        { sb.append(dm).append("hStock"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public HStockReport clone() {
        return (HStockReport)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫履歴ID
     * @return The value of the column 'STOCK_REPORT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockReportId() {
        checkSpecifiedProperty("stockReportId");
        return _stockReportId;
    }

    /**
     * [set] STOCK_REPORT_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 在庫履歴ID
     * @param stockReportId The value of the column 'STOCK_REPORT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockReportId(Long stockReportId) {
        registerModifiedProperty("stockReportId");
        _stockReportId = stockReportId;
    }

    /**
     * [get] HIST_DT: {UQ+, IX, NotNull, varchar(8)} <br>
     * 履歴日
     * @return The value of the column 'HIST_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getHistDt() {
        checkSpecifiedProperty("histDt");
        return convertEmptyToNull(_histDt);
    }

    /**
     * [set] HIST_DT: {UQ+, IX, NotNull, varchar(8)} <br>
     * 履歴日
     * @param histDt The value of the column 'HIST_DT'. (basically NotNull if update: for the constraint)
     */
    public void setHistDt(String histDt) {
        registerModifiedProperty("histDt");
        _histDt = histDt;
    }

    /**
     * [get] STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getStockId() {
        checkSpecifiedProperty("stockId");
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {+UQ, IX, NotNull, bigint(19), FK to H_STOCK} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStockId(Long stockId) {
        registerModifiedProperty("stockId");
        _stockId = stockId;
    }

    /**
     * [get] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getAllocNum() {
        checkSpecifiedProperty("allocNum");
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        registerModifiedProperty("allocNum");
        _allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @return The value of the column 'MOVE_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getMoveNum() {
        checkSpecifiedProperty("moveNum");
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 移動中数
     * @param moveNum The value of the column 'MOVE_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        registerModifiedProperty("moveNum");
        _moveNum = moveNum;
    }

    /**
     * [get] TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 積送中数
     * @return The value of the column 'TRANSIT_NUM'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getTransitNum() {
        checkSpecifiedProperty("transitNum");
        return _transitNum;
    }

    /**
     * [set] TRANSIT_NUM: {NotNull, decimal(16, 6), default=[(0)]} <br>
     * 積送中数
     * @param transitNum The value of the column 'TRANSIT_NUM'. (basically NotNull if update: for the constraint)
     */
    public void setTransitNum(java.math.BigDecimal transitNum) {
        registerModifiedProperty("transitNum");
        _transitNum = transitNum;
    }

    /**
     * [get] STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日入庫数
     * @return The value of the column 'STORE_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStoreNumDay() {
        checkSpecifiedProperty("storeNumDay");
        return _storeNumDay;
    }

    /**
     * [set] STORE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日入庫数
     * @param storeNumDay The value of the column 'STORE_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNumDay(java.math.BigDecimal storeNumDay) {
        registerModifiedProperty("storeNumDay");
        _storeNumDay = storeNumDay;
    }

    /**
     * [get] PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日出庫数
     * @return The value of the column 'PICKING_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNumDay() {
        checkSpecifiedProperty("pickingNumDay");
        return _pickingNumDay;
    }

    /**
     * [set] PICKING_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日出庫数
     * @param pickingNumDay The value of the column 'PICKING_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNumDay(java.math.BigDecimal pickingNumDay) {
        registerModifiedProperty("pickingNumDay");
        _pickingNumDay = pickingNumDay;
    }

    /**
     * [get] MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数＋
     * @return The value of the column 'MOVE_PLS_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMovePlsNumDay() {
        checkSpecifiedProperty("movePlsNumDay");
        return _movePlsNumDay;
    }

    /**
     * [set] MOVE_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数＋
     * @param movePlsNumDay The value of the column 'MOVE_PLS_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMovePlsNumDay(java.math.BigDecimal movePlsNumDay) {
        registerModifiedProperty("movePlsNumDay");
        _movePlsNumDay = movePlsNumDay;
    }

    /**
     * [get] MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数－
     * @return The value of the column 'MOVE_MNS_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveMnsNumDay() {
        checkSpecifiedProperty("moveMnsNumDay");
        return _moveMnsNumDay;
    }

    /**
     * [set] MOVE_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日移動数－
     * @param moveMnsNumDay The value of the column 'MOVE_MNS_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveMnsNumDay(java.math.BigDecimal moveMnsNumDay) {
        registerModifiedProperty("moveMnsNumDay");
        _moveMnsNumDay = moveMnsNumDay;
    }

    /**
     * [get] ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数＋
     * @return The value of the column 'ADJ_PLS_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAdjPlsNumDay() {
        checkSpecifiedProperty("adjPlsNumDay");
        return _adjPlsNumDay;
    }

    /**
     * [set] ADJ_PLS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数＋
     * @param adjPlsNumDay The value of the column 'ADJ_PLS_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjPlsNumDay(java.math.BigDecimal adjPlsNumDay) {
        registerModifiedProperty("adjPlsNumDay");
        _adjPlsNumDay = adjPlsNumDay;
    }

    /**
     * [get] ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数－
     * @return The value of the column 'ADJ_MNS_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAdjMnsNumDay() {
        checkSpecifiedProperty("adjMnsNumDay");
        return _adjMnsNumDay;
    }

    /**
     * [set] ADJ_MNS_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 当日調整数－
     * @param adjMnsNumDay The value of the column 'ADJ_MNS_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjMnsNumDay(java.math.BigDecimal adjMnsNumDay) {
        registerModifiedProperty("adjMnsNumDay");
        _adjMnsNumDay = adjMnsNumDay;
    }

    /**
     * [get] P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当可能数
     * @return The value of the column 'P_CHARGE_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPChargeNumDay() {
        checkSpecifiedProperty("PChargeNumDay");
        return _pChargeNumDay;
    }

    /**
     * [set] P_CHARGE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当可能数
     * @param pChargeNumDay The value of the column 'P_CHARGE_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPChargeNumDay(java.math.BigDecimal pChargeNumDay) {
        registerModifiedProperty("PChargeNumDay");
        _pChargeNumDay = pChargeNumDay;
    }

    /**
     * [get] P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当済数
     * @return The value of the column 'P_ALLOC_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPAllocNumDay() {
        checkSpecifiedProperty("PAllocNumDay");
        return _pAllocNumDay;
    }

    /**
     * [set] P_ALLOC_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日引当済数
     * @param pAllocNumDay The value of the column 'P_ALLOC_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPAllocNumDay(java.math.BigDecimal pAllocNumDay) {
        registerModifiedProperty("PAllocNumDay");
        _pAllocNumDay = pAllocNumDay;
    }

    /**
     * [get] P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日移動中数
     * @return The value of the column 'P_MOVE_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPMoveNumDay() {
        checkSpecifiedProperty("PMoveNumDay");
        return _pMoveNumDay;
    }

    /**
     * [set] P_MOVE_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日移動中数
     * @param pMoveNumDay The value of the column 'P_MOVE_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPMoveNumDay(java.math.BigDecimal pMoveNumDay) {
        registerModifiedProperty("PMoveNumDay");
        _pMoveNumDay = pMoveNumDay;
    }

    /**
     * [get] P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日積送中数
     * @return The value of the column 'P_TRANSIT_NUM_DAY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPTransitNumDay() {
        checkSpecifiedProperty("PTransitNumDay");
        return _pTransitNumDay;
    }

    /**
     * [set] P_TRANSIT_NUM_DAY: {decimal(16, 6), default=[(0)]} <br>
     * 前日積送中数
     * @param pTransitNumDay The value of the column 'P_TRANSIT_NUM_DAY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPTransitNumDay(java.math.BigDecimal pTransitNumDay) {
        registerModifiedProperty("PTransitNumDay");
        _pTransitNumDay = pTransitNumDay;
    }

    /**
     * [get] STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月入庫数
     * @return The value of the column 'STORE_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getStoreNumMonth() {
        checkSpecifiedProperty("storeNumMonth");
        return _storeNumMonth;
    }

    /**
     * [set] STORE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月入庫数
     * @param storeNumMonth The value of the column 'STORE_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreNumMonth(java.math.BigDecimal storeNumMonth) {
        registerModifiedProperty("storeNumMonth");
        _storeNumMonth = storeNumMonth;
    }

    /**
     * [get] PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月出庫数
     * @return The value of the column 'PICKING_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickingNumMonth() {
        checkSpecifiedProperty("pickingNumMonth");
        return _pickingNumMonth;
    }

    /**
     * [set] PICKING_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月出庫数
     * @param pickingNumMonth The value of the column 'PICKING_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingNumMonth(java.math.BigDecimal pickingNumMonth) {
        registerModifiedProperty("pickingNumMonth");
        _pickingNumMonth = pickingNumMonth;
    }

    /**
     * [get] MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数＋
     * @return The value of the column 'MOVE_PLS_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMovePlsNumMonth() {
        checkSpecifiedProperty("movePlsNumMonth");
        return _movePlsNumMonth;
    }

    /**
     * [set] MOVE_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数＋
     * @param movePlsNumMonth The value of the column 'MOVE_PLS_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMovePlsNumMonth(java.math.BigDecimal movePlsNumMonth) {
        registerModifiedProperty("movePlsNumMonth");
        _movePlsNumMonth = movePlsNumMonth;
    }

    /**
     * [get] MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数－
     * @return The value of the column 'MOVE_MNS_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveMnsNumMonth() {
        checkSpecifiedProperty("moveMnsNumMonth");
        return _moveMnsNumMonth;
    }

    /**
     * [set] MOVE_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月移動数－
     * @param moveMnsNumMonth The value of the column 'MOVE_MNS_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveMnsNumMonth(java.math.BigDecimal moveMnsNumMonth) {
        registerModifiedProperty("moveMnsNumMonth");
        _moveMnsNumMonth = moveMnsNumMonth;
    }

    /**
     * [get] ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数＋
     * @return The value of the column 'ADJ_PLS_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAdjPlsNumMonth() {
        checkSpecifiedProperty("adjPlsNumMonth");
        return _adjPlsNumMonth;
    }

    /**
     * [set] ADJ_PLS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数＋
     * @param adjPlsNumMonth The value of the column 'ADJ_PLS_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjPlsNumMonth(java.math.BigDecimal adjPlsNumMonth) {
        registerModifiedProperty("adjPlsNumMonth");
        _adjPlsNumMonth = adjPlsNumMonth;
    }

    /**
     * [get] ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数－
     * @return The value of the column 'ADJ_MNS_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAdjMnsNumMonth() {
        checkSpecifiedProperty("adjMnsNumMonth");
        return _adjMnsNumMonth;
    }

    /**
     * [set] ADJ_MNS_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 当月調整数－
     * @param adjMnsNumMonth The value of the column 'ADJ_MNS_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjMnsNumMonth(java.math.BigDecimal adjMnsNumMonth) {
        registerModifiedProperty("adjMnsNumMonth");
        _adjMnsNumMonth = adjMnsNumMonth;
    }

    /**
     * [get] P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当可能数
     * @return The value of the column 'P_CHARGE_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPChargeNumMonth() {
        checkSpecifiedProperty("PChargeNumMonth");
        return _pChargeNumMonth;
    }

    /**
     * [set] P_CHARGE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当可能数
     * @param pChargeNumMonth The value of the column 'P_CHARGE_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPChargeNumMonth(java.math.BigDecimal pChargeNumMonth) {
        registerModifiedProperty("PChargeNumMonth");
        _pChargeNumMonth = pChargeNumMonth;
    }

    /**
     * [get] P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当済数
     * @return The value of the column 'P_ALLOC_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPAllocNumMonth() {
        checkSpecifiedProperty("PAllocNumMonth");
        return _pAllocNumMonth;
    }

    /**
     * [set] P_ALLOC_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月引当済数
     * @param pAllocNumMonth The value of the column 'P_ALLOC_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPAllocNumMonth(java.math.BigDecimal pAllocNumMonth) {
        registerModifiedProperty("PAllocNumMonth");
        _pAllocNumMonth = pAllocNumMonth;
    }

    /**
     * [get] P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月移動中数
     * @return The value of the column 'P_MOVE_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPMoveNumMonth() {
        checkSpecifiedProperty("PMoveNumMonth");
        return _pMoveNumMonth;
    }

    /**
     * [set] P_MOVE_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月移動中数
     * @param pMoveNumMonth The value of the column 'P_MOVE_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPMoveNumMonth(java.math.BigDecimal pMoveNumMonth) {
        registerModifiedProperty("PMoveNumMonth");
        _pMoveNumMonth = pMoveNumMonth;
    }

    /**
     * [get] P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月積送中数
     * @return The value of the column 'P_TRANSIT_NUM_MONTH'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPTransitNumMonth() {
        checkSpecifiedProperty("PTransitNumMonth");
        return _pTransitNumMonth;
    }

    /**
     * [set] P_TRANSIT_NUM_MONTH: {decimal(16, 6), default=[(0)]} <br>
     * 前月積送中数
     * @param pTransitNumMonth The value of the column 'P_TRANSIT_NUM_MONTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPTransitNumMonth(java.math.BigDecimal pTransitNumMonth) {
        registerModifiedProperty("PTransitNumMonth");
        _pTransitNumMonth = pTransitNumMonth;
    }

    /**
     * [get] CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当可能数
     * @return The value of the column 'CHARGE_NUM_10'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum10() {
        checkSpecifiedProperty("chargeNum10");
        return _chargeNum10;
    }

    /**
     * [set] CHARGE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当可能数
     * @param chargeNum10 The value of the column 'CHARGE_NUM_10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum10(java.math.BigDecimal chargeNum10) {
        registerModifiedProperty("chargeNum10");
        _chargeNum10 = chargeNum10;
    }

    /**
     * [get] ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当済数
     * @return The value of the column 'ALLOC_NUM_10'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum10() {
        checkSpecifiedProperty("allocNum10");
        return _allocNum10;
    }

    /**
     * [set] ALLOC_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残引当済数
     * @param allocNum10 The value of the column 'ALLOC_NUM_10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum10(java.math.BigDecimal allocNum10) {
        registerModifiedProperty("allocNum10");
        _allocNum10 = allocNum10;
    }

    /**
     * [get] MOVE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残移動中数
     * @return The value of the column 'MOVE_NUM_10'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum10() {
        checkSpecifiedProperty("moveNum10");
        return _moveNum10;
    }

    /**
     * [set] MOVE_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残移動中数
     * @param moveNum10 The value of the column 'MOVE_NUM_10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum10(java.math.BigDecimal moveNum10) {
        registerModifiedProperty("moveNum10");
        _moveNum10 = moveNum10;
    }

    /**
     * [get] TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残積送中数
     * @return The value of the column 'TRANSIT_NUM_10'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransitNum10() {
        checkSpecifiedProperty("transitNum10");
        return _transitNum10;
    }

    /**
     * [set] TRANSIT_NUM_10: {decimal(16, 6), default=[(0)]} <br>
     * 10日残積送中数
     * @param transitNum10 The value of the column 'TRANSIT_NUM_10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransitNum10(java.math.BigDecimal transitNum10) {
        registerModifiedProperty("transitNum10");
        _transitNum10 = transitNum10;
    }

    /**
     * [get] CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当可能数
     * @return The value of the column 'CHARGE_NUM_15'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum15() {
        checkSpecifiedProperty("chargeNum15");
        return _chargeNum15;
    }

    /**
     * [set] CHARGE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当可能数
     * @param chargeNum15 The value of the column 'CHARGE_NUM_15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum15(java.math.BigDecimal chargeNum15) {
        registerModifiedProperty("chargeNum15");
        _chargeNum15 = chargeNum15;
    }

    /**
     * [get] ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当済数
     * @return The value of the column 'ALLOC_NUM_15'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum15() {
        checkSpecifiedProperty("allocNum15");
        return _allocNum15;
    }

    /**
     * [set] ALLOC_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残引当済数
     * @param allocNum15 The value of the column 'ALLOC_NUM_15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum15(java.math.BigDecimal allocNum15) {
        registerModifiedProperty("allocNum15");
        _allocNum15 = allocNum15;
    }

    /**
     * [get] MOVE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残移動中数
     * @return The value of the column 'MOVE_NUM_15'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum15() {
        checkSpecifiedProperty("moveNum15");
        return _moveNum15;
    }

    /**
     * [set] MOVE_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残移動中数
     * @param moveNum15 The value of the column 'MOVE_NUM_15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum15(java.math.BigDecimal moveNum15) {
        registerModifiedProperty("moveNum15");
        _moveNum15 = moveNum15;
    }

    /**
     * [get] TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残積送中数
     * @return The value of the column 'TRANSIT_NUM_15'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransitNum15() {
        checkSpecifiedProperty("transitNum15");
        return _transitNum15;
    }

    /**
     * [set] TRANSIT_NUM_15: {decimal(16, 6), default=[(0)]} <br>
     * 15日残積送中数
     * @param transitNum15 The value of the column 'TRANSIT_NUM_15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransitNum15(java.math.BigDecimal transitNum15) {
        registerModifiedProperty("transitNum15");
        _transitNum15 = transitNum15;
    }

    /**
     * [get] CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当可能数
     * @return The value of the column 'CHARGE_NUM_20'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum20() {
        checkSpecifiedProperty("chargeNum20");
        return _chargeNum20;
    }

    /**
     * [set] CHARGE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当可能数
     * @param chargeNum20 The value of the column 'CHARGE_NUM_20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum20(java.math.BigDecimal chargeNum20) {
        registerModifiedProperty("chargeNum20");
        _chargeNum20 = chargeNum20;
    }

    /**
     * [get] ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当済数
     * @return The value of the column 'ALLOC_NUM_20'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNum20() {
        checkSpecifiedProperty("allocNum20");
        return _allocNum20;
    }

    /**
     * [set] ALLOC_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残引当済数
     * @param allocNum20 The value of the column 'ALLOC_NUM_20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNum20(java.math.BigDecimal allocNum20) {
        registerModifiedProperty("allocNum20");
        _allocNum20 = allocNum20;
    }

    /**
     * [get] MOVE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残移動中数
     * @return The value of the column 'MOVE_NUM_20'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNum20() {
        checkSpecifiedProperty("moveNum20");
        return _moveNum20;
    }

    /**
     * [set] MOVE_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残移動中数
     * @param moveNum20 The value of the column 'MOVE_NUM_20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNum20(java.math.BigDecimal moveNum20) {
        registerModifiedProperty("moveNum20");
        _moveNum20 = moveNum20;
    }

    /**
     * [get] TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残積送中数
     * @return The value of the column 'TRANSIT_NUM_20'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransitNum20() {
        checkSpecifiedProperty("transitNum20");
        return _transitNum20;
    }

    /**
     * [set] TRANSIT_NUM_20: {decimal(16, 6), default=[(0)]} <br>
     * 20日残積送中数
     * @param transitNum20 The value of the column 'TRANSIT_NUM_20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransitNum20(java.math.BigDecimal transitNum20) {
        registerModifiedProperty("transitNum20");
        _transitNum20 = transitNum20;
    }

    /**
     * [get] CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当可能数
     * @return The value of the column 'CHARGE_NUM_LAST'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNumLast() {
        checkSpecifiedProperty("chargeNumLast");
        return _chargeNumLast;
    }

    /**
     * [set] CHARGE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当可能数
     * @param chargeNumLast The value of the column 'CHARGE_NUM_LAST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNumLast(java.math.BigDecimal chargeNumLast) {
        registerModifiedProperty("chargeNumLast");
        _chargeNumLast = chargeNumLast;
    }

    /**
     * [get] ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当済数
     * @return The value of the column 'ALLOC_NUM_LAST'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllocNumLast() {
        checkSpecifiedProperty("allocNumLast");
        return _allocNumLast;
    }

    /**
     * [set] ALLOC_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残引当済数
     * @param allocNumLast The value of the column 'ALLOC_NUM_LAST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocNumLast(java.math.BigDecimal allocNumLast) {
        registerModifiedProperty("allocNumLast");
        _allocNumLast = allocNumLast;
    }

    /**
     * [get] MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残移動中数
     * @return The value of the column 'MOVE_NUM_LAST'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMoveNumLast() {
        checkSpecifiedProperty("moveNumLast");
        return _moveNumLast;
    }

    /**
     * [set] MOVE_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残移動中数
     * @param moveNumLast The value of the column 'MOVE_NUM_LAST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMoveNumLast(java.math.BigDecimal moveNumLast) {
        registerModifiedProperty("moveNumLast");
        _moveNumLast = moveNumLast;
    }

    /**
     * [get] TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残積送中数
     * @return The value of the column 'TRANSIT_NUM_LAST'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransitNumLast() {
        checkSpecifiedProperty("transitNumLast");
        return _transitNumLast;
    }

    /**
     * [set] TRANSIT_NUM_LAST: {decimal(16, 6), default=[(0)]} <br>
     * 末日残積送中数
     * @param transitNumLast The value of the column 'TRANSIT_NUM_LAST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransitNumLast(java.math.BigDecimal transitNumLast) {
        registerModifiedProperty("transitNumLast");
        _transitNumLast = transitNumLast;
    }

    /**
     * [get] LAST_STORE_DT: {varchar(8)} <br>
     * 最新入庫年月日
     * @return The value of the column 'LAST_STORE_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastStoreDt() {
        checkSpecifiedProperty("lastStoreDt");
        return convertEmptyToNull(_lastStoreDt);
    }

    /**
     * [set] LAST_STORE_DT: {varchar(8)} <br>
     * 最新入庫年月日
     * @param lastStoreDt The value of the column 'LAST_STORE_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastStoreDt(String lastStoreDt) {
        registerModifiedProperty("lastStoreDt");
        _lastStoreDt = lastStoreDt;
    }

    /**
     * [get] LAST_PICKING_DT: {varchar(8)} <br>
     * 最新出庫年月日
     * @return The value of the column 'LAST_PICKING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastPickingDt() {
        checkSpecifiedProperty("lastPickingDt");
        return convertEmptyToNull(_lastPickingDt);
    }

    /**
     * [set] LAST_PICKING_DT: {varchar(8)} <br>
     * 最新出庫年月日
     * @param lastPickingDt The value of the column 'LAST_PICKING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastPickingDt(String lastPickingDt) {
        registerModifiedProperty("lastPickingDt");
        _lastPickingDt = lastPickingDt;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
