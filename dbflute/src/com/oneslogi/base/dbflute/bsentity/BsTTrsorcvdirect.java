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
 * The entity of T_TRSORCVDIRECT as TABLE. <br>
 * 入庫/出庫依頼書印刷
 * <pre>
 * [primary-key]
 *     SOJTLINEID
 *
 * [column]
 *     SOJTLINEID, SoRcvDirectKey, InstructionsDate, OwnerDirectNo, SalesType, SalesTypeCd, ShipToCode, OriginalPONo, PRODUCT_ID, ExpectQty, PlanPrice, PlanPriceTotal, PlanName, PlanPost, PlanAddress1, PlanAddress2, PlanItemName, WareHousePlant, WareHousePlantName, WareHouseName, OrderDate, DeliveryDate, PurchaseNumber, OrderNumber, ItemLineNo, SkuCode, CardBoard, CarTon, TotalExpectQty, TotalCardBoardQty, TotalCarTonQty, Note, Reserve2, Reserve3, Reserve, CenterId, ClientId, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOJTLINEID
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
 * Long sojtlineid = entity.getSojtlineid();
 * Long sorcvdirectkey = entity.getSorcvdirectkey();
 * String instructionsdate = entity.getInstructionsdate();
 * String ownerdirectno = entity.getOwnerdirectno();
 * String salestype = entity.getSalestype();
 * String salestypecd = entity.getSalestypecd();
 * String shiptocode = entity.getShiptocode();
 * String originalpono = entity.getOriginalpono();
 * Long productId = entity.getProductId();
 * Long expectqty = entity.getExpectqty();
 * Long planprice = entity.getPlanprice();
 * Long planpricetotal = entity.getPlanpricetotal();
 * String planname = entity.getPlanname();
 * String planpost = entity.getPlanpost();
 * String planaddress1 = entity.getPlanaddress1();
 * String planaddress2 = entity.getPlanaddress2();
 * String planitemname = entity.getPlanitemname();
 * String warehouseplant = entity.getWarehouseplant();
 * String warehouseplantname = entity.getWarehouseplantname();
 * String warehousename = entity.getWarehousename();
 * String orderdate = entity.getOrderdate();
 * String deliverydate = entity.getDeliverydate();
 * String purchasenumber = entity.getPurchasenumber();
 * Long ordernumber = entity.getOrdernumber();
 * String itemlineno = entity.getItemlineno();
 * String skucode = entity.getSkucode();
 * Long cardboard = entity.getCardboard();
 * Long carton = entity.getCarton();
 * Long totalexpectqty = entity.getTotalexpectqty();
 * Long totalcardboardqty = entity.getTotalcardboardqty();
 * Long totalcartonqty = entity.getTotalcartonqty();
 * String note = entity.getNote();
 * String reserve2 = entity.getReserve2();
 * String reserve3 = entity.getReserve3();
 * String reserve = entity.getReserve();
 * Long centerid = entity.getCenterid();
 * Long clientid = entity.getClientid();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSojtlineid(sojtlineid);
 * entity.setSorcvdirectkey(sorcvdirectkey);
 * entity.setInstructionsdate(instructionsdate);
 * entity.setOwnerdirectno(ownerdirectno);
 * entity.setSalestype(salestype);
 * entity.setSalestypecd(salestypecd);
 * entity.setShiptocode(shiptocode);
 * entity.setOriginalpono(originalpono);
 * entity.setProductId(productId);
 * entity.setExpectqty(expectqty);
 * entity.setPlanprice(planprice);
 * entity.setPlanpricetotal(planpricetotal);
 * entity.setPlanname(planname);
 * entity.setPlanpost(planpost);
 * entity.setPlanaddress1(planaddress1);
 * entity.setPlanaddress2(planaddress2);
 * entity.setPlanitemname(planitemname);
 * entity.setWarehouseplant(warehouseplant);
 * entity.setWarehouseplantname(warehouseplantname);
 * entity.setWarehousename(warehousename);
 * entity.setOrderdate(orderdate);
 * entity.setDeliverydate(deliverydate);
 * entity.setPurchasenumber(purchasenumber);
 * entity.setOrdernumber(ordernumber);
 * entity.setItemlineno(itemlineno);
 * entity.setSkucode(skucode);
 * entity.setCardboard(cardboard);
 * entity.setCarton(carton);
 * entity.setTotalexpectqty(totalexpectqty);
 * entity.setTotalcardboardqty(totalcardboardqty);
 * entity.setTotalcartonqty(totalcartonqty);
 * entity.setNote(note);
 * entity.setReserve2(reserve2);
 * entity.setReserve3(reserve3);
 * entity.setReserve(reserve);
 * entity.setCenterid(centerid);
 * entity.setClientid(clientid);
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
public abstract class BsTTrsorcvdirect extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _sojtlineid;

    /** SoRcvDirectKey: {bigint(19)} */
    protected Long _sorcvdirectkey;

    /** InstructionsDate: {NotNull, varchar(8)} */
    protected String _instructionsdate;

    /** OwnerDirectNo: {NotNull, varchar(30)} */
    protected String _ownerdirectno;

    /** SalesType: {NotNull, varchar(30)} */
    protected String _salestype;

    /** SalesTypeCd: {NotNull, char(1)} */
    protected String _salestypecd;

    /** ShipToCode: {NotNull, varchar(30)} */
    protected String _shiptocode;

    /** OriginalPONo: {NotNull, varchar(30)} */
    protected String _originalpono;

    /** PRODUCT_ID: {NotNull, bigint(19)} */
    protected Long _productId;

    /** ExpectQty: {NotNull, bigint(19)} */
    protected Long _expectqty;

    /** PlanPrice: {NotNull, bigint(19)} */
    protected Long _planprice;

    /** PlanPriceTotal: {NotNull, bigint(19)} */
    protected Long _planpricetotal;

    /** PlanName: {NotNull, varchar(100)} */
    protected String _planname;

    /** PlanPost: {NotNull, varchar(30)} */
    protected String _planpost;

    /** PlanAddress1: {NotNull, varchar(100)} */
    protected String _planaddress1;

    /** PlanAddress2: {NotNull, varchar(255)} */
    protected String _planaddress2;

    /** PlanItemName: {varchar(255)} */
    protected String _planitemname;

    /** WareHousePlant: {NotNull, varchar(30)} */
    protected String _warehouseplant;

    /** WareHousePlantName: {NotNull, varchar(30)} */
    protected String _warehouseplantname;

    /** WareHouseName: {NotNull, varchar(60)} */
    protected String _warehousename;

    /** OrderDate: {NotNull, varchar(8)} */
    protected String _orderdate;

    /** DeliveryDate: {varchar(8)} */
    protected String _deliverydate;

    /** PurchaseNumber: {varchar(100)} */
    protected String _purchasenumber;

    /** OrderNumber: {NotNull, bigint(19)} */
    protected Long _ordernumber;

    /** ItemLineNo: {NotNull, varchar(30)} */
    protected String _itemlineno;

    /** SkuCode: {NotNull, varchar(30)} */
    protected String _skucode;

    /** CardBoard: {bigint(19)} */
    protected Long _cardboard;

    /** CarTon: {bigint(19)} */
    protected Long _carton;

    /** TotalExpectQty: {bigint(19)} */
    protected Long _totalexpectqty;

    /** TotalCardBoardQty: {bigint(19)} */
    protected Long _totalcardboardqty;

    /** TotalCarTonQty: {bigint(19)} */
    protected Long _totalcartonqty;

    /** Note: {varchar(4000)} */
    protected String _note;

    /** Reserve2: {varchar(255)} */
    protected String _reserve2;

    /** Reserve3: {varchar(255)} */
    protected String _reserve3;

    /** Reserve: {varchar(255)} */
    protected String _reserve;

    /** CenterId: {NotNull, bigint(19)} */
    protected Long _centerid;

    /** ClientId: {NotNull, bigint(19)} */
    protected Long _clientid;

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
        return "T_TRSORCVDIRECT";
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
        if (_sojtlineid == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
        if (obj instanceof BsTTrsorcvdirect) {
            BsTTrsorcvdirect other = (BsTTrsorcvdirect)obj;
            if (!xSV(_sojtlineid, other._sojtlineid)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sojtlineid);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sojtlineid));
        sb.append(dm).append(xfND(_sorcvdirectkey));
        sb.append(dm).append(xfND(_instructionsdate));
        sb.append(dm).append(xfND(_ownerdirectno));
        sb.append(dm).append(xfND(_salestype));
        sb.append(dm).append(xfND(_salestypecd));
        sb.append(dm).append(xfND(_shiptocode));
        sb.append(dm).append(xfND(_originalpono));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_expectqty));
        sb.append(dm).append(xfND(_planprice));
        sb.append(dm).append(xfND(_planpricetotal));
        sb.append(dm).append(xfND(_planname));
        sb.append(dm).append(xfND(_planpost));
        sb.append(dm).append(xfND(_planaddress1));
        sb.append(dm).append(xfND(_planaddress2));
        sb.append(dm).append(xfND(_planitemname));
        sb.append(dm).append(xfND(_warehouseplant));
        sb.append(dm).append(xfND(_warehouseplantname));
        sb.append(dm).append(xfND(_warehousename));
        sb.append(dm).append(xfND(_orderdate));
        sb.append(dm).append(xfND(_deliverydate));
        sb.append(dm).append(xfND(_purchasenumber));
        sb.append(dm).append(xfND(_ordernumber));
        sb.append(dm).append(xfND(_itemlineno));
        sb.append(dm).append(xfND(_skucode));
        sb.append(dm).append(xfND(_cardboard));
        sb.append(dm).append(xfND(_carton));
        sb.append(dm).append(xfND(_totalexpectqty));
        sb.append(dm).append(xfND(_totalcardboardqty));
        sb.append(dm).append(xfND(_totalcartonqty));
        sb.append(dm).append(xfND(_note));
        sb.append(dm).append(xfND(_reserve2));
        sb.append(dm).append(xfND(_reserve3));
        sb.append(dm).append(xfND(_reserve));
        sb.append(dm).append(xfND(_centerid));
        sb.append(dm).append(xfND(_clientid));
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
    public TTrsorcvdirect clone() {
        return (TTrsorcvdirect)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫/出庫依頼書印刷ID
     * @return The value of the column 'SOJTLINEID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSojtlineid() {
        checkSpecifiedProperty("sojtlineid");
        return _sojtlineid;
    }

    /**
     * [set] SOJTLINEID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 入庫/出庫依頼書印刷ID
     * @param sojtlineid The value of the column 'SOJTLINEID'. (basically NotNull if update: for the constraint)
     */
    public void setSojtlineid(Long sojtlineid) {
        registerModifiedProperty("sojtlineid");
        _sojtlineid = sojtlineid;
    }

    /**
     * [get] SoRcvDirectKey: {bigint(19)} <br>
     * 入庫/出庫依頼書印刷Key
     * @return The value of the column 'SoRcvDirectKey'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSorcvdirectkey() {
        checkSpecifiedProperty("sorcvdirectkey");
        return _sorcvdirectkey;
    }

    /**
     * [set] SoRcvDirectKey: {bigint(19)} <br>
     * 入庫/出庫依頼書印刷Key
     * @param sorcvdirectkey The value of the column 'SoRcvDirectKey'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSorcvdirectkey(Long sorcvdirectkey) {
        registerModifiedProperty("sorcvdirectkey");
        _sorcvdirectkey = sorcvdirectkey;
    }

    /**
     * [get] InstructionsDate: {NotNull, varchar(8)} <br>
     * 指図日
     * @return The value of the column 'InstructionsDate'. (basically NotNull if selected: for the constraint)
     */
    public String getInstructionsdate() {
        checkSpecifiedProperty("instructionsdate");
        return convertEmptyToNull(_instructionsdate);
    }

    /**
     * [set] InstructionsDate: {NotNull, varchar(8)} <br>
     * 指図日
     * @param instructionsdate The value of the column 'InstructionsDate'. (basically NotNull if update: for the constraint)
     */
    public void setInstructionsdate(String instructionsdate) {
        registerModifiedProperty("instructionsdate");
        _instructionsdate = instructionsdate;
    }

    /**
     * [get] OwnerDirectNo: {NotNull, varchar(30)} <br>
     * 出庫伝票番号
     * @return The value of the column 'OwnerDirectNo'. (basically NotNull if selected: for the constraint)
     */
    public String getOwnerdirectno() {
        checkSpecifiedProperty("ownerdirectno");
        return convertEmptyToNull(_ownerdirectno);
    }

    /**
     * [set] OwnerDirectNo: {NotNull, varchar(30)} <br>
     * 出庫伝票番号
     * @param ownerdirectno The value of the column 'OwnerDirectNo'. (basically NotNull if update: for the constraint)
     */
    public void setOwnerdirectno(String ownerdirectno) {
        registerModifiedProperty("ownerdirectno");
        _ownerdirectno = ownerdirectno;
    }

    /**
     * [get] SalesType: {NotNull, varchar(30)} <br>
     * 売上種別
     * @return The value of the column 'SalesType'. (basically NotNull if selected: for the constraint)
     */
    public String getSalestype() {
        checkSpecifiedProperty("salestype");
        return convertEmptyToNull(_salestype);
    }

    /**
     * [set] SalesType: {NotNull, varchar(30)} <br>
     * 売上種別
     * @param salestype The value of the column 'SalesType'. (basically NotNull if update: for the constraint)
     */
    public void setSalestype(String salestype) {
        registerModifiedProperty("salestype");
        _salestype = salestype;
    }

    /**
     * [get] SalesTypeCd: {NotNull, char(1)} <br>
     * 売上種別（CD）
     * @return The value of the column 'SalesTypeCd'. (basically NotNull if selected: for the constraint)
     */
    public String getSalestypecd() {
        checkSpecifiedProperty("salestypecd");
        return convertEmptyToNull(_salestypecd);
    }

    /**
     * [set] SalesTypeCd: {NotNull, char(1)} <br>
     * 売上種別（CD）
     * @param salestypecd The value of the column 'SalesTypeCd'. (basically NotNull if update: for the constraint)
     */
    public void setSalestypecd(String salestypecd) {
        registerModifiedProperty("salestypecd");
        _salestypecd = salestypecd;
    }

    /**
     * [get] ShipToCode: {NotNull, varchar(30)} <br>
     * 出庫先CD
     * @return The value of the column 'ShipToCode'. (basically NotNull if selected: for the constraint)
     */
    public String getShiptocode() {
        checkSpecifiedProperty("shiptocode");
        return convertEmptyToNull(_shiptocode);
    }

    /**
     * [set] ShipToCode: {NotNull, varchar(30)} <br>
     * 出庫先CD
     * @param shiptocode The value of the column 'ShipToCode'. (basically NotNull if update: for the constraint)
     */
    public void setShiptocode(String shiptocode) {
        registerModifiedProperty("shiptocode");
        _shiptocode = shiptocode;
    }

    /**
     * [get] OriginalPONo: {NotNull, varchar(30)} <br>
     * 特約店CD
     * @return The value of the column 'OriginalPONo'. (basically NotNull if selected: for the constraint)
     */
    public String getOriginalpono() {
        checkSpecifiedProperty("originalpono");
        return convertEmptyToNull(_originalpono);
    }

    /**
     * [set] OriginalPONo: {NotNull, varchar(30)} <br>
     * 特約店CD
     * @param originalpono The value of the column 'OriginalPONo'. (basically NotNull if update: for the constraint)
     */
    public void setOriginalpono(String originalpono) {
        registerModifiedProperty("originalpono");
        _originalpono = originalpono;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, bigint(19)} <br>
     * 銘柄ID
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] ExpectQty: {NotNull, bigint(19)} <br>
     * 受注数量
     * @return The value of the column 'ExpectQty'. (basically NotNull if selected: for the constraint)
     */
    public Long getExpectqty() {
        checkSpecifiedProperty("expectqty");
        return _expectqty;
    }

    /**
     * [set] ExpectQty: {NotNull, bigint(19)} <br>
     * 受注数量
     * @param expectqty The value of the column 'ExpectQty'. (basically NotNull if update: for the constraint)
     */
    public void setExpectqty(Long expectqty) {
        registerModifiedProperty("expectqty");
        _expectqty = expectqty;
    }

    /**
     * [get] PlanPrice: {NotNull, bigint(19)} <br>
     * 単価
     * @return The value of the column 'PlanPrice'. (basically NotNull if selected: for the constraint)
     */
    public Long getPlanprice() {
        checkSpecifiedProperty("planprice");
        return _planprice;
    }

    /**
     * [set] PlanPrice: {NotNull, bigint(19)} <br>
     * 単価
     * @param planprice The value of the column 'PlanPrice'. (basically NotNull if update: for the constraint)
     */
    public void setPlanprice(Long planprice) {
        registerModifiedProperty("planprice");
        _planprice = planprice;
    }

    /**
     * [get] PlanPriceTotal: {NotNull, bigint(19)} <br>
     * 売上金額
     * @return The value of the column 'PlanPriceTotal'. (basically NotNull if selected: for the constraint)
     */
    public Long getPlanpricetotal() {
        checkSpecifiedProperty("planpricetotal");
        return _planpricetotal;
    }

    /**
     * [set] PlanPriceTotal: {NotNull, bigint(19)} <br>
     * 売上金額
     * @param planpricetotal The value of the column 'PlanPriceTotal'. (basically NotNull if update: for the constraint)
     */
    public void setPlanpricetotal(Long planpricetotal) {
        registerModifiedProperty("planpricetotal");
        _planpricetotal = planpricetotal;
    }

    /**
     * [get] PlanName: {NotNull, varchar(100)} <br>
     * 出庫先名称
     * @return The value of the column 'PlanName'. (basically NotNull if selected: for the constraint)
     */
    public String getPlanname() {
        checkSpecifiedProperty("planname");
        return convertEmptyToNull(_planname);
    }

    /**
     * [set] PlanName: {NotNull, varchar(100)} <br>
     * 出庫先名称
     * @param planname The value of the column 'PlanName'. (basically NotNull if update: for the constraint)
     */
    public void setPlanname(String planname) {
        registerModifiedProperty("planname");
        _planname = planname;
    }

    /**
     * [get] PlanPost: {NotNull, varchar(30)} <br>
     * 出庫先郵便番号
     * @return The value of the column 'PlanPost'. (basically NotNull if selected: for the constraint)
     */
    public String getPlanpost() {
        checkSpecifiedProperty("planpost");
        return convertEmptyToNull(_planpost);
    }

    /**
     * [set] PlanPost: {NotNull, varchar(30)} <br>
     * 出庫先郵便番号
     * @param planpost The value of the column 'PlanPost'. (basically NotNull if update: for the constraint)
     */
    public void setPlanpost(String planpost) {
        registerModifiedProperty("planpost");
        _planpost = planpost;
    }

    /**
     * [get] PlanAddress1: {NotNull, varchar(100)} <br>
     * 出庫先住所1
     * @return The value of the column 'PlanAddress1'. (basically NotNull if selected: for the constraint)
     */
    public String getPlanaddress1() {
        checkSpecifiedProperty("planaddress1");
        return convertEmptyToNull(_planaddress1);
    }

    /**
     * [set] PlanAddress1: {NotNull, varchar(100)} <br>
     * 出庫先住所1
     * @param planaddress1 The value of the column 'PlanAddress1'. (basically NotNull if update: for the constraint)
     */
    public void setPlanaddress1(String planaddress1) {
        registerModifiedProperty("planaddress1");
        _planaddress1 = planaddress1;
    }

    /**
     * [get] PlanAddress2: {NotNull, varchar(255)} <br>
     * 出庫先住所2
     * @return The value of the column 'PlanAddress2'. (basically NotNull if selected: for the constraint)
     */
    public String getPlanaddress2() {
        checkSpecifiedProperty("planaddress2");
        return convertEmptyToNull(_planaddress2);
    }

    /**
     * [set] PlanAddress2: {NotNull, varchar(255)} <br>
     * 出庫先住所2
     * @param planaddress2 The value of the column 'PlanAddress2'. (basically NotNull if update: for the constraint)
     */
    public void setPlanaddress2(String planaddress2) {
        registerModifiedProperty("planaddress2");
        _planaddress2 = planaddress2;
    }

    /**
     * [get] PlanItemName: {varchar(255)} <br>
     * 銘柄テキスト
     * @return The value of the column 'PlanItemName'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlanitemname() {
        checkSpecifiedProperty("planitemname");
        return convertEmptyToNull(_planitemname);
    }

    /**
     * [set] PlanItemName: {varchar(255)} <br>
     * 銘柄テキスト
     * @param planitemname The value of the column 'PlanItemName'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlanitemname(String planitemname) {
        registerModifiedProperty("planitemname");
        _planitemname = planitemname;
    }

    /**
     * [get] WareHousePlant: {NotNull, varchar(30)} <br>
     * 出庫プラント
     * @return The value of the column 'WareHousePlant'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseplant() {
        checkSpecifiedProperty("warehouseplant");
        return convertEmptyToNull(_warehouseplant);
    }

    /**
     * [set] WareHousePlant: {NotNull, varchar(30)} <br>
     * 出庫プラント
     * @param warehouseplant The value of the column 'WareHousePlant'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseplant(String warehouseplant) {
        registerModifiedProperty("warehouseplant");
        _warehouseplant = warehouseplant;
    }

    /**
     * [get] WareHousePlantName: {NotNull, varchar(30)} <br>
     * 出庫プラント名称
     * @return The value of the column 'WareHousePlantName'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehouseplantname() {
        checkSpecifiedProperty("warehouseplantname");
        return convertEmptyToNull(_warehouseplantname);
    }

    /**
     * [set] WareHousePlantName: {NotNull, varchar(30)} <br>
     * 出庫プラント名称
     * @param warehouseplantname The value of the column 'WareHousePlantName'. (basically NotNull if update: for the constraint)
     */
    public void setWarehouseplantname(String warehouseplantname) {
        registerModifiedProperty("warehouseplantname");
        _warehouseplantname = warehouseplantname;
    }

    /**
     * [get] WareHouseName: {NotNull, varchar(60)} <br>
     * 倉庫名
     * @return The value of the column 'WareHouseName'. (basically NotNull if selected: for the constraint)
     */
    public String getWarehousename() {
        checkSpecifiedProperty("warehousename");
        return convertEmptyToNull(_warehousename);
    }

    /**
     * [set] WareHouseName: {NotNull, varchar(60)} <br>
     * 倉庫名
     * @param warehousename The value of the column 'WareHouseName'. (basically NotNull if update: for the constraint)
     */
    public void setWarehousename(String warehousename) {
        registerModifiedProperty("warehousename");
        _warehousename = warehousename;
    }

    /**
     * [get] OrderDate: {NotNull, varchar(8)} <br>
     * 受注日
     * @return The value of the column 'OrderDate'. (basically NotNull if selected: for the constraint)
     */
    public String getOrderdate() {
        checkSpecifiedProperty("orderdate");
        return convertEmptyToNull(_orderdate);
    }

    /**
     * [set] OrderDate: {NotNull, varchar(8)} <br>
     * 受注日
     * @param orderdate The value of the column 'OrderDate'. (basically NotNull if update: for the constraint)
     */
    public void setOrderdate(String orderdate) {
        registerModifiedProperty("orderdate");
        _orderdate = orderdate;
    }

    /**
     * [get] DeliveryDate: {varchar(8)} <br>
     * 納品日
     * @return The value of the column 'DeliveryDate'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliverydate() {
        checkSpecifiedProperty("deliverydate");
        return convertEmptyToNull(_deliverydate);
    }

    /**
     * [set] DeliveryDate: {varchar(8)} <br>
     * 納品日
     * @param deliverydate The value of the column 'DeliveryDate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliverydate(String deliverydate) {
        registerModifiedProperty("deliverydate");
        _deliverydate = deliverydate;
    }

    /**
     * [get] PurchaseNumber: {varchar(100)} <br>
     * 発注番号
     * @return The value of the column 'PurchaseNumber'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchasenumber() {
        checkSpecifiedProperty("purchasenumber");
        return convertEmptyToNull(_purchasenumber);
    }

    /**
     * [set] PurchaseNumber: {varchar(100)} <br>
     * 発注番号
     * @param purchasenumber The value of the column 'PurchaseNumber'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasenumber(String purchasenumber) {
        registerModifiedProperty("purchasenumber");
        _purchasenumber = purchasenumber;
    }

    /**
     * [get] OrderNumber: {NotNull, bigint(19)} <br>
     * 受注番号
     * @return The value of the column 'OrderNumber'. (basically NotNull if selected: for the constraint)
     */
    public Long getOrdernumber() {
        checkSpecifiedProperty("ordernumber");
        return _ordernumber;
    }

    /**
     * [set] OrderNumber: {NotNull, bigint(19)} <br>
     * 受注番号
     * @param ordernumber The value of the column 'OrderNumber'. (basically NotNull if update: for the constraint)
     */
    public void setOrdernumber(Long ordernumber) {
        registerModifiedProperty("ordernumber");
        _ordernumber = ordernumber;
    }

    /**
     * [get] ItemLineNo: {NotNull, varchar(30)} <br>
     * No.
     * @return The value of the column 'ItemLineNo'. (basically NotNull if selected: for the constraint)
     */
    public String getItemlineno() {
        checkSpecifiedProperty("itemlineno");
        return convertEmptyToNull(_itemlineno);
    }

    /**
     * [set] ItemLineNo: {NotNull, varchar(30)} <br>
     * No.
     * @param itemlineno The value of the column 'ItemLineNo'. (basically NotNull if update: for the constraint)
     */
    public void setItemlineno(String itemlineno) {
        registerModifiedProperty("itemlineno");
        _itemlineno = itemlineno;
    }

    /**
     * [get] SkuCode: {NotNull, varchar(30)} <br>
     * SKU Code
     * @return The value of the column 'SkuCode'. (basically NotNull if selected: for the constraint)
     */
    public String getSkucode() {
        checkSpecifiedProperty("skucode");
        return convertEmptyToNull(_skucode);
    }

    /**
     * [set] SkuCode: {NotNull, varchar(30)} <br>
     * SKU Code
     * @param skucode The value of the column 'SkuCode'. (basically NotNull if update: for the constraint)
     */
    public void setSkucode(String skucode) {
        registerModifiedProperty("skucode");
        _skucode = skucode;
    }

    /**
     * [get] CardBoard: {bigint(19)} <br>
     * 段ボール
     * @return The value of the column 'CardBoard'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCardboard() {
        checkSpecifiedProperty("cardboard");
        return _cardboard;
    }

    /**
     * [set] CardBoard: {bigint(19)} <br>
     * 段ボール
     * @param cardboard The value of the column 'CardBoard'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCardboard(Long cardboard) {
        registerModifiedProperty("cardboard");
        _cardboard = cardboard;
    }

    /**
     * [get] CarTon: {bigint(19)} <br>
     * カートン
     * @return The value of the column 'CarTon'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCarton() {
        checkSpecifiedProperty("carton");
        return _carton;
    }

    /**
     * [set] CarTon: {bigint(19)} <br>
     * カートン
     * @param carton The value of the column 'CarTon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarton(Long carton) {
        registerModifiedProperty("carton");
        _carton = carton;
    }

    /**
     * [get] TotalExpectQty: {bigint(19)} <br>
     * 合計（受注数）
     * @return The value of the column 'TotalExpectQty'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalexpectqty() {
        checkSpecifiedProperty("totalexpectqty");
        return _totalexpectqty;
    }

    /**
     * [set] TotalExpectQty: {bigint(19)} <br>
     * 合計（受注数）
     * @param totalexpectqty The value of the column 'TotalExpectQty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalexpectqty(Long totalexpectqty) {
        registerModifiedProperty("totalexpectqty");
        _totalexpectqty = totalexpectqty;
    }

    /**
     * [get] TotalCardBoardQty: {bigint(19)} <br>
     * 合計（段ボール）
     * @return The value of the column 'TotalCardBoardQty'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalcardboardqty() {
        checkSpecifiedProperty("totalcardboardqty");
        return _totalcardboardqty;
    }

    /**
     * [set] TotalCardBoardQty: {bigint(19)} <br>
     * 合計（段ボール）
     * @param totalcardboardqty The value of the column 'TotalCardBoardQty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalcardboardqty(Long totalcardboardqty) {
        registerModifiedProperty("totalcardboardqty");
        _totalcardboardqty = totalcardboardqty;
    }

    /**
     * [get] TotalCarTonQty: {bigint(19)} <br>
     * 合計（カートン）
     * @return The value of the column 'TotalCarTonQty'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTotalcartonqty() {
        checkSpecifiedProperty("totalcartonqty");
        return _totalcartonqty;
    }

    /**
     * [set] TotalCarTonQty: {bigint(19)} <br>
     * 合計（カートン）
     * @param totalcartonqty The value of the column 'TotalCarTonQty'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalcartonqty(Long totalcartonqty) {
        registerModifiedProperty("totalcartonqty");
        _totalcartonqty = totalcartonqty;
    }

    /**
     * [get] Note: {varchar(4000)} <br>
     * 備考
     * @return The value of the column 'Note'. (NullAllowed even if selected: for no constraint)
     */
    public String getNote() {
        checkSpecifiedProperty("note");
        return convertEmptyToNull(_note);
    }

    /**
     * [set] Note: {varchar(4000)} <br>
     * 備考
     * @param note The value of the column 'Note'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNote(String note) {
        registerModifiedProperty("note");
        _note = note;
    }

    /**
     * [get] Reserve2: {varchar(255)} <br>
     * 予備2
     * @return The value of the column 'Reserve2'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve2() {
        checkSpecifiedProperty("reserve2");
        return convertEmptyToNull(_reserve2);
    }

    /**
     * [set] Reserve2: {varchar(255)} <br>
     * 予備2
     * @param reserve2 The value of the column 'Reserve2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve2(String reserve2) {
        registerModifiedProperty("reserve2");
        _reserve2 = reserve2;
    }

    /**
     * [get] Reserve3: {varchar(255)} <br>
     * 予備3
     * @return The value of the column 'Reserve3'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve3() {
        checkSpecifiedProperty("reserve3");
        return convertEmptyToNull(_reserve3);
    }

    /**
     * [set] Reserve3: {varchar(255)} <br>
     * 予備3
     * @param reserve3 The value of the column 'Reserve3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve3(String reserve3) {
        registerModifiedProperty("reserve3");
        _reserve3 = reserve3;
    }

    /**
     * [get] Reserve: {varchar(255)} <br>
     * 予備
     * @return The value of the column 'Reserve'. (NullAllowed even if selected: for no constraint)
     */
    public String getReserve() {
        checkSpecifiedProperty("reserve");
        return convertEmptyToNull(_reserve);
    }

    /**
     * [set] Reserve: {varchar(255)} <br>
     * 予備
     * @param reserve The value of the column 'Reserve'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReserve(String reserve) {
        registerModifiedProperty("reserve");
        _reserve = reserve;
    }

    /**
     * [get] CenterId: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @return The value of the column 'CenterId'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterid() {
        checkSpecifiedProperty("centerid");
        return _centerid;
    }

    /**
     * [set] CenterId: {NotNull, bigint(19)} <br>
     * 拠点ID
     * @param centerid The value of the column 'CenterId'. (basically NotNull if update: for the constraint)
     */
    public void setCenterid(Long centerid) {
        registerModifiedProperty("centerid");
        _centerid = centerid;
    }

    /**
     * [get] ClientId: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @return The value of the column 'ClientId'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientid() {
        checkSpecifiedProperty("clientid");
        return _clientid;
    }

    /**
     * [set] ClientId: {NotNull, bigint(19)} <br>
     * 荷主ID
     * @param clientid The value of the column 'ClientId'. (basically NotNull if update: for the constraint)
     */
    public void setClientid(Long clientid) {
        registerModifiedProperty("clientid");
        _clientid = clientid;
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
