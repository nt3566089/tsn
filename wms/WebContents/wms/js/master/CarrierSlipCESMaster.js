/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipCESMaster
 *
 * @description
 * キャリアEDIシステム送り状マスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.CarrierSlipCESMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipCESMaster.service:CarrierSlipCESMasterApi
 *
 * @description
 * キャリアEDIシステム送り状マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/carrierSlipCESMaster/init 初期化用WebApi<br>
 * ・resources/master/carrierSlipCESMaster/search 検索用WebApi<br>
 * ・resources/master/carrierSlipCESMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/carrierSlipCESMaster/register 登録用WebApi<br>
 *
 */
.factory('carrierSlipCESMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliveryCustomer: AngularAPIClient.make(
				[
				 	['record', 'GET', 'resources/common/deliveryCustomer/record']
		        ]
			),
		CarrierSlipCESMaster: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/carrierSlipCESMaster/init'],
				 ['search', 'GET', 'resources/master/carrierSlipCESMaster/search'],
				 ['excel',  'GET', 'resources/master/carrierSlipCESMaster/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
 *
 * @description
 * キャリアEDIシステム送り状マスタ画面コントローラ
 */
.controller('CarrierSlipCESMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'carrierSlipCESMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.carrierSlipListCols =
		[
		 {field:"collectAccountNoBillTo", displayName:"Collect Account# (Bill To)"},
		 {field:"collectZipCdBillTo", displayName:"Collect Zip Code (Bill To)"},
		 {field:"collectCountryCdBillTo", displayName:"Collect Country Code (Bill To)"},
		 {field:"paymentTermCdTaxesTo", displayName:"Payment Term Code (Taxes To)"},
		 {field:"collectAccountNoTaxesTo", displayName:"Collect Account# (Taxes To)"},
		 {field:"collectZipCdTaxesTo", displayName:"Collect Zip Code (Taxes To)"},
		 {field:"collectCountryCdTaxesTo", displayName:"Collect Country Code (Taxes To)"},
		 {field:"codPaymentTermCd", displayName:"COD Payment Term Code"},
		 {field:"codAmount", displayName:"COD Amount"},
		 {field:"codFeePayer", displayName:"COD Fee Payer"},
		 {field:"termsOfSales", displayName:"Terms of Sales"},
		 {field:"brokerName", displayName:"Broker Name"},
		 {field:"brokerPhoneNo", displayName:"Broker Phone#"},
		 {field:"brokerFaxNo", displayName:"Broker Fax#"},
		 {field:"satDeliveryFlg", displayName:"Saturday Delivery フラグCD"},
		 {field:"bclassDtlBySatDeliveryFlg.vdict.dictNm", displayName:"Saturday Delivery フラグ名称"},
		 {field:"residentialDeliveryFlg", displayName:"Residential Delivery フラグCD"},
		 {field:"bclassDtlByResidentialDeliveryFlg.vdict.dictNm", displayName:"Residential Delivery フラグ名称"},
		 {field:"codFlg", displayName:"Collect On Delivery フラグCD"},
		 {field:"bclassDtlByCodFlg.vdict.dictNm", displayName:"Collect On Delivery フラグ名称"},
		 {field:"signatureRequiredFlg", displayName:"Signature Required フラグCD"},
		 {field:"bclassDtlBySignatureRequiredFlg.vdict.dictNm", displayName:"Signature Required フラグ名称"},
		 {field:"signatureReleaseFlg", displayName:"Signature ReleaseフラグCD"},
		 {field:"bclassDtlBySignatureReleaseFlg.vdict.dictNm", displayName:"Signature Releaseフラグ名称"},
		 {field:"callBeforeDeliveryFlg", displayName:"Call Before Delivery フラグCD"},
		 {field:"bclassDtlByCallBeforeDeliveryFlg.vdict.dictNm", displayName:"Call Before Delivery フラグ名称"},
		 {field:"freezableProtectionFlg", displayName:"Freezable Protection フラグCD"},
		 {field:"bclassDtlByFreezableProtectionFlg.vdict.dictNm", displayName:"Freezable Protection フラグ名称"},
		 {field:"guaranteedPlusFlg", displayName:"Guaranteed Plus フラグCD"},
		 {field:"bclassDtlByGuaranteedPlusFlg.vdict.dictNm", displayName:"Guaranteed Plus フラグ名称"},
		 {field:"residentialPickupFlg", displayName:"Residential Pickup フラグCD"},
		 {field:"bclassDtlByResidentialPickupFlg.vdict.dictNm", displayName:"Residential Pickup フラグ名称"},
		 {field:"doNotStackPalletsFlg", displayName:"Do Not Stack Pallets フラグCD"},
		 {field:"bclassDtlByDoNotStackPalletsFlg.vdict.dictNm", displayName:"Do Not Stack Pallets フラグ名称"},
		 {field:"limitedAccessDeliveryFlg", displayName:"Limited Access Delivery フラグCD"},
		 {field:"bclassDtlByLimitedAccessDeliveryFlg.vdict.dictNm", displayName:"Limited Access Delivery フラグ名称"},
		 {field:"limitedAccessPickupFlg", displayName:"Limited Access Pickup フラグCD"},
		 {field:"bclassDtlByLimitedAccessPickupFlg.vdict.dictNm", displayName:"Limited Access Pickup フラグ名称"},
		 {field:"overSizedFlg", displayName:"Over-Sized/Extreme Length フラグCD"},
		 {field:"bclassDtlByOverSizedFlg.vdict.dictNm", displayName:"Over-Sized/Extreme Length フラグ名称"},
		 {field:"poisonFlg", displayName:"Poison フラグCD"},
		 {field:"bclassDtlByPoisonFlg.vdict.dictNm", displayName:"Poison フラグ名称"},
		 {field:"foodFlg", displayName:"Food フラグCD"},
		 {field:"bclassDtlByFoodFlg.vdict.dictNm", displayName:"Food フラグ名称"},
		 {field:"liftgateDeliveryPrepaidFlg", displayName:"Liftgate at delivery フラグCD (Prepaid)"},
		 {field:"bclassDtlByLiftgateDeliveryPrepaidFlg.vdict.dictNm", displayName:"Liftgate at delivery フラグ名称 (Prepaid)"},
		 {field:"liftgateDeliveryCollectFlg", displayName:"Liftgate at delivery フラグCD (Collect)"},
		 {field:"bclassDtlByLiftgateDeliveryCollectFlg.vdict.dictNm", displayName:"Liftgate at delivery フラグ名称 (Collect)"},
		 {field:"liftgatePickupPrepaidFlg", displayName:"Liftgate at pickup フラグCD (Prepaid)"},
		 {field:"bclassDtlByLiftgatePickupPrepaidFlg.vdict.dictNm", displayName:"Liftgate at pickup フラグ名称 (Prepaid)"},
		 {field:"liftgatePickupCollectFlg", displayName:"Liftgate at pickup フラグCD (Collect)"},
		 {field:"bclassDtlByLiftgatePickupCollectFlg.vdict.dictNm", displayName:"Liftgate at pickup フラグ名称 (Collect)"},
		 {field:"insideDeliveryPrepaidFlg", displayName:"Inside Delivery フラグCD (Prepaid)"},
		 {field:"bclassDtlByInsideDeliveryPrepaidFlg.vdict.dictNm", displayName:"Inside Delivery フラグ名称 (Prepaid)"},
		 {field:"insideDeliveryCollectFlg", displayName:"Inside Delivery フラグCD (Collect)"},
		 {field:"bclassDtlByInsideDeliveryCollectFlg.vdict.dictNm", displayName:"Inside Delivery フラグ名称 (Collect)"},
		 {field:"insidePickupPrepaidFlg", displayName:"Inside Pickup フラグCD (Prepaid)"},
		 {field:"bclassDtlByInsidePickupPrepaidFlg.vdict.dictNm", displayName:"Inside Pickup フラグ名称 (Prepaid)"},
		 {field:"insidePickupCollectFlg", displayName:"Inside Pickup フラグCD (Collect)"},
		 {field:"bclassDtlByInsidePickupCollectFlg.vdict.dictNm", displayName:"Inside Pickup フラグ名称 (Collect)"},
		 {field:"addDt", displayName:"登録日時"},
		 {field:"updDt", displayName:"更新日時"},
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#initScreen
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定(ページング有り)
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'carrierSlipList',
			columnDefs: 'carrierSlipListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#initScreenHttp
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierSlipCESMasterEdit.object:CarrierSlipCESMasterEdit
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * キャリアEDIシステム送り状マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.CarrierSlipCESMaster.init().then(function(response){
			$scope.head = response.data.head;
			$scope.carrierSlipList = response.data.body;
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// ログイン情報より初期値を設定
			$scope.head.clientCd = userInfo.clientCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.head.customerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.head.customerNm = response.data.mCustomer.customerNm;

			});

		} else {
			$scope.head.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.head.clientCd,
			deliveryCd: $scope.head.customerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.head.customerCd = selectedItem.customerCd;
			$scope.head.customerNm = selectedItem.customerNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#search
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#getSearchData
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.CarrierSlipCESMaster.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#setSearchData
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.carrierSlipList = response.data.carrierSlipCESMaster;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#getClassForRow
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 削除ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#excelOutput
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "carrierSlipCESMaster", document.title);

		api.CarrierSlipCESMaster.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#register
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * キャリアEDIシステム送り状マスタメンテナンス新規する為の画面を表示する。
	 */
	$scope.initNew = function() {
		$location.path("wms/master/CarrierSlipCESMasterEdit").search({}).search("mode", SCREEN_MODE.Create);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#copy
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		$location.path("wms/master/CarrierSlipCESMasterEdit").search({}).search("mode", SCREEN_MODE.Copy)
		.search("customerId",  $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerId);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster#gridDblClick
	 * @methodOf oneslogiWms.CarrierSlipCESMaster.object:CarrierSlipCESMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#update
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行のキャリアEDIシステム送り状マスタデータを修正する為の画面を表示する。
	 */
	$scope.update = function() {
		//修正画面へ遷移
		$location.path("wms/master/CarrierSlipCESMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
		.search("customerId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerId);
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
