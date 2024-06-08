package com.oneslogi.ht.wms.resources.inventory;

import java.util.Objects;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceInstListDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ◆指示ﾘｽﾄ入力画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceInstList")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceInstList/display")
public class InventoryInputProductSortingPlaceInstListResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_02_001:初期表示
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

        // 1.2.(1)最新の在庫調査指示キーを取得する。
        TInventoryInst tInventoryInst = inventoryInputProductSortingPlaceLogic.getRecordFromTInventoryInstByLineOrBlock(dto, dto.getOutputLineBlock());

        // 1.2.(2)変数の初期化
        String stockInspectionCategoryValue = tInventoryInst.getInventoryInstKbn();

        // 1.2.(3)セッションの初期設定
        /* No.05 i_g_在庫調査指示キー      => */ dto.setInputOrFetchedInventoryKey(String.format("%010d", tInventoryInst.getTInventoryH().getInventoryKey()));
        ///* No.06 r_在庫調査区分            => */ dto.setStockInspectionCategory(stockInspectionCategoryValue);

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
        resource.initScreen("InventoryInputProductSortingPlaceInstListHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceInstList/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceInstList/send").itemCd("send").build());

        // 3.1.(1)仕分場調査入力(InventoryInputProductSortingPlaceReplenish)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceInstList.jsp", ses);
    }

    /**
     * E_02_002:スキャン/確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceInstListDto bean) throws Exception {

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
        ///* No.05 i_g_在庫調査指示キー      => */ dto.setInputOrFetchedInventoryKey(Objects.requireNonNullElse(bean.getInventoryKey(), ""));

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
        // 3.1.(1)棚卸ヘッダを検索、項目を取得する。
        TInventoryInst tInventoryInst = inventoryInputProductSortingPlaceLogic.getRecordFromTInventoryInstByInventoryKey(dto, dto.getInputOrFetchedInventoryKey());

        // 3.1.(1)(A)エラーが発生した場合、エラーメッセージを在庫調査入力情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        if (Objects.isNull(tInventoryInst)) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.INST_LIST_NOT_FOUND_ERROR);
            return;
        }
        // 3.1.(1)で取得したライン/ブロック != 在庫調査入力[仕分場]情報.o_ライン/ブロック
        if (!Objects.equals(tInventoryInst.getLineBlock(), dto.getOutputLineBlock())) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.INST_LIST_LINE_BLOCK_DIFFERENT_ERROR);
            return;
        }

        // 3.1.(1)で取得した棚卸日 != 在庫調査入力[仕分場]情報.d_荷主拠点マスタ.システム管理日付   
        if (!Objects.equals(tInventoryInst.getTInventoryH().getInventoryDt(), dto.getMClientCenterDto().getSystemDt())) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.INST_LIST_NOT_PROCESSING_DATE_ERROR);
            return;
        }

        // 3.1.(2)変数の初期化
        String stockInspectionCategoryValue = tInventoryInst.getInventoryInstKbn();

        /*
         * 4.画面遷移
         */
        // 4.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        ///* No.06 r_在庫調査区分            => */ dto.setStockInspectionCategory(stockInspectionCategoryValue);
        /* No.07 d_棚卸ヘッダ              => */ dto.setTInventoryHDto(tInventoryInst);
        /* No.27 o方面ピストン             => */ dto.setOutputPiston(tInventoryInst.getDirectionalPiston());

        // 4.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 4.2.(1)調査ロケーション入力(InventoryInputProductSortingPlaceLocation)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceLocationResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E02:◆指示ﾘｽﾄ入力画面");
    }

    /**
     * 
     * E_02_003:戻るボタン押下
     * @throws Exception
     */
    @GET
    @Path("/return")
    public void back() throws Exception {
        // 1.1.(1)仕分場調査入力(InventoryInputProductSortingPlaceReplenish)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceReplenishResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
