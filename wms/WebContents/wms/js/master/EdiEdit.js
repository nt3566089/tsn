/**
 * @ngdoc overview
 * @name oneslogiWms.EdiEdit
 *
 * @description
 * EDIマスタメンテナンス(編集)画面<br>
 *
 */
angular.module('oneslogiWms.EdiEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.EdiEdit.service:EdiEditApi
 *
 * @description
 * EDIマスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>

 * EDIデータ操作用WebApi
 * <br>
 *   ediEditApi EDIマスタデータ操作用WebApi<br>
 * ・resources/master/ediEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/ediEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/ediEdit/inputCheckRegister 登録前入力チェックWebAPI<br>
 * ・resources/master/ediEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/ediEdit/inputCheckUpdate 更新前入力チェックWebAPI<br>
 * ・resources/master/ediEdit/update 入力データ更新WebAPI<br>
 */
.factory('ediEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		ediEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/ediEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/ediEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/ediEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/ediEdit/register'],
				 ['update',             'POST', 'resources/master/ediEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.EdiEdit.object:EdiEdit
 *
 * @description
 * EDIマスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('EdiEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ediEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.ediEditCols = [
	                               {field:"columnNm" , displayName:"項目名"},
	                               {field:"delFlg"     , displayName:"削除"}
	                               ];

	var bodyList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#initScreen
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'ediEdit',
			columnDefs: 'ediEditCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList"
				}
		};

		// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana

		// [#979] 入力行以外も登録されるため、入力行を自動でチェックする処理を削除 2017.02.15 kawana

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// [#979] 入力行以外も登録されるため、入力行を自動でチェックする処理を削除 2017.02.15 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#initScreenHttp
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
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
				 $scope.deferredGetDelFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
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
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#deferredGetInitData
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
	 *
	 * @description
	 * EDIマスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End

			// 訂正
			var request = {};
			request.ediId = $route.current.params.ediId;

			api.ediEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					history.back();
					deferred.reject();
					return;
				}

				// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana

				$scope.head = response.data.head; // EDIマスタメンテナンスヘッダ関連
				$scope.ediEdit = response.data.body; // EDI項目マスタメンテナンス明細関連
				bodyList = response.data.body;
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
				}
				// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.ediEdit.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				$scope.head = response.data.head; // EDIマスタメンテナンスヘッダ関連
				$scope.ediEdit = response.data.body;
				bodyList = response.data.body;
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

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
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#getClassForRow
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
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
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#addRow
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana

		$scope.ediEdit.push(angular.copy($scope.blankRow));

		// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana

		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.ediEdit.length-1);
	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#removeRow
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
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

		// [ON推-品向-874] 不要な処理を削除した。2015.11.13 chou End

		// 選択行削除チェック
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		if ($scope.screenMode != SCREEN_MODE.Copy) {
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End
			var i = 0;
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.ediEdit.indexOf(row) > -1) {
					if (row.ediColumnId != null) {
						i += 1;
						return;
					}
				}
			});
			if (i > 0){
				alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
				return;
			}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End

		var flg = false;

		// 入力のある行を削除する場合はメッセージを出力
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 1) {
			// [ON推-品向-874] １行を削除する場合、確認メッセージを表示 2015.11.13 chou Start
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].ediColumnNm != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[0].ediColumnNm != null)
			// [ON推-品向-874] １行を削除する場合、確認メッセージを表示 2015.11.13 chou End
			   ||  $scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg != owsCommon.getDefaultValue($scope.delFlgList)){
				flg =true;
			}
		}

		if (flg) {
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}
		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.ediEdit.indexOf(row) > -1) {
				$scope.ediEdit.splice($scope.ediEdit.indexOf(row), 1);
			}
		});

		// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#register
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
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

		// [ON推-品向-798][ON推-品向-799] 登録の動作を修正 2015.05.08 kawana Start
		var listBody = [];
		var removeBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
		// 選択行の確認
		for (var row = 0; row < $scope.ediEdit.length; row++) {

			// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {

				// [#979] 未入力行がエラーになり登録できない問題を修正(空行の検証を削除) 2017.02.15 kawana

				// 空行を退避
				removeBody.push($scope.ediEdit[row]);
			// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End
			} else {

			// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
				// 空行以外を退避
				listBody.push($scope.ediEdit[row]);
			// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End
			}
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA Start
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA End
				// 不要行を削除
				angular.forEach(removeBody, function(row) {
						$scope.ediEdit.splice($scope.ediEdit.indexOf(row), 1);
				});

				// 項目名重複チェック
				var j = 0;
				var rowIndex = new Array();
				for (var row = 0; row < $scope.ediEdit.length; row++) {
					var ediColumnNm = $scope.ediEdit[row].ediColumnNm;
					for (var i = row+1; i < $scope.ediEdit.length; i++) {
						if ($scope.ediEdit[i].ediColumnNm == ediColumnNm){
							rowIndex[j] =i;
							j++;
						}
					}
				}

				if (j > 0){

					// 対象の項目にエラーを表示
					var messageCd = "keyItemDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "ediColumnNm", $filter('owfMessage')(messageCd), rowIndex);
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc;

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定

					checkFunc = api.ediEdit.inputCheck;
					execFunc = api.ediEdit.update;
					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					};
				} else {
					// 新規登録関数を設定

					checkFunc = api.ediEdit.inputCheck;
					execFunc = api.ediEdit.register;
					successFunc = function(response){

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

						// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
						if ($scope.screenMode == SCREEN_MODE.Register) {
						// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End
							// 画面初期化
							$scope.initScreenHttp();
						// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
						}
						// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End
					};
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				bodyList = listBody;
				request.data.body = bodyList;

				// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.ediId = null;
				}
				// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End

				// 入力チェック
				checkFunc(request).then(function(checkResponse){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA Start
					var isBln = false;
					var isBlnGrid = false;
					var firstErrIndex;
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA End
					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//EDICDで重複エラー異常
							if (checkResponse.status.listStatus[i].status.statusCode == 6){
								optionMessageControl.show($scope, "classCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								optionMessageControl.show($scope, "ediNm", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA Start
								//return;
								isBln = true;
							} else if (checkResponse.status.listStatus[i].status.statusCode == 7){
								//EDI項目名で重複エラー異常
								gridOptionMessageControl.show($scope.gridOptions, "ediColumnNm", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue), checkResponse.status.listStatus[i].status.rowIndex);
								isBln = true;
								isBlnGrid = true;
								if (!firstErrIndex) {

									// 現在の行を最初のエラー行に設定
									firstErrIndex = checkResponse.status.listStatus[i].status.rowIndex;
								}
								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA End
							}
						}
						// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA Start
						if (isBln) {
							if (isBlnGrid) {
								// 最初のエラー箇所までスクロール
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstErrIndex);
							}
							// 最初のエラーにフォーカス
							directiveControl.firstErrorOnFocus('inputform');
							return;
						}
						// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.06.05 SJA End
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// EDIマスタメンテナンスデータ登録または更新
					execFunc(request).then(function(execResponse){

						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							return;
						}

						successFunc(execResponse);
						owsCommon.toggleSelectAll($scope.gridOptions, false);
					});

				});
			});
			},
			// エラー時の処理
			function(){
				owsCommon.syncExec(function() {

					// [ON推-品向-864] エラー時にチェック以外の行を消す処理を削除 2015.07.08 kawana

					// 空行の検証機能を再開
					gridDirectiveControl.validity($scope.gridOptions, true);

					// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
				});
			});
		// [ON推-品向-798][ON推-品向-799] 登録の動作を修正 2015.05.08 kawana End
	};

	// [ON推-品向-799] 不要な処理を削除(行番号の設定など) 2015.05.08 kawana

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
