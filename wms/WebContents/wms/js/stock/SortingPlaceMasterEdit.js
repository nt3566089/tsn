//サービスの定義
angular.module('oneslogiWms.SortingPlaceMasterEdit', [])
.factory('sortingPlaceMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		sortingPlaceMasterEdit: AngularAPIClient.make([
//			['initLineNew',            'GET',  'resources/stock/sortingPlaceMasterEdit/initLineNew'],
//			['initBlockNew',            'GET',  'resources/stock/sortingPlaceMasterEdit/initBlockNew'],
//			['initLineUpdate',         'GET',  'resources/stock/sortingPlaceMasterEdit/initLineUpdate'],
//			['initBlockUpdate',         'GET',  'resources/stock/sortingPlaceMasterEdit/initBlockUpdate'],
			['initNew',		'GET',	'resources/stock/sortingPlaceMasterEdit/initNew'],
			['initUpdate',	'GET',	'resources/stock/sortingPlaceMasterEdit/initUpdate'],
			['inputCheck',	'POST',	'resources/stock/sortingPlaceMasterEdit/inputCheck'],
			['register',	'POST',	'resources/stock/sortingPlaceMasterEdit/register'],
			['update',		'POST',	'resources/stock/sortingPlaceMasterEdit/update'],
		]),
		dropdownList: AngularAPIClient.make([
			['query'	,'GET'	,'resources/common/centerClass/keyValueList'],
			['cbrctg'	,'GET'	,'resources/common/cbrctg/keyValueList'],
			['block'	,'GET'	,'resources/common/blockCd/keyValueList'],
		]),
	};
}])

//コントローラーの定義をしてる場所
.controller('SortingPlaceMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'sortingPlaceMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

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
		$scope.lineBlockCommon = $route.current.params.lineBlockCommon;

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタ、荷主ドロップリストの設定
		$scope.centerCdList = userInfo.centerList;
		$scope.clientCdList = userInfo.clientList;


		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetDelFlg(),
			$scope.deferredGetlocidfrnk(),
			$scope.deferredGetlocidfbrctg(),
			$scope.deferredGetlinBlk(),
			$scope.deferredGethdrdboxrsfid(),
			$scope.deferredGetsprprsidblk(),
			$scope.deferredGetsprprsid(),


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
		if ($scope.screenMode == SCREEN_MODE.Update) {
			// 修正
			var request = {};
			request.lineBlockCommon = $scope.lineBlockCommon;
			request.centerCd = $route.current.params.centerCd;
			request.linCd = $route.current.params.linCd;
			request.blkCd = $route.current.params.blkCd;

			api.sortingPlaceMasterEdit.initUpdate(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				//結果設定
				$scope.srw = response.data.srw;
				$scope.lin = response.data.lin;
				$scope.blk = response.data.blk;

				if ($scope.lineBlockCommon == 5) {
				// 共通編集モード
				// キー項目の編集可否設定
					var selectItem = document.getElementById("lineArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}
					var inputItem = document.getElementById("lineArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
					var selectItem = document.getElementById("blockArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}
					var inputItem = document.getElementById("blockArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
//					optionMessageControl.show($scope,'locidfrnk');
//					if (directiveControl.isEditable($scope,'locidfrnk')){
//						optionMessageControl.show($scope, 'locidfrnk', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}

				}else if ($scope.lineBlockCommon == 3 ){
					// ライン編集モード
					var selectItem = document.getElementById("commonArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var selectItem = document.getElementById("blockArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var inputItem = document.getElementById("blockArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
					directiveControl.editable($scope, 'lincd', false);
//					optionMessageControl.show($scope,'linnm');
//					optionMessageControl.show($scope,'pkgrt');
//					optionMessageControl.show($scope,'sprprsid');
//
//					if (directiveControl.isEditable($scope,'linnm')){
//						optionMessageControl.show($scope, 'linnm', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}
//					if (directiveControl.isEditable($scope,'pkgrt')){
//						optionMessageControl.show($scope, 'pkgrt', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}
//					if (directiveControl.isEditable($scope,'sprprsid')){
//						optionMessageControl.show($scope, 'sprprsid', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}

				}else if ($scope.lineBlockCommon == 4 ){
					// ブロック編集モード
					var selectItem = document.getElementById("commonArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var selectItem = document.getElementById("lineArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var inputItem = document.getElementById("lineArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
					directiveControl.editable($scope, 'blkcd', false);
//					optionMessageControl.show($scope,'blknm');
//					optionMessageControl.show($scope,'pkgrtblk');
//					optionMessageControl.show($scope,'sprprsidblk');
//
//					if (directiveControl.isEditable($scope,'blknm')){
//						optionMessageControl.show($scope, 'blknm', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}
//					if (directiveControl.isEditable($scope,'pkgrtblk')){
//						optionMessageControl.show($scope, 'pkgrtblk', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}
//					if (directiveControl.isEditable($scope,'sprprsidblk')){
//						optionMessageControl.show($scope, 'sprprsidblk', owsCommon.convertMessage('requiredError'));
//						error = true;
//					}


				}

				deferred.resolve();
			});

		} else {
			var request = {};
			request.centerCd = $route.current.params.centerCd;

			// 新規
			api.sortingPlaceMasterEdit.initNew(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					deferred.reject();
					return;
				}

				//結果設定
				$scope.srw = response.data.srw;
				$scope.lin = response.data.lin;
				$scope.blk = response.data.blk;

				if ($scope.lineBlockCommon == 1) {
					// ライン新規モード
					var selectItem = document.getElementById("commonArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var selectItem = document.getElementById("blockArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var inputItem = document.getElementById("blockArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
					directiveControl.editable($scope, 'delFlg', false);
					optionMessageControl.show($scope,'lincd');
					optionMessageControl.show($scope,'linnm');
					optionMessageControl.show($scope,'pkgrt');
					optionMessageControl.show($scope,'sprprsid');

					if (directiveControl.isEditable($scope,'lincd')){
						optionMessageControl.show($scope, 'lincd', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'linnm')){
						optionMessageControl.show($scope, 'linnm', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'pkgrt')){
						optionMessageControl.show($scope, 'pkgrt', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'sprprsid')){
						optionMessageControl.show($scope, 'sprprsid', owsCommon.convertMessage('requiredError'));
						error = true;
					}

				}else if ($scope.lineBlockCommon == 2 ){
				// ブロック新規モード
					var selectItem = document.getElementById("commonArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var selectItem = document.getElementById("lineArea").getElementsByTagName("select");

					for(var i=0; i<selectItem.length; i++){
						selectItem[i].disabled = true;
					}

					var inputItem = document.getElementById("lineArea").getElementsByTagName("input");

					for(var i=0; i<inputItem.length; i++){
						inputItem[i].disabled = true;
					}
					directiveControl.editable($scope, 'delFlg', false);
					optionMessageControl.show($scope,'blkcd');
					optionMessageControl.show($scope,'blknm');
					optionMessageControl.show($scope,'pkgrtblk');
					optionMessageControl.show($scope,'sprprsidblk');

					if (directiveControl.isEditable($scope,'blkcd')){
						optionMessageControl.show($scope, 'blkcd', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'blknm')){
						optionMessageControl.show($scope, 'blknm', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'pkgrtblk')){
						optionMessageControl.show($scope, 'pkgrtblk', owsCommon.convertMessage('requiredError'));
						error = true;
					}
					if (directiveControl.isEditable($scope,'sprprsidblk')){
						optionMessageControl.show($scope, 'sprprsidblk', owsCommon.convertMessage('requiredError'));
						error = true;
					}

				}


				deferred.resolve();
			});
		}

		//アコーディオンのタイトルを個別設定
		//TODO:angularjs の　documentを利用する必要がある？
		var titleCommon = document.querySelector("#titleCommon").querySelector("a")
		titleCommon.innerText = document.querySelector("#lbltitleCommon label").innerText;

		var titleLine = document.querySelector("#titleLine").querySelector("a")
		titleLine.innerText = document.querySelector("#lblSortingPlaceMasterEditLin label").innerText;

		var titleBlock = document.querySelector("#titleBlock").querySelector("a")
		titleBlock.innerText = document.querySelector("#lblSortingPlaceMasterEditBlk label").innerText;


		return deferred.promise;
	};


//
//	$scope.deferredGetForm = function () {
//		var deferred = $q.defer();
//
//		// 画面モード判定
//		//新規
//		if ($scope.screenMode == SCREEN_MODE.Update ) {
//			//共通
//			api.sortingPlaceMasterEdit.query(request).then(function(response){
//
//				// 処理結果確認
//				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
//					// 前画面に戻る
//					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
//					deferred.reject();
//					return;
//				}
//			});
//
//			// ライン追加
//			if( $scope.lineBlockCommon == 1 ){
//
//				var request = {};
//	//			request.tanaId = $route.current.params.tanaId;
//
//				api.sortingPlaceMasterEdit.query(request).then(function(response){
//					// 処理結果確認
//					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
//						// 前画面に戻る
//						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
//						deferred.reject();
//						return;
//					}
//
//					//結果設定
//					$scope.head = response.data.head;
//
//					if ($scope.screenMode == SCREEN_MODE.Update) {
//						// 更新モード
//						// キー項目の編集可否設定
//						directiveControl.editable($scope, 'centerCd', false);
//						directiveControl.editable($scope, 'tanaCd', false);
//					} else {
//						// コピーモード
//						// キー項目の編集可否設定
//						directiveControl.editable($scope, 'centerCd', true);
//						directiveControl.editable($scope, 'tanaCd', true);
//						directiveControl.editable($scope, 'delFlg', false);
//					}
//
//					//ピック棚フラグ判定 ⇒ パネル3の状態設定
//					if($scope.head.pickingTanaFlg != '0'){
//						//ピック棚以外の時
//						directiveControl.editable($scope, 'clientCd', true);
//						directiveControl.editable($scope, 'productCd', true);
//
//					}else{
//						directiveControl.editable($scope, 'clientCd', false);
//						directiveControl.editable($scope, 'productCd', false);
//					}
//
//					deferred.resolve();
//				});
//
//			} else {
//				// ブロック追加
//				api.sortingPlaceMasterEdit.query.then(function(response){
//					// 処理結果確認
//					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
//						deferred.reject();
//						return;
//					}
//
//					//結果設定
//					$scope.head = response.data.head;
//
//					// キー項目の編集可否設定
//					directiveControl.editable($scope, 'centerCd', true);
//					directiveControl.editable($scope, 'tanaCd', true);
//					directiveControl.editable($scope, 'delFlg', false);
//
//
//					deferred.resolve();
//				});
//			}
//			return deferred.promise;
//		}
//	};


	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){

		// 初期値設定


		if($scope.screenMode == SCREEN_MODE.Create){
			// 新規モード
			$scope.srw.clientCd = userInfo.clientCd;
			//ドロップダウンの初期値を設定
			$scope.srw.locidfrnk = "0";
			$scope.blk.locidfrnk = "0";
			$scope.lin.delFlg = "0";
			$scope.blk.delFlg = "0";

		}else if ($scope.screenMode == SCREEN_MODE.Update) {
			// 編集モード
			$scope.srw.centerCd = $route.current.params.centerCd;
			$scope.srw.clientCd = $route.current.params.clientCd;
		}

		directiveControl.editable($scope, 'centerCd', false);



		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

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
	 * ロケ不定間口貼付順
	 */
	$scope.deferredGetlocidfrnk = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LINE_ORDER_KBN";

		api.dropdownList.query(request).then(function(response){
			$scope.locidfrnkList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * ロケ不定銘柄カテゴリ貼付順
	 */
	$scope.deferredGetlocidfbrctg = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = userInfo.centerCd;
		request.clientCd = userInfo.clientCd;

		api.dropdownList.cbrctg(request).then(function(response){
			$scope.locidfbrctgList1 = response.data;
			$scope.locidfbrctgList2 = response.data;
			$scope.locidfbrctgList3 = response.data;
			$scope.locidfbrctgList4 = response.data;
			$scope.locidfbrctgList5 = response.data;
			$scope.locidfbrctgList6 = response.data;
			$scope.locidfbrctgList7 = response.data;
			$scope.locidfbrctgList8 = response.data;
			$scope.locidfbrctgList9 = response.data;
			$scope.locidfbrctgList10 = response.data;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 対応ブロック
	 */
	$scope.deferredGetlinBlk = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = userInfo.centerCd;
		request.clientCd = userInfo.clientCd;

		api.dropdownList.block(request).then(function(response){
			$scope.blockcdList1 = response.data;
			$scope.blockcdList2 = response.data;
			$scope.blockcdList3 = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 100BOX
	 */
	$scope.deferredGethdrdboxrsfid = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NOT_COVERED_CLASS";

		api.dropdownList.query(request).then(function(response){
			$scope.hdrdboxrsfidList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 個口圧縮（ライン）
	 */
	$scope.deferredGetsprprsid = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CONSOLIDATIONFLG";

		api.dropdownList.query(request).then(function(response){
			$scope.sprprsidList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 個口圧縮（ブロック）
	 *
	 */
	$scope.deferredGetsprprsidblk = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COVERED_CLASS";

		api.dropdownList.query(request).then(function(response){
			$scope.sprprsidblkList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * 登録
	 */
	$scope.registerClick = function() {
		// 登録時初期化処理
		$scope.initRegister();

		var error = false;

		if ($scope.lineBlockCommon == 5) {
			// 共通編集モード
			if (directiveControl.isEditable($scope,'locidfrnk')){
				if (!$scope.srw.locidfrnk) {
					optionMessageControl.show($scope, 'locidfrnk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}

		}else if ($scope.lineBlockCommon == 3 ){
			// ライン編集モード

			if (directiveControl.isEditable($scope,'linnm')){
				if (!$scope.lin.linnm ) {
					optionMessageControl.show($scope, 'linnm', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'pkgrt')){
				if (!$scope.lin.pkgrt ) {
					optionMessageControl.show($scope, 'pkgrt', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'sprprsid')){
				if (!$scope.lin.sprprsid ) {
					optionMessageControl.show($scope, 'sprprsid', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'delFlg')){
				if (!$scope.lin.delFlg) {
					optionMessageControl.show($scope, 'delFlg', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
		}else if ($scope.lineBlockCommon == 4 ){
			// ブロック編集モード
			if (directiveControl.isEditable($scope,'blknm')){
				if (!$scope.blk.blknm) {
					optionMessageControl.show($scope, 'blknm', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'pkgrtblk')){
				if (!$scope.blk.pkgrt) {
					optionMessageControl.show($scope, 'pkgrtblk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'sprprsidblk')){
				if (!$scope.blk.sprprsid) {
					optionMessageControl.show($scope, 'sprprsidblk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'delFlgblk')){
				if (!$scope.blk.delFlg) {
					optionMessageControl.show($scope, 'delFlgblk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
		}else if ($scope.lineBlockCommon == 1) {
			// ライン新規モード
			if (directiveControl.isEditable($scope,'lincd')){
				if (!$scope.lin.lincd) {
					optionMessageControl.show($scope, 'lincd', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'linnm')){
				if (!$scope.lin.linnm ) {
					optionMessageControl.show($scope, 'linnm', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'pkgrt')){
				if (!$scope.lin.pkgrt) {
					optionMessageControl.show($scope, 'pkgrt', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'sprprsid')){
				if (!$scope.lin.sprprsid) {
					optionMessageControl.show($scope, 'sprprsid', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
		}else if ($scope.lineBlockCommon == 2 ){
			// ブロック新規モード
			if (directiveControl.isEditable($scope,'blkcd')){
				if (!$scope.blk.blkcd) {
					optionMessageControl.show($scope, 'blkcd', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'blknm')){
				if (!$scope.blk.blknm) {
					optionMessageControl.show($scope, 'blknm', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'pkgrtblk')){
				if (!$scope.blk.pkgrt) {
					optionMessageControl.show($scope, 'pkgrtblk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}
			if (directiveControl.isEditable($scope,'sprprsidblk')){
				if (!$scope.blk.sprprsid) {
					optionMessageControl.show($scope, 'sprprsidblk', owsCommon.convertMessage('requiredError'));
					error = true;
				}
			}

		}
		if ( error ) {
			return;
		}

		// クライアント側入力チェック
		if ($scope.clientInputCheck() === false){
			return;
		};

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.srw = $scope.srw;
		request.data.lin = $scope.lin;
		request.data.blk = $scope.blk;
		request.data.lineBlockCommon = $scope.lineBlockCommon;


		request.data.head = $scope.head;

		// チェック処理
		api.sortingPlaceMasterEdit.inputCheck(request).then(function(response){
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				return;
			}


			if($scope.lineBlockCommon === '1' || $scope.lineBlockCommon === '2'){
				// 登録処理
				api.sortingPlaceMasterEdit.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				});
			}else{
				// 更新処理
				api.sortingPlaceMasterEdit.update(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				});
			}
		});
	};

	$scope.initRegister = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
	};

	$scope.clientInputCheck = function() {
		// 必要に応じて、クライアント側チェック処理を記載
		if ($scope.lineBlockCommon == '1'){
			// ラインCDの1桁目が'L'以外。
			if (!$scope.lin.lincd && $scope.lin.lincd.startsWith('L') == false){
				alertMessage.setErrorMessageByCode('lineCdLError');
				return false;
			}
		}else if($scope.lineBlockCommon == '2'){
			// ブロックCDの1桁目が'B'以外。
			if (!$scope.blk.blkcd && $scope.blk.blkcd.startsWith('B') == false){
				alertMessage.setErrorMessageByCode('blockCdBError');
				return false;
			}

		};


		////////////////////////////////////////////
		// ラインブロックの重複チェック
		////////////////////////////////////////////
		if ($scope.lineBlockCommon == '1'||$scope.lineBlockCommon == '3'){
			var linblkList = [
								$scope.lin.linblk1,
								$scope.lin.linblk2,
								$scope.lin.linblk3
							];
			var linblkCheckList = [];
			for (var i = 0; i < linblkList.length; i++) {
				// 未入力は処理をスキップ
				if(!linblkList[i]){
					continue;
				}


				// 存在しない場合は、重複チェックリストに項目追加
				if(linblkCheckList.includes(linblkList[i])){
					alertMessage.setErrorMessageByCode('identicalLinebrockCdDuplicationError');
					return false;
				}else{
					linblkCheckList.push(linblkList[i]);
				}

			}
		};

		/////////////////////////////////////////////////////
		// ロケ不定の貼付銘柄カテゴリの重複チェック
		/////////////////////////////////////////////////////

		//共通
		if ($scope.lineBlockCommon == '5'){
			var locidfbrctgList = [
								$scope.srw.locidfbrctg1,
								$scope.srw.locidfbrctg2,
								$scope.srw.locidfbrctg3,
								$scope.srw.locidfbrctg4,
								$scope.srw.locidfbrctg5,
								$scope.srw.locidfbrctg6,
								$scope.srw.locidfbrctg7,
								$scope.srw.locidfbrctg8,
								$scope.srw.locidfbrctg9,
								$scope.srw.locidfbrctg10
							];
			var locidfbrctgCheckList = [];
			for (var i = 0; i < locidfbrctgList.length; i++) {
				// 未入力は処理をスキップ
				if(!locidfbrctgList[i]){
					continue;
				}

				// 存在しない場合は、重複チェックリストに項目追加
				if(locidfbrctgCheckList.includes(locidfbrctgList[i])){
					alertMessage.setErrorMessageByCode('unsettledLocationProductCategoryDuplicateError');
					return false;
				}else{
					locidfbrctgCheckList.push(locidfbrctgList[i]);
				}
			}
		};

		//ブロック
		if ($scope.lineBlockCommon == '2'||$scope.lineBlockCommon == '4'){
			var locidfbrctgblkList = [
								$scope.blk.locidfbrctg1,
								$scope.blk.locidfbrctg2,
								$scope.blk.locidfbrctg3,
								$scope.blk.locidfbrctg4,
								$scope.blk.locidfbrctg5,
								$scope.blk.locidfbrctg6,
								$scope.blk.locidfbrctg7,
								$scope.blk.locidfbrctg8,
								$scope.blk.locidfbrctg9,
								$scope.blk.locidfbrctg10
							];
			var locidfbrctgblkCheckList = [];
			for (var i = 0; i < locidfbrctgList.length; i++) {
				// 未入力は処理をスキップ
				if(!locidfbrctgblkList[i]){
					continue;
				}

				// 存在しない場合は、重複チェックリストに項目追加
				if(locidfbrctgblkCheckList.includes(locidfbrctgblkList[i])){
					alertMessage.setErrorMessageByCode('unsettledLocationProductCategoryDuplicateError');
					return false;
				}else{
					locidfbrctgblkCheckList.push(locidfbrctgblkList[i]);
				}
			}
		};

		return true;
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
