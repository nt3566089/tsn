/**
 * @ngdoc overview
 * @name oneslogiWms.ImportTypeBCopyColumnInput
 *
 * @description
 * 取込種別ボディコピー列設定画面<br>
 *
 * 取込種別ボディコピー列設定を行う為の画面。
 */
angular.module('oneslogiWms.ImportTypeBCopyColumnInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ImportTypeBCopyColumnInput.service:ImportTypeBCopyColumnInputApi
 *
 * @description
 * 取込種別ボディコピー列設定画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * company 大口事業所フラグデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList<br>
 * <br>
 * ZipMaster 郵便番号マスタデータ操作用WebApi<br>
 * ・resources/common/ImportTypeBCopyColumnInput/initNew 初期処理WebAPI<br>
 * ・resources/common/ImportTypeBCopyColumnInput/search 検索WebAPI<br>
 */
.factory('ImportTypeBCopyColumnInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		importType: AngularAPIClient.make([
			 ['getEcOrderHColumnNmList',    'GET',  'resources/master/importTypeMasterEdit/getEcOrderHColumnNmList'],
			 ['getEcOrderBColumnNmList',    'GET',  'resources/master/importTypeMasterEdit/getEcOrderBColumnNmList']
		])
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput
 *
 * @description
 * 取込種別ボディコピー列設定画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ImportTypeBCopyColumnInput',
		['$scope',
		 '$modalInstance',
		 '$route',
		 '$filter',
		 '$location',
		 '$q',
		 'alertMessage',
		 'directiveControl',
		 'gridDirectiveControl',
		 'optionMessageControl',
		 'gridOptionMessageControl',
		 'owsHistory',
		 'owsCommon',
		 'userInfo',
		 'statusInfo',
		 'modalFactory',
		 'ImportTypeBCopyColumnInputApi',
		 'items',
		 function($scope,
				 $modalInstance,
				 $route,
				 $filter,
				 $location,
				 $q,
				 alertMessage,
				 directiveControl,
				 gridDirectiveControl,
				 optionMessageControl,
				 gridOptionMessageControl,
				 owsHistory,
				 owsCommon,
				 userInfo,
				 statusInfo,
				 modalFactory,
				 api,
				 items){

	// グリッドの列情報（デザイン用）
	$scope.ImportTypeBCopyColumnInputCols = [
	                              {field:"copyColumnNm", displayName:"コピー列名"}
	                              ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput#initScreen
	 * @methodOf oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'copyColumnList',
			columnDefs: 'ImportTypeBCopyColumnInputCols',
		});

		$scope.gridSelectOptions = {
				"copyColumnNm" : {
					key : "columnNm",
					value : "columnNm",
					listModel : "copyColumnNmList",
					viewWithKey : false
				}
			};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput#initScreenHttp
	 * @methodOf oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 */
	$scope.initScreenHttp = function() {

		//各種通信用関数を配列で指定
		$q.all([
				 $scope.getEcOrderHColumnNmList(),
				 $scope.getEcOrderBColumnNmList()
		]).then(function(){

			$scope.isHeader = items.isHeader;
			if($scope.isHeader){
				$scope.copyColumnNmList = $scope.ecOrderHColumnNmList;
			} else {
				$scope.copyColumnNmList = $scope.ecOrderBColumnNmList;
			}

			// 参照元画面の情報を設定
			$scope.header = [];
			$scope.header.ediColumnNm = items.ediColumnNm;
			$scope.copyColumnList = [];
			$scope.stringToColumnList(items.copyColumnNm)
			if($scope.copyColumnList.length == 0){
				$scope.copyColumnList.push({});
			}
		});
	};

	// EC受注ヘッダの列名リストを取得
	$scope.getEcOrderHColumnNmList = function () {
		var deferred = $q.defer();

		var request = {};
		api.importType.getEcOrderHColumnNmList(request).then(function(response){
			$scope.ecOrderHColumnNmList = response;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// EC受注ボディの列名リストを取得
	$scope.getEcOrderBColumnNmList = function () {
		var deferred = $q.defer();

		var request = {};
		api.importType.getEcOrderBColumnNmList(request).then(function(response){
			$scope.ecOrderBColumnNmList = response;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @description 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.copyColumnList.push({});
	};

	/**
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 選択無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 入力済の場合に警告
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if (!gridDirectiveControl.isBlankRowByEntity($scope.gridOptions, $scope.gridOptions.gridApi.selection.getSelectedRows()[row])) {
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
				break;
			}
		}

		// 削除実行
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.copyColumnList.indexOf(row) > -1) {
				$scope.copyColumnList.splice($scope.copyColumnList.indexOf(row), 1);
			}
		});

		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput#selectClose
	 * @methodOf oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 */
	$scope.selectClose = function(){

		// 重複チェック
		var errIndexs = [];
		for (var row = 0 ; row < $scope.copyColumnList.length ; row++) {

			var columnNm = $scope.copyColumnList[row].copyColumnNm;
			for (var checkRow = row+1 ; checkRow < $scope.copyColumnList.length ; checkRow++) {
				var checkColumnNm = $scope.copyColumnList[checkRow].copyColumnNm;
				if(columnNm && checkColumnNm){
					// 比較
					if(columnNm == checkColumnNm) {
						// 重複
						errIndexs.push(checkRow);
					}
				}
			}
		}

		if (0 < errIndexs.length) {
			// エラーあり

			// エラーメッセージCD
			var messageCd = "dataDuplicateError";
			// 重複対象の項目に重複のエラーを表示
			gridOptionMessageControl.show($scope.gridOptions, "copyColumnNm", $filter('owfMessage')(messageCd), errIndexs);
			// 最初のエラー箇所までスクロール
			gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, errIndexs[0]);
			// 最初のエラーにフォーカス
			directiveControl.firstErrorOnFocus('copyinputform');
			return;
		}

		$modalInstance.close($scope.columnListToString());
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput#modalClose
	 * @methodOf oneslogiWms.ImportTypeBCopyColumnInput.object:ImportTypeBCopyColumnInput
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 */
	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};


	/**
	 * @description
	 * 「,」区切りの文字列をグリッドに設定する<br>
	 */
	$scope.stringToColumnList = function(str){
		if(!str){
			return;
		}
		var strList = str.split(",");
		angular.forEach(strList, function(columnStr) {
			columnStr = columnStr.trim();
			if(columnStr){
				$scope.copyColumnList.push({copyColumnNm:columnStr});
			}
		});
	};

	/**
	 * @description
	 * グリッドから「,」区切りの文字列を返却する<br>
	 */
	$scope.columnListToString = function(str){
		var resStr = "";

		for(var row = 0 ; row < $scope.copyColumnList.length ; row++){

			var copyColumnNm = $scope.copyColumnList[row].copyColumnNm;

			if(!copyColumnNm){
				continue;
			}

			if(resStr){
				resStr = resStr + ",";
			}
			resStr = resStr + copyColumnNm;
		}

		return resStr;
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);