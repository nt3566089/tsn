/**
 * @ngdoc overview
 * @name oneslogiWms.PackingList
 *
 * @description
 * 梱包明細一覧画面<br>
 *
 */

angular.module('oneslogiWms.PackingList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PackingList.service:packingListApi
 *
 * @description
 * 梱包明細一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * packingList 梱包明細一覧データ操作用WebApi<br>
 * ・resources/shipping/packingList/init 初期処理WebAPI<br>
 * ・resources/shipping/packingList/search 検索WebAPI<br>
 */
.factory('packingListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		takingShippingDtFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		deliveryCourse: AngularAPIClient.make(
										[
										 ['record', 'GET', 'resources/common/deliveryCourse/record'],
										 ['search', 'GET', 'resources/common/deliveryCourse/search']
										 ]
		),
		deliveryCustomer: AngularAPIClient.make([
			                     			        ['record', 'GET', 'resources/common/deliveryCustomer/record']
			                     				    ]
		),
		packingList: AngularAPIClient.make([
		                                           ['init',   'GET', 'resources/shipping/packingList/init'],//初期処理
		                                           ['search', 'GET', 'resources/shipping/packingList/search'],//検索
		                                           ['excel',  'GET',  'resources/shipping/packingList/search', 'excel'], //Excel出力
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PackingList.object:PackingList
 *
 * @description
 * 梱包明細一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PackingList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'packingListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.packingListCols = [
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#initScreen
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		//検索条件を表示状態に変更
		$scope.isopen = true;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);
			if (fromValueString > toValueString) {
				return false;
			}
			return true;
		};

		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// 梱包明細一覧グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'packingList',
			columnDefs: 'packingListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#initScreenHttp
	 * @methodOf oneslogiWms.PackingList.object:PackingList
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
				 $scope.deferredGetTakingShippingDtFlg(),//作業日/出荷日/納品日
				 $scope.deferredGetCarrier(),//運送業者
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#deferredGetInitData
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 梱包明細一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	  $scope.deferredGetInitData = function () {
		  var deferred = $q.defer();

		  api.packingList.init().then(function(response){
			  $scope.paging = response.paging;
			  $scope.searchCondition = response.data.search;

			  // ログイン情報より初期値を設定
			  $scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			  $scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			  // [#4512] 作業日/出荷日/納品日の初期値が設定されない問題を修正 2018.05.09 kawana Start
			  $scope.searchCondition.takingShippingDtFlg =  owsCommon.getDefaultValue($scope.takingShippingDtFlgList);
			  // [#4512] 作業日/出荷日/納品日の初期値が設定されない問題を修正 2018.05.09 kawana End

			  $scope.searchCondition.dtFrom = userInfo.systemDt;//日付(From)
			  $scope.searchCondition.dtTo = userInfo.systemDt;//日付(To)

			  $scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage,$scope.gridOptions.paginationPageSize);

			  // [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			  // 履歴データ取得・検索処理
			  /*
			  if (owsHistory.hasState()) {
				  $scope.searchCondition = owsHistory.popState();
				  $scope.search();

			  } else if ($scope.screenMode == SCREEN_MODE.Update) {
				  $scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				  $scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				  $scope.search();
			  }
				*/

			  //通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			  owsCommon.setFirstFocus();

			  deferred.resolve();
		  });

	  return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PakingList.object:PackingList#deferredGetTakingShippingDtFlg
	 * @methodOf oneslogiWms.PakingList.object:PackingList
	 *
	 * @description
	 * 作業日/出荷日/納品日区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_DT_FLG";

		owsCommon.getDataCacheable(api.takingShippingDtFlg, request).then(function(response){
			$scope.takingShippingDtFlgList = response.data;
			deferred.resolve();

		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.16 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#centerChange
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、運送業者リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrier();
	};
	//荷主センタ変更対応 201７.02.16 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PakingList.object:PackingList#deferredGetCarrier
	 * @methodOf oneslogiWms.PakingListList.object:PackingList
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.06 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.06 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;

			deferred.resolve();

		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#showCustomer
	 * @methodOf oneslogiWms.PackingList.object:PakingList
	 *
	 * @description
	 * 配送コースCD検索ボタンを押下された時に処理<br>
	 *
	 * 配送コースマスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コースマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd
		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コースマスタ
			$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.deliveryCourseNm = selectedItem.deliveryCourseNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:ProductShippingList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 配送コースCDをロストフォーカス時の処理<br>
	 *
	 * 配送コースマスタから配送コース情報を取得し、設定する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			//荷主センタ変更対応 2017.02.06 sja Start
//			request.centerId = userInfo.centerId;
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			//荷主センタ変更対応 2017.02.06 sja End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#showSupplyCustomer
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				// 取引先マスタ
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd

		};

		//納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.supplyCustomerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmList.object:ShippingConfirmList#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		// 入力された納品先CDを取得
		var customerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 納品先CD情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.supplyCustomerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.supplyCustomerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#showDelivCustomer
	 * @methodOf oneslogiWms.PackingList.object:modalDelivery
	 *
	 * @description 届先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showDelivCustomer = function(){
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.delivCustomerCd
		};

		// 届先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 届先マスタ
			$scope.searchCondition.tallocInstH.delivCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.delivCustomerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#delivCustomerCdBlur
	 * @methodOf oneslogiWms.PackingList.object:delivCustomerCdBlur
	 *
	 * @description
	 * 届先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、取引先情報を取得し画面項目に反映する。
	 */
	$scope.delivCustomerCdBlur = function() {
		// 入力された納品先コードを取得
		var deliveryCd = $scope.searchCondition.tallocInstH.delivCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = deliveryCd;

			api.deliveryCustomer.record(request).then(function(response){
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.07 miyabe Start
				$scope.searchCondition.delivCustomerNm = response.data.mCustomer.customerNm;
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.07 miyabe End

			});
		} else {
			$scope.searchCondition.delivCustomerNm = null;

		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#search
	 * @methodOf oneslogiWms.PackingList.object:PackingList
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
	 * @name oneslogiWms.PakingList.object:PackingList#getPagingData
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.packingList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#setPagingData
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.packingList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:PackingList#getClassForRow
	 * @methodOf oneslogiWms.PackingList.object:PackingList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingList.object:BoxMaster#excelOutput
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.packingList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
