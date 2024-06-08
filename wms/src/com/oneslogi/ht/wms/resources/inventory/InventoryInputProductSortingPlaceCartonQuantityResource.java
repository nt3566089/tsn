package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceCartonQuantityDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * ◆先頭ｹｰｽ数量入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceCartonQuantity")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceCartonQuantity/display")
public class InventoryInputProductSortingPlaceCartonQuantityResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_05_001:初期表示
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
        /* No.16 i_先頭ケースのカートン数  => */ dto.setInputHeadCaseCartonQty("");
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

        // 2.1.(1)在庫調査入力[仕分場]情報より先頭ｹｰｽ数量入力画面(InventoryInputProductSortingPlaceCartonQuantity)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceCartonQuantityHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceCartonQuantity/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceCartonQuantity/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)先頭ｹｰｽ数量入力(InventoryInputProductSortingPlaceCartonQuantity)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceCartonQuantity.jsp", ses);
    }

    /**
     * E_05_002:確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceCartonQuantityDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_先頭ケースのカートン数に設定する。
        ///* No.16 i_先頭ケースのカートン数  => */ dto.setInputHeadCaseCartonQty(Objects.requireNonNullElse(bean.getCartonQty(), ""));

        /*
         * 2.入力チェック
         */
        // 2.1.入力関連チェック
        if (bean.isValidateErr()) {
            return;
        }

        /*
         * 3.画面遷移
         */
        // 3.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        // 3.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 3.2.(1)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceQuantityResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E05:◆先頭ｹｰｽ数量入力");
    }

    /**
     * 
     * E_05_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        /*
         * 1.画面遷移
         */
        // 1.1.(1)先頭ケース2次元バーコード入力(InventoryInputProductSortingPlaceSymbolBarcode)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceSymbolBarcodeResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
