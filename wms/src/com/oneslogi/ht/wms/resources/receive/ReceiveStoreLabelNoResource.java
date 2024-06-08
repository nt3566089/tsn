package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreLabelNoDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 入庫格納(入庫ラベルNo)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreLabelNo")
@HandyErrorReturnPath(returnURL = "ReceiveStoreLabelNo/display")
public class ReceiveStoreLabelNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ReceiveStoreSelectLogic receiveStoreSelectLogic;

	/**
	 * 入庫格納(入庫ラベルNo)入力画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic,receiveStoreSelectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic,ReceiveStoreSelectLogic selectLogic) throws Exception {

		//機能単位セッションを処理化
		ReceiveStoreResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic,selectLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(入庫ラベルNo)入力画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD Start
		resource.initScreen("ReceiveStoreLabelNoHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreLabelNo/send").itemCd("send").build());
		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreLabelNo/send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD END
		//入庫ラベルNo入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreLabelNo.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、数量入力画面に遷移します。
	 * @param bean 入庫ラベルNo入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2018/01/09 PYM Start
	@WorkLogStart("ReceiveStoreHT")
	// [#2946][Ver3.0] WAS連携対応 2017/01/09 PYM End
	public void send(@BeanParam ReceiveStoreLabelNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setOnsNum(bean.getOnsNum());
		wHtReceiveStoreDto.setJanCd(null);
		wHtReceiveStoreDto.setProductCd(null);
		wHtReceiveStoreDto.setLimitDt(null);
		wHtReceiveStoreDto.setLot(null);

		// [#575] ValidateチェックのHT国際化 2017.02.07 sja Start
		// 入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.07 sja End


		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//入力したラベルNoで取得した入庫実績データから在庫データが存在するかチェックを行う
		List<TStockInout> tStockInoutList = receiveStoreSelectLogic.checkExistStoreInoutSelect(wHtReceiveStore);
		if (tStockInoutList.size() == 0) {
			//該当のラベルNOに入荷した在庫データ（仮ロケ）が存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_NOT_FOUND_ERROR);
			return;
		}

		BigDecimal lChargeNum = WCC.ZERO;
		BigDecimal lStoreNum = WCC.ZERO;
		// [1.1.4-CT-012] 同じ在庫に入庫されたときに入庫数が多く表示される問題を修正 2016.05.16 kawana Start
		// 引当可能数を加算済みの在庫IDセット
		Set<Long> addedChargeNumStockIdSet = new HashSet<Long>();
		for (int i = 0; i < tStockInoutList.size(); i++) {
			// 加算済の在庫IDの場合は加算しない
			if (!addedChargeNumStockIdSet.contains(tStockInoutList.get(i).getStockId())) {
				lChargeNum = WCC.add(lChargeNum, tStockInoutList.get(i).getTStock().getChargeNum());
				addedChargeNumStockIdSet.add(tStockInoutList.get(i).getStockId());
			}
			// [1.1.4-CT-012] 同じ在庫に入庫されたときに入庫数が多く表示される問題を修正 2016.05.16 kawana End
			lStoreNum = WCC.add(lStoreNum, tStockInoutList.get(i).getTStoreRecordB().getStoreNum());
		}

		//ラベルNoに入荷した在庫データの在庫数チェックを行う
		if (WCC.isZero(lChargeNum)) {
			//該当のラベルNOに入荷した在庫データの在庫数が0です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_LABEL_STOCK_QTY_ZERO_ERROR);
			return;
		}

		wHtReceiveStoreDto.setProductId(tStockInoutList.get(0).getTStock().getProductId());
		wHtReceiveStoreDto.setProductNm(tStockInoutList.get(0).getTStock().getMProduct().getProductNm());
		wHtReceiveStoreDto.setProductCd(tStockInoutList.get(0).getTStock().getMProduct().getProductCd());
		wHtReceiveStoreDto.setJanCd(tStockInoutList.get(0).getTStock().getMProduct().getJanCd());

		//格納済数
		wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
		wHtReceiveStoreDto.setLimitDt(tStockInoutList.get(0).getTStoreRecordB().getLimitDt());
		wHtReceiveStoreDto.setLot(tStockInoutList.get(0).getTStoreRecordB().getLot());
		wHtReceiveStoreDto.setPlanNum(lStoreNum);
		wHtReceiveStoreDto.setStockTypeId(tStockInoutList.get(0).getTStock().getStockTypeId());
		wHtReceiveStoreDto.setStkClsNm(tStockInoutList.get(0).getTStock().getMStockType().chaseVDict().getDictNm());

		//通信制御データ作成
		util.setHtComCtl(ses, "ReceiveStore", wHtReceiveStoreDto.getOnsNum());
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//数量入力画面を表示
		ReceiveStoreQtyResource.load(this, util);
	}
}
