package com.oneslogi.ht.wms.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.BUserCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.THtComctlCB;
import com.oneslogi.base.dbflute.dto.MUserClientDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exbhv.THtComctlBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.THtComctl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.validator.CommonValidator;
import com.oneslogi.ht.base.dto.HandyMenuDto;
import com.oneslogi.ht.base.util.HandyBaseUtil;
import com.oneslogi.ht.base.util.HandyMenuDataManager;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryInfo;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.SelectClientLogic;

/**
 * ハンディ向けモジュールで使用する共通関数群です。
 * @author hi.watanabe.mp
 *
 */
public class HandyCommonUtil extends HandyBaseUtil {

	@Inject
	private BUserBhv userBhv;

	@Inject
	private THtComctlBhv comctlBhv;

	@Inject
	private SelectClientLogic selectClientLogic;

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.19 kawana Start
	@Inject
	private HandyMenuDataManager menuManager;
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.19 kawana End
	// [Ver3.0] unit of measure対応 2017.11.23 王 Start
	/* 商品   */
	@Inject
	private MProductBhv mProductBhv;

	/* 商品荷姿マスタ */
	@Inject
	private MProductShapeBhv mProductShapeBhv;
	// ===== 定数定義 =====

	public String INPUT_LIMIT_NUMBER = "^[0-9]*$";
	public String INPUT_LIMIT_DECIMAL_NUMBER = "^[0-9]+[\\.]?[0-9]*$";
	// [Ver3.0] unit of measure対応 2017.11.23 王 End

	/**
	 * 中断作業有無を判定します。
	 * @param ses HttpSessionオブジェクト
	 * @return true:中断作業あり false:中断作業なし
	 */
	public boolean checkInterruptData(HttpSession ses) {
		if (getMacAddress(ses) != null) {
			String macAddress = getMacAddress(ses);
			THtComctlCB checkCB = comctlBhv.newMyConditionBean();
			checkCB.query().setMacAddress_Equal(macAddress);
			checkCB.query().setSgyKey_IsNotNull();
			ListResultBean<THtComctl> list = comctlBhv.selectList(checkCB);
			if (list.size() > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * 中断作業データを取得します。
	 * @param ses HttpSessionオブジェクト
	 * @return THtComCtl 中断作業データエンティティ
	 */
	public THtComctl getInterruptData(HttpSession ses) {
		if (getMacAddress(ses) != null) {
			String macAddress = getMacAddress(ses);
			THtComctlCB checkCB = comctlBhv.newMyConditionBean();
			checkCB.query().setMacAddress_Equal(macAddress);
			checkCB.query().setSgyKey_IsNotNull();
			THtComctl entity = comctlBhv.selectEntity(checkCB);
			return entity;
		} else {
			return null;
		}
	}

	/**
	 * ログインユーザー、センターに紐づく荷主コードの一覧を取得します。
	 * @param userCd ユーザーコード
	 * @param centerCd センターコード
	 * @return List<MUserClientDto> ユーザー荷主マスタのリスト
	 * @throws Exception
	 */
	public List<MUserClientDto> getClientCd(String userCd, String centerCd) throws Exception {
		List<MUserClientDto> retList = new ArrayList<>();

		// ユーザIDの取得
		BUserCB userCb = userBhv.newMyConditionBean();
		userCb.checkInvalidQuery();
		userCb.query().setUserCd_Equal(userCd);
		BUser userEntity = userBhv.selectEntity(userCb);
		long userId = userEntity.getUserId();

		// ユーザ、センタに紐づく荷主リストを取得
		List<MClient> clientList = selectClientLogic.selectClientList(userId, centerCd);

		if (clientList == null) {
			return retList;
		}

		// ユーザー荷主マスタのリストを作成
		MClientDtoMapper mapper = new MClientDtoMapper();
		for (MClient client : clientList) {
			MUserClientDto userClient = new MUserClientDto();

			userClient.setUserId(userId);
			userClient.setClientId(client.getClientId());
			userClient.setMClient(mapper.mappingToDto(client));

			retList.add(userClient);
		}

		return retList;
	}

	/**
	 * 中断レコードを作成します。
	 * @param ses HttpSessionオブジェクト
	 * @param dataKbn 中断する作業のプログラムID
	 * @param sgyKey 中断する作業のキー
	 */
	public void setHtComCtl(HttpSession ses, String dataKbn, String sgyKey) {
		//中断用レコード作成
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		THtComctlCB cb = comctlBhv.newMyConditionBean();
		cb.query().setMacAddress_Equal(getMacAddress(ses));
		THtComctl entity = comctlBhv.selectEntity(cb);
		if (entity != null) {
			//Update
			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
			entity.setCenterId(loginInfo.getCenterId());
			entity.setClientId(loginInfo.getClientId());
			// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End
			entity.setUpdDt(new Timestamp(new Date().getTime()));
			entity.setUpdProcess(this.getClass().getCanonicalName());
			entity.setUpdUser(loginInfo.getUserCd());
			entity.setHtDataKbn(dataKbn);
			entity.setSgyKey(sgyKey);
			comctlBhv.update(entity);
		} else {
			//insert
			entity = comctlBhv.newMyEntity();
			entity.setAddDt(new Timestamp(new Date().getTime()));
			entity.setAddProcess(this.getClass().getCanonicalName());
			entity.setAddUser(loginInfo.getUserCd());
			entity.setCenterId(loginInfo.getCenterId());
			entity.setClientId(loginInfo.getClientId());
			entity.setDelFlg("0");
			entity.setHtDataKbn(dataKbn);
			entity.setMacAddress(getMacAddress(ses));
			entity.setSgyKey(sgyKey);
			comctlBhv.insert(entity);
		}
	}

	/**
	 * 中断データをクリアします。
	 * @param ses HttpSessionオブジェクト
	 */
	public void clearHtComCtl(HttpSession ses) {
		//中断用レコードのクリア
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		THtComctlCB cb = comctlBhv.newMyConditionBean();
		cb.query().setMacAddress_Equal(getMacAddress(ses));
		THtComctl entity = comctlBhv.selectEntity(cb);
		if (entity != null) {
			//Update
			entity.setUpdDt(new Timestamp(new Date().getTime()));
			entity.setUpdProcess(this.getClass().getCanonicalName());
			entity.setUpdUser(loginInfo.getUserCd());
			entity.setHtDataKbn("");
			entity.setSgyKey(null);
			comctlBhv.update(entity);
		}
	}

	/**
	 * メインメニューのデータを取得します。
	 * @param ses HttpSessionオブジェクト
	 * @return List<HandyMenuDto> 取得したメインメニューグループの一覧
	 */
	public List<HandyMenuDto> getMenuGrp(HttpSession ses) throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// メインメニューのデータを取得
		List<HandyMenuDto> menuList = menuManager.getMenuGrpList();
		if (menuList.size() < 1) {
			throw new Exception(getMessage(WmsMessageConst.HANDY_MENU_DEF_ERROR));
		}

		for (HandyMenuDto menuDto : menuList) {

			menuDto.setMenuNm(menuDto.getMenuGrpNm());
			menuDto.setUrl(new StringBuilder()
					.append("submenu?selGrp=")
					.append(menuDto.getMenuGrpCd()).toString());
		}

		return menuList;

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * サブメニューのデータを取得します。
	 * @param ses HttpSessionオブジェクト
	 * @param groupId メインメニューで選択されたグループID
	 * @return List<HandyMenuDto> 取得したサブメニューの一覧
	 */
	public List<HandyMenuDto> getMenuData(HttpSession ses, String groupKey) throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// サブメニューのデータ取得
		List<HandyMenuDto> menuList = menuManager.getMenuList(groupKey);
		if (menuList.size() < 1) {
			throw new Exception(getMessage(WmsMessageConst.HANDY_MENU_DEF_ERROR));
		}

		return menuList;

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * メニューから遷移したか、再開画面から作業再開したかを判定します。
	 * @param ses HttpSessionオブジェクト
	 * @return boolean メニューから遷移の場合true
	 */
	public boolean isMenuDisplayed(HttpSession ses) {
		return ses.getAttribute("lstHandyMenuDto") != null;
	}

	// [#3085] backToMenu(HttpSession ses, String currentMenuGroupCd)を削除 2017.11.21 kawana

	/**
	 * 中断作業の再開を行います。
	 * @param entity THtComCtlエンティティ
	 * @return 遷移先URL
	 */
	public String determineReOpenProcess(THtComctl entity) {
		String sgyKey = entity.getSgyKey();
		String programID = entity.getHtDataKbn();
		String rightBtnURL = programID + "/reopenProcess?inputText=" + sgyKey;
		return rightBtnURL;
	}

	// [Ver3.0] unit of measure対応 2017.11.23 王 Start
	/**
	 * 小数有無フラグ取得する。
	 * @param productCd 商品Cd
	 * @param clientId 荷主Id
	 * @return decimalExistFlg 小数有無フラグ
	 */
	public  String getDecimalExistFlg(final String productCd,Long clientId) {
		//商品マスタ
		MProductCB mProductCB = mProductBhv.newMyConditionBean();
		mProductCB.setupSelect_MClient();
		mProductCB.setupSelect_MShapeGrp();
		mProductCB.query().setProductCd_Equal(productCd);
		mProductCB.orScopeQuery(new OrQuery<MProductCB>() {
		    public void query(MProductCB orCB) {
		        orCB.query().setJanCd_Equal(productCd);
		        orCB.query().setProductCd_Equal(productCd);
		    }
		});
		mProductCB.query().queryMClient().setClientId_Equal(clientId);

		List<MProduct> lstMProduct = mProductBhv.selectList(mProductCB);

		// productCdにより、商品不存在場合
		if (lstMProduct == null || lstMProduct.size() == 0) {
			return null;
		}

 		MProduct mProduct = lstMProduct.get(0);
		//小数有無フラグ
		String decimalExistFlg=mProduct.getMShapeGrp().getDecimalExistFlg();

		return decimalExistFlg;
	}

	/**
	 * 小数有無フラグチェック。
	 * @param decimalExistFlg 小数有無フラグ
	 * @param qty 数量
	 * @param qtyItemNm 名称
	 * @return true/false
	 */
	public Boolean decimalExistFlgCheck(String decimalExistFlg, String qty, String qtyItemNm) {
		// [Ver3.0][#4458] 「送信」時と入力補助画面遷移時でエラーメッセージを統一 2018.04.24 matsumoto Start
		if (!CommonValidator.checkInputLimit(qty, INPUT_LIMIT_NUMBER)) {
			// [0]は整数で入力してください。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.INTEGER_ERROR, qtyItemNm);
			return false;
		}
		// [Ver3.0][#4458] 「送信」時と入力補助画面遷移時でエラーメッセージを統一 2018.04.24 matsumoto End
		return true;
	}

	/**
	 * 最小荷姿id取得。
	 * @param productId 商品ID
	 * @return 荷姿ID
	 */
	public Long getPieceShapeId(Long productId) {
		Long pieceShapeId=0L;
		// 商品マスト
		MProductShapeCB mProductShapeCB = mProductShapeBhv.newMyConditionBean();
		mProductShapeCB.setupSelect_MProduct();
		mProductShapeCB.setupSelect_MShapeGrpDtl();
		mProductShapeCB.query().setProductId_Equal(productId);
		mProductShapeCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
		// 荷姿idリスト取得
		List<MProductShape> list = mProductShapeBhv.selectList(mProductShapeCB);
		// データが存在の場合
		if(list.size() >0){
			// 荷姿IDの設定
			pieceShapeId = list.get(0).getMShapeGrpDtl().getShapeId();
		}

		return pieceShapeId;
	}
	// [Ver3.0] unit of measure対応 2017.11.23 王 End

	// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start

	/**
	 * <h2>入力補助ボタンの表示設定を取得.</h2>
	 * <pre>
	 * 引数から小数が含まれる商品かを判定し、
	 * 商品が含まれる商品の場合は、falseを返す。
	 *
	 * </pre>
	 * @param info 入力補助情報
	 * @return true:入力補助ボタンを表示、 false:入力補助ボタンを非表示
	 */
	public boolean isVisibleAuxiliary(HandyInputAuxiliaryInfo info) {

		MProductCB cb = mProductBhv.newConditionBean();
		cb.setupSelect_MShapeGrp();

		cb.specify().specifyMShapeGrp().columnDecimalExistFlg();
		cb.specify().columnProductId();

		if (info.getProductId() != null) {
			cb.query().setProductId_Equal(info.getProductId());
		} else if (info.getProductCd() != null && info.getClientId() != null) {
			cb.query().setClientId_Equal(info.getClientId());
			cb.query().setProductCd_Equal(info.getProductCd());
		} else {
			// 情報が足りず判断できないため表示とする
			return true;
		}

		// 商品を検索
		MProduct product = mProductBhv.selectEntity(cb);
		if (product == null) {
			// 情報が足りず判断できないため表示とする
			return true;
		}

		if (product.chaseMShapeGrp().isDecimalExistFlg$1()) {
			// 小数あり => 非表示

			return false;
		}

		return true;
	}

	// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End
}
