/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail
 *
 * @description
 * 出庫パレット情報照会(詳細)画面<br>
 *
 * 出庫パレット情報の詳細を表示する画面。
 */
angular.module('oneslogiWms.ShippingPalleteInfoInquiryDetail', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.service:shippingPalleteInfoInquiryDetailApi
 *
 * @description
 * 出庫パレット情報照会(詳細)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * orderType 依頼種別データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * status ステータスデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ShippingPalleteInfoInquiryDetail 出庫パレット情報照会(詳細)データ操作用WebApi<br>
 * ・resources/stock/ShippingPalleteInfoInquiryDetail/init 新規画面用初期データ取得WebAPI<br>
 * ・resources/stock/ShippingPalleteInfoInquiryDetail/search 検索WebAPI<br>
 */
.factory('ShippingPalleteInfoInquiryDetailApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		deliveryCustomer: AngularAPIClient.make([
			['record', 'GET', 'resources/common/deliveryCustomer/record']
			]
		),
		//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa
		ShippingPalleteInfoInquiryDetail: AngularAPIClient.make(
				[
				['init',            'GET',  'resources/stock/ShippingPalleteInfoInquiryDetail/init'],
				['search',          'GET',  'resources/stock/ShippingPalleteInfoInquiryDetail/search'],
				['excel',           'GET',  'resources/stock/ShippingPalleteInfoInquiryDetail/search', 'excel']
				]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
 *
 * @description
 * 出庫パレット情報照会画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingPalleteInfoInquiryDetail', ['$scope', '$route', '$filter', '$location', '$q',
                               'alertMessage', 'directiveControl', 'gridDirectiveControl',
                               'optionMessageControl', 'gridOptionMessageControl', 'owsHistory',
                               'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShippingPalleteInfoInquiryDetailApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.shippingPalleteDetailListCols = [
	                         {field:"symbolLineNo", displayName:"段ボール番号"},
	                         {field:"rcvKey", displayName:"入庫キー"},
	                         {field:"symbolMakeNo", displayName:"生出番号"},
	                         {field:"product_Cd", displayName:"銘柄CD"},
	                         {field:"product_Nm", displayName:"銘柄名称"},
	                         {field:"lot1", displayName:"商社搬入番号"},
	                         {field:"lot4", displayName:"製造年月日"},
	                         {field:"lot3", displayName:"デザイン区分"},
	                         {field:"lot2", displayName:"製造記号"},
	                         {field:"stockTypeCd", displayName:"在庫区分"},
	                         {field:"makerCaseNo", displayName:"メーカーケースCD"},
	                         {field:"receiveDate", displayName:"入庫年月日"},
	                         {field:"totalQty", displayName:"数量(カートン)"},
	                         {field:"foreignCargoFlg", displayName:"内貨・外貨区分"},
	                         {field:"ifItemCd", displayName:"需給CD"},
	                         {field:"clientCd", displayName:"荷主CD"},
	                         {field:"clientNm", displayName:"荷主名称"},
                             {field:"centerCd", displayName:"拠点CD"},
                             {field:"centerNm", displayName:"拠点名称"}
	                         ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#initScreen
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'ShippingPalleteInfoInquiryDetail',
			columnDefs: 'shippingPalleteDetailListCols'
		});

		$scope.gridOptions.enableRowSelection = true;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#initScreenHttp
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
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
				 $scope.deferredGetRequestTypeList(),
				 $scope.deferredGetStatusList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	// 依頼種別プルダウンデータ取得
	$scope.deferredGetRequestTypeList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REQUESTTYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.requestTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// ステータスプルダウンデータ取得
	$scope.deferredGetStatusList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SOSTATUS_FORSERCH2";

		api.dropdownList.query(request).then(function(response){
			$scope.statusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
	 *
	 * @description
	 * 出庫パレット情報照会(詳細)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();
		
		var request = {};

		request.centerCd = $route.current.params.gridData[0].centerCd;
		request.clientCd = $route.current.params.gridData[0].clientCd;
		request.sts = $route.current.params.gridData[0].sts;
		request.soPalletNo = $route.current.params.gridData[0].soPalletNo;
		request.shipSchDate = $route.current.params.gridData[0].shipSchDate;
		request.ownerOrderNo = $route.current.params.gridData[0].ownerOrderNo;
		request.orderType = $route.current.params.gridData[0].orderType;
		request.custOrderNo = $route.current.params.gridData[0].custOrderNo;
		request.rmaNo = $route.current.params.gridData[0].rmaNo;
		request.refNo = $route.current.params.gridData[0].ownerSoNo;
		request.shipDate = $route.current.params.gridData[0].shipDate;
		request.expectQty1Style1 = $route.current.params.gridData[0].expectQty1Style1;
		request.expectQty1Style2 = $route.current.params.gridData[0].expectQty1Style2;
		request.shipToCd = $route.current.params.gridData[0].shipToCd;
		request.otherRefNo1 = $route.current.params.gridData[0].otherRefNo1;
		request.palletKey = $route.current.params.gridData[0].palletKey;
		request.soId = $route.current.params.gridData[0].soId;

		// 画面初期起動時
		api.ShippingPalleteInfoInquiryDetail.init(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			$scope.searchCondition = response.data.head; // 出庫パレット情報照会(詳細)ヘッダ関連
			$scope.ShippingPalleteInfoInquiryDetail = response.data.body; // 出庫パレット情報照会(詳細)明細データ関連
			
			// 明細データ検索処理
			$scope.search();
			
			var clearSelectedFlg = true;
			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

				clearSelectedFlg = false;

			} else if ($scope.screenMode == SCREEN_MODE.Update) {
				$scope.searchCondition.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.clientCd = $route.current.params.clientCd;
				$scope.search();

				clearSelectedFlg = false;
			}

			// 荷主変更後処理
			$scope.changeClient(clearSelectedFlg);

			// センタ変更後処理
			$scope.centerChange(true);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.objectShippingPalleteInfoInquiryDetail#search
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
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

		api.ShippingPalleteInfoInquiryDetail.search(request).then(function(response) {
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#setSearchData
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.ShippingPalleteInfoInquiryDetail = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#getClassForRow
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
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
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#excelOutput
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
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

		api.ShippingPalleteInfoInquiryDetail.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail#changeClient
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiryDetail.object:ShippingPalleteInfoInquiryDetail
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 依頼種別リスト変更（同期処理）
		$scope.deferredGetRequestTypeList()
		.then(function(response){
			setRequestTypeList(response.data, clearSelected);
		});
		// ステータスリスト変更（同期処理）
		$scope.deferredGetStatusList()
		.then(function(response){
			setStatusList(response.data, clearSelected);
		});
	};

	// 明細行が無い場合、ボタンを非活性化にする
	$scope.checkButtonDisabled = function() {
		if($scope.gridOptions.gridApi != null) {
			if($scope.gridOptions.gridApi.selection.getSelectedRows().length) {
				return true;
			}
		}
		return false;
	}

	// 依頼種別リスト再設定処理
	var setRequestTypeList = function(list, clearSelected) {
		$scope.requestTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.requestTypeList.length == 1) {
				$scope.searchCondition.requestType = $scope.requestTypeList[0].classCd;
			} else {
				$scope.searchCondition.requestType = null;
			}
		}
	};

	// ステータスリスト再設定処理
	var setStatusList = function(list, clearSelected) {
		$scope.statusList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.statusList.length == 1) {
				$scope.searchCondition.status = $scope.statusList[0].classCd;
			} else {
				$scope.searchCondition.status = null;
			}
		}
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
