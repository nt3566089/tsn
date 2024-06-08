angular.module('oneslogiWms.LocationMasterEdit', [])
.factory('locationMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query',            'GET',  'resources/common/centerClass/keyValueList'],
			['block',			 'GET'	,'resources/common/blockCd/keyValueList'],
			['line',			 'GET'	,'resources/common/lineCd/keyValueList'],
		]),
		productRecord: AngularAPIClient.make([
			['record',            'GET',  'resources/common/product/record'],
		]),
		centerRecord: AngularAPIClient.make([
			['record',            'GET',  'resources/common/center/record'],
		]),
		locationMasterEdit: AngularAPIClient.make([
			['initNew',            'GET',  'resources/master/locationMasterEdit/initNew'],
			['initUpdate',         'GET',  'resources/master/locationMasterEdit/initUpdate'],
			['inputCheck',         'POST', 'resources/master/locationMasterEdit/inputCheck'],
			['register',           'POST', 'resources/master/locationMasterEdit/register'],
		]),

	};
}])

.controller('LocationMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/***
	 * 画面初期化処理
	 */
	$scope.initScreen = function() {

		// 画面コントロールの初期化
		$scope.initializeControls()
			.then(function(){
				// 画面初期値設定
				$scope.initializeValue();
			});

	}

	/***
	 * コントロール初期化処理
	 */
	$scope.initializeControls = function(){
		var deferred = $q.defer();

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタ、荷主ドロップリストの設定
		$scope.centerCdList = userInfo.centerList;
		$scope.clientCdList = userInfo.clientList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetLocGroup(),
			$scope.deferredGetDelFlg(),
			$scope.deferredGetAllocNgFlg(),
//			$scope.deferredGetLinblk(),
			$scope.deferredGetLocid(),
			$scope.deferredGetTosplmd(),
			$scope.deferredGetPresplmd(),
			$scope.deferredGetSplrevUn(),
			$scope.deferredGetCenter(),
		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 画面モデル取得処理
	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
			// 修正
			var request = {};
			request.locationId = $route.current.params.locationId;

			api.locationMasterEdit.initUpdate(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				//結果設定
				$scope.head = response.data.head;

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新モード
					// キー項目の編集可否設定
					directiveControl.editable($scope, 'clientCd', false);
					directiveControl.editable($scope, 'locationCd', false);


				} else {
					// コピーモード
					// キー項目の編集可否設定
					directiveControl.editable($scope, 'clientCd', true);
					directiveControl.editable($scope, 'locationCd', true);
					directiveControl.editable($scope, 'delFlg', false);

					//商品未設定の場合
					if (!$scope.head.clientCd){
						//初期値にログイン荷主を設定
						$scope.head.clientCd = userInfo.clientCd;
					}

				}

				deferred.resolve();
			});

		} else {
			// 新規
			api.locationMasterEdit.initNew().then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					deferred.reject();
					return;
				}

				//結果設定
				$scope.head = response.data.head;

				// キー項目の編集可否設定
				directiveControl.editable($scope, 'clientCd', true);
				directiveControl.editable($scope, 'locationCd', true);
				directiveControl.editable($scope, 'delFlg', false);




				deferred.resolve();
			});
		}
		return deferred.promise;
	};


	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){

		// 初期値設定
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			// コピーモード
			$scope.head.clientCd = userInfo.clientCd;
			$scope.head.locationId = null;
			$scope.head.delFlg = "0";

		}else if($scope.screenMode == SCREEN_MODE.Create){
			// 新規モード
			$scope.head.centerCd = userInfo.centerCd;
			$scope.head.clientCd = userInfo.clientCd;
			$scope.head.delFlg = "0";
			$scope.head.allocNgFlg = "0";


		}else if($scope.screenMode == SCREEN_MODE.Update){
			// 修正モード
			$scope.head.clientCd = userInfo.clientCd;
		}


		// 活性非活性の処理をコール
		$scope.locGroupChange();

		// ロケーションコードに応じたラインブロックを取得
		$scope.locationCdBlur();


		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

	/***
	 * 荷主
	 */
	$scope.clientCdChange = function() {
		$scope.deferredGetClientCd($scope.head.clientCd)
			.then(function(){
				return $scope.deferredGetClientCd($scope.head.clientCd, null);
			});
	};

	/***
	 * ロケーショングループ
	 */
	$scope.deferredGetLocGroup = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOC_GROUP";

		api.dropdownList.query(request).then(function(response){
			$scope.locGroupList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * ロケーショングループが０６の場合の活性非活性処理
	 */

	$scope.locGroupChange = function(){

		if($scope.head.locGroup === "06"){

			//ロケーショングループ06の時非活性
			directiveControl.editable($scope, 'allocNgFlg', false);
			directiveControl.editable($scope, 'zone', false);
			directiveControl.editable($scope, 'pickingOrder', false);
			directiveControl.editable($scope, 'palletecapacity', false);
			directiveControl.editable($scope, 'maxStoreNum', false);

//			optionMessageControl.hide($scope,'allocNgFlg');
			optionMessageControl.hide($scope,'zone');
//			optionMessageControl.show($scope, 'pickingOrder', owsCommon.convertMessage('requiredError'));
//			optionMessageControl.hide($scope,'pickingOrder');
			optionMessageControl.hide($scope,'palletecapacity');
//			optionMessageControl.hide($scope,'maxStoreNum');

			//ロケーショングループ06の時活性
			directiveControl.editable($scope, 'linblk', true);
			directiveControl.editable($scope, 'locid', true);
			directiveControl.editable($scope, 'productCd', true);
			directiveControl.editable($scope, 'tosplmd', true);
			directiveControl.editable($scope, 'presplmd', true);
			directiveControl.editable($scope, 'splrevun', true);
			directiveControl.editable($scope, 'splrevctqa', true);
			directiveControl.editable($scope, 'replenishPNum', true);
			directiveControl.editable($scope, 'bssplpt', true);

			//ロケーショングループ06の時必須

//			optionMessageControl.hide($scope,'linblk');
//			optionMessageControl.hide($scope,'locid');
//			optionMessageControl.hide($scope,'productCd');

			// 条件付き必須チェックを実施
			//hogeCheck();

//			optionMessageControl.hide($scope, 'pickingOrder');
//			optionMessageControl.hide($scope, 'palletecapacity');
//			optionMessageControl.hide($scope, 'maxStoreNum');


		} else {
			//ロケーショングループ06以外の時活性
			directiveControl.editable($scope, 'allocNgFlg', true);
			directiveControl.editable($scope, 'zone', true);
//			directiveControl.editable($scope, 'pickingOrder', true);
			directiveControl.editable($scope, 'palletecapacity', true);
//			directiveControl.editable($scope, 'maxStoreNum', true);

			//ロケーショングループ06以外の時非活性
			directiveControl.editable($scope, 'linblk', false);
			directiveControl.editable($scope, 'locid', false);
			directiveControl.editable($scope, 'productCd', false);
			directiveControl.editable($scope, 'tosplmd', false);
			directiveControl.editable($scope, 'presplmd', false);
			directiveControl.editable($scope, 'splrevun', false);
			directiveControl.editable($scope, 'splrevctqa', false);
			directiveControl.editable($scope, 'replenishPNum', false);
			directiveControl.editable($scope, 'bssplpt', false);

			//ロケーショングループ06以外の時任意
			optionMessageControl.hide($scope,'linblk');
			optionMessageControl.hide($scope,'locid');
			optionMessageControl.hide($scope,'productCd');

			//ロケーショングループ06以外の時必須
//			optionMessageControl.hide($scope,'pickingOrder');
//			optionMessageControl.hide($scope,'palletecapacity');
//			optionMessageControl.hide($scope,'maxStoreNum');


		}

	};
	/***
	 * 削除
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 引当可否
	 */
	$scope.deferredGetAllocNgFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLC_NG_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.allocNgFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * 対応ブロック
	 */
	$scope.deferredGetBlk = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = userInfo.centerCd;

		api.dropdownList.block(request).then(function(response){
			$scope.blkList = response.data;


			//linblkList の配列生成
			$scope.linblkList = [];
			for (var i = 0; i < $scope.blkList.length; i++) {
				var linblkObj = {};
				linblkObj.linblk = $scope.blkList[i].blkcd;
				$scope.linblkList.push(linblkObj);
			}

			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * ラインブ
	 */
	$scope.deferredGetLin = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = userInfo.centerCd;

		api.dropdownList.line(request).then(function(response){
			$scope.linList = response.data;

			//linblkList の配列生成
			$scope.linblkList = [];
			for (var i = 0; i < $scope.linList.length; i++) {
				var linblkObj = {};
				linblkObj.linblk = $scope.linList[i].lin;
				$scope.linblkList.push(linblkObj);
			}

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * ロケーション区分
	 */
	$scope.deferredGetLocid = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOCKBN";

		api.dropdownList.query(request).then(function(response){
			$scope.locidList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * ロケーション区分０の場合、銘柄CD活性
	 */
	$scope.locidChange = function(){

		if($scope.head.locid === "0"){
			directiveControl.editable($scope, 'productCd', true);

			optionMessageControl.hide($scope,'productCd');

//			$scope.searchCondition.allocNgFlg = null;
//			$scope.searchCondition.zone = null;

		} else {

			directiveControl.editable($scope, 'productCd', false);
			optionMessageControl.hide($scope,'productCd');
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#showProduct
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 銘柄CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){

//		var isError = $scope.searchInputForm.$invalid;
//		// エラーがある場合、フォーカスを当てる
//		if (isError) {
//			directiveControl.firstErrorOnFocus('searchInputForm');
//			return;
//		}
		var items = {
				clientCd: $scope.head.clientCd,
				productCd: $scope.head.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.productCd =  selectedItem.productCd;
			$scope.head.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductReceiveList.object:ProductReceiveList#productCdBlur
	 * @methodOf oneslogiWms.ProductReceiveList.object:ProductReceiveList
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		// [Ver3.0][#4328] 不要なエラーチェックを削除 2018.04.13 shimizu

		// 入力された商品コードを取得
		var productCd = $scope.head.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
			request.productCd = productCd;

			api.productRecord.record(request).then(function(response){
				$scope.head.productNm = response.data.head.productNm;
			});

		} else {
			$scope.head.productNm = null;
		}

	};


	// ★
	$scope.locationCdBlur = function() {


		// 入力された商品コードを取得
		var locationCd = $scope.head.locationCd;

		if (!locationCd || $scope.head.locGroup != "06") {
			$scope.linblkList = null;
			return;
		}

		owsCommon.syncExec(function() {
			if (locationCd.startsWith("L")){
				$scope.deferredGetLin();

			}else if (locationCd.startsWith("B")){
				$scope.deferredGetBlk();

			}else{
				$scope.linblkList = null;
			}
		});

	};


	/***
	 * 当日補充方式
	 */
	$scope.deferredGetTosplmd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESTOCKKBN";

		api.dropdownList.query(request).then(function(response){
			$scope.tosplmdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 事前補充方式
	 */
	$scope.deferredGetPresplmd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RESTOCKKBN";

		api.dropdownList.query(request).then(function(response){
			$scope.presplmdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 補充切り上げ単位
	 */
	$scope.deferredGetSplrevUn = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISHMENT_ROUNDEDUP_UNIT";

		api.dropdownList.query(request).then(function(response){
			$scope.splrevUnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 拠点マスタから情報取得
	 */
	$scope.deferredGetCenter = function() {
		var deferred = $q.defer();
		var centerCd = $route.current.params.centerCd;

		var request = {};
		request.centerCd = centerCd;

		api.centerRecord.record(request).then(function(response){
			$scope.mCenter = response.data.mCenter;
			deferred.resolve();
			//倉庫(2)の場合のみ活性（山出し順、許容個数）
			if ($scope.mCenter.warehouseflg === "2"){
				directiveControl.editable($scope, 'pickingOrder', true);
				directiveControl.editable($scope, 'maxStoreNum', true);
				directiveControl.editable($scope, 'zone', false);
				directiveControl.editable($scope, 'palletecapacity', false);
			//	保税(0,1)の場合のみ活性（ゾーン、許容パレット枚数）
			}else if($scope.mCenter.warehouseflg === "0" || $scope.mCenter.warehouseflg === "1"){
				directiveControl.editable($scope, 'zone', true);
				directiveControl.editable($scope, 'palletecapacity', true);


				directiveControl.editable($scope, 'pickingOrder', false);
				directiveControl.editable($scope, 'maxStoreNum', false);
			}
		});

		return deferred.promise;

	};


//	$scope.centerChange = function(){
//		if ($scope.mCenter.warehouseFlg === "2"){
//			directiveControl.editable($scope, 'pickingOrder', true);
//			directiveControl.editable($scope, 'maxStoreNum', true);
//
//		}else if($scope.mCenter.warehouseFlg === "0" || $scope.mCenter.warehouseFlg === "1"){
//			directiveControl.editable($scope, 'zone', true);
//			directiveControl.editable($scope, 'palletecapacity', true);
//		}
//	}


	/***
	 * 登録
	 */
	$scope.registerClick = function() {
		// 登録時初期化処理
		$scope.initRegister();

		// クライアント側入力チェック
		$scope.clientInputCheck();

		var hasError = false;

		if($scope.head.locGroup == "06"){

			if (directiveControl.isEditable($scope,'linblk')){
				if(!$scope.head.linblk){
					optionMessageControl.show($scope, 'linblk', owsCommon.convertMessage('requiredError'));
					hasError = true;
				}
			}
			if (directiveControl.isEditable($scope,'locid')){
				if(!$scope.head.locid){
					optionMessageControl.show($scope, 'locid', owsCommon.convertMessage('requiredError'));
					hasError = true;
				}
			}
		}else{
			if (directiveControl.isEditable($scope,'pickingOrder')){
				if(!$scope.head.pickingOrder){
					optionMessageControl.show($scope, 'pickingOrder', owsCommon.convertMessage('requiredError'));
					hasError = true;
				}
			}
//			if (!$scope.pickingOrder){
//				optionMessageControl.show($scope, 'pickingOrder', owsCommon.convertMessage('requiredError'));
//				//				error = true;
//			}
			if (directiveControl.isEditable($scope,'palletecapacity')){
				if(!$scope.head.palletecapacity){
					optionMessageControl.show($scope, 'palletecapacity', owsCommon.convertMessage('requiredError'));
					hasError = true;
				}
			}
			if (directiveControl.isEditable($scope,'maxStoreNum')){
				if(!$scope.head.maxStoreNum){
					optionMessageControl.show($scope, 'maxStoreNum', owsCommon.convertMessage('requiredError'));
					hasError = true;
				}
			}
		}

		if ( hasError ) {
			return;
		}


		// チェック処理
		if ($scope.head.locGroup == "06" && $scope.head.locationCd.length >= 6){
			alertMessage.setErrorMessageByCode("sortingLocationCdLengthsixError");
			return ;
		}
//		// チェック処理
//		if ($scope.head.zone().startsWith (number) = false){
//			alertMessage.setErrorMessageByCode("sortingLocationCdLengthsixError");
//			return ;
//		}


		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;


		api.locationMasterEdit.inputCheck(request).then(function(response){


			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				return;
			}

			// 登録処理
			api.locationMasterEdit.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					return;
				}
				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				} else if ($scope.screenMode == SCREEN_MODE.Create) {
					// 初期化
					$scope.initScreen();
				}
			});
		});
	};

	$scope.initRegister = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
	};

	$scope.clientInputCheck = function() {
		// 必要に応じて、クライアント側チェック処理を記載
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
