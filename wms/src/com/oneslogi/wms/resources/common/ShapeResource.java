package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.BDictCB;
import com.oneslogi.base.dbflute.cbean.MShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.BDictBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.wms.dto.common.ShapeDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 処理区分データ取得用リソースクラス
 */
@Path("/common/shapeCD")
public class ShapeResource extends AbstractWmsResource {

	@Inject
	private MShapeBhv mShapeBhv;
	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;
	@Inject
	private BDictBhv bDictBhv;
	// [Ver3.0] unit of measure対応 2017.11.27 NING End

	@GET
	@Path("/keyValueList")
	public ShapeDto getKeyValueList(@QueryParam("clientId") long clientId) {

		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.setupSelect_VDictByShapeDictId(getCultureId());
//
//		cb.setupSelect_MClient();
//		cb.query().setClientId_Equal(clientId);

//		cb.specify().columnShapeCd();
		cb.specify().specifyVDictByShapeDictId().columnDictNm();

		cb.query().scalar_Equal().max(new SubQuery<MShapeCB>() {

			@Override
			public void query(MShapeCB subCb) {
				subCb.specify().columnShapeId();
				setDelFlg(subCb);
			}
		});

//		final String shapeCd = "00";
//
//		cb.orScopeQuery(new OrQuery<MShapeCB>() {
//			@Override
//			public void query(MShapeCB orCB) {
//				if ("00".equals(shapeCd)) {
//					orCB.query().setShapeCd_Equal(shapeCd);
//				}
//			}
//		});

		cb.query().addOrderBy_ShapeCd_Asc();

		ListResultBean<MShape> mShape = mShapeBhv.selectList(cb);

		ShapeDto dto = new ShapeDto();
		for (MShape o : mShape) {
			ShapeDto.DropDownListData data = new ShapeDto.DropDownListData();
			data.shapeCd = o.getShapeCd();
			data.shapeNm = o.getVDictByShapeDictId().getDictNm();
			dto.data.add(data);
		}

		return dto;
	}

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	@GET
	@Path("/query")
	public ShapeDto query(@QueryParam("clientCd") String clientCd) {

		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.setupSelect_VDictByShapeDictId(getCultureId());
		// [Ver3.0] unit of measure対応 2017.12.27 NING Del

		cb.specify().columnShapeCd();
		cb.specify().specifyVDictByShapeDictId().columnDictNm();

		cb.query().addOrderBy_ShapeCd_Asc();

		ListResultBean<MShape> mShape = mShapeBhv.selectList(cb);

		ShapeDto dto = new ShapeDto();
		for (MShape o : mShape) {
			ShapeDto.DropDownListData data = new ShapeDto.DropDownListData();
			data.shapeCd = o.getShapeCd();
			data.shapeNm = o.getVDictByShapeDictId().getDictNm();
			dto.data.add(data);
		}

		return dto;
	}
	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

	// [エンハンス PH2.0] 商品荷姿マスタ一括取込 - 明細部内容を追加 2015.11.26 sja Start
	@GET
	@Path("/keyValueList2")
	public ShapeDto getKeyValueList2(@QueryParam("clientId") long clientId) {

		MShapeCB cb = mShapeBhv.newMyConditionBean();
		cb.setupSelect_VDictByShapeDictId(getCultureId());

		// [Ver3.0] unit of measure対応 2017.12.27 NING Del
		cb.specify().columnShapeCd();
		cb.specify().specifyVDictByShapeDictId().columnDictNm();

		cb.query().addOrderBy_ShapeCd_Asc();

		ListResultBean<MShape> mShape = mShapeBhv.selectList(cb);

		ShapeDto dto = new ShapeDto();
		for (MShape o : mShape) {
			ShapeDto.DropDownListData data = new ShapeDto.DropDownListData();
			data.shapeCd = o.getShapeCd();
			data.shapeNm = o.getVDictByShapeDictId().getDictNm();
			dto.data.add(data);
		}

		return dto;
	}
	// [エンハンス PH2.0] 商品荷姿マスタ一括取込 - 明細部内容を追加 2015.11.26 sja End

	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	@GET
	@Path("/keyValueList3")
	public ShapeDto getKeyValueList3(@QueryParam("clientCd") String clientCd) {

		// [Ver3.0][#3928] 削除フラグ自動検索無効化のコメントを無効にする 2018.03.06 shimizu Start

		// ※ 荷主マスタメンテナンスでドロップダウンを表示させるため、荷主の削除フラグは"1"でも"0"でも表示したい
		//  (自動で「削除フラグ = "0"」 をつけてしまうと削除した荷主の在庫管理単位が表示されなくなってしまう問題あり)
		//  自動削除フラグ条件付加を無効にして、必要なマスタに「削除フラグ = "0"」を条件追加する方法をとる
		this.setBehaviorAutoDelFlg(false);

		MShapeGrpDtlCB cb = mShapeGrpDtlBhv.newMyConditionBean();

		cb.setupSelect_MShapeGrp();
		cb.query().queryMShapeGrp().queryMClient().setClientCd_Equal(clientCd);
		// [#4627] 商品マスタメンテナンス(編集)画面に削除済の在庫管理単位が表示される 2018.05.21 kawana Start
		// setBehaviorAutoDelFlgの上に書いた理由により「削除フラグ = "0"」を追加する
		cb.query().setDelFlg_Equal_$0();
		cb.query().queryMShapeGrp().setDelFlg_Equal_$0();
		// [#4627] 商品マスタメンテナンス(編集)画面に削除済の在庫管理単位が表示される 2018.05.21 kawana End

		cb.setupSelect_MShape();

		cb.query().setShapeSort_Equal(new Long(1));

		BDictCB cbDictByShapeUnitDict = bDictBhv.newMyConditionBean();

		ListResultBean<MShapeGrpDtl> mShapeGrpDtl = mShapeGrpDtlBhv.selectList(cb);

		ShapeDto dto = new ShapeDto();
		for (MShapeGrpDtl o : mShapeGrpDtl) {
			ShapeDto.DropDownListData data = new ShapeDto.DropDownListData();
			data.shapeCd = String.valueOf(o.getMShapeGrp().getShapeGrpCd());

			// 荷姿単位辞書IDにより、辞書から荷姿単位名を取得する。
			cbDictByShapeUnitDict.query().setDictId_Equal(o.getMShape().getShapeDictId());
			BDict chkBDictByShapeUnitDict = bDictBhv.selectEntity(cbDictByShapeUnitDict);

			data.shapeNm = chkBDictByShapeUnitDict.getDictNm() + "（" + o.getMShapeGrp().getShapeGrpName() + "）";
			dto.data.add(data);
		}

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		// [Ver3.0][#3928] 削除フラグ自動検索無効化のコメントを無効にする 2018.03.06 shimizu End

		return dto;
	}
	// [Ver3.0] unit of measure対応 2017.11.27 NING End
}