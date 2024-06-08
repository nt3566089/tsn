package com.oneslogi.wms.resources.inventory;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryInpHistDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInpHistDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInpHist;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.wms.dto.inventory.InventoryHisSearchDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.ProductLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.inventory.InventoryHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 棚卸履歴検索画面のリソースクラス。
 */
@Path("/inventory/inventoryHistorySearch")
public class InventoryHistorySearchResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ステータス内のメッセージで確認画面表示
		 */
		protected static final int MESSAGE_CONFIRM = 1;
		/**
		 * 棚卸履歴検索データ取得異常
		 */
		protected static final int DATA_SEARCH_ERROR = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private InventoryHistorySelectLogic inventoryHistorySelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private UserLogic userLogic;
	//	@Inject
	//	private ZoneLogic zoneLogic;

	// [Ver3.0] unit of measure対応 2017.11.22 駱 Del


	// ===== 使用テーブル =====
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryHisSearchDto 棚卸履歴検索画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryHisSearchDto init() {
		return new InventoryHisSearchDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・棚卸履歴検索を行う
	 * </pre>
	 * @param inventoryHisSearchDto 棚卸履歴検索画面用DTO
	 * @return InventoryHisSearchDto 棚卸履歴検索画面用DTO
	 */
	@GET
	@Path("/search")
	public InventoryHisSearchDto search(InventoryHisSearchDto inventoryHisSearchDto) throws IOException {

		// [#5242][v2.2] ページング不正を修正 2018.08.27 kawana Start
		PagingData paging = inventoryHisSearchDto.paging;
		// [#5242][v2.2] ページング不正を修正 2018.08.27 kawana End

		// Entity変換
		TInventoryHDtoMapper mapperH = new TInventoryHDtoMapper();
		TInventoryH tInventoryH = mapperH.mappingToEntity(inventoryHisSearchDto.data.head);
		TInventoryBDtoMapper mapperB = new TInventoryBDtoMapper();
		TInventoryB tInventoryB = mapperB.mappingToEntity(inventoryHisSearchDto.data.body);
		TInventoryInstDtoMapper mapperI = new TInventoryInstDtoMapper();
		TInventoryInst tInventoryInst = mapperI.mappingToEntity(inventoryHisSearchDto.data.inst);
		MProductDtoMapper mapperMP = new MProductDtoMapper();
		MProduct mProduct = mapperMP.mappingToEntity(inventoryHisSearchDto.data.mpro);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(tInventoryH.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		// 荷主IDを設定
		tInventoryH.setClientId(mClient.getClientId());

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tInventoryH.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		// センタIDを設定
		tInventoryH.setCenterId(mCenter.getCenterId());

		// 倉庫ID取得
		MWarehouse mWarehouse = new MWarehouse();
		mWarehouse.setWarehouseCd(tInventoryB.getMWarehouse().getWarehouseCd());
		mWarehouse.setCenterId(mCenter.getCenterId());
		mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
		if (mWarehouse != null) {
			// 倉庫IDを設定
			tInventoryB.setWarehouseId(mWarehouse.getWarehouseId());
		}

		// 預託ID取得
		MCustomer mCustomer = new MCustomer();
		mCustomer.setCustomerCd(tInventoryB.getMCustomerByDepositId().getCustomerCd());
		mCustomer.setClientId(mClient.getClientId());
		mCustomer = customerLogic.getUkEntity(mCustomer);
		if (mCustomer != null) {
			// 預託IDを設定
			tInventoryInst.setDepositId(mCustomer.getCustomerId());
		}

		// 在庫区分ID取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(tInventoryB.getMStockType().getStockTypeCd());
		//		mStockType.setClientId(mClient.getClientId());
		mStockType = stockTypeLogic.getUkEntity(mStockType);
		if (mStockType != null) {
			// 在庫区分IDを設定
			tInventoryInst.setStockTypeId(mStockType.getStockTypeId());
		}

		// 商品ID取得
		MProduct getMProduct = new MProduct();
		getMProduct.setProductCd(mProduct.getProductCd());
		getMProduct.setClientId(mClient.getClientId());
		getMProduct = productLogic.getUkEntity(getMProduct);
		// 商品ID
		if (getMProduct != null) {
			mProduct.setProductId(mProduct.getProductId());
		}

		// ゾーンID
		//		MZone mZone = new MZone();
		//		mZone.setZoneCd(tInventoryInst.getMZone().getZoneCd());
		//		mZone = zoneLogic.getUkEntity(mZone);
		//		if (mZone != null) {
		//			tInventoryInst.setZoneId(mZone.getZoneId());
		//		}
		MZoneCB mZoneCB = mZoneBhv.newConditionBean();
		mZoneCB.query().setZoneCd_Equal(tInventoryInst.getMZone().getZoneCd());
		List<MZone> mzoneList = mZoneBhv.selectList(mZoneCB);
		List<Long> zoneIdList = new ArrayList<Long>();
		// ゾーンIDリストをセット
		for (MZone mZone : mzoneList) {
			zoneIdList.add(mZone.getZoneId());
		}

		// 検索
		PagingResultBean<TInventoryInpHist> page = inventoryHistorySelectLogic.select(tInventoryH, tInventoryB, tInventoryInst, mProduct, zoneIdList, paging, errRetSts(StatusCode.DATA_SEARCH_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		TInventoryInpHistDtoMapper mapperIH = new TInventoryInpHistDtoMapper();

		List<TInventoryInpHistDto> inpHistList = mapperIH.mappingToDtoList(page);
		List<TInventoryBDto> bodyList = new ArrayList<TInventoryBDto>();
		for (TInventoryInpHistDto inpHistDto : inpHistList) {
			// 棚卸ボディ
			TInventoryBDto tInventoryBDto2 = inpHistDto.getTInventoryB();

			TInventoryBDtoMapper tInventoryBDtoMapper = new TInventoryBDtoMapper();
			TInventoryB tInventoryB2 = tInventoryBDtoMapper.mappingToEntity(tInventoryBDto2);
			TInventoryBDto tInventoryBDto = tInventoryBDtoMapper.mappingToDto(tInventoryB2);

			// 引当可能数
			// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
			// ケース入数
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja Start
			// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng Start
			//Long unitNum = inpHistDto.getTInventoryB().getUnitNum();
			//Long unitNum = Long.valueOf(inpHistDto.getShapeUnitNum());
			// [ON推-品向-108] 明細棚卸ピース数に０を表示を修正しました 2014.11.20 zheng End
			MProductShape mProductShape = new MProductShape();
			mProductShape.setProductId(inpHistDto.getTInventoryB().getMProduct().getProductId());
			mProductShape.setClientId(mClient.getClientId());
			mProductShape.setCenterId(mCenter.getCenterId());
			mProductShape.setCaseFlg("1");
			//Long unitNum = CU.nullToZero(productShapeLogic.getUnitNum(mProductShape));
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja End

			// 棚卸数量
			BigDecimal inventoryNum = inpHistDto.getInventoryNum();

			// [Ver3.0] unit of measure対応 2017.11.22 駱 Del

			// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja Start
			//tInventoryBDto.setUnitNum(Long.valueOf(inpHistDto.getShapeUnitNum()));
			// [Ver3.0] unit of measure対応 2017.11.22 駱 Del
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.10 sja End

			// 棚卸数量
			tInventoryBDto.setInventoryNum(inventoryNum);

			// [Ver3.0] unit of measure対応 2017.11.22 駱 Start

			// 商品最小荷姿単位名称
			tInventoryBDto.setProductUnit(inpHistDto.getProductUnit());
			// 入数内訳
			tInventoryBDto.setUnitNumBreakdown(inpHistDto.getUnitNumBreakdown());
			// 棚卸前内訳
			tInventoryBDto.setInventoryBeforeBreakdown(inpHistDto.getInventoryBeforeBreakdown());
			// 棚卸内訳
			tInventoryBDto.setInventoryBreakdown(inpHistDto.getInventoryBreakdown());

			// [Ver3.0] unit of measure対応 2017.11.22 駱 End

			//入力者
			//[ON推-品向-106] 入力者Excelにユーザ名称で出力 2014.11.25 zheng Start
			BUser buser = new BUser();
			buser.setUserCd(inpHistDto.getAddUser());
			buser = userLogic.getUkEntity(buser);

			if (buser != null) {
				tInventoryBDto.setUpdUser(buser.getUserNm());
			} else {
				tInventoryBDto.setUpdUser(inpHistDto.getAddUser());
			}
			//[ON推-品向-106] 入力者Excelにユーザ名称で出力 2014.11.25 zheng End

			// 入力時間
			tInventoryBDto.setUpdDt(inpHistDto.getInputDt());

			bodyList.add(tInventoryBDto);
		}
		//検索結果詰込処理
		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
		inventoryHisSearchDto.paging = paging;
		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End

		inventoryHisSearchDto.data.bodyList = bodyList;

		return inventoryHisSearchDto;
	}
}
