package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品再開Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPacking")
@HandyErrorReturnPath(returnURL = "ShippingNoPacking/reopenProcess")
public class ShippingNoPackingResource extends HandyResourceBase {

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
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	@Inject
	private ShippingNoPackingCheckLogic checkLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private MBoxBhv mBoxBhv;
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
	@Inject
	private ShippingCommonLogic commonLogic;
	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(JAN入力)画面に遷移します。
	 * @param pickingWorkNo
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String pickingWorkNo) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		//機能単位セッションを処理化
		ShippingNoPackingResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic);

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		//出庫作業No.の初期化
		wHtShippingDto.setPickingWorkNo(pickingWorkNo);

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//個口の取得
		selectLogic.selectPiece(wHtShipping);

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));

		ses.setAttribute("ShippingNoPackingDto", dto);

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		if(dto.getIsPackingNo()){
			// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod Start
			MBox defaultBox = checkLogic.selectDefaultBox(wHtShipping);
			if (defaultBox != null) {
				dto.setDefaultBox (new MBoxDtoMapper().mappingToDto(defaultBox));
			}
			// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod End
		}
		//ログイン情報取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//パラメータマスタ情報の取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(loginInfo.getClientId());
		mClientCenter.setCenterId(loginInfo.getCenterId());
		MParam mParam = new MParam();
		mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);
		// 荷材選択スキップ 0：スキップしない、1：スキップする
		dto.setIsBoxSelectSkip(mParam.getBoxSelectSkip());
		//出庫作業No.で検品する場合、
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod Start
		if(!dto.getIsPackingNo()){
			// デフォルト荷材
			if (mParam.getDefaultBoxId() != null) {
				MBoxCB cb = mBoxBhv.newMyConditionBean();
				cb.query().setCenterId_Equal(loginInfo.getCenterId());
				cb.query().setBoxId_Equal(mParam.getDefaultBoxId());
				MBox defaultBox = mBoxBhv.selectEntity(cb);
				if (defaultBox != null) {
					dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
				}
			}
		} else {
			if (dto.getDefaultBox().getBoxId() == null) {
				// デフォルト荷材
				if (mParam.getDefaultBoxId() != null){
					MBoxCB cb = mBoxBhv.newMyConditionBean();
					cb.query().setCenterId_Equal(loginInfo.getCenterId());
					cb.query().setBoxId_Equal(mParam.getDefaultBoxId());
					MBox defaultBox = mBoxBhv.selectEntity(cb);
					if (defaultBox != null) {
						dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
					}
				}
			}
		}
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod End

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
		//JAN入力画面を表示
		ShippingNoPackingJanCdResource.load(this, util);
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

		//バラ出荷検品情報の初期化
		ShippingNoPackingDto dto = new ShippingNoPackingDto();

		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

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
		wHtShippingDto.setCenterId(loginInfo.getCenterId());
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
		wHtShippingDto.setClientId(loginInfo.getClientId());
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
		wHtShippingDto.setMacAddress(util.getMacAddress(ses));
		//出荷検品フラグの初期化
//		wHtShippingDto.setSpgInspectionFlg("03");

		wHtShippingDto.setUpdUser(loginInfo.getUserCd());
		ses.setAttribute("ShippingNoPackingDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic          業務ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ShippingLogic shippingLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出荷検品ワークテーブルをクリア
		shippingLogic.clearWHtShipping(wHtShipping);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		ses.removeAttribute("ShippingNoPackingDto");
	}

	/**
	 * <h2>出庫作業Noが出庫ヘッダにの存在チェック</h2>
	 * <pre>
	 * ・データ存在しない場合
	 *   ①排它メッセージの表示
	 *   ②出荷検品中断ワークテーブルのクリア（存在の場合）
	 *   ③出荷検品ワークテーブルのクリア
	 *   ④出庫作業No入力画面に遷移
	 * ・データ存在する場合、処理を継続
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param shippingLogic  業務ロジック
	 * @return true:出庫作業No存在;false:出庫作業No存在しない
	 * @throws Exception
	 */
	public static boolean checkExistPickingWorkNo(
			HandyResourceBase resource,
			HandyCommonUtil util,
			ShippingLogic shippingLogic,
			ShippingNoPackingClearLogic clearLogic,
			ShippingCommonLogic commonLogic
			) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();
		boolean existFlg = false;

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出庫作業No.存在チェック
			existFlg = shippingLogic.checkExistPickingWorkNo(wHtShipping);
			dto.setIsPackingNo(false);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出荷梱包No.存在チェック
			existFlg = shippingLogic.checkExistShippingPackingNo(wHtShipping);
			dto.setIsPackingNo(true);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else {
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			resource.getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			existFlg = false;
		}
		//出庫作業No.或いは出荷梱包No.存在チェック
		if (!existFlg) {
			//出荷検品中断ワークテーブルをクリア
			clearLogic.clearWShippingInterrupt(wHtShipping);

			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			ses.setAttribute("ShippingNoPackingDto", dto);

			//機能単位セッションを再構造
			ShippingNoPackingResource.removeSession(resource, util, shippingLogic);

			ErrorManager errorManager = resource.getErrorManager();
			resource.sendErrorScreen(util.getMessage(errorManager), "", "ShippingNoPackingWorkNo/load");
			errorManager.clear();
			return false;
		}
		return true;
		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End
	}

}
