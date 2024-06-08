/**
 * @ngdoc overview
 * @name oneslogiWms.ReplenishInstBulkInput
 *
 * @description
 * 融通指示一括登録画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ReplenishInstBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReplenishInstBulkInput.service:replenishInstBulkInputApi
 *
 * @description
 * 融通指示一括登録画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList エラー処理方法リスト用データ取得
 * <br>
 * mainList 融通指示一括登録操作用WebApi<br>
 * ・resources/resources/shipping/replenishInstBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/shipping/replenishInstBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/shipping/replenishInstBulkInput/search 検索処理WebAPI<br>
 * ・resources/shipping/replenishInstBulkInput/register 登録WebAPI<br>
 * ・resources/shipping/replenishInstBulkInput/checkExistError 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('replenishInstBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList : AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		mainList : AngularAPIClient.make(
				[
				 ['initNew',  'GET',  'resources/shipping/ReplenishInstBulkInput/initNew'],
				 ['fileUpload',  'POST',  'resources/shipping/ReplenishInstBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/shipping/ReplenishInstBulkInput/register'],
				 ['excel',  'GET',  'resources/shipping/ReplenishInstBulkInput/search',  'excel'],
				 ['search',  'GET',  'resources/shipping/ReplenishInstBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/shipping/ReplenishInstBulkInput/checkExistError']
				 ]
		)
	};
}])
.controller('ReplenishInstBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'replenishInstBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.replenishInstBulkInputCols = [
	                                    {field : "lineNo", displayName:"No."},
	                                    {field : "flexlnsNo", displayName:"指示No."},
	                                    {field : "schDate", displayName : "発送予定日"},
	                                    {field : "supplierCd", displayName : "発送元CD"},
	                                    {field : "rcvDate", displayName : "受入予定日"},
	                                    {field : "shipCd", displayName : "発送先CD"},
	                                    {field : "itemCd", displayName : "銘柄CD"},
	                                    {field : "manufactureDate", displayName : "製造年月日"},
	                                    {field : "designCd", displayName : "デザイン区分"},
	                                    {field : "qty", displayName : "数量(個数)"},
	                                    {field : "flexUpdUserCd", displayName : "画面更新者"},
	                                    {field : "errorMsg", displayName : "エラー内容"},
	                                    {field : "clientCd", displayName : "荷主CD"},
	                                    {field : "clientNm", displayName : "荷主名称"}
	                                    ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#initScreen
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {
		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'bodyList',
			columnDefs : 'replenishInstBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "bodyList");

		// CSVアップロード設定
		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(csv)$/i,
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#excelOutput
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function() {

		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);
		api.mainList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#search
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * 取込データ検索処理<br>
	 *
	 */
	$scope.search = function() {
		optionMessageControl.hideAll($scope);
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
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
		api.mainList.search(request).then(function(response) {
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				return;
			}
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#setSearchData
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.bodyList = response.data.bodyList;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		$scope.dataCount = response.data.dataCount;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
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
				 $scope.deferredErrorProcessMet()
				 ]
		)
		.then(function() {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * エラー処理方法取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response) {
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * 画面初期化用データ取得/設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.mainList.initNew().then(function(response) {

			$scope.gridOptions.totalItems=0;

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			$scope.head = response.data.head; 
			$scope.bodyList = []; 
			$scope.bodyList = response.data.bodyList; 

			$scope.head.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.head.clientCd = userInfo.clientCd; // 荷主の初期値設定

			$scope.head.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			$scope.dataCount = 0;

			$scope.paging = response.paging;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
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
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.fileBeforeUpload = function() {
		$scope.fileOptions.url = "resources/shipping/ReplenishInstBulkInput/fileUpload?clientCd=" + $scope.head.clientCd + "&centerCd=" + $scope.head.centerCd + "&chkErrorShow=" + $scope.head.chkErrorShow + "&errorProcessMet=" + $scope.head.errorProcessMet;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#fileUploadSuccess
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.fileUploadSuccess = function(e, response) {

		$scope.bodyList = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;
			$scope.dataCount = response.result.data.dataCount;
			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}
			$scope.bodyList = response.result.data.bodyList;
		},3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput#register
	 * @methodOf oneslogiWms.ReplenishInstBulkInput.object:ReplenishInstBulkInput
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

			// 新規登録関数を設定
			checkExistErrorFunc = api.mainList.checkExistError;
			execFunc = api.mainList.register;

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.receiveCd = $scope.receiveCd;

			// エラーフラグが「1」のデータを抽出する。
			checkExistErrorFunc(request).then(function(checkExistErrorResponse) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkExistErrorResponse, 'inputform')) {
					return;
				}
				var errorCount =checkExistErrorResponse.data.errorCount;
				
				// 融通指示一括登録用DTO.エラー件数 > 0 の場合
				if(errorCount > 0){
					alertMessage.setErrorMessageByCode("errorDataFoundError");
					return;
				}

				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					return;
				}

				// 出荷指示データ登録
				execFunc(request).then(function(execResponse) {

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						return;
					}

					// 完了後の処理
					$scope.search();

					owsCommon.toggleSelectAll($scope.gridOptions, false);
				});
			});
		});
	}

	// 画面初期化処理を実行
	$scope.initScreen();
}]);