/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingInstDetail
 *
 * @description
 * 出荷指示明細画面<br>
 *
 * 出荷指示データを表示する画面。
 * 検索結果を選択し、出荷実績訂正画面に遷移する事ができる。
 *
 */
angular.module('oneslogiWms.ShippingInstDetail', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingInstDetail.service:ShippingInstDetailApi
 *
 * @description
 * 出荷指示明細画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * shippingStatus 出荷ステータスデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 出荷ステータスドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * depositCd 預託データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 預託ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * stockType 在庫区分データ操作用WebAPI<br>
 * ・resources/common/stockType/keyValueList 在庫区分ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * shippingInstDetail出荷指示明細データ操作用WebApi<br>
 * ・resources/shipping/slipNoShippingList/init 初期データ取得WebAPI<br>
 */
.factory('ShippingInstDetailApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingStatus: AngularAPIClient.make([
		                                      ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                      ]
		),
		depositCd: AngularAPIClient.make([
		                                      ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
		                                      ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		ShippingInstDetail: AngularAPIClient.make([
		                                           ['init', 'GET', 'resources/shipping/shippingInstDetail/init'],
		                                           ['search', 'GET', 'resources/shipping/shippingInstDetail/search']
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
 *
 * @description
 * 出荷指示明細画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingInstDetail', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'ShippingInstDetailApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api) {

	//グリッドの列情報
	$scope.shippingInstDetailCols = [
	                                 {field:"lineNo", displayName:"行No."},
	                                 {field:"productCd", displayName:"商品CD"},
	                                 {field:"mproduct.janCd", displayName:"JANCD"},
	                                 {field:"mproduct.productNm", displayName:"商品名称"},
	                                 {field:"mproduct.productAbbr", displayName:"商品略称"},
	                                 {field:"instNum", displayName:"指示数"},
	                                 {field:"allocNum", displayName:"引当済数"},
	                                 {field:"depositCd", displayName:"預託CD"},
	                                 {field:"mcustomer.customerNm", displayName:"預託名称"},
	                                 {field:"stockTypeCd", displayName:"在庫区分CD"},
	                                 {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
	                                 {field:"lot", displayName:"指定ロット"},
	                                 {field:"limitDt", displayName:"指定期限日"},
	                                 {field:"mlocation.locationNm", displayName:"指定ロケーション名称"},
	                                 // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
	                                 // [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 Start
	                                 {field:"tpickingBList[0].tstock.mlocation.mcenterClassDtlByAllocNgFlg.vdict.dictNm", displayName:"引当禁止フラグ"},
	                                 // [SK2-063、SK2-064] 引当禁止フラグは指示からじなくて、実績のロケーションより取得を修正 2014.12.16 許 End
	                                 // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
	                                 {field:"tshippingInstH.mcustomerBySupplyCustomerId.bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"納品先出荷停止フラグ"},
	                                 {field:"mproduct.bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"商品出荷停止フラグ"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#initScreen
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		var setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'shippingInstDetail',
			columnDefs: 'shippingInstDetailCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#initScreenHttp
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
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
				 $scope.deferredGetShippingStatus()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#deferredGetShippingStatus
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_STATUS";

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 出荷指示明細初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		var request = {};
		request.clientCd = $route.current.params.clientCd;
		request.centerCd = $route.current.params.centerCd;
		request.shippingSlipNo = $route.current.params.shippingSlipNo;

		api.ShippingInstDetail.init(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
				return;
			}

			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head; // 出荷指示ヘッダ関連
			$scope.shippingInstDetail = response.data.list; // 出荷指示ボディ関連

			// 初期値を設定
			$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
			$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
			$scope.searchCondition.shippingSlipNo = $route.current.params.shippingSlipNo;

			$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage,$scope.gridOptions.paginationPageSize);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				// [ON推-品向-513] 引数間違いを修正 2015.01.09 kawana Start
				owsCommon.clearPagingOptions($scope.gridOptions);
				// [ON推-品向-513] 引数間違いを修正 2015.01.09 kawana End
			}

			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana Start
	var isInitSearch = true;
	// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#getPagingData
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
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

		request.data.head.clientId = userInfo.clientIdByCd($route.current.params.clientCd);
		request.data.head.centerId = userInfo.centerIdByCd($route.current.params.centerCd);
		request.data.head.shippingSlipNo = $route.current.params.shippingSlipNo;

		api.ShippingInstDetail.search(request).then(function(response){
			// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana Start
			if(isInitSearch) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					return;
				}
			} else {
				statusInfo.isSuccessAndShowMessage(response, 'searchform');
			}
			isInitSearch = false;
			// [ON推-品向-536] 商品マスタ、取引先マスタから削除された場合の考慮追加 2015.01.14 kawana End
			$scope.searchCondition = response.data.head;
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#setPagingData
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-513] 検索後のスクロール位置を上に戻す処理を追加 2015.01.09 kawana Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-513] 検索後のスクロール位置を上に戻す処理を追加 2015.01.09 kawana End
		//取得したデータをグリッドに表示
		$scope.shippingInstDetail = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#getClassForRow
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// [#5592][v3.1] 欠品フラグの移動対応 / キャンセル色を削除 (処理の共通化) 2018.11.09 kawana Start

		var shippingStopFlg = '0';
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		// [SK2-062] 実績のロケが引当禁止であれば、引当禁止の場合は出荷停止の背景色とすることを修正 2014.12.16 許 Start
		if (row.entity.tshippingInstH.mcustomerBySupplyCustomerId.shippingStopFlg == "1" || row.entity.mproduct.shippingStopFlg == "1" ||  row.entity.tpickingBList.length!=0&&row.entity.tpickingBList[0].tstock.mlocation.allocNgFlg == "1") {
			// [SK2-062] 実績のロケが引当禁止であれば、引当禁止の場合は出荷停止の背景色とすることを修正 2014.12.16 許 End
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			// 出荷停止
			shippingStopFlg = '1'
		}

		var rowInfo = {
			shippingStopFlg : shippingStopFlg,
			stockOutFlg : wmsShipCommon.getStockOutFlgByNum(row.entity.stockOutNum)
		};

		return wmsShipCommon.getClassForRowNonStatus(rowInfo);

		// [#5592][v3.1] 欠品フラグの移動対応 / キャンセル色を削除 (処理の共通化) 2018.11.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#gridDblClick
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("shippingUpdate", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstDetail.object:ShippingInstDetail#shippingUpdate
	 * @methodOf oneslogiWms.ShippingInstDetail.object:ShippingInstDetail
	 *
	 * @description
	 * 実績訂正ボタン押下処理<br>
	 *
	 * 実績訂正ボタンを押下された時に処理、【出荷実績訂正】画面へ遷移する
	 */
	$scope.shippingUpdate = function() {

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		// 出荷実績訂正画面へ遷移
		$location.path("wms/shipping/ShippingUpdate").search({}).search("shippingInstBId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingInstBId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
