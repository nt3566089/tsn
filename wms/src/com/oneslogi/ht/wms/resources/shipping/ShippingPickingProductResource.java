package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingPickingProductSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * パラピッキング再開Resourceクラスです。
 *
 */
@Path("/handy/ShippingPickingProduct")
@HandyErrorReturnPath(returnURL = "ShippingPickingProduct/reopenProcess")
public class ShippingPickingProductResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ShippingLogic shippingLogic;
	@Inject
	private ShippingPickingProductSelectLogic selectLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、パラピッキング(JAN入力)画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String pickingWorkNo) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		ShippingPickingProductResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		//出庫作業No.の初期化
		wHtShippingPickingDto.setPickingWorkNo(pickingWorkNo);

		ses.setAttribute("ShippingPickingProductDto", dto);

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingPickingProductResource.checkExistPickingWorkNo(this, util, shippingLogic, commonLogic)) {
			return;
		}

		//JAN入力画面を表示
		ShippingPickingProductJanCdResource.load(this, util, selectLogic);
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

		//パラピッキング情報の初期化
		ShippingPickingProductDto dto = new ShippingPickingProductDto();

		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////センター情報の取得
		//MCenter mCenter = new MCenter();
		//mCenter.setCenterCd(loginInfo.getCenterCd());
		//mCenter = centerLogic.getUkEntity(mCenter);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//センター情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MCenterDtoMapper mCenterDtoMapper = new MCenterDtoMapper();
		//wHtShippingDto.setMCenter(mCenterDtoMapper.mappingToDto(mCenter));
		//wHtShippingDto.setCenterId(mCenter.getCenterId());
		wHtShippingPickingDto.setCenterId(loginInfo.getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		////荷主情報の取得
		//MClient mClient = new MClient();
		//mClient.setClientCd(loginInfo.getClientCd());
		//mClient = clientLogic.getUkEntity(mClient);
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		//荷主情報の初期化
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//MClientDtoMapper mClientDtoMapper = new MClientDtoMapper();
		//wHtShippingDto.setMClient(mClientDtoMapper.mappingToDto(mClient));
		//wHtShippingDto.setClientId(mClient.getClientId());
		wHtShippingPickingDto.setClientId(loginInfo.getClientId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]

		/* 2015/05/07 KAI DELETE [ON推-品向-797] 倉庫情報は取得しない
		//倉庫情報の取得
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse.setWarehouseCd(loginInfo.getWarehouseCd());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);

		//倉庫情報の初期化
		MWarehouseDtoMapper mWarehouseDtoMapper = new MWarehouseDtoMapper();
		wHtShippingDto.setMWarehouse(mWarehouseDtoMapper.mappingToDto(mWarehouse));
		wHtShippingDto.setWarehouseId(mWarehouse.getWarehouseId());
		*/

		//MACアドレスの初期化
		wHtShippingPickingDto.setMacAddress(util.getMacAddress(ses));

//  ********************************Really need to delete but there may be spgInspectionFlg's problem

		//出荷検品フラグの初期化
//		wHtShippingPickingDto.setSpgInspectionFlg("04");   //spgInspectionFlgはいらない為削除しました。 当行も削除になりますと思います。

//   ***********

		ses.setAttribute("ShippingPickingProductDto", dto);
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

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//出荷検品ワークテーブルをクリア
		shippingLogic.clearWHtShippingPicking(wHtShippingPicking);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("ShippingPickingProductDto");
	}

	/**
	 * <h2>出庫作業Noが出庫ヘッダにの存在チェック</h2>
	 * <pre>
	 * ・データ存在しない場合
	 *   ①排它メッセージの表示
	 *   ②出荷検品ワークテーブルのクリア
	 *   ③出庫作業No入力画面に遷移
	 * ・データ存在する場合、処理を継続
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic  業務ロジック
	 * @return true:出庫作業No存在;false:出庫作業No存在しない
	 * @throws Exception
	 */
	public static boolean checkExistPickingWorkNo(HandyResourceBase resource, HandyCommonUtil util,
			ShippingLogic shippingLogic, ShippingCommonLogic commonLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingPickingProductDto dto = (ShippingPickingProductDto) ses.getAttribute("ShippingPickingProductDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.14 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShippingPicking.getCenterId();
		final String targetNo = wHtShippingPicking.getPickingWorkNo();
		boolean existFlg = false;

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫作業No.存在チェック
			existFlg = shippingLogic.checkExistPickingWorkNo(wHtShippingPicking);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出荷梱包No.存在チェック
			existFlg = shippingLogic.checkExistShippingPackingNo(wHtShippingPicking);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			resource.getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			existFlg = false;
		}

		//出庫作業No存在チェック
		if (!existFlg) {
			dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
			ses.setAttribute("ShippingPickingProductDto", dto);

			//機能単位セッションを再構造
			ShippingPickingProductResource.removeSession(resource, util, shippingLogic);

			ErrorManager errorManager = resource.getErrorManager();
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ShippingPickingProductWorkNo/load");
			errorManager.clear();
			return false;
		}
		return true;
		// [C-CWMS-0051] 出荷梱包No.で出荷ピッキング検品する場合の為追加処理 2015.12.14 NayZaw End
	}
}
