/**
 * @ngdoc overview
 * @name oneslogiWas.ModalError
 *
 * @description
 * エラーメッセージ表示用モーダル<br>
 *
 * エラーメッセージ表示用モーダル。
 */
angular.module('oneslogiWms.ModalError', [])
/**
 * @ngdoc object
 * @name oneslogiWas.ModalError.object:ModalError
 *
 * @description
 * 出庫作業メッセージ登録画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ModalError', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWas.ModalError.object:ModalError#initScreen
	 * @methodOf oneslogiWas.ModalError.object:ModalError
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 参照元画面の情報を設定
		if (items) {
			$scope.errorMessage = items.messageNm;
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWas.ModalError.object:ModalError#modalClose
	 * @methodOf oneslogiWas.ModalError.object:ModalError
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