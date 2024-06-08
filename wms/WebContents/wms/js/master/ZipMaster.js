/**
 * @ngdoc overview
 * @name oneslogiWms.ZipMaster
 *
 * @description
 * 郵便番号マスタメンテナンス画面
 */
angular.module('oneslogiWms.ZipMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ZipMaster.service:zipMasterApi
 *
 * @description
 * 郵便番号マスタメンテナンスWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/zipMaster/init 初期化用WebApi<br>
 * ・resources/master/zipMaster/search 検索用WebApi<br>
 * ・resources/master/zipMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/zipMaster/register 登録用WebApi<br>
 *
 */
.factory('zipMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		zipList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/zipMaster/init'],
				 ['search', 'GET', 'resources/master/zipMaster/search'],
				 ['excel',  'GET', 'resources/master/zipMaster/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/zipMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/zipMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ZipMaster.object:ZipMaster
 *
 * @description
 * 郵便番号マスタメンテナンス画面コントローラ
 */
.controller('ZipMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'zipMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.zipListCols =
		[
		 {field:"zipCd", displayName:"郵便番号"},
		 {field:"publicCd", displayName:"全国地方公共団体コード"},
		 {field:"zipCd5", displayName:"旧郵便番号"},
		 {field:"addressKn1", displayName:"都道府県カナ"},
		 {field:"addressKn2", displayName:"市区町村カナ"},
		 {field:"addressKn3", displayName:"町域カナ"},
		 {field:"companyKn", displayName:"大口事業所名カナ"},
		 {field:"address1", displayName:"都道府県"},
		 {field:"address2", displayName:"市区町村"},
		 {field:"address3", displayName:"町域"},
		 {field:"address4", displayName:"小字"},
		 {field:"companyNm", displayName:"大口事業所名"},
		 {field:"flg1", displayName:"フラグ１"},
		 {field:"flg2", displayName:"フラグ２"},
		 {field:"flg3", displayName:"フラグ３"},
		 {field:"flg4", displayName:"フラグ４"},
		 {field:"updType", displayName:"更新区分"},
		 {field:"reasonType", displayName:"変更理由"},
		 {field:"handlingAddress", displayName:"取扱局"},
		 {field:"flg5", displayName:"フラグ５"},
		 {field:"flg6", displayName:"フラグ６"},
		 {field:"updCd", displayName:"修正コード"},
		 {field:"companyFlg", displayName:"大口事業所フラグ"},
		 {field:"delFlg", displayName:"削除"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#initScreen
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 2016.02.23 Zhang 一覧編集 ※4 Start
		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		// $scope.gridOptions = owsCommon.mergeEntryGridOptions({
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'zipList',
			columnDefs: 'zipListCols',
			pagingOptions : $scope.pagingOptions
		});
		// 2016.02.23 Zhang 一覧編集 ※4 End

		// 2016.02.23 Zhang 一覧編集 ※4 Start
//		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
//		//[ON推-品向-297]明細の削除と大口事業所ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
//		$scope.gridSelectOptions = {
//				"delFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "delFlgList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana Start
//					removeBlank: "null"
//					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana End
//				},
//				"flg1" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flgList"
//				},
//				"flg2" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flgList"
//				},
//				"flg3" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flgList"
//				},
//				"flg4" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flgList"
//				},
//				"updType" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "updTypeList"
//				},
//				"reasonType" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "reasonTypeList"
//				},
//				"flg5" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flg5List"
//				},
//				"flg6" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "flg6List"
//				},
//				"updCd" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "updCdList"
//				},
//				"companyFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "companyFlgList",
//					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
//				}
//		};
//		//[ON推-品向-297]明細の削除と大口事業所ドロップダウンリストにスペースは不要 2014.11.28 衛 End
//		// グリッドの運送業者名称列にロストフォーカスイベントを設定
//		$scope.gridEventOptions = {
//				"zipCd":{
//					"ng-change":{
//						eventFunction:"zipCdNmBlur(row.rowIndex)"
//					}
//				},
//				"publicCd":{
//					"ng-change":{
//						eventFunction:"publicCdBlur(row.rowIndex)"
//					}
//				},
//				"zipCd5":{
//					"ng-change":{
//						eventFunction:"zipCd5Blur(row.rowIndex)"
//					}
//				},
//				"addressKn1":{
//					"ng-change":{
//						eventFunction:"addressKn1Blur(row.rowIndex)"
//					}
//				},
//				"addressKn2":{
//					"ng-change":{
//						eventFunction:"addressKn2Blur(row.rowIndex)"
//					}
//				},
//				"addressKn3":{
//					"ng-change":{
//						eventFunction:"addressKn3Blur(row.rowIndex)"
//					}
//				},
//				"companyKn":{
//					"ng-change":{
//						eventFunction:"companyKnBlur(row.rowIndex)"
//					}
//				},
//				"address1":{
//					"ng-change":{
//						eventFunction:"address1Blur(row.rowIndex)"
//					}
//				},
//				"address2":{
//					"ng-change":{
//						eventFunction:"address2Blur(row.rowIndex)"
//					}
//				},
//				"address3":{
//					"ng-change":{
//						eventFunction:"address3Blur(row.rowIndex)"
//					}
//				},
//				"address4":{
//					"ng-change":{
//						eventFunction:"address4Blur(row.rowIndex)"
//					}
//				},
//				"companyNm":{
//					"ng-change":{
//						eventFunction:"companyNmBlur(row.rowIndex)"
//					}
//				},
//				"flg1":{
//					"ng-change":{
//						eventFunction:"flg1Blur(row.rowIndex)"
//					}
//				},
//				"flg2":{
//					"ng-change":{
//						eventFunction:"flg2Blur(row.rowIndex)"
//					}
//				},
//				"flg3":{
//					"ng-change":{
//						eventFunction:"flg3Blur(row.rowIndex)"
//					}
//				},
//				"flg4":{
//					"ng-change":{
//						eventFunction:"flg4Blur(row.rowIndex)"
//					}
//				},
//				"updType":{
//					"ng-change":{
//						eventFunction:"updTypeBlur(row.rowIndex)"
//					}
//				},
//				"reasonType":{
//					"ng-change":{
//						eventFunction:"reasonTypeBlur(row.rowIndex)"
//					}
//				},
//				"handlingAddress":{
//					"ng-change":{
//						eventFunction:"handlingAddressBlur(row.rowIndex)"
//					}
//				},
//				"flg5":{
//					"ng-change":{
//						eventFunction:"flg5Blur(row.rowIndex)"
//					}
//				},
//				"flg6":{
//					"ng-change":{
//						eventFunction:"flg6Blur(row.rowIndex)"
//					}
//				},
//				"updCd":{
//					"ng-change":{
//						eventFunction:"updCdBlur(row.rowIndex)"
//					}
//				},
//				"companyFlg":{
//					"ng-change":{
//						eventFunction:"companyFlgBlur(row.rowIndex)"
//					}
//				},
//				"delFlg":{
//					"ng-change":{
//						eventFunction:"delFlgBlur(row.rowIndex)"
//					}
//				}
//		};
		// 2016.02.23 Zhang 一覧編集 ※4 End
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "zipCd",6, 2);


		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#initScreenHttp
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg()
				 // 2016.02.23 Zhang 一覧編集 ※4 Start
//				 $scope.deferredGetDelFlg(),
//				 $scope.deferredGetFlg(),
//				 $scope.deferredGetUpdType(),
//				 $scope.deferredGetReasonType(),
//				 $scope.deferredGetCodeType(),
//				 $scope.deferredGetCodeFlg(),
//				 $scope.deferredGetUpdCd(),
//				 $scope.deferredGetCompanyFlg()
				 // 2016.02.23 Zhang 一覧編集 ※4 End
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	// 2016.02.23 Zhang 一覧編集 ※4 Start
//	$scope.zipCdNmBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.publicCdBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.zipCd5Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.addressKn1Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.addressKn2Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.addressKn3Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.companyKnBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.address1Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.address2Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.address3Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.address4Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.companyNmBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg1Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg2Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg3Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg4Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.updTypeBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.reasonTypeBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.handlingAddressBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg5Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.flg6Blur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.updCdBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.companyFlgBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
//$scope.delFlgBlur = function(rowIndex) {
//	$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//};
	// 2016.02.23 Zhang 一覧編集 ※4 End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
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

	// 2016.02.23 Zhang 一覧編集 ※4 Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetFlg
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "ZIP_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.flgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetUpdType
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetUpdType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "UPD_TYPE";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.updTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetReasonType
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetReasonType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "REASON_TYPE";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.reasonTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCodeType
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCodeType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "CODE_TYPE";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.flg5List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCodeFlg
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCodeFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "CODE_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.flg6List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetUpdCd
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetUpdCd = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "UPD_CD";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.updCdList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCompanyFlg
//	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCompanyFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "COMPANY_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.companyFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
	// 2016.02.23 Zhang 一覧編集 ※4 End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetInitData
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 倉庫マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.zipList.init().then(function(response){
			$scope.mZipSearch = response.data.head;

			$scope.zipList = response.data.body;

			// 2016.02.23 Zhang 一覧編集 ※4 Start
			$scope.paging = response.paging;
			// 2016.02.23 Zhang 一覧編集 ※4 End

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.mZipSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 2016.02.23 Zhang 一覧編集 ※4 Start
			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// 2016.02.23 Zhang 一覧編集 ※4 End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.mZipSearch = owsHistory.popState();
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
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#search
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
//		$scope.getSearchData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.mZipSearch;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.zipList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster##setPagingData
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.zipList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#getSearchData
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.mZipSearch;

		api.zipList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#setSearchData
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-348] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-348] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.zipList = response.data.body;

		// 2016.02.23 Zhang 一覧編集 ※4 Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//		//既存行のキー項目が変更不可
//		for (var row = 0; row < $scope.zipList.length; row++) {
//			if ($scope.zipList[row].zipId != null){
//				gridDirectiveControl.editable($scope.gridOptions, 'zipCd', false, row);
//			}
//		}
		// 2016.02.23 Zhang 一覧編集 ※4 End

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.mZipSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#excelOutput
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.mZipSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.zipList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#getClassForRow
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#addRow
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.zipList.push(angular.copy($scope.blankRow));
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.zipList.length-1);
		// 行番号振り直し
		updateRowNumber($scope.zipList);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#removeRow
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.zipList.indexOf(row) > -1) {
				if (row.zipId != null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}
		// [横並-053] チェック順変更 2014.11.21 taoys Start
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].zipCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].zipCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].publicCd != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].publicCd != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].zipCd5 != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].zipCd5 != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn1 !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn1!= null)
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn2 !=""
								&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn2!= null)
								||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn3 !=""
									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].addressKn3!= null)
									||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].companyKn !=""
										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].companyKn!= null)
										||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].address1 !=""
											&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].address1!= null)
											||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].address2 != ""
												&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].address2 != null)
												||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].address3 != ""
													&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].address3 != null)
													||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].address4 !=""
														&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].address4!= null)
														||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].companyNm !=""
															&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].companyNm!= null)
															||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg1 !=""
																&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg1!= null)
																||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg2 !=""
																	&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg2!= null)
																	||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg3 !=""
																		&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg3!= null)
																		||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg4 != ""
																			&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg4 != null)
																			||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].updType != ""
																				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].updType != null)
																				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].reasonType !=""
																					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].reasonType!= null)
																					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].handlingAddress !=""
																						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].handlingAddress!= null)
																						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].flg5 !=""
																							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].flg5!= null)
																							||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].flg6 !=""
																								&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].flg6!= null)
																								||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].updCd !=""
																									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].updCd!= null)
																									||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].companyFlg !=""
																										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].companyFlg!= null)
																										||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				item++;
			}
		}
		// 複数行の場合に警告
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1){
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
	    // [横並-053] チェック順変更 2014.11.21 taoys End


		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.zipList.indexOf(row) > -1) {
				$scope.zipList.splice($scope.zipList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.zipList);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#register
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];

//		del  by  qiuy 2014/08/19 start
		// 空行判定
//		for (var row = 0; row < $scope.zipList.length; row++) {
//		if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, row);
//		// 空行を退避
//		emptyBody.push($scope.zipList[row]);
//		} else {
//		// 空行以外を退避
//		listBody.push($scope.zipList[row]);
//		}
//		}
//		del  by  qiuy 2014/08/19 end

		//add  by  qiuy 2015/08/19 start
		if($scope.zipList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.zipList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
				// 空行を退避
				emptyBody.push($scope.zipList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.zipList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.zipList[row]);
			}
		}
		//add  by  qiuy 2015/08/19 end

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.zipList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}
				// 確認表示
				if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
					return;
				}

	//			// 郵便番号CD重複チェック
	//			var j = 0;
	//			var rowIndex = new Array();
	//			var errAry = new Array();
	//			mod  by  qiuy 2014/08/19 start
	//			for (var row = 0; row < $scope.zipList.length; row++) {
	//			var zipCd = $scope.zipList[row].zipCd;
	//			for (var i = row+1; i < $scope.zipList.length; i++) {
	//			if ($scope.zipList[i].zipCd == zipCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "alreadyRegisteredCannotRegisterError";
	//			j++;
	//			}
	//			}
	//			}

	//			var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
	//			for (var row = 0; row < $scope.zipList.length; row++) {
	//			if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
	//			var zipCd = $scope.zipList[row].zipCd;
	//			for (var i = row+1; i < $scope.zipList.length; i++) {
	//			if ($scope.zipList[i].zipCd == zipCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "alreadyRegisteredCannotRegisterError";
	//			j++;
	//			}
	//			}
	//			}
	//			}
	//			mod  by  qiuy 2014/08/19 end
	//			if (j > 0){
	//			for(row = 0; row < rowIndex.length; row++){
	//			if (!gridOptionMessageControl.isShow($scope.gridOptions, "zipCd", rowIndex[row])) {
	//			gridOptionMessageControl.show($scope.gridOptions, "zipCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
	//			}
	//			}
	//			return;
	//			}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.zipList.splice($scope.zipList.indexOf(row), 1);
				});

				// 行番号振り直し
				updateRowNumber($scope.zipList);

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = listBody;
				request.data.head = $scope.mZipSearch;

	//			// 入力チェック
	//			api.zipList.inputCheck(request).then(function(response){

	//			// 処理結果確認
	//			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
	//			return;
	//			}

				// 郵便番号マスタデータ登録または更新
				api.zipList.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 初期化
					$scope.initScreenHttp();

					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
					owsCommon.toggleSelectAll($scope.gridOptions, false);
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
				});
	//			});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

	};

	// 2016.02.23 Zhang 一覧編集 ※4 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#gridDblClick
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
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
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 郵便マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.initNew = function(){
		// 郵便マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/ZipMasterEdit").search({}).search("mode", SCREEN_MODE.Register);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 郵便マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.update = function(){
		// 郵便マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/ZipMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("zipCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].zipCd);
	};
	// 2016.02.23 Zhang 一覧編集 ※4 End

	//画面初期化処理を実行
	$scope.initScreen();

}]);
