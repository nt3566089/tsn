package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.BClassGrpDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterClassGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BClassGrpDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BClassGrpDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl;
import com.oneslogi.base.dto.ClassDto;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.common.CenterClassDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/centerClass")
public class CenterClassResource extends AbstractWmsResource {

	@Inject
	private MCenterClassDtlBhv mCenterClassDtlBhv;
	@Inject
	private MCenterClassBhv mCenterClassBhv;
	@Inject
	private MCenterClassGrpDtlBhv mCenterClassGrpDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	@Inject
	private BClassGrpDtlBhv bClassGrpDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End

	@GET
	@Path("/keyValueList")
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
	public ClassDto getKeyValueList(@QueryParam("classCd") final String classCd) {

		if (CU.isNullOrEmpty(classCd)) {
			return new ClassDto();
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

		ListResultBean<BClassDtl> bClassDtl = bClassDtlBhv.selectList(cb);

		//独自のdtoへ変換する
		ClassDto dto = new ClassDto();
		for (BClassDtl o : bClassDtl) {
			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = o.getClassDtlCd();
			data.classNm = o.getVDict().getDictNm();
			data.defaultFlg = o.getDefaultFlg();
			dto.data.add(data);
		}

		return dto;
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End

	@GET
	@Path("/centerClassKeyValueList")
	public CenterClassDto getCenterClassKeyValueList(@QueryParam("centerId") final Long centerId, @QueryParam("classCd") final String classCd) {

		MCenterClassCB cb = mCenterClassBhv.newMyConditionBean();

		cb.query().setCenterId_Equal(centerId);
		cb.query().setClassCd_Equal(classCd);
		cb.query().addOrderBy_ClassCd_Asc();

		ListResultBean<MCenterClass> mCenterClass = mCenterClassBhv.selectList(cb);

		//独自のdtoへ変換する
		CenterClassDto dto = new CenterClassDto();
		for (MCenterClass o : mCenterClass) {
			CenterClassDto.DropDownListData data = new CenterClassDto.DropDownListData();
			data.centerClassCd = o.getClassCd();
			data.centerClassNm = o.getClassComment();
			dto.data.add(data);
		}

		return dto;
	}

	@GET
	@Path("/grpKeyValueList")
	public ClassDto getGrpKeyValueList(@QueryParam("classGrpCd") final String classGrpCd) {

		if (CU.isNullOrEmpty(classGrpCd)) {
			return new ClassDto();
		}

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		BClassGrpDtlCB cb = bClassGrpDtlBhv.newMyConditionBean();
		cb.setupSelect_BClassDtl().withVDict(getCultureId());

		cb.specify().specifyBClassDtl().columnClassDtlCd();
		cb.specify().specifyBClassDtl().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryBClassGrp().setClassGrpCd_Equal(classGrpCd);
		// [ON推-品向-820] センタ区分値の削除フラグ対応 2015.06.15 kawana Start
		cb.query().queryBClassDtl().setDelFlg_Equal_$0();
		// [ON推-品向-820] センタ区分値の削除フラグ対応 2015.06.15 kawana End

		cb.query().queryBClassDtl().addOrderBy_ViewOrder_Asc();
		cb.query().queryBClassDtl().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<BClassGrpDtl> classGrpDtlList = bClassGrpDtlBhv.selectList(cb);

		//独自のdtoへ変換する
		ClassDto dto = new ClassDto();
		for (BClassGrpDtl classGrpDtl : classGrpDtlList) {
			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = classGrpDtl.chaseBClassDtl().getClassDtlCd();
			data.classNm = classGrpDtl.chaseBClassDtl().getVDict().getDictNm();
			data.defaultFlg = classGrpDtl.getDefaultFlg();
			dto.data.add(data);
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		return dto;
	}

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
	@GET
	@Path("/centerKeyValueList")
	public ClassDto getCenterKeyValueList(@QueryParam("centerId") final Long centerId, @QueryParam("classCd") final String classCd) {

		if (CU.isNullOrEmpty(classCd)) {
			return new ClassDto();
		}

		MCenterClassDtlCB cb = mCenterClassDtlBhv.newMyConditionBean();
		cb.setupSelect_MCenterClass();
		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnClassDtlCd();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		// 荷主センタ変更対応 201７.01.23 sja Start
//		cb.query().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		if (centerId == null) {
			cb.query().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		} else {
			cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		}
		// 荷主センタ変更対応 201７.01.23 sja End
		cb.query().queryMCenterClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ViewOrder_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<MCenterClassDtl> mCenterClassDtl = mCenterClassDtlBhv.selectList(cb);

		//独自のdtoへ変換する
		ClassDto dto = new ClassDto();
		for (MCenterClassDtl o : mCenterClassDtl) {
			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = o.getClassDtlCd();
			data.classNm = o.getVDict().getDictNm();
			data.defaultFlg = o.getDefaultFlg();
			dto.data.add(data);
		}
		return dto;
	}

	@GET
	@Path("/centerGrpKeyValueList")
	public ClassDto getCenterGrpKeyValueList(@QueryParam("classGrpCd") final String classGrpCd) {

		if (CU.isNullOrEmpty(classGrpCd)) {
			return new ClassDto();
		}

		MCenterClassGrpDtlCB cb = mCenterClassGrpDtlBhv.newMyConditionBean();
		cb.setupSelect_MCenterClassDtl().withVDict(getCultureId());

		cb.specify().specifyMCenterClassDtl().columnClassDtlCd();
		cb.specify().specifyMCenterClassDtl().specifyVDict().columnDictNm();
		cb.specify().columnDefaultFlg();

		cb.query().queryMCenterClassGrp().queryMCenterClass().setCenterId_Equal(getCenterClassCondition());
		cb.query().queryMCenterClassGrp().setClassGrpCd_Equal(classGrpCd);
		// [ON推-品向-820] センタ区分値の削除フラグ対応 2015.06.15 kawana Start
		cb.query().queryMCenterClassDtl().setDelFlg_Equal_$0();
		// [ON推-品向-820] センタ区分値の削除フラグ対応 2015.06.15 kawana End

		cb.query().queryMCenterClassDtl().addOrderBy_ViewOrder_Asc();
		cb.query().queryMCenterClassDtl().addOrderBy_ClassDtlCd_Asc();

		ListResultBean<MCenterClassGrpDtl> classGrpDtlList = mCenterClassGrpDtlBhv.selectList(cb);

		//独自のdtoへ変換する
		ClassDto dto = new ClassDto();
		for (MCenterClassGrpDtl classGrpDtl : classGrpDtlList) {
			ClassDto.DropDownListData data = new ClassDto.DropDownListData();
			data.classCd = classGrpDtl.chaseMCenterClassDtl().getClassDtlCd();
			data.classNm = classGrpDtl.chaseMCenterClassDtl().getVDict().getDictNm();
			data.defaultFlg = classGrpDtl.getDefaultFlg();
			dto.data.add(data);
		}

		return dto;
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10miyabe End

}