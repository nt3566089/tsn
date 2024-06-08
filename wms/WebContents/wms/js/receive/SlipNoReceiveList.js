/**
 * @ngdoc overview
 * @name oneslogiWms.SlipNoReceiveList
 *
 * @description
 * 伝票別入荷一覧画面<br>
 *
 * 入荷予定データならびに実績データを伝票別に集約して一覧表示する画面。
 */
angular.module('oneslogiWms.SlipNoReceiveList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SlipNoReceiveList.service:SlipNoReceiveListApi
 *
 * @description
 * 伝票別入荷一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 入荷ステータドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * slipNoReceiveList 伝票別入荷一覧データ操作用WebApi<br>
 * ・resources/receive/slipNoReceiveList/initSearch 初期処理WebAPI<br>
 * ・resources/receive/slipNoReceiveList/search 検索WebAPI<br>
 * ・resources/receive/slipNoReceiveList/inputCheckReportPrint 入力チェック(入荷予定リスト)WebAPI<br>
 * ・resources/receive/slipNoReceiveList/reportPrint 入荷予定リスト発行WebAPI<br>
 * ・resources/receive/slipNoReceiveList/inputCheckDelete チェック処理（入荷予定削除）WebAPI<br>
 * ・resources/receive/slipNoReceiveList/delete 入荷予定削除WebAPI<br>
 * ・resources/receive/slipNoReceiveList/inputCheckErrorCheck チェック処理（エラーチェック）WebAPI<br>
 * ・resources/receive/slipNoReceiveList/errorCheck エラーチェックWebAPI<br>
 * supplierCustomer ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 仕入先データ取得WebAPI<br>
 * <br>
 */
.factory('SlipNoReceiveListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		bClass: AngularAPIClient.make([
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList']
		]),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End


		slipNoReceiveList: AngularAPIClient.make([
		                                          ['initSearch', 'GET', 'resources/receive/SlipNoReceiveList/initSearch'],
		                                          ['search', 'GET', 'resources/receive/SlipNoReceiveList/search'],
		                                          ['inputCheckReportPrint',  'POST', 'resources/receive/SlipNoReceiveList/inputCheckReportPrint'],
		                                          ['reportPrint',  'GET', 'resources/receive/SlipNoReceiveList/reportPrint'],
		                                          ['inputCheckDelete',  'POST', 'resources/receive/SlipNoReceiveList/inputCheckDelete'],
		                                          ['delete',  'POST', 'resources/receive/SlipNoReceiveList/delete'],
		                                          ['inputCheckErrorCheck',  'POST', 'resources/receive/SlipNoReceiveList/inputCheckErrorCheck'],
		                                          ['errorCheck',  'POST', 'resources/receive/SlipNoReceiveList/errorCheck'],
		                                          // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
		                                          ['productLabel',  'GET', 'resources/receive/SlipNoReceiveList/productLabel'],
		                                          ['inputCheckProductLabel',  'POST', 'resources/receive/SlipNoReceiveList/inputCheckProductLabel'],
		                                          // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
		                                          ['excel', 'GET', 'resources/receive/SlipNoReceiveList/search', 'excel'],
		                                          // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
		                                          ['productLabelPrint', 'GET', 'resources/receive/SlipNoReceiveList/productLabelPrint'],
		                                          // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
		                                          ['print', 'GET', 'resources/receive/receivePlanListPrint/print']
		                                          ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
 *
 * @description
 * 伝票別入荷一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('SlipNoReceiveList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'SlipNoReceiveListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	//グリッドの列情報
	$scope.SlipNoReceiveListCols = [
	                                {field:"receivePlanDt", displayName:"入荷予定日"},
	                                {field:"lastStoreDt", displayName:"入庫日"},
	                                {field:"mcustomerByPlanSupplierId.customerCd", displayName:"仕入先CD"},
	                                {field:"mcustomerByPlanSupplierId.customerNm", displayName:"仕入先名称"},
	                                {field:"mcustomerByPlanSupplierId.customerAbbr", displayName:"仕入先略称"},
	                                {field:"maxCustomerCd", displayName:"仕入先CD"},
	                                {field:"maxCustomerNm", displayName:"仕入先名称"},
	                                {field:"maxCustomerAbbr", displayName:"仕入先略称"},
	                                {field:"planClientReceiveNo", displayName:"予定顧客入荷指示No."},
	                                {field:"maxClientReceiveNo", displayName:"顧客入荷指示No."},
	                                {field:"receiveSlipNo", displayName:"WMS入荷伝票No."},
	                                {field:"oldReceiveSlipNo", displayName:"元WMS入荷伝票No."},
	                                {field:"receiveStatus", displayName:"入荷ステータス"},
	                                {field:"bclassDtlByReceiveStatus.vdict.dictNm", displayName:"入荷ステータス名称"},
	                                {field:"receiveDeliveryStatus", displayName:"入荷納品ステータス"},
	                                {field:"bclassDtlByReceiveDeliveryStatus.vdict.dictNm", displayName:"入荷納品ステータス名称"},
	                                {field:"mprocessType.processTypeCd", displayName:"予定処理区分CD"},
	                                {field:"mprocessType.vdict.dictNm", displayName:"予定処理区分名称"},
	                                {field:"maxProcessTypeCd", displayName:"処理区分CD"},
	                                {field:"maxProcessTypeNm", displayName:"処理区分名称"},
	                                {field:"mstockType.stockTypeCd", displayName:"予定在庫区分CD"},
	                                {field:"mstockType.vdict.dictNm", displayName:"予定在庫区分名称"},
	                                {field:"maxStockTypeCd", displayName:"在庫区分CD"},
	                                {field:"maxStockTypeNm", displayName:"在庫区分名称"},
	                                {field:"sumPlanCount", displayName:"明細行数"},
	                                {field:"sumPlanNum", displayName:"予定数合計"},
	                                {field:"sumStoreNum", displayName:"入庫数合計"},
	                                {field:"treceivePlanRAsOne.rplOutDt", displayName:"入荷予定リスト出力日時"},
	                                {field:"messageNm", displayName:"エラーメッセージ"}
	                                ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#initScreen
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		//[ON推-入荷ステータス別進捗画面の新規作成]入荷ステータス別進捗画面から遷移できるための修正 2016.04.04 chou Add Start
		// モード設定
		$scope.screenMode = $route.current.params.mode;
		//[ON推-入荷ステータス別進捗画面の新規作成]入荷ステータス別進捗画面から遷移できるための修正 2016.04.04 chou Add End

		// 画面項目（表示用）の初期化処理
		clearViewItem();

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};

		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		//[ON推-改修]ページングできるように修正 2016.03.29 chou Start

//		// ページングの設定(ページングなし)
//		$scope.pagingOptions = {
//			pageSizes: [0],
//			pageSize: 0,
//			currentPage: 1
//		};
//
//		// グリッドの設定
//		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
//			data: 'SlipNoReceiveList',
//			columnDefs: 'SlipNoReceiveListCols'
//		});

		//ページングの設定(ページング有り)
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana End

		//グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'SlipNoReceiveList',
			columnDefs: 'SlipNoReceiveListCols',
			pagingOptions : $scope.pagingOptions
		});

		//[ON推-改修]ページングできるように変更 2016.03.29 chou End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#initScreenHttp
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
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
				 $scope.deferredGetReceiveStatus(),
				 // [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				 $scope.deferredGetCenterTransitFlgList(),
				 // [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana Start
				 $scope.deferredGetDeleteDisplayList()
				// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReceiveStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RECEIVE_STATUS";

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		owsCommon.getDataCacheable(api.bClass, "getList", request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.receiveStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#deferredGetCenterTransitFlgList
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description センタ移動フラグの選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCenterTransitFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CENTER_TRANSIT_FLG";
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		owsCommon.getDataCacheable(api.bClass, "getList", request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.centerTransitFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

	// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#deferredGetDeleteDisplayList
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description 削除データ表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDeleteDisplayList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELETE_DATA_DISPLAY";
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		owsCommon.getDataCacheable(api.bClass, "getList", request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
			$scope.deleteDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#deferredGetInitData
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 伝票別入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.slipNoReceiveList.initSearch().then(function(response){
			$scope.printParam = response.data.test.printBasicData;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
			$scope.printParam2 = response.data.test2.printBasicData;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;
			$scope.receivePlanListPrintDto = response.data.test;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			// [C-NIS-0006] 入荷予定日のデフォルト制御追加 2015.07.03 hayashi Start
			// 入荷予定日From
			if(response.data.dtFromDefFlg == 1){
				$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;
			}
			// 入荷予定日To
			if(response.data.dtToDefFlg == 1){
				$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;
			}
			// [C-NIS-0006] 入荷予定日のデフォルト制御追加 2015.07.03 hayashi End
			// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana Start
			$scope.searchCondition.deleteDisplay = owsCommon.getDefaultValue($scope.deleteDisplayList);
			// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana End

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 kawana Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();
			}
			//[ON推-入荷ステータス別進捗画面の新規作成]入荷ステータス別進捗画面から遷移できるための修正 2016.04.04 chou Add Start
			 else if ($scope.screenMode == SCREEN_MODE.Read) {

					$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
					$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
					$scope.searchCondition.receivePlanDtFrom = $route.current.params.receivePlanDtFrom;
					$scope.searchCondition.receivePlanDtTo = $route.current.params.receivePlanDtTo;
					$scope.searchCondition.receiveStatus = $route.current.params.receiveStatus;
					$scope.searchCondition.planSupplierCd = $route.current.params.planSupplierCd;
					$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = $route.current.params.planSupplierNm;
					//シリアル管理機能追加 2017.02.20 sja Start
					$scope.searchCondition.receiveSlipNo = $route.current.params.receiveSlipNo;
					//シリアル管理機能追加 2017.02.20 sja End
					$scope.search();
				}
			//[ON推-入荷ステータス別進捗画面の新規作成]入荷ステータス別進捗画面から遷移できるための修正 2016.04.04 chou Add End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#search
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#getPagingData
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
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

		api.slipNoReceiveList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#setPagingData
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
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

		// [ON推-品向-324] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-324] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.SlipNoReceiveList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		//進捗率を設定
//		if (response.data.progress) {
//			var storeParcent;
//			var receivingParcent;
//
//			if (response.data.progress.allCount == 0) {
//				// 画面項目（表示用）の初期化処理
//				clearViewItem();
//			} else {
//				// [ON推-品向-239] 進捗率の計算方法は四捨五入になっています為、切り捨てに修正 2014.11.21 KI Start
//				storeParcent = Math.floor((response.data.progress.storedCount / response.data.progress.allCount) * 100);
//				receivingParcent = Math.floor((response.data.progress.receivingCount / response.data.progress.allCount) * 100);
//				// [ON推-品向-239] 進捗率の計算方法は四捨五入になっています為、切り捨てに修正 2014.11.21 KI End
//				$scope.storeParcent = storeParcent + "%";
//				$scope.receivingParcent = receivingParcent + "%";
//				$scope.nonReceiveParcent = (100 - storeParcent - receivingParcent) + "%";
//			}
//		};
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#getClassForRow
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、削除フラグで判断処理を削除  2014.11.28 許
		if (row.entity.receiveStatus == "01") {
			return "wmslegendwhite";
		} else if (row.entity.receiveStatus == "02") {
			return "wmslegendlightyellow";
		} else if (row.entity.receiveStatus == "03") {
			return "wmslegendcyan";
			// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷削除の入荷ステータス判断処理を追加 許 2014.11.28 Start
		} else if (row.entity.receiveStatus == "90") {
			return "wmslegendred";
			// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷削除の入荷ステータス判断処理を追加 許 2014.11.28 End
		} else if (row.entity.receiveStatus == "99") {
			return "wmslegendpink";
		}

		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#excelOutput
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
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

		api.slipNoReceiveList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
			else
			{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage,$scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#gridDblClick
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("receiveInput", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#showCustomer
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				vendorCd: $scope.searchCondition.planSupplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.planSupplierCd = selectedItem.customerCd;
			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#customerCdBlur
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		// 入力された仕入先コードを取得
		var customerCd = $scope.searchCondition.planSupplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#reportPrint
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 入荷予定リストボタン押下処理<br>
	 *
	 * 入荷予定リストボタンを押下された時に処理、入荷予定リスト発行データをチェックを行う
	 */
	$scope.reportPrint = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

//		// 複数行が選択されている場合
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
//		alertMessage.setErrorMessageByCode("onlyOneSelect");
//		return;
//		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// 入力チェック(入荷予定リスト)
		api.slipNoReceiveList.inputCheckReportPrint(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// 入荷予定リスト発行
			api.slipNoReceiveList.reportPrint(request).then(function(Response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(Response, 'searchform')) {
					return;
				}

				// プリンタ選択画面を表示
				var modalInstance = printFactory.modalPrint($scope.printParam);

				// モーダル画面が閉じられたら呼ばれるファンクションの登録
				modalInstance.result.then(function(printParam){
					var listBody = [];

					for(var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++)
					{
						var request = {};
						request = angular.copy($scope.receivePlanListPrintDto);
						request.data.search.treceivePlanH.mcenter.centerCd = $scope.searchCondition.mcenter.centerCd;
						request.data.search.treceivePlanH.mclient.clientCd = $scope.searchCondition.mclient.clientCd;
						request.data.search.treceivePlanH.receivePlanDtFrom = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].receivePlanDt;
						request.data.search.treceivePlanH.receivePlanDtTo = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].receivePlanDt;
						request.data.search.treceivePlanH.clientReceiveNo = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientReceiveNo;
						request.data.search.treceivePlanH.receiveSlipNo = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].receiveSlipNo;
						request.printBasicData = printParam.printBasicData;

						listBody[row] = request;
					}

					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
					var subWindow;
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfBlankWindow();
					}

					// 発行
					api.slipNoReceiveList.print(listBody).then(function(response){
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
						// [SK2-021] 帳票発行後に再検索するように修正します。 2014.12.10 衛 Start
						$scope.search();
						// [SK2-021] 帳票発行後に再検索するように修正します。 2014.12.10 衛 End
						// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.20 kawana Start
					}).catch(function(response){
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
						// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.20 kawana End
					});
				});
				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#productReceiveList
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 商品別入荷予定一覧ボタン押下処理<br>
	 *
	 * 商品別入荷一覧ボタンを押下された時に処理、【商品別入荷一覧】画面へ遷移する
	 */
	$scope.productReceiveList = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

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

		// 削除済が選択されている場合
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg == "1") {
//			alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
//			return;
//		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//商品別入荷予定一覧画面へ遷移
		//荷主センタ変更対応 201７.02.24 sja Start
//		$location.path("wms/receive/ProductReceiveList").search({}).search("mode", SCREEN_MODE.Read).search("clientCd", $scope.searchCondition.mclient.clientCd).search("centerCd", $scope.searchCondition.mcenter.centerCd).search("receiveSlipNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveSlipNo).search("receivePlanDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receivePlanDt);
		$location.path("wms/receive/ProductReceiveList").search({})
		.search("mode", SCREEN_MODE.Read)
		.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd)
		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd)
		.search("receiveSlipNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveSlipNo)
		.search("receivePlanDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receivePlanDt);
		//荷主センタ変更対応 201７.02.24 sja Start
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#receivePlanDelete
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 入荷予定削除ボタン押下処理<br>
	 *
	 * 入荷予定削除ボタンを押下された時に処理、伝票単位で削除処理を行う
	 */
	$scope.receivePlanDelete = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			// 削除済が選択されている場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg == "1") {
				alertMessage.setErrorMessageByCode("deletedCannotDeleteError");
				return;
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].centerTransitFlg == "1") {
				alertMessage.setErrorMessageByCode("receivePlanCannotDeleteCneterTransitError");
				return;
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// チェック処理（入荷予定削除）
		api.slipNoReceiveList.inputCheckDelete(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// 入荷予定削除
			api.slipNoReceiveList.delete(request).then(function(Response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(Response, 'searchform')) {
					return;
				}

				$scope.search();
			});

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#receivePlanInput
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 入荷予定修正ボタン押下処理<br>
	 *
	 * 入荷予定修正ボタンを押下された時に処理、【入荷予定入力】画面へ遷移する
	 */
	$scope.receivePlanInput = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

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

		// 削除済が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg == "1") {
			alertMessage.setErrorMessageByCode("deletedCannotChangeError");
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerTransitFlg == "1") {
			alertMessage.setErrorMessageByCode("receivePlanCannotChangeCneterTransitError");
			return;
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//入荷予定入力画面へ遷移
		$location.path("wms/receive/ReceivePlanInput").search({}).search("mode", SCREEN_MODE.Update).search("receivePlanHId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receivePlanHId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#errorCheck
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * エラーチェックボタン押下処理<br>
	 *
	 * エラーチェックボタンを押下された時に処理
	 */
	$scope.errorCheck = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			// 削除済が選択されている場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg == "1") {
				alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
				return;
			}
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// チェック処理（エラーチェック）
		api.slipNoReceiveList.inputCheckErrorCheck(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// エラーチェック
			api.slipNoReceiveList.errorCheck(request).then(function(Response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(Response, 'searchform')) {
					return;
				}

				$scope.search();
			});

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#receiveInput
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 入荷実績入力ボタン押下処理<br>
	 *
	 * 入荷実績入力ボタンを押下された時に処理、【入荷実績入力（予定あり）】画面へ遷移する
	 */
	$scope.receiveInput = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

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

		// 削除済が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg == "1") {
			alertMessage.setErrorMessageByCode("deletedCannotExecuteError");
			return;
		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//入荷実績入力（予定あり）画面へ遷移
		$location.path("wms/receive/ReceiveInput").search({}).search("mode", SCREEN_MODE.Read).search("receivePlanHId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].receivePlanHId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList#productLabel
	 * @methodOf oneslogiWms.SlipNoReceiveList.object:SlipNoReceiveList
	 *
	 * @description
	 * 商品ラベルボタン押下処理<br>
	 *
	 * 商品ラベルボタンを押下された時に処理、商品ラベルデータをチェックを行う
	 */
	$scope.productLabel = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}

		// 明細が表示されていない場合
		if ($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// 入力チェック(商品ラベル)
		api.slipNoReceiveList.inputCheckProductLabel(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// 商品ラベル発行
			api.slipNoReceiveList.productLabel(request).then(function(Response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(Response, 'searchform')) {
					return;
				}

				// プリンタ選択画面を表示
				var modalInstance = printFactory.modalPrint($scope.printParam2);

				// モーダル画面が閉じられたら呼ばれるファンクションの登録
				modalInstance.result.then(function(printParam2){
					var listBody = [];

					for(var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++)
					{
						var request = {};
						request = angular.copy($scope.receivePlanListPrintDto);
						request.data.search.treceivePlanH.mcenter.centerCd = $scope.searchCondition.mcenter.centerCd;
						request.data.search.treceivePlanH.mclient.clientCd = $scope.searchCondition.mclient.clientCd;
						request.data.search.treceivePlanH.receivePlanHId = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].receivePlanHId;
						request.printBasicData = printParam2.printBasicData;

						listBody[row] = request;
					}

					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
					var subWindow;
					if (printParam2.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfBlankWindow();
					}

					// 発行
					api.slipNoReceiveList.productLabelPrint(listBody).then(function(response){

						if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
							// 正常

							if (printParam2.printBasicData.outputType == printFactory.outputType.pdf) {
								// プレビュー表示
								subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							}
						} else {
							// 異常

							if (printParam2.printBasicData.outputType == printFactory.outputType.pdf) {
								// プレビュー閉じる
								subWindow = owsCommon.viewPdfCloseWindow(subWindow);
							}
						}
						//帳票発行後に再検索する
						$scope.search();
						//エラー時にプレビューを閉じる
					}).catch(function(response){
						if (printParam2.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					});
					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
				});
			});

		});
	};
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 End

	// 画面項目（表示用）の初期化処理
	var clearViewItem = function() {
// [ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
// $scope.nonReceiveParcent = "0%";
// $scope.receivingParcent = "0%";
// $scope.storeParcent = "0%";
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
