/**
 * @ngdoc overview
 * @name oneslogiWms.ZipMasterBulkInput
 *
 * @description
 * 郵便番号マスタ一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ZipMasterBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ZipMasterBulkInput.service:zipMasterBulkInputApi
 *
 * @description
 * 郵便番号マスタ一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * zipMasterBulkInputList 郵便番号マスタ一括取込操作用WebApi<br>
 * ・resources/master/zipMasterBulkInput/init 初期処理WebAPI<br>
 * ・resources/master/zipMasterBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/zipMasterBulkInput/productRecordwithShape 単一行データ取得WebAPI<br>
 * ・resources/master/zipMasterBulkInput/inputCheck 入力チェック（登録）WebAPI<br>
 * ・resources/master/zipMasterBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/zipMasterBulkInput/getMasterData マスタデータ一括取得WebAPI<br>
 * ・resources/master/zipMasterBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('zipMasterBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),
		uploadZipTypeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),
		zipMasterBulkInput : AngularAPIClient.make(
				[
				 ['init',  'GET',  'resources/master/zipMasterBulkInput/init'],
				 ['fileUpload',  'POST',  'resources/master/zipMasterBulkInput/fileUpload'],
				 ['checkError',  'GET',  'resources/master/zipMasterBulkInput/checkError'],
				 ['register', 'POST', 'resources/master/zipMasterBulkInput/register'],
				 ['findErrorList',  'GET',  'resources/master/zipMasterBulkInput/findErrorList'],
				 ['search',  'GET',  'resources/master/zipMasterBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/master/zipMasterBulkInput/checkExistError'],
				 ['excel',  'GET',  'resources/master/zipMasterBulkInput/excelOutput',  'excel'],
				 ['checkErrorMaster',  'POST',  'resources/master/zipMasterBulkInput/checkErrorMaster']
				]
		)
	};
}])
.controller('ZipMasterBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'zipMasterBulkInputApi', function($scope, $route, $filter, $zip, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）（住所）
	$scope.zipMasterBulkInputKenListCols = [
		{field : "lineNo", displayName:"No.", inColIndex:"1"}
	];

	// グリッドの列情報（デザイン用）（事業所）
	$scope.zipMasterBulkInputOfficeListCols = [
		{field : "lineNo", displayName:"No.", inColIndex:"1"}
	];

	var oldClient;
	var newDepositStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#initScreen
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start

		//ページングの設定(住所)
		$scope.zipMasterBulkInputKenListPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.zipMasterBulkInputKenListPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.zipMasterBulkInputKenListGridOptions.paginationPageSize, $scope.zipMasterBulkInputKenListGridOptions.paginationCurrentPage);
		};
		$scope.zipMasterBulkInputKenListPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.zipMasterBulkInputKenListGridOptions.paginationPageSize;
			$scope.zipMasterBulkInputOfficeListGridOptions.paginationPageSize = pageSize;
			// 検索
			$scope.getPagedDataAsync($scope.zipMasterBulkInputKenListGridOptions.paginationPageSize, $scope.zipMasterBulkInputKenListGridOptions.paginationCurrentPage);
		};

		//ページングの設定(事務所)
		$scope.zipMasterBulkInputOfficeListPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.zipMasterBulkInputOfficeListPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.zipMasterBulkInputOfficeListGridOptions.paginationPageSize, $scope.zipMasterBulkInputOfficeListGridOptions.paginationCurrentPage);
		};
		$scope.zipMasterBulkInputOfficeListPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.zipMasterBulkInputOfficeListGridOptions.paginationPageSize;
			$scope.zipMasterBulkInputKenListGridOptions.paginationPageSize = pageSize;
			// 検索
			$scope.getPagedDataAsync($scope.zipMasterBulkInputOfficeListGridOptions.paginationPageSize, $scope.zipMasterBulkInputOfficeListGridOptions.paginationCurrentPage);
		};

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End

		// グリッドの設定(住所)
		$scope.zipMasterBulkInputKenListGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'zipMasterBulkInputKenList',
			columnDefs : 'zipMasterBulkInputKenListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.zipMasterBulkInputKenListPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		// グリッドの設定(事業所)
		$scope.zipMasterBulkInputOfficeListGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'zipMasterBulkInputOfficeList',
			columnDefs : 'zipMasterBulkInputOfficeListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.zipMasterBulkInputOfficeListPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});


		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.zipMasterBulkInputKenListGridOptions, "body");

		$scope.fileOptions = {
			acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
			formData : uploadParam
		};

		$scope.viewGridZipMasterBulkInputKen = true;
		$scope.viewGridZipMasterBulkInputOffice = false;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#excelOutput
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function(){
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		if ($scope.head.uploadZipType == "0") {
			owsCommon.setOutputOptions(request, $scope.zipMasterBulkInputKenListGridOptions, "body", document.title);
		} else {
			owsCommon.setOutputOptions(request, $scope.zipMasterBulkInputOfficeListGridOptions, "body", document.title);
		}
		api.zipMasterBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#search
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * 取込データ検索処理<br>
	 * @description
	 *
	 */
	$scope.search = function(){
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
		owsCommon.clearPagingOptions($scope.zipMasterBulkInputKenListGridOptions);
		owsCommon.clearPagingOptions($scope.zipMasterBulkInputOfficeListGridOptions);
		var gridOptions = getVisibleGridOptions();
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		$scope.getPagedDataAsync(gridOptions.paginationPageSize, gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.receiveCd = $scope.receiveCd;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.zipMasterBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#setSearchData
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		if ($scope.head.uploadZipType == "0") {
			$scope.zipMasterBulkInputKenListGridOptions.gridViewport.scrollTop(0);
			$scope.zipMasterBulkInputKenList = response.data.body;
			$scope.zipMasterBulkInputKenListGridOptions.totalItems = response.paging.allRecordCount;
		} else {
			$scope.zipMasterBulkInputOfficeListGridOptions.gridViewport.scrollTop(0);
			$scope.zipMasterBulkInputOfficeList = response.data.body;
			$scope.zipMasterBulkInputOfficeListGridOptions.totalItems = response.paging.allRecordCount;
		}

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		if ($scope.head.uploadZipType == "0") {
			for (var row = 0 ;row < $scope.zipMasterBulkInputKenList.length; row++) {
				$scope.zipMasterBulkInputKenList[row].flg1=$scope.zipMasterBulkInputKenList[row].flg1Nm;
				$scope.zipMasterBulkInputKenList[row].flg2=$scope.zipMasterBulkInputKenList[row].flg2Nm;
				$scope.zipMasterBulkInputKenList[row].flg3=$scope.zipMasterBulkInputKenList[row].flg3Nm;
				$scope.zipMasterBulkInputKenList[row].flg4=$scope.zipMasterBulkInputKenList[row].flg4Nm;
				$scope.zipMasterBulkInputKenList[row].updType=$scope.zipMasterBulkInputKenList[row].updTypeNm;
				$scope.zipMasterBulkInputKenList[row].reasonType=$scope.zipMasterBulkInputKenList[row].reasonTypeNm;
				$scope.zipMasterBulkInputKenList[row].flg5=$scope.zipMasterBulkInputKenList[row].flg5Nm;
				$scope.zipMasterBulkInputKenList[row].flg6=$scope.zipMasterBulkInputKenList[row].flg6Nm;
				$scope.zipMasterBulkInputKenList[row].updCd=$scope.zipMasterBulkInputKenList[row].updCdNm;
				$scope.zipMasterBulkInputKenList[row].companyFlg=$scope.zipMasterBulkInputKenList[row].companyFlgNm;
			}
		} else {
			for (var row = 0 ;row < $scope.zipMasterBulkInputOfficeList.length; row++) {
				$scope.zipMasterBulkInputOfficeList[row].flg1=$scope.zipMasterBulkInputOfficeList[row].flg1Nm;
				$scope.zipMasterBulkInputOfficeList[row].flg2=$scope.zipMasterBulkInputOfficeList[row].flg2Nm;
				$scope.zipMasterBulkInputOfficeList[row].flg3=$scope.zipMasterBulkInputOfficeList[row].flg3Nm;
				$scope.zipMasterBulkInputOfficeList[row].flg4=$scope.zipMasterBulkInputOfficeList[row].flg4Nm;
				$scope.zipMasterBulkInputOfficeList[row].updType=$scope.zipMasterBulkInputOfficeList[row].updTypeNm;
				$scope.zipMasterBulkInputOfficeList[row].reasonType=$scope.zipMasterBulkInputOfficeList[row].reasonTypeNm;
				$scope.zipMasterBulkInputOfficeList[row].flg5=$scope.zipMasterBulkInputOfficeList[row].flg5Nm;
				$scope.zipMasterBulkInputOfficeList[row].flg6=$scope.zipMasterBulkInputOfficeList[row].flg6Nm;
				$scope.zipMasterBulkInputOfficeList[row].updCd=$scope.zipMasterBulkInputOfficeList[row].updCdNm;
				$scope.zipMasterBulkInputOfficeList[row].companyFlg=$scope.zipMasterBulkInputOfficeList[row].companyFlgNm;
			}
		}
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

		owsHistory.replaceState($scope.zipMasterBulkInputKenList);
	};

	$scope.findErrorList = function(){
		$scope.search();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {
		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all([
			 $scope.deferredErrorProcessMet(),
			 $scope.deferredUploadZipType()
		 ])
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * エラー処理方法 ドロップダウンリスト取得・設定<br>
	 *
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		api.dropdownList.query(request).then(function(response){
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * エラー処理方法 取込種別リスト取得・設定<br>
	 *
	 */
	$scope.deferredUploadZipType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UPLOAD_ZIP_TYPE";

		api.uploadZipTypeList.query(request).then(function(response){
			$scope.uploadZipTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 郵便番号マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.zipMasterBulkInput.init().then(function(response){

			$scope.head = response.data.head;
			$scope.zipMasterBulkInputKenList = response.data.body;
			$scope.head.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);
			$scope.head.uploadZipType = owsCommon.getDefaultValue($scope.uploadZipTypeList);
			$scope.paging = response.paging;

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 kawana Delete

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

	// 取込み種別を変更した時
	$scope.importTypeChange = function(){
		$scope.zipMasterBulkInputKenList = [];
		$scope.zipMasterBulkInputOfficeList = [];
		$scope.zipMasterBulkInputKenListGridOptions.totalItems = 0;
		$scope.zipMasterBulkInputOfficeListGridOptions.totalItems = 0;
		$scope.receiveCd = null;
		// [#6863][OSS] 郵便番号種別変更時のコンソールエラーを修正 2019.11.26 tsuboi Start
		owsCommon.clearPagingOptions($scope.zipMasterBulkInputKenListGridOptions);
		owsCommon.clearPagingOptions($scope.zipMasterBulkInputOfficeListGridOptions);
		// [#6863][OSS] 郵便番号種別変更時のコンソールエラーを修正 2019.11.26 tsuboi End
		if ($scope.head.uploadZipType == "0") {
			$scope.viewGridZipMasterBulkInputKen = true;
			$scope.viewGridZipMasterBulkInputOffice = false;
		} else {
			$scope.viewGridZipMasterBulkInputKen = false;
			$scope.viewGridZipMasterBulkInputOffice = true;
		}
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka start
		$scope.dataCount = 0;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka end
	}

	var getVisibleGridOptions = function() {
		if ($scope.head.uploadZipType == "0") {
			return $scope.zipMasterBulkInputKenListGridOptions;
		} else {
			return $scope.zipMasterBulkInputOfficeListGridOptions;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.maxFileSize = 20971520;
		if ($scope.head.uploadZipType == "0") {
			$scope.fileOptions.formData = owsCommon.getInputOptions($scope.zipMasterBulkInputKenListGridOptions, "body");
		} else {
			$scope.fileOptions.formData = owsCommon.getInputOptions($scope.zipMasterBulkInputOfficeListGridOptions, "body");
		}

		$scope.fileOptions.url = "resources/master/zipMasterBulkInput/fileUpload?="   + "&chkErrorShow=" + $scope.head.chkErrorShow + "&errorProcessMet=" + $scope.head.errorProcessMet + "&uploadZipType=" + $scope.head.uploadZipType;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	// Excelアップロード
	$scope.excelUploadSuccess = function(e, response) {

		$scope.paging = response.result.paging;
		//[Ver3.1][#5754] ファイル取込成功時「Excel出力」「登録」ボタンを活性にする処理を削除 2018.12.17 tanaka del
		// 処理前にグリッドをクリアする。
		$scope.body = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;

			// 完了後の処理
			if (!statusInfo.isSuccess(response.result, 'inputform')) {

				// メッセージ表示
				statusInfo.isSuccessAndShowMessage(response.result, 'inputform');
				return;
			}

			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.receiveCd = $scope.receiveCd;

			api.zipMasterBulkInput.checkError(request).then(function(checkResponse) {

				if (!statusInfo.isSuccessAndShowMessage(checkResponse,'inputform')) {
					return;
				};

				// メッセージ表示
				statusInfo.isSuccessAndShowMessage(response.result, 'inputform');

				$scope.search(response.result);
			});
		}, 3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput#register
	 * @methodOf oneslogiWms.ZipMasterBulkInput.object:ZipMasterBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {

			var checkExistErrorFunc;
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			var checkMasterFunc; // 関連マスタチェック関数

			// 新規登録関数を設定
			checkExistErrorFunc = api.zipMasterBulkInput.checkExistError;
			checkFunc = api.zipMasterBulkInput.inputCheck;
			execFunc = api.zipMasterBulkInput.register;
			checkMasterFunc = api.zipMasterBulkInput.checkErrorMaster;

			successFunc = function(execResponse){
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.receiveCd = $scope.receiveCd;

			// 0:全て取込まない
			if ($scope.head.errorProcessMet == '0') {
				// エラーフラグが「1」のデータを抽出する。
				checkExistErrorFunc(request).then(function(checkExistErrorResponse) {
					// エラーデータがある
					if (checkExistErrorResponse.data.head.counter > 0) {
						statusInfo.isSuccessAndShowMessage(checkExistErrorResponse, 'inputform');
						$scope.search();
						return;
					}

					// 登録確認
					if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
						$scope.search();
						return;
					}

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

						// 郵便番号マスタデータ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								$scope.search();
								return;
							}
							// 完了後の処理
							successFunc(execResponse);
						});
					});
				});
			// 1:エラー以外を取り込む
			} else if ($scope.head.errorProcessMet=='1') {
				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					$scope.search();
					return;
				}

				// 登録時の関係マスタチェック
				checkMasterFunc(request).then(function(checkMasterResponse) {
					// 登録時の関係マスタチェックエラー件数を設定
					request.data.errorCount = checkMasterResponse.data.errorCount;

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
						$scope.search();
						return;
					}

					// 郵便番号マスタデータ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 完了後の処理
						successFunc(execResponse);
					});
				});
			}
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);