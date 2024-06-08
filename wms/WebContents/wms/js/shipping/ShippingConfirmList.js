/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingConfirmList
 *
 * @description
 * 出荷確定一覧画面<br>
 *
 * 出荷確定一覧表示する画面。
 *
 */
angular.module('oneslogiWms.ShippingConfirmList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingConfirmList.service:ShippingConfirmListApi
 *
 * @description
 * 出庫指示一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatus 入荷ステータスデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/ShippingConfirmList/searchInit 初期データ取得WebAPI<br>
 * ・resources/shipping/ShippingConfirmList/search 検索結果取得WebAPI<br>
 */
.factory('ShippingConfirmListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		noConfirmedFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
		shippingStatus: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       ]
		),
		// [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana Start
		noStockOutFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana End
		ShippingConfirmList: AngularAPIClient.make([
		                                            ['initial',         'GET',  'resources/shipping/shippingConfirmList/initial'],
		                                            ['confirmSearch',       'GET',  'resources/shipping/shippingConfirmList/confirmSearch'],
		                                            ['excel',               'GET',  'resources/shipping/shippingConfirmList/confirmSearch', 'excel'],
		                                            ['checkCompulsory', 'POST', 'resources/shipping/shippingConfirmList/checkCompulsory'],
		                                            ['compulsory',      'POST', 'resources/shipping/shippingConfirmList/compulsory'],
		                                            ['checkConfirm', 'POST', 'resources/shipping/shippingConfirmList/checkConfirm'],
		                                            ['confirm',      'POST', 'resources/shipping/shippingConfirmList/confirm'],
		                                            //  米国出荷ドキュメント追加対応 2018.01.05 PYM Start
		                                            ['traceNoUpdate',      'POST', 'resources/shipping/shippingConfirmListCarrierTraceNum/update'],
		                                            //  米国出荷ドキュメント追加対応 2018.01.05 PYM End
		                                            ['checkConfirmCancel', 'POST', 'resources/shipping/shippingConfirmList/checkConfirmCancel'],
		                                            ['confirmCancel',      'POST', 'resources/shipping/shippingConfirmList/confirmCancel']
		                                            ]
		),
		deliveryCourse: AngularAPIClient.make([
		                                       ['record', 'GET', 'resources/common/deliveryCourse/record']
		                                       ]
		),
		deliveryCustomer: AngularAPIClient.make([
		                     			        ['record', 'GET', 'resources/common/deliveryCustomer/record']
		                     				    ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
 *
 * @description
 * 出荷確定一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingConfirmList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShippingConfirmListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.ShippingConfirmListCols = [
	                                  {field:"shippingDt", displayName:"出荷日"},
	                                  {field:"shippingTime", displayName:"出荷予定時刻"},
	                                  {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                  {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                  {field:"pickingTime", displayName:"出庫開始時刻"},
	                                  {field:"stowageTime", displayName:"積込予定時刻"},
	                                  {field:"carrierCd", displayName:"運送業者CD"},
	                                  {field:"carrierNm", displayName:"運送業者名称"},
	                                  {field:"customerCd", displayName:"納品先CD"},
	                                  {field:"customerNm", displayName:"納品先名称"},
	                                  {field:"customerAbbr", displayName:"納品先略称"},
	                                  {field:"pickingWorkNo", displayName:"出庫作業No."},
	                                  {field:"shippingSlipNo", displayName:"伝票数"},
	                                  {field:"allocNum", displayName:"総ピース数"},
	                                  {field:"packingHId", displayName:"個口数"},
	                                  {field:"totalVolume", displayName:"容積"},
	                                  {field:"grossWeight", displayName:"重量"},
	                                  {field:"inspectionFlgNm", displayName:"検品フラグ"},
	                                  {field:"invoiceCreateFlgNm", displayName:"送り状データ作成フラグ"},
	                                  {field:"allocNgFlgNm", displayName:"引当禁止フラグ"},
	                                  {field:"shippingStopFlgNm", displayName:"納品先出荷停止フラグ"},
	                                  {field:"stopFlgNm", displayName:"商品出荷停止フラグ"},
	                                  {field:"forceFixedFlgNm", displayName:"強制確定フラグ"},
		   	                  		  //荷主センタ変更対応 201７.02.13 sja Start
		   	                  		  {field:"clientCd", displayName:"荷主CD"},
		   	                  		  {field:"clientNm", displayName:"荷主名称"},
		   	                  		  {field:"centerCd", displayName:"センタCD"},
		   	                  		  {field:"centerNm", displayName:"センタ名称"}
		   	                  		  //荷主センタ変更対応 201７.02.13 sja End
	                                  ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#initScreen
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

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
		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getLargePagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'shippingConfirmList',
			columnDefs: 'ShippingConfirmListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#initScreenHttp
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
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
				 $scope.deferredGetnoConfirmedFlg(),	// 未出荷全件
				 // [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
				 $scope.deferredGetShippingStatusList(),	// 出荷ステータス
				 // [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
				 $scope.deferredGetCarrier(),	// 運送業者
				 // [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana Start
				 $scope.deferredGetNoStockOutFlg()	// 欠品フラグ
				 // [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetCarrier
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.13 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.13 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetnoConfirmedFlg
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 未出荷全件取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetnoConfirmedFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_CONFIRMED_FLG";

		owsCommon.getDataCacheable(api.noConfirmedFlg, request).then(function(response){
			$scope.noConfirmedFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#4681][#4682][v2.2][v3.0] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetShippingStatusList
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStatusList = function() {

		var deferred = $q.defer();

		var request = {};
		request.classGrpCd = "SHIPPING_STATUS_WORKING";

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#4681][#4682][v2.2][v3.0] 検索条件に出荷ステータスを追加 2018.06.04 kawana End

	//荷主センタ変更対応 201７.02.13 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#centerChange
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
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

	// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetNoStockOutFlg
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description 欠品無のみ表示/欠品有のみ表示 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoStockOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_STOCK_OUT_FLG";

		owsCommon.getDataCacheable(api.noStockOutFlg, request).then(function(response){
			$scope.noStockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deliveryCourse
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd

		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			//荷主センタ変更対応 2017.02.13 sja Start
//			request.centerId = userInfo.centerId;
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			//荷主センタ変更対応 2017.02.13 sja End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#customerCdBlur
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		// 入力された納品先CDを取得
		var customerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 納品先CD情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.supplyCustomerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.supplyCustomerNm = null;
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#showCustomer
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				// 取引先マスタ
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd

		};

		//納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.tallocInstH.supplyCustomerNm = selectedItem.customerNm;
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 出荷確定一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.ShippingConfirmList.initial().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;
			$scope.shippingConfirmList = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.noConfirmedFlg =  owsCommon.getDefaultValue($scope.noConfirmedFlgList);
			$scope.searchCondition.tallocInstH.shippingDtFrom = userInfo.systemDt;
			$scope.searchCondition.tallocInstH.shippingDtTo = userInfo.systemDt;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
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
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#search
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
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
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#getPagingData
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
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

		api.ShippingConfirmList.confirmSearch(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#setPagingData
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
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

		// [ON推-品向-330] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-330] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.shippingConfirmList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#getClassForRow
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.pickingStatus == "55") {
			return "wmslegendturquoise";
		} else if (row.entity.shippingStopFlg =="1" || row.entity.stopFlg =="1" || row.entity.allocNgFlg =="1") {
			return "wmslegendindianred";
		}
		//[ON推-1.1.4-CT-075]CT指摘の修正対応 2016.06.10 chou Add Start
		else if (row.entity.pickingStatus == "50") {// 出荷検品済
			return "wmslegendaqua";
		}
		//[ON推-1.1.4-CT-075]CT指摘の修正対応 2016.06.10 chou Add End
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#excelOutput
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.ShippingConfirmList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#gridDblClick
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("shippingInstList", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#confirm
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 出荷確定ボタン押下処理<br>
	 *
	 * 出荷確定処理
	 */
	$scope.confirm = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 「出荷確定済」の行が選択されている場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			// 「出荷確定済」の行が選択されている場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingStatus == "55") {
				alertMessage.setErrorMessageByCode("foundShipCompletedError");
				return;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocNgFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedAllocToError");
				return;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].shippingStopFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedShipToError");
				return;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].stopFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedOrProductError");
				return;
			}
		}

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ更新関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingConfirmList.checkConfirm;
			execFunc = api.ShippingConfirmList.confirm;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出荷確定処理
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

	//  米国出荷ドキュメント追加対応 2018.01.05 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#carrierTrace
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 貨物追跡番号登録ボタン押下処理<br>
	 *
	 * 選択行の梱包ヘッダデータを修正する。
	 */
	$scope.carrierTrace = function() {

		// 貨物追跡番号登録ボタンを押下された時に処理貨物追跡番号登録画面をモーダル表示する

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		// 行が選択されていない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		};
		// 複数行が選択されている場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1){
			// 複数行が選択されている場合、エラーメッセージを表示
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		};
		// 未発行データが選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bolNo == null){
			// 複数行が選択されている場合、エラーメッセージを表示
			alertMessage.setErrorMessageByCode("noPrintedSelected");
			return;
		};

		// ===== 貨物追跡番号登録画面呼び出し =====
		var selectedRow = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];

		var items = {
				bolNo: selectedRow.bolNo,
				pickingHId: selectedRow.pickingHId
		};
		var modalInstance = modalFactory.modalcarrierTraceNumInput(items);
		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			var request = new Array(3);
			request[0] = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request[1] = selectedRow.bolNo;
			request[2] = selectedItem.traceNo;

			if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
				return;
			}
			api.ShippingConfirmList.traceNoUpdate(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					return;
				}
				//選択状態をクリアする
				owsCommon.toggleSelectAll($scope.gridOptions, false);
			});
		});
	};
	//  米国出荷ドキュメント追加対応 2018.01.05 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#shipCompleteCancel
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 出荷確定解除ボタン押下処理<br>
	 *
	 * 出荷確定解除処理
	 */
	$scope.shipCompleteCancel = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}
		// 「未確定」の行が選択されている場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			// 「未確定」の行が選択されている場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingStatus != "55") {
				alertMessage.setErrorMessageByCode("foundNotShipCompletedError");
				return;
			}
		}

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ更新関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingConfirmList.checkConfirmCancel;
			execFunc = api.ShippingConfirmList.confirmCancel;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出荷確定処理
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
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#ForcedShipComplete
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 強制確定ボタン押下処理<br>
	 *
	 * 強制確定処理
	 */
	$scope.ForcedShipComplete = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 「出荷確定済」の行が選択されている場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			// 「出荷確定済」の行が選択されている場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].pickingStatus == "55") {
				alertMessage.setErrorMessageByCode("foundShipCompletedError");
				return;
			}

			// [SK2-046] 通常確定と同じチェックを追加 2014.12.12 許 Start
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].allocNgFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedAllocToError");
				return;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].shippingStopFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedShipToError");
				return;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].stopFlg == "1") {
				alertMessage.setErrorMessageByCode("foundStoppedOrProductError");
				return;
			}
			// [SK2-046] 通常確定と同じチェックを追加 2014.12.12 許 End
		}

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ更新関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingConfirmList.checkCompulsory;
			execFunc = api.ShippingConfirmList.compulsory;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出荷確定処理
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
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#receivePlanInput
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 出庫指示一覧ボタン押下処理<br>
	 *
	 * 選択行の入荷予定データを修正する為の画面を表示する。
	 */
	$scope.receivePlanInput = function() {
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		//【出庫指示一覧】画面へ遷移
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		$location.path("wms/shipping/ShippingInstList").search({})
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
		.search("mode", SCREEN_MODE.Read)
		//荷主センタ変更対応 201７.02.24 sja Start
		.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
		//荷主センタ変更対応 201７.02.13 sja End
		.search("pickingWorkNo", listBody[0].pickingWorkNo)
		.search("workDt", listBody[0].workDt);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
