/**
 * @ngdoc overview
 * @name oneslogiWms.LocationBarcodeListPrint
 *
 * @description
 * ロケーションバーコードリスト発行画面
 */

/**
 * ロケーションCDFromTo大小チェック用メッセージコード
 */

angular.module('oneslogiWms.LocationBarcodeListPrint',[])

/**
 * @ngdoc service
 * @name oneslogiWms.LocationBarcodeListPrint.service:locationBarcodeListPrintApi
 *
 * @description
 * ロケーションバーコードリスト発行WebApi定義<br>
 * ・resources/common/zone/keyValueList ロケーションバーコードリスト発行操作用WebApi<br>
 * ・resources/master/locationBarcodeListPrint/init 初期化用WebApi<br>
 * ・resources/master/locationBarcodeListPrint/select 検索用WebApi<br>
 */
.factory('locationBarcodeListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		zone: AngularAPIClient.make(
			    [
			    ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
			    ]
			   ),
		locationBarcodeListPrint: AngularAPIClient.make(
				[
		        ['init', 'GET', 'resources/master/locationBarcodeListPrint/init'],
		        ['select', 'GET', 'resources/master/locationBarcodeListPrint/select']
		        ]
		    ),

			//荷主センタ変更対応 201７.02.15 sja Start
			warehouseCdList: AngularAPIClient.make(
					[
					 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
					 ]
			),
			//荷主センタ変更対応 201７.02.15 sja End

			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
			)
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};
}])
/**
 * @ngdoc object
 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
 *
 * @description
 * ロケーションバーコードリスト発行画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('LocationBarcodeListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'locationBarcodeListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldWarehouse;
	var newZoneList;
	 // [検査-097] 庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を削除 2014.11.28 xiangy
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#initScreen
	 * @methodOf oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// ロケーションバーコード大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {

        	if(toValue == ''){
        		toValue= null;
        	}
        	if(fromValue != null && toValue != null){
        		if(fromValue > toValue){
        			return false;
        		}
            }
        	return true;
        };

		// ロケーションバーコード大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

        // 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.searchCondition.mzone.mwarehouse.warehouseCd;
		};
		// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy Start
		// 倉庫変更の監視設定（選択内容変更時）
		$scope.warehouseChange = function() {
			if (oldWarehouse !=  $scope.searchCondition.mzone.mwarehouse.warehouseCd) {
				// 選択した画面で取得済みのグリッドを設定
				setZoneList();
			}
		};
		// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy End


		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	//荷主センタ変更対応 201７.02.15 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	//荷主センタ変更対応 2017.03.06 sja Start
//	$scope.centerChange = function() {
//		// 倉庫リスト変更（同期処理）
//		$scope.deferredGetWarehouseCdList();
//	};
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
//		$scope.deferredGetWarehouseCdList();
		$scope.deferredGetWarehouseCdList()
		.then(function(response){
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, false);
			});
		});
		//荷主センタ変更対応 2017.03.06 sja End
	};
	//荷主センタ変更対応 201７.02.15 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#initScreenHttp
	 * @methodOf oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 //荷主センタ変更対応 201７.02.15 sja Start
				 $scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.15 sja End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.locationBarcodeListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.searchCondition;
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy Start
			// 選択肢が一つの場合は一つ目を設定
			setWarehouseList($scope.warehouseList,true);

			$scope.changeWarehouse();
			// [検査-097] 庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#deferredGetZoneList
	 * @methodOf oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
	 *
	 * @description
	 * ゾーン取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerCd = $scope.searchCondition.mcenter.centerCd;
		request.warehouseCd = $scope.searchCondition.mzone.mwarehouse.warehouseCd;

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#showLocationF
	 * @methodOf oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocationF = function(){

		// ロケーションマスタのモーダル画面を表示
		var items = {
				centerCd:$scope.searchCondition.mcenter.centerCd,
				locationCd:$scope.searchCondition.locationCdFrom,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.searchCondition.mzone.mwarehouse.warehouseCd,
				zoneCd: $scope.searchCondition.mzone.zoneCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.locationCdFrom = selectedItem.locationCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			$scope.searchCondition.locationNmFrom = selectedItem.locationNm;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#showLocationT
	 * @methodOf oneslogiWms.ReceivePlanInput.object:LocationBarcodeListPrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocationT = function(){
		// ロケーションマスタのモーダル画面を表示
		var items = {
				centerCd:$scope.searchCondition.mcenter.centerCd,
				locationCd:$scope.searchCondition.locationCdTo,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.searchCondition.mzone.mwarehouse.warehouseCd,
				zoneCd: $scope.searchCondition.mzone.zoneCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
			};
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.locationCdTo = selectedItem.locationCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			$scope.searchCondition.locationNmTo = selectedItem.locationNm;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};

	//荷主センタ変更対応 201７.02.15 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.15 sja End

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#locationCdBlur
	 * @methodOf oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCD
		var locationCd = "";
		if (index == 1) {
			locationCd = $scope.searchCondition.locationCdFrom;
		} else {
			locationCd = $scope.searchCondition.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.searchCondition.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.searchCondition.locationNmFrom = null;
			}else{
				$scope.searchCondition.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationBarcodeListPrint.object:LocationBarcodeListPrint#changeWarehouse
	 * @methodOf oneslogiWms.ReceivePlanInput.object:LocationBarcodeListPrint
	 *
	 * @description
	 * 倉庫変更後処理<br>
	 *
	 * 倉庫が変更された場合、ゾーンリストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeWarehouse = function() {
		// 選択した画面で取得済みのグリッドを設定
		setZoneList();
	};
	// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy End
	// 発行ボタン
	$scope.issue = function() {

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.searchCondition = $scope.searchCondition;
			request.printBasicData = printParam.printBasicData;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.locationBarcodeListPrint.select(request).then(function(response){
				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 正常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー表示
						subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
					}
				} else {
					// 異常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー閉じる
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				}
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana Start
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana End
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};
	// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy Start
	// ゾーンリスト再設定処理
	var setZoneList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerCd = $scope.searchCondition.mcenter.centerCd;
		request.warehouseCd = $scope.searchCondition.mzone.mwarehouse.warehouseCd;

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			// 選択肢が一つの場合は一つ目を設定
			if ($scope.searchCondition.mzone.mwarehouse.warehouseCd != null && $scope.zoneList.length == 1) {
					$scope.searchCondition.mzone.zoneCd = $scope.zoneList[0].zoneCd;
				} else {
					$scope.searchCondition.mzone.zoneCd = null;
				}
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 倉庫変リスト再設定処理
	var setWarehouseList = function(list, clearSelected) {

		$scope.warehouseList = list;
		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.warehouseList.length == 1) {
				$scope.searchCondition.mzone.mwarehouse.warehouseCd = $scope.warehouseList[0].warehouseCd;
			} else {
				$scope.searchCondition.mzone.mwarehouse.warehouseCd = null;
			}
		}
	};
	// [検査-097]庫変更「取得したゾーンデータが１件の場合、１件目を選択状態にする。」を修正 2014.11.28 xiangy End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);