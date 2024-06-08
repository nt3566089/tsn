package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.wms.dto.common.BoxDto;
import com.oneslogi.wms.logic.common.BoxLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザデータ取得用リソースクラス
 */
@Path("/common/box")
public class BoxResource extends AbstractWmsResource {

	@Inject
	private MBoxBhv mBoxBhv;

	@Inject
	BoxLogic mBoxLogic = new BoxLogic();

	@GET
	@Path("/keyValueList")
	public BoxDto getKeyValueList(@QueryParam("centerId") Long centerId) {

		MBoxCB cb = mBoxBhv.newMyConditionBean();
		cb.query().setCenterId_Equal(centerId);
		// [検査-074] ソート順リストを修正 2014.11.26 SJA-ZHENG Start
		cb.query().addOrderBy_BoxCd_Asc();
		// [検査-074] ソート順リストを修正 2014.11.26 SJA-ZHENG End
		ListResultBean<MBox> mBox = mBoxBhv.selectList(cb);

		BoxDto dto = new BoxDto();
		for (MBox o : mBox) {
			BoxDto.DropDownListData data = new BoxDto.DropDownListData();
			data.boxCd = o.getBoxCd();
			data.boxNm = o.getBoxNm();
			dto.data.add(data);
		}
		return dto;
	}

	@GET
	@Path("/boxId")
	public String getBoxId(@QueryParam("centerId") Long centerId, @QueryParam("boxCd") String boxCd) {
		MBox mBox = new MBox();
		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
		mBox.setCenterId(centerId);
		// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
		mBox.setBoxCd(boxCd);
		mBox = mBoxLogic.getUkEntityWithDeletedCheck(mBox);
		// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
		return String.valueOf(mBox.getBoxId());
		// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
	}
}
