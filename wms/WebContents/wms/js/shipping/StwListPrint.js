/**
 * @ngdoc overview
 * @name oneslogiWms.StwListPrint
 *
 * @description
 * 積込リスト発行画面
 */
angular.module('oneslogiWms.StwListPrint',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StwListPrint.service:stwListPrintApi
 *
 * @description
 * 	積込リスト発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList 区分値データ操作用WebApi<br>
 * ・resources/shipping/stwListPrint/init 積込リスト発行操作用WebApi<br>
 * ・resources/shipping/stwListPrint/print 初期化用WebApi<br>
 * ・resources/receive/storeLabelPrint/print 検索用WebApi<br>
 * ・resources/common/deliveryCourse/record ＷＭＳ共通マスタデータ操作用WebApi
 */
.factory('stwListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		stwListPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/shipping/stwListPrint/init'],
				 ['print', 'GET', 'resources/shipping/stwListPrint/print']
				 ]
		),
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record',  'GET', 'resources/common/deliveryCourse/record']
				 ]
		)
	};
}])
.controller('StwListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'stwListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// 画面初期化処理
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

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
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			var request = {};
			request.clientCd = $route.current.params.clientCd;
			request.centerCd = $route.current.params.centerCd;
			request.shippingDt = $route.current.params.shippingDt;
			request.deliveryCourseCd = $route.current.params.deliveryCourseCd;

			api.stwListPrint.init().then(function(response){
				$scope.printParam = response.printBasicData;
				$scope.searchCondition = response.data.search;
				//荷主センタ変更対応 2017.03.06 sja Start
				//$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
				//$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				//荷主センタ変更対応 2017.03.06 sja Start
				//[品質検査対応][Ver3.1][#5619]遷移時の発行状況のデフォルト値を「0：未発行」に変更 2018,11.12 matsumoto Start
				$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printConditionList);
				//[品質検査対応][Ver3.1][#5619]遷移時の発行状況のデフォルト値を「0：未発行」に変更 2018,11.12 matsumoto End

				$scope.searchCondition.tallocInstH.shippingDt = request.shippingDt;
				$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd = request.deliveryCourseCd;
				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchform');
				// [検査-172] 配送コードが設定されている時、名称を取得するように修正 koseki Start
				if (request.deliveryCourseCd) {
					$scope.deliveryCourseBlur();
				}
				// [検査-172] 配送コードが設定されている時、名称を取得するように修正 koseki End

				deferred.resolve();
			});

		}else{
			api.stwListPrint.init().then(function(response){
				$scope.printParam = response.printBasicData;
				$scope.searchCondition = response.data.search;
				$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
				$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
				$scope.searchCondition.tallocInstH.shippingDt  = userInfo.systemDt;
				$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printConditionList);
				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}
		return deferred.promise;
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
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StwListPrint.object:StwListPrint#showDeliveryCourse
	 * @methodOf oneslogiWms.StwListPrint.object:StwListPrint
	 *
	 * @description
	 *配送コース検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){

		// 配送コースのモーダル画面を表示
		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd
		};

		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StwListPrint.object:StwListPrint#deliveryCourseBlur
	 * @methodOf oneslogiWms.StwListPrint.object:ReceiveInput
	 *
	 * @description
	 * 配送コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseBlur = function() {

		// 入力された仕入先コードを取得
		var deliveryCourseCd = $scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseCd;

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {

			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;
			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	// 発行条件プルダウンデータ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.printConditionList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
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
			api.stwListPrint.print(request).then(function(response){
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