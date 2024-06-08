package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.master.ProcessTypeDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 処理区分データ取得用リソースクラス
 */
@Path("/common/processType")
public class ProcessTypeResource extends AbstractWmsResource {

	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	@GET
	@Path("/keyValueList")
	public ProcessTypeDto getKeyValueList(@QueryParam("receiveFlg") String receiveFlg, @QueryParam("shippingFlg") String shippingFlg, @QueryParam("moveFlg") String moveFlg) {

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_VDict(getCultureId());
		cb.setupSelect_MStockType();

		cb.specify().columnProcessTypeCd();
		cb.specify().columnDefaultFlg();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().specifyMStockType().columnStockTypeCd();

		final String strReceiveFlg = receiveFlg;
		final String strShippingFlg = shippingFlg;
		final String strStockAdjustFlg = moveFlg;

		cb.orScopeQuery(new OrQuery<MProcessTypeCB>() {
			@Override
			public void query(MProcessTypeCB orCB) {
				if (strReceiveFlg.equals("1")) {
					orCB.query().setReceiveFlg_Equal(strReceiveFlg);
				}
				if (strShippingFlg.equals("1")) {
					orCB.query().setShippingFlg_Equal(strShippingFlg);
				}
				if (strStockAdjustFlg.equals("1")) {
					orCB.query().setStockAdjustFlg_Equal(strStockAdjustFlg);
				}
			}
		});

		cb.query().addOrderBy_ProcessTypeCd_Asc();

		ListResultBean<MProcessType> mProcessType = mProcessTypeBhv.selectList(cb);

		ProcessTypeDto dto = new ProcessTypeDto();
		for (MProcessType o : mProcessType) {
			ProcessTypeDto.DropDownListData data = new ProcessTypeDto.DropDownListData();
			data.processTypeCd = o.getProcessTypeCd();
			//[ON推-1.1.4-CT-086]CT指摘の修正対応 2016.06.08 chou Mod Start
			data.processTypeNm = o.getVDict() != null ? o.getVDict().getDictNm() : "";
			//[ON推-1.1.4-CT-086]CT指摘の修正対応 2016.06.08 chou Mod End
			data.defaultFlg = o.getDefaultFlg();
			if(o.getMStockType() != null){
				data.stockTypeCd = o.getMStockType().getStockTypeCd();
			}
			dto.data.add(data);
		}

		return dto;
	}

	//[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Add Start
	@GET
	@Path("/keyValueList2")
	public ProcessTypeDto getKeyValueList2(@QueryParam("receiveFlg") String receiveFlg, @QueryParam("shippingFlg") String shippingFlg, @QueryParam("moveFlg") String moveFlg) {

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.setupSelect_VDict(getCultureId());
		cb.setupSelect_MStockType();

		cb.specify().columnProcessTypeCd();
		cb.specify().columnDefaultFlg();
		cb.specify().specifyVDict().columnDictNm();
		cb.specify().specifyMStockType().columnStockTypeCd();

		final String strReceiveFlg = receiveFlg;
		final String strShippingFlg = shippingFlg;
		final String strStockAdjustFlg = moveFlg;

		if (!CU.isNullOrEmpty(strReceiveFlg)) {
			cb.query().setReceiveFlg_Equal(strReceiveFlg);
		}
		if (!CU.isNullOrEmpty(strShippingFlg)) {
			cb.query().setShippingFlg_Equal(strShippingFlg);
		}
		if (!CU.isNullOrEmpty(strStockAdjustFlg)) {
			cb.query().setStockAdjustFlg_Equal(strStockAdjustFlg);
		}

		cb.query().addOrderBy_ProcessTypeCd_Asc();

		ListResultBean<MProcessType> mProcessType = mProcessTypeBhv.selectList(cb);

		ProcessTypeDto dto = new ProcessTypeDto();
		for (MProcessType o : mProcessType) {
			ProcessTypeDto.DropDownListData data = new ProcessTypeDto.DropDownListData();
			data.processTypeCd = o.getProcessTypeCd();
			//[ON推-1.1.4-CT-086]CT指摘の修正対応 2016.06.08 chou Mod Start
			data.processTypeNm = o.getVDict() != null ? o.getVDict().getDictNm() : "";
			//[ON推-1.1.4-CT-086]CT指摘の修正対応 2016.06.08 chou Mod End
			data.defaultFlg = o.getDefaultFlg();
			if(o.getMStockType() != null){
				data.stockTypeCd = o.getMStockType().getStockTypeCd();
			}
			dto.data.add(data);
		}

		return dto;
	}
	//[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Add End

}
