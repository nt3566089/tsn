package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.wms.dto.master.UserClientDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザ荷主データ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/userClient")
public class UserClientResource extends AbstractWmsResource {

	@Inject
	private MUserClientBhv mUserClientBhv;

	@Inject
	private MClientBhv mClientBhv;

	@GET
	@Path("/keyValueList")
	public UserClientDto getKeyValueList(@QueryParam("centerId") final Long centerId) {

		UserClientDto dto = new UserClientDto();

		MUserClientCB mUserClientCB = mUserClientBhv.newMyConditionBean();
		mUserClientCB.query().setUserId_Equal(this.getUserId());
		mUserClientCB.query().setDelFlg_Equal_$0();
		mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();

		if (mUserClientBhv.selectCount(mUserClientCB) > 0) {
			mUserClientCB = mUserClientBhv.newMyConditionBean();
			mUserClientCB.setupSelect_MClient();
			mUserClientCB.query().setUserId_Equal(this.getUserId());
			mUserClientCB.query().setDelFlg_Equal_$0();
			mUserClientCB.query().queryMClient().setDelFlg_Equal_$0();

			mUserClientCB.query().queryMClient().existsMClientCenterList(new SubQuery<MClientCenterCB>() {

				@Override
				public void query(MClientCenterCB cb) {
					cb.query().setCenterId_Equal(centerId);
					cb.query().setDelFlg_Equal_$0();
				}

			});

			mUserClientCB.specify().specifyMClient().columnClientId();
			mUserClientCB.specify().specifyMClient().columnClientCd();
			mUserClientCB.specify().specifyMClient().columnClientNm();
			mUserClientCB.query().queryMClient().addOrderBy_ClientCd_Asc();

			ListResultBean<MUserClient> mUserClient = mUserClientBhv.selectList(mUserClientCB);

			for (MUserClient o : mUserClient) {
				UserClientDto.DropDownListData data = new UserClientDto.DropDownListData();
				data.clientId = o.getMClient().getClientId();
				data.clientCd = o.getMClient().getClientCd();
				data.clientNm = o.getMClient().getClientNm();
				dto.data.add(data);
			}

		} else {
			MClientCB mClientCB = mClientBhv.newMyConditionBean();
			mClientCB.query().setDelFlg_Equal_$0();

			mClientCB.query().existsMClientCenterList(new SubQuery<MClientCenterCB>() {

				@Override
				public void query(MClientCenterCB cb) {
					cb.query().setCenterId_Equal(centerId);
					cb.query().setDelFlg_Equal_$0();
				}

			});

			mClientCB.specify().columnClientId();
			mClientCB.specify().columnClientCd();
			mClientCB.specify().columnClientNm();
			mClientCB.query().addOrderBy_ClientCd_Asc();

			ListResultBean<MClient> mClient = mClientBhv.selectList(mClientCB);

			for (MClient o : mClient) {
				UserClientDto.DropDownListData data = new UserClientDto.DropDownListData();
				data.clientId = o.getClientId();
				data.clientCd = o.getClientCd();
				data.clientNm = o.getClientNm();
				dto.data.add(data);
			}

		}

		return dto;
	}

}
