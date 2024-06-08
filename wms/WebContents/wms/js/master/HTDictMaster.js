/**
 * @ngdoc overview
 * @name oneslogiWms.HTDictMaster
 *
 * @description HT辞書マスタ画面
 */
angular.module('oneslogiWms.HTDictMaster', [])

/**
 * @ngdoc service
 * @name oneslogiWms.HTDictMaster.service:HTdictMasterApi
 *
 * @description
 * 辞書マスタWebApi定義<br>
 * ・resources/class/keyValueList 区分値マスタ用データ取得用WebApi<br>
 * ・resources/master/HTdictMaster/init 初期化用WebApi<br>
 * ・resources/master/HTdictMaster/search 検索用WebApi<br>
 * ・resources/master/HTdictMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/HTdictMaster/register 登録用WebApi<br>
 *
 */
.factory('HTdictMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		limitToMessageCD: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/class/limitToMessageCD']
				 ]
		),
		htdictList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/HTdictMaster/init'],
				 ['search', 'GET', 'resources/master/HTdictMaster/search'],
				 ['inputCheck', 'POST', 'resources/master/HTdictMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/HTdictMaster/register']
				 ]
		)
	};
}])

.controller('HTDictMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'HTdictMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
	var inputLimit = [];
	//グリッドの列情報（デザイン用）
	$scope.htDictListCols =
		[
		 {field:"dictNm",      displayName:"辞書名（変更前）"},
		 {field:"mhtDictAsOne.dictNm",         displayName:"HT辞書名"},
		 {field:"bdict.systemType",     displayName:"システム種別"},
		 {field:"dataType",       displayName:"データ型"},
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#initScreen
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
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
		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'htdictList',
			columnDefs: 'htDictListCols',
			pagingOptions : $scope.pagingOptions
		});

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mhtDictAsOne.dictNm":{
					"ng-change":{
						eventFunction:"dictNmChange(row.rowIndex)"
					}
				},
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.dictNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#initScreenHttp
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
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
				 ]
			  )
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClassEdit.object:ClassEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.ClassEdit.object:ClassEdit
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

		api.dropdownList.query(request).then(function(response){
			$scope.systemTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#deferredGetInitData
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
	 *
	 * @description
	 * 荷主マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.htdictList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.htdictList = response.data.body;

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.head.bdict.systemType = owsCommon.getDefaultValue($scope.systemTypeList);

			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

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
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#search
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#getSearchData
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.htdictList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#setSearchData
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
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
		$scope.htdictList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictMaster.object:HTDictMaster#register
	 * @methodOf oneslogiWms.HTDictMaster.object:HTDictMaster
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

		// 行が選択されていない状態
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				gridDirectiveControl.validity($scope.gridOptions, true);
				// 空行判定
				var allBody = $scope.gridOptions.gridApi.grid.rows;
				var selectBody = [];

				for (var row = 0;row < $scope.htdictList.length;row++){
					if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == true)){
						// 選択行を退避
						selectBody.push($scope.htdictList[row]);
					}
				}
				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = selectBody;

				// 入力チェック
				api.htdictList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 辞書マスタデータ登録または更新
					api.htdictList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}
						// 明細を空に設定
						$scope.htdictList = [];

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
	},
	//画面初期化処理を実行
	$scope.initScreen();
}]);
