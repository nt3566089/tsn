package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.MNumberingCenterDto;
import com.oneslogi.base.dbflute.dtomapper.MNumberingCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MNumberingCenter;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.NumberingCenterMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.NumberingCenterMasterCheckLogic;
import com.oneslogi.wms.logic.master.NumberingCenterMasterInsertLogic;
import com.oneslogi.wms.logic.master.NumberingCenterMasterSelectLogic;
import com.oneslogi.wms.logic.master.NumberingCenterMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ採番マスタ画面のリソースクラス。
 */
@Path("/master/numberingCenterMasterList")
public class NumberingCenterMasterResource extends AbstractWmsResource {


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
		 * 一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * センタ採番マスタ登録異常
		 */
		protected static final int NUMBERING_CENTER_MASTER_INSERT_FAILED = 3;
		/**
		 * センタ採番マスタ更新異常
		 */
		protected static final int NUMBERING_CENTER_MASTER_UPDATE_FAILED = 4;
		/**
		 * 業務CD重複
		 */
		protected static final int BIZ_CD_DUPLICATE = 5;
		// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe Start
		/**
		 * 入力値異常
		 */
		protected static final int INPUT_NUM_ERROR = 6;
		// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe End
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
		/**
		 * 削除チェック異常
		 */
		protected static final int DELETE_CHECK_ERROR = 7;
		/**
		 * センタ採番マスタデータチェック異常
		 */
		protected static final int NUMBERING_CENTER_MASTER_CHECK_FAILED = 8;
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End
	}

	// 使用ロジッククラス
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private NumberingCenterMasterSelectLogic selectLogic;
	@Inject
	private NumberingCenterMasterCheckLogic checkLogic;
	@Inject
	private NumberingCenterMasterInsertLogic insertLogic;
	@Inject
	private NumberingCenterMasterUpdateLogic updateLogic;

	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Add Start
	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
	}
	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Add End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return NumberingCenterMasterDto センタ採番マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public NumberingCenterMasterDto init() {
		return new NumberingCenterMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・センタ採番マスタDTOをキーにセンタ採番マスタデータ取り出し
	 * </pre>
	 * @param numberingCenterMasterDto センタ採番マスタ画面用DTO
	 * @return NumberingCenterMasterDto センタ採番マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public NumberingCenterMasterDto search(NumberingCenterMasterDto numberingCenterMasterDto) throws IOException {
		// Entity変換
		MNumberingCenterDtoMapper mapper = new MNumberingCenterDtoMapper();
		MNumberingCenter numberingCenter = mapper.mappingToEntity(numberingCenterMasterDto.data.head);

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(numberingCenter.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntity(mCenter).getCenterId();

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity編集
		numberingCenter.setCenterId(centerId);

		// 検索
		List<MNumberingCenter> numberingCenterList = selectLogic.select(numberingCenter, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity-Dto変換処理
		List<MNumberingCenterDto> list = mapper.mappingToDtoList(numberingCenterList);

		// 検索結果詰込処理
		numberingCenterMasterDto.data.list = list;

		// [#1077][ver2.2.1]採番例追加 2017.08.16 miyabe Start
		//採番例詰込処理
		String fixedValue = null;
		// [#3587][Ver3.0] センタ採番マスタ - 現在値11桁以上で検索実行時アベンド 2018.02.06 honma Mod Start
		long length = 0l;
		long sampleNumber = 0l;
		// [#3587][Ver3.0] センタ採番マスタ - 現在値11桁以上で検索実行時アベンド 2018.02.06 honma Mod End
		for (MNumberingCenterDto mNumberingCenterDto : list) {
			if(mNumberingCenterDto.getFixedValue() != null){
				fixedValue = mNumberingCenterDto.getFixedValue();
			}
			// [#3587][Ver3.0] センタ採番マスタ - 現在値11桁以上で検索実行時アベンド 2018.02.06 honma Mod Start
			length = Long.parseLong(mNumberingCenterDto.getLength().toString());
			// [#3640][Ver3.0] センタ採番マスタメンテナンス - 限界値登録異常 2018.02.06 honma Mod Start
			if (mNumberingCenterDto.getPresentNumber().equals(mNumberingCenterDto.getMaxNumber())) {
				sampleNumber = 1l;
			} else {
				sampleNumber = Long.parseLong(mNumberingCenterDto.getPresentNumber().toString()) + 1l;
			}
			// [#3640][Ver3.0] センタ採番マスタメンテナンス - 限界値登録異常 2018.02.06 honma Mod End
			// [#3587][Ver3.0] センタ採番マスタ - 現在値11桁以上で検索実行時アベンド 2018.02.06 honma Mod End
			String numberingSample = String.format("%0" + length + "d", sampleNumber);
			if(fixedValue != null){
				numberingSample = fixedValue + numberingSample;
			}
			mNumberingCenterDto.setNumberingSample(numberingSample);
			fixedValue = null;
		}
		// [#1077][ver2.2.1]採番例追加 2017.08.16 miyabe End
		return numberingCenterMasterDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * @param numberingCenterMasterDto センタ採番マスタ
	 * @return 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(NumberingCenterMasterDto numberingCenterMasterDto){

		MNumberingCenterDtoMapper dtoMapper = new MNumberingCenterDtoMapper();
		List<MNumberingCenter> lstNumberingCenter = dtoMapper.mappingToEntityList(numberingCenterMasterDto.data.list);

		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
		ResultSetupData resultStatus = check(lstNumberingCenter);

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}
		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End

		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION),WmsMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録/更新データのチェックを行う。<br>
	 * 全行全項目に対するチェックを行う。<br>
	 * 途中でエラー有の場合も後続チェックを行う。<br>
	 * データチェックは結果で判定。<br>
	 * <pre>
	 * @param lstNumberingCenter センタ採番マスタリスト
	 * @return ResultSetupData 結果
	 */
	private ResultSetupData check(List<MNumberingCenter> lstNumberingCenter) {
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
		List<MDeliveryCourse> deliveryCourseList = checkLogic.selectDeliveryCourseList(lstNumberingCenter.get(0));
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End

		int rowIndex = -1;

		for (MNumberingCenter mNumberingCenter : lstNumberingCenter) {
			rowIndex++;

			// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe Start
			// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
			checkLogic.checkNumberingCenterMasterSize(mNumberingCenter, errRetSts(StatusCode.INPUT_NUM_ERROR), rowIndex);
			// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
			// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 エラー管理チェック削除 2018.02.08 honma Delete
			// [#1077][ver2.2.1]入力値チェック追加 2017.08.17 miyabe End

			// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add Start
			// 配送コースマスタの追跡番号採番キーとして設定されている場合、削除不可
			// [#5580][v3.1]FindBugsの警告対応 (Stringの==比較) 2019.01.31 kawana Start
			if (mNumberingCenter.getDelFlg().equals(CDef.DelFlg.$1.code())) {
				// [#5580][v3.1]FindBugsの警告対応 (Stringの==比較) 2019.01.31 kawana End
				checkLogic.checkNumberingCenterMasterDelete(mNumberingCenter, deliveryCourseList, errRetSts(errRetSts(StatusCode.NUMBERING_CENTER_MASTER_CHECK_FAILED), StatusCode.DELETE_CHECK_ERROR, rowIndex));
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 エラー管理チェック削除 2018.02.08 honma Delete
			}
			// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Add End

			if (mNumberingCenter.getNumberingCenterId() == null) {
				// 新規登録の場合、
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
				checkLogic.checkNumberingCenterMasterInsert(mNumberingCenter, errRetSts(errRetSts(StatusCode.NUMBERING_CENTER_MASTER_CHECK_FAILED), StatusCode.BIZ_CD_DUPLICATE, rowIndex));
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 エラー管理チェック削除 2018.02.08 honma Delete
			} else {
				// 修正の場合
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
				checkLogic.checkNumberingCenterMasterUpdate(mNumberingCenter, errRetSts(errRetSts(StatusCode.NUMBERING_CENTER_MASTER_CHECK_FAILED), StatusCode.BIZ_CD_DUPLICATE, rowIndex));
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
				// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 エラー管理チェック削除 2018.02.08 honma Delete
			}
		}

		// 結果の設定
		ResultSetupData resultStatus;
		if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}

	// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End

	/**
	* <h2>センタ採番マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにセンタ採番マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param numberingCenterMasterDto センタ採番マスタ
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(NumberingCenterMasterDto numberingCenterMasterDto){

		List<MNumberingCenter> insertList = new ArrayList<>();
		List<MNumberingCenter> updateList = new ArrayList<>();

		MNumberingCenterDtoMapper dtoMapper = new MNumberingCenterDtoMapper();
		List<MNumberingCenter> lstMNumberingCenter = dtoMapper.mappingToEntityList(numberingCenterMasterDto.data.list);

		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Add Start
		ResultSetupData resultStatus = check(lstMNumberingCenter);

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}
		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Add End

		int rowIndex = -1;

		for(MNumberingCenter mNumberingCenter : lstMNumberingCenter){
			rowIndex++;

			if(mNumberingCenter.getNumberingCenterId() == null){
				//新規登録の場合、
				mNumberingCenter.setIncNumber(1L);
				mNumberingCenter.setUserEditable_$1();

				checkLogic.checkNumberingCenterMasterInsert(mNumberingCenter, errRetSts(StatusCode.BIZ_CD_DUPLICATE,rowIndex));

				if (0 < getErrorManager().size()) {
					return null;
				}
				insertList.add(mNumberingCenter);
			}
			else{
				// 修正の場合
				checkLogic.checkNumberingCenterMasterUpdate(mNumberingCenter, errRetSts(StatusCode.BIZ_CD_DUPLICATE,rowIndex));
				if (0 < getErrorManager().size()) {
					return null;
				}
				updateList.add(mNumberingCenter);
			}
		}

		if(!insertList.isEmpty()){
			insertLogic.batchInsert(insertList, errRetSts(StatusCode.NUMBERING_CENTER_MASTER_INSERT_FAILED));
		}
		if(!updateList.isEmpty()){
			updateLogic.batchUpdate(updateList, errRetSts(StatusCode.NUMBERING_CENTER_MASTER_UPDATE_FAILED));
		}

		if(getErrorManager().size() > 0){
			return null;
		}
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS),WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

}
