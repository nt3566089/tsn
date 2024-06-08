/**
 * @ngdoc overview
 * @name oneslogiWms.PieceShippingInspectSu
 *
 * @description
 * 出荷検品(数量入力)<br>
 *
 * 出荷検品(数量入力)
 */
angular.module('oneslogiWms.PieceShippingInspectSu', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PieceShippingInspectSu.service:PieceShippingInspectSuApi
 *
 * @description
 * 出荷検品(数量入力)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 出荷検品(数量入力)操作用WebApi<br>
 * resources/shipping/PieceShippingInspectSu/init 画面用初期処理<br>
 * <br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/boxValueList 荷材リスト用データ取得<br>
 * <br>
 */
.factory('pieceShippingInspectSuApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		pieceShippingInspectSu: AngularAPIClient.make([
		                  ['init',   'GET', 'resources/shipping/pieceShippingInspectSu/init']
		                  ]
		),

		boxCd: AngularAPIClient.make([
	                       ['query', 'GET', 'resources/common/box/keyValueList']
	                       ]
		),
		// [Ver3.0] unit of measure対応 2017.11.20 ライ START
		product: AngularAPIClient.make([
						 ['record', 'GET', 'resources/common/product/record'],
						 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
						 ]
		)
		// [Ver3.0] unit of measure対応 2017.11.20 ライ END

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
 *
 * @description
 * 出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PieceShippingInspectSu', ['$scope','$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'pieceShippingInspectSuApi', 'items',function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, items) {

	var blnInitScreen = true;
	$scope.pieceShippingInspectSu = {};
	$scope.pieceShippingInspectSu.boxCdC = null;

	$scope.checkInvalid = function() {
		if ($scope.curTab == undefined || $scope.curTab == null) {
			return;
		}
		if (angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope() == undefined || angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope() == null) {
			return;
		}
		if ($scope.curTab == 'piece') {
			if (angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.pieceform == undefined || angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.pieceform == null) {
				return;
			}

			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			return angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.pieceform.$invalid;
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
		}else{
			if (angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.caseform == undefined || angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.caseform == null) {
				return;
			}

			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			return angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().inputformSu.caseform.$invalid;
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu#initScreen
	 * @methodOf oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
		// [Ver3.0] unit of measure対応 2017.11.20 ライ START
		// 画面表示用の複数荷姿リストmodel共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 複数荷姿用itemCdを定義
				id: "instNumPMultiText",
				// 総数用itemCdを定義
				"instNumP" : {
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "head.mproduct.mproductShapeList"
				}
		};



		// [Ver3.0] unit of measure対応 2017.11.20 ライ END

		// 画面の検品数>指示数の場合エラーメッセージをエラー管理クラスに登録
		$scope.pieceNumPCheck = function(value) {
			// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod Start
			if (!isNullOrUndefined(value) && value != "" && isFinite(value) && !isNullOrUndefined($scope.pieceShippingInspectSu.instSuP)
					&& $scope.pieceShippingInspectSu.instSuP != "" && !isNullOrUndefined(items.spgQtyOnsP) && items.spgQtyOnsP != ""){
				if (owsCommon.isGreaterThan(value, owsCommon.subtract($scope.pieceShippingInspectSu.instSuP, items.spgQtyOnsP))){
					return false;
				};
			}
			// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod End
			return true;
		};
		$scope.instNumPMessage = $filter('owfMessage')("inspectQtyCannotInputMoreThanShipOderQtyError");

		// 画面の検品数>指示数の場合エラーメッセージをエラー管理クラスに登録
		$scope.caseNumCCheck = function(value) {
			// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod Start
			if (!isNullOrUndefined(value) && value != "" && isFinite(value) && !isNullOrUndefined($scope.pieceShippingInspectSu.unitNumC)
					&& $scope.pieceShippingInspectSu.unitNumC != "" && !isNullOrUndefined(items.spgQtyOnsC) && items.spgQtyOnsC != ""){
				if(owsCommon.isGreaterThan(owsCommon.multiply(value, $scope.pieceShippingInspectSu.unitNumC), owsCommon.subtract($scope.pieceShippingInspectSu.instSuC, items.spgQtyOnsC)) ){
					return false;
				};
			}
			return true;
			// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod End
		};
		$scope.caseNumCMessage = $filter('owfMessage')("inspectQtyCannotInputMoreThanShipOderQtyError");

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu#initScreenHttp
	 * @methodOf oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetBoxList()
				 ]
		)
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu#deferredGetBoxList
	 * @methodOf oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
	 *
	 * @description
	 * 箱取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBoxList = function() {

		var deferred = $q.defer();
		var request = {};
		request.centerId = items.centerId;

		api.boxCd.query(request).then(function(response){
			$scope.boxList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu#deferredGetInitData
	 * @methodOf oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
	 *
	 * @description
	 * ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.pieceShippingInspectSu.init().then(function(response){

			// 処理結果確認
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputformSu')) {
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;


			// 参照元画面の情報を設定
			if (items) {
				// JANCDが引き継ぎ情報.JANCDを設定する。
				$scope.pieceShippingInspectSu.janCd = items.janCd;
				// 商品CDが引き継ぎ情報.商品CDを設定する。
				$scope.pieceShippingInspectSu.productCd = items.productCd;
				// 商品名称が引き継ぎ情報.商品名称を設定する。
				$scope.pieceShippingInspectSu.productNm = items.productNm;
				// 検品数が0を設定する。
				$scope.pieceShippingInspectSu.instNumP = null;
				// 検品済数が引き継ぎ情報.検品済数を設定する。
				$scope.pieceShippingInspectSu.spgQtyOnsP = items.spgQtyOnsP;
				// 指示数が引き継ぎ情報.指示数を設定する。
				$scope.pieceShippingInspectSu.instSuP = items.instSuP;
				// [Ver3.0] unit of measure対応 2017.11.20 ライ START
				$scope.pieceShippingInspectSu.unitNumBreakdownP = items.unitNumBreakdownP;
      			$scope.head.mproduct = items.mproduct;
				$scope.head.mproduct.mproductShapeList = items.mproduct.mproductShapeList;
				$scope.wkProductShapeList = items.mproduct.mproductShapeList;
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'instNumP', 'instNumPMultiText', items.mproduct.productId);
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.pieceShippingInspectSu.instNumP, "multiTextOptions", "instNumP");
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				// [横並-073] フォーカス設定処理を修正 2014.12.03 ko-yamamoto Start
				//owsCommon.setFirstFocus("inputform");
				// [横並-073] フォーカス設定処理を修正 2014.12.03 ko-yamamoto End

				// ケース数がnullを設定する。
				blnInitScreen = false;
				$scope.initTab("piece",true);

				deferred.resolve();
			}
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
		if (tabNm == "piece"){
			if (items) {
				// 検品数が0を設定する。
				$scope.pieceShippingInspectSu.instNumP = null;
				// 検品済数が引き継ぎ情報.検品済数を設定する。
				$scope.pieceShippingInspectSu.spgQtyOnsP = items.spgQtyOnsP;
				// 指示数が引き継ぎ情報.指示数を設定する。
				$scope.pieceShippingInspectSu.instSuP = items.instSuP;
				// ケース入数が引き継ぎ情報.ケース入数を設定する。
				$scope.pieceShippingInspectSu.unitNumP = items.unitNumP;
				// [Ver3.0] unit of measure対応 2017.11.20 ライ START
				$scope.pieceShippingInspectSu.unitNumBreakdownP = items.unitNumBreakdownP;
				// [Ver3.0] unit of measure対応 2017.11.20 ライ END
				// ケース数がnullを設定する。
				$scope.pieceShippingInspectSu.caseNumC =  "";
				//angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().pieceShippingInspectSu.boxCdC = angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().boxList[0].boxCd;
				//$scope.pieceShippingInspectSu.boxCdC = angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().boxList[0].boxCd;

				// current Tab
				$scope.curTab = "piece";

				// [横並-071] フォーカス設定処理を修正 2014.12.03 ko-yamamoto Start
				owsCommon.syncExec(function() {
					// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
					inputformSu.instNumP.focus();
					// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
				},intInterval);
				// [横並-071] フォーカス設定処理を修正 2014.12.03 ko-yamamoto End
			}
		}else{
			if (items) {

				if (owsCommon.isPositive(items.spgQtyOnsC) ){
					directiveControl.editable(angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope(), 'caseNumC',false);
					directiveControl.editable(angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope(), 'boxCdC',false);
					return;
				}else{

					// 検品数が0を設定する。
					$scope.pieceShippingInspectSu.instNumP = "";

					// 検品数がnullを設定する。
					$scope.pieceShippingInspectSu.instNumC =  0;
					// 検品済数が引き継ぎ情報.検品済数を設定する。
					$scope.pieceShippingInspectSu.spgQtyOnsC = items.spgQtyOnsP;
					// 指示数が引き継ぎ情報.指示数を設定する。
					$scope.pieceShippingInspectSu.instSuC = items.instSuP;
					// ケース入数が引き継ぎ情報.ケース入数を設定する。
					$scope.pieceShippingInspectSu.unitNumC = items.unitNumC;
					// [Ver3.0] unit of measure対応 2017.11.20 ライ START
					$scope.pieceShippingInspectSu.unitNumBreakdownC = items.unitNumBreakdownC;
					// [Ver3.0] unit of measure対応 2017.11.20 ライ END
					// ケース数がnullを設定する。
					$scope.pieceShippingInspectSu.caseNumC =  null;
					// 合計口数
					$scope.pieceShippingInspectSu.shippingPackingNo = items.shippingPackingNo;
					// 荷材CDがNULLを設定する。
					//angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope().pieceShippingInspectSu.boxCdC = null;
					$scope.pieceShippingInspectSu.boxCdC = null;

					// current Tab
					$scope.curTab = "case";

					// [横並-071] フォーカス設定処理を修正 2014.12.03 ko-yamamoto Start
					owsCommon.syncExec(function() {
						// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
						inputformSu.caseNumC.focus();
						// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
					},intInterval);
					// [横並-071] フォーカス設定処理を修正 2014.12.03 ko-yamamoto End
				}
			}
		}
	};

	// ピース検品数ロストフォーカス時、検品済数を計算する
	$scope.pieceNumPBlur = function() {

		var instNumC = $scope.pieceShippingInspectSu.instNumP;

		// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod Start
		if (!isNullOrUndefined(instNumC) && instNumC != "" && isFinite(instNumC)) {
		// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod End
			// 検品数と検品済数の計算
			// 検品済数 = 検品済数 + 検品数)
			$scope.pieceShippingInspectSu.spgQtyOnsP = owsCommon.add($scope.pieceShippingInspectSu.instNumP,items.spgQtyOnsP);
		}else{
			$scope.pieceShippingInspectSu.spgQtyOnsP = items.spgQtyOnsP;
		}
	};

	// ケース検品数ロストフォーカス時、検品数と検品済数を計算する
	$scope.caseNumCBlur = function() {
		// 検品数と検品済数の計算
		// ケース入数
		var caseNumC = $scope.pieceShippingInspectSu.caseNumC;
		// 検品数
		var instNumC = $scope.pieceShippingInspectSu.instNumC;

		// 検品済数
		var spgQtyOnsC;
		if($scope.pieceShippingInspectSu.spgQtyOnsC){
			spgQtyOnsC = items.spgQtyOnsC;
		}else{
			spgQtyOnsC = 0;
		}
		// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod Start
		if (!isNullOrUndefined(caseNumC) && caseNumC != "" && isFinite(caseNumC)) {
		// [#3635] 出荷検品 - 数量入力計算異常(小数点有商品) 2018.02.05 honma Mod End
			// 検品済数 = 検品済数 + (ケース入数 * ケース数-検品数)
			$scope.pieceShippingInspectSu.spgQtyOnsC = owsCommon.add(items.spgQtyOnsC, owsCommon.multiply($scope.pieceShippingInspectSu.unitNumC, caseNumC));
			// 検品数 = ケース入数 * ケース数
			$scope.pieceShippingInspectSu.instNumC = owsCommon.multiply($scope.pieceShippingInspectSu.unitNumC, caseNumC);
		}else{
			$scope.pieceShippingInspectSu.instNumC = 0;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu#update
	 * @methodOf oneslogiWms.PieceShippingInspectSu.object:PieceShippingInspectSu
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.update = function(){

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		//gridOptionMessageControl.hideAll($scope.gridOptions);

		var screenScope = angular.element($("div[owd-screen = 'PieceShippingInspectSu']")).scope();

		if ($scope.curTab == "piece"){

			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			if (screenScope.inputformSu.pieceform.instNumPform.$invalid) {
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
				return;
			}

			// [ON推-品向-858] 不正な処理を削除 2015.07.07 kawana

			if(owsCommon.isGreaterThan(screenScope.pieceShippingInspectSu.instNumP, owsCommon.subtract(screenScope.pieceShippingInspectSu.instSuP, items.spgQtyOnsP)) ){
				optionMessageControl.show(screenScope, 'instNumP', owsCommon.convertMessage('inspectQtyCannotInputMoreThanShipOderQtyError'));
				return;
			};

			var selectedItem = {
				// 検品数
				instNumP  : screenScope.pieceShippingInspectSu.instNumP,
				// 検品済数
				spgQtyOnsP: screenScope.pieceShippingInspectSu.spgQtyOnsP,

				curTab    : "piece"
			};
		}else{

			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			if (screenScope.inputformSu.caseform.caseNumCform.$invalid) {
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
				return;
			}

			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana Start
			if (screenScope.inputformSu.caseform.boxCdCform.$invalid) {
			// [ON推-品向-853] フォーカスが当たらない問題を修正(form名が呼出し元と同じため変更) 2015.07.06 kawana End
				return;
			}

			// [ON推-品向-858] 不正な処理を削除 2015.07.07 kawana

			if(owsCommon.isGreaterThan(owsCommon.multiply(screenScope.pieceShippingInspectSu.caseNumC, screenScope.pieceShippingInspectSu.unitNumC), owsCommon.subtract(screenScope.pieceShippingInspectSu.instSuC, items.spgQtyOnsC) )){
				optionMessageControl.show(screenScope, 'caseNumC', owsCommon.convertMessage('inspectQtyCannotInputMoreThanShipOderQtyError'));
				return;
			};

			var selectedItem = {
				// 荷材CD
				boxCd             :  screenScope.pieceShippingInspectSu.boxCdC,
				// 個口番号
				shippingPackingNo : owsCommon.add(parseInt(screenScope.pieceShippingInspectSu.shippingPackingNo), parseInt(screenScope.pieceShippingInspectSu.caseNumC)),
				// 検品数
				instNumC          : screenScope.pieceShippingInspectSu.instNumC,
				// 検品済数
				spgQtyOnsC        : screenScope.pieceShippingInspectSu.spgQtyOnsC,

				curTab            : "case"
			};
		};
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
