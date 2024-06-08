/**
 * @ngdoc overview
 * @name oneslogiWms.UserEdit
 *
 * @description
 * ユーザマスタメンテナンス(編集)画面<br>
 *
 * ユーザマスタメンテナンスデータに対する登録を行う為の画面。
 */
angular.module('oneslogiWms.UserEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.UserEdit.service:userEditApi
 *
 * @description
 * ユーザマスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/cultureCD/keyValueList カルチャデータ操作用WebApi<br>
 * ・resources/common/roleGrp/keyValueList 権限グループデータ操作用WebApi<br>
 * <br>
 * ユーザマスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/userEdit/init 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/userEdit/register 入力データ登録WebAPI<br>
 */
.factory('userEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		culture: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/cultureCD/cultureList']
				 ]
		),
		roleGrp: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/roleGrp/keyValueList']
				 ]
		),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		userList: AngularAPIClient.make(
				[
				 ['init',            'GET',  'resources/master/userEdit/init'],
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod Start
				 ['inputCheck',      'POST', 'resources/master/userEdit/inputCheck'],
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod End
				 ['register',        'POST', 'resources/master/userEdit/register'],
				// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
				 ['registerCopy',    'POST', 'resources/master/userEdit/registerCopy']
				// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.UserEdit.object:UserEdit
 *
 * @description
 * ユーザマスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
/* 2015/11/04 INOUE UPD START ユーザ登録機能追加対応 */
//.controller('UserEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'userEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){
.controller('UserEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'userEditApi', 'UserMgtShared', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, userMgtShared){
/* 2015/11/04 INOUE UPD END */

	// グリッドの列情報（デザイン用）
	$scope.userCenterCols = [
	                         {field:"centerCheckBox", displayName:""},
	                         {field:"centerCd", displayName:"センタCD"},
	                         {field:"centerNm", displayName:"センタ名称"}
	                        ];

	// グリッドの列情報（デザイン用）
	$scope.userClientCols = [
	                         {field:"clientCheckBox", displayName:""},
	                         {field:"clientCd", displayName:"荷主CD"},
	                         {field:"clientNm", displayName:"荷主名称"}
	                        ];

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	// グリッドの列情報（デザイン用）
	$scope.userDepositCols = [
	                         {field:"depositCheckBox", displayName:""},
	                         {field:"mclient.clientCd", displayName:"荷主CD"},
	                         {field:"mclient.clientNm", displayName:"荷主名称"},
	                         {field:"customerCd", displayName:"預託CD"},
	                         {field:"customerNm", displayName:"預託名称"}
	                        ];
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#initScreen
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// ユーザ管理センタのグリッドの設定
		$scope.gridOptions1 = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'centerList',
			columnDefs: 'userCenterCols',
		});

		// ユーザ管理荷主のグリッドの設定
		$scope.gridOptions2 = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'clientList',
			columnDefs: 'userClientCols',
		});

		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		// ユーザ管理預託のグリッドの設定
		$scope.gridOptions3 = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'depositList',
			columnDefs: 'userDepositCols'
		});

		// グリッドのチェックボックス列にチェンジイベントを設定
		$scope.gridEventOptions3 = {
				"depositCheckBox":{
					"ng-click":{
						eventFunction:"depositCheckBoxClick(row.rowIndex)"
					}
				}
		};
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#initScreenHttp
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
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
				 $scope.deferredGetCulture(),
				 $scope.deferredGetRoleGrp(),
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
	 * @name oneslogiWms.UserList.object:UserList#deferredGetCulture
	 * @methodOf oneslogiWms.UserList.object:UserList
	 *
	 * @description
	 * カルチャ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCulture = function () {
		var deferred = $q.defer();
		var request = {};
		api.culture.keyValueList(request).then(function(response){
			$scope.cultureList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserList.object:UserList#deferredGetRoleGrp
	 * @methodOf oneslogiWms.UserList.object:UserList
	 *
	 * @description
	 * 権限グループ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetRoleGrp = function () {
		var deferred = $q.defer();
		var request = {};
		api.roleGrp.keyValueList(request).then(function(response){
			$scope.roleGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#deferredGetInitData
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザマスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = {};

		request.userId = $route.current.params.userId;

		// ユーザ管理センタ
		api.userList.init(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				/* 2015/11/05 INOUE UPDATE START 簡易ログイン対応 */
				// エラー後の処理は共通処理に委譲
				shared.error.errorOccurred(response);
				/* 2015/11/05 INOUE UPDATE END */
				deferred.reject();
				return;
			}

			// ユーザマスタ関連
			$scope.user = response.data.user;
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
			if (!isNullOrUndefined($route.current.params.centerCd)) {
				$scope.user.muserCenterList[0].mcenter.centerCd = $route.current.params.centerCd;
			}
			if (!isNullOrUndefined($route.current.params.clientCd)) {
				$scope.user.muserClientList[0].mclient.clientCd = $route.current.params.clientCd;
			}
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
			// ユーザ管理センタ関連
			$scope.centerList = response.data.centerList;
			// ユーザ管理荷主関連
			$scope.clientList = response.data.clientList;
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
			$scope.depositList = response.data.depositList;
			$scope.searchConditonCenterList = response.data.searchConditonCenterList;
			$scope.searchConditonClientList = response.data.searchConditonClientList;
			// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

			// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
			// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete Start
//			if ($route.current.params.mode == "COPY") {
//
//				// 登録ボタンを非表示に設定
//				directiveControl.show($scope, 'register', false);
//			}
			// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete End
			// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End

			deferred.resolve();
		});

		//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
		owsCommon.setFirstFocus();

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#centerAllSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理センタ関連の全選択ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerAllSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.centerList.length; row++) {
			$scope.centerList[row].centerCheckBox = "1";
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#centerNoSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理センタ関連の全解除ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerNoSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.centerList.length; row++) {
			$scope.centerList[row].centerCheckBox = "0";
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#clientAllSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理荷主関連の全選択ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.clientAllSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.clientList.length; row++) {
			$scope.clientList[row].clientCheckBox = "1";
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#clientNoSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理荷主関連の全解除ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.clientNoSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.clientList.length; row++) {
			$scope.clientList[row].clientCheckBox = "0";
			deferred.resolve();
		}

		return deferred.promise;
	};

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#centerAllSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理預託関連の全選択ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.depositAllSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.depositList.length; row++) {
			$scope.depositList[row].depositCheckBox = "1";
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#depositNoSelected
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理預託関連の全解除ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.depositNoSelected = function() {
		var deferred = $q.defer();

		for (var row = 0; row < $scope.depositList.length; row++) {
			$scope.depositList[row].depositCheckBox = "0";
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#depositCheckBoxClick
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * ユーザ管理預託の選択ボタン変更処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.depositCheckBoxClick = function(rowIndex) {
		// [#7024][OSS] ユーザマスタメンテナンス（編集）で預託CDの明細を選択時の差異 2020.1.14 ikeda Start
		owsCommon.syncExec(function() {
			if ($scope.depositList[rowIndex].depositCheckBox == "1") {
				var clientId = $scope.depositList[rowIndex].mclient.clientId;
				for (var row = 0; row < $scope.clientList.length; row++) {
					if ($scope.clientList[row].clientId == clientId) {
						if ($scope.clientList[row].clientCheckBox != "1") {
							$scope.clientList[row].clientCheckBox = "1";
						}
					}
				}
			}
		})
		// [#7024][OSS] ユーザマスタメンテナンス（編集）で預託CDの明細を選択時の差異 2020.1.14 ikeda End
	};
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserEdit.object:UserEdit#register
	 * @methodOf oneslogiWms.UserEdit.object:UserEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・削除データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions1);
		gridOptionMessageControl.hideAll($scope.gridOptions2);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		gridOptionMessageControl.hideAll($scope.gridOptions3);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions1, false, gridDirectiveControl.blankRows($scope.gridOptions1));
		gridDirectiveControl.validity($scope.gridOptions2, false, gridDirectiveControl.blankRows($scope.gridOptions2));
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		gridDirectiveControl.validity($scope.gridOptions3, false, gridDirectiveControl.blankRows($scope.gridOptions3));
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions1,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.inputform.$invalid;

				// エラーがある場合、フォーカスを当てる
				if (isError) {
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数
				// 登録処理関数を設定
				execFunc = api.userList.register;
				checkFunc = api.userList.inputCheck;

				successFunc = function(response){
					/* 2015/11/04 INOUE UPD START ユーザ登録機能追加対応 */
					// [ON推-品向-1107] 登録釦押下後、前画面に遷移させる 2016.04.21 ichikawa Start
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					// [ON推-品向-1107] 登録釦押下後、前画面に遷移させる 2016.04.21 ichikawa Start
					/* 2015/11/04 INOUE UPD END */
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.user = $scope.user;
				request.data.centerList = $scope.centerList;
				request.data.clientList = $scope.clientList;
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
				request.data.depositList = $scope.depositList;
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// ユーザセンタ/荷主/預託データ登録
					execFunc(request).then(function(execResponse){
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
				gridDirectiveControl.validity($scope.gridOptions1, true);
				gridDirectiveControl.validity($scope.gridOptions2, true);
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
				gridDirectiveControl.validity($scope.gridOptions3, true);
				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
	};

	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete Start
//	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
//	/**
//	 * コピー処理
//	 */
//	$scope.copy = function() {
//
//		var deferred = $q.defer();
//
//		// エラーをクリア
//		gridOptionMessageControl.hideAll($scope.gridOptions1);
//		gridOptionMessageControl.hideAll($scope.gridOptions2);
//		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
//		gridOptionMessageControl.hideAll($scope.gridOptions3);
//		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
//		// グリッド空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions1, false, gridDirectiveControl.blankRows($scope.gridOptions1));
//		gridDirectiveControl.validity($scope.gridOptions2, false, gridDirectiveControl.blankRows($scope.gridOptions2));
//		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
//		gridDirectiveControl.validity($scope.gridOptions3, false, gridDirectiveControl.blankRows($scope.gridOptions3));
//		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
//		// グリッドの検証チェック
//		var promiseAll = $q.all([
//		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions1,$scope.inputform)
//		                         ]);
//
//		promiseAll.then(function(){
//			owsCommon.syncExec(function() {
//
//				var isError = $scope.inputform.$invalid;
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('inputform');
//					deferred.reject();
//					return;
//				}
//
//				// 画面内容を引数に設定
//				var request = {};
//				request.data = {};
//				request.data.user = userMgtShared.bUserDto.get();
//				request.data.centerList = $scope.centerList;
//				request.data.clientList = $scope.clientList;
//				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
//				request.data.depositList = $scope.depositList;
//				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
//
//				// 入力チェック
//				api.userList.inputCheck(request).then(function(checkResponse){
//
//					// 処理結果確認
//					if (!statusInfo.isSuccess(checkResponse)) {
//						statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform');
//						deferred.reject();
//						return;
//					}
//
//					//登録
//					api.userList.registerCopy(request).then(function(execResponse){
//
//						// 処理結果確認
//						if (!statusInfo.isSuccess(execResponse)) {
//							statusInfo.isSuccessAndShowMessage(execResponse, 'inputform');
//							deferred.reject();
//							return;
//						}
//
//						deferred.resolve();
//					});
//
//				});
//			});
//		},
//		// エラー時の処理
//		function(){
//			owsCommon.syncExec(function() {
//				// 空行の検証機能を再開
//				gridDirectiveControl.validity($scope.gridOptions1, true);
//				gridDirectiveControl.validity($scope.gridOptions2, true);
//				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
//				gridDirectiveControl.validity($scope.gridOptions3, true);
//				// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
//				deferred.reject();
//			});
//		});
//
//		return deferred.promise;
//	}
	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End
	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete End

	// 画面初期化処理を実行
	$scope.initScreen();

	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete Start
//	/* 2015/11/04 INOUE ADD START ユーザ登録機能追加対応 */
//	/**
//	 * bUserDto更新検知
//	 */
//	$scope.$on('EVENT_NAME_CHANGE_USER', function() {
//		// 自分以外による更新であれば、データの取り直しを行う。
//		if (userMgtShared.bUserDto.getLastChangeScreen()!=$scope.screenCd) {
//			$scope.deferredGetInitData();
//		}
//	});
//	/* 2015/11/04 INOUE ADD END */
//
//	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
//	if ($route.current.params.mode == "COPY") {
//		userMgtShared.copyMethods.push('UserEdit', $scope.copy);
//	}
//	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End
	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete End
}]);
