/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum
 *
 * @description
 * 貨物追跡番号登録<br>
 *
 * 貨物追跡番号登録
 */
angular.module('oneslogiWms.ShippingConfirmListCarrierTraceNum', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.service:ShippingConfirmListCarrierTraceNumApi
 *
 * @description
 * 貨物追跡番号登録画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 貨物追跡番号登録操作用WebApi<br>
 * resources/shipping/ShippingConfirmListCarrierTraceNum/init 画面用初期処理<br>
 * <br>
 */
.factory('shippingConfirmListCarrierTraceNumApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingConfirmListCarrierTraceNum: AngularAPIClient.make([
		                                 		                  ['init',   'GET', 'resources/shipping/shippingConfirmListCarrierTraceNum/init']
		]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum
 *
 * @description
 * 出荷確定一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingConfirmListCarrierTraceNum', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'shippingConfirmListCarrierTraceNumApi', 'items',function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, items) {

	var blnInitScreen = true;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum#initScreen
	 * @methodOf oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
		// 追跡番号変更の監視設定（選択内容変更時）
		$scope.traceNoChange = function() {
			$scope.traceNo = this.traceNo;
		};

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum#initScreenHttp
	 * @methodOf oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {
		// 画面初期化データ設定（同期処理）
		return $scope.deferredGetInitData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum
	 *
	 * @description
	 * ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = "";
		if (items) {
			request = items.pickingHId;
		}
		api.shippingConfirmListCarrierTraceNum.init(request).then(function(response){

			//画面の貨物追跡番号を設定
			$scope.traceNo = response;

			// 参照元画面の情報を設定
			if (items) {
				$scope.bolNo = items.bolNo;
				$scope.pickingHId = items.pickingHId;

				blnInitScreen = false;
				$scope.initTab("carrierTrace",true);

				deferred.resolve();
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			//owsCommon.setFirstFocus();
		});
	};

	$scope.initTab = function(tabNm,isFirst) {
		if (blnInitScreen) {
			return ;
		}
		var intInterval = 0;
		if (isFirst == true) {
			intInterval = 500;
		}
		if (tabNm == "carrierTrace"){
			if (items) {
				// 検品数が0を設定する。
				//$scope.traceNo = null;
				$scope.bolNo = items.bolNo;
				$scope.pickingWorkNo = items.pickingWorkNo;
				// current Tab
				$scope.curTab = "carrierTrace";

				owsCommon.syncExec(function() {
					inputformNum.traceNo.focus();
				},intInterval);
			}
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum#update
	 * @methodOf oneslogiWms.ShippingConfirmListCarrierTraceNum.object:ShippingConfirmListCarrierTraceNum
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.update = function(){
        var selectedItem = {};
		selectedItem.pickingHId = $scope.pickingHId;
		selectedItem.traceNo = $scope.traceNo;
		$modalInstance.close(selectedItem);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#modalClose
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */

	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);
