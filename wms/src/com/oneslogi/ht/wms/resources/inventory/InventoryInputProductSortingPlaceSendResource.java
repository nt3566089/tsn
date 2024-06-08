package com.oneslogi.ht.wms.resources.inventory;

import java.math.BigDecimal;
import java.util.Objects;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
import com.oneslogi.base.dbflute.exentity.TTrcaseinventory;
import com.oneslogi.base.dbflute.exentity.TTrmanufacturedatedetail;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductSortingPlaceLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * ◆在庫調査結果確認画面Resourceクラス
 *
 */
@Path("/handy/InventoryInputProductSortingPlaceSend")
@HandyErrorReturnPath(returnURL = "InventoryInputProductSortingPlaceSend/display")
public class InventoryInputProductSortingPlaceSendResource extends HandyResourceBase {

    @Inject
    private HandyCommonUtil util;
    @Inject
    private InventoryInputProductSortingPlaceLogic inventoryInputProductSortingPlaceLogic;

    /* No.08 段ボール情報 */
    @Inject
    private TTrsymbolBhv tTrsymbolBhv;

    /* No.11 ケース在庫調査情報 */
    @Inject
    private TTrcaseinventoryBhv tTrcaseinventoryBhv;

    /* No.12 製造年月日 */
    @Inject
    private TTrmanufacturedateBhv tTrmanufacturedateBhv;

    /* No.13追跡情報(棚卸) */
    @Inject
    private TTrassortorderBhv tTrassortorderBhv;

    /* No.14 ケース明細情報 */
    @Inject
    private TTrcasedetailBhv tTrcasedetailBhv;

    /* No.15 在庫調査補正情報 */
    @Inject
    private TTrinvcorrectBhv tTrinvcorrectBhv;

    /* No.16 製造年月日明細 */
    @Inject
    private TTrmanufacturedatedetailBhv tTrmanufacturedatedetailBhv;

    /* No.17 製造年月日履歴 */
    @Inject
    private TTrmanufacturedatehistoryBhv tTrmanufacturedatehistoryBhv;

    /* No.10 ケース補充情報 */
    @Inject
    private TTrcasestockBhv tTrcasestockBhv;

    @Inject
    private TTrworkBhv tTrworkBhv;

    /**
     * 
     * E_10_001:初期表示
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

        // 2.1.(1)在庫調査入力[仕分場]情報より在庫調査結果確認(InventoryInputProductSortingPlaceSend)の画面初期設定を行う。
        resource.initScreen("InventoryInputProductSortingPlaceSendHT");

        // 2.1.(2)戻るボタン設定を行う。
        resource.setReturnButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceSend/return").itemCd("return").build());

        // 2.1.(3)確定ボタン設定を行う。
        resource.setSendButton(
                ButtonInfo.builder().url("InventoryInputProductSortingPlaceSend/send").itemCd("send").build());

        /*
         * 3.画面表示(display)
         */
        // 3.1.(1)在庫調査結果確認(InventoryInputProductSortingPlaceSend)を表示する。
        util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductSortingPlaceSend.jsp", ses);
    }

    /**
     * E_10_002:確定ボタン押下
     * @throws Exception
     */
    @GET
    @Path("/send")
    public void send() throws Exception {

        /*
         * 1.画面情報取得
         */
        // 1.1.在庫調査入力[仕分場]情報を取得
        HttpServletRequest req = getHttpServletRequest();
        HttpSession ses = req.getSession();

        // 1.1.(1)セッションから在庫調査入力[仕分場]情報を取得する。
        // 1.2.(1)画面より渡されたデータを取得する。
        InventoryInputProductSortingPlaceDto dto = (InventoryInputProductSortingPlaceDto) ses.getAttribute("InventoryInputProductSortingPlaceDto");

        /*
         * 2.業務チェック
         */
        // 2.1.エラーチェック
        // 2.1.(1)ケース補充情報を検索、仕分ロケを取得する。
        // 2.1.(1)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 該当データ無し
        SqlTTrsymbolInventoryInputProductSortingPlace sqlTTrsymbolInventoryInputProductSortingPlace = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbol(dto, dto.getTTrsymbolDto().getCasecd());
        if (Objects.isNull(sqlTTrsymbolInventoryInputProductSortingPlace)) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.CASE_NOT_REPLENISH_ERROR);
            return;
        }

        // 2.1.(2)変数の初期化
        String locationCd = String.format("%s-%s", sqlTTrsymbolInventoryInputProductSortingPlace.getSotedunit(), sqlTTrsymbolInventoryInputProductSortingPlace.getAssortedunit());
        // 2.1.(2)(A)エラーが発生した場合、エラーメッセージを在庫調査入力[仕分場]情報.エラーメッセージに設定し、エラー(パッケージ共通)画面に遷移する。
        // 取得したロケーションCDが不一致
        if (!Objects.equals(locationCd, dto.getInputLocationCd())) {
            getErrorManager().add(new ErrorStatus(), WmsMessageConst.CASE_NOT_REPLENISH_ERROR);
            return;
        }

        /*
         * 3.製造年月日の登録・更新
         */
        upsertManufactureDate(ses, dto);

        /*
         * 4.ケース情報の登録・更新
         */
        // 4.1.在庫調査入力[仕分場]情報.d_段ボール情報.ケースCDが存在する場合、以下を実行する。
        if (Objects.nonNull(dto.getTTrsymbolDto().getCasecd())) {
            upsertSymbolDate(ses, dto);
        }

        /*
         * 5.画面遷移
         */
        // 5.1.(1)在庫調査完了(InventoryInputProductSortingPlaceCompleted)初期表示処理(load)を行う。
        InventoryInputProductSortingPlaceCompletedResource.load(this, util, inventoryInputProductSortingPlaceLogic);

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E10:◆在庫調査結果確認");
    }

    /*
     * 4.段ボール情報の登録・更新
     */
    private void upsertSymbolDate(HttpSession ses, InventoryInputProductSortingPlaceDto dto) {

        HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

        // 4.1.(1)ケース在庫情報の登録・更新
        long caseInventoryNo = upsertTTrcaseinventory(ses, dto);

        // 4.1.(2)在庫調査情報の登録・更新
        //PutDmy putDmy = upsertTTrinvcorrect(ses, dto, caseInventoryNo);

        // 4.1.(3)ケース在庫調査補正情報の登録・更新
        // 4.1.(3)(A)ケース明細情報を検索、ケース内カートン数を取得する。
        long cartonQty = inventoryInputProductSortingPlaceLogic.getSumOfOperationNumFromTTrcasedetail(dto);

//        // 4.1.(3)(B)変数の初期化
//        /* No.01 仕分差異数量           */ long discrepancySortingQty = dto.getOutputDiscrepancySortingQty();
//        /* No.02 在庫調査区分           */ String stockInspectionGategoryValue = dto.getStockInspectionCategoryValue();
//        /* No.03 1ケース当カートン数    */ long cartonsPerCase = dto.getTInventoryBDto().getMProduct().getUnit1().longValue();
//        /* No.04 補正要否               */ boolean shouldCorrect = !(discrepancySortingQty == 0 || (stockInspectionGategoryValue == "02") && (discrepancySortingQty < cartonsPerCase));
//        /* No.05 さしず実績順序キー     */ long directionOrderKey = dto.getOutputDirectionOrderKey();
//        /* No.06 拠点CD                 */ String centerCd = loginInfo.getCenterCd();
//
//        // 4.1.(3)(C)変数.補正要否 == '1'(要)の場合、以下を実行する。
//        // 4.1.(3)(C)(b)変数.仕分差異数量 < '0'(過少仕分)の場合、以下を実行する。
//        //putDmy = upsertShouldCorrect(dto, caseInventoryNo, putDmy, discrepancySortingQty, shouldCorrect, directionOrderKey, centerCd);
//
//        // 4.1.(3)(D)変数の初期化
//        /* No.01 ケース内カートン数     */ long cartonsInCaseQty = cartonQty;
//        /* No.02 入力調査実績数量       */ long inputCartonQty = Long.parseLong(dto.getInputCartonQty());
//        /* No.03 先頭ケース仕分実績数量 */ long headCaseSortingQty = (inputCartonQty < cartonsInCaseQty)
//                ? cartonsInCaseQty - inputCartonQty
//                : 0;
//        /* No.04 先頭ケースCD           */ long headCaseCd = dto.getTTrsymbolDto().getCasecd();
//        /* No.05 差数量ケースCD         */ long differenceCaseCd = dto.getTTrsymbolDto().getCasecd();
//
//        // 4.1.(3)(E)共通処理(子ケース情報作成処理)を呼び出す。
//        // PX_TSN_TRACECOMMON.f_ChildCaseMake
//        String childCaseCd = "1000";
//
//        // 4.1.(3)(F)段ボール情報を検索、段ボール情報項目を取得する。
//        TTrsymbol tTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbolByCaseCd(dto, differenceCaseCd);
//
//        // 4.1.(3)(G)区分値明細マスタサブを検索、その他コード1を取得する。
//        String otherCd1 = inventoryInputProductSortingPlaceLogic.getOtherCd1FromBClassDtlSub("MACHINENO");
//
//        // 4.1.(3)(H)変数の初期化
//        String machineNo = otherCd1;
//
//        // 4.1.(3)(I)4.1.(4)(F)の補正ケースの二次元コードの号機(印字機)にダミーケースコードを設定する。   
//        // (テーブル項目編集定義.14.段ボール情報更新(M_MFCASE)を参照)
//        TTrsymbol upsertTblTTrsymbol = new TTrsymbol();
//        upsertTblTTrsymbol.setTrsymbolId(tTrsymbol.getTrsymbolId());
//        upsertTblTTrsymbol.setVersionNo(tTrsymbol.getVersionNo());
//        /* No.01 二次元コードの号機(印字機)*/ upsertTblTTrsymbol.setSymbolprinterno(machineNo);
//        tTrsymbolBhv.update(upsertTblTTrsymbol);
//
//        // 4.1.(3)(J)ケース補充情報を検索、ケース補充情報項目を取得する。
//        TTrcasestock tTrcasestock = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcasestockByCaseCd(dto, differenceCaseCd);
//
//        // 4.1.(3)(K)変数の初期化
//        /* No.01 仕分補充順序           */ BigDecimal assortedindex = tTrcasestock.getAssortedindex().add(new BigDecimal(1));
//
//        // 4.1.(3)(L)4.1.(4)(J)のケース補充情報の更新(update)を行う。  
//        // (テーブル項目編集定義.15.ケース補充情報更新(T_TRCASESTOCK)を参照)
//        TTrcasestock updateTTrcasestock = new TTrcasestock();
//        updateTTrcasestock.setTrcasestockId(tTrcasestock.getTrcasestockId());
//        updateTTrcasestock.setVersionNo(tTrcasestock.getVersionNo());
//        /* No.01 仕分補充順序           */ updateTTrcasestock.setAssortedindex(assortedindex);
//        tTrcasestockBhv.update(updateTTrcasestock);
//
//        // 4.1.(3)(M)変数の初期化
//        /* No.01 拠点シンボルID         */ BigDecimal centerSymbolId = tTrcasestock.getCenterSymbolId();
//        /* No.02 ケース補充先           */ String sotedUnit = dto.getOutputSotedUnit();
//        /* No.03 ロケーションNo.        */ String locationNo = dto.getOutputLocationNo();
//        /* No.04 仕分補充順序           */ BigDecimal assortedIdx = assortedindex;
//        /* No.05 出庫区分               */ BigDecimal pullType = new BigDecimal(0);
//        /* No.06 拠点ID                 */ long centerId = dto.getMClientCenterDto().getCenterId();
//        /* No.07 荷主ID                 */ long clientId = dto.getMClientCenterDto().getClientId();
//
//        // 4.1.(3)(N)ケース補充情報の登録(insert)を行う。     
//        // (テーブル項目編集定義.16.ケース補充情報登録(T_TRCASESTOCK)を参照) 
//        TTrcasestock insertTTrcasestock = new TTrcasestock();
//        /* No.01 ケース補充情報ID       */
//        /* No.02 ケースCD               */ insertTTrcasestock.setCenterSymbolId(centerSymbolId);
//        /* No.03 ケース補充先           */ insertTTrcasestock.setSotedunit(sotedUnit);
//        /* No.04 ロケーションNo.        */ insertTTrcasestock.setAssortedunit(locationNo);
//        /* No.05 仕分補充順序           */ insertTTrcasestock.setAssortedindex(assortedIdx);
//        /* No.06 出庫区分               */ insertTTrcasestock.setPulltype(pullType);
//        /* No.07 拠点ID                 */ insertTTrcasestock.setCenterId(centerId);
//        /* No.08 荷主ID                 */ insertTTrcasestock.setClientId(clientId);
//        tTrcasestockBhv.insert(insertTTrcasestock);
//
//        // 4.1.(3)(O)ケース明細番号を取得する。
//        NumberingCenterLogic numberingCenterLogic = new NumberingCenterLogic();
//
//        // 4.1.(3)(P)変数の初期化
//        /* No.01 ケース明細番号         */ long caseDetailNo = Long.parseLong(numberingCenterLogic.getNumbering("CASEDETAILNO"));
//        /* No.02 段ボール情報ID         */ BigDecimal trSymbolId = new BigDecimal(dto.getTTrsymbolDto().getTrsymbolId());
//        /* No.03 作成日時               */ String createDateTime = dto.getMClientCenterDto().getSystemDt();
//        /* No.04 追跡区分詳細           */ String traceTypeDt = "2200";
//        /* No.05 操作数量               */ long operationNum = headCaseSortingQty;
//        /* No.06 送信状態               */ BigDecimal sendSts = new BigDecimal(0);
//        Timestamp ts = new Timestamp(Long.parseLong(createDateTime));
//
//        // 4.1.(3)(Q)ケース明細情報の登録(insert)を行う。 
//        // (テーブル項目編集定義.18.ケース明細情報登録(T_TRCASEDETAIL)を参照)
//        TTrcasedetail insertTTrcasedetail = new TTrcasedetail();
//        /* No.01 ケース明細情報ID       */
//        /* No.02 ケース明細番号         */ insertTTrcasedetail.setCasedetailno(caseDetailNo);
//        ///* No.03 段ボール情報ID         */ insertTTrcasedetail.setTrsymbolId(trSymbolId);
//        /* No.04 作成日時               */ insertTTrcasedetail.setCreatedatetime(ts);
//        /* No.05 追跡区分詳細           */ insertTTrcasedetail.setTracetypedt(traceTypeDt);
//        /* No.06 操作数量               */ insertTTrcasedetail.setOperationnum(operationNum);
//        /* No.07 送信状態               */ insertTTrcasedetail.setSendsts(sendSts);
//        tTrcasedetailBhv.insert(insertTTrcasedetail);
//
//        // 4.1.(3)(R)変数の初期化
//        /* No.01 ケース在庫調査番号     */ long caseInventoryNo1 = caseInventoryNo;
//        /* No.02 補正対象数量           */ long correctQty = Math.abs(dto.getOutputDiscrepancySortingQty());
//        /* No.03 挿入ﾀﾞﾐｰｹｰｽCD          */ long putDmyCaseCd = putDmy.putDmyCaseCd();
//        /* No.04 挿入ﾀﾞﾐｰ分割ｹｰｽCD      */ long putDmyCutCaseCd = putDmy.putDmyCutCaseCd();
//        /* No.05 挿入ﾀﾞﾐｰｹｰｽ明細番号    */ long putDmyCaseDetailNo = putDmy.putDmyCaseDetailNo();
//        /* No.06 挿入ﾀﾞﾐｰさしず番号     */ long putDmyDirectionNo = putDmy.putDmyDirectionNo();
//        /* No.07 挿入ﾀﾞﾐｰさしず実績枝番号*/long putDmyDirectionOrdergNo = putDmy.putDmyDirectionOrdergNo();
//
//        // 4.1.(3)(S)ケース在庫調査補正情報の登録(insert)を行う。 
//        // (テーブル項目編集定義.19.在庫調査補正情報登録(T_TRINVCORRECT)を参照)
//        TTrinvcorrect upsertTTrinvcorrect = new TTrinvcorrect();
//        /* No.01 在庫調査補正情報ID     */
//        /* No.02 ケース在庫調査番号     */ upsertTTrinvcorrect.setCaseinventoryno(new BigDecimal(caseInventoryNo1));
//        /* No.03 補正対象数量           */ upsertTTrinvcorrect.setCorrectqty(new BigDecimal(correctQty));
//        /* No.04 挿入ﾀﾞﾐｰｹｰｽCD          */ upsertTTrinvcorrect.setPutdmycasecd(new BigDecimal(putDmyCaseCd));
//        /* No.05 挿入ﾀﾞﾐｰ分割ｹｰｽCD      */ upsertTTrinvcorrect.setPutdmycutcasecd(new BigDecimal(putDmyCutCaseCd));
//        /* No.06 挿入ﾀﾞﾐｰｹｰｽ明細番号    */ upsertTTrinvcorrect.setPutdmycasedetailno(putDmyCaseDetailNo);
//        /* No.07 挿入ﾀﾞﾐｰさしず番号     */ upsertTTrinvcorrect.setPutdmydirectionno(putDmyDirectionNo);
//        /* No.08 挿入ﾀﾞﾐｰさしず実績枝番号*/upsertTTrinvcorrect.setPutdmydirectionordergno(putDmyDirectionOrdergNo);
//        /* No.09 拠点ID                 */ upsertTTrinvcorrect.setCenterId(centerId);
//        /* No.10 荷主ID                 */ upsertTTrinvcorrect.setClientId(clientId);
//        tTrinvcorrectBhv.insert(upsertTTrinvcorrect);
//
//        // 4.1.(3)(T)変数の初期化
//        /* No.01 ケースCD               */ long caseCd = Objects.nonNull(putDmy.putDmyCaseCd()) ? putDmy.putDmyCaseCd() : putDmy.putDmyCutCaseCd;
//
//        // 4.1.(3)(U)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
//        TTrcaseinventory tTrcaseinventory = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcaseinventoryByCaseInventoryNo(dto, new BigDecimal(caseInventoryNo1));
//
//        // 4.1.(3)(V)4.1.(4)(U)のケース在庫調査情報の更新(update)を行う。    
//        // (テーブル項目編集定義.20.ケース在庫調査情報更新(T_TRCASEINVENTORY)を参照)
//        TTrcaseinventory upsertTTrcaseinventory = new TTrcaseinventory();
//        upsertTTrcaseinventory.setTrcaseinventoryId(tTrcaseinventory.getTrcaseinventoryId());
//        upsertTTrcaseinventory.setVersionNo(tTrcaseinventory.getVersionNo());
//        /* No.01 ケースCD               */ upsertTTrcaseinventory.setCasecd(new BigDecimal(caseCd));
//        tTrcaseinventoryBhv.update(upsertTTrcaseinventory);
//
//        // 4.1.(3)(W)さしず実績仕分範囲設定位置変更
//        // PX_TSN_TRACECOMMON.f_AssortRangeUpdate
//
//        // 4.1.(3)(X)作業実績(基盤)の登録を行う。
//        // (テーブル項目編集定義.22.作業実績(基盤)終了登録(T_TRWORK).登録を参照)
//        // 作業時刻の設定
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
//        TTrwork tTrwork = new TTrwork();
//        /* No.01 作業実績ID             */
//        /* No.02 荷主CD                 */ tTrwork.setClientCd(loginInfo.getClientCd());
//        /* No.03 拠点CD                 */ tTrwork.setCenterCd(loginInfo.getCenterCd());
//        /* No.04 ユーザCD               */ tTrwork.setUsercd(loginInfo.getUserCd());
//        /* No.05 業務区分               */ tTrwork.setTaskType("HC");
//        /* No.06 業務区分詳細           */ tTrwork.setTaskTypeDetail("HZ004L01");
//        /* No.07 作業年月日             */ tTrwork.setWorkDt(dtFormat.format(timestamp));
//        /* No.08 作業時刻               */ tTrwork.setWorktime(timestamp);
//        /* No.09 開始終了区分           */ tTrwork.setStartEnd("2");
//        tTrworkBhv.insert(tTrwork);
    }

    /**
     * 4.1.(3)(C)変数.補正要否 == '1'(要)の場合、以下を実行する。
     * 4.1.(3)(C)(b)変数.仕分差異数量 < '0'(過少仕分)の場合、以下を実行する。
     * 
     * @param dto dto
     * @param caseInventoryNo ケース在庫調査番号
     * @param putDmy 挿入ダミーレコード
     * @param discrepancySortingQty 仕分差異数量
     * @param shouldCorrect 補正要否
     * @param directionOrderKey さしず実績順序キー
     * @param centerCd 拠点CD
     * @return
     */
//    private PutDmy upsertShouldCorrect(InventoryInputProductSortingPlaceDto dto, long caseInventoryNo, PutDmy putDmy, long discrepancySortingQty, boolean shouldCorrect, long directionOrderKey, String centerCd) {
//        /* No.01 挿入ﾀﾞﾐｰｹｰｽCD          */ Long putDmyCaseCd = putDmy.putDmyCaseCd();
//        /* No.02 挿入ﾀﾞﾐｰ分割ｹｰｽCD      */ Long putDmyCutCaseCd = putDmy.putDmyCutCaseCd();
//        /* No.03 挿入ﾀﾞﾐｰｹｰｽ明細番号    */ Long putDmyCaseDetailNo = putDmy.putDmyCaseDetailNo();
//        /* No.04 挿入ﾀﾞﾐｰさしず番号     */ Long putDmyDirectionNo = putDmy.putDmyDirectionNo();
//        /* No.05 挿入ﾀﾞﾐｰさしず実績枝番号*/Long putDmyDirectionOrdergNo = putDmy.putDmyDirectionOrdergNo();
//
//        // 4.1.(3)(C)変数.補正要否 == '1'(要)の場合、以下を実行する。
//        if (shouldCorrect) {
//
//            // 4.1.(3)(C)(a)'0' < 変数.仕分差異数量(過剰仕分)の場合、以下を実行する。
//            if (0 < discrepancySortingQty) {
//
//                /* No.01 さしず実績枝番号       */ long directionordergno;
//                /* No.02 受信日                 */ String rcvDate;
//                /* No.03 配達拠点CD             */ String dpWareHouseCd;
//                /* No.04 配達年月日             */ String deliveryDate;
//                /* No.05 仕分ラインCD           */ String lineCd;
//                /* No.06 補充先                 */ String sotedUnit;
//                /* No.07 仕分順                 */ Long assortedOrder;
//                /* No.08 ロケーションNO.        */ String sotedLoc;
//
//                boolean hasDirectionOrderKey = directionOrderKey != 0;
//                // 4.1.(3)(C)(a)(I)変数.さしず実績順序キーが存在する場合、追跡情報(棚卸)項目を取得する。
//                if (hasDirectionOrderKey) {
//                    // 4.1.(3)(C)(a)(I)(i)追跡情報(棚卸)を検索、さしず最大実績枝番号を取得する。
//                    long maxDirectionordergno = inventoryInputProductSortingPlaceLogic.getExtremeDirectionordergnoFromTTrassortorder(dto, centerCd, directionOrderKey, true);
//
//                    // 4.1.(3)(C)(a)(I)(ii)追跡情報(棚卸)を検索、さしず最小実績枝番号を取得する。
//                    long minDirectionordergno = inventoryInputProductSortingPlaceLogic.getExtremeDirectionordergnoFromTTrassortorder(dto, centerCd, directionOrderKey, false);
//
//                    // 4.1.(3)(C)(a)(I)(iii)追跡情報(棚卸)を検索、追跡情報(棚卸)項目を取得する。
//                    TTrassortorder tTrassortorder = inventoryInputProductSortingPlaceLogic.getRecordFromTTrassortorderByDirectionOrder(dto, centerCd, directionOrderKey, minDirectionordergno);
//
//                    // 4.1.(3)(C)(a)(I)(iv)変数の初期化
//                    /* No.01 さしず実績枝番号       */ directionordergno = maxDirectionordergno + 1;
//                    /* No.02 受信日                 */ rcvDate = tTrassortorder.getRcvdate();
//                    /* No.03 配達拠点CD             */ dpWareHouseCd = tTrassortorder.getDpwarehousecd();
//                    /* No.04 配達年月日             */ deliveryDate = tTrassortorder.getDeliverydate();
//                    /* No.05 仕分ラインCD           */ lineCd = tTrassortorder.getLinecd();
//                    /* No.06 補充先                 */ sotedUnit = tTrassortorder.getSotedunit();
//                    /* No.07 仕分順                 */ assortedOrder = tTrassortorder.getAssortedorder();
//                    /* No.08 ロケーションNO.        */ sotedLoc = tTrassortorder.getSotedloc();
//                }
//
//                // 4.1.(3)(C)(a)(II)変数.さしず実績順序キーが存在しない場合、以下を実行する。
//                else {
//                    // 4.1.(3)(C)(a)(II)(i)変数の初期化
//                    /* No.01 さしず実績枝番号       */ directionordergno = 0L;
//                    /* No.02 受信日                 */ rcvDate = dto.getMClientCenterDto().getSystemDt();
//                    /* No.03 配達拠点CD             */ dpWareHouseCd = centerCd;
//                    /* No.04 配達年月日             */ deliveryDate = dto.getMClientCenterDto().getSystemDt();
//                    /* No.05 仕分ラインCD           */ lineCd = dto.getOutputSotedUnit();
//                    /* No.06 補充先                 */ sotedUnit = dto.getOutputSotedUnit();
//                    /* No.07 仕分順                 */ assortedOrder = 0L;
//                    /* No.08 ロケーションNO.        */ sotedLoc = dto.getOutputLocationNo();
//                }
//
//                // 4.1.(3)(C)(a)(III)区分値明細マスタサブを検索、その他コード1を取得する。
//                String otherCd1 = inventoryInputProductSortingPlaceLogic.getOtherCd1FromBClassDtlSub("CUSTOMERCD");
//
//                // 4.1.(3)(C)(a)(IV)変数の初期化
//                /* No.01 出荷順                 */ long shipOrder = -1;
//                /* No.02 仕訳範囲(開始)         */ BigDecimal rangeStart = new BigDecimal(0);
//                /* No.03 仕訳範囲(終了)         */ BigDecimal rangeEnd = new BigDecimal(0);
//                /* No.04 配達通番               */ long deliverySeqNo = 0;
//                /* No.05 配達通番枝番           */ BigDecimal deliveryBranchNo = new BigDecimal(0);
//                /* No.06 箱NO.                  */ String caseNo = null;
//                /* No.07 箱No.(通番)            */ String caseSerial = null;
//                /* No.08 銘柄CD                 */ String itemCd = dto.getTInventoryBDto().getProductCd();
//                /* No.09 お得意様CD             */ String customerCd = otherCd1;
//                /* No.10 さしず数量             */ long directionNum = dto.getOutputDiscrepancySortingQty();
//
//                // 4.1.(3)(C)(a)(V)追跡情報(棚卸)に補正さしずの登録(insert)を行う。
//                // (テーブル項目編集定義.13.追跡情報(棚卸)登録(T_TRASSORTORDER)を参照)
//                TTrassortorder upsertTbl = new TTrassortorder();
//                /* No.01 さしず実績順序キー     */
//                /* No.02 さしず実績枝番号       */ upsertTbl.setDirectionordergno(directionordergno);
//                /* No.03 拠点コード             */ upsertTbl.setWarehousecd(centerCd);
//                /* No.04 受信日                 */ upsertTbl.setRcvdate(rcvDate);
//                /* No.05 出荷順                 */ upsertTbl.setShiporder(shipOrder);
//                /* No.06 仕訳範囲(開始)         */ upsertTbl.setRangestart(rangeStart);
//                /* No.07 仕訳範囲(終了)         */ upsertTbl.setRangeend(rangeEnd);
//                /* No.08 配達拠点CD             */ upsertTbl.setDpwarehousecd(dpWareHouseCd);
//                /* No.09 配達年月日             */ upsertTbl.setDeliverydate(deliveryDate);
//                /* No.10 仕分ラインCD           */ upsertTbl.setLinecd(lineCd);
//                /* No.11 補充先                 */ upsertTbl.setSotedunit(sotedUnit);
//                /* No.12 仕分順                 */ upsertTbl.setAssortedorder(assortedOrder);
//                /* No.13 配達通番               */ upsertTbl.setDeliveryseqno(deliverySeqNo);
//                /* No.14 配達通番枝番           */ upsertTbl.setDeliverybranchno(deliveryBranchNo);
//                /* No.15 箱No.                  */ upsertTbl.setCaseno(caseNo);
//                /* No.16 箱No.(通番)            */ upsertTbl.setCaseserial(caseSerial);
//                /* No.17 仕分ロケ               */ upsertTbl.setSotedloc(sotedLoc);
//                /* No.18 銘柄CD                 */ upsertTbl.setItemcd(itemCd);
//                /* No.19 お得意様CD             */ upsertTbl.setCustomercd(customerCd);
//                /* No.20 さしず数量             */ upsertTbl.setDirectionnum(directionNum);
//                tTrassortorderBhv.insert(upsertTbl);
//
//                // 4.1.(3)(C)(a)(VI)挿入ダミーさしず番号及び挿入ダミーさしず実績枝番号に取得したさしず順序キー及びさしず実績枝番号を設定する。
//                /* No.04 挿入ﾀﾞﾐｰさしず番号     */ putDmyDirectionNo = upsertTbl.getDirectionorderkey();
//                /* No.05 挿入ﾀﾞﾐｰさしず実績枝番号*/putDmyDirectionOrdergNo = directionordergno;
//            }
//
//            // 4.1.(3)(C)(b)変数.仕分差異数量 < '0'(過少仕分)の場合、以下を実行する。
//            else if (discrepancySortingQty < 0) {
//                // 4.1.(3)(C)(b)(I)変数の初期化
//                /* No.01 補正ケース基本数量     */ long correctionCaseBaseQty = Math.abs(discrepancySortingQty);
//                /* No.02 銘柄CD(ケース)         */ String productCd = dto.getTTrsymbolDto().getProductCd();
//                /* No.03 製造年月日             */ String manufactureDate = dto.getTTrsymbolDto().getLot4();
//                /* No.04 デザイン区分(ケース)   */ String designCd = dto.getTTrsymbolDto().getLot3();
//                /* No.05 補正ケースCD           */ long correctionCaseCd = dto.getTTrsymbolDto().getCasecd();
//
//                // 4.1.(3)(C)(b)(II)共通処理(子ケース情報作成処理)を呼び出す。
//                // PX_TSN_TRACECOMMON.f_ChildCaseMake
//                String childCaseCd = "1000";
//
//                // 4.1.(3)(C)(b)(III)段ボール情報を検索、段ボール情報項目を取得する。
//                TTrsymbol tTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbolByCaseCd(dto, correctionCaseCd);
//
//                // 4.1.(3)(C)(b)(IV)区分値明細マスタサブを検索、その他コード1を取得する。
//                String otherCd1 = inventoryInputProductSortingPlaceLogic.getOtherCd1FromBClassDtlSub("MACHINENO");
//
//                // 4.1.(3)(C)(b)(V)変数の初期化
//                String machineNo = otherCd1;
//
//                // 4.1.(3)(C)(b)(VI)4.1.(4)(C)(b)(II)の補正ケースの二次元コードの号機(印字機)にダミーケースコードを設定する。
//                // (テーブル項目編集定義.14.段ボール情報更新(M_MFCASE)を参照)
//                TTrsymbol upsertTbl = new TTrsymbol();
//                upsertTbl.setTrsymbolId(tTrsymbol.getTrsymbolId());
//                upsertTbl.setVersionNo(tTrsymbol.getVersionNo());
//                /* No.01 二次元コードの号機(印字機)*/ upsertTbl.setSymbolprinterno(machineNo);
//                tTrsymbolBhv.update(upsertTbl);
//
//                // 4.1.(3)(C)(b)(VII)ケース補充情報を検索、ケース補充情報項目を取得する。
//                TTrcasestock tTrcasestock = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcasestockByCaseCd(dto, correctionCaseCd);
//
//                // 4.1.(3)(C)(b)(VIII)変数の初期化
//                /* No.01 仕分補充順序           */ BigDecimal assortedindex = tTrcasestock.getAssortedindex().add(new BigDecimal(1));
//
//                // 4.1.(3)(C)(b)(IX)4.1.(4)(C)(b)(VII)のケース補充情報の更新(update)を行う。    
//                // (テーブル項目編集定義.15.ケース補充情報更新(T_TRCASESTOCK)を参照)
//                TTrcasestock updateTTrcasestock = new TTrcasestock();
//                updateTTrcasestock.setTrcasestockId(tTrcasestock.getTrcasestockId());
//                updateTTrcasestock.setVersionNo(tTrcasestock.getVersionNo());
//                /* No.01 仕分補充順序           */ updateTTrcasestock.setAssortedindex(assortedindex);
//                tTrcasestockBhv.update(updateTTrcasestock);
//
//                // 4.1.(3)(C)(b)(X)変数の初期化
//                /* No.01 拠点シンボルID         */ BigDecimal centerSymbolId = tTrcasestock.getCenterSymbolId();
//                /* No.02 ケース補充先           */ String sotedUnit = dto.getOutputSotedUnit();
//                /* No.03 ロケーションNo.        */ String locationNo = dto.getOutputLocationNo();
//                /* No.04 仕分補充順序           */ BigDecimal assortedIdx = assortedindex;
//                /* No.05 出庫区分               */ BigDecimal pullType = new BigDecimal(0);
//                /* No.06 拠点ID                 */ long centerId = dto.getMClientCenterDto().getCenterId();
//                /* No.07 荷主ID                 */ long clientId = dto.getMClientCenterDto().getClientId();
//
//                // 4.1.(3)(C)(b)(XI)ケース補充情報の登録(insert)を行う。    
//                // (テーブル項目編集定義.16.ケース補充情報登録(T_TRCASESTOCK)を参照)
//                TTrcasestock insertTTrcasestock = new TTrcasestock();
//                /* No.01 ケース補充情報ID       */
//                /* No.02 ケースCD               */ insertTTrcasestock.setCenterSymbolId(centerSymbolId);
//                /* No.03 ケース補充先           */ insertTTrcasestock.setSotedunit(sotedUnit);
//                /* No.04 ロケーションNo.        */ insertTTrcasestock.setAssortedunit(locationNo);
//                /* No.05 仕分補充順序           */ insertTTrcasestock.setAssortedindex(assortedIdx);
//                /* No.06 出庫区分               */ insertTTrcasestock.setPulltype(pullType);
//                /* No.07 拠点ID                 */ insertTTrcasestock.setCenterId(centerId);
//                /* No.08 荷主ID                 */ insertTTrcasestock.setClientId(clientId);
//                tTrcasestockBhv.insert(insertTTrcasestock);
//
//                // 4.1.(3)(C)(b)(XII)挿入ダミーケースコードに取得した補正ケースコードを設定
//                /* No.01 挿入ﾀﾞﾐｰｹｰｽCD          */ putDmyCaseCd = correctionCaseCd;
//
//                // 4.1.(3)(C)(b)(XIII)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
//                TTrcaseinventory tTrcaseinventory = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcaseinventoryByCaseInventoryNo(dto, new BigDecimal(caseInventoryNo));
//
//                // 4.1.(3)(C)(b)(XIV)仕分数量累計(カートン)に補正ケース基本数量を加算
//                BigDecimal totalSortedNum = tTrcaseinventory.getTotalsortednum();
//
//                // 4.1.(3)(C)(b)(XV)4.1.(4)(C)(b)(XIII)のケース在庫調査情報の更新(update)を行う。
//                // (テーブル項目編集定義.17.ケース在庫調査情報更新(T_TRCASEINVENTORY)を参照)
//                TTrcaseinventory upsertTblTTrcaseinventory = new TTrcaseinventory();
//                upsertTblTTrcaseinventory.setTrcaseinventoryId(tTrcaseinventory.getTrcaseinventoryId());
//                upsertTblTTrcaseinventory.setVersionNo(tTrcaseinventory.getVersionNo());
//                /* No.01 仕分数量累計(カートン) */ upsertTblTTrcaseinventory.setTotalsortednum(totalSortedNum);
//                tTrcaseinventoryBhv.update(upsertTblTTrcaseinventory);
//            }
//        }
//        return new PutDmy(putDmyCaseCd, putDmyCutCaseCd, putDmyCaseDetailNo, putDmyDirectionNo, putDmyDirectionOrdergNo);
//    }
//
//    /*
//     * 4.段ボール情報の登録・更新
//     * 4.1.(2)在庫調査情報の登録・更新
//     * 
//     * @param dto Dto
//     * @param long ケース在庫調査番号
//     */
//    private PutDmy upsertTTrinvcorrect(HttpSession ses, InventoryInputProductSortingPlaceDto dto, long caseInventory) {
//        // 4.1.(2)在庫調査情報の登録・更新
//        // 4.1.(2)(A)変数の初期化
//        /* No.01 ケース在庫調査番号     */ long caseInventoryNo = caseInventory;
//
//        // 4.1.(2)(B)在庫調査補正情報を検索、在庫調査補正情報項目を取得する。
//        TTrinvcorrect tTrinvcorrect = inventoryInputProductSortingPlaceLogic.getRecordFromTTrinvcorrectByCaseInventoryNo(dto, caseInventoryNo);
//        HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
//
//        // 4.1.(2)(C)変数の初期化
//        /* No.01 挿入ﾀﾞﾐｰｹｰｽCD          */ Long putDmyCaseCd = Objects.nonNull(tTrinvcorrect.getPutdmycasecd()) ? tTrinvcorrect.getPutdmycasecd().longValue() : null;
//        /* No.02 挿入ﾀﾞﾐｰ分割ｹｰｽCD      */ Long putDmyCutCaseCd = Objects.nonNull(tTrinvcorrect.getPutdmycutcasecd()) ? tTrinvcorrect.getPutdmycutcasecd().longValue() : null;
//        /* No.03 挿入ﾀﾞﾐｰｹｰｽ明細番号    */ Long putDmyCaseDetailNo = Objects.nonNull(tTrinvcorrect.getPutdmycasedetailno()) ? tTrinvcorrect.getPutdmycasedetailno() : null;
//        /* No.04 挿入ﾀﾞﾐｰさしず番号     */ Long putDmyDirectionNo = Objects.nonNull(tTrinvcorrect.getPutdmydirectionno()) ? tTrinvcorrect.getPutdmydirectionno() : null;
//        /* No.05 挿入ﾀﾞﾐｰさしず実績枝番号*/Long putDmyDirectionOrdergNo = Objects.nonNull(tTrinvcorrect.getPutdmydirectionordergno()) ? tTrinvcorrect.getPutdmydirectionordergno() : null;
//        /* No.06 補充先                 */ //String sotedUnit = dto.getOutputSotedUnit();
//        /* No.07 ロケーションNo.        */ //String locationNo = dto.getOutputLocationNo();
//        /* No.08 拠点CD                 */ String centerCd = loginInfo.getCenterCd();
//
//        // 4.1.(2)(D)在庫調査補正情報にレコードが存在する場合、以下を実行する。
//        if (Objects.nonNull(tTrinvcorrect)) {
//            // 4.1.(2)(D)(a)挿入ダミーケースCDが存在する場合、該当する段ボール情報の削除を行う。
//            if (Objects.nonNull(putDmyCaseCd)) {
//                // 4.1.(2)(D)(a)(I)段ボール情報を検索、段ボール情報項目を取得する。
//                TTrsymbol tTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbolByCaseCd(dto, putDmyCaseCd);
//
//                // 4.1.(2)(D)(a)(I)(i)レコードが存在する場合、該当する段ボール情報の削除(update)を行う。
//                // (テーブル項目編集定義.9.段ボール情報更新(削除フラグ更新)(M_MFCASE)を参照)
//                if (Objects.nonNull(tTrsymbol)) {
//                    TTrsymbol upsertTbl = new TTrsymbol();
//                    upsertTbl.setTrsymbolId(tTrsymbol.getTrsymbolId());
//                    upsertTbl.setVersionNo(tTrsymbol.getVersionNo());
//                    /* No.01 削除フラグ '1'(削除済) */ upsertTbl.setDelFlg("1");
//                    tTrsymbolBhv.update(upsertTbl);
//                }
//            }
//
//            // 4.1.(2)(D)(b)挿入ダミー分割ケースCDが存在する場合、該当する段ボール情報の削除を行う。
//            if (Objects.nonNull(putDmyCutCaseCd)) {
//                // 4.1.(2)(D)(b)(I)段ボール情報を検索、段ボール情報項目を取得する。
//                TTrsymbol tTrsymbol = inventoryInputProductSortingPlaceLogic.getRecordFromTTrsymbolByCaseCd(dto, putDmyCutCaseCd);
//
//                // 4.1.(2)(D)(b)(I)(i)レコードが存在する場合、該当する段ボール情報の削除(update)を行う。
//                // (テーブル項目編集定義.9.段ボール情報更新(削除フラグ更新)(M_MFCASE)を参照)
//                if (Objects.nonNull(tTrsymbol)) {
//                    TTrsymbol upsertTbl = new TTrsymbol();
//                    upsertTbl.setTrsymbolId(tTrsymbol.getTrsymbolId());
//                    upsertTbl.setVersionNo(tTrsymbol.getVersionNo());
//                    /* No.01 削除フラグ '1'(削除済) */ upsertTbl.setDelFlg("1");
//                    tTrsymbolBhv.update(upsertTbl);
//                }
//            }
//
//            // 4.1.(2)(D)(c)挿入ダミーケース明細番号が存在する場合、該当するケース明細情報の削除を行う。
//            if (Objects.nonNull(putDmyCaseDetailNo)) {
//                // 4.1.(2)(D)(c)(I)ケース明細情報を検索、ケース明細情報項目を取得する。
//                TTrcasedetail tTrcasedetail = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcasedetailByCaseDetailNo(dto, putDmyCaseDetailNo);
//
//                // 4.1.(2)(D)(c)(I)(i)レコードが存在する場合、該当するケース明細情報の削除(update)を行う。
//                // (テーブル項目編集定義.10.ケース明細情報更新(削除フラグ更新)(T_TRCASEDETAIL)を参照)
//                if (Objects.nonNull(tTrcasedetail)) {
//                    TTrcasedetail upsertTbl = new TTrcasedetail();
//                    upsertTbl.setTrcasedetailId(tTrcasedetail.getTrcasedetailId());
//                    upsertTbl.setVersionNo(tTrcasedetail.getVersionNo());
//                    /* No.01 削除フラグ '1'(削除済) */ upsertTbl.setDelFlg("1");
//                    tTrcasedetailBhv.update(upsertTbl);
//                }
//            }
//
//            // 4.1.(2)(D)(d)挿入ダミーさしず番号が存在する場合、以下を実行する。
//            if (Objects.nonNull(putDmyDirectionNo)) {
//
//                // 4.1.(2)(D)(d)(I)追跡情報(棚卸)を検索、追跡情報(棚卸)項目を取得する。
//                TTrassortorder tTrassortorder = inventoryInputProductSortingPlaceLogic.getRecordFromTTrassortorderByDirectionOrder(dto, centerCd, putDmyDirectionNo, putDmyDirectionOrdergNo);
//
//                // 4.1.(2)(D)(d)(I)(i)レコードが存在する場合、該当する追跡情報(棚卸)の削除(update)を行う。  
//                // (テーブル項目編集定義.11.追跡情報(棚卸)更新(削除フラグ更新)(T_TRASSORTORDER)を参照)
//                if (Objects.nonNull(tTrassortorder)) {
//                    TTrassortorder upsertTbl = new TTrassortorder();
//                    upsertTbl.setDirectionorderkey(tTrassortorder.getDirectionorderkey());
//                    upsertTbl.setDirectionordergno(tTrassortorder.getDirectionordergno());
//                    upsertTbl.setVersionNo(tTrassortorder.getVersionNo());
//                    /* No.01 削除フラグ '1'(削除済) */ upsertTbl.setDelFlg("1");
//                    tTrassortorderBhv.update(upsertTbl);
//                }
//
//                // 4.1.(2)(D)(d)(II)共通処理(さしず実績仕分範囲再設定)を呼び出す。
//                // PX_TSN_TRACECOMMON.f_AssortRangeUpdate
//                // Long updateNum = PX_TSN_TRACECOMMON.f_AssortRangeUpdate(sotedUnit, locationNo);
//
//            }
//
//            // 4.1.(2)(D)(e)4.1.(3)(B)の在庫調査補正情報の削除(update)を行う。   
//            // (テーブル項目編集定義.12.在庫調査補正情報更新(削除フラグ更新)(T_TRINVCORRECT)を参照)
//            TTrinvcorrect upsertTbl = new TTrinvcorrect();
//            upsertTbl.setTrinvcorrectId(tTrinvcorrect.getTrinvcorrectId());
//            upsertTbl.setVersionNo(tTrinvcorrect.getVersionNo());
//            /* No.01 削除フラグ '1'(削除済) */ upsertTbl.setDelFlg("1");
//            tTrinvcorrectBhv.update(upsertTbl);
//        }
//
//        return new PutDmy(putDmyCaseCd, putDmyCutCaseCd, putDmyCaseDetailNo, putDmyDirectionNo, putDmyDirectionOrdergNo);
//
//    }

    /*
     * 4.段ボール情報の登録・更新
     * 4.1.(1)ケース在庫情報の登録・更新
     * 
     * @param dto Dto
     * @return long ケース在庫調査番号
     */
    private long upsertTTrcaseinventory(HttpSession ses, InventoryInputProductSortingPlaceDto dto) {
        // 4.1.(1)ケース在庫情報の登録・更新
        // 4.1.(1)(A)変数の初期化

        /* No.01 ケースCD               */ Long caseCd = dto.getTTrsymbolDto().getCasecd();
        /* No.02 在庫調査指示キー       */ String inventoryKey = dto.getInputOrFetchedInventoryKey();
        /* No.03 棚卸ボディID           */ Long inventoryBId = dto.getTInventoryBDto().getInventoryBId();
        /* No.04 在庫調査数量(個装)     */ Long caseInvQty = dto.getTInventoryBDto().getMProduct().getUnit2().longValue() * Long.parseLong(dto.getInputCartonQty());
        /* No.05 製品不良数量(カートン) */ Long defectiveQty = Long.parseLong(dto.getInputDefectiveQty());
        /* No.06 仕分数量累計(カートン) */ Long cartonQty = Long.parseLong(dto.getInputCartonQty());
        /* No.07 仕分差異数量(カートン) */ Long discrepancySortingQty = dto.getOutputDiscrepancySortingQty();
        /* No.08 在庫調査日時           */ String inventoryDate = dto.getMClientCenterDto().getSystemDt();
        /* No.09 拠点ID                 */ Long centerId = dto.getMClientCenterDto().getCenterId();
        /* No.10 荷主ID                 */ Long clientId = dto.getMClientCenterDto().getClientId();

        // 4.1.(1)(B)ケース在庫調査情報を検索、ケース在庫調査情報項目を取得する。
        TTrcaseinventory tTrcaseinventory = inventoryInputProductSortingPlaceLogic.getRecordFromTTrcaseinventory(dto);

        // 4.1.(1)(B)(a)レコードが存在する場合、該当するケース在庫調査情報の更新(update)を行う。
        // (テーブル項目編集定義.7.ケース在庫調査情報更新(T_TRCASEINVENTORY)を参照)
        if (Objects.nonNull(tTrcaseinventory)) {
            TTrcaseinventory upsertTbl = new TTrcaseinventory();
            upsertTbl.setTrcaseinventoryId(tTrcaseinventory.getTrcaseinventoryId());
            upsertTbl.setVersionNo(tTrcaseinventory.getVersionNo());
            /* No.01 ケースCD               */ upsertTbl.setCasecd(new BigDecimal(caseCd));
            /* No.02 在庫調査指示キー       */ upsertTbl.setInventorykey(inventoryKey);
            /* No.03 棚卸ボディID           */ upsertTbl.setInventoryBId(inventoryBId);
            /* No.04 在庫調査数量(個装)     */ upsertTbl.setCaseinvqty(caseInvQty);
            /* No.05 製品不良数量(カートン) */ upsertTbl.setDefectivenum(defectiveQty);
            /* No.06 仕分数量累計(カートン) */ upsertTbl.setTotalsortednum(new BigDecimal(cartonQty));
            /* No.07 仕分差異数量(カートン) */ upsertTbl.setSorteddifnum(discrepancySortingQty);
            /* No.08 在庫調査日時           */ upsertTbl.setInventorydatetime(inventoryDate);
            /* No.09 拠点ID                 */ upsertTbl.setCenterId(centerId);
            /* No.10 荷主ID                 */ upsertTbl.setClientId(clientId);
            tTrcaseinventoryBhv.update(upsertTbl);

            return tTrcaseinventory.getCaseinventoryno().longValue();
        }
        // 4.1.(1)(B)(b)レコードが存在しない場合、以下を実行する。
        else {
            // 4.1.(1)(B)(b)(I)ケース在庫調査番号を取得する。
            NumberingCenterLogic numberingCenterLogic = new NumberingCenterLogic();

            // 4.1.(1)(B)(b)(II)変数の初期化
            /* No.01 ケース在庫調査番号     */ Long caseInventoryNo = Long.parseLong(numberingCenterLogic.getNumbering("CASEINVENTORYNO"));
            TTrcaseinventory upsertTbl = new TTrcaseinventory();
            // 4.1.(1)(B)(b)(III)ケース在庫調査情報の登録(insert)を行う。
            // (テーブル項目編集定義.8.ケース在庫調査情報登録(T_TRCASEINVENTORY)を参照)
            /* No.01 ケース在庫調査情報ID   */
            /* No.02 ケース在庫調査番号     */ upsertTbl.setCaseinventoryno(new BigDecimal(caseInventoryNo));
            /* No.03 ケースCD               */ upsertTbl.setCasecd(new BigDecimal(caseCd));
            /* No.04 在庫調査指示キー       */ upsertTbl.setInventorykey(inventoryKey);
            /* No.05 棚卸ボディID           */ upsertTbl.setInventoryBId(inventoryBId);
            /* No.06 在庫調査数量(個装)     */ upsertTbl.setCaseinvqty(caseInvQty);
            /* No.07 製品不良数量(カートン) */ upsertTbl.setDefectivenum(defectiveQty);
            /* No.08 仕分数量累計(カートン) */ upsertTbl.setTotalsortednum(new BigDecimal(cartonQty));
            /* No.09 仕分差異数量(カートン) */ upsertTbl.setSorteddifnum(discrepancySortingQty);
            /* No.10 在庫調査日時           */ upsertTbl.setInventorydatetime(inventoryDate);
            /* No.11 拠点ID                 */ upsertTbl.setCenterId(centerId);
            /* No.12 荷主ID                 */ upsertTbl.setClientId(clientId);
            tTrcaseinventoryBhv.insert(upsertTbl);

            return caseInventoryNo;
        }
    }

    /*
     * 3.製造年月日の登録・更新
     * 
     * @param dto Dto
     */
    private void upsertManufactureDate(HttpSession ses, InventoryInputProductSortingPlaceDto dto) {

        // 3.1.(1)製造年月日明細を検索、在庫調査日を取得する。
        TTrmanufacturedatedetail tTrmanufacturedatedetail = inventoryInputProductSortingPlaceLogic.getRecordFromTTrmanufacturedatedetailByInventoryDate(dto, null);

        // 3.1.(2)変数の初期化
        HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

        /* No.01 製造年月日(登録更新用) */ String registrationManufactureDate = dto.getOutputRegistrationManufactureDate();
        /* No.02 拠点CD                 */ String centerCd = loginInfo.getCenterCd();
        /* No.03 取引先(荷主)CD         */ String clientCd = loginInfo.getClientCd();
        /* No.04 棚卸区分 '02'(仕分場)  */ String inventoryKbn = "02";
        /* No.05 ライン/ブロック        */ String lineBlock = dto.getOutputSotedUnit();
        /* No.06 銘柄CD                 */ String productCd = dto.getTInventoryBDto().getProductCd();
        /* No.07 製造年月日             */ String manufactureDate = dto.getInputOrFetchedManufactureDate();
        /* No.08 拠点ID                 */ Long centerId = dto.getMClientCenterDto().getCenterId();
        /* No.09 荷主ID                 */ Long clientId = dto.getMClientCenterDto().getClientId();
        /* No.10 在庫調査指示キー       */ String inventoryKey = dto.getInputOrFetchedInventoryKey();
        /* No.11 棚卸ボディID           */ Long inventoryBId = dto.getTInventoryBDto().getInventoryBId();
        /* No.12 在庫調査日             */ String inventoryDate = tTrmanufacturedatedetail.getInventoryDate();
        /* No.13 前回製造年月日         */ String prevInspectionManufactureDate = dto.getFetchedPrevInspectionManufactureDate();
        /* No.14 今回製造年月日         */ String inspectionManufactureDate = !Objects.isNull(dto.getOutputRegistrationManufactureDate()) ? registrationManufactureDate : "";
        /* No.15 デザイン区分           */ String designFlg = !Objects.isNull(dto.getOutputRegistrationManufactureDate()) ? dto.getTTrsymbolDto().getLot3() : "";

//        // 3.2.(1)変数.製造年月日が存在する場合、以下を実行する。
//        if (!manufactureDate.isBlank()) {
//
//            // 3.2.(1)(A)変数.製造年月日(登録更新用)が存在する場合、以下を実行する。
//            if (!registrationManufactureDate.isBlank()) {
//                // 3.2.(1)(A)(a)製造年月日を検索、製造年月日項目を取得する。
//                TTrmanufacturedate tTrmanufacturedate = inventoryInputProductSortingPlaceLogic.getRecordFromTTrmanufacturedate(dto);
//
//                // 3.2.(1)(A)(a)(I)レコードが存在する場合、該当する製造年月日の更新(update)を行う。
//                // (テーブル項目編集定義.2.製造年月日更新(T_TRMANUFACTUREDATE)を参照)
//                if (Objects.nonNull(tTrmanufacturedate)) {
//                    TTrmanufacturedate upsertTbl = new TTrmanufacturedate();
//                    upsertTbl.setTrmanufacturedateId(tTrmanufacturedate.getTrmanufacturedateId());
//                    upsertTbl.setVersionNo(tTrmanufacturedate.getVersionNo());
//                    /* No.01 拠点CD                 */ upsertTbl.setCenterCd(centerCd);
//                    /* No.02 取引先(荷主)CD         */ upsertTbl.setOwnerCd(clientCd);
//                    /* No.03 棚卸区分               */ upsertTbl.setInventoryKbn(inventoryKbn);
//                    /* No.04 ライン/ブロック        */ upsertTbl.setLineBlock(lineBlock);
//                    /* No.05 銘柄CD                 */ upsertTbl.setProductCd(productCd);
//                    /* No.06 製造年月日             */ upsertTbl.setManufactureDate(manufactureDate);
//                    /* No.07 拠点ID                 */ upsertTbl.setCenterId(centerId);
//                    /* No.08 荷主ID                 */ upsertTbl.setClientId(clientId);
//                    tTrmanufacturedateBhv.update(upsertTbl);
//                }
//
//                // 3.2.(1)(A)(a)(II)レコードが存在しない場合、製造年月日の登録(insert)を行う。
//                // (テーブル項目編集定義.3.製造年月日登録(T_TRMANUFACTUREDATE)を参照)
//                else {
//                    TTrmanufacturedate upsertTbl = new TTrmanufacturedate();
//                    /* No.01 製造年月日ID           */
//                    /* No.02 拠点CD                 */ upsertTbl.setCenterCd(centerCd);
//                    /* No.03 取引先(荷主)CD         */ upsertTbl.setOwnerCd(clientCd);
//                    /* No.04 棚卸区分               */ upsertTbl.setInventoryKbn(inventoryKbn);
//                    /* No.05 ライン/ブロック        */ upsertTbl.setLineBlock(lineBlock);
//                    /* No.06 銘柄CD                 */ upsertTbl.setProductCd(productCd);
//                    /* No.07 製造年月日             */ upsertTbl.setManufactureDate(manufactureDate);
//                    /* No.08 拠点ID                 */ upsertTbl.setCenterId(centerId);
//                    /* No.09 荷主ID                 */ upsertTbl.setClientId(clientId);
//                    tTrmanufacturedateBhv.insert(upsertTbl);
//                }
//            }
//
//            // 3.2.(1)(B)製造年月日明細を検索、製造年月日明細項目を取得する。
//            TTrmanufacturedatedetail trmanufacturedatedetail = inventoryInputProductSortingPlaceLogic.getRecordFromTTrmanufacturedatedetailByInventoryDate(dto, inventoryDate);
//
//            // 3.2.(1)(B)(a)レコードが存在する場合、該当する製造年月日明細の更新(update)を行う。
//            // (テーブル項目編集定義.4.製造年月日明細更新(T_TRMANUFACTUREDATEDETAIL)を参照)
//            if (Objects.nonNull(trmanufacturedatedetail)) {
//                TTrmanufacturedatedetail upsertTbl = new TTrmanufacturedatedetail();
//                upsertTbl.setTrmanufacturedatedetailId(trmanufacturedatedetail.getTrmanufacturedatedetailId());
//                upsertTbl.setVersionNo(trmanufacturedatedetail.getVersionNo());
//                /* No.01 拠点CD                 */ upsertTbl.setCenterCd(centerCd);
//                /* No.02 取引先(荷主)CD         */ upsertTbl.setOwnerCd(clientCd);
//                /* No.03 棚卸区分               */ upsertTbl.setInventoryKbn(inventoryKbn);
//                /* No.04 ライン/ブロック        */ upsertTbl.setLineBlock(lineBlock);
//                /* No.05 銘柄CD                 */ upsertTbl.setProductCd(productCd);
//                /* No.06 在庫調査指示キー       */ upsertTbl.setInventoryKey(inventoryKey);
//                /* No.07 棚卸ボディID           */ upsertTbl.setInventoryBId(inventoryBId);
//                /* No.08 在庫調査日             */ upsertTbl.setInventoryDate(inventoryDate);
//                /* No.09 前回製造年月日         */ upsertTbl.setBfManufactureDate(prevInspectionManufactureDate);
//                /* No.10 今回製造年月日         */ upsertTbl.setAfManufactureDate(inspectionManufactureDate);
//                /* No.11 デザイン区分           */ upsertTbl.setDesignFlg(designFlg);
//                /* No.12 拠点ID                 */ upsertTbl.setCenterId(centerId);
//                /* No.13 荷主ID                 */ upsertTbl.setClientId(clientId);
//                tTrmanufacturedatedetailBhv.update(upsertTbl);
//            }
//
//            // 3.2.(1)(B)(b)レコードが存在しない場合、製造年月日明細の登録(insert)を行う。
//            // (テーブル項目編集定義.5.製造年月日明細登録(T_TRMANUFACTUREDATEDETAIL)を参照)
//            else {
//                TTrmanufacturedatedetail upsertTbl = new TTrmanufacturedatedetail();
//                /* No.01 製造年月日明細ID       */
//                /* No.02 拠点CD                 */ upsertTbl.setCenterCd(centerCd);
//                /* No.03 取引先(荷主)CD         */ upsertTbl.setOwnerCd(clientCd);
//                /* No.04 棚卸区分               */ upsertTbl.setInventoryKbn(inventoryKbn);
//                /* No.05 ライン/ブロック        */ upsertTbl.setLineBlock(lineBlock);
//                /* No.06 銘柄CD                 */ upsertTbl.setProductCd(productCd);
//                /* No.07 在庫調査指示キー       */ upsertTbl.setInventoryKey(inventoryKey);
//                /* No.08 棚卸ボディID           */ upsertTbl.setInventoryBId(inventoryBId);
//                /* No.09 在庫調査日             */ upsertTbl.setInventoryDate(inventoryDate);
//                /* No.10 前回製造年月日         */ upsertTbl.setBfManufactureDate(prevInspectionManufactureDate);
//                /* No.11 今回製造年月日         */ upsertTbl.setAfManufactureDate(inspectionManufactureDate);
//                /* No.12 デザイン区分           */ upsertTbl.setDesignFlg(designFlg);
//                /* No.13 拠点ID                 */ upsertTbl.setCenterId(centerId);
//                /* No.14 荷主ID                 */ upsertTbl.setClientId(clientId);
//                tTrmanufacturedatedetailBhv.insert(upsertTbl);
//            }
//
//            // 3.2.(1)(C)製造年月日履歴の登録(insert)を行う。
//            // (テーブル項目編集定義.6.製造年月日履歴登録(T_TRMANUFACTUREDATEHISTORY)を参照)
//            TTrmanufacturedatehistory upsertTbl = new TTrmanufacturedatehistory();
//            /* No.01 製造年月日履歴ID       */
//            /* No.02 拠点CD                 */ upsertTbl.setCenterCd(centerCd);
//            /* No.03 取引先(荷主)CD         */ upsertTbl.setOwnerCd(clientCd);
//            /* No.04 棚卸区分               */ upsertTbl.setInventoryKbn(inventoryKbn);
//            /* No.05 ライン/ブロック        */ upsertTbl.setLineBlock(lineBlock);
//            /* No.06 銘柄CD                 */ upsertTbl.setProductCd(productCd);
//            /* No.07 在庫調査指示キー       */ upsertTbl.setInventoryKey(inventoryKey);
//            /* No.08 棚卸ボディID           */ upsertTbl.setInventoryBId(inventoryBId);
//            /* No.09 在庫調査日             */ upsertTbl.setInventoryDate(inventoryDate);
//            /* No.10 前回製造年月日         */ upsertTbl.setBfManufactureDate(prevInspectionManufactureDate);
//            /* No.11 今回製造年月日         */ upsertTbl.setAfManufactureDate(inspectionManufactureDate);
//            /* No.12 デザイン区分           */ upsertTbl.setDesignFlg(designFlg);
//            /* No.13 拠点ID                 */ upsertTbl.setCenterId(centerId);
//            /* No.14 荷主ID                 */ upsertTbl.setClientId(clientId);
//            tTrmanufacturedatehistoryBhv.insert(upsertTbl);
//        }
    }

    /**
     * 
     * E_10_003:戻るボタン押下
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
        boolean emptyButtonPressFlag = dto.isEmptyButtonPressFlag();
        String stockInspectionGategoryValue = null;// dto.getStockInspectionCategoryValue();

        // 2.2.(1)変数.空ロケ押下フラグが'true'の場合、以下を実行する。
        // 2.2.(1)(A)(a)製品不良数入力(InventoryInputProductSortingPlaceDefectiveQuantity)初期表示処理(display)を行う。
        if (emptyButtonPressFlag) {
            System.out.println("2.2.(1)(A)製品不良数入力(InventoryInputProductSortingPlaceDefectiveQuantity)遷移");
            InventoryInputProductSortingPlaceDefectiveQuantityResource.display(this, util, inventoryInputProductSortingPlaceLogic);
        }

        // 2.2.(2)変数.在庫調査区分が'03'(終了検品)の場合、以下を実行する。
        // 2.2.(2)(A)(a)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)初期表示処理(display)を行う。
        else if (stockInspectionGategoryValue == "03") {
            System.out.println("2.2.(2)(A)製造年月日照合(InventoryInputProductSortingPlaceProductionDateCollation)遷移");
            InventoryInputProductSortingPlaceProductionDateCollationResource.display(this, util, inventoryInputProductSortingPlaceLogic);
        }

        // 2.1.(3)上記以外の場合、以下を実行する。
        // 2.1.(3)(A)(a)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)初期表示処理(display)を行う。
        else {
            System.out.println("2.1.(3)(A)在庫調査数入力(InventoryInputProductSortingPlaceQuantity)遷移");
            InventoryInputProductSortingPlaceQuantityResource.display(this, util, inventoryInputProductSortingPlaceLogic);
        }

        inventoryInputProductSortingPlaceLogic.outPrintln(dto, "E10:◆在庫調査結果確認");
    }

    /**
     * 挿入ダミーを保存するクラス。
     * @param putDmyCaseCd 挿入ﾀﾞﾐｰｹｰｽCD
     * @param putDmyCutCaseCd 挿入ﾀﾞﾐｰ分割ｹｰｽCD
     * @param putDmyCaseDetailNo 挿入ﾀﾞﾐｰｹｰｽ明細番号
     * @param putDmyDirectionNo 挿入ﾀﾞﾐｰさしず番号
     * @param putDmyDirectionOrdergNo 挿入ﾀﾞﾐｰさしず実績枝番号
     */
//    record PutDmy(Long putDmyCaseCd, Long putDmyCutCaseCd, Long putDmyCaseDetailNo, Long putDmyDirectionNo, Long putDmyDirectionOrdergNo) {
//    }
}
