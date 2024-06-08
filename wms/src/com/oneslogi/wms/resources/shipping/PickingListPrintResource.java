package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.customize.SqlPickingListPrintDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlPickingListPrintDtoMapper;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint;
import com.oneslogi.base.dto.ClassDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.PickingListPrintDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintParamDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintLogic.PickingListCls;
import com.oneslogi.wms.logic.shipping.PickingListPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic.TagLabelCls;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ピッキングリスト発行画面のリソースクラス。
 */
@Path("/shipping/pickingListPrint")
public class PickingListPrintResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	private static String REPORT_CD_SLIP = "CommonInvoiceList";

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
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 6;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int PICKING_DATA_SELECT_FAILED = 7;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 8;
		// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana Start
		/**
		 * ピッキングリスト発行異常
		 */
		protected static final int PICKING_LIST_PRINT_FAILED = 10;
		// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana End
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  Start
		/**
		 * 送り状・荷札発行データ取得異常
		 */
		protected static final int TAG_PICKING_DATA_SELECT_FAILED = 12;
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  End
		// [Ver3.1][#5127][#5456] 発行解除処理を追加 2018.10.18 matsumoto/kawana Start
		/**
		 * 入力データ不正
		 */
		protected static final int INPUT_DATA_FAILED = 13;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 14;
		/**
		 * 発行解除異常
		 */
		protected static final int CLEAR_ISSUE_ERROR = 15;
		// [Ver3.1][#5127][#5456] 発行解除処理を追加 2018.10.18 matsumoto/kawana End
	}

	// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana Start

	// ===== 使用ロジッククラス =====

	@Inject
	private PickingListPrintSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PickingListPrintLogic pickingListPrintLogic;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  Start
	@Inject
	private TagLabelPrintLogic tagLabelPrintLogic;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/04  End
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
	@Inject
	private ParamLogic paramLogic;
	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
	@Inject
	private CenterClassLogic centerClassLogic;
	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

	// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana End

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

	// ===== 列挙型 =====

	/** 発行区分 */
	private enum PicCls {
		/** 1次ピッキング */
		PICKING_1ST("1"),
		/** 2次ピッキング */
		PICKING_2ND("2"),
		/** ケースピッキング */
		PICKING_CASE("3"),
		/** 荷札・送り状 */
		TAG_OR_SLIP("4");

		private static final Map<String, PicCls> _codeValueMap = new HashMap<String, PicCls>();
		static {
			for (PicCls value : values()) {
				_codeValueMap.put(value.code().toLowerCase(), value);
			}
		}
		private String _code;

		private PicCls(String code) {
			_code = code;
		}

		public String code() {
			return _code;
		}

		public static PicCls codeOf(String code) {
			if (code == null) {
				return null;
			}
			return _codeValueMap.get(code.toLowerCase());
		}

		@Override
		public String toString() {
			return code();
		}
	}

	/** 1次ピッキング区分 */
	private enum PL1Cls {
		/** オーダーピッキング */
		ORDER_PIC("0"),
		/** トータルピッキング */
		TOTAL_PIC("1"),
		/** ケースピッキング */
		CASE_PIC("4"),
		/** マルチピッキング */
		MULTI_PIC("5"),
		/** 単行ピッキング */
		SINGLE_ROW_PIC("6");

		private static final Map<String, PL1Cls> _codeValueMap = new HashMap<String, PL1Cls>();
		static {
			for (PL1Cls value : values()) {
				_codeValueMap.put(value.code().toLowerCase(), value);
			}
		}
		private String _code;

		private PL1Cls(String code) {
			_code = code;
		}

		public String code() {
			return _code;
		}

		public static PL1Cls codeOf(String code) {
			if (code == null) {
				return null;
			}
			return _codeValueMap.get(code.toLowerCase());
		}

		@Override
		public String toString() {
			return code();
		}
	}

	/** 2次ピッキング区分 */
	private enum PL2Cls {
		/** 摘み取り */
		PICKING("2"),
		/** 種蒔き */
		SEEDING("3");

		private static final Map<String, PL2Cls> _codeValueMap = new HashMap<String, PL2Cls>();
		static {
			for (PL2Cls value : values()) {
				_codeValueMap.put(value.code().toLowerCase(), value);
			}
		}
		private String _code;

		private PL2Cls(String code) {
			_code = code;
		}

		public String code() {
			return _code;
		}

		public static PL2Cls codeOf(String code) {
			if (code == null) {
				return null;
			}
			return _codeValueMap.get(code.toLowerCase());
		}

		@Override
		public String toString() {
			return code();
		}
	}

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PickingListPrintDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/initNormal")
	public PickingListPrintDto initNormal() {

		// 画面用DTO作成
		PickingListPrintDto pickingListPrintDto = new PickingListPrintDto();

		return pickingListPrintDto;
	}

	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

	/**
	 * <h2>1次ピッキングリスト区分のコンボボックス表示内容を取得。</h2>
	 * @return ClassDto 1次ピッキングリスト区分のコンボボックス内容
	 */
	@GET
	@Path("/picClsKeyValueList")
	public ClassDto picClsKeyValueList(@QueryParam("classCd") final String classCd, @QueryParam("centerId") final long centerId, @QueryParam("clientId") final long clientId) {

		MClientCenter mcc = new MClientCenter();
		mcc.setCenterId(centerId);
		mcc.setClientId(clientId);
		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);

		List<BClassDtl> classDtlList = centerClassLogic.getClassListByCd(classCd);

		ClassDto classDto = new ClassDto();
		for (BClassDtl classDtl : classDtlList) {

			CDef.PicCls cls = CDef.PicCls.codeOf(classDtl.getClassDtlCd());

			if (cls == CDef.PicCls.$3) {
				// ケースピック

				if (mParam.isCasePicFlg$0()) {
					// ケースピックなし
					continue;
				}
			}

			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = classDtl.getClassDtlCd();
			data.classNm = classDtl.getVDict().getDictNm();
			data.defaultFlg = classDtl.getDefaultFlg();
			classDto.data.add(data);
		}

		return classDto;
	}

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

	/**
	 * <h2>1次ピッキングリスト区分のコンボボックス表示内容を取得。</h2>
	 * @return ClassDto 1次ピッキングリスト区分のコンボボックス内容
	 */
	@GET
	@Path("/picListCls1KeyValueList")
	public ClassDto picListCls1KeyValueList(@QueryParam("classCd") final String classCd, @QueryParam("centerId") final long centerId, @QueryParam("clientId") final long clientId) {

		MClientCenter mcc = new MClientCenter();
		mcc.setCenterId(centerId);
		mcc.setClientId(clientId);

		MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);
		//荷主センタ変更対応 2017.03.13 sja Start
		List<MCenterClassDtl> classDtlList = centerClassLogic.getCenterClassListByCd(classCd, centerId);
		//荷主センタ変更対応 2017.03.13 sja End
		ClassDto classDto = new ClassDto();
		for (MCenterClassDtl classDtl : classDtlList) {

			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana Start

			CDef.CenterPicListCls1 cls = CDef.CenterPicListCls1.codeOf(classDtl.getClassDtlCd());

			switch (cls) {
			case $0:
				break;
			case $1:
				if (mParam.isTotalPicFlg$0()) {
					// トータルピック無
					continue;
				}
				break;
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
			case $4:
				// ケースピック
				continue;
				// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			case $5:
				if (mParam.isMultiPicCls$0()) {
					// マルチピック無
					continue;
				}
				break;
			case $6:
				if (mParam.isSglRowPicFlg$0()) {
					// 単行ピック無
					continue;
				}
				break;
			}

			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana End

			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = classDtl.getClassDtlCd();
			data.classNm = classDtl.getVDict().getDictNm();
			data.defaultFlg = classDtl.getDefaultFlg();
			classDto.data.add(data);
		}

		return classDto;
	}

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

	/**
	 * <h2>1次ピッキングリスト区分のコンボボックス表示内容を取得(ケースピック)。</h2>
	 * @return ClassDto 1次ピッキングリスト区分のコンボボックス内容
	 */
	@GET
	@Path("/picListCls1CaseKeyValueList")
	public ClassDto picListCls1CaseKeyValueList(@QueryParam("classCd") final String classCd, @QueryParam("centerId") final long centerId, @QueryParam("clientId") final long clientId) {

		List<MCenterClassDtl> classDtlList = centerClassLogic.getCenterClassListByCd(classCd, centerId);

		ClassDto classDto = new ClassDto();
		for (MCenterClassDtl classDtl : classDtlList) {

			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana Start

			CDef.CenterPicListCls1 cls = CDef.CenterPicListCls1.codeOf(classDtl.getClassDtlCd());

			if (cls != CDef.CenterPicListCls1.$4) {
				// ケースピッキングリスト以外
				continue;
			}

			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = classDtl.getClassDtlCd();
			data.classNm = classDtl.getVDict().getDictNm();
			data.defaultFlg = classDtl.getDefaultFlg();
			classDto.data.add(data);
		}

		return classDto;
	}

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・データベースにピッキングリスト発行データを取得する
	 * </pre>
	 * @param pickingListPrintDto ピッキングリスト発行画面用DTO
	 * @return PickingListPrintDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/search")
	public PickingListPrintDto search(PickingListPrintDto pickingListPrintDto) {

		PickingListPrintDto resultPickingListPrintDto = new PickingListPrintDto();

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(pickingListPrintDto.data.head);
		// 引当指示ヘッダ
		TAllocInstH tAllocInstH = tPickingH.getTAllocInstH();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		tPickingH.setCenterId(centerId);

		// 荷主IDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		tPickingH.setClientId(clientId);

		// 出荷指示ヘッダ
		TShippingInstH tShippingInstH = new TShippingInstH();
		tShippingInstH.setPickingBatchNo(tPickingH.getPickingBatchNo());
		tShippingInstH.setEmergencyFlg(tPickingH.getEmergencyFlg());
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		//欠品有無のみフラグ
		tShippingInstH.setNoStockOutFlg(tPickingH.getNoStockOutFlg());
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End

		// ピッキングリスト発行データ取得
		List<SqlPickingListPrint> selectEntity = selectLogic.select(tAllocInstH, tPickingH, tShippingInstH, pickingListPrintDto.paging,
				errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		SqlPickingListPrintDtoMapper mapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrintDto> list = mapper.mappingToDtoList(selectEntity);

		//検索結果詰め替え処理
		resultPickingListPrintDto.paging = pickingListPrintDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		resultPickingListPrintDto.data.list = list;

		return resultPickingListPrintDto;
	}

	// [Ver3.1][#5127][#5456][#5481] 発行解除処理を追加 2018.10.23 matsumoto/kawana Start

	/**
	 * <h2>チェック処理(発行解除時)</h2>
	 * <pre>
	 * 出荷状態チェック及び欠品フラグチェックを行う。
	 *
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkClearIssue")
	public StatusDto checkClearIssue(PickingListPrintDto pickingListPrintDto) {

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH head = mapper.mappingToEntity(pickingListPrintDto.data.head);

		// 明細部Entity変換
		SqlPickingListPrintDtoMapper bodyMapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> bodyList = bodyMapper.mappingToEntityList(pickingListPrintDto.data.list);

		PicCls pickingCls = PicCls.codeOf(head.getPicCls());

		// ピッキンググループNo.がnullの場合エラーを設定する
		for (SqlPickingListPrint body : bodyList) {

			if (pickingCls == PicCls.PICKING_CASE) {
				// ケースピッキング

				if ("0".equals(body.getCaseOutFlg())) {
					// ケースピッキングリスト「未出力」

					this.getErrorManager().add(new ErrorStatus(StatusCode.INPUT_DATA_FAILED), WmsMessageConst.CLEAR_ISSUE_EXCEPT_NOT_CASE_ISSUE_ERROR);
					return null;
				}
			} else {
				// 1次ピッキング・2次ピッキング

				if ("0".equals(body.getPl1OutFlg()) && "0".equals(body.getPl2OutFlg())) {
					// 1次ピッキングリスト・2次ピッキングリスト「未出力」

					this.getErrorManager().add(new ErrorStatus(StatusCode.INPUT_DATA_FAILED), WmsMessageConst.CLEAR_ISSUE_EXCEPT_NOT_ISSUE_ERROR);
					return null;
				}
			}
		}

		// ===== DB変更チェック =====

		// 対象のカウントが変わっていないことで変更チェックを行う

		long controlNo = numberingCenterLogic.getControlNo();

		int updateCount = clearIssueUpdateControlNo(head, bodyList, controlNo, pickingCls, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		if (updateCount != bodyList.size()) {
			// 出荷ステータスなどが変更された

			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// ===== 確認メッセージの設定 =====

		if (pickingCls == PicCls.PICKING_CASE) {
			// ケースピッキング

			if (selectLogic.existsWarnShippingStatusForClearIssueCase(controlNo)) {
				// 出庫指示済以外のステータスあり

				getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CLEAR_ISSUE_EXCECUTE_CASE_STATUS_CONFIRM);
			} else {

				getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CLEAR_ISSUE_EXCECUTE_CASE_CONFIRM);
			}
		} else {

			if (selectLogic.existsWarnShippingStatusForClearIssue(controlNo)) {
				// 出庫指示済以外のステータスあり

				getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CLEAR_ISSUE_EXCECUTE_STATUS_CONFIRM);
			} else {

				getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CLEAR_ISSUE_EXCECUTE_CONFIRM);
			}
		}

		// ===== コントロールNo.のクリア =====

		selectLogic.clearControlNo(controlNo);

		return null;
	}

	/**
	 * <h2>発行解除処理</h2>
	 * <pre>
	 * ピッキンググループNo.がnullでない場合、ピッキンググループNo.をnullに更新する。
	 * </pre>
	 * @param pickingListPrintDto ピッキングリスト発行画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/clearIssue")
	public StatusDto clearIssue(PickingListPrintDto pickingListPrintDto) {

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH head = mapper.mappingToEntity(pickingListPrintDto.data.head);

		// 明細部Entity変換
		SqlPickingListPrintDtoMapper bodyMapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> bodyList = bodyMapper.mappingToEntityList(pickingListPrintDto.data.list);

		PicCls pickingCls = PicCls.codeOf(head.getPicCls());

		// ===== DB変更チェック =====

		// 対象のカウントが変わっていないことで変更チェックを行う

		long controlNo = numberingCenterLogic.getControlNo();

		clearIssueUpdateControlNo(head, bodyList, controlNo, pickingCls, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 発行解除 =====

		// 発行解除処理を実行
		if (pickingCls == PicCls.PICKING_CASE) {

			MClientCenter mcc = new MClientCenter();
			mcc.setClientId(bodyList.get(0).getClientId());
			mcc.setCenterId(bodyList.get(0).getCenterId());
			MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);

			selectLogic.clearIssueCase(controlNo, mParam, errRetSts(StatusCode.CLEAR_ISSUE_ERROR));
		} else {

			selectLogic.clearIssue(controlNo);
		}

		// ===== コントロールNo.のクリア =====

		selectLogic.clearControlNo(controlNo);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * 発行解除のコントロールNo.設定処理
	 */
	private int clearIssueUpdateControlNo(TPickingH head, List<SqlPickingListPrint> bodyList, long controlNo, PicCls picCls, ErrorStatus errSts) {

		// センタIDの取得
		long centerId = bodyList.get(0).getCenterId();
		head.setCenterId(centerId);
		long clientId = bodyList.get(0).getClientId();
		head.setClientId(clientId);

		// 「発行済」が対象
		head.setListOutKbn("1");

		TPackingH packingH = new TPackingH();
		if (picCls == PicCls.PICKING_CASE) {
			// ケースピッキングリストの場合

			packingH.setMixedFlg_$0();
		} else {

			packingH.setMixedFlg_$1();
		}

		List<TPickingH> targetList = new ArrayList<TPickingH>();
		for (SqlPickingListPrint body : bodyList) {

			// 出庫作業No.で検索
			TPickingH pickingH = new TPickingH();
			pickingH.setCenterId(centerId);
			pickingH.setClientId(clientId);
			pickingH.setPickingWorkNo(body.getPickingWorkNo());
			targetList.add(pickingH);
		}

		TPickingR controlNoPickingR = new TPickingR();

		// 出庫帳票(検索用)
		controlNoPickingR.setControlNo(controlNo);

		// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
		int updateCount = selectLogic.updateControlNo(head, packingH, targetList, controlNoPickingR, errSts);
		if (0 < getErrorManager().size()) {
			return -1;
		}

		return updateCount;
	}

	// [Ver3.1][#5127][#5456][#5481] 発行解除処理を追加 2018.10.23 matsumoto/kawana End

	/**
	 * <h2>ピッキングリスト発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する。
	 * 帳票を発行する。
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 *
	 * ・オーダーピッキングリスト出力フラグ
	 * ・トータルピッキングリスト出力フラグ
	 * ・摘み取りピッキングリスト出力フラグ
	 * ・種蒔きピッキングリスト出力フラグ
	 * </pre>
	 * @param pickingListPrintDto ピッキングリスト発行画面用DTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */

	@GET
	@Path("/print")
	public PickingListPrintParamDto print(final PickingListPrintParamDto pickingListPrintDto) throws Exception {

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH head = mapper.mappingToEntity(pickingListPrintDto.data.head);

		// 明細部Entity変換
		SqlPickingListPrintDtoMapper bodyMapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> bodyList = bodyMapper.mappingToEntityList(pickingListPrintDto.data.list);

		// フッタ部Entity変換
		TPickingH foot = mapper.mappingToEntity(pickingListPrintDto.data.footer);

		//コントロールNo更新
		TPickingR tPickingRUpdate = new TPickingR(); //出庫帳票(更新用)
		TPickingH tPickingH = new TPickingH(); //出庫ヘッダ
		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更(tShippingInstHList削除) 2018.08.23 kawana Delete
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>(); //出庫ヘッダリスト
		TPickingR tPickingRSearch = new TPickingR(); //出庫帳票(検索用)
        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
		TPackingH tPackingH = new TPackingH(); //梱包ヘッダ
        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

		PicCls pickingCls = PicCls.codeOf(head.getPicCls());
		PL1Cls pickingList1Cls = PL1Cls.codeOf(foot.getPicListCls1());
		PL2Cls pickingList2Cls = PL2Cls.codeOf(foot.getPicListCls2());

		// エンティティ編集
		// 出庫帳票(更新用)
		tPickingRUpdate.setControlNo(controlNo);

        // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja Start
		// 梱包ヘッダ
		// ピッキングリスト発行画面ヘッダ情報.リスト発行区分が一次ピッキングの場合
		tPackingH.setMixedFlg_$1();

		if (pickingCls == PicCls.PICKING_CASE) {
			// ケースピッキングリストの場合
			if (pickingList1Cls == PL1Cls.CASE_PIC) {
				tPackingH.setMixedFlg_$0();
			}
		}

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
		if (pickingCls == PicCls.TAG_OR_SLIP) {
			if (CU.equals(foot.getPicListCls3(), "3") || CU.equals(foot.getPicListCls3(), "7") ) {
				// ケース荷札の場合
				tPackingH.setMixedFlg_$0();
			} else if (CU.equals(foot.getPicListCls3(), "1") || CU.equals(foot.getPicListCls3(), "4") || CU.equals(foot.getPicListCls3(), "5") ) {
				// バラ＋ケース荷札の場合
				tPackingH.setMixedFlg(null);
			}
		}
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
       // [エンハンス PH2.0] 梱包ヘッダの混載フラグが混載のデータを対象とする 2015.11.23 sja End

		// 出庫ヘッダ
		tPickingH = head;

		// センタIDの取得
		//荷主センタ変更対応 2017.03.06 sja Start
		long centerId = bodyList.get(0).getCenterId();
		tPickingH.setCenterId(centerId);
		//荷主センタ変更対応 2017.03.06 sja End

		// 荷主IDの取得
		//荷主センタ変更対応 2017.03.06 sja Start
		long clientId = bodyList.get(0).getClientId();
		tPickingH.setClientId(clientId);
		//荷主センタ変更対応 2017.03.06 sja End

		if (pickingCls == PicCls.PICKING_1ST) {
			// 単行ピッキングリストの場合
			if (pickingList1Cls == PL1Cls.SINGLE_ROW_PIC) {
				tPickingH.setSglRowPicFlg_$1();
			} else {
				tPickingH.setSglRowPicFlg_$0();
			}
		}

		// [新ｿﾘ-084] 倉庫マスタの設定を削除 2014.11.21 fengc

		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更 2018.08.23 kawana Start

		// 出荷指示ヘッダリストと出庫ヘッダリスト

		Set<String> endPickingGroupNoSet = new HashSet<String>();

		// ピッキンググループNo.単位で発行するか
		boolean doOutputUnitPickingGroupNo = false;
		if (pickingCls == PicCls.PICKING_1ST) {
			// 1次ピッキング

			if (pickingList1Cls == PL1Cls.TOTAL_PIC ||
				pickingList1Cls == PL1Cls.SINGLE_ROW_PIC) {
				// トータルピッキングリスト または 単行ピッキングリスト

				// ピッキンググループ単位で発行する
				doOutputUnitPickingGroupNo = true;
			}
		}

		for (SqlPickingListPrint body : bodyList) {

			if (doOutputUnitPickingGroupNo) {
				// ピッキンググループ単位で発行

				String pickingGroupNo = body.getPickingGroupNo();
				if (!CU.isNullOrEmpty(pickingGroupNo)) {
					// ピッキンググループNo.設定あり

					if (endPickingGroupNoSet.contains(pickingGroupNo)) {
						// 既に条件に追加済
						continue;
					}

					// 検索条件にピッキンググループNo.を設定
					TPickingH pickingH = new TPickingH();
					pickingH.setCenterId(centerId);
					pickingH.setClientId(clientId);
					pickingH.setPickingGroupNo(pickingGroupNo);
					tPickingHList.add(pickingH);

					endPickingGroupNoSet.add(pickingGroupNo);
					continue;
				}
			}

			// 出庫作業No.で検索
			TPickingH pickingH = new TPickingH();
			pickingH.setCenterId(centerId);
			pickingH.setClientId(clientId);
			pickingH.setPickingWorkNo(body.getPickingWorkNo()); //出庫作業No.
			tPickingHList.add(pickingH);
		}

		// 出庫帳票(検索用)
		tPickingRSearch.setControlNo(controlNo);

		// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
		selectLogic.updateControlNo(tPickingH, tPackingH, tPickingHList, tPickingRUpdate, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		if( 0 < getErrorManager().size() ) {
			return null;
		}
		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更 2018.08.23 kawana End

		// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana Start

		if (pickingCls != PicCls.TAG_OR_SLIP) {
			// 送り状・荷札の発行以外 (ピッキングリストの発行)

			PickingListPrintLogic.PickingListCls printCls = null;

			if (pickingCls == PicCls.PICKING_1ST) {
				// リスト発行区分が一次ピッキングの場合

				switch (pickingList1Cls) {
				case ORDER_PIC:
					printCls = PickingListCls.ORDER;
					break;
				case TOTAL_PIC:
					printCls = PickingListCls.TOTAL;
					break;
				case MULTI_PIC:
					printCls = PickingListCls.MULTI;
					break;
				case SINGLE_ROW_PIC:
					printCls = PickingListCls.SINGLE_ROW;
					break;
				case CASE_PIC:
				default:
					getErrorManager().throwException(new IllegalArgumentException("PicListCls1 is illegal"));
					return null;
				}
			} else if (pickingCls == PicCls.PICKING_2ND) {
				// リスト発行区分が二次ピッキングの場合

				switch (pickingList2Cls) {
				case PICKING:
					printCls = PickingListCls.PICKING;
					break;
				case SEEDING:
					printCls = PickingListCls.SEEDING;
					break;
				default:
					getErrorManager().throwException(new IllegalArgumentException("PicListCls1 is illegal"));
					return null;
				}
				// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
			} else if (pickingCls == PicCls.PICKING_CASE) {
				// リスト発行区分がケースピッキングの場合

				if (pickingList1Cls != PL1Cls.CASE_PIC) {
					getErrorManager().throwException(new IllegalArgumentException("PicListCls1 is illegal"));
					return null;
				}
				printCls = PickingListCls.CASE;
			}
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
			MClientCenter mcc = new MClientCenter();
			mcc.setClientId(clientId);
			mcc.setCenterId(centerId);

			MParam mParam = paramLogic.getUkEntityWithDeletedCheck(mcc);
			//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

			// ピッキングリスト発行
			pickingListPrintLogic.print(tPickingRSearch, printCls, pickingListPrintDto, mParam, errRetSts(StatusCode.PICKING_LIST_PRINT_FAILED));
			if (0 < getErrorManager().size()) {
				return null;
			}
		} else {
			// 送り状・荷札の発行
			// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana End

		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/08/04 SJA Start

			TagLabelCls tagLabelCls = null;
			long reportId = reportLogic.getReportId(REPORT_CD_SLIP);
			if (pickingListPrintDto.printBasicData.reportId == reportId) {
				tagLabelCls = TagLabelCls.SLIP;
			} else {
				switch (foot.getPicListCls3()) {
				case "1":
				case "5":
					tagLabelCls = TagLabelCls.TAG;
					break;
				case "2":
				case "6":
					tagLabelCls = TagLabelCls.TAG_PIECE;
					break;
				case "3":
				case "7":
					tagLabelCls = TagLabelCls.TAG_CASE;
					break;
				}
			}

			// ===== 送り状・荷札帳票を発行する =====
			// 発行データ取得メソッドを呼出し
			tagLabelPrintLogic.print(tPickingRUpdate, tagLabelCls, pickingListPrintDto, errRetSts(StatusCode.TAG_PICKING_DATA_SELECT_FAILED));
			if (getErrorManager().size() > 0) {
				return null;
			}
		}
		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/08/04 SJA End

		// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana Start
		// コントロールNoクリア
		selectLogic.clearControlNo(tPickingRSearch.getControlNo());

		// 完了メッセージ表示
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		// [#5105][v3.1] ピッキング提案画面実装に伴い発行処理をロジックに共通化 2018.10.17 kawana End

		return pickingListPrintDto;
	}

	//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe del

	/**
	 * <h2>レポートIDを取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @param pickingListPrintDto レポートDTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/getReportId")
	// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc Start
	public PickingListPrintParamDto getReportId(final PickingListPrintParamDto pickingListPrintDto) {

		PickingListPrintDto resultPickingListPrintDto = new PickingListPrintDto();

		List<String> listReportCd = new ArrayList<String>();

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(pickingListPrintDto.data.head);

		//荷主センタ変更対応 2017.03.06 sja Start
		// 明細部Entity変換
		SqlPickingListPrintDtoMapper Mapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> List = Mapper.mappingToEntityList(pickingListPrintDto.data.list);
		//荷主センタ変更対応 2017.03.06 sja End

		int totalCnt = 0;
		if (!CU.equals(tPickingH.getIsMessageOutPutFlg(), "1")) {

			// 引当指示ヘッダ
			TAllocInstH tAllocInstH = tPickingH.getTAllocInstH();

			// センタIDの取得
			//荷主センタ変更対応 2017.03.06 sja Start
//			MCenter centerCondition = new MCenter();
//			centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
//			centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
//			if (centerCondition == null) {
//				this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
//				return null;
//			}
//			long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
//			tPickingH.setCenterId(centerId);
			long centerId = List.get(0).getCenterId();
			tPickingH.setCenterId(centerId);
			//荷主センタ変更対応 2017.03.06 sja End

			// 荷主IDの取得
			//荷主センタ変更対応 2017.03.06 sja Start
//			MClient clientCondition = new MClient();
//			clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
//			clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
//			if (clientCondition == null) {
//				this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
//				return null;
//			}
//			long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
//			tPickingH.setClientId(clientId);
			long clientId = List.get(0).getClientId();
			tPickingH.setClientId(clientId);
			//荷主センタ変更対応 2017.03.06 sja End

			// 出荷指示ヘッダ
			TShippingInstH tShippingInstH = new TShippingInstH();
			tShippingInstH.setPickingBatchNo(tPickingH.getPickingBatchNo());
			tShippingInstH.setEmergencyFlg(tPickingH.getEmergencyFlg());

			// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
			//欠品有無のみフラグ
			tShippingInstH.setNoStockOutFlg(tPickingH.getNoStockOutFlg());
			// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End

			// ピッキングリスト発行データ取得
			List<SqlPickingListPrint> selectEntity = selectLogic.select(tAllocInstH, tPickingH, tShippingInstH, resultPickingListPrintDto.paging,
					errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
			//エラーが存在する場合
			if (getErrorManager().size() > 0) {
				// 処理中止
				return null;
			}

			// Dto変換処理
			SqlPickingListPrintDtoMapper mapper = new SqlPickingListPrintDtoMapper();
			List<SqlPickingListPrintDto> list = mapper.mappingToDtoList(selectEntity);
			for (SqlPickingListPrintDto reportPrintDto : pickingListPrintDto.data.list) {
				for (SqlPickingListPrintDto printDto : list) {
					if (CU.equals(reportPrintDto.getPickingWorkNo(), printDto.getPickingWorkNo())) {
						totalCnt++;
					}
				}
			}
		}

		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		// ピッキングリスト発行画面ヘッダ情報.リスト発行区分が送り状・荷札の場合
		if (CU.equals(tPickingH.getPicCls(), "4")) {
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			// 明細部Entity変換
			SqlPickingListPrintDtoMapper bodyMapper = new SqlPickingListPrintDtoMapper();
			List<SqlPickingListPrint> bodyList = bodyMapper.mappingToEntityList(pickingListPrintDto.data.list);
			// フッタ部Entity変換
			TPickingH foot = headerMapper.mappingToEntity(pickingListPrintDto.data.footer);

			// 取得データから運送業者を確認
			//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd Start
			 listReportCd = getReportCdList(tPickingH, bodyList, foot, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
				//[Ver3.1][#5105] ピッキング提案画面実装に伴い一部処理をロジックに共通化 2018.09.06 miyabe upd End
			if (0 < getErrorManager().size()) {
				return null;
			}
		}
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End

		// 発行帳票を指定
		PickingListPrintParamDto pickingPrintDto = new PickingListPrintParamDto();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
		Long reportId = null;
		pickingPrintDto.data.listReportId.clear();
		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		// ピッキングリスト発行画面ヘッダ情報.リスト発行区分が送り状・荷札の場合
		if (CU.equals(tPickingH.getPicCls(), "4")) {
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			for (String reportCd : listReportCd) {
				reportId = reportLogic.getReportId(reportCd);
				pickingPrintDto.data.listReportId.add(reportId);
			}
			pickingPrintDto.printBasicData.reportId = pickingPrintDto.data.listReportId.get(0);
		} else {
			reportId = reportLogic.getReportId(tPickingH.getReportCd());
			pickingPrintDto.printBasicData.reportId = reportId;
			pickingPrintDto.data.listReportId.add(reportId);
		}
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End

		if (!CU.equals(tPickingH.getIsMessageOutPutFlg(), "1")) {
			if (totalCnt != pickingListPrintDto.data.list.size()) {
				pickingPrintDto.data.head.setIsOtherWarehouse("1");
			} else {
				pickingPrintDto.data.head.setIsOtherWarehouse("0");
			}
		} else {
			pickingPrintDto.data.head.setIsOtherWarehouse("0");

		}
		return pickingPrintDto;
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc End
	}

	/**
	 * <h2>レポートCDを取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @param pickingListPrintDto レポートDTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
	public List<String> getReportCdList(TPickingH tPickingH, List<SqlPickingListPrint> bodyList, TPickingH foot, ErrorStatus errSts) {
		List<String> resultReportCd = new ArrayList<String>();

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo更新
		TPickingR tPickingRUpdate = new TPickingR(); //出庫帳票(更新用)
		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更(tShippingInstHList削除) 2018.08.23 kawana Delete
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>(); //出庫ヘッダリスト
		TPickingR tPickingRSearch = new TPickingR(); //出庫帳票(検索用)
		TPackingH tPackingH = new TPackingH(); //梱包ヘッダ

		// エンティティ編集
		// 出庫帳票(更新用)
		tPickingRUpdate.setControlNo(controlNo);

		// 梱包ヘッダ
		// ピッキングリスト発行画面ヘッダ情報.リスト発行区分が一次ピッキングの場合
		tPackingH.setMixedFlg_$1();
		// ピッキングリスト発行画面フッタ情報.リスト発行区分(一次ピッキング)がケースピッキングの場合
		if (CU.equals(foot.getPicListCls3(), "3") || CU.equals(foot.getPicListCls3(), "7") ) {
			tPackingH.setMixedFlg_$0();
		} else if (CU.equals(foot.getPicListCls3(), "1") || CU.equals(foot.getPicListCls3(), "4") || CU.equals(foot.getPicListCls3(), "5") ) {
			tPackingH.setMixedFlg(null);
		}

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(tPickingH.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();
		tPickingH.setCenterId(centerId);

		// 荷主IDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(tPickingH.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);
		if (clientCondition == null) {
			this.getErrorManager().add(errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		tPickingH.setClientId(clientId);

		// [#5105][v3.1] 不要な処理を削除(storeNoFlgの取得) 2018.10.17 kawana Delete

		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更 2018.08.23 kawana Start

		for (SqlPickingListPrint body : bodyList) {

			TPickingH pickingH = new TPickingH();
			pickingH.setCenterId(centerId);
			pickingH.setClientId(clientId);
			pickingH.setPickingWorkNo(body.getPickingWorkNo()); //出庫作業No.
			tPickingHList.add(pickingH);
		}

		// 出庫帳票(検索用)
		tPickingRSearch.setControlNo(controlNo);

		// [#294][2.1.0-CT-056] 不要なチェックを削除 2016.11.18 kawana Start

		// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
		selectLogic.updateControlNo(tPickingH, tPackingH, tPickingHList, tPickingRUpdate, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		// [#5129][v3.1] コントロールNo.の設定を出庫指示バッチNo.単位からピッキンググループNo.単位に変更 2018.08.23 kawana End
		if( 0 < getErrorManager().size() ) {
			return null;
		}

		// [#294][2.1.0-CT-056] 不要なチェックを削除 2016.11.18 kawana End

		List<TagLabelCls> listTagLabelCls = new ArrayList<TagLabelCls>();
		switch (foot.getPicListCls3()) {
		case "1":
			listTagLabelCls.add(TagLabelCls.SLIP);
			listTagLabelCls.add(TagLabelCls.TAG);
			break;
		case "2":
			listTagLabelCls.add(TagLabelCls.SLIP);
			listTagLabelCls.add(TagLabelCls.TAG_PIECE);
			break;
		case "3":
			listTagLabelCls.add(TagLabelCls.SLIP);
			listTagLabelCls.add(TagLabelCls.TAG_CASE);
			break;
		case "4":
			listTagLabelCls.add(TagLabelCls.SLIP);
			break;
		case "5":
			listTagLabelCls.add(TagLabelCls.TAG);
			break;
		case "6":
			listTagLabelCls.add(TagLabelCls.TAG_PIECE);
			break;
		case "7":
			listTagLabelCls.add(TagLabelCls.TAG_CASE);
			break;
		}

		for (TagLabelCls tagReportCls : listTagLabelCls) {

			List<String> reportCdList = tagLabelPrintLogic.getReportCd(tPickingRSearch, tagReportCls, errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));
			// ON推-UT210N-005 有る行のデータのみでよいので荷札を出力すべき。 BY SJA 2016/09/12  Start
			if (0 < getErrorManager().size()) {
				return null;
			}
			// ON推-UT210N-005 有る行のデータのみでよいので荷札を出力すべき。 BY SJA 2016/09/12  End

			// [#294][2.1.0-CT-056] 不要なチェックを削除 2016.11.18 kawana

			resultReportCd.addAll(reportCdList);
		}

		// ピッキングリスト発行データ取得.コントロールNoクリアメソッドを呼出し
		selectLogic.clearControlNo(tPickingRSearch.getControlNo());

		return resultReportCd;
	}



	// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第1回対応を削除 (isOtherWarehouse_Order、isOtherWarehouse_Total、isOtherWarehouse_PL)2014.11.26 fengc

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
}
