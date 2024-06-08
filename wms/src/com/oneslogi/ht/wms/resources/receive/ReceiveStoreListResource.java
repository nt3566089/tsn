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
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreRemnantNumLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreWkSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;

/**
 * 入庫格納(登録内容参照)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreList")
@HandyErrorReturnPath(returnURL = "ReceiveStoreList/display")
public class ReceiveStoreListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveStoreWkSelectLogic selectLogic;
	@Inject
	private ReceiveStoreRemnantNumLogic remnantNumLogic;
	@Inject
	private ReceiveStoreSelectLogic selLogic;

	/**
	 * 入庫格納(登録内容参照)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic,remnantNumLogic, selLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ReceiveStoreWkSelectLogic selectLogic,ReceiveStoreRemnantNumLogic remnantNumLogic, ReceiveStoreSelectLogic selLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//登録内容参照画面表示項目を取得
		List<WHtReceiveStore> lstWHtReceiveStore = selectLogic.selectList(wHtReceiveStore);

		//エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		for (int i = 0; i < lstWHtReceiveStore.size();i++){
			// [2.1.0-CT-054]横並びチェック 入庫No管理有場合、残り数の表示がおかしい為修正 2016.11.22 nayzaw Start

			BigDecimal lRemainAmt = WCC.ZERO;
			MParam mParam = new MParam();
			mParam.setStoreNoFlg(dto.getStoreNoFlg());
			if (mParam.isStoreNoFlg$1()) {
				// [#881] 入庫No.管理が有の場合は入庫ラベルNo.単位の残数を表示 2017.01.27 kawana Start
				// 入庫No管理フラグ有の場合残り数取得
				WHtReceiveStore inoutCbObj = wHtReceiveStore.clone();
				inoutCbObj.setOnsNum(lstWHtReceiveStore.get(i).getOnsNum());
				List<TStockInout> lstTStockInOut = selLogic.checkExistStoreInoutSelect(inoutCbObj);
				// [#881] 入庫No.管理が有の場合は入庫ラベルNo.単位の残数を表示 2017.01.27 kawana End
				Set<Long> addedChargeNumStockIdSet = new HashSet<Long>();
				for (int j = 0; j < lstTStockInOut.size();j++){
					if (!addedChargeNumStockIdSet.contains(lstTStockInOut.get(j).getStockId())) {
						lRemainAmt = WCC.add(lRemainAmt, lstTStockInOut.get(j).getTStock().getChargeNum());
						addedChargeNumStockIdSet.add(lstTStockInOut.get(j).getStockId());
					}
				}
				lstWHtReceiveStore.get(i).setRemnantNum(lRemainAmt);
			// [2.1.0-CT-054]横並びチェック 入庫No管理有場合、残り数の表示がおかしい為修正 2016.11.22 nayzaw End
			}else{
				// 入庫No管理フラグ無しの場合残り数取得
				BigDecimal lRemnantNum = WCC.ZERO;
				// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana Start
				List<TStockInout> tStockInoutList = remnantNumLogic.selectRemnantNum(lstWHtReceiveStore.get(i), wHtReceiveStore.getOnsNum());
				// [#6634][v3.1] センタIDの条件抜けを修正 2019.07.30 kawana End
				if (tStockInoutList.size() > 0){
					// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.21 nayzaw Start
					Set<Long> addedChargeNumStockIdSet = new HashSet<Long>();
					for (int j = 0; j < tStockInoutList.size();j++){
						if (!addedChargeNumStockIdSet.contains(tStockInoutList.get(j).getStockId())) {
							lRemnantNum = WCC.add(lRemnantNum, tStockInoutList.get(j).getTStock().getChargeNum());
							addedChargeNumStockIdSet.add(tStockInoutList.get(j).getStockId());
						}
					// [2.1.0-CT-054]同一商品複数明細で予定にロケーションCDが入っている場合に数量計算がおかしい問題を修正 2016.11.21 nayzaw End
					}
					lstWHtReceiveStore.get(i).setRemnantNum(lRemnantNum);
				}else{
					lstWHtReceiveStore.get(i).setRemnantNum(WCC.ZERO);
				}
			}
		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		dto.setLstWHtReceiveStoreDto(wHtReceiveStoreDtoMapper.mappingToDtoList(lstWHtReceiveStore));
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDtoMapper.mappingToDto(wHtReceiveStore));

		ses.setAttribute("ReceiveStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入庫格納(登録内容参照)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD Start
		resource.initScreen("ReceiveStoreListHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("ReceiveStoreList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("ReceiveStoreList/next").itemCd("next").build()
				);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01  ライ MOD END
		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreList.jsp", ses);
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
			dto.setPageIndex(dto.getLstWHtReceiveStoreDto().size() - 1);
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

		if (dto.getPageIndex() < dto.getLstWHtReceiveStoreDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ReceiveStore", dto);

		//自画面表示
		display();
	}

}
