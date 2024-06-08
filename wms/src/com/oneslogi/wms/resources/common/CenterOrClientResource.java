package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.wms.dto.master.CenterClientScreenMasterDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ・荷主データ取得用リソースクラス
 */
@Path("/common/centerOrClient")
public class CenterOrClientResource extends AbstractWmsResource {

	@Inject
	private MClientBhv mClientBhv;
	@Inject
	private MCenterBhv mCenterBhv;

	@GET
	@Path("/keyValueList")
	public CenterClientScreenMasterDto getKeyValueList(@QueryParam("centerClientCls") String centerClientCls) {
		CenterClientScreenMasterDto dto = new CenterClientScreenMasterDto();
		if(centerClientCls != null){
			//荷主の場合
			if(centerClientCls.equals("2") ){
				MClientCB cb = new MClientBhv().newMyConditionBean();
				cb.query().addOrderBy_ClientCd_Asc();
				ListResultBean<MClient> mClientList = mClientBhv.selectList(cb);

				for(MClient mClient:mClientList){
					CenterClientScreenMasterDto.DropDownListData data = new CenterClientScreenMasterDto.DropDownListData();
					data.centerOrClientId = mClient.getClientId();
					data.centerOrClientCd = mClient.getClientCd();
					data.centerOrClientNm = mClient.getClientNm();
					dto.centerOrClientList.add(data);
				}
			}
			//センタの場合
			if(centerClientCls.equals("1")){
				MCenterCB cb = new MCenterBhv().newMyConditionBean();
				cb.query().addOrderBy_CenterCd_Asc();
				ListResultBean<MCenter> mCenterList = mCenterBhv.selectList(cb);

				for(MCenter mCenter:mCenterList){
					CenterClientScreenMasterDto.DropDownListData data = new CenterClientScreenMasterDto.DropDownListData();
					data.centerOrClientId = mCenter.getCenterId();
					data.centerOrClientCd = mCenter.getCenterCd();
					data.centerOrClientNm = mCenter.getCenterNm();
					dto.centerOrClientList.add(data);
				}
			}
		}
		return dto;
	}
}
