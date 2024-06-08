/**
 * @ngdoc overview
 * @name oneslogiWms.StockInOutList
 *
 * @description
 * 在庫受払問合せ画面<br>
 *
 * 在庫受払問合せに対する検索を行う為の画面。
 */
angular.module('oneslogiWms.StockInOutList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.StockInOutList.service:stockInOutListApi
 *
 * @description
 * 在庫受払問合せ画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * stockType 在庫区分データ操作用WebApi<br>
 * ・resources/common/stockType/keyValueList ドロップダウンリスト用データ取得<br>
 * <br>
 * processType 処理区分データ操作用WebAPI<br>
 * ・resources/common/processType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * depositCustomer 預託データ操作用WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * product 商品データ操作用WebAPI<br>
 * ・resources/common/product/record 単一行データ取得WebAPI<br>
 * <br>
 * stockInOut 在庫受払データ操作用WebApi<br>
 * ・resources/stock/stockInOutList/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/stock/stockInOutList/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/stock/stockInOutList/search 検索WebAPI<br>
 */
.factory('stockInOutListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.14 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.14 sja End
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa
		stockInOut: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/stock/stockInOutList/initNew'],
				 ['search',             'GET',  'resources/stock/stockInOutList/search'],
				 ['excel',              'GET',  'resources/stock/stockInOutList/search', 'excel']
				 ]
		),
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		)
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockInOutList.object:StockInOutList
 *
 * @description
 * 在庫受払問合せ画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('StockInOutList', ['$scope', '$route', '$filter', '$location', '$q',
                               'alertMessage', 'directiveControl', 'gridDirectiveControl',
                               'optionMessageControl', 'gridOptionMessageControl', 'owsHistory',
                               'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'stockInOutListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.stockInOutCols = [
	                         {field:"clientCd", displayName:"荷主"},
	                         {field:"centerCd", displayName:"センタ"},
	                         //荷主センタ変更対応 2017.02.14 sja Start
                             {field:"clientNm", displayName:"荷主名称"},
                             {field:"centerNm", displayName:"センタ名称"},
                             //荷主センタ変更対応 2017.02.14 sja End
	                         {field:"warehouseCd", displayName:"倉庫"},
	                         {field:"productCd", displayName:"商品CD"},
	                         {field:"productNm", displayName:"商品名称"},
	                         {field:"productAbbr", displayName:"商品略称"},
	                         {field:"janCd", displayName:"JANCD"},
	                         {field:"processDt", displayName:"処理日"},
	                         {field:"depositCd", displayName:"預託CD"},
	                         {field:"depositNm", displayName:"預託名称"},
	                         {field:"stockTypeCd", displayName:"在庫区分CD"},
	                         {field:"stockTypeNm", displayName:"在庫区分名称"},
	                         {field:"lot", displayName:"ロット"},
	                         {field:"limitDt", displayName:"期限日"},
	                         {field:"storeLabelNo", displayName:"入庫ラベルNo."},
	                         {field:"storeLabelNoOld", displayName:"元入庫ラベルNo."},
	                         {field:"supplierCd", displayName:"仕入先CD"},
	                         {field:"supplierNm", displayName:"仕入先名称"},
	                         {field:"supplierAbbr", displayName:"仕入先略称"},
	                         {field:"processTypeCd", displayName:"処理区分CD"},
	                         {field:"processTypeNm", displayName:"処理区分名称"},
	                         {field:"pChargeNumDay", displayName:"前残数"},
	                         {field:"stockInNum", displayName:"受入数"},
	                         {field:"stockOutNum", displayName:"払出数"},
	                         {field:"chargeNum", displayName:"当日在庫数"},
	                         {field:"locationCd", displayName:"ロケーションCD"},
	                         {field:"addDt", displayName:"登録日時"},
	                         {field:"addUser", displayName:"登録ユーザ"},
	                         {field:"processNo", displayName:"処理No."},
	                         {field:"supplyCustomerCd", displayName:"納品先CD"},
	                         {field:"supplyCustomerNm", displayName:"納品先名称"},
	                         {field:"supplyCustomerAbbr", displayName:"納品先略称"},
	                         {field:"moveInstComment", displayName:"在庫移動指示備考"},
	                         {field:"finishDt", displayName:"期限切れ"},
	                         {field:"allocNgFlg", displayName:"引当禁止"},
	                         {field:"sortFlg", displayName:"ソート順"}
	                         ];

	var oldClient;
	var newDepositList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#initScreen
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.tstock.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託リスト変更（同期処理）
			$scope.deferredGetDepositList()
			.then(function(response){
				newDepositList = response.data;

			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;

			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.searchCondition.tstock.mclient.clientCd) {
				// 選択した荷主で取得済みの預託リストを設定
				setDepositList(newDepositList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};

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

		// ロケーション大小チェック
		$scope.locationFromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};

		// ロケーション大小チェック用メッセージ
		$scope.locationFromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// グリッドの設定
		// [ON推-品向-869] タイトル行クリックで並び順は変更しないように修正 2015.07.10 kawana Start
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
		// [ON推-品向-869] タイトル行クリックで並び順は変更しないように修正 2015.07.10 kawana End
			data: 'stockInOutList',
			columnDefs: 'stockInOutCols'
		});
		// [検査-064] グリッドの設定を追加 2014.11.27 楊寧 Start
		$scope.gridOptions.enableRowSelection = true;
		// [検査-064] グリッドの設定を追加 2014.11.27 楊寧 End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#initScreenHttp
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
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
				//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa
				// 荷主センタ変更対応 201７.02.14 sja Start
				 $scope.deferredGetWarehouseCdList()
				// 荷主センタ変更対応 201７.02.14 sja End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
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

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.14 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#deferredGetWarehouseCdList
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 倉庫プルダウンデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.14 sja End

	//荷主センタ変更対応 201７.02.14 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#changeCenter
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCdList();
	};
	//荷主センタ変更対応 201７.02.14 sja End
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#deferredGetDepositList
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		//荷主センタ変更対応 201７.02.14 sja Start
//		request.clientCd = userInfo.clientCd;	
		if ($scope.searchCondition) {
			request.clientCd = $scope.searchCondition.tstock.mclient.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
	 	//荷主センタ変更対応 201７.02.14 sja End

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#deferredGetDepositList
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
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
		request.clientCd = $scope.searchCondition.tstock.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#deferredGetInitData
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 在庫受払データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();
		// 新規
		api.stockInOut.initNew().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			$scope.searchCondition = response.data.head; // 在庫受払ヘッダ関連
			$scope.stockInOutList = response.data.body; // 在庫受払リスト関連

			$scope.searchCondition.tstock.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
			$scope.searchCondition.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.searchCondition.processDtFrom = userInfo.systemDt;//処理日(From)
			$scope.searchCondition.processDtTo = userInfo.systemDt;//処理日(To)
			//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.processTypeList.length == 1) {
				$scope.searchCondition.mprocessType.processTypeCd = $scope.processTypeList[0].processTypeCd;
			}

			var clearSelectedFlg = true;
			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

				clearSelectedFlg = false;

			} else if ($scope.screenMode == SCREEN_MODE.Update) {
				//荷主センタ変更対応 201７.02.24 sja Start
				$scope.searchCondition.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.tstock.mclient.clientCd = $route.current.params.clientCd;
				//荷主センタ変更対応 201７.02.24 sja End
				$scope.searchCondition.tstock.mwarehouse.warehouseCd = $route.current.params.warehouseCd;
				$scope.searchCondition.processDtFrom = $route.current.params.dataTime;
				$scope.searchCondition.processDtTo = $route.current.params.dataTime;
				$scope.searchCondition.tstock.mcustomer.customerCd = $route.current.params.customerCd;
				$scope.searchCondition.tstock.mstockType.stockTypeCd = $route.current.params.stockTypeCd;
				$scope.searchCondition.productCd = $route.current.params.productCd;
				$scope.searchCondition.productNm = $route.current.params.productNm;
				$scope.searchCondition.janCd = $route.current.params.janCd;
				$scope.search();

				clearSelectedFlg = false;
			}

			// 荷主変更後処理
			$scope.changeClient(clearSelectedFlg);
			//荷主センタ変更対応 201７.02.14 sja Start
			// センタ変更後処理
			$scope.centerChange(true);
			//荷主センタ変更対応 201７.02.14 sja End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.objectStockInOutList#search
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		$scope.getSearchData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#getSearchData
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		api.stockInOut.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#setSearchData
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-336] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-336] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.stockInOutList = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#getClassForRow
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.sortFlg == "1") {
			return "wmslegendgold";
		}
		if (row.entity.sortFlg == "3") {
			return "wmslegendhotpink";
		}
		if (row.entity.allocNgFlg == "1") {
			return "wmslegendindianred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#excelOutput
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.stockInOut.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#changeClient
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託リスト変更（同期処理）
		$scope.deferredGetDepositList()
		.then(function(response){
			setDepositList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#customerCdBlur
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.productCd;

		if(productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.tstock.mclient.clientCd);
			request.productCd = productCd;

			// 商品情報の取得
			api.product.record(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#showCustomer
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.searchCondition.tstock.mclient.clientCd,
				productCd: $scope.searchCondition.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.productCd =  selectedItem.productCd;
			$scope.searchCondition.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#showLocationFrom
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * ロケーション(From)検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocationFrom = function(){

		var items = {
				centerCd: $scope.searchCondition.centerCd,
				locationCd: $scope.searchCondition.locationCdFrom,
				// [C-CWMS-0028] 検索条件にゾーンを追加 2015.06.05 kawana Start
				warehouseCd: $scope.searchCondition.tstock.mwarehouse.warehouseCd
				// [C-CWMS-0028] 検索条件にゾーンを追加 2015.06.05 kawana End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.locationCdFrom = selectedItem.locationCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			$scope.searchCondition.locationNmFrom = selectedItem.locationNm;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#showLocationTo
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * ロケーションCD(To)検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocationTo = function(){

		var items = {
				centerCd: $scope.searchCondition.centerCd,
				locationCd: $scope.searchCondition.locationCdTo,
				// [C-CWMS-0028] 検索条件にゾーンを追加 2015.06.05 kawana Start
				warehouseCd: $scope.searchCondition.tstock.mwarehouse.warehouseCd
				// [C-CWMS-0028] 検索条件にゾーンを追加 2015.06.05 kawana End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.locationCdTo = selectedItem.locationCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			$scope.searchCondition.locationNmTo = selectedItem.locationNm;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:StockInOutList#locationCdBlur
	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCD
		var locationCd = "";
		if (index == 1) {
			locationCd = $scope.searchCondition.locationCdFrom;
		} else {
			locationCd = $scope.searchCondition.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.searchCondition.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.searchCondition.locationNmFrom = null;
			}else{
				$scope.searchCondition.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	// 預託リスト再設定処理
	var setDepositList = function(list, clearSelected) {
		$scope.depositList = list;
		//[ON推-品向-417]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.06 衛 Start
		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositList.length == 1) {

				$scope.searchCondition.tstock.mcustomer.customerCd = $scope.depositList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.tstock.mcustomer.customerCd = null;
			}
		}
		//[ON推-品向-417]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.06 衛 End
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.stockTypeList.length == 1) {
				$scope.searchCondition.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
			} else {
				$scope.searchCondition.stockTypeCd = null;
			}
		}
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
