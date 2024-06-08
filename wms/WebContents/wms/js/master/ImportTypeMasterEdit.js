/**
 * @ngdoc overview
 * @name oneslogiWms.ImportTypeMasterEdit
 *
 * @description
 * 取込種別マスタメンテナンス(編集)画面<br>
 *
 * 取込種別マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ImportTypeMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ImportTypeMasterEdit.service:importTypeMasterEditApi
 *
 * @description
 * 取込種別マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 */
.factory('importTypeMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		centerClass: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		edi: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/ecorder/edi/ediList']
			]
		),
		importType: AngularAPIClient.make(
			[
				 ['initNew',                    'GET',  'resources/master/importTypeMasterEdit/initNew'],
				 ['confirm',                    'GET',  'resources/master/importTypeMasterEdit/confirm'],
				 ['initUpdate',                 'GET',  'resources/master/importTypeMasterEdit/initUpdate'],
				 ['inputCheck',                 'POST', 'resources/master/importTypeMasterEdit/inputCheck'],
				 ['register',                   'POST', 'resources/master/importTypeMasterEdit/register']
			 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit
 *
 * @description
 * 取込種別マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ImportTypeMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'importTypeMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.importTypeMasterEditCols = [];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit#initScreen
	 * @methodOf oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit
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
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'importTypeBodyList',
			columnDefs: 'importTypeMasterEditCols',
			adjust : false
		});

		$scope.gridSelectOptions = {
			"uploadColumnNm" : {
				key : "columnNm",
				value : "columnNm",
				listModel : "uploadColumnList",
				viewWithKey : false
			}
		};

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		$scope.gridButtonOptions = {
				"copyHColumnNm":{
					clickFunction:"showCopyHeaderColumnInput(row.rowIndex)"
				},
				"copyBColumnNm":{
					clickFunction:"showCopyBodyColumnInput(row.rowIndex)"
				}
		};
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit
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
					// 各種ドロップダウンリスト用データ設定（同期処理）
					 $scope.getClientList(),
					 $scope.getEdiList(),
					 $scope.getUploadTableList(),
					 $scope.getLineFeedCdList(),
					 $scope.getGiftStatementTypeList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	$scope.getClientList = function () {
		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
	};

	$scope.getEdiList = function () {
		var deferred = $q.defer();

		var request = {};
		$scope.ediList = [];
		api.edi.getList(request).then(function(response){
			$scope.ediList = response.data.ediList;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.getUploadTableList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UPLOAD_TABLE_NM";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.uploadTableList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.getLineFeedCdList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LINE_FEED_CD";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.lineFeedCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.getGiftStatementTypeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "GIFT_STATEMENT_TYPE";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.giftStatementTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.ImportTypeMasterEdit.object:ImportTypeMasterEdit
	 *
	 * @description
	 * 取込種別マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End

			// 訂正
			var request = {};
			request.importTypeId = $route.current.params.importTypeId;

			api.importType.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputbaseform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// 結果を設定
				$scope.header = response.data.header;
				$scope.importTypeBodyList = response.data.bodyList;
				$scope.duplicateColumnNmList = response.data.columnList;
				$scope.rcvIdColumnNmList = response.data.columnList;
				$scope.rowNoColumnNmList = response.data.columnList;

				// 列リストの設定
				$scope.uploadColumnList = response.data.columnList;

				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End
					// 明細部を入力可能に設定(基本部を入力不可に設定)
					$scope.controlEditableDtlForm();
				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
				} else {
					// 基本部を入力可能に設定(明細部を入力不可に設定)
					$scope.controlEditableBaseForm();
				}
				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		} else {

			// 新規
			api.importType.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputbaseform')) {
					deferred.reject();
					return;
				}

				$scope.header = response.data.header;
				$scope.importTypeBodyList = response.data.bodyList;

				// 初期値設定
				// 荷主
				$scope.header.mclient.clientCd = userInfo.clientCd;

				// 基本部を入力可能に設定(明細部を入力不可に設定)
				$scope.controlEditableBaseForm();

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		}

		return deferred.promise;
	};

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	/**
	 * @ngdoc method
	 *
	 * @description
	 * EC受注ヘッダコピー列名のボタン押下処理<br>
	 *
	 */
	$scope.showCopyHeaderColumnInput = function(rowIndex) {

		var items = {
				ediColumnNm: $scope.importTypeBodyList[rowIndex].mediColumn.ediColumnNm,
				copyColumnNm: $scope.importTypeBodyList[rowIndex].copyHColumnNm,
				isHeader:true
		};

		var modalInstance = modalFactory.modalImportTypeBCopyColumnInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(copyColumn){
			$scope.importTypeBodyList[rowIndex].copyHColumnNm = copyColumn;
		});
	};

	/**
	 * @ngdoc method
	 *
	 * @description
	 * EC受注ボディコピー列名のボタン押下処理<br>
	 *
	 */
	$scope.showCopyBodyColumnInput = function(rowIndex) {

		var items = {
				ediColumnNm: $scope.importTypeBodyList[rowIndex].mediColumn.ediColumnNm,
				copyColumnNm: $scope.importTypeBodyList[rowIndex].copyBColumnNm,
				isHeader:false
		};

		var modalInstance = modalFactory.modalImportTypeBCopyColumnInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(copyColumn){
			$scope.importTypeBodyList[rowIndex].copyBColumnNm = copyColumn;
		});
	};
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	$scope.confirm = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var request = {};
		request.data = {};
		request.data.header = $scope.header;

		owsCommon.syncExec(function() {
			// 入力チェック
			api.importType.confirm(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputbaseform')) {
					return;
				}

				// コピー機能追加 取込種別マスタ画面修正 2016.09.14 Thein Myo Oo Add Start
				if ($scope.screenMode == SCREEN_MODE.Register) {
				// コピー機能追加 取込種別マスタ画面修正 2016.09.14 Thein Myo Oo Add End
					// 結果を明細部に設定
					$scope.importTypeBodyList = response.data.bodyList;
					$scope.duplicateColumnNmList = response.data.columnList;
					$scope.rcvIdColumnNmList = response.data.columnList;
					$scope.rowNoColumnNmList = response.data.columnList;
				// コピー機能追加 取込種別マスタ画面修正 2016.09.14 Thein Myo Oo Add Start
				}
				// コピー機能追加 取込種別マスタ画面修正 2016.09.14 Thein Myo Oo Add End

				// 列リストの設定
				$scope.uploadColumnList = response.data.columnList;

				$scope.controlEditableDtlForm();
			});
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#register
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		var promiseAll = $q.all([
		         				// [ON推-品向-810] form名間違いにより入力チェックがされない問題を修正 2015.05.15 kawana Start
		         				gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputdtlform)
		         				// [ON推-品向-810] form名間違いにより入力チェックがされない問題を修正 2015.05.15 kawana End
		         				]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 列番号とアップロード列名がどちらも入力されているかチェック
				var isError = false;
				var fistIndex;
				var mesageCd = "necessaryItemNotInputError";
				var rowIndex = new Array();
				for (var row = 0; row < $scope.importTypeBodyList.length; row++) {

					var columnNo = $scope.importTypeBodyList[row].columnNo;
					var uploadColumnNm = $scope.importTypeBodyList[row].uploadColumnNm;
					// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana Start
					var copyHColumnNm = $scope.importTypeBodyList[row].copyHColumnNm;
					var copyBColumnNm = $scope.importTypeBodyList[row].copyBColumnNm;

					// 入力がある場合
					if(columnNo
						|| uploadColumnNm
						|| copyHColumnNm
						|| copyBColumnNm){

						// 列番号は必須
						if(!columnNo){
							gridOptionMessageControl.show($scope.gridOptions, "columnNo", $filter('owfMessage')(mesageCd), row);
							isError = true;
							if (!fistIndex) {
								fistIndex = row;
							}
						}

						// アップロード列名は必須
						if(!uploadColumnNm){
							gridOptionMessageControl.show($scope.gridOptions, "uploadColumnNm", $filter('owfMessage')(mesageCd), row);
							isError = true;
							if (!fistIndex) {
								fistIndex = row;
							}
						}
					}
					// [C-CWMS-0026] EC受注ヘッダ・ボディへのコピー列名を追加 2015.05.15 kawana End
				}

				if (isError) {
					// エラー有り

					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, fistIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('importTypeBodyListGrid');
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.header = $scope.header;
				request.data.bodyList = $scope.importTypeBodyList;

				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.header.importTypeId = null;
				}
				// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End

				// 入力チェック
				api.importType.inputCheck(request).then(function(checkResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// 取込種別マスタデータ登録
					api.importType.register(request).then(function(execResponse){

						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							return;
						}

						if ($scope.screenMode == SCREEN_MODE.Update) {
							// 更新モード

							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(execResponse.status.messageCode, execResponse.status.messageReplaceValue);

						} else {
							// 新規モード

							// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
							if ($scope.screenMode == SCREEN_MODE.Register) {
							// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End
								// 画面初期化
								$scope.initScreenHttp();
							// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
							}
							// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End
						}
					});
				});
			});
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana End
		});

	};

	// 基本部の入力
	$scope.controlEditableBaseForm = function(){
		//[Ver3.0][#3998] 項目名称修正 2018.04.19 miyabe upd Start
		directiveControl.editable($scope, 'clientCd', true);
		//[Ver3.0][#3998] 項目名称修正 2018.04.19 miyabe upd End
		directiveControl.editable($scope, 'importTypeCd', true);
		directiveControl.editable($scope, 'importTypeNm', true);
		// [#6884][OSS] コピーボタンからの遷移時はEDIとテーブル名を編集不可にするよう修正 2019.11.21 tanaka Start
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			directiveControl.editable($scope, 'edi', false);
			directiveControl.editable($scope, 'uploadTableNm', false);
		} else {
			directiveControl.editable($scope, 'edi', true);
			directiveControl.editable($scope, 'uploadTableNm', true);
		}
		// [#6884][OSS] コピーボタンからの遷移時はEDIとテーブル名を編集不可にするよう修正 2019.11.21 tanaka End

		directiveControl.editable($scope, 'confirm', true);

		directiveControl.editable($scope, 'characterCd', false);
		directiveControl.editable($scope, 'lineFeedCd', false);
		directiveControl.editable($scope, 'delimiter', false);
		directiveControl.editable($scope, 'skippingRows', false);
		directiveControl.editable($scope, 'duplicateColumnNm', false);
		directiveControl.editable($scope, 'rcvIdColumnNm', false);
		directiveControl.editable($scope, 'rowNoColumnNm', false);
		directiveControl.editable($scope, 'giftStatementType', false);
		directiveControl.editable($scope, 'giftStatementDetail', false);
		directiveControl.editable($scope, 'oKeepingDays', false);
		directiveControl.editable($scope, 'statementTitle', false);
		directiveControl.editable($scope, 'statementUrl', false);

		directiveControl.editable($scope, 'importTypeBodyListGrid', false);

		directiveControl.editable($scope, 'register', false);
	};

	// 明細部の入力
	$scope.controlEditableDtlForm = function(){
		directiveControl.editable($scope, 'client', false);
		directiveControl.editable($scope, 'importTypeCd', false);
		directiveControl.editable($scope, 'importTypeNm', false);
		directiveControl.editable($scope, 'edi', false);
		directiveControl.editable($scope, 'uploadTableNm', false);

		directiveControl.editable($scope, 'confirm', false);

		directiveControl.editable($scope, 'characterCd', true);
		directiveControl.editable($scope, 'lineFeedCd', true);
		directiveControl.editable($scope, 'delimiter', true);
		directiveControl.editable($scope, 'skippingRows', true);
		directiveControl.editable($scope, 'duplicateColumnNm', true);
		directiveControl.editable($scope, 'rcvIdColumnNm', true);
		directiveControl.editable($scope, 'rowNoColumnNm', true);
		directiveControl.editable($scope, 'giftStatementType', true);
		directiveControl.editable($scope, 'giftStatementDetail', true);
		directiveControl.editable($scope, 'oKeepingDays', true);
		directiveControl.editable($scope, 'statementTitle', true);
		directiveControl.editable($scope, 'statementUrl', true);

		directiveControl.editable($scope, 'importTypeBodyListGrid', true);

		directiveControl.editable($scope, 'register', true);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
