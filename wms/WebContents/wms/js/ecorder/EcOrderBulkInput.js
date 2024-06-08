/**
 * @ngdoc overview
 * @name oneslogiWms.EcOrderBulkInput
 *
 * @description
 * EC受注一括取込画面<br>
 *
 * CSV取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.EcOrderBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.EcOrderBulkInput.service:EcOrderBulkInputApi
 *
 * @description
 * EC受注一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ecOrderBulkInput EC受注データ一括取込操作用WebApi<br>
 * ・resources/ecorder/ecOrderBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/ecorder/ecOrderBulkInput/importTypeList 取込み種別マスタ取得WebAPI<br>
 * ・resources/ecorder/ecOrderBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/ecorder/ecOrderBulkInput/inputCheck 登録前入力チェックWebAPI<br>
 * ・resources/ecorder/ecOrderBulkInput/register 登録WebAPI<br>
 * <br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('ecOrderBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		ecOrderBulkInput : AngularAPIClient.make(
				[
				 ['initNew',                   'GET',   'resources/ecorder/ecOrderBulkInput/initNew'],
				 ['importTypeList',            'GET',   'resources/ecorder/ecOrderBulkInput/importTypeList'],
				 // [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana Start
				 ['afterUploadHeaderAndBody',  'POST',  'resources/ecorder/ecOrderBulkInput/afterUploadHeaderAndBody'],
				 // [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana End
				 ['inputCheck',                'POST',  'resources/ecorder/ecOrderBulkInput/inputCheck'],
				 ['register',                  'POST',  'resources/ecorder/ecOrderBulkInput/register']
				 ]
		)
	};
}])
.controller('EcOrderBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ecOrderBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.ecOrderBulkInputCols = [];
	// グリッド表示用
	$scope.ecOrderList = [];
	//荷主センタ変更対応 2017.02.28 sja Start
//	$scope.clientCd = userInfo.clientCd;
//	$scope.centerCd = userInfo.centerCd;
	//荷主センタ変更対応 2017.02.28 sja End


	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data : 'ecOrderList',
			columnDefs : 'ecOrderBulkInputCols',
			// [ON推-品向-975] グリッドヘッダ設定を無効に変更 2015.10.08 kawana Start
			enableChangeColumn : false
			// [ON推-品向-975] グリッドヘッダ設定を無効に変更 2015.10.08 kawana End
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "order");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(csv|xlsx|xls)$/i,
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
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
				 $scope.deferredGetImportTypeList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	//荷主センタ変更対応 2017.02.28 sja Start
	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#clientChange
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、取込種別リストデータを再度取得し画面項目に反映する。
	 * 荷主が空白の場合、取込種別リストデータ再度取得は行わずに空にする。
	 */
	$scope.clientChange = function() {
		var clientCd = $scope.importType.clientCd;
		if (isNullOrUndefined(clientCd)) {
			// 検索条件で選択された荷主が空白の場合、取込種別リストを空にする
			$scope.importTypeList = [];
			$scope.importType.importTypeCd = null;
			$scope.importTypeChange();
		} else {
			// 取込種別ドロップダウン用取得・設定処理（同期処理）
			$scope.deferredGetImportTypeList()
			.then(function(responce){
				if ($scope.importTypeList.length > 0) {
					// 取得した取込種別ドロップダウンリストデータが存在する場合、先頭データを初期表示値として設定
					$scope.importType.importTypeCd = $scope.importTypeList[0].importTypeCd;
					$scope.importTypeChange();
				}
			});
		}
	}
	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod End
	//荷主センタ変更対応 2017.02.28 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#deferredGetEmergencyFlgList
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
	 *
	 * @description
	 *取込種別ドロップダウン用取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetImportTypeList = function(){
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 2017.02.28 sja Start
//		request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
//		request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		if ($scope.importType) {
			request.clientId = userInfo.clientIdByCd($scope.importType.clientCd);
			request.centerId = userInfo.centerIdByCd($scope.importType.centerCd);
		} else {
			request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		//荷主センタ変更対応 2017.02.28 sja End
		api.ecOrderBulkInput.importTypeList(request).then(function(response){
			$scope.importTypeList = response.data.mImportType;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
	 *
	 * @description
	 * 取込種別とEDIマスタの初期取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.ecOrderBulkInput.initNew().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			$scope.importType = response.data.base; // 取込み種別
			$scope.ecOrderList = response.data.order; // EC受注データ
			//荷主センタ変更対応 2017.02.28 sja Start
			$scope.importType.clientCd = userInfo.clientCd;
			$scope.importType.centerCd = userInfo.centerCd;
			//荷主センタ変更対応 2017.02.28 sja End


			if ($scope.importTypeList.length > 0) {
				$scope.importType.importTypeCd = $scope.importTypeList[0].importTypeCd;
				$scope.importTypeChange();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana Start
	// 取込種別がYahooか
	$scope.isImportTypeYahoo = false;
	// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana End

	// 取込み種別を変更した時
	$scope.importTypeChange = function(){
		$scope.ecOrderList = [];
		if ($scope.importType.importTypeCd == null) {
			$scope.ecOrderBulkInputCols = [];
			// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana Start
			$scope.isImportTypeYahoo = false;
			$scope.setCsvBtnVisible();
			// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana End
			return;
		}

		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana Start
		// 取込種別がYahooか
		if(0 <= $scope.importType.importTypeCd.toLowerCase().indexOf("yahoo")){
			$scope.isImportTypeYahoo = true;
		} else {
			$scope.isImportTypeYahoo = false;
		}
		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.25 kawana End

		for (var i = 0; i < $scope.importTypeList.length; i++) {
			if ($scope.importTypeList[i].importTypeCd == $scope.importType.importTypeCd ) {
				// 取込み種別ボディマスタからGridの列を作成
				$scope.ecOrderBulkInputCols = [];
				for (var col = 0; col < $scope.importTypeList[i].mimportTypeBList.length; col++) {
					$scope.ecOrderBulkInputCols.push({
						field : $scope.importTypeList[i].mimportTypeBList[col].uploadColumnNm,
						displayName : $scope.importTypeList[i].mimportTypeBList[col].mediColumn.ediColumnNm,
						inColIndex : $scope.importTypeList[i].mimportTypeBList[col].columnNo,
						width : 180,
						headerCellClass: 'centerText',
						visible : true,
						// [#6935][OSS] セルのダブルクリックで編集できてしまう問題を修正 2019.12.05 kawana Start
						enableCellEdit : false
						// [#6935][OSS] セルのダブルクリックで編集できてしまう問題を修正 2019.12.05 kawana End
					});
				}
				$scope.gridOptions.columnDefs = $scope.ecOrderBulkInputCols;
				break;
			}
		}

		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana Start
		$scope.setCsvBtnVisible();
		// [C-CWMS-0026] Yahooの取込(ヘッダファイル、ボディファイル)対応 2015.05.29 kawana End
	}

	// CSVアップロード前処理
	$scope.beforeUpload = function() {

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "order");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(csv|xlsx|xls)$/i,
				formData : uploadParam
		};
		//荷主センタ変更対応 2017.02.28 sja Start
		//$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUpload?clientId=" + userInfo.clientIdByCd($scope.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUpload?clientId=" + userInfo.clientIdByCd($scope.importType.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.importType.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		//荷主センタ変更対応 2017.02.28 sja End
		}

	// CSVアップロード
	$scope.uploadSuccess = function(e, data) {

		owsCommon.syncExec(function() {

			$scope.ecOrderList = data.result.data.order;
			$scope.importTypeBase = data.result.data.base;

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				return;
			}
		},3);
	};

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start

	// CSVアップロード前処理(ヘッダファイル)
	$scope.beforeUploadHeader = function() {

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "order");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(csv|xlsx|xls)$/i,
				formData : uploadParam
		};
		//荷主センタ変更対応 2017.02.28 sja Start
//		$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUploadHeader?clientId=" + userInfo.clientIdByCd($scope.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUploadHeader?clientId=" + userInfo.clientIdByCd($scope.importType.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.importType.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		//荷主センタ変更対応 2017.02.28 sja End
	}

	// CSVアップロード後処理(ヘッダファイル)
	$scope.uploadSuccessHeader = function(e, data) {

		owsCommon.syncExec(function() {

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				$scope.isSucessUploadHeader = false;
				return;
			}

			$scope.ecOrderHeaderList = data.result.data.orderHeader;
			$scope.importTypeBase = data.result.data.base;

			$scope.isSucessUploadHeader = true;
		},3);
	};

	// CSVアップロード前処理(ボディファイル)
	$scope.beforeUploadBody = function() {

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "order");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(csv|xlsx|xls)$/i,
				formData : uploadParam
		};
		//荷主センタ変更対応 2017.02.28 sja Start
//		$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUploadBody?clientId=" + userInfo.clientIdByCd($scope.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		$scope.fileOptions.url = "resources/ecorder/ecOrderBulkInput/fileUploadBody?clientId=" + userInfo.clientIdByCd($scope.importType.clientCd) + "&centerId=" + userInfo.centerIdByCd($scope.importType.centerCd) + "&importTypeCd=" + $scope.importType.importTypeCd ;
		//荷主センタ変更対応 2017.02.28 sja End
	}

	// CSVアップロード後処理(ボディファイル)
	$scope.uploadSuccessBody = function(e, data) {

		owsCommon.syncExec(function() {

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				$scope.isSucessUploadBody = false;
				return;
			}

			$scope.ecOrderBodyList = data.result.data.orderBody;
			$scope.importTypeBase = data.result.data.base;

			$scope.isSucessUploadBody = true;
		},3);
	};

	// ヘッダファイルのアップロード監視
	$scope.$watch('isSucessUploadHeader', function(){
		$scope.afterUploadHeaderAndBody();
	});

	// ボディファイルのアップロード監視
	$scope.$watch('isSucessUploadBody', function(){
		$scope.afterUploadHeaderAndBody();
	});

	// ヘッダファイル、ボディファイルのアップロード後処理
	$scope.afterUploadHeaderAndBody = function() {
		// アップロードファイル名がどちらも設定されたら(処理完了)
		if($scope.isSucessUploadHeader && $scope.isSucessUploadBody){

			owsCommon.syncExec(function() {

				var request = {};
				request.data = {};
				request.data.base = $scope.importTypeBase;
				//荷主センタ変更対応 2017.02.28 sja Start
//				request.data.centerId = userInfo.centerIdByCd($scope.centerCd);
//				request.data.clientId = userInfo.clientIdByCd($scope.clientCd);
				request.data.centerId = userInfo.centerIdByCd($scope.importType.centerCd);
				request.data.clientId = userInfo.clientIdByCd($scope.importType.clientCd);
				//荷主センタ変更対応 2017.02.28 sja End
				request.data.columnDefs = $scope.getRequestColumnDefs();
				request.data.jsonDataHeader = $.base64.encode(JSON.stringify($scope.ecOrderHeaderList), true);
				request.data.jsonDataBody = $.base64.encode(JSON.stringify($scope.ecOrderBodyList), true);

				// ヘッダファイル、ボディファイルの読込処理を呼出し
				api.ecOrderBulkInput.afterUploadHeaderAndBody(request).then(function(response) {

					// グリッドに設定
					$scope.ecOrderList = response.data.order;
					$scope.importTypeBase = response.data.base;  // バックアップに残しておく

					// 完了後の処理
					if (!statusInfo.isSuccessAndShowMessage(response,'inputform')) {
						return;
					}
				});

				$scope.isSucessUploadHeader = false;
				$scope.isSucessUploadBody = false;
			});
		}
	};

	// サーバ送信用の列定義を作成
	$scope.getRequestColumnDefs = function() {

		var resColumnDefs = [];
    	var cnt = 0;
    	for (var i = 0; i < $scope.gridOptions.columnDefs.length; i++) {
    		if ($scope.gridOptions.columnDefs[i].visible) {
    			resColumnDefs[cnt] = {};
    			resColumnDefs[cnt].displayName = $scope.gridOptions.columnDefs[i].displayName;
    			resColumnDefs[cnt].field = $scope.gridOptions.columnDefs[i].field;
    			resColumnDefs[cnt].inColIndex = $scope.gridOptions.columnDefs[i].inColIndex;
    			cnt++;
    		}
    	}

    	return resColumnDefs;
	};

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#register
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {

			var isError = $scope.inputform.$invalid;

			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('inputform');
				return;
			}

			if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
				return;
			}

			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			// 新規登録関数を設定
			execFunc = api.ecOrderBulkInput.register;

			successFunc = function() {
				// [C-CWMS-0026] 登録後に取込種別が初期化されてしまう 2015.05.20 kawana Start
				// グリッド初期化
				$scope.ecOrderList = [];
				// [C-CWMS-0026] 登録後に取込種別が初期化されてしまう 2015.05.20 kawana End
			};

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			//荷主センタ変更対応 2017.02.28 sja Start
//			request.data.clientId = userInfo.clientIdByCd($scope.clientCd);
//			request.data.centerId = userInfo.centerIdByCd($scope.centerCd);
			request.data.clientId = userInfo.clientIdByCd($scope.importType.clientCd);
			request.data.centerId = userInfo.centerIdByCd($scope.importType.centerCd);
			//荷主センタ変更対応 2017.02.28 sja End
			request.data.base = $scope.importTypeBase;
			request.data.jsonData = $.base64.encode(JSON.stringify(angular.copy($scope.ecOrderList)), true);

			// 出荷指示データ登録
			execFunc(request).then(function(execResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
					return;
				}

				// 完了後の処理
				successFunc(execResponse);
			});
		});
	};

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput#setCsvButtonVisible
	 * @methodOf oneslogiWms.EcOrderBulkInput.object:EcOrderBulkInput
	 *
	 * @description
	 * CSV取込ボタンの表示制御<br>
	 * 取込種別によりCSV取込ボタンの表示・非表示を切り替える
	 */
	$scope.setCsvBtnVisible = function() {

		if ($scope.isImportTypeYahoo) {
			directiveControl.show($scope, "csvUpload", false);
			directiveControl.show($scope, "csvUploadHeader", true);
			directiveControl.show($scope, "csvUploadBody", true);
		} else  {
			directiveControl.show($scope, "csvUpload", true);
			directiveControl.show($scope, "csvUploadHeader", false);
			directiveControl.show($scope, "csvUploadBody", false);
			$scope.isSucessUploadHeader = false;
			$scope.isSucessUploadBody = false;
		}
	}
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);