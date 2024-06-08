/**
 * @ngdoc overview
 * @name oneslogiWms.NonconformityLabelPrint
 *
 * @description
 * 不適品ラベル出力画面
 *
 */
angular.module('oneslogiWms.NonconformityLabelPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.NonconformityLabelPrint.service:NonconformityLabelPrintApi
 *
 * @description
 * 不適品ラベル出力用WebAPI定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/product/record 商品CDデータ取得用WebApi<br>
 * ・resources/returns/nonconformityLabelPrint/init 初期処理用WebAPI<br>
 * ・resources/returns/nonconformityLabelPrint/search 検索用WebApi<br>
 * ・resources/returns/nonconformityLabelPrint/checkPrint 不適品ラベル発行 事前チェック用WebAPI<br>
 * ・resources/returns/nonconformityLabelPrint/print 不適品ラベル発行用WebAPI<br>
 * 
 */
.factory('NonconformityLabelPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
			[
				['query', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		product: AngularAPIClient.make(
			[
				['record', 'GET', 'resources/common/product/record']
			]
		),
		mainList: AngularAPIClient.make(
			[
				['init', 'GET', 'resources/returns/nonconformityLabelPrint/init'],
				['search', 'GET', 'resources/returns/nonconformityLabelPrint/search'],
				['excel', 'GET', 'resources/returns/nonconformityLabelPrint/search', 'excel'],
				['checkPrint', 'POST', 'resources/returns/nonconformityLabelPrint/checkPrint'],
				['print', 'GET', 'resources/returns/nonconformityLabelPrint/print']
			]
		),
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
 *
 * @description
 * 不適品ラベル出力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('NonconformityLabelPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'wmsShipCommon', 'NonconformityLabelPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, wmsShipCommon, api) {

	// グリッドの列情報（デザイン用）
	$scope.NonconformityLabelPrintCols = [
		{ field: "createddate", displayName: "ラベル作成日時" },
		{ field: "targetmon", displayName: "対象月" },
		{ field: "itemcd", displayName: "銘柄CD" },
		{ field: "productAbbr", displayName: "銘柄名称" },
		{ field: "lblkbn", displayName: "ラベル区分" },
		{ field: "inoutkbn", displayName: "内外区分" },
		{ field: "vaExtdata2", displayName: "銘柄区分" },
		{ field: "allocpolicykey", displayName: "特販業者" },
		{ field: "caseNum", displayName: "ケース当個装数" },
		{ field: "baditemcd", displayName: "ラベル番号" },
		{ field: "todayCnt", displayName: "当日作成ラベル枚数" },
		{ field: "reprintedflg", displayName: "印刷ステータス" },
		{ field: "vaExtdata1", displayName: "再印刷区分" },
		{ field: "rtnCompanyName", displayName: "返送先拠点名称" },
		{ field: "itemkbn", displayName: "銘柄区分CD" },
		{ field: "usernum3", displayName: "一般出力順" },
		{ field: "centerCd", displayName: "拠点CD" },
		{ field: "centerAbbr", displayName: "拠点名称" },
		{ field: "clientCd", displayName: "荷主CD" },
		{ field: "clientAbbr", displayName: "荷主名称" },
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#initScreen
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

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
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// ページ変更時の動作をページングの設定に追加
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'nonconformityLabelPrintList',
			columnDefs: 'NonconformityLabelPrintCols',
			pagingOptions: $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#initScreenHttp
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {
		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
			[
				$scope.deferredGetReprintedflg(),
				$scope.deferredGetInoutkbn(),
				$scope.deferredGetVaExtdata2(),
				$scope.deferredGetTodayPrintOnlyFlg(),
			]
		)
			.then(function(response) {
				// 画面初期化データ設定（同期処理）
				return $scope.deferredGetInitData();
			});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#deferredGetReprintedflg
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 印刷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReprintedflg = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.reprintedflgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#deferredGetInoutkbn
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 内外区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInoutkbn = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FCFLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.inoutkbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#deferredGetVaExtdata2
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 銘柄区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetVaExtdata2 = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SYHN_KBN";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.vaExtdata2List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#deferredGetTodayPrintOnlyFlg
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 当日作成ラベル枚数取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTodayPrintOnlyFlg = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TODAY_PRINT_ONLY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
			$scope.todayPrintOnlyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#deferredGetInitData
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 不適品ラベルデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function() {
		var deferred = $q.defer();

		api.mainList.init().then(function(response) {
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;

			// ラベル出力用
			$scope.printDto = response.data.printData;

			// ログイン情報より初期値を設定
			$scope.searchCondition.centerCd = userInfo.centerCd;
			$scope.searchCondition.clientCd = userInfo.clientCd;
			$scope.searchCondition.createddateFrom = userInfo.systemDt;
			$scope.searchCondition.createddateTo = userInfo.systemDt;
			$scope.searchCondition.targetmon = userInfo.systemDt;
			$scope.searchCondition.reprintedflg = "0";

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
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#search
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#getPagingData
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.mainList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#setPagingData
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す
		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.nonconformityLabelPrintList = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#excelOutput
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.mainList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				location.href = response.output.downloadUrl;
			} else {
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#output
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description 発行処理<br>
	 *
	 * 選択された不適品ラベルデータのチェックを行い、帳票発行を行う。
	 */
	$scope.output = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		api.mainList.checkPrint(request).then(function(checkResponse) {
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint($scope.printDto.printBasicData);
			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam) {
				request.data.printData = {};
				request.data.printData.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.print(request).then(function(response) {
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}

					//帳票発行後に再検索する
					$scope.search();

					// 選択状態をクリアする
					owsCommon.toggleSelectAll($scope.gridOptions, false);

				}).catch(function(response) {
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#showProduct
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 銘柄CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された銘柄情報を画面項目に反映する。
	 */
	$scope.showProduct = function() {
		var items = {
			clientCd: $scope.searchCondition.clientCd,
			productCd: $scope.searchCondition.itemcd
		};

		// 銘柄マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem) {
			$scope.searchCondition.itemcd = selectedItem.productCd;
			$scope.productNm = selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint#productCdBlur
	 * @methodOf oneslogiWms.NonconformityLabelPrint.object:NonconformityLabelPrint
	 *
	 * @description
	 * 銘柄CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、銘柄情報を画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された銘柄CDを取得
		var productCd = $scope.searchCondition.itemcd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.clientCd);
			request.productCd = productCd;

			// 銘柄情報の取得
			api.product.record(request).then(function(response) {
				$scope.searchCondition.itemcd = response.data.mProduct.productCd;
				$scope.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.itemcd = null;
			$scope.productNm = null;
		}
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
