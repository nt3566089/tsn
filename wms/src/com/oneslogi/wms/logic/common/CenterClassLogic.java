package com.oneslogi.wms.logic.common;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClass;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

// [ON推-品向-263] 区分値の取得を区分値マスタからセンタ区分値マスタに変更 2014.11.21 kawana Start
/**
 * センタ区分値マスタ共通ロジッククラス。
 */
public class CenterClassLogic extends AbstractWmsLogic {

	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	@Inject
	private MCenterClassBhv mCenterClassBhv;

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.23 miyabe End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param centerClass センタ区分値マスタ：区分値CD
	 * @param centerClassDtl センタ区分値明細マスタ：区分値明細CD
	 * @return MCenterClassDtl センタ区分値明細マスタ
	 */
	public BClassDtl getDtlUkEntityWithDeletedCheck(BClass centerClass, BClassDtl centerClassDtl) {

		if (CU.isNullOrEmpty(centerClass.getClassCd())) {
			return null;
		}

		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(centerClass.getClassCd());
		cb.query().setClassDtlCd_Equal(centerClassDtl.getClassDtlCd());

		return bClassDtlBhv.selectEntityWithDeletedCheck(cb);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start

	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
	public BClassDtl getDtlUkEntity(BClass bClass, BClassDtl bClassDtl) {
		return getDtlUkEntity(bClass, bClassDtl, null);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe End
	}


	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
	public BClassDtl getDtlUkEntity(BClass bClass, BClassDtl bClassDtl, ErrorStatus errSts) {
		BClassDtl resultEntity = null;
		try {
			resultEntity = getDtlUkEntityWithDeletedCheck(bClass, bClassDtl);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe End
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "ClassNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ区分値マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタ区分値ID
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getPkEntityWithDeletedCheck(MCenterClass entity) {
		if (entity.getCenterClassId() == null) {
			return null;
		}
		return mCenterClassBhv.selectByPKValueWithDeletedCheck(entity.getCenterClassId());
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ区分値マスタデータを取得する。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタ区分値ID
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getPkEntity(MCenterClass entity) {
		return getPkEntity(entity, null);
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件にセンタ区分値マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタ区分値ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getPkEntity(MCenterClass entity, ErrorStatus errSts) {
		MCenterClass resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "ClassNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタID・区分値CD
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getUkEntityWithDeletedCheck(MCenterClass entity) {

		if (entity.getCenterId() == null) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getClassCd())) {
			return null;
		}

		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(entity.getCenterId());
		cb.query().setClassCd_Equal(entity.getClassCd());
		return mCenterClassBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値マスタデータを取得する。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタID・区分値CD
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getUkEntity(MCenterClass entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>センタ区分値マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件にセンタ区分値マスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity センタ区分値マスタ：センタID・区分値CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCenterClass センタ区分値マスタ
	 */
	public MCenterClass getUkEntity(MCenterClass entity, ErrorStatus errSts) {
		MCenterClass resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "ClassNotFoundError");
		}
		return resultEntity;
	}

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe Start
	/**
	 * <h2>区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 * 引数の区分値CDをキーに、区分値明細マスタデータを取得する。
	 * </pre>
	 * @param classCd 区分値CD
	 * @return Map<String, String> 区分値明細マスタマップ
	 */
	public Map<String, String> getClassMapByCd(String classCd) {
		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<BClassDtl> bClassDtl = bClassDtlBhv.selectList(cb);

		Map<String, String> retMap = new LinkedHashMap<String, String>();

		for (BClassDtl o : bClassDtl) {
			retMap.put(o.getClassDtlCd(), o.getVDict().getDictNm());
		}

		return retMap;
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe End

	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
	/**
	 * 区分値CDを条件に区分値明細マスタのリストを検索する
	 *
	 * @param classCd 区分値CD
	 *
	 * @return センタ区分値明細マスタリスト
	 */
	//荷主センタ変更対応 2017.03.13 sja Start
//	public List<MCenterClassDtl> getCenterClassListByCd(String classCd) {
	public List<MCenterClassDtl> getCenterClassListByCd(String classCd, Long centerId) {
	//荷主センタ変更対応 2017.03.13 sja End
		if (CU.isNullOrEmpty(classCd)) {
			return null;
		}

		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		cb.setupSelect_MCenterClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		//荷主センタ変更対応 2017.03.13 sja Start
//		cb.query().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		if (centerId == null) {
			cb.query().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		} else {
			cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		}
		//荷主センタ変更対応 2017.03.13 sja End
		cb.query().queryMCenterClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		return mCenterClassDtlBhv.selectList(cb);
	}
	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

	// [#5133][v3.1] ピッキングリスト発行画面の発行区分にケースピッキングを追加 2018.08.27 kawana Start

	/**
	 * <h2>区分値明細マスタデータを取得する。</h2>
	 * <pre>
	 * 引数の区分値CDをキーに、区分値明細マスタデータを取得する。
	 * </pre>
	 * @param classCd 区分値CD
	 * @return Map<String, String> 区分値明細マスタマップ
	 */
	public List<BClassDtl> getClassListByCd(String classCd) {

		if (CU.isNullOrEmpty(classCd)) {
			return null;
		}

		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		return bClassDtlBhv.selectList(cb);
	}

	// [#5133][v3.1] ピッキングリスト発行画面の発行区分にケースピッキングを追加 2018.08.27 kawana End
}
//[ON推-品向-263] 区分値の取得を区分値マスタからセンタ区分値マスタに変更 2014.11.21 kawana End
