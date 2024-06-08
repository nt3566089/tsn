/**
 * @ngdoc overview
 * @name oneslogiWms.InstKeyList
 *
 * @description
 * 在庫調査指示一覧
 */
angular.module('oneslogiWms.InstKeyList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.InstKeyList.service:instKeyListApi
 *
 * @description
 * 在庫調査指示一覧WebApi定義<br>
 * resources/common/centerClass/keyValueList																					
 * resources/inventory/instKeyList/init																					
 * resources/inventory/instKeyList/search																					
 * resources/inventory/instKeyList/search																					
 * resources/inventory/instKeyList/inputPrint																					
 * resources/inventory/instKeyList/print																					
 *
 */
.factory('instKeyListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),	
		instKeyList: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/inventory/instKeyList/init'],
					['search', 'GET', 'resources/inventory/instKeyList/search'],
					['excel',  'GET', 'resources/inventory/instKeyList/search', 'excel'],
					['inputPrint',  'GET', 'resources/inventory/instKeyList/inputPrint'],
					['print',  'GET', 'resources/inventory/instKeyList/print']
				]
		),
		clientCenter: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/clientCenter/record']
				 ]
		)	
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InstKeyList.object:InstKeyList
 *
 * @description
 * 棚卸履歴画面コントローラ
 */
.controller('InstKeyList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory',  'printFactory', 'instKeyListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.instKeyListCols =
	[
	 	{field:"inventoryInstKbnCd", displayName:"在庫調査区分"},
	 	{field:"inventoryInstKbn", displayName:"在庫調査区分"},
		{field:"tinventoryH.inventoryKey", displayName:"在庫調査指示キー"},
		{field:"tinventoryH.inventoryDt", displayName:"棚卸日"},
		{field:"productDivisionCd", displayName:"銘柄区分"},
		{field:"productDivision", displayName:"銘柄区分"},
		{field:"lineBlock", displayName:"ライン/ブロック"},
		{field:"directionalPiston", displayName:"方面ピストン"},
		{field:"ilocationGrpCd", displayName:"ロケーショングループ"},
		{field:"ilocationGrp", displayName:"ロケーショングループ"},
		{field:"locationCd", displayName:"ロケーションCD"},
		{field:"fromLocationCd", displayName:"FROMロケーションCD"},
		{field:"toLocationCd", displayName:"TOロケーションCD"},
		{field:"productCd", displayName:"商品CD"},
		{field:"productNm", displayName:"銘柄名称"},
        {field:"tinventoryH.mcenter.centerCd", displayName:"拠点CD"},
        {field:"tinventoryH.mcenter.centerNm", displayName:"拠点名称"},
        {field:"tinventoryH.mclient.clientCd", displayName:"荷主CD"},
        {field:"tinventoryH.mclient.clientNm", displayName:"荷主名称"}
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#initScreen
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'instKeyList',
			columnDefs: 'instKeyListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.setControl();

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面コントロール
	$scope.setControl = function() {

		var request = {};
		request.clientId = userInfo.clientId;
		request.centerId = userInfo.centerId;
	
		return api.clientCenter.record(request).then(function(response){
	
			if (response.status.statusCode < 0) {
				return;
			}
	
			if (response.data.mClientCenter) {
				if(response.data.mClientCenter.mparamAsOne.centerKbn == "1"){
					$scope.centerKbn = true;
					$scope.gridOptions.columnDefs[6].visible = false;
				}else{
					$scope.centerKbn = false;
					$scope.gridOptions.columnDefs[0].visible = false;
					$scope.gridOptions.columnDefs[3].visible = false;
					$scope.gridOptions.columnDefs[4].visible = false;
					$scope.gridOptions.columnDefs[5].visible = false;
					$scope.gridOptions.columnDefs[10].visible = false;
					$scope.gridOptions.columnDefs[11].visible = false;
		
				}
			} 
		});
    };

	// 在庫調査区分データ取得
	$scope.deferredGetInventoryInstKbnList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_INST_KBN";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.inventoryInstKbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	// ロケーショングループデータ取得
	$scope.deferredGetLocationGrpList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOC_GROUP";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.locationGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#initScreenHttp
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {

		//全通信終了後に以下関数で各種設定を実行
		$q.all(
			[
			 	$scope.deferredGetInventoryInstKbnList(), // 倉庫
			 	$scope.deferredGetLocationGrpList(), // 預託
			]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#deferredGetInitData
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * 在庫調査指示一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.instKeyList.init().then(function(response){

			$scope.paging = response.paging;

			$scope.headH = response.data.head;
			$scope.headInst = response.data.inst;
			$scope.instKeyList = response.data.bodyList;
			$scope.historyData = response.data;
			$scope.headH.clientCd = userInfo.clientCd;
			$scope.headH.centerCd = userInfo.centerCd;
			$scope.headH.inventoryDt = userInfo.systemDt;

			$scope.printParam = response.data.instKeyPrintDto.printBasicData;


			// 在庫調査区分
			$scope.headInst.inventoryInstKbn = owsCommon.getDefaultValue($scope.inventoryInstKbnList);
			
			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.historyData = owsHistory.popState();
				$scope.headH = $scope.historyData.head;
				$scope.headInst = $scope.historyData.inst;
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
	 * @name oneslogiWms.InstKeyList.object:stockCheck#stockCheck
	 * @methodOf oneslogiWms.InstKeyList.object:stockCheck
	 *
	 * @description
	 * 国免在庫照合ボタン押下処理<br>
	 *
	 * 一覧で選択されたデータの情報を国免在庫照合画面に設定し、表示する。
	 */
	$scope.stockCheck = function() {

		//国免在庫照合画面へ遷移
		$location.path("wms/stock/StockCheck").search({}).search("mode", SCREEN_MODE.Update)
		.search("instKey", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryKey);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:stockCheck#inventoryInput
	 * @methodOf oneslogiWms.InstKeyList.object:stockCheck
	 *
	 * @description
	 * 在庫調査結果確認ボタン押下処理<br>
	 *
	 * 一覧で選択されたデータの情報を在庫調査結果確認画面に設定し、表示する。
	 */
	$scope.inventoryInput = function() {
		
		//明細.在庫調査区分が'06:不適品'。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryInstKbn == "06") {
			alertMessage.setErrorMessageByCode("instKeyListInventoryInstKbnSelectUnsuitableError");
			return;
		}
		//在庫調査結果確認画面へ遷移
		$location.path("wms/inventory/InventoryInput").search({}).search("mode", SCREEN_MODE.Update)
		.search("instKey", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].inventoryKey);
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#excelOutput
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		
		request.data.head =$scope.headH;
		request.data.inst = $scope.headInst;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.instKeyList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#search
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};
	
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#getPagingData
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		
		request.data.head = $scope.headH;
		request.data.inst = $scope.headInst;
		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.instKeyList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#setPagingData
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.instKeyList = response.data.bodyList;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;//トータル件数を設定
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.historyData);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InstKeyList.object:InstKeyList#inventoryUnsuitablePrint
	 * @methodOf oneslogiWms.InstKeyList.object:InstKeyList
	 *
	 * @description
	 * 不適品在庫調査表発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.inventoryUnsuitablePrint = function() {

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.headH);
		owsHistory.replaceState($scope.headInst);
		
		var request = {};
		request.data = {};
		request.data.head = $scope.headH;
		request.data.inst = $scope.headInst;
		request.data.bodyList = $scope.gridOptions.gridApi.selection.getSelectedRows();

		api.instKeyList.inputPrint(request).then(function(response){
			
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}
			
			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.head = $scope.headH;
				request.data.inst = $scope.headInst;
				request.data.bodyList = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.data.userCd = userInfo.userCd;
				request.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.instKeyList.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							// 再検索処理
							$scope.search();

						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			});
		});

	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);