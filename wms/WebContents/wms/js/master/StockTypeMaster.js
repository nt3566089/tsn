/**
 * @ngdoc overview
 * @name oneslogiWms.StockTypeMaster
 *
 * @description
 * 在庫区分マスタ画面
 */
angular.module('oneslogiWms.StockTypeMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockTypeMaster.service:StockTypeMasterApi
 *
 * @description
 * 在庫区分マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/stockTypeMaster/init 初期化用WebApi<br>
 * ・resources/master/stockTypeMaster/search 検索用WebApi<br>
 * ・resources/master/stockTypeMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/stockTypeMaster/register 登録用WebApi<br>
 *
 */
.factory('stockTypeMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
		    [
		        ['query', 'GET', 'resources/common/centerClass/keyValueList']
		    ]
		),
		stockTypeList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/stockTypeMaster/init'],
			    ['fileUpload',  'POST',  'resources/master/stockTypeMaster/fileUpload'],
			    ['search', 'GET', 'resources/master/stockTypeMaster/search'],
			    ['excel',  'GET', 'resources/master/stockTypeMaster/search', 'excel'],
			    ['inputCheck', 'POST', 'resources/master/stockTypeMaster/inputCheck'],
			    ['register', 'POST', 'resources/master/stockTypeMaster/register'],
			    ['getMasterData', 'GET', 'resources/master/stockTypeMaster/getMasterData']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster
 *
 * @description
 * 在庫区分マスタ画面コントローラ
 */
.controller('StockTypeMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'stockTypeMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.stockTypeListCols =
		[
		    {field:"stockTypeCd", displayName:"在庫区分CD"},
		    {field:"vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"delFlg", displayName:"削除フラグ"},
		    //グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
		    {field:"reverseValidFlg", displayName:"逆転防止有効フラグ"}
		    //グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#initScreen
     * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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
			data: 'stockTypeList',
			columnDefs: 'stockTypeListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				},
				//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
				"reverseValidFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "reverseValidFlgList",
					removeBlank: "null"
				}
				//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End
		};

		$scope.gridEventOptions = {
				"stockTypeCd":{
					"ng-change":{
						eventFunction:"stockTypeCdBlur(row.rowIndex)"
					}
				},
				"vdict.dictNm":{
					"ng-change":{
						eventFunction:"stockTypeNmBlur(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgBlur(row.rowIndex)"
					}
				},
				//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
				"reverseValidFlg":{
					"ng-change":{
						eventFunction:"reverseValidFlgBlur(row.rowIndex)"
					}
				}
				//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End
		};

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "stockTypeList");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx)$/i,
				formData : uploadParam
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "stockTypeCd",5, 5);
		// 辞書マスタ存在異常
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "vdict.dictNm",6, 6);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#initScreenHttp
     * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
				 $scope.deferredGetReverseValidFlg()
				 //グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	$scope.stockTypeCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.stockTypeNmBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
	$scope.reverseValidFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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

	//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#deferredGetReverseValidFlg
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
	 *
	 * @description
	 * 逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReverseValidFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "REVERSE_VALID_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.reverseValidFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	//グリッドに逆転防止フラグを追加 2016.03.14 ichikawa End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#deferredGetInitData
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
	 *
	 * @description
	 * 在庫区分マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockTypeList.init().then(function(response){
			$scope.stockTypeMasterSearch = response.data.stockTypeMasterSearch;
			$scope.stockTypeList = response.data.stockTypeList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.stockTypeMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.stockTypeMasterSearch = owsHistory.popState();
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
     * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#search
     * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#getSearchData
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.stockTypeMasterSearch = $scope.stockTypeMasterSearch;

		api.stockTypeList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#setSearchData
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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
		$scope.stockTypeList = response.data.stockTypeList;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.stockTypeList.length; row++) {
			if ($scope.stockTypeList[row].stockTypeId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'stockTypeCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.stockTypeMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#getClassForRow
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#excelOutput
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.stockTypeMasterSearch = $scope.stockTypeMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "stockTypeList", document.title);

		api.stockTypeList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#addRow
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.stockTypeList.push(angular.copy($scope.blankRow));

		// 削除フラグが使用不可
		for (var row = 0; row < $scope.stockTypeList.length; row++) {
			if ($scope.stockTypeList[row].stockTypeId == null){
				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row);
			}
		}
		// 行番号振り直し
		updateRowNumber($scope.stockTypeList);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockTypeMstockTyper.object:StockTypeMaster#removeRow
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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
			if ($scope.stockTypeList.indexOf(row) > -1) {
				if (row.stockTypeId != null) {
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
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockTypeCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].stockTypeCd != null)
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
			if ($scope.stockTypeList.indexOf(row) > -1) {
				$scope.stockTypeList.splice($scope.stockTypeList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.stockTypeList);

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
		$scope.fileOptions.url = "resources/master/stockTypeMaster/fileUpload";
	}

	// Excelアップロード
	$scope.excelUploadSuccess = function(e, data) {

		// 処理前にグリッドをクリアする。
		$scope.stockTypeList = [];

		owsCommon.syncExec(function() {

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.stockTypeMasterSearch = $scope.stockTypeMasterSearch;
			request.data.stockTypeList        = data.result.data.stockTypeList;

			// マスタ取得
			api.stockTypeList.getMasterData(request).then(function(response){
				// 取得データセット
				$scope.stockTypeList = response.data.stockTypeList;

				// セット行ループ
				for (var row = 0; row < $scope.stockTypeList.length; row++) {

					// 既存行のキー項目が変更不可
					if ($scope.stockTypeList[row].stockTypeId != null){
						gridDirectiveControl.editable($scope.gridOptions, 'stockTypeCd', false, row); // stockTypeCd編集不可
					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
					}

				}

				// 行番号振り直し
				updateRowNumber($scope.stockTypeMaster);

				owsCommon.syncExec(function() {
					// 選択状態にする
					if ($scope.stockTypeList.length > 0){
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
	 * @name oneslogiWms.StockTypeMaster.object:StockTypeMaster#register
	 * @methodOf oneslogiWms.StockTypeMaster.object:StockTypeMaster
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

		if($scope.stockTypeList.length == 0){
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
		for (var row = 0; row < $scope.stockTypeList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// 空行を退避
				emptyBody.push($scope.stockTypeList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.stockTypeList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.stockTypeList[row]);
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

				// [ON推-品向-895] 重複チェック動作異常を修正(不要な削除) 2015.11.13 chou

				// 行番号振り直し
				updateRowNumber($scope.stockTypeList);

				// 在庫区分CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.stockTypeList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var stockTypeCd = $scope.stockTypeList[row].stockTypeCd;
						for (var i = row+1; i < $scope.stockTypeList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.stockTypeList[i].stockTypeCd == stockTypeCd){
									rowIndex[j] =i;
									j++;
								}
							}
						}
					}
				}
				if (j > 0){
					// エラーメッセージCD
					var messageCd = "stockTypeCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "stockTypeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}

				// [ON推-品向-895] 明細に同じデータ2行追加して、登録すると異常終了する。2015.11.13 chou Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.stockTypeList.splice($scope.stockTypeList.indexOf(row), 1);
				});
				// [ON推-品向-895] 明細に同じデータ2行追加して、登録すると異常終了する 2015.11.13 chou End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.stockTypeList = listBody;
				request.data.stockTypeMasterSearch = $scope.stockTypeMasterSearch;

				// 入力チェック
				api.stockTypeList.inputCheck(request).then(function(response){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 在庫区分マスタデータ登録または更新
					api.stockTypeList.register(request).then(function(response){
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
				// 在庫区分CD重複
				if (!gridOptionMessageControl.isShow($scope.gridOptions, "stockTypeCd", response.status.listStatus[i].status.rowIndex)) {
					gridOptionMessageControl.show($scope.gridOptions, "stockTypeCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
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
