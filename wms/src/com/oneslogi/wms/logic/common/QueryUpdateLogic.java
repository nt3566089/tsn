package com.oneslogi.wms.logic.common;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 一括更新共通ロジッククラス
 */
public class QueryUpdateLogic extends AbstractWmsLogic {

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana Start

	/**
	 * <h2>条件指定での更新処理を行う(エラー回避用)。</h2>
	 * <pre>
	 * queryUpdateを使用した場合の次の問題を解決するために、検索条件で更新対象を一度検索し、
	 * 更新対象のデータを一括処理件数（上限数）ごとに更新する。
	 * (DBMSにより更新用SQLが異なり、DBMSによってはエラーとなる場合がある)
	 *
	 * 【問題】
	 * ・高度な条件を使用した時にエラー (exists句で自テーブルへの参照を含む場合など) [MySQL innoDB]
	 * ・大量データを処理するとメモリ不足エラー [MySQL innoDB]
	 * ・インデックス未使用の条件を指定した場合にテーブルロックがかかりデッドロックエラー [MySQL innoDB]
	 *
	 * </pre>
	 * @param bhv 更新テーブルBhv
	 * @param entity 更新値を設定したEntity
	 * @param cb 更新条件CB
	 * @param setter 更新クエリ
	 * @return int 更新件数
	 */
	public int queryUpdateWithSelect(AbstractBehaviorWritable<?, ?> bhv, Entity entity, AbstractConditionBean cb, AbstractQuerySetter setter) {
		return queryDeleteOrUpdateWithSelect(QueryType.UPDATE, bhv, entity, cb, setter);
	}

	/**
	 * <h2>条件指定での削除処理を行う(エラー回避用)。</h2>
	 * <pre>
	 * queryUpdateを使用した場合の次の問題を解決するために、検索条件で削除対象を一度検索し、
	 * 削除対象のデータを一括処理件数（上限数）ごとに削除する。
	 * (DBMSにより削除用SQLが異なり、DBMSによってはエラーとなる場合がある)
	 *
	 * 【問題】
	 * ・高度な条件を使用した時にエラー (exists句で自テーブルへの参照を含む場合など) [MySQL innoDB]
	 * ・大量データを処理するとメモリ不足エラー [MySQL innoDB]
	 * ・インデックス未使用の条件を指定した場合にテーブルロックがかかりデッドロックエラー [MySQL innoDB]
	 *
	 * </pre>
	 * @param bhv 削除テーブルBhv
	 * @param cb 削除条件CB
	 * @param setter 削除クエリ
	 * @return int 削除件数
	 */
	public int queryDeleteWithSelect(AbstractBehaviorWritable<?, ?> bhv, AbstractConditionBean cb, AbstractQuerySetter setter) {
		return queryDeleteOrUpdateWithSelect(QueryType.DELETE, bhv, null, cb, setter);
	}

	private int queryDeleteOrUpdateWithSelect(QueryType queryType, AbstractBehaviorWritable<?, ?> bhv, Entity entity, AbstractConditionBean cb, AbstractQuerySetter setter) {

		// 検索条件に上限を設定
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		final int batchDataCount = getPropertyIntValue(WmsPropertyConst.BATCH_DATA_COUNT);
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End

		// PKのみ取得するように設定
		setter.specifyPkOnly(cb);
		ListResultBean<? extends Entity> selectList = (ListResultBean<? extends Entity>) bhv.readList(cb);

		if (selectList.size() == 0) {
			// 対象なし
			return 0;
		}

		// 検索結果からPKのリストを取得
		List<Long> idList = setter.pullOutPkList(selectList);

		int allCount = 0;
		List<Long> inQueryIdList = new ArrayList<Long>();
		for (Long id : idList) {
			inQueryIdList.add(id);

			if (batchDataCount <= inQueryIdList.size()) {
				// ID件数が一括処理件数の上限に達した場合は削除実行

				// where句 に pk指定
				AbstractConditionBean inCb = setter.createCbInPkOnly(inQueryIdList);

				int count = 0;
				switch (queryType) {
				case DELETE:
					// queryDelete実行
					count = bhv.rangeRemove(inCb, null);
					break;
				case UPDATE:
					// queryUpdate実行
					count = bhv.rangeModify(entity, inCb, null);
					break;
				}
				allCount = allCount + count;

				// メモリ解放を早めるためにclearではなくnewを採用 (間違った認識であれば clear で可)
				inQueryIdList = new ArrayList<Long>();
			}
		}

		if (0 < inQueryIdList.size()) {
			// where句 に pk指定
			AbstractConditionBean inCb = setter.createCbInPkOnly(inQueryIdList);

			int count = 0;
			switch (queryType) {
			case DELETE:
				// queryDelete実行
				count = bhv.rangeRemove(inCb, null);
				break;
			case UPDATE:
				// queryUpdate実行
				count = bhv.rangeModify(entity, inCb, null);
				break;
			}
			allCount = allCount + count;
		}

		return allCount;
	}

	private enum QueryType {
		UPDATE,
		DELETE
	}

	/**
	 * queryDeleteWithSelectメソッド、queryUpdateWithSelectメソッドを使用するための引数
	 */
	public abstract static class AbstractQuerySetter {
		/**
		 * 引数のConditionBeanにPK項目のみ取得するように
		 * 設定を行う。
		 *
		 * @param cb
		 */
		protected abstract void specifyPkOnly(AbstractConditionBean cb);

		/**
		 * 検索結果からPK項目のみのリストを作成し返却する
		 * @param selectList 検索結果
		 * @return List<Long> PK項目のみのリスト
		 */
		protected abstract List<Long> pullOutPkList(ListResultBean<? extends Entity> selectList);

		/**
		 * Where句に PK項目のみを指定した検索条件(cb)を返却する (inを使用)
		 * @param pkList PK項目のリスト
		 */
		protected abstract AbstractConditionBean createCbInPkOnly(List<Long> pkList);
	}

	// [1.1.4-CT-072] デッドロック対策 queryUpdate,queryDaleteを変更 2016.06.07 kawana End
}
