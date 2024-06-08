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
 * The entity of M_ZIP as TABLE. <br>
 * 郵便番号マスタ
 * <pre>
 * [primary-key]
 *     ZIP_ID
 *
 * [column]
 *     ZIP_ID, PUBLIC_CD, ZIP_CD_5, ZIP_CD, ADDRESS_KN1, ADDRESS_KN2, ADDRESS_KN3, COMPANY_KN, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, COMPANY_NM, FLG1, FLG2, FLG3, FLG4, UPD_TYPE, REASON_TYPE, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CLASS_DTL(ByFlg6)
 *
 * [referrer table]
 *     M_CARRIER_ZIP, T_SHIPPING_INST_H
 *
 * [foreign property]
 *     bClassDtlByFlg6, bClassDtlByFlg5, bClassDtlByCompanyFlg, bClassDtlByDelFlg, bClassDtlByReasonType, bClassDtlByUpdCd, bClassDtlByUpdType, bClassDtlByFlg1, bClassDtlByFlg2, bClassDtlByFlg3, bClassDtlByFlg4
 *
 * [referrer property]
 *     mCarrierZipList, tShippingInstHForDelivList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long zipId = entity.getZipId();
 * String publicCd = entity.getPublicCd();
 * String zipCd5 = entity.getZipCd5();
 * String zipCd = entity.getZipCd();
 * String addressKn1 = entity.getAddressKn1();
 * String addressKn2 = entity.getAddressKn2();
 * String addressKn3 = entity.getAddressKn3();
 * String companyKn = entity.getCompanyKn();
 * String address1 = entity.getAddress1();
 * String address2 = entity.getAddress2();
 * String address3 = entity.getAddress3();
 * String address4 = entity.getAddress4();
 * String companyNm = entity.getCompanyNm();
 * String flg1 = entity.getFlg1();
 * String flg2 = entity.getFlg2();
 * String flg3 = entity.getFlg3();
 * String flg4 = entity.getFlg4();
 * String updType = entity.getUpdType();
 * String reasonType = entity.getReasonType();
 * String handlingAddress = entity.getHandlingAddress();
 * String flg5 = entity.getFlg5();
 * String flg6 = entity.getFlg6();
 * String updCd = entity.getUpdCd();
 * String companyFlg = entity.getCompanyFlg();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setZipId(zipId);
 * entity.setPublicCd(publicCd);
 * entity.setZipCd5(zipCd5);
 * entity.setZipCd(zipCd);
 * entity.setAddressKn1(addressKn1);
 * entity.setAddressKn2(addressKn2);
 * entity.setAddressKn3(addressKn3);
 * entity.setCompanyKn(companyKn);
 * entity.setAddress1(address1);
 * entity.setAddress2(address2);
 * entity.setAddress3(address3);
 * entity.setAddress4(address4);
 * entity.setCompanyNm(companyNm);
 * entity.setFlg1(flg1);
 * entity.setFlg2(flg2);
 * entity.setFlg3(flg3);
 * entity.setFlg4(flg4);
 * entity.setUpdType(updType);
 * entity.setReasonType(reasonType);
 * entity.setHandlingAddress(handlingAddress);
 * entity.setFlg5(flg5);
 * entity.setFlg6(flg6);
 * entity.setUpdCd(updCd);
 * entity.setCompanyFlg(companyFlg);
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
public abstract class BsMZip extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ZIP_ID: {PK, ID, NotNull, bigint identity(19)} */
    protected Long _zipId;

    /** PUBLIC_CD: {varchar(30)} */
    protected String _publicCd;

    /** ZIP_CD_5: {varchar(30)} */
    protected String _zipCd5;

    /** ZIP_CD: {UQ, NotNull, varchar(30)} */
    protected String _zipCd;

    /** ADDRESS_KN1: {varchar(255)} */
    protected String _addressKn1;

    /** ADDRESS_KN2: {varchar(255)} */
    protected String _addressKn2;

    /** ADDRESS_KN3: {varchar(255)} */
    protected String _addressKn3;

    /** COMPANY_KN: {varchar(255)} */
    protected String _companyKn;

    /** ADDRESS1: {varchar(255)} */
    protected String _address1;

    /** ADDRESS2: {varchar(255)} */
    protected String _address2;

    /** ADDRESS3: {varchar(255)} */
    protected String _address3;

    /** ADDRESS4: {varchar(255)} */
    protected String _address4;

    /** COMPANY_NM: {varchar(255)} */
    protected String _companyNm;

    /** FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} */
    protected String _flg1;

    /** FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} */
    protected String _flg2;

    /** FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} */
    protected String _flg3;

    /** FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} */
    protected String _flg4;

    /** UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType} */
    protected String _updType;

    /** REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType} */
    protected String _reasonType;

    /** HANDLING_ADDRESS: {varchar(60)} */
    protected String _handlingAddress;

    /** FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType} */
    protected String _flg5;

    /** FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg} */
    protected String _flg6;

    /** UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd} */
    protected String _updCd;

    /** COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg} */
    protected String _companyFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
        return "M_ZIP";
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
        if (_zipId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param zipCd : UQ, NotNull, varchar(30). (NotNull)
     */
    public void uniqueBy(String zipCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("zipCd");
        setZipCd(zipCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of flg1 as the classification of ZipFlg. <br>
     * FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ZipFlg getFlg1AsZipFlg() {
        return CDef.ZipFlg.codeOf(getFlg1());
    }

    /**
     * Set the value of flg1 as the classification of ZipFlg. <br>
     * FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg1AsZipFlg(CDef.ZipFlg cdef) {
        setFlg1(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of flg2 as the classification of ZipFlg. <br>
     * FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ZipFlg getFlg2AsZipFlg() {
        return CDef.ZipFlg.codeOf(getFlg2());
    }

    /**
     * Set the value of flg2 as the classification of ZipFlg. <br>
     * FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg2AsZipFlg(CDef.ZipFlg cdef) {
        setFlg2(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of flg3 as the classification of ZipFlg. <br>
     * FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ZipFlg getFlg3AsZipFlg() {
        return CDef.ZipFlg.codeOf(getFlg3());
    }

    /**
     * Set the value of flg3 as the classification of ZipFlg. <br>
     * FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg3AsZipFlg(CDef.ZipFlg cdef) {
        setFlg3(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of flg4 as the classification of ZipFlg. <br>
     * FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ZipFlg getFlg4AsZipFlg() {
        return CDef.ZipFlg.codeOf(getFlg4());
    }

    /**
     * Set the value of flg4 as the classification of ZipFlg. <br>
     * FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * 郵便番号フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg4AsZipFlg(CDef.ZipFlg cdef) {
        setFlg4(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of updType as the classification of UpdType. <br>
     * UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType} <br>
     * 更新区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UpdType getUpdTypeAsUpdType() {
        return CDef.UpdType.codeOf(getUpdType());
    }

    /**
     * Set the value of updType as the classification of UpdType. <br>
     * UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType} <br>
     * 更新区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUpdTypeAsUpdType(CDef.UpdType cdef) {
        setUpdType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of reasonType as the classification of ReasonType. <br>
     * REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType} <br>
     * 変更理由
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReasonType getReasonTypeAsReasonType() {
        return CDef.ReasonType.codeOf(getReasonType());
    }

    /**
     * Set the value of reasonType as the classification of ReasonType. <br>
     * REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType} <br>
     * 変更理由
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setReasonTypeAsReasonType(CDef.ReasonType cdef) {
        setReasonType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of flg5 as the classification of CodeType. <br>
     * FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType} <br>
     * 個別番号の種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CodeType getFlg5AsCodeType() {
        return CDef.CodeType.codeOf(getFlg5());
    }

    /**
     * Set the value of flg5 as the classification of CodeType. <br>
     * FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType} <br>
     * 個別番号の種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg5AsCodeType(CDef.CodeType cdef) {
        setFlg5(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of flg6 as the classification of CodeFlg. <br>
     * FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg} <br>
     * 複数番号の有無
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CodeFlg getFlg6AsCodeFlg() {
        return CDef.CodeFlg.codeOf(getFlg6());
    }

    /**
     * Set the value of flg6 as the classification of CodeFlg. <br>
     * FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg} <br>
     * 複数番号の有無
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setFlg6AsCodeFlg(CDef.CodeFlg cdef) {
        setFlg6(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of updCd as the classification of UpdCd. <br>
     * UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd} <br>
     * 修正コード
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UpdCd getUpdCdAsUpdCd() {
        return CDef.UpdCd.codeOf(getUpdCd());
    }

    /**
     * Set the value of updCd as the classification of UpdCd. <br>
     * UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd} <br>
     * 修正コード
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUpdCdAsUpdCd(CDef.UpdCd cdef) {
        setUpdCd(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of companyFlg as the classification of CompanyFlg. <br>
     * COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg} <br>
     * 大口事業所フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CompanyFlg getCompanyFlgAsCompanyFlg() {
        return CDef.CompanyFlg.codeOf(getCompanyFlg());
    }

    /**
     * Set the value of companyFlg as the classification of CompanyFlg. <br>
     * COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg} <br>
     * 大口事業所フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCompanyFlgAsCompanyFlg(CDef.CompanyFlg cdef) {
        setCompanyFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
     * Set the value of flg1 as $0 (0). <br>
     * $0: 該当せず
     */
    public void setFlg1_$0() {
        setFlg1AsZipFlg(CDef.ZipFlg.$0);
    }

    /**
     * Set the value of flg1 as $1 (1). <br>
     * $1: 該当
     */
    public void setFlg1_$1() {
        setFlg1AsZipFlg(CDef.ZipFlg.$1);
    }

    /**
     * Set the value of flg2 as $0 (0). <br>
     * $0: 該当せず
     */
    public void setFlg2_$0() {
        setFlg2AsZipFlg(CDef.ZipFlg.$0);
    }

    /**
     * Set the value of flg2 as $1 (1). <br>
     * $1: 該当
     */
    public void setFlg2_$1() {
        setFlg2AsZipFlg(CDef.ZipFlg.$1);
    }

    /**
     * Set the value of flg3 as $0 (0). <br>
     * $0: 該当せず
     */
    public void setFlg3_$0() {
        setFlg3AsZipFlg(CDef.ZipFlg.$0);
    }

    /**
     * Set the value of flg3 as $1 (1). <br>
     * $1: 該当
     */
    public void setFlg3_$1() {
        setFlg3AsZipFlg(CDef.ZipFlg.$1);
    }

    /**
     * Set the value of flg4 as $0 (0). <br>
     * $0: 該当せず
     */
    public void setFlg4_$0() {
        setFlg4AsZipFlg(CDef.ZipFlg.$0);
    }

    /**
     * Set the value of flg4 as $1 (1). <br>
     * $1: 該当
     */
    public void setFlg4_$1() {
        setFlg4AsZipFlg(CDef.ZipFlg.$1);
    }

    /**
     * Set the value of updType as $0 (0). <br>
     * $0: 変更なし
     */
    public void setUpdType_$0() {
        setUpdTypeAsUpdType(CDef.UpdType.$0);
    }

    /**
     * Set the value of updType as $1 (1). <br>
     * $1: 変更あり
     */
    public void setUpdType_$1() {
        setUpdTypeAsUpdType(CDef.UpdType.$1);
    }

    /**
     * Set the value of updType as $2 (2). <br>
     * $2: 廃止
     */
    public void setUpdType_$2() {
        setUpdTypeAsUpdType(CDef.UpdType.$2);
    }

    /**
     * Set the value of reasonType as $0 (0). <br>
     * $0: 変更なし
     */
    public void setReasonType_$0() {
        setReasonTypeAsReasonType(CDef.ReasonType.$0);
    }

    /**
     * Set the value of reasonType as $1 (1). <br>
     * $1: 市政・区政・町政・分区・政令指定都市施行
     */
    public void setReasonType_$1() {
        setReasonTypeAsReasonType(CDef.ReasonType.$1);
    }

    /**
     * Set the value of reasonType as $2 (2). <br>
     * $2: 住居表示の実施
     */
    public void setReasonType_$2() {
        setReasonTypeAsReasonType(CDef.ReasonType.$2);
    }

    /**
     * Set the value of reasonType as $3 (3). <br>
     * $3: 区画整理
     */
    public void setReasonType_$3() {
        setReasonTypeAsReasonType(CDef.ReasonType.$3);
    }

    /**
     * Set the value of reasonType as $4 (4). <br>
     * $4: 郵便区調整等
     */
    public void setReasonType_$4() {
        setReasonTypeAsReasonType(CDef.ReasonType.$4);
    }

    /**
     * Set the value of reasonType as $5 (5). <br>
     * $5: 訂正
     */
    public void setReasonType_$5() {
        setReasonTypeAsReasonType(CDef.ReasonType.$5);
    }

    /**
     * Set the value of reasonType as $6 (6). <br>
     * $6: 廃止
     */
    public void setReasonType_$6() {
        setReasonTypeAsReasonType(CDef.ReasonType.$6);
    }

    /**
     * Set the value of flg5 as $0 (0). <br>
     * $0: 大口事業所
     */
    public void setFlg5_$0() {
        setFlg5AsCodeType(CDef.CodeType.$0);
    }

    /**
     * Set the value of flg5 as $1 (1). <br>
     * $1: 私書箱
     */
    public void setFlg5_$1() {
        setFlg5AsCodeType(CDef.CodeType.$1);
    }

    /**
     * Set the value of flg6 as $0 (0). <br>
     * $0: 複数番号無
     */
    public void setFlg6_$0() {
        setFlg6AsCodeFlg(CDef.CodeFlg.$0);
    }

    /**
     * Set the value of flg6 as $1 (1). <br>
     * $1: 複数番号有(個別番号の1)
     */
    public void setFlg6_$1() {
        setFlg6AsCodeFlg(CDef.CodeFlg.$1);
    }

    /**
     * Set the value of flg6 as $2 (2). <br>
     * $2: 複数番号有(個別番号の2)
     */
    public void setFlg6_$2() {
        setFlg6AsCodeFlg(CDef.CodeFlg.$2);
    }

    /**
     * Set the value of flg6 as $3 (3). <br>
     * $3: 複数番号有(個別番号の3)
     */
    public void setFlg6_$3() {
        setFlg6AsCodeFlg(CDef.CodeFlg.$3);
    }

    /**
     * Set the value of updCd as $0 (0). <br>
     * $0: 修正なし
     */
    public void setUpdCd_$0() {
        setUpdCdAsUpdCd(CDef.UpdCd.$0);
    }

    /**
     * Set the value of updCd as $1 (1). <br>
     * $1: 新規追加
     */
    public void setUpdCd_$1() {
        setUpdCdAsUpdCd(CDef.UpdCd.$1);
    }

    /**
     * Set the value of updCd as $2 (2). <br>
     * $2: 廃止
     */
    public void setUpdCd_$2() {
        setUpdCdAsUpdCd(CDef.UpdCd.$2);
    }

    /**
     * Set the value of companyFlg as $0 (0). <br>
     * $0: 通常郵便番号
     */
    public void setCompanyFlg_$0() {
        setCompanyFlgAsCompanyFlg(CDef.CompanyFlg.$0);
    }

    /**
     * Set the value of companyFlg as $1 (1). <br>
     * $1: 大口事業所
     */
    public void setCompanyFlg_$1() {
        setCompanyFlgAsCompanyFlg(CDef.CompanyFlg.$1);
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
     * Is the value of flg1 $0? <br>
     * $0: 該当せず
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg1$0() {
        CDef.ZipFlg cdef = getFlg1AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$0) : false;
    }

    /**
     * Is the value of flg1 $1? <br>
     * $1: 該当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg1$1() {
        CDef.ZipFlg cdef = getFlg1AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$1) : false;
    }

    /**
     * Is the value of flg2 $0? <br>
     * $0: 該当せず
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg2$0() {
        CDef.ZipFlg cdef = getFlg2AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$0) : false;
    }

    /**
     * Is the value of flg2 $1? <br>
     * $1: 該当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg2$1() {
        CDef.ZipFlg cdef = getFlg2AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$1) : false;
    }

    /**
     * Is the value of flg3 $0? <br>
     * $0: 該当せず
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg3$0() {
        CDef.ZipFlg cdef = getFlg3AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$0) : false;
    }

    /**
     * Is the value of flg3 $1? <br>
     * $1: 該当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg3$1() {
        CDef.ZipFlg cdef = getFlg3AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$1) : false;
    }

    /**
     * Is the value of flg4 $0? <br>
     * $0: 該当せず
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg4$0() {
        CDef.ZipFlg cdef = getFlg4AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$0) : false;
    }

    /**
     * Is the value of flg4 $1? <br>
     * $1: 該当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg4$1() {
        CDef.ZipFlg cdef = getFlg4AsZipFlg();
        return cdef != null ? cdef.equals(CDef.ZipFlg.$1) : false;
    }

    /**
     * Is the value of updType $0? <br>
     * $0: 変更なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdType$0() {
        CDef.UpdType cdef = getUpdTypeAsUpdType();
        return cdef != null ? cdef.equals(CDef.UpdType.$0) : false;
    }

    /**
     * Is the value of updType $1? <br>
     * $1: 変更あり
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdType$1() {
        CDef.UpdType cdef = getUpdTypeAsUpdType();
        return cdef != null ? cdef.equals(CDef.UpdType.$1) : false;
    }

    /**
     * Is the value of updType $2? <br>
     * $2: 廃止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdType$2() {
        CDef.UpdType cdef = getUpdTypeAsUpdType();
        return cdef != null ? cdef.equals(CDef.UpdType.$2) : false;
    }

    /**
     * Is the value of reasonType $0? <br>
     * $0: 変更なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$0() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$0) : false;
    }

    /**
     * Is the value of reasonType $1? <br>
     * $1: 市政・区政・町政・分区・政令指定都市施行
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$1() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$1) : false;
    }

    /**
     * Is the value of reasonType $2? <br>
     * $2: 住居表示の実施
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$2() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$2) : false;
    }

    /**
     * Is the value of reasonType $3? <br>
     * $3: 区画整理
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$3() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$3) : false;
    }

    /**
     * Is the value of reasonType $4? <br>
     * $4: 郵便区調整等
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$4() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$4) : false;
    }

    /**
     * Is the value of reasonType $5? <br>
     * $5: 訂正
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$5() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$5) : false;
    }

    /**
     * Is the value of reasonType $6? <br>
     * $6: 廃止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isReasonType$6() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.equals(CDef.ReasonType.$6) : false;
    }

    /**
     * Is the value of flg5 $0? <br>
     * $0: 大口事業所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg5$0() {
        CDef.CodeType cdef = getFlg5AsCodeType();
        return cdef != null ? cdef.equals(CDef.CodeType.$0) : false;
    }

    /**
     * Is the value of flg5 $1? <br>
     * $1: 私書箱
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg5$1() {
        CDef.CodeType cdef = getFlg5AsCodeType();
        return cdef != null ? cdef.equals(CDef.CodeType.$1) : false;
    }

    /**
     * Is the value of flg6 $0? <br>
     * $0: 複数番号無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg6$0() {
        CDef.CodeFlg cdef = getFlg6AsCodeFlg();
        return cdef != null ? cdef.equals(CDef.CodeFlg.$0) : false;
    }

    /**
     * Is the value of flg6 $1? <br>
     * $1: 複数番号有(個別番号の1)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg6$1() {
        CDef.CodeFlg cdef = getFlg6AsCodeFlg();
        return cdef != null ? cdef.equals(CDef.CodeFlg.$1) : false;
    }

    /**
     * Is the value of flg6 $2? <br>
     * $2: 複数番号有(個別番号の2)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg6$2() {
        CDef.CodeFlg cdef = getFlg6AsCodeFlg();
        return cdef != null ? cdef.equals(CDef.CodeFlg.$2) : false;
    }

    /**
     * Is the value of flg6 $3? <br>
     * $3: 複数番号有(個別番号の3)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isFlg6$3() {
        CDef.CodeFlg cdef = getFlg6AsCodeFlg();
        return cdef != null ? cdef.equals(CDef.CodeFlg.$3) : false;
    }

    /**
     * Is the value of updCd $0? <br>
     * $0: 修正なし
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdCd$0() {
        CDef.UpdCd cdef = getUpdCdAsUpdCd();
        return cdef != null ? cdef.equals(CDef.UpdCd.$0) : false;
    }

    /**
     * Is the value of updCd $1? <br>
     * $1: 新規追加
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdCd$1() {
        CDef.UpdCd cdef = getUpdCdAsUpdCd();
        return cdef != null ? cdef.equals(CDef.UpdCd.$1) : false;
    }

    /**
     * Is the value of updCd $2? <br>
     * $2: 廃止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUpdCd$2() {
        CDef.UpdCd cdef = getUpdCdAsUpdCd();
        return cdef != null ? cdef.equals(CDef.UpdCd.$2) : false;
    }

    /**
     * Is the value of companyFlg $0? <br>
     * $0: 通常郵便番号
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCompanyFlg$0() {
        CDef.CompanyFlg cdef = getCompanyFlgAsCompanyFlg();
        return cdef != null ? cdef.equals(CDef.CompanyFlg.$0) : false;
    }

    /**
     * Is the value of companyFlg $1? <br>
     * $1: 大口事業所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCompanyFlg$1() {
        CDef.CompanyFlg cdef = getCompanyFlgAsCompanyFlg();
        return cdef != null ? cdef.equals(CDef.CompanyFlg.$1) : false;
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
     * Get the value of the column 'flg1' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg1Name() {
        CDef.ZipFlg cdef = getFlg1AsZipFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'flg2' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg2Name() {
        CDef.ZipFlg cdef = getFlg2AsZipFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'flg3' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg3Name() {
        CDef.ZipFlg cdef = getFlg3AsZipFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'flg4' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg4Name() {
        CDef.ZipFlg cdef = getFlg4AsZipFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'updType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUpdTypeName() {
        CDef.UpdType cdef = getUpdTypeAsUpdType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'reasonType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getReasonTypeName() {
        CDef.ReasonType cdef = getReasonTypeAsReasonType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'flg5' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg5Name() {
        CDef.CodeType cdef = getFlg5AsCodeType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'flg6' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getFlg6Name() {
        CDef.CodeFlg cdef = getFlg6AsCodeFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'updCd' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUpdCdName() {
        CDef.UpdCd cdef = getUpdCdAsUpdCd();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'companyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCompanyFlgName() {
        CDef.CompanyFlg cdef = getCompanyFlgAsCompanyFlg();
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
    /** B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'. */
    protected BClassDtl _bClassDtlByFlg6;

    /**
     * [get] B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg6'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg6() {
        return _bClassDtlByFlg6;
    }

    /**
     * [set] B_CLASS_DTL by my FLG6, named 'BClassDtlByFlg6'.
     * @param bClassDtlByFlg6 The entity of foreign property 'BClassDtlByFlg6'. (NullAllowed)
     */
    public void setBClassDtlByFlg6(BClassDtl bClassDtlByFlg6) {
        _bClassDtlByFlg6 = bClassDtlByFlg6;
    }

    /** B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'. */
    protected BClassDtl _bClassDtlByFlg5;

    /**
     * [get] B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg5'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg5() {
        return _bClassDtlByFlg5;
    }

    /**
     * [set] B_CLASS_DTL by my FLG5, named 'BClassDtlByFlg5'.
     * @param bClassDtlByFlg5 The entity of foreign property 'BClassDtlByFlg5'. (NullAllowed)
     */
    public void setBClassDtlByFlg5(BClassDtl bClassDtlByFlg5) {
        _bClassDtlByFlg5 = bClassDtlByFlg5;
    }

    /** B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'. */
    protected BClassDtl _bClassDtlByCompanyFlg;

    /**
     * [get] B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCompanyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCompanyFlg() {
        return _bClassDtlByCompanyFlg;
    }

    /**
     * [set] B_CLASS_DTL by my COMPANY_FLG, named 'BClassDtlByCompanyFlg'.
     * @param bClassDtlByCompanyFlg The entity of foreign property 'BClassDtlByCompanyFlg'. (NullAllowed)
     */
    public void setBClassDtlByCompanyFlg(BClassDtl bClassDtlByCompanyFlg) {
        _bClassDtlByCompanyFlg = bClassDtlByCompanyFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'. */
    protected BClassDtl _bClassDtlByReasonType;

    /**
     * [get] B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'. <br>
     * @return The entity of foreign property 'BClassDtlByReasonType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByReasonType() {
        return _bClassDtlByReasonType;
    }

    /**
     * [set] B_CLASS_DTL by my REASON_TYPE, named 'BClassDtlByReasonType'.
     * @param bClassDtlByReasonType The entity of foreign property 'BClassDtlByReasonType'. (NullAllowed)
     */
    public void setBClassDtlByReasonType(BClassDtl bClassDtlByReasonType) {
        _bClassDtlByReasonType = bClassDtlByReasonType;
    }

    /** B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'. */
    protected BClassDtl _bClassDtlByUpdCd;

    /**
     * [get] B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'. <br>
     * @return The entity of foreign property 'BClassDtlByUpdCd'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByUpdCd() {
        return _bClassDtlByUpdCd;
    }

    /**
     * [set] B_CLASS_DTL by my UPD_CD, named 'BClassDtlByUpdCd'.
     * @param bClassDtlByUpdCd The entity of foreign property 'BClassDtlByUpdCd'. (NullAllowed)
     */
    public void setBClassDtlByUpdCd(BClassDtl bClassDtlByUpdCd) {
        _bClassDtlByUpdCd = bClassDtlByUpdCd;
    }

    /** B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'. */
    protected BClassDtl _bClassDtlByUpdType;

    /**
     * [get] B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'. <br>
     * @return The entity of foreign property 'BClassDtlByUpdType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByUpdType() {
        return _bClassDtlByUpdType;
    }

    /**
     * [set] B_CLASS_DTL by my UPD_TYPE, named 'BClassDtlByUpdType'.
     * @param bClassDtlByUpdType The entity of foreign property 'BClassDtlByUpdType'. (NullAllowed)
     */
    public void setBClassDtlByUpdType(BClassDtl bClassDtlByUpdType) {
        _bClassDtlByUpdType = bClassDtlByUpdType;
    }

    /** B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'. */
    protected BClassDtl _bClassDtlByFlg1;

    /**
     * [get] B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg1'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg1() {
        return _bClassDtlByFlg1;
    }

    /**
     * [set] B_CLASS_DTL by my FLG1, named 'BClassDtlByFlg1'.
     * @param bClassDtlByFlg1 The entity of foreign property 'BClassDtlByFlg1'. (NullAllowed)
     */
    public void setBClassDtlByFlg1(BClassDtl bClassDtlByFlg1) {
        _bClassDtlByFlg1 = bClassDtlByFlg1;
    }

    /** B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'. */
    protected BClassDtl _bClassDtlByFlg2;

    /**
     * [get] B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg2'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg2() {
        return _bClassDtlByFlg2;
    }

    /**
     * [set] B_CLASS_DTL by my FLG2, named 'BClassDtlByFlg2'.
     * @param bClassDtlByFlg2 The entity of foreign property 'BClassDtlByFlg2'. (NullAllowed)
     */
    public void setBClassDtlByFlg2(BClassDtl bClassDtlByFlg2) {
        _bClassDtlByFlg2 = bClassDtlByFlg2;
    }

    /** B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'. */
    protected BClassDtl _bClassDtlByFlg3;

    /**
     * [get] B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg3'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg3() {
        return _bClassDtlByFlg3;
    }

    /**
     * [set] B_CLASS_DTL by my FLG3, named 'BClassDtlByFlg3'.
     * @param bClassDtlByFlg3 The entity of foreign property 'BClassDtlByFlg3'. (NullAllowed)
     */
    public void setBClassDtlByFlg3(BClassDtl bClassDtlByFlg3) {
        _bClassDtlByFlg3 = bClassDtlByFlg3;
    }

    /** B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'. */
    protected BClassDtl _bClassDtlByFlg4;

    /**
     * [get] B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'. <br>
     * @return The entity of foreign property 'BClassDtlByFlg4'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByFlg4() {
        return _bClassDtlByFlg4;
    }

    /**
     * [set] B_CLASS_DTL by my FLG4, named 'BClassDtlByFlg4'.
     * @param bClassDtlByFlg4 The entity of foreign property 'BClassDtlByFlg4'. (NullAllowed)
     */
    public void setBClassDtlByFlg4(BClassDtl bClassDtlByFlg4) {
        _bClassDtlByFlg4 = bClassDtlByFlg4;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'. */
    protected List<MCarrierZip> _mCarrierZipList;

    /**
     * [get] M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'.
     * @return The entity list of referrer property 'MCarrierZipList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierZip> getMCarrierZipList() {
        if (_mCarrierZipList == null) { _mCarrierZipList = newReferrerList(); }
        return _mCarrierZipList;
    }

    /**
     * [set] M_CARRIER_ZIP by ZIP_ID, named 'MCarrierZipList'.
     * @param mCarrierZipList The entity list of referrer property 'MCarrierZipList'. (NullAllowed)
     */
    public void setMCarrierZipList(List<MCarrierZip> mCarrierZipList) {
        _mCarrierZipList = mCarrierZipList;
    }

    /** T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'. */
    protected List<TShippingInstH> _tShippingInstHForDelivList;

    /**
     * [get] T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'.
     * @return The entity list of referrer property 'TShippingInstHForDelivList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHForDelivList() {
        if (_tShippingInstHForDelivList == null) { _tShippingInstHForDelivList = newReferrerList(); }
        return _tShippingInstHForDelivList;
    }

    /**
     * [set] T_SHIPPING_INST_H by DELIV_ZIP_CD, named 'TShippingInstHForDelivList'.
     * @param tShippingInstHForDelivList The entity list of referrer property 'TShippingInstHForDelivList'. (NullAllowed)
     */
    public void setTShippingInstHForDelivList(List<TShippingInstH> tShippingInstHForDelivList) {
        _tShippingInstHForDelivList = tShippingInstHForDelivList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMZip) {
            BsMZip other = (BsMZip)obj;
            if (!xSV(_zipId, other._zipId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _zipId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bClassDtlByFlg6 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg6, "bClassDtlByFlg6")); }
        if (_bClassDtlByFlg5 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg5, "bClassDtlByFlg5")); }
        if (_bClassDtlByCompanyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCompanyFlg, "bClassDtlByCompanyFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByReasonType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByReasonType, "bClassDtlByReasonType")); }
        if (_bClassDtlByUpdCd != null)
        { sb.append(li).append(xbRDS(_bClassDtlByUpdCd, "bClassDtlByUpdCd")); }
        if (_bClassDtlByUpdType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByUpdType, "bClassDtlByUpdType")); }
        if (_bClassDtlByFlg1 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg1, "bClassDtlByFlg1")); }
        if (_bClassDtlByFlg2 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg2, "bClassDtlByFlg2")); }
        if (_bClassDtlByFlg3 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg3, "bClassDtlByFlg3")); }
        if (_bClassDtlByFlg4 != null)
        { sb.append(li).append(xbRDS(_bClassDtlByFlg4, "bClassDtlByFlg4")); }
        if (_mCarrierZipList != null) { for (MCarrierZip et : _mCarrierZipList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierZipList")); } } }
        if (_tShippingInstHForDelivList != null) { for (TShippingInstH et : _tShippingInstHForDelivList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHForDelivList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_zipId));
        sb.append(dm).append(xfND(_publicCd));
        sb.append(dm).append(xfND(_zipCd5));
        sb.append(dm).append(xfND(_zipCd));
        sb.append(dm).append(xfND(_addressKn1));
        sb.append(dm).append(xfND(_addressKn2));
        sb.append(dm).append(xfND(_addressKn3));
        sb.append(dm).append(xfND(_companyKn));
        sb.append(dm).append(xfND(_address1));
        sb.append(dm).append(xfND(_address2));
        sb.append(dm).append(xfND(_address3));
        sb.append(dm).append(xfND(_address4));
        sb.append(dm).append(xfND(_companyNm));
        sb.append(dm).append(xfND(_flg1));
        sb.append(dm).append(xfND(_flg2));
        sb.append(dm).append(xfND(_flg3));
        sb.append(dm).append(xfND(_flg4));
        sb.append(dm).append(xfND(_updType));
        sb.append(dm).append(xfND(_reasonType));
        sb.append(dm).append(xfND(_handlingAddress));
        sb.append(dm).append(xfND(_flg5));
        sb.append(dm).append(xfND(_flg6));
        sb.append(dm).append(xfND(_updCd));
        sb.append(dm).append(xfND(_companyFlg));
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
        if (_bClassDtlByFlg6 != null)
        { sb.append(dm).append("bClassDtlByFlg6"); }
        if (_bClassDtlByFlg5 != null)
        { sb.append(dm).append("bClassDtlByFlg5"); }
        if (_bClassDtlByCompanyFlg != null)
        { sb.append(dm).append("bClassDtlByCompanyFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByReasonType != null)
        { sb.append(dm).append("bClassDtlByReasonType"); }
        if (_bClassDtlByUpdCd != null)
        { sb.append(dm).append("bClassDtlByUpdCd"); }
        if (_bClassDtlByUpdType != null)
        { sb.append(dm).append("bClassDtlByUpdType"); }
        if (_bClassDtlByFlg1 != null)
        { sb.append(dm).append("bClassDtlByFlg1"); }
        if (_bClassDtlByFlg2 != null)
        { sb.append(dm).append("bClassDtlByFlg2"); }
        if (_bClassDtlByFlg3 != null)
        { sb.append(dm).append("bClassDtlByFlg3"); }
        if (_bClassDtlByFlg4 != null)
        { sb.append(dm).append("bClassDtlByFlg4"); }
        if (_mCarrierZipList != null && !_mCarrierZipList.isEmpty())
        { sb.append(dm).append("mCarrierZipList"); }
        if (_tShippingInstHForDelivList != null && !_tShippingInstHForDelivList.isEmpty())
        { sb.append(dm).append("tShippingInstHForDelivList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MZip clone() {
        return (MZip)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号ID
     * @return The value of the column 'ZIP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getZipId() {
        checkSpecifiedProperty("zipId");
        return _zipId;
    }

    /**
     * [set] ZIP_ID: {PK, ID, NotNull, bigint identity(19)} <br>
     * 郵便番号ID
     * @param zipId The value of the column 'ZIP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setZipId(Long zipId) {
        registerModifiedProperty("zipId");
        _zipId = zipId;
    }

    /**
     * [get] PUBLIC_CD: {varchar(30)} <br>
     * 全国地方公共団体CD
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPublicCd() {
        checkSpecifiedProperty("publicCd");
        return convertEmptyToNull(_publicCd);
    }

    /**
     * [set] PUBLIC_CD: {varchar(30)} <br>
     * 全国地方公共団体CD
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicCd(String publicCd) {
        registerModifiedProperty("publicCd");
        _publicCd = publicCd;
    }

    /**
     * [get] ZIP_CD_5: {varchar(30)} <br>
     * 旧郵便番号
     * @return The value of the column 'ZIP_CD_5'. (NullAllowed even if selected: for no constraint)
     */
    public String getZipCd5() {
        checkSpecifiedProperty("zipCd5");
        return convertEmptyToNull(_zipCd5);
    }

    /**
     * [set] ZIP_CD_5: {varchar(30)} <br>
     * 旧郵便番号
     * @param zipCd5 The value of the column 'ZIP_CD_5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setZipCd5(String zipCd5) {
        registerModifiedProperty("zipCd5");
        _zipCd5 = zipCd5;
    }

    /**
     * [get] ZIP_CD: {UQ, NotNull, varchar(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getZipCd() {
        checkSpecifiedProperty("zipCd");
        return convertEmptyToNull(_zipCd);
    }

    /**
     * [set] ZIP_CD: {UQ, NotNull, varchar(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (basically NotNull if update: for the constraint)
     */
    public void setZipCd(String zipCd) {
        registerModifiedProperty("zipCd");
        _zipCd = zipCd;
    }

    /**
     * [get] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県カナ
     * @return The value of the column 'ADDRESS_KN1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn1() {
        checkSpecifiedProperty("addressKn1");
        return convertEmptyToNull(_addressKn1);
    }

    /**
     * [set] ADDRESS_KN1: {varchar(255)} <br>
     * 都道府県カナ
     * @param addressKn1 The value of the column 'ADDRESS_KN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn1(String addressKn1) {
        registerModifiedProperty("addressKn1");
        _addressKn1 = addressKn1;
    }

    /**
     * [get] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村カナ
     * @return The value of the column 'ADDRESS_KN2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn2() {
        checkSpecifiedProperty("addressKn2");
        return convertEmptyToNull(_addressKn2);
    }

    /**
     * [set] ADDRESS_KN2: {varchar(255)} <br>
     * 市区町村カナ
     * @param addressKn2 The value of the column 'ADDRESS_KN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn2(String addressKn2) {
        registerModifiedProperty("addressKn2");
        _addressKn2 = addressKn2;
    }

    /**
     * [get] ADDRESS_KN3: {varchar(255)} <br>
     * 町域カナ
     * @return The value of the column 'ADDRESS_KN3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddressKn3() {
        checkSpecifiedProperty("addressKn3");
        return convertEmptyToNull(_addressKn3);
    }

    /**
     * [set] ADDRESS_KN3: {varchar(255)} <br>
     * 町域カナ
     * @param addressKn3 The value of the column 'ADDRESS_KN3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddressKn3(String addressKn3) {
        registerModifiedProperty("addressKn3");
        _addressKn3 = addressKn3;
    }

    /**
     * [get] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @return The value of the column 'COMPANY_KN'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyKn() {
        checkSpecifiedProperty("companyKn");
        return convertEmptyToNull(_companyKn);
    }

    /**
     * [set] COMPANY_KN: {varchar(255)} <br>
     * 大口事業所名カナ
     * @param companyKn The value of the column 'COMPANY_KN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyKn(String companyKn) {
        registerModifiedProperty("companyKn");
        _companyKn = companyKn;
    }

    /**
     * [get] ADDRESS1: {varchar(255)} <br>
     * 都道府県
     * @return The value of the column 'ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress1() {
        checkSpecifiedProperty("address1");
        return convertEmptyToNull(_address1);
    }

    /**
     * [set] ADDRESS1: {varchar(255)} <br>
     * 都道府県
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress1(String address1) {
        registerModifiedProperty("address1");
        _address1 = address1;
    }

    /**
     * [get] ADDRESS2: {varchar(255)} <br>
     * 市区町村
     * @return The value of the column 'ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress2() {
        checkSpecifiedProperty("address2");
        return convertEmptyToNull(_address2);
    }

    /**
     * [set] ADDRESS2: {varchar(255)} <br>
     * 市区町村
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress2(String address2) {
        registerModifiedProperty("address2");
        _address2 = address2;
    }

    /**
     * [get] ADDRESS3: {varchar(255)} <br>
     * 町域
     * @return The value of the column 'ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress3() {
        checkSpecifiedProperty("address3");
        return convertEmptyToNull(_address3);
    }

    /**
     * [set] ADDRESS3: {varchar(255)} <br>
     * 町域
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress3(String address3) {
        registerModifiedProperty("address3");
        _address3 = address3;
    }

    /**
     * [get] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @return The value of the column 'ADDRESS4'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddress4() {
        checkSpecifiedProperty("address4");
        return convertEmptyToNull(_address4);
    }

    /**
     * [set] ADDRESS4: {varchar(255)} <br>
     * 小字
     * @param address4 The value of the column 'ADDRESS4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddress4(String address4) {
        registerModifiedProperty("address4");
        _address4 = address4;
    }

    /**
     * [get] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @return The value of the column 'COMPANY_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyNm() {
        checkSpecifiedProperty("companyNm");
        return convertEmptyToNull(_companyNm);
    }

    /**
     * [set] COMPANY_NM: {varchar(255)} <br>
     * 大口事業所名
     * @param companyNm The value of the column 'COMPANY_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyNm(String companyNm) {
        registerModifiedProperty("companyNm");
        _companyNm = companyNm;
    }

    /**
     * [get] FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ1
     * @return The value of the column 'FLG1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg1() {
        checkSpecifiedProperty("flg1");
        return convertEmptyToNull(_flg1);
    }

    /**
     * [set] FLG1: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ1
     * @param flg1 The value of the column 'FLG1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg1(String flg1) {
        registerModifiedProperty("flg1");
        _flg1 = flg1;
    }

    /**
     * [get] FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ2
     * @return The value of the column 'FLG2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg2() {
        checkSpecifiedProperty("flg2");
        return convertEmptyToNull(_flg2);
    }

    /**
     * [set] FLG2: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ2
     * @param flg2 The value of the column 'FLG2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg2(String flg2) {
        registerModifiedProperty("flg2");
        _flg2 = flg2;
    }

    /**
     * [get] FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ3
     * @return The value of the column 'FLG3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg3() {
        checkSpecifiedProperty("flg3");
        return convertEmptyToNull(_flg3);
    }

    /**
     * [set] FLG3: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ3
     * @param flg3 The value of the column 'FLG3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg3(String flg3) {
        registerModifiedProperty("flg3");
        _flg3 = flg3;
    }

    /**
     * [get] FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ4
     * @return The value of the column 'FLG4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg4() {
        checkSpecifiedProperty("flg4");
        return convertEmptyToNull(_flg4);
    }

    /**
     * [set] FLG4: {char(1), FK to B_CLASS_DTL, classification=ZipFlg} <br>
     * フラグ4
     * @param flg4 The value of the column 'FLG4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg4(String flg4) {
        registerModifiedProperty("flg4");
        _flg4 = flg4;
    }

    /**
     * [get] UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType} <br>
     * 更新区分
     * @return The value of the column 'UPD_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdType() {
        checkSpecifiedProperty("updType");
        return convertEmptyToNull(_updType);
    }

    /**
     * [set] UPD_TYPE: {char(1), FK to B_CLASS_DTL, classification=UpdType} <br>
     * 更新区分
     * @param updType The value of the column 'UPD_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdType(String updType) {
        registerModifiedProperty("updType");
        _updType = updType;
    }

    /**
     * [get] REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType} <br>
     * 変更理由
     * @return The value of the column 'REASON_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReasonType() {
        checkSpecifiedProperty("reasonType");
        return convertEmptyToNull(_reasonType);
    }

    /**
     * [set] REASON_TYPE: {char(1), FK to B_CLASS_DTL, classification=ReasonType} <br>
     * 変更理由
     * @param reasonType The value of the column 'REASON_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReasonType(String reasonType) {
        registerModifiedProperty("reasonType");
        _reasonType = reasonType;
    }

    /**
     * [get] HANDLING_ADDRESS: {varchar(60)} <br>
     * 取扱局
     * @return The value of the column 'HANDLING_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getHandlingAddress() {
        checkSpecifiedProperty("handlingAddress");
        return convertEmptyToNull(_handlingAddress);
    }

    /**
     * [set] HANDLING_ADDRESS: {varchar(60)} <br>
     * 取扱局
     * @param handlingAddress The value of the column 'HANDLING_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHandlingAddress(String handlingAddress) {
        registerModifiedProperty("handlingAddress");
        _handlingAddress = handlingAddress;
    }

    /**
     * [get] FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType} <br>
     * フラグ5
     * @return The value of the column 'FLG5'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg5() {
        checkSpecifiedProperty("flg5");
        return convertEmptyToNull(_flg5);
    }

    /**
     * [set] FLG5: {char(1), FK to B_CLASS_DTL, classification=CodeType} <br>
     * フラグ5
     * @param flg5 The value of the column 'FLG5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg5(String flg5) {
        registerModifiedProperty("flg5");
        _flg5 = flg5;
    }

    /**
     * [get] FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg} <br>
     * フラグ6
     * @return The value of the column 'FLG6'. (NullAllowed even if selected: for no constraint)
     */
    public String getFlg6() {
        checkSpecifiedProperty("flg6");
        return convertEmptyToNull(_flg6);
    }

    /**
     * [set] FLG6: {char(1), FK to B_CLASS_DTL, classification=CodeFlg} <br>
     * フラグ6
     * @param flg6 The value of the column 'FLG6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFlg6(String flg6) {
        registerModifiedProperty("flg6");
        _flg6 = flg6;
    }

    /**
     * [get] UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd} <br>
     * 修正CD
     * @return The value of the column 'UPD_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdCd() {
        checkSpecifiedProperty("updCd");
        return convertEmptyToNull(_updCd);
    }

    /**
     * [set] UPD_CD: {char(1), FK to B_CLASS_DTL, classification=UpdCd} <br>
     * 修正CD
     * @param updCd The value of the column 'UPD_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdCd(String updCd) {
        registerModifiedProperty("updCd");
        _updCd = updCd;
    }

    /**
     * [get] COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg} <br>
     * 大口事業所フラグ
     * @return The value of the column 'COMPANY_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getCompanyFlg() {
        checkSpecifiedProperty("companyFlg");
        return convertEmptyToNull(_companyFlg);
    }

    /**
     * [set] COMPANY_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=CompanyFlg} <br>
     * 大口事業所フラグ
     * @param companyFlg The value of the column 'COMPANY_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setCompanyFlg(String companyFlg) {
        registerModifiedProperty("companyFlg");
        _companyFlg = companyFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
