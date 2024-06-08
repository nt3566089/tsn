/**
 * @ngdoc overview
 * @name oneslogiWms.BarcodeLabelBulkPrint
 *
 * @description
 * バーコードラベル一括出力画面<br>
 *
 * Excel取込とラベル一括出力を行う為の画面。
 */
angular.module('oneslogiWms.BarcodeLabelBulkPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.BarcodeLabelBulkPrint.service:barcodeLabelBulkPrintApi
 *
 * @description
 * バーコードラベル一括出力画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * barcodeLabelBulkPrint バーコードラベル一括出力操作用WebApi<br>
 * ・resources/common/barcodeLabelBulkPrint/init 初期処理用WebAPI<br>
 * ・resources/common/barcodeLabelBulkPrint/search 検索用WebApi<br>
 * ・resources/common/barcodeLabelBulkPrint/check バーコードラベル発行 事前チェック用WebAPI<br>
 * ・resources/common/barcodeLabelBulkPrint/print バーコードラベル発行用WebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('barcodeLabelBulkPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		barcodeLabelBulkPrint : AngularAPIClient.make(
				[
				 ['init',  'GET',  'resources/common/barcodeLabelBulkPrint/init'],
				 ['search',  'GET',  'resources/common/barcodeLabelBulkPrint/search'],
				 ['check',  'GET',  'resources/common/barcodeLabelBulkPrint/check'],
                 ['print',  'GET', 'resources/common/barcodeLabelBulkPrint/print'],
				 ['excel',  'GET',  'resources/common/barcodeLabelBulkPrint/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
 *
 * @description
 * バーコードラベル一括出力画面コントローラ
 */
.controller('BarcodeLabelBulkPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'barcodeLabelBulkPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.barcodeLabelBulkPrintCols = [
	                                   {field : "receiveRowId", displayName:"No."},
	                                   {field : "barcode", displayName:"バーコード"},
	                                   {field : "barcodeNm", displayName:"バーコード名称"},
	                                   {field : "comment", displayName:"備考"},
	                                   {field : "outputCnt", displayName:"出力枚数"}
	                                   ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#initScreen
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// ページングの設定
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
			data : 'barcodeLabelBulkPrintList',
			columnDefs : 'barcodeLabelBulkPrintCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "body");

		$scope.fileOptions = {
				// [#210][2.21-010 バーコード一括出力]CSV取込処理を追加 2016.11.14 shimizu Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// [#210][2.21-010 バーコード一括出力]CSV取込処理を追加 2016.11.14 shimizu End
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#initScreenHttp
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
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
				 $scope.deferredErrorProcessMet(),
				 $scope.deferredBarcodeType()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#deferredGetInitData
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description
	 * バーコードラベル一括出力データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.barcodeLabelBulkPrint.init().then(function(response){

			// バーコードラベル一括出力データ設定
			$scope.head = response.data.head;
			$scope.barcodeLabelBulkPrintList = response.data.body;

			// プルダウンリスト初期値設定
			$scope.head.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			// ラベル出力用
			$scope.printParam = response.data.reportData.printBasicData;
			$scope.barcodeLabelPrintDto = response.data.reportData;

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// コントロール設定
			if ($scope.barcodeLabelBulkPrintList.length>0){
				directiveControl.editable($scope, 'excelOutput', true);
				directiveControl.editable($scope, 'labelPrint', true);
			} else {
				directiveControl.editable($scope, 'excelOutput', false);
				directiveControl.editable($scope, 'labelPrint', false);
			}

			$scope.paging = response.paging;
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#deferredErrorProcessMet
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#deferredBarcodeType
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description
	 * バーコード種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredBarcodeType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BARCODE_TYPE";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.barcodeTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#excelOutput
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function(){

		var ret = owsCommon.viewConfirm("バーコードラベル一括出力リストを作成します。よろしいですか？");
		if(!ret){
			return false;
		}
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		var title = 'バーコードラベル一括出力リスト';

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", title);
		api.barcodeLabelBulkPrint.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#search
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description 検索処理<br>
     * ・グリッドのページングクリア処理呼び出し<br>
     * ・データ取得処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#getPagedDataAsync
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.barcodeLabelBulkPrint.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#setSearchData
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.barcodeLabelBulkPrintList = response.data.body;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		if ($scope.barcodeLabelBulkPrintList.length>0){
			directiveControl.editable($scope, 'excelOutput', true);
			directiveControl.editable($scope, 'labelPrint', true);
		} else {
			directiveControl.editable($scope, 'excelOutput', false);
			directiveControl.editable($scope, 'labelPrint', false);
		}
	};

	// Excelアップロード前処理
	$scope.excelBeforeUpload = function() {
		var inputStartBit = "";
		var inputEndBit = "";
		var inputBarcodeType = "";

		if ($scope.head.startBit) {
			inputStartBit = $scope.head.startBit;
		}
		if ($scope.head.endBit) {
			inputEndBit = $scope.head.endBit;
		}
		if ($scope.head.barcodeType) {
			inputBarcodeType = $scope.head.barcodeType;
		}

		$scope.fileOptions.url = "resources/common/barcodeLabelBulkPrint/fileUpload?barcodeType=" + inputBarcodeType + "&startBit=" + inputStartBit + "&endBit=" + inputEndBit + "&chkErrorShow=" + $scope.head.chkErrorShow + "&errorProcessMet=" + $scope.head.errorProcessMet;
	}

	// Excelアップロード結果表示
	$scope.excelUploadSuccess = function(e, response) {

		$scope.head = response.result.data.head;

		$scope.paging = response.result.paging;

		if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
			return;
		}

		$scope.search();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint#print
	 * @methodOf oneslogiWms.BarcodeLabelBulkPrint.object:BarcodeLabelBulkPrint
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 発行ボタン押下時に、バーコードラベル出力を行う。
	 */
	$scope.print = function() {
		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		var request = {};
		request = angular.copy($scope.barcodeLabelPrintDto);
		request.data.head = $scope.head;
		request.data.body = $scope.barcodeLabelBulkPrintList;

		// チェック処理呼び出し
		api.barcodeLabelBulkPrint.check(request).then(function(checkResponse){

			if (checkResponse.status.statusCode == 2){
				statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform');
				$scope.search();
				return ;
			}

			// 帳票出力画面呼び出し
			var modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start

				request.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.barcodeLabelBulkPrint.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
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
				}).catch(function(printResponse){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);