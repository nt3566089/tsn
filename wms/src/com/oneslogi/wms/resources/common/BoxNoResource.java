package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.BoxNoDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/boxNo")
public class BoxNoResource extends AbstractWmsResource {

	// [ON推-品向-422] 選択肢の"新規荷材"のハードコーディングを修正 2015.01.08 kawana Start
	@Inject
	private MessageLogic messageLogic;
	// [ON推-品向-422] 選択肢の"新規荷材"のハードコーディングを修正 2015.01.08 kawana End


	// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana Start
	@GET
	@Path("/keyValueList")
	public BoxNoDto getKeyValueList(@QueryParam("maxBoxNo") int maxBoxNo) {

		BoxNoDto boxNoDto = new BoxNoDto();

		for (int boxNo = 1; boxNo <= maxBoxNo; boxNo++) {

			String boxNoCd = String.valueOf(boxNo);

			BoxNoDto.DropDownListData boxNoData = new BoxNoDto.DropDownListData();
			boxNoData.boxNoCd = boxNoCd;
			boxNoData.boxNoNm = boxNoCd;

			boxNoDto.data.add(boxNoData);
		}

		// 新規荷材をリストの最後に追加
		BoxNoDto.DropDownListData boxNoDataNew = new BoxNoDto.DropDownListData();

		// [ON推-品向-422] 選択肢の"新規荷材"のハードコーディングを修正 2015.01.08 kawana Start
		BMessage message = new BMessage();
		message.setMessageCd(WmsMessageConst.BOX_NEW_INFORMATION);
		BMessage newBoxMessage = messageLogic.getUkEntity(message);
		if(newBoxMessage != null) {
			boxNoDataNew.boxNoNm = newBoxMessage.getMessageNm();
		} else {
			boxNoDataNew.boxNoNm = WmsMessageConst.BOX_NEW_INFORMATION;
		}
		// [ON推-品向-422] 選択肢の"新規荷材"のハードコーディングを修正 2015.01.08 kawana End
		boxNoDataNew.boxNoCd = String.valueOf(maxBoxNo + 1);

		boxNoDto.data.add(boxNoDataNew);

		return boxNoDto;
	}
	// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana End
}
