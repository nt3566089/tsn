package com.oneslogi.wms.resources.common;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.dto.master.UserCenterDto;
import com.oneslogi.wms.logic.common.UserCenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザセンタデータ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/userCenter")
public class UserCenterResource extends AbstractWmsResource {

	// [#1815] ログインユーザが扱えるセンタであるかの判定APIを追加 2017.05.23 kawana Start

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
		 * センタ権限エラー
		 */
		protected static final int CENTER_ROLE_ERROR = 2;
	}

	// ===== 使用ロジック =====

	@Inject
	private UserCenterLogic userCenterLogic;

	@GET
	@Path("/keyValueList")
	public UserCenterDto getKeyValueList() {

		// ログインユーザに許可されたセンタリスト取得
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
		List<MCenter> centerList = userCenterLogic.getCenterList(UserCenterLogic.SelectCls.NO_DELETE_ONLY);
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

		UserCenterDto dto = new UserCenterDto();

		for (MCenter center : centerList) {
			UserCenterDto.DropDownListData data = new UserCenterDto.DropDownListData();
			data.centerId = center.getCenterId();
			data.centerCd = center.getCenterCd();
			data.centerNm = center.getCenterNm();
			dto.data.add(data);
		}

		return dto;
	}

	@GET
	@Path("/checkPermission")
	public StatusDto checkPermission(@QueryParam("centerCd") String centerCd) {

		userCenterLogic.checkPermission(centerCd, errRetSts(StatusCode.CENTER_ROLE_ERROR));
		return null;
	}

	// [#1815] ログインユーザが扱えるセンタであるかの判定APIを追加 2017.05.23 kawana End
}
