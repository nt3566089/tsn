/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseMasterList
 *
 * @description
 * 配送コースマスタメンテナンス(一覧)検索画面<br>
 *
 * 配送コースマスタメンテナンス(一覧)検索を行う為の画面。
 */
angular.module('oneslogiWms.DeliveryCourseMasterList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryCourseMasterList.service:deliveryCourseMasterListApi
 *
 * @description
 * 配送コースマスタメンテナンス(一覧)検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/deliveryCourseMasterList/init 初期処理WebAPI<br>
 * ・resources/common/deliveryCourseMasterList/search 検索WebAPI<br>
 */
.factory('deliveryCourseMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		carrierList: AngularAPIClient.make(
			    [
			     ['keyValueList', 'GET', 'resources/common/carrierCd/keyValueList']
			    ]
		),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliveryCourseMasterList: AngularAPIClient.make(
				[
				 ['init',        'GET',  'resources/master/deliveryCourseMasterList/init'],
				 ['search',      'GET',  'resources/master/deliveryCourseMasterList/search'],
				 ['excel',       'GET',  'resources/master/deliveryCourseMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
 *
 * @description
 * 配送コースマスタメンテナンス(一覧)検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryCourseMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryCourseMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	//荷主センタ変更対応 201７.02.07 sja Start
	var oldCenter;
	var newTakingShippingDtFlgList;
	var newCarrierList;
	//荷主センタ変更対応 201７.02.07 sja End
	// グリッドの列情報（デザイン用）
	$scope.deliveryCourseMasterListCols = [
	                                       {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                       {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                       {field:"mcarrier.carrierCd", displayName:"運送業者CD"},
	                                       // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
	                                       {field:"trackingNumberingKey", displayName:"追跡番号採番キー"},
	                                       {field:"trackingNumberingAfterKey", displayName:"追跡番号採番キー(代引時、2枚目以降)"},
	                                       {field:"trackingNumberingUnit", displayName:"追跡番号採番単位CD"},
	                                       {field:"bclassDtlByTrackingNumberingUnit.vdict.dictNm", displayName:"追跡番号採番単位名称"},
	                                       {field:"tagType", displayName:"送り状種別CD"},
	                                       {field:"bclassDtlByTagType.vdict.dictNm", displayName:"送り状種別名称"},
	                                       {field:"tagTypeAfter", displayName:"送り状種別(代引時、2枚目以降)CD"},
	                                       {field:"bclassDtlByTagTypeAfter.vdict.dictNm", displayName:"送り状種別(代引時、2枚目以降)名称"},
	                                       {field:"tagDataType", displayName:"送り状データ種別CD"},
	                                       {field:"bclassDtByTagDataType.vdict.dictNm", displayName:"送り状データ種別名称"},
	                                       // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
	                                       {field:"pickingTime", displayName:"出庫開始時刻"},
	                                       {field:"stowageTime", displayName:"積込予定時刻"},
		                           		   // [横並-006] 削除フラグを追加 2014.11.26 taoys Start
	                                       {field:"shippingTime", displayName:"出荷予定時刻"},
	                           		       {field:"delFlg", displayName:"削除フラグCD"},
	                           		       {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"},
	                           			   //荷主センタ変更対応 201７.02.21 sja Start
	                          			   {field:"mcenter.centerCd", displayName:"センタCD"},
	                          			   {field:"mcenter.centerNm", displayName:"センタ名称"}
	                          			   //荷主センタ変更対応 201７.02.21 sja End
                                           // [横並-006] 削除フラグを追加 2014.11.26 taoys End
	                                       ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#initScreen
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'deliveryCourseList',
			columnDefs: 'deliveryCourseMasterListCols',
			pagingOptions : $scope.pagingOptions
		});

		//荷主センタ変更対応 201７.02.07 sja Start
		// センタ変更の監視設定（フォーカス時）
		$scope.centerFocus = function() {
			oldCenter = $scope.head.mcenter.centerCd;
		};

		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {
			// 運送業者リスト変更（同期処理）
			$scope.deferredGetCarrierCd()
			.then(function(response) {
				newCarrierList = response.data;
			});
		};

		// センタ変更の監視設定（ロストフォーカス時）
		$scope.centerBlur = function() {
			if (oldCenter != $scope.head.mcenter.centerCd) {
				// 選択したセンタで取得済みの運送業者リストを設定
				setCarrierList(newCarrierList, true);
			}
		};
		//荷主センタ変更対応 201７.02.07 sja End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 * ・受信後、ページングオプション変更時ファンクションを設定
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all([$scope.getInitData(),
		        $scope.deferredGetCarrierCd(),
		        $scope.deferredGetDelFlg()
		        ])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(deliveryCourseList){
			$scope.head = deliveryCourseList[0].data.head;
			$scope.deliveryCourseList = deliveryCourseList[0].data.body;
			$scope.paging = deliveryCourseList[0].paging;

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#getInitData
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();

		api.deliveryCourseMasterList.init().then(function(response){

			defferd.resolve(response);

			//荷主センタ変更対応 201７.01.19 sja Start
			// センタ変更後処理
			$scope.changeCenter(true);
			//荷主センタ変更対応 201７.01.19 sja End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

		});
		return defferd.promise;
	};
	//荷主センタ変更対応 201７.01.19 sja Start
	$scope.changeCenter = function(clearSelected) {
		// 作業日/出荷日/納品日リスト変更（同期処理）
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrierCd()
		.then(function(response) {
			setCarrierList(response.data, clearSelected);
		});
	};

	// 作業日/出荷日/納品日リスト再設定処理
	var setCarrierList = function(list, clearSelected) {
		$scope.carrier = list;

		if (clearSelected) {
			// [#6872][OSS] コンソールエラーを修正 2019.11.26 tsuboi Start
			if($scope.head){
				$scope.head.mcarrier.carrierCd = null;
			}
			// [#6872][OSS] コンソールエラーを修正 2019.11.26 tsuboi End
		}
	};
	//荷主センタ変更対応 201７.01.19 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#deferredGetCarrierCd
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 運送業者ドロップダウンリスト用データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrierCd = function () {

		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.07 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.head) {
			request.centerCd = $scope.head.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.07 sja End
		api.carrierList.keyValueList(request).then(function(response){
			$scope.carrierList = response.data;
			//荷主センタ変更対応 2017.02.07 sja Start
//			deferred.resolve();
			deferred.resolve(response);
			//荷主センタ変更対応 2017.02.07 sja End
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#search
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#getPagedDataAsync
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 検索処理<br>
	 * ・配送コースマスタメンテナンス(一覧)検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.deliveryCourseMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#setPagingData
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-346] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-346] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.deliveryCourseList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#excelOutput
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.deliveryCourseMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#gridDblClick
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#getClassForRow
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 配送コースマスタメンテナンス(一覧)テータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#update
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の配送コースマスタデータを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		//荷主センタ変更対応 201７.02.07 sja Start
		//$location.path("wms/master/DeliveryCourseMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("deliveryCourseId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].deliveryCourseId);
		$location.path("wms/master/DeliveryCourseMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
		.search("deliveryCourseId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].deliveryCourseId)
		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		//荷主センタ変更対応 201７.02.07 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#copy
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する
	 */
	$scope.copy = function() {
		//修正画面へ遷移
		$location.path("wms/master/DeliveryCourseMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("deliveryCourseId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].deliveryCourseId);
	};
	// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#register
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 配送コースマスタ新規する為の画面を表示する。
	 */
	$scope.initnew = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/DeliveryCourseMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);