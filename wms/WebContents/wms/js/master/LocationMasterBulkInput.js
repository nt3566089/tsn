/**
 * @ngdoc overview
 * @name oneslogiWms.LocationMasterBulkInput
 *
 * @description
 * ロケーションマスタ一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.LocationMasterBulkInput', [])

// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma start
/**
 * @ngdoc service
 * @name oneslogiWms.LocationMasterBulkInput.service:locationMasterBulkInputApi
 *
 * @description
 * ロケーションマスタ一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * locationMasterBulkInputList ロケーションマスタ一括取込操作用WebApi<br>
 * ・resources/master/locationMasterBulkInput/init 初期処理WebAPI<br>
 * ・resources/master/locationMasterBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/locationMasterBulkInput/productRecordwithShape 単一行データ取得WebAPI<br>
 * ・resources/master/locationMasterBulkInput/inputCheck 入力チェック（登録）WebAPI<br>
 * ・resources/master/locationMasterBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/locationMasterBulkInput/getMasterData マスタデータ一括取得WebAPI<br>
 * ・resources/master/locationMasterBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('locationMasterBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),
		locationMasterBulkInput : AngularAPIClient.make(
				[
				 ['init',  'GET',  'resources/master/locationMasterBulkInput/init'],
				 ['fileUpload',  'POST',  'resources/master/locationMasterBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/master/locationMasterBulkInput/register'],
				 ['findErrorList',  'GET',  'resources/master/locationMasterBulkInput/findErrorList'],
				 ['search',  'GET',  'resources/master/locationMasterBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/master/locationMasterBulkInput/checkExistError'],
				 ['excel',  'GET',  'resources/master/locationMasterBulkInput/excelOutput',  'excel'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/master/locationMasterBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
				]
		)
	};
}])
.controller('LocationMasterBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.locationMasterBulkInputCols = [
		{field : "lineNo", displayName:"No.", inColIndex:"1"}
	];

	var oldClient;
	var newDepositStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#initScreen
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana Start
		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'locationMasterBulkInputList',
			columnDefs : 'locationMasterBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "body");

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
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#excelOutput
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
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
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);
		api.locationMasterBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#search
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * 取込データ検索処理<br>
	 * @description
	 *
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
	var searchCenterCd;
	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
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
		if (!request.data.head.clientCd) {
			request.data.head.clientCd = userInfo.clientCd;
		}
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.locationMasterBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			searchCenterCd = request.data.head.centerCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#setSearchData
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.locationMasterBulkInputList = response.data.body;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

	    // [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない(行番号の設定をサーバーで行うため該当処理を削除) 2018.03.16 kawana

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		for (var row = 0 ;row < $scope.locationMasterBulkInputList.length; row++) {
			$scope.locationMasterBulkInputList[row].warehouseCd=$scope.locationMasterBulkInputList[row].warehouseNm;
			$scope.locationMasterBulkInputList[row].zoneCd=$scope.locationMasterBulkInputList[row].zoneNm;
			$scope.locationMasterBulkInputList[row].replenishPProductShapeCd=$scope.locationMasterBulkInputList[row].replenishProductShapeNm;
			$scope.locationMasterBulkInputList[row].maxStoreProductShapeCd=$scope.locationMasterBulkInputList[row].maxStoreProductShapeNm;
			$scope.locationMasterBulkInputList[row].locationType=$scope.locationMasterBulkInputList[row].locationTypeNm;
			$scope.locationMasterBulkInputList[row].pickingLocationFlg=$scope.locationMasterBulkInputList[row].pickingLocationFlgNm;
			$scope.locationMasterBulkInputList[row].replenishStockTypeCd=$scope.locationMasterBulkInputList[row].replenishStockTypeNm;
			$scope.locationMasterBulkInputList[row].replenishDepositCd=$scope.locationMasterBulkInputList[row].replenishDepositNm;
			$scope.locationMasterBulkInputList[row].allocNgFlg=$scope.locationMasterBulkInputList[row].allocNgFlgNm;
			$scope.locationMasterBulkInputList[row].delFlg=$scope.locationMasterBulkInputList[row].delFlgNm;
		}
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

		owsHistory.replaceState($scope.locationMasterBulkInputList);
	};

	$scope.findErrorList = function(){
		$scope.search();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
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
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
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
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * @description
	 * ロケーションマスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.locationMasterBulkInput.init().then(function(response){

			$scope.head = response.data.head;
			$scope.locationMasterBulkInputList = response.data.body;
			$scope.head.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.centerCd = userInfo.centerCd;

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

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

    // [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない(行番号の設定をサーバーで行うため該当処理を削除) 2018.03.16 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		//荷主センタ変更対応 2017.02.28 sja Start
		$scope.fileOptions.url = "resources/master/locationMasterBulkInput/fileUpload?centerCd=" + $scope.head.centerCd + "&clientCd=" + userInfo.clientCd + "&chkErrorShow=" + $scope.head.chkErrorShow + "&errorProcessMet=" + $scope.head.errorProcessMet;
		//荷主センタ変更対応 2017.02.28 sja End
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	// Excelアップロード
	$scope.excelUploadSuccess = function(e, response) {

		$scope.head = response.result.data.head;

		$scope.paging = response.result.paging;

		// 処理前にグリッドをクリアする。
		$scope.body = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}

			$scope.search();
		}, 3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput#register
	 * @methodOf oneslogiWms.LocationMasterBulkInput.object:LocationMasterBulkInput
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
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			var checkMasterFunc; // 関連マスタチェック関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			// 新規登録関数を設定
			checkExistErrorFunc = api.locationMasterBulkInput.checkExistError;
			checkFunc = api.locationMasterBulkInput.inputCheck;
			execFunc = api.locationMasterBulkInput.register;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			checkMasterFunc = api.locationMasterBulkInput.checkErrorMaster;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			successFunc = function(execResponse){
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			request.data.head.centerCd = searchCenterCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
			request.data.head.clientId = userInfo.clientId;
			request.data.receiveCd = $scope.receiveCd;

			// 0:全て取込まない
			if ($scope.head.errorProcessMet == '0') {
				// エラーフラグが「1」のデータを抽出する。
				checkExistErrorFunc(request).then(function(checkExistErrorResponse) {
					// エラーデータがある
					if (checkExistErrorResponse.data.head.counter > 0) {
						//[ＯＮ推_品向_1109] Excel取込時全てエラーとなるデータを登録する時に、画面無反応の対応 2016.04.22 DSW Start
						statusInfo.isSuccessAndShowMessage(checkExistErrorResponse, 'inputform');
						$scope.search();
						//[ＯＮ推_品向_1109] Excel取込時全てエラーとなるデータを登録する時に、画面無反応の対応 2016.04.22 DSW End
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

						// ロケーションマスタデータ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								$scope.search();
								return;
							}
							// 完了後の処理
							successFunc(execResponse);
							owsCommon.toggleSelectAll($scope.gridOptions, false);
						});
					});
					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
				});
			// 1:エラー以外を取り込む
			} else if ($scope.head.errorProcessMet=='1') {
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

					// ロケーションマスタデータ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						owsCommon.toggleSelectAll($scope.gridOptions, false);
					});
				});
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
			}
		});
	};
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.01 honma end

	// 画面初期化処理を実行
	$scope.initScreen();
}]);