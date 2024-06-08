// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
/**
 * @ngdoc overview
 * @name oneslogiWms.ProductShippingList
 *
 * @description
 * 商品別出荷一覧画面<br>
 *
 */

angular.module('oneslogiWms.ProductShippingList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductShippingList.service:productShippingListApi
 *
 * @description
 * 商品別出荷一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * productShippingList 商品別入荷一覧データ操作用WebApi<br>
 * ・resources/shipping/productShippingList/initUsually 初期処理WebAPI<br>
 * ・resources/shipping/productShippingList/search 検索WebAPI<br>
 * ・resources/shipping/productShippingList/checkDateUpdate チェック処理(日付一括変更)WebAPI<br>
 * ・resources/shipping/productShippingList/dateUpdate 日付一括変更処理WebAPI<br>
 * ・resources/shipping/productShippingList/checkDeliveryCourseUpdate チェック処理(配送コース一括変更)WebAPI<br>
 * ・resources/shipping/productShippingList/deliveryCourseUpdate 配送コース一括変更処理WebAPI<br>
 * ・resources/shipping/productShippingList/checkZipUpdate チェック処理(郵便番号一括変更)WebAPI<br>
 * ・resources/shipping/productShippingList/zipUpdate 郵便番号一括変更処理WebAPI<br>
 * ・resources/shipping/productShippingList/checkOrderUpdate チェック処理(指示修正)WebAPI<br>
 * takingShippingFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 作業日/出荷日ドロップダウンリスト用データ取得WebApi<br>
 * workShippingDtFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 作業日/出荷日(日付一括変更)ドロップダウンリスト用データ取得WebApi<br>
 * shippingStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 出荷ステータスドロップダウンリスト用データ取得WebApi<br>
 * emergencyFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 緊急のみドロップダウンリスト用データ取得WebApi<br>
 * stockOutFlg 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 欠品フラグドロップダウンリスト用データ取得WebApi<br>
 * carrier 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 運送業者ドロップダウンリスト用データ取得WebApi<br>
 * deliveryCourse ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * supplyCustomerCdBlur ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 納品先データ取得WebAPI<br>
 * modalProductBlur ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 */
.factory('productShippingListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		takingShippingFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		workShippingDtFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		shippingStatus: AngularAPIClient.make([
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana Start
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana End
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
		// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		cancelDisplay: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
		productShippingList: AngularAPIClient.make([
		                                           ['init',   'GET', 'resources/shipping/productShippingList/initUsually'],//初期処理(通常)
		                                           ['search', 'GET', 'resources/shipping/productShippingList/search'],//検索
		                                           ['excel',  'GET',  'resources/shipping/productShippingList/search', 'excel'],
                                                   ['checkDateUpdate', 'POST', 'resources/shipping/productShippingList/checkDateUpdate'],//チェック処理(日付一括変更)
		                                           ['workShippingDtUpdate', 'POST', 'resources/shipping/productShippingList/dateUpdate'],//日付一括変更処理
		                                           ['checkDeliveryCourseUpdate', 'POST', 'resources/shipping/productShippingList/checkDeliveryCourseUpdate'],//チェック処理(配送コース一括変更)
		                                           ['deliveryCourseUpdate', 'POST', 'resources/shipping/productShippingList/deliveryCourseUpdate'],//配送コース一括変更処理
		                                           ['checkZipUpdate', 'POST', 'resources/shipping/productShippingList/checkZipUpdate'],//チェック処理(郵便番号一括変更)
		                                           ['zipUpdate', 'POST', 'resources/shipping/productShippingList/zipUpdate'],//郵便番号一括変更処理
		                                           ['checkOrderUpdate', 'POST', 'resources/shipping/productShippingList/checkOrderUpdate']//チェック処理(指示修正)
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
 * @name oneslogiWms.ProductShippingList.object:ProductShippingList
 *
 * @description
 * 商品別出荷一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ProductShippingList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'productShippingListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api) {

	//グリッドの列情報（デザイン用）
	$scope.productShippingListCols = [
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#initScreen
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	var running = false;
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

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
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'productShippingList',
			columnDefs: 'productShippingListCols',
			pagingOptions : $scope.pagingOptions,
			afterSelectionChange: function(row, event) {
				if (!running) {
					running = true;
					try {
						var rowIndex = $scope.convertRowToRowIndex(row);
						if (rowIndex != undefined) {
							for (var i = 0; i < $scope.productShippingList.length; i++) {
								//自分の行と違う場合のみ
								if (rowIndex != i) {
									//伝票№が同じ行のチェックボックスを同じにする
									if ($scope.productShippingList[i].tshippingInstH.shippingSlipNo == row.entity.tshippingInstH.shippingSlipNo) {
										//チェックボックス状態が違う場合のみ
										if ($scope.gridOptions.gridApi.grid.rows[i].isSelected != row.isSelected) {
											//チェックボックスの状態を同じにする。
											$scope.gridOptions.selectRow(i, row.isSelected);
										}
									}
								}
							}
						}
					}finally{
						running = false;
					}
				}
			}
		});

		// [EC-CT1-087] ページングをなしに変更 2015.03.03 kawana End

		//配送コース
		statusInfo.mappingErrorMessage($scope, "deliveryCourseCdUpd", 5, 5);

		//郵便番号
		statusInfo.mappingErrorMessage($scope, "zipCd", 6,6);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#initScreenHttp
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
				 $scope.deferredGetWorkShippingDtFlg(),//作業日/出荷日(日付一括変更)
				 $scope.deferredGetshippingStatus(),//出荷ステータス
				 $scope.deferredGetEmergency(),//緊急のみ
				 $scope.deferredGetStockOut(),//欠品フラグ
				 $scope.deferredGetCarrier(),//運送業者
				 // [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
				 $scope.deferredGetCancelDisplayList()
				 // [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 作業日/出荷日区分取得・設定処理（同期可能）フッター<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWorkShippingDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.workShippingDtFlg, request).then(function(response){
			$scope.workShippingDtList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.13 sja Start
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
	//荷主センタ変更対応 201７.02.13 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetCarrier
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};

		//荷主センタ変更対応 2017.02.08 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.08 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			//荷主センタ変更対応 2017.02.08 sja Start
//			deferred.resolve();
			deferred.resolve();
			//荷主センタ変更対応 2017.02.08 sja End
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetEmergencyFgl
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetStockOut
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetshippingStatus
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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

	// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetCancelDisplayList
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	// [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#gridDblClick
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("instDetail", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deferredGetInitData
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 商品別出荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	  $scope.deferredGetInitData = function () {
		  var deferred = $q.defer();

		  api.productShippingList.init().then(function(response){
			  $scope.paging = response.paging;
			  $scope.searchCondition = response.data.search;
			  $scope.updateCondition = response.data.shippingInstFooter;

			  // ログイン情報より初期値を設定
			  $scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			  $scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			  $scope.searchCondition.dtFrom = userInfo.systemDt;//日付(From)
			  $scope.searchCondition.dtTo = userInfo.systemDt;//日付(To)

			  //検索条件の作業日/出荷日
			  $scope.searchCondition.takingShippingFlg = owsCommon.getDefaultValue($scope.takingShippingFlgList);
			  //日付一括変更の作業日/出荷日
			  $scope.updateCondition.workShippingDtFlg = owsCommon.getDefaultValue($scope.workShippingDtList);
			  //欠品フラグ
			  $scope.searchCondition.stockOutFlg = owsCommon.getDefaultValue($scope.stockOutFlgList);
			  //緊急のみ
			  $scope.searchCondition.emergencyFlg = owsCommon.getDefaultValue($scope.emergencyFlgList);
			  // [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
			  $scope.searchCondition.cancelDisplay = owsCommon.getDefaultValue($scope.cancelDisplayList);
			  // [EC-CT1-154] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

			  $scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage,$scope.gridOptions.paginationPageSize);

			  // [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			  // 履歴データ取得・検索処理
			  if (owsHistory.hasState()) {
				  $scope.searchCondition = owsHistory.popState();
				  $scope.search();

			  } else if ($scope.screenMode == SCREEN_MODE.Update) {
				  $scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				  $scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				  $scope.searchCondition.shippingSlipNo = $route.current.params.shippingSlipNo;
				  $scope.searchCondition.takingShippingFlg = String($route.current.params.takingShippingFlg);
				  // [#921] 出庫指示一覧で選択したデータが商品別出荷一覧で表示されない不具合を修正 2017.01.30 kawana Start
				  //[ON推-品質問題点指摘票(新ｿﾘV2-068)] 修正対応 2016.08.26 chou Mod Start
				  $scope.searchCondition.dtFrom = $route.current.params.workDt;
				  $scope.searchCondition.dtTo = $route.current.params.workDt;
				  //[ON推-品質問題点指摘票(新ｿﾘV2-068)] 修正対応 2016.08.26 chou Mod End
				  // [#921] 出庫指示一覧で選択したデータが商品別出荷一覧で表示されない不具合を修正 2017.01.30 kawana End
				  $scope.searchCondition.deliveryCourseCd = $route.current.params.deliveryCourseCd;
				  // [1.1.4-CT-071] 画面遷移で配送コース名称が表示されない 2016.06.02 kawana Start
				  $scope.searchCondition.mdeliveryCourse.deliveryCourseNm = $route.current.params.deliveryCourseNm;
				  // [1.1.4-CT-071] 画面遷移で配送コース名称が表示されない 2016.06.02 kawana End
				  $scope.searchCondition.carrierCd = $route.current.params.carrierCd;
				  $scope.searchCondition.pickingBatchNo = $route.current.params.pickingBatchNo;
				  $scope.searchCondition.supplyCustomerCd = $route.current.params.supplyCustomerCd;
				  $scope.searchCondition.supplyCustomerNm = $route.current.params.supplyCustomerNm;
				  $scope.searchCondition.clientShippingNo = $route.current.params.clientShippingNo;
				  $scope.searchCondition.pickingWorkNo = $route.current.params.pickingWorkNo;
				  $scope.searchCondition.shippingStatus = $route.current.params.shippingStatus;
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#search
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#getPagingData
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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

		api.productShippingList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#setPagingData
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-329] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-329] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.productShippingList = response.data.list;
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#getClassForRow
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
			} else 	if (row.entity.mproduct != null && row.entity.mproduct.shippingStopFlg == '1') {
				// 出荷停止(商品)
				shippingStopFlg = '1'
			} else if (row.entity.tpickingBList.length != 0 && row.entity.tpickingBList[0].tstock.mlocation != null && row.entity.tpickingBList[0].tstock.mlocation.allocNgFlg == "1") {
				// 引当停止
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#showCustomer
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalDelivery
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
				// [検査-039] パラメータの名前を修正 2014.11.25 楊寧 Start
				deliveryCd: $scope.searchCondition.customerCd
				// [検査-039] パラメータの名前を修正 2014.11.25 楊寧 End
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalProduct
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalProductBlur
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalZip
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 郵便番号検索ボタンを押下された時に処理<br>
	 *
	 * 郵便番号マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalZip = function(){
		var items = {
				// 郵便番号マスタ
				zipCd: $scope.updateCondition.zipCd
		};

		//郵便番号CD
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 郵便番号マスタ
			$scope.updateCondition.zipCd = selectedItem.zipCd;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalDeliveryCourseFooter
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 選択行更新(配送コース一括変更)検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された配送コース情報を画面項目に反映する。
	 */
	$scope.modalDeliveryCourseFooter = function(){
		var items = {
				// 配送コースマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.updateCondition.deliveryCourseCd
		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コースマスタ
			$scope.updateCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.updateCondition.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deliveryCourseCdBlurFooter
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlurFooter = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.updateCondition.deliveryCourseCd;

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			request.centerId = userInfo.centerId;
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.updateCondition.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.updateCondition.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.updateCondition.deliveryCourseNm = null;
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#workShippingDtUpdate
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 選択行更新(日付一括変更)ボタン押下処理<br>
	 *
	 * 選択行更新(日付一括変更)処理。
	 */
	$scope.workShippingDtUpdate = function() {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			//request.data.search = $scope.searchCondition;
			//request.data.list = listBody;
			//request.data.shippingInstFooter = $scope.updateCondition;
			request.data.searchBase64 = $.base64.encode(JSON.stringify($scope.searchCondition), true);
			request.data.listBase64 = $.base64.encode(JSON.stringify(angular.copy(listBody)), true);
			request.data.shippingInstFooterBase64 = $.base64.encode(JSON.stringify($scope.updateCondition), true);

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.productShippingList.checkDateUpdate;
			execFunc = api.productShippingList.workShippingDtUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchinputform1')) {
					return;
				}

				// 選択行更新(日付一括変更)
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchinputform1')) {
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#zipUpdate
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 選択行更新(郵便番号一括変更)ボタン押下処理<br>
	 *
	 * 選択行更新(郵便番号一括変更)処理。
	 */
	$scope.zipUpdate = function() {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			//request.data.search = $scope.searchCondition;
			//request.data.list = listBody;
			//request.data.shippingInstFooter = $scope.updateCondition;
			request.data.searchBase64 = $.base64.encode(JSON.stringify($scope.searchCondition), true);
			request.data.listBase64 = $.base64.encode(JSON.stringify(angular.copy(listBody)), true);
			request.data.shippingInstFooterBase64 = $.base64.encode(JSON.stringify($scope.updateCondition), true);

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.productShippingList.checkZipUpdate;
			execFunc = api.productShippingList.zipUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchinputform2')) {
					return;
				}

				// 選択行更新(日付一括変更)
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchinputform2')) {
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
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#deliveryCourseUpdate
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 選択行更新(配送コース一括変更)ボタン押下処理<br>
	 *
	 * 選択行更新(配送コース一括変更)処理。
	 */
	$scope.deliveryCourseUpdate = function() {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			//request.data.search = $scope.searchCondition;
			//request.data.list = listBody;
			//request.data.shippingInstFooter = $scope.updateCondition;
			request.data.searchBase64 = $.base64.encode(JSON.stringify($scope.searchCondition), true);
			request.data.listBase64 = $.base64.encode(JSON.stringify(angular.copy(listBody)), true);
			request.data.shippingInstFooterBase64 = $.base64.encode(JSON.stringify($scope.updateCondition), true);

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.productShippingList.checkDeliveryCourseUpdate;
			execFunc = api.productShippingList.deliveryCourseUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchinputform3')) {
					return;
				}

				// 選択行更新(日付一括変更)
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchinputform3')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	// [#5627][v3.1] 「指示入力」ボタンを削除 2018.12.07 tanaka Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#instUpdate
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 指示修正ボタン押下処理<br>
	 *
	 * 【指示修正】画面へ遷移する。
	 */
	$scope.instUpdate = function() {
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			//request.data.search = $scope.searchCondition;
			//request.data.list = listBody;
			//request.data.shippingInstFooter = $scope.updateCondition;
			request.data.searchBase64 = $.base64.encode(JSON.stringify($scope.searchCondition), true);
			request.data.listBase64 = $.base64.encode(JSON.stringify(angular.copy(listBody)), true);
			request.data.shippingInstFooterBase64 = $.base64.encode(JSON.stringify($scope.updateCondition), true);

			var checkFunc;   // 入力チェック関数

			checkFunc = api.productShippingList.checkOrderUpdate;

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}
				var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
				var shippingSlipNo = listBody[0].tshippingInstH.shippingSlipNo;
				for(var i = 1 ;i < listBody.length ;i++){
					if(listBody[i].tshippingInstH.shippingSlipNo != shippingSlipNo){
						alertMessage.setErrorMessageByCode("identicalShippingSlipNoNotSelectError");
						return;
					}
				}
				// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
				//指示修正画面へ遷移
				$location.path("wms/shipping/ShippingPlanInput").search({}).search("mode", SCREEN_MODE.Update).search("shippingInstHId", listBody[0].tshippingInstH.shippingInstHId);
				// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

			});
		});


	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#instDetail
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * 指示明細ボタン押下処理<br>
	 *
	 * 【指示明細】画面へ遷移する。
	 */
	$scope.instDetail = function() {
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		var shippingSlipNo = listBody[0].tshippingInstH.shippingSlipNo;
		for(var i = 1 ;i < listBody.length ;i++){
			if(listBody[i].tshippingInstH.shippingSlipNo != shippingSlipNo){
				alertMessage.setErrorMessageByCode("identicalShippingSlipNoNotSelectError");
				return;
			}
		}
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//指示明細画面へ遷移
		$location.path("wms/shipping/ShippingInstDetail").search({}).search("clientCd", listBody[0].tshippingInstH.mclient.clientCd).search("centerCd", listBody[0].tshippingInstH.mcenter.centerCd).search("shippingSlipNo", listBody[0].tshippingInstH.shippingSlipNo);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
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

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.productShippingList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	$scope.isOpenBulkDate = false;
	$scope.isOpenBulkZip = false;
	$scope.isOpenBulkCourse = false;

	$scope.openBulkDate = function() {
		$scope.isOpenBulkDate = true;
		$scope.isOpenBulkZip = false;
		$scope.isOpenBulkCourse = false;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkDate").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	$scope.openBulkZip = function() {
		$scope.isOpenBulkDate = false;
		$scope.isOpenBulkZip = true;
		$scope.isOpenBulkCourse = false;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkZip").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	$scope.openBulkCourse = function() {
		$scope.isOpenBulkDate = false;
		$scope.isOpenBulkZip = false;
		$scope.isOpenBulkCourse = true;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkCourse").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End
