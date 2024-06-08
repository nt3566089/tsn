/**
 * @ngdoc overview
 * @name oneslogiWms.ModalLargeWorkInstNum
 *
 * @description
 * 作業指示数選択画面<br>
 */
angular.module('oneslogiWms.ModalLargeWorkInstNum', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ModalLargeWorkInstNum.service:ModalLargeWorkInstNumApi
 *
 * @description
 * 作業指示数選択画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */
.factory('modalLargeWorkInstNumApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum
 *
 * @description
 * 作業指示数選択用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ModalLargeWorkInstNum', ['$scope','$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'modalLargeWorkInstNumApi', 'items',function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum#initScreen
	 * @methodOf oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		$scope.instNumList = items.instNumList;
		owsCommon.setFirstFocus('workInstNumForm');
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum#select
	 * @methodOf oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum
	 *
	 * @description
	 * 数字ボタン押下処理<br>
	 *
	 * 画面を閉じる処理
	 */
	$scope.select = function(selectNum) {

		$modalInstance.close(selectNum);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum#modalClose
	 * @methodOf oneslogiWms.ModalLargeWorkInstNum.object:ModalLargeWorkInstNum
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 *
	 * 画面を閉じる処理
	 */
	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);
