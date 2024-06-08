package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dtomapper.MProductShapeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.wms.dto.common.ShapeDto;
import com.oneslogi.wms.dto.master.ProductShapeDto;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ProductShapeLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 商品データ取得用リソースクラス
 */
@Path("/common/productShape")
public class ProductShapeResource extends AbstractWmsResource {

	@Inject
	private MProductShapeBhv mProductShapeBhv;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private ProductShapeLogic productShapeLogic;

	@GET
	@Path("/record")
	public ProductShapeDto getProductByCd(@QueryParam("productId") Long productId) {

		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();
		cb.query().setProductId_Equal(productId);

		// 商品荷姿データが1行だけではなくて複数なって例外エラーがならないように修正だけ 2015.12.24 NayZaw Start
		List<MProductShape> list = mProductShapeBhv.selectList(cb);

		if(list == null || list.size() == 0) {
			return null;
		}

//		MProductShape entity = mProductShapeBhv.selectEntity(cb);
//
//		if (entity == null) {
//			return null;
//		}
		MProductShapeDtoMapper mapper = new MProductShapeDtoMapper();
		MProductShapeDto dto = mapper.mappingToDto(list.get(0));
		// 商品荷姿データが1行だけではなくて複数なって例外エラーがならないように修正だけ 2015.12.24 NayZaw End

		ProductShapeDto resultDto = new ProductShapeDto();
		resultDto.data.mProductShape = dto;

		return resultDto;
	}

	// [エンハンス PH2.0] 入数取得 2015.11.19 sja Start
	@GET
	@Path("/unitNum")
	public ProductShapeDto unitNum(@QueryParam("clientId") Long clientId, @QueryParam("centerId") Long centerId, @QueryParam("productId") Long productId,
			@QueryParam("caseFlg") String caseFlg, @QueryParam("bowFlg") String bowFlg, @QueryParam("pieceFlg") String pieceFlg) {
		if(clientId == null){
			return null;
		}

		if(centerId == null){
			return null;
		}

		if(productId == null){
			return null;
		}
		if(caseFlg == null && bowFlg == null && pieceFlg == null){
			return null;
		}
		boolean nullFlg = false;

		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(clientId);
		clientCenter.setCenterId(centerId);
		MParam param = paramLogic.getUkEntityWithDeletedCheck(clientCenter);
		if(param == null){
			return null;
		}

		MProductShape productShape = new MProductShape();
		productShape.setProductId(productId);

		productShape.setShapeGrpDtlId(1l);
		// [Ver3.0] unit of measure対応 2017.12.28 ライ DEL

		// 荷姿IDがNULLの場合
		if(nullFlg){
			// 入数が0を設定する
			productShape.setUnitNum(0l);
		}else{
			productShape = productShapeLogic.getUkEntity(productShape);
			if (productShape == null) {
				return null;
			}
		}

		MProductShapeDtoMapper mapper = new MProductShapeDtoMapper();
		MProductShapeDto dto = mapper.mappingToDto(productShape);

		ProductShapeDto resultDto = new ProductShapeDto();
		resultDto.data.mProductShape = dto;

		return resultDto;
	}
	// [エンハンス PH2.0] 入数取得 2015.11.19 sja End

	/**
	 * 補充商品IDの商品に紐付く商品荷姿マスタの荷姿IDを取得して、その一覧を荷姿マスタの名称と紐付けし、荷姿のコンボボックス用リストを返却する。
	 *
	 * @param clientCd 荷主CD
	 * @param productCd 商品CD
	 * @return 荷姿のコンボボックス用リスト
	 */
	@GET
	@Path("/queryByProductCd")
	public ShapeDto queryByProductCd(@QueryParam("clientCd") String clientCd,
			@QueryParam("productCd") String productCd, @QueryParam("clientId") String clientId) {
		MProductShapeCB cb = mProductShapeBhv.newConditionBean();
		cb.setupSelect_MProduct();
		// [Ver3.0] unit of measure対応 2017.11.27 NING Start
		//cb.setupSelect_MProduct().withMShapeGrp().withMClient().withMShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
		// [Ver3.0] unit of measure対応 2017.11.27 NING End
		// [Ver3.0] unit of measure対応 2017.11.27 NING Del
		cb.query().queryMProduct().setProductCd_Equal(productCd);
		// [Ver3.0] unit of measure対応 2017.11.27 NING Del
		// [Ver3.0] unit of measure対応 2017.11.27 NING Start
		cb.query().queryMProduct().setClientId_Equal(new Long(clientId));
		cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
		// [Ver3.0] unit of measure対応 2017.11.27 NING End

		ListResultBean<MProductShape> list = mProductShapeBhv.selectList(cb);


		ShapeDto dto = new ShapeDto();
		for (MProductShape o : list) {
			ShapeDto.DropDownListData data = new ShapeDto.DropDownListData();
			// [Ver3.0] unit of measure対応 2017.11.27 NING Del
			// [Ver3.0] unit of measure対応 2017.11.27 NING Start
			data.shapeCd = o.getMShapeGrpDtl().getMShape().getShapeCd();
			data.shapeNm = o.getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm();
			// [Ver3.0] unit of measure対応 2017.11.27 NING End
			dto.data.add(data);
		}

		return dto;
	}
}
