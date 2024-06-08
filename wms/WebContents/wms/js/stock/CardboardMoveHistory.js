angular.module('oneslogiWms.CardboardMoveHistory',[])
.factory('cardboardMoveHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['queryCenter', 'GET', 'resources/common/centerClass/centerKeyValueList']
		]),
		productRecord: AngularAPIClient.make([
			['record', 'GET', 'resources/common/product/record']
		]),
		CardboardMoveHistory: AngularAPIClient.make([
			['init'		,'GET'	,'resources/stock/cardboardMoveHistory/init'],
			['search'	,'GET'	,'resources/stock/cardboardMoveHistory/search'],
			['excel'	,'GET'	,'resources/stock/cardboardMoveHistory/search'	,'excel'],
			['check'	,'GET'	,'resources/stock/cardboardMoveHistory/check']
		]),

	};
}])

.controller('CardboardMoveHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'cardboardMoveHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.resultListCols =
		[
			 {field:"trsymbolId", displayName:"シンボル管理番号"},
			 {field:"receivePlanHId", displayName:"入庫キー"},
			 {field:"symbolMakeNo", displayName:"生出番号"},
			 {field:"damageFlgNm", displayName:"詰合せ状態"},
			 {field:"locationCd", displayName:"ロケーションCD"},
			 {field:"locGroupNm", displayName:"ロケーショングループ"},
			 {field:"destinationCd", displayName:"受入先CD"},
			 {field:"destinationNm", displayName:"受入先名称"},
			 {field:"receiveDate", displayName:"入庫日"},
			 {field:"shipDate", displayName:"出庫日"},
			 {field:"symbolItemCd", displayName:"銘柄CD(シンボル)"},
			 {field:"productNm", displayName:"銘柄名称(シンボル)"},
			 {field:"lot1", displayName:"商社搬入番号"},
			 {field:"symbolLot4", displayName:"製造年月日(シンボル)"},
			 {field:"designFlgNm", displayName:"デザイン区分(シンボル)"},
			 {field:"symbolPrinterNo", displayName:"号機"},
			 {field:"symbolProductMark", displayName:"製造記号(シンボル)"},
			 {field:"stockTypeNm", displayName:"在庫区分"},
			 {field:"caseItfNo", displayName:"ITF CD"},
			 {field:"caseBarcodeValiant", displayName:"Barcode Valiant"},
			 {field:"caseLot4", displayName:"実製造年月日"},
			 {field:"caseCenterNo", displayName:"センターNo."},
			 {field:"casePackNo", displayName:"ケースパッカーNo."},
			 {field:"casePackTime", displayName:"ケースパッキング時間"},
			 {field:"fromAddress1", displayName:"B/LNo."},
			 {field:"carrierName", displayName:"インボイスNo."},
			 {field:"carrierWbNo", displayName:"オーダーNo."},
			 {field:"carrierNo", displayName:"コンテナNo."},
			 {field:"carrierSName", displayName:"SRC CD"},
			 {field:"mixedFlgNm", displayName:"開封フラグ"},
			 {field:"makerCaseNo", displayName:"メーカーケースCD"},
			 {field:"restqtyBowl", displayName:"残数量(カートン)"},
			 {field:"centerCd", displayName:"拠点CD"},
			 {field:"centerNm", displayName:"拠点名称"},
			 {field:"clientCd", displayName:"荷主CD"},
			 {field:"clientNm", displayName:"荷主名称"}
		 ];


	/***
	 * 画面初期化処理
	 */
	$scope.initScreen = function() {

		// 画面コントロールの初期化
		$scope.initializeControls()
			.then(function(){
				// 画面初期値設定
				$scope.initializeValue();
				
			});

	}

	/***
	 * コントロール初期化処理
	 */
	$scope.initializeControls = function(){
		var deferred = $q.defer();

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// グリッド初期化
		$scope.initializeGrid();

		// 荷主ドロップリストの設定
		$scope.clientCdList = userInfo.clientList;
		
		// センタ取得
		$scope.centerCdList = userInfo.centerList;
	
		$scope.validCheck = function(itemCd, lot1){
			
			if(itemCd == null && lot1 == null){
				var messageCd = "necessaryItemNotInputError";
				optionMessageControl.show($scope, "itemCd", $filter('owfMessage')(messageCd));
				optionMessageControl.show($scope, "lot1", $filter('owfMessage')(messageCd));
				//最初のエラーにフォーカス
				directiveControl.firstErrorOnFocus('inputform');
				return false;
				
			} else if(itemCd != null || lot1 != null){
				optionMessageControl.hide($scope, "itemCd");
				optionMessageControl.hide($scope, "lot1");
			}
			return true;
			
		}
		
		// from-to大小チェック
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
		
		
		// from-to大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetLot3()
		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * グリッド初期化処理
	 */
	$scope.initializeGrid = function(){
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'resultList',
			columnDefs: 'resultListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.pagingOptionsForOutput = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptionsForOutput.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridForOutput.paginationPageSize, $scope.gridForOutput.paginationCurrentPage);
		};

		$scope.gridForOutput = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'excelOutputData',
			columnDefs: 'resultListCols',
			pagingOptions : $scope.pagingOptionsForOutput
		});


	};

	/***
	 * 画面モデル取得処理
	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		api.CardboardMoveHistory.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
			$scope.resultList = response.data.resultList;
			$scope.excelOutputData = response.data.excelOutputData;
			$scope.paging = response.paging;
			
			// 実作業日From
			//if(response.data.dtFromDefFlg == 1){
				$scope.searchCondition.createDateTimeFrom = userInfo.systemDt;
			//}

			deferred.resolve();
		});

		return deferred.promise;
	};
	
	

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){
		// ログイン情報より初期値を設定
		$scope.searchCondition.clientCd = userInfo.clientCd;
		$scope.searchCondition.centerCd = userInfo.centerCd;

		// ドロップダウンの初期値を０に設定
		$scope.searchCondition.lot3 = owsCommon.getDefaultValue($scope.lot3List);

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.searchCondition = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

	/***
	 * 荷主
	 */
	$scope.clientCdChange = function() {
		$scope.deferredGetClientCd($scope.searchCondition.clientCd)
			.then(function(){
				return $scope.deferredGetClientCd($scope.searchCondition.clientCd, null);
			});
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showProduct
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
			clientCd: userInfo.clientCd,
			productCd: $scope.searchCondition.itemCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.itemCd = selectedItem.productCd;
			$scope.searchCondition.itemNm = selectedItem.productNm;
		});
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.itemCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.clientCd);
			request.productCd = productCd;

			api.productRecord.record(request).then(function(response){
				$scope.searchCondition.itemNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.itemNm = null;
		}
	};

	/***
	 * デザイン区分
	 */
	$scope.deferredGetLot3 = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.clientId;
		request.classCd = "DESIGNFLG";

		api.dropdownList.queryCenter(request).then(function(response){
			$scope.lot3List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	
	

	/***
	 * 検索
	 */
	$scope.searchClick = function(){
		if(($scope.searchCondition.itemCd == null || $scope.searchCondition.itemCd == "") 
			&& ($scope.searchCondition.lot1 == null || $scope.searchCondition.lot1 == "")){
			
			var messageCd = "necessaryItemNotInputError";
			optionMessageControl.show($scope, "itemCd", $filter('owfMessage')(messageCd));
			optionMessageControl.show($scope, "lot1", $filter('owfMessage')(messageCd));
			//最初のエラーにフォーカス
			directiveControl.firstErrorOnFocus('inputform');
			
			return false;
		}
		
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};
	
	
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.CardboardMoveHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
			$scope.setSearchData(response);
			$scope.setOutputData(response);
		});


	};

	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す処理を追加
		$scope.gridOptions.gridViewport.scrollTop(0);

		owsCommon.syncExec(function() {
			// 取得したデータをグリッドに表示
			$scope.resultList = response.data.resultList;

			// Excel出力の活性非活性を更新
//			$scope.locGroupChange();
		});

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/***
	 * Excel出力
	 */
	$scope.excelOutputClick = function() {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;
		
		if(($scope.searchCondition.itemCd == null || $scope.searchCondition.itemCd == "") 
			&& ($scope.searchCondition.lot1 == null || $scope.searchCondition.lot1 == "")){
			
			var messageCd = "necessaryItemNotInputError";
			optionMessageControl.show($scope, "itemCd", $filter('owfMessage')(messageCd));
			optionMessageControl.show($scope, "lot1", $filter('owfMessage')(messageCd));
			//最初のエラーにフォーカス
			directiveControl.firstErrorOnFocus('inputform');
			
			return false;
		}

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "resultList", document.title);

		api.CardboardMoveHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchResultForm')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/***
	 * グリッドダブルクリック処理
	 */
	$scope.gridDblClick = function(row) {
		 owsCommon.syncButtonExec("cardboardMoveHistoryDetail", row);
	};
	
	/***
	 * 段ボール移動履歴(詳細)押下
	 */
	$scope.cardboardMoveHistoryDetailClick = function() {

		//段ボール移動履歴(詳細)画面へ遷移
		var request = {};
		request.data = {};
		$scope.searchCondition.clientCd = userInfo.clientCd;
		$scope.searchCondition.centerCd = userInfo.centerCd;
		request.data.searchCondition = $scope.searchCondition;

		// 入力チェック
		api.CardboardMoveHistory.check(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

			//画面追加後、変更
			$location.path("wms/stock/CardboardMoveHistoryDetail")
			.search({})
			.search("mode", SCREEN_MODE.Read)
			.search("trsymbolId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].trsymbolId);
		});

	};


	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
