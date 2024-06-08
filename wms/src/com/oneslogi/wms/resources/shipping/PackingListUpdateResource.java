package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.dto.customize.SqlPackingListUpdateDto;
import com.oneslogi.base.dbflute.dtomapper.TAllocInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlPackingListUpdateDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.PackingUpdateSelectDto;
import com.oneslogi.wms.dto.shipping.TagLabelPrintParamDto;
import com.oneslogi.wms.logic.common.BoxLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PackingInfoUpdateLogic;
import com.oneslogi.wms.logic.shipping.PackingUpdateSelectLogic;
import com.oneslogi.wms.logic.shipping.PieceShippingInspectLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic.TagLabelCls;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 梱包明細修正画面のリソースクラス
 */
@Path("/shipping/packingListUpdate")
public class PackingListUpdateResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 梱包明細修正データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int PACKING_LIST_CHECK_FAILED = 3;
		/**
		 * 梱包情報更新異常
		 */
		protected static final int PACKING_LIST_UPDATE_FAILED = 4;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 5;
		/**
		 * 荷札用帳票コード異常
		 */
		protected static final int TAG_REPORT_CD_FAILED = 6;
		/**
		 * 荷札発行異常
		 */
		protected static final int TAG_LABEL_PRINT_FAILED = 7;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		/**
		 * 排他チェック異常
		 */
		protected static final int CHECK_UPDATE_FAILED = 8;
		/**
		 * 届先情報更新異常
		 */
		protected static final int DELIVERY_INFO_UPDATE_FAILED = 9;
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
	}

	// ===== 使用テーブル =====

	@Inject
	TPickingHBhv tPickingHBHV;
	@Inject
	TPickingBBhv tPickingBBHV;

	// ===== 使用ロジック =====
	@Inject
	private PackingUpdateSelectLogic selectLogic;

	@Inject
	private PackingInfoUpdateLogic updateLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private BoxLogic boxLogic;

	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private TagLabelPrintLogic tagLabelPrintLogic;
	@Inject
	private PieceShippingInspectLogic pieceShippingInspectLogic;

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PackingUpdateSelectDto 梱包明細修正画面用DTO
	 */
	@GET
	@Path("/init")
	public PackingUpdateSelectDto init() {
		return new PackingUpdateSelectDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、梱包データを取得
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return PackingUpdateSelectDto 梱包明細修正画面用DTO
	 */
	@GET
	@Path("/search")
	public PackingUpdateSelectDto packingListUpdateDataSearch(PackingUpdateSelectDto packingUpdateSelectDto) throws IOException  {

		PackingUpdateSelectDto packingListUpdateDto = new PackingUpdateSelectDto();

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		PagingResultBean<SqlPackingListUpdate> page = selectLogic.select(header, packingUpdateSelectDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (page.size() == 0) {
			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
			// 梱包ヘッダのチェックのみ
			setupInputCheck(header, null, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
			// 結果判定
			if (getErrorManager().size() > 0) {
				// 処理中止
				return packingListUpdateDto;
			}
		}
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return packingListUpdateDto;
		}

		// Dto変換処理
		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdateDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		packingListUpdateDto.paging = packingUpdateSelectDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		packingListUpdateDto.data.list = list;

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		for (SqlPackingListUpdateDto selectDto : list) {
			// 検索時の梱包ヘッダIDと荷材No.を退避 (更新時に使用)
			packingListUpdateDto.data.boxNoMap.put(selectDto.getBoxNo(), selectDto.getPackingHId());
		}
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

		TAllocInstH tAllocInstH = new TAllocInstH();
		tAllocInstH.setAllocInstHId(page.get(0).getAllocInstHId());
		tAllocInstH.setDelivDt(page.get(0).getDelivDt());
		tAllocInstH.setDelivTz(page.get(0).getDelivTz());
		tAllocInstH.setDelivZipCd(page.get(0).getDelivZipCd());
		tAllocInstH.setDelivTelNo(page.get(0).getDelivTelNo());
		tAllocInstH.setDelivAddress1(page.get(0).getDelivAddress1());
		tAllocInstH.setDelivAddress2(page.get(0).getDelivAddress2());
		tAllocInstH.setDelivAddress3(page.get(0).getDelivAddress3());
		tAllocInstH.setDelivCustomerNm(page.get(0).getDelivCustomerNm());
		tAllocInstH.setVersionNo(page.get(0).getVersionNo());
		tAllocInstH.setIsChanged(false);

		TAllocInstHDtoMapper footerMapper = new TAllocInstHDtoMapper();
		packingListUpdateDto.data.footer = footerMapper.mappingToDto(tAllocInstH);
		packingListUpdateDto.data.footerOld = footerMapper.mappingToDto(tAllocInstH);
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei Start
		packingListUpdateDto.data.select.updDt = page.get(0).getUpdDt();
		packingListUpdateDto.data.select.count = page.get(0).getCount();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei

		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana Start
		MClientCenter mc = new MClientCenter();
		mc.setCenterId(mCenter.getCenterId());
		mc.setClientId(mClient.getClientId());
		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mc);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		CDef.AfterTagOutFlg afterTagOutFlg = mp.getAfterTagOutFlgAsAfterTagOutFlg();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
		if (afterTagOutFlg != null) {
			switch (afterTagOutFlg) {
			// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana Start
			case $1: // バラ出荷検品後のみ出力
			case $3: // バラ・ケース出荷検品後に出力
				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana End
				packingListUpdateDto.data.tagLabelPrintFlg = 1;
				break;
			default:
				packingListUpdateDto.data.tagLabelPrintFlg = 0;
				break;
			}
		} else {
			packingListUpdateDto.data.tagLabelPrintFlg = 0;
		}
		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana End

		return packingListUpdateDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(PackingUpdateSelectDto packingUpdateSelectDto) {
		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdate> list = mapper.mappingToEntityList(packingUpdateSelectDto.data.list);
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		setupInputCheck(header, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		// 確認メッセージを登録
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
		return null;
	}

	/**
	 * <h2>入力チェック組み立て。</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・出荷状態チェック
	 * ・画面で入力されたCDを元にIDを取得し、データに設定する
	 * ・梱包荷材入力チェック
	 * ・梱包荷材存在チェック
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 出荷状態チェック異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param header 出庫ヘッダ用DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void setupInputCheck(TPickingH header, List<SqlPackingListUpdate> bodyList, ErrorStatus errSts) {

		TPickingHCB cb = tPickingHBHV.newMyConditionBean();
		cb.query().setClientId_Equal(header.getClientId());
		cb.query().setCenterId_Equal(header.getCenterId());
		cb.query().setPickingWorkNo_Equal(header.getPickingWorkNo());
		List<TPickingH> tPickingH = tPickingHBHV.selectList(cb);
		if (tPickingH.size() == 0 ) {

			// [#2286] エラーメッセージを排他エラーから未存在エラーに修正 2017.08.28 miyabe Start
			// [#7412][v3.1][OSS] 排他エラー時のメッセージを変更 2020/05/13 KAI MOD START
			//this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.PACKING_LIST_UPDATE_DATA_ALREADY_UPDATED_ERROR);
			// [#7412][v3.1][OSS] 排他エラー時のメッセージを変更 2020/05/13 KAI MOD END
			// [#2286] エラーメッセージを排他エラーから未存在エラーに修正 2017.08.28 miyabe End
			return;
		} else {
			shipStatusCheckLogic.packingUpdate(null, null, tPickingH, null, errSts);
			if (getErrorManager().size() > 0) {
				return;
			}
		}

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		// 現在のステータスを設定
		header.setPickingStatus(tPickingH.get(0).getPickingStatus());
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

		TPickingBCB cb2 = tPickingBBHV.newMyConditionBean();
		cb2.setupSelect_TPickingH();
		cb2.query().queryTPickingH().setClientId_Equal(header.getClientId());
		cb2.query().queryTPickingH().setCenterId_Equal(header.getCenterId());
		cb2.query().queryTPickingH().setPickingWorkNo_Equal(header.getPickingWorkNo());
		List<TPickingB> tPickingB = tPickingBBHV.selectList(cb2);
		if (tPickingB.size() == 0 ) {
			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
			this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
			return;
		}
		// 20141013 SJA_ZHU 追加 [ON推-CT3-209対応] End

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start

		// ===== 梱包明細のチェック =====

		if (bodyList == null) {
			return;
		}

		for (SqlPackingListUpdate body : bodyList) {

			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.04.20 kawana Start

			if (WCC.isZero(body.getPackingNumSum())) {
				// 梱包数=0
				continue;
			}

			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.04.20 kawana End

			// ===== 荷材マスタ存在チェック =====

			if (body.getBoxCd() == null) {
				// 荷材未入力エラー
				this.getErrorManager().add(errSts, WmsMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR);
			}

			MBox boxC = new MBox();
			boxC.setBoxCd(body.getBoxCd());
			// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
			boxC.setCenterId(header.getCenterId());
			// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
			// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
			MBox box = boxLogic.getUkEntity(boxC, errSts);
			if (0 < getErrorManager().size()) {
				// 荷材マスタ未存在
				return;
			}
			body.setBoxId(box.getBoxId());
			// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		}
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

	}

	/**
	 * <h2>梱包情報更新。</h2>
	 * <pre>
	 * 登録データの入力チェック組み立てを行う
	 * エラーがない場合は、データベースに梱包明細修正データを登録し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto packingInfoUpdate(PackingUpdateSelectDto packingUpdateSelectDto) {
		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdate> list = mapper.mappingToEntityList(packingUpdateSelectDto.data.list);

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		setupInputCheck(header, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start

		for (SqlPackingListUpdate body : list){

			String boxNo = body.getBoxNo();
			// 荷材No.にあった梱包ヘッダIDを設定 (新規の場合はnull)
			body.setPackingHId(packingUpdateSelectDto.data.boxNoMap.get(boxNo));
		}

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

		TAllocInstHDtoMapper footerMapper = new TAllocInstHDtoMapper();
		TAllocInstH tAllocInstH = footerMapper.mappingToEntity(packingUpdateSelectDto.data.footer);

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示(入力チェックの位置を上に移動) 2016.06.21 kawana

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] Start

		TShippingInstH tShipInstHeader = new TShippingInstH();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei Start
		tShipInstHeader.setUpdDt(packingUpdateSelectDto.data.select.updDt);
		int rowCount = packingUpdateSelectDto.data.select.count.intValue();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] End

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana Start

		// 出荷データの排他チェック
		updateLogic.checkShippingInstHUpdate(header, tShipInstHeader, rowCount, errRetSts(StatusCode.CHECK_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 梱包情報の更新
		PackingInfoUpdateLogic.UpdateInfo updateInfo = updateLogic.update(header, tAllocInstH, list, errRetSts(StatusCode.PACKING_LIST_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 届先情報の更新
		if (tAllocInstH.isIsChanged()) {

			updateLogic.updateDeliveryInfo(header, tAllocInstH, errRetSts(StatusCode.DELIVERY_INFO_UPDATE_FAILED));
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}
		}

		// 完了メッセージの登録
		addUpdateSuccessMessage(updateInfo, tAllocInstH.isIsChanged());

		return null;
	}

	/**
	 * <h2>梱包情報更新の完了メッセージ登録。</h2>
	 */
	private void addUpdateSuccessMessage(PackingInfoUpdateLogic.UpdateInfo updateInfo, boolean changedDelivInfo) {

		if (changedDelivInfo) {
			// 届先の変更

			getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
		} else {
			if (updateInfo.modifiedPackingHCount) {
				// 梱包個口数に変更あり

				if (updateInfo.doClearTagOut) {
					// 荷札出力のクリアあり

					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
				} else {
					// 荷札出力のクリアなし

					if (updateInfo.doAddPacking) {
						// 梱包の追加あり

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_ADD_PACKING_INFORMATION);
					} else {
						// 梱包の追加なし

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_INFORMATION);
					}
				}
			} else {
				// 梱包個口数に変更なし

				if (updateInfo.doClearTagOut) {
					// 荷札出力のクリアあり (梱包の削除 == 梱包の追加 かつ 荷札出力単位が出庫作業No.)

					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_REPRINT_TAG_INFORMATION);
				} else {
					// 荷札出力のクリアなし

					if (updateInfo.doAddPacking) {
						// 荷札出力のクリアあり (梱包の削除 == 梱包の追加 かつ 荷札出力単位が出荷梱包No.)

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_ADD_PACKING_INFORMATION);
					} else {
						// 梱包の追加なし

						getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
					}
				}

			}
		}
	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana End

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start

	/**
	 * <h2>荷札用の帳票IDの取得・設定。</h2>
	 * <pre>
	 * 荷札発行ロジックを使用し、荷札発行の帳票CDを取得。
	 * 帳票CDを帳票IDに変換し戻り値に設定する。
	 * </pre>
	 * @param tagLabelPrintParamDto 荷札発行用パラメータDTO
	 * @return 荷札用の帳票IDを設定した荷札発行用パラメータDTO
	 */
	@POST
	@Path("/getTagLabelReportIdList")
	public TagLabelPrintParamDto getTagLabelReportIdList(final TagLabelPrintParamDto tagLabelPrintParamDto) {

		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final long clientId = tagLabelPrintParamDto.data.clientId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;
		final TagLabelCls tagLabelCls = TagLabelCls.codeOf(tagLabelPrintParamDto.data.tagLabelCls);
		final boolean isShippingPackingNo = tagLabelPrintParamDto.data.isShippingPackingNo;

		// コントロールNo.採番
		final long controlNo = numberingCenterLogic.getControlNo();

		List<String> reportCdList = null;
		if (isShippingPackingNo) {
			// 出荷梱包No.単位の検品

			TPackingH packingH = new TPackingH();
			packingH.setCenterId(centerId);
			packingH.setClientId(clientId);
			packingH.setShippingPackingNo(targetNo);

			TPackingR packingR = new TPackingR();
			packingR.setControlNo(controlNo);

			// ===== コントロールNo.設定 =====
			pieceShippingInspectLogic.tPackingRUpdate(packingR, packingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 帳票CDリストを取得 =====
			reportCdList = tagLabelPrintLogic.getReportCd(packingR, tagLabelCls, errRetSts(StatusCode.TAG_REPORT_CD_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== コントロールNo.クリア =====
			pieceShippingInspectLogic.clearControlNo(packingR);

		} else {
			// 出庫作業No.の検品

			TPickingH pickingH = new TPickingH();
			pickingH.setCenterId(centerId);
			pickingH.setClientId(clientId);
			pickingH.setPickingWorkNo(targetNo);

			TPickingR pickingR = new TPickingR();
			pickingR.setControlNo(controlNo);

			// ===== コントロールNo.設定 =====
			pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 帳票CDリストを取得 =====
			reportCdList = tagLabelPrintLogic.getReportCd(pickingR, tagLabelCls, errRetSts(StatusCode.TAG_REPORT_CD_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== コントロールNo.クリア =====
			pieceShippingInspectLogic.clearControlNo(pickingR);

		}

		for (String reportCd : reportCdList) {
			long reportId = reportLogic.getReportId(reportCd);
			tagLabelPrintParamDto.data.listReportId.add(reportId);
		}

		return tagLabelPrintParamDto;
	}

	/**
	 * <h2>荷札発行。</h2>
	 * <pre>
	 * 荷札発行ロジックを使用し、荷札を発行。
	 * </pre>
	 * @param tagLabelPrintParamDto 荷札発行用パラメータDTO
	 * @return 発行処理を通した荷札発行用パラメータDTO
	 */
	@POST
	@Path("/printTagLabel")
	public TagLabelPrintParamDto printTagLabel(final TagLabelPrintParamDto tagLabelPrintParamDto) {

		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final long clientId = tagLabelPrintParamDto.data.clientId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;
		final TagLabelCls tagLabelCls = TagLabelCls.codeOf(tagLabelPrintParamDto.data.tagLabelCls);
		final boolean isShippingPackingNo = tagLabelPrintParamDto.data.isShippingPackingNo;

		// コントロールNo.採番
		final long controlNo = numberingCenterLogic.getControlNo();

		if (isShippingPackingNo) {
			// 出荷梱包No.単位の検品

			TPackingH packingH = new TPackingH();
			packingH.setCenterId(centerId);
			packingH.setClientId(clientId);
			packingH.setShippingPackingNo(targetNo);

			TPackingR packingR = new TPackingR();
			packingR.setControlNo(controlNo);

			// ===== コントロールNo.設定 =====
			pieceShippingInspectLogic.tPackingRUpdate(packingR, packingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 印刷実行 =====
			tagLabelPrintLogic.print(packingR, tagLabelCls, tagLabelPrintParamDto, errRetSts(StatusCode.TAG_LABEL_PRINT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== コントロールNo.クリア =====
			pieceShippingInspectLogic.clearControlNo(packingR);

		} else {
			// 出庫作業No.の検品

			TPickingH pickingH = new TPickingH();
			pickingH.setCenterId(centerId);
			pickingH.setClientId(clientId);
			pickingH.setPickingWorkNo(targetNo);

			TPickingR pickingR = new TPickingR();
			pickingR.setControlNo(controlNo);

			// ===== コントロールNo.設定 =====
			pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== 印刷実行 =====
			tagLabelPrintLogic.print(pickingR, tagLabelCls, tagLabelPrintParamDto, errRetSts(StatusCode.TAG_LABEL_PRINT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== コントロールNo.クリア =====
			pieceShippingInspectLogic.clearControlNo(pickingR);

		}

		return tagLabelPrintParamDto;
	}
	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
}
