/**
 * @ngdoc overview
 * @name oneslogiWms.ProcessTypeMaster
 *
 * @description
 * 処理区分マスタ画面
 */
angular.module('oneslogiWms.ProcessTypeMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ProcessTypeMaster.service:processTypeMasterApi
 *
 * @description
 * 処理区分マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得用WebAPI<br>
 * ・resources/master/processTypeMaster/init 初期化用WebApi<br>
 * ・resources/master/processTypeMaster/search 検索用WebApi<br>
 * ・resources/master/processTypeMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/processTypeMaster/register 登録用WebApi<br>
 *
 */
.factory('processTypeMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		processTypeList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/processTypeMaster/init'],
			    ['fileUpload',  'POST',  'resources/master/processTypeMaster/fileUpload'],
			    ['search', 'GET', 'resources/master/processTypeMaster/search'],
			    ['excel',  'GET', 'resources/master/processTypeMaster/search', 'excel'],
			    ['inputCheck', 'POST', 'resources/master/processTypeMaster/inputCheck'],
			    ['register', 'POST', 'resources/master/processTypeMaster/register'],
			    ['getMasterData', 'GET', 'resources/master/processTypeMaster/getMasterData']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
 *
 * @description
 * 処理区分マスタ画面コントローラ
 */
.controller('ProcessTypeMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'processTypeMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.processTypeListCols =
		[
		    {field:"processTypeCd", displayName:"処理区分CD"},
		    {field:"vdict.dictNm", displayName:"処理区分名称"},
		    {field:"receiveFlg", displayName:"入荷フラグ"},
		    {field:"shippingFlg", displayName:"出荷フラグ"},
		    {field:"stockAdjustFlg", displayName:"在庫調整フラグ"},
		    {field:"defaultFlg", displayName:"デフォルトフラグ"},
		    {field:"mstockType.stockTypeCd", displayName:"在庫区分"},
		    {field:"delFlg", displayName:"削除フラグ"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#initScreen
     * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'processTypeList',
			columnDefs: 'processTypeListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mstockType.stockTypeCd" :{
					key : "stockTypeCd",
					value : "stockTypeNm",
					listModel : "stockTypeList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		$scope.gridEventOptions = {
				"processTypeCd":{
					"ng-change":{
						eventFunction:"processTypeCdBlur(row.rowIndex)"
					}
				},
				"vdict.dictNm":{
					"ng-change":{
						eventFunction:"processTypeNmBlur(row.rowIndex)"
					}
				},
				"receiveFlg":{
					"ng-click":{
						eventFunction:"receiveFlgBlur(row.rowIndex)"
					}
				},
				"shippingFlg":{
					"ng-click":{
						eventFunction:"shippingFlgBlur(row.rowIndex)"
					}
				},
				"stockAdjustFlg":{
					"ng-click":{
						eventFunction:"stockAdjustFlgBlur(row.rowIndex)"
					}
				},
				"defaultFlg":{
					"ng-click":{
						eventFunction:"defaultFlgBlur(row.rowIndex)"
					}
				},
				"mstockType.stockTypeCd":{
					"ng-change":{
						eventFunction:"StockTypeblur(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgBlur(row.rowIndex)"
					}
				}
		};

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "processTypeList");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "processTypeCd",5, 5);
		// 辞書マスタ存在異常
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "vdict.dictNm",6, 6);
		// 在庫区分エラーとする
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mstockType.stockTypeCd",7, 7);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#initScreenHttp
     * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetReceiveFlg(),
				 $scope.deferredGetShippingFlg(),
				 $scope.deferredGetStockAdjustFlg(),
				 $scope.deferredGetDefaultFlg(),
				 $scope.deferredGetStockTypeList(),
				 $scope.deferredGetDelFlg()
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	$scope.processTypeCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.processTypeNmBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.receiveFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.shippingFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.stockAdjustFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.defaultFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.StockTypeblur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetReceiveFlg
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * 入荷フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReceiveFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RECEIVE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.receiveFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetShippingFlg
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * 出荷フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.shippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetStockAdjustFlg
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * 在庫調整フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockAdjustFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_ADJUST_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.stockAdjustFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetDefaultFlg
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * デフォルトフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDefaultFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEFAULT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.defaultFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {

		var deferred = $q.defer();

		var request = {};

		// 在庫区分
		api.stockType.keyValueList(request).then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
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
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#deferredGetInitData
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * 処理区分マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.processTypeList.init().then(function(response){
			$scope.processTypeMasterSearch = response.data.processTypeMasterSearch;
			$scope.processTypeList = response.data.processTypeList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.processTypeMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.processTypeMasterSearch = owsHistory.popState();
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
     * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#search
     * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		$scope.getSearchData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#getSearchData
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.processTypeMasterSearch = $scope.processTypeMasterSearch;

		api.processTypeList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#setSearchData
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す処理
		$scope.gridOptions.gridViewport.scrollTop(0);
		// 検索ボタン押下後のスクロール位置を上に戻す処理

		//取得したデータをグリッドに表示
		$scope.processTypeList = response.data.processTypeList;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.processTypeList.length; row++) {
			if ($scope.processTypeList[row].processTypeId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'processTypeCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.processTypeMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#getClassForRow
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
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
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#excelOutput
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.processTypeMasterSearch = $scope.processTypeMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "processTypeList", document.title);

		api.processTypeList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#addRow
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.processTypeList.push(angular.copy($scope.blankRow));

		// 削除フラグが使用不可
		for (var row = 0; row < $scope.processTypeList.length; row++) {
			if ($scope.processTypeList[row].processTypeId == null){
				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row);
			}
		}
		// 行番号振り直し
		updateRowNumber($scope.processTypeList);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#removeRow
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
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
			if ($scope.processTypeList.indexOf(row) > -1) {
				if (row.processTypeId != null) {
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

		var flg = false;

		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
				return;
			}
		}else{
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].processTypeCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].processTypeCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveFlg != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveFlg != null
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveFlg != "0")
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingFlg != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingFlg != null
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingFlg != "0")
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockAdjustFlg != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockAdjustFlg != null
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockAdjustFlg != "0")
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != null
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != "0")
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].mstockType.stockTypeCd !=""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mstockType.stockTypeCd != null)
				||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				flg =true;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict != null) {
				if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict.dictNm != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict.dictNm != null) {
					flg =true;
				}
			}

			if (flg) {
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
			}
		}

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.processTypeList.indexOf(row) > -1) {
				$scope.processTypeList.splice($scope.processTypeList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.processTypeList);

		// 明細　ヘッダー行の選択クリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	// Excelアップロード前処理
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/master/processTypeMaster/fileUpload";
	}

	// Excelアップロード
	$scope.excelUploadSuccess = function(e, data) {

		// 処理前にグリッドをクリアする。
		$scope.processTypeList = [];

		owsCommon.syncExec(function() {

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.processTypeMasterSearch = $scope.processTypeMasterSearch;
			request.data.processTypeList        = data.result.data.processTypeList;

			// マスタ取得
			api.processTypeList.getMasterData(request).then(function(response){
				// 取得データセット
				$scope.processTypeList = response.data.processTypeList;

				// セット行ループ
				for (var row = 0; row < $scope.processTypeList.length; row++) {

					// 既存行のキー項目が変更不可
					if ($scope.processTypeList[row].processTypeId != null){
						gridDirectiveControl.editable($scope.gridOptions, 'processTypeCd', false, row); // processTypeCd編集不可
					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
					}

				}

				// 行番号振り直し
				updateRowNumber($scope.processTypeMaster);

				owsCommon.syncExec(function() {
					// 選択状態にする
					if ($scope.processTypeList.length > 0){
						owsCommon.toggleSelectAll($scope.gridOptions, true);
					}else{
						owsCommon.toggleSelectAll($scope.gridOptions, false);
					}
				});

			})

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				return;
			}
		},3)
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster#register
	 * @methodOf oneslogiWms.ProcessTypeMaster.object:ProcessTypeMaster
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

		if($scope.processTypeList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.processTypeList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// 空行を退避
				emptyBody.push($scope.processTypeList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.processTypeList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.processTypeList[row]);
			}
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [ON推-品向-896] 重複チェック動作異常を修正(不要な削除) 2015.11.13 chou

				// 行番号振り直し
				updateRowNumber($scope.processTypeList);

				// 在庫区分チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				for (var row = 0; row < $scope.processTypeList.length; row++) {
					var receiveFlg = $scope.processTypeList[row].receiveFlg;
					var shippingFlg = $scope.processTypeList[row].shippingFlg;
					var stockTypeCd = null;
					if ($scope.processTypeList[row].mstockType != null) {
						stockTypeCd = $scope.processTypeList[row].mstockType.stockTypeCd;
					}

					// 入荷フラグ又は出荷フラグ='1'、在庫区分未入力場合空白の場合、該当行の在庫区分でエラーメッセージを表示する：「必須」
					if ((receiveFlg == 1 || shippingFlg == 1) && (stockTypeCd == "" || stockTypeCd == null)){
						rowIndex[j] = row;
						errAry[j] = "requiredError";
						j++;
					}
				}
				// エラー対象データにエラー情報表示
				if (j > 0){
					gridOptionMessageControl.show($scope.gridOptions, "mstockType.stockTypeCd", $filter('owfMessage')(errAry[0]), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 処理区分CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.processTypeList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var processTypeCd = $scope.processTypeList[row].processTypeCd;
						for (var i = row+1; i < $scope.processTypeList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.processTypeList[i].processTypeCd == processTypeCd){
									rowIndex[j] =i;
									j++;
								}
							}
						}
					}
				}
				if (j > 0){
					// エラーメッセージCD
					var messageCd = "processTypeCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "processTypeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}

				// [ON推-品向-896] 明細に同じデータ2行追加して、登録すると異常終了する。2015.11.13 chou Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.processTypeList.splice($scope.processTypeList.indexOf(row), 1);
				});
				// [ON推-品向-896] 明細に同じデータ2行追加して、登録すると異常終了する 2015.11.13 chou End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.processTypeList = listBody;
				request.data.processTypeMasterSearch = $scope.processTypeMasterSearch;

				// 入力チェック
				api.processTypeList.inputCheck(request).then(function(response){
					// 在庫区分が存在しないエラーとする。
					for (var i = 0; i < response.status.listStatus.length; i++) {
				      if (response.status.listStatus[i].status.statusCode == 7){
					    gridOptionMessageControl.show($scope.gridOptions, "mstockType.stockTypeCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
					    return;
				      }
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 処理区分マスタデータ登録または更新
					api.processTypeList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();

						owsCommon.toggleSelectAll($scope.gridOptions, false);

					});
				});
			});

		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});

	};

	// サーバ処理結果に従い、エラー・警告・情報を表示する
	var controlStatus = function (response, formName) {
		// 情報がない場合は何もしない
		if (response.status.listStatus == null || response.status.listStatus.length == 0) {
			return true;
		}

		var error = false;

		// 業務エラーを処理
		for (var i = 0; i < response.status.listStatus.length; i++) {

			// 正常・確認以外はエラー
			if (response.status.listStatus[i].status.statusCode > 1) {
				error = true;
			}

			switch (response.status.listStatus[i].status.statusCode) {
			case 0:
				// 正常終了
				continue;
			case 1:
				// ユーザによる確認
				continue;
			case 2:
				// 処理区分CD重複
				if (!gridOptionMessageControl.isShow($scope.gridOptions, "processTypeCd", response.status.listStatus[i].status.rowIndex)) {
					gridOptionMessageControl.show($scope.gridOptions, "processTypeCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
				}
				break;
			default:
				if (response.status.listStatus[i].status.statusCode > 0) {
					alertMessage.setErrorMessageByCode($filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
				}
			}
		}

		var cancel = false;

		// ユーザ確認を処理
		for (var i = 0; i < response.status.listStatus.length; i++) {
			if (response.status.listStatus[i].status.statusCode == 1) {
				if (!cancel) {
					var ret = owsCommon.viewConfirm(response.status.messageCode);
					if (!ret) {
						cancel = true;
					}
				}
			}
		}

		// キャンセルがある場合は終了
		if (cancel) {
			return false;
		}

		// 正常終了を処理
		for (var i = 0; i < response.status.listStatus.length; i++) {
			if (response.status.listStatus[i].status.statusCode == 0) {
				if (response.status.messageCode != null && response.status.messageCode != "") {
					alertMessage.setInfoMessageByCode(response.status.messageCode, response.status.messageReplaceValue);
				}
			}
		}

		return !error;
	}

	//画面初期化処理を実行
	$scope.initScreen();

}]);
