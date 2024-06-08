package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * ケースピッキング再開Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePicking")
@HandyErrorReturnPath(returnURL = "ShippingCasePicking/reopenProcess")
public class ShippingCasePickingResource extends HandyResourceBase {

	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* センタマスタに対するロジッククラス */
	@Inject
	private CenterLogic centerLogic;
	/* 荷主マスタに対するロジッククラス */
	@Inject
	private ClientLogic clientLogic;
	/* 倉庫マスタチェック処理ロジッククラス */
	@Inject
	private WarehouseLogic warehouseLogic;
	/* 出荷共通ロジッククラス */
	@Inject
	private ShippingLogic shippingLogic;
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingSelectLogic shippingCasePickingSelectLogic;
	/* パラメータマスタに対するロジッククラス */
	@Inject
	private ParamLogic paramLogic;
	/* ケースピッキングデータチェックロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic checkLogic;
	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、ケースピッキング(JAN入力或は入庫No)画面に遷移します。
	 * @param casePickingNo ケースピッキングNo.
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String casePickingNo) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		ShippingCasePickingResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		//ケースピッキングNo.の初期化
		dto.setCasePickingNo(casePickingNo);

		ses.setAttribute("ShippingCasePickingDto", dto);

		// ケースピッキングNo.のデータ存在チェック
		if (!ShippingCasePickingResource.checkExistCasePickingNo(this, util, shippingLogic)) {
			return;
		}

		//ログイン情報取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//パラメータマスタ情報の取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(loginInfo.getClientId());
		mClientCenter.setCenterId(loginInfo.getCenterId());

		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

		//入庫No.管理フラグの内容で遷移先を変更
		String storeNoFlg = mParam.getStoreNoFlg();
		if (storeNoFlg.equals("0")) {//入庫NO.管理対象外の場合

			//ケースピック(JAN)の画面を表示
			// [Ver3.0] unit of measure対応 2017.12.01 王 Start
			ShippingCasePickingJanCdResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.12.01 王 End

		} else {//入庫NO.管理対象の場合

			//ケースピック(入庫No.)の画面を表示
			// [Ver3.0] unit of measure対応 2017.11.29 王 Start
			ShippingCasePickingStoreLabelNoResource.load(this, util, shippingCasePickingSelectLogic,checkLogic);
			// [Ver3.0] unit of measure対応 2017.11.29 王 End
		}

	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//ケースピッキング情報の初期化
		ShippingCasePickingDto dto = new ShippingCasePickingDto();

		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		wHtShippingPickingDto.setCenterId(loginInfo.getCenterId());
		wHtShippingPickingDto.setClientId(loginInfo.getClientId());

		//MACアドレスの初期化
		wHtShippingPickingDto.setMacAddress(util.getMacAddress(ses));

		ses.setAttribute("ShippingCasePickingDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic  業務ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ShippingLogic shippingLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//出荷ピッキングワークテーブルをクリア
		shippingLogic.clearWHtShippingPicking(wHtShippingPicking);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("ShippingCasePickingDto");
	}


	/**
	 * <h2>ケースピッキングNo.の対象データ存在チェック </h2>
	 * <pre>
	 * ・データが存在しない場合
	 *   ①エラーメッセージの表示
	 *   ②出荷ピッキングワークテーブルのクリア
	 *   ③ケースピッキングNo入力画面に遷移
	 * ・データ存在する場合、処理を継続
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic  業務ロジック
	 * @return true:ケースピッキングNo存在;false:ケースピッキングNo存在しない
	 * @throws Exception
	 */
	public static boolean checkExistCasePickingNo(HandyResourceBase resource, HandyCommonUtil util,
			ShippingLogic shippingLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		boolean existFlg = false;

		// ケースピッキングNo.存在チェック
		existFlg = shippingLogic.checkExistCasePickingNo(wHtShippingPicking, dto.getCasePickingNo());

		if (!existFlg) {
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingCasePickingDto", dto);

			//機能単位セッションを再構造
			ShippingCasePickingResource.removeSession(resource, util, shippingLogic);

			ErrorManager errorManager = resource.getErrorManager();
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ShippingCasePickingNo/load");
			errorManager.clear();
			return false;
		}

		return true;

	}
}
