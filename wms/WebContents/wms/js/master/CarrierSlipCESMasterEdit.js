/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipCESMasterEdit
 *
 * @description
 * キャリアEDIシステム送り状マスタメンテナンス(編集)画面
 */
angular.module('oneslogiWms.CarrierSlipCESMasterEdit',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipCESMasterEdit.service:locationMasterApi
 *
 * @description
 * キャリアEDIシステム送り状マスタメンテナンス(編集)WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/initNew 新規画面用初期データ取得用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/initUpdate 更新画面用初期データ取得用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/inputCheck 入力チェック（登録）用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/updateCheck 入力チェック（更新）用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/register 入力データ登録用WebApi<br>
 * ・resources/master/CarrierSlipCESMasterEdit/update 入力データ更新用WebApi<br>
 *
 */
.factory('carrierSlipCESMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliveryCustomer: AngularAPIClient.make(
				[
				 	['record', 'GET', 'resources/common/deliveryCustomer/record']
		        ]
			),
		CarrierSlipCESMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',   'GET', 'resources/master/carrierSlipCESMasterEdit/initNew'],
				 ['initUpdate',   'GET', 'resources/master/carrierSlipCESMasterEdit/initUpdate'],
				 ['inputCheck', 'POST', 'resources/master/carrierSlipCESMasterEdit/inputCheck'],
				 ['updateCheck', 'POST', 'resources/master/carrierSlipCESMasterEdit/updateCheck'],
				 ['register', 'POST', 'resources/master/carrierSlipCESMasterEdit/register'],
				 ['update', 'POST', 'resources/master/carrierSlipCESMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
 *
 * @description
 * キャリアEDIシステム送り状マスタメンテナンス(編集)画面コントローラ
 */
.controller('CarrierSlipCESMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'carrierSlipCESMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#initScreen
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetSaturdayDeliveryFlg(),
				 $scope.deferredGetResidentialDeliveryFlg(),
				 $scope.deferredGetCollectOnDeliveryFlg(),
				 $scope.deferredGetSignatureRequiredFlg(),
				 $scope.deferredGetSignatureReleaseFlg(),
				 $scope.deferredGetCallBeforeDeliverFlg(),
				 $scope.deferredGetFreezableProtectioFlg(),
				 $scope.deferredGetGuaranteedPlusFlg(),
				 $scope.deferredGetResidentialPickupFlg(),
				 $scope.deferredGetDoNotStackPalletsFlg(),
				 $scope.deferredGetLimitedAccessDeliveryFlg(),
				 $scope.deferredGetLimitedAccessPickupFlg(),
				 $scope.deferredGetOverSizedFlg(),
				 $scope.deferredGetPoisonFlg(),
				 $scope.deferredGetFoodFlg(),
				 $scope.deferredGetLiftgateDeliveryPrepaidFlg(),
				 $scope.deferredGetLiftgateDeliveryCollectFlg(),
				 $scope.deferredGetLiftgatePickupPrepaidFlg(),
				 $scope.deferredGetLiftgatePickupCollectFlg(),
				 $scope.deferredGetInsideDeliveryPrepaidFlg(),
				 $scope.deferredGetInsideDeliveryCollectFlg(),
				 $scope.deferredGetInsidePickupPrepaidFlg(),
				 $scope.deferredGetInsidePickupCollectFlg(),
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetSaturdayDeliveryFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Saturday Delivery フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSaturdayDeliveryFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SAT_DELIVERY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.satDeliveryFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetResidentialDeliveryFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Residential Delivery フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetResidentialDeliveryFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESIDENTIAL_DELIVERY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.residentialDeliveryFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetCollectOnDeliveryFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Collect On Delivery フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCollectOnDeliveryFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COD_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.codFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetSignatureRequiredFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Signature Required フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSignatureRequiredFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SIGNATURE_REQUIRED_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.signatureRequiredFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetSignatureReleaseFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Signature Release フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSignatureReleaseFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SIGNATURE_RELEASE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.signatureReleaseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetCallBeforeDeliverFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Call Before Delivery フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCallBeforeDeliverFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CALL_BEFORE_DELIVERY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.callBeforeDeliveryFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetFreezableProtectioFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Freezable Protection フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetFreezableProtectioFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FREEZABLE_PROTECTION_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.freezableProtectionFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetGuaranteedPlusFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Guaranteed Plus フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetGuaranteedPlusFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "GUARANTEED_PLUS_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.guaranteedPlusFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetResidentialPickupFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Residential Pickup フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetResidentialPickupFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESIDENTIAL_PICKUP_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.residentialPickupFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetDoNotStackPalletsFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Do Not Stack Pallets フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDoNotStackPalletsFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DO_NOT_STACK_STACK_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.doNotStackStackFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLimitedAccessDeliveryFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Limited Access Delivery フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitedAccessDeliveryFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIMITED_ACCESS_DELIVERY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitedAccessDeliveryFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLimitedAccessPickupFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Limited Access Pickup フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitedAccessPickupFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIMITED_ACCESS_PICKUP_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitedAccessPickupFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetOver-Sized/ExtremeLengthFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Over-Sized/Extreme Length フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOverSizedFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "OVER_SIZED_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.overSizedFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetPoisonFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Poison フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPoisonFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "POISON_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.poisonFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetFoodFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Food フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetFoodFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FOOG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.foogFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLiftgateatdeliveryFlg(Prepaid)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Liftgate at delivery Flag (Prepaid)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLiftgateDeliveryPrepaidFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIFTGATE_DELIVERY_PREPAID_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.liftgateDeliveryPrepaidFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLiftgateatdeliveryFlg(Collect)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Liftgate at delivery Flag (Collect)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLiftgateDeliveryCollectFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIFTGATE_DELIVERY_COLLECT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.liftgateDeliveryCollectFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLiftgateatpickupFlg(Prepaid)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Liftgate at pickup Flag (Prepaid)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLiftgatePickupPrepaidFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIFTGATE_PICKUP_PREPAID_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.liftgatePickupPrepaidFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetLiftgateatpickupFlg(Collect)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Liftgate at pickup Flag (Collect)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLiftgatePickupCollectFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIFTGATE_PICKUP_COLLECT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.liftgatePickupCollectFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetInsideDeliveryFlg(Prepaid)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Inside Delivery Flag (Prepaid)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInsideDeliveryPrepaidFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INSIDE_DELIVERY_PREPAID_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.insideDeliveryPrepaidFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetInsideDeliveryFlg(Collect)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Inside Delivery Flag (Collect)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInsideDeliveryCollectFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INSIDE_DELIVERY_COLLECT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.insideDeliveryCollectFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetInsidePickupFlg(Prepaid)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Inside Pickup Flag (Prepaid)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInsidePickupPrepaidFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INSIDE_PICKUP_PREPAID_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.insidePickupPrepaidFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetInsidePickupFlg(Collect)
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * Inside Pickup Flag (Collect)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInsidePickupCollectFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INSIDE_PICKUP_COLLECT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.insidePickupCollectFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * キャリアEDIシステム送り状マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
			// 訂正
			var request = {};
			request.customerId = $route.current.params.customerId;
			api.CarrierSlipCESMasterEdit.initUpdate(request).then(function(response){
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

				// ヘッダ関連
				$scope.head = response.data.head;

				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				$scope.head.clientCd = userInfo.clientCd;

				if ($scope.screenMode == SCREEN_MODE.Update) {
					directiveControl.editable($scope, 'customerCd', false);
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}

				directiveControl.editable($scope, 'clientCd', false);
				//取引先名称設定
				$scope.supplyCustomerCdBlur();

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});
		}else {

			// 新規
			api.CarrierSlipCESMasterEdit.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				// ログイン情報より初期値を設定
				$scope.head.clientCd = userInfo.clientCd;
				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);
				});

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			};

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.head.customerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.head.customerNm = response.data.mCustomer.customerNm;

			});

		}else {
			$scope.head.customerNm = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.head.clientCd,
			deliveryCd: $scope.head.customerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.head.customerCd = selectedItem.customerCd;
			$scope.head.customerNm = selectedItem.customerNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#register
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
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
		request.data.head = $scope.head;
		request.data.head.clientCd =  userInfo.clientCd;

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update){
			// 入力チェック
			api.CarrierSlipCESMasterEdit.updateCheck(request).then(function(response){
				var warnmessageFlg = false;
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//取引先マスタ存在チェック
						if (response.status.listStatus[i].status.statusCode == 6){
							optionMessageControl.show($scope, "customerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							return;
						}
					}
				}

				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
			    }
				// キャリアEDIシステム送り状マスタデータ登録または更新
				api.CarrierSlipCESMasterEdit.update(request).then(function(response){
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				});
		    });

			}
		if ($scope.screenMode == SCREEN_MODE.Create || $scope.screenMode == SCREEN_MODE.Copy){
			// 入力チェック
			api.CarrierSlipCESMasterEdit.inputCheck(request).then(function(response){
				var warnmessageFlg = false;
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){

						//取引先CD存在チェック
						if (response.status.listStatus[i].status.statusCode == 2){
							optionMessageControl.show($scope, "customerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							return;
						}
						//取引先マスタ存在チェック
						if (response.status.listStatus[i].status.statusCode == 6){
							optionMessageControl.show($scope, "customerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							return;
						}
					}
				}
				var warnmessageFlg = false;
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
			     }
				// キャリアEDIシステム送り状マスタデータ登録または更新
				api.CarrierSlipCESMasterEdit.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
				}
					if ($scope.screenMode == SCREEN_MODE.Create){
					// 初期化
					$scope.initScreenHttp();
					}
				});

		    });


		}

	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
