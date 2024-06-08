/**
 * @ngdoc overview
 * @name oneslogiWms.ProductReceiveList
 *
 * @description
 * 商品別入荷一覧画面<br>
 *
 * 入荷予定データならびに実績データを商品別に集約して一覧表示する画面。
 */
angular.module('oneslogiWms.ProductReceiveList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductReceiveList.service:ProductReceiveListApi
 *
 * @description
 * 商品別入荷一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 入荷ステータドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * productReceiveList 商品別入荷一覧データ操作用WebApi<br>
 * ・resources/receive/productReceiveList/initNew 初期データ取得(通常)WebAPI<br>
 * ・resources/receive/productReceiveList/search 検索WebAPI<br>
 * commonSearch ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 仕入先データ取得WebAPI<br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 * <br>
 */
.factory('ProductReceiveListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
		// [#7026][OSS] 区分値グループを取得するAPI呼出し宣言を追加 2020.01.27 tsuboi Start
		centerClass: AngularAPIClient.make([
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList'],
			 	['getGrpList', 'GET', 'resources/common/centerClass/grpKeyValueList']
		]),
		// [#7026][OSS] 区分値グループを取得するAPI呼出し宣言を追加 2020.01.27 tsuboi End
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End
		//荷主センタ変更対応 201７.02.24 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.24 sja End
		productReceiveList: AngularAPIClient.make([
		                                           ['initNew', 'GET', 'resources/receive/ProductReceiveList/initNew'],
		                                           ['search',  'GET', 'resources/receive/ProductReceiveList/search'],
		                                           // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
			                                       ['productLabel',  'GET', 'resources/receive/ProductReceiveList/productLabel'],
			                                       ['inputCheckProductLabel',  'POST', 'resources/receive/ProductReceiveList/inputCheckProductLabel'],
			                                       ['productLabelPrint', 'GET', 'resources/receive/ProductReceiveList/productLabelPrint'],
			                                       // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
		                                           ['excel', 'GET', 'resources/receive/ProductReceiveList/search', 'excel']
		                                           ]
		),
		commonSearch: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record'],
				 ['query', 'GET', 'resources/common/product/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList
 *
 * @description
 * 商品別入荷一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
//.controller('ProductReceiveList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ProductReceiveListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
.controller('ProductReceiveList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'ProductReceiveListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
	//グリッドの列情報
	$scope.ProductReceiveListCols = [
	                                 {field:"treceivePlanH.receivePlanDt", displayName:"入荷予定日"},
	                                 {field:"tstoreRecordBList[0].storeDt", displayName:"入庫日"},
	                                 {field:"treceivePlanH.mcustomerByPlanSupplierId.customerCd", displayName:"予定仕入先CD"},
	                                 {field:"treceivePlanH.mcustomerByPlanSupplierId.customerNm", displayName:"予定仕入先名称"},
	                                 {field:"treceivePlanH.mcustomerByPlanSupplierId.customerAbbr", displayName:"予定仕入先略称"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerBySupplierId.customerCd", displayName:"仕入先CD"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerBySupplierId.customerNm", displayName:"仕入先名称"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerBySupplierId.customerAbbr", displayName:"仕入先略称"},
	                                 {field:"treceivePlanH.planClientReceiveNo", displayName:"予定顧客入荷指示No."},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.clientReceiveNo", displayName:"顧客入荷指示No."},
	                                 {field:"treceivePlanH.receiveSlipNo", displayName:"WMS入荷伝票No."},
	                                 {field:"treceivePlanH.oldReceiveSlipNo", displayName:"元WMS入荷伝票No."},
	                                 {field:"treceivePlanH.receiveDeliveryStatus", displayName:"入荷納品ステータス"},
	                                 {field:"treceivePlanH.mcenterClassDtlByReceiveDeliveryStatus.vdict.dictNm", displayName:"入荷納品ステータス名称"},
	                                 {field:"lineNo", displayName:"行No."},
	                                 {field:"receiveStatusTemp", displayName:"入荷ステータス"},
	                                 {field:"mcenterClassDtlByReceiveStatus.vdict.dictNm", displayName:"入荷ステータス名称"},
	                                 {field:"productCd", displayName:"商品CD"},
	                                 {field:"mproduct.productNm", displayName:"商品名称"},
	                                 {field:"mproduct.productAbbr", displayName:"商品略称"},
	                              // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
	                                 {field:"mproduct.janCd", displayName:"JANCD"},
	                              // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
	                                 {field:"treceivePlanH.planDepositCd", displayName:"予定預託"},
	                                 {field:"treceivePlanH.mcustomerByPlanDepositId.customerNm", displayName:"予定預託名称"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerByDepositId.customerCd", displayName:"預託"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerByDepositId.customerNm", displayName:"預託名称"},
	                                 {field:"tstoreRecordBList[0].stockTypeCd", displayName:"在庫区分"},
	                                 {field:"tstoreRecordBList[0].stockTypeNm", displayName:"在庫区分名称"},
	                                 {field:"treceivePlanH.mprocessType.processTypeCd", displayName:"処理区分"},
	                                 {field:"treceivePlanH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
	                                 {field:"planClientOrderNo", displayName:"予定顧客発注No."},
	                                 {field:"tstoreRecordBList[0].clientOrderNo", displayName:"顧客発注No."},
	                                 {field:"maxUnitNum", displayName:"ケース入数"},
	                                 {field:"planNum", displayName:"総予定数"},
	                                 {field:"planCaseNum", displayName:"予定ケース数"},
	                                 {field:"planPreceNum", displayName:"予定バラ数"},
	                                 {field:"tstoreRecordBList[0].storeNum", displayName:"総入庫数"},
	                                 {field:"caseNum", displayName:"入庫ケース数"},
	                                 {field:"preceNum", displayName:"入庫バラ数"},
	                                 {field:"mlocation.locationNm", displayName:"入荷ロケーション"},
	                                 {field:"tstoreRecordBList[0].locationNm", displayName:"入庫格納ロケーション"},
	                                 {field:"lastStoreFlgNm", displayName:"入庫格納フラグ"},
	                                 {field:"tstoreRecordBList[0].htStoreInspectionDt", displayName:"ＨＴ検品完了日時"},
	                                 {field:"userNm", displayName:"ＨＴ検品担当者"},
	                                 {field:"tstoreRecordBList[0].addDt", displayName:"入荷計上日時"},
	                                 {field:"messageNm", displayName:"エラー内容"},
	                                 {field:"planLot", displayName:"予定ロット"},
	                                 {field:"tstoreRecordBList[0].lot", displayName:"ロット"},
	                                 {field:"planLimitDt", displayName:"予定期限日"},
	                                 {field:"tstoreRecordBList[0].limitDt", displayName:"期限日"},
	                                 {field:"planStoreLabelNo", displayName:"予定入庫ラベルNo."},
	                                 {field:"tstoreRecordBList[0].storeLabelNo", displayName:"入庫ラベルNo."},
	                              //荷主センタ変更対応 201７.01.23 sja Start
	                     		 	 {field:"treceivePlanH.mclient.clientCd", displayName:"荷主CD"},
	                    		 	 {field:"treceivePlanH.mclient.clientNm", displayName:"荷主名称"},
	                    		 	 {field:"treceivePlanH.mcenter.centerCd", displayName:"センタCD"},
	                    		 	 {field:"treceivePlanH.mcenter.centerNm", displayName:"センタ名称"}
	                              //荷主センタ変更対応 201７.01.23 sja End
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#initScreen
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		//検索条件を表示状態に変更
		$scope.isopen = true;

		// 画面項目（表示用）の初期化処理
		clearViewItem();

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

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

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'ProductReceiveList',
			columnDefs: 'ProductReceiveListCols',
			pagingOptions : $scope.pagingOptions,
			afterSelectionChange: function(row, event) {
				if (!running) {
					running = true;
					try {
						var rowIndex = $scope.convertRowToRowIndex(row);
						if (rowIndex != undefined) {
							for (var i = 0; i < $scope.ProductReceiveList.length; i++) {
								//自分の行と違う場合のみ
								if (rowIndex != i) {
									//伝票№が同じ行のチェックボックスを同じにする
									if ($scope.ProductReceiveList[i].treceivePlanH.receiveSlipNoTemp == row.entity.treceivePlanH.receiveSlipNoTemp) {
										//チェックボックス状態が違う場合のみ
										if ($scope.gridOptions.gridApi.grid.rows[i].isSelected != row.isSelected) {
											//チェックボックスの状態を同じにする。
											$scope.gridOptions.selectRow(i, row.isSelected);
										}
									}
								}
							}
						}
					}finally{
						running = false;
					}
				}
			}
		});
		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#initScreenHttp
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
				// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
				 $scope.deferredGetDeleteDisplayList(),
				// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End
				//荷主センタ変更対応 201７.02.24 sja Start
				 $scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.24 sja End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	}

	//荷主センタ変更対応 201７.02.24 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.24 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReceiveStatus = function () {
		var deferred = $q.defer();

		var request = {};
		// [#7026][OSS] 引数を区分値グループCDに変更 2020.01.27 tsuboi Start
		request.classGrpCd = "RECEIVE_STATUS_PRL";
		// [#7026][OSS] 引数を区分値グループCDに変更 2020.01.27 tsuboi End

		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
		// [#7026][OSS] 呼び出すAPIを区分値グループ取得APIに変更 2020.01.27 tsuboi Start
		owsCommon.getDataCacheable(api.centerClass, "getGrpList", request).then(function(response){
			// [#7026][OSS] 呼び出すAPIを区分値グループ取得APIに変更 2020.01.27 tsuboi End
			// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End

			$scope.receiveStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#deferredGetDeleteDisplayList
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description 削除データ表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDeleteDisplayList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELETE_DATA_DISPLAY";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.deleteDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#deferredGetInitData
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 商品別入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.productReceiveList.initNew().then(function(response){

			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
			$scope.printParam = response.data.test.printBasicData;
			$scope.receivePlanListPrintDto = response.data.test;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;// 入荷予定日From
			$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;// 入荷予定日To

			// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
			$scope.searchCondition.deleteDisplay = owsCommon.getDefaultValue($scope.deleteDisplayList);
			// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			}else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;

				$scope.deferredGetWarehouseCdList();

				$scope.searchCondition.receiveSlipNo = $route.current.params.receiveSlipNo;
				$scope.searchCondition.receivePlanDt = $route.current.params.receivePlanDt;
				// [2.1.0-CT-016] 伝票別入荷一覧からデータ選択をして遷移した場合、選択されているデータの入荷予定日を検索条件のFrom-Toに設定するように修正 2016.11.07 honma Add Start
				$scope.searchCondition.receivePlanDtFrom = $route.current.params.receivePlanDt;
				$scope.searchCondition.receivePlanDtTo = $route.current.params.receivePlanDt;
				// [2.1.0-CT-016] 伝票別入荷一覧からデータ選択をして遷移した場合、選択されているデータの入荷予定日を検索条件のFrom-Toに設定するように修正 2016.11.07 honma Add End

				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.24 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCdList();
	};
	//荷主センタ変更対応 201７.02.24 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#search
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#getPagingData
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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

		api.productReceiveList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#setPagingData
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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

		// [ON推-品向-326] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-326] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.ProductReceiveList = response.data.list;
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#getClassForRow
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、削除フラグで判断処理を削除  2014.11.28 許

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start

		var color = "";

		if (row.entity.receiveStatus == "01") {
			color = "wmslegendwhite";
		} else if (row.entity.receiveStatus == "02") {
			color = "wmslegendlightyellow";
		} else if (row.entity.receiveStatus == "03") {
			color = "wmslegendcyan";
			// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷削除の入荷ステータス判断処理を追加 許 2014.11.28 Start
		} else if (row.entity.receiveStatus == "90") {
			color = "wmslegendred";
			// [ON推-品向-175 ON推-品向-176] 入荷ステータスに「90:入荷削除」を追加したため、入荷削除の入荷ステータス判断処理を追加 許 2014.11.28 End
		} else if (row.entity.receiveStatus == "99") {
			color = "wmslegendpink";
		}

		// 文字色の設定

		// 限界期限日より前の期限日
		if (row.entity.tstoreRecordBList[0].limitDtNgFlg == "1") {
			color = color + " wmslegendblue";
		}

		return color;
		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#excelOutput
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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

		api.productReceiveList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#gridDblClick
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#showCustomer
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#customerCdBlur
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
			api.commonSearch.record(request).then(function(response){
				$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#showProduct
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 商品CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				productCd: $scope.searchCondition.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.productCd =  selectedItem.productCd;
			$scope.searchCondition.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#productCdBlur
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		// [Ver3.0][#4328] 不要なエラーチェックを削除 2018.04.13 shimizu

		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			api.commonSearch.query(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#receivePlanInput
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
			// 明細行にWMS入荷伝票No.が重複チェック
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				// WMS入荷伝票No.
				var receiveSlipNoTemp = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receiveSlipNoTemp;

				for (var i = row+1; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
					if ($scope.gridOptions.gridApi.selection.getSelectedRows()[i].treceivePlanH.receiveSlipNoTemp == receiveSlipNoTemp){
						continue;
					}
					else
					{
						alertMessage.setErrorMessageByCode("onlyOneSelect");
						return;
					}
				}
			}
		}

		// 削除済が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg == "1") {
			alertMessage.setErrorMessageByCode("deletedCannotChangeError");
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].treceivePlanH.centerTransitFlg == "1") {
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
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#receiveInput
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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
			// 明細行にWMS入荷伝票No.が重複チェック
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				// WMS入荷伝票No.
				var receiveSlipNoTemp = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receiveSlipNoTemp;

				for (var i = row+1; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
					if ($scope.gridOptions.gridApi.selection.getSelectedRows()[i].treceivePlanH.receiveSlipNoTemp == receiveSlipNoTemp){
						continue;
					}
					else
					{
						alertMessage.setErrorMessageByCode("onlyOneSelect");
						return;
					}
				}
			}
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

	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#productLabel
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
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

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			// 明細行にWMS入荷伝票No.が重複チェック
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				// WMS入荷伝票No.
				var receiveSlipNoTemp = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receiveSlipNoTemp;

				for (var i = row+1; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
					if ($scope.gridOptions.gridApi.selection.getSelectedRows()[i].treceivePlanH.receiveSlipNoTemp == receiveSlipNoTemp){
						continue;
					}
					else
					{
						alertMessage.setErrorMessageByCode("onlyOneSelect");
						return;
					}
				}
			}
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// 入力チェック(商品ラベル)
		api.productReceiveList.inputCheckProductLabel(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// 商品ラベル発行
			api.productReceiveList.productLabel(request).then(function(Response){

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
						request.data.search.treceivePlanH.receivePlanHId = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].receivePlanHId;
						request.printBasicData = printParam.printBasicData;

						listBody[row] = request;
					}

					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
					var subWindow;
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfBlankWindow();
					}

					// 発行
					api.productReceiveList.productLabelPrint(listBody).then(function(response){
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
						//エラー時にプレビューを閉じる
					}).catch(function(response){
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					});
					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
				});
			});

		});
	};
	// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End

	// 画面項目（表示用）の初期化処理
	var clearViewItem = function() {
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		$scope.nonReceiveParcent = "0%";
//		$scope.receivingParcent = "0%";
//		$scope.storeParcent = "0%";
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
