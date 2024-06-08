/**
 * @ngdoc overview
 * @name oneslogiWms.ReferenceProductShippingList
 *
 * @description
 * 商品別出荷一覧（参照）画面<br>
 *
 */

angular.module('oneslogiWms.ReferenceProductShippingList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReferenceProductShippingList.service:referenceProductShippingListApi
 *
 * @description
 * 商品別出荷一覧（参照）画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * referenceProductShippingList 商品別出荷一覧（参照）データ操作用WebApi<br>
 * ・resources/shipping/referenceProductShippingList/initUsually 初期処理WebAPI<br>
 * ・resources/shipping/referenceProductShippingList/search 検索WebAPI<br>
 * ・resources/shipping/referenceProductShippingList/checkDateUpdate チェック処理(日付一括変更)WebAPI<br>
 * takingShippingFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 作業日/出荷日ドロップダウンリスト用データ取得WebApi<br>
 * shippingStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 出荷ステータスドロップダウンリスト用データ取得WebApi<br>
 * emergencyFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 緊急のみドロップダウンリスト用データ取得WebApi<br>
 * stockOutFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 欠品フラグドロップダウンリスト用データ取得WebApi<br>
 * carrier 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 運送業者ドロップダウンリスト用データ取得WebApi<br>
 * depositCustomer 預託値データ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueListLimitUser 預託先ドロップダウンリスト用データ取得WebApi<br>
 * deliveryCourse ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * supplyCustomerCdBlur ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 納品先データ取得WebAPI<br>
 * modalProductBlur ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 */
.factory('referenceProductShippingListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		takingShippingFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		shippingStatus: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       ]
		),
		emergencyFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		stockOutFlg: AngularAPIClient.make([
		                                    ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                    ]
		),
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		cancelDisplay: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		depositCustomer: AngularAPIClient.make([
		                                 ['keyValueListLimitUser', 'GET', 'resources/common/depositCustomer/keyValueListLimitUser']
		                                 ]
		),
		referenceProductShippingList: AngularAPIClient.make([
		                                           ['init',   'GET', 'resources/shipping/referenceProductShippingList/initUsually'],//初期処理(通常)
		                                           ['search', 'GET', 'resources/shipping/referenceProductShippingList/search'],//検索
		                                           ['excel',  'GET',  'resources/shipping/referenceProductShippingList/search', 'excel'],
		                                           ]
		),
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		supplyCustomerCdBlur: AngularAPIClient.make(//納品先CDのロストフォーカス処理
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		)
		,
		modalProductBlur: AngularAPIClient.make(//商品CDのロストフォーカス処理
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
 *
 * @description
 * 商品別出荷一覧（参照）画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ReferenceProductShippingList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'referenceProductShippingListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api) {

	//グリッドの列情報（デザイン用）
	$scope.referenceProductShippingListCols = [
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#initScreen
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件を表示状態に変更
		$scope.isopen = true;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);
			if (fromValueString > toValueString) {
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
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'referenceProductShippingList',
			columnDefs: 'referenceProductShippingListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 荷主の編集を不可にする
		directiveControl.editable($scope, "clientCd", false);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#initScreenHttp
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
				 $scope.deferredGetTakingShippingFlg(),//作業日/出荷日
				 $scope.deferredGetshippingStatus(),//出荷ステータス
				 $scope.deferredGetEmergency(),//緊急のみ
				 $scope.deferredGetStockOut(),//欠品フラグ
				 $scope.deferredGetCarrier(),//運送業者
				 $scope.deferredGetCancelDisplayList(),
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 作業日/出荷日区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.takingShippingFlg, request).then(function(response){
			$scope.takingShippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#centerChange
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetCarrier
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};

		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetEmergencyFgl
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetStockOut
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 欠品フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockOut = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHORT_STOCK_DISPLAY";

		owsCommon.getDataCacheable(api.stockOutFlg, request).then(function(response){
			$scope.stockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetshippingStatus
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetshippingStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classGrpCd = "SHIPPING_STATUS_SELECT";

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetCancelDisplayList
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetCustomer
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description 預託表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCustomer = function() {
		var deferred = $q.defer();
		var request = {};
		request.data = {};
		request.clientCd = $scope.searchCondition.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueListLimitUser", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deferredGetInitData
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 商品別出荷一覧（参照）初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	  $scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.referenceProductShippingList.init().then(function(response){
													  $scope.paging = response.paging;
			  $scope.searchCondition = response.data.search;
			  $scope.updateCondition = response.data.shippingInstFooter;

			  // ログイン情報より初期値を設定
			  $scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			  $scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			  $scope.searchCondition.dtFrom = userInfo.systemDt;//日付(From)
			  $scope.searchCondition.dtTo = userInfo.systemDt;//日付(To)

			  // 預託取得・設定処理
			  $scope.deferredGetCustomer()
			  .then(function(response) {
				  setDepositStockTypeList(response.data, true)
			  });

			  //検索条件の作業日/出荷日
			  $scope.searchCondition.takingShippingFlg = owsCommon.getDefaultValue($scope.takingShippingFlgList);
			  //欠品フラグ
			  $scope.searchCondition.stockOutFlg = owsCommon.getDefaultValue($scope.stockOutFlgList);
			  //緊急のみ
			  $scope.searchCondition.emergencyFlg = owsCommon.getDefaultValue($scope.emergencyFlgList);
			  // キャンセルデータ表示有無
			  $scope.searchCondition.cancelDisplay = owsCommon.getDefaultValue($scope.cancelDisplayList);

			  $scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage,$scope.gridOptions.paginationPageSize);

			  // [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			  // 履歴データ取得・検索処理
			  if (owsHistory.hasState()) {
				  $scope.head = owsHistory.popState();
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
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#search
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#getPagingData
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
		request.data.search.referenceUserCd = userInfo.userCd;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.referenceProductShippingList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#setPagingData
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.referenceProductShippingList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//進捗率を設定
		if (response.data.progress) {
			var storeParcent;
			var receivingParcent;

			if (response.data.progress.allCount == 0) {
				storeParcent = 0;
				receivingParcent = 0;
			} else {
				storeParcent = Math.round((response.data.progress.storedCount / response.data.progress.allCount) * 100);
				receivingParcent = Math.round((response.data.progress.receivingCount / response.data.progress.allCount) * 100);
			}

			$scope.storeParcent = storeParcent + "%";
			$scope.receivingParcent = receivingParcent + "%";
			$scope.nonReceiveParcent = (100 - storeParcent - receivingParcent) + "%";
		};

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#getClassForRow
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		try{
			// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start

			var shippingStopFlg = '0';

			// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にエラーとならないようにする 2018.11.22 matsumoto Start
			if (row.entity.tshippingInstH.mcustomerBySupplyCustomerId != null && row.entity.tshippingInstH.mcustomerBySupplyCustomerId.shippingStopFlg == "1") {
				// 出荷停止(納品先)
				shippingStopFlg = '1'
			} else if (row.entity.mproduct != null && row.entity.mproduct.shippingStopFlg == '1') {
				// 出荷停止(商品)
				shippingStopFlg = '1'
			} else if (row.entity.tpickingBList.length != 0 && row.entity.tpickingBList[0].tstock.mlocation != null && row.entity.tpickingBList[0].tstock.mlocation.allocNgFlg == "1") {
				// 引当禁止
				shippingStopFlg = '1'
			}
			// [品質検査対応][Ver3.1][#5705]納品先が削除済みの場合にエラーとならないようにする 2018.11.22 matsumoto End
			var rowInfo = {
				shippingStatus : row.entity.tshippingInstH.shippingStatus,
				shippingStopFlg : shippingStopFlg,
				emergencyFlg : row.entity.tshippingInstH.emergencyFlg,
				stockOutFlg : wmsShipCommon.getStockOutFlgByNum(row.entity.stockOutNum)
			};

			return wmsShipCommon.getClassForRow(rowInfo);

			// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
		}catch(c){
			return;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#showCustomer
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
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
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
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
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#modalDelivery
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 納品先CD検索ボタンを押下された時に処理<br>
	 *
	 * 納品先マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalDelivery = function(){
		var items = {
				//取引先マスタ
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.customerCd
		};

		//納品先CD
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 取引先マスタ
			$scope.searchCondition.customerCd = selectedItem.customerCd;
			$scope.searchCondition.mcustomerByDelivCustomerId.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 納品先CDをロストフォーカス時の処理<br>
	 *
	 * 取引先マスタから納品先情報を取得し、設定する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された納品先コードを取得
		var supplyCustomerCd = $scope.searchCondition.customerCd;

		if(supplyCustomerCd && 0 < supplyCustomerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = supplyCustomerCd;

			$scope.searchCondition.mcustomerByDelivCustomerId.customerNm = null;

			// 配送コース情報の取得
			api.supplyCustomerCdBlur.record(request).then(function(response){
				$scope.searchCondition.mcustomerByDelivCustomerId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.mcustomerByDelivCustomerId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#modalProduct
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 商品CD検索ボタンを押下された時に処理<br>
	 *
	 * 商品マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalProduct = function(){
		var items = {
				// 商品マスタ
				clientCd: $scope.searchCondition.mclient.clientCd,
				productCd: $scope.searchCondition.productCd
		};

		//商品CD
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 商品マスタ
			$scope.searchCondition.productCd = selectedItem.productCd;
			$scope.searchCondition.productNm = selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList#modalProductBlur
	 * @methodOf oneslogiWms.ReferenceProductShippingList.object:ReferenceProductShippingList
	 *
	 * @description
	 * 商品CDをロストフォーカス時の処理<br>
	 *
	 * 商品マスタから商品情報を取得し、設定する。
	 */
	$scope.modalProductBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.productCd;

		if(productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			$scope.searchCondition.productNm = null;

			// 商品情報の取得
			api.modalProductBlur.record(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositCustomerCdList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositCustomerCdList.length == 1) {
				$scope.searchCondition.depositCustomerCd = $scope.depositCustomerCdList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.depositCustomerCd = null;
			}
		}
	};

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
		request.data.search.referenceUserCd = userInfo.userCd;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.referenceProductShippingList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
