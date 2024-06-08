/**
 * @ngdoc overview
 * @name oneslogiWms.ModalLargeErrorDialog
 *
 * @description
 * 単行出荷検品エラー<br>
 *
 * 単行出荷検品エラー
 */
angular.module('oneslogiWms.ModalLargeErrorDialog', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ModalLargeErrorDialog.service:ModalLargeErrorDialogApi
 *
 * @description
 * 単行出荷検品エラー画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 単行出荷検品エラー操作用WebApi<br>
 * resources/shipping/ModalLargeErrorDialog/init 画面用初期処理<br>
 * <br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/boxValueList 荷材リスト用データ取得<br>
 * <br>
 */
.factory('modalLargeErrorDialogApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ModalLargeErrorDialog.object:ModalLargeErrorDialog
 *
 * @description
 * 出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ModalLargeErrorDialog', ['$scope','$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'modalLargeErrorDialogApi', 'items',function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeErrorDialog.object:ModalLargeErrorDialog#initScreen
	 * @methodOf oneslogiWms.ModalLargeErrorDialog.object:ModalLargeErrorDialog
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		if (!isNullOrUndefined(items.message)) {
			// メッセージの設定
			$scope.message = items.message;
		}

		owsCommon.syncExec(function() {
			// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.02 matsumoto Start
			if (items.sound) {
				// エラー音再生フラグ「1：再生する」の場合、エラー音を再生
				new Audio($("#errorSound")[0].src).play();
			}
			// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.02 matsumoto End
			// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana Start
			// 「閉じる」ボタンにフォーカス設定
			focusToClose();
		}, 200);
		// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeErrorDialog.object:ModalLargeErrorDialog#modalClose
	 * @methodOf oneslogiWms.ModalLargeErrorDialog.object:ModalLargeErrorDialog
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 *
	 * 画面を閉じる処理
	 */
	$scope.modalClose = function(){
		$modalInstance.close();
		// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana Start
		// 複数表示されている場合は次のダイアログの「閉じる」ボタンにフォーカス設定
		owsCommon.syncExec(function() {
			focusToClose();
		}, 100);
		// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana End
	};

	// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana Start
	// 「閉じる」ボタンにフォーカス設定
	var focusToClose = function() {

		if (typeof errorDialogForm !== 'undefined') { // モーダルがあることを確認
			if (1 < errorDialogForm.length) {
				// 最後のモーダルの閉じるボタンにフォーカス
				errorDialogForm[errorDialogForm.length - 1].close.focus();
			} else {
				errorDialogForm.close.focus();
			}
		}
	}
	// [#6930][OSS] エラーダイアログが複数表示されあたときのフォーカス不正を修正 2019.12.06 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);
