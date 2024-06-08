package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 伝票別入荷一覧データ取得ロジッククラス
 */
public class ReceiveListToSlipSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private MessageLogic messageLogic;
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End

	/**
	 * <h2>伝票別入荷一覧データを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから伝票別入荷一覧データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：荷主ID・センタID・入荷予定日（From）・入荷予定日(To)・入荷ステータス
	 *                             ・削除データ表示フラグ・センタ間移動フラグ・予定仕入先CD・WMS入荷伝票No.・顧客入荷指示No.
	 * @param body 入庫実績ボディ：入庫日（From）・入庫日(To)
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<TReceivePlanH> 入荷予定ヘッダリスト
	 */
	public PagingResultBean<TReceivePlanH> select(final TReceivePlanH header, final TStoreRecordB body, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<TReceivePlanH> result = null;

		// ===== 伝票別入荷一覧データ取得 =====

		// 削除フラグの設定
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MCenter();
		cb.setupSelect_MCustomerByPlanSupplierId();
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 削除 Start
		//cb.setupSelect_MCenterClassDtlByReceiveStatus(getCenterClassCondition());
		//cb.setupSelect_MCenterClassDtlByReceiveDeliveryStatus(getCenterClassCondition());
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou  削除 End
		cb.setupSelect_TReceivePlanRAsOne();
		cb.setupSelect_MProcessType();
		cb.setupSelect_MProcessType().withVDict(getCultureId());
		// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi Start
		cb.setupSelect_MStockType();
		cb.setupSelect_MStockType().withVDict(getCultureId());
		// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi End

		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 削除 Start
		//cb.setupSelect_MCenterClassDtlByReceiveDeliveryStatus(getCenterClassCondition()).withVDict(getCultureId());
		//cb.setupSelect_MCenterClassDtlByReceiveStatus(getCenterClassCondition()).withVDict(getCultureId());
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou  削除 End

		// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
		setQueryCondition(cb, header, body);
		// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End

		//入庫実績ボディの入庫日の最大値を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 入庫日の設定
						subCB.specify().columnStoreDt();
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.ALIAS_lastStoreDt);

		//顧客入荷指示No.
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						//顧客入荷指示No.の設定
						subCB.specify().specifyTStoreRecordH().columnClientReceiveNo();
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_ClientReceiveNo);

		//入庫実績ボディの入庫数の合計値を抽出
		cb.specify().derivedTReceivePlanBList().sum(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().sum(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 入庫日の設定
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						subCB.specify().columnStoreNum();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.ALIAS_sumStoreNum, op -> op.coalesce(0));

		//入荷予定ボディの入荷予定数の合計値を抽出
		cb.specify().derivedTReceivePlanBList().sum(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().columnPlanNum();
				setDelFlg(subCB);
			}
		}, TReceivePlanH.ALIAS_sumPlanNum);

		//入荷予定ボディの入荷予定ボディIDのCOUNT値を抽出
		cb.specify().derivedTReceivePlanBList().count(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().columnReceivePlanBId();
				setDelFlg(subCB);
			}
		}, TReceivePlanH.ALIAS_sumPlanCount);

		//add by  qiuy 2014/08/21 start
		//入庫実績ヘッダの仕入先を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 仕入先Cdの設定
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						subCB.specify().specifyTStoreRecordH().specifyMCustomerBySupplierId().columnCustomerCd();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_CustomerCd);

		//入庫実績ヘッダの仕入先を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 仕入先Nmの設定
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						subCB.specify().specifyTStoreRecordH().specifyMCustomerBySupplierId().columnCustomerNm();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_CustomerNm);

		//入庫実績ヘッダの仕入先を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						// 仕入先略称の設定
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						//顧客入荷指示No.の設定
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						subCB.specify().specifyTStoreRecordH().specifyMCustomerBySupplierId().columnCustomerAbbr();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_customerAbbr);
		//add by  qiuy 2014/08/20 end

		//入庫実績ヘッダの処理区分CDを抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						//処理区分CDの設定
						subCB.specify().specifyTStoreRecordH().specifyMProcessType().columnProcessTypeCd();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_ProcessTypeCd);

		//入庫実績ヘッダの処理区分名称を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						//処理区分名称の設定
						subCB.specify().specifyTStoreRecordH().specifyMProcessType().specifyVDict(getCultureId()).columnDictNm();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_ProcessTypeNm);

		// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi Start
		//入庫実績ヘッダの在庫区分CDを抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						//在庫区分CDの設定
						subCB.specify().specifyTStoreRecordH().specifyMStockType().columnStockTypeCd();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_StockTypeCd);

		//入庫実績ヘッダの在庫区分名称を抽出
		cb.specify().derivedTReceivePlanBList().max(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.specify().derivedTStoreRecordBList().max(new SubQuery<TStoreRecordBCB>() {
					@Override
					public void query(TStoreRecordBCB subCB) {
						subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
						subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
						subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
						//在庫区分名称の設定
						subCB.specify().specifyTStoreRecordH().specifyMStockType().specifyVDict(getCultureId()).columnDictNm();
						setDelFlg(subCB);
					}
				}, null);
				setDelFlg(subCB);
			}
		}, TReceivePlanH.TRPB_StockTypeNm);
		// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi End

		// ソート条件：行No
		cb.query().addOrderBy_ReceivePlanDt_Asc();
		cb.query().addOrderBy_PlanClientReceiveNo_Asc();
		cb.query().addOrderBy_ReceiveSlipNo_Asc();

		// 検索実行
		result = selectPage(tReceivePlanHBhv, cb, paging);

		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start

		List<String> classCdList = new ArrayList<String>();
		classCdList.add("RECEIVE_STATUS");//入荷ステータス
		classCdList.add("RECEIVE_DELIVERY_STATUS");//入荷納品ステータス

		// 区分値マスタより取得
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		Map<String, Map<String, String>> bClassMap = this.getBClassInfo(classCdList);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End

		// 削除フラグの設定
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		} else {
			for (TReceivePlanH tReceivePlanH : result) {

				//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				// === 区分値マスタの名称の設定 ===
				//入荷ステータス
				tReceivePlanH.setBClassDtlByReceiveStatus(this.getBClassDtl(bClassMap, "RECEIVE_STATUS", tReceivePlanH.getReceiveStatus()));

				//入荷納品ステータス
				tReceivePlanH.setBClassDtlByReceiveDeliveryStatus(this.getBClassDtl(bClassMap, "RECEIVE_DELIVERY_STATUS", tReceivePlanH.getReceiveDeliveryStatus()));
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End

				// エラーメッセージCDの取得
				String errorMessageCd = tReceivePlanH.getErrorMessageCd();

				if (!CU.isNullOrEmpty(errorMessageCd)) {
					// メッセージCDの設定
					BMessage message = new BMessage();
					message.setMessageCd(errorMessageCd);
					message = messageLogic.getUkEntity(message);
					if (message != null) {
						tReceivePlanH.setMessageNm(message.getMessageNm());
					} else {
						tReceivePlanH.setMessageNm(null);
					}
				} else {
					tReceivePlanH.setMessageNm(null);
				}

				//元WMS入荷伝票№の取得
				Long oldReceivePlanHId = tReceivePlanH.getOldReceivePlanHId();

				if (oldReceivePlanHId != null) {
					TReceivePlanHCB cb1 = tReceivePlanHBhv.newMyConditionBean();
					cb1.query().setReceivePlanHId_Equal(oldReceivePlanHId);
					TReceivePlanH trh = tReceivePlanHBhv.selectEntity(cb1);
					if (trh != null) {
					    tReceivePlanH.setOldReceiveSlipNo(trh.getReceiveSlipNo());
					}
					else
					{
						tReceivePlanH.setOldReceiveSlipNo(null);
					}
				}
				else
				{
					tReceivePlanH.setOldReceiveSlipNo(null);
				}

			}
		}

		return result;
	}

	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana Start
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//	/**
//	 * <h2>伝票別入荷一覧の進捗用データ取得。</h2>
//	 * <pre>
//	 * 引数から検索条件を設定しデータベースから伝票別入荷一覧データを全件取得する
//	 * 取得する項目は進捗用の入荷ステータスと入荷予定ボディ件数のみ
//	 *
//	 * 【データ取得テーブル】
//	 * ・入荷予定ヘッダ（ベース）
//	 *
//	 * 【パラメータの使用項目】
//	 *  (入荷予定ヘッダ)
//	 *  ・荷主ID
//	 *  ・センタID
//	 *  ・入荷予定日(From)
//	 *  ・入荷予定日(To)
//	 *  ・入荷ステータス
//	 *  ・予定仕入先CD
//	 *  ・顧客入荷指示No.
//	 *  ・WMS入荷伝票No.
//	 *  (入庫実績ボディ)
//	 *  ・入庫日(From)
//	 *  ・入庫日(To)
//	 *
//	 * </pre>
//	 * @param header 入荷予定ヘッダ
//	 * @param body   入庫実績ボディ
//	 * @param errSts エラー時に設定するエラーステータス
//	 * @return List<TReceivePlanB> 進捗用データのみを抽出した全件リスト
//	 */
//	public List<TReceivePlanH> selectForProgress(final TReceivePlanH header, final TStoreRecordB body, ErrorStatus errSts) {
//
//		// 削除フラグの設定
//		this.setBehaviorAutoDelFlg(false);
//
//		// 検索条件の設定
//		TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
//		cb.specify().columnReceiveStatus();
//		//入荷予定ボディの入荷予定ボディIDのCOUNT値を抽出
//		cb.specify().derivedTReceivePlanBList().count(new SubQuery<TReceivePlanBCB>() {
//			@Override
//			public void query(TReceivePlanBCB subCB) {
//				subCB.specify().columnReceivePlanBId();
//				setDelFlg(subCB);
//			}
//		}, TReceivePlanH.ALIAS_sumPlanCount);
//
//		setQueryCondition(cb, header, body);
//
//		List<TReceivePlanH> resultList = tReceivePlanHBhv.selectList(cb);
//
//		// 削除フラグの設定(戻し)
//		this.setBehaviorAutoDelFlg(true);
//
//		return resultList;
//	}
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

	/**
	 * 引数のCBに検索条件を設定する
	 */
	private void setQueryCondition(TReceivePlanHCB cb, final TReceivePlanH header, final TStoreRecordB body) {
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		// センタIDの設定
		cb.query().setCenterId_Equal(header.getCenterId());

		// 入荷予定日の設定
		cb.query().setReceivePlanDt_GreaterEqual(header.getReceivePlanDtFrom());

		// 入荷予定日の設定
		cb.query().setReceivePlanDt_LessEqual(header.getReceivePlanDtTo());

		// 入荷ステータスの設定
		cb.query().setReceiveStatus_Equal(header.getReceiveStatus());

		// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana Start

		// 削除データ表示
		if (!CU.isNullOrEmpty(header.getDeleteDisplay())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.DeleteDataDisplay deleteDisplay = CDef.DeleteDataDisplay.codeOf(header.getDeleteDisplay());
			if (deleteDisplay == CDef.DeleteDataDisplay.$0) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				cb.query().setReceiveStatus_NotEqual_$90();
			}
		}

		// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
		// センタ間移動フラグの設定
		cb.query().setCenterTransitFlg_Equal(header.getCenterTransitFlg());
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

		// 予定仕入先CDの設定
		cb.query().setPlanSupplierCd_PrefixSearch(header.getPlanSupplierCd());

		// WMS入荷伝票No.の設定
		cb.query().setReceiveSlipNo_PrefixSearch(header.getReceiveSlipNo());

		// 顧客入荷指示No.の設定
		cb.query().setPlanClientReceiveNo_PrefixSearch(header.getPlanClientReceiveNo());

		// 入庫日絞り込み条件指定
		if (!CU.isNullOrEmpty(body.getStoreDtFrom()) || !CU.isNullOrEmpty(body.getStoreDtTo())
				|| !CU.isNullOrEmpty(header.getStoreClientReceiveNo())) {
			cb.query().existsTReceivePlanBList(new SubQuery<TReceivePlanBCB>() {
				@Override
				public void query(TReceivePlanBCB subCB) {
					subCB.query().existsTStoreRecordBList(new SubQuery<TStoreRecordBCB>() {
						@Override
						public void query(TStoreRecordBCB subCB) {
							subCB.query().setStoreDt_GreaterEqual(body.getStoreDtFrom());
							subCB.query().setStoreDt_LessEqual(body.getStoreDtTo());
							//顧客入荷指示No.の設定
							subCB.query().queryTStoreRecordH().setClientReceiveNo_PrefixSearch(header.getStoreClientReceiveNo());
							setDelFlg(subCB);
						}
					});
					setDelFlg(subCB);
				}
			});
		}
	}
	// [ON推-品向-510] 進捗率の計算がページ内のみのしかされない不具合を修正 2015.01.09 kawana End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start

	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 Start
	/**
	 * <h2>区分値マスタ情報（コード・名称）を取得</h2>
	 *
	 * @param classCdList 区分値CDのリスト
	 * @return Map<String, Map<String, String>> 区分値マスタ情報のマップ
	 */
	private Map<String, Map<String, String>> getBClassInfo(List<String> classCdList) {

		// 区分値マスタより取得
		if(classCdList == null || classCdList.isEmpty()){
			return null;
		}

		BClassDtlCB bClassDtlCB = bClassDtlBhv.newConditionBean();
		bClassDtlCB.specify().columnClassDtlCd();
		bClassDtlCB.specify().columnDictId();
		bClassDtlCB.setupSelect_BClass();
		bClassDtlCB.specify().specifyBClass().columnClassCd();
		bClassDtlCB.setupSelect_VDict(getCultureId());
		bClassDtlCB.specify().specifyVDict().columnDictNm();
		bClassDtlCB.query().queryBClass().setClassCd_InScope(classCdList);
		bClassDtlCB.query().queryBClass().addOrderBy_ClassCd_Asc();
		bClassDtlCB.query().addOrderBy_ClassDtlCd_Asc();

		List<BClassDtl> classList = bClassDtlBhv.selectList(bClassDtlCB);

		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		String classCd = "";
		Map<String, String> bClassDtlMap = new HashMap<String, String>();

		for(int i = 0; i < classList.size(); i ++) {

			BClassDtl bClassDtl = classList.get(i);

			if(!classCd.equals(bClassDtl.getBClass().getClassCd())) {

				if(!bClassDtlMap.isEmpty()) {
					bClassMap.put(classCd, bClassDtlMap);
					bClassDtlMap = new HashMap<String, String>();
				}

				classCd = bClassDtl.getBClass().getClassCd();
			}

			bClassDtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());

			if(i == classList.size() - 1){
				bClassMap.put(classCd, bClassDtlMap);
			}

		}

		return bClassMap;

	}

	/**
	 * <h2>区分値CDで区分値明細の情報を取得</h2>
	 *
	 * @param bClassMap 区分値マスタ情報のマップ
	 * @param classCd 区分値CD
	 * @param classDtlCd 区分値明細CD
	 * @return BClassDtl 区分値明細の情報
	 */
	private BClassDtl getBClassDtl(Map<String, Map<String, String>> bClassMap, String classCd, String classDtlCd) {
		BClassDtl bClassDtl = new BClassDtl();
		VDict vDict = new VDict();

		if (bClassMap != null && bClassMap.containsKey(classCd)) {
			if (bClassMap.get(classCd).containsKey(classDtlCd)) {
				vDict.setDictNm(bClassMap.get(classCd).get(classDtlCd));
			}
		}

		bClassDtl.setVDict(vDict);

		return bClassDtl;

	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	//[ON推-パフォーマンス改善対応] 区分値マスタの取得をJava側で行う 2016.01.25 chou 追加 End

}
