package com.oneslogi.wms.logic.master;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿グループマスタメンテナンス取得ロジッククラス。
 */
public class ShapeGroupMasterSearchSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MShapeGrpBhv mShapeGrpBhv;

	@Inject
	private MShapeGrpDtlBhv mShapeGrpDtlBhv;

	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>荷姿グループマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷姿グループマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 荷姿グループマスタ：荷姿グループID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public MShapeGrp selectById(MShapeGrp header, ErrorStatus errSts) {
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 荷姿グループメンテナンス(編集)データ取得 =====
		MShapeGrpCB cb = mShapeGrpBhv.newMyConditionBean();
		// ===== 取得テーブル =====
		cb.setupSelect_MClient();
		// ===== 検索条件 =====
		// 荷姿グループID
		cb.query().setShapeGrpId_Equal(header.getShapeGrpId());
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());
		// ===== 検索実行 =====
		MShapeGrp result = mShapeGrpBhv.selectEntity(cb);

		// ===== ０件チェック =====
		if (result== null) {
			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 荷姿グループマスタデータを取得

		mShapeGrpBhv.loadMShapeGrpDtlList(result, new ConditionBeanSetupper<MShapeGrpDtlCB>() {
			@Override
			public void setup(MShapeGrpDtlCB arg0) {
				arg0.setupSelect_MShape();
			}
		});

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ソート順
		if(result.getMShapeGrpDtlList().size() != 0){
			Collections.sort(result.getMShapeGrpDtlList(), new Comparator<MShapeGrpDtl>() {
				public int compare(MShapeGrpDtl arg0, MShapeGrpDtl arg1) {
					return arg0.getShapeSort().compareTo(arg1.getShapeSort());
				}
			});
		}

		return result;
	}

	/**
	 * <h2>荷姿グループに紐付く商品データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから商品マスタデータを取得する。
	 * 検索対象が見つからない場合は0を返すと共に。
	 * </pre>
	 * @param header 荷姿グループマスタ
	 * @return String 0:商品マスタ存在しない 2:商品マスタ存在
	 */
	public String selectMProductCount(MShapeGrp header) {
		//検索
		String  strRetValue = "0";
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 商品マスタデータ取得 =====
		MProductCB cb = mProductBhv.newMyConditionBean();
		// ===== 取得テーブル =====
		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MClient();
		// ===== 検索条件 =====
		// 荷姿グループID
		cb.query().setShapeGrpId_Equal(header.getShapeGrpId());
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());
		// ===== 検索実行 =====
		List<MProduct> result = mProductBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			strRetValue = "0";
		} else {
			strRetValue = "2";
		}

		return strRetValue;
	}

	/**
	 * <h2>荷姿ソート順が変更する場合のチェック。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷姿グループ明細マスタを取得する。
	 * 変更しない場合は0を返すと共に。
	 * </pre>
	 * @param header 荷姿グループマスタ
	 * @param body 荷姿グループ明細マスタ
	 * @return String 0:変更しない 1:ソート順変更する 2:以外変更する
	 */
	public String selectMShapeGrpDtlChange(MShapeGrp header,MShapeGrpDtl body) {
		//検索
		String  strRetValue = "0";
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 商品マスタデータ取得 =====
		MProductCB cb = mProductBhv.newMyConditionBean();
		// ===== 取得テーブル =====
		cb.setupSelect_MShapeGrp();
		cb.setupSelect_MClient();
		// ===== 検索条件 =====
		// 荷姿グループID
		cb.query().setShapeGrpId_Equal(header.getShapeGrpId());
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());
		// ===== 検索実行 =====
		List<MProduct> result = mProductBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			strRetValue = "0";
		} else {
			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			// ===== 荷姿グループ明細データ取得 =====
			MShapeGrpDtlCB cbSGT = mShapeGrpDtlBhv.newMyConditionBean();
			// ===== 検索条件 =====
			cbSGT.setupSelect_MShape();
			// 荷姿グループ明細ID
			cbSGT.query().setShapeGrpDtlId_Equal(body.getShapeGrpDtlId());
			// ===== 検索実行 =====
			MShapeGrpDtl resultSGT = mShapeGrpDtlBhv.selectEntity(cbSGT);
			//荷姿ソート順が変更する場合
			if (resultSGT != null) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.05 kawana Start
				if (!CU.nullToZero(resultSGT.getShapeSort()).equals(CU.nullToZero(body.getShapeSort()))) {

					strRetValue = "1";
				} else if (!CU.nullToStr(resultSGT.getMShape().getShapeCd()).equals(CU.nullToStr(body.getMShape().getShapeCd()))) {

					strRetValue = "1";
				} else if (!CU.nullToZero(resultSGT.getGtin14Symbol()).equals(CU.nullToZero(body.getGtin14Symbol()))) {

					strRetValue = "2";
				} else if (!CU.nullToStr(resultSGT.getCasePickFlg()).equals(CU.nullToStr(body.getCasePickFlg()))) {

					strRetValue = "2";
				} else if (!CU.nullToStr(resultSGT.getEmReplenishShapeFlg()).equals(CU.nullToStr(body.getEmReplenishShapeFlg()))) {

					strRetValue = "2";
				}
				// [#3868] FindBugsで発見したバグを修正 2018.03.05 kawana End
			}
		}
		return strRetValue;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>荷姿グループマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷姿グループマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param shapeGrpCd 荷姿グループCD
	 * @return MShapeGrp 荷姿グループマスタ
	 */
	public MShapeGrp selectByClientIdAndShapeGrpCd(Long clientId, String shapeGrpCd) {

		// ===== 荷姿グループメンテナンス(編集)データ取得 =====
		MShapeGrpCB cb = mShapeGrpBhv.newMyConditionBean();
		// ===== 検索条件 =====
		// 荷主IDの設定
		cb.query().setClientId_Equal(clientId);
		// 荷姿グループCDの設定
		cb.query().setShapeGrpCd_Equal(shapeGrpCd);
		// ===== 検索実行 =====
		MShapeGrp result = mShapeGrpBhv.selectEntity(cb);

		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
}
