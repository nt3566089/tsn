/**
 * @ngdoc overview
 * @name oneslogiWms.ProductMasterSearch
 *
 * @description
 * 商品マスタ検索画面<br>
 */
angular.module('oneslogiWms.ProductMasterSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductMasterSearch.service:productMasterSearchApi
 *
 * @description
 * 商品マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * productMasterSearch 商品マスタデータ操作用WebApi<br>
 * ・resources/common/productMasterSearch/initNew 初期化用WebApi<br>
 * ・resources/common/productMasterSearch/search 検索用WebApi<br>
 *
 */
.factory('productMasterSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		productStatus: AngularAPIClient.make([
		                                      ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                      ]
		),
		productMasterSearch: AngularAPIClient.make(
				[
				 ['initNew', 'GET',  'resources/assist/productMasterSearch/initNew'],
				 ['search', 'GET',  'resources/assist/productMasterSearch/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
 *
 * @description
 * 商品マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ProductMasterSearch', ['$scope', '$modalInstance','$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterSearchApi',"items", function($scope,$modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api,items){

	//グリッドの列情報（デザイン用）
	$scope.productListCols =
		[
		 {field:"productCd", displayName:"商品CD"},
		 {field:"productNm", displayName:"商品名称"},
		 {field:"janCd", displayName:"JANCD"},
		 {field:"productAbbr", displayName:"商品略称"},
		 {field:"inventoryManagementUnitCd", displayName:"在庫管理単位CD"},
		 {field:"inventoryManagementUnitNm", displayName:"在庫管理単位名称"},
		 {field:"lotManagFlg", displayName:"ロット管理フラグ"},
		 {field:"bclassDtlByLotManagFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		 {field:"lotReverseFlg", displayName:"ロット逆転防止フラグ"},
		 {field:"bclassDtlByLotReverseFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		 {field:"limitDtManagFlg", displayName:"期限日管理フラグ"},
		 {field:"bclassDtlByLimitDtManagFlg.vdict.dictNm", displayName:"期限日管理フラグ名称"},
		 {field:"limitDtReverseFlg", displayName:"期限日逆転防止フラグ"},
		 {field:"bclassDtlByLimitDtReverseFlg.vdict.dictNm", displayName:"期限日逆転防止フラグ名称"},
		 {field:"receiveLimitNum", displayName:"入荷期限日数"},
		 {field:"shippingLimitNum", displayName:"出荷期限日数"},
		 {field:"mergeCls", displayName:"入庫No.マージ区分"},
		 {field:"bclassDtlByMergeCls.vdict.dictNm", displayName:"入庫No.マージ区分名称"},
		 {field:"shippingStopFlg", displayName:"出荷停止フラグ"},
		 {field:"bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"出荷停止フラグ名称"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#initScreen
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッドをページングするように設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		//グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'productList',
			columnDefs: 'productListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#initScreenHttp
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 * ・受信後、ページングオプション変更時ファンクションを設定
	 */
	$scope.initScreenHttp = function() {

		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetInitData()
				 ])

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetInitData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 商品マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.productMasterSearch.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'productMasterSearchform')) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
				deferred.reject();
				return;
			}

			$scope.productSearch = response.data.head;
			$scope.productList = response.data.list;
			$scope.paging = response.paging;

			// 参照元画面の情報を設定
			//[Ver3.0][#3998] アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd Start
			var editableFlg = false;
			//[Ver3.0][#3998] アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd End

			if (items) {
				$scope.productSearch.mclient.clientCd = items.clientCd;
				$scope.productSearch.productCd = items.productCd;
				//[Ver3.0][#3998] アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd Start
				editableFlg = items.editableFlg;
			}
			// [#6787][OSS] 非表示処理を修正 2019.11.14 tsuboi Start
			$scope.editableFlg = editableFlg;
//			if(editableFlg){
//				$scope.editableFlg = true;
//			}
//			if(editableFlg){
//				directiveControl.show($scope, 'clientCd', false);
//			}else{
//				directiveControl.show($scope, 'editableClientCd', false);
//			}
			//[Ver3.0][#3998] アシスト画面呼び出し時のフラグ処理追記 2018.04.11 miyabe upd End
			// [#6787][OSS] 非表示処理を修正 2019.11.14 tsuboi End

			// [#1841][Ver2.2.0] 荷主の編集可否制御の削除 2017.05.30 honma Delete

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 tsuboi Delete

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("productMasterSearchform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#gridDblClick
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("selection", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#search
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 検索処理<br>
	 * ・商品マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.productSearch;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.productMasterSearch.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'productMasterSearchform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#setPagingData
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
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

		// [ON推-品向-377] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-377] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.productList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// [EC-CT1-110] 検索条件を履歴に保存する処理を削除(呼出元画面の履歴に保存されてしまい誤動作発生) 2015.03.13 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#selectClose
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.selectClose = function(){

		// 明細が表示されていない
		if($scope.productList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
		}
		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}
		$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#modalClose
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */
	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

