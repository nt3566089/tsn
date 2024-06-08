/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingPalleteInfoInquiry
 *
 * @description
 * 出庫パレット情報照会画面<br>
 *
 * 在庫受払履歴のうち出庫で移動した製品の履歴をパレット単位にケース詳細まで確認する画面。
 */
angular.module('oneslogiWms.ShippingPalleteInfoInquiry', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingPalleteInfoInquiry.service:shippingPalleteInfoInquiryApi
 *
 * @description
 * 出庫パレット情報照会画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * orderType 依頼種別データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * status ステータスデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * deliveryCustomer 納品先データ操作用WebAPI<br>
 * ・resources/common/deliveryCustomer/record  納品先データ取得WebAPI<br>
 * <br>
 * ShippingPalleteInfoInquiry 出庫パレット情報照会データ操作用WebApi<br>
 * ・resources/stock/ShippingPalleteInfoInquiry/init 新規画面用初期データ取得WebAPI<br>
 * ・resources/stock/ShippingPalleteInfoInquiry/search 検索WebAPI<br>
 */
.factory('ShippingPalleteInfoInquiryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		deliveryCustomer: AngularAPIClient.make([
			['record', 'GET', 'resources/common/deliveryCustomer/record']
			]
		),
		ShippingPalleteInfoInquiry: AngularAPIClient.make(
				[
				['init',            'GET',  'resources/stock/ShippingPalleteInfoInquiry/init'],
				['search',          'GET',  'resources/stock/ShippingPalleteInfoInquiry/search'],
				['excel',           'GET',  'resources/stock/ShippingPalleteInfoInquiry/search', 'excel']
				]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
 *
 * @description
 * 出庫パレット情報照会画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingPalleteInfoInquiry', ['$scope', '$route', '$filter', '$location', '$q',
                               'alertMessage', 'directiveControl', 'gridDirectiveControl',
                               'optionMessageControl', 'gridOptionMessageControl', 'owsHistory',
                               'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShippingPalleteInfoInquiryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.shippingPalleteListCols = [
	                         {field:"sts", displayName:"ステータス"},
	                         {field:"soPalletNo", displayName:"P/LNo."},
	                         {field:"shipSchDate", displayName:"出庫予定日"},
	                         {field:"ownerOrderNo", displayName:"車割キー"},
	                         {field:"orderType", displayName:"依頼種別"},
	                         {field:"custOrderNo", displayName:"依頼番号"},
	                         {field:"rmaNo", displayName:"問合番号"},
	                         {field:"ownerSoNo", displayName:"整理番号"},
	                         {field:"shipDate", displayName:"出庫実績日"},
	                         {field:"expectQty1Style1", displayName:"積付合計数量(ケース)"},
	                         {field:"expectQty1Style2", displayName:"積付合計数量(カートン)"},
	                         {field:"shipToCd", displayName:"受入先CD"},
	                         {field:"shipToSName", displayName:"受入先名称"},
	                         {field:"otherRefNo1", displayName:"輸送形態"},
	                         {field:"palletKey", displayName:"パレット積付キー"},
	                         {field:"clientCd", displayName:"荷主CD"},
	                         {field:"clientNm", displayName:"荷主名称"},
                             {field:"centerCd", displayName:"拠点CD"},
                             {field:"centerNm", displayName:"拠点名称"}
	                         ];

	var oldClient;
	var newRequestTypeList;
	var newStatusList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#initScreen
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 依頼種別リスト変更（同期処理）
			$scope.deferredGetRequestTypeList()
			.then(function(response){
				newRequestTypeList = response.data;

			});
			// ステータスリスト変更（同期処理）
			$scope.deferredGetStatusList()
			.then(function(response){
				newStatusList = response.data;

			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.searchCondition.clientCd) {
				// 選択した荷主で取得済みの依頼種別リストを設定
				setRequestTypeList(newRequestTypeList, true);
				// 選択した荷主で取得済みのステータスリストを設定
				setStatusList(newStatusList, true);
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'ShippingPalleteInfoInquiry',
			columnDefs: 'shippingPalleteListCols'
		});

		$scope.gridOptions.enableRowSelection = true;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#initScreenHttp
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
	 *
	 * @description
	 * 出庫パレット情報照会データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();
		// 新規
		api.ShippingPalleteInfoInquiry.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			$scope.searchCondition = response.data.head; // 在庫受払ヘッダ関連
			$scope.ShippingPalleteInfoInquiry = response.data.body; // 在庫受払リスト関連

			$scope.searchCondition.clientCd = userInfo.clientCd; // 荷主の初期値設定
			$scope.searchCondition.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.searchCondition.shipSchDateFrom = userInfo.systemDt;//処理日(From)
			$scope.searchCondition.shipSchDateTo = userInfo.systemDt;//処理日(To)

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.requestTypeList.length == 1) {
				$scope.searchCondition.requestType = $scope.requestTypeList[0].classCd;
			}

			if ($scope.statusList.length == 1) {
				$scope.searchCondition.status = $scope.statusList[0].classCd;
			}
			
			var clearSelectedFlg = true;
			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

				clearSelectedFlg = false;

			} else if ($scope.screenMode == SCREEN_MODE.Update) {
				$scope.searchCondition.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.shipSchDateFrom = $route.current.params.dataTime;
				$scope.searchCondition.shipSchDateTo = $route.current.params.dataTime;
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
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.objectShippingPalleteInfoInquiry#search
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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

		api.ShippingPalleteInfoInquiry.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#setSearchData
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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
		$scope.ShippingPalleteInfoInquiry = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#getClassForRow
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#excelOutput
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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

		api.ShippingPalleteInfoInquiry.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#changeClient
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#showSupplyCustomer1
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
	 *
	 * @description 受入先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された受入先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer1 = function(){
		var clientCd;
		clientCd = $scope.searchCondition.clientCd;

		var items = {
				// 取引先マスタ
				clientCd: clientCd,
				deliveryCd: $scope.searchCondition.shipToCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.shipToCd = selectedItem.customerCd;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#showSupplyCustomer2
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
	 *
	 * @description 特約店CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された特約店情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer2 = function(){
		var clientCd;
		clientCd = $scope.searchCondition.clientCd;

		var items = {
				// 取引先マスタ
				clientCd: clientCd,
				deliveryCd: $scope.searchCondition.customerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.customerCd = selectedItem.customerCd;
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry#shippingPalleteInfoInquiryDetail
	 * @methodOf oneslogiWms.ShippingPalleteInfoInquiry.object:ShippingPalleteInfoInquiry
	 *
	 * @description
	 * 出庫パレット情報照会(詳細)ボタン押下処理<br>
	 *
	 * 出庫パレット情報照会(詳細)画面に遷移
	 */
	$scope.shippingPalleteInfoInquiryDetail = function() {
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.list = listBody;

		//明細が表示されていない場合
		if($scope.shippingPalleteListCols.length == 0){
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

		// 出庫パレット情報照会(詳細)画面へ遷移
		$location.path("wms/stock/ShippingPalleteInfoInquiryDetail").search({})
		.search("mode", SCREEN_MODE.Read)
		.search("gridData",request.data.list)
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
