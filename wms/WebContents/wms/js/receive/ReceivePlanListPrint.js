/**
 * @ngdoc overview
 * @name oneslogiWms.ReceivePlanListPrint
 *
 * @description
 * 入荷予定リスト発行画面
 */
angular.module('oneslogiWms.ReceivePlanListPrint',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceivePlanListPrint.service:receivePlanListPrintApi
 *
 * @description
 * 入荷予定リスト発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList 入荷予定リスト発行操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 入荷予定リスト発行操作用WebApi<br>
 * ・resources/receive/receivePlanListPrint/init初期化用WebApi<br>
 * ・resources/receive/receivePlanListPrint/print検索用WebApi<br>
 */
.factory('receivePlanListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.09 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.09 sja End
		printCondition: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		receivePlanListPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/receive/receivePlanListPrint/init'],
				 ['print', 'GET', 'resources/receive/receivePlanListPrint/print']
				 ]
		)
	};
}])
.controller('ReceivePlanListPrint', ['$scope', '$window', '$timeout', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'receivePlanListPrintApi', function($scope, $window, $timeout, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldClient;
	var newDepositStockTypeList;
	// 画面初期化処理
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.treceivePlanH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.searchCondition.treceivePlanH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
			}
		};

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

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList()
					//荷主センタ変更対応 201７.02.09 sja Start
				 ,$scope.deferredGetWarehouseCdList()
					//荷主センタ変更対応 201７.02.09 sja End				 
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

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
	
	//荷主センタ変更対応 201７.02.09 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.treceivePlanH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.09 sja End

	//荷主センタ変更対応 201７.02.09 sja Start
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
	//荷主センタ変更対応 201７.02.09 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.searchCondition.treceivePlanH.mclient.clientCd;
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});
		return deferred.promise;
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositStockTypeList.length == 1) {
				$scope.searchCondition.treceivePlanH.mcustomerByPlanDepositId.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.treceivePlanH.mcustomerByPlanDepositId.customerCd = null;
			}
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#changeClient
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});
	};

	// プリントデータ取得DTOの初期化
    $scope.deferredGetInitData = function(){
	var deferred = $q.defer();

//	// 画面モード判定
//	if ($scope.screenMode == SCREEN_MODE.Update) {
//
//		var request = {};
//		request.clientCd = $route.current.params.clientCd;
//		request.centerCd = $route.current.params.centerCd;
//		request.receivePlanDtFrom = $route.current.params.receivePlanDt;
//		request.receivePlanDtTo = $route.current.params.receivePlanDt;
//		request.planClientReceiveNo = $route.current.params.planClientReceiveNo;
//		request.receiveSlipNo = $route.current.params.receiveSlipNo;
//
//		api.receivePlanListPrint.init().then(function(response){
//			$scope.printParam = response.printBasicData;
//			$scope.searchCondition = response.data.search;
//			$scope.searchCondition.treceivePlanH.mclient.clientCd = request.clientCd;
//			$scope.searchCondition.treceivePlanH.mcenter.centerCd = request.centerCd
//			$scope.searchCondition.treceivePlanH.printCondition = $scope.printCondition[2].classCd;
//			$scope.searchCondition.treceivePlanH.planClientReceiveNo = request.planClientReceiveNo;
//			$scope.searchCondition.treceivePlanH.receiveSlipNo = request.receiveSlipNo;
//			$scope.searchCondition.treceivePlanH.receivePlanDtFrom = request.receivePlanDtFrom;
//			$scope.searchCondition.treceivePlanH.receivePlanDtTo = request.receivePlanDtTo;
//
//			// 荷主変更後処理
//			$scope.changeClient(false);
//
//			//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
//			owsCommon.setFirstFocus('searchform');
//
//			deferred.resolve();
//		});
//
//	}else{
		api.receivePlanListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;
			$scope.searchCondition.treceivePlanH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.treceivePlanH.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.treceivePlanH.printCondition = owsCommon.getDefaultValue($scope.printCondition);
			$scope.searchCondition.treceivePlanH.receivePlanDtFrom = userInfo.systemDt;//日付(From)
			$scope.searchCondition.treceivePlanH.receivePlanDtTo = userInfo.systemDt;//日付(To)

			// 荷主変更後処理
			$scope.changeClient(true);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
//	}

	return deferred.promise;
};
	// 発行ボタン
	$scope.issue = function() {

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			var listBody = [];
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.printBasicData = printParam.printBasicData;

			listBody[0] = request;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.receivePlanListPrint.print(listBody).then(function(response){
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
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana Start
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana End
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);