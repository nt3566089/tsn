package com.oneslogi.wms.resources.receive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlReceiveStatusProgressDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlReceiveStatusProgressDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveStatusProgress;
import com.oneslogi.wms.dto.receive.ReceiveStatusProgressDto;
import com.oneslogi.wms.logic.receive.ReceiveStatusProgressSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/receive/receiveStatusProgress")
public class ReceiveStatusProgressResource extends AbstractWmsResource {

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End

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
		 * データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ReceiveStatusProgressSelectLogic receiveStatusProgressSelectLogic;

	@GET
	@Path("/init")
	public ReceiveStatusProgressDto init() {
		return new ReceiveStatusProgressDto();
	}

	/**
	 * <h2>入荷ステータス別進捗データ取得</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、入荷ステータス別進捗データ取得
	 * </pre>
	 * @param receiveStatusProgressDto 予定仕入先別入荷進捗画面用DTO
	 * @return ReceiveStatusProgressDto 予定仕入先別入荷進捗画面用DTO
	 */
	@GET
	@Path("/search")
	public ReceiveStatusProgressDto search(ReceiveStatusProgressDto receiveStatusProgressDto) {
		ReceiveStatusProgressDto resultReceiveStatusProgressDto = new ReceiveStatusProgressDto();

		// Entity変換
		TReceivePlanHDtoMapper headerMapper1 = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = headerMapper1.mappingToEntity(receiveStatusProgressDto.data.search);

		// 入荷ステータス別進捗データ取得用
		ListResultBean<SqlReceiveStatusProgress> page = receiveStatusProgressSelectLogic.select(tReceivePlanH, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultReceiveStatusProgressDto;
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
		classCdList.add("RECEIVE_STATUS");
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl bClassDtl : bClassList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
			}else{
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(bClassDtl.getClassDtlCd() , bClassDtl.getVDict().getDictNm());
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		if (page.size() > 0) {
			for (SqlReceiveStatusProgress list : page) {
				if (bClassMap.containsKey("RECEIVE_STATUS")) {
					if (bClassMap.get("RECEIVE_STATUS").containsKey(list.getReceiveStatus())) {
						list.setReceiveStatusNm(bClassMap.get("RECEIVE_STATUS").get(list.getReceiveStatus()));
					}
				}
			}
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End
		// Dto変換処理
		SqlReceiveStatusProgressDtoMapper mapper = new SqlReceiveStatusProgressDtoMapper();
		List<SqlReceiveStatusProgressDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultReceiveStatusProgressDto.data.list = list;

		return resultReceiveStatusProgressDto;
	}
}
