package com.oneslogi.ht.wms.resources.inventory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

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
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceProductionDateCollationDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * ◆製造年月日照合画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceProductionDateCollation")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceProductionDateCollation/display")
public class InventoryInputProductSortingPlaceProductionDateCollationResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /**
     * 
     * E_13_001:初期表示
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

        // 2.1.(1)在庫調査入力[仕分場]情報より製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceProductionDateCollationHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceProductionDateCollation/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceProductionDateCollation/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceProductionDateCollation.jsp", ses);
    }

    /**
     * E_13_002:確定ボタン押下
     * @param bean ◆仕分場調査入力画面情報を保持DTO
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send(@BeanParam InventoryInputProductSortingPlaceProductionDateCollationDto bean) throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        // 1.3.(1)画面より渡されたデータを在庫調査入力[仕分場]情報.i_g_製造年月日に設定する。
        ///* No.12 i_g_製造年月日            => */ dto.setInputOrFetchedManufactureDate(Objects.requireNonNullElse(bean.getManufactureDate(), ""));

        /*
         * 2.入力チェック
         */
        // 2.1.入力関連チェック
        if (bean.isValidateErr()) {
            return;
        }

        // 2.2.画面入力チェック
        // 2.2.(1)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 日付の入力が不正(形式:yyMMdd)
        Predicate<String> isYYMMDD = dateString -> {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
                sdf.setLenient(false);
                sdf.parse(dateString);
                return true;
            } catch (ParseException e) {
                return false;
            }
        };
        if (!isYYMMDD.test(dto.getInputOrFetchedManufactureDate())) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_T_S_N_DATE_ERROR);
            return;
        }

        /*
         * 3.業務チェック
         */
        // 3.1.(1)変数の初期化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        /* 製造年月日           */String manufactureDate = dto.getInputOrFetchedManufactureDate();
        /* 前回調査製造年月日   */String prevManufactureDate = dto.getFetchedPrevInspectionManufactureDate();
        /* 製造年月日登録更新用 */String registrationManufactureDate = dto.isEmptyButtonPressFlag() ? manufactureDate : null;
        Function<String, String> toYYYYMMDD = yyMMddDate -> {
            SimpleDateFormat yyMMddFormat = new SimpleDateFormat("yyMMdd");
            SimpleDateFormat yyyyMMddFormat = new SimpleDateFormat("yyyy/MM/dd");
            try {
                Date date = yyMMddFormat.parse(yyMMddDate);
                return yyyyMMddFormat.format(date);
            } catch (ParseException e) {
                return "0000/00/00";
            }
        };
        /* 製造年月日作業実績用 */String workManufactureDate = dto.isEmptyButtonPressFlag() ? "0000/00/00" : toYYYYMMDD.apply(manufactureDate);

        // 3.1.(2)エラーが発生した場合、エラーメッセージを在庫調査入力情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 管理日付 < 製造年月日
        if (LocalDate.parse(dto.getMClientCenterDto().getSystemDt(), formatter).isBefore(LocalDate.parse(manufactureDate, formatter))) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.PREVIOUS_PRODUCTION_DATE_FUTURE_DAY_ERROR);
            return;
        }

        /*
         * 4.画面遷移
         */
        // 4.1.(1)在庫調査入力[仕分場]情報の一部項目を編集/設定処理
        /* No.25 o_製造年月日(登録更新用)  => */ dto.setOutputRegistrationManufactureDate(registrationManufactureDate);
        /* No.26 o_製造年月日(作業実績用)  => */ dto.setOutputWorkManufactureDate(workManufactureDate);

        // 4.1.(2)在庫調査数入力[仕分場]情報をセッションに設定する。
        ses.setAttribute("InventoryInputProductSortingPlaceDto", dto);

        // 4.2.(1)変数.製造年月日 < 変数.前回調査製造年月日の場合、以下を実行する。
        // 4.2.(1)(A)(a)製造年月日警告(InventoryInputProductSortingPlaceProductionDateWarn)初期表示処理(load)を行う。
        if (LocalDate.parse(manufactureDate, formatter).isBefore(LocalDate.parse(prevManufactureDate, formatter))) {
            System.out.println("4.2.(1)(A)製造年月日警告(InventoryInputProductSortingPlaceProductionDateWarn)遷移");
            InventoryInputProductSortingPlaceProductionDateWarnResource.load(this, util, inventoryInputProductSortingPlaceLogic);
        }

        // 4.2.(2)上記以外の場合、以下を実行する。
        // 4.2.(2)(A)(a)在庫調査結果確認(InventoryInputProductSortingPlaceSend)初期表示処理(load)を行う。
        else {
            System.out.println("4.2.(1)(A)在庫調査結果確認(InventoryInputProductSortingPlaceSend)遷移");
            InventoryInputProductSortingPlaceSendResource.load(this, util, inventoryInputProductSortingPlaceLogic);
        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E13:◆製造年月日照合");
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
        // 1.1.(1)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)初期表示処理(display)を行う。
        InventoryInputProductSortingPlaceQuantityResource.display(this, util, inventoryInputProductSortingPlaceLogic);
    }

}
