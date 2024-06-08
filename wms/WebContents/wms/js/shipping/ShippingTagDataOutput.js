/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingTagDataOutput
 *
 * @description 送り状データ出力画面<br>
 *
 * 送り状データ出力表示する画面。
 *
 */
angular.module('oneslogiWms.ShippingTagDataOutput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingTagDataOutput.service:ShippingTagDataOutputApi
 *
 * @description 送り状データ出力画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/centerClass/keyValueList 緊急のみ、データ種別、送り状データ作成フラグロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/shippingTagDataOutput/init 初期データ取得用WebApi<br>
 * ・resources/shipping/shippingTagDataOutput/search 検索結果取得WebAPI<br>
 * ・resources/shipping/shippingTagDataOutput/print 出力ボタンを押下された時に処理WebAPI<br>
 * ・resources/common/deliveryCustomer/record 納品先データ取得WebAPI<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * ・resources/common/carrierCd/keyValueList 運送業者データ取得WebAPI<br>
 */
.factory('shippingTagDataOutputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		),
		emergencyFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		tagFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		invoiceCreateFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
	                                         ]
		),
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana Start
		takingShippingFlg: AngularAPIClient.make([
										['query', 'GET', 'resources/common/centerClass/keyValueList']
										]
		),
		// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana End
		shippingTagDataOutput: AngularAPIClient.make([
		                                           ['init',   'GET', 'resources/shipping/shippingTagDataOutput/init'],
		                                           ['search',  'GET','resources/shipping/shippingTagDataOutput/search'],
		                                           // [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
		                                           ['checkPrint', 'POST', 'resources/shipping/shippingTagDataOutput/checkPrint'],
		                                           // [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End
		                                           ['print', 'GET', 'resources/shipping/shippingTagDataOutput/print']
//		                                           ['csv', 'GET', 'resources/shipping/shippingTagDataOutput/print','csv']
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
 *
 * @description 送り状データ出力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingTagDataOutput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'shippingTagDataOutputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.shippingTagDataOutputCols = [
                                     //荷主センタ変更対応 2017.02.10 sja Start
                                     {field:"clientCd", displayName:"荷主CD"},
                                     {field:"clientNm", displayName:"荷主名称"},
                                     {field:"centerCd", displayName:"センタCD"},
                                     {field:"centerNm", displayName:"センタ名称"},
                                     //荷主センタ変更対応 2017.02.10 sja End
	                                 {field:"shippingDt", displayName:"出荷日"},
	                                 {field:"workDt", displayName:"作業日"},
	                                 {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                 {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                 {field:"deliveryCourseAbbr", displayName:"配送コース名称"},
	                                 {field:"carrierCd", displayName:"運送業者CD"},
	                                 {field:"carrierNm", displayName:"運送業者名称"},
	                                 {field:"carrierAbbr", displayName:"運送業者略称"},
	                                 {field:"delivCustomerCd", displayName:"届先CD"},
	                                 {field:"delivCustomerNm", displayName:"届先名称"},
	                                 {field:"delivAddress1", displayName:"届先住所1"},
	                                 {field:"delivAddress2", displayName:"届先住所2"},
	                                 {field:"delivAddress3", displayName:"届先住所3"},
	                                 {field:"supplyCustomerCd", displayName:"納品先CD"},
	                                 {field:"supplyCustomerNm", displayName:"納品先名称"},
	                                 {field:"supplyCustomerAbbr", displayName:"納品先"},
	                                 {field:"pickingWorkNo", displayName:"出庫作業No."},
	                                 {field:"clientShippingNo", displayName:"顧客出荷指示No."},
	                                 {field:"sumPickingHCount", displayName:"梱包数"},
	                                 {field:"emergencyFlg", displayName:"緊急フラグ"},
	                                 {field:"invoiceCreateFlg", displayName:"送り状データ作成フラグ"},
	                                 {field:"invoiceCreateDt", displayName:"送り状データ作成日時"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#initScreen
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 検索条件を表示状態に変更
		$scope.isopen = true;
		//[検査-161] 出荷日と作業日にFromToチェックを追加 2014.12.01 衛 Start
		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);
			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}
		//[検査-161] 出荷日と作業日にFromToチェックを追加 2014.12.01 衛 End
			return true;
		};
		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		//荷主センタ変更対応 201７.02.10 sja Start
		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {
			// 運送業者リスト変更（同期処理）
		    $scope.deferredGetCarrier();
		};
		//荷主センタ変更対応 201７.02.10 sja End

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.receivePlanH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
			}
		};

		// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'shippingTagDataOutputB',
			columnDefs: 'shippingTagDataOutputCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#initScreenHttp
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:shippingTagDataOutput
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetEmergency(),// 緊急のみ
				// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana
				 $scope.deferredGetCarrier(),//運送業者
				 $scope.deferredGetInvoice(),//送り状データ作成フラグ
				 // [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana Start
				 $scope.deferredGetTakingShippingFlg()//日付区分
				 // [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#deferredGetEmergency
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description 緊急のみ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergency = function () {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_DISPLAY";

		owsCommon.getDataCacheable(api.emergencyFlg, request).then(function(response){
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#deferredGetInvoice
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description リストデータ種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInvoice = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVOICE_CREATE_FLG";

		owsCommon.getDataCacheable(api.invoiceCreateFlg, request).then(function(response){
			$scope.invoiceCreateFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana

	// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description 作業日/出荷日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.takingShippingFlg, request).then(function(response){
			$scope.takingShippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deliveryCourse
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){

		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd
		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#showCustomer
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:deliveryCourse
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showVendor = function(){

		//納品先のモーダル画面を表示
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd
			};
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#customerCdBlur
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された納品先CDを取得
		var customerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 納品先CD情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#deferredGetCarrier
	 * @methodOf oneslogiWms.ShippingConfirmList.object:ShippingConfirmList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};

		//荷主センタ変更対応 2017.02.10 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.10 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			//荷主センタ変更対応 2017.02.10 sja Start
//			deferred.resolve();
			deferred.resolve(response);
			//荷主センタ変更対応 2017.02.10 sja End
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#customerCdBlur
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された納品先コードを取得
		var customerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 納品先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description ピッキングリスト発行データを取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

			api.shippingTagDataOutput.init().then(function(response){
				$scope.paging = response.paging;

				$scope.searchCondition = response.data.head;
				$scope.footer = response.data.footer;
				$scope.shippingTagDataOutputB = response.data.list;

				// ログイン情報より初期値を設定
				$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
				$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
				$scope.searchCondition.emergencyFlg =  owsCommon.getDefaultValue($scope.emergencyFlgList);
				$scope.searchCondition.tpickingRAsOne.invoiceCreateFlg = owsCommon.getDefaultValue($scope.invoiceCreateFlgList);

				// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana Start
				// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
				$scope.searchCondition.takingShippingFlg =  owsCommon.getDefaultValue($scope.takingShippingFlgList);
				$scope.searchCondition.dtFrom = userInfo.systemDt;
				$scope.searchCondition.dtTo = userInfo.systemDt;
				// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End
				// [ON推-品向-590] 出荷日・作業日の検索条件を出庫指示一覧にあわせる 2015.03.25 kawana End

				// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana

				// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


				// 履歴データ取得・検索処理
				if (owsHistory.hasState()) {
					$scope.searchCondition = owsHistory.popState();
					$scope.search();
				}
				//荷主センタ変更対応 201７.02.10 sja Start
				// センタ変更後処理
				$scope.centerChange(true);
				//荷主センタ変更対応 201７.02.10 sja End

			    // [ON推-品向-211] 検索条件にカルチャIDを追加 2014.11.20 xiangy Start

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchform');

			    // [ON推-品向-211] 検索条件にカルチャIDを追加 2014.11.20 xiangy End
				deferred.resolve();
			});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#search
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
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
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#getPagingData
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.shippingTagDataOutput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#setPagingData
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-333] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-333] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// 取得したデータをグリッドに表示
		$scope.shippingTagDataOutputB = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput#getClassForRow
//	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
//	 *
//	 * @description
//	 * 行別背景色取得処理<br>
//	 *
//	 * 出荷ステータスに応じた背景色をテンプレートに返す。
//	 */
//	$scope.getClassForRow = function(row) {
//		var color;
//		if (row.entity.emergencyFlg == "1") {//緊急
//			color = "wmslegendcolorred";
//		}else if (row.entity.stockOutFlg == "1") {//欠品
//			color = "wmslegendblue";
//		}
//		return color;
//	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingTagDataOutput.object:ReceiveInputNo#register
	 * @methodOf oneslogiWms.ShippingTagDataOutput.object:ShippingTagDataOutput
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:ReceiveInputNo#register
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.csvOutput = function() {

		//明細が表示されていない場合
		if($scope.shippingTagDataOutputB.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		//明細が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// [EC-CT1-124] EC送り状データ出力にあわせて変更(フッタ部の送り状種別を削除) 2015.03.18 kawana

		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
		// チェック
		api.shippingTagDataOutput.checkPrint(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}
			// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

		    // [ON推-品向-033] downloadUrlを修正 2014.11.20 xiangy Start
			api.shippingTagDataOutput.print(request).then(function(response){

				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					location.href = response.output.downloadUrl;
				}

				// [SK2-011] データ出力後に再検索を追加（位置を修正） 2014.12.09 kawana Start
				$scope.search();
				// [SK2-011] データ出力後に再検索を追加（位置を修正） 2014.12.09 kawana End
			});
		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
		});
		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End

		// [SK2-011] 再検索処理を削除 2014.12.09 kawana

		// [ON推-品向-033] downloadUrlを修正 2014.11.20 xiangy End
	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
