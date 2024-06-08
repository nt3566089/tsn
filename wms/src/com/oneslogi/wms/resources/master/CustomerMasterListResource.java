package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CustomerMasterListDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CustomerMasterListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 特約店マスタメンテナンス(一覧)画面のリソースクラス。
 */
@Path("/master/customerMasterList")
public class CustomerMasterListResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 2;
		/**
		 * 荷主取得エラー
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private  ClientLogic clientLogic;

	@Inject
	private CustomerMasterListSelectLogic customerMasterListSelectLogic;

	@Inject
	private MCenterBhv mCenterBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CustomerMasterListDto 特約店マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public CustomerMasterListDto init() {

		return new CustomerMasterListDto();
	}

	/**
	 * <h2>特約店マスタメンテナンス(一覧)データ取得</h2>
	 * <pre>
	 * データベースに特約店マスタメンテナンス(一覧)データを取得する
	 * </pre>
	 *@return CustomerMasterListDto 特約店マスタメンテナンス(一覧)画面用DTO
	 *@param dto 特約店マスタメンテナンス(一覧)画面用DTO
	 *@param errSts エラー時に設定するエラーステータス
	 */
	 @GET
	 @Path("/selectByConditions")
	 public CustomerMasterListDto selectByConditions(CustomerMasterListDto dto){

		 //(1)ENTITY変換
		 //(A)リクエスト.特約店マスタメンテナンス(一覧)用DTO.検索条件を取引先マスタENTITYに変換する。
		 MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		 MCustomer customer = mapper.mappingToEntity(dto.data.head);

		 //(2)荷主ID取得
		 //(A)検索.荷主から荷主マスタを単一検索、荷主IDを取得する。
		 MClient clientCondition = new MClient();
		 clientCondition.setClientCd(dto.data.head.getMClient().getClientCd());
		 clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
			if (clientCondition == null) {
				getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
				return null;
			}
		 long clientId = clientCondition.getClientId();
		 customer.setClientId(clientId);

		 //(3)検索実行
		customerMasterListSelectLogic.selectCount(customer, errRetSts(StatusCode.SEARCH_DATA_ERROR));

		// エラー有りの場合は終了
		if(getErrorManager().size()>0){
			return null;
		}

		PagingResultBean<MCustomer> customerList = customerMasterListSelectLogic.selectByConditions(customer, dto.paging, errRetSts(StatusCode.SEARCH_DATA_ERROR));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		//[TSN] 一覧画面のLogisticsCdをセンタマスタで検索し、centerNmを入れて画面表示させる。yamamototo start
		List<MCustomer> centerList = new ArrayList<MCustomer>();
		 for (MCustomer mCustomer : customerList) {
//			 if (mCustomer.getMCustomerSubAsOne().getLogisticsCd() != null) {
//				 MCenterCB mCenterCb = mCenterBhv.newMyConditionBean();
//			 	 mCenterCb.query().setCenterCd_Equal(mCustomer.getMCustomerSubAsOne().getLogisticsCd());
//			 	 MCenter mCenter = mCenterBhv.selectEntity(mCenterCb);
//			 	 mCustomer.setCenterNm(mCenter.getCenterNm());
//			 }
			 centerList.add(mCustomer);
		}
		//[TSN] 一覧画面のLogisticsCdをでセンタマスタで検索し、centerNmを入れて画面表示させる。yamamototo end

		//Entity-Dto変換処理
		List<MCustomerDto> list = mapper.mappingToDtoList(centerList);

		dto.data.body = list;

		return dto;
	 }

}
