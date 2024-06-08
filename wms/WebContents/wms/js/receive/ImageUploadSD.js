/**
 * @ngdoc overview
 * @name oneslogiWms.ImageUploadSD
 *
 * @description
 * 画像アップロードサンプル画面（スマートデバイス用）<br>
 *
 * 画像アップロードデータに対する新規登録・削除を行う為の画面。
 */
angular.module('oneslogiWms.ImageUploadSD', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ImageUploadSD.service:ImageUploadSDApi
 *
 * @description
 * 画像アップロードサンプル画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * imageUploadSD 画像アップロードデータ操作用WebApi<br>
 * ・resources/receive/imageUploadSD/initNew 初期データ取得(通常)WebAPI<br>
 * ・resources/receive/imageUploadSD/search 検索WebAPI<br>
 * ・resources/receive/imageUploadSD/imageUpload 画像アップロードWebAPI<br>
 * ・resources/receive/imageUploadSD/removeImage 画像削除WebAPI<br>
 */
.factory('ImageUploadSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		imageUploadSD: AngularAPIClient.make([
		                                           ['initNew', 'GET', 'resources/receive/imageUploadSD/initNew'],
		                                           ['search',  'GET', 'resources/receive/imageUploadSD/search'],
		                                           ['imageUpload', 'POST', 'resources/receive/imageUploadSD/imageUpload']
//		                                           ['imageUpload', 'POST', 'resources/receive/imageUploadSD/removeImage']
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD
 *
 * @description
 * 画像アップロードサンプル画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ImageUploadSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicHistory', 'ionicDatePicker', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'ImageUploadSDApi', function($scope, $state, $filter, $location, $q, $ionicHistory, ionicDatePicker, alertMessage, directiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, owsCommonSd, userInfo, statusInfo, modalFactory, printFactory, api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#initScreen
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	$scope.initScreen = function() {

		$scope.searchResult = {};
		$scope.searchCondition = {};

		// モード設定
		var searchObject = $location.search();
		$scope.screenMode = searchObject.mode;

		//センタコードの設定
		$scope.centerCd = userInfo.centerCd;

		//荷主コードの設定
		$scope.clientCd = userInfo.clientCd;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();

		$scope.imageOptions = {
				acceptFileTypes : /(\.|\/)(png|jpg)$/i,
				maxNumberOfFiles: 1
		};

		// test code
		$scope.paging = {};

		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#initScreenHttp
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

			return $scope.deferredGetInitData();

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#deferredGetInitData
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 商品別入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.imageUploadSD.initNew().then(function(response){

			// ページング
			$scope.paging = response.paging;

			$scope.search();

			deferred.resolve();
		});
		return deferred.promise;
	};

	$scope.moreDataCanBeLoaded = function() {
		return $scope.paging.isExistNextPage;
	}
	$scope.loadMoreData = function() {
		if(!$scope.searchResult.preventDoubleLoad) {
			$scope.pagingOptions.lastCurrentPage = $scope.pagingOptions.currentPage;
			$scope.pagingOptions.currentPage = $scope.pagingOptions.currentPage + 1;
			// スクロール検索処理
			$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);

			$scope.searchResult.preventDoubleLoad = true;
		}
		$scope.$broadcast('scroll.infiniteScrollComplete');
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#search
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 画像検索処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.uploadedImages = [];
		$scope.lastLoaded = 0;
		$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#getPagingData
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if(page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		/*api.imageUploadSD.search(request).then(function(response) {
			var noError = statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

			//エラー無しなら検索結果画面へ移行
			if(noError && page == 1) {
				$scope.searchResult.preventDoubleLoad = false;
				$state.go('all.abstract.list');
				$state.go('all.abstract.list', $state.params);
			}
		});*/
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImageUploadSD.object:ImageUploadSD#setPagingData
	 * @methodOf oneslogiWms.ImageUploadSD.object:ImageUploadSD
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {

		//$scope.uploadedImages = $scope.uploadedImages.concat(response.data.storeBody); // 入庫実績明細関連
		//　まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		//$scope.gridOptions.totalItems = response.paging.allRecordCount;
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	//　画像アップロード前処理
	$scope.imageBeforeUpload = function() {
		$scope.imageOptions.url = "resources/receive/imageUploadSD/imageUpload";
	}

	// 画像アップロード
	$scope.imageUploadSuccess = function(e, data) {
		angular.forEach(data.result, function(obj) {
			var image = {};
			//サーバーから画像のバイトコードとファイル名などの情報が入ったDtoが返ってくるイメージ
			//image.src = obj.src
			//image.fileName = obj.fileName;
			//image.info1 = obj.info1;
			//image.info2 = obj.info2;
			image.src = obj;
			image.fileName = "File Name";
			image.info1 = "Information";
			image.info2 = "Information";
			$scope.uploadedImages.push(image);
		});
	}

	// 画像削除
	$scope.deleteImage = function($index) {
		//メッセージマスタから確認メッセージ取得
		if(confirm("Do you really want to remove this image?")) {

			//var request = {}
			//var request.imageIndex = $index;
			//api.imageUploadSD.removeImage(request).then(function(response) {

				// 処理結果確認
				//if (!statusInfo.isSuccessAndShowMessage(response, 'form.uploadform')) {
				//	return;
				//}

				// ダイアログ表示(正常終了)
				//owsCommon.syncExec(function() {
					//owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
					//画像リスト再読み込み
					//	$scope.search();
				//});

			//});

			$scope.uploadedImages.splice($index, 1);
    	};
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
