/**
 * @ngdoc overview
 * @name oneslogiWms.TotalStockList
 *
 * @description
 * トータル在庫問合せ画面
 */
angular.module('oneslogiWms.TotalStockList',[])
/**
 * @ngdoc service
 * @name oneslogiWms.TotalStockList.service:totalStockListApi
 *
 * @description
 * 定点発注一覧WebApi定義<br>
 * ・resources/stock/totalStockList/init 初期処理WebApi<br>
 * ・resources/stock/totalStockList/search トータル在庫問合せWebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 * ・resources/common/centerClass/keyValueList 区分値取得<br>
 * ・resources/common/userCenter/keyValueList センタ取得<br>
 *
 */
.factory('totalStockListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		dropdownList: AngularAPIClient.make(
			    [
			     ['query', 'GET', 'resources/common/centerClass/keyValueList']
			    ]
		),
		center: AngularAPIClient.make(
			    [
			     ['keyValueList', 'GET', 'resources/common/userCenter/keyValueList']
			    ]
		),
		totalStockList: AngularAPIClient.make(
				[
				 ['init',           'GET',  'resources/stock/totalStockList/init'],
				 ['search',         'GET',  'resources/stock/totalStockList/search'],
				 ['excel',          'GET',  'resources/stock/totalStockList/search', 'excel']
				 ]
		)
	};
}])
.controller('TotalStockList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'totalStockListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;

	$scope.totalStockListCols =[];
	$scope.totalStockList = [];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#initScreen
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.head.mclient.clientCd;
		};

		// [#7212][OSS] 「預託」「在庫区分」の選択項目への代入処理を荷主変更時に修正 2020.03.09 tsuboi Start
		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
				setDepositStockTypeList(newDepositStockTypeList, true);
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
				setStockTypeList(newStockTypeList, true);
			});
		};
		// [#7212][OSS] 「預託」「在庫区分」の選択項目への代入処理を荷主変更時に修正 2020.03.09 tsuboi End

		// [#7212][OSS] ロストフォーカス処理を削除 2020.03.09 tsuboi Delete

		// 日付大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
        	var fromValueString = owsCommon.dateToString(fromValue);
        	var toValueString = owsCommon.dateToString(toValue);
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

		// 日付大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

        // [#2237] ページングを削除 2017.08.14 kawana Start

		// グリッドの設定(列定義用)
		$scope.defGridOptions = owsCommon.mergeSingleSelectGridOptions({
			columnDefs : 'totalStockListCols',
		});

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data : 'totalStockList',
			columnDefs : 'totalStockListCols',
			// [ON推-品向-975] グリッドヘッダ設定を無効に変更 2015.10.08 kawana Start
			enableChangeColumn : false
			// [ON推-品向-975] グリッドヘッダ設定を無効に変更 2015.10.08 kawana End
		});

        // [#2237] ページングを削除 2017.08.14 kawana End

        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#changeClient
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});

		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		// 荷主ドロップダウンリストの選択値
		request.clientCd = $scope.head.mclient.clientCd;

		api.depositCustomer.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetStockTypeList
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		// 荷主ドロップダウンリストの選択値
		request.clientCd = $scope.head.mclient.clientCd;

		api.stockType.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetStockNumDisplay
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 在庫数 0非表示取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockNumDisplay = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_NUM_0_DISPLAY";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.stockNumDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetCenter
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * センタ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCenter = function(){
		var deferred = $q.defer();

		api.center.keyValueList().then(function(response){
			$scope.centerList = response.data;
			$scope.setCols(response.data);
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetFixedPoint
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 定点切れ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetFixedPoint = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FIXED_POINT";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.fixedPointList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
		    // 取得した預託データが1件の場合
			if ($scope.depositStockTypeList.length == 1) {
			    // 1件目を選択状態にする
				$scope.head.mcustomer.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			}
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 在庫区分は一つ目を設定
		if (clearSelected) {
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#initScreenHttp
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
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
				 $scope.deferredGetStockNumDisplay(),
				 $scope.deferredGetCenter(),
				 $scope.deferredGetFixedPoint()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#deferredGetInitData
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 画面初期化データ設定（同期処理）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.totalStockList.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;
			$scope.totalStockList = response.data.body;

	        // [#2237] ページングを削除(該当処理削除) 2017.08.14 kawana

			// 荷主変更後処理
			$scope.changeClient(true);

			// 引当可能数 0非表示
			if ($scope.stockNumDisplayList.length > 0) {
				$scope.head.stockNumDisplay = owsCommon.getDefaultValue($scope.stockNumDisplayList);
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#changeClient
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});

		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#showProduct
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.head.mclient.clientCd,
				productCd: $scope.head.mproduct.productCd,
				//[Ver3.0]#3998 アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd Start
				editableFlg: true
				//[Ver3.0]#3998 アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd End
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd =  selectedItem.productCd;
			$scope.head.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#productCdBlur
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.mproduct.productNm = null;
		}
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.TotalStockList.object:TotalStockList#search
     * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){

        // [#2237] ページングを削除 2017.08.14 kawana Start

		$scope.getSearchDataAsync();

        // [#2237] ページングを削除 2017.08.14 kawana End

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#getSearchDataAsync
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchDataAsync = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

        // [#2237] ページングを削除(該当処理削除) 2017.08.14 kawana

		api.totalStockList.search(request).then(function(response) {

			statusInfo.isSuccessAndShowMessage(response,'searchform');

	        // [#2237] ページングを削除 2017.08.14 kawana Start
			$scope.setSearchData(response);
	        // [#2237] ページングを削除 2017.08.14 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#setSearchData
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 検索データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		// 選択状態をクリア(非表示になるグリッドも対象)
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.totalStockList = response.data.body;

        // [#2237] ページングを削除(該当処理削除) 2017.08.14 kawana

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	// グリッドの列情報の作成
	$scope.setCols = function(centerList) {

		// センタ毎の項目キー
		var centerStockKey = "centerStockList";
		// センタ毎の項目リスト
		var centerStockColumns = [];

		// 列定義をチェック
		for (var i = 0; i < $scope.defGridOptions.columnDefs.length; i++) {
			var column = $scope.defGridOptions.columnDefs[i];

			// センタ毎の項目キーと比較
			if (centerStockKey == column.field.substring(0,15)) {

				// センタ毎の項目に追加
				centerStockColumns.push(column);
			} else {

				// 列に追加
				$scope.totalStockListCols.push(column);
			}
		}

		// センタ件数分繰返し
		for (var i = 0; i < centerList.length; i++) {

			// センタ毎項目分繰返し
			for (var j = 0; j < centerStockColumns.length ; j++) {
				// センタ項目の作成
				var centerColumn = angular.copy(centerStockColumns[j]);
				var preField = "mcenterList[" + i + "]";
				centerColumn.name = centerColumn.name + i; // ui-grid対応 ※「name」が同じだとui-gridでは列が追加されずに置換される為
				centerColumn.field = centerColumn.field.replace(centerStockKey, preField);

				// 列に追加
				$scope.totalStockListCols.push(centerColumn);
			}
		}

		$scope.gridOptions.columnDefs = $scope.totalStockListCols;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#excelOutput
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head =$scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.totalStockList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.TotalStockList.object:TotalStockList#getClassForRow
	 * @methodOf oneslogiWms.TotalStockList.object:TotalStockList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * トータル在庫問合せに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (owsCommon.isGreaterThan(row.entity.mproduct.fixedPoint, row.entity.stockNum)) {
			return "wmslegendindianred";
		}
		return "";
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);


