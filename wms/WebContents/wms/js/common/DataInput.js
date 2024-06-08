/**
 * @ngdoc overview
 * @name oneslogiWms.DataInput
 *
 * @description
 * データ取込画面
 */
angular.module('oneslogiWms.DataInput',[])
/**
 * @ngdoc service
 * @name oneslogiWms.DataInput.service:dataInputApi
 *
 * @description
 * データ取込WebApi定義<br>
 * ・resources/class/keyValueList 区分値データ取得<br>
 * ・resources/common/dataInput/init 初期処理WebApi<br>
 * ・resources/common/dataInput/upload アップロードWebApi<br>
 * ・resources/common/dataInput/registerWork ワーク取込WebApi<br>
 * ・resources/common/dataInput/register データ移行WebApi<br>
 * ・resources/common/dataInput/download ダウンロードWebApi<br>
 *
 */
.factory('dataInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		operationTypeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				]
		),
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		inputTypeList: AngularAPIClient.make(
//				[
//				 ['query', 'GET', 'resources/class/keyValueList']
//				]
//		),
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
		dataRangeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				]
		),
		processTypeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				]
		),
		commitTypeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				]
		),
		dataInput: AngularAPIClient.make(
				[
				 ['init',                'GET',  'resources/common/dataInput/init'],
				 ['upload',              'POST', 'resources/common/dataInput/upload'],
				 ['registerWork',        'POST', 'resources/common/dataInput/registerWork'],
				 ['register',            'POST', 'resources/common/dataInput/register'],
				 ['download',            'POST', 'resources/common/dataInput/download'],
				 //Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
				 ['dataInputTypeList',   'GET',  'resources/common/dataInput/dataInputTypeList']
				 //Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
				]
		)
	};
}])
.controller('DataInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'dataInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
	// グリッドの列情報（work用）
	$scope.workDataInputCols = [];
	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#initScreen
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// [ON推-品向-918] Excelダウンロードを追加 2015.07.30 kawana Start
		// Excelダウンロードは閉じておく
		$scope.isopen = false;
		// [ON推-品向-918] Excelダウンロードを追加 2015.07.30 kawana End

        // グリッドの設定
        $scope.gridOptions = {
          data : 'dataRows',
          columnDefs : 'dataRows',
          enablePaging : false,
          showFooter : false,
          showSelectionCheckbox : true,
          enableCellSelection : false,
          enableRowSelection : true,
          enableCellEditOnFocus : false,
          enableColumnResize : true,
          multiSelect : true,
          jqueryUITheme : false,
          showGroupPanel : false
        };

        // アップロード設定
		var uploadParam = {};
		uploadParam.data = {};
		uploadParam.data.input = {};
		uploadParam.data.input.inputField = "dataRows";
		uploadParam.data.input.columnDefs = $scope.gridOptions;

		$scope.fileOptions = {
			// [ON推-品向-1021] txtファイルを許可 2015.12.08 ichikawa Start
			// [ON推-品向-904] tsvファイルを許可 2015.07.22 kawana Start
			acceptFileTypes : /(\.|\/)(csv|tsv|txt)$/i,
			// [ON推-品向-904] tsvファイルを許可 2015.07.22 kawana End
			// [ON推-品向-1021] txtファイルを許可 2015.12.08 ichikawa End
			formData : uploadParam
		};

		// 検索結果を表示、非活性
		$scope.controlEditableInit();
        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.dataInput.object:dataInput#controlEditableInit
	 * @methodOf oneslogiWms.dataInput.object:dataInput
	 *
	 * @description
	 * 初期化の画面処理<br>
	 *
	 * 表示、非活性
	 */
	$scope.controlEditableInit = function(){
		directiveControl.editable($scope, 'operationType', true);
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		directiveControl.editable($scope, 'inputType', true);
		directiveControl.editable($scope, 'dataInputTypeCd', true);
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
		directiveControl.editable($scope, 'commitType', false);
		directiveControl.editable($scope, 'processType', false);
		directiveControl.editable($scope, 'dataRange', false);
		directiveControl.show($scope, 'upload', false);
		directiveControl.show($scope, 'execute', true);
		directiveControl.show($scope, 'download', false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#initScreenHttp
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 *  画面初期化用の通信制御処理r>
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetOperationTypeList(),
				//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//				 $scope.deferredGetInputTypeList(),
				//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
				 $scope.deferredGetDataRangeList(),
				 $scope.deferredGetProcessTypeList(),
				 $scope.deferredGetCommitTypeList(),
				 //Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
				 $scope.deferredGetDataInputTypeList()
				 //Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#deferredGetDataInputTypeList
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 取込種類取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDataInputTypeList = function(){
		var deferred = $q.defer();

		api.dataInput.dataInputTypeList().then(function(response){
			$scope.dataInputTypeList = response.data.mDataInputType;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End

	//確定データ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.dataInput.init().then(function(response){
			$scope.dataInputCondition = response.data;
			$scope.dataInputCondition.operationType = owsCommon.getDefaultValue($scope.operationTypeList);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//			$scope.dataInputCondition.inputType = owsCommon.getDefaultValue($scope.inputTypeList);
			$scope.dataInputCondition.dataInputTypeCd = owsCommon.getDefaultValue($scope.dataInputTypeList);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			$scope.dataInputCondition.dataRange = owsCommon.getDefaultValue($scope.dataRangeList);
			$scope.dataInputCondition.processType = owsCommon.getDefaultValue($scope.processTypeList);
			$scope.dataInputCondition.commitType = owsCommon.getDefaultValue($scope.commitTypeList);
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
			$scope.dataInputType = response.workData.base; // 取込み種別
			//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
	// 取込み種別を変更した時
	$scope.dataInputTypeChange = function(){
		var operationType = $scope.dataInputCondition.operationType;
		var dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;

		if ( !(operationType && 0 < operationType.length) ) {
			directiveControl.editable($scope, 'commitType', false);
			directiveControl.editable($scope, 'processType', false);
			directiveControl.editable($scope, 'dataRange', false);
			directiveControl.show($scope, 'upload', false);
			directiveControl.show($scope, 'execute', true);
			directiveControl.show($scope, 'download', false);
		} else {
			// アップロード
			if (operationType == "0") {
				directiveControl.editable($scope, 'commitType', false);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', false);
				if ( !(dataInputTypeCd && 0 < dataInputTypeCd.length) ) {
					directiveControl.show($scope, 'upload', false);
					directiveControl.show($scope, 'execute', true);
					directiveControl.show($scope, 'download', false);
				} else {
					directiveControl.show($scope, 'upload', true);
					directiveControl.show($scope, 'execute', false);
					directiveControl.show($scope, 'download', false);
				}
			}
			// ワーク取込
			if (operationType == "1") {
				directiveControl.editable($scope, 'commitType', true);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', false);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', true);
				directiveControl.show($scope, 'download', false);
			}
			// データ移行
			if (operationType == "2") {
				directiveControl.editable($scope, 'commitType', true);
				directiveControl.editable($scope, 'processType', true);
				directiveControl.editable($scope, 'dataRange', false);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', true);
				directiveControl.show($scope, 'download', false);
			}
			// ダウンロード
			if (operationType == "3") {
				directiveControl.editable($scope, 'commitType', false);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', true);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', false);
				directiveControl.show($scope, 'download', true);
			}
		}

		for (var i = 0; i < $scope.dataInputTypeList.length; i++) {
			if ($scope.dataInputTypeList[i].dataInputTypeCd == $scope.dataInputCondition.dataInputTypeCd ) {
				// 取込み種別ボディマスタからGridの列を作成
				$scope.workDataInputCols = [];
				for (var col = 0; col < $scope.dataInputTypeList[i].mdataInputTypeBList.length; col++) {
					$scope.workDataInputCols.push({
						field : $scope.dataInputTypeList[i].mdataInputTypeBList[col].uploadColumnNm,
						inColIndex : $scope.dataInputTypeList[i].mdataInputTypeBList[col].colNo,
						displayName: $scope.dataInputTypeList[i].mdataInputTypeBList[col].colNm,
						visible : false
					});
				}
				$scope.gridOptions.columnDefs = $scope.workDataInputCols;
				break;
			}
		}
	}
	//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#deferredGetOperationTypeList
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 操作区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOperationTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DATA_INPUT_OPERATION_TYPE";

		api.operationTypeList.query(request).then(function(response){
			$scope.operationTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
	//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#deferredGetDataRangeList
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 取込対象取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDataRangeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DATA_INPUT_RANGE";

		api.dataRangeList.query(request).then(function(response){
			$scope.dataRangeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DATA_INPUT_PROCESS_TYPE";

		api.processTypeList.query(request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#deferredGetCommitTypeList
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * コミット区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCommitTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DATA_INPUT_COMMIT_TYPE";

		api.commitTypeList.query(request).then(function(response){
			$scope.commitTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	$scope.operationTypeChange = function() {
		var operationType = $scope.dataInputCondition.operationType;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		var inputType = $scope.dataInputCondition.inputType;
		var dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End

		if ( !(operationType && 0 < operationType.length) ) {
			directiveControl.editable($scope, 'commitType', false);
			directiveControl.editable($scope, 'processType', false);
			directiveControl.editable($scope, 'dataRange', false);
			directiveControl.show($scope, 'upload', false);
			directiveControl.show($scope, 'execute', true);
			directiveControl.show($scope, 'download', false);
		} else {
			// アップロード
			if (operationType == "0") {
				directiveControl.editable($scope, 'commitType', false);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', false);
				//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//				if ( !(inputType && 0 < inputType.length) ) {
				if ( !(dataInputTypeCd && 0 < dataInputTypeCd.length) ) {
				//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
					directiveControl.show($scope, 'upload', false);
					directiveControl.show($scope, 'execute', true);
					directiveControl.show($scope, 'download', false);
				} else {
					directiveControl.show($scope, 'upload', true);
					directiveControl.show($scope, 'execute', false);
					directiveControl.show($scope, 'download', false);
				}
			}
			// ワーク取込
			if (operationType == "1") {
				directiveControl.editable($scope, 'commitType', true);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', false);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', true);
				directiveControl.show($scope, 'download', false);
			}
			// データ移行
			if (operationType == "2") {
				directiveControl.editable($scope, 'commitType', true);
				directiveControl.editable($scope, 'processType', true);
				directiveControl.editable($scope, 'dataRange', false);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', true);
				directiveControl.show($scope, 'download', false);
			}
			// ダウンロード
			if (operationType == "3") {
				directiveControl.editable($scope, 'commitType', false);
				directiveControl.editable($scope, 'processType', false);
				directiveControl.editable($scope, 'dataRange', true);
				directiveControl.show($scope, 'upload', false);
				directiveControl.show($scope, 'execute', false);
				directiveControl.show($scope, 'download', true);
			}
		}
	};

	// アップロード前処理
	$scope.beforeUpload = function() {
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		var inputType = $scope.dataInputCondition.inputType;
//		$scope.fileOptions.url = "resources/common/dataInput/upload?inputType=" + inputType;
		var dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		$scope.fileOptions.url = "resources/common/dataInput/upload?dataInputTypeCd=" + dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End

		// [#433] 郵便番号マスタのファイルサイズ上限を20Mに変更 2016.12.13 kawana Start
		// 送信可能 ファイルサイズの設定
		if (dataInputTypeCd == "08" || dataInputTypeCd == "09") {
			// 郵便番号マスタは20M

			$scope.fileOptions.maxFileSize = 20971520;
		} else {
			// その他は10M

			$scope.fileOptions.maxFileSize = 10485760;
		}
		// [#433] 郵便番号マスタのファイルサイズ上限を20Mに変更 2016.12.13 kawana End
	};

	// アップロード
	$scope.uploadSuccess = function(e, data) {
		// 完了後の処理
		statusInfo.isSuccessAndShowMessage(data.result, 'dataInputForm');
	};

	$scope.execute = function() {
		var error = false;

		var operationType = $scope.dataInputCondition.operationType;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		var inputType = $scope.dataInputCondition.inputType;
		var dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End

		if($scope.dataInputForm.$invalid){
			error = true;
		}
		if ( !(operationType && 0 < operationType.length) ) {
			optionMessageControl.show($scope, 'operationType', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		if ( !(inputType && 0 < inputType.length) ) {
//		optionMessageControl.show($scope, 'inputType', owsCommon.convertMessage('requiredError'));
		if ( !(dataInputTypeCd && 0 < dataInputTypeCd.length) ) {
			optionMessageControl.show($scope, 'dataInputTypeCd', owsCommon.convertMessage('requiredError'));
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
			error = true;
		}
		if ( error ) {
			return;
		}

		// ワーク取込
		if (operationType == "1") {
			$scope.registerWork();
		}
		// データ移行
		if (operationType == "2") {
			$scope.register();
		}
		// ダウンロード
		if (operationType == "3") {
			$scope.download();
		}
	}

	$scope.registerWork = function() {
		var error = false;

		var commitType = $scope.dataInputCondition.commitType;

		if($scope.dataInputForm.$invalid){
			error = true;
		}
		if ( !(commitType && 0 < commitType.length) ) {
			optionMessageControl.show($scope, 'commitType', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if ( error ) {
			return;
		}

		var data = {};
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		data.inputType = $scope.dataInputCondition.inputType;
		data.dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End
		data.commitType = $scope.dataInputCondition.commitType;

		var inputDefs = {};
		inputDefs.inputField = "dataRows";

		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA Start
//		switch(data.inputType){
		switch(data.dataInputTypeCd){
//		case "01":
//			// 商品マスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsProduct;
//			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.08.04 SJA End

			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
//		case "02":
//			// 取引先マスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsCustomer;
//			break;
//		case "03":
//			// ロケーションマスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsLocation;
//			break;
//		case "04":
//			// 在庫データ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsStock;
//			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		case "02":
//			// 商品荷姿マスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsProductShape;
//			break;
//		case "03":
//			// 取引先マスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsCustomer;
//			break;
//		case "04":
//			// ロケーションマスタ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsLocation;
//			break;
//		case "05":
//			// 在庫データ取込の場合
//			inputDefs.columnDefs = $scope.columnDefsStock;
//			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
		// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End

		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
		case "01":
			// 商品マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "02":
			// 商品荷姿マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "03":
			// 取引先マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "04":
			// ロケーションマスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "05":
			// 在庫データ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "06":
			// ヤマト着店マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "07":
			//日本郵政着店マスタ取込
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "08":
			// ヤマト着店マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		case "09":
			// ヤマト着店マスタ取込の場合
			inputDefs.columnDefs = $scope.gridOptions.columnDefs
			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
		}

		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End
		data.inputDefs = inputDefs;

		var request = {};
		request.data = data;

		api.dataInput.registerWork(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'dataInputForm');
		});
	};

	$scope.register = function() {
		var error = false;

		var processType = $scope.dataInputCondition.processType;
		var commitType = $scope.dataInputCondition.commitType;

		if($scope.dataInputForm.$invalid){
			error = true;
		}
		if ( !(processType && 0 < processType.length) ) {
			optionMessageControl.show($scope, 'processType', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if ( !(commitType && 0 < commitType.length) ) {
			optionMessageControl.show($scope, 'commitType', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if ( error ) {
			return;
		}

		var data = {};
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		data.inputType = $scope.dataInputCondition.inputType;
		data.dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
		data.processType = $scope.dataInputCondition.processType;
		data.commitType = $scope.dataInputCondition.commitType;

		var request = {};
		request.data = data;

		api.dataInput.register(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'dataInputForm');
		});
	};

	$scope.download = function() {
		var error = false;

		var dataRange = $scope.dataInputCondition.dataRange;

		if($scope.dataInputForm.$invalid){
			error = true;
		}
		if ( !(dataRange && 0 < dataRange.length) ) {
			optionMessageControl.show($scope, 'dataRange', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if ( error ) {
			return;
		}

		var data = {};
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
//		data.inputType = $scope.dataInputCondition.inputType;
		data.dataInputTypeCd = $scope.dataInputCondition.dataInputTypeCd;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
		data.dataRange = $scope.dataInputCondition.dataRange;

		var request = {};
		request.data = data;

		api.dataInput.download(request).then(function(response){

			if (statusInfo.isSuccessAndShowMessage(response, 'dataInputForm')) {
				location.href = response.data.downloadUrl;
			}
		});
	};

	// [ON推-品向-918] Excelダウンロードを追加 2015.07.30 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DataInput.object:DataInput#xlsDownload
	 * @methodOf oneslogiWms.DataInput.object:DataInput
	 *
	 * @description
	 * 初期データ取込種別で選択した処理のテンプレートファイルをダウンロードする<br>
	 */
	$scope.xlsDownload = function() {

		// [#973] 英語対応 2017.03.23 kawana Start

		var downloadPath;

		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana Start
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
//		switch($scope.xlsDlForm.inputType){
		switch($scope.xlsDlForm.dataInputTypeCd){
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End
		case "01":
			downloadPath = "resources/menu/ProductMasterInitialInput.xlsx?downloadFile=xlsTemplate/ProductMasterInitialInput.xlsx";
			break;
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki Start
		case "02":
			downloadPath = "resources/menu/ProductShapeMasterInitialInput.xlsx?downloadFile=xlsTemplate/ProductShapeMasterInitialInput.xlsx";
			break;
		case "03":
			downloadPath = "resources/menu/CustomerMasterInitialInput.xlsx?downloadFile=xlsTemplate/CustomerMasterInitialInput.xlsx";
			break;
		case "04":
			downloadPath = "resources/menu/LocationMasterInitialInput.xlsx?downloadFile=xlsTemplate/LocationMasterInitialInput.xlsx";
			break;
		case "05":
			downloadPath = "resources/menu/StockInitialInput.xlsx?downloadFile=xlsTemplate/StockInitialInput.xlsx";
			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
		case "06":
			downloadPath = "resources/menu/CarrierZipMasterInitialInput.xlsx?downloadFile=xlsTemplate/CarrierZipMasterInitialInput.xlsx";
			break;
		case "07":
			downloadPath = "resources/menu/CarrierZipMasterInitialInput.xlsx?downloadFile=xlsTemplate/CarrierZipMasterInitialInput.xlsx";
			break;
		case "08":
			downloadPath = "resources/menu/ZipMasterInitialInput.xlsx?downloadFile=xlsTemplate/ZipMasterInitialInput.xlsx";
			break;
		case "09":
			downloadPath = "resources/menu/CompanyZipMasterInitialInput.xlsx?downloadFile=xlsTemplate/CompanyZipMasterInitialInput.xlsx";
			break;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
			// [エンハンス PH2.0]初期データ取込変更 2015.11.30 ki End
		}
		// [ON推-品向-919] 在庫データ取込を01から04に変更 2015.07.30 kawana End

		var cultureCd = $scope.$parent.culture.bCulture.cultureCd.replace("-","");
		if (cultureCd != "jaJP") {

			downloadPath = downloadPath.replace("xlsTemplate/", "xlsTemplate/" + cultureCd + "/" );
		}

		window.location = downloadPath;

		// [#973] 英語対応 2017.03.23 kawana End
	};
	// [ON推-品向-918] Excelダウンロードを追加 2015.07.30 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

