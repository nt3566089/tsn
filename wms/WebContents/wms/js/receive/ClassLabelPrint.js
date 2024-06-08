/**
 * @ngdoc overview
 * @name oneslogiWms.ClassLabelPrint
 *
 * @description
 * 汎用ラベル発行画面
 */
angular.module('oneslogiWms.ClassLabelPrint',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ClassLabelPrint.service:classLabelPrintApi
 *
 * @description
 *  汎用ラベル発行WebApi定義<br>
 * ・resources/common/warehouse/keyValueList汎用ラベル発行操作用WebApi<br>
 * ・resources/receive/classLabelPrint/init 初期化用WebApi<br>
 * ・resources/receive/classLabelPrint/print 検索用WebApi<br>
 */
.factory('classLabelPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		warehouse: AngularAPIClient.make(
				[
					//荷主センタ変更対応 201７.02.04 sja Start
			   //['keyValueList', 'GET', 'resources/common/warehouse/keyValueList']
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
					//荷主センタ変更対応 201７.02.04 sja End
				 ]
		),
		classLabelPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/receive/classLabelPrint/init'],
				 ['print', 'GET', 'resources/receive/classLabelPrint/print']
				 ]
		)
	};
}])
.controller('ClassLabelPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'classLabelPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){
	//荷主センタ変更対応 201７.02.04 sja Start
	var oldCenter;
	var newWarehouse;
	//荷主センタ変更対応 201７.02.04 sja End
	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//荷主センタ変更対応 201７.02.04 sja Start
		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {
			// 倉庫リスト変更（同期処理）
			$scope.deferredGetWarehouse()
			.then(function(response) {
				newWarehouse = response.data;
			});
		};

		// センタ変更の監視設定（ロストフォーカス時）
		$scope.centerBlur = function() {
			//[#6865][OSS] 汎用ラベル発行画面でセンタCDロストフォーカス時のコンソールエラーを修正 2020.02.05 tanaka Start
			// 選択したセンタで取得済みの倉庫リストを設定
			$scope.deferredGetWarehouse()
			.then(function(response) {
				setWarehouse(response.data, true);
			});
			//[#6865][OSS] 汎用ラベル発行画面でセンタCDロストフォーカス時のコンソールエラーを修正 2020.02.05 tanaka End
		};
		//荷主センタ変更対応 201７.02.04 sja End

		//枚数大小チェック
//        $scope.valueCheck = function(value) {
//
//        	if(value < 1){
//        		return false;
//        	}else{
//        		return true;
//        	}
//        };
//
//        var err = "minIsOneError";
//
//        $scope.fromToMessage = $filter('owfMessage')(err);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetWarehouse()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	//荷主センタ変更対応 201７.02.04 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouse = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.tstoreRecordH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouse, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.01.04 sja End

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){

		var deferred = $q.defer();

		api.classLabelPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;
			$scope.searchCondition.tstoreRecordH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.tstoreRecordH.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.storeLabelNo = "1";

			//荷主センタ変更対応 201７.01.23 sja Start
			// センタ変更後処理
			$scope.changeCenter(true);
			//荷主センタ変更対応 201７.01.23 sja End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.04 sja Start
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
	$scope.changeCenter = function(clearSelected) {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouse()
		.then(function(response) {
			setWarehouse(response.data, clearSelected);
		});
	};

	// 倉庫リスト再設定処理
	var setWarehouse = function(list, clearSelected) {
		$scope.warehouse = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.warehouse.length == 1) {
				// [#6865][OSS] 汎用ラベル画面遷移時のコンソールエラーを修正 2019.11.19 tanaka Start
				$scope.searchCondition.treceivePlanB.mwarehouse.warehouseCd = $scope.warehouse[0].warehouseCd;
			} else {
				$scope.searchCondition.treceivePlanB.mwarehouse.warehouseCd = null;
				// [#6865][OSS] 汎用ラベル画面遷移時のコンソールエラーを修正 2019.11.19 tanaka End
			}
		}
	};
	//荷主センタ変更対応 201７.02.04 sja End

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
			api.classLabelPrint.print(request).then(function(response) {
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
			}).catch(function(response) {

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