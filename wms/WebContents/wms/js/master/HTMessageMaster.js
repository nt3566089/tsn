
/**
 * @ngdoc overview
 * @name oneslogiWms.HTMessageMaster
 *
 * @description
 * HTメッセージマスタメンテナンス画面
 */
angular.module('oneslogiWms.HTMessageMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.HTMessageMaster.service:HTmessageMasterApi
 *
 * @description
 * HTメッセージマスタメンテナンスWebApi定義<br>
 * ・resources/class/keyValueList 区分値ドロップダウンリスト用データ取得WebApi<br>
 * ・resources/wms/master/HTmessageMaster/init 新規画面用初期データ取得用WebApi<br>
 * ・resources/wms/master/HTmessageMaster/search 検索用WebApi<br>
 * ・resources/wms/master/HTmessageMaster/inputCheck 登録前入力チェック用WebApi<br>
 * ・resources/wms/master/HTmessageMaster/register 入力データ登録用WebApi<br>
 *
 */
.factory('HTmessageMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		cultureCdList: AngularAPIClient.make(
				[

				 ['query', 'GET', 'resources/common/cultureCD/cultureList']

				 ]
		),
		messageMaster: AngularAPIClient.make(
			[
			    ['init',       'GET',  'resources/wms/master/HTmessageMaster/init'],
			    ['search',     'GET',  'resources/wms/master/HTmessageMaster/search'],
			    ['inputCheck', 'POST', 'resources/wms/master/HTmessageMaster/inputCheck'],
			    ['register',   'POST', 'resources/wms/master/HTmessageMaster/register']
			]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster
 *
 * @description
 * HTメッセージマスタメンテナンス画面コントローラ
 */
.controller('HTMessageMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'HTmessageMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	var screenCd;
	var inputLimit = [];
	//グリッドの列情報（デザイン用）
	$scope.HTMessageMasterCols =
		[
		 {field:"messageCd", displayName:"メッセージCD"},
		 {field:"messageNm", displayName:"メッセージ"},
		 {field:"messageType", displayName:"属性"},
		 {field:"systemType", displayName:"システム種別"},
		 {field:"bculture.cultureCd", displayName:"カルチャ"},
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#initScreen
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
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

		userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'body',
			columnDefs: 'HTMessageMasterCols',
			pagingOptions : $scope.pagingOptions
		});

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mhtMessageAsOne.messageNm":{
					"ng-change":{
						eventFunction:"htMessageNmChangeBlur(row.rowIndex)"
					}
				}
		};


		statusInfo.mappingGridErrorMessage($scope.gridOptions, "messageCd",7,5 );


		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

		$scope.htMessageNmChangeBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#initScreenHttp
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetMessageTypeList(),
				 $scope.deferredGetSystemTypeList(),
				 $scope.deferredGetCultureCdList(),
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#deferredGetItemTypeListt
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
	 *
	 * @description
	 * 属性取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMessageTypeList = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "MESSAGE_TYPE";

		api.keyValueList.query(request).then(function(response){
			$scope.messageTypeList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#deferredGetVisibleList
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#deferredGetEditableList
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
	 *
	 * @description
	 * カルチャ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCultureCdList = function () {
		var deferred = $q.defer();

		api.cultureCdList.query().then(function(response){
			$scope.cultureCdList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#deferredGetInitData
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
	 *
	 * @description
	 * 画面項目マスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.body = $scope.body;
		request.paging = $scope.paging;

		api.messageMaster.init(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				deferred.reject();
				return;
			}
			$scope.head = response.data.head;
			$scope.body = response.data.body;
			$scope.blankRow = response.data.blankRow;

			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#search
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
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
	 * @name oneslogiWms.ScreenList.object:ScreenList#getSearchData
	 * @methodOf oneslogiWms.ScreenList.object:ScreenList
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

		api.messageMaster.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ScreenList.object:ScreenList#setSearchData
	 * @methodOf oneslogiWms.ScreenList.object:ScreenList
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
		$scope.body = response.data.body;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.HTMessageMaster.object:HTMessageMaster#removeRow
	 * @methodOf oneslogiWms.HTMessageMaster.object:HTMessageMaster
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

		if($scope.body.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
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

				gridDirectiveControl.validity($scope.gridOptions, true);

				//選択処理
				var allBody = $scope.gridOptions.gridApi.grid.rows;
				var selectBody = [];

				for (var row = 0; row < $scope.body.length; row++) {
					if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == true)) {
						// 選択行を退避
						selectBody.push($scope.body[row]);
					}
				}


				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.body = selectBody;

				// 入力チェック
				api.messageMaster.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}
					// 画面項目マスタデータ更新
					api.messageMaster.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}
						// 明細を空に設定
						$scope.body = [];

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
