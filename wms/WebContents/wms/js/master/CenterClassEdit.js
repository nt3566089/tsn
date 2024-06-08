/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClassEdit
 *
 * @description
 * センタ区分値マスタメンテナンス(編集)画面<br>
 *
 */
angular.module('oneslogiWms.CenterClassEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClassEdit.service:CenterClassEditApi
 *
 * @description
 * センタ区分値マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>

 * センタ区分値データ操作用WebApi
 * ・resources/class/keyValueList
 * <br>
 *   centerClassEditApi センタ区分値マスタデータ操作用WebApi<br>
 * ・resources/master/centerClassEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/centerClassEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/centerClassEdit/inputCheckRegister 登録前入力チェックWebAPI<br>
 * ・resources/master/centerClassEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/centerClassEdit/inputCheckUpdate 更新前入力チェックWebAPI<br>
 * ・resources/master/centerClassEdit/update 入力データ更新WebAPI<br>
 */
.factory('centerClassEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		centerClassEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/centerClassEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/centerClassEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/centerClassEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/centerClassEdit/register'],
				 ['update',             'POST', 'resources/master/centerClassEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit
 *
 * @description
 * センタ区分値マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CenterClassEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'centerClassEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.centerClassEditCols = [
	                               {field:"classDtlCd" , displayName:"区分値明細CD"},
	                               {field:"vdict.dictNm", displayName:"区分値明細名"},
	                               {field:"viewOrder"  , displayName:"表示順"},
	                               {field:"defaultFlg" , displayName:"デフォルト"},
	                               {field:"delFlg"     , displayName:"削除"}
	                               ];

	var bodyList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#initScreen
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'centerClassEdit',
			columnDefs: 'centerClassEditCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList"
				}
		};
		// グリッドのデフォルト列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"defaultFlg":{
					"ng-click":{
						eventFunction:"defaultFlgChange(row.rowIndex)"
					}
				}
		};

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"classDtlCd":{
					"ng-change":{
						eventFunction:"classDtlCdChange(row.rowIndex)"
					}
				},
				"vdict.dictNm":{
					"ng-change":{
						eventFunction:"dictNmChange(row.rowIndex)"
					}
				},
				"viewOrder":{
					"ng-change":{
						eventFunction:"viewOrderChange(row.rowIndex)"
					}
				},
				"defaultFlg":{
					"ng-click":{
						eventFunction:"defaultFlgChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "vdict.dictNm",7,2 );

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.classDtlCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.dictNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.viewOrderChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.defaultFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		for (var i = 0; i < $scope.centerClassEdit.length; i++) {
			if (i != rowIndex){
				$scope.centerClassEdit[i].defaultFlg = "0";
			}
		}
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#initScreenHttp
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
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
				 $scope.deferredGetDelFlg(),
				 $scope.deferredSystemTypeList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * システム種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredSystemTypeList = function () {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "SYSTEM_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.systemTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PHYSICAL_DELETE";

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * センタマスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			// 訂正
			var request = {};
			request.centerClassId = $route.current.params.centerClassId;

			api.centerClassEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					history.back();
					deferred.reject();
					return;
				}
				// 行番号振り直し
				updateRowNumber($scope.centerClassEdit);

				$scope.head = response.data.head; // センタ区分値マスタメンテナンスヘッダ関連  getBClassDtlList
				$scope.centerClassEdit = response.data.body; // センタ区分値マスタメンテナンス明細関連
				bodyList = response.data.body;
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				// ログイン情報より初期値を設定
				//$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

				directiveControl.editable($scope,"centerCd",false);
				directiveControl.editable($scope,"classCd",false);

				//既存行のキー項目が変更不可
				for (var row = 0; row < $scope.centerClassEdit.length; row++) {
					if ($scope.centerClassEdit[row].classDtlCd != null){
						gridDirectiveControl.editable($scope.gridOptions, 'classDtlCd', false, row);
					}
				}

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.centerClassEdit.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				$scope.head = response.data.head; // センタマスタメンテナンスヘッダ関連
				$scope.centerClassEdit = response.data.body;
				bodyList = response.data.body;
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				// ログイン情報より初期値を設定
				//$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

				// 削除の初期値設定
				directiveControl.editable($scope,"delFlg",false);
				$scope.head.delFlg = "0";

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#getClassForRow
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * センタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#addRow
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

		if ($scope.screenMode == SCREEN_MODE.Update) {
			$scope.centerClassEdit.push(angular.copy($scope.blankRow));
			// 行番号振り直し
			updateRowNumber($scope.centerClassEdit);

		} else {
			$scope.centerClassEdit.push(angular.copy($scope.blankRow));

			// 行番号振り直し
			updateRowNumber($scope.centerClassEdit);
		}
		// [#6806][OSS] 行追加で追加された行の削除列が日活性になるように修正 2019.11.11 tsuboi Start
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.centerClassEdit.length-1);
		// [#6806][OSS] 行追加で追加された行の削除列が日活性になるように修正 2019.11.11 tsuboi End
	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#removeRow
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
				return;
			}
		}

		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.centerClassEdit.indexOf(row) > -1) {
				if (row.centerClassDtlId != null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}

		var flg = false;

		// 入力のある行を削除する場合はメッセージを出力
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 1) {
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].classDtlCd    != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].classDtlCd != null)
			   || ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].viewOrder  != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].viewOrder  != null)
		       || ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != null  && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].defaultFlg != "0")
			   ||  $scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg     != owsCommon.getDefaultValue($scope.delFlgList)){
				flg =true;
			}

			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict != null) {
				if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict.dictNm != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].vdict.dictNm != null) {
					flg =true;
				}
			}
		}

		if (flg) {
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}
		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.centerClassEdit.indexOf(row) > -1) {
				$scope.centerClassEdit.splice($scope.centerClassEdit.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.centerClassEdit);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassEdit.object:CenterClassEdit#register
	 * @methodOf oneslogiWms.CenterClassEdit.object:CenterClassEdit
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

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
		// 空行判定
		for (var row = 0; row < $scope.centerClassEdit.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
				// 空行を退避
				emptyBody.push($scope.centerClassEdit[row]);
			} else {
				// 空行以外を退避
				listBody.push($scope.centerClassEdit[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.inputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.centerClassEdit.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('inputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.centerClassEdit.splice($scope.centerClassEdit.indexOf(row), 1);
				});

				// 行番号振り直し
				updateRowNumber($scope.centerClassEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				var isBln = false;
				// センタ区分値明細CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				for (var row = 0; row < $scope.centerClassEdit.length; row++) {
					var classDtlCd = $scope.centerClassEdit[row].classDtlCd;
					for (var i = row+1; i < $scope.centerClassEdit.length; i++) {
						if ($scope.centerClassEdit[i].classDtlCd == classDtlCd){
							rowIndex[j] =i;
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//							errAry[j] = "classDtlCdDuplicateError";
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
							j++;
						}
					}
				}
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//					if (!gridOptionMessageControl.isShow($scope.gridOptions, "classDtlCd", rowIndex[row])) {
//						gridOptionMessageControl.show($scope.gridOptions, "classDtlCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						isBln = true;
//					}
//				}
					isBln = true;
					// エラーメッセージCD
					var messageCd = "classDtlCdDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "classDtlCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
				}

				// 表示順重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				for (var row = 0; row < $scope.centerClassEdit.length; row++) {
					var viewOrder  = $scope.centerClassEdit[row].viewOrder;
					for (var i = row+1; i < $scope.centerClassEdit.length; i++) {
						if ($scope.centerClassEdit[i].viewOrder == viewOrder){
							rowIndex[j] =i;
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//							errAry[j] = "viewOrderDuplicateError";
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
							j++;
						}
					}
				}
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//					if (!gridOptionMessageControl.isShow($scope.gridOptions, "viewOrder", rowIndex[row])) {
//						gridOptionMessageControl.show($scope.gridOptions, "viewOrder", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						isBln = true;
//					}
//				}
					isBln = true;
					// エラーメッセージCD
					var messageCd = "viewOrderDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "viewOrder", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
				}

				if(isBln == true){
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.centerClassEdit.splice($scope.centerClassEdit.indexOf(row), 1);
//				});
//
//				// 行番号振り直し
//				updateRowNumber($scope.centerClassEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.centerClassEdit.inputCheck;
					execFunc = api.centerClassEdit.update;
					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						//history.back();
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.centerClassEdit.inputCheck;
					execFunc = api.centerClassEdit.register;

					successFunc = function(){
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

						// 初期化
						$scope.initScreenHttp();
						//history.back();
					}
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				bodyList = listBody;
				request.data.body = bodyList;

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//センタ区分値CDで重複エラー異常
							if (checkResponse.status.listStatus[i].status.statusCode == 6){
								optionMessageControl.show($scope, "classCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// センタマスタメンテナンスデータ登録または更新
					execFunc(request).then(function(execResponse){

						// 処理結果確認
						if(execFunc == api.centerClassEdit.register){

							if (execResponse.status.listStatus != null){
								for (var i = 0 ;i <execResponse.status.listStatus.length;i++){
									//センタ区分値CDで重複エラー異常
									if (execResponse.status.listStatus[i].status.statusCode == 6){
										optionMessageControl.show($scope, "classCd", $filter('owfMessage')(execResponse.status.listStatus[i].status.messageCode, execResponse.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}

							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								return;
							}


						}else if(execFunc == api.centerClassEdit.update){

							if (execResponse.status.listStatus != null){
								for (var i = 0 ;i <execResponse.status.listStatus.length;i++){
									//センタ区分値CDで重複エラー異常
									if (execResponse.status.listStatus[i].status.statusCode == 6){
										optionMessageControl.show($scope, "classCd", $filter('owfMessage')(execResponse.status.listStatus[i].status.messageCode, execResponse.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}

							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								return;
							}

						}
						// 完了後の処理
						successFunc(execResponse);
					});

				});

			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

	};


	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
