/**
 * @ngdoc overview
 * @name oneslogiWms.StoreLabelPrint
 *
 * @description
 * 入庫ラベル発行画面
 */

angular.module('oneslogiWms.StoreLabelPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.StoreLabelPrint.service:storeLabelPrintApi
 *
 * @description
 * 	入庫ラベル発行WebApi定義<br>
 * ・resources/common/supplierCustomer/record入庫ラベル発行操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList発行条件取得用WebApi<br>
 * ・resources/receive/storeLabelPrint/init 初期化用WebApi<br>
 * ・resources/receive/storeLabelPrint/print 検索用WebApi<br>
 */
.factory('storeLabelPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
		printCondition: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.17 sja Start
		warehouseList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		//荷主センタ変更対応 201７.02.17 sja End
		storeLabelPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/receive/storeLabelPrint/init'],
				 ['print', 'GET', 'resources/receive/storeLabelPrint/print']
				 ]
		)
	};
}])
.controller('StoreLabelPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'storeLabelPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//[#4065][Ver3.0]入庫ラベルNo.のFromToチェックを追加 2018.03.29 miyabe Upd Start
		// 入庫ラベルNo.大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
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
		// 入庫ラベルNo.大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);
		//[#4065][Ver3.0]入庫ラベルNo.のFromToチェックを追加 2018.03.29 miyabe Upd End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList(),
				//荷主センタ変更対応 201７.02.17 sja Start
				 $scope.deferredGetWarehouseList()
			 	//荷主センタ変更対応 201７.02.17 sja End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
	// 発行条件プルダウンデータ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		owsCommon.getDataCacheable(api.printCondition, "keyValueList", request).then(function(response){
			$scope.printCondition = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.storeLabelPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;
			$scope.searchCondition.tstoreRecordH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.tstoreRecordH.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.storeDt= userInfo.systemDt;
			// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
			$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printCondition);
			// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.17 sja Start
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
		$scope.deferredGetWarehouseList();
	};
	//荷主センタ変更対応 201７.02.17 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:ReplenishInstList#deferredGetWarehouseList
	 * @methodOf oneslogiWms.StockList.object:ReplenishInstList
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {

		var deferred = $q.defer();
		var request = {};
		var centerCd = userInfo.centerCd;

		if($scope.searchCondition){
			centerCd = $scope.searchCondition.tstoreRecordH.mcenter.centerCd;
		}

		request.centerId = userInfo.centerIdByCd(centerCd);

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.StoreLabelPrint.object:StoreLabelPrint#showVendor
	 * @methodOf oneslogiWms.StoreLabelPrint.object:StoreLabelPrint
	 *
	 * @description
	 * 仕入先検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showVendor = function(){
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		// 仕入先のモーダル画面を表示

		var items = {
				clientCd:$scope.searchCondition.tstoreRecordH.mclient.clientCd,
				vendorCd:$scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerCd
		};
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerCd= selectedItem.customerCd;

			$scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerNm = selectedItem.customerNm;
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
		var customerCd = $scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerCd;

		if(customerCd && 0 < customerCd.length) {

			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.tstoreRecordH.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){

				$scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tstoreRecordH.mcustomerBySupplierId.customerNm = null;
		}
	};

	// 発行ボタン
	$scope.issue = function() {

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.printBasicData = printParam.printBasicData;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.storeLabelPrint.print(request).then(function(response){
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
				// [ON推-品向-601] 帳票データ件数の上限を設定 2015.04.16 kawana Start
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
				// [ON推-品向-601] 帳票データ件数の上限を設定 2015.04.16 kawana End
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);