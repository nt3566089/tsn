package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川送り状マスタメンテナンス取得ロジッククラス
 */
public class CarrierSlipSgwMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv MCarrierSlipSgwBhv;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 add nayzaw Start
	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 add nayzaw End

	/**
	 * <h2>佐川送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースから佐川送り状マスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipSgw - 佐川送り状マスタ：センタID・データ種別・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrierSlipSgw> 佐川送り状マスタリスト
	 */
	public List<MCarrierSlipSgw> select(MCarrierSlipSgw mCarrierSlipSgw, PagingData paging, ErrorStatus errSts) {

		List<MCarrierSlipSgw> result = null;

		// ===== 佐川送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipSgwCB cb = MCarrierSlipSgwBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		// 文字コード
		cb.setupSelect_BClassDtlByCharacterCd().withVDict(getCultureId());
		// 荷姿コード
		cb.setupSelect_MCenterClassDtlBySlipShapeCd(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		// 便種(スピードで選択)
		cb.setupSelect_MCenterClassDtlByTransportTypeSpeed(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		// 便種(商品)
		cb.setupSelect_MCenterClassDtlByTransportTypeItem(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		// 決済種別
		cb.setupSelect_BClassDtlBySettlementType().withVDict(getCultureId());
		// 指定シール1
		cb.setupSelect_MCenterClassDtlBySealType1(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		// 指定シール2
		cb.setupSelect_MCenterClassDtlBySealType2(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		// 指定シール3
		cb.setupSelect_MCenterClassDtlBySealType3(mCarrierSlipSgw.getCenterId()).withVDict(getCultureId());
		//元着区分
		cb.setupSelect_BClassDtlByCodCls().withVDict(getCultureId());
		// 削除フラグ
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// データ種別 (前方一致)
		cb.query().setTagType_PrefixSearch(mCarrierSlipSgw.getTagType());
		//センタCDの設定(前方一致)
		cb.query().setCenterId_Equal(mCarrierSlipSgw.getCenterId());
		//削除フラグの設定(完全一致)
		cb.query().setDelFlg_Equal(mCarrierSlipSgw.getDelFlg());

		// ソート順の設定(データ種別)
		cb.query().addOrderBy_TagType_Asc();

		// ===== 佐川送り状マスタ検索実行 =====
//		2016.02.18 Pan ページング ※3 Start
//		result = MCarrierSlipSgwBhv.selectList(cb);
		result = selectPage(MCarrierSlipSgwBhv, cb, paging);
//		2016.02.18 Pan ページング ※3 End

		// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 modify nayzaw Start

		List<String> classCdList = new ArrayList<String>();
		classCdList.add("API_BINSYU_CODE");// WebAPI便種コード
		classCdList.add("API_DAIBIKI_FLG");// WebAPI代引フラグ
		classCdList.add("API_DAIBIKI_TYPE");// WebAPI代引支払方法区分
		classCdList.add("API_WEIGHT_CD");// WebAPI重量コード1
		classCdList.add("API_WEIGHT_CD");// WebAPI重量コード2
		classCdList.add("API_EIDOME_FLG");// WebAPI営止フラグ

		Map<String, Map<String, String>> centerClassMap = this.getMCenterClassInfo(classCdList);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		} else{
			for(MCarrierSlipSgw resultMCarrierSlipSgw : result){

				resultMCarrierSlipSgw.setMCenterClassDtlByApiBinsyuCode(this.getMCenterClassDtl(centerClassMap, "API_BINSYU_CODE", resultMCarrierSlipSgw.getApiBinsyuCode()));

				resultMCarrierSlipSgw.setMCenterClassDtlByApiDaibikiFlg(this.getMCenterClassDtl(centerClassMap, "API_DAIBIKI_FLG", resultMCarrierSlipSgw.getApiDaibikiFlg()));

				resultMCarrierSlipSgw.setMCenterClassDtlByApiDaibikiType(this.getMCenterClassDtl(centerClassMap, "API_DAIBIKI_TYPE", resultMCarrierSlipSgw.getApiDaibikiType()));

				resultMCarrierSlipSgw.setMCenterClassDtlByApiWeightCd1(this.getMCenterClassDtl(centerClassMap, "API_WEIGHT_CD", resultMCarrierSlipSgw.getApiWeightCd1()));

				resultMCarrierSlipSgw.setMCenterClassDtlByApiWeightCd2(this.getMCenterClassDtl(centerClassMap, "API_WEIGHT_CD", resultMCarrierSlipSgw.getApiWeightCd2()));

				resultMCarrierSlipSgw.setMCenterClassDtlByApiEidomeFlg(this.getMCenterClassDtl(centerClassMap, "API_EIDOME_FLG", resultMCarrierSlipSgw.getApiEidomeFlg()));
			}
		}
		return result;

		// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 modify nayzaw End
	}

	// 2016.03.08 Zhang 一覧編集 ※4 Start
	/**
	 * <h2>佐川送り状マスタを取得する。</h2>
	 * <pre>
	 * 引数をキーに佐川送り状マスタからデータを取得する。
	 *  </pre>
	 * @param carrierSlipSgwId 佐川送り状マスタ：送り状定義ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipSgw 佐川送り状マスタ
	 */
	public MCarrierSlipSgw selectById(long carrierSlipSgwId, ErrorStatus errSts) {
		//===== 編集データ取得 =====

		boolean beforeAutoDelFlg = this.getBehaviorAutoDelFlg();

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		MCarrierSlipSgwCB cb = MCarrierSlipSgwBhv.newMyConditionBean();

		cb.setupSelect_MCenter();

		cb.query().setCarrierSlipSgwId_Equal(carrierSlipSgwId);

		//===== 検索実行 =====
		final MCarrierSlipSgw carrierSlipSgw = MCarrierSlipSgwBhv.selectEntity(cb);

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(beforeAutoDelFlg);

		return carrierSlipSgw;
	}
	// 2016.03.08 Zhang 一覧編集 ※4 Start

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 add nayzaw Start

	/**
	 * <h2>センタ区分値マスタ情報（コード・名称）を取得</h2>
	 *
	 * @param classCdList 区分値CDのリスト
	 * @return Map<String, Map<String, String>> センタ区分値マスタ情報のマップ
	 */
	private Map<String,Map<String, String>> getMCenterClassInfo(List<String> classCdList){

		if(classCdList == null || classCdList.isEmpty()){
			return null;
		}

		MCenterClassDtlCB mCenterClassDtlCB = mCenterClassDtlBhv.newMyConditionBean();
		mCenterClassDtlCB.specify().columnClassDtlCd();
		mCenterClassDtlCB.specify().columnDictId();
		mCenterClassDtlCB.setupSelect_MCenterClass();
		mCenterClassDtlCB.specify().specifyMCenterClass().columnClassCd();
		mCenterClassDtlCB.setupSelect_VDict(getCultureId());
		mCenterClassDtlCB.query().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		mCenterClassDtlCB.query().queryMCenterClass().setClassCd_InScope(classCdList);
		mCenterClassDtlCB.query().queryMCenterClass().addOrderBy_ClassCd_Asc();
		mCenterClassDtlCB.query().addOrderBy_ClassDtlCd_Asc();

		List<MCenterClassDtl> centerClassList = mCenterClassDtlBhv.selectList(mCenterClassDtlCB);

		Map<String, Map<String, String>> centerClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> mCenterClassDtlMap = new HashMap<String, String>();

		for(int i=0; i < centerClassList.size(); i++){

			MCenterClassDtl mCenterClassDtl = centerClassList.get(i);

			if(!classCd.equals(mCenterClassDtl.getMCenterClass().getClassCd())){

				if(!mCenterClassDtlMap.isEmpty()){
					centerClassMap.put(classCd, mCenterClassDtlMap);
					mCenterClassDtlMap = new HashMap<String, String>();
				}

				classCd = mCenterClassDtl.getMCenterClass().getClassCd();
			}

			mCenterClassDtlMap.put(mCenterClassDtl.getClassDtlCd(), mCenterClassDtl.getVDict().getDictNm());

			if(i == centerClassList.size() - 1){
				centerClassMap.put(classCd, mCenterClassDtlMap);
			}

		}
		return centerClassMap;
	}

	/**
	 * <h2>区分値CDでセンタ区分値明細の情報を取得</h2>
	 *
	 * @param centerClassMap センタ区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return MCenterClassDtl センタ区分値明細の情報
	 */
	private MCenterClassDtl getMCenterClassDtl(Map<String, Map<String, String>> centerClassMap, String classCd, String classDtlCd){

		MCenterClassDtl mCenterClassDtl = new MCenterClassDtl();
		VDict vDict = new VDict();

		if(centerClassMap != null && centerClassMap.containsKey(classCd)){
			if(centerClassMap.get(classCd).containsKey(classDtlCd)){
				vDict.setDictNm(centerClassMap.get(classCd).get(classDtlCd));
			}
		}
		mCenterClassDtl.setVDict(vDict);

		return mCenterClassDtl;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73]対応 2016.11.08 add nayzaw End
}