/**
 * @ngdoc overview
 * @name oneslogiWms.ReceivePartList
 *
 * @description 入荷未完了一覧画面
 */
angular.module('oneslogiWms.ReceivePartList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceivePartList.service:ReceivePartListApi
 *
 * @description 入荷未完了一覧WebApi定義<br>
 *              ・resources/common/class/keyValueList ドロップダウンリスト用データ取得 <br>
 *              ・resources/receive/ReceivePartList/initNew 初期データ取得 <br>
 *              ・resources/receive/ReceivePartList/search 入荷未完了一覧データ取得<br>
 *              ・resources/receive/ReceivePartList/inputCheckRegister 入力チェック（入荷予定削除）<br>
 *              ・resources/receive/ReceivePartList/insert 登録 <br>
 *              ・resources/common/supplierCustomer/record 仕入先データ取得<br>
 *              ・resources/common/product/record 商品データ取得 <br>
 *
 */
.factory('receivePartListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['receiveDeliveryStatus','GET', 'resources/receive/receivePartList/receiveDeliveryStatus'],
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		receivePartList: AngularAPIClient.make(
				[
				 ['initNew',             'GET', 'resources/receive/receivePartList/initNew'],
				 ['search',              'GET', 'resources/receive/receivePartList/search'],
				 ['excel',               'GET', 'resources/receive/receivePartList/search', 'excel'],
				 ['inputCheckRegister',  'POST', 'resources/receive/receivePartList/inputCheckRegister'],
				 ['insert',              'POST', 'resources/receive/receivePartList/insert']
				 ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
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
 * @name oneslogiWms.ReceivePartList.object:ReceivePartList
 *
 * @description 入荷未完了一覧画面コントローラ
 */
.controller('ReceivePartList', ['$scope', '$route', '$filter', '$location', '$q',
                                'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl',
                                'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receivePartListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）

	$scope.receivePartListCols = [
	                              {field:"treceivePlanH.bclassDtlByReceiveDeliveryStatus.vdict.dictNm", displayName:"入荷納品ステータス名称"},
	                              {field:"treceivePlanH.receivePlanDt", displayName:"入荷予定日"},
	                              {field:"lastStoreDt", displayName:"入庫日"},
	                              {field:"treceivePlanH.planSupplierCd", displayName:"仕入先CD"},
	                              {field:"treceivePlanH.mcustomerByPlanSupplierId.customerNm", displayName:"仕入先名称"},
	                              {field:"treceivePlanH.mcustomerByPlanSupplierId.customerAbbr", displayName:"仕入先略称"},
	                              {field:"treceivePlanH.planClientReceiveNo", displayName:"予定顧客入荷指示No."},
	                              {field:"treceivePlanH.receiveSlipNo", displayName:"WMS入荷伝票No."},
	                              {field:"treceivePlanH.treceivePlanHSelf.receiveSlipNo", displayName:"元WMS入荷伝票No."},
	                              {field:"lineNo",displayName:"行No."},
	                              {field:"productCd", displayName:"商品CD"},
	                              {field:"mproduct.productNm", displayName:"商品名称"},
	                              {field:"mproduct.productAbbr", displayName:"商品略称"},
	                           // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
	                              {field:"mproduct.janCd", displayName:"JANCD"},
	                           // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
	                              {field:"treceivePlanH.planDepositCd", displayName:"預託"},
	                              {field:"treceivePlanH.mcustomerByPlanDepositId.customerNm", displayName:"預託名称"},
	                              {field:"treceivePlanH.mprocessType", displayName:"処理区分"},
	                              {field:"treceivePlanH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
	                              {field:"planClientOrderNo", displayName:"予定顧客発注No."},
	                              {field:"tstoreRecordBList[0].clientOrderNo", displayName:"顧客発注No."},
	                              {field:"mproduct.mproductShapeList[0].unitNum", displayName:"ケース入数"},
	                              {field:"planNum", displayName:"総予定数"},
//	                              {field:"planCaseNum", displayName:"予定ケース数"},
//	                              {field:"planPreceNum", displayName:"予定バラ数"},
	                              {field:"sumStoreNum", displayName:"総入庫数"},
	                           // [ON推-1.1.4-CT-014]シナリオテストCT指摘問題の対応 一覧表示項目を追加 2016.05.17 chou Start
//	                              {field:"storeCaseNum", displayName:"入庫ケース数"},
//	                              {field:"storePieceNum", displayName:"入庫バラ数"},
	                           // [ON推-1.1.4-CT-014]シナリオテストCT指摘問題の対応 一覧表示項目を追加 2016.05.17 chou End
	                              {field:"mlocation.locationNm", displayName:"予定ロケーション名称"},
	                              {field:"planLot",displayName:"予定ロット"},
	                              {field:"planLimitDt", displayName:"予定期限日"},
	                              {field:"treceivePlanH.receiveDeliveryStatus", displayName:"入荷納品ステータス"},
	                              {field:"strReceiveDeliveryStatus", displayName:"入荷納品ステータス"},
	                          	//荷主センタ変更対応 201７.02.08 sja Start
                     		 	  {field:"treceivePlanH.mclient.clientCd", displayName:"荷主CD"},
                    		 	  {field:"treceivePlanH.mclient.clientNm", displayName:"荷主名称"},
                    		 	  {field:"treceivePlanH.mcenter.centerCd", displayName:"センタCD"},
                    		 	  {field:"treceivePlanH.mcenter.centerNm", displayName:"センタ名称"}
                    		 	//荷主センタ変更対応 201７.02.08 sja End
	                              ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#initScreen
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 画面初期化処理<br>
	 *              ・検索条件枠を開いた状態に設定<br>
	 *              ・グリッド設定<br>
	 *              ・画面初期化用通信制御処理を呼び出し
	 */
	var running = false;
	$scope.initScreen = function() {

		//検索条件を表示状態に変更
		$scope.isopen = true;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'ReceivePartList',
			columnDefs: 'receivePartListCols',
			pagingOptions : $scope.pagingOptions,
			afterSelectionChange: function(row, event) {
				if (!running) {
					running = true;
					try {
						var rowIndex = $scope.convertRowToRowIndex(row);
						if (rowIndex != undefined) {
							for (var i = 0; i < $scope.ReceivePartList.length; i++) {
								//自分の行と違う場合のみ
								if (rowIndex != i) {
									//伝票№が同じ行のチェックボックスを同じにする
									if ($scope.ReceivePartList[i].treceivePlanH.receiveSlipNo == row.entity.treceivePlanH.receiveSlipNo) {
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

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

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
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#customerCdBlur
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		var isError = $scope.inputHeaderform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputHeaderform');
			return;
		}
		// 入力された仕入先コードを取得
		var customerCd = $scope.searchCondition.planSupplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#initScreenHttp
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *              ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		// 各種通信用関数を配列で指定
		$q.all(
				[$scope.deferredGetReceiveStatus(),
				 $scope.deferredGetReceiveStatusUnder()
				 ]
		)
		// 全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#deferredGetInitData
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 入荷未完了一覧・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.receivePartList.initNew().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.receivePartListSearch;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;// 入荷予定日From
			$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;// 入荷予定日To
			$scope.searchCondition.receivePlanDt = $scope.getAddDate(userInfo.systemDt);// 入荷予定日To

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


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
		request.data.receivePartListSearch = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.receivePartList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputHeaderform');
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

		// [ON推-品向-325] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-325] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.ReceivePartList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#getAddDate
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 時間処理<br>
	 *
	 * 。
	 */

	$scope.getAddDate = function(date) {

		if(!date)return '';
		var sysYear = date.substring(0,4);
		var systMonth = date.substring(4,6);
		var sysDate = date.substring(6,8);
		var dDate = new Date(sysYear + '-' + systMonth + '-' + sysDate);
		dDate.setDate(dDate.getDate() + 1);

		var now = new Date();
        var year = dDate.getFullYear();
        var month =(dDate.getMonth() + 1).toString();
        var day = (dDate.getDate()).toString();

        if (month.length == 1) {
            month = "0" + month;
        }

        if (day.length == 1) {
            day = "0" + day;
        }

		return year + month +  day;

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#showCustomer
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var isError = $scope.inputHeaderform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputHeaderform');
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
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#showProduct
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var isError = $scope.inputHeaderform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputHeaderform');
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
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#productBlur
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		var isError = $scope.inputHeaderform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputHeaderform');
			return;
		}
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 */
	$scope.deferredGetReceiveStatus = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "RECEIVE_DELIVERY_STATUS";
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.receiveDeliveryStatusList= response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 */
	$scope.deferredGetReceiveStatusUnder = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "RECEIVE_DELIVERY_STATUS";
		// [ON推-品向-312] センタID追加 2014.12.2 yangc Start
		request.centerCd = userInfo.centerCd;
		// [ON推-品向-312] センタID追加 2014.12.2 yangc End
		api.dropdownList.receiveDeliveryStatus(request).then(function(response){
			$scope.receiveDeliveryStatusUnderList= response.dataList;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceiveList#search
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#getPagedDataAsync
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
     *
     * @description
     * 検索処理<br>
     * ・センタマスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.receivePartListSearch = $scope.searchCondition;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.receivePartList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputHeaderform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.StockInOutList.object:StockInOutList#setSearchData
//	 * @methodOf oneslogiWms.StockInOutList.object:StockInOutList
//	 *
//	 * @description
//	 * データ設定処理<br>
//	 *
//	 * 取得結果を画面項目に反映する。
//	 */
//	$scope.setSearchData = function(response) {
//		//選択状態をクリアする
//		owsCommon.toggleSelectAll($scope.gridOptions, false);
//		//取得したデータをグリッドに表示
//		$scope.ReceivePartList = response.data.list;
//		//検索条件を履歴に保存
//		owsHistory.replaceState($scope.searchCondition);
//	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#instruction
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description 指示ボタン押下処理<br>
	 *
	 * 選択行をグリッドから指示する。
	 */
	$scope.instruction = function(){

		// 明細が表示されていない
		if($scope.ReceivePartList == null){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}else if($scope.ReceivePartList.length  == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		//フッター部入荷納品ステータスが空の場合
		if($scope.searchCondition.receiveDeliveryStatusFooter == null || $scope.searchCondition.receiveDeliveryStatusFooter == ""){
			alertMessage.setErrorMessageByCode("receiveDeliveryStatusNotSelectError");
			return;
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {

			// センタ間移動のチェック
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.centerTransitFlg == "1") {

				// センタ間移動データは変更不可エラー
				alertMessage.setErrorMessageByCode("receivePlanCannotChangeCneterTransitError");
				return;
			}

			// [新ｿﾘV2-005] 指示ボタン押下時、未完了以外のデータが選択された場合はエラーを表示 2016.07.14 kawana Start

			// 未完了データ選択チェック
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receiveDeliveryStatus != "00") {
				alertMessage.setErrorMessageByCode("receivePartInsertStartError");
				return;
			}

			// [新ｿﾘV2-005] 指示ボタン押下時、未完了以外のデータが選択された場合はエラーを表示 2016.07.14 kawana End
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

		//フッター部入荷納品ステータスが"分納"の場合
		if($scope.searchCondition.receiveDeliveryStatusFooter == "02"){
			//フッター部の入荷予定日が空の場合
			if(isNaN($scope.searchCondition.receivePlanDt) || $scope.searchCondition.receivePlanDt ==""){
				// [Ver3.0][#4136] メッセージCDのスペル修正 2018.03.22 matsumoto Start
				alertMessage.setErrorMessageByCode("receivePlanDtNotInoutError");
				// [Ver3.0][#4136] メッセージCDのスペル修正 2018.03.22 matsumoto End
				return;
			}
		}

		//グリッドの明細行数分繰返
		if($scope.searchCondition.receiveDeliveryStatusFooter == "02"){
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana Start
				//選択されて明細行の入荷予定日 >= フッター部の入荷予定日の場合
				if($scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.preReceivePlanDt >= $scope.searchCondition.receivePlanDt){
					// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana End
					alertMessage.setErrorMessageByCode("cannotChangeBeforeReceivePlanDateError");
					return;
				}
			}
		}

		//フッター部の入荷納品ステータスNm
		var statusListClassNm = "";
		var statusListClassCd = "";

		for (var row = 0; row <  $scope.receiveDeliveryStatusList.length; row++) {
			if($scope.receiveDeliveryStatusList[row].classCd == $scope.searchCondition.receiveDeliveryStatusFooter ){
				statusListClassNm =$scope.receiveDeliveryStatusList[row].classNm;
				statusListClassCd =$scope.receiveDeliveryStatusList[row].classCd;
			}
		}

		//選択された明細行の入荷納品ステータス設定
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			if($scope.searchCondition.receiveDeliveryStatusFooter =="02"){//フッター部の入荷納品ステータスが"分納"の場合
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus = statusListClassCd;
    			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe Start
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.bclassDtlByReceiveDeliveryStatus.vdict.dictNm=statusListClassNm;
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receivePlanDt=$scope.searchCondition.receivePlanDt;

			}else if($scope.searchCondition.receiveDeliveryStatusFooter =="01"){//フッター部の入荷納品ステータスが"完納"の場合
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.bclassDtlByReceiveDeliveryStatus.vdict.dictNm=statusListClassNm;
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus = statusListClassCd;
				//del by  qiuy 2014/08/26 start
				//$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receivePlanDt=$scope.searchCondition.receivePlanDt;
				//del by  qiuy 2014/08/26 end

			}else if($scope.searchCondition.receiveDeliveryStatusFooter == "09"){//フッター部の入荷納品ステータスが"打切り"の場合
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.bclassDtlByReceiveDeliveryStatus.vdict.dictNm=statusListClassNm;
    			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe End
				$scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus=statusListClassCd;
				//del by  qiuy 2014/08/26 start
				//$scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanH.receivePlanDt=$scope.searchCondition.receivePlanDt;
				//del by  qiuy 2014/08/26 end
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#register
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		var isError = $scope.inputHeaderform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputHeaderform');
			return;
		}
		// 明細が表示されていない
		if($scope.ReceivePartList == null){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}else if($scope.ReceivePartList.length  == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}
		// 選択された明細行が指示されていないの場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus == null) {
				alertMessage.setErrorMessageByCode("notSelectInstallmentOrClosedReceiveError");
				return;
			}
		}

		//未完の場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			if($scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus == "00" ||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].strReceiveDeliveryStatus == null ){
				alertMessage.setErrorMessageByCode("dataCannotRegisterUnfinishedError");
				return;
			}
		}

		var listBody = [];

		//グリッドの明細行数分繰返
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			listBody.push($scope.gridOptions.gridApi.selection.getSelectedRows()[row]);
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.receivePartListSearch = $scope.searchCondition;
		request.data.list = listBody;

		//データチェックを行う。
		api.receivePartList.inputCheckRegister(request).then(function(checkResponse){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
				return;
			}

			// 入荷予定データ登録または更新
			api.receivePartList.insert(request).then(function(execResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
					return;
				}else{

					$scope.search();
				}
			});

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#excelOutput
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.receivePartListSearch = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.receivePartList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
			else
			{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	// [ON推-1.1.4-CT-014]シナリオテストCT指摘問題の対応 一覧表示項目を追加 2016.05.17 chou Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePartList.object:ReceivePartList#processForRow
	 * @methodOf oneslogiWms.ReceivePartList.object:ReceivePartList
	 *
	 * @description
	 * 入庫ケース数と入庫バラ数の計算処理<br>
	 */
	$scope.processForRow = function(row) {
		var sumStoreNum = row.entity.sumStoreNum;//総入庫数

		// [Ver3.0] unit of measure対応 2017.11.20 駱 Del

	};
	// [ON推-1.1.4-CT-014]シナリオテストCT指摘問題の対応 一覧表示項目を追加 2016.05.17 chou Add End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
