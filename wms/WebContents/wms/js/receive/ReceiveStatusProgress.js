/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveStatusProgress
 *
 * @description
 * 入荷ステータス別進捗画面<br>
 *
 */
angular.module('oneslogiWms.ReceiveStatusProgress', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveStatusProgress.service:receiveStatusProgressApi
 *
 * @description
 * 入荷ステータス別進捗画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatusProgress 入荷ステータス別進捗画面データ操作用WebApi<br>
 * ・resources/receive/receiveStatusProgress/init 初期処理WebAPI<br>
 * ・resources/receive/receiveStatusProgress/search 予定仕入先CD別入荷予定データ取得WebAPI<br>
 */
.factory('receiveStatusProgressApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		receiveStatusProgress: AngularAPIClient.make([
		                                                   ['init',                'GET' , 'resources/receive/receiveStatusProgress/init'],//初期処理
		                                                   ['search',              'GET' , 'resources/receive/receiveStatusProgress/search']//予定仕入先CD別入荷予定データ取得
		                                                   ]
		),
		planSupplier: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
 *
 * @description
 * 入荷ステータス別進捗画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ReceiveStatusProgress', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receiveStatusProgressApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#initScreen
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件を非表示状態に変更
		$scope.isopen = false;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グラフ用変数の初期化
		$scope.receiveStatusCountChart;
		$scope.labelsCount = [];
		$scope.dataCount = [];
		$scope.labelsNumber = [];
		$scope.dataNumber = [];
		// [#7199][OSS] グラフ背景色の初期値を空に変更 2020.02.25 tsuboi Start
		$scope.pieColors = [];
		// [#7199][OSS] グラフ背景色の初期値を空に変更 2020.02.25 tsuboi End
		$scope.pieOptions = {
//				//ツールチップの常時表示設定
//				onAnimationComplete: function(){
//					this.showTooltip(this.segments, true);
//				},
//				tooltipEvents: [],
//				showTooltips: true

				// [SLSA] Chart.js Version 2.0.0からLegendはオプションなので 2016.10.17  Dario Add Start
				legend: {
					display: true,
					position: 'bottom'
				}
				// [SLSA] Chart.js Version 2.0.0からLegendはオプションなので 2016.10.17  Dario Add End
			};

		// [SLSA] angular-chart.js Version 1.0.0: 'create' → 'chart-create' 2016.10.17  Dario update
		//$scope.$on('create', function (event, chart) {
		$scope.$on('chart-create', function (event, chart) {

			// ダブルクリックイベントでChartオブジェクトが取得出来ないので、Create時に保存しておく
			if (chart) {
				if (chart.chart.canvas.attributes["id"].value == "receiveStatusCountChart") {
					$scope.chartCount = chart;
				}
				if (chart.chart.canvas.attributes["id"].value == "receiveStatusNumberChart") {
					$scope.chartNumber = chart;
				}
			}
		});

		$scope.requiredError = $filter('owfMessage')("requiredError");

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#initScreenHttp
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
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
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#deferredGetInitData
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
	 *
	 * @description
	 * 入荷ステータス別進捗画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = $route.current.params;
		api.receiveStatusProgress.init().then(function(response){
			$scope.searchCondition = response.data.search;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
			}else{
				if (!request) {
					$scope.searchCondition.mclient.clientCd = request.clientCd;
					$scope.searchCondition.mcenter.centerCd = request.centerCd;
					$scope.searchCondition.receivePlanDtFrom = request.receivePlanDtFrom;
					$scope.searchCondition.receivePlanDtTo = request.receivePlanDtTo;
					$scope.searchCondition.planSupplierCd = request.planSupplierCd;
				}else{
					$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
					$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
					$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;
					$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;
				}
			}

			// 検索処理
			$scope.search();

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 行数側のChartをダブルクリックされた場合
			$("#receiveStatusCountChart").on('dblclick', function(evt){
				// [SLSA] Chart.js Version 2.0.0: 'getSegmentsAtEvent()' → 'getElementsAtEvent()' 2016.10.17  Dario update
				//var activePoints = $scope.chartCount.getSegmentsAtEvent(evt);
				var activePoints = $scope.chartCount.getElementsAtEvent(evt);
				// [#6927][OSS] チャート以外の場所をダブルクリックするとコンソールエラー発生 2019.12.04 kawana Start
				if (activePoints && 0 < activePoints.length) {
					// [#6927][OSS] チャート以外の場所をダブルクリックするとコンソールエラー発生 2019.12.04 kawana End
					// [SLSA] Chart.js Version 2.0.0: 'activePoints[0].label' → 'activePoints[0]._model.label;' 2016.10.17  Dario update
					//var clickLabel = activePoints[0].label;
					var clickLabel = activePoints[0]._model.label;
					var clickStatus ;
					if (clickLabel) {
						for (var i = 0; i < $scope.dataList.length; i++) {
							if (clickLabel == $scope.dataList[i].receiveStatusNm) {
								clickStatus = $scope.dataList[i].receiveStatus;
							}
						}
						if (clickStatus) {
							$location.path("wms/receive/SlipNoReceiveList").search({})
								.search("mode", SCREEN_MODE.Read)
								.search("clientCd", $scope.searchCondition.mclient.clientCd)
								.search("centerCd", $scope.searchCondition.mcenter.centerCd)
								.search("receiveStatus", clickStatus)
								.search("receivePlanDtFrom", $scope.searchCondition.receivePlanDtFrom)
								.search("receivePlanDtTo", $scope.searchCondition.receivePlanDtTo)
								.search("planSupplierCd", $scope.searchCondition.planSupplierCd)
								.search("planSupplierNm", $scope.planSupplier.planSupplierNm);
							$scope.$apply();
						}
					}
				}
			});

			// 入荷数側のChartをダブルクリックされた場合
			$("#receiveStatusNumberChart").on('dblclick', function(evt){
				// [SLSA] Chart.js Version 2.0.0: 'getSegmentsAtEvent()' → 'getElementsAtEvent()' 2016.10.17  Dario update
				var activePoints = $scope.chartNumber.getElementsAtEvent(evt);
				// [#6927][OSS] チャート以外の場所をダブルクリックするとコンソールエラー発生 2019.12.04 kawana Start
				if (activePoints && 0 < activePoints.length) {
					// [#6927][OSS] チャート以外の場所をダブルクリックするとコンソールエラー発生 2019.12.04 kawana End
					// [SLSA] Chart.js Version 2.0.0: 'activePoints[0].label' → 'activePoints[0]._model.label;' 2016.10.17  Dario update
					var clickLabel = activePoints[0]._model.label;
					var clickStatus ;
					if (clickLabel) {
						for (var i = 0; i < $scope.dataList.length; i++) {
							if (clickLabel == $scope.dataList[i].receiveStatusNm) {
								clickStatus = $scope.dataList[i].receiveStatus;
							}
						}
						if (clickStatus) {
							$location.path("wms/receive/SlipNoReceiveList").search({})
								.search("mode", SCREEN_MODE.Read)
								.search("clientCd", $scope.searchCondition.mclient.clientCd)
								.search("centerCd", $scope.searchCondition.mcenter.centerCd)
								.search("receiveStatus", clickStatus)
								.search("receivePlanDtFrom", $scope.searchCondition.receivePlanDtFrom)
								.search("receivePlanDtTo", $scope.searchCondition.receivePlanDtTo)
								.search("planSupplierCd", $scope.searchCondition.planSupplierCd)
								.search("planSupplierNm", $scope.planSupplier.planSupplierNm);
							$scope.$apply();
						}
					}
				}
			});

			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#search
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
	 *
	 * @description
	 * 検索ボタンを押下された時に処理<br>
	 *
	 * 検索条件をもとに、予定仕入先別出荷進捗を一覧表示。
	 */
	$scope.search = function(){
    	alertMessage.deleteAll();
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		$scope.labelsCount = [];
		$scope.dataCount = [];
		$scope.labelsNumber = [];
		$scope.dataNumber = [];

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);

		api.receiveStatusProgress.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			var date_obj = new Date();
			$scope.searchTime = date_obj.toLocaleString();
			$scope.dataList = response.data.list;
			for (var i = 0; i < $scope.dataList.length; i++) {
				$scope.labelsCount.push($scope.dataList[i].receiveStatusNm);
				$scope.dataCount.push($scope.dataList[i].receiveCnt);

				$scope.labelsNumber.push($scope.dataList[i].receiveStatusNm);
				$scope.dataNumber.push($scope.dataList[i].num);
			}

			// [1.1.4-CT-008] データが空の場合に更新されない問題を修正 2016.05.13 kawana Start
			// データが空の場合はグラフを削除
			if ($scope.dataList.length == 0) {

				// angular-chart.js(0.8.8)内でデータが空の場合は更新しないようになっているため、
				// destroyを直接呼び出す

				if ($scope.chartCount != null) {
					$scope.chartCount.destroy();
				}

				if ($scope.chartNumber != null) {
					$scope.chartNumber.destroy();
				}

				$legend = $('body').find('chart-legend');
				$legend.remove();
			// [#7199][OSS] グラフの背景色をステータス毎に固定 2020.02.25 tsuboi Start
			} else {
				$scope.pieColors = [];
				for(var i = 0; i < $scope.dataList.length; i++){
					switch($scope.dataList[i].receiveStatus){
						case("01"):
							$scope.pieColors.push("#ffffaa");
							break;
						case("02"):
							$scope.pieColors.push("#ffffe0");
							break;
						case("03"):
							$scope.pieColors.push("#00ffff");
							break;
						case("99"):
							$scope.pieColors.push("#ffc0cb");
							break;
					}
				}
			}
			// [#7199][OSS] グラフの背景色をステータス毎に固定 2020.02.25 tsuboi End
			// [1.1.4-CT-008] データが空の場合に更新されない問題を修正 2016.05.13 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#showCustomer
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
	 *
	 * @description
	 * 予定仕入先CD検索ボタンを押下された時に処理<br>
	 *
	 * 予定仕入先マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.planSupplier = function(){
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				vendorCd: $scope.searchCondition.planSupplierCd
		};

		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			//予定仕入先CD
			$scope.searchCondition.planSupplierCd = selectedItem.customerCd;
			$scope.planSupplier.planSupplierNm = selectedItem.customerNm;
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress#planSupplierCdBlur
	 * @methodOf oneslogiWms.ReceiveStatusProgress.object:ReceiveStatusProgress
	 *
	 * @description
	 * 予定仕入先CDをロストフォーカス時の処理<br>
	 *
	 * 予定仕入先マスタから予定仕入先情報を取得し、設定する。
	 */
	$scope.planSupplierCdBlur = function() {

		// 入力された仕入先コードを取得
		var customerCd = $scope.searchCondition.planSupplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			$scope.planSupplier.planSupplierNm = null;

			// 仕入先情報の取得
			api.planSupplier.record(request).then(function(response){
				$scope.planSupplier.planSupplierNm = response.data.mCustomer.customerNm;

			});

		} else {
			$scope.planSupplier.planSupplierNm = null;
		}
	};

	$scope.dtNullCheck = function() {
		// 検索条件が作られていない場合、チェックしない
		if (!$scope.searchCondition) {
			return true;
		}
		// 両方共空の場合、エラー
		if (!$scope.searchCondition.receivePlanDtFrom && !$scope.searchCondition.receivePlanDtTo) {
			return false;
		}
		return true;
	};

	//[#4077][Ver3.0]入荷予定日のFromToチェックを追加 2018.04.02 miyabe Upd Start
	$scope.toDtErrorCheck = function() {
		// 検索条件が作られていない場合、チェックしない
		if (!$scope.searchCondition) {
			return true;
		}
		// 両方共空の場合、エラー
		if (!$scope.searchCondition.receivePlanDtFrom && !$scope.searchCondition.receivePlanDtTo) {
			$scope.toError = $filter('owfMessage')("requiredError");
			return false;
		//日付逆転の場合、エラー
		} else if($scope.searchCondition.receivePlanDtFrom && $scope.searchCondition.receivePlanDtTo
				&& $scope.searchCondition.receivePlanDtFrom > $scope.searchCondition.receivePlanDtTo){
			$scope.toError = $filter('owfMessage')(FROM_TO_MESSAGE_CD);
			return false;
		}
		return true;
	};

	//[#4077][Ver3.0]入荷予定日のFromToチェックを追加 2018.04.02 miyabe Upd End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
