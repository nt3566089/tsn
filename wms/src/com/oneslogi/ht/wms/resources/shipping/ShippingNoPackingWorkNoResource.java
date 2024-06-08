package com.oneslogi.ht.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingWorkNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingClearLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingInsertLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingNoPackingSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品(出庫作業No入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingNoPackingWorkNo")
@HandyErrorReturnPath(returnURL = "ShippingNoPackingWorkNo/display")
public class ShippingNoPackingWorkNoResource extends HandyMenuResource {

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
	private ShippingNoPackingCheckLogic checkLogic;
	@Inject
	private ShippingNoPackingSelectLogic selectLogic;
	@Inject
	private ShippingNoPackingInsertLogic insertLogic;
	@Inject
	private ShippingNoPackingClearLogic clearLogic;
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
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
	 * バラ出荷検品(出庫作業No入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic) throws Exception {
		//機能単位セッションを処理化
		ShippingNoPackingResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util);
	}

	/**
	 * バラ出荷検品(出庫作業No入力)画面表示を行います。
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

		//画面ヘッダ設定
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD Start
		resource.initScreen("ShippingNoPackingWorkNoHT");
		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/send").func("6").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26  ライ MOD END
		//出庫作業No入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingNoPackingWorkNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ShippingNoPackingResource.removeSession(this, util, shippingLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_SHIPPING);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、バラ出荷検品(JAN入力)画面に遷移します。
	 * @param bean 出庫作業No入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ShippingNoPackingHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam ShippingNoPackingWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");

		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();
		wHtShippingDto.setPickingWorkNo(bean.getPickingWorkNo());

		// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.14 sja End

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//2015/03/31 KAI ADD START 顧客出荷指示Noでもできるようチェック処理を追加
		wHtShipping = shippingLogic.checkClientShippingNo(wHtShipping);
		if (wHtShipping == null) {
			return;
		}
		//2015/03/31 KAI ADD END

		//[C-CWMS-0051] 入力したデータが出庫作業Noか出荷梱包Noか確認する  2015/12/10 Nay Zaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			//入力したデータが出庫作業Noの場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫作業No存在チェック
			if (!checkLogic.checkPickingWorkNo(wHtShipping)) {
				return;
			}
			dto.setIsPackingNo(false);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			//入力したデータが出荷梱包Noの場合

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫作業No存在チェック
			if (!checkLogic.checkShippingPackingNo(wHtShipping)) {
				return;
			}
			dto.setIsPackingNo(true);
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
			//[Ver3.0][#2859] 荷材ID未設定の時の処理を変更 2017.12.01 miyabe start
			MBox defaultBox = checkLogic.selectDefaultBox(wHtShipping);
			if(defaultBox != null){
				dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
			}
			//[Ver3.0][#2859] 荷材ID未設定の時の処理を変更 2017.12.01 miyabe End
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		//[C-CWMS-0051] 入力したデータが出庫作業Noか出荷梱包Noか確認する 2015/12/10 NayZaw End
		//出荷検品ワークテーブルをクリア
		shippingLogic.clearWHtShipping(wHtShipping);

		//2015/03/31 KAI ADD START 顧客出荷指示Noから取得した出庫作業Noをここでセット
		wHtShippingDto.setPickingWorkNo(wHtShipping.getPickingWorkNo());
		//2015/03/31 KAI ADD END

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
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

		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM Start
		setWorkLogTraceItem(bean.getPickingWorkNo());
		// [#2946][Ver3.0] WAS連携対応 2018/02/26 PYM End

		//出庫作業No.で検品する場合、
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod Start
		if(!dto.getIsPackingNo()){
			// デフォルト荷材
			if (mParam.getDefaultBoxId()!= null){
				MBoxCB cb = mBoxBhv.newMyConditionBean();
				cb.query().setCenterId_Equal(loginInfo.getCenterId());
				cb.query().setBoxId_Equal(mParam.getDefaultBoxId());
				MBox defaultBox = mBoxBhv.selectEntity(cb);
				if(defaultBox != null){
					dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
				}
			}
		} else {
			// 出荷梱包ヘッダ.荷材ID未設定の場合
			if (dto.getDefaultBox().getBoxId() == null) {
				// デフォルト荷材
				if (mParam.getDefaultBoxId()!= null){
					MBoxCB cb = mBoxBhv.newMyConditionBean();
					cb.query().setCenterId_Equal(loginInfo.getCenterId());
					cb.query().setBoxId_Equal(mParam.getDefaultBoxId());
					MBox defaultBox = mBoxBhv.selectEntity(cb);
					if(defaultBox != null){
						dto.setDefaultBox(new MBoxDtoMapper().mappingToDto(defaultBox));
					}
				}
			}
		}
		// [#2859][Ver3.0] [HT]バラ出荷検品 - 梱包ヘッダ.荷材IDがNULLでの梱包No.送信致命的エラー 2018.01.23 honma Mod End
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
		//中断再開確認
		if (!doResume()) {
			return;
		}

		//出荷作業備考確認
		if (!doConfirm()) {
			return;
		}
	}

	//【C-CWMS-0040】再開する時、「出荷検品中断」テーブルから取得よう修正 2015/09/17 Nay Zaw UPDATE Start
	/**
	 * <h2>中断再開を行います。</h2>
	 * <pre>
	 * </pre>
	 * @return true:処理継続;false:処理終了
	 * @throws Exception
	 */
	private boolean doResume() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出荷検品中断テーブル存在チェック
		if (!checkLogic.checkWShippingInterrupt(wHtShipping)) {

			// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana Start

			if (getErrorManager().size() == 1 &&
					getErrorManager().get().values().toArray(new CommonException[0])[0].getMessageCd().equals(WmsMessageConst.HANDY_CONFIRM_INTERRUPT_RESUME)) {

				// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana End

				getErrorManager().clear();

				dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
				ses.setAttribute("ShippingNoPackingDto", dto);

				//中断再開確認画面を表示
				displayResumeDialog();
				return false;
			} else {
				return false;
			}
		}

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		return true;
	}

	//【C-CWMS-0040】再開する時、「出荷検品中断」テーブルから取得よう修正 2015/09/17 Nay Zaw UPDATE End

	/**
	 * <h2>中断再開確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @throws Exception
	 */
	private void displayResumeDialog() throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		String dialogScreenCd = "ShippingNoPackingCommonDialogHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_OPERATION_END);
		setHeaderColor("yellow");

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/load").itemCd("return").type(BUTTON_URL_JUMP_NO_DATA).build());
		// 再開ボタン設定
		setSendButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/onResumeOk").itemCd("resume").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	//【C-CWMS-0040】再開する時、「出荷検品中断」テーブルから取得よう修正 2015/09/17 Nay Zaw UPDATE Start
	/**
	 * 中断再開確認画面再開したの処理を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/onResumeOk")
	public void onResumeOk() throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出荷検品ワークマージ(中断ワークから)
		insertLogic.insertWHtShippingFromInterrupt(wHtShipping);

		//出荷検品中断ワークテーブルをクリア
		clearLogic.clearWShippingInterrupt(wHtShipping);

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//出庫ステータスの更新(出庫ステータス = 40: 検品中)
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePickingStatus(wHtShipping, CDef.PickingStatus.$40);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			dto.setIsPackingNo(false);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			//梱包ステータスの更新(梱包ステータス = 40:検品中)
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			shippingLogic.updatePackingStatus(wHtShipping, CDef.PackingStatus.$40);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			dto.setIsPackingNo(true);

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為追加処理 2015.12.10 NayZaw End

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		// [SK2-084] 画面に合わせて、中断確認後の作業備考は非表示とする 2014.12.19 watanabe Start
		//出荷作業備考確認
//		if (!doConfirm()) {
//			return;
//		}
		onConfirmOk();
		// [SK2-084] 画面に合わせて、中断確認後の作業備考は非表示とする 2014.12.19 watanabe End
	}
	//【C-CWMS-0040】再開する時、「出荷検品中断」テーブルから取得よう修正 2015/09/17 Nay Zaw UPDATE End

	/**
	 * 中断再開確認画面取消したの処理を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/onResumeCancel")
	public void onResumeCancel() throws Exception {

		//出庫作業Noが出庫ヘッダにの存在チェック
		if (!ShippingNoPackingResource.checkExistPickingWorkNo(this, util, shippingLogic, clearLogic, commonLogic)) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出荷検品ワークマージ(出荷指示から)
		insertLogic.insertWHtShipping(wHtShipping);

		//出荷検品中断ワークテーブルをクリア
		clearLogic.clearWShippingInterrupt(wHtShipping);

		//出庫ステータスの更新(出庫ステータス = 40: 検品中)
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		shippingLogic.updatePickingStatus(wHtShipping, CDef.PickingStatus.$40);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		// [SK2-084] 画面に合わせて、中断確認後の作業備考は非表示とする 2014.12.19 watanabe Start
		//出荷作業備考確認
//		if (!doConfirm()) {
//			return;
//		}
		onConfirmOk();
		// [SK2-084] 画面に合わせて、中断確認後の作業備考は非表示とする 2014.12.19 watanabe End
	}

	/**
	 * <h2>出荷作業備考確認を行います。</h2>
	 * <pre>
	 * </pre>
	 * @return true:処理継続;false:処理終了
	 * @throws Exception
	 */
	private boolean doConfirm() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//出荷作業備考確認
		checkLogic.selectSpgWorkComment(wHtShipping);
		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
		if (wHtShipping.getSpgWorkCommentSet().size() > 0) {
			dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
			dto.setCommentDisplayedCount(0);
			ses.setAttribute("ShippingNoPackingDto", dto);
			//出荷作業備考確認画面を表示
			showConfirmDialogOrJanCdView();
			return false;
		}
		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//出荷作業備考確認画面確認したの処理を行います
		onConfirmOk();

		return true;
	}

	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
	/**
	 * <h2>出荷作業備考確認画面を表示するかJAN入力画面を表示するかを判断</h2>
	 * <pre>
	 * 出庫作業メッセージのリストサイズがメッセージ表示数と一致した場合、JAN入力画面を表示
	 * それ以外の場合、出荷作業備考確認画面を表示
	 * </pre>
	 * @throws Exception
	 */
	@GET
	@Path("/showConfirmDialogOrJanCdView")
	public void showConfirmDialogOrJanCdView () throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		if (wHtShipping.getSpgWorkCommentSet().size() == dto.getCommentDisplayedCount()) {
			// 出庫作業メッセージリストサイズがメッセージ表示数と同じ場合
			// JAN入力画面を表示
			onConfirmOk();
			return;
		}
		// setを作業メッセージをlistに詰め替え
		List<String> spgWorkCommentList = new ArrayList<>(wHtShipping.getSpgWorkCommentSet());
		// 作業メッセージ
		String strSpgWorkComment = spgWorkCommentList.get(dto.getCommentDisplayedCount());

		// リストカウントを+1する
		dto.setCommentDisplayedCount(dto.getCommentDisplayedCount() + 1);
		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//出荷作業備考確認画面を表示
		displayConfirmDialog(strSpgWorkComment);

	}
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End

	/**
	 * <h2>出荷作業備考確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param strSpgWorkComment 作業備考
	 * @throws Exception
	 */
	private void displayConfirmDialog(String strSpgWorkComment) throws Exception {

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// 画面初期設定
		initScreen("ShippingWorkCommentHT", "spg_work_comment");

		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
		// 継続ボタン設定
		setSendButton(ButtonInfo.builder().url("ShippingNoPackingWorkNo/showConfirmDialogOrJanCdView").itemCd("continue").type(BUTTON_URL_JUMP_NO_DATA).build());
		// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End

		// ダイアログ表示
		displayCommonDialogMessage(util.splitText(strSpgWorkComment, 20));

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 出荷作業備考確認画面確認したの処理を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/onConfirmOk")
	public void onConfirmOk() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingNoPackingDto dto = (ShippingNoPackingDto) ses.getAttribute("ShippingNoPackingDto");
		WHtShippingDto wHtShippingDto = dto.getwHtShippingDto();

		WHtShippingDtoMapper wHtShippingDtoMapper = new WHtShippingDtoMapper();
		WHtShipping wHtShipping = wHtShippingDtoMapper.mappingToEntity(wHtShippingDto);

		//個口の取得
		selectLogic.selectPiece(wHtShipping);

		//通信制御データ作成
		util.setHtComCtl(ses, "ShippingNoPacking", wHtShippingDto.getPickingWorkNo());

		dto.setwHtShippingDto(wHtShippingDtoMapper.mappingToDto(wHtShipping));
		ses.setAttribute("ShippingNoPackingDto", dto);

		//JAN入力画面を表示
		ShippingNoPackingJanCdResource.load(this, util);

	}

}
