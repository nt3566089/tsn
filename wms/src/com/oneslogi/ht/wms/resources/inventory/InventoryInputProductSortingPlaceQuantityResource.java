package com.oneslogi.ht.wms.resources.inventory;

import java.time.format.DateTimeFormatter;
import java.util.function.Function;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.TTrcaseinventory;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceQuantityDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ◆在庫調査数入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceQuantity")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceQuantity/display")
public class InventoryInputProductSortingPlaceQuantityResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_06_001:初期表示
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

        // 1.2.(2)変数の初期化
        /* 1ケース当カートン数  */long cartonsPerCase = dto.getTInventoryBDto().getMProduct().getUnit1().longValue();
        /* 1カートン当個数      */long quantityPerCarton = dto.getTInventoryBDto().getMProduct().getUnit2().longValue();
        // 1.2.(1)で取得した製品不良数(カートン) * 変数.1カートン当個数
        /* 前回入力不良数(個装) */long previousDefectQuantity = Math.multiplyExact(tTrcaseinventory.getDefectivenum(), quantityPerCarton);
        // 在庫調査入力[仕分場]情報.d_棚卸ボディ.棚卸数 - 変数.前回入力不良数(個装)
        /* 実績数量(前回値)     */long previousActualQuantity = dto.getTInventoryBDto().getInventoryNum().longValue() - previousDefectQuantity;

        // 1.2.(3)実績数量(前回値)をケース数及びカートン数に換算
        // 1.2.(3)(A)共通処理(ケース数換算)を呼び出す。
        Function<Long, Long> qtyByStile1 = qty -> (long) Math.floor((float) qty / ((float) cartonsPerCase * (float) quantityPerCarton));
        /* ケース換算値   */ long valueInCases = qtyByStile1.apply(previousActualQuantity);

        // 1.2.(3)(B)共通処理(カートン数換算)を呼び出す。
        Function<Long, Long> qtyByStile2 = qty -> (long) Math.floor((float) qty % ((float) cartonsPerCase * (float) quantityPerCarton) / (float) quantityPerCarton);
        /* カートン換算値 */ long valueInCartons = qtyByStile2.apply(previousActualQuantity);

        // 1.1.(4)セッションの初期設定
        /* No.17 i_ケース数                => */ dto.setInputCaseQty(Long.toString(valueInCases));
        /* No.18 i_カートン数              => */ dto.setInputCartonQty(Long.toString(valueInCartons));
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

        // 2.1.(1)在庫調査入力[仕分場]情報より在庫調査数入力(InventoryInputProductSortingPlaceQuantity)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceQuantityHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceQuantity/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceQuantity/send").itemCd("send").build());

        // 3.1.(1)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceQuantity.jsp", ses);
    }

    /**
     * E_06_002:確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceQuantityDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_ケース数、在庫調査入力[仕分場]情報.i_カートン、在庫調査入力[仕分場]情報.i_製品不良数に設定する。
        /* No.17 i_ケース数                => */ dto.setInputCaseQty(bean.getCaseQty());
        /* No.18 i_カートン数              => */ dto.setInputCartonQty(bean.getCartonQty());
        /* No.19 i_製品不良数              => */ dto.setInputDefectiveQty(bean.getDefectiveQty());

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
        // 3.1.(1)段ボール情報を検索、段ボール情報項目を取得する。
        // 3.1.(1)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (inventoryInputProductSortingPlaceLogic.countRecordInTTrsymbol(dto) == 0) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.CASE_NOT_REPLENISH_ERROR);
            return;
        }

//        /*
//         * 4.画面遷移
//         */
//        // 4.1.(1)製造年月日を検索、製造年月日を取得する。
//        // 4.1.(2)変数の初期化
//        /* ケース数             */long caseQty = dto.getInputCaseQty().isBlank() ? 0 : Long.parseLong(dto.getInputCaseQty().trim());
//        /* カートン数           */long cartonQty = dto.getInputCartonQty().isBlank() ? 0 : Long.parseLong(dto.getInputCartonQty().trim());
//        /* 製品不良数           */long defectiveQty = dto.getInputDefectiveQty().isBlank() ? 0 : Long.parseLong(dto.getInputDefectiveQty().trim());
//        /* 1ケース当カートン数  */long cartonsPerCase = dto.getTInventoryBDto().getMProduct().getUnit1().longValue();
//        /* 1カートン当個数      */long quantityPerCarton = dto.getTInventoryBDto().getMProduct().getUnit2().longValue();
//        /* 入力調査数量         */long inputQuantity = (caseQty * cartonsPerCase + cartonQty + defectiveQty) * quantityPerCarton;
//        /* システム数量         */long systemQuantity = dto.getTInventoryBDto().getInventoryNum().longValue();
//        /* 在庫調査区分         */String stockInspectionGategoryValue = dto.getStockInspectionCategoryValue();
//        /* 製造年月日           */String manufactureDate = dto.getInputOrFetchedManufactureDate();
//        /* 前回調査製造年月日   */String prevManufactureDate = inventoryInputProductSortingPlaceLogic.getRecordFromTTrmanufacturedate(dto).getManufactureDate();
//        /* 先頭ｹｰｽのｶｰﾄﾝ数      */long headCaseCartonQty = !dto.getInputHeadCaseCartonQty().isBlank()
//                ? Long.parseLong(dto.getInputHeadCaseCartonQty())
//                : (1 <= caseQty && cartonQty == 0)
//                        ? cartonsPerCase
//                        : cartonQty;
//
//        // 4.1.(3)仕分差異情報の取得
//        DiscrepancySortingInformation information = inventoryInputProductSortingPlaceLogic.getDiscrepancySortingInformation(dto, (headCaseCartonQty - caseQty));

//        // 4.2.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
//        /* No.16 i_先頭ケースのカートン数  => */ dto.setInputHeadCaseCartonQty(String.valueOf(headCaseCartonQty));
//        /* No.20 g_前回調査製造年月日      => */ dto.setFetchedPrevInspectionManufactureDate(prevManufactureDate);
//        /* No.21 o_仕分予定数量            => */ dto.setOutputPlannedSortingQty(information.plannedSortingQty());
//        /* No.22 o_仕分実績数量            => */ dto.setOutputCompletedSortingQty(information.completedSortingQty());
//        /* No.23 o_仕分差異数量            => */ dto.setOutputDiscrepancySortingQty(information.discrepancySortingQty());
//        /* No.24 o_さしず実績順序キー      => */ dto.setOutputDirectionOrderKey(information.directionOrderKey());

        // 4.2.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 4.3.(1)変数.入力調査数量と変数.システム数量に差異がある場合、以下を実行する。
        // 4.3.(1)(A)(a)システム数量差異確認(InventoryInputProductSortingPlaceSystemDiff)初期表示処理(load)を行う。
//        if (inputQuantity != systemQuantity) {
//            System.out.println("4.3.(1)(A)システム数量差異確認(InventoryInputProductSortingPlaceSystemDiff)遷移");
//            InventoryInputProductSortingPlaceSystemDiffResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 4.3.(2)ABS(4.1.(3)で取得した仕分差異情報.仕分差異数量)が'1'以上の場合、以下を実行する。
//        // 4.3.(2)(A)(a)補充数量差異確認(InventoryInputProductSortingPlaceReplenishDiff)初期表示処理(load)を行う。
//        else if (1 <= Math.abs(dto.getOutputDiscrepancySortingQty())) {
//            System.out.println("4.3.(2)(A)補充数量差異確認(InventoryInputProductSortingPlaceReplenishDiff)遷移");
//            InventoryInputProductSortingPlaceReplenishDiffResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 4.3.(3)変数.在庫調査区分が'03'(終了検品)の場合、以下を実行する。
//        // 4.3.(3)(A)(a)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)初期表示処理(load)を行う。
//        else if (stockInspectionGategoryValue == "03") {
//            System.out.println("4.3.(3)(A)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)遷移");
//            InventoryInputProductSortingPlaceProductionDateCollationResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 4.3.(4)変数.製造年月日 < 変数.前回調査製造年月日の場合、以下を実行する。
//        // 4.3.(4)(A)(a)製造年月日警告(InventoryInputProductSortingPlaceProductionDateWarn)初期表示処理(load)を行う。
//        else if (LocalDate.parse(manufactureDate, formatter).isBefore(LocalDate.parse(prevManufactureDate, formatter))) {
//            System.out.println("4.3.(4)(A)製造年月日警告(InventoryInputProductSortingPlaceProductionDateWarn)遷移");
//            InventoryInputProductSortingPlaceProductionDateWarnResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }
//
//        // 4.3.(5)上記以外の場合、以下を実行する。
//        // 4.3.(5)(A)(a)在庫調査結果確認(InventoryInputProductSortingPlaceSend)初期表示処理(load)を行う。
//        else {
//            System.out.println("4.3.(5)(A)在庫調査結果確認(InventoryInputProductSortingPlaceSend)遷移");
//            InventoryInputProductSortingPlaceSendResource.load(this, util, inventoryInputProductSortingPlaceLogic);
//        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E06:◆在庫調査数入力");
    }

    /**
     * 
     * E_06_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        // 1.1.(1)先頭ケース2次元バーコード入力(InventoryInputProductSortingPlaceSymbolBarcode)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceSymbolBarcodeResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
