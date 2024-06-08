/**
 * @ngdoc overview
 * @name oneslogiWms.StockCheck
 *
 * @description
 * 国免在庫照合画面
 */
angular.module('oneslogiWms.StockCheck', [])

	/**
	 * @ngdoc service
	 * @name oneslogiWms.StockCheck.service:stockCheckApi
	 *
	 * @description
	 * 国免在庫照合WebApi定義<br>
	 * ・resources/stock/stockCheck/init 初期処理WebApi<br>
	 * ・resources/stock/stockCheck/search 検索処理WebApi<br>
	 * ・resources/stock/stockCheck/search 検索処理(Excel)WebApi<br>
	 * ・resources/common/centerClass/keyValueList アンマッチ有リスト取得<br>
	 * ・resources/common/product/record  銘柄CDデータ取得<br>
	 *
	 */
	.factory('stockCheckApi', ['AngularAPIClient', function(AngularAPIClient) {
		return {
			dropdownList: AngularAPIClient.make(
				[
					['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
			),
			stockCheck: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/stock/stockCheck/init'],
					['search', 'GET', 'resources/stock/stockCheck/search'],
					['excel', 'GET', 'resources/stock/stockCheck/search', 'excel']
				]
			),
			product: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/product/record']
				]
			)
		};
	}])

	/**
	 * @ngdoc object
	 * @name oneslogiWms.StockCheck.object:stockCheck
	 * @description
	 * 国免在庫照合画面コントローラ
	 */
	.controller('StockCheck', ['$scope', '$route', '$filter', '$location', '$q',
		'alertMessage', 'directiveControl', 'gridDirectiveControl',
		'optionMessageControl', 'gridOptionMessageControl', 'owsHistory',
		'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'stockCheckApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

			// 国免在庫照合グリッドの列情報（デザイン用）
			$scope.stockCheckListCols =
				[
					{ field: "productCd", displayName: "銘柄CD" },
					{ field: "sname", displayName: "銘柄名称" },
					{ field: "stockQtyCase", displayName: "販物在庫数量(ケース)" },
					{ field: "stockQtyCarton", displayName: "販物在庫数量(カートン)" },
					{ field: "chargeNumCase", displayName: "システム在庫数量(ケース)" },
					{ field: "chargeNumCarton", displayName: "システム在庫数量(カートン)" },
					{ field: "inventoryNumCase", displayName: "調査数量(ケース)" },
					{ field: "inventoryNumCarton", displayName: "調査数量(カートン)" },
					{ field: "diffExpectHanCase", displayName: "差異数量(システムｰ販物)(ケース)" },
					{ field: "diffExpectHanCarton", displayName: "差異数量(システムｰ販物)(カートン)" },
					{ field: "diffInvHanCase", displayName: "差異数量(調査ｰ販物)(ケース)" },
					{ field: "diffInvHanCarton", displayName: "差異数量(調査ｰ販物)(カートン)" },
					{ field: "diffInvExpectCase", displayName: "差異数量(調査ｰシステム)(ケース)" },
					{ field: "diffInvExpectCarton", displayName: "差異数量(調査ｰシステム)(カートン)" },
					{ field: "inventoryKey", displayName: "在庫調査指示キー" },
					{ field: "addDt", displayName: "販物在庫登録日時" },
					{ field: "usernum3", displayName: "一般出力順" },
					{ field: "mcenter.centerCd", displayName: "拠点CD" },
					{ field: "mcenter.centerNm", displayName: "拠点名称" },
					{ field: "mclient.clientCd", displayName: "荷主CD" },
					{ field: "mclient.clientNm", displayName: "荷主名称" }
				];

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#initScreen
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 画面初期化処理<br>
			 * ・検索条件枠を開いた状態に設定<br>
			 * ・グリッド設定<br>
			 * ・画面初期化用通信制御処理を呼び出し
			 */
			$scope.initScreen = function() {
				$scope.screenMode = $route.current.params.mode;

				//検索条件枠を開いた状態に設定
				$scope.isopen = true;

				// 拠点リストの設定
				$scope.centerList = userInfo.centerList;

				// 荷主リストの設定
				$scope.clientList = userInfo.clientList;

				$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
				
				$scope.pagingOptions.setPageData = function() {
					$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
				};

				// 国免在庫照合グリッドの設定
				$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
					data: 'StockCheck',
					columnDefs: 'stockCheckListCols',
					pagingOptions : $scope.pagingOptions
				});

				$scope.gridOptions.enableRowSelection = true;
				//画面初期化用通信処理を実行
				$scope.initScreenHttp();
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#initScreenHttp
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 画面初期化用の通信制御処理<br>
			 * ・初期化データ取得処理の実行設定<br>
			 */
			$scope.initScreenHttp = function() {
				//全通信終了後に以下関数で各種設定を実行
				$q.all(
					[
						$scope.deferredGetUnmatchList()
					]
				)
					.then(function(response) {
						// 画面初期化データ設定（同期処理）
						return $scope.deferredGetInitData();
					});
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#showProduct
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 銘柄コード検索ボタン押下処理<br>
			 *
			 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
			 */
			$scope.showProduct = function() {

				var items = {
					clientCd: $scope.searchCondition.mclient.clientCd,
					productCd: $scope.searchCondition.productCd
				};

				// 商品マスタのモーダル画面を表示
				var modalInstance = modalFactory.modalProduct(items);

				// モーダル画面が閉じられたら呼ばれるファンクションの登録
				modalInstance.result.then(function(selectedItem) {
					$scope.searchCondition.productCd = selectedItem.productCd;
					$scope.searchCondition.sname = selectedItem.productNm;
				});
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#deferredGetUnmatchList
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * アンマッチ有データ処理<br>
			 *
			 * サーバとの通信を行い、アンマッチ有データを取得し画面項目に反映する。
			 */
			$scope.deferredGetUnmatchList = function() {
				var deferred = $q.defer();

				var request = {};
				request.classCd = "UNMATCH";

				owsCommon.getDataCacheable(api.dropdownList, "query", request).then(function(response) {
					$scope.unmatchList = response.data;
					deferred.resolve();
				});

				return deferred.promise;
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#productCdBlur
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 銘柄コードのロストフォーカス処理<br>
			 *
			 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
			 */
			$scope.productCdBlur = function() {

				// 入力された銘柄コードを取得
				var productCd = $scope.searchCondition.productCd;

				if (productCd && 0 < productCd.length) {
					var request = {};
					request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
					request.productCd = productCd;

					// 商品情報の取得
					api.product.record(request).then(function(response) {
						$scope.searchCondition.sname = response.data.mProduct.productNm;
					});

				} else {
					$scope.searchCondition.sname = null;
				}
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#deferredGetInitData
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 国免在庫照合初期値取得・設定処理（同期可能）<br>
			 *
			 * サーバとの通信を行い、取得結果を画面項目に反映する。
			 */
			$scope.deferredGetInitData = function() {
				var deferred = $q.defer();
		
				api.stockCheck.init().then(function(response) {
		
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						deferred.reject();
						return;
					}
		
					$scope.searchCondition = response.data.head; // 国免在庫照合ヘッダ関連
					$scope.StockCheck = response.data.list; // 国免在庫照合リスト関連
					$scope.paging = response.paging;
					
					// ログイン情報より初期値を設定
					$scope.searchCondition.mcenter.centerCd = userInfo.centerCd; // 拠点の初期値設定
					$scope.searchCondition.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
					$scope.searchCondition.unmatch = "1"; // アンマッチの初期値設定(1:アンマッチ有のみ表示)
		
					// 履歴データ取得・検索処理
					if (owsHistory.hasState()) {
						$scope.searchCondition = owsHistory.popState();
						$scope.search();
		
					} else if ($scope.screenMode == SCREEN_MODE.Update) {
						$scope.searchCondition.inventoryKey = $route.current.params.instKey;
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
			 * @name oneslogiWms.StockCheck.object:StockCheck#excelOutput
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
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

				api.stockCheck.excel(request).then(function(response) {
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						location.href = response.output.downloadUrl;
					} else {
						$scope.setSearchData(response);
					}
				});
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#search
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * 検索ボタン押下処理<br>
			 * ・検索処理呼び出し
			 */
			$scope.search = function() {
				owsCommon.clearPagingOptions($scope.gridOptions);
				$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#getPagedDataAsync
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * データ取得処理<br>
			 *
			 * サーバとの通信を行い、データを取得する。
			 */
			$scope.getPagedDataAsync = function(pageSize, page) {
				var request = {};
				request.data = {};
				request.data.head = $scope.searchCondition;

				owsCommon.setPagingData(request, $scope.paging, pageSize, page);

				api.stockCheck.search(request).then(function(response) {
					statusInfo.isSuccessAndShowMessage(response, 'searchform');
					$scope.setSearchData(response);
				});
			};

			/**
			 * @ngdoc method
			 * @name oneslogiWms.StockCheck.object:StockCheck#setSearchData
			 * @methodOf oneslogiWms.StockCheck.object:StockCheck
			 *
			 * @description
			 * データ設定処理<br>
			 *
			 * 取得結果を画面項目に反映する。
			 */
			$scope.setSearchData = function(response) {
				//選択状態をクリアする
				owsCommon.toggleSelectAll($scope.gridOptions, false);
				// 検索ボタン押下後のスクロール位置を上に戻す処理
				$scope.gridOptions.gridViewport.scrollTop(0);
				//取得したデータをグリッドに表示
				$scope.StockCheck = response.data.list;
				//トータル件数を設定
				$scope.gridOptions.totalItems = response.paging.allRecordCount;
				//検索条件を履歴に保存
				owsHistory.replaceState($scope.searchCondition);
			};

			//画面初期化処理を実行
			$scope.initScreen();
		}]);

