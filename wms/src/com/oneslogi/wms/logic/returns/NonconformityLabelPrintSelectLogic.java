package com.oneslogi.wms.logic.returns;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TTrbaditemcaseCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TTrbaditemcaseBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlNonconformityLabelListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlNonconformityLabelPrintListPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtlSub;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TTrbaditemcase;
import com.oneslogi.base.dbflute.exentity.customize.SqlNonconformityLabelList;
import com.oneslogi.base.dbflute.exentity.customize.SqlNonconformityLabelPrintList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WmsCorePropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.NonconformityLabelDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.TsnClassLogic;
import com.oneslogi.wms.util.WCU;

/**
 * 不適品ラベル出力データ取得ロジッククラス
 */
public class NonconformityLabelPrintSelectLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	private static final String CLASS_CD_LBLKBN = "LBLKBN";
	private static final String CLASS_CD_FCFLG = "FCFLG";
	private static final String CLASS_CD_SYHN_KBN = "SYHN_KBN";
	private static final String CLASS_CD_ALLOCPOLICY = "ALLOCPOLICY";
	private static final String CLASS_CD_LIST_OUT_KBN = "LIST_OUT_KBN";
	private static final String CLASS_CD_RTNCOMPANYNAME = "RTNCOMPANYNAME";

	// ===== 使用テーブル =====
	@Inject
	private TTrbaditemcaseBhv tTrbaditemcaseBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private TsnClassLogic tsnClassLogic;

	/**
	 * <h2>不適品ラベル情報一覧データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからデータを検索し、不適品ラベル情報一覧データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * 検索対象が存在する場合、戻り値を設定する。
	 * </pre>
	 * @param search 不適品ラベル情報ヘッダ：拠点CD・荷主CD・ラベル作成日時(From)・ラベル作成日時(To)・対象月
	 *                                     ・再印刷区分・内外区分・銘柄区分・銘柄CD・不適品ラベルCD・当日作成ラベル枚数
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TTrbaditemcase> 不適品ラベル情報リスト
	 */
	public PagingResultBean<TTrbaditemcase> select(final TTrbaditemcase search, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TTrbaditemcase> resultList = new PagingResultBean<TTrbaditemcase>();

		// 外出しSQLの定義
		String sqlPath = TTrbaditemcaseBhv.PATH_selectSqlNonconformityLabelList;

		// 検索条件の設定
		SqlNonconformityLabelListPmb pmb = new SqlNonconformityLabelListPmb();

		setQueryCondition(pmb, search, errSts);

		if (this.getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		// ページングオフ
		pmb.xsetPaging(false);

		// 件数取得
		Integer selectCnt = tTrbaditemcaseBhv.outsideSql().entityHandling().selectEntity(sqlPath, pmb, Integer.class);

		// 0件チェック
		if (selectCnt == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			//処理中止
			return null;
		} else {
			// 上限チェック
			int allowCount = getPropertyIntValue(WmsCorePropertyConst.ALLOW_QUERY_COUNT);

			if (selectCnt > allowCount) {
				this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(allowCount));
				//処理中止
				return null;
			}
		}

		// ページングオン
		pmb.xsetPaging(true);

		// 検索実行
		List<SqlNonconformityLabelList> selectList = selectPage(tTrbaditemcaseBhv, sqlPath, pmb,
				SqlNonconformityLabelList.class, paging);

		// 0件チェック
		if (selectList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			//処理中止
			return null;
		} else {
			// 区分値情報の取得
			Map<String, Map<String, String>> classNmMap = tsnClassLogic.getClassNmMap(CLASS_CD_LBLKBN, CLASS_CD_FCFLG,
					CLASS_CD_SYHN_KBN, CLASS_CD_ALLOCPOLICY, CLASS_CD_LIST_OUT_KBN, CLASS_CD_RTNCOMPANYNAME);

			// 取得した項目の編集
			for (SqlNonconformityLabelList data : selectList) {
				TTrbaditemcase tTrbaditemcase = new TTrbaditemcase();
				tTrbaditemcase.setTrbaditemcaseId(data.getTrbaditemcaseId());
				tTrbaditemcase.setCreateddate(data.getCreateddate());
				tTrbaditemcase.setTargetmon(data.getTargetmon());
				tTrbaditemcase.setItemcd(data.getItemcd());
				tTrbaditemcase.setProductAbbr(data.getProductAbbr());
				tTrbaditemcase.setLblkbn(classNmMap.get(CLASS_CD_LBLKBN).get(data.getLblkbn()));
				tTrbaditemcase.setInoutkbn(classNmMap.get(CLASS_CD_FCFLG).get(data.getInoutkbn()));
				tTrbaditemcase.setVaExtdata2(classNmMap.get(CLASS_CD_SYHN_KBN).get(data.getVaExtdata2()));
				if (data.getAllocpolicykey() != null) {
					tTrbaditemcase.setAllocpolicykey(
							classNmMap.get(CLASS_CD_ALLOCPOLICY).get(data.getAllocpolicykey().stripTrailingZeros().toPlainString()));
				}
				tTrbaditemcase.setCaseNum(data.getCaseNum());
				tTrbaditemcase.setBaditemcd(data.getBaditemcd());
				tTrbaditemcase.setTodayCnt(data.getTodayNum());
				tTrbaditemcase.setReprintedflg(classNmMap.get(CLASS_CD_LIST_OUT_KBN).get(data.getReprintedflg()));
				if (data.getVaExtdata1() != null && data.getVaExtdata1().equals("1")) {
					tTrbaditemcase.setVaExtdata1("*");
				}
				tTrbaditemcase.setRtnCompanyName(classNmMap.get(CLASS_CD_RTNCOMPANYNAME).get(data.getVaExtdata2()));
				tTrbaditemcase.setItemkbn(data.getVaExtdata2());
				tTrbaditemcase.setVersionNo(data.getVersionNo());

				resultList.add(tTrbaditemcase);
			}
		}

		return resultList;
	}

	/**
	 * <h2>コントロールNo.から不適品ラベル情報帳票用DTOリストを取得する。</h2>
	 * <pre>
	 * 引数のコントロールNo.をキーにデータベースからデータを検索し、不適品ラベル情報一覧データを取得後
	 * 不適品ラベル情報帳票用DTOに変換する
	 * </pre>
	 * @param controlNo 検索対象のコントロールNo.
	 * @return List<NonconformityLabelDto> 不適品ラベル情報帳票用DTOリスト
	 */
	public List<NonconformityLabelDto> selectControlNo(Long controlNo) {
		// 外出しSQLの定義
		String sqlPath = TTrbaditemcaseBhv.PATH_selectSqlNonconformityLabelPrintList;

		// 検索条件の設定
		SqlNonconformityLabelPrintListPmb pmb = new SqlNonconformityLabelPrintListPmb();
		pmb.setControlNo(controlNo);

		List<SqlNonconformityLabelPrintList> selectList = selectList(tTrbaditemcaseBhv, sqlPath, pmb,
				SqlNonconformityLabelPrintList.class);

		// 区分値情報の取得
		BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();
		bClassDtlCB.specify().columnClassDtlCd();
		bClassDtlCB.setupSelect_BClass();
		bClassDtlCB.specify().specifyBClass().columnClassCd();
		bClassDtlCB.setupSelect_BClassDtlSubAsOne();
		bClassDtlCB.specify().specifyBClassDtlSubAsOne().columnOthercd1();
		bClassDtlCB.query().queryBClass().setClassCd_Equal(CLASS_CD_RTNCOMPANYNAME);

		List<NonconformityLabelDto> resultList = new ArrayList<NonconformityLabelDto>();
		StringBuffer strBarcodeBuff = new StringBuffer();
		// 取得データを帳票用DTOに変換
		for (SqlNonconformityLabelPrintList data : selectList) {
			NonconformityLabelDto labelDto = new NonconformityLabelDto();

			// バーコード文字列の作成
			strBarcodeBuff.append("*");
			strBarcodeBuff.append(data.getCenterCd());
			strBarcodeBuff.append(data.getItemcd());
			strBarcodeBuff.append(data.getCaseNum().stripTrailingZeros().toPlainString());
			strBarcodeBuff.append(formatDate(data.getCreateddate()));
			strBarcodeBuff.append(data.getBaditemcd().stripTrailingZeros().toPlainString());
			strBarcodeBuff.append("0000");
			strBarcodeBuff.append("*");

			// 返送先名称取得
			bClassDtlCB.query().setClassDtlCd_Equal(data.getVaExtdata2());
			BClassDtlSub bClassDtlSub = bClassDtlBhv.selectEntityWithDeletedCheck(bClassDtlCB).getBClassDtlSubAsOne();

			// 変換処理
			labelDto.setInvYmd(data.getTargetmon());
			labelDto.setSkPlc((bClassDtlSub != null) ? bClassDtlSub.getOthercd1() : "");
			labelDto.setTrbadItemCaseId(data.getTrbaditemcaseId().toString());
			labelDto.setBarcode(strBarcodeBuff.toString());
			labelDto.setProductCd(data.getItemcd());
			labelDto.setProductNm(data.getProductAbbr());
			labelDto.setCenterCd(data.getCenterCd());
			labelDto.setCenterNm(data.getCenterNm());
			labelDto.setCaseNum(data.getCaseNum());
			labelDto.setRecdMkda(data.getCreateddate());
			labelDto.setAllOcPolicyKey(data.getAllocpolicykey() != null ? data.getAllocpolicykey().stripTrailingZeros().toPlainString() : null);
			labelDto.setBarcodeLabelId(data.getBaditemcd().stripTrailingZeros().toPlainString());
			labelDto.setInOutKbn(data.getInoutkbn());
			labelDto.setUserNum3(data.getUsernum3() != null ? data.getUsernum3().toString() : null);
			labelDto.setUserNum4(data.getVaExtdata2());

			strBarcodeBuff.setLength(0);
			resultList.add(labelDto);
		}

		return resultList;
	}

	/**
	 * <h2>不適品ラベル情報一覧データの存在チェックを行う。</h2>
	 * <pre>
	 * 引数のデータから不適品ラベル情報の検索を行い
	 * 検索件数が0件のデータが存在する場合、既に削除されたエラーをエラー情報として管理する。
	 * </pre>
	 * @param checkList 不適品ラベル情報一覧データ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean チェック結果
	 */
	public boolean checkExists(final List<TTrbaditemcase> checkList, ErrorStatus errSts) {
		TTrbaditemcaseCB tTrbaditemcaseCB = tTrbaditemcaseBhv.newMyConditionBean();

		for (TTrbaditemcase data : checkList) {
			tTrbaditemcaseCB.query().setTrbaditemcaseId_Equal(data.getTrbaditemcaseId());
			// 検索対象が0件の場合
			if (tTrbaditemcaseBhv.selectCount(tTrbaditemcaseCB) == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return false;
			}
		}

		return true;
	}

	/**
	 * 引数のCBに検索条件を設定する。
	 * @param pmb 検索条件を設定するCB
	 * @param search 検索条件
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void setQueryCondition(SqlNonconformityLabelListPmb pmb, final TTrbaditemcase search, ErrorStatus errSts) {
		//拠点ID取得
		String centerCd = search.getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			//処理中止
			return;
		}
		Long centerId = mCenter.getCenterId();

		//荷主ID取得
		String clientCd = search.getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			//処理中止
			return;
		}
		Long clientId = mClient.getClientId();

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setCenterId(centerId);
		mClientCenter.setClientId(clientId);
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		if (mClientCenter == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
			//処理中止
			return;
		}

		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setDtExtdata1(mClientCenter.getSystemDt());
		pmb.setCreateddateFrom(search.getCreateddateFrom());
		pmb.setCreateddateTo(search.getCreateddateTo());
		pmb.setTargetmon_PrefixSearch(search.getTargetmon() != null ? search.getTargetmon().substring(0, 6) : null); // 年月日の年月までを使用する
		pmb.setReprintedflg(search.getReprintedflg());
		pmb.setInoutkbn(search.getInoutkbn());
		pmb.setVaExtdata2(search.getVaExtdata2());
		pmb.setItemcd_PrefixSearch(search.getItemcd());
		pmb.setBaditemcd(search.getBaditemcd() != null ? search.getBaditemcd().longValue() : null);
		pmb.setTodayPrintOnlyFlg(search.getTodayPrintOnlyFlg());
	}

	/**
	 *<h2>日付を「yyyy/MM/dd」形式へ変換する。</h2>
	 * <pre>
	 * 次の形式の日付文字列に対応
	 * yyyyMMdd
	 * </pre>
	 * @param dateTime 日付文字列
	 * @return String yyyy/MM/ddに変換した文字列
	 * */
	private String formatDate(String dateTime) {
		if (CU.isNullOrEmpty(dateTime)) {
			return dateTime;
		}

		if (!WCU.checkDateStr(dateTime)) {
			return dateTime;
		}

		SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy/MM/dd");
		String sfstr = "";
		try {
			sfstr = sf2.format(sf1.parse(dateTime));
		} catch (Exception e) {
			getErrorManager().throwException(e);
		}
		return sfstr;
	}
}
