package com.oneslogi.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TPackingBDto;
import com.oneslogi.base.dbflute.dtomapper.TPackingBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TPackingHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.wms.dto.shipping.PackingListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.shipping.PackingListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 梱包明細一覧のリソースクラス。
 */
@Path("/shipping/packingList")
public class PackingListResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 梱包明細データ取得異常
		 */
		// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.06.06 miyabe Start
		protected static final int PACKING_DATA_SELECT_FAILED = 2;
		// [#1893] [1.33 品質向上対応]  エラーメッセージがダイアログ表示されていた不具合修正 2017.06.06 miyabe End

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private PackingListSelectLogic selectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return pakingListDto 梱包明細一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public PackingListDto init() {
		// 画面用DTO作成
		PackingListDto pakingListDto = new PackingListDto();

		return pakingListDto;
	}

	/**
	 * <h2>梱包明細データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・梱包明細データ取得取り出し
	 * ・梱包明細細画面用DTOに設定
	 * </pre>
	 * @param  dto 梱包明細画面用DTO
	 * @return PakingListDto 梱包明細画面用DTO
	 */
	@GET
	@Path("/search")
	public PackingListDto search(PackingListDto dto) {

		PackingListDto result = new PackingListDto();

		// ===== Entity変換 =====
		TPackingHDtoMapper mapper = new TPackingHDtoMapper();
		TPackingH tPakingH = mapper.mappingToEntity(dto.data.search);

		// ===== 荷主Cd取得と荷主ID設定 =====
		MClient mClient = new MClient();
		mClient.setClientCd(tPakingH.getMClient().getClientCd());
		mClient= clientLogic.getUkEntity(mClient);
		if(mClient != null){
			tPakingH.setClientId(mClient.getClientId());
		}

		// ===== センタCd取得とセンタID設定 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tPakingH.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter != null){
			tPakingH.setCenterId(mCenter.getCenterId());
		}

		// ===== 梱包明細画面データ取得メソッドを呼出し =====
		// [#4512] ページングが動作しない問題を修正 2018.05.08 kawana Start
		PagingResultBean<TPackingB> selectEntity = selectLogic.select(tPakingH, dto.paging, errRetSts(StatusCode.PACKING_DATA_SELECT_FAILED));
		// [#4512] ページングが動作しない問題を修正 2018.05.08 kawana End

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== JSON通信のためにSimpleDTO変換 =====
		TPackingBDtoMapper mapper1 = new TPackingBDtoMapper();
		List<TPackingBDto> body = mapper1.mappingToDtoList(selectEntity);

		// ===== 画面用DTO ヘッダの作成 =====
		result.data.search = body.get(0).getTPackingH();
		result.data.list = body;
		// [#4512] ページングが動作しない問題を修正 2018.05.08 kawana Start
		result.paging = dto.paging;
		// [#4512] ページングが動作しない問題を修正 2018.05.08 kawana End

		return result;
	}

}
