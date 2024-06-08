package com.oneslogi.wms.logic.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MUserDepositCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MUserDepositBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MUserDeposit;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタ共通ロジッククラス
 */
public class CustomerLogic extends AbstractWmsLogic {

	@Inject
	private MCustomerBhv mCustomerBhv;
	// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End
	// [#3156] 預託公開用のメソッド追加 2017.12.12 kawana Start
	@Inject
	private MUserDepositBhv mUserDepositBhv;
	// [#3156] 預託公開用のメソッド追加 2017.12.12 kawana End

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取引先マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取引先マスタ：取引先ID
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getPkEntityWithDeletedCheck(MCustomer entity) {
		if (entity.getCustomerId() == null) {
			return null;
		}
		return mCustomerBhv.selectByPKValueWithDeletedCheck(entity.getCustomerId());
	}

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取引先マスタデータを取得する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先ID
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getPkEntity(MCustomer entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に取引先マスタデータを取得する。
	 *  検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getPkEntity(MCustomer entity, ErrorStatus errSts) {
		MCustomer resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "customerNotFoundError");
		}
		return resultEntity;
	}

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取引先マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取引先マスタ：荷主ID・取引先CD・仕入先フラグ
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getUkEntityWithDeletedCheck(MCustomer entity) {

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getCustomerCd())) {
			return null;
		}

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setCustomerCd_Equal(entity.getCustomerCd());
		cb.query().setVendorFlg_Equal(entity.getVendorFlg());
		return mCustomerBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取引先マスタデータを取得する。
	 * </pre>
	 * @param entity 取引先マスタ：荷主ID・取引先CD・仕入先フラグ
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getUkEntity(MCustomer entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>取引先マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に取引先マスタデータを取得する。
	 *  検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取引先マスタ：荷主ID・取引先CD・仕入先フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getUkEntity(MCustomer entity, ErrorStatus errSts) {
		MCustomer resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, "customerNotFoundError");
		}
		return resultEntity;
	}

	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana Start

	/**
	 * <h2>預託取引先を検索する。</h2>
	 * <pre>
	 * 荷主ID、取引先CDに紐づく取引先データを取得する。
	 *  検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getDepositCustomer(MCustomer entity, ErrorStatus errSts) {

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.checkInvalidQuery();
		cb.query().queryMClient().setClientId_Equal(entity.getClientId());
		cb.query().setCustomerCd_Equal(entity.getCustomerCd());
		cb.query().setDepositFlg_Equal_$1();

		MCustomer mCustomer = null;
		try {
			mCustomer = mCustomerBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
		}
		return mCustomer;
	}

	// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana End

	/**
	 * <h2>預託先リストを検索する。</h2>
	 * <pre>
	 * 荷主CDに紐づく預託先マスタデータを取得する。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return ListResultBean<MCustomer> 取引先マスタリスト
	 */
	public ListResultBean<MCustomer> getDepositListByClientCd(MClient entity) {

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryMClient().setClientCd_Equal(entity.getClientCd());
		cb.query().setDepositFlg_Equal_$1();
		cb.query().addOrderBy_CustomerCd_Asc();

		return mCustomerBhv.selectList(cb);
	}

	// [#3156] 預託公開用のメソッド追加 2017.12.12 kawana Start

	/**
	 * <h2>預託先リストを検索する。(ユーザ権限による制限あり)</h2>
	 * <pre>
	 * 荷主CDに紐づく預託先マスタデータを取得する。
	 * ログインユーザが扱える預託のみを対象とし、
	 * 扱えない預託は返却するリストには含めない。
	 * </pre>
	 * @param entity 荷主マスタ：荷主CD
	 * @return List<MCustomer> 取引先マスタリスト
	 */
	public List<MCustomer> getDepositListByClientCdLimitUser(MClient entity) {

		// ユーザ預託マスタから預託を検索
		MUserDepositCB cb = mUserDepositBhv.newMyConditionBean();
		cb.setupSelect_MCustomer();

		// 検索条件
		cb.checkInvalidQuery();
		cb.query().setUserId_Equal(getUserId());
		cb.query().queryMCustomer().queryMClient().setClientCd_Equal(entity.getClientCd());
		cb.query().queryMCustomer().setDepositFlg_Equal_$1();

		// 並び順
		cb.query().queryMCustomer().addOrderBy_CustomerCd_Asc();

		// 検索実行
		List<MUserDeposit> userDepositList = mUserDepositBhv.selectList(cb);

		if (userDepositList.isEmpty()) {
			// 絞込みなし - 全預託を返却
			return getDepositListByClientCd(entity);
		}

		return mUserDepositBhv.pulloutMCustomer(userDepositList);
	}

	// [#3156] 預託公開用のメソッド追加 2017.12.12 kawana End

	// [#1855] エラー追加なしの仕入先取得を追加 2017.06.02 kawana Start

	/**
	 * <h2>仕入先データを検索する。</h2>
	 * <pre>
	 * 荷主IDと取引先CDに紐づく仕入先データを取得する。
	 *  検索対象が見つからない場合、nullを返却。
	 * </pre>
	 * @param entity 取引先マスタ：取引先CD・荷主ID
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getVendorCustomerByClientCd(MCustomer entity) {

		return getVendorCustomerByClientCd(entity, null);
	}

	// [#1855] エラー追加なしの仕入先取得を追加 2017.06.02 kawana End

	/**
	 * <h2>仕入先データを検索する。</h2>
	 * <pre>
	 * 荷主IDと取引先CDに紐づく仕入先データを取得する。
	 *  検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getVendorCustomerByClientCd(MCustomer entity, ErrorStatus errSts) {
		MCustomer mCustomer = null;
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.checkInvalidQuery();
		cb.query().setCustomerCd_Equal(entity.getCustomerCd());
		cb.query().queryMClient().setClientId_Equal(entity.getClientId());
		cb.query().setVendorFlg_Equal_$1();
		cb.query().addOrderBy_CustomerCd_Asc();

		try {
			mCustomer = mCustomerBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
		}
		return mCustomer;
	}

	// [#1855] エラー追加なしの納品先取得を追加 2017.06.02 kawana Start

	/**
	 * <h2>納品先データを検索する。</h2>
	 * <pre>
	 * 荷主ID、取引先CDに紐づく取引先データを取得する。
	 *  検索対象が見つからない場合、nullを返却。
	 * </pre>
	 * @param entity 取引先マスタ：取引先CD・荷主ID
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getDeliveryCustomer(MCustomer entity) {

		return getDeliveryCustomer(entity, null);
	}

	// [#1855] エラー追加なしの納品先取得を追加 2017.06.02 kawana End

	/**
	 * <h2>納品先データを検索する。</h2>
	 * <pre>
	 * 荷主ID、取引先CDに紐づく取引先データを取得する。
	 *  検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getDeliveryCustomer(MCustomer entity, ErrorStatus errSts) {
		MCustomer mCustomer = null;
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.checkInvalidQuery();
		cb.query().setCustomerCd_Equal(entity.getCustomerCd());
		cb.query().queryMClient().setClientId_Equal(entity.getClientId());
		cb.query().setDeliveryFlg_Equal_$1();
		cb.query().addOrderBy_CustomerCd_Asc();

		try {
			mCustomer = mCustomerBhv.selectEntityWithDeletedCheck(cb);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
		}
		return mCustomer;
	}

	/**
	 * <h2>取引先データを検索する。</h2>
	 * <pre>
	 * 荷主CDと取引先CDに紐づく取引先マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 取引先マスタ：荷主CD・取引先CD
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer getDeliveryCustomerByClientCd(MCustomer entity) {

		if (CU.isNullOrEmpty(entity.getClientCd())) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getCustomerCd())) {
			return null;
		}

		MCustomer mCustomer = null;
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.checkInvalidQuery();
		cb.query().setCustomerCd_Equal(entity.getCustomerCd());
		cb.query().queryMClient().setClientCd_Equal(entity.getClientCd());
		cb.query().setDeliveryFlg_Equal_$1();

		mCustomer = mCustomerBhv.selectEntity(cb);
		return mCustomer;
	}

	/**
	 * <h2>登録時取引先CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・取引先CD重複チェック
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @return boolean (true:取引先CD重複)
	 */
	public boolean checkCustomerCdInsert(MCustomer mCustomer) {
		boolean result = false;
		result = checkCustomerCdInsert(mCustomer, null);
		return result;
	}

	/**
	 * <h2>登録時取引先CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタのデータを検索し、
	 * 検索結果が1件以上の場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：取引先CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:取引先CD重複)
	 */
	public boolean checkCustomerCdInsert(MCustomer mCustomer, ErrorStatus errSts) {

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCustomerCd_Equal(mCustomer.getCustomerCd());
		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI Start
		cb.query().queryMClient().setClientId_Equal(mCustomer.getClientId());
		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI End
		int count = mCustomerBhv.selectCount(cb);

		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [新WMS-110-016] マスタメンテでは削除済データもチェックされるように修正 2015.07.14 kawana End

		if (count > 0) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時取引先CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 下記のチェックを行う。
	 * ・取引先CD重複チェック
	 * </pre>
	 * @param mCustomer 取引先マスタ：全項目
	 * @return boolean (true:取引先CD重複)
	 */
	public boolean checkCustomerCdUpdate(MCustomer mCustomer) {
		boolean result = false;
		result = checkCustomerCdUpdate(mCustomer, null);
		return result;
	}

	/**
	 * <h2>更新時取引先CD重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタのデータを検索し、
	 * 引数と取得結果の取引先IDが異なる場合、登録済エラーをエラー情報として管理する。
	 * </pre>
	 * @param mCustomer 取引先マスタ：取引先CD・荷主ID・取引先ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:取引先CD重複)
	 */
	public boolean checkCustomerCdUpdate(MCustomer mCustomer, ErrorStatus errSts) {
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCustomerCd_Equal(mCustomer.getCustomerCd());
		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI Start
		cb.query().queryMClient().setClientId_Equal(mCustomer.getClientId());
		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI End
		MCustomer customer = mCustomerBhv.selectEntity(cb);

		if (customer != null && customer.getCustomerId().longValue() != mCustomer.getCustomerId().longValue()) {
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//this.getErrorManager().add(errSts, WmsMessageConst.CUSTOMER_CODE_DUPLICATE_ERROR);
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			return true;
		}
		return false;
	}

	// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
	/**
	 * <h2>在庫の存在チェックを行う。</h2>
	 * <pre>
	 * 取引先が在庫の預託または仕入先として使用されている場合はtrueを返す。
	 * </pre>
	 * @param entity 取引先マスタ：荷主ID、取引先CD
	 * @return boolean true : 在庫あり 、 false : 在庫なし
	 */
	public boolean existStock(MCustomer entity) {

		if (entity.getClientId() == null) {
			return false;
		}
		if (CU.isNullOrEmpty(entity.getCustomerCd())) {
			return false;
		}

		MCustomerCB mcustomer = mCustomerBhv.newMyConditionBean();
		mcustomer.checkInvalidQuery();
		mcustomer.query().setCustomerCd_Equal(entity.getCustomerCd());
		mcustomer.query().queryMClient().setClientId_Equal(entity.getClientId());
		// [検査-096] 在庫チェック追加。 2014.12.06 KI Start
		//mcustomer.query().setDepositFlg_Equal_$1();
		// [検査-096] 在庫チェック追加。 2014.12.06 KI End
		MCustomer customer = mCustomerBhv.selectEntity(mcustomer);

		if (customer == null) {
			return false;
		}

		TStockCB depositCb = tStockBhv.newMyConditionBean();
		depositCb.query().setDepositId_Equal(customer.getCustomerId());
		ListResultBean<TStock> depositStockList = tStockBhv.selectList(depositCb);
		if (depositStockList.size() != 0) {
			// 預託として使用あり
			return true;
		}

		TStoreNoCB supplierCb = tStoreNoBhv.newMyConditionBean();
		supplierCb.query().setSupplierId_Equal(customer.getCustomerId());
		ListResultBean<TStoreNo> supplierStockList = tStoreNoBhv.selectList(supplierCb);
		if (supplierStockList.size() != 0) {
			// 仕入先として使用あり
			return true;
		}

		return false;
	}

	// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End

	// レスポンス対策 2016.02.24 kawana Start

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start

	/**
	 * <h2>センタを取得する。</h2>
	 * <pre>
	 * 引数の取引先ID、荷主IDを使用しセンタマスタを検索し返却する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先ID・荷主ID
	 * @return MCenter センタマスタ
	 */
	public MCenter getCenter(MCustomer entity) {

		return getCenter(entity, false);
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

	/**
	 * <h2>センタを取得する(キャッシュ使用)。</h2>
	 * <pre>
	 * 引数の取引先ID、荷主IDを使用しセンタマスタを検索し返却する。
	 * </pre>
	 * @param entity 取引先マスタ：取引先ID・荷主ID
	 * @return MCenter センタマスタ
	 */
	public MCenter getCenterCacheable(MCustomer entity) {

		return getCenter(entity, true);
	}

	/**
	 * センタを取得
	 * 引数の取引先ID、荷主IDを使用しセンタマスタを検索し返却する
	 *
	 * @param entity 取引先マスタ：取引先ID・荷主ID
	 * @param cacheable キャッシュ使用有無
	 * @return 取引先のセンタマスタ
	 */
	private MCenter getCenter(MCustomer entity, boolean cacheable) {

		Long customerId = entity.getCustomerId();
		if (customerId == null) {
			return null;
		}

		Long clientId = entity.getClientId();
		if (clientId == null) {
			return null;
		}

		// 削除フラグ停止前の状態を保存
		boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(clientId);
		cb.query().setCustomerId_Equal(customerId);

		MClientCenter clientCenter = null;
		if (cacheable) {

			clientCenter = selectEntityCacheable(mClientCenterBhv, cb);
		} else {

			clientCenter = mClientCenterBhv.selectEntity(cb);
		}

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (clientCenter == null) {
			return null;
		}

		return clientCenter.getMCenter();
	}

	// レスポンス対策 2016.02.24 kawana End

	/**
	 * <h2>取引先マスタデータを取得する。</h2>
	 * <pre>
	 * 引数の荷主CDをキーに取引先マスタデータを取得する。
	 * </pre>
	 * @param clientCd 荷主CD
	 * @return Map<String, String> 取引先マスタマップ
	 */
	public Map<String, String> getDepositMapByClientCd(String clientCd) {

		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryMClient().setClientCd_Equal(clientCd);
		cb.query().setDepositFlg_Equal_$1();
		cb.query().addOrderBy_CustomerCd_Asc();

		ListResultBean<MCustomer> mDepositList = mCustomerBhv.selectList(cb);

		Map<String, String> retMap = new HashMap<String, String>();

		for (MCustomer o : mDepositList) {
			retMap.put(o.getCustomerCd(), String.valueOf(o.getCustomerId()));
		}

		return retMap;
	}
}
