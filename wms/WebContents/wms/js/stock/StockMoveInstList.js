/**
 * @ngdoc overview
 * @name oneslogiWms.StockMoveInstList
 *
 * @description
 * 在庫移動指示明細画面<br>
 *
 * 在庫移動指示明細に対する検索を行う為の画面。
 */
angular.module('oneslogiWms.StockMoveInstList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.StockMoveInstList.service:StockMoveInstListApi
 *
 * @description
 * 在庫移動指示明細画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * processType 処理区分データ操作用WebAPI<br>
 * ・resources/common/processType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * moveInstStatus 在庫移動指示ステータス操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * StockMoveInstList 在庫受払データ操作用WebApi<br>
 * ・resources/stock/stockMoveInstList/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/stock/stockMoveInstList/search 検索WebAPI<br>
 */
.factory('stockMoveInstListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
		moveInstStatus: AngularAPIClient.make(
				[
		         ['query', 'GET', 'resources/common/centerClass/keyValueList']
		         ]
		),
		stockMoveInstList: AngularAPIClient.make(
				[
				 ['init',            'GET',  'resources/stock/stockMoveInstList/init'],
				 ['search',          'GET',  'resources/stock/stockMoveInstList/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList
 *
 * @description
 * 在庫移動指示明細画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('StockMoveInstList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'stockMoveInstListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.stockMoveInstListCols = [
	                         {field:"moveInstStatus", displayName:"在庫移動指示ステータスCD"},
	                         {field:"mcenterClassDtlByMoveInstStatus.vdict.dictNm", displayName:"在庫移動指示ステータス名称"},
	                         {field:"mwarehouse.warehouseCd", displayName:"倉庫CD"},
	                         {field:"mwarehouse.warehouseNm", displayName:"倉庫名称"},
	                         {field:"mproduct.productCd", displayName:"商品CD"},
	                         {field:"mproduct.productNm", displayName:"商品名称"},
	                         {field:"mproduct.productAbbr", displayName:"商品略称"},
	                         {field:"mproduct.janCd", displayName:"JANCD"},
	                         {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
	                         {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
	                         {field:"locationCd", displayName:"ロケーション名称"},
	                         {field:"mcustomerByDepositId.customerCd", displayName:"預託CD"},
	                         {field:"mcustomerByDepositId.customerNm", displayName:"預託名称"},
	                         {field:"lot", displayName:"ロット"},
	                         {field:"limitDt", displayName:"期限日"},
	                         {field:"storeLabelNo", displayName:"入庫ラベルNo."},
	                         {field:"mcustomerBySupplierId.customerCd", displayName:"仕入先CD"},
	                         {field:"mcustomerBySupplierId.customerNm", displayName:"仕入先名称"},
	                         //[ON推-品向-1082]明細に項目追加の修正対応 2016.04.08 chou Mod Start
	                         {field:"tMoveInstH.sourceBatchNo", displayName:"指示元バッチNo."},
	                         {field:"instCaseNum1", displayName:"指示出庫ケース数"},
	                         {field:"instPieceNum1", displayName:"指示出庫ピース数"},
	                         {field:"instNum1", displayName:"指示出庫総数"},
	                         {field:"instCaseNum2", displayName:"指示入庫ケース数"},
	                         {field:"instPieceNum2", displayName:"指示入庫ピース数"},
	                         {field:"instNum2", displayName:"指示入庫総数"},
	                         {field:"addDt", displayName:"登録日時"},
	                         {field:"updDt", displayName:"更新日時"}
	                         //[ON推-品向-1082]明細に項目追加の修正対応 2016.04.08 chou Mod End
	                         ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#initScreen
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		var setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'stockMoveInstListDetail',
			columnDefs: 'stockMoveInstListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#initScreenHttp
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
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
				 $scope.deferredGetProcessTypeList(),
				 $scope.deferredGetMoveInstStatus()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {

		var deferred = $q.defer();

		var request = {};
		request.receiveFlg = "0";
		request.shippingFlg = "0";
		request.moveFlg = "0";

		api.processType.keyValueList(request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#deferredGetMoveInstStatus
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
	 *
	 * @description
	 * 在庫移動指示ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMoveInstStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MOVE_INST_STATUS";

		owsCommon.getDataCacheable(api.moveInstStatus, request).then(function(response){
			$scope.moveInstStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#deferredGetInitData
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
	 *
	 * @description
	 * 在庫移動指示データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockMoveInstList.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
				return;
			}

			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head; // 在庫移動指示明細画面ヘッダ
			$scope.stockMoveInstListDetail = response.data.list; // 在庫移動指示明細画面ボディ

			// 初期値を設定
			$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
			$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
			$scope.searchCondition.moveSlipNo = $route.current.params.moveSlipNo;

			// [#6799][OSS] ページング不正修正($scope.setPagingDataを削除) 2019.11.08 kawana Delete

			// ページングオプション変更監視処理

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				owsCommon.clearPagingOptions($scope.gridOptions);
				$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
				// [#6799][OSS] ページング不正修正 2019.11.08 kawana Start
			} else {
				owsCommon.clearPagingOptions($scope.gridOptions);
				$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
			}
			// [#6799][OSS] ページング不正修正 2019.11.08 kawana End
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#getPagingData
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.stockMoveInstList.search(request).then(function(response){
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.searchCondition = response.data.head;
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveInstList.object:StockMoveInstList#setPagingData
	 * @methodOf oneslogiWms.StockMoveInstList.object:StockMoveInstList
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
		$scope.stockMoveInstListDetail = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正(js側でのケース数、ピース数の設定を削除) 2017.01.26 kawana

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
