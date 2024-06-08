package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlTCcopamReleaseControlNoUsedPmb;
import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlTCcopamSetControlNoUsedPmb;
import com.oneslogi.base.dbflute.cbean.TCcopamCB;
import com.oneslogi.base.dbflute.exbhv.TCcopamBhv;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamReleaseControlNoUsed;
import com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamSetControlNoUsed;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * コントロールNo.の設定ロジッククラス
 */
public class ShippingInstructionInfoPrintUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TCcopamBhv tCcopamBhv;

	// ===== 使用ロジッククラス =====

	/**
	 * <h2>コントロールNo.を設定する。</h2>
	 * <pre>
	 * 配車実績データを検索し、コントロールNo.を設定する。
	 * </pre>
	 * @param ccopamId 配車実績ID
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateControlNo(Long ccopamId, Long controlNo, ErrorStatus errSts) {

		// 配車実績の更新(queryUpdate)を行う
		// 外出しSQLの定義
		String pathTCcopamSetControlNoUsed = TCcopamBhv.PATH_selectSqlTCcopamSetControlNoUsed;

		// 引数定義
		BsSqlTCcopamSetControlNoUsedPmb pmbTCcopamSetControlNoUsed = new BsSqlTCcopamSetControlNoUsedPmb();
		
		// 引数.配車実績IDの値を設定
		pmbTCcopamSetControlNoUsed.setCcopamId(ccopamId);
		
		// 検索実行
		Class<SqlTCcopamSetControlNoUsed> entityType = SqlTCcopamSetControlNoUsed.class;
		SqlTCcopamSetControlNoUsed sqlTCcopamSetControlNoUsed;

		sqlTCcopamSetControlNoUsed = tCcopamBhv.outsideSql().entityHandling().selectEntity(pathTCcopamSetControlNoUsed, pmbTCcopamSetControlNoUsed, entityType);
		
		if (sqlTCcopamSetControlNoUsed == null) {
			// 取得した件数 = 0 場合
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
		} else {
			// 取得した件数 > 0 場合
			TCcopamCB tCcopamCB= tCcopamBhv.newConditionBean();
			TCcopam tCcopam = new TCcopam();
			
			tCcopamCB.query().setCcopamId_Equal(ccopamId);
			tCcopamCB.query().setVersionNo_Equal(sqlTCcopamSetControlNoUsed.getVersionNo());
			tCcopam.setControlNo(controlNo);
			
			tCcopamBhv.queryUpdate(tCcopam, tCcopamCB);
		}

	}
	
	/**
	 * <h2>コントロールNo.を解放する。</h2>
	 * <pre>
	 * 配車実績データを検索し、コントロールNo.を解放する。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void releaseControlNo(Long controlNo, ErrorStatus errSts) {

		// 配車実績の更新(queryUpdate)を行う
		// 外出しSQLの定義
		String pathTCcopamReleaseControlNoUsed = TCcopamBhv.PATH_selectSqlTCcopamReleaseControlNoUsed;

		// 引数定義
		BsSqlTCcopamReleaseControlNoUsedPmb pmbTCcopamReleaseControlNoUsed = new BsSqlTCcopamReleaseControlNoUsedPmb();
		
		// 引数.コントロールNo.の値を設定
		pmbTCcopamReleaseControlNoUsed.setControlNo(controlNo);
		
		// 検索実行
		Class<SqlTCcopamReleaseControlNoUsed> entityType = SqlTCcopamReleaseControlNoUsed.class;
		SqlTCcopamReleaseControlNoUsed sqlTCcopamReleaseControlNoUsed;

		sqlTCcopamReleaseControlNoUsed = tCcopamBhv.outsideSql().entityHandling().selectEntity(pathTCcopamReleaseControlNoUsed, pmbTCcopamReleaseControlNoUsed, entityType);
		
		if (sqlTCcopamReleaseControlNoUsed != null) {
			// 取得した件数 > 0 場合
			TCcopamCB tCcopamCB= tCcopamBhv.newConditionBean();
			TCcopam tCcopam = new TCcopam();
			
			tCcopamCB.query().setCcopamId_Equal(sqlTCcopamReleaseControlNoUsed.getCcopamId());
			tCcopamCB.query().setVersionNo_Equal(sqlTCcopamReleaseControlNoUsed.getVersionNo());
			tCcopam.setControlNo(null);
			
			tCcopamBhv.queryUpdate(tCcopam, tCcopamCB);
		}

	}

	/**
	 * <h2>配車実績の更新</h2>
	 * <pre>
	 * コントロールNo.設定
	 * コントロールNo.解放
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param tCcopam 配車実績ENTITY
	 */
	public void updateControlNoEdit(Long controlNo, TCcopam tCcopam) {
		TCcopam entity = tCcopamBhv.newEntity();
		if (tCcopam != null) {
			entity.setControlNo(controlNo);

			TCcopamCB tCcopamCB = tCcopamBhv.newConditionBean();
			tCcopamCB.query().setCcopamId_Equal(tCcopam.getCcopamId());
			
			tCcopamBhv.queryUpdate(entity, tCcopamCB);
		}else {
			entity.setControlNo(null);
			
			TCcopamCB tCcopamCB = tCcopamBhv.newConditionBean();
			tCcopamCB.query().setControlNo_Equal(controlNo);
			
			tCcopamBhv.queryUpdate(entity, tCcopamCB);
		}
	}

	/**
	 * <h2>配車実績の更新</h2>
	 * <pre>
	 * 画面項目入力、配車実績の更新。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param tCcopam 配車実績ENTITY
	 * @param gnlpltqa 汎用パレット数
	 */
	public void editUpdate(Long controlNo, TCcopam tCcopam, Long gnlpltqa) {
		TCcopam entity = tCcopamBhv.newEntity();
		// 発送番号(1)
		entity.setSnno1(tCcopam.getSnno1());
		// 発送番号(2)
		entity.setSnno2(tCcopam.getSnno2());
		// 発送番号(3)
		entity.setSnno3(tCcopam.getSnno3());
		// 号車No.
		entity.setCarno(tCcopam.getCarno());
		// 発送日
		entity.setSnymd(tCcopam.getSnymd());
		// 到着日
		entity.setArvymd(tCcopam.getArvymd());
		// 発送元CD
		entity.setSfcd(tCcopam.getCenterCd());
		// 発送先CD
		entity.setStcd(tCcopam.getStcd());
		// 汎用パレット数
		entity.setGnlpltqa(gnlpltqa);
		// その他パレット数
		entity.setOtpltqa(tCcopam.getOtpltqa());
		// 計画車種
		entity.setPlncarknd(tCcopam.getPlncarknd());
		// 実績車種
		entity.setAmcarknd(tCcopam.getAmcarknd());
		// 封印No.(1)
		entity.setSelno1(tCcopam.getSelno1());
		// 封印No.(2)
		entity.setSelno2(tCcopam.getSelno2());
		// 封印No.(3)
		entity.setSelno3(tCcopam.getSelno3());
		// 運輸業社名
		entity.setTrannm(tCcopam.getTrannm());
		// TD中継区分
		entity.setTdrelayid(tCcopam.getTdrelayid());
		
		TCcopamCB tCcopamCB = tCcopamBhv.newConditionBean();
		tCcopamCB.query().setControlNo_Equal(controlNo);
		
		tCcopamBhv.queryUpdate(entity, tCcopamCB);
	}
	
	/**
	 * <h2>配車実績登録</h2>
	 * <pre>
	 * 画面項目入力、配車実績登録。
	 * </pre>
	 * @param tCcopam 配車実績ENTITY
	 * @param gnlpltqa 汎用パレット数
	 * @param centerId 拠点ID
	 * @param clientId 荷主ID
	 * @param centerCd 拠点CD
	 */
	public void tCcopamInsert(TCcopam tCcopam, Long gnlpltqa, Long centerId, Long clientId, String centerCd) {
		TCcopam entity = tCcopamBhv.newEntity();
		// 拠点ID
		entity.setCenterId(centerId);
		// 荷主ID
		entity.setClientId(clientId);
		// 組織CD
		entity.setZzorgncd(centerCd);
		// 発送番号(1)
		entity.setSnno1(" ");
		// 発送番号(2)
		entity.setSnno2(" ");

		// [TSN］輸送番号設定用の現シーケンスを取得する処理
		// 現シーケンス取得 (採番キー未提供の為適当な値を代入)
		String sequence = null;
		sequence = "001";
		//[TSN］採番キー未提供
//		sequence = numberingLogic.getNumbering(centerId XXXXXXXXX)
		String landing = tCcopam.getLanding();
		// 発送番号(3)
		entity.setSnno3(landing + sequence);

		// 号車No.
		entity.setCarno(tCcopam.getCarno());
		// 発送日
		entity.setSnymd(tCcopam.getSnymd());
		// 到着日
		entity.setArvymd(tCcopam.getArvymd());
		// 発送元CD
		entity.setSfcd(tCcopam.getCenterCd());
		// 発送先CD
		entity.setStcd(tCcopam.getLanding());
		// 汎用パレット数
		entity.setGnlpltqa(gnlpltqa);
		// その他パレット数
		entity.setOtpltqa(tCcopam.getOtpltqa());
		// 計画車種
		entity.setPlncarknd(tCcopam.getPlncarknd());
		// 実績車種
		entity.setAmcarknd(tCcopam.getAmcarknd());
		// 封印No.(1)
		entity.setSelno1(tCcopam.getSelno1());
		// 封印No.(2)
		entity.setSelno2(tCcopam.getSelno2());
		// 封印No.(3)
		entity.setSelno3(tCcopam.getSelno3());
		// 運輸業社名
		entity.setTrannm(tCcopam.getTrannm());
		// TD中継区分
		entity.setTdrelayid(tCcopam.getTdrelayid());
		
		tCcopamBhv.insert(entity);
		
		tCcopam.setCcopamId(entity.getCcopamId());
	}

}
