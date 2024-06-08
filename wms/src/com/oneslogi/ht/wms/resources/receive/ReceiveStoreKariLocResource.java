package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveStoreDto;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveStoreDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveStoreKariLocDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveStoreSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 入庫格納(仮ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveStoreKariLoc")
@HandyErrorReturnPath(returnURL = "ReceiveStoreKariLoc/display")
public class ReceiveStoreKariLocResource extends HandyResourceBase {

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
	@Inject
	private ReceiveStoreSelectLogic selectLogic;
	@Inject
	private LocationLogic locationLogic;

	/**
	 * 入庫格納(仮ロケ入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic,selectLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic,ReceiveStoreSelectLogic selectLogic) throws Exception {

		//機能単位セッションを処理化
		ReceiveStoreResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic,selectLogic);

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			ses.setAttribute("ReceiveStoreDto", dto);
			//入庫ラベルNo入力画面に遷移する
			ReceiveStoreLabelNoResource.load(resource, util, centerLogic, clientLogic, warehouseLogic,selectLogic);
		} else {
			// 入庫No管理対象外場合
			// センタCDより、ロケーションマスタ中に、仮ロケの内容を取得
			List<MLocation> mLocationList = selectLogic.tMLocationSelect(dto.getwHtReceiveStoreDto().getCenterId());
			if (mLocationList.size()==1){
				WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
				wHtReceiveStoreDto.setLocCd(mLocationList.get(0).getLocationCd());
				wHtReceiveStoreDto.setKariLocCd(mLocationList.get(0).getLocationCd());
				dto.setwHtReceiveStoreDto(wHtReceiveStoreDto);
				ses.setAttribute("ReceiveStoreDto", dto);
			}
			//自画面表示
			display(resource, util);
		}
	}

	/**
	 * 入庫格納(仮ロケ入力)画面表示を行います。
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
		resource.initScreen("ReceiveStoreKariLocHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveStoreCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveStoreKariLoc/send").itemCd("confirm").build());
		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveStoreKariLoc/send").build());

		//仮ロケ入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveStoreKariLoc.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、JAN入力画面に遷移します。
	 * @param bean 仮ロケ入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ReceiveStoreHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam ReceiveStoreKariLocDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveStoreDto dto = (ReceiveStoreDto) ses.getAttribute("ReceiveStoreDto");

		WHtReceiveStoreDto wHtReceiveStoreDto = dto.getwHtReceiveStoreDto();
		wHtReceiveStoreDto.setKariLocCd(bean.getKariLocCd());
		wHtReceiveStoreDto.setOnsNum(null);
		wHtReceiveStoreDto.setJanCd(null);
		wHtReceiveStoreDto.setProductCd(null);
		wHtReceiveStoreDto.setLimitDt(null);
		wHtReceiveStoreDto.setLot(null);

		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End


		//ロケチェック
		MLocation mLocation = new MLocation();
		mLocation.setLocationCd(bean.getKariLocCd());
		mLocation.setCenterId(dto.data.wHtReceiveStoreDto.getCenterId());
		mLocation = locationLogic.getUkEntity(mLocation, new ErrorStatus());
		if (mLocation == null) {
			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		if (!"01".equals(mLocation.getLocationType())) {
			//仮ロケは入庫仮ロケーションを入力してください。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_LOC_NOT_NORMAL);
			return;
		}

		WHtReceiveStoreDtoMapper wHtReceiveStoreDtoMapper = new WHtReceiveStoreDtoMapper();
		WHtReceiveStore wHtReceiveStore = wHtReceiveStoreDtoMapper.mappingToEntity(wHtReceiveStoreDto);

		//在庫データに入力したの仮ロケが存在するかチェックを行う
		List<TStockInout> tStockInoutListByKariLoc = receiveStoreSelectLogic.checkExistStoreInoutSelectByKariLoc(wHtReceiveStore);
		if (tStockInoutListByKariLoc.size() == 0) {
			//該当の仮ロケに入荷した在庫データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR);
			return;
		}

		//通信制御データ作成
		util.setHtComCtl(ses, "ReceiveStore", wHtReceiveStoreDto.getKariLocCd());
		dto.setwHtReceiveStoreDto(wHtReceiveStoreDtoMapper.mappingToDto(wHtReceiveStore));
		ses.setAttribute("ReceiveStoreDto", dto);

		//JAN入力画面を表示
		ReceiveStoreJanCdResource.load(this, util);
	}
}
