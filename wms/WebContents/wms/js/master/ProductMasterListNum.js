/**
 * @ngdoc overview
 * @name oneslogiWms.ProductMasterListNum
 *
 * @description
 * 商品マスタメンテナンス(出力枚数指定)<br>
 *
 * 商品マスタメンテナンス(出力枚数指定)
 */
angular.module('oneslogiWms.ProductMasterListNum', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductMasterListNum.service:ProductMasterListNumApi
 *
 * @description
 * 商品マスタメンテナンス(出力枚数指定)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 商品マスタメンテナンス(出力枚数指定)操作用WebApi<br>
 * resources/master/ProductMasterListNum/init 画面用初期処理<br>
 * <br>
 */
.factory('productMasterListNumApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		productMasterListNum: AngularAPIClient.make([
		                                        ['init',   'GET', 'resources/master/productMasterListNum/init']
		                                        ]
		),
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductMasterListNum.object:ProductMasterListNum
 *
 * @description
 * 商品マスタメンテナンス(一覧)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ProductMasterListNum'   , ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterListNumApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterListNum.object:ProductMasterListNum#initScreen
	 * @methodOf oneslogiWms.ProductMasterListNum.object:ProductMasterListNum
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterListNum.object:ProductMasterListNum#initScreenHttp
	 * @methodOf oneslogiWms.ProductMasterListNum.object:ProductMasterListNum
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all([
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterListNum.object:ProductMasterListNum#deferredGetInitData
	 * @methodOf oneslogiWms.ProductMasterListNum.object:ProductMasterListNum
	 *
	 * @description
	 * ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.productMasterListNum.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			// 参照元画面の情報を設定
			if (items) {
				$scope.labelOutputCnt = items.labelOutputCnt;
				deferred.resolve();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus('inputform');
			
		});
		
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterListNum.object:ProductMasterListNum#Print
	 * @methodOf oneslogiWms.ProductMasterListNum.object:ProductMasterListNum
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.print = function(){
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		var screenScope = angular.element($("div[owd-screen = 'ProductMasterListNum']")).scope();

		if (screenScope.inputform.$invalid) {
			return;
		};
		
		var selectedItem = {};
		selectedItem.labelOutputCnt = screenScope.labelOutputCnt;
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
