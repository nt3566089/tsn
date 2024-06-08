/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseShippingList
 *
 * @description
 * 配送コース別出荷進捗画面<br>
 *
 */
angular.module('oneslogiWms.DeliveryCourseShippingList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryCourseShippingList.service:deliveryCourseShippingListApi
 *
 * @description
 * 配送コース別出荷進捗画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * deliveryCourseShippingList 配送コース別出庫指示一覧データ操作用WebApi<br>
 * ・resources/shipping/deliveryCourseShippingList/init 初期処理WebAPI<br>
 * ・resources/shipping/deliveryCourseShippingList/search 配送コース別出庫指示一覧データ取得WebAPI<br>
 * ・resources/shipping/deliveryCourseShippingList/checkIndicator チェック処理(出庫指示時)WebAPI<br>
 * ・resources/shipping/deliveryCourseShippingList/indicator 出庫指示処理WebAPI<br>
 * ・resources/shipping/deliveryCourseShippingList/checkIndicatingLift チェック処理(出庫指示解除時)WebAPI<br>
 * ・resources/shipping/deliveryCourseShippingList/indicatingLift 出庫指示解除処理WebAPI<br>
 * shippingStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 出荷ステータスドロップダウンリスト用データ取得WebApi<br>
 * noAllcDisplayFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 未出荷全件ドロップダウンリスト用データ取得WebApi<br>
 * emergencyFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 緊急のみドロップダウンリスト用データ取得WebApi<br>
 * carrier 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 運送業者ドロップダウンリスト用データ取得WebApi<br>
 * carrier 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 運送業者ドロップダウンリスト用データ取得WebApi<br>
 * deliveryCourse ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 */
.factory('deliveryCourseShippingListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingStatus: AngularAPIClient.make([
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana Start
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana End
		                                       ]
		),
		noAllcDisplayFlg: AngularAPIClient.make([
		                                         ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                         ]
		),
		emergencyFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		cancelDisplay: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
		deliveryCourseShippingList: AngularAPIClient.make([
		                                                   ['init',                'GET' , 'resources/shipping/deliveryCourseShippingList/init'],//初期処理
		                                                   ['search',              'GET' , 'resources/shipping/deliveryCourseShippingList/search'],//配送コース別出庫指示一覧データ取得
		                                                   ['excel',               'GET',  'resources/shipping/deliveryCourseShippingList/search', 'excel'],
		                                                   ['checkIndicator',      'POST', 'resources/shipping/deliveryCourseShippingList/checkIndicator'],//チェック処理(出庫指示時)
		                                                   ['indicator',           'POST', 'resources/shipping/deliveryCourseShippingList/indicator'],//出庫指示処理
		                                                   // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
		                                                   ['indicatorBatch',      'POST', 'resources/shipping/deliveryCourseShippingList/indicatorBatch'],//出庫指示処理(非同期)
		                                                   // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
		                                                   ['checkIndicatingLift', 'POST', 'resources/shipping/deliveryCourseShippingList/checkIndicatingLift'],//チェック処理(出庫指示解除時)
		                                                   ['indicatingLift',      'POST', 'resources/shipping/deliveryCourseShippingList/indicatingLift']//出庫指示解除処理
		                                                   ]
		),
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
 *
 * @description
 * 配送コース別出荷進捗画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryCourseShippingList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'deliveryCourseShippingListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api) {

	//グリッドの列情報（デザイン用）
	$scope.deliveryCourseShippingListCols = [
	                                         ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#initScreen
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		// [C-EC-011] 初期検索機能追加 2015.01.29 kawana Start
		// モード設定
		$scope.screenMode = $route.current.params.mode;
		// [C-EC-011] 初期検索機能追加 2015.01.29 kawana End

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};

		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'deliveryCourseShippingList',
			columnDefs: 'deliveryCourseShippingListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
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
				 $scope.deferredGetshippingStatus(),//出荷ステータス
				 $scope.deferredGetnoAllcDisplayFlg(),//未出荷全件
				 $scope.deferredGetEmergency(),//緊急のみ
				 $scope.deferredGetCarrier(),//運送業者
				 // [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
				 $scope.deferredGetCancelDisplayList()
				 // [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}
	//荷主センタ変更対応 201７.02.24 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#centerChange
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、運送業者リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrier();
	};
	//荷主センタ変更対応 201７.02.24 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetCarrier
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.24 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.24 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetnoAllcDisplayFlg
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 未出荷全件取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetnoAllcDisplayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_ALLC_DISPLAY_FLG";

		owsCommon.getDataCacheable(api.noAllcDisplayFlg, request).then(function(response){
			$scope.noAllcDisplayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetEmergencyFgl
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 緊急のみ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergency = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_DISPLAY";

		owsCommon.getDataCacheable(api.emergencyFlg, request).then(function(response){
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetshippingStatus
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetshippingStatus = function () {
		var deferred = $q.defer();

		var request = {};
		// [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana Start
		request.classGrpCd = "SHIPPING_STATUS_SELECT";
		// [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana End

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetCancelDisplayList
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description キャンセルデータ表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCancelDisplayList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CANCEL_DATA_DISPLAY";

		owsCommon.getDataCacheable(api.cancelDisplay, request).then(function(response){
			$scope.cancelDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deferredGetInitData
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 配送コース別出荷進捗初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 通常の初期化

		api.deliveryCourseShippingList.init().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.shippingDtFrom = userInfo.systemDt;//日付(From)
			$scope.searchCondition.shippingDtTo = userInfo.systemDt;//日付(To)
			//未出荷全件
			$scope.searchCondition.noAllcDisplayFlg = owsCommon.getDefaultValue($scope.noAllcDisplayFlgList);
			//緊急のみ
			$scope.searchCondition.emergencyFlg = owsCommon.getDefaultValue($scope.emergencyFlgList);
			// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
			$scope.searchCondition.cancelDisplay = owsCommon.getDefaultValue($scope.cancelDisplayList);
			// [EC-CT1-156] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

			// [SK2-056] 検索ボタンを押す前後の進捗率モードは一致。  2014.12.15 KI Start
			strDIPS_FLG = 1;
			// [SK2-056] 検索ボタンを押す前後の進捗率モードは一致。  2014.12.15 KI End
			directiveControl.show($scope, "progressLine", false);
			directiveControl.show($scope, "progressPiece", true);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.shippingDtFrom = $route.current.params.shippingDtFrom;
				$scope.searchCondition.shippingDtTo = $route.current.params.shippingDtTo;
				$scope.searchCondition.deliveryCourseCd = $route.current.params.deliveryCourseCd;
				$scope.searchCondition.pickingBatchNo = $route.current.params.pickingBatchNo;
				$scope.searchCondition.shippingStatus = $route.current.params.shippingStatus;
				$scope.searchCondition.noAllcDisplayFlg = $route.current.params.noAllcDisplayFlg;
				$scope.searchCondition.emergencyFlg = $route.current.params.emergencyFlg;
				$scope.searchCondition.deliveryCourseNm = $route.current.params.deliveryCourseNm;
				$scope.searchCondition.cancelDisplay = "1";

				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#search
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 検索ボタンを押下された時に処理<br>
	 *
	 * 検索条件をもとに、配送コース別出荷進捗を一覧表示。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#getPagingData
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.deliveryCourseShippingList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#setPagingData
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */

	var nonShippingParcentRow;
	var shippingInstedParcentRow;
	var inspectionedParcentRow;
	var shippingFixedParcentRow;
	var shippingInstedParcentPiece;
	var inspectionedParcentPiece;
	var shippingFixedParcentPiece;
	var nonShippingParcentPiece;
	var strDIPS_FLG = 0;
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-327] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-327] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.deliveryCourseShippingList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#getClassForRow
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start

		var rowInfo = {
			shippingStatus : row.entity.shippingStatus,
			shippingStopFlg : '0',
			emergencyFlg : row.entity.emergencyFlg,
			stockOutFlg : row.entity.stockOutFlg
		};

		return wmsShipCommon.getClassForRow(rowInfo);

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#gridDblClick
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("shippingInstSearch", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#showCustomer
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 配送コースCD検索ボタンを押下された時に処理<br>
	 *
	 * 配送コースマスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コースマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd

		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コースマスタ
			$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 配送コースCDをロストフォーカス時の処理<br>
	 *
	 * 配送コースマスタから配送コース情報を取得し、設定する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#shippingInstSearch
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 出庫指示一覧ボタン押下処理<br>
	 *
	 * 【出庫指示一覧】画面へ遷移する。
	 */
	$scope.shippingInstSearch = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		//出庫指示一覧画面へ遷移
		// [ON推-品向-1042]グルーピング条件の最小値のステータスを持ってくる様に修正したので、出庫指示バッチ№が入っていない場合はステータスを渡す様に修正 2016.01.25 koseki Start
		if (!listBody[0].pickingBatchNo) {
			// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
			$location.path("wms/shipping/ShippingInstList").search({})
			// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
			.search("mode", SCREEN_MODE.Read)
			.search("clientCd", listBody[0].clientCd)
			.search("centerCd", listBody[0].centerCd)
			.search("deliveryCourseNm", listBody[0].deliveryCourseNm)
			.search("workDt", listBody[0].workDt)
			.search("pickingBatchNo", listBody[0].pickingBatchNo)
			// [C-EC-009] 「緊急のみ」「未出荷全件」の検索条件を引継 2015.02.04 kawana Start
			.search("emergencyFlg", 0)
			.search("noAllcDisplayFlg", 0)
			// [C-EC-009] 「緊急のみ」「未出荷全件」の検索条件を引継 2015.02.04 kawana End
			.search("deliveryCourseCd", listBody[0].deliveryCourseCd)
			.search("carrierCd", listBody[0].carrierCd);
		}else{
			// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
			$location.path("wms/shipping/ShippingInstList").search({})
			// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
			.search("mode", SCREEN_MODE.Read)
			.search("clientCd", listBody[0].clientCd)
			.search("centerCd", listBody[0].centerCd)
			.search("deliveryCourseNm", listBody[0].deliveryCourseNm)
			.search("workDt", listBody[0].workDt)
			.search("pickingBatchNo", listBody[0].pickingBatchNo)
			.search("shippingStatus", listBody[0].shippingStatus)
			// [C-EC-009] 「緊急のみ」「未出荷全件」の検索条件を引継 2015.02.04 kawana Start
			.search("emergencyFlg", 0)
			.search("noAllcDisplayFlg", 0)
			// [C-EC-009] 「緊急のみ」「未出荷全件」の検索条件を引継 2015.02.04 kawana End
			.search("deliveryCourseCd", listBody[0].deliveryCourseCd)
			.search("carrierCd", listBody[0].carrierCd);
		}
		// [ON推-品向-1042]グルーピング条件の最小値のステータスを持ってくる様に修正したので、出庫指示バッチ№が入っていない場合はステータスを渡す様に修正 2016.01.25 koseki End
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#shippingInst
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 出庫指示ボタン押下処理<br>
	 *
	 * 出庫指示処理。
	 */
	$scope.shippingInst = function(isBatch) {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.deliveryCourseShippingList.checkIndicator;
		    // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
			if (isBatch) {
				execFunc = api.deliveryCourseShippingList.indicatorBatch;
			} else {
				execFunc = api.deliveryCourseShippingList.indicator;
			}
		    // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出庫指示処理
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#shippingInstDelete
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 出庫指示解除ボタン押下処理<br>
	 *
	 * 出庫指示解除処理。
	 */
	$scope.shippingInstDelete = function() {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.deliveryCourseShippingList.checkIndicatingLift;
			execFunc = api.deliveryCourseShippingList.indicatingLift;

			successFunc = function(){
				$scope.search();
			}
			// [検査-237] チェックを修正 2014/12/08 衛 Start
			for (var i = 0; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
				//出荷ステータスがピッキング中／済または検品中／済の場合
				var shippingStatus = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus;
				if (shippingStatus == "30" ||
						shippingStatus == "35" ||
						shippingStatus == "40" ||
						shippingStatus == "45" ||
						shippingStatus == "50"){
					var shippingStatusMax = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatusMax;
					// 出荷確定が含まれているか
					if (shippingStatusMax == "55") {
						isInspectioned = false;
					}else{
						isInspectioned = true;
					}
				}else{
					isInspectioned = false;
				}
			}
			if(isInspectioned){
				if (!owsCommon.viewConfirm("pickingInstCancelExistedWorkingStateConfirmation")) {
					return;
				}
			}
			// [検査-237] チェックを修正 2014/12/08 衛 End
			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出庫指示解除処理
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#stwList
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * 積込リストボタン押下処理<br>
	 *
	 * 積込リスト処理。
	 */
	$scope.stwList = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		//積込リスト発行画面へ遷移
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		$location.path("wms/shipping/StwListPrint").search({})
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
		.search("mode", SCREEN_MODE.Update)
		.search("clientCd", $scope.searchCondition.mclient.clientCd)
		.search("centerCd", $scope.searchCondition.mcenter.centerCd)
		.search("shippingDt", listBody[0].shippingDt)
		.search("deliveryCourseCd", listBody[0].deliveryCourseCd);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:BoxMaster#excelOutput
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.deliveryCourseShippingList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

}]);
