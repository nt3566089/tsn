package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCenterClassGrpCB;
import com.oneslogi.base.dbflute.exbhv.MCenterClassGrpBhv;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.common.CenterClassGrpDto;

/**
 * 区分値グループマスタデータ取得用リソースクラス
 */
@Path("/common/centerClassGrp")
public class CenterClassGrpResource extends AbstractResource {

	@Inject
	private MCenterClassGrpBhv mCenterClassGrpBhv;

	@GET
	@Path("/keyValueList")
	public CenterClassGrpDto getKeyValueList(@QueryParam("centerId") final Long centerId , @QueryParam("classCd") final String classCd) {

		MCenterClassGrpCB cb = mCenterClassGrpBhv.newMyConditionBean();

		cb.setupSelect_MCenterClass();

		cb.query().queryMCenterClass().setCenterId_Equal(centerId);
		cb.query().queryMCenterClass().setClassCd_Equal(classCd);

		cb.query().addOrderBy_ClassGrpCd_Asc();

		ListResultBean<MCenterClassGrp> mCenterClassGrp = mCenterClassGrpBhv.selectList(cb);

		//独自のdtoへ変換する
		CenterClassGrpDto dto = new CenterClassGrpDto();
		for (MCenterClassGrp o : mCenterClassGrp) {
			CenterClassGrpDto.DropDownListData data = new CenterClassGrpDto.DropDownListData();
			data.classGrpCd = o.getClassGrpCd();
			data.classGrpNm = o.getClassGrpComment();
			dto.data.add(data);
		}

		return dto;
	}

}
