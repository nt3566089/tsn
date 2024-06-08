/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseShippingList
 *
 * @description
 * 出荷ステータス別進捗画面<br>
 *
 */
angular.module('oneslogiWms.ShippingStatusProgress', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingStatusProgress.service:shippingStatusProgressApi
 *
 * @description
 * 出荷ステータス別進捗画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * shippingStatusProgress 出荷ステータス別進捗画面データ操作用WebApi<br>
 * ・resources/shipping/shippingStatusProgress/init 初期処理WebAPI<br>
 * ・resources/shipping/shippingStatusProgress/search 配送コース別出庫指示一覧データ取得WebAPI<br>
 */
.factory('shippingStatusProgressApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingStatusProgress: AngularAPIClient.make([
		                                                   ['init',                'GET' , 'resources/shipping/shippingStatusProgress/init'],//初期処理
		                                                   ['search',              'GET' , 'resources/shipping/shippingStatusProgress/search']//配送コース別出庫指示一覧データ取得
		                                                   ]
		),
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress
 *
 * @description
 * 出荷ステータス別進捗画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingStatusProgress', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'shippingStatusProgressApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress#initScreen
	 * @methodOf oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress
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
		$scope.shippingStatusCountChart;
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
				if (chart.chart.canvas.attributes["id"].value == "shippingStatusCountChart") {
					$scope.chartCount = chart;
				}
				if (chart.chart.canvas.attributes["id"].value == "shippingStatusNumberChart") {
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
	 * @name oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress#initScreenHttp
	 * @methodOf oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress
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
	 * @name oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress
	 *
	 * @description
	 * 出荷ステータス別進捗画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = $route.current.params;
		api.shippingStatusProgress.init().then(function(response){
			$scope.searchCondition = response.data.search;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
			}else{
				if (!request) {
					$scope.searchCondition.mclient.clientCd = request.clientCd;
					$scope.searchCondition.mcenter.centerCd = request.centerCd;
					$scope.searchCondition.workDt = request.workDt;
					$scope.searchCondition.shippingDt = request.shippingDt;
					$scope.searchCondition.mdeliveryCource.deliveryCourceCd = request.deliveryCourceCd;
				}else{
					$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
					$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
					$scope.searchCondition.workDt = userInfo.systemDt;
				}
			}
			// 検索処理
			$scope.search();
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 伝票数側のChartをダブルクリックされた場合
			$("#shippingStatusCountChart").on('dblclick', function(evt){
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
							if (clickLabel == $scope.dataList[i].shippingStatusNm) {
								clickStatus = $scope.dataList[i].shippingStatus;
							}
						}
						if (clickStatus) {
							$location.path("wms/shipping/ShippingInstList").search({})
								.search("mode", SCREEN_MODE.Read)
								.search("clientCd", $scope.searchCondition.mclient.clientCd)
								.search("centerCd", $scope.searchCondition.mcenter.centerCd)
								.search("shippingStatus", clickStatus)
								.search("workDt", $scope.searchCondition.workDt)
								.search("shippingDt", $scope.searchCondition.shippingDt)
								.search("emergencyFlg", 0)
								.search("noAllcDisplayFlg", 0)
								.search("deliveryCourseCd", $scope.searchCondition.deliveryCourseCd);
							$scope.$apply();
						}
					}
				}
			});

			// 出荷数側のChartをダブルクリックされた場合
			$("#shippingStatusNumberChart").on('dblclick', function(evt){
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
							if (clickLabel == $scope.dataList[i].shippingStatusNm) {
								clickStatus = $scope.dataList[i].shippingStatus;
							}
						}
						if (clickStatus) {
							$location.path("wms/shipping/ShippingInstList").search({})
								.search("mode", SCREEN_MODE.Read)
								.search("clientCd", $scope.searchCondition.mclient.clientCd)
								.search("centerCd", $scope.searchCondition.mcenter.centerCd)
								.search("shippingStatus", clickStatus)
								.search("workDt", $scope.searchCondition.workDt)
								.search("shippingDt", $scope.searchCondition.shippingDt)
								.search("emergencyFlg", 0)
								.search("noAllcDisplayFlg", 0)
								.search("deliveryCourseCd", $scope.searchCondition.deliveryCourseCd);
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
	 * @name oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress#search
	 * @methodOf oneslogiWms.ShippingStatusProgress.object:ShippingStatusProgress
	 *
	 * @description
	 * 検索ボタンを押下された時に処理<br>
	 *
	 * 検索条件をもとに、配送コース別出荷進捗を一覧表示。
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

		api.shippingStatusProgress.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			var date_obj = new Date();
			$scope.searchTime = date_obj.toLocaleString();
			$scope.dataList = response.data.list;
			for (var i = 0; i < $scope.dataList.length; i++) {
				$scope.labelsCount.push($scope.dataList[i].shippingStatusNm);
				$scope.dataCount.push($scope.dataList[i].shippingCnt);

				$scope.labelsNumber.push($scope.dataList[i].shippingStatusNm);
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
					switch($scope.dataList[i].shippingStatus){
						case("10"):
							$scope.pieColors.push("#ffffaa");
							break;
						case("15"):
							$scope.pieColors.push("#ffa500");
							break;
						case("25"):
							$scope.pieColors.push("#add8e6");
							break;
						case("30"):
							$scope.pieColors.push("#ffff00");
							break;
						case("35"):
							$scope.pieColors.push("#7fffd4");
							break;
						case("40"):
							$scope.pieColors.push("#ffd700");
							break;
						case("45"):
							$scope.pieColors.push("#ff7f50");
							break;
						case("50"):
							$scope.pieColors.push("#00ffff");
							break;
						case("55"):
							$scope.pieColors.push("#40e0d0");
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
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#showCustomer
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
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
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.DeliveryCourseShippingList.object:DeliveryCourseShippingList
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
			request.centerId = userInfo.centerId;
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	$scope.dtNullCheck = function() {
		// 検索条件が作られていない場合、チェックしない
		if (!$scope.searchCondition) {
			return true;
		}
		// 両方共空の場合、エラー
		if (!$scope.searchCondition.workDt && !$scope.searchCondition.shippingDt) {
			return false;
		}
		return true;
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);
