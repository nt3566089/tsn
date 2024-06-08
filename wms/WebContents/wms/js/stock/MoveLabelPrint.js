/**
 * @ngdoc overview
 * @name oneslogiWms.MoveLabelPrint
 *
 * @description
 * 搬送ラベル発行画面
 */

angular.module('oneslogiWms.MoveLabelPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.MoveLabelPrint.service:moveLabelPrintApi
 *
 * @description
 * 	搬送ラベル発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList発行条件取得用WebApi<br>
 * ・resources/stock/moveLabelPrint/init 初期化用WebApi<br>
 * ・resources/stock/moveLabelPrint/print 検索用WebApi<br>
 */
.factory('moveLabelPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		printCondition: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.01.23 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.01.23 sja End
		moveLabelPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/stock/moveLabelPrint/init'],
				 ['print', 'GET', 'resources/stock/moveLabelPrint/print']
				 ]
		)
	};
}])
.controller('MoveLabelPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'moveLabelPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList()
					//荷主センタ変更対応 201７.01.23 sja Start
				 ,$scope.deferredGetWarehouseCdList()
					//荷主センタ変更対応 201７.01.23 sja End
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

	//荷主センタ変更対応 201７.01.23 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.tmoveInstH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.01.23 sja End

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.moveLabelPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;
			$scope.searchCondition.tmoveInstH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.tmoveInstH.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.tmoveInstH.instDt= userInfo.systemDt;
			$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printCondition);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.01.23 sja Start
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
	//荷主センタ変更対応 201７.01.23 sja End

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
			api.moveLabelPrint.print(request).then(function(response){
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
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);