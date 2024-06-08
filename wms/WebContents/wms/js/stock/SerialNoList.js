/**
 * @ngdoc overview
 * @name oneslogiWms.SerialNoList
 *
 * @description シリアルNo.一覧<br>
 *
 * シリアルNo.一覧表示する画面。
 *
 */
angular.module('oneslogiWms.SerialNoList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SerialNoList.service:SerialNoListApi
 *
 * @description シリアルNo.一覧用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * supplierCustomer 納品先データ操作用WebAPI<br>
 * ・resources/common/deliveryCustomer/record  納品先データ取得WebAPI<br>
 * SerialNoList シリアルNo.一覧データ操作用WebAPI<br>
 * ・resources/stock/serialNoList/search 検索結果取得WebAPI<br>
 */
.factory('SerialNoListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		supplierCustomer: AngularAPIClient.make([
		                                         ['record', 'GET', 'resources/common/supplierCustomer/record']
		                                         ]
		),
		deliveryCustomer: AngularAPIClient.make([
		                                         ['record', 'GET', 'resources/common/deliveryCustomer/record']
		                                         ]
		),
		product: AngularAPIClient.make([
		                        				 ['query', 'GET', 'resources/common/product/record']
		                                         ]
		),
		SerialNoList: AngularAPIClient.make([
		                                         ['init',                'GET',  'resources/stock/serialNoList/init'],
		                                         ['search',              'GET',  'resources/stock/serialNoList/search'],
		                                         ['excel',               'GET',  'resources/stock/serialNoList/search', 'excel'],
		                                         ['checkDelete',         'POST', 'resources/stock/serialNoList/checkDelete'],
		                                         ['dataDelete',          'POST', 'resources/stock/serialNoList/dataDelete'],
		                                         ['shippingInfoClear',   'POST', 'resources/stock/serialNoList/shippingInfoClear'],
		                                         ['checkShippingUpdate', 'POST', 'resources/stock/serialNoList/checkShippingUpdate'],
		                                         ['shippingUpdate',      'POST', 'resources/stock/serialNoList/shippingUpdate'],
		                                         // [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana Start
		                                         ['getPickingWorkNo',    'GET',  'resources/stock/serialNoList/getPickingWorkNo']
		                                         // [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana End
		                                         ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.SerialNoList.object:SerialNoList
 *
 * @description シリアルNo.一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('SerialNoList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'SerialNoListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.SerialNoListCols = [    {field:"productCd", displayName:"商品CD"},
	                               {field:"productNm", displayName:"商品名称"},
	                               {field:"serialNo", displayName:"シリアルNo."},
	                               {field:"supplierCd", displayName:"仕入先CD"},
	                               {field:"supplierNm", displayName:"仕入先名称"},
	                               {field:"receiveSlipNo", displayName:"WMS入荷伝票No."},
	                               {field:"receiveDt", displayName:"入荷日"},
	                               {field:"supplyCustomerCd", displayName:"納品先CD"},
	                               {field:"supplyCustomerNm", displayName:"納品先名称"},
	                               {field:"pickingWorkNo", displayName:"出庫作業No."},
	                               {field:"shippingDt", displayName:"出荷日"},
	                               {field:"centerCd", displayName:"センタCD"},
	                               {field:"centerNm", displayName:"センタ名称"},
	                               {field:"clientCd", displayName:"荷主CD"},
	                               {field:"clientNm", displayName:"荷主名称"}
	                               ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#initScreen
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
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

		//[#4065][#4333][Ver3.0]シリアルNo.のFromToチェックを追加 2018.04.17 miyabe/kawana Start
		// シリアルNo.大小チェック
        $scope.fromToCheckString = function(fromValue, toValue) {
        	var fromValueString = fromValue;
        	var toValueString = toValue;
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };
		//[#4065][#4333][Ver3.0]シリアルNo.のFromToチェックを追加 2018.04.17 miyabe/kawana End

		// 大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getLargePagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'serialNoList',
			columnDefs: 'SerialNoListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#initScreenHttp
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#deferredGetInitData
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 出庫指示一覧データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		if ($scope.screenMode != SCREEN_MODE.Read) {
			strDIPS_FLG = 1;
		}

		api.SerialNoList.init().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;
			$scope.updateCondition = response.data.tSerialNoFooter;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			if (owsHistory.hasState()) {
				// 履歴から検索
				$scope.searchCondition = owsHistory.popState();
				$scope.search();
			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				// 検索モード
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.mproduct.productCd = $route.current.params.productCd;
				$scope.searchCondition.serialNoFrom = $route.current.params.sertalNo;
				$scope.searchCondition.serialNoTo = $route.current.params.sertalNo;
				$scope.searchCondition.supplierCd = $route.current.params.supplierCd;
				$scope.searchCondition.supplierNm = $route.current.params.supplierNm;
				$scope.searchCondition.receiveSlipNo = $route.current.params.receiveSlipNo;
				$scope.searchCondition.receiveDtFrom = $route.current.params.receiveDt;
				$scope.searchCondition.receiveDtTo = $route.current.params.receiveDt;
				$scope.searchCondition.supplyCustomerCd = $route.current.params.supplyCustomerCd;
				$scope.searchCondition.supplyCustomerNm = $route.current.params.supplyCustomerCm;
				$scope.searchCondition.pickingWorkNo = $route.current.params.pickingWorkNo;
				$scope.searchCondition.shippingDtFrom = $route.current.params.shippingDt;
				$scope.searchCondition.shippingDtTo = $route.current.params.shippingDt;

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
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された納品先コードを取得
		var clientCd;
		var deliveryCd = $scope.updateCondition.supplyCustomerCdBatch;
		if($scope.serialNoList && $scope.serialNoList.length > 0){
			clientCd = $scope.serialNoList[0].mclient.clientCd;
		} else {
			clientCd = $scope.searchCondition.mclient.clientCd;
		}

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd(clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.updateCondition.supplyCustomerNmBatch = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.updateCondition.supplyCustomerNmBatch = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#showSupplyCustomer
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var clientCd;
		if($scope.serialNoList && $scope.serialNoList.length > 0){
			clientCd = $scope.serialNoList[0].mclient.clientCd;
		} else {
			clientCd = $scope.searchCondition.mclient.clientCd;
		}
		var items = {
				// 取引先マスタ
				clientCd: clientCd,
				deliveryCd: $scope.updateCondition.supplyCustomerCdBatch
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.updateCondition.supplyCustomerCdBatch = selectedItem.customerCd;
			$scope.updateCondition.supplyCustomerNmBatch = selectedItem.customerNm;
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#showProduct
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
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
				productCd: $scope.searchCondition.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.mproduct.productCd =  selectedItem.productCd;
			$scope.searchCondition.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#productCdBlur
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		// [Ver3.0][#4328] 不要なエラーチェックを削除 2018.04.13 shimizu

		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			api.product.query(request).then(function(response){
				$scope.searchCondition.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.mproduct.productNm = null;
		}

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#showSupplier
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showSupplier = function(){
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				// [Ver3.0][#4349] メンバの不備修正 2018.04.13 shimizu Start
				vendorCd: $scope.searchCondition.supplierCd
				// [Ver3.0][#4349] メンバの不備修正 2018.04.13 shimizu End
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.supplierCd = selectedItem.customerCd;
			$scope.searchCondition.supplierNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#supplierCdBlur
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.supplierCdBlur = function() {
		// 入力された仕入先コードを取得
		var supplierCd = $scope.searchCondition.supplierCd;

		if(supplierCd && 0 < supplierCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = supplierCd;

			$scope.searchCondition.supplierNm = null;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.supplierNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.supplierNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#showSupplyCustomer2
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer2 = function(){
		var clientCd;
		if($scope.serialNoList && $scope.serialNoList.length > 0){
			clientCd = $scope.serialNoList[0].mclient.clientCd;
		} else {
			clientCd = $scope.searchCondition.mclient.clientCd;
		}
		var items = {
				// 取引先マスタ
				clientCd: clientCd,
				deliveryCd: $scope.searchCondition.supplyCustomerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.supplyCustomerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#supplyCustomerCdBlur2
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur2 = function() {
		// 入力された納品先コードを取得
		var clientCd = $scope.searchCondition.mclient.clientCd;
		var deliveryCd = $scope.searchCondition.supplyCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd(clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.supplyCustomerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.supplyCustomerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#search
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#getPagingData
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
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

		api.SerialNoList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#setPagingData
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	var strDIPS_FLG = 0;
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.serialNoList = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#excelOutput
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		// 画面内容を引数に設定
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = listBody;
		request.data.tSerialNoFooter = $scope.updateCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);
		api.SerialNoList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#shippingUpdate
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 出荷情報更新ボタン押下処理<br>
	 *
	 * 出荷情報更新処理
	 */
	$scope.shippingUpdate = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			//明細が表示されていない場合
			if($scope.serialNoList.length == 0){
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
			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.tSerialNoFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			checkFunc = api.SerialNoList.checkShippingUpdate;
			execFunc = api.SerialNoList.shippingUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform1')) {
					return;
				}

				// 選択行のエラーデータ削除処理する。
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform1')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#dataDelete
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description 削除ボタン押下処理<br>
	 *
	 * 選択行のエラーデータ削除処理する。
	 */
	$scope.dataDelete = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			//明細が表示されていない場合
			if($scope.serialNoList.length == 0){
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
			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.tSerialNoFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.SerialNoList.checkDelete;
			execFunc = api.SerialNoList.dataDelete;

			successFunc = function(){
				$scope.search();
			}
			// 入力チェック
			checkFunc(request).then(function(checkResponse){
				// 処理結果確認
				if(checkResponse == "1"){
					if(!isInspectioned){
						if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
							return;
						}
					}
				}else{// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
							return;
						}
				}

				// 選択行のエラーデータ削除処理する。
				execFunc(request).then(function(execResponse){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}
					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#shippingInfoClear
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 出荷情報クリア押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.shippingInfoClear = function() {
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = listBody;
		request.data.tSerialNoFooter = $scope.updateCondition;

		checkFunc = api.SerialNoList.checkDelete;
		execFunc = api.SerialNoList.shippingInfoClear;

		successFunc = function(){
			$scope.search();
		}
		//明細が表示されていない場合
		if($scope.serialNoList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		checkFunc(request).then(function(checkResponse){
			// 処理結果確認
			if(checkResponse == "1"){
				if(!isInspectioned){
					if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
						return;
					}
				}
			}else{// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
						return;
					}
			}

			// 選択行のエラーデータ削除処理する。
			execFunc(request).then(function(execResponse){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
					return;
				}
				// 完了後の処理
				successFunc(execResponse);
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#slipNoReceiveList
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 伝票別入荷一覧ボタン押下処理<br>
	 *
	 * 伝票別入荷一覧処理。
	 */
	$scope.slipNoReceiveList = function() {
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = listBody;
		request.data.tSerialNoFooter = $scope.updateCondition;

		//明細が表示されていない場合
		if($scope.serialNoList.length == 0){
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
		// 選択された行のWMS入荷伝票No.が空白場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveSlipNo == null) {
			alertMessage.setErrorMessageByCode("receiveSlipNoNotSelectError");
			return;
		}
		// 選択された行の入荷日がが空白場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveDt == null) {
			alertMessage.setErrorMessageByCode("receiveDtNotSelectError");
			return;
		}
		// 伝票別入荷一覧画面へ遷移
		$location.path("wms/receive/SlipNoReceiveList").search({})
		.search("mode", SCREEN_MODE.Read)
		.search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd)
		.search("clientCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd)
		.search("receiveSlipNo",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveSlipNo)
		.search("receivePlanDtFrom",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveDt)
		.search("receivePlanDtTo",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].receiveDt)
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoList.object:SerialNoList#shippingInstList
	 * @methodOf oneslogiWms.SerialNoList.object:SerialNoList
	 *
	 * @description
	 * 出庫指示一覧ボタン押下処理<br>
	 *
	 * 出庫指示一覧処理。
	 */
	$scope.shippingInstList = function() {
		var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.list = listBody;

		//明細が表示されていない場合
		if($scope.serialNoList.length == 0){
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
		// 選択された行の出庫作業No.が空白場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingWorkNo == null ) {
			alertMessage.setErrorMessageByCode("pickingWorkNoNotSelectError");
			return;
		}
		// 選択された行の出荷日がが空白場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingDt == null ) {
			alertMessage.setErrorMessageByCode("shippingDtNotSelectError");
			return;
		}

        // [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana Start

		// 出荷梱包No.を出庫作業No.に変更
		api.SerialNoList.getPickingWorkNo(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

				return;
			}

			// 出庫指示一覧画面へ遷移
			$location.path("wms/shipping/ShippingInstList").search({})
				.search("mode", SCREEN_MODE.Read)
				.search("centerCd", response.data.list[0].mcenter.centerCd)
				.search("clientCd", response.data.list[0].mclient.clientCd)
				.search("pickingWorkNo", response.data.list[0].pickingWorkNo)
				.search("workDt", response.data.list[0].workDt);
		});

        // [#5475][v3.1] 出荷梱包No登録データで出庫指示一覧に遷移すると該当データなしになる問題を修正 2018.10.23 kawana End
	};

	$scope.isOpenBulkCourse = false;
	$scope.openBulkCourse = function() {
		$scope.isOpenBulkCourse = true;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkCourse").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
