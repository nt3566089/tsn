package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.exbhv.MMfwhxitemBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlCenterProductControlMasterListPmb;
import com.oneslogi.base.dbflute.exentity.BProperty;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.dbflute.exentity.customize.SqlCenterProductControlMasterList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.PropertyLogic;

/**
 * センタマスタメンテナンス取得ロジッククラス
 * @param <SelectCondition>
 * @param <SqlCenterProductControlMasterList>
 */
public class CenterProductControlMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MMfwhxitemBhv mMfwhxitemBhv;
	// ===== 使用ロジッククラス =====
	@Inject
	private  PropertyLogic propertyLogic;
	// ===== 定数定義 =====
	public static final String PROPERTY_NM = "allowQueryCount";

	public List<SqlCenterProductControlMasterList> getSqlCenterProductControlMasterCount(MMfwhxitem header,ErrorStatus errSts) {

		//一覧(3)検索実行
		//一覧(A)検索条件から取引先マスタをリスト検索、レコード数を取得する。

		// 外出しSQLの定義
		String path = MMfwhxitemBhv.PATH_selectSqlCenterProductControlMasterList;

		//検索条件
		SqlCenterProductControlMasterListPmb pmb = new SqlCenterProductControlMasterListPmb();
		pmb.setCenterId(header.getCenterId());
		pmb.setClientId(header.getClientId());
		pmb.setProductCd_PrefixSearch(header.getProductCd());

		// 検索実行
	    Class<SqlCenterProductControlMasterList> entityType = SqlCenterProductControlMasterList.class;
	    List<SqlCenterProductControlMasterList> result = mMfwhxitemBhv.outsideSql().selectList(path, pmb, entityType);

		// 0件チェック
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			//return null;
		}

		// 1万件チェック
		 BProperty property = new BProperty();
		 property.setPropertyNm(PROPERTY_NM);
		 property = propertyLogic.getUkEntityWithDeletedCheck(property);

		 int PropertyNm = Integer.valueOf(property.getPropertyValue());

		 if (result.size() > PropertyNm){
			this.getErrorManager().add(errSts, WmsMessageConst.OVER_SAFETY_SIZE_ERROR, String.valueOf(PropertyNm));
			 return result;
		 }

		 return result;
	}

	public List<SqlCenterProductControlMasterList> getSqlCenterProductControlMasterList(MMfwhxitem header,PagingData paging, ErrorStatus errSts) {

		//(C)検索条件から拠点別銘柄制御マスタをリスト検索、拠点別銘柄制御マスタ項目を取得する。

		PagingResultBean<SqlCenterProductControlMasterList> result = null;

		// 外出しSQLの定義
		String path = MMfwhxitemBhv.PATH_selectSqlCenterProductControlMasterList;

		// 検索条件
		SqlCenterProductControlMasterListPmb pmb = new SqlCenterProductControlMasterListPmb();
		pmb.setCenterId(header.getCenterId());
		pmb.setClientId(header.getClientId());
		pmb.setProductCd_PrefixSearch(header.getMProduct().getProductCd());

		// 検索実行
		Class<SqlCenterProductControlMasterList> entityType = SqlCenterProductControlMasterList.class;
		result = selectPage(mMfwhxitemBhv, path, pmb, entityType, paging);

		//0件チェック
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		return result;

	}

}