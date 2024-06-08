package com.oneslogi.ht.wms.logic.inventory;

import java.math.BigDecimal;
import java.util.Objects;

import javax.inject.Inject;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.scoping.ScalarQuery;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MMfstockitemCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.TCenterSymbolCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInstCB;
import com.oneslogi.base.dbflute.cbean.TTrassortorderCB;
import com.oneslogi.base.dbflute.cbean.TTrcasedetailCB;
import com.oneslogi.base.dbflute.cbean.TTrcaseinventoryCB;
import com.oneslogi.base.dbflute.cbean.TTrcasestockCB;
import com.oneslogi.base.dbflute.cbean.TTrinvcorrectCB;
import com.oneslogi.base.dbflute.cbean.TTrmanufacturedateCB;
import com.oneslogi.base.dbflute.cbean.TTrmanufacturedatedetailCB;
import com.oneslogi.base.dbflute.cbean.TTrsymbolCB;
import com.oneslogi.base.dbflute.exbhv.BClassBhv;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BClassDtlSubBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.MMfstockitemBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TCenterSymbolBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TTrassortorderBhv;
import com.oneslogi.base.dbflute.exbhv.TTrcasedetailBhv;
import com.oneslogi.base.dbflute.exbhv.TTrcaseinventoryBhv;
import com.oneslogi.base.dbflute.exbhv.TTrcasestockBhv;
import com.oneslogi.base.dbflute.exbhv.TTrinvcorrectBhv;
import com.oneslogi.base.dbflute.exbhv.TTrmanufacturedateBhv;
import com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatedetailBhv;
import com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatehistoryBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsymbolBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlGetPlannedSortingQtyPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlGetSortedCasesQtyPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTTrsymbolInventoryInputProductSortingPlacePmb;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TTrassortorder;
import com.oneslogi.base.dbflute.exentity.TTrcasedetail;
import com.oneslogi.base.dbflute.exentity.TTrcaseinventory;
import com.oneslogi.base.dbflute.exentity.TTrcasestock;
import com.oneslogi.base.dbflute.exentity.TTrinvcorrect;
import com.oneslogi.base.dbflute.exentity.TTrmanufacturedate;
import com.oneslogi.base.dbflute.exentity.TTrmanufacturedatedetail;
import com.oneslogi.base.dbflute.exentity.TTrsymbol;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫調査入力[仕分場]共通ロジッククラス
 */
public class InventoryInputProductSortingPlaceLogic extends AbstractWmsLogic {

    // ===== 使用テーブル =====
    /* No.01 荷主拠点マスタ */
    @Inject
    private MClientCenterBhv mClientCenterBhv;

    /* No.02 棚卸ヘッダ */
    @Inject
    private TInventoryHBhv tInventoryHBhv;

    /* No.03 棚卸指示 */
    @Inject
    private TInventoryInstBhv tInventoryInstBhv;

    /* No.04 棚卸ボディ */
    @Inject
    private TInventoryBBhv tInventoryBBhv;

    /* No.05 ロケーションマスタ */
    @Inject
    private MLocationBhv mLocationBhv;

    /* No.06 銘柄マスタ */
    @Inject
    private MProductBhv mProductBhv;

    /* No.07 銘柄別補充先マスタ */
    @Inject
    private MMfstockitemBhv mMfstockitemBhv;

    /* No.08 段ボール情報 */
    @Inject
    private TTrsymbolBhv tTrsymbolBhv;

    /* No.09 拠点シンボル */
    @Inject
    private TCenterSymbolBhv tCenterSymbolBhv;

    /* No.10 ケース補充情報 */
    @Inject
    private TTrcasestockBhv tTrcasestockBhv;

    /* No.11 ケース在庫調査情報 */
    @Inject
    private TTrcaseinventoryBhv tTrcaseinventoryBhv;

    /* No.12 製造年月日 */
    @Inject
    private TTrmanufacturedateBhv tTrmanufacturedateBhv;

    /* No.13追跡情報(棚卸) */
    @Inject
    private TTrassortorderBhv tTrassortorderBhv;

    /* No.14 ケース明細情報 */
    @Inject
    private TTrcasedetailBhv tTrcasedetailBhv;

    /* No.15 在庫調査補正情報 */
    @Inject
    private TTrinvcorrectBhv tTrinvcorrectBhv;

    /* No.16 製造年月日明細 */
    @Inject
    private TTrmanufacturedatedetailBhv tTrmanufacturedatedetailBhv;

    /* No.17 製造年月日履歴 */
    @Inject
    private TTrmanufacturedatehistoryBhv tTrmanufacturedatehistoryBhv;

    @Inject
    private BClassBhv bClassBhv;
    @Inject
    private BClassDtlBhv bClassDtlBhv;
    @Inject
    private BClassDtlSubBhv bClassDtlSubBhv;

    /**
     * <h2>
     * ◆仕分場調査入力画面 <br>
     * E_01_002:初期表示 <br>
     *   3.1.(2)荷主拠点マスタをログイン情報で検索、荷主拠点マスタを取得する。
     * </h2>
     * <pre>
     * 荷主拠点マスタを取得する。
     * </pre>
     * @param loginInfo ログイン情報
     * @return MClientCenter 荷主拠点マスタ
     */
    public MClientCenter getRecordFromMClientCenterByLoginInfo(HandyLoginUserInfo loginInfo) {

        /*
        -- MClientCenterCB :
            select
                top 1 dfloc.CLIENT_CENTER_ID as CLIENT_CENTER_ID
              , dfloc.CLIENT_ID              as CLIENT_ID
              , dfloc.CENTER_ID              as CENTER_ID
              , dfloc.SYSTEM_DT              as SYSTEM_DT
              , dfrel_0.CENTER_ID            as CENTER_ID_0
              , dfrel_0.CENTER_CD            as CENTER_CD_0 
            from
              M_CLIENT_CENTER dfloc 
              inner join M_CENTER dfrel_0 
                on dfloc.CENTER_ID = dfrel_0.CENTER_ID 
            where
              dfloc.CENTER_ID = 2 
              and dfloc.CLIENT_ID = 1
        */

        MClientCenterCB cb = mClientCenterBhv.newConditionBean();

        // 拠点マスタ
        cb.setupSelect_MCenter();

        // 拠点ID,荷主ID,システム管理日付
        cb.specify().columnCenterId();
        cb.specify().columnClientId();
        cb.specify().columnSystemDt();
        // 拠点CD
        cb.specify().specifyMCenter().columnCenterCd();

        // 拠点ID,荷主ID
        cb.query().setCenterId_Equal(loginInfo.getCenterId());
        cb.query().setClientId_Equal(loginInfo.getClientId());

        cb.fetchFirst(1);

        return mClientCenterBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆仕分場調査入力画面 <br>
     * E_01_002:確定ボタン押下 <br>
     *   3.1.(3)棚卸ヘッダを検索、レコード数を取得する。
     * </h2>
     * <pre>
     * レコード数を取得する。
     * </pre>
     * @param dto Dto
     * @param lineOrBlock ライン/ブロック
     * @return int レコード数
     */
    public int countRecordInTInventoryHByLineOrBlock(InventoryInputProductSortingPlaceDto dto, String lineOrBlock) {

        /*
        -- TInventoryInstCB :
            select
                top 1 dfloc.INVENTORY_INST_ID as INVENTORY_INST_ID
              , dfloc.INVENTORY_H_ID          as INVENTORY_H_ID
              , dfrel_0.INVENTORY_H_ID        as INVENTORY_H_ID_0 
            from
              T_INVENTORY_INST dfloc 
              inner join T_INVENTORY_H dfrel_0 
                on dfloc.INVENTORY_H_ID = dfrel_0.INVENTORY_H_ID 
            where
              dfloc.LINE_BLOCK = 'L1' 
              and dfrel_0.CENTER_ID = 2 
              and dfrel_0.CLIENT_ID = 1
        */

        TInventoryInstCB cb = tInventoryInstBhv.newConditionBean();

        // 棚卸ヘッダ
        cb.setupSelect_TInventoryH();

        // 棚卸指示ID,棚卸ヘッダID
        cb.specify().columnInventoryHId();
        cb.specify().specifyTInventoryH().columnInventoryHId();

        // ライン/ブロック
        cb.query().setLineBlock_Equal(lineOrBlock);
        // 拠点ID,荷主ID
        cb.query().queryTInventoryH().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().queryTInventoryH().setClientId_Equal(dto.getMClientCenterDto().getClientId());

        return tInventoryInstBhv.selectCount(cb);
    }

    /**
     * <h2>
     * ◆指示ﾘｽﾄ入力画面 <br>
     * E_02_001:初期表示 <br>
     *   1.2.(1)最新の在庫調査指示キーを取得する。
     * </h2>
     * <pre>
     * 棚卸ヘッダを取得する。
     * </pre>
     * @param dto Dto
     * @param lineOrBlock ライン/ブロック
     * @return TInventoryInst 棚卸指示
     */
    public TInventoryInst getRecordFromTInventoryInstByLineOrBlock(InventoryInputProductSortingPlaceDto dto, String lineOrBlock) {

        /*
        -- TInventoryInstCB:
            select
                dfloc.INVENTORY_INST_ID  as INVENTORY_INST_ID
              , dfloc.INVENTORY_H_ID     as INVENTORY_H_ID
              , dfloc.INVENTORY_INST_KBN as INVENTORY_INST_KBN
              , dfrel_0.INVENTORY_H_ID   as INVENTORY_H_ID_0
              , dfrel_0.INVENTORY_KEY    as INVENTORY_KEY_0 
            from
              T_INVENTORY_INST dfloc 
              inner join T_INVENTORY_H dfrel_0 
                on dfloc.INVENTORY_H_ID = dfrel_0.INVENTORY_H_ID 
            where
              dfloc.LINE_BLOCK = 'L1' 
              and dfrel_0.CENTER_ID = 2 
              and dfrel_0.CLIENT_ID = 1 
            order by
              dfrel_0.INVENTORY_KEY desc
        */

        TInventoryInstCB cb = tInventoryInstBhv.newConditionBean();

        cb.setupSelect_TInventoryH();

        // 在庫調査指示キー
        cb.specify().specifyTInventoryH().columnInventoryKey();
        // 在庫調査区分
        cb.specify().columnInventoryInstKbn();

        // ライン/ブロック
        cb.query().setLineBlock_Equal(lineOrBlock);
        // 拠点ID,荷主ID
        cb.query().queryTInventoryH().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().queryTInventoryH().setClientId_Equal(dto.getMClientCenterDto().getClientId());

        // 在庫調査指示キー 降順
        cb.query().queryTInventoryH().addOrderBy_InventoryKey_Desc();

        cb.fetchFirst(1);

        return tInventoryInstBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆指示ﾘｽﾄ入力画面 <br>
     * E_02_002:スキャン/確定ボタン押下 <br>
     *   3.1.(1)棚卸ヘッダを検索、項目を取得する。
     * </h2>
     * <pre>
     * 棚卸ヘッダを取得する。
     * </pre>
     * @param dto Dto
     * @param inventoryKey 棚卸指示キー
     * @return TInventoryInst 棚卸指示
     */
    public TInventoryInst getRecordFromTInventoryInstByInventoryKey(InventoryInputProductSortingPlaceDto dto, String inventoryKey) {

        /*      
        -- TInventoryInstCB:
            select
                top 1 dfloc.INVENTORY_INST_ID as INVENTORY_INST_ID
              , dfloc.INVENTORY_H_ID          as INVENTORY_H_ID
              , dfloc.INVENTORY_INST_KBN      as INVENTORY_INST_KBN
              , dfloc.LINE_BLOCK              as LINE_BLOCK
              , dfloc.DIRECTIONAL_PISTON      as DIRECTIONAL_PISTON
              , dfloc.SORTING_ORDER           as SORTING_ORDER
              , dfrel_0.INVENTORY_H_ID        as INVENTORY_H_ID_0
              , dfrel_0.CLIENT_ID             as CLIENT_ID_0
              , dfrel_0.CENTER_ID             as CENTER_ID_0
              , dfrel_0.INVENTORY_DT          as INVENTORY_DT_0
              , dfrel_0.INVENTORY_KEY         as INVENTORY_KEY_0 
            from
              T_INVENTORY_INST dfloc 
              inner join T_INVENTORY_H dfrel_0 
                on dfloc.INVENTORY_H_ID = dfrel_0.INVENTORY_H_ID 
            where
              dfrel_0.CENTER_ID = 2 
              and dfrel_0.CLIENT_ID = 1 
              and dfrel_0.INVENTORY_KEY = 123456
        */

        TInventoryInstCB cb = tInventoryInstBhv.newConditionBean();

        cb.setupSelect_TInventoryH();

        // 棚卸ヘッダID,拠点ID,荷主ID,棚卸日,在庫調査指示キー
        cb.specify().specifyTInventoryH().columnInventoryHId();
        cb.specify().specifyTInventoryH().columnCenterId();
        cb.specify().specifyTInventoryH().columnClientId();
        cb.specify().specifyTInventoryH().columnInventoryDt();
        cb.specify().specifyTInventoryH().columnInventoryKey();
        // 棚卸指示ID,在庫調査区分,ライン/ブロック,方面ピストン,仕分順
        cb.specify().columnInventoryInstId();
        cb.specify().columnInventoryInstKbn();
        cb.specify().columnLineBlock();
        cb.specify().columnDirectionalPiston();
        cb.specify().columnSortingOrder();

        // 拠点ID,荷主ID,在庫調査指示キー
        cb.query().queryTInventoryH().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().queryTInventoryH().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        cb.query().queryTInventoryH().setInventoryKey_Equal(Long.parseLong(inventoryKey));

        cb.query().queryTInventoryH().innerJoin();

        return tInventoryInstBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆調査ロケーション入力画面 <br>
     * E_03_002:スキャン/確定ボタン押下 <br>
     *   3.1.(1)棚卸ボディを検索、レコード数を取得する。
     * </h2>
     * <pre>
     * レコード数を取得する。
     * </pre>
     * @param dto Dto
     * @return int レコード数
     */
    public int countRecordInTInventoryB(InventoryInputProductSortingPlaceDto dto) {

        /*      
        -- TInventoryBCB:
            select
                dfloc.INVENTORY_B_ID   as INVENTORY_B_ID
              , dfloc.INVENTORY_H_ID   as INVENTORY_H_ID
              , dfloc.LOCATION_ID      as LOCATION_ID
              , dfrel_4.INVENTORY_H_ID as INVENTORY_H_ID_4
              , dfrel_5.LOCATION_ID    as LOCATION_ID_5 
            from
              T_INVENTORY_B dfloc 
              inner join T_INVENTORY_H dfrel_4 
                on dfloc.INVENTORY_H_ID = dfrel_4.INVENTORY_H_ID 
              inner join M_LOCATION dfrel_5 
                on dfloc.LOCATION_ID = dfrel_5.LOCATION_ID 
            where
              dfrel_4.CENTER_ID = 2 
              and dfrel_4.INVENTORY_KEY = 123456 
              and dfrel_5.LOCATION_CD = 'L1-0101A'
        */

        TInventoryBCB cb = tInventoryBBhv.newConditionBean();

        cb.setupSelect_TInventoryH();
        cb.setupSelect_MLocation();

        cb.specify().columnInventoryBId();
        cb.specify().specifyTInventoryH().columnInventoryHId();
        cb.specify().specifyMLocation().columnLocationId();

        // 拠点ID
        cb.query().queryTInventoryH().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        // 在庫調査指示キー
        cb.query().queryTInventoryH().setInventoryKey_Equal(Long.parseLong(dto.getInputOrFetchedInventoryKey()));
        // ロケーションCD
        cb.query().queryMLocation().setLocationCd_Equal(dto.getInputLocationCd());

        return tInventoryBBhv.selectCount(cb);
    }

    /**
     * <h2>
     * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面 <br>
     * E_04_002:スキャン/確定ボタン押下 <br>
     *   3.1.(3)銘柄マスタを検索、レコード数を取得する。
     * </h2>
     * <pre>
     * レコード数を取得する。
     * </pre>
     * @param dto Dto
     * @param productCd 商品CD
     * @return int レコード数
     */
    public int countRecordInMProductByProductCd(InventoryInputProductSortingPlaceDto dto, String productCd) {

        /*      
        -- MProductCB:
            select
                dfloc.PRODUCT_ID as PRODUCT_ID 
            from
              M_PRODUCT dfloc 
            where
              dfloc.CLIENT_ID = 1 
              and dfloc.PRODUCT_CD = '1028'
        */

        MProductCB cb = mProductBhv.newConditionBean();

        cb.specify().columnProductId();

        // 荷主ID
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // 商品CD
        cb.query().setProductCd_Equal(productCd);

        return mProductBhv.selectCount(cb);
    }

    /**
     * <h2>
     * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面 <br>
     * E_04_002:スキャン/確定ボタン押下 <br>
     *   3.1.(4)銘柄別補充先マスタを検索、レコード数を取得する。
     * E_04_003:空ロケボタン押下
     *   2.1.(1)銘柄別補充先マスタを検索、レコード数を取得する。
     * </h2>
     * <pre>
     * レコード数を取得する。
     * </pre>
     * @param dto Dto
     * @param productCd 商品CD
     * @return int レコード数
     */
    public int countRecordInMMfstockitemByProductCd(InventoryInputProductSortingPlaceDto dto, String productCd) {

        /*      
        -- MMfstockitemCB:
            select
                dfloc.MFSTOCKITEM_ID as MFSTOCKITEM_ID 
            from
              M_MFSTOCKITEM dfloc 
            where
              dfloc.CENTER_ID = 2 
              and dfloc.ITEMCD = '1028' 
              and dfloc.LINEBLOCK = 'L1' 
              and dfloc.LOCNO = '0101A'
        */

        MMfstockitemCB cb = mMfstockitemBhv.newConditionBean();

        cb.specify().columnMfstockitemId();

        // 拠点ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
//        if (!productCd.isBlank()) {
//            // 銘柄CD
//            cb.query().setProductCd_Equal(productCd);
//        }
        // 仕分場ライン/ブロック
        cb.query().setLineblock_Equal(dto.getOutputSotedUnit());
        // 仕分場ロケーションNo
        cb.query().setLocno_Equal(dto.getOutputLocationNo());

        return mMfstockitemBhv.selectCount(cb);
    }

    /**
     * <h2>
     * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面 <br>
     * E_04_002:スキャン/確定ボタン押下 <br>
     *   3.1.(5)段ボール情報を検索、段ボール情報項目を取得する。
     * E_04_003:空ロケボタン押下
     *   2.1.(2)段ボール情報を検索、段ボール情報項目を取得する。
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下
     *   2.1.(1)ケース補充情報を検索、仕分ロケを取得する。
     *   ※ ケースCDを指定する
     * </h2>
     * <pre>
     * 段ボール情報を取得する。
     * </pre>
     * @param dto Dto
     * @return SqlTTrsymbolInventoryInputProductSortingPlace 段ボール情報
     */
    public SqlTTrsymbolInventoryInputProductSortingPlace getRecordFromTTrsymbol(InventoryInputProductSortingPlaceDto dto, Long caseCd) {

        SqlTTrsymbolInventoryInputProductSortingPlacePmb pmb = new SqlTTrsymbolInventoryInputProductSortingPlacePmb();
        pmb.setCenterId(dto.getMClientCenterDto().getCenterId());
        pmb.setClientId(dto.getMClientCenterDto().getClientId());
        pmb.setSotedUnit(dto.getOutputSotedUnit());
        pmb.setAssortedUnit(dto.getOutputLocationNo());
        if (Objects.nonNull(caseCd)) {
            pmb.setCaseCd(dto.getTTrsymbolDto().getCasecd());
        }

        pmb.paging(2, 1);

       // return tTrsymbolBhv.outsideSql().autoPaging().selectPage(pmb).getFirst();
        return null;
    }

    /**
     * <h2>
     * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面 <br>
     * E_04_002:スキャン/確定ボタン押下 <br>
     *   3.1.(6)棚卸ボディを検索、棚卸ボディを取得する。
     * E_04_003:空ロケボタン押下
     *   2.1.(3)棚卸ボディを検索、棚卸ボディ項目を取得する。
     * </h2>
     * <pre>
     * 棚卸ボディを取得する。
     * </pre>
     * @param dto Dto
     * @param productCd 商品CD
     * @return TInventoryB 棚卸ボディ
     */
    public TInventoryB getRecorFromTInventoryBByProductCd(InventoryInputProductSortingPlaceDto dto, String productCd) {

        /*
        -- TInventoryBCB:
            select
                top 1 dfloc.INVENTORY_B_ID as INVENTORY_B_ID
              , dfloc.PRODUCT_ID           as PRODUCT_ID
              , dfloc.LOCATION_ID          as LOCATION_ID
              , dfloc.INVENTORY_NUM        as INVENTORY_NUM
              , dfloc.PRODUCT_CD           as PRODUCT_CD
              , dfrel_5.LOCATION_ID        as LOCATION_ID_5
              , dfrel_11.PRODUCT_ID        as PRODUCT_ID_11
              , dfrel_11.PRODUCT_ABBR      as PRODUCT_ABBR_11
              , dfrel_11.UNIT1             as UNIT1_11
              , dfrel_11.UNIT2             as UNIT2_11 
            from
              T_INVENTORY_B dfloc 
              inner join M_LOCATION dfrel_5 
                on dfloc.LOCATION_ID = dfrel_5.LOCATION_ID 
              inner join M_PRODUCT dfrel_11 
                on dfloc.PRODUCT_ID = dfrel_11.PRODUCT_ID 
            where
              dfrel_5.CENTER_ID = 2 
              and dfrel_11.CLIENT_ID = 1 
              and dfloc.INVENTORY_H_ID = 1 
              and dfloc.PRODUCT_CD = '1028' 
              and dfrel_5.LOCATION_CD = 'L1-0101A'
        */

        TInventoryBCB cb = tInventoryBBhv.newConditionBean();

        cb.setupSelect_MLocation();
        cb.setupSelect_MProduct();

        // 棚卸ボディ:棚卸数,銘柄CD
        cb.specify().columnInventoryNum();
        cb.specify().columnProductCd();
        // 銘柄マスタ:商品名称,1ケース当カートン数,1ケース当個数
        cb.specify().specifyMProduct().columnProductAbbr();
        cb.specify().specifyMProduct().columnUnit1();
        cb.specify().specifyMProduct().columnUnit2();

        cb.specify().specifyMLocation().columnLocationId();

        // 拠点ID
        cb.query().queryMLocation().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        // 荷主ID
        cb.query().queryMProduct().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // 棚卸ヘッダID
        cb.query().setInventoryHId_Equal(dto.getTInventoryHDto().getInventoryHId());
        // 銘柄CD
        cb.query().setProductCd_Equal(productCd);
        // ロケーションCD
        cb.query().queryMLocation().setLocationCd_Equal(dto.getInputLocationCd());

        return tInventoryBBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査数入力画面 <br>
     * E_06_001:初期表示 <br>
     *   1.2.(1)ケース在庫調査情報を検索、項目を取得する。
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(1)(B)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
     * ◆製品不良数入力画面 <br>
     * E_12_001:初期表示 <br>
     *   1.2.(1)ケース在庫調査情報を検索、項目を取得する。
     * </h2>
     * <pre>
     * ケース在庫調査情報を取得する。
     * </pre>
     * @param dto Dto
     * @return TTrcaseinventory ケース在庫調査情報
     */
    public TTrcaseinventory getRecordFromTTrcaseinventory(InventoryInputProductSortingPlaceDto dto) {

        /*      
        -- TTrcaseinventoryCB:
            select
                dfloc.TRCASEINVENTORY_ID as TRCASEINVENTORY_ID
              , dfloc.DEFECTIVENUM       as DEFECTIVENUM 
            from
              T_TRCASEINVENTORY dfloc 
            where
              dfloc.CENTER_ID = 2 
              and dfloc.CLIENT_ID = 1 
              and dfloc.INVENTORYKEY = '123456' 
              and dfloc.INVENTORY_B_ID = 1
        */

        TTrcaseinventoryCB cb = tTrcaseinventoryBhv.newConditionBean();

        // 製品不良数量(カートン)
        cb.specify().columnDefectivenum();
        // ケース在庫調査情報ID
        cb.specify().columnTrcaseinventoryId();
        cb.specify().columnVersionNo();
        // ケース在庫調査番号
        cb.specify().columnCaseinventoryno();
        // 仕分数量累計(カートン)
        cb.specify().columnTotalsortednum();

        // 拠点ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        // 荷主ID
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());

        // 在庫調査指示キー
        cb.query().setInventorykey_Equal(dto.getInputOrFetchedInventoryKey().replaceFirst("^0+", ""));
        // 棚卸ボディID
        cb.query().setInventoryBId_Equal(dto.getTInventoryBDto().getInventoryBId());

        return tTrcaseinventoryBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査数入力画面 <br>
     * E_06_002:確定ボタン押下 <br>
     *   3.1.(1)段ボール情報を検索、レコード数を取得する。
     * </h2>
     * <pre>
     * レコード数を取得する。
     * </pre>
     * @param dto Dto
     * @return int レコード数
     */
    public int countRecordInTTrsymbol(InventoryInputProductSortingPlaceDto dto) {

        SqlTTrsymbolInventoryInputProductSortingPlacePmb pmb = new SqlTTrsymbolInventoryInputProductSortingPlacePmb();
        pmb.setCenterId(dto.getMClientCenterDto().getCenterId());
        pmb.setClientId(dto.getMClientCenterDto().getClientId());
        pmb.setSotedUnit(dto.getOutputSotedUnit());
        pmb.setAssortedUnit(dto.getOutputLocationNo());

        pmb.paging(2, 1);

        return tTrsymbolBhv.outsideSql().autoPaging().selectPage(pmb).getAllRecordCount();
    }

    /**
     * <h2>
     * ◆在庫調査数入力画面 <br>
     * E_06_002:確定ボタン押下 <br>
     *   4.1.(1)製造年月日を検索、製造年月日を取得する。
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   3.2.(1)(A)(a)製造年月日を検索、製造年月日を取得する。
     * </h2>
     * <pre>
     * 製造年月日を取得する。
     * </pre>
     * @param dto Dto
     * @return TTrmanufacturedate 製造年月日
     */
    public TTrmanufacturedate getRecordFromTTrmanufacturedate(InventoryInputProductSortingPlaceDto dto) {

        /*
        -- TTrmanufacturedateCB:
            select
                dfloc.TRMANUFACTUREDATE_ID as TRMANUFACTUREDATE_ID
              , dfloc.MANUFACTURE_DATE     as MANUFACTURE_DATE 
            from
              T_TRMANUFACTUREDATE dfloc 
            where
              dfloc.CENTER_ID = 2 
              and dfloc.CLIENT_ID = 1 
              and dfloc.LINE_BLOCK = 'L1' 
              and dfloc.INVENTORY_KBN = '02' 
              and dfloc.PRODUCT_CD = '1028'
        */

        TTrmanufacturedateCB cb = tTrmanufacturedateBhv.newConditionBean();

        // 製造年月日
        cb.specify().columnManufactureDate();
        cb.specify().columnTrmanufacturedateId();
        cb.specify().columnVersionNo();

        // 拠点ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        // 荷主ID
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // ライン/ブロック
        cb.query().setLineBlock_Equal(dto.getOutputLineBlock());
        // 棚卸区分 '02'(仕分場)
        cb.query().setInventoryKbn_Equal("02");
        // 銘柄CD
        cb.query().setProductCd_Equal(dto.getTInventoryBDto().getProductCd());

        return tTrmanufacturedateBhv.selectEntity(cb);
    }

    /**/

    /**
     * <h2>
     * ◆在庫調査数入力画面 <br>
     * E_06_002:確定ボタン押下 <br>
     *   4.1.(3)仕分差異情報の取得
     * ◆製品不良数入力画面 <br>
     * E_12_002:確定ボタン押下 <br>
     *   3.1.(2)仕分差異情報の取得
     * </h2>
     * <pre>
     * 仕分予定数量と仕分実績数量の差異を求め、仕分差異情報として呼び出し元に返却する。
     * 
     * 仕分予定数量 = 在庫調査区分名が'開始検品'の場合、'0'
     * 
     * 先頭ケース仕分数量 = ケース内カートン数 - カートン数
     * 仕分実績数量 = 仕分済ケース仕分実績数量 + 先頭ケース仕分数量
     * 仕分差異数量 = 仕分実績数量 - 仕分予定数量
     * <pre>
     * @param dto Dto
     * @param headCaseCartonQty 先頭ｹｰｽ仕分数量
     * @return DiscrepancySortingInformation 仕分差異情報
     */
//    public DiscrepancySortingInformation getDiscrepancySortingInformation(InventoryInputProductSortingPlaceDto dto, long headCaseCartonQty) {
//
//        //* No.01 拠点ID         */long centerId = dto.getMClientCenterDto().getCenterId();
//        //* No.02 荷主ID         */long clientId = dto.getMClientCenterDto().getClientId();
//        //* No.03 拠点CD         */String centerCd = dto.getMClientCenterDto().getMCenter().getCenterCd();
//        //* No.04 ﾛｹｰｼｮﾝCD       */String locationCd = dto.getInputLocationCd();
//        //* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
//        //* No.06 ﾛｹｰｼｮﾝNo.      */String locationNo = dto.getOutputLocationNo();
//        //* No.07 銘柄CD         */String productCd = dto.getOutputProductCd();
//        //* No.08 仕分順         */String sortingOrder = dto.getTInventoryHDto().getTInventoryInstList().getFirst().getSortingOrder();
//        //* No.09 棚卸ﾎﾞﾃﾞｨID    */long inventoryBId = dto.getTInventoryBDto().getInventoryBId();
//        //* No.10 段ボール情報ID */long caseCd = dto.getTTrsymbolDto().getCasecd();
//        //* No.11 在庫調査区分   */String stockInspectionCategoryValue = dto.getStockInspectionCategoryValue();
//        //* No.12 段ボール情報ID */long trsymbolId = dto.getTTrsymbolDto().getTrsymbolId();
//
//        // 1.1.出庫順を取得する。
//        // 1.1.(1)変数の初期化
//        /* No.01 出庫順         */long shiporder = getShiporder(dto);
//
//        // 1.2.さしず実績順序キーを取得する。
//        // 1.2.(1)変数の初期化
//        /* さしず実績順序キー   */long directionorderkey = getDirectionorderkeyByShiporder(dto, shiporder);
//
//        // 1.3.仕分予定数量を取得する。
//        // 1.3.(1)変数の初期化
//        /* 仕分予定数量         */long plannedSortingQty = getPlannedSortingQtyByShiporder(dto, shiporder);
//
//        // 1.4.仕分補充順序を取得する。
//        // 1.4.(1)変数の初期化
//        /* 仕分補充順序         */long sortingReplenishmentOrder = getSortingReplenishmentOrder(dto);
//
//        // 1.5.仕分済ケース実績数量を取得する。
//        /* 仕分済ケース実績数量 */long sortedCasesQuty = getSortedCasesQutyBySortingReplenishmentOrder(dto, sortingReplenishmentOrder);
//
//        /* 仕分予定数量         */ /* plannedSortingQty */
//        /* 仕分実績数量         */ /* 1.5.で取得した仕分済ケース実績数量 + パラメータ.先頭ケース仕分数量 */
//        long sortingResuldQty = sortedCasesQuty + headCaseCartonQty;
//        /* 仕分差異数量         */ /* 仕分実績数量 - 仕分予定数量 */
//        long sortingDiscrepancyQty = sortedCasesQuty - plannedSortingQty;
//        /* さしず実績順序キー   */ /* directionorderkey */
//
//        return new DiscrepancySortingInformation(plannedSortingQty, sortingResuldQty, sortingDiscrepancyQty, directionorderkey);
//    }

    /**
     * 仕分差異情報
     * 
     * @param plannedSortingQty     仕分予定数量
     * @param completedSortingQty   仕分実績数量
     * @param discrepancySortingQty 仕分差異数量
     * @param directionOrderKey     さしず実績順序キー
     */
//    public record DiscrepancySortingInformation(long plannedSortingQty, long completedSortingQty, long discrepancySortingQty, long directionOrderKey) {
//    }

    // 1.1.出庫順を取得する。
    private long getShiporder(InventoryInputProductSortingPlaceDto dto) {

        /* No.03 拠点CD         */String centerCd = dto.getMClientCenterDto().getMCenter().getCenterCd();
        /* No.04 ﾛｹｰｼｮﾝCD       */String locationCd = dto.getInputLocationCd();
        /* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
        /* No.07 銘柄CD         */String productCd = dto.getOutputProductCd();
        /* No.08 仕分順         */String sortingOrder = dto.getTInventoryHDto().getSortingOrder();
        /* No.11 在庫調査区分   */String stockInspectionCategoryValue = ""; //dto.getStockInspectionCategoryValue();

        /*
        -- TTrassortorderCB:
            select
                top 1 dfloc.DIRECTIONORDERKEY as DIRECTIONORDERKEY
              , dfloc.DIRECTIONORDERGNO       as DIRECTIONORDERGNO
              , dfloc.SHIPORDER               as SHIPORDER 
            from
              T_TRASSORTORDER dfloc 
            where
              dfloc.WAREHOUSECD = '8357' 
              and dfloc.SOTEDUNIT = 'L1' 
              and dfloc.SOTEDLOC = 'L1-0101A' 
              and dfloc.ITEMCD = '001028' 
              and dfloc.LINECD like 'L%' escape '|' 
            order by
              dfloc.SHIPORDER asc
        */

        // 1.1.出庫順を取得する。
        // 追跡情報(棚卸)
        TTrassortorderCB tTrassortorderCB = tTrassortorderBhv.newConditionBean();
        // ケース明細情報
        TTrcasedetailCB tTrcasedetailCB = tTrcasedetailBhv.newConditionBean();

        // 出庫順
        tTrassortorderCB.specify().columnShiporder();

        // 拠点CD
        tTrassortorderCB.query().setWarehousecd_Equal(centerCd);
        // 補充先
        tTrassortorderCB.query().setSotedunit_Equal(sotedUnit);
        // 仕分ロケ
        tTrassortorderCB.query().setSotedloc_Equal(locationCd);
        // 銘柄CD
        tTrassortorderCB.query().setItemcd_Equal(productCd);
        // 仕分ラインCD
        tTrassortorderCB.query().setLinecd_LikeSearch("L", new LikeSearchOption().likePrefix());
        // 仕分順 '02'(中間検品)の場合
        if (stockInspectionCategoryValue == "02") {
            tTrassortorderCB.query().setAssortedorder_LessEqual(Long.parseLong(sortingOrder));
        }
        // 処理日
        tTrcasedetailCB.specify().columnDtExtdata1();
        tTrcasedetailBhv.selectList(tTrcasedetailCB).stream()
                .map(s -> s.getDtExtdata1())
                .forEach(s -> tTrassortorderCB.query().setRcvdate_Equal(s));

        // '01'(開始検品)の場合 (最小値を取得)
        if (stockInspectionCategoryValue == "01") {
            tTrassortorderCB.query().addOrderBy_Shiporder_Asc();
        } else {
            tTrassortorderCB.query().addOrderBy_Shiporder_Desc();
        }

        tTrassortorderCB.fetchFirst(1);

        return tTrassortorderBhv.selectEntity(tTrassortorderCB).getShiporder();
    }

    // 1.2.さしず実績順序キーを取得する。
    private long getDirectionorderkeyByShiporder(InventoryInputProductSortingPlaceDto dto, long shiporder) {

        /* No.03 拠点CD         */String centerCd = dto.getMClientCenterDto().getMCenter().getCenterCd();
        /* No.04 ﾛｹｰｼｮﾝCD       */String locationCd = dto.getInputLocationCd();
        /* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
        /* No.07 銘柄CD         */String productCd = dto.getOutputProductCd();
        /* No.08 仕分順         */String sortingOrder = dto.getTInventoryHDto().getSortingOrder();
        /* No.11 在庫調査区分   */String stockInspectionCategoryValue = "";//dto.getStockInspectionCategoryValue();

        /*            
        -- TTrassortorderCB:
            select
                dfloc.DIRECTIONORDERKEY as DIRECTIONORDERKEY
              , dfloc.DIRECTIONORDERGNO as DIRECTIONORDERGNO 
            from
              T_TRASSORTORDER dfloc 
            where
              dfloc.WAREHOUSECD = '8357' 
              and dfloc.SOTEDUNIT = 'L1' 
              and dfloc.SOTEDLOC = 'L1-0101A' 
              and dfloc.ITEMCD = '1028' 
              and dfloc.SHIPORDER = 1 
              and dfloc.LINECD like 'L%' escape '|' 
              and dfloc.RCVDATE in ('20240402', '20240401', '20240406')
        */

        // 1.2.さしず実績順序キーを取得する。
        // 追跡情報(棚卸)
        TTrassortorderCB tTrassortorderCB = tTrassortorderBhv.newConditionBean();
        // ケース明細情報
        TTrcasedetailCB tTrcasedetailCB = tTrcasedetailBhv.newConditionBean();

        // さしず実績順序キー,さしず実績枝番号
        tTrassortorderCB.specify().columnDirectionorderkey();
        tTrassortorderCB.specify().columnDirectionordergno();

        // 拠点CD
        tTrassortorderCB.query().setWarehousecd_Equal(centerCd);
        // 補充先
        tTrassortorderCB.query().setSotedunit_Equal(sotedUnit);
        // 仕分ロケ
        tTrassortorderCB.query().setSotedloc_Equal(locationCd);
        // 銘柄CD
        tTrassortorderCB.query().setItemcd_Equal(productCd);
        // 出荷順
        tTrassortorderCB.query().setShiporder_Equal(shiporder);
        // 仕分ラインCD
        tTrassortorderCB.query().setLinecd_LikeSearch("L", new LikeSearchOption().likePrefix());
        // 仕分順 '02'(中間検品)の場合
        if (stockInspectionCategoryValue == "02") {
            tTrassortorderCB.query().setAssortedorder_LessEqual(Long.parseLong(sortingOrder));
        }
//        // 処理日
//        tTrassortorderCB.query().setRcvdate_InScope(
//                tTrcasedetailBhv.selectList(tTrcasedetailCB).stream().map(s -> s.getDtExtdata1()).distinct().toList());

        tTrassortorderCB.fetchFirst(1);

        return tTrassortorderBhv.selectEntity(tTrassortorderCB).getDirectionorderkey();
    }

    // 1.3.仕分予定数量を取得する。
    private long getPlannedSortingQtyByShiporder(InventoryInputProductSortingPlaceDto dto, long shiporder) {

        /* No.03 拠点CD         */String centerCd = dto.getMClientCenterDto().getMCenter().getCenterCd();
        /* No.04 ﾛｹｰｼｮﾝCD       */String locationCd = dto.getInputLocationCd();
        /* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
        /* No.06 ﾛｹｰｼｮﾝNo.      */String locationNo = dto.getOutputLocationNo();
        /* No.07 銘柄CD         */String productCd = dto.getOutputProductCd();
        /* No.09 棚卸ﾎﾞﾃﾞｨID    */long inventoryBId = dto.getTInventoryBDto().getInventoryBId();
        /* No.11 在庫調査区分   */String stockInspectionCategoryValue = "";//dto.getStockInspectionCategoryValue();

        /* 仕分予定数量         */
        // 在庫調査区分が'01'(開始検品)の場合
        if (stockInspectionCategoryValue == "01") {
            return 0;
        }

        // '02'(中間検品)または'03'(終了検品)の場合
        // (2)仕分予定数量を取得する。
        SqlGetPlannedSortingQtyPmb sqlGetPlannedSortingQtyPmb = new SqlGetPlannedSortingQtyPmb();
        sqlGetPlannedSortingQtyPmb.setWarehouseCd(centerCd);
        sqlGetPlannedSortingQtyPmb.setSotedUnit(sotedUnit);
        sqlGetPlannedSortingQtyPmb.setSotedLoc(locationNo);
        sqlGetPlannedSortingQtyPmb.setItemCd(productCd);
        sqlGetPlannedSortingQtyPmb.setInventoryBId(inventoryBId);
        sqlGetPlannedSortingQtyPmb.setLocationCd(locationCd);
        // 在庫調査区分が'02'(中間検品)の場合
        if (stockInspectionCategoryValue == "02") {
            sqlGetPlannedSortingQtyPmb.setShiporder(shiporder);
        }

        long plannedSortingQty = tTrassortorderBhv.outsideSql().entityHandling().selectEntity(sqlGetPlannedSortingQtyPmb).getPlannedSortingQty();

        // 値が取得できない場合'0'
        return Objects.nonNull(plannedSortingQty) ? plannedSortingQty : 0;
    }

    // 1.4.仕分補充順序を取得する。
    private long getSortingReplenishmentOrder(InventoryInputProductSortingPlaceDto dto) {

        /* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
        /* No.06 ﾛｹｰｼｮﾝNo.      */String locationNo = dto.getOutputLocationNo();
        /* No.13 段ボール情報ID */long trsymbolId = dto.getTTrsymbolDto().getTrsymbolId();

        /*      
        -- TTrcasedetailCB:
            select
                top 1 dfloc.TRCASEDETAIL_ID as TRCASEDETAIL_ID
              , dfloc.ASSORTEDINDEX         as ASSORTEDINDEX 
            from
              T_TRCASEDETAIL dfloc 
            where
              dfloc.TRSYMBOL_ID = 1 
              and dfloc.ASSORTEDCD = 'L1' 
              and dfloc.ASSORTEDUNIT = '0101A'
        */

        // 1.4.仕分補充順序を取得する。
        // ケース明細情報
        TTrcasedetailCB tTrcasedetailCB = tTrcasedetailBhv.newConditionBean();

        // 仕分ロケ投入順(仕分補充順序)
        tTrcasedetailCB.specify().columnAssortedindex();
        // 段ボール情報ID
        //tTrcasedetailCB.query().setTrsymbolId_Equal(new BigDecimal(trsymbolId));
        // 仕分場所
        tTrcasedetailCB.query().setAssortedcd_Equal(sotedUnit);
        // 仕分ロケ
        tTrcasedetailCB.query().setAssortedunit_Equal(locationNo);

        tTrcasedetailCB.fetchFirst(1);

        return tTrcasedetailBhv.selectEntity(tTrcasedetailCB).getAssortedindex();
    }

    // 1.5.仕分済ケース実績数量を取得する。
    private long getSortedCasesQutyBySortingReplenishmentOrder(InventoryInputProductSortingPlaceDto dto, long sortingReplenishmentOrder) {

        /* No.01 拠点ID         */long centerId = dto.getMClientCenterDto().getCenterId();
        /* No.02 荷主ID         */long clientId = dto.getMClientCenterDto().getClientId();
        /* No.04 ﾛｹｰｼｮﾝCD       */String locationCd = dto.getInputLocationCd();
        /* No.05 仕分場所       */String sotedUnit = dto.getOutputSotedUnit();
        /* No.06 ﾛｹｰｼｮﾝNo.      */String locationNo = dto.getOutputLocationNo();
        /* No.09 棚卸ﾎﾞﾃﾞｨID    */long inventoryBId = dto.getTInventoryBDto().getInventoryBId();

        // 1.5.仕分済ケース実績数量を取得する。
        SqlGetSortedCasesQtyPmb sqlGetSortedCaseQtyPmb = new SqlGetSortedCasesQtyPmb();
        sqlGetSortedCaseQtyPmb.setCenterId(centerId);
        sqlGetSortedCaseQtyPmb.setClientId(clientId);
        sqlGetSortedCaseQtyPmb.setAssortedIndex(sortingReplenishmentOrder);
        sqlGetSortedCaseQtyPmb.setSotedUnit(sotedUnit);
        sqlGetSortedCaseQtyPmb.setAssortedUnit(locationNo);
        sqlGetSortedCaseQtyPmb.setInventoryBId(inventoryBId);
        sqlGetSortedCaseQtyPmb.setLocationCd(locationCd);

        // 仕分済ケース実績数量
        return tTrcasedetailBhv.outsideSql().entityHandling().selectEntity(sqlGetSortedCaseQtyPmb).getSortedCasesQty();
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   3.1.(1)製造年月日明細を検索、製造年月日明細を取得する。
     *   3.2.(1)(B)製造年月日明細を検索、製造年月日明細を取得する。
     * </h2>
     * <pre>
     * 製造年月日明細を取得する。
     * </pre>
     * @param dto Dto
     * @return TTrmanufacturedatedetail 製造年月日明細
     */
    public TTrmanufacturedatedetail getRecordFromTTrmanufacturedatedetailByInventoryDate(InventoryInputProductSortingPlaceDto dto, String inventoryDate) {

        /*
        -- TTrmanufacturedatedetailCB:
            select
                top 1 dfloc.TRMANUFACTUREDATEDETAIL_ID as TRMANUFACTUREDATEDETAIL_ID
              , dfloc.INVENTORY_DATE                   as INVENTORY_DATE 
            from
              T_TRMANUFACTUREDATEDETAIL dfloc 
            where
              dfloc.CENTER_ID = 2 
              and dfloc.CLIENT_ID = 1 
              and dfloc.PRODUCT_CD = '1028' 
              and dfloc.INVENTORY_KEY = '0000123456' 
            order by
              dfloc.INVENTORY_DATE desc
        */

        TTrmanufacturedatedetailCB cb = tTrmanufacturedatedetailBhv.newConditionBean();

        // ID
        cb.specify().columnTrmanufacturedatedetailId();
        cb.specify().columnVersionNo();
        // 在庫調査日
        cb.specify().columnInventoryDate();

        // 拠点ID,荷主ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // 銘柄CD
        cb.query().setProductCd_Equal(dto.getTInventoryBDto().getProductCd());
        // 在庫調査指示キー
        cb.query().setInventoryKey_Equal(dto.getInputOrFetchedInventoryKey());

        if (Objects.nonNull(inventoryDate)) {
            // ライン/ブロック
            cb.query().setLineBlock_Equal(dto.getOutputSotedUnit());
            // 棚卸区分 '02'(仕分場)
            cb.query().setInventoryKbn_Equal("02");
            // 在庫調査日
            cb.query().setInventoryDate_Equal(inventoryDate);
        } else {
            // 在庫調査日 降順
            cb.query().addOrderBy_InventoryDate_Desc();
            cb.fetchFirst(1);
        }

        return tTrmanufacturedatedetailBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(2)(B)在庫調査補正情報を検索、在庫調査補正情報項目を取得する。
     * </h2>
     * <pre>
     * 在庫調査補正情報を取得する。
     * </pre>
     * @param dto Dto
     * @param caseInventoryNo ケース在庫調査番号
     * @return TTrmanufacturedatedetail 製造年月日明細
     */
    public TTrinvcorrect getRecordFromTTrinvcorrectByCaseInventoryNo(InventoryInputProductSortingPlaceDto dto, long caseInventoryNo) {

        /*
        */

        TTrinvcorrectCB cb = tTrinvcorrectBhv.newConditionBean();

        // 在庫調査補正情報ID, バージョンNo.
        cb.specify().columnTrinvcorrectId();
        cb.specify().columnVersionNo();
        // 挿入ダミーケースCD, 挿入ダミー分割ケースCD
        cb.specify().columnPutdmycasecd();
        cb.specify().columnPutdmycutcasecd();
        // 挿入ダミーケース明細番号
        cb.specify().columnPutdmycasedetailno();
        // 挿入ダミーさしず番号, 挿入ダミーさしず実績枝番号
        cb.specify().columnPutdmydirectionno();
        cb.specify().columnPutdmydirectionordergno();

        // 拠点ID,荷主ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // ケース在庫調査番号
        cb.query().setCaseinventoryno_Equal(new BigDecimal(caseInventoryNo));

        return tTrinvcorrectBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(2)(D)(a)挿入ダミーケースCDが存在する場合、該当する段ボール情報の削除を行う。
     *   4.1.(2)(D)(b)挿入ダミー分割ケースCDが存在する場合、該当する段ボール情報の削除を行う。
     *   4.1.(3)(C)(b)(III)段ボール情報を検索、段ボール情報項目を取得する。
     *   4.1.(3)(F)段ボール情報を検索、段ボール情報項目を取得する。
     * </h2>
     * <pre>
     * 段ボール情報を取得する。
     * </pre>
     * @param dto Dto
     * @param caseCd ケースCD
     * @return TTrsymbol 段ボール情報
     */
    public TTrsymbol getRecordFromTTrsymbolByCaseCd(InventoryInputProductSortingPlaceDto dto, long caseCd) {

        /*
        */

        TTrsymbolCB cb = tTrsymbolBhv.newConditionBean();

        // 段ボール情報ID, バージョンNo.
        cb.specify().columnTrsymbolId();
        cb.specify().columnVersionNo();

        // 拠点ID,荷主ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // ケースCD
        cb.query().setCasecd_Equal(caseCd);

        return tTrsymbolBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(2)(D)(c)(I)ケース明細情報を検索、ケース明細情報項目を取得する。
     * </h2>
     * <pre>
     * ケース明細情報を取得する。
     * </pre>
     * @param dto Dto
     * @param caseDetailNo ケース明細番号
     * @return TTrcasedetail ケース明細情報
     */
    public TTrcasedetail getRecordFromTTrcasedetailByCaseDetailNo(InventoryInputProductSortingPlaceDto dto, long caseDetailNo) {

        /*
        */

        TTrcasedetailCB cb = tTrcasedetailBhv.newConditionBean();

        // ケース明細情報ID, バージョンNo.
        cb.specify().columnTrcasedetailId();
        cb.specify().columnVersionNo();

        // 段ボール情報ID
        //cb.query().setTrsymbolId_Equal(new BigDecimal(dto.getTTrsymbolDto().getTrsymbolId()));
        // ケース明細番号
        cb.query().setCasedetailno_Equal(caseDetailNo);

        return tTrcasedetailBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(2)(D)(d)(I)追跡情報(棚卸)を検索、追跡情報(棚卸)項目を取得する。
     *   4.1.(3)(C)(a)(I)(iii)追跡情報(棚卸)を検索、追跡情報(棚卸)項目を取得する。
     * </h2>
     * <pre>
     * 追跡情報(棚卸)を取得する。
     * </pre>
     * @param dto Dto
     * @param centerCd 拠点CD
     * @param directionOrderKey さしず実績順序キー
     * @param directionOrdergNo さしず実績枝番号
     * @return TTrassortorder 追跡情報(棚卸)
     */
    public TTrassortorder getRecordFromTTrassortorderByDirectionOrder(InventoryInputProductSortingPlaceDto dto, String centerCd, long directionOrderKey, long directionOrdergNo) {

        /*
        */

        TTrassortorderCB cb = tTrassortorderBhv.newConditionBean();

        // さしず実績順序キー,さしず実績枝番号, バージョンNo.
        cb.specify().columnDirectionorderkey();
        cb.specify().columnDirectionordergno();
        cb.specify().columnVersionNo();
        // 受信日,配達拠点CD,配達年月日
        cb.specify().columnRcvdate();
        cb.specify().columnDpwarehousecd();
        cb.specify().columnDeliverydate();
        // 仕分ラインCD,補充先,仕分順,仕分ロケ
        cb.specify().columnLinecd();
        cb.specify().columnSotedunit();
        cb.specify().columnAssortedorder();
        cb.specify().columnSotedloc();

        // 拠点CD
        cb.query().setWarehousecd_Equal(centerCd);
        // さしず実績順序キー,さしず実績枝番号
        cb.query().setDirectionorderkey_Equal(directionOrderKey);
        cb.query().setDirectionordergno_Equal(directionOrdergNo);

        return tTrassortorderBhv.selectEntity(cb);
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(3)(A)ケース明細情報を検索、ケース内カートン数を取得する。
     * </h2>
     * <pre>
     * ケース内カートン数を取得する。
     * </pre>
     * @param dto Dto
     * @return TTrcasedetail ケース内カートン数
     */
    public long getSumOfOperationNumFromTTrcasedetail(InventoryInputProductSortingPlaceDto dto) {

        /*
        */

        long cartonQty = tTrcasedetailBhv.scalarSelect(long.class).sum(new ScalarQuery<TTrcasedetailCB>() {
            @Override
            public void query(TTrcasedetailCB cb) {
                cb.specify().columnOperationnum();
                //cb.query().setTrsymbolId_Equal(new BigDecimal(dto.getTTrsymbolDto().getTrsymbolId()));
            }
        }).orElse(0L);

        return cartonQty;
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *  4.1.(3)(C)(a)(I)(i)追跡情報(棚卸)を検索、さしず最大実績枝番号を取得する。
     *  4.1.(3)(C)(a)(I)(ii)追跡情報(棚卸)を検索、さしず最小実績枝番号を取得する。
     * </h2>
     * <pre>
     * 追さしず(最大/最小)実績枝番号を取得する。
     * </pre>
     * @param dto Dto
     * @param centerCd 拠点CD
     * @param directionOrderKey さしず実績順序キー
     * @param isMax 最大値取得フラグ
     * @return long さしず実績枝番号
     */
    public long getExtremeDirectionordergnoFromTTrassortorder(InventoryInputProductSortingPlaceDto dto, String centerCd, long directionOrderKey, boolean isMax) {

        TTrassortorderCB cb = tTrassortorderBhv.newConditionBean();

        // さしず実績枝番号
        cb.specify().columnDirectionordergno();

        // 拠点CD
        cb.query().setWarehousecd_Equal(centerCd);
        // さしず実績順序キー
        cb.query().setDirectionorderkey_Equal(directionOrderKey);

        if (isMax) {
            // 降順(最大値を取得)
            cb.query().addOrderBy_Directionordergno_Desc();
        } else {
            // 昇順(最小値を取得)
            cb.query().addOrderBy_Directionordergno_Asc();
        }

        cb.fetchFirst(1);

        return tTrassortorderBhv.selectEntity(cb).getDirectionordergno();
    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *  4.1.(3)(C)(a)(III)区分値明細マスタサブを検索、その他コード1を取得する。
     *  4.1.(3)(C)(b)(IV)区分値明細マスタサブを検索、その他コード1を取得する。
     *  4.1.(3)(G)区分値明細マスタサブを検索、その他コード1を取得する。
     * </h2>
     * <pre>
     * その他コード1を取得する。
     * </pre>
     * @param String arg
     * @return String その他コード1
     */
    public String getOtherCd1FromBClassDtlSub(String arg) {

        BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();

        bClassDtlCB.setupSelect_BClass();
        bClassDtlCB.setupSelect_BClassDtlSubAsOne();

        bClassDtlCB.specify().specifyBClass().columnClassId();
        bClassDtlCB.specify().columnClassDtlId();

        // その他コード1
        bClassDtlCB.specify().specifyBClassDtlSubAsOne().columnOthercd1();

        // 区分値CD
        bClassDtlCB.query().queryBClass().setClassCd_Equal("DMYDIRECTIONCD");

        // 区分値明細CD
        bClassDtlCB.query().setClassDtlCd_Equal(arg);

        return bClassDtlBhv.selectEntity(bClassDtlCB).getBClassDtlSubAsOne().getOthercd1();

    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(3)(C)(b)(VII)ケース補充情報を検索、ケース補充情報項目を取得する。
     *   
     * </h2>
     * <pre>
     * ケース補充情報を取得する。
     * </pre>
     * @param dto Dto
     * @param caseCd ケースCD
     * @return TTrassortorder ケース補充情報
     */
    public TTrcasestock getRecordFromTTrcasestockByCaseCd(InventoryInputProductSortingPlaceDto dto, Long caseCd) {

        /*
        */

        TCenterSymbolCB tCenterSymbolCB = tCenterSymbolBhv.newConditionBean();

        tCenterSymbolCB.setupSelect_TTrsymbol();
        tCenterSymbolCB.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        tCenterSymbolCB.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        tCenterSymbolCB.query().queryTTrsymbol().setCasecd_Equal(caseCd);
        tCenterSymbolCB.fetchFirst(1);

        long trsymbolId = tCenterSymbolBhv.selectEntity(tCenterSymbolCB).getTrsymbolId();

        TTrcasestockCB tTrcasestockCB = tTrcasestockBhv.newConditionBean();

        tTrcasestockCB.specify().columnTrcasestockId();
        tTrcasestockCB.specify().columnVersionNo();
        tTrcasestockCB.specify().columnAssortedindex();
        tTrcasestockCB.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        tTrcasestockCB.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        tTrcasestockCB.query().setCenterSymbolId_Equal(new BigDecimal(trsymbolId));

        return tTrcasestockBhv.selectEntity(tTrcasestockCB);

    }

    /**
     * <h2>
     * ◆在庫調査結果確認画面 <br>
     * E_10_002:確定ボタン押下 <br>
     *   4.1.(3)(C)(b)(XIII)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
     *   4.1.(3)(U)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
     * </h2>
     * <pre>
     * ケース在庫調査情報を取得する。
     * </pre>
     * @param dto Dto
     * @param caseInventoryNo ケース在庫調査番号
     * @return TTrcaseinventory ケース在庫調査情報
     */
    public TTrcaseinventory getRecordFromTTrcaseinventoryByCaseInventoryNo(InventoryInputProductSortingPlaceDto dto, BigDecimal caseInventoryNo) {

        /*      
        */

        TTrcaseinventoryCB cb = tTrcaseinventoryBhv.newConditionBean();

        // ケース在庫調査情報ID
        cb.specify().columnTrcaseinventoryId();
        cb.specify().columnVersionNo();
        // 仕分数量累計(カートン)
        cb.specify().columnTotalsortednum();

        // 拠点ID
        cb.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        // 荷主ID
        cb.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        // ケース在庫調査番号
        cb.query().setCaseinventoryno_Equal(caseInventoryNo);

        return tTrcaseinventoryBhv.selectEntity(cb);
    }

    public void outPrintln(InventoryInputProductSortingPlaceDto dto, String title) {

        System.out.println(String.format("=================================>=================================>"));
        System.out.println(String.format("=================================>【%s】", title));
        System.out.println(String.format("No.01 d_荷主拠点マスタ          => %s", ReflectionToStringBuilder.toString(dto.getMClientCenterDto(), ToStringStyle.JSON_STYLE)));
        System.out.println(String.format("No.02 i_ライン                  => %s", dto.getInputLine()));
        System.out.println(String.format("No.03 i_ブロック                => %s", dto.getInputBlock()));
        System.out.println(String.format("No.04 o_ライン/ブロック         => %s", dto.getOutputLineBlock()));
        System.out.println(String.format("No.05 i_g_在庫調査指示キー      => %s", dto.getInputOrFetchedInventoryKey()));
        //System.out.println(String.format("No.06 r_在庫調査区分            => %s", dto.getStockInspectionCategoryName()));
        System.out.println(String.format("No.07 d_棚卸ヘッダ              => %s", ReflectionToStringBuilder.toString(dto.getTInventoryHDto(), ToStringStyle.JSON_STYLE)));
        System.out.println(String.format("No.08 i_調査ロケーションCD      => %s", dto.getInputLocationCd()));
        System.out.println(String.format("No.09 o_ケース補充先            => %s", dto.getOutputSotedUnit()));
        System.out.println(String.format("No.10 o_ロケーションNo.         => %s", dto.getOutputLocationNo()));
        System.out.println(String.format("No.11 i_2次元バーコード         => %s", dto.getInputBarcode()));
        System.out.println(String.format("No.12 i_g_製造年月日            => %s", dto.getInputOrFetchedManufactureDate()));
        System.out.println(String.format("No.13 d_段ボール情報            => %s", ReflectionToStringBuilder.toString(dto.getTTrsymbolDto(), ToStringStyle.JSON_STYLE)));
        System.out.println(String.format("No.14 d_棚卸ボディ              => %s", ReflectionToStringBuilder.toString(dto.getTInventoryBDto(), ToStringStyle.JSON_STYLE)));
        System.out.println(String.format("No.15 i_空ロケ押下フラグ        => %s", dto.isEmptyButtonPressFlag()));
        System.out.println(String.format("No.16 i_先頭ケースのカートン数  => %s", dto.getInputHeadCaseCartonQty()));
        System.out.println(String.format("No.17 i_ケース数                => %s", dto.getInputCaseQty()));
        System.out.println(String.format("No.18 i_カートン数              => %s", dto.getInputCartonQty()));
        System.out.println(String.format("No.19 i_製品不良数              => %s", dto.getInputDefectiveQty()));
        System.out.println(String.format("No.20 g_前回調査製造年月日      => %s", dto.getFetchedPrevInspectionManufactureDate()));
        System.out.println(String.format("No.21 o_仕分予定数量            => %s", dto.getOutputPlannedSortingQty()));
        System.out.println(String.format("No.22 o_仕分実績数量            => %s", dto.getOutputCompletedSortingQty()));
        System.out.println(String.format("No.23 o_仕分差異数量            => %s", dto.getOutputDiscrepancySortingQty()));
        System.out.println(String.format("No.24 o_さしず実績順序キー      => %s", dto.getOutputDirectionOrderKey()));
        System.out.println(String.format("No.25 o_製造年月日(登録更新用)  => %s", dto.getOutputRegistrationManufactureDate()));
        System.out.println(String.format("No.26 o_製造年月日(作業実績用)  => %s", dto.getOutputWorkManufactureDate()));
        System.out.println(String.format("No.27 o方面ピストン             => %s", dto.getOutputPiston()));
        System.out.println(String.format("No.28 o_銘柄CD                  => %s", dto.getOutputProductCd()));
        System.out.println(String.format("No.29 o_銘柄名称                => %s", dto.getOutputProductName()));
        System.out.println(String.format("=================================>=================================>"));

    }
}
