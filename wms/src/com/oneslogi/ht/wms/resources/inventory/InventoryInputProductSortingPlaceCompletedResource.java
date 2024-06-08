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
 * ◆在庫調査完了画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceCompleted")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceCompleted/display")
public class InventoryInputProductSortingPlaceCompletedResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_11_001:初期表示
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

        //在庫調査入力[仕分場]情報の初期化
        
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

        // 2.1.(1)在庫調査入力[仕分場]情報より在庫調査完了(InventoryInputProductSortingPlaceCompleted)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceCompletedHT");

        // 2.1.(2)確認ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceCompleted/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)在庫調査完了(InventoryInputProductSortingPlaceCompleted)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceCompleted.jsp", ses);
    }

    /**
     * E_11_002:確認ボタン押下
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send() throws Exception {

        /*
         * 1.画面遷移
         */
        // 1.1.(1)調査ロケーション入力(InventoryInputProductSortingPlaceLocation)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceLocationResource.load(this, util, inventoryInputProductSortingPlaceLogic);
    }
}
