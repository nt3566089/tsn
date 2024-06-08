package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.bsbhv.BsTCcopamBhv;
import com.oneslogi.base.dbflute.cbean.MCrelaybsCB;
import com.oneslogi.base.dbflute.exbhv.MCrelaybsBhv;
import com.oneslogi.base.dbflute.exbhv.TCcopamBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTCcopamDataEntityPmb;
import com.oneslogi.base.dbflute.exentity.TCcopam;
import com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamDataEntity;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配車実績マスタデータ取得ロジッククラス
 */
public class CcopamSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TCcopamBhv tCcopamBhv;
	@Inject
	private MCrelaybsBhv mCrelaybsBhv;

	/**
	 * <h2>配車実績データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し配車実績データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param ccopamId 配車実績ID
	 * @param centerId 拠点ID
	 * @param clientId 荷主ID
	 * @param clientId 荷主ID
	 * @param supplierrCvFlg 輸送区分
	 * @return TCcopam 配車実績entity
	 */
	public TCcopam select(Long ccopamId, Long centerId, Long clientId, String supplierrCvFlg, ErrorStatus errSts) {
		String path = BsTCcopamBhv.PATH_selectSqlTCcopamDataEntity;

		SqlTCcopamDataEntityPmb pmb = new SqlTCcopamDataEntityPmb();
		pmb.setCcopamId(ccopamId);
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setSupplierrCvFlg(supplierrCvFlg);
		
		Class<SqlTCcopamDataEntity> entityType = SqlTCcopamDataEntity.class;
		List<SqlTCcopamDataEntity> list = tCcopamBhv.outsideSql().selectList(path,pmb,entityType);
		
		if (list.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		SqlTCcopamDataEntity sqlTCcopamDataEntity = list.get(0);
		
		TCcopam tCcopam = new TCcopam();
		// TD中継区分
		tCcopam.setTdrelayid(sqlTCcopamDataEntity.getTdrelayid());
		// 発送先CD
		tCcopam.setStcd(sqlTCcopamDataEntity.getStcd());
		// 発送番号(1)
		tCcopam.setSnno1(sqlTCcopamDataEntity.getSnno1());
		// 発送番号(2)
		tCcopam.setSnno2(sqlTCcopamDataEntity.getSnno2());
		// 発送番号(3)
		tCcopam.setSnno3(sqlTCcopamDataEntity.getSnno3());
		// 着地
		tCcopam.setLanding(sqlTCcopamDataEntity.getStcd());
		// 発送日
		tCcopam.setSnymd(sqlTCcopamDataEntity.getSnymd());
		// 到着日
		tCcopam.setArvymd(sqlTCcopamDataEntity.getArvymd());
		// 計画車種
		tCcopam.setPlncarknd(sqlTCcopamDataEntity.getPlncarknd());
		// 実績車種
		tCcopam.setAmcarknd(sqlTCcopamDataEntity.getAmcarknd());
		// 運輸業者名
		tCcopam.setTrannm(sqlTCcopamDataEntity.getTrannm());
		// 号車No.
		tCcopam.setCarno(sqlTCcopamDataEntity.getCarno());
		// 汎用パレット数
		tCcopam.setGnlpltqa(sqlTCcopamDataEntity.getGnlpltqa());
		// その他パレット数
		tCcopam.setOtpltqa(sqlTCcopamDataEntity.getOtpltqa());
		// 合計パレット数
		tCcopam.setRcvSumQty1Pallet(sqlTCcopamDataEntity.getSumpltqa()!=null?new BigDecimal(sqlTCcopamDataEntity.getSumpltqa()):null);
		// 個数
		tCcopam.setNo(sqlTCcopamDataEntity.getQty()!=null?new BigDecimal(sqlTCcopamDataEntity.getQty()):null);
		// 合計数
		tCcopam.setSum(sqlTCcopamDataEntity.getTotalnum()!=null?new BigDecimal(sqlTCcopamDataEntity.getTotalnum()):null);
		// 封印No.(1)
		tCcopam.setSelno1(sqlTCcopamDataEntity.getSelno1());
		// 封印No.(2)
		tCcopam.setSelno2(sqlTCcopamDataEntity.getSelno2());
		// 封印No.(3)
		tCcopam.setSelno3(sqlTCcopamDataEntity.getSelno3());
		
		return tCcopam;
	}
	
	public int selectMCrelaybsCount(String arvymd, ErrorStatus errSts) {
		MCrelaybsCB mCrelaybsCB = mCrelaybsBhv.newConditionBean();
		mCrelaybsCB.query().setDelFlg_Equal_$0();
		mCrelaybsCB.orScopeQuery(new OrQuery<MCrelaybsCB>() {
			public void query(MCrelaybsCB orCB) {
				orCB.query().setZzfrdateh_GreaterThan(arvymd);
				orCB.query().setZztodateh_LessThan(arvymd);
			}
		});
		int count = mCrelaybsBhv.selectCount(mCrelaybsCB);
		if (count > 0) {
			getErrorManager().add(errSts, WmsMessageConst.SHIPTO_RELAY_BASE_OUT_OF_PERIOD_ERROR);
			return count;
		}
		
		return count;
	}

}
