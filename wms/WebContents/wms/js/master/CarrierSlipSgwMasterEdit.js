/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipSgwMasterEdit
 *
 * @description
 * 佐川送り状マスタメンテナンス(編集)画面<br>
 *
 * 佐川送り状マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.CarrierSlipSgwMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipSgwMasterEdit.service:carrierSlipSgwMasterEditApi
 *
 * @description
 * 佐川送り状マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 佐川送り状マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/carrierSlipSgwMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipSgwMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipSgwMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/carrierSlipSgwMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/carrierSlipSgwMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('CarrierSlipSgwMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		centerDropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/centerKeyValueList']
				 ]
		),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		zip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		carrierSlipSgwList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/carrierSlipSgwMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/carrierSlipSgwMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/carrierSlipSgwMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/carrierSlipSgwMasterEdit/register'],
				 ['update',             'POST', 'resources/master/carrierSlipSgwMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit
 *
 * @description
 * 佐川送り状マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CarrierSlipSgwMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'CarrierSlipSgwMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit#initScreen
	 * @methodOf oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetCharacterCd(),
				 $scope.deferredSlipShapeCd(),
				 $scope.deferredTransportTypeSpeed(),
				 $scope.deferredTransportTypeItem(),
				 $scope.deferredSettlementType(),
				 $scope.deferredSealType(),
//				 $scope.deferredSealType2(),
//				 $scope.deferredSealType3(),
				 $scope.deferredCodCls(),
				 $scope.deferredApiBinsyuCode(),
				 $scope.deferredApiDaibikiFlg(),
				 $scope.deferredApiDaibikiType(),
				 $scope.deferredApiWeightCd1(),
				 $scope.deferredApiWeightCd2(),
				 $scope.deferredApiEidomeFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredGetCharacterCd
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 文字コード取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCharacterCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CHARACTER_CD";

		api.dropdownList.query(request).then(function(response){
			$scope.characterCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSlipShapeCd
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 荷姿コード取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredSlipShapeCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SLIP_SHAPE_CD";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.slipShapeCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredTransportTypeSpeed
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 便種(スピードで選択)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredTransportTypeSpeed = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TRANSPORT_TYPE_SPEED";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.transportTypeSpeedList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	 /**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredTransportTypeItem
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 便種(商品)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredTransportTypeItem = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TRANSPORT_TYPE_ITEM";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.transportTypeItemList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	 /**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSettlementType
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 決済種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredSettlementType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SETTLEMENT_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.settlementTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	 /**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType1
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 指定シール取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredSealType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SEAL_TYPE";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.sealType1List = response.data;
			$scope.sealType2List = response.data;
			$scope.sealType3List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType2
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSealType2 = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SEAL_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.sealType2List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType3
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSealType3 = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SEAL_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.sealType3List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
	 /**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredCodCls
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 元着区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredCodCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COD_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.codClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ#73] 対応 2016.11.4 nayzaw start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiBinsyCode
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI便種コード取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiBinsyuCode = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_BINSYU_CODE";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiBinsyuCodeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiDaibikiFlg
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI代引フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiDaibikiFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_DAIBIKI_FLG";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiDaibikiFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiDaibikiType
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI代引支払方法区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiDaibikiType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_DAIBIKI_TYPE";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiDaibikiTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiWeightCd1
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI重量コード1取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiWeightCd1 = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_WEIGHT_CD";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiWeightCd1List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiWeightCd2
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI重量コード2取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiWeightCd2 = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_WEIGHT_CD";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiWeightCd2List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredApiEidomeFlg
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * WebAPI営止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredApiEidomeFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "API_EIDOME_FLG";
		// 荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.screenMode == SCREEN_MODE.Create) {
			request.centerId = userInfo.centerId;
		} else {
			request.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		}
		// 荷主センタ変更対応 2017.03.13 sja End

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		api.centerDropdownList.query(request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			$scope.apiEidomeFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ#73] 対応 2016.11.4 nayzaw end

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit
	 *
	 * @description
	 * 佐川送り状マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End
			// 訂正
			var request = {};
			request.carrierSlipSgwId = $route.current.params.carrierSlipSgwId;

			api.carrierSlipSgwList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.carrierSlipSgw = response.data.carrierSlipSgwList[0];

				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'tagType', false);
				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
				} else {
					$scope.carrierSlipSgw.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}
				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
//				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.carrierSlipSgwList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
//				$scope.head = response.data.head;
				$scope.carrierSlipSgw = response.data.carrierSlipSgwList[0];

				// 削除の初期値設定
				$scope.carrierSlipSgw.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);
//
//				directiveControl.editable($scope, 'addRow', false);
//				directiveControl.editable($scope, 'removeRow', false);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit#register
	 * @methodOf oneslogiWms.CarrierSlipSgwMasterEdit.object:CarrierSlipSgwMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		var isError = $scope.searchinputform.$invalid;

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
//		request.data.carrierSlipSgwList = {};
//		request.data.carrierSlipSgwList[0] = $scope.carrierSlipSgw;
		request.data.carrierSlipSgwMasterSearch = $scope.carrierSlipSgw;
		request.data.carrierSlipSgwMasterSearch.mcenter = {};
		request.data.carrierSlipSgwMasterSearch.mcenter.centerCd = $route.current.params.centerCd;

		// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			request.data.carrierSlipSgwMasterSearch.carrierSlipSgwId = null;
		}
		// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End


		// 入力チェック
		api.carrierSlipSgwList.inputCheck(request).then(function(response){

			// 処理結果確認
			if (response.status.statusCode != 1){
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//取引先CD存在チェック
						if (response.status.listStatus[i].status.statusCode == 8){
							optionMessageControl.show($scope, "tagNm", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						} else if (response.status.listStatus[i].status.statusCode == 5){
							optionMessageControl.show($scope, "tagType", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						} else if (response.status.listStatus[i].status.statusCode == 7){
							optionMessageControl.show($scope, "slipClientZipCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						}
					}
					return;
				}
			} else {
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
			}
			// マスタデータ登録または更新
			api.carrierSlipSgwList.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
					// 荷主センタ変更対応 2017.03.13 sja Start
//				} else if ($scope.screenMode == SCREEN_MODE.Register) {
				} else if ($scope.screenMode == SCREEN_MODE.Create) {
					// 荷主センタ変更対応 2017.03.13 sja End
				// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End
					// 初期化
					$scope.initScreenHttp();
				}
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalZip
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 佐川送り状検索ボタンを押下された時に処理<br>
	 *
	 * 佐川送り状マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalZip = function(){

		var items = {
			zipCd: $scope.carrierSlipSgw.slipClientZipCd
		};
		//マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.carrierSlipSgw.slipClientZipCd =  selectedItem.zipCd;
			if((($scope.carrierSlipSgw.slipClientAddress1 == null)||($scope.carrierSlipSgw.slipClientAddress1 == ""))&&
					(($scope.carrierSlipSgw.slipClientAddress2 == null)||($scope.carrierSlipSgw.slipClientAddress2 == ""))){

				$scope.carrierSlipSgw.slipClientAddress1 =  selectedItem.address1;

				if (selectedItem.address2 != null || selectedItem.address3 != null) {
					$scope.carrierSlipSgw.slipClientAddress2 =  selectedItem.address2 + selectedItem.address3;
				}

			};
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.carrierSlipSgwListBulkInput.object:carrierSlipSgwListBulkInput#zipCdBlur
	 * @methodOf oneslogiWms.carrierSlipSgwListBulkInput.object:carrierSlipSgwListBulkInput
	 *
	 * @description
	 * 佐川送り状のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、佐川送り状の情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {
//
//		// 入力された郵便コードを取得
//		var zipCd = $scope.carrierSlipSgw.slipClientZipCd;
//
//		if((($scope.carrierSlipSgw.slipClientAddress1 == null)||($scope.carrierSlipSgw.slipClientAddress1 == ""))&&
//				(($scope.carrierSlipSgw.slipClientAddress2 == null)||($scope.carrierSlipSgw.slipClientAddress2 == ""))&&
//				(($scope.carrierSlipSgw.slipClientAddress3 == null)||($scope.carrierSlipSgw.slipClientAddress3 == ""))){
//
//			if (zipCd && 0 < zipCd.length) {
//				var request = {};
//				request.zipCd = zipCd;
//
//				api.zip.record(request).then(function(response){
//					$scope.carrierSlipSgw.slipClientAddress1 =  response.data.mZip.address1;
//					$scope.carrierSlipSgw.slipClientAddress2 =  response.data.mZip.address2;
//					$scope.carrierSlipSgw.slipClientAddress3 =  response.data.mZip.address3;
//				});
//			}
//		};


		// 入力された郵便コードを取得
		var zipCd = $scope.carrierSlipSgw.slipClientZipCd;

		if((($scope.carrierSlipSgw.slipClientAddress1 == null)||($scope.carrierSlipSgw.slipClientAddress1 == ""))&&
				(($scope.carrierSlipSgw.slipClientAddress2 == null)||($scope.carrierSlipSgw.slipClientAddress2 == ""))){

			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){

					if (response.data.mZip.address1 != null) {
						$scope.carrierSlipSgw.slipClientAddress1 =  response.data.mZip.address1;
					}

					if (response.data.mZip.address2 != null || response.data.mZip.address3 != null) {
						$scope.carrierSlipSgw.slipClientAddress2 =  response.data.mZip.address2 + response.data.mZip.address3;
					}
				});
			}
		};
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#checkSameType
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 指定シール1又は指定シール2と同じ内容では無いかチェック。<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.checkSameType = function() {
		var flg = false;
		// すべて入力しない場合、チェックしない。
		if (($scope.carrierSlipSgw.sealType1 == null || $scope.carrierSlipSgw.sealType1 == "")
				&& ($scope.carrierSlipSgw.sealType2 == null || $scope.carrierSlipSgw.sealType2 == "")
				&& ($scope.carrierSlipSgw.sealType3 == null || $scope.carrierSlipSgw.sealType3 == "")) {
//			directiveControl.editable($scope,"classCd",true);
			return false;
		}

		optionMessageControl.hide($scope, "sealType1");
		optionMessageControl.hide($scope, "sealType2");
		optionMessageControl.hide($scope, "sealType3");

		if ($scope.carrierSlipSgw.sealType1 == $scope.carrierSlipSgw.sealType2
				&& ($scope.carrierSlipSgw.sealType1 != null && $scope.carrierSlipSgw.sealType1 != "")){
			// エラーメッセージCD
			var messageCd = "sealTypeDuplicateError";
//			optionMessageControl.show($scope, "sealType2", $filter('owfMessage')(messageCd), row.rowIndex);
			optionMessageControl.show($scope, "sealType2", $filter('owfMessage')(messageCd));

//			gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, row.rowIndex);
			flg = true;
		}
		if (($scope.carrierSlipSgw.sealType1 == $scope.carrierSlipSgw.sealType3 && $scope.carrierSlipSgw.sealType1 != null && $scope.carrierSlipSgw.sealType1 != "")
				|| ($scope.carrierSlipSgw.sealType2 == $scope.carrierSlipSgw.sealType3 && $scope.carrierSlipSgw.sealType2 != null && $scope.carrierSlipSgw.sealType2 != "")){
			// エラーメッセージCD
			var messageCd = "sealTypeDuplicateError";
//			optionMessageControl.show($scope.gridOptions, "sealType3", $filter('owfMessage')(messageCd), row.rowIndex);
//			gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, row.rowIndex);
			optionMessageControl.show($scope, "sealType3", $filter('owfMessage')(messageCd));
			flg = true;
		}
		return flg;
	};


	// 画面初期化処理を実行
	$scope.initScreen();

}]);
