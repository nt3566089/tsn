package com.oneslogi.wms.resources.receive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.receive.ReceivePartListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.receive.PartStatusUpdateLogic;
import com.oneslogi.wms.logic.receive.ReceivePartListSelectLogic;
import com.oneslogi.wms.logic.receive.ReceivePlanInsertLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusCheckLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入荷未完了一覧画面のリソースクラス。
 */
@Path("/receive/receivePartList")
public class ReceivePartListResource extends AbstractWmsResource {

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
		 * 入荷未完了一覧データ取得異常
		 */
		protected static final int WAREHOUSE_FOUND_DATA = 2;
		/**
		 * 入荷状態チェック異常
		 */
		protected static final int WAREHOUSE_CHECK_DATA = 3;

		/**
		 * 分納元・打切りデータ予定数更新異常
		 */
		protected static final int WAREHOUSE_UPDATE_FAILED = 4;

		/**
		 * 入荷予定データ登録異常
		 */
		protected static final int WAREHOUSE_TRCRIVEPLAN_INSERT_FAILED = 5;

		/**
		 * 分納元・分納データステータス更新異常
		 */
		protected static final int WAREHOUSE_TRCRIVEPLANHB_UPDATE_FAILED = 6;

		/**
		 * 分納元・完納データステータス更新異常
		 */
		protected static final int WAREHOUSE_TRCRIVEPLANH_UPDATE_FAILED = 7;

		/**
		 * 分納元・打切りデータステータス更新異常
		 */
		protected static final int WAREHOUSE_LIST_UPDATE_FAILED = 8;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceivePartListSelectLogic ReceivePartListSelectLogic;
	@Inject
	private ReceiveStatusCheckLogic ReceiveStatusCheckLogic;
	@Inject
	private ReceivePlanInsertLogic ReceivePlanInsertLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private PartStatusUpdateLogic PartStatusUpdateLogic;
	@Inject
	private ReceiveStatusUpdateLogic ReceiveStatusUpdateLogic;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReceivePartListDto 入荷未完了一覧画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceivePartListDto initNew() {
		return new ReceivePartListDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・入荷未完了一覧DTOをキーに入荷予定ヘッダデータ取り出し
	 * </pre>
	 * @param ReceivePartListDto 入荷未完了一覧画面用DTO
	 * @return ReceivePartListDto 入荷未完了一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public ReceivePartListDto search(ReceivePartListDto ReceivePartListDto) throws IOException {

		// Entity変換
		TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper();
		TReceivePlanH entity = mapper.mappingToEntity(ReceivePartListDto.data.receivePartListSearch);

		//入荷未完了一覧データ取得の検索データ編集
		TReceivePlanB body = new TReceivePlanB();
		TStoreRecordB recordHeader = new TStoreRecordB();
		TStoreRecordH head = new TStoreRecordH();

		body.setProductCd(entity.getProductCd());

		//荷主ID取得
		String clientCd = entity.getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.WAREHOUSE_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		entity.setClientId(mClient.getClientId());

		//センタID取得
		String centerCd = entity.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.WAREHOUSE_FOUND_DATA), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		entity.setCenterId(mCenter.getCenterId());

		//入庫実績ヘッダ.入庫日(From)
		recordHeader.setStoreDtFrom(entity.getStoreDtFrom());

		//入庫実績ヘッダ.入庫日(To)
		recordHeader.setStoreDtTo(entity.getStoreDtTo());

		head.setClientReceiveNo(entity.getClientReceiveNo());

		// 検索
		PagingResultBean<TReceivePlanB> page = ReceivePartListSelectLogic.select(entity, body, recordHeader, head, ReceivePartListDto.paging, errRetSts(StatusCode.WAREHOUSE_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		TReceivePlanBDtoMapper mapperb = new TReceivePlanBDtoMapper();
		List<TReceivePlanBDto> list = mapperb.mappingToDtoList(page);

		ReceivePartListDto.data.list = list;
		return ReceivePartListDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 入荷状態チェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * </pre>
	 * @param ReceivePartListDto  入荷未完了一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheckRegister")
	public StatusDto inputCheckRegister(ReceivePartListDto ReceivePartListDto) {
		// Entity変換
		TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> entityList = mapper.mappingToEntityList(ReceivePartListDto.data.list);

		List<TReceivePlanH> entityListPlanH = new ArrayList<TReceivePlanH>();

		for (TReceivePlanB tReceivePlanB : entityList) {
			entityListPlanH.add(tReceivePlanB.getTReceivePlanH());
		}

		// 入荷状態チェックロジッククラス
		ReceiveStatusCheckLogic.receiveInstallment(entityListPlanH, null, null, errRetSts(StatusCode.WAREHOUSE_CHECK_DATA));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else if (entityListPlanH.size() == 0) {
			// 明細無しは処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>入荷未完了一覧登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param receivePartListDto 入荷未完了一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 * @throws IOException
	 */
	@POST
	@Path("/insert")
	public StatusDto insert(ReceivePartListDto receivePartListDto) throws IOException {

		// Entity変換
		TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper();
		List<TReceivePlanB> bodyList = mapper.mappingToEntityList(receivePartListDto.data.list);
		List<TReceivePlanH> entityListPlanH = new ArrayList<TReceivePlanH>();
		List<TReceivePlanB> entityList = new ArrayList<TReceivePlanB>();

		// Entity変換
		TReceivePlanHDtoMapper headMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH entity = headMapper.mappingToEntity(receivePartListDto.data.receivePartListSearch);

		ReceivePartListDto resultDto = search(receivePartListDto);

		List<TReceivePlanB> selectList = new ArrayList<TReceivePlanB>();

		// [検査-029] 排他エラーを修正 2014.11.25 wangb Start
		if(resultDto != null){
			selectList = mapper.mappingToEntityList(resultDto.data.list);

			Long headId = 0l;

			for (int bodyRow = 0; bodyRow < bodyList.size(); bodyRow++) {
				if (!headId.equals(bodyList.get(bodyRow).getReceivePlanHId())) {
					for (int row = 0; row < selectList.size(); row++) {
						if (selectList.get(row).getReceivePlanHId().equals(bodyList.get(bodyRow).getReceivePlanHId())) {
							selectList.get(row).setStrReceiveDeliveryStatus(bodyList.get(bodyRow).getStrReceiveDeliveryStatus());
							// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
							selectList.get(row).getTReceivePlanH().getBClassDtlByReceiveDeliveryStatus().getVDict().setDictNm(entity.getReceiveDeliveryStatus());
							// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
							selectList.get(row).getTReceivePlanH().setReceivePlanDt(entity.getReceivePlanDt());
							entityList.add(selectList.get(row));
						}
					}
				}
				headId = bodyList.get(bodyRow).getReceivePlanHId();
			}

			if(entityList.size() == 0){
				entityList = bodyList;
			}
		}else{
			entityList = bodyList;
			getErrorManager().clear();
		}
		// [検査-029] 排他エラーを修正 2014.11.25 wangb End

		for (TReceivePlanB tReceivePlanB : entityList) {
			entityListPlanH.add(tReceivePlanB.getTReceivePlanH());

		}

		// 入荷状態チェックロジッククラス
		ReceiveStatusCheckLogic.receiveInstallment(entityListPlanH, null, null, errRetSts(StatusCode.WAREHOUSE_CHECK_DATA));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else if (entityListPlanH.size() == 0) {
			// 明細無しは処理中止
			return null;
		}

		for (TReceivePlanB tReceivePlanB : entityList) {
			// DEL  BY  QIUY 2014/08/07  START
			//			if (tReceivePlanB.getStrReceiveDeliveryStatus().equalsIgnoreCase("01")) {
			//
			//				tReceivePlanB.getTReceivePlanH().setReceiveDeliveryStatus_$01();
			//
			//			} else
			// DEL  BY  QIUY 2014/08/07  END

			if (tReceivePlanB.getStrReceiveDeliveryStatus().equalsIgnoreCase("02")) {

				tReceivePlanB.getTReceivePlanH().setReceiveDeliveryStatus_$02();

			} else if (tReceivePlanB.getStrReceiveDeliveryStatus().equalsIgnoreCase("09")) {

				tReceivePlanB.getTReceivePlanH().setReceiveDeliveryStatus_$09();
			}
		}

		//変数.入荷予定ヘッダリスト(分納元)
		List<TReceivePlanH> tReceivePlanH = new ArrayList<TReceivePlanH>();

		//変数.入荷予定ヘッダリスト(分納先)
		List<TReceivePlanH> ReceiveInstallment = new ArrayList<TReceivePlanH>();

		//変数.入荷予定リスト(分納先)
		List<TReceivePlanB> ReceiveInstallmentB = new ArrayList<TReceivePlanB>();

		//変数.分納元・打切りデータ予定数変更
		List<TReceivePlanB> ReceivetReceivePlanB = new ArrayList<TReceivePlanB>();

		//変数.入荷予定ヘッダリスト(完納)
		// DEL  BY  QIUY 2014/08/07  START
		//List<TReceivePlanH> ReceiveComplete = new ArrayList<TReceivePlanH>();
		// DEL  BY  QIUY 2014/08/07  END

		// add  BY  QIUY 2014/08/08  START
		//変数.入荷予定ヘッダリスト(打切)
		List<TReceivePlanH> ReceiveClose = new ArrayList<TReceivePlanH>();
		// add  BY  QIUY 2014/08/08  START

		for (TReceivePlanB tReceivePlanB : entityList) {

			//入荷納品ステータスが"分納"の場合
			if (tReceivePlanB.getTReceivePlanH().isReceiveDeliveryStatus$02()) {
				// add  BY  QIUY 2014/08/08  START
				//変数.分納元・打切りデータ予定数変更
				ReceivetReceivePlanB.add(tReceivePlanB.clone());
				// add  BY  QIUY 2014/08/08  end

				//分納元リスト編集 B
				tReceivePlanH.add(tReceivePlanB.getTReceivePlanH());

				//分納先リスト編集 エンティティ編集  [ A ]のループ行.予定数 - [ A ]のループ行.総入庫数C
				tReceivePlanB.setPlanNum(WCC.subtract(tReceivePlanB.getPlanNum(), tReceivePlanB.getSumStoreNum()));

				//入荷ステータス
				tReceivePlanB.setReceiveStatus_$01();

				//入荷予定ヘッダリスト(分納先) リスト編集
				ReceiveInstallment.add(tReceivePlanB.getTReceivePlanH().clone());
				//入荷予定ボディ(分納先) リスト編集
				ReceiveInstallmentB.add(tReceivePlanB);

			}

			//入荷予定ヘッダエンティティに入荷納品ステータスが"完納"の場合
			// DEL  BY  QIUY 2014/08/07  START
			//			if (tReceivePlanB.getTReceivePlanH().isReceiveDeliveryStatus$01()) {
			//
			//				//入荷予定ヘッダリスト(完納)D
			//				ReceiveComplete.add(tReceivePlanB.getTReceivePlanH());
			//
			//			}
			// DEL  BY  QIUY 2014/08/07  END
			//入荷予定ヘッダエンティティに入荷納品ステータスが"打切り"の場合
			if (tReceivePlanB.getTReceivePlanH().isReceiveDeliveryStatus$09()) {

				//入荷予定ヘッダリスト(打切りE
				ReceiveClose.add(tReceivePlanB.getTReceivePlanH());
			}
		}
		// ADD  BY  QIUY 2014/08/13  START

		List<TReceivePlanH> ReceiveInstaH = new ArrayList<TReceivePlanH>();
		//入荷予定ボディ
		//List<TReceivePlanB> ReceiveInstaB = new ArrayList<TReceivePlanB>();
		for (TReceivePlanH planHeade : ReceiveInstallment) {

			for (TReceivePlanH planHeadeA : ReceiveInstallment) {
				if (planHeade.getReceiveSlipNo() == planHeadeA.getReceiveSlipNo()) {
					ReceiveInstaH.add(planHeadeA);
				}
			}
		}

		String strReceiveSlipNo = "";
		List<TReceivePlanH> ReceiveInstaSlipNoH = new ArrayList<TReceivePlanH>();
		for (TReceivePlanH planHeade : ReceiveInstaH) {
			if (!(strReceiveSlipNo.equals(planHeade.getReceiveSlipNo()))) {
				ReceiveInstaSlipNoH.add(planHeade);
				strReceiveSlipNo = planHeade.getReceiveSlipNo();
			}
		}

		for (TReceivePlanH planHeadeA : ReceiveInstaSlipNoH) {
			//入荷予定ボディ
			List<TReceivePlanB> ReceiveInstaPlanB = new ArrayList<TReceivePlanB>();
			for (TReceivePlanB tReceivePlanB : ReceiveInstallmentB) {
				if (planHeadeA.getReceivePlanHId().equals(tReceivePlanB.getReceivePlanHId())) {
					ReceiveInstaPlanB.add(tReceivePlanB);
					planHeadeA.setReceiveDeliveryStatus_$00();
					planHeadeA.setReceiveStatus_$01();
					planHeadeA.setReceiveSlipNo(null);
					planHeadeA.setOldReceivePlanHId(planHeadeA.getReceivePlanHId());
				}
			}
			//}
			ReceivePlanInsertLogic.insert(planHeadeA, ReceiveInstaPlanB, errRetSts(StatusCode.WAREHOUSE_TRCRIVEPLAN_INSERT_FAILED));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}
		// ADD  BY  QIUY 2014/08/13  END

		//分納元・打切りデータ予定数変更
		if (ReceivetReceivePlanB.size() > 0) {
			PartStatusUpdateLogic.update(ReceivetReceivePlanB, errRetSts(StatusCode.WAREHOUSE_UPDATE_FAILED));

			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		//入荷予定ステータス更新.完納
		// DEL  BY  QIUY 2014/08/07  START
		//		if (ReceiveComplete.size() > 0) {
		//			ReceiveStatusUpdateLogic.receiveComplete(ReceiveComplete, errRetSts(StatusCode.WAREHOUSE_TRCRIVEPLANH_UPDATE_FAILED));
		//
		//			// 結果判定
		//			if (0 < getErrorManager().size()) {
		//				return null;
		//			}
		//		}
		// DEL  BY  QIUY 2014/08/07  END

		//入荷予定ステータス更新.分納元
		if (tReceivePlanH.size() > 0) {
			ReceiveStatusUpdateLogic.receiveInstallment(tReceivePlanH, errRetSts(StatusCode.WAREHOUSE_TRCRIVEPLANHB_UPDATE_FAILED));

			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		//入荷予定ステータス更新.打切
		if (ReceiveClose.size() > 0) {
			ReceiveStatusUpdateLogic.receiveClose(ReceiveClose, errRetSts(StatusCode.WAREHOUSE_TRCRIVEPLANHB_UPDATE_FAILED));

			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// 完了メッセージの設定
		// [ON推-品向-128] 更新時のメッセージを統一する。 2014.11.26 KI Start
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-128] 更新時のメッセージを統一する。 2014.11.26 KI End
		return null;
	}

	/**
	 * <h2>入荷納品ステータスドロップダウン·リスト</h2>
	 * <pre>
	 * </pre>
	 * @param classCd 状態区分
	 * @return ReceivePartListDto 処理結果DTO
	 */

	@GET
	@Path("/receiveDeliveryStatus")
	public ReceivePartListDto receiveDeliveryStatus(@QueryParam("classCd") final String classCd) {

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.orScopeQuery(new OrQuery<BClassDtlCB>() {
			public void query(BClassDtlCB orCB) {
				orCB.query().setClassDtlCd_Equal("09");
				orCB.query().setClassDtlCd_Equal("02");
			}
		});

		cb.query().queryBClass().setClassCd_Equal(classCd);
		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<BClassDtl> classDtl = bClassDtlBhv.selectList(cb);

		//独自のdtoへ変換する
		ReceivePartListDto dto = new ReceivePartListDto();
		for (BClassDtl o : classDtl) {
			ReceivePartListDto.DropDownListData data = new ReceivePartListDto.DropDownListData();
			data.classCd = o.getClassDtlCd();
			data.classNm = o.getVDict().getDictNm();
			data.defaultFlg = o.getDefaultFlg();
			dto.dataList.add(data);
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End

		return dto;
	}
}
