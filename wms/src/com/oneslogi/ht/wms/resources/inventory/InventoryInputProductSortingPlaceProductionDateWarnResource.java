package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * ◆製造年月日警告画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceProductionDateWarn")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceProductionDateWarn/display")
public class InventoryInputProductSortingPlaceProductionDateWarnResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_09_001:初期表示
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
         * 1.画面表示項目取得(load)
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = resource.getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");
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

        // 2.1.(1)在庫調査入力[仕分場]情報より製造年月日警告画面(InventoryInputProductSortingPlaceProductionDateWarn)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceProductionDateWarnHT");
        resource.setHeaderColor("yellow");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceProductionDateWarn/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceProductionDateWarn/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)製造年月日警告(InventoryInputProductSortingPlaceProductionDateWarn)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceProductionDateWarn.jsp", ses);
    }

    /**
     * E_09_002:確定ボタン押下
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send() throws Exception {

        /*
         * 1.画面遷移
         */
        // 1.1.(1)在庫調査結果確認(InventoryInputProductSortingPlaceSend)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceSendResource.load(this, util, inventoryInputProductSortingPlaceLogic);
    }

    /**
     * 
     * E_09_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        /*
         * 2.画面遷移
         */
        // 2.1.(1)変数の初期化
        String stockInspectionGategoryValue = "";//dto.getStockInspectionCategoryValue();

        // 2.1.(1)変数.在庫調査区分が'03'(終了検品)の場合、以下を実行する。
        // 2.1.(1)(A)(a)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)初期表示処理(display)を行う。
        if (stockInspectionGategoryValue == "03") {
            System.out.println("2.1.(1)(A)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)遷移");
            InventoryInputProductSortingPlaceProductionDateCollationResource.display(this, util, inventoryInputProductSortingPlaceLogic);
        }

        // 2.1.(2)上記以外の場合、以下を実行する。
        // 2.1.(2)(A)(a)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)初期表示処理(display)を行う。
        else {
            System.out.println("2.1.(1)(A)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)遷移");
            InventoryInputProductSortingPlaceQuantityResource.display(this, util, inventoryInputProductSortingPlaceLogic);
        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E09:◆製造年月日警告");
    }
}
