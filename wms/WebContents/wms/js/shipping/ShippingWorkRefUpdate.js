/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingWorkRefUpdate
 *
 * @description
 * 出庫作業メッセージ登録画面<br>
 *
 * 出庫作業メッセージ登録画面。
 */
angular.module('oneslogiWms.ShippingWorkRefUpdate', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingWorkRefUpdate.service:shippingWorkRefUpdateApi
 *
 * @description
 * 出庫作業メッセージ登録画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */

.factory('shippingWorkRefUpdateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingWorkRefUpdate: AngularAPIClient.make(
				[
				 ['init', 'GET',  'resources/shipping/shippingWorkRefUpdate/init']
				 ])
	}
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
 *
 * @description
 * 出庫作業メッセージ登録画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingWorkRefUpdate', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'shippingWorkRefUpdateApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate#initScreen
	 * @methodOf oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate#initScreenHttp
	 * @methodOf oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		//各種通信用関数を配列で指定
		$q.all()
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
	 *
	 * @description 出庫作業メッセージ登録初期値の設定<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		api.shippingWorkRefUpdate.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				// [#462] スクリプトエラー発生(問題のコード削除) 2017.03.14 kawana
				return;
			}

			$scope.head = response.data.head;

			// 参照元画面の情報を設定
			if (items) {
				$scope.head.pickingWorkMessage = items.messageNm;
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate#register
	 * @methodOf oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
	 * @description
	 * 登録ボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */
	$scope.register = function(){
		// 処理結果確認
		if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
			return;
		}
		$modalInstance.close($scope.head.pickingWorkMessage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate#modalClose
	 * @methodOf oneslogiWms.ShippingWorkRefUpdate.object:ShippingWorkRefUpdate
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */

	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);