package com.oneslogi.wms.logic.operation;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.exbhv.TTrworkBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlWorkloadInquiryListPmb;
import com.oneslogi.base.dbflute.exentity.BProperty;
import com.oneslogi.base.dbflute.exentity.customize.SqlWorkloadInquiryList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.PropertyLogic;

/**
 * 作業量照会一覧データ取得ロジッククラス
 */
public class WorkloadInquirySelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrworkBhv tTrworkBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private PropertyLogic propertyLogic;

	// ===== 定数定義 =====
	public static final String PROPERTY_NM = "allowQueryCount";

	/**
	 * <h2>作業量照会一覧データを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから作業量照会一覧データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 作業量照会ヘッダ：拠点CD・荷主CD・業務区分・業務名称・作業年月日・
	 *                                  作業時刻(From)・作業時刻(To)・開始終了・ユーザCD.・作業者名称
	 * @param bodyList 作業量照会ヘッダリスト：作業実績ID                                 
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @param isCsv 検索方法指定：TRUE CSV出力用検索 FALSE 通常検索
	 * @return PagingResultBean<SqlWorkloadInquiryList> 作業量リスト
	 */
	public PagingResultBean<SqlWorkloadInquiryList> select(final SqlWorkloadInquiryList header,
			List<SqlWorkloadInquiryList> bodyList, PagingData paging, ErrorStatus errSts, boolean isCsv) {

		PagingResultBean<SqlWorkloadInquiryList> result = null;

		// 外出しSQLの定義
		String path = TTrworkBhv.PATH_selectSqlWorkloadInquiryList;

		// 検索条件の設定
		SqlWorkloadInquiryListPmb pmb = new SqlWorkloadInquiryListPmb();

		// カルチャID
		pmb.setCultureId(getCultureId());

		if (isCsv) {

			// 検索条件をリストに格納
			List<Long> seqList = new ArrayList<Long>();
			for (SqlWorkloadInquiryList workloadInquiry : bodyList) {
				seqList.add(workloadInquiry.getSequenceno());
			}

			// 作業実績ID
			pmb.setSequenceno(seqList);

		} else {

			// 拠点
			pmb.setCenterCd(header.getCenterCd());
			// 荷主
			pmb.setClientCd(header.getClientCd());
			// 業務区分
			pmb.setTaskType(header.getTaskType());
			// 業務名称
			pmb.setTaskTypeDetail(header.getTaskTypeDetail());
			// 作業年月日
			pmb.setWorkDt(header.getWorkDt());
			// 作業時刻(From)
			pmb.setWorkTimeFrom(header.getWorkTimeFrom());
			// 作業時刻(To)
			pmb.setWorkTimeTo(header.getWorkTimeTo());
			// 開始終了
			pmb.setStartendType(header.getStartEnd());
			// ユーザCD
			pmb.setUsercd_PrefixSearch(header.getUsercd());
			// 作業者名称
			pmb.setUserNm_PrefixSearch(header.getUserNm());

		}

		// 件数検索実行
		// ページング設定をOFF
		pmb.xsetPaging(false);
		Integer cnt = tTrworkBhv.outsideSql().entityHandling().selectEntity(path, pmb, Integer.class);

		// 該当データなし
		if (cnt == 0) {

			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);

			return result;

		}

		// レコード数がプロパティマスタで設定された値を超過
		BProperty property = new BProperty();
		property.setPropertyNm(PROPERTY_NM);
		property = propertyLogic.getUkEntityWithDeletedCheck(property);
		int propertyValue = Integer.valueOf(property.getPropertyValue());

		if (cnt > propertyValue) {

			this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(propertyValue));

			return result;

		}

		// 検索実行
		// ページング設定をON
		pmb.xsetPaging(true);
		Class<SqlWorkloadInquiryList> entityType = SqlWorkloadInquiryList.class;
		result = selectPage(tTrworkBhv, path, pmb, entityType, paging);

		// 該当データなし
		if (result.size() == 0) {

			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);

			return result;

		}

		return result;
	}

}
