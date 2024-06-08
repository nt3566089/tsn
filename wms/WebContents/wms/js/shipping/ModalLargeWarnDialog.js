/**
 * @ngdoc overview
 * @name oneslogiWms.ModalLargeWarnDialog
 *
 * @description
 * 単行出荷検品警告<br>
 *
 * 単行出荷検品警告
 */
angular.module('oneslogiWms.ModalLargeWarnDialog', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ModalLargeWarnDialog.service:ModalLargeWarnDialogApi
 *
 * @description
 * 単行出荷検品警告画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 単行出荷検品警告操作用WebApi<br>
 * resources/shipping/ModalLargeWarnDialog/init 画面用初期処理<br>
 * <br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/boxValueList 荷材リスト用データ取得<br>
 * <br>
 */
.factory('modalLargeWarnDialogApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ModalLargeWarnDialog.object:ModalLargeWarnDialog
 *
 * @description
 * 出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ModalLargeWarnDialog', ['$scope','$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'modalLargeWarnDialogApi', 'items',function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, items) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ModalLargeWarnDialog.object:ModalLargeWarnDialog#initScreen
	 * @methodOf oneslogiWms.ModalLargeWarnDialog.object:ModalLargeWarnDialog
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
				// 警告音再生フラグが「1：再生する」の場合、警告音を再生
				new Audio($("#warnSound")[0].src).play();
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
	 * @name oneslogiWms.ModalLargeWarnDialog.object:ModalLargeWarnDialog#modalClose
	 * @methodOf oneslogiWms.ModalLargeWarnDialog.object:ModalLargeWarnDialog
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
