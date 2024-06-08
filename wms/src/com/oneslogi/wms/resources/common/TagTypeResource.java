package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB;
import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.wms.dto.master.CarrierSlipCdDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 送り状データ種別取得用リソースクラス
 */
@Path("/common/tagType")
public class TagTypeResource extends AbstractWmsResource {

	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//	@Inject
//	private MCarrierBhv mCarrierBhv;
	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	@GET
	@Path("/keyValueList")
	public CarrierSlipCdDto record(@QueryParam("centerCd") String centerCd, @QueryParam("carrierCd") String carrierCd) {

		CarrierSlipCdDto dto = new CarrierSlipCdDto();

		//指定された運送業者の送り状データ種別を取得
		// [Ver２．１向けエンハンス] 荷札出力対応(不要な変数を削除) C-CWMS-0058 2016/07/06 HDIS
		if( carrierCd != null ){
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			if( carrierCd.equals("YMT") ){
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYmtCB cb = mCarrierSlipYmtBhv.newMyConditionBean();

				cb.setupSelect_MCenter();
				cb.query().queryMCenter().setCenterCd_Equal(centerCd);
				cb.specify().columnTagType();
				cb.specify().columnTagNm();

				cb.query().addOrderBy_TagType_Asc();

				ListResultBean<MCarrierSlipYmt> mCarrierSlipYmt = mCarrierSlipYmtBhv.selectList(cb);

				for (MCarrierSlipYmt o : mCarrierSlipYmt) {
					CarrierSlipCdDto.DropDownListData data = new CarrierSlipCdDto.DropDownListData();
					data.tagType = o.getTagType();
					data.tagNm = o.getTagNm();
					dto.data.add(data);
				}
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			}else if( carrierCd.equals("SGW") ){
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipSgwCB cb = mCarrierSlipSgwBhv.newMyConditionBean();

				cb.setupSelect_MCenter();
				cb.query().queryMCenter().setCenterCd_Equal(centerCd);
				cb.specify().columnTagType();
				cb.specify().columnTagNm();

				cb.query().addOrderBy_TagType_Asc();

				ListResultBean<MCarrierSlipSgw> mCarrierSlipSgw = mCarrierSlipSgwBhv.selectList(cb);

				for (MCarrierSlipSgw o : mCarrierSlipSgw) {
					CarrierSlipCdDto.DropDownListData data = new CarrierSlipCdDto.DropDownListData();
					data.tagType = o.getTagType();
					data.tagNm = o.getTagNm();
					dto.data.add(data);
				}
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			}else if( carrierCd.equals("JP") ){
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYupkCB cb = mCarrierSlipYupkBhv.newMyConditionBean();

				cb.setupSelect_MCenter();
				cb.query().queryMCenter().setCenterCd_Equal(centerCd);
				cb.specify().columnTagType();
				cb.specify().columnTagNm();

				cb.query().addOrderBy_TagType_Asc();

				ListResultBean<MCarrierSlipYupk> mCarrierSlipYupk = mCarrierSlipYupkBhv.selectList(cb);

				for (MCarrierSlipYupk o : mCarrierSlipYupk) {
					CarrierSlipCdDto.DropDownListData data = new CarrierSlipCdDto.DropDownListData();
					data.tagType = o.getTagType();
					data.tagNm = o.getTagNm();
					dto.data.add(data);
				}
			}
		}

		return dto;

	}

}
