/**
 * @ngdoc overview
 * @name oneslogiWms.CenterRelatedCopy
 *
 * @description センタ関連マスタ作成画面<br>
 *
 */
angular.module('oneslogiWms.CenterRelatedCopy', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterRelatedCopy.service:CenterRelatedCopyApi
 *
 * @description センタ関連マスタ作成画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi ・resources/common/centerClass/keyValueList <br>
 * centerRelatedCopy センタマスタデータ操作用WebApi<br>
 * ・resources/master/centerRelatedCopy/init 初期データ取得WebAPI<br>
 * ・resources/master/centerRelatedCopy/inputCheck 入力チェックWebAPI<br>
 * ・resources/master/centerRelatedCopy/register 入力データ登録WebAPI<br>
 */
.factory('centerRelatedCopyApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		clientCenterList: AngularAPIClient.make(
			[
				['query', 'GET', 'resources/common/param/query']
			]
		),
		clientList: AngularAPIClient.make(
			[
				['query', 'GET', 'resources/common/clientCd/query']
			]
		),
		centerRelatedCopy: AngularAPIClient.make(
			[
				['init',        'GET',  'resources/master/centerRelatedCopy/init'],
				['search',      'GET',  'resources/master/centerRelatedCopy/search'],
				['inputCheck',  'POST', 'resources/master/centerRelatedCopy/inputCheck'],
				['register',    'POST', 'resources/master/centerRelatedCopy/register']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
 *
 * @description センタマスタメンテナンス(コピー)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CenterRelatedCopy', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'centerRelatedCopyApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.copyMasterListCols = [
	                            ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#initScreen
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// ページングの設定
		$scope.pagingOptions = {
			pageSizes: [0],
			pageSize: 0,
			currentPage: 1
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'copyMasterList',
			columnDefs: 'copyMasterListCols'
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#initScreenHttp
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
			[
			 $scope.deferredGetClientCenterList(),
			 $scope.deferredGetClientList(),
			]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

		return;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#deferredGetInitData
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description
	 * センタ関連マスタ作成処理初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function() {
		var deferred = $q.defer();

		api.centerRelatedCopy.init().then(function(response) {
			$scope.mCenterFrom = response.data.mCenterFrom;
			$scope.mClientFrom = response.data.mClientFrom;
			$scope.mCenterTo = response.data.mCenterTo;
			$scope.mClientTo = response.data.mClientTo;
			$scope.data = response.data;

			$scope.copyMasterList = response.data.body; // コピー対象マスタ
			$scope.paging = response.paging;

			$scope.search();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#search
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		var request = {};
		request.data = {};
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#getPagingData
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 * @description
	 * 検索処理<br>
	 * ・センタ関連マスタ作成検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.centerRelatedCopy.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'inputform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#setPagingData
     * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.copyMasterList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#deferredGetClientCenterList
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description 荷主センタリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientCenterList = function() {
		var deferred = $q.defer();

		var request = {};
		var centerCd = null;

		if ($scope.mCenterFrom) {
			centerCd = $scope.mCenterFrom.centerCd;
		}

		request.centerCd = centerCd;

		api.clientCenterList.query(request).then(function(response) {
			$scope.clientCenterList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#deferredGetClientList
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description 荷主リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientList = function() {
		var deferred = $q.defer();

		var request = {};

		api.clientList.query(request).then(function(response) {
			$scope.clientList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#centerChange
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description センタ変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerFromChange = function() {

		$scope.mClientFrom.mclient.clientCd = null;

		$q.all([
	        $scope.deferredGetClientCenterList(),
		]).then(function(response) {
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy#register
	 * @methodOf oneslogiWms.CenterRelatedCopy.object:CenterRelatedCopy
	 *
	 * @description 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

			owsCommon.syncExec(function() {

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数

				// 新規登録関数を設定
				checkFunc = api.centerRelatedCopy.inputCheck;
				execFunc = api.centerRelatedCopy.register;

				var listBody = [];

				for (var row = 0; row < $scope.copyMasterList.length; row++) {
					if($scope.gridOptions.getSelection($scope.gridOptions.gridApi.grid.rows[row])) {
						listBody.push($scope.copyMasterList[row]);
					}
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.mCenterFrom = $scope.mCenterFrom;
				request.data.mClientFrom = $scope.mClientFrom;
				request.data.mCenterTo = $scope.mCenterTo;
				request.data.mClientTo = $scope.mClientTo;
				request.data.body = listBody;
				// 入力チェック
				checkFunc(request).then(function(checkResponse) {

					if (checkResponse.status.listStatus != null) {
						for(var i = 0 ;i <checkResponse.status.listStatus.length;i++) {
							// センタCD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 2) {
								optionMessageControl.show($scope, "centerCdTo", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// センタマスタメンテナンスデータ登録
					execFunc(request).then(function(execResponse) {

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						return;
					}
				});

			});

		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
