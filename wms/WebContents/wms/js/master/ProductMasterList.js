/**
 * @ngdoc overview
 * @name oneslogiWms.ProductList
 *
 * @description
 * 商品マスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.ProductMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductList.service:productListApi
 *
 * @description
 * 商品マスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/productMasterList/init 初期化用WebApi<br>
 * ・resources/master/productMasterList/search 検索用WebApi<br>
 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 Start
 * ・resources/master/productMasterList/print 商品ラベル発行WebAPI<br>
 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 End
 *
 */
.factory('productMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		productList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/productMasterList/init'],
				 ['search', 'GET', 'resources/master/productMasterList/search'],
				 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 Start
                 ['print',  'GET', 'resources/master/productMasterList/print'],
                 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/03 End
				 ['excel',  'GET', 'resources/master/productMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductList.object:ProductList
 *
 * @description
 * 商品マスタメンテナンス(一覧)画面コントローラ
 */
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
//.controller('ProductMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
.controller('ProductMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'productMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End

	//グリッドの列情報（デザイン用）
	$scope.productListCols =
		[
		 {field:"productCd", displayName:"商品CD"},
		 {field:"productNm", displayName:"商品名称"},
		 {field:"productAbbr", displayName:"商品略称"},
		// [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
		 {field:"janCd", displayName:"JANCD"},
		// [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
		 {field:"unitNum", displayName:"ケース入数"},
		 {field:"lotManagFlg", displayName:"ロット管理フラグCD"},
		 {field:"bclassDtlByLotManagFlg.vdict.dictNm", displayName:"ロット管理フラグ名称"},
		 {field:"lotReverseFlg", displayName:"ロット逆転防止フラグCD"},
		 {field:"bclassDtlByLotReverseFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		 {field:"limitDtManagFlg", displayName:"期限日管理フラグCD"},
		 {field:"bclassDtlByLimitDtManagFlg.vdict.dictNm", displayName:"期限日管理フラグ名称"},
		 {field:"limitDtReverseFlg", displayName:"期限日逆転防止フラグCD"},
		 {field:"bclassDtlByLimitDtReverseFlg.vdict.dictNm", displayName:"期限日逆転防止フラグ名称"},
		 {field:"receiveLimitNum", displayName:"入荷期限日数"},
		 {field:"shippingLimitNum", displayName:"出荷期限日数"},
		 {field:"mergeCls", displayName:"入庫No.マージ区分CD"},
		 {field:"bclassDtlByMergeCls.vdict.dictNm", displayName:"入庫No.マージ区分名称"},
		 //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
		 {field:"freightCls", displayName:"Freight Class"},
		 {field:"bclassDtlByFreightCls.vdict.dictNm", displayName:"Freight Class名称"},
		 //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End
		 {field:"shippingStopFlg", displayName:"出荷停止フラグCD"},
		 {field:"bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"出荷停止フラグ名称"},
		 {field:"fixedPoint", displayName:"定点"},
		 {field:"addDt", displayName:"登録日付"},
		 // [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		 {field:"updDt", displayName:"修正日付"},
	     {field:"delFlg", displayName:"削除フラグCD"},
	     {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"},
		 // [横並-006] 削除フラグを追加 2014.11.26 taoys End
		 //荷主センタ変更対応 201７.02.07 sja Start
		 {field:"mclient.clientCd", displayName:"荷主CD"},
		 {field:"mclient.clientNm", displayName:"荷主名称"}
		 //荷主センタ変更対応 201７.02.07 sja End
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#initScreen
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End




		// グリッドの設定
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		//$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
			data: 'productList',
			columnDefs: 'productListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.gridSelectOptions = {
				"lotManagFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "lotManagFlgList"
				},
				"lotReverseFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "lotReverseFlgList"
				},
				"limitDtManagFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "limitDtManagFlgList"
				},
				"limitDtReverseFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "limitDtReverseFlgList"
				},
				"mergeCls" : {
					key : "classCd",
					value : "classNm",
					listModel : "mergeClsList"
				},
			    //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
				"freightCls" : {
					key : "classCd",
					value : "classNm",
					listModel : "freightClsList"
				},
			    //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End
				"shippingStopFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "shippingStopFlgList"
				}
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#initScreenHttp
	 * @methodOf oneslogiWms.ProductList.object:ProductList
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
				 $scope.deferredGetLotManagFlg(),
				 $scope.deferredGetLotReverseFlg(),
				 $scope.deferredGetLimitDtManagFlg(),
				 $scope.deferredGetLimitDtReverseFlg(),
				 $scope.deferredGetMergeCls(),
				//  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
				 $scope.deferredGetfreightCls(),
				//  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetShippingStopFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetDelFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLotManagFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * ロット管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLotReverseFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * ロット逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotReverseFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLimitDtManagFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 期限日管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetLimitDtReverseFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 期限日逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtReverseFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetMergeCls
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 入庫No.マージ区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMergeCls = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "MERGE_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.mergeClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	//  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetfreightCls
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * Freight Class取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetfreightCls = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "FREIGHT_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.freightClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
    //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetShippingStopFlg
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 出荷停止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStopFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_STOP_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.shippingStopFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#deferredGetInitData
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 商品マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.productList.init().then(function(response){
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
			$scope.printParam = response.data.reportData.printBasicData;
			$scope.productMasterLabelPrintDto = response.data.reportData;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End
			$scope.head = response.data.head;
			$scope.productList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#excelOutput
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.productList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterList.object:ProductMasterList#gridDblClick
	 * @methodOf oneslogiWms.ProductMasterList.object:ProductMasterList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#search
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索処理<br>
	 * ・商品マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.productList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#setPagingData
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {

		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-347] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-347] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.productList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#getClassForRow
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#update
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
				return;
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		//荷主センタ変更対応 2017.01.27 sja Start
//		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId);
		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
		.search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId)
		.search("clientId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientId);
		//荷主センタ変更対応 2017.01.27 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// コピー機能追加 商品マスタ画面修正 2016.06.24 Linn Linn Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterList.object:ProductMasterList#copy
	 * @methodOf oneslogiWms.ProductMasterList.object:ProductMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されたデータの情報を新規編集画面に設定し、表示する。
	 */
	$scope.copy = function() {
		//[#6873]複数行選択している場合はエラー処理 2019.11.25 ono start
		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
				return;
		}
		//[#6873]複数行選択している場合はエラー処理 2019.11.25 ono End

		//修正画面へ遷移
		//荷主センタ変更対応 2017.03.01 sja Start
		//$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId);
		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Copy)
		.search("productId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId)
		.search("clientId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientId);
		//荷主センタ変更対応 2017.03.01 sja End

	};
	// コピー機能追加 商品マスタ画面修正 2016.06.24 Linn Linn Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#register
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 商品新規する為の画面を表示する。
	 */
	$scope.register = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/ProductMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#productLabel
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 商品ラベル押下処理<br>
	 *
	 * 商品ラベルを押下された時に処理、商品ラベル発行データをチェックを行う
	 */
	$scope.print = function() {
		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		// 削除済が選択されている場合
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg == "1") {
//			alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
//			return;
//		}
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg == "1") {
				alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
				return;
			}
		}
		// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
	   // 画面初期化
		var items = {
			labelOutputCnt: 1
		};
		var modalInstance = modalFactory.modalInstListNumInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
		    // プリンタ選択画面を表示
			modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request = angular.copy($scope.productMasterLabelPrintDto);
				request.data.search.productId = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].productId;
				request.data.search.clientId = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientId;
				// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 Start
				request.data.searchList = $scope.gridOptions.gridApi.selection.getSelectedRows();
				// [ON推-UT210-008] 複数商品選択し、商品ラベル出力する sja 2016.07.07 End
				request.data.center.centerId = userInfo.centerId;
				request.data.labelOutputCnt = selectedItem.labelOutputCnt;
				request.printBasicData = printParam.printBasicData;

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.productList.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}

					//帳票発行後に再検索する
					$scope.search();
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});
		});
	};
	//[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/12 End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
