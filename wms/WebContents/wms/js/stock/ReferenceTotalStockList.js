/**
 * @ngdoc overview
 * @name oneslogiWms.ReferenceTotalStockList
 *
 * @description
 * トータル在庫問合せ画面（参照）
 */
angular.module('oneslogiWms.ReferenceTotalStockList',[])
/**
 * @ngdoc service
 * @name oneslogiWms.ReferenceTotalStockList.service:referenceTotalStockListApi
 *
 * @description
 * 定点発注一覧WebApi定義<br>
 * ・resources/stock/referenceTotalStockList/init 初期処理WebApi<br>
 * ・resources/stock/referenceTotalStockList/search トータル在庫問合せWebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueListLimitUser 権限の範囲での預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 * ・resources/common/centerClass/keyValueList 区分値取得<br>
 * ・resources/common/userCenter/keyValueList センタ取得<br>
 *
 */
.factory('referenceTotalStockListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueListLimitUser', 'GET', 'resources/common/depositCustomer/keyValueListLimitUser']
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
		referenceTotalStockList: AngularAPIClient.make(
				[
				 ['init',           'GET',  'resources/stock/referenceTotalStockList/init'],
				 ['search',         'GET',  'resources/stock/referenceTotalStockList/search'],
				 ['excel',          'GET',  'resources/stock/referenceTotalStockList/search', 'excel']
				 ]
		)
	};
}])
.controller('ReferenceTotalStockList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'referenceTotalStockListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	$scope.referenceTotalStockListCols =[];
	$scope.referenceTotalStockList = [];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#initScreen
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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

		// グリッドの設定(列定義用)
		$scope.defGridOptions = owsCommon.mergeSingleSelectGridOptions({
			columnDefs : 'referenceTotalStockListCols',
		});

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data : 'referenceTotalStockList',
			columnDefs : 'referenceTotalStockListCols',
			enableChangeColumn : false
		});

		// 荷主の編集を不可にする
		directiveControl.editable($scope, "clientCd", false);

        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
	 *
	 * @description
	 * 権限の範囲での預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueListLimitUser", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
		request.clientCd = $scope.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetStockNumDisplay
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetCenter
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetFixedPoint
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#initScreenHttp
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#deferredGetInitData
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
	 *
	 * @description
	 * 画面初期化データ設定（同期処理）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.referenceTotalStockList.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;
			$scope.referenceTotalStockList = response.data.body;

			// ログイン情報より初期値を設定
			$scope.head.mlocation.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;

			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				setDepositStockTypeList(response.data, true);
			});

			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				setStockTypeList(response.data, true);
			});

			// 引当可能数 0非表示
			if ($scope.stockNumDisplayList.length > 0) {
				$scope.head.stockNumDisplay = owsCommon.getDefaultValue($scope.stockNumDisplayList);
			}

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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#showProduct
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.head.mclient.clientCd,
				productCd: $scope.head.mproduct.productCd
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
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#productCdBlur
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
     * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#search
     * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){

		$scope.getSearchDataAsync();

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#getSearchDataAsync
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
		request.data.head.referenceUserCd = userInfo.userCd;

		api.referenceTotalStockList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#setSearchData
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
	 *
	 * @description
	 * 検索データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		// 選択状態をクリア(非表示になるグリッドも対象)
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.referenceTotalStockList = response.data.body;

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
				$scope.referenceTotalStockListCols.push(column);
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
				$scope.referenceTotalStockListCols.push(centerColumn);
			}
		}

		$scope.gridOptions.columnDefs = $scope.referenceTotalStockListCols;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#excelOutput
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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
		request.data.head.referenceUserCd = userInfo.userCd;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.referenceTotalStockList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList#getClassForRow
	 * @methodOf oneslogiWms.ReferenceTotalStockList.object:ReferenceTotalStockList
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


