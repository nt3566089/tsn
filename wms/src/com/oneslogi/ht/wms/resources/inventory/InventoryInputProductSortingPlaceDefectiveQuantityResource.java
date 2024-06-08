package com.oneslogi.ht.wms.resources.inventory;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.TTrcaseinventory;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDefectiveQuantityDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * ◆製品不良数入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceDefectiveQuantity")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceDefectiveQuantity/display")
public class InventoryInputProductSortingPlaceDefectiveQuantityResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_12_001:初期表示
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

        // 1.2.(1)ケース在庫調査情報を検索、項目を取得する。
        TTrcaseinventory tTrcaseinventory = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcaseinventory(dto);

        // 1.1.(2)セッションの初期設定
        /* No.19 i_製品不良数              => */ dto.setInputDefectiveQty(Long.toString(tTrcaseinventory.getDefectivenum()));
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

        // 2.1.(1)在庫調査入力[仕分場]情報より製品不良数入力(InventoryInputProductSortingPlaceDefectiveQuantity)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceDefectiveQuantityHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceDefectiveQuantity/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceDefectiveQuantity/send").itemCd("send").build());

        // 3.1.(1)製品不良数入力(InventoryInputProductSortingPlaceDefectiveQuantity)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceDefectiveQuantity.jsp", ses);
    }

    /**
     * E_12_002:確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceDefectiveQuantityDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_製品不良数に設定する。
        //* No.17 i_ケース数                => */ dto.setInputCaseQty(bean.getCaseQty());
        //* No.18 i_カートン数              => */ dto.setInputCartonQty(bean.getCartonQty());
        /* No.19 i_製品不良数              => */ dto.setInputDefectiveQty(bean.getDefectiveQty());

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
        // 3.1.(1)変数の初期化
        /* ケース数             */long caseQty = 0;
        /* カートン数           */long cartonQty = 0;
        ///* 製品不良数           */long defectiveQty = dto.getInputDefectiveQty().isBlank() ? 0 : Long.parseLong(dto.getInputDefectiveQty().trim());
        /* 1ケース当カートン数  */long cartonsPerCase = dto.getTInventoryBDto().getMProduct().getUnit1().longValue();
        /* 1カートン当個数      */long quantityPerCarton = dto.getTInventoryBDto().getMProduct().getUnit2().longValue();
        ///* 入力調査数量         */long inputQuantity = (caseQty * cartonsPerCase + cartonQty + defectiveQty) * quantityPerCarton;
        /* システム数量         */long systemQuantity = dto.getTInventoryBDto().getInventoryNum().longValue();
        /* 先頭ｹｰｽのｶｰﾄﾝ数      */long headCaseCartonQty = 0;

        // 3.1.(2)仕分差異情報の取得
//        DiscrepancySortingInformation information = inventoryInputProductSortingPlaceLogic.getDiscrepancySortingInformation(dto, (headCaseCartonQty - caseQty));
//
//        // 3.2.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
//        /* No.16 i_先頭ケースのカートン数  => */ dto.setInputHeadCaseCartonQty(String.valueOf(headCaseCartonQty));
//        /* No.21 o_仕分予定数量            => */ dto.setOutputPlannedSortingQty(information.plannedSortingQty());
//        /* No.22 o_仕分実績数量            => */ dto.setOutputCompletedSortingQty(information.completedSortingQty());
//        /* No.23 o_仕分差異数量            => */ dto.setOutputDiscrepancySortingQty(information.discrepancySortingQty());
//        /* No.24 o_さしず実績順序キー      => */ dto.setOutputDirectionOrderKey(information.directionOrderKey());
//
//        // 3.2.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
//        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 3.2.(1)変数.入力調査数量と変数.システム数量に差異がある場合、以下を実行する。
        // 3.2.(1)(A)(a)システム数量差異確認(InventoryInputProductSortingPlaceSystemDiff)初期表示処理(load)を行う。
//        if (inputQuantity != systemQuantity) {
//            System.out.println("3.2.(1)(A)システム数量差異確認(InventoryInputProductSortingPlaceSystemDiff)遷移");
//            InventoryInputProductSortingPlaceSystemDiffResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 3.2.(2)ABS(3.1.(2)で取得した変数.仕分差異数量)が'1'以上の場合、以下を実行する。
//        // 3.2.(2)(A)(a)補充数量差異確認(InventoryInputProductSortingPlaceReplenishDiff)初期表示処理(load)を行う。
//        else if (1 <= Math.abs(dto.getOutputDiscrepancySortingQty())) {
//            System.out.println("4.3.(2)(A)補充数量差異確認(InventoryInputProductSortingPlaceReplenishDiff)遷移");
//            InventoryInputProductSortingPlaceReplenishDiffResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 3.2.(3)上記以外の場合、以下を実行する。
//        // 3.2.(3)(A)(a)在庫調査結果確認(InventoryInputProductSortingPlaceSend)初期表示処理(load)を行う。
//        else {
//            System.out.println("3.2.(3)(A)在庫調査結果確認(InventoryInputProductSortingPlaceSend)遷移");
//            InventoryInputProductSortingPlaceSendResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E12:◆製品不良数入力");
    }

    /**
     * 
     * E_12_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        // 1.1.(1)先頭ケース2次元バーコード入力(InventoryInputProductSortingPlaceSymbolBarcode)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceSymbolBarcodeResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
