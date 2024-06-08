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
 * The entity of M_IMPORT_TYPE as TABLE. <br>
 * 取込種別マスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_ID
 *
 * [column]
 *     IMPORT_TYPE_ID, CLIENT_ID, IMPORT_TYPE_CD, IMPORT_TYPE_NM, EDI_ID, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DUPLICATE_COLUMN_NM, RCV_ID_COLUMN_NM, ROW_NO_COLUMN_NM, GIFT_STATEMENT_TYPE, GIFT_STATEMENT_DETAIL, O_KEEPING_DAYS, STATEMENT_TITLE, STATEMENT_URL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_EDI, B_CLASS_DTL(ByGiftStatementType)
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B, T_EC_ORDER_H
 *
 * [foreign property]
 *     mClient, mEdi, bClassDtlByGiftStatementType, bClassDtlByLineFeedCd, bClassDtlByUploadTableNm
 *
 * [referrer property]
 *     mImportTypeBList, tEcOrderHList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long importTypeId = entity.getImportTypeId();
 * Long clientId = entity.getClientId();
 * String importTypeCd = entity.getImportTypeCd();
 * String importTypeNm = entity.getImportTypeNm();
 * Long ediId = entity.getEdiId();
 * String characterCd = entity.getCharacterCd();
 * String lineFeedCd = entity.getLineFeedCd();
 * String delimiter = entity.getDelimiter();
 * Long skippingRows = entity.getSkippingRows();
 * String uploadTableNm = entity.getUploadTableNm();
 * String duplicateColumnNm = entity.getDuplicateColumnNm();
 * String rcvIdColumnNm = entity.getRcvIdColumnNm();
 * String rowNoColumnNm = entity.getRowNoColumnNm();
 * String giftStatementType = entity.getGiftStatementType();
 * String giftStatementDetail = entity.getGiftStatementDetail();
 * Long oKeepingDays = entity.getOKeepingDays();
 * String statementTitle = entity.getStatementTitle();
 * String statementUrl = entity.getStatementUrl();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setImportTypeId(importTypeId);
 * entity.setClientId(clientId);
 * entity.setImportTypeCd(importTypeCd);
 * entity.setImportTypeNm(importTypeNm);
 * entity.setEdiId(ediId);
 * entity.setCharacterCd(characterCd);
 * entity.setLineFeedCd(lineFeedCd);
 * entity.setDelimiter(delimiter);
 * entity.setSkippingRows(skippingRows);
 * entity.setUploadTableNm(uploadTableNm);
 * entity.setDuplicateColumnNm(duplicateColumnNm);
 * entity.setRcvIdColumnNm(rcvIdColumnNm);
 * entity.setRowNoColumnNm(rowNoColumnNm);
 * entity.setGiftStatementType(giftStatementType);
 * entity.setGiftStatementDetail(giftStatementDetail);
 * entity.setOKeepingDays(oKeepingDays);
 * entity.setStatementTitle(statementTitle);
 * entity.setStatementUrl(statementUrl);
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
public abstract class BsMImportType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _importTypeId;

    /** CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} */
    protected Long _clientId;

    /** IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} */
    protected String _importTypeCd;

    /** IMPORT_TYPE_NM: {NotNull, varchar(60)} */
    protected String _importTypeNm;

    /** EDI_ID: {IX, bigint(19), FK to M_EDI} */
    protected Long _ediId;

    /** CHARACTER_CD: {varchar(30)} */
    protected String _characterCd;

    /** LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} */
    protected String _lineFeedCd;

    /** DELIMITER: {varchar(30)} */
    protected String _delimiter;

    /** SKIPPING_ROWS: {bigint(19), default=[(0)]} */
    protected Long _skippingRows;

    /** UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} */
    protected String _uploadTableNm;

    /** DUPLICATE_COLUMN_NM: {varchar(30)} */
    protected String _duplicateColumnNm;

    /** RCV_ID_COLUMN_NM: {varchar(30)} */
    protected String _rcvIdColumnNm;

    /** ROW_NO_COLUMN_NM: {varchar(30)} */
    protected String _rowNoColumnNm;

    /** GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} */
    protected String _giftStatementType;

    /** GIFT_STATEMENT_DETAIL: {varchar(255)} */
    protected String _giftStatementDetail;

    /** O_KEEPING_DAYS: {NotNull, bigint(19)} */
    protected Long _oKeepingDays;

    /** STATEMENT_TITLE: {varchar(255)} */
    protected String _statementTitle;

    /** STATEMENT_URL: {varchar(255)} */
    protected String _statementUrl;

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
        return "M_IMPORT_TYPE";
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
        if (_importTypeId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param importTypeCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(Long clientId, String importTypeCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("clientId");
        __uniqueDrivenProperties.addPropertyName("importTypeCd");
        setClientId(clientId);setImportTypeCd(importTypeCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lineFeedCd as the classification of LineFeedCd. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LineFeedCd getLineFeedCdAsLineFeedCd() {
        return CDef.LineFeedCd.codeOf(getLineFeedCd());
    }

    /**
     * Set the value of lineFeedCd as the classification of LineFeedCd. <br>
     * LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLineFeedCdAsLineFeedCd(CDef.LineFeedCd cdef) {
        setLineFeedCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of uploadTableNm as the classification of UploadTableNm. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UploadTableNm getUploadTableNmAsUploadTableNm() {
        return CDef.UploadTableNm.codeOf(getUploadTableNm());
    }

    /**
     * Set the value of uploadTableNm as the classification of UploadTableNm. <br>
     * UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUploadTableNmAsUploadTableNm(CDef.UploadTableNm cdef) {
        setUploadTableNm(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of giftStatementType as the classification of GiftStatementType. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GiftStatementType getGiftStatementTypeAsGiftStatementType() {
        return CDef.GiftStatementType.codeOf(getGiftStatementType());
    }

    /**
     * Set the value of giftStatementType as the classification of GiftStatementType. <br>
     * GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGiftStatementTypeAsGiftStatementType(CDef.GiftStatementType cdef) {
        setGiftStatementType(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of lineFeedCd as $1 (1). <br>
     * $1: CRLF
     */
    public void setLineFeedCd_$1() {
        setLineFeedCdAsLineFeedCd(CDef.LineFeedCd.$1);
    }

    /**
     * Set the value of lineFeedCd as $2 (2). <br>
     * $2: CR
     */
    public void setLineFeedCd_$2() {
        setLineFeedCdAsLineFeedCd(CDef.LineFeedCd.$2);
    }

    /**
     * Set the value of lineFeedCd as $3 (3). <br>
     * $3: LF
     */
    public void setLineFeedCd_$3() {
        setLineFeedCdAsLineFeedCd(CDef.LineFeedCd.$3);
    }

    /**
     * Set the value of uploadTableNm as $tAmazonOrder (tAmazonOrder). <br>
     * $tAmazonOrder: Amazon受注
     */
    public void setUploadTableNm_$tAmazonOrder() {
        setUploadTableNmAsUploadTableNm(CDef.UploadTableNm.$tAmazonOrder);
    }

    /**
     * Set the value of uploadTableNm as $tRakutenOrder (tRakutenOrder). <br>
     * $tRakutenOrder: 楽天RMS受注
     */
    public void setUploadTableNm_$tRakutenOrder() {
        setUploadTableNmAsUploadTableNm(CDef.UploadTableNm.$tRakutenOrder);
    }

    /**
     * Set the value of uploadTableNm as $tYahooOrder (tYahooOrder). <br>
     * $tYahooOrder: Yahoo受注
     */
    public void setUploadTableNm_$tYahooOrder() {
        setUploadTableNmAsUploadTableNm(CDef.UploadTableNm.$tYahooOrder);
    }

    /**
     * Set the value of giftStatementType as $0 (0). <br>
     * $0: 通常
     */
    public void setGiftStatementType_$0() {
        setGiftStatementTypeAsGiftStatementType(CDef.GiftStatementType.$0);
    }

    /**
     * Set the value of giftStatementType as $1 (1). <br>
     * $1: 金額非表示
     */
    public void setGiftStatementType_$1() {
        setGiftStatementTypeAsGiftStatementType(CDef.GiftStatementType.$1);
    }

    /**
     * Set the value of giftStatementType as $2 (2). <br>
     * $2: 明細非表示
     */
    public void setGiftStatementType_$2() {
        setGiftStatementTypeAsGiftStatementType(CDef.GiftStatementType.$2);
    }

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
     * Is the value of lineFeedCd $1? <br>
     * $1: CRLF
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineFeedCd$1() {
        CDef.LineFeedCd cdef = getLineFeedCdAsLineFeedCd();
        return cdef != null ? cdef.equals(CDef.LineFeedCd.$1) : false;
    }

    /**
     * Is the value of lineFeedCd $2? <br>
     * $2: CR
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineFeedCd$2() {
        CDef.LineFeedCd cdef = getLineFeedCdAsLineFeedCd();
        return cdef != null ? cdef.equals(CDef.LineFeedCd.$2) : false;
    }

    /**
     * Is the value of lineFeedCd $3? <br>
     * $3: LF
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineFeedCd$3() {
        CDef.LineFeedCd cdef = getLineFeedCdAsLineFeedCd();
        return cdef != null ? cdef.equals(CDef.LineFeedCd.$3) : false;
    }

    /**
     * Is the value of uploadTableNm $tAmazonOrder? <br>
     * $tAmazonOrder: Amazon受注
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUploadTableNm$tAmazonOrder() {
        CDef.UploadTableNm cdef = getUploadTableNmAsUploadTableNm();
        return cdef != null ? cdef.equals(CDef.UploadTableNm.$tAmazonOrder) : false;
    }

    /**
     * Is the value of uploadTableNm $tRakutenOrder? <br>
     * $tRakutenOrder: 楽天RMS受注
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUploadTableNm$tRakutenOrder() {
        CDef.UploadTableNm cdef = getUploadTableNmAsUploadTableNm();
        return cdef != null ? cdef.equals(CDef.UploadTableNm.$tRakutenOrder) : false;
    }

    /**
     * Is the value of uploadTableNm $tYahooOrder? <br>
     * $tYahooOrder: Yahoo受注
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUploadTableNm$tYahooOrder() {
        CDef.UploadTableNm cdef = getUploadTableNmAsUploadTableNm();
        return cdef != null ? cdef.equals(CDef.UploadTableNm.$tYahooOrder) : false;
    }

    /**
     * Is the value of giftStatementType $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiftStatementType$0() {
        CDef.GiftStatementType cdef = getGiftStatementTypeAsGiftStatementType();
        return cdef != null ? cdef.equals(CDef.GiftStatementType.$0) : false;
    }

    /**
     * Is the value of giftStatementType $1? <br>
     * $1: 金額非表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiftStatementType$1() {
        CDef.GiftStatementType cdef = getGiftStatementTypeAsGiftStatementType();
        return cdef != null ? cdef.equals(CDef.GiftStatementType.$1) : false;
    }

    /**
     * Is the value of giftStatementType $2? <br>
     * $2: 明細非表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGiftStatementType$2() {
        CDef.GiftStatementType cdef = getGiftStatementTypeAsGiftStatementType();
        return cdef != null ? cdef.equals(CDef.GiftStatementType.$2) : false;
    }

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
     * Get the value of the column 'lineFeedCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLineFeedCdName() {
        CDef.LineFeedCd cdef = getLineFeedCdAsLineFeedCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'uploadTableNm' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUploadTableNmName() {
        CDef.UploadTableNm cdef = getUploadTableNmAsUploadTableNm();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'giftStatementType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getGiftStatementTypeName() {
        CDef.GiftStatementType cdef = getGiftStatementTypeAsGiftStatementType();
        return cdef != null ? cdef.name() : null;
    }

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
    /** M_CLIENT by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] M_CLIENT by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** M_EDI by my EDI_ID, named 'MEdi'. */
    protected MEdi _mEdi;

    /**
     * [get] M_EDI by my EDI_ID, named 'MEdi'. <br>
     * @return The entity of foreign property 'MEdi'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MEdi getMEdi() {
        return _mEdi;
    }

    /**
     * [set] M_EDI by my EDI_ID, named 'MEdi'.
     * @param mEdi The entity of foreign property 'MEdi'. (NullAllowed)
     */
    public void setMEdi(MEdi mEdi) {
        _mEdi = mEdi;
    }

    /** B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'. */
    protected BClassDtl _bClassDtlByGiftStatementType;

    /**
     * [get] B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'. <br>
     * @return The entity of foreign property 'BClassDtlByGiftStatementType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByGiftStatementType() {
        return _bClassDtlByGiftStatementType;
    }

    /**
     * [set] B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'.
     * @param bClassDtlByGiftStatementType The entity of foreign property 'BClassDtlByGiftStatementType'. (NullAllowed)
     */
    public void setBClassDtlByGiftStatementType(BClassDtl bClassDtlByGiftStatementType) {
        _bClassDtlByGiftStatementType = bClassDtlByGiftStatementType;
    }

    /** B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'. */
    protected BClassDtl _bClassDtlByLineFeedCd;

    /**
     * [get] B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'. <br>
     * @return The entity of foreign property 'BClassDtlByLineFeedCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByLineFeedCd() {
        return _bClassDtlByLineFeedCd;
    }

    /**
     * [set] B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'.
     * @param bClassDtlByLineFeedCd The entity of foreign property 'BClassDtlByLineFeedCd'. (NullAllowed)
     */
    public void setBClassDtlByLineFeedCd(BClassDtl bClassDtlByLineFeedCd) {
        _bClassDtlByLineFeedCd = bClassDtlByLineFeedCd;
    }

    /** B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'. */
    protected BClassDtl _bClassDtlByUploadTableNm;

    /**
     * [get] B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'. <br>
     * @return The entity of foreign property 'BClassDtlByUploadTableNm'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByUploadTableNm() {
        return _bClassDtlByUploadTableNm;
    }

    /**
     * [set] B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'.
     * @param bClassDtlByUploadTableNm The entity of foreign property 'BClassDtlByUploadTableNm'. (NullAllowed)
     */
    public void setBClassDtlByUploadTableNm(BClassDtl bClassDtlByUploadTableNm) {
        _bClassDtlByUploadTableNm = bClassDtlByUploadTableNm;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'. */
    protected List<MImportTypeB> _mImportTypeBList;

    /**
     * [get] M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * @return The entity list of referrer property 'MImportTypeBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MImportTypeB> getMImportTypeBList() {
        if (_mImportTypeBList == null) { _mImportTypeBList = newReferrerList(); }
        return _mImportTypeBList;
    }

    /**
     * [set] M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * @param mImportTypeBList The entity list of referrer property 'MImportTypeBList'. (NullAllowed)
     */
    public void setMImportTypeBList(List<MImportTypeB> mImportTypeBList) {
        _mImportTypeBList = mImportTypeBList;
    }

    /** T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMImportType) {
            BsMImportType other = (BsMImportType)obj;
            if (!xSV(_importTypeId, other._importTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _importTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mEdi != null)
        { sb.append(li).append(xbRDS(_mEdi, "mEdi")); }
        if (_bClassDtlByGiftStatementType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByGiftStatementType, "bClassDtlByGiftStatementType")); }
        if (_bClassDtlByLineFeedCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByLineFeedCd, "bClassDtlByLineFeedCd")); }
        if (_bClassDtlByUploadTableNm != null)
        { sb.append(li).append(xbRDS(_bClassDtlByUploadTableNm, "bClassDtlByUploadTableNm")); }
        if (_mImportTypeBList != null) { for (MImportTypeB et : _mImportTypeBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mImportTypeBList")); } } }
        if (_tEcOrderHList != null) { for (TEcOrderH et : _tEcOrderHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderHList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_importTypeId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_importTypeCd));
        sb.append(dm).append(xfND(_importTypeNm));
        sb.append(dm).append(xfND(_ediId));
        sb.append(dm).append(xfND(_characterCd));
        sb.append(dm).append(xfND(_lineFeedCd));
        sb.append(dm).append(xfND(_delimiter));
        sb.append(dm).append(xfND(_skippingRows));
        sb.append(dm).append(xfND(_uploadTableNm));
        sb.append(dm).append(xfND(_duplicateColumnNm));
        sb.append(dm).append(xfND(_rcvIdColumnNm));
        sb.append(dm).append(xfND(_rowNoColumnNm));
        sb.append(dm).append(xfND(_giftStatementType));
        sb.append(dm).append(xfND(_giftStatementDetail));
        sb.append(dm).append(xfND(_oKeepingDays));
        sb.append(dm).append(xfND(_statementTitle));
        sb.append(dm).append(xfND(_statementUrl));
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
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mEdi != null)
        { sb.append(dm).append("mEdi"); }
        if (_bClassDtlByGiftStatementType != null)
        { sb.append(dm).append("bClassDtlByGiftStatementType"); }
        if (_bClassDtlByLineFeedCd != null)
        { sb.append(dm).append("bClassDtlByLineFeedCd"); }
        if (_bClassDtlByUploadTableNm != null)
        { sb.append(dm).append("bClassDtlByUploadTableNm"); }
        if (_mImportTypeBList != null && !_mImportTypeBList.isEmpty())
        { sb.append(dm).append("mImportTypeBList"); }
        if (_tEcOrderHList != null && !_tEcOrderHList.isEmpty())
        { sb.append(dm).append("tEcOrderHList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MImportType clone() {
        return (MImportType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getImportTypeId() {
        checkSpecifiedProperty("importTypeId");
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImportTypeId(Long importTypeId) {
        registerModifiedProperty("importTypeId");
        _importTypeId = importTypeId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 取込種別CD
     * @return The value of the column 'IMPORT_TYPE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getImportTypeCd() {
        checkSpecifiedProperty("importTypeCd");
        return convertEmptyToNull(_importTypeCd);
    }

    /**
     * [set] IMPORT_TYPE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
     * 取込種別CD
     * @param importTypeCd The value of the column 'IMPORT_TYPE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setImportTypeCd(String importTypeCd) {
        registerModifiedProperty("importTypeCd");
        _importTypeCd = importTypeCd;
    }

    /**
     * [get] IMPORT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 取込種別名称
     * @return The value of the column 'IMPORT_TYPE_NM'. (basically NotNull if selected: for the constraint)
     */
    public String getImportTypeNm() {
        checkSpecifiedProperty("importTypeNm");
        return convertEmptyToNull(_importTypeNm);
    }

    /**
     * [set] IMPORT_TYPE_NM: {NotNull, varchar(60)} <br>
     * 取込種別名称
     * @param importTypeNm The value of the column 'IMPORT_TYPE_NM'. (basically NotNull if update: for the constraint)
     */
    public void setImportTypeNm(String importTypeNm) {
        registerModifiedProperty("importTypeNm");
        _importTypeNm = importTypeNm;
    }

    /**
     * [get] EDI_ID: {IX, bigint(19), FK to M_EDI} <br>
     * EDIID
     * @return The value of the column 'EDI_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEdiId() {
        checkSpecifiedProperty("ediId");
        return _ediId;
    }

    /**
     * [set] EDI_ID: {IX, bigint(19), FK to M_EDI} <br>
     * EDIID
     * @param ediId The value of the column 'EDI_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEdiId(Long ediId) {
        registerModifiedProperty("ediId");
        _ediId = ediId;
    }

    /**
     * [get] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @return The value of the column 'CHARACTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacterCd() {
        checkSpecifiedProperty("characterCd");
        return convertEmptyToNull(_characterCd);
    }

    /**
     * [set] CHARACTER_CD: {varchar(30)} <br>
     * 文字CD
     * @param characterCd The value of the column 'CHARACTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacterCd(String characterCd) {
        registerModifiedProperty("characterCd");
        _characterCd = characterCd;
    }

    /**
     * [get] LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行CD
     * @return The value of the column 'LINE_FEED_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineFeedCd() {
        checkSpecifiedProperty("lineFeedCd");
        return convertEmptyToNull(_lineFeedCd);
    }

    /**
     * [set] LINE_FEED_CD: {varchar(30), FK to B_CLASS_DTL, classification=LineFeedCd} <br>
     * 改行CD
     * @param lineFeedCd The value of the column 'LINE_FEED_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineFeedCd(String lineFeedCd) {
        registerModifiedProperty("lineFeedCd");
        _lineFeedCd = lineFeedCd;
    }

    /**
     * [get] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @return The value of the column 'DELIMITER'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelimiter() {
        checkSpecifiedProperty("delimiter");
        return convertEmptyToNull(_delimiter);
    }

    /**
     * [set] DELIMITER: {varchar(30)} <br>
     * 区切り文字
     * @param delimiter The value of the column 'DELIMITER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelimiter(String delimiter) {
        registerModifiedProperty("delimiter");
        _delimiter = delimiter;
    }

    /**
     * [get] SKIPPING_ROWS: {bigint(19), default=[(0)]} <br>
     * 読み飛ばし行数
     * @return The value of the column 'SKIPPING_ROWS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSkippingRows() {
        checkSpecifiedProperty("skippingRows");
        return _skippingRows;
    }

    /**
     * [set] SKIPPING_ROWS: {bigint(19), default=[(0)]} <br>
     * 読み飛ばし行数
     * @param skippingRows The value of the column 'SKIPPING_ROWS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSkippingRows(Long skippingRows) {
        registerModifiedProperty("skippingRows");
        _skippingRows = skippingRows;
    }

    /**
     * [get] UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @return The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUploadTableNm() {
        checkSpecifiedProperty("uploadTableNm");
        return convertEmptyToNull(_uploadTableNm);
    }

    /**
     * [set] UPLOAD_TABLE_NM: {varchar(100), FK to B_CLASS_DTL, classification=UploadTableNm} <br>
     * アップロードテーブル名
     * @param uploadTableNm The value of the column 'UPLOAD_TABLE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUploadTableNm(String uploadTableNm) {
        registerModifiedProperty("uploadTableNm");
        _uploadTableNm = uploadTableNm;
    }

    /**
     * [get] DUPLICATE_COLUMN_NM: {varchar(30)} <br>
     * 重複チェック列名
     * @return The value of the column 'DUPLICATE_COLUMN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDuplicateColumnNm() {
        checkSpecifiedProperty("duplicateColumnNm");
        return convertEmptyToNull(_duplicateColumnNm);
    }

    /**
     * [set] DUPLICATE_COLUMN_NM: {varchar(30)} <br>
     * 重複チェック列名
     * @param duplicateColumnNm The value of the column 'DUPLICATE_COLUMN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDuplicateColumnNm(String duplicateColumnNm) {
        registerModifiedProperty("duplicateColumnNm");
        _duplicateColumnNm = duplicateColumnNm;
    }

    /**
     * [get] RCV_ID_COLUMN_NM: {varchar(30)} <br>
     * 受信ID列名
     * @return The value of the column 'RCV_ID_COLUMN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRcvIdColumnNm() {
        checkSpecifiedProperty("rcvIdColumnNm");
        return convertEmptyToNull(_rcvIdColumnNm);
    }

    /**
     * [set] RCV_ID_COLUMN_NM: {varchar(30)} <br>
     * 受信ID列名
     * @param rcvIdColumnNm The value of the column 'RCV_ID_COLUMN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvIdColumnNm(String rcvIdColumnNm) {
        registerModifiedProperty("rcvIdColumnNm");
        _rcvIdColumnNm = rcvIdColumnNm;
    }

    /**
     * [get] ROW_NO_COLUMN_NM: {varchar(30)} <br>
     * 行番号列名
     * @return The value of the column 'ROW_NO_COLUMN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getRowNoColumnNm() {
        checkSpecifiedProperty("rowNoColumnNm");
        return convertEmptyToNull(_rowNoColumnNm);
    }

    /**
     * [set] ROW_NO_COLUMN_NM: {varchar(30)} <br>
     * 行番号列名
     * @param rowNoColumnNm The value of the column 'ROW_NO_COLUMN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRowNoColumnNm(String rowNoColumnNm) {
        registerModifiedProperty("rowNoColumnNm");
        _rowNoColumnNm = rowNoColumnNm;
    }

    /**
     * [get] GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種類
     * @return The value of the column 'GIFT_STATEMENT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getGiftStatementType() {
        checkSpecifiedProperty("giftStatementType");
        return convertEmptyToNull(_giftStatementType);
    }

    /**
     * [set] GIFT_STATEMENT_TYPE: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=GiftStatementType} <br>
     * ギフト用納品書種類
     * @param giftStatementType The value of the column 'GIFT_STATEMENT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setGiftStatementType(String giftStatementType) {
        registerModifiedProperty("giftStatementType");
        _giftStatementType = giftStatementType;
    }

    /**
     * [get] GIFT_STATEMENT_DETAIL: {varchar(255)} <br>
     * 納品書明細置換え文字列
     * @return The value of the column 'GIFT_STATEMENT_DETAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getGiftStatementDetail() {
        checkSpecifiedProperty("giftStatementDetail");
        return convertEmptyToNull(_giftStatementDetail);
    }

    /**
     * [set] GIFT_STATEMENT_DETAIL: {varchar(255)} <br>
     * 納品書明細置換え文字列
     * @param giftStatementDetail The value of the column 'GIFT_STATEMENT_DETAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGiftStatementDetail(String giftStatementDetail) {
        registerModifiedProperty("giftStatementDetail");
        _giftStatementDetail = giftStatementDetail;
    }

    /**
     * [get] O_KEEPING_DAYS: {NotNull, bigint(19)} <br>
     * 受注保持期間
     * @return The value of the column 'O_KEEPING_DAYS'. (basically NotNull if selected: for the constraint)
     */
    public Long getOKeepingDays() {
        checkSpecifiedProperty("OKeepingDays");
        return _oKeepingDays;
    }

    /**
     * [set] O_KEEPING_DAYS: {NotNull, bigint(19)} <br>
     * 受注保持期間
     * @param oKeepingDays The value of the column 'O_KEEPING_DAYS'. (basically NotNull if update: for the constraint)
     */
    public void setOKeepingDays(Long oKeepingDays) {
        registerModifiedProperty("OKeepingDays");
        _oKeepingDays = oKeepingDays;
    }

    /**
     * [get] STATEMENT_TITLE: {varchar(255)} <br>
     * 納品書タイトル
     * @return The value of the column 'STATEMENT_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatementTitle() {
        checkSpecifiedProperty("statementTitle");
        return convertEmptyToNull(_statementTitle);
    }

    /**
     * [set] STATEMENT_TITLE: {varchar(255)} <br>
     * 納品書タイトル
     * @param statementTitle The value of the column 'STATEMENT_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatementTitle(String statementTitle) {
        registerModifiedProperty("statementTitle");
        _statementTitle = statementTitle;
    }

    /**
     * [get] STATEMENT_URL: {varchar(255)} <br>
     * 納品書記載URL
     * @return The value of the column 'STATEMENT_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatementUrl() {
        checkSpecifiedProperty("statementUrl");
        return convertEmptyToNull(_statementUrl);
    }

    /**
     * [set] STATEMENT_URL: {varchar(255)} <br>
     * 納品書記載URL
     * @param statementUrl The value of the column 'STATEMENT_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatementUrl(String statementUrl) {
        registerModifiedProperty("statementUrl");
        _statementUrl = statementUrl;
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
