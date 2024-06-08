package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceLocationDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ◆調査ﾛｹｰｼｮﾝ入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceLocation")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceLocation/display")
public class InventoryInputProductSortingPlaceLocationResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_03_001:初期表示
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
        //* No.08 i_調査ロケーションCD      => */ dto.setInputLocationCd("");
        /* No.08 i_調査ロケーションCD      => */ dto.setInputLocationCd("L1-0101A");
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

        // 2.1.(1)在庫調査入力[仕分場]情報より調査ロケーション入力(InventoryInputProductSortingPlaceLocation)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceLocationHT");
        // 2.1.(1)(a)セッション.r_在庫調査区分が('02', '中間検品')の場合、以下の設定を行う。 
        // InventoryInputProductSortingPlaceLocation.jsp にて設定

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceLocation/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceLocation/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)調査ロケーション入力(InventoryInputProductSortingPlaceLocation)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceLocation.jsp", ses);
    }

    /**
     * E_03_002:スキャン/確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceLocationDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_調査ロケーションCDに設定する。
        ///* No.08 i_調査ロケーションCD      => */ dto.setInputLocationCd(Objects.requireNonNullElse(bean.getLocationCd(), ""));

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
        // 3.1.(1)棚卸ボディを検索、レコード数を取得する。
        // 3.1.(1)(A)エラーが発生した場合、エラーメッセージを在庫調査入力情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (inventoryInputProductSortingPlaceLogic.countRecordInTInventoryB(dto) == 0) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.LOCATION_INST_LIST_NOT_FOUND_ERROR);
            return;
        }

        /*
         * 4.画面遷移
         */
        // 4.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        /* No.09 o_ケース補充先            => */ dto.setOutputSotedUnit(dto.getInputLocationCd().substring(0, 2));
        /* No.10 o_ロケーションNo.         => */ dto.setOutputLocationNo(dto.getInputLocationCd().substring(3));

        // 4.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 4.2.(1)先頭ケース2次元バーコード入力(InventoryInputProductSortingPlaceSymbolBarcode)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceSymbolBarcodeResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E03:◆調査ﾛｹｰｼｮﾝ入力");
    }

    /**
     * 
     * E_03_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        /*
         * 1.画面遷移
         */
        // 1.1.(1)指示リスト入力(InventoryInputProductSortingPlaceInstList)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceInstListResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
