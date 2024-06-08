/**
 * @ngdoc overview
 * @name oneslogiWms.ParameterMasterEdit
 *
 * @description
 * パラメータマスタメンテナンス(編集)画面<br>
 *
 * パラメータマスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ParameterMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ParameterMasterEdit.service:parameterMasterEditApi
 *
 * @description
 * パラメータマスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * パラメータマスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/parameterMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/parameterMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/parameterMasterEdit/inputCheckRegister 登録前入力チェックWebAPI<br>
 * ・resources/master/parameterMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/parameterMasterEdit/inputCheckUpdate 更新前入力チェックWebAPI<br>
 * ・resources/master/parameterMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('ParameterMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana Start
		userCenter: AngularAPIClient.make(
				[
				 ['checkPermission', 'GET', 'resources/common/userCenter/checkPermission'],
				 ['query', 'GET', 'resources/common/userCenter/keyValueList']
				 ]
		),
		// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana End
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		clientList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/clientCd/query']
				 ]
		),
		shapeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/query']
				 ]
		),
		wareHouseList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		boxGrpList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/boxGrpCd/keyValueList']
				 ]
		),
		parameterMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/parameterMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/parameterMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/parameterMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/parameterMasterEdit/register'],
				 ['update',             'POST', 'resources/master/parameterMasterEdit/update']
				 ]
		),
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		defaultBoxIdList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/boxCd/query']
				 ]
		)
	   //Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
 *
 * @description
 * パラメータマスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ParameterMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ParameterMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#initScreen
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		// 画面遷移時の値を取得
		$scope.screenMode = $route.current.params.mode;
		$scope.clientCenterId = $route.current.params.clientCenterId;
		$scope.centerId = $route.current.params.mcenterId;
		$scope.centerCd = $route.current.params.centerCd;
		$scope.clientCd = $route.current.params.clientCd;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End

		// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana Start

		// センタ使用権限チェック

		var request = {};
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		request.centerCd = $scope.centerCd;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
		api.userCenter.checkPermission(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				return;
			}

			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更($scope.screenModeを削除) 2018.10.22 kawana Delete

			// [#1472] jsスクリプトエラー発生 2017.03.30 kawana Start

			// ===== エラー番号と項目の紐付 =====

			// 荷主既登録エラー
			statusInfo.mappingErrorMessage($scope, "clientCd", 8, 15);
			// トランザクソン保持期間 、 履歴保持期間 逆転エラー
			statusInfo.mappingErrorMessage($scope, "tkeepingDays", 8, 5);

			// [#1472] jsスクリプトエラー発生 2017.03.30 kawana End

			// 画面初期化用通信処理を実行
			$scope.initScreenHttp();
		});

		// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana End
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
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
				// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana Start
				 $scope.deferredGetCenterList(),
				// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana End
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetClientList(),
				 $scope.deferredGetStoreNoFlg(),
				 $scope.deferredGetMergeCls(),
				 $scope.deferredGetAllocSortKey(),
				 $scope.deferredGetOverStoreNumFlg(),
				 $scope.deferredGetPastStoreDtFlg(),
				// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana Start
				 $scope.deferredGetUseHtShipFlg(),
				// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana End
				 $scope.deferredGetStoreDtFlg(),
				 $scope.deferredGetMultiPicCls(),
				// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
				 $scope.deferredGetCasePicFlg(),
				// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End
				 $scope.deferredGetReplenishUnitCls(),
				 $scope.deferredGetWarehouseCd(),
				 $scope.deferredGetEmReplenishAllocCls(),
				 $scope.deferredGetPackingCalCls(),
				 $scope.deferredGetPackingProcessCls(),
				 $scope.deferredGetProductPartPacking(),
				// [Ver3.0] unit of measure対応 2017.11.24 NING Start
				 $scope.deferredGetDecimalProductPacking(),
				// [Ver3.0] unit of measure対応 2017.11.24 NING End
				 $scope.deferredGetBoxGrpList(),
				//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
				 $scope.deferredGetProductLabelOutUnitList(),
				 $scope.deferredGetResultAfterProductLabelList(),
				 // [#1755]入庫ラベル最新化 2017.07.24 sampei Start
				 $scope.deferredGetResultAfterProductTargetList(),
				 // [ #1755]入庫ラベル最新化 2017.07.24 sampei End
				 $scope.deferredGetproductLabelJanBarcodeList(),
				 $scope.deferredGetproductLabelProdBarcodeList(),
				 $scope.deferredGetboxSelectSkipList(),
				 $scope.deferredGetdefaultBoxIdList(),
				 // [Ver3.1][#5137] カテゴリ 出荷検品 新規項目追加 2018.09.26 matsumoto Add Start
				 $scope.deferredGetErrorSoundPlayFlg(),
				 $scope.deferredGetWarnSoundPlayFlg(),
				 $scope.deferredGetInspSoundPlayFlg(),
				 $scope.deferredGetInspCompSoundPlayFlg(),
				 // [Ver3.1][#5137] カテゴリ 出荷検品 新規項目追加 2018.09.26 matsumoto Add End
				 //Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
				 //[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
				 $scope.deferredGetAfterTagOutFlg(),
				 $scope.deferredGetTagDeliveryOutFlg(),
				 // 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				 $scope.deferredGetPackingSlipAutoOutputFlg(),
				 // 米国出荷ドキュメント追加対応 2018.01.07 PYM End
				 // キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
				 $scope.deferredGetCesIntegrationFlg(),
				 // キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
				 $scope.deferredGetHtCharReadFlg(),
				 //[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End
				 //[#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
				 $scope.deferredGetInspectionLabelOutFlg(),
				 //[#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End
				 // [#5112][v3.1] カテゴリピッキング 新規項目追加 2018.07.24 fujiwara Add Start
				 $scope.deferredGetSglRowPicFlg(),
				 $scope.deferredGetTotalPicFlg(),
				 $scope.deferredGetPicMthdRcmdFlg(),
				 $scope.deferredGetPicMthdRcmdBreakKey(),
				 // [#5112][v3.1] カテゴリピッキング 新規項目追加 2018.07.24 fujiwara Add End
				 // [Ver3.1][#5137] カテゴリ ピッキング提案 新規追加 2018.09.26 matsumoto Add Start
				 $scope.deferredGetMulPlPiclistOutFlg(),
				 $scope.deferredGetSglSlPiclistOutFlg(),
				 // [Ver3.1][#5137] カテゴリ ピッキング提案 新規追加 2018.09.26 matsumoto Add End
				 // [#5112][v3.1] カテゴリ 送り状・荷札・納品明細 新規項目追加 2018.07.24 fujiwara Add Start
				 $scope.deferredGetAfterDelivSlipOutTgt(),
				 $scope.deferredGetSglRowInspAfterOutCls(),
				 // [#5112][v3.1] カテゴリ 送り状・荷札・納品明細 新規項目追加 追加 2018.07.24 fujiwara Add End
				 // [#5112][v3.1] カテゴリ出庫指示内の項目データ取得 2018.07.24 fujiwara Add Start
				 $scope.deferredGetAutoShipInstFlg(),
				 $scope.deferredGetStockOutAutoInstFlg(),
				 $scope.deferredGetAutoEmgSetFlg(),
				 $scope.deferredGetAutoEmgSetTgt(),
				 $scope.deferredGetStockOutAllocCls(),
				 $scope.deferredGetStockOutInstCxlFlg(),
				 // [#5112][v3.1] カテゴリ出庫指示内の項目データ取得 2018.07.24 fujiwara Add End
				 ]
		)
		.then(function(response) {
			$scope.setGridShapeList();
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetCenterList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 *  センタ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCenterList = function () {

		// userInfoのセンタリストの場合、新規登録したセンタが追加されていないため
		// 新たに登録されたセンタリストを取得する。

		var deferred = $q.defer();

		api.userCenter.query().then(function(response){

			$scope.centerList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#1815] 新規登録したセンタが表示されない問題を修正 2017.05.23 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
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
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetClientList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 *  荷主取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientList = function () {
		var deferred = $q.defer();

		var request = {};
		api.clientList.query(request).then(function(response){
			$scope.clientList = response.data;
			setShapeListMap();
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetStoreNoFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫No.管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStoreNoFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STORE_NO_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.storeNoFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetMergeCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫No.マージ区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMergeCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MERGE_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.mergeClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetAllocSortKey
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 引当ソートキーの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAllocSortKey = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLOC_SORT_KEY";

		api.dropdownList.query(request).then(function(response){
			$scope.allocSortKeyList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetOverStoreNumFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 過入荷可フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOverStoreNumFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "OVER_STORE_NUM_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.overStoreNumFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPastStoreDtFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 過去日入力可フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPastStoreDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PAST_STORE_DT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.pastStoreDtFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetUseHtShipFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 出荷時HT使用フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetUseHtShipFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "USE_HT_SHIP_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.useHtShipFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana End

	//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetUseHtShipFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 検品後荷札出力フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAfterTagOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AFTER_TAG_OUT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.afterTagOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetTagDeliveryOutFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 荷札納品書在中出力フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTagDeliveryOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAG_DELIVERY_OUT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.tagDeliveryOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetPackingSlipAutoOutputFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 納品明細書自動発行フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingSlipAutoOutputFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_SLIP_AUTO_OUTPUT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.packingSlipAutoOutputFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// 米国出荷ドキュメント追加対応 2018.01.07 PYM End

	//キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetCesIntegrationFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * CES連携フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCesIntegrationFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CES_INTEGRATION_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.cesIntegrationFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetHtCharReadFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * HT文字認識使用フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetHtCharReadFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "HT_CHAR_READ_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.htCharReadFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetStoreDtFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫日管理区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStoreDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STORE_DT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.storeDtFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetCasePicFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * ケースピックフラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCasePicFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CASE_PIC_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.casePicFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetMultiPicCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * マルチピック計算区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMultiPicCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MULTI_PIC_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.multiPicClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetReplenishUnitCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 補充単位区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReplenishUnitCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISH_UNIT_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.rgReplenishUnitClsList = response.data;
			$scope.emReplenishUnitClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetWarehouseCd
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 緊急補充倉庫の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {
		var deferred = $q.defer();

		var request = {};
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		request.centerId = $scope.centerId;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End

		if (request.centerId == null || request.centerId == ""){
			return;
		}
		api.wareHouseList.query(request).then(function(response){
			$scope.warehouseList = response.data;
			setZoneListMap();
			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetEmReplenishAllocCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 緊急補充ロケ割付方法の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmReplenishAllocCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISH_ALLOC_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.emReplenishAllocClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPackingCalCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 梱包計算処理区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingCalCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_CAL_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.packingCalClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPackingProcessCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 詰込区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingProcessCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_PROCESS_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.packingProcessClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetProductPartPacking
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 商品毎別梱包の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProductPartPacking = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_PART_PACKING";

		api.dropdownList.query(request).then(function(response){
			$scope.productPartPackingList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [Ver3.0] unit of measure対応 2017.11.24 NING Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetDecimalProductPacking
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 小数管理商品梱包単位の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDecimalProductPacking = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DECIMAL_PRODUCT_PACKING";

		api.dropdownList.query(request).then(function(response){
			$scope.decimalProductPackingList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [Ver3.0] unit of measure対応 2017.11.24 NING End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetBoxGrpList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 梱包荷材グループの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBoxGrpList = function () {
		var deferred = $q.defer();

		var request = {};
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		request.centerId = $scope.centerId;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
		if (request.centerId == null || request.centerId == ""){
			return;
		}
		api.boxGrpList.query(request).then(function(response){
			$scope.boxGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetProductLabelOutUnitList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 商品ラベル出力単位の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProductLabelOutUnitList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_LABEL_OUT_UNIT";

		api.dropdownList.query(request).then(function(response){
			$scope.ProductLabelOutUnitList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetResultAfterProductLabelList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 実績入力後/商品ラベル出力の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetResultAfterProductLabelList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESULT_AFTER_PRODUCT_LABEL";

		api.dropdownList.query(request).then(function(response){
			$scope.resultAfterProductLabelList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetproductLabelJanBarcodeList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 商品ラベルJANCDバーコード種別の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetproductLabelJanBarcodeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_LABEL_JAN_BARCODE";

		api.dropdownList.query(request).then(function(response){
			$scope.productLabelJanBarcodeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetproductLabelProdBarcodeList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 商品ラベル商品CDバーコード種別の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetproductLabelProdBarcodeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_LABEL_PROD_BARCODE";

		api.dropdownList.query(request).then(function(response){
			$scope.productLabelProdBarcodeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetboxSelectSkipList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 荷材選択スキップの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetboxSelectSkipList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BOX_SELECT_SKIP";

		api.dropdownList.query(request).then(function(response){
			$scope.boxSelectSkipList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetdefaultBoxIdList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * デフォルト荷材の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetdefaultBoxIdList = function () {
		var deferred = $q.defer();

		var request = {};
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		request.centerCd = $scope.centerCd;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End

		api.defaultBoxIdList.query(request).then(function(response){
			$scope.defaultBoxIdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End

	// [Ver3.1][#5137] カテゴリ 出荷検品 新規項目追加 2018.09.26 matsumoto Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetErrorSoundPlayFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * エラー音再生フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetErrorSoundPlayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'SOUND_PLAY_FLG';

		api.dropdownList.query(request).then(function(response){
			$scope.errorSoundPlayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetWarnSoundPlayFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 警告音再生フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarnSoundPlayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'SOUND_PLAY_FLG';

		api.dropdownList.query(request).then(function(response){
			$scope.warnSoundPlayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetInspSoundPlayFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 検品音再生フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInspSoundPlayFlg = function (){
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'SOUND_PLAY_FLG';

		api.dropdownList.query(request).then(function(response){
			$scope.inspSoundPlayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetInspCompSoundPlayFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 検品完了音再生フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInspCompSoundPlayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'SOUND_PLAY_FLG';

		api.dropdownList.query(request).then(function(response){
			$scope.inspCompSoundPlayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	// [Ver3.1][#5137] カテゴリ 出荷検品 新規項目追加 2018.09.26 matsumoto Add End

	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetInspectionLabelOutFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * SD検品ラベル出力フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInspectionLabelOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INSPECTION_LABEL_OUT_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.inspectionLabelOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

	// [#5112][v3.1] カテゴリ ピッキング 新規項目追加 2018.07.24 fujiwara Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetSglRowPicFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 単行ピックフラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSglRowPicFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SGL_ROW_PIC_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.sglRowPicFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetTotalPicFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * トータルピックフラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTotalPicFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TOTAL_PIC_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.totalPicFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetPicMthdRcmdFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 最適ピック提案フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicMthdRcmdFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PIC_MTHD_RCMD_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.picMthdRcmdFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetPicMthdRcmdBreakKey
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 最適ピック提案ブレイクキーの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicMthdRcmdBreakKey = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PIC_MTHD_RCMD_BREAK_KEY";

		api.dropdownList.query(request).then(function(response){
			$scope.picMthdRcmdBreakKeyList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [#5112][v3.1] カテゴリ ピッキング 新規項目追加 2018.07.24 fujiwara Add End

	// [Ver3.1][#5137]カテゴリ ピッキング提案 新規追加 2018.09.26 matsumoto Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetMulPlPiclistOutFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * マルチピック摘み取りリスト出力フラグの取得・設定処理 (同期可能) <br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMulPlPiclistOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'PIC_MTHD_RCMD_LIST_OUT';

		api.dropdownList.query(request).then(function(response){
			$scope.picMthdRcmdMltPlOutList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetsglSlPiclistOutFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 単行ピック種蒔きリスト出力フラグの取得・設定処理 (同期可能) <br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSglSlPiclistOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = 'PIC_MTHD_RCMD_LIST_OUT';

		api.dropdownList.query(request).then(function(response){
			$scope.picMthdRcmdSplSlOutList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	// [Ver3.1][#5137]カテゴリ ピッキング提案 新規追加 2018.09.26 matsumoto Add End

	// [#5112][v3.1] カテゴリ 送り状・荷札・納品明細 追加 2018.07.24 fujiwara Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetAfterDelivSlipOutTgt
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 検品後納品明細出力対象の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAfterDelivSlipOutTgt = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AFTER_DELIV_SLIP_OUT_TGT";

		api.dropdownList.query(request).then(function(response){
			$scope.afterDelivSlipOutTgtList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetSglRowInspAfterOutCls
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 単行出荷検品荷札/納品明細出力区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSglRowInspAfterOutCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SGL_ROW_INSP_AFTER_OUT_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.sglRowInspAfterOutClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [#5112][v3.1] カテゴリ 送り状・荷札・納品明細 新規項目追加 2018.07.24 fujiwara Add End

	// [#5112][v3.1] カテゴリ出庫指示内の項目データ取得 2018.07.24 fujiwara Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetAutoShipInstFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 自動出庫指示フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAutoShipInstFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AUTO_SHIP_INST_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.autoShipInstFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetStockOutAutoInstFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 欠品時自動出庫指示フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockOutAutoInstFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_OUT_AUTO_INST_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.stockOutAutoInstFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetAutoEmgSetFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 自動緊急フラグ設定フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAutoEmgSetFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AUTO_EMG_SET_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.autoEmgSetFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetAutoEmgSetTgt
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 自動緊急フラグ判断対象の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAutoEmgSetTgt = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "AUTO_EMG_SET_TGT";

		api.dropdownList.query(request).then(function(response){
			$scope.autoEmgSetTgtList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetStockOutAllocCls
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 欠品時引当区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockOutAllocCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_OUT_ALLOC_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.stockOutAllocClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetStockOutInstCxlFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 欠品時出庫指示取消フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockOutInstCxlFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_OUT_INST_CXL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.stockOutInstCxlFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [#5112][v3.1] カテゴリ出庫指示内の項目データ取得 2018.07.24 fujiwara Add End

	// [Ver2.2.1-#1755 入庫ラベル最新化] 2017.07.24 sampei Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetResultAfterProductTargetList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 実績入力後入庫/商品ラベル出力対象の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetResultAfterProductTargetList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESULT_AFTER_PRODUCT_TARGET";

		api.dropdownList.query(request).then(function(response){
			$scope.resultAfterProductTargetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [Ver2.2.1-#1755 入庫ラベル最新化] 2017.07.24 sampei End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * パラメータマスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {
			// 訂正
			var request = {};
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
			request.clientCenterId = $scope.clientCenterId;
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
			api.parameterMasterEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.mClientCenter = response.data.mClientCenter;

				// [1.1.4-CT-023] 修正時は荷主編集不可に変更 2016/5/23 ichikawa Start
				directiveControl.editable($scope, 'clientCd', false);
				// [1.1.4-CT-023] 修正時は荷主編集不可に変更 2016/5/23 ichikawa End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {

			var request = {};
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
			request.centerId = $scope.centerId;
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
			// 新規
			api.parameterMasterEdit.initNew(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.mClientCenter = response.data.mClientCenter;

				// 初期値設定

				// [1.1.4-CT-023] センタ表示を追加 2016/5/23 ichikawa Start
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
				// センタの初期値設定
				$scope.mClientCenter.mcenter.centerCd = $scope.centerCd;
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
				// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana Start
				$scope.mClientCenter.mparamAsOne.useHtShipFlg = owsCommon.getDefaultValue($scope.useHtShipFlgList);
				// [1.1.4-CT-069] 出荷時HT使用フラグ追加 2016.06.01 kawana End
				// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
				$scope.mClientCenter.mparamAsOne.casePicFlg = owsCommon.getDefaultValue($scope.casePicFlgList);
				// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End
				// [1.1.4-CT-023] センタ表示を追加 2016/5/23 ichikawa End
				$scope.mClientCenter.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				$scope.mClientCenter.mparamAsOne.packingSlipAutoOutputFlg = "0";
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM End
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
				$scope.mClientCenter.mparamAsOne.cesIntegrationFlg = "0";
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End

				directiveControl.editable($scope, 'delFlg', false);
				// [#1472] 倉庫が1件もないセンターで新規作成するとjsエラー発生(デフォルト倉庫の選択処理が不要のため削除) 2017.03.30 kawana

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#register
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start

		// 辞書検証チェック以外のチェック
		var promiseCheck = $q.all([
			checkMergeCls(),			// マージ区分チェック
			// [Ver3.0] unit of measure対応 2017.11.24 NING Del
			// checkDuplicateShapeErr(),	// 商品荷姿チェック
			checkMultiPicCls(),			// マルチピック計算区分チェック
			checkPackingCalCls(),		// 梱包計算処理区分チェック
			// [1.1.4-CT-084] 緊急補充ロケ割付方法を必須から任意に変更 2016.06.01 kawana Start
			checkReplenish(),			// 在庫補充チェック
			// [1.1.4-CT-084] 緊急補充ロケ割付方法を必須から任意に変更 2016.06.01 kawana End
			checkDuplicateSortKeyErr(),	// ソートキーチェック
            //Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
			checkBoxSelectSkip(),	//荷材選択スキップチェック
			//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			checkResultAfterProductTarget(),
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			// [#5112][v3.1] 追加パラメータのチェックを追加 2018.10.10 fujiwara Start
			checkSglRowPicFlg(),
			checkAutoShipInstFlg(),
			checkAutoEmgSetFlg(),
			checkStockOutAllocCls(),
			checkPicMthdRcmd(),
			checkAfterTagOut()
			// [#5112][v3.1] 追加パラメータのチェックを追加 2018.10.10 fujiwara End
		]);

		promiseCheck.then(function(){
			owsCommon.syncExec(function() {

				var isError = $scope.searchinputform.$invalid;

				if(isError) {
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
				request.mode = $scope.screenMode;
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
				request.data.body = [];
				request.data.body[0] = $scope.mClientCenter;
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
				request.data.body[0].centerId = $scope.centerId;
				// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End

				// 入力チェック
				api.parameterMasterEdit.inputCheck(request).then(function(response){

					// [#1472] jsスクリプトエラー発生 2017.03.30 kawana Start

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// [#1472] jsスクリプトエラー発生 2017.03.30 kawana End

					// パラメータマスタメンテナンスデータ登録または更新
					api.parameterMasterEdit.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}
						if ($scope.screenMode == SCREEN_MODE.Update) {
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						} else {
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						}
					});
				});
			});
		// エラー時の処理
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				directiveControl.firstErrorOnFocus('searchinputform');
				return;
			});
		});

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

	};

	/**
	 * センタ,倉庫毎のゾーンリスト
	 */
	var zoneListMap = {};

	/**
	 * センタ毎のゾーンリスト
	 */
	var zoneListMapCenter = {};

	/**
	 * 検索エリアに設定されたセンタCD、倉庫リストから
	 * ゾーンリストを取得し内部変数に保存する
	 */
	var setZoneListMap = function(){

		var deferred = $q.defer();

		// センタCD
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		var centerCd = $scope.centerCd;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
		if (!centerCd) {
			return;
		}

		if (!$scope.warehouseList) {
			return;
		}

		var countGetZone = $scope.warehouseList.length + 1;

		// センタ毎のゾーンリストの取得(非同期)
		$scope.deferredGetZoneList(centerCd, null).then(function(response){

			// 取得したゾーンリストを保存
			zoneListMapCenter[response.centerCd] = response.zoneList;

			countGetZone = countGetZone - 1;
			if(countGetZone <= 0) {
				// 全ゾーンの取得完了
				deferred.resolve();
			}
		});

		// 倉庫リストの繰返
		for (var i = 0 ; i < $scope.warehouseList.length ; i++) {
			var warehouseCd = $scope.warehouseList[i].warehouseCd;
			if (!warehouseCd) {
				continue;
			}

			// ゾーンリストの取得(非同期)
			$scope.deferredGetZoneList(centerCd, warehouseCd).then(function(response){

				// 取得したゾーンリストを保存
				if(!zoneListMap[response.centerCd]){
					zoneListMap[response.centerCd] = {};
				}

				zoneListMap[response.centerCd][response.warehouseCd] = response.zoneList;

				countGetZone = countGetZone - 1;
				if(countGetZone <= 0) {
					// 全ゾーンの取得完了
					deferred.resolve();
				}
			});
		}

		return deferred.promise;
	}

	/**
	 * 引数のセンタCD,倉庫CDを条件にゾーンリストを作成し返却する
	 */
	$scope.deferredGetZoneList = function(centerCd, warehouseCd) {

		var deferred = $q.defer();

		// 戻り値
		var result = {};
		result.centerCd = centerCd;
		result.warehouseCd = warehouseCd;

		if (!centerCd) {
			deferred.reject(result);
			return deferred.promise;
		}

		var request = {};
		request.data = {};
		request.centerCd = centerCd;
		request.warehouseCd = warehouseCd;
		api.zoneList.keyValueList(request).then(function(response){

			result.zoneList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	}

	/**
	 * グリッドのゾーンリストの設定
	 * 選択されたセンタ、倉庫に従ってゾーンリストを設定する
	 */
	$scope.setGridZoneList = function() {

		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
		var centerCd = $scope.centerCd;
		// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End

		if (!centerCd) {
			return null;
		}
		var clientCent = $scope.mClientCenter;
		if (!clientCent) {
			return null;
		}

		var mwarehouse = $scope.mClientCenter.mparamAsOne.mzone.mwarehouse;
		if (!mwarehouse) {
			return null;
		}

		var warehouseCd = $scope.mClientCenter.mparamAsOne.mzone.mwarehouse.warehouseCd;
		if (!warehouseCd) {
			return null;
		}

		if (zoneListMap[centerCd]) {
			if (zoneListMap[centerCd][warehouseCd]) {

				return zoneListMap[centerCd][warehouseCd];
			} else {

				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * 荷主毎の荷姿リスト
	 */
	var shapeListMap = {};

	/**
	 * 検索エリアに設定された荷主ID、荷主リストから
	 * 荷姿リストを取得し内部変数に保存する
	 */
	var setShapeListMap = function(){

		var deferred = $q.defer();
		if (!$scope.clientList) {
			return;
		}
		// [1.1.4-CT-058] 荷姿のコンボボックスを荷主に連動に変更 2016.05.25 ichikawa Staer
		var countGetShape = $scope.clientList.length;
		// [1.1.4-CT-058] 荷姿のコンボボックスを荷主に連動に変更 2016.05.25 ichikawa End
		// 荷姿リストの繰返
		for (var i = 0 ; i < $scope.clientList.length ; i++) {
			var clientCd = $scope.clientList[i].clientCd;
			if (!clientCd) {
				continue;
			}

			// 荷姿リストの取得(非同期)
			$scope.deferredGetShapeList(clientCd).then(function(response){

				// 取得したゾーンリストを保存
				if(!shapeListMap[response.clientCd]){
					shapeListMap[response.clientCd] = {};
				}

				shapeListMap[response.clientCd] = response.shapeList;

				countGetShape = countGetShape - 1;
				if(countGetShape <= 0) {
					// 全荷姿の取得完了
					deferred.resolve();
				}
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetShapeList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 荷姿の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShapeList = function (clientCd) {
		var deferred = $q.defer();

		var request = {};
		var result = {};
		request.clientCd = clientCd;
		result.clientCd = clientCd;
		api.shapeList.query(request).then(function(response){
			// [1.1.4-CT-058] 画面の荷姿リストの設定を削除 2016.05.25 ichikawa
			result.shapeList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	};

	/**
	 * グリッドの荷姿リストの設定
	 * 選択された荷主に従っての荷姿リストを設定する
	 */
	$scope.setGridShapeList = function() {

		var clientCd;
		if (typeof($scope.mClientCenter) == "undefined") {
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana Start
			clientCd = $scope.clientCd;
			// [#5416][v3.1] URLから値を取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.22 kawana End
		// 新規登録時に発生するエラーを回避 2016.05.25 ichikawa Start
		} else if (!$scope.mClientCenter.mclient) {
			clientCd = null;
			// 新規登録時に発生するエラーを回避 2016.05.25 ichikawa End
		} else {
			clientCd = $scope.mClientCenter.mclient.clientCd;
		}

		if (!clientCd) {
			$scope.shapeList = null;
			return null;
		}
		if (shapeListMap[clientCd]) {
			if (shapeListMap[clientCd]) {
				$scope.shapeList = shapeListMap[clientCd];
				return shapeListMap[clientCd];
			} else {
				$scope.shapeList = null;
				return null;
			}
		} else {
			$scope.shapeList = null;
			return null;
		}
	}

	var checkDuplicateShapeErr = function(){

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

		optionMessageControl.hide($scope, "caseShapeCd");
		optionMessageControl.hide($scope, "bowlShapeCd");
		optionMessageControl.hide($scope, "pieceShapeCd");

		var shapeId1 = $scope.mClientCenter.mparamAsOne.mshapeByCaseShapeId.shapeCd;;
		var shapeId2 = $scope.mClientCenter.mparamAsOne.mshapeByBowlShapeId.shapeCd;;
		var shapeId3 = $scope.mClientCenter.mparamAsOne.mshapeByPieceShapeId.shapeCd;;

		var shapeIds = [shapeId1, shapeId2, shapeId3];
		var shapeIdElementStrs = ["caseShapeCd", "bowlShapeCd", "pieceShapeCd"];

		// エラーメッセージCD
		var messageCd = "dataDuplicateError";

		var isErr = false;
		for(var i = 0 ; i < shapeIds.length ; i++){
			// 比較元
			var srcKey =  shapeIds[i];
			if(srcKey){
				// 定義あり

				// 残りが重複していないかチェック
				for(var j = i+1 ; j < shapeIds.length ; j ++){
					// 比較先
					var dstKey = shapeIds[j];

					// 比較
					if(srcKey == dstKey){
						// 重複
						var srcElementStr =  shapeIdElementStrs[i];
						var dstElementStr =  shapeIdElementStrs[j];
						optionMessageControl.show($scope, srcElementStr, $filter('owfMessage')(messageCd));
						optionMessageControl.show($scope, dstElementStr, $filter('owfMessage')(messageCd));

						isErr = true;
					}
				}
			}
		}

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}

		return deferred.promise;
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
	}

	// マルチピック計算区分が「1：マルチピック計算有り」の場合、バケット列数とバケット段数が必須入力
	var checkMultiPicCls = function(){

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

		optionMessageControl.hide($scope, "backetColNum");
		optionMessageControl.hide($scope, "backetRowNum");
		var isErr = false;
		// マルチピック計算区分が「1：マルチピック計算有り」の場合、バケット列数とバケット段数が必須入力
		if ($scope.mClientCenter.mparamAsOne.multiPicCls == "1" ) {
			var errFlg = false;
			if(!($scope.mClientCenter.mparamAsOne.backetColNum)
					|| 0 == $scope.mClientCenter.mparamAsOne.backetColNum.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "backetColNum", $filter('owfMessage')(messageCd));
				isErr = true;
			} else if ($scope.mClientCenter.mparamAsOne.backetColNum > 6) {
				// エラーメッセージCD
				var messageCd = "maxlengthError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "backetColNum", $filter('owfMessage')(messageCd, "6"));
				isErr = true;
			}

			if(!($scope.mClientCenter.mparamAsOne.backetRowNum)
					|| 0 == $scope.mClientCenter.mparamAsOne.backetRowNum.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "backetRowNum", $filter('owfMessage')(messageCd));
				isErr = true;
			} else if ($scope.mClientCenter.mparamAsOne.backetRowNum > 6) {
				// エラーメッセージCD
				var messageCd = "maxlengthError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "backetRowNum", $filter('owfMessage')(messageCd, "6"));
				isErr = true;
			}
		}

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}

		return deferred.promise;
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
	}

	var checkMergeCls = function() {

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

		optionMessageControl.hide($scope, "mergeCls");
		if($scope.mClientCenter.mparamAsOne.storeNoFlg =="0"){
			if($scope.mClientCenter.mparamAsOne.mergeCls =="01"||$scope.mClientCenter.mparamAsOne.mergeCls =="02"){
				var messageCd2 = "mergeClsCannotSelectExceptionCaseError";
				optionMessageControl.show($scope, "mergeCls", $filter('owfMessage')(messageCd2));

				// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
				deferred.reject();
				// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
			}
		}

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		deferred.resolve();
		return deferred.promise;
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
	}

	// 梱包計算処理区分が"1"の場合、詰込区分、商品毎別梱包と梱包荷材グループ項目が必須入力
	var checkPackingCalCls = function() {

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

		optionMessageControl.hide($scope, "packingProcessCls");
		optionMessageControl.hide($scope, "productPartPacking");
		// [Ver3.0] unit of measure対応 2017.11.24 NING Start
		optionMessageControl.hide($scope, "decimalProductPacking");
		// [Ver3.0] unit of measure対応 2017.11.24 NING End
		optionMessageControl.hide($scope, "boxGrpCd");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.packingCalCls == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.packingProcessCls)
					|| 0 == $scope.mClientCenter.mparamAsOne.packingProcessCls.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "packingProcessCls", $filter('owfMessage')(messageCd));

				isErr = true;
			}
			if(!($scope.mClientCenter.mparamAsOne.productPartPacking)
					|| 0 == $scope.mClientCenter.mparamAsOne.productPartPacking.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "productPartPacking", $filter('owfMessage')(messageCd));

				isErr = true;
			}
			// [Ver3.0] unit of measure対応 2017.11.24 NING Start
			if(!($scope.mClientCenter.mparamAsOne.decimalProductPacking)
					|| 0 == $scope.mClientCenter.mparamAsOne.decimalProductPacking.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "decimalProductPacking", $filter('owfMessage')(messageCd));

				isErr = true;
			}
			// [Ver3.0] unit of measure対応 2017.11.24 NING End
			if(!($scope.mClientCenter.mparamAsOne.mboxGrp.boxGrpCd)
					|| 0 == $scope.mClientCenter.mparamAsOne.mboxGrp.boxGrpCd.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "boxGrpCd", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}

		return deferred.promise;
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
	}

	// [1.1.4-CT-084] 緊急補充ロケ割付方法を必須から任意に変更 2016.06.01 kawana Start

	// 登録前の在庫補充項目のチェック
	var checkReplenish = function(){

		var deferred = $q.defer();

		optionMessageControl.hide($scope, "zoneCd");
		optionMessageControl.hide($scope, "emReplenishAllocCls");

		var isErr = false;

		// 緊急補充倉庫が入力されている場合、緊急補充ロケ割付方法、緊急補充ゾーンは必須
		if ($scope.mClientCenter.mparamAsOne.mzone.mwarehouse.warehouseCd
				&& 0 < $scope.mClientCenter.mparamAsOne.mzone.mwarehouse.warehouseCd.length) {

			if(!$scope.mClientCenter.mparamAsOne.mzone.zoneCd
				|| 0 == $scope.mClientCenter.mparamAsOne.mzone.zoneCd.length) {

				var messageCd = "necessaryItemNotInputError";
				optionMessageControl.show($scope, "zoneCd", $filter('owfMessage')(messageCd));

				isErr = true;
			}

			if(!$scope.mClientCenter.mparamAsOne.emReplenishAllocCls
					|| 0 == $scope.mClientCenter.mparamAsOne.emReplenishAllocCls.length) {

				var messageCd = "necessaryItemNotInputError";
				optionMessageControl.show($scope, "emReplenishAllocCls", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}

		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}

		return deferred.promise;
	}

	// [1.1.4-CT-084] 緊急補充ロケ割付方法を必須から任意に変更 2016.06.01 kawana End

	// ソートキーに重複がないかのチェック
	var checkDuplicateSortKeyErr = function(rowIndex){

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		var deferred = $q.defer();
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End

		var sortkey1 = $scope.mClientCenter.mparamAsOne.allocSortKey1;
		var sortkey2 = $scope.mClientCenter.mparamAsOne.allocSortKey2;
		var sortkey3 = $scope.mClientCenter.mparamAsOne.allocSortKey3;
		var sortkey4 = $scope.mClientCenter.mparamAsOne.allocSortKey4;
		var sortkey5 = $scope.mClientCenter.mparamAsOne.allocSortKey5;
		var sortkey6 = $scope.mClientCenter.mparamAsOne.allocSortKey6;
		var sortkey7 = $scope.mClientCenter.mparamAsOne.allocSortKey7;
		var sortkey8 = $scope.mClientCenter.mparamAsOne.allocSortKey8;

		var sortkeys = [sortkey1, sortkey2, sortkey3, sortkey4, sortkey5, sortkey6, sortkey7, sortkey8];

		// エラーメッセージCD
		var messageCd = "dataDuplicateError";

		var isErr = false;
		for(var i = 0 ; i < sortkeys.length ; i++){
			// 比較元
			var srcKey =  sortkeys[i];
			if(srcKey){
				// 定義あり

				// 残りが重複していないかチェック
				for(var j = i+1 ; j < sortkeys.length ; j ++){
					// 比較先
					var dstKey = sortkeys[j];

					// 比較
					if(srcKey == dstKey){
						// 重複
						var srcElementStr =  "allocSortKey" + (i+1);
						var dstElementStr =  "allocSortKey" + (j+1);
						optionMessageControl.show($scope, srcElementStr, $filter('owfMessage')(messageCd));
						optionMessageControl.show($scope, dstElementStr, $filter('owfMessage')(messageCd));

						isErr = true;
					}
				}
			}
		}

		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana Start
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}

		return deferred.promise;
		// [ON推-品向-1097] 一度エラーになると登録ボタンが押せない問題を修正 2016.04.13 kawana End
	}
	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
	// 荷材選択スキップが"1"の場合、デフォルト荷材項目が必須入力
	var checkBoxSelectSkip = function() {

		var deferred = $q.defer();
		optionMessageControl.hide($scope, "defaultBoxCd");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.boxSelectSkip == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.mbox.boxCd)
					|| 0 == $scope.mClientCenter.mparamAsOne.mbox.boxCd.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "defaultBoxCd", $filter('owfMessage')(messageCd));

				isErr = true;
			}

		}
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}
	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End

	// [#5112][v3.1] 追加パラメータのチェックを追加 2018.10.15 fujiwara Start

	// 単行ピックの項目間チェック
	var checkSglRowPicFlg = function() {

		var deferred = $q.defer();
		optionMessageControl.hide($scope, "sglRowPicMaxInstNum");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.sglRowPicFlg == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.sglRowPicMaxInstNum)
					|| 0 == $scope.mClientCenter.mparamAsOne.sglRowPicMaxInstNum.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "sglRowPicMaxInstNum", $filter('owfMessage')(messageCd));

				isErr = true;
			}

		}
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// 自動出庫指示の項目間チェック
	var checkAutoShipInstFlg = function() {

		var deferred = $q.defer();
		optionMessageControl.hide($scope, "stockOutAutoInstFlg");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.autoShipInstFlg == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.stockOutAutoInstFlg)
					|| 0 == $scope.mClientCenter.mparamAsOne.stockOutAutoInstFlg.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "stockOutAutoInstFlg", $filter('owfMessage')(messageCd));

				isErr = true;
			}

		}
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// 自動緊急フラグの項目間チェック
	var checkAutoEmgSetFlg = function() {

		var deferred = $q.defer();
		optionMessageControl.hide($scope, "autoEmgSetTgt");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.autoEmgSetFlg == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.autoEmgSetTgt)
					|| 0 == $scope.mClientCenter.mparamAsOne.autoEmgSetTgt.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "autoEmgSetTgt", $filter('owfMessage')(messageCd));

				isErr = true;
			}

		}
		var deferred = $q.defer();
		optionMessageControl.hide($scope, "autoEmgSetMinute");
		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.autoEmgSetFlg == "1" ) {

			if(!($scope.mClientCenter.mparamAsOne.autoEmgSetMinute)
					|| 0 == $scope.mClientCenter.mparamAsOne.autoEmgSetMinute.length) {
				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "autoEmgSetMinute", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// 出庫指示時、欠品区分の項目間チェック
	var checkStockOutAllocCls = function() {

		var deferred = $q.defer();
		var isErr = false;

		if ($scope.mClientCenter.mparamAsOne.stockOutInstCxlFlg == "0") {
			// 欠品時引当区分 欠品時出庫指示取消フラグが「0：出庫指示を取消しない」の場合は必須

			if (!($scope.mClientCenter.mparamAsOne.stockOutAllocCls)
					|| 0 == $scope.mClientCenter.mparamAsOne.stockOutAllocCls.length) {

				// エラーメッセージCD
				var messageCd = "necessaryItemNotInputError";
				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "stockOutAllocCls", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}

		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// 最適ピッキング提案の項目間チェック
	var checkPicMthdRcmd = function() {

		var deferred = $q.defer();
		var isErr = false;

		// エラーメッセージCD
		var messageCd = "necessaryItemNotInputError";

		if ($scope.mClientCenter.mparamAsOne.picMthdRcmdFlg == "1") {
			// 最適ピッキング提案フラグ = 使用

			// マルチピック摘み取りリスト出力フラグの入力チェック
			if (!($scope.mClientCenter.mparamAsOne.picMthdRcmdMltPlOut)
					|| 0 == $scope.mClientCenter.mparamAsOne.picMthdRcmdMltPlOut.length) {

				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "picMthdRcmdMltPlOut", $filter('owfMessage')(messageCd));

				isErr = true;
			}

			// 単行ピック種蒔きリスト出力フラグの入力チェック
			if (!($scope.mClientCenter.mparamAsOne.picMthdRcmdSplSlOut)
					|| 0 == $scope.mClientCenter.mparamAsOne.picMthdRcmdSplSlOut.length) {

				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "picMthdRcmdSplSlOut", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}

		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// 荷札・納品明細出力の項目間チェック
	var checkAfterTagOut = function() {

		var deferred = $q.defer();
		var isErr = false;

		// エラーメッセージCD
		var messageCd = "necessaryItemNotInputError";

		if ( ($scope.mClientCenter.mparamAsOne.afterDelivSlipOutFlg === "1") ||
			 ($scope.mClientCenter.mparamAsOne.afterDelivSlipOutFlg === "2") ||
			 ($scope.mClientCenter.mparamAsOne.afterDelivSlipOutFlg === "3") ){
			// 最適ピッキング提案フラグ = 使用

			// マルチピック摘み取りリスト出力フラグの入力チェック
			if (!($scope.mClientCenter.mparamAsOne.afterDelivSlipOutTgt)
					|| 0 == $scope.mClientCenter.mparamAsOne.afterDelivSlipOutTgt.length) {

				// 対象の項目にエラーを表示
				optionMessageControl.show($scope, "afterDelivSlipOutTgt", $filter('owfMessage')(messageCd));

				isErr = true;
			}
		}

		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}

	// [#5112][v3.1] 追加パラメータのチェックを追加 2018.10.15 fujiwara End

	// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
	var checkResultAfterProductTarget = function() {

		var deferred = $q.defer();

		var isErr = false;
		if ($scope.mClientCenter.mparamAsOne.resultAfterProductLabel != "0"  && $scope.mClientCenter.mparamAsOne.resultAfterProductTarget == null) {
			// エラーメッセージCD
			var messageCd = "necessaryItemNotInputError";
			// 対象の項目にエラーを表示
			optionMessageControl.show($scope, "resultAfterProductTarget", $filter('owfMessage')(messageCd));
			// 最初のエラーにフォーカス
			directiveControl.firstErrorOnFocus('searchinputform');
			isErr = true;
		}
		if(isErr) {
			deferred.reject();
		} else {
			deferred.resolve();
		}
		return deferred.promise;
	}
	// [#1755]入庫ラベル最新化 2017.07.24 sampei End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
