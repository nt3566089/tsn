/**
 * @ngdoc overview
 * @name oneslogiWms.ReferenceProductReceiveList
 *
 * @description
 * 商品別入荷一覧(参照)画面<br>
 *
 * ユーザの権限内で入荷予定データならびに実績データを商品別に集約して一覧表示する画面。
 */
angular.module('oneslogiWms.ReferenceProductReceiveList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReferenceProductReceiveList.service:ReferenceProductReceiveListApi
 *
 * @description
 * 商品別入荷一覧(参照)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 入荷ステータドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * referenceProductReceiveList 商品別入荷一覧データ操作用WebApi<br>
 * ・resources/receive/referenceProductReceiveList/initNew 初期データ取得(通常)WebAPI<br>
 * ・resources/receive/referenceProductReceiveList/search 検索WebAPI<br>
 * commonSearch ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 仕入先データ取得WebAPI<br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 * <br>
 */
.factory('ReferenceProductReceiveListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [#7026][OSS] 区分値グループを取得するAPI呼出し宣言を追加 2020.01.27 tsuboi Start
		centerClass: AngularAPIClient.make([
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList'],
			 	['getGrpList', 'GET', 'resources/common/centerClass/grpKeyValueList']
		]),
		// [#7026][OSS] 区分値グループを取得するAPI呼出し宣言を追加 2020.01.27 tsuboi End
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		referenceProductReceiveList: AngularAPIClient.make([
		                                           ['initNew', 'GET', 'resources/receive/ReferenceProductReceiveList/initNew'],
		                                           ['search',  'GET', 'resources/receive/ReferenceProductReceiveList/search'],
		                                           ['excel', 'GET', 'resources/receive/ReferenceProductReceiveList/search', 'excel']
		                                           ]
		),
		commonSearch: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record'],
				 ['query', 'GET', 'resources/common/product/record']
				 ]
		),
		depositCustomerCdList:AngularAPIClient.make(
				[
				 ['keyValueListLimitUser','GET','resources/common/depositCustomer/keyValueListLimitUser']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
 *
 * @description
 * 商品別入荷一覧(参照)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ReferenceProductReceiveList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'ReferenceProductReceiveListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {
	// グリッドの列情報
	$scope.ReferenceProductReceiveListCols = [
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
	                                 {field:"mproduct.janCd", displayName:"JANCD"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerByDepositId.customerCd", displayName:"預託"},
	                                 {field:"tstoreRecordBList[0].tstoreRecordH.mcustomerByDepositId.customerNm", displayName:"預託名称"},
	                                 {field:"tstoreRecordBList[0].stockTypeCd", displayName:"在庫区分"},
	                                 {field:"tstoreRecordBList[0].stockTypeNm", displayName:"在庫区分名称"},
	                                 {field:"treceivePlanH.mprocessType.processTypeCd", displayName:"処理区分"},
	                                 {field:"treceivePlanH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
	                                 {field:"planClientOrderNo", displayName:"予定顧客発注No."},
	                                 {field:"tstoreRecordBList[0].clientOrderNo", displayName:"顧客発注No."},
	                                 {field:"productUnit", displayName:"商品単位"},
	                                 {fied:"unitNumBreakdown", displayName:"入数内訳"},
	                                 {field:"planNum", displayName:"総予定数"},
	                                 {field:"planBreakdown", displayName:"予定内訳"},
	                                 {field:"tstoreRecordBList[0].storeNum", displayName:"総入庫数"},
	                                 {field:"storeBreakdown", displayName:"入庫内訳"},
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
	                     		 	 {field:"treceivePlanH.mclient.clientCd", displayName:"荷主CD"},
	                    		 	 {field:"treceivePlanH.mclient.clientNm", displayName:"荷主名称"},
	                    		 	 {field:"treceivePlanH.mcenter.centerCd", displayName:"センタCD"},
	                    		 	 {field:"treceivePlanH.mcenter.centerNm", displayName:"センタ名称"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#initScreen
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	$scope.initScreen = function() {

		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主を変更不可にする
		directiveControl.editable($scope,"clientCd",false);


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

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'ReferenceProductReceiveList',
			columnDefs: 'ReferenceProductReceiveListCols',
			pagingOptions : $scope.pagingOptions,
		});

		// [#6968][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.13 tsuboi Start
		$scope.ReferenceProductReceiveList = [];
		// [#6968][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.13 tsuboi End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#initScreenHttp
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
				// 削除データ表示有無の検索条件
				 $scope.deferredGetDeleteDisplayList(),
				// 荷主センタ変更対応
				 $scope.deferredGetWarehouseCdList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	}

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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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

		// 削除データ表示有無の検索条件
		// [#7026][OSS] 呼び出すAPIを区分値グループ取得APIに変更 2020.01.27 tsuboi Start
		owsCommon.getDataCacheable(api.centerClass, "getGrpList", request).then(function(response){
			// [#7026][OSS] 呼び出すAPIを区分値グループ取得APIに変更 2020.01.27 tsuboi End

			$scope.receiveStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#deferredGetDeleteDisplayList
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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


	/**
	 *@ngdoc method
	 *@name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#deferredGetDepositCustomerCdList
	 *@methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
	 *
	 *@description 検索条件の預託のプルダウンリストを取得<br>
	 *
	 *サーバとの通信を行い、預託情報を取得し結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositCustomerCdList = function () {
		var deferred = $q.defer();

		var result = {};

		var request = {};
		request.clientCd = $scope.searchCondition.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomerCdList,"keyValueListLimitUser",request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// 預託の初期値設定
	var setDepositCustomerCdList = function(depositCdList, clearSelected){
		$scope.depositCustomerCdList = depositCdList;

		// 預託が1件の場合、初期値に設定する
		if (clearSelected) {
			if($scope.depositCustomerCdList.length == 1){
				$scope.searchCondition.depositCustomerCd = $scope.depositCustomerCdList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.depositCustomerCd = null;
			}
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#deferredGetInitData
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
	 *
	 * @description
	 * 商品別入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.referenceProductReceiveList.initNew().then(function(response){

			$scope.receivePlanListPrintDto = response.data.test;
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;// 入荷予定日From
			$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;// 入荷予定日To

			$scope.deferredGetDepositCustomerCdList().then(function(response){
				setDepositCustomerCdList(response.data, true);
			});

			$scope.searchCondition.deleteDisplay = owsCommon.getDefaultValue($scope.deleteDisplayList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			}

			// 通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
		return deferred.promise;
	};

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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#search
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#getPagingData
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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

		// ユーザに付与された権限の範囲での預託リストを取得するためリクエストにユーザCDをセットする
		request.data.head.loginUserCd = userInfo.userCd;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.referenceProductReceiveList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#setPagingData
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.ReferenceProductReceiveList = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#getClassForRow
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		var color = "";

		if (row.entity.receiveStatus == "01") {
			color = "wmslegendwhite";
		} else if (row.entity.receiveStatus == "02") {
			color = "wmslegendlightyellow";
		} else if (row.entity.receiveStatus == "03") {
			color = "wmslegendcyan";
		} else if (row.entity.receiveStatus == "90") {
			color = "wmslegendred";
		} else if (row.entity.receiveStatus == "99") {
			color = "wmslegendpink";
		}

		// 文字色の設定

		// 限界期限日より前の期限日
		if (row.entity.tstoreRecordBList[0].limitDtNgFlg == "1") {
			color = color + " wmslegendblue";
		}

		return color;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#excelOutput
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
		request.data.head.loginUserCd = userInfo.userCd;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.referenceProductReceiveList.excel(request).then(function(response) {
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
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#showCustomer
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#customerCdBlur
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#showProduct
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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
	 * @name oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList#productCdBlur
	 * @methodOf oneslogiWms.ReferenceProductReceiveList.object:ReferenceProductReceiveList
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

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
