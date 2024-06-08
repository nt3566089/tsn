/**
 * @ngdoc overview
 * @name oneslogiWms.Daily
 *
 * @description
 * 日次締め処理画面
 */
angular.module('oneslogiWms.Daily',[])

/**
 * @ngdoc service
 * @name oneslogiWms.Daily.service:DailyApi
 *
 * @description
 * 日次締め処理WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 *  resources/daily/daily/init 初期化用WebApi<br>
 * ・resources/daily/daily/search 検索用WebApi<br>
 * ・resources/daily/daily/inputCheck 入力チェック用WebApi<br>
 * ・resources/daily/daily/daily 締切用WebApi<br>
 *
 */
.factory('dailyApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
		    [
		        ['query', 'GET', 'resources/common/centerClass/keyValueList']
		    ]
		),
		dailyList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/daily/daily/init'],
			    ['search', 'GET', 'resources/daily/daily/search'],
			    ['check', 'POST', 'resources/daily/daily/check'],
			    ['daily', 'POST', 'resources/daily/daily/daily'],
			    // [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start
			    ['dailyBatch', 'POST', 'resources/daily/daily/dailyBatch']
			    // [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.Daily.object:Daily
 *
 * @description
 *日次締め処理画面コントローラ
 */
.controller('Daily', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'dailyApi', '$window', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, $window) {
	//グリッドの列情報（デザイン用）
	$scope.dailyListCols =
		[
		    {field:"mclient.clientCd", displayName:"荷主CD"},
		    {field:"mclient.clientNm", displayName:"荷主名称"},
		    {field:"systemDt", displayName:"システム管理日付"},
		    {field:"systemDateAdd", displayName:"システム管理日付(翌稼働日)"},
		    {field:"batchProgressFlg", displayName:"バッチ処理中フラグ"},
		    {field:"batchProgressFlgNm", displayName:"バッチ処理中フラグ"},
			//荷主センタ変更対応 201７.02.06 sja Start
		    {field:"mcenter.centerCd", displayName:"センタCD"},
		    {field:"mcenter.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 201７.02.06 sja End

		];

    /**
     * @ngdoc method
     * @name oneslogiWms.Daily.object:Daily#initScreen
     * @methodOf oneslogiWms.Daily.object:Daily
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {
		var newDailyList;
		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'dailyList',
			columnDefs: 'dailyListCols',
		});

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"systemDateAdd":{
					"ng-change":{
						eventFunction:"systemDateAddChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "systemDateAdd",3, 3);

		//荷主センタ変更対応 201７.02.06 sja Start
		$scope.centerChange = function() {

			if ($scope.dailySearch.centerCd == null || $scope.dailySearch.centerCd == "") {
				// センタCD未設定

				owsCommon.toggleSelectAll($scope.gridOptions, false);
				$scope.dailyList = [];
				return;
			}

			$scope.search();
		};
		//荷主センタ変更対応 201７.02.06 sja End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.systemDateAddChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

    /**
     * @ngdoc method
     * @name oneslogiWms.Daily.object:Daily#initScreenHttp
     * @methodOf oneslogiWms.Daily.object:Daily
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetBatchProgressFlgList()
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// バッチ処理中フラグリスト
	$scope.deferredGetBatchProgressFlgList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BATCH_PROGRESS_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.batchProgressFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.Daily.object:Daily#deferredGetInitData
	 * @methodOf oneslogiWms.Daily.object:Daily
	 *
	 * @description
	 * 日次締め処理初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.dailyList.init().then(function(response){
			$scope.dailySearch = response.data.dailySearch;
			$scope.dailyList = response.data.dailyList;

			// ログイン情報より初期値を設定
			$scope.dailySearch.centerCd = userInfo.centerCd;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.dailySearch = owsHistory.popState();
				$scope.search();
			}

			$scope.search();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.Daily.object:Daily#search
     * @methodOf oneslogiWms.Daily.object:Daily
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
	 * @name oneslogiWms.Daily.object:Daily#getSearchData
	 * @methodOf oneslogiWms.Daily.object:Daily
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.dailySearch = $scope.dailySearch;

		api.dailyList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.Daily.object:Daily#setSearchData
	 * @methodOf oneslogiWms.Daily.object:Daily
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-352] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-352] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.dailyList = response.data.dailyList;

		for (var row = 0; row < $scope.dailyList.length; row++) {
			for (var i = 0; i < $scope.batchProgressFlgList.length; i++) {
				if ($scope.dailyList[row].batchProgressFlg == $scope.batchProgressFlgList[i].classCd) {
					$scope.dailyList[row].batchProgressFlgNm = $scope.batchProgressFlgList[i].classNm;
				}
			}
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.dailySearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.Daily.object:Daily#register
	 * @methodOf oneslogiWms.Daily.object:Daily
	 *
	 * @description
	 * 締切ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、日次締め処理する。
	 */
	$scope.daily = function(isBatch) {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];
		var batchCheck = true;

		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			listBody.push($scope.dailyList[row]);
			if (row.batchProgressFlg == "1") {
				batchCheck = false;
			}
		});

		if (listBody.length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		if (!batchCheck){
			alertMessage.setErrorMessageByCode("dailyProcessCannotSelectBatchProgressError");
			return;
		}

		// [ON推-品向-860] チェックした行以外の辞書検証を解除 2015.07.08 kawana Start
		// 未選択行への検証機能を解除
		for (var row = 0; row < $scope.dailyList.length; row++) {
			if ($scope.gridOptions.getSelection($scope.gridOptions.gridApi.grid.rows[row]) == false) {
				gridDirectiveControl.validity($scope.gridOptions, false, row);
			}
		}
		// [ON推-品向-860] チェックした行以外の辞書検証を解除 2015.07.08 kawana End

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.dailyList = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.data.dailySearch = $scope.dailySearch;
				request.flg = true;

				// 入力チェック
				api.dailyList.check(request).then(function(response){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					request.flg = false;

				    // [C-CWMS-0066] 非同期処理化 2016.10.14 kawana Start

					var dailyApi;
					var successFunc;

					if (isBatch) {
						// バッチ処理

						dailyApi = api.dailyList.dailyBatch;
						successFunc = function(response){
							// 再検索
							$scope.search();
						}
					} else {
						// 通常処理

						dailyApi = api.dailyList.daily;
						successFunc = function(response){
							// 完了メッセージ表示
							alertMessage.deleteAll($scope);
							owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);

							// [ON推-品向-124] システム管理日付更新のため、画面更新 2014.11.27 kawana Start
							// 再読込み（userInfoのシステム管理日付を更新する為）
							$window.location.reload();
							// [ON推-品向-124] システム管理日付更新のため、画面更新 2014.11.27 kawana End
						}
					}

					// 締切処理 実行
					dailyApi(request).then(function(response){

						// 結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 正常終了後処理
						successFunc(response);
					});

				    // [C-CWMS-0066] 非同期処理化 2016.10.14 kawana End
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);
