package com.oneslogi.wms.resources.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.wms.dto.master.ProductDto;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 商品データ取得用リソースクラス
 */
@Path("/common/product")
public class ProductResource extends AbstractWmsResource {

	@Inject
	private ProductLogic productLogic;
	// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete

	@GET
	@Path("/record")
	public ProductDto getProductByCd(@QueryParam("clientId") Long clientId, @QueryParam("productCd") String productCd) {

		MProduct conditionEntity = new MProduct();
		conditionEntity.setClientId(clientId);
		conditionEntity.setProductCd(productCd);

		MProduct entity = productLogic.getUkEntity(conditionEntity);

		if (entity == null) {
			return null;
		}

		MProductDtoMapper mapper = new MProductDtoMapper();
		MProductDto dto = mapper.mappingToDto(entity);

		ProductDto resultDto = new ProductDto();
		resultDto.data.mProduct = dto;

		return resultDto;
	}

	// [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana Start

	/**
	 * <h2>商品マスタ取得(商品CDまたはソースCD検索).</h2>
	 * <pre>
	 * 引数の商品CDが商品CDまたはソースCDとして登録されている商品マスタを検索して返す。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param productCd 商品CDまたはソースCD
	 * @return 商品マスタ
	 */
	@GET
	@Path("/recordByCdOrJan")
	public ProductDto getProductByCdOrJan(@QueryParam("clientId") Long clientId, @QueryParam("productCd") String productCd) {

		MProduct conditionEntity = new MProduct();
		conditionEntity.setClientId(clientId);
		conditionEntity.setProductCd(productCd);
		conditionEntity.setJanCd(productCd);

		MProduct entity = productLogic.getEntityProductCdOrJanCd(conditionEntity);

		if (entity == null) {
			return null;
		}

		MProductDtoMapper mapper = new MProductDtoMapper();
		MProductDto dto = mapper.mappingToDto(entity);

		ProductDto resultDto = new ProductDto();
		resultDto.data.mProduct = dto;

		return resultDto;
	}

	// [#5115][v3.1] 単行出荷検品 作成 2018.08.13 kawana End

	@GET
	@Path("/productRecordwithShape")
	public ProductDto getUkEntityWithShape(@QueryParam("clientId") Long clientId, @QueryParam("productCd") String productCd) {

		MProduct conditionEntity = new MProduct();
		conditionEntity.setClientId(clientId);
		conditionEntity.setProductCd(productCd);

		MProduct entity = productLogic.getUkEntityWithShape(conditionEntity);

		if (entity == null) {
			return null;
		}

		MProductDtoMapper mapper = new MProductDtoMapper();
		MProductDto dto = mapper.mappingToDto(entity);

		ProductDto resultDto = new ProductDto();
		resultDto.data.mProduct = dto;

		return resultDto;
	}

	// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete

	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add Start
	@GET
	@Path("/productRecordwithProductShapewithShapeGrpDtl")
	public ProductDto getUkEntityWithProductShapewithShapeGrpDt(@QueryParam("clientId") Long clientId, @QueryParam("productCd") String productCd) {

		// 荷主ID
		if (clientId == null) {
			return null;
		}
		// 商品CD
		if (productCd == null) {
			return null;
		}

		MProduct conditionEntity = new MProduct();
		conditionEntity.setClientId(clientId);
		conditionEntity.setProductCd(productCd);
		MProduct entity = new MProduct();
		entity = productLogic.getUkEntity(conditionEntity);

		if (entity != null) {
			entity = productLogic.getUkEntityWithProductShapeWithShapeGrpDtlWithDeletedCheck(conditionEntity);
		}

		if (entity == null) {
			return null;
		}

		MProductDtoMapper mapper = new MProductDtoMapper();
		MProductDto dto = mapper.mappingToDto(entity);
		ProductDto resultDto = new ProductDto();
		resultDto.data.mProduct = dto;
		// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
		WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, entity);

		//商品单位
		dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, entity));
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
		return resultDto;
	}
	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add End

}
