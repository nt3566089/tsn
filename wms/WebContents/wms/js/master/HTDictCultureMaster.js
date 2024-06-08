/**
 * @ngdoc overview
 * @name oneslogiWms.HTDictCultureMaster
 *
 * @description
 * HT辞書カルチャ画面マスタ画面
 */
angular.module('oneslogiWms.HTDictCultureMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.HTDictCultureMaster.service:centerClientScreenMasterApi
 *
 * @description
 * HT辞書カルチャ画面マスタWebApi定義<br>
 * ・resources/class/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/HTdictCultureMaster/init 初期化用WebApi<br>
 * ・resources/master/HTdictCultureMaster/search 検索用WebApi<br>
 * ・resources/master/HTdictCultureMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/HTdictCultureMaster/register 登録用WebApi<br>
 *
 */
.factory('HTdictCultureMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		culture: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/cultureCD/cultureList']
				 ]
		),
		htDictCultureList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/HTdictCultureMaster/init'],
				 ['search', 'GET', 'resources/master/HTdictCultureMaster/search'],
				 ['inputCheck', 'POST', 'resources/master/HTdictCultureMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/HTdictCultureMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
 *
 * @description
 * HT辞書カルチャ画面マスタ画面コントローラ
 */
.controller('HTDictCultureMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'HTdictCultureMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.htDictCultureListCols =
		[
		{field:"mhtDictCultureList.bculture.vdict.dictNm", displayName:"カルチャ"},
		{field:"dictNm", displayName:"辞書名"},
		{field:"dictCultureNm", displayName:"HT 辞書名"},
		 ];

	var oldcenterClientCls;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#initScreen
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
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
			data: 'htDictCultureList',
			columnDefs: 'htDictCultureListCols',
			pagingOptions : $scope.pagingOptions
		});

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mhtDictCultureAsOne.dictNm":{
					"ng-change":{
						eventFunction:"htCulturedictNmChangeBlur(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "messageCd",7,5 );

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();

		$scope.htCulturedictNmChangeBlur = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#initScreenHttp
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				 $scope.deferredGetCulture()
				 )
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#deferredGetCulture
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
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
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#deferredGetInitData
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
	 *
	 * @description
	 * HT辞書カルチャ画面マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.htDictCultureList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.htDictCultureList = response.data.body;
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
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#search
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
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
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
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
		api.htDictCultureList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster##setPagingData
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.htDictCultureList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster#register
	 * @methodOf oneslogiWms.HTDictCultureMaster.object:HTDictCultureMaster
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

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){

				owsCommon.syncExec(function() {
					var isError = $scope.searchinputform.$invalid;
					// エラーがある場合、フォーカスを当てる
					if (isError) {
						directiveControl.firstErrorOnFocus('searchinputform');
						return;
					}

					//選択処理
					var allBody = $scope.gridOptions.gridApi.grid.rows;
					var selectBody = [];

					for (var row = 0; row < $scope.htDictCultureList.length; row++) {
						if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == true)) {
							// 選択行を退避
							selectBody.push($scope.htDictCultureList[row]);
						}
					}

					// 画面内容を引数に設定
					var request = {};
					request.data = {};
					request.data.head = $scope.head;
					request.data.body = selectBody;

					// 入力チェック
					api.htDictCultureList.inputCheck(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// HT辞書カルチャ画面マスタデータ登録または更新
						api.htDictCultureList.register(request).then(function(response){
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
								return;
							}
							// 明細を空に設定
							$scope.htDictCultureList = [];
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
