/**
 * @ngdoc overview
 * @name oneslogiWms.WorkloadInquiry
 *
 * @description
 * 作業量照会画面<br>
 *
 * 作業実績を一覧表示する画面。
 */
angular.module('oneslogiWms.WorkloadInquiry', [])

	/**
	 * @ngdoc service
	 * @name oneslogiWms.WorkloadInquiry.service:WorkloadInquiryApi
	 *
	 * @description
	 * 作業量照会画面用WebAPI定義<br>
	 *
	 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
	 * <br>
	 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
	 * ・resources/operation/workloadInquiry/init 初期処理WebAPI<br>
	 * ・resources/operation/workloadInquiry/search 検索処理WebAPI<br>
	 * ・resources/operation/workloadInquiry/csvOutput CSV出力処理WebAPI<br>
	 */
	.factory('WorkloadInquiryApi', ['AngularAPIClient', function(AngularAPIClient) {
		return {
			dropdownList: AngularAPIClient.make([
				['query', 'GET', 'resources/common/centerClass/keyValueList']
			]),
			workloadInquiryApi: AngularAPIClient.make([
				['init', 'GET', 'resources/operation/workloadInquiry/init'],
				['search', 'GET', 'resources/operation/workloadInquiry/search'],
				['excel', 'GET', 'resources/operation/workloadInquiry/search', 'excel'],
				['csv', 'GET', 'resources/operation/workloadInquiry/csvOutput', 'csv']
			])
		};
	}])

	/**
	 * @ngdoc object
	 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
	 *
	 * @description
	 * 作業量照会画面用コントローラ<br>
	 *
	 * 当画面の制御ロジックはここに実装される。
	 */
	.controller('WorkloadInquiry', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'WorkloadInquiryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

		//グリッドの列情報
		$scope.WorkloadInquiryCols =
			[
				{ field: "workDt", displayName: "作業年月日" },
				{ field: "usercd", displayName: "ユーザCD" },
				{ field: "userNm", displayName: "作業者名称" },
				{ field: "taskTypeNm", displayName: "業務区分" },
				{ field: "taskTypeDetailNm", displayName: "業務名称" },
				{ field: "worktime", displayName: "作業時刻" },
				{ field: "startEndNm", displayName: "開始終了" },
				{ field: "workPalletQty", displayName: "パレット数" },
				{ field: "workCaseQty", displayName: "ケース数" },
				{ field: "workCartonQty", displayName: "カートン数" },
				{ field: "workQty", displayName: "個装数" },
				{ field: "centerCd", displayName: "拠点CD" },
				{ field: "centerNm", displayName: "拠点名称" },
			];

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#initScreen
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * 画面初期化処理<br>
		 *
		 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
		 */
		$scope.initScreen = function() {

			//検索条件を表示状態に変更
			$scope.isopen = true;

			//拠点リストの設定
			$scope.centerList = userInfo.centerList;

			//荷主リストの設定
			$scope.clientList = userInfo.clientList;

			// 日付大小チェック
			$scope.fromToCheck = function(fromValue, toValue) {
				var fromValueString = owsCommon.dateToString(fromValue);
				var toValueString = owsCommon.dateToString(toValue);

				if (fromValueString != null && fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
					return false;
				}

				return true;
			};

			// 日付大小チェック用メッセージ
			$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

			//ページングの設定(ページング有り)
			$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
			$scope.pagingOptions.setPageData = function() {
				$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
			};

			//グリッドの設定
			$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
				data: 'WorkloadInquiry',
				columnDefs: 'WorkloadInquiryCols',
				pagingOptions: $scope.pagingOptions
			});

			// 画面初期化用通信処理を実行
			$scope.initScreenHttp();
		}

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#initScreenHttp
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
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
					// 業務区分取得
					$scope.deferredGetTaskTypeList(),
					// 業務名称取得
					$scope.deferredGetTaskTypeDetailList(),
					// 開始終了取得
					$scope.deferredGetStartendTypeList()
				]
			)
				.then(function(response) {
					// 画面初期化データ設定（同期処理）
					return $scope.deferredGetInitData();
				});

		}

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#deferredGetReceiveStatus
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description 業務区分取得・設定処理<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetTaskTypeList = function() {
			var deferred = $q.defer();

			var request = {};
			request.classCd = "TASKTYPE";

			owsCommon.getDataCacheable(api.dropdownList, "query", request).then(function(response) {
				$scope.taskTypeList = response.data;
				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#deferredGetTaskTypeDetailList
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description 業務名称取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetTaskTypeDetailList = function() {
			var deferred = $q.defer();

			var request = {};
			request.classCd = "TASKTYPEDETAIL";

			owsCommon.getDataCacheable(api.dropdownList, "query", request).then(function(response) {
				$scope.taskTypeDetailList = response.data;
				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#deferredGetStartendTypeList
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description 開始終了取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetStartendTypeList = function() {
			var deferred = $q.defer();

			var request = {};
			request.classCd = "START_END";

			owsCommon.getDataCacheable(api.dropdownList, "query", request).then(function(response) {
				$scope.startEndList = response.data;
				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#deferredGetInitData
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description 作業量照会初期値取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetInitData = function() {
			var deferred = $q.defer();

			api.workloadInquiryApi.init().then(function(response) {
				// DTOを格納する
				$scope.paging = response.paging;
				$scope.searchCondition = response.data.head;
				$scope.WorkloadInquiry = response.data.list;

				// ログイン情報より初期値を設定
				$scope.searchCondition.centerCd = userInfo.centerCd;
				$scope.searchCondition.clientCd = userInfo.clientCd;
				$scope.searchCondition.workDt = userInfo.systemDt;

				// 履歴データ取得・検索処理
				if (owsHistory.hasState()) {
					$scope.searchCondition = owsHistory.popState();
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
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#search
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * 検索ボタン押下処理<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.search = function() {

			owsCommon.clearPagingOptions($scope.gridOptions);

			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#getPagingData
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * 指定ページデータ取得処理<br>
		 *
		 * サーバとの通信を行い、指定ページのデータを取得する。
		 */
		$scope.getPagingData = function(pageSize, page) {

			var request = {};
			request.data = {};
			request.data.head = $scope.searchCondition;

			// ページング用データ設定
			owsCommon.setPagingData(request, $scope.paging, pageSize, page);

			// 検索用API呼び出し
			api.workloadInquiryApi.search(request).then(function(response) {

				statusInfo.isSuccessAndShowMessage(response, 'searchform');
				$scope.setPagingData(response, page, pageSize);

			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#setPagingData
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * 指定ページデータ設定処理<br>
		 *
		 * 取得結果を画面項目に反映する。
		 */
		$scope.setPagingData = function(response, page, pageSize) {

			//選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);

			//検索ボタン押下後のスクロール位置を上に戻す
			$scope.gridOptions.gridViewport.scrollTop(0);

			//取得したデータをグリッドに表示
			$scope.WorkloadInquiry = response.data.list;

			//トータル件数を設定
			$scope.gridOptions.totalItems = response.paging.allRecordCount;

			//検索条件を履歴に保存
			owsHistory.replaceState($scope.searchCondition);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#excelOutput
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * Excel出力処理<br>
		 *
		 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
		 */
		$scope.excelOutput = function() {
			var request = {};
			request.data = {};
			request.data.head = $scope.searchCondition;

			// ファイル出力用パラメータ設定
			owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

			api.workloadInquiryApi.excel(request).then(function(response) {
				if (statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					location.href = response.output.downloadUrl;
				} else {
					$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
				}
			});

		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#csvOutput
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * CSV出力処理<br>
		 *
		 * サーバとの通信を行い、取得結果をCSVファイルでダウンロードする。
		 */
		$scope.csvOutput = function() {

			var request = {};
			request.data = {};
			request.data.head = $scope.searchCondition;
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 出力ファイル名取得
			var csvFileName = $scope.getFileName();

			// ファイル出力用パラメータ設定
			owsCommon.setOutputOptions(request, $scope.gridOptions, "list", csvFileName);

			api.workloadInquiryApi.csv(request).then(function(response) {

				if (statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					location.href = response.output.downloadUrl;
				}

			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.WorkloadInquiry.object:WorkloadInquiry#getFileName
		 * @methodOf oneslogiWms.WorkloadInquiry.object:WorkloadInquiry
		 *
		 * @description
		 * ファイル名取得処理<br>
		 *
		 * システム日時よりファイル名を編集する。
		 */
		$scope.getFileName = function() {

			var date = new Date();
			var yyyy = date.getFullYear();
			var MM = date.getMonth() + 1;
			var dd = date.getDate();
			var hh = date.getHours();
			var mm = date.getMinutes();
			var ss = date.getSeconds();

			yyyy = yyyy.toString();
			MM = ("00" + MM).slice(-2);
			dd = ("00" + dd).slice(-2);
			hh = ("00" + hh).slice(-2);
			mm = ("00" + mm).slice(-2);
			ss = ("00" + ss).slice(-2);

			return "DLGLR053_" + yyyy + MM + dd + hh + mm + ss;

		}

		// 画面初期化処理を実行
		$scope.initScreen();

	}]);
