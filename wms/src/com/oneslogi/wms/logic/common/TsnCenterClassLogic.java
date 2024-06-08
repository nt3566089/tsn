package com.oneslogi.wms.logic.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 拠点区分値グループマスタに対するロジッククラス。
 */
public class TsnCenterClassLogic extends AbstractWmsLogic {

	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;

	/***
	 * 拠点区分値コードを指定して、区分値明細コード、区分値明細名称のMapを取得する
	 * 呼び出し元では、mCenterClassMap.get("区分値CD").get("区分値明細CD") の要領で名称を取得する
	 * @param centerClassCdList 取得したい区分値CD
	 * @return Map<String, Map<String, String>> bClassMap 区分値、区分値名称のマップ
	 */
	public Map<String, Map<String, String>> getmCenterClassNmMap(String centerCd, String... centerClassCdList) {
		if (centerCd == null) {
			return null;
		}

		if (centerClassCdList == null) {
			return null;
		}

		MCenterClassDtlCB cb = mCenterClassDtlBhv.newConditionBean();

		cb.setupSelect_MCenterClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();

		cb.specify().specifyMCenterClass().columnClassCd();
		cb.specify().specifyVDict().columnDictNm();

		cb.query().queryMCenterClass().queryMCenter().setCenterCd_Equal(centerCd);
		cb.query().queryMCenterClass().setClassCd_InScope(Arrays.asList(centerClassCdList));
		cb.query().queryMCenterClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		List<MCenterClassDtl> mCenterClassDtlList = mCenterClassDtlBhv.selectList(cb);
		if (mCenterClassDtlList == null) {
			return null;
		}

		Map<String, Map<String, String>> mCenterClassMap = new HashMap<String, Map<String, String>>();
		for (MCenterClassDtl mCenterClassDtl : mCenterClassDtlList) {

			Map<String, String> mCenterClassDtlMap = mCenterClassMap.get(mCenterClassDtl.getMCenterClass().getClassCd());

			if (mCenterClassDtlMap == null) {
				mCenterClassDtlMap = new HashMap<String, String>();
				mCenterClassMap.put(mCenterClassDtl.getMCenterClass().getClassCd(), mCenterClassDtlMap);
			}

			mCenterClassDtlMap.put(mCenterClassDtl.getClassDtlCd(), mCenterClassDtl.getVDict().getDictNm());
		}

		return mCenterClassMap;
	}


}