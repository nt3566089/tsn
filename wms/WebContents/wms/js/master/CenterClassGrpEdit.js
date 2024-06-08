/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClassGrpEdit
 *
 * @description
 * センタ区分値グループマスタ画面
 */
angular.module('oneslogiWms.CenterClassGrpEdit',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClassGrpEdit.service:centerClassGrpEditApi
 *
 * @description
 * センタ区分値グループマスタWebApi定義<br>
 * ・resources/class/keyValueList 削除、システム種別ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/centerClassGrpEdit/init 画面用初期データ取得用WebApi<br>
 * ・resources/master/centerClassGrpEdit/inputCheck 入力チェック（更新）用WebApi<br>
 * ・resources/master/centerClassGrpEdit/update 入力データ更新用WebApi<br>
 *
 */
.factory('centerClassGrpEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		centerClassGrpEdit: AngularAPIClient.make(
			[
			    ['init',       'GET',  'resources/master/centerClassGrpEdit/init'],
			    ['inputCheck', 'POST', 'resources/master/centerClassGrpEdit/inputCheck'],
			    ['update',     'POST', 'resources/master/centerClassGrpEdit/update']
			]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
 *
 * @description
 * センタ区分値グループマスタ画面コントローラ
 */
.controller('CenterClassGrpEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'centerClassGrpEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	var centerClassId;
	//グリッドの列情報（デザイン用）
	$scope.centerClassGrpMasterEditCols =
		[
		 {field:"classGrpCd", displayName:"区分値グループCD"},
		 {field:"classGrpComment", displayName:"区分値グループ解説"},
		 {field:"delFlg", displayName:"削除"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#initScreen
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
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
			data: 'centerClassGrpMasterEdit',
			columnDefs: 'centerClassGrpMasterEditCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList"
				}
		};

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"classGrpCd":{
					"ng-change":{
						eventFunction:"classGrpCdChange(row.rowIndex)"
					}
				},
				"classGrpComment":{
					"ng-change":{
						eventFunction:"classGrpCommentChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		// 前画面で区分値IDをセット
		centerClassId = $route.current.params.centerClassId;

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#initScreenHttp
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetSystemTypeList(),
				 $scope.deferredGetDelFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * システム種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSystemTypeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SYSTEM_TYPE";

		api.keyValueList.query(request).then(function(response){
			$scope.systemTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.classGrpCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.classGrpCommentChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
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
		api.keyValueList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * センタ区分値グループマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = {};
		request.centerClassId = centerClassId;

		api.centerClassGrpEdit.init(request).then(function(response){
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.deferredSetInitData(response);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#deferredSetInitData
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.deferredSetInitData = function(response) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// 取得したデータをヘッダに表示
		$scope.centerClassGrpEditSearch = response.data.head;
		//取得したデータをグリッドに表示
		$scope.centerClassGrpMasterEdit = response.data.body;
		// 空行用のオブジェクト
		$scope.blankRow = response.data.blankRow;

		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.centerClassGrpMasterEdit.length; row++) {
			if ($scope.centerClassGrpMasterEdit[row].classGrpCd != null){
				gridDirectiveControl.editable($scope.gridOptions, 'classGrpCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClassGrpEditSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#addRow
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		// 明細のデフォルトをセット
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

		$scope.centerClassGrpMasterEdit.push(angular.copy($scope.blankRow));
		// 行番号振り直し
		updateRowNumber($scope.centerClassGrpMasterEdit);
		centerCd = $scope.centerClassGrpEditSearch.mcenter.centerCd;

		// [#7128][OSS] 行追加で追加された行の削除列が非活性になるように修正 2020.01.23 tsuboi Start
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.centerClassGrpMasterEdit.length-1);
		// [#7128][OSS] 行追加で追加された行の削除列が非活性になるように修正 2020.01.23 tsuboi End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#removeRow
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 明細が表示されていないの場合、エラーメッセージを表示
		if($scope.centerClassGrpMasterEdit.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// 行が選択されていない場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行が選択されている場合、確認画面を表示し、キャンセルされたら、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
				return;
			}
		}

		// 削除行が選択を既存行の場合、エラーメッセージを表示
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.centerClassGrpMasterEdit.indexOf(row) > -1) {
				if (row.centerClassGrpId != null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}

		// 入力のある行を削除する場合はメッセージを出力
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 1) {
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].classGrpCd != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].classGrpCd != null)
				|| ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].classGrpComment != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].classGrpComment != null)
					||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg != owsCommon.getDefaultValue($scope.delFlgList)){
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
			}
		}

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.centerClassGrpMasterEdit.indexOf(row) > -1) {
				$scope.centerClassGrpMasterEdit.splice($scope.centerClassGrpMasterEdit.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.centerClassGrpMasterEdit);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#register
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
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

		if($scope.centerClassGrpMasterEdit.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
		// 空行判定
		for (var row = 0; row < $scope.centerClassGrpMasterEdit.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
				// 空行を退避
				emptyBody.push($scope.centerClassGrpMasterEdit[row]);
			} else {
				// 空行以外を退避
				listBody.push($scope.centerClassGrpMasterEdit[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.centerClassGrpMasterEdit.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.centerClassGrpMasterEdit.splice($scope.centerClassGrpMasterEdit.indexOf(row), 1);
				});

				// 行番号振り直し
				updateRowNumber($scope.centerClassGrpMasterEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();

				for (var row = 0; row < $scope.centerClassGrpMasterEdit.length; row++) {
					var classGrpCd = $scope.centerClassGrpMasterEdit[row].classGrpCd;
					for (var i = row+1; i < $scope.centerClassGrpMasterEdit.length; i++) {
						if ($scope.centerClassGrpMasterEdit[i].classGrpCd == classGrpCd){
							rowIndex[j] =i;
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//							errAry[j] = "classGrpCdDuplicateError";
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
							j++;
						}
					}
				}

				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "classGrpCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "classGrpCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "classGrpCdDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "classGrpCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.centerClassGrpMasterEdit.splice($scope.centerClassGrpMasterEdit.indexOf(row), 1);
//				});
//
//				// 行番号振り直し
//				updateRowNumber($scope.centerClassGrpMasterEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = {};
				request.data.head.centerClassId = centerClassId;
				request.data.body = $scope.centerClassGrpMasterEdit;

				// 入力チェック
				api.centerClassGrpEdit.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// センタ区分値グループマスタデータ登録または更新
					api.centerClassGrpEdit.update(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 前画面に戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

						// [#462] スクリプトエラー発生(問題のコード削除) 2017.03.14 kawana
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit#getClassForRow
	 * @methodOf oneslogiWms.CenterClassGrpEdit.object:CenterClassGrpEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 削除フラグに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
