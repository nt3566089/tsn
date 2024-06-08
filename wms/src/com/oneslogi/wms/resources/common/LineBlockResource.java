package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCblkCB;
import com.oneslogi.base.dbflute.cbean.MClinCB;
import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.wms.dto.common.LineBlockDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/common/lineBlock")
public class LineBlockResource extends AbstractWmsResource {
	@Inject
	private MClinBhv mclinBhv;
	@Inject
	private MCblkBhv mcblkBhv;

	@GET
	@Path("/keyValueList")
	public LineBlockDto record(@QueryParam("centerId") long centerId) {

		LineBlockDto dto = new LineBlockDto();
		
		MClinCB mclineCb = mclinBhv.newMyConditionBean();

		mclineCb.query().setCenterId_Equal(centerId);
		mclineCb.specify().columnLincd();
		mclineCb.specify().columnLinnm();
		mclineCb.query().addOrderBy_Lincd_Asc();

		ListResultBean<MClin> mClin = mclinBhv.selectList(mclineCb);

		for (MClin o : mClin) {
			LineBlockDto.DropDownListData data = new LineBlockDto.DropDownListData();
			data.lineblockCd = o.getLincd();
			data.lineblockNm = o.getLinnm();
			dto.data.add(data);
		}
		
		MCblkCB mcblkCb = mcblkBhv.newMyConditionBean();

		mcblkCb.query().setCenterId_Equal(centerId);
		mcblkCb.specify().columnBlkcd();
		mcblkCb.specify().columnBlknm();
		mcblkCb.query().addOrderBy_Blkcd_Asc();

		ListResultBean<MCblk> mCblk = mcblkBhv.selectList(mcblkCb);

		for (MCblk o : mCblk) {
			LineBlockDto.DropDownListData data = new LineBlockDto.DropDownListData();
			data.lineblockCd = o.getBlkcd();
			data.lineblockNm = o.getBlknm();
			dto.data.add(data);
		}
		
		return dto;

	}
}
