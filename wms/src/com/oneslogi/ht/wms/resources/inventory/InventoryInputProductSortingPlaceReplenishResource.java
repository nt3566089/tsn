package com.oneslogi.ht.wms.resources.inventory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TCenterSymbolCB;
import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.cbean.TTrcasestockCB;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
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
import com.oneslogi.base.dbflute.exbhv.TTrworkBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TTrwork;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceReplenishDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ◆仕分場調査入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceReplenish")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceReplenish/display")
public class InventoryInputProductSortingPlaceReplenishResource extends HandyMenuResource {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;
    @Inject
    private TTrworkBhv tTrworkBhv;

    @Inject
    private TInventoryHBhv tInventoryHBhv;
    @Inject
    private TInventoryInstBhv tInventoryInstBhv;
    @Inject
    private TInventoryBBhv tInventoryBBhv;
    /* No.14 ケース明細情報 */
    @Inject
    private TTrcasedetailBhv tTrcasedetailBhv;
    @Inject
    private BClassBhv bClassBhv;
    @Inject
    private BClassDtlBhv bClassDtlBhv;
    @Inject
    private BClassDtlSubBhv bClassDtlSubBhv;

    // ===== 使用テーブル =====
    /* No.01 荷主拠点マスタ */
    @Inject
    private MClientCenterBhv mClientCenterBhv;

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
    private TTrcasestockBhv tTrcasestockBhv;

    /* No.10 ケース補充情報 */
    @Inject
    private TCenterSymbolBhv tCenterSymbolBhv;

    /* No.11 ケース在庫調査情報 */
    @Inject
    private TTrcaseinventoryBhv tTrcaseinventoryBhv;

    /* No.12 製造年月日 */
    @Inject
    private TTrmanufacturedateBhv tTrmanufacturedateBhv;

    /* No.13追跡情報(棚卸) */
    @Inject
    private TTrassortorderBhv tTrassortorderBhv;

    /* No.15 在庫調査補正情報 */
    @Inject
    private TTrinvcorrectBhv tTrinvcorrectBhv;

    /* No.16 製造年月日明細 */
    @Inject
    private TTrmanufacturedatedetailBhv tTrmanufacturedatedetailBhv;

    /* No.17 製造年月日履歴 */
    @Inject
    private TTrmanufacturedatehistoryBhv tTrmanufacturedatehistoryBhv;

    /**
     * 
     * E_01_001:初期表示
     * @throws Exception
     */
    @GET
    @Path("/load")
    public void load() throws Exception {
        //自画面初期化
        load(this, util, inventoryInputProductSortingPlaceLogic);
    }

    // 1.画面表示項目取得(load)
    public static void load(HandyResourceBase resource, HandyCommonUtil util, InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = resource.getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションからログイン情報を取得する。
        //HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

        // 1.1.(2)セッションの初期設定
        InventoryInputProductSortingPlaceDto dto = new InventoryInputProductSortingPlaceDto();
        /* No.01 d_荷主拠点マスタ          => */ dto.setMClientCenterDto(new MClientCenter());
        /* No.02 i_ライン                  => */ dto.setInputLine("");
        /* No.03 i_ブロック                => */ dto.setInputBlock("");
        /* No.04 o_ライン/ブロック         => */ dto.setOutputLineBlock("");
        /* No.05 i_g_在庫調査指示キー      => */ dto.setInputOrFetchedInventoryKey("");
        ///* No.06 r_在庫調査区分            => */ dto.setStockInspectionCategory("");
        /* No.07 d_棚卸ヘッダ              => */ dto.setTInventoryHDto(new TInventoryInst());
        /* No.08 i_調査ロケーションCD      => */ dto.setInputLocationCd("");
        /* No.09 o_ケース補充先            => */ dto.setOutputSotedUnit("");
        /* No.10 o_ロケーションNo.         => */ dto.setOutputLocationNo("");
        /* No.11 i_2次元バーコード         => */ dto.setInputBarcode("");
        /* No.12 i_g_製造年月日            => */ dto.setInputOrFetchedManufactureDate("");
        /* No.13 d_段ボール情報            => */ dto.setTTrsymbolDto(new SqlTTrsymbolInventoryInputProductSortingPlace());
        /* No.14 d_棚卸ボディ              => */ dto.setTInventoryBDto(new TInventoryB());
        /* No.15 i_空ロケ押下フラグ        => */ dto.setEmptyButtonPressFlag(false);
        /* No.16 i_先頭ケースのカートン数  => */ dto.setInputHeadCaseCartonQty("");
        /* No.17 i_ケース数                => */ dto.setInputCaseQty("");
        /* No.18 i_カートン数              => */ dto.setInputCartonQty("");
        /* No.19 i_製品不良数              => */ dto.setInputDefectiveQty("");
        /* No.20 g_前回調査製造年月日      => */ dto.setFetchedPrevInspectionManufactureDate("");
        /* No.21 o_仕分予定数量            => */ dto.setOutputPlannedSortingQty(0);
        /* No.22 o_仕分実績数量            => */ dto.setOutputCompletedSortingQty(0);
        /* No.23 o_仕分差異数量            => */ dto.setOutputDiscrepancySortingQty(0);
        /* No.24 o_さしず実績順序キー      => */ dto.setOutputDirectionOrderKey(0);
        /* No.25 o_製造年月日(登録更新用)  => */ dto.setOutputRegistrationManufactureDate("");
        /* No.26 o_製造年月日(作業実績用)  => */ dto.setOutputWorkManufactureDate("");
        /* No.27 o方面ピストン             => */ dto.setOutputPiston("");
        /* No.28 o_銘柄CD                  => */ dto.setOutputProductCd("");
        /* No.29 o_銘柄名称                => */ dto.setOutputProductName("");

        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        //自画面表示
        display(resource, util, inventoryInputProductSortingPlaceLogic);
    }

    /**
     * 2.画面初期設定(display)
     * @throws Exception
     */
    @GET
    @Path("/display")
    public void display() throws Exception {
        display(this, util, inventoryInputProductSortingPlaceLogic);
    }

    public static void display(HandyResourceBase resource, HandyCommonUtil util, InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic) throws Exception {

        HttpServletRequest req = resource.getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 2.1.(1)在庫調査入力[仕分場]情報より仕分場調査入力(InventoryInputProductSortingPlaceReplenish)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceReplenishHT");

        // 非表示ボタン設定(送信)
        resource.setHideButton(ButtonInfo.builder().url("InventoryInputProductSortingPlaceReplenish/send").build());

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceReplenish/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceReplenish/send").itemCd("send").build());

//        resource.setOptionButton2(
//                ButtonInfo.builder().url("InventoryInputProductSortingPlaceReplenish/test").itemCd("line").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)仕分場調査入力(InventoryInputProductSortingPlaceReplenish)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceReplenish.jsp", ses);
    }

    /**
     * E_01_002:確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceReplenishDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_ライン、在庫調査入力[仕分場]情報.i_ブロックに設定する。
        ///* No.02 i_ライン                  => */ dto.setInputLine(Objects.requireNonNullElse(bean.getLine(), ""));
        ///* No.03 i_ブロック                => */ dto.setInputBlock(Objects.requireNonNullElse(bean.getBlock(), ""));

        /*
         * 2.入力チェック
         */
        // 2.1.入力関連チェック
        if (bean.isValidateErr()) {
            return;
        }

//        // 2.2.画面入力チェック
//        // 2.2.(1)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
//        // 入力.ライン/ブロックが共に未入力
//        if (dto.getInputLine().isBlank() && dto.getInputBlock().isBlank()) {
//            getErrorManager().add(new ErrorStatus(), WmsMessageConst.LINE_BLOCK_NOT_INPUT_ERROR);
//            return;
//        }
//
//        // 入力.ライン/ブロックが共に入力
//        if (!dto.getInputLine().isBlank() && !dto.getInputBlock().isBlank()) {
//            getErrorManager().add(new ErrorStatus(), WmsMessageConst.LINE_BLOCK_BOTH_INPUT_ERROR);
//            return;
//        }

//        /*
//         * 3.業務チェック
//         */
//        // 3.1.(1)変数の初期化
//        String lineOrBlock = (!dto.getInputLine().isBlank())
//                ? String.format("L%s", dto.getInputLine())
//                : String.format("B%s", dto.getInputBlock());

        HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

        // 3.1.(2)荷主拠点マスタをログイン情報で検索、荷主拠点マスタを取得する。
        MClientCenter mClientCenter = inventoryInputProductSortingPlaceLogic.getRecordFromMClientCenterByLoginInfo(loginInfo);
        // 3.1.(2)(A)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
        // 該当データ無し
        if (Objects.isNull(mClientCenter)) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
            return;
        }
        /* No.01 d_荷主拠点マスタ          => */ dto.setMClientCenterDto(mClientCenter);

        // 3.1.(2)棚卸ヘッダを検索、レコード数を取得する。
        // 3.1.(2)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
//        if (inventoryInputProductSortingPlaceLogic.countRecordInTInventoryHByLineOrBlock(dto, lineOrBlock) == 0) {
//            getErrorManager().add(new ErrorStatus(), WmsMessageConst.LINE_BLOCK_NOT_FOUND_ERROR);
//            return;
//        }

        /*
         * 4.登録処理
         */
        // 4.1.作業実績(基盤)の登録を行う。
        // (テーブル項目編集定義.1.作業実績(基盤)開始登録(T_TRWORK).登録を参照)
        // 作業時刻の設定
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        TTrwork tTrwork = new TTrwork();
        /* No.01 作業実績ID             */
        /* No.02 荷主CD                 */ tTrwork.setClientCd(loginInfo.getClientCd());
        /* No.03 拠点CD                 */ tTrwork.setCenterCd(loginInfo.getCenterCd());
        /* No.04 ユーザCD               */ tTrwork.setUsercd(loginInfo.getUserCd());
        /* No.05 業務区分               */ tTrwork.setTaskType("HC");
        /* No.06 業務区分詳細           */ tTrwork.setTaskTypeDetail("HZ004L01");
        /* No.07 作業年月日             */ tTrwork.setWorkDt(dtFormat.format(timestamp));
        /* No.08 作業時刻               */ tTrwork.setWorktime(timestamp);
        /* No.09 開始終了区分           */ tTrwork.setStartEnd("1");
        tTrworkBhv.insert(tTrwork);

        /*
         * 5.画面遷移
         */
        // 5.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        ///* No.04 o_ライン/ブロック         => */ dto.setOutputLineBlock(lineOrBlock);

        // 5.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 5.2.(1)指示リスト入力(InventoryInputProductSortingPlaceInstList)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceInstListResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E01:◆仕分場調査入力");
    }

    /**
     * 
     * E_01_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        // 1.1.(1)セッションの在庫調査入力[仕分場]情報を削除する。

        HttpServletRequest req = this.getHttpServletRequest();
        HttpSession ses = req.getSession();

        //通信制御データをクリア
        util.clearHtComCtl(ses);
        ses.removeAttribute("InventoryInputProductSortingPlaceDto");

        // 1.2.(1)在庫調査管理メニュー(InventoryMenu)初期表示処理(display)を行う。
        displaySubMenu("InventoryMenu");
    }

    /*
     * テスト用
     */
    @GET
    @Path("/makeTInventoryH")
    public void makeTInventoryH() throws Exception {

        /* 棚卸ヘッダ */
        TInventoryHCB cb = tInventoryHBhv.newConditionBean();
        cb.specify().columnInventoryKey();
        cb.specify().columnCenterId();
        List<TInventoryH> list = tInventoryHBhv.selectList(cb);
        TInventoryHDtoMapper mapper = new TInventoryHDtoMapper();
//        List<TInventoryHDto> dtos = list.stream().map(s -> mapper.mappingToDto(s)).toList();
//
//        //        if (dtos.size() == 45) {
//        //            return;
//        //        }
//
//        // 日付文字列
//        //Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        //SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
//
//        // 在庫調査指示キー
//        long key = (dtos.isEmpty())
//                ? 1
//                : dtos.stream().map(s -> s.getInventoryKey()).max(Long::compareTo).orElse((long) 1) + 1;
//
//        //        // 拠点ID
//        //        long centerId = (dtos.isEmpty())
//        //                ? 1
//        //                : dtos.stream().map(s -> s.getCenterId()).max(Long::compareTo).orElse((long) 1) + 1;

        /* 棚卸指示 */
        // 乱数
        String[] kbns = { "01", "02", "03" };
        //        String[] lbs = { "L1", "L2", "L3", "L4", "L5", "B1", "B2", "B3", "B4", "B5" };
        String[] lbs = { "L1" };
        Function<String[], Integer> arrayLength = arr -> arr.length;
        Random rand = new Random();

//        LongStream.range(key, key + 500).forEach(s -> {
//
//            TInventoryH tInventoryH = new TInventoryH();
//            /* No.02 荷主ID                    => */ tInventoryH.setClientId((long) 1);
//            /* No.03 拠点ID                    => */ tInventoryH.setCenterId((long) 2);
//            /* No.04 バッチNo.                 => */ tInventoryH.setBatchNum(s);
//            //* No.05 棚卸日                    => */ tInventoryH.setInventoryDt((dtFormat.format(timestamp)));
//            /* No.05 棚卸日                    => */ tInventoryH.setInventoryDt("20231120");
//            /* No.06 在庫調査指示キー          => */ tInventoryH.setInventoryKey(s);
//            tInventoryHBhv.insert(tInventoryH);
//
//            TInventoryInst tInventoryInst = new TInventoryInst();
//            /* No.02 棚卸ヘッダID              => */ tInventoryInst.setInventoryHId(tInventoryH.getInventoryHId());
//            /* No.03 在庫調査区分              => */ tInventoryInst.setInventoryInstKbn(kbns[rand.nextInt(arrayLength.apply(kbns))]);
//            /* No.04 ライン/ブロック           => */ tInventoryInst.setLineBlock(lbs[rand.nextInt(arrayLength.apply(lbs))]);
//            /* No.05 方面ピストン              => */ tInventoryInst.setDirectionalPiston("1234A");
//            tInventoryInstBhv.insert(tInventoryInst);
//
//        });

        InventoryInputProductSortingPlaceReplenishResource.load(this, util, inventoryInputProductSortingPlaceLogic);
    }

    @GET
    @Path("/makeTInventoryB")
    public void makeTInventoryB() throws Exception {

        // 乱数
        Random rand = new Random();

        TInventoryB tInventoryB = new TInventoryB();
        //* No.02 棚卸ヘッダID              => */ tInventoryB.setInventoryHId(rand.nextLong(78 - 34 + 1) + 34);
        //* No.02 棚卸ヘッダID              => */ tInventoryB.setInventoryHId(rand.nextLong(500) + 1);
        /* No.02 棚卸ヘッダID              => */ tInventoryB.setInventoryHId((long) 500);
        ///* No.07 ロケーションID            => */ tInventoryB.setLocationId(rand.nextLong(51) + 50);
        /* No.19 引当可能数                => */ tInventoryB.setChargeNum(BigDecimal.valueOf(0.0));
        /* No.20 引当済数                  => */ tInventoryB.setAllocNum(BigDecimal.valueOf(0.0));
        /* No.21 移動中数                  => */ tInventoryB.setMoveNum(BigDecimal.valueOf(0.0));
        /* No.22 棚卸数                    => */ tInventoryB.setInventoryNum(BigDecimal.valueOf(0.0));
        /* No.24 在庫調整フラグ            => */ tInventoryB.setStockAdjustFlg("0");
        /* No.26 銘柄CD                    => */ tInventoryB.setProductCd("123");
        /* No.37 入力フラグ                => */ tInventoryB.setInventoryInputFlg("0");

        tInventoryBBhv.insert(tInventoryB);

        //        /* 棚卸ボディ */
        //        TInventoryBCB cb = tInventoryBBhv.newConditionBean();
        //        cb.specify().columnInventoryBId();
        //        List<TInventoryB> list = tInventoryBBhv.selectList(cb);
        //        TInventoryBDtoMapper mapper = new TInventoryBDtoMapper();
        //        List<TInventoryBDto> dtos = list.stream().map(s -> mapper.mappingToDto(s)).toList();
        //        outPrintln(dtos.stream().map(s -> s.getInventoryBId()).toList());

        InventoryInputProductSortingPlaceReplenishResource.load(this, util, inventoryInputProductSortingPlaceLogic);
    }

    public <T extends Number> void outPrintln(List<T> lists) throws Exception {
        lists.stream().forEach(s -> System.out.println(s));
    }

    @GET
    @Path("/test")
    public void test() throws Exception {

        //        HttpServletRequest req = getHttpServletRequest();
        //        HttpSession ses = req.getSession();
        //        HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
        //
        //        TInventoryInstCB tInventoryInstCB = tInventoryInstBhv.newConditionBean();
        //        tInventoryInstCB.setupSelect_TInventoryH();
        //
        //        // 拠点ID,荷主ID,ライン/ブロック
        //        tInventoryInstCB.query().setLineBlock_Equal("L5");
        //        tInventoryInstCB.query().queryTInventoryH().setCenterId_Equal(loginInfo.getCenterId());
        //        tInventoryInstCB.query().queryTInventoryH().setClientId_Equal(loginInfo.getClientId());
        //        tInventoryInstCB.query().queryTInventoryH().innerJoin();
        //
        //        List<TInventoryInst> list = tInventoryInstBhv.selectList(tInventoryInstCB);
        //
        //        TInventoryInstDtoMapper mapper = new TInventoryInstDtoMapper();
        //
        //        List<TInventoryInstDto> dtos = list.stream().map(s -> mapper.mappingToDto(s)).toList();
        //        TInventoryHDto hdt = dtos.getFirst().getTInventoryH();
        //
        //        InventoryInputProductSortingPlaceReplenishResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        //        HttpServletRequest req = getHttpServletRequest();
        //        HttpSession ses = req.getSession();
        //        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");
        //
        //        long cartonQty = tTrcasedetailBhv.scalarSelect(long.class).max(new ScalarQuery<TTrcasedetailCB>() {
        //            @Override
        //            public void query(TTrcasedetailCB cb) {
        //                cb.specify().columnOperationnum();
        //                //cb.query().setTrsymbolId_Equal(new BigDecimal(dto.getTTrsymbolDto().getTrsymbolId()));
        //            }
        //        }).orElse(0L);
        //
        //        TTrcasedetailCB cb = tTrcasedetailBhv.newConditionBean();
        //        cb.specify().columnOperationnum();
        //        cb.query().addOrderBy_Operationnum_Desc();
        //        cb.fetchFirst(1);
        //
        //        System.out.println(cartonQty);
        //        System.out.println(tTrcasedetailBhv.selectEntity(cb).getOperationnum());

        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        TCenterSymbolCB tCenterSymbolCB = tCenterSymbolBhv.newConditionBean();

        tCenterSymbolCB.setupSelect_TTrsymbol();
        tCenterSymbolCB.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        tCenterSymbolCB.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        tCenterSymbolCB.query().queryTTrsymbol().setCasecd_Equal((long) 1);
        tCenterSymbolCB.fetchFirst(1);

        long trsymbolId = tCenterSymbolBhv.selectEntity(tCenterSymbolCB).getTrsymbolId();

        TTrcasestockCB tTrcasestockCB = tTrcasestockBhv.newConditionBean();

        tTrcasestockCB.specify().columnTrcasestockId();
        tTrcasestockCB.specify().columnVersionNo();
        tTrcasestockCB.specify().columnAssortedindex();
        tTrcasestockCB.query().setCenterId_Equal(dto.getMClientCenterDto().getCenterId());
        tTrcasestockCB.query().setClientId_Equal(dto.getMClientCenterDto().getClientId());
        tTrcasestockCB.query().setCenterSymbolId_Equal(new BigDecimal(trsymbolId));
        tTrcasestockBhv.selectEntity(tTrcasestockCB);

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
        bClassDtlCB.query().setClassDtlCd_Equal("CUSTOMERCD");

        bClassDtlBhv.selectEntity(bClassDtlCB);

    }

}
