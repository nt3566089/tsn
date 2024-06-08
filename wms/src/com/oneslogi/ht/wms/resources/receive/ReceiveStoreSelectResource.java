package com.oneslogi.ht.wms.resources.receive;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;

/**
 * 入庫格納(選択)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreSelect")
@HandyErrorReturnPath(returnURL = "ReceiveStoreSelect/display")
public class ReceiveStoreSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveStoreSelectLogic receiveStoreSelectLogic;

	/**
	 * 入庫格納(選択)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		dto.setLoc("");
		dto.setPageIndex(0);
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setStoreNum(null);
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(選択)画面表示を行います。
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

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD Start
		resource.initScreen("ReceiveStoreSelectHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreSelect/send").build());

		//フッタボタン（左）設定
		if ("0".equals(dto.getLotLimitDt())) {
			resource.setReturnButton(
					ButtonInfo.builder().url("ReceiveStoreJanCd/display").itemCd("return").build());

		} else if ("1".equals(dto.getLotLimitDt())) {
			resource.setReturnButton(
					ButtonInfo.builder().url("ReceiveStoreLotLimitDt/display").itemCd("return").build());

		} else if ("2".equals(dto.getLotLimitDt())) {
			resource.setReturnButton(
					ButtonInfo.builder().url("ReceiveStoreLot/display").itemCd("return").build());

		} else if ("3".equals(dto.getLotLimitDt())) {
			resource.setReturnButton(
					ButtonInfo.builder().url("ReceiveStoreLimitDt/display").itemCd("return").build());
		}

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreSelect/select").itemCd("send").build());

		// オプションボタン１設定
		resource.setOptionButton1(ButtonInfo.builder().url("ReceiveStoreSelect/prev").itemCd("option1").build());
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder().url("ReceiveStoreSelect/next").itemCd("option2").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02  ライ MOD END
		//入庫格納（選択）画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreSelect.jsp", ses);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/prev")
	public void prev() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstStockTypeId().size() - 1);
		}

		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 次時にコールされるメソッドです。<br>
	 * 次情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/next")
	public void next() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		if (dto.getPageIndex() < dto.getLstStockTypeId().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ReceiveStore", dto);

		//自画面表示
		display();
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入庫格納選択して、数量入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setStockTypeId(dto.getLstStockTypeId().get(dto.getPageIndex()));
		wHtReceiveStoreDto.setStkClsNm(dto.getLstStockTypeNm().get(dto.getPageIndex()));
		wHtReceiveStoreDto.setDepositId(dto.getLstDepositId().get(dto.getPageIndex()));
		wHtReceiveStoreDto.setDepositNm(dto.getLstDepositNm().get(dto.getPageIndex()));
		wHtReceiveStoreDto.setSupplierId(dto.getLstSupplierId().get(dto.getPageIndex()));
		wHtReceiveStoreDto.setSupplierNm(dto.getLstSupplierNm().get(dto.getPageIndex()));

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//在庫データに入力したの仮ロケが存在するかチェックを行う
		List<TStockInout> tStockInoutSelect = receiveStoreSelectLogic.tStockInoutSelect(wHtReceiveStore);
		if (tStockInoutSelect.size() == 0) {
			//該当の仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
			return;
		}
		BigDecimal lChargeNum = WCC.ZERO;
		BigDecimal lStoreNum = WCC.ZERO;
		boolean blnSame = true;
		// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.21 nayzaw Start
		Set<Long> addedChargeNumStockIdSet = new HashSet<Long>();
		for (int i = 0; i < tStockInoutSelect.size(); i++) {
			if (!addedChargeNumStockIdSet.contains(tStockInoutSelect.get(i).getStockId())) {
				lChargeNum = WCC.add(lChargeNum, tStockInoutSelect.get(i).getTStock().getChargeNum());
				addedChargeNumStockIdSet.add(tStockInoutSelect.get(i).getStockId());
			}
		// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.21 nayzaw End
			lStoreNum = WCC.add(lStoreNum, tStockInoutSelect.get(i).getTStoreRecordB().getStoreNum());
			if ((!CU.nullToStr(tStockInoutSelect.get(0).getTStoreRecordB().getLot()).equals(CU.nullToStr(tStockInoutSelect.get(i).getTStoreRecordB().getLot())) ||
				!CU.nullToStr(tStockInoutSelect.get(0).getTStoreRecordB().getLimitDt()).equals(CU.nullToStr(tStockInoutSelect.get(i).getTStoreRecordB().getLimitDt())))
					&& blnSame) {
				blnSame = false;
			}
		}

		//仮ロケに入荷した在庫データの在庫数チェックを行う
		if (WCC.isZero(lChargeNum)) {
			//該当のJAN/商品コードの仮ロケに入荷した在庫データの在庫数が0です。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_JAN_STOCK_QTY_ZERO_ERROR);
			return;
		}

		wHtReceiveStoreDto.setNumOfStore(WCC.subtract(lStoreNum, lChargeNum));
		wHtReceiveStoreDto.setPlanNum(lStoreNum);

		dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
		ses.setAttribute("ReceiveStoreDto", dto);

		//入庫格納数量入力画面を表示
		ReceiveStoreQtyResource.load(this, util);
	}
}
