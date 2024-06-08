package com.oneslogi.wms.logic.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 区分値グループマスタに対するロジッククラス。
 */
public class TsnClassLogic extends AbstractWmsLogic {

	@Inject
	private BClassDtlBhv bClassDtlBhv;

	/***
	 * 区分値コードを指定して、区分値明細コード、区分値明細名称のMapを取得する
	 * 呼び出し元では、bClassMap.get("区分値CD").get("区分値明細CD") の要領で名称を取得する
	 * @param classCdList 取得したい区分値CD
	 * @return Map<String, Map<String, String>> bClassMap 区分値、区分値名称のマップ
	 */
	public Map<String, Map<String, String>> getClassNmMap(String... classCdList) {

		if (classCdList == null) {
			return null;
		}

		BClassDtlCB cb = bClassDtlBhv.newConditionBean();

		cb.setupSelect_BClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();

		cb.specify().specifyBClass().columnClassCd();
		cb.specify().specifyVDict().columnDictNm();

		cb.query().queryBClass().setClassCd_InScope(Arrays.asList(classCdList));
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> bClassDtlList = bClassDtlBhv.selectList(cb);
		if (bClassDtlList == null) {
			return null;
		}

		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();
		for (BClassDtl bClassDtl : bClassDtlList) {

			Map<String, String> bClassDtlMap = bClassMap.get(bClassDtl.getBClass().getClassCd());

			if (bClassDtlMap == null) {
				bClassDtlMap = new HashMap<String, String>();
				bClassMap.put(bClassDtl.getBClass().getClassCd(), bClassDtlMap);
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
		}

		return bClassMap;
	}


}