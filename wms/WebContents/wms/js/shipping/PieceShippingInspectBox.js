/**
 * @ngdoc overview
 * @name oneslogiWms.PieceShippingInspectBox
 *
 * @description
 * 出荷検品(箱登録)<br>
 *
 * 出荷検品(箱登録)
 */
angular.module('oneslogiWms.PieceShippingInspectBox', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PieceShippingInspectBox.service:PieceShippingInspectBoxApi
 *
 * @description
 * 出荷検品(箱登録)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 出荷検品(箱登録)操作用WebApi<br>
 * resources/shipping/PieceShippingInspectBox/init 画面用初期処理<br>
 * <br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/boxValueList 荷材リスト用データ取得<br>
 * <br>
 */
.factory('pieceShippingInspectBoxApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		pieceShippingInspectBox: AngularAPIClient.make([
		                                        ['init',   'GET', 'resources/shipping/pieceShippingInspectBox/init']
		                                        ]
		),
		boxCd: AngularAPIClient.make([
	                                      ['query', 'GET', 'resources/common/box/keyValueList']
	                                      ]
				)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
 *
 * @description
 * 出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PieceShippingInspectBox', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'pieceShippingInspectBoxApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox#initScreen
	 * @methodOf oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();

		// 荷材CD変更の監視設定（選択内容変更時）
		$scope.boxChange = function() {
			$scope.boxCd = this.boxCd;
		};

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox#initScreenHttp
	 * @methodOf oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all([
				 $scope.deferredGetBoxList()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox#deferredGetBoxList
	 * @methodOf oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
	 *
	 * @description
	 * 箱取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBoxList = function() {

		var deferred = $q.defer();
		var request = {};
		// [検査-074] 全センタの荷材が表示されないため、検品途中items.centerIdが空なので、itemsを代りに、userInfoを使用する 2014.12.04 許 Start
		request.centerId = userInfo.centerId;
		// [検査-074] 全センタの荷材が表示されないため、検品途中items.centerIdが空なので、itemsを代りに、userInfoを使用する 2014.12.04 許 End

		api.boxCd.query(request).then(function(response){
			$scope.boxList = response.data;
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
			// $scope.boxCd = null;
			// 参照元画面の情報を設定
			if (items) {
				$scope.boxCd = items.boxCd;
			}
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox#deferredGetInitData
	 * @methodOf oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
	 *
	 * @description
	 * ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.pieceShippingInspectBox.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputformBox')) {
				deferred.reject();
				return;
			}

			// 参照元画面の情報を設定
			if (items) {
				$scope.shippingPackingNo = items.shippingPackingNo;
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
				$scope.cesIntegationFlg = items.cesIntegationFlg;
				$scope.shippingPackingNo = items.shippingPackingNo;
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

				// [#6787][OSS] 非表示処理を修正 2019.11.15 tsuboi Start
				$scope.singleRowFlg = items.singleRowFlg;
				// [#5115][v3.1] 単行出荷検品 作成 2018.08.15 kawana Start
//				if (items.singleRowFlg) {
//					// 個口番号 未設定 => 非表示
//					directiveControl.show(angular.element($("div[owd-screen = 'PieceShippingInspectBox']")).scope(), 'shippingPackingNo', false);
//				}
				// [#5115][v3.1] 単行出荷検品 作成 2018.08.15 kawana End
				// [#6787][OSS] 非表示処理を修正 2019.11.15 tsuboi End
				deferred.resolve();
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus('inputformBox');
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox#update
	 * @methodOf oneslogiWms.PieceShippingInspectBox.object:PieceShippingInspectBox
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.update = function(){
		var selectedItem = {};

		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		var screenScope = angular.element($("div[owd-screen = 'PieceShippingInspectBox']")).scope();
		var weight = screenScope.permitWeight;
		if ($scope.cesIntegationFlg == '1'){
			if(weight == null || weight == ''){
			    optionMessageControl.show($scope, 'permitWeight', owsCommon.convertMessage('requiredError'));
			    return;
			 }

			if( weight <= 0){
			    optionMessageControl.show($scope, 'permitWeight', owsCommon.convertMessage('minError'),"0");
			    return;
			 }
		}

		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

		selectedItem.boxCd = $scope.boxCd;
		selectedItem.shippingPackingNo = $scope.shippingPackingNo;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		selectedItem.weight = weight;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
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
