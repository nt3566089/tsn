package com.oneslogi.ht.wms.resources.inventory;

import java.util.Objects;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceSymbolBarcodeDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;
import com.oneslogi.wms.logic.tsnCommon.BGL0002SplitSymbolBarcode;

/**
 * ◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceSymbolBarcode")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceSymbolBarcode/display")
public class InventoryInputProductSortingPlaceSymbolBarcodeResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_04_001:初期表示
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

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.1.(2)セッションの初期設定
        //* No.11 i_2次元バーコード         => */ dto.setInputBarcode("");
        /* No.11 i_2次元バーコード         => */ dto.setInputBarcode("1111,1028,33333333,4444,5555,666666,77,8888,99999999,aaaaaaaaaaaa,b,");
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

        // 2.1.(1)在庫調査入力[仕分場]情報より指示リスト入力画面(InventoryInputProductSortingPlaceInstList)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceSymbolBarcodeHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceSymbolBarcode/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceSymbolBarcode/send").itemCd("send").build());

        // 2.1.(4)空ロケボタン設定を行う。
        resource.setOptionButton2(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceSymbolBarcode/empty").itemCd("empty").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)仕分場調査入力(InventoryInputProductSortingPlaceReplenish)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceSymbolBarcode.jsp", ses);
    }

    /**
     * E_04_002:スキャン/確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceSymbolBarcodeDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_2次元バーコードに設定する。
        ///* No.11 i_2次元バーコード         => */ dto.setInputBarcode(Objects.requireNonNullElse(bean.getBarcode(), ""));

        /*
         * 2.入力チェック
         */
        // 2.1.入力関連チェック
        if (bean.isValidateErr()) {
            return;
        }

        /*
         * 3.業務チェック
         */
        // 3.1.(1)2次元バーコードの内容チェック
        // !!!!!!!!!!共通関数未完成のためここの処理はスキップ!!!!!!!!!!
        //        if(bgl00XCheckSymbolBarcode(bean.getBarcode())) {
        //            return;
        //        }

        // 3.1.(2)2次元バーコードの内容チェック
        BGL0002SplitSymbolBarcode bgl0002SplitSymbolBarcode = new BGL0002SplitSymbolBarcode();
        TSplitData tSplitData = bgl0002SplitSymbolBarcode.splitSymbolBarcode(bean.getBarcode(), new TSplitData(), null);
        if (tSplitData.equals(null)) {
            return;
        }

        // 3.1.(3)銘柄マスタを検索、レコード数を取得する。
        // 3.1.(3)(A)エラーが発生した場合、エラーメッセージを在庫調査入力情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (inventoryInputProductSortingPlaceLogic.countRecordInMProductByProductCd(dto, tSplitData.getItemCd()) == 0) {
            getErrorManager().add(new ErrorStatus(), "この2次元バーコードの銘柄コードは存在しません。"); // ← エラーメッセージが設定されていないので、後ほど作る
            return;
        }

        // 3.1.(4)銘柄別補充先マスタを検索、レコード数を取得する。
        // 3.1.(4)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (inventoryInputProductSortingPlaceLogic.countRecordInMMfstockitemByProductCd(dto, tSplitData.getItemCd()) == 0) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_CD_MISMATCH_ERROR);
            return;
        }

        // 3.1.(5)段ボール情報を検索、段ボール情報項目を取得する。
        SqlTTrsymbolInventoryInputProductSortingPlace sqlTTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbol(dto, null);
        // 3.1.(4)(A)エラーが発生した場合、エラーメッセージを在庫調査入力情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (Objects.isNull(sqlTTrsymbol)) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.CASE_NOT_REPLENISH_ERROR);
            return;
        }

        // 3.1.(6)棚卸ボディを検索、棚卸ボディを取得する。
        TInventoryB tInventoryB = inventoryInputProductSortingPlaceLogic.getRecorFromTInventoryBByProductCd(dto, sqlTTrsymbol.getProductCd());
        // 3.1.(6)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 3.1.(6)で取得した棚卸ボディ.銘柄CD != 3.1.(2)で取得した分割データ.銘柄コード
        if (!Objects.equals(tInventoryB.getProductCd(), tSplitData.getItemCd())) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.LOCATION_NO_PRODUCT_ERROR);
            return;
        }
        // 3.1.(7)変数の初期化
        // 1ケース当カートン数 == 入庫実績数量(個装) => ? '0':カートン補充製品以外 : '1':カートン補充製品
        boolean cartonReplenishmentFlag = (tInventoryB.getMProduct().getUnit1().longValue()
                * tInventoryB.getMProduct().getUnit2().longValue()) == sqlTTrsymbol.getReceivedqty().longValue()
                        ? false
                        : true;

        /*
         * 4.画面遷移
         */
        // 4.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        /* No.12 i_g_製造年月日            => */ dto.setInputOrFetchedManufactureDate(sqlTTrsymbol.getLot4());
        /* No.13 d_段ボール情報            => */ dto.setTTrsymbolDto(sqlTTrsymbol);
        /* No.14 d_棚卸ボディ              => */ dto.setTInventoryBDto(tInventoryB);
        /* No.15 i_空ロケ押下フラグ        => */ dto.setEmptyButtonPressFlag(false);
        /* No.28 o_銘柄CD                  => */ dto.setOutputProductCd(tInventoryB.getProductCd());
        /* No.29 o_銘柄名称                => */ dto.setOutputProductName(tInventoryB.getMProduct().getProductAbbr());

        // 4.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 4.2.(1)変数.カートン補充製品フラグが'0'(カートン補充製品以外)の場合、以下を実行する。
        // 4.2.(1)(A)(a)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)初期表示処理(load)を行う。
        if (!cartonReplenishmentFlag) {
            InventoryInputProductSortingPlaceQuantityResource.load(this, util, inventoryInputProductSortingPlaceLogic);
        }
        // 4.2.(2)変数.カートン補充製品フラグが'1'(カートン補充製品)の場合、以下を実行する。
        // 4.2.(2)(A)(a)先頭ケース数量入力(InventoryInputProductSortingPlaceCartonQuantity)初期表示処理(load)を行う。
        else {
            InventoryInputProductSortingPlaceCartonQuantityResource.load(this, util, inventoryInputProductSortingPlaceLogic);
        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E04:◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力");
    }

    /**
     * E_04_003:空ロケボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/empty")
    public void empty(@BeanParam InventoryInputProductSortingPlaceSymbolBarcodeDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        /*
         * 2.業務チェック
         */
        // 2.1.エラーチェック
        // 2.1.(1)銘柄別補充先マスタを検索、レコード数を取得する。
        // 2.1.(1)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (inventoryInputProductSortingPlaceLogic.countRecordInMMfstockitemByProductCd(dto, "") == 0) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_CD_MISMATCH_ERROR);
            return;
        }

        // 2.1.(2)段ボール情報を検索、段ボール情報項目を取得する。
        SqlTTrsymbolInventoryInputProductSortingPlace sqlTTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbol(dto, null);

        // 2.1.(3)棚卸ボディを検索、棚卸ボディ項目を取得する。
        TInventoryB tInventoryB = inventoryInputProductSortingPlaceLogic.getRecorFromTInventoryBByProductCd(dto, sqlTTrsymbol.getProductCd());

        /*
         * 3.画面遷移
         */
        // 3.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理

        /* No.12 i_g_製造年月日            => */ dto.setInputOrFetchedManufactureDate(sqlTTrsymbol.getLot4());
        /* No.13 d_段ボール情報            => */ dto.setTTrsymbolDto(sqlTTrsymbol);
        /* No.14 d_棚卸ボディ              => */ dto.setTInventoryBDto(tInventoryB);
        /* No.15 i_空ロケ押下フラグ        => */ dto.setEmptyButtonPressFlag(true);
        /* No.28 o_銘柄CD                  => */ dto.setOutputProductCd(tInventoryB.getProductCd());
        /* No.29 o_銘柄名称                => */ dto.setOutputProductName(tInventoryB.getMProduct().getProductNm());

        // 3.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 3.2.(1)製品不良数入力(InventoryInputProductSortingPlaceDefectiveQuantity)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceDefectiveQuantityResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E04:◆先頭ｹｰｽ2次元ﾊﾞｰｺｰﾄﾞ入力");
    }

    /**
     * 
     * E_04_004:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        // 1.1.(1)調査ロケーション入力(InventoryInputProductSortingPlaceLocation)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceLocationResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }
}
