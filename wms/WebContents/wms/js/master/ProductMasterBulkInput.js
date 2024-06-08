/**
 * @ngdoc overview
 * @name oneslogiWms.ProductMasterBulkInput
 *
 * @description
 * 商品マスタ一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ProductMasterBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductMasterBulkInput.service:productMasterBulkInputApi
 *
 * @description
 * 商品マスタ一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * shapeCdList 荷姿データ操作用WebApi<br>
 * ・resources/common/shapeCD/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * productMaster 商品マスタ一括取込操作用WebApi<br>
 * ・resources/master/productMasterBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/master/productMasterBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/productMasterBulkInput/productRecordwithShape 単一行データ取得WebAPI<br>
 * ・resources/master/productMasterBulkInput/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/master/productMasterBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/productMasterBulkInput/getMasterData マスタデータ一括取得WebAPI<br>
 * ・resources/master/productMasterBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('productMasterBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma start
		productMasterBulkInput : AngularAPIClient.make(
				[
				 ['initNew',  'GET',  'resources/master/productMasterBulkInput/initNew'],
				 ['fileUpload',  'POST',  'resources/master/productMasterBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/master/productMasterBulkInput/register'],
				 ['search',  'GET',  'resources/master/productMasterBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/master/productMasterBulkInput/checkExistError'],
				 ['excel',  'GET',  'resources/master/productMasterBulkInput/excelOutput',  'excel'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/master/productMasterBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
				 ]
		)
	};
}])
.controller('ProductMasterBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.productMasterBulkInputCols = [
	                                   {field : "lineNo", displayName:"No."},
	                                   {field : "mproduct.productCd", displayName:"商品CD"},
	                                   {field : "mproduct.productNm", displayName:"商品名称"},
	                                   {field : "mproduct.productAbbr", displayName:"商品略称"},
	                                   {field : "mproduct.janCd", displayName:"JANCD"},
	                                   {field : "mproduct.lotManagFlg", displayName:"ロット管理フラグ"},
	                                   // [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu
	                                   {field : "mproduct.limitDtManagFlg", displayName:"期限日管理フラグ"},
	                                   {field : "mproduct.limitDtReverseFlg", displayName:"期限日逆転防止フラグ"},
	                                   {field : "mproduct.receiveLimitNum", displayName:"入荷期限日数"},
	                                   {field : "mproduct.shippingLimitNum", displayName:"出荷期限日数"},
	                                   {field : "mproduct.mergeCls", displayName:"入庫No.マージ区分"},
	                                   {field : "mproduct.shippingStopFlg", displayName:"出荷停止フラグ"},
	                                   {field : "mproduct.fixedPoint", displayName:"定点"},
	                                   // [Ver3.0] unit of measure対応 2017.12.14 NING Start
	                                   {field : "mproduct.mshapeGrp.shapeGrpCd", displayName:"在庫管理単位"},
	                                   {field : "length", displayName:"【在庫最小単位】縦(mm)"},
	                                   {field : "width", displayName:"【在庫最小単位】横(mm)"},
	                                   {field : "height", displayName:"【在庫最小単位】高さ(mm)"},
	                                   {field : "volume", displayName:"【在庫最小単位】容積(mm3)"},
	                                   {field : "netWeight", displayName:"【在庫最小単位】商品重量(g)"},
	                                   {field : "grossWeight", displayName:"【在庫最小単位】総重量(g)"},
	                                   {field : "errorMessageNm", displayName:"エラー内容"}
	                                   // [Ver3.0] unit of measure対応 2017.12.14 NING End
	                                   ];

	var oldClient;
	var newDepositStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#initScreen
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono Start
		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'productMaster',
			columnDefs : 'productMasterBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "productMaster");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#excelOutput
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function() {

		var request = {};
		request.data = {};
		request.data.head = $scope.productMasterH;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "productMaster", document.title);
		api.productMasterBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#search
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * 取込データ検索処理<br>
	 * @description
	 *
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
	var searchClientCd;
	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.productMasterH;
		request.data.receiveCd = $scope.receiveCd;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.productMasterBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'inputform');
			$scope.setSearchData(response);

			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			searchClientCd = request.data.head.mclient.clientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#setSearchData
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.productMaster = response.data.productMaster;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		updateRowNumber($scope.productMaster);

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		for (var row =0; row <$scope.productMaster.length; row++) {
			$scope.productMaster[row].mproduct.lotManagFlg = $scope.productMaster[row].mproduct.lotManagNm;
			// [Ver3.0][#4541] ロット逆転防止フラグの削除 2018.05.11 shimizu
			$scope.productMaster[row].mproduct.limitDtManagFlg = $scope.productMaster[row].mproduct.limitDtManagNm;
			$scope.productMaster[row].mproduct.limitDtReverseFlg = $scope.productMaster[row].mproduct.limitDtReverseNm;
			$scope.productMaster[row].mproduct.mergeCls = $scope.productMaster[row].mproduct.mergeClsNm;
			$scope.productMaster[row].mproduct.shippingStopFlg = $scope.productMaster[row].mproduct.shippingStopNm;
		}
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

	};

	// [ON推-品向-583] 明細　ヘッダー行の選択 2016.03.13 DSW Start
	$scope.findErrorList = function() {
		alertMessage.deleteAll();
		$scope.search();
	}
	// [ON推-品向-583] 明細　ヘッダー行の選択 2016.03.13 DSW End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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
				 $scope.deferredGetLimitDtManagFlg(),
				 $scope.deferredGetLimitDtReverseFlg(),
				 $scope.deferredGetMergeCls(),
				 $scope.deferredGetShippingStopFlg(),
				 $scope.deferredErrorProcessMet()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * エラー処理方法 ドロップダウンリスト取得・設定<br>
	 *
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetLotManagFlg
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.lotManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetLimitDtManagFlg
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.limitDtManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetLimitDtReverseFlg
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.limitDtReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetMergeCls
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.mergeClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetShippingStopFlg
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.shippingStopFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * 商品マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.productMasterBulkInput.initNew().then(function(response) {
			$scope.gridOptions.totalItems = 0;
			$scope.productMasterH = response.data.head; // 商品マスタヘッダ関連
			$scope.productMaster = []; // 商品マスタ一括取込明細関連
			$scope.productMaster = response.data.productMaster; // 商品マスタ一括取込明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			$scope.productMasterH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
			$scope.paging = response.paging;
			$scope.productMasterH.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 ono Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			deferred.resolve();
		});

		return deferred.promise;
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
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		//荷主センタ変更対応 2017.02.28 sja Start
//		$scope.fileOptions.url = "resources/master/productMasterBulkInput/fileUpload?clientCd=" + userInfo.clientCd + "&chkErrorShow=" + $scope.productMasterH.chkErrorShow + "&errorProcessMet=" + $scope.productMasterH.errorProcessMet;
		$scope.fileOptions.url = "resources/master/productMasterBulkInput/fileUpload?clientCd=" + $scope.productMasterH.mclient.clientCd + "&chkErrorShow=" + $scope.productMasterH.chkErrorShow + "&errorProcessMet=" + $scope.productMasterH.errorProcessMet;
		//荷主センタ変更対応 2017.02.28 sja End
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.excelUploadSuccess = function(e, response) {

		$scope.productMasterH = response.result.data.head;

		$scope.paging = response.result.paging;

		// 処理前にグリッドをクリアする。
		$scope.productMaster = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}
			$scope.search();
		},3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput#register
	 * @methodOf oneslogiWms.ProductMasterBulkInput.object:ProductMasterBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {
			var checkExistErrorFunc;	// エラー存在チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			var checkMasterFunc; // 関連マスタチェック関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			// 新規登録関数を設定
			checkExistErrorFunc = api.productMasterBulkInput.checkExistError;
			execFunc = api.productMasterBulkInput.register;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			checkMasterFunc = api.productMasterBulkInput.checkErrorMaster;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			successFunc = function(execResponse) {
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.productMasterH;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			request.data.head.mclient.clientCd = searchClientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
			request.data.receiveCd = $scope.receiveCd;

			// エラー処理方法の選択が無い場合
			if ($scope.productMasterH.errorProcessMet == null) {
				return;
			// 0:全て取込まない
			} else if ($scope.productMasterH.errorProcessMet == '0') {
				// エラーフラグが「1」のデータを抽出する。
				checkExistErrorFunc(request).then(function(checkExistErrorResponse) {
					// エラーデータがある
					if (!statusInfo.isSuccessAndShowMessage(checkExistErrorResponse, 'inputform')) {
						return;
					}

					// 登録確認
					if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
						$scope.search();
						return;
					}

					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
					// 登録時の関係マスタチェック
					checkMasterFunc(request).then(function(checkMasterResponse) {
						// 登録時の関係マスタチェックエラー件数を設定
						request.data.errorCount = checkMasterResponse.data.errorCount;

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 登録時の関係マスタチェックエラー存在の場合
						if (checkMasterResponse.data.errorCount > 0) {
							// エラーメッセージの設定(ResourceでgetErrorManagerに設定するとエラーデータのDB更新が出来ないため、JSで設定)
							alertMessage.setErrorMessageByCode("errorDataFoundError");
							// 検索処理
							$scope.search();
							return;
						}

						// 商品マスタデータ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								// 検索処理
								$scope.search();
								return;
							}

							// 完了後の処理
							successFunc(execResponse);
							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
						});
					});
					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
				});
			// 1:エラー以外を取り込む
			} else if ($scope.productMasterH.errorProcessMet == '1') {
				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					$scope.search();
					return;
				}

				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
				// 登録時の関係マスタチェック
				checkMasterFunc(request).then(function(checkMasterResponse) {
					// 登録時の関係マスタチェックエラー件数を設定
					request.data.errorCount = checkMasterResponse.data.errorCount;

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
						$scope.search();
						return;
					}

					// 商品マスタデータ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
					});
				});
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
			}
		});
	};

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.09 honma end

	// 画面初期化処理を実行
	$scope.initScreen();
}]);