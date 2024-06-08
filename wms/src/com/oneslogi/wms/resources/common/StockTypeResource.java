package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.wms.dto.master.StockTypeDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫区分データ取得用リソースクラス
 */
@Path("/common/stockType")
public class StockTypeResource extends AbstractWmsResource {

	@Inject
	private MStockTypeBhv mStockTypeBhv;
//	@Inject
//	private ClientLogic clientLogic;

	@GET
	@Path("/keyValueList")
	public StockTypeDto getKeyValueList(@QueryParam("clientCd") String clientCd) {

		StockTypeDto dto = new StockTypeDto();
//		if (clientCd == null) {
//			return dto;
//		}
//
//		 //荷主id取得
//		MClient clientCondition = new MClient();
//		clientCondition.setClientCd(clientCd);
//		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		//在庫区分データ取得
		MStockTypeCB cb = mStockTypeBhv.newMyConditionBean();

		cb.setupSelect_VDict(getCultureId());

		cb.specify().columnStockTypeCd();
		cb.specify().specifyVDict().columnDictNm();
//		cb.query().setClientId_Equal(clientId);

		cb.query().addOrderBy_StockTypeCd_Asc();

		ListResultBean<MStockType> mStockType = mStockTypeBhv.selectList(cb);

		for (MStockType o : mStockType) {
			StockTypeDto.DropDownListData data = new StockTypeDto.DropDownListData();
			data.stockTypeCd = o.getStockTypeCd();
			data.stockTypeNm = o.getVDict().getDictNm();
			data.stockTypeId = o.getStockTypeId();
			dto.data.add(data);
		}

		return dto;
	}

}
