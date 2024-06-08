/**
 * @ngdoc overview
 * @name oneslogiWms.NumberingCenterMaster
 *
 * @description
 * センタ採番マスタ画面
 */
angular.module('oneslogiWms.NumberingCenterMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.NumberingCenterMaster.service:numberingCenterMasterApi
 *
 * @description
 * センタ採番マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/numberingCenterMaster/init 初期化用WebApi<br>
 * ・resources/master/numberingCenterMaster/search 検索用WebApi<br>
 * ・resources/master/numberingCenterMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/numberingCenterMaster/register 登録用WebApi<br>
 *
 */
.factory('numberingCenterMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		numberingCenterList: AngularAPIClient.make(
				[
				 ['init',   	'GET', 'resources/master/numberingCenterMasterList/init'],
				 ['search', 	'GET', 'resources/master/numberingCenterMasterList/search'],
				 ['excel',      'GET', 'resources/master/numberingCenterMasterList/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/numberingCenterMasterList/inputCheck'],
				 ['register', 	'POST', 'resources/master/numberingCenterMasterList/register']
				 ]
		)
	};
}])

.controller('NumberingCenterMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'numberingCenterMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.numberingCenterListCols =
		[
		 {field:"centerCd", displayName:"センタ"},
		 {field:"bizCd", displayName:"業務CD"},
		 {field:"bizNm", displayName:"業務名称"},
		 {field:"delFlg", displayName:"削除フラグ"},
		 {field:"length", displayName:"桁数"},
		 {field:"presentNumber", displayName:"現在値"},
		 {field:"minNumber", displayName:"最小値"},
		 {field:"maxNumber", displayName:"最大値"},
		 {field:"checkDigit", displayName:"チェックディジット"},
		 {field:"numberingSample", displayName:"採番例"},
		 {field:"cashCount", displayName:"キャッシュ数"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#initScreen
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'list',
			columnDefs: 'numberingCenterListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"checkDigit" : {
					key: "classCd",
					value : "classNm",
					listModel : "checkDigitList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		$scope.gridEventOptions = {
				"bizCd":{
					"ng-change":{
						eventFunction:"bizCdChange(row.rowIndex)"
					}
				},
				"bizNm":{
					"ng-change":{
						eventFunction:"bizNmChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				},
				"length":{
					"ng-change":{
						eventFunction:"lengthChange(row.rowIndex)"
					}
				},
				"presentNumber":{
					"ng-change":{
						eventFunction:"presentNumberChange(row.rowIndex)"
					}
				},
				"minNumber":{
					"ng-change":{
						eventFunction:"minNumberChange(row.rowIndex)"
					}
				},
				"maxNumber":{
					"ng-change":{
						eventFunction:"maxNumberChange(row.rowIndex)"
					}
				},
				"checkDigit":{
					"ng-change":{
						eventFunction:"checkDigitChange(row.rowIndex)"
					}
				},

				"cashCount":{
					"ng-change":{
						eventFunction:"cashCountChange(row.rowIndex)"
					}
				}
		};
		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "bizCd",8, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "presentNumber",6, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "presentNumber",6, 7);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "presentNumber",6, 8);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "minNumber",6, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "minNumber",6, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "minNumber",6, 6);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "maxNumber",6, 4);
		// [#3641][Ver3.0] センタ採番マスタメンテナンス - 入力値チェックエラー表示不正 2018.02.08 honma Mod End
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Mod Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "delFlg", 8, 7);
		// [#3588][Ver3.0] センタ採番マスタメンテナンス - 削除時チェック処理 2018.02.08 honma Mod End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#initScreenHttp
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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
				 $scope.deferredGetCheckDigit()
				 ]
				)
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	$scope.bizCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.bizNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.lengthChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.presentNumberChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.minNumberChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.maxNumberChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.checkDigitChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.cashCountChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#deferredGetCheckDigit
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * チェックディジット取得・設定処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCheckDigit = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "CHECK_DIGIT";
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.checkDigitList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#deferredGetInitData
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * センタ採番マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.numberingCenterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.list = response.data.list;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
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
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#search
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		$scope.getSearchData();
	};

	var centerId;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#getSearchData
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		api.numberingCenterList.search(request).then(function(response) {

			centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#setSearchData
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする

		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.list = response.data.list;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.list.length; row++) {
			if ($scope.list[row].numberingCenterId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'bizCd', false, row);

				gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, row);

			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#getClassForRow
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#excelOutput
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.numberingCenterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#addRow
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function() {

		var addRow = angular.copy($scope.blankRow);
		addRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		if (0 < $scope.list.length) {
			addRow.mcenter.centerCd = $scope.list[0].mcenter.centerCd;
		} else {
			addRow.mcenter.centerCd = userInfo.centerCd;
		}
		addRow.centerId = userInfo.centerIdByCd(addRow.mcenter.centerCd);
		$scope.list.push(addRow);

		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);
		gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, $scope.list.length-1);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#removeRow
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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
			if ($scope.list.indexOf(row) > -1) {
				if (row.numberingCenterId != null) {
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
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].bizCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].bizCd != null)||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].bizNm !=""&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].bizNm != null)
				||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				item++;
			}
		}
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.list.indexOf(row) > -1) {
				$scope.list.splice($scope.list.indexOf(row), 1);
			}
		});

		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster#register
	 * @methodOf oneslogiWms.NumberingCenterMaster.object:NumberingCenterMaster
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

		if($scope.list.length == 0){
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
		for (var row = 0; row < $scope.list.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// 空行を退避
				emptyBody.push($scope.list[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.list[row]);
			}else {

				// 空行以外を退避
				listBody.push($scope.list[row]);
			}
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// 空行への検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行のため削除 2017.09.21 honma Delete

				// 業務CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.list.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var bizCd = $scope.list[row].bizCd;
						for (var i = row+1; i < $scope.list.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.list[i].bizCd == bizCd){
									rowIndex[j] =i;
									j++;
								}
							}
						}
					}
				}
				if (j > 0){

					// エラーメッセージCD
					var messageCd = "bizCdDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "bizCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');

					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});
				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.list = listBody;

				// 入力チェック
				api.numberingCenterList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					api.numberingCenterList.register(request).then(function(response){
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
			});
		});
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
