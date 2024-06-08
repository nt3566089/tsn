package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingStatusProgressDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlShippingStatusProgressDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingStatusProgress;
import com.oneslogi.wms.dto.shipping.ShippingStatusProgressDto;
import com.oneslogi.wms.logic.shipping.ShippingStatusProgressSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/shippingStatusProgress")
public class ShippingStatusProgressResource extends AbstractWmsResource {
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe ENd
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 出庫指示一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 3;
		/**
		 * 出庫指示異常
		 */
		protected static final int SHIPPING_INST_ERROR = 4;
		/**
		 * 出庫指示解除異常
		 */
		protected static final int SHIPPING_INST_CANCEL_ERROR = 5;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 5;
		//dsx
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 6;
		//dsx
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingStatusProgressSelectLogic shippingStatusProgressSelectLogic;

	@GET
	@Path("/init")
	public ShippingStatusProgressDto init() {
		return new ShippingStatusProgressDto();
	}

	/**
	 * <h2>出荷ステータス別進捗データ取得</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、出荷ステータス別進捗データ取得
	 * </pre>
	 * @param deliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 * @return DeliveryCourseShippingListDto 配送コース別出荷進捗画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingStatusProgressDto search(ShippingStatusProgressDto shippingStatusProgressDto) {
		ShippingStatusProgressDto resultShippingStatusProgressDto = new ShippingStatusProgressDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper1 = new TShippingInstHDtoMapper();
		TShippingInstH tShippingInstH = headerMapper1.mappingToEntity(shippingStatusProgressDto.data.search);

		// 出荷ステータス別進捗データ取得用
		ListResultBean<SqlShippingStatusProgress> page = shippingStatusProgressSelectLogic.select(tShippingInstH, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultShippingStatusProgressDto;
		}

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
		// 区分値マスタより取得
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("SHIPPING_STATUS");
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl mCenterClassDtl : bClassList) {
			if (classCd.equals(mCenterClassDtl.getBClass().getClassCd())) {
				dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
			}else{
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(mCenterClassDtl.getClassDtlCd() , mCenterClassDtl.getVDict().getDictNm());
				classCd = mCenterClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		if (page.size() > 0) {
			for (SqlShippingStatusProgress list : page) {
				if (bClassMap.containsKey("SHIPPING_STATUS")) {
					if (bClassMap.get("SHIPPING_STATUS").containsKey(list.getShippingStatus())) {
						list.setShippingStatusNm(bClassMap.get("SHIPPING_STATUS").get(list.getShippingStatus()));
					}
				}
			}
		}

		// Dto変換処理
		SqlShippingStatusProgressDtoMapper mapper = new SqlShippingStatusProgressDtoMapper();
		List<SqlShippingStatusProgressDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultShippingStatusProgressDto.data.list = list;

		return resultShippingStatusProgressDto;
	}
}
