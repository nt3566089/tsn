/**
 * @ngdoc overview
 * @name oneslogiWms.PieceShippingInspect
 *
 * @description
 * 出荷検品画面<br>
 *
 * 出荷検品する画面。
 */
angular.module('oneslogiWms.PieceShippingInspect', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PieceShippingInspect.service:pieceShippingInspectApi
 *
 * @description
 * 出荷検品画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ShpCheckDisplay 処理区分データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * pieceShippingInspect 出荷検品操作用WebApi<br>
 * ・resources/shipping/pieceShippingInspect/init 初期データ取得(通常)<br>
 * ・resources/shipping/pieceShippingInspect/select 出荷検品データ取得<br>
 * ・resources/shipping/pieceShippingInspect/packingInsert 入力データ登録<br>
 * ・resources/shipping/pieceShippingInspect/shippingInterrupt 中断データ登録<br>
 * ・resources/shipping/pieceShippingInspect/pieceShippingInspectClear 検品データクリア処理<br>
 * <br>
 */
.factory('pieceShippingInspectApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shpCheckDisplay: AngularAPIClient.make([
		                                      ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                      ]
		),
		pieceShippingInspect: AngularAPIClient.make([
		                                    ['init',                         'GET',  'resources/shipping/pieceShippingInspect/init'],
		                                    ['boxId',                        'GET',  'resources/common/box/boxId'],
		                                    ['select',                       'GET',  'resources/shipping/pieceShippingInspect/select'],
		                                    ['packingInsert',                'POST', 'resources/shipping/pieceShippingInspect/packingInsert'],
		                                    ['shippingInterrupt',            'POST', 'resources/shipping/pieceShippingInspect/shippingInterrupt'],
		                                    ['pieceShippingInspectClear',    'POST', 'resources/shipping/pieceShippingInspect/pieceShippingInspectClear'],
//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
		                                    ['getUnitNum',                   'GET',  'resources/shipping/pieceShippingInspect/getUnitNum'],
//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End
// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
		                                 // キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		                                    ['printPackingSlip', 'GET', 'resources/shipping/pieceShippingInspect/printPackingSlip'],
		                                 // キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
		                                    ['printAutoTagLabel',            'POST', 'resources/shipping/pieceShippingInspect/printAutoTagLabel']
// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
		                                    ]
		),
		// [#5117][v3.1] 運送業者の取得を削除 2018.10.12 kawana Delete
		userCd: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/user/record']
				 ]
		),
		// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.02 matsumoto Start
		mParam: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/param/record']
				 ]
		)
		// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.02 matsumoto End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
 *
 * @description
 * 出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PieceShippingInspect', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'pieceShippingInspectApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	$scope.pieceShippingInspecting = {};
	$scope.pieceShippingInspecting.janCd = null;
	$scope.pieceShippingInspecting.shpCheckDisplay = null;
	var shpCheckDisplay = null;

	// グリッドの列情報（デザイン用）
	$scope.pieceShippingInspectListCols =
		[
		 	// [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
 		    {field:"janCd", displayName:"JANCD"},
 			// [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
		    {field:"productCd", displayName:"商品CD"},
		    {field:"productNm", displayName:"商品名称"},
		    {field:"productAbbr", displayName:"商品略称"},
		    {field:"instNum", displayName:"指示数"},
		    {field:"spgQtyOns", displayName:"検品済数"},
		    {field:"spgQtyRemain", displayName:"検品残数"},
		    {field:"shippingPackingNo", displayName:"個口番号"},
		    {field:"netWeight", displayName:"単重量(グロス)"},
		    {field:"grossWeight", displayName:"総重量(グロス)"},
		    {field:"boxId", displayName:"荷材ID"},
		    {field:"productId", displayName:"商品ID"},
		    {field:"unitNum", displayName:"ケース入数"},
		    {field:"pickingWorkNo", displayName:"出庫作業No."},
		    {field:"allocInstHId", displayName:"引当指示ヘッダId"},
		    {field:"shpCheckDisplay", displayName:"未検品のみ表示"}
        ];

	// status
	var status0 = null;
	var status1 = "末検品";
	var status2 = "検品中";

	// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正(不要な変数を削除) 2015.10.07 kawana
	// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(変数を使っての制御は不要になるため削除) 2015.04.06 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#initScreen
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// 未検品のみ表示変更の監視設定（選択内容変更時）
		$scope.displayChange = function() {

			if ($scope.pieceShippingInspecting.shpCheckDisplay == "1") {
				// 未検品行のみ表示
				shpCheckDisplay.filters[0].term = "0";
			} else {
				// 全行表示
				shpCheckDisplay.filters[0].term = null;
			}
			// 列の変更を適用
			$scope.gridOptions.gridApi.core.notifyDataChange('column');
		};

		// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(変数を使っての制御は不要になるため削除) 2015.04.06 kawana

		// フィルタする為のオブジェクトを作成します。
		$scope.filterOptions = {
				  filterText: '',
				  useExternalFilter: false
				};

		// [ON推-品向-524] ページングをなしに設定変更 2015.01.13 kawana Start
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'pieceShippingInspectList',
			columnDefs: 'pieceShippingInspectListCols'
		});
		// [ON推-品向-524] ページングをなしに設定変更 2015.01.13 kawana End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#initScreenHttp
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				  $scope.deferredGetShpCheckDisplay(),
				// [#5235][v3.1] 検品音のON/OFFを追加 2018.10.15 kawana Start
				  $scope.deferredParamInfo()
				// [#5235][v3.1] 検品音のON/OFFを追加 2018.10.15 kawana End
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData(null);
		});

	};
	// [Ver3.1][#5117] 運送業者をドロップダウンリストからテキストボックスに変更(運送業者ドロップダウンリスト取得処理削除) 2018.09.10 matsumoto Del

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:pieceShippingInspectList#deferredGetInitData
	 * @methodOf oneslogiWms.PieceShippingInspect.object:pieceShippingInspectList
	 *
	 * @description
	 * 入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function (userCd) {
		var deferred = $q.defer();
		var userCdString = userCd;

		api.pieceShippingInspect.init().then(function(response){

			// 画面項目（表示用）の初期化処理
			clearViewItem();

			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;
			$scope.pieceShippingInspectList = response.data.list;

			// ログイン情報より初期値を設定
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki Start
			$scope.searchCondition.mcenter.centerId = userInfo.centerId;
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientId = userInfo.clientId;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			// [検査-117] センタIDと荷主IDが正しく引き継がれていなかった。 2014.12.05 koseki End
			if (userCdString != null) {
				$scope.searchCondition.userCd = userCdString;
			}

			// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正(不要な処理を削除) 2015.10.07 kawana

			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG Start
			// [ON推-品向-440] 初期表示時、検索ボタンが活性化しており、押下すると致命的エラーを解消するため、削除 2014.12.15 許
			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG End

			// [ON推-品向-523] 初期表示以外はユーザCDではなく出庫作業No.にフォーカスが当たるように変更 2015.01.13 kawana Start
        	if($scope.searchCondition.userCd){
        		// ユーザCDが既に入力されている場合(1度、検品処理後)は入力エラーをフォーカス(出庫作業No.の必須エラー)
        		directiveControl.firstErrorOnFocus('searchinputform');
        	} else {
    			// 通常のフォーカス設定（最初の入力フォーム)
    			owsCommon.setFirstFocus();
        	}
			// [ON推-品向-523] 初期表示以外はユーザCDではなく出庫作業No.にフォーカスが当たるように変更 2015.01.13 kawana End

			deferred.resolve();
		});

		return deferred.promise;
	};

	// JANCDでEnter押下時の処理
	// データの検品数と検品済数を設定する
	$scope.handleKeydown = function(e) {
        if (e.which === 13 && e.currentTarget.id === "userCd") {
			e.preventDefault();
			e.stopPropagation();

			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う 2015.04.06 kawana Start
			var userCd = $scope.searchCondition.userCd;
			if (userCd && 0 < userCd.length) {
				var request = {};
				request.userCd = userCd;

				api.userCd.record(request).then(function(response){
					if (response.data.bUser.userCd == null){
						optionMessageControl.show($scope, "userCd", $filter('owfMessage')("notFoundInUserCodeError"));
						$scope.userNm = null;
					}else{
						$scope.userNm = response.data.bUser.userNm;
						if(!$scope.searchinputform.$invalid){
			        		owsCommon.syncButtonExec("search");
						} else {
			            	directiveControl.firstErrorOnFocus('searchinputform');
						}
					}
				});
			} else {
				$scope.userNm = null;
			}
			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う 2015.04.06 kawana End

        	return;
        };
        if (e.which === 13 && e.currentTarget.id === "pickingWorkNo") {
			e.preventDefault();
			e.stopPropagation();

			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う 2015.04.06 kawana Start
			if(!$scope.searchinputform.$invalid){
        		owsCommon.syncButtonExec("search");
			} else {
				// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana Start
				directiveControl.firstErrorOnFocus('searchinputform').then(function() {
					if($("#searchinputform").find(":focus").attr("id") == "pickingWorkNo") {
						$("#pickingWorkNo").find(":input").select();
					}
				});
				// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana End
			}
			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う 2015.04.06 kawana End
        	return;
        };
        if (e.which === 13 && e.currentTarget.id === "janCd") {
        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana Start
			if ($scope.pieceShippingInspecting.janCd == null || $scope.pieceShippingInspecting.janCd == "") {
				// JANCD 入力チェック
				return;
			}
        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana End

        	// [1.1.4-CT-100] JANCD入力時にエラーメッセージを消す 2016.06.10 kawana Start
        	alertMessage.deleteAllDanger();
        	// [1.1.4-CT-100] JANCD入力時にエラーメッセージを消す 2016.06.10 kawana End
			e.preventDefault();
			e.stopPropagation();

        	// JANCDが明細データに存在しない場合、エラーメッセージを表示し、処理を抜ける。
			var isExist = false;
			var isZero = true;

			for(i=0;i<$scope.pieceShippingInspectList.length;i++){

	        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana Start
				// [SK2-090] JANCD未入力の場合は、検品できないように修正します。 2014.12.22 衛 Start
				if ( ($scope.pieceShippingInspectList[i].janCd == $scope.pieceShippingInspecting.janCd)				// JANCDが一致
						|| ($scope.pieceShippingInspectList[i].productCd == $scope.pieceShippingInspecting.janCd)	// 商品CDが一致
					){

					// [Ver3.0] unit of measure対応 2017.12.25 ライ START
					var decimalExistFlg =  $scope.pieceShippingInspectList[i].mproduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg;
					// [SK2-090] JANCD未入力の場合は、検品できないように修正します。 2014.12.22 衛 End
		        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana End
					isExist = true;
					if (owsCommon.isPositive($scope.pieceShippingInspectList[i].spgQtyRemain) ){
						// [Ver3.1][#5235] 検品音が鳴るまで次の検品不可にする 2018.10.01 matsumoto Start
						directiveControl.editable($scope, 'janCd', false);
						// [Ver3.1][#5235] 検品音が鳴るまで次の検品不可にする 2018.10.01 matsumoto End
						isZero = false;
						// ===== 対応するJANCDのデータを以下の設定を行う。 =====
						// 商品CD
						$scope.productCd = $scope.pieceShippingInspectList[i].productCd;
						// 商品名称
						$scope.productNm = $scope.pieceShippingInspectList[i].productNm;
						// 商品?位
						$scope.productUnit =$scope.pieceShippingInspectList[i].productUnit;
						// 画面ヘッダ検品数
						if(decimalExistFlg== 0){
							 $scope.instNumT = 1;
						  }

						// 画面ヘッダ検品済数
						if(decimalExistFlg== 0){
							$scope.spgQtyOnsT = owsCommon.add($scope.pieceShippingInspectList[i].spgQtyOns, 1);
							}

						// 画面ヘッダ指示数
						$scope.instSu = $scope.pieceShippingInspectList[i].instNum;
						// 画面ヘッダ検品済総数
						if(decimalExistFlg== 0){
							$scope.spgQtyOns = owsCommon.add($scope.spgQtyOns, 1);
							  }
						// 画面明細検品済数
						if(decimalExistFlg== 0){
							$scope.pieceShippingInspectList[i].spgQtyOns = owsCommon.add($scope.pieceShippingInspectList[i].spgQtyOns, 1);
							  }

						// 画面明細検品残数
						if(decimalExistFlg== 0){
							 $scope.pieceShippingInspectList[i].spgQtyRemain = owsCommon.subtract($scope.pieceShippingInspectList[i].spgQtyRemain, 1);
						}
						// [Ver3.0] unit of measure対応 2017.12.25 ライ END

						// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto Start
						if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)) {
							// 1伝票分検品終了した場合
							$scope.inspCompSoundPlay();
						} else {
							$scope.inspSoundPlay();
						}
						// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto End

						// ===== 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する =====
						if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
							// [C-CWMS-0051] 出荷梱包No.で検品する場合、検品完了時、梱包データ更新する。(箱登録画面不要) 2015/12/08 NayZaw Start
							if($scope.searchCondition.isPackingNo){
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								// 荷材選択スキップ 0：スキップしない、1：スキップする
								if($scope.isBoxSelectSkip === "0"){
									// 箱登録メソッドを呼び出す。
									var itemsBoxs = {
											centerId: $scope.pieceShippingInspectList[i].centerId,
											shippingPackingNo: parseInt($scope.shippingPackingNo) + 1,
											boxCd: $scope.defaultBox.boxCd,
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
											cesIntegationFlg:$scope.cesIntegationFlg,
											weight:0,
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
										};
									var modalInstance = modalFactory.modalInstBoxInput(itemsBoxs);
									// モーダル画面が閉じられたら呼ばれるファンクションの登録
									modalInstance.result.then(function(retItems){
										var request = {};
										request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
										request.boxCd = retItems.boxCd;
										// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
										$scope.defaultBox.permitWeigh = retItems.weight;
										// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
										api.pieceShippingInspect.boxId(request).then(function(response){

											var request = {};
											request.data = {};
											request.data.search = $scope.searchCondition;
											request.data.list = $scope.pieceShippingInspectList;
											$scope.defaultBox.boxId = +response;
											request.data.defaultBox = $scope.defaultBox;

											// WebApiのresources/shipping/shippingInspect/packingInsert を呼び出し、入力データ登録を行う。
											api.pieceShippingInspect.packingInsert(request).then(function(execResponse){
												// 処理結果確認
												if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {

													// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
													// 荷札出力後処理
													var successFunc = function() {

														var userCd = $scope.searchCondition.userCd;

														// 画面初期化処理を実行
														$scope.isopen = true;

														$scope.deferredGetInitData(userCd).then(function() {
												        	$scope.userCdBlur();
												        	directiveControl.firstErrorOnFocus('searchinputform');
											        	});
													};

													// 荷札出力実行
													$scope.printTagLabel(successFunc);
													// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End
													// キャリアEDIシステム(CES)連携対応 2018.01.16 HAN Start
													// 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
													if($scope.packingSlipAutoOutputFlg === "1"){
														$scope.printPackingSlip(successFunc);

													}
													// Bill of Lading発行
													$scope.billOfLadingPrintShow();
													// キャリアEDIシステム(CES)連携対応 2018.01.16 HAN End

													return;
												}
											});
										});
									});
								}
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								else{
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
									// 出荷梱包No.で検品する場合、箱登録画面で登録しないで、梱包ボディテーブルを更新する。
									// 出荷検品画面用DTO
									var request = {};
									request.data = {};
									request.data.search = $scope.searchCondition;
									request.data.list = $scope.pieceShippingInspectList;
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
									request.data.defaultBox = $scope.defaultBox;
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
									// WebApiのresources/shipping/pieceShippingInspect/packingInsertを呼び出し、入力データ登録を行う。
									api.pieceShippingInspect.packingInsert(request).then(function(execResponse){
										// 処理結果確認
										if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {

											// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
											// 荷札出力後処理
											var successFunc = function() {

												var userCd = $scope.searchCondition.userCd;

												// 画面初期化処理を実行
												$scope.isopen = true;

												$scope.deferredGetInitData(userCd).then(function() {
													// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
										        	$scope.userCdBlur();
										        	directiveControl.firstErrorOnFocus('searchinputform');
										        	// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
									        	});
												// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
											};

											// 荷札出力実行
											$scope.printTagLabel(successFunc);
											// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End

											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
											// 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
											if($scope.packingSlipAutoOutputFlg === "1"){
												$scope.printPackingSlip(successFunc);

											}
											// Bill of Lading発行
											$scope.billOfLadingPrintShow();
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
											return;
										}
									});
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								}
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
							}
							// 出荷梱包No.以外で検品する場合の処理(出庫作業No）
							else{
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								// 荷材選択スキップ 0：スキップしない、1：スキップする
								if($scope.isBoxSelectSkip === "0"){
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
									// 箱登録メソッドを呼び出す。
									var itemsBoxs = {
											centerId: $scope.pieceShippingInspectList[i].centerId,
											shippingPackingNo: parseInt($scope.shippingPackingNo) + 1,
											// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
											boxCd: $scope.defaultBox.boxCd,
											// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
											cesIntegationFlg:$scope.cesIntegationFlg,
											weight:0,
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
										};
									var modalInstance = modalFactory.modalInstBoxInput(itemsBoxs);
									// モーダル画面が閉じられたら呼ばれるファンクションの登録
									modalInstance.result.then(function(retItems){
										var request = {};
										// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
										request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
										// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
										request.boxCd = retItems.boxCd;
										// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
										$scope.defaultBox.permitWeigh = retItems.weight;;
										// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
										api.pieceShippingInspect.boxId(request).then(function(response){
											// 合計口数
											$scope.shippingPackingNo = retItems.shippingPackingNo;

											for(j=0;j<$scope.pieceShippingInspectList.length;j++){
												if ($scope.pieceShippingInspectList[j].shpCheckDisplay == 0){
													// update Row
													$scope.pieceShippingInspectList[j].shippingPackingNo =  retItems.shippingPackingNo;
													$scope.pieceShippingInspectList[j].shpCheckDisplay = 1;
													// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
													$scope.pieceShippingInspectList[j].boxId = +response;
													// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
												}
											}
											$scope.displayChange();
											// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
											$scope.packingInsert();
										});
									});
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								}
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								else{
									// 合計口数
									$scope.shippingPackingNo = parseInt($scope.shippingPackingNo) + 1;
									for(j=0;j<$scope.pieceShippingInspectList.length;j++){
										if ($scope.pieceShippingInspectList[j].shpCheckDisplay == 0){
											// update Row
											$scope.pieceShippingInspectList[j].shippingPackingNo = $scope.shippingPackingNo;
											$scope.pieceShippingInspectList[j].shpCheckDisplay = 1;
											$scope.pieceShippingInspectList[j].boxId = + $scope.defaultBox.boxId;
										}
									}
									$scope.displayChange();
									// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
									$scope.packingInsert();
								}
								// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
							}
							// [C-CWMS-0051] 出荷梱包No.で検品する場合、検品完了時、梱包データ更新する。(箱登録画面不要) 2015/12/08 NayZaw End
						};
						// [Ver3.1][#5235] 検品音が鳴るまで次の検品不可にする 2018.10.01 matsumoto Start
						directiveControl.editable($scope, 'janCd', true);
						// [Ver3.1][#5235] 検品音が鳴るまで次の検品不可にする 2018.10.01 matsumoto End
						// JANCDがクリアする。
						$scope.pieceShippingInspecting.janCd = null;
						// [#5419][v3.1] Enter後にソースCDにフォーカスする 2018.10.19 kawana Start
						// ソースCDにフォーカス
						owsCommon.setFirstFocus('inputform');
						// [#5419][v3.1] Enter後にソースCDにフォーカスする 2018.10.19 kawana End
						break;
					};
				};
			};
			// [SK2-090] JANCD未入力の場合は、検品できないように修正します。 2014.12.22 衛 Start
			// JANCDが明細データに存在しない場合、エラーメッセージを表示し、処理を抜ける。
        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana Start
			if (!isExist){
	        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana End
				// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
				modalErrorDialog(owsCommon.convertMessage('janCodeInputError', null, false))
				.then(function(response) {
					// [1.1.4-CT-100] JANCD入力エラー時にJANCDを全選択状態にする 2016.06.10 kawana Start
					$("#janCd").find(":input").select();
					// [1.1.4-CT-100] JANCD入力エラー時にJANCDを全選択状態にする 2016.06.10 kawana End
				});
				// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End

				return;
			};
			// 対応するJANCD行の検品残数が0場合、エラーメッセージを表示し、処理を抜ける。
        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana Start
			if (isZero){
	        	// [1.1.4-CT-107] JANCDの入力欄に商品CDも入力可能にする 2016.06.10 kawana End
				// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
				modalErrorDialog(owsCommon.convertMessage('itemInspectedError', null, false))
				.then(function(response) {

					// [#5419][v3.1] Enter後にソースCDにフォーカスする 2018.12.13 kawana Start
					// ソースCDにフォーカス
					owsCommon.setFirstFocus('inputform');
					// [#5419][v3.1] Enter後にソースCDにフォーカスする 2018.12.13 kawana End
				});
				// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
				// JANCDがクリアする。
				$scope.pieceShippingInspecting.janCd = null;
				return;
			};
			// [SK2-090] JANCD未入力の場合は、検品できないように修正します。 2014.12.22 衛 End
        }};

	// ユーザCD変更の監視設定（ロストフォーカス時）
	$scope.userCdBlur = function() {
		// 入力されたユーザCDを取得
		var userCd = $scope.searchCondition.userCd;

		if (userCd && 0 < userCd.length) {
			var request = {};
			request.userCd = userCd;

			api.userCd.record(request).then(function(response){
				if (response.data.bUser.userCd == null){
					optionMessageControl.show($scope, "userCd", $filter('owfMessage')("notFoundInUserCodeError"));
					$scope.userNm = null;
					// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana
				}else{
					$scope.userNm = response.data.bUser.userNm;
					// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana
				}
			});
		} else {
			$scope.userNm = null;
		}
	};

	// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.15 matsumoto Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#deferredParamInfo
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description パラメータの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、パラメータマスタ情報を取得して設定<br>
	 */
	$scope.deferredParamInfo = function() {
		var deferred = $q.defer();

		var request = {};
		request.centerCd =  userInfo.centerCd;
		request.clientCd =  userInfo.clientCd;

		// パラメータマスタ取得
		api.mParam.record(request).then(function(response){

			// エラー音再生フラグ
			$scope.errorSoundPlayFlg = response.data.mParam.errorSoundPlayFlg;
			// 警告音再生フラグ
			$scope.warnSoundPlayFlg = response.data.mParam.warnSoundPlayFlg;
			// 検品音再生フラグ
			$scope.inspSoundPlayFlg = response.data.mParam.inspSoundPlayFlg;
			// 検品完了音再生フラグ
			$scope.inspCompSoundPlayFlg = response.data.mParam.inspCompSoundPlayFlg;

			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#inspCompSoundPlay
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 検品時に検品音再生フラグ又は検品完了音再生フラグが「1：再生する」の場合、音を鳴らす<br>
	 *
	 */
	$scope.inspSoundPlay = function() {

		if ($scope.inspSoundPlayFlg === '1') {
			// 検品音再生フラグが「1：再生する」の場合、検品音鳴らす
			new Audio($("#inspSound")[0].src).play();
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#inspCompSoundPlay
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 1伝票の検品終了時、検品完了音再生フラグ又は検品音再生フラグが「1：再生する」の場合、音を鳴らす<br>
	 *
	 */
	$scope.inspCompSoundPlay = function() {

		if ($scope.inspCompSoundPlayFlg === '1') {
			// 検品完了音再生フラグが「1：再生する」の場合、検品完了音鳴らす
			$("#inspCompSound")[0].play();
		} else if ($scope.inspSoundPlayFlg === '1') {
			// 検品音再生フラグが「1：再生する」の場合、検品音鳴らす
			$("#inspSound")[0].play();
		}
	}
	// [Ver3.1][#5235] パラメータマスタを取得し、再生有無を判断する 2018.10.15 matsumoto End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#search
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){

		// [#7181][OSS] 【検索】押下時にユーザCDの存在有無チェックを追加 2020.02.06 tsuboi Start
		var request = {};
		request.userCd = $scope.searchCondition.userCd;

		api.userCd.record(request).then(function(response){
			if (response.data.bUser.userCd == null){
				optionMessageControl.show($scope, "userCd", $filter('owfMessage')("notFoundInUserCodeError"));
				$scope.userNm = null;
			}else{
				$scope.userNm = response.data.bUser.userNm;
			}

			var isError = $scope.searchinputform.$invalid;
			if (isError) {
				directiveControl.firstErrorOnFocus('searchinputform');
				return;
			}

			if ($scope.pieceShippingInspectList.length > 0){
				inputform.janCd.focus();
				return;
			};
// owsCommon.clearPagingOptions($scope.gridOptions);
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		});
		// [#7181][OSS] 【検索】押下時にユーザCDの存在有無チェックを追加 2020.02.06 tsuboi End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#getPagingData
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ページング用データ設定
// owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		request.data.search.isFromInterrupt = false;
		api.pieceShippingInspect.select(request).then(function(response) {

			if(response.data.search.isFromInterrupt){
				// 確認でOKを選択された場合は、処理を進める。
				if (!owsCommon.viewConfirm("inspectRestartConfirmation")) {
					return;
				}

				request.data.search.isFromInterrupt = true;

				api.pieceShippingInspect.select(request).then(function(response) {

					if (!statusInfo.isSuccessAndShowMessage(response,'inputform')) {
						// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
						modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
						.then(function(response) {
							// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana Start
							$("#pickingWorkNo").find(":input").select();
							// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana End
						});
						// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
						return;
					}

					$scope.setPagingData(response, page, pageSize);
				});
			} else {

				// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.13 matsumoto Start
				if (!statusInfo.isSuccessAndShowMessage(response,'inputform')) {
					// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
					modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function(response) {
						// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana Start
						$("#pickingWorkNo").find(":input").select();
						// [1.1.4-CT-101] エラー時に出庫作業Noを選択状態にする 2016.06.14 kawana End
					});
					// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
					return;
				}

				if (response.data.search.pickingWorkMessageSet != null){

					// 出庫作業メッセージ表示
					deferredShowPickingWorkMessage(response.data.search.pickingWorkMessageSet).then(function() {

						$scope.setPagingData(response, page, pageSize);
					});

				} else {

					$scope.setPagingData(response, page, pageSize);
				}
				// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.13 matsumoto End
			}
		});
	};

	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.13 matsumoto Start
	/** 出庫作業メッセージ表示 */
	var deferredShowPickingWorkMessage = function(pickingWorkMessageSet) {

		var deferred = $q.defer();

		showPickingWorkMessage(0, pickingWorkMessageSet, deferred);

		return deferred.promise;
	}

	/** 出庫作業メッセージ表示 */
	var showPickingWorkMessage = function(index, pickingWorkMessageSet, deferred) {

		if (pickingWorkMessageSet.length > index) {
			// 出庫作業メッセージリストのサイズが引数indexより大きい場合

			// 出庫作業メッセージをモーダルに表示
			modalWarnDialog(pickingWorkMessageSet[index])
			.then(function() {
				// 再度呼び出し
				showPickingWorkMessage(index + 1, pickingWorkMessageSet, deferred);
			});
		} else {
			deferred.resolve();
		}
	}
	// [Ver3.1][#5749]出庫作業メッセージが複数存在する場合1つずつ表示する 2018.12.13 matsumoto End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#setPagingData
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 指定データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-335] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-335] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// 取得したデータをグリッドに表示
		$scope.pieceShippingInspectList = response.data.list;

		// 空行用のオブジェクト
		$scope.blankRow = response.data.blankRow;

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
		$scope.isBoxSelectSkip = response.data.isBoxSelectSkip;
		$scope.defaultBox = response.data.defaultBox;
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
		// [Ver3.1][#5117]荷札自動発行ロジック変更に伴いDTOから荷札出力フラグ削除 2018.09.19 matsumoto Del
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End

		// 商品CD
		$scope.productCd = null;
		// 商品名称
		$scope.productNm = null;
		// [Ver3.0] unit of measure対応 2017.11.20 ライ START
		// 商品?位
		$scope.productUnit= null;
		// [Ver3.0] unit of measure対応 2017.11.20 ライ START
		// 合計口数を設定
		$scope.shippingPackingNo = 0;
		// 検品数
		$scope.instNumT = null;
		// 検品済数
		$scope.spgQtyOnsT = null;
		// 指示数
		$scope.instSu = 0;
		// 総検品数
		$scope.instNum = 0;
		// 検品済総数
		$scope.spgQtyOns = 0;
		// ステータスを設定
		$scope.status = status0;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		$scope.cesIntegationFlg = response.data.cesIntegationFlg;
		$scope.packingSlipAutoOutputFlg = response.data.packingSlipAutoOutputFlg;
		$scope.bolOutputTargetFlg = response.data.bolOutputTargetFlg;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

		// [C-CWMS-0051] 出荷梱包No.で検品するかどうか判断するフラグ値の設定 2015/12/08 NayZaw Start
		$scope.searchCondition.isPackingNo=response.data.search.isPackingNo
		// [C-CWMS-0051] 出荷梱包No.で検品するかどうか判断するフラグ値の設定 2015/12/08 NayZaw End
		if ($scope.pieceShippingInspectList.length == 0){
			directiveControl.editable($scope, 'janCd', false);
			directiveControl.editable($scope, 'shpCheckDisplay', false);
			$scope.pieceShippingInspecting.shpCheckDisplay = null;
			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG Start
			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana
			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG End
			// [EC-CT1-135] ヘッダー自動開閉 2015.03.27 Sakata Start -->
			$scope.isopen = true;
			// [EC-CT1-135] ヘッダー自動開閉 2015.03.27 Sakata End -->
		}else{
			directiveControl.editable($scope, 'userCd', false);
			directiveControl.editable($scope, 'pickingWorkNo', false);
			directiveControl.editable($scope, 'janCd', true);
			inputform.janCd.disabled = false;
			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG Start
			// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana
			owsCommon.setFirstFocus('inputform');
			// [検査-112] JANCDをフォーカスを修正 2014.12.01 SJA-ZHENG End
			// [EC-CT1-135] ヘッダー自動開閉 2015.03.27 Sakata Start -->
			$scope.isopen = false;
			// [EC-CT1-135] ヘッダー自動開閉 2015.03.27 Sakata End -->
			directiveControl.editable($scope, 'shpCheckDisplay', true);
			$scope.pieceShippingInspecting.shpCheckDisplay = owsCommon.getDefaultValue($scope.shpCheckDisplayList);
			// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正 2015.10.07 kawana Start
			// フィルタテキストを設定
//			$scope.setGridFilterText();
			// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正 2015.10.07 kawana End
		}

		for(i=0;i<$scope.pieceShippingInspectList.length;i++){
			if ($scope.pieceShippingInspectList[i].shippingPackingNo != null){
				if ($scope.pieceShippingInspectList[i].shippingPackingNo > $scope.shippingPackingNo){
					$scope.shippingPackingNo = $scope.pieceShippingInspectList[i].shippingPackingNo;
				}
			}
			// 総検品数
			$scope.instNum = owsCommon.add($scope.instNum, $scope.pieceShippingInspectList[i].instNum);
			// 検品済総数
			$scope.spgQtyOns = owsCommon.add($scope.spgQtyOns, $scope.pieceShippingInspectList[i].spgQtyOns);
		}

		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		// [C-CWMS-0051] 出荷梱包No.で検品する場合、箱登録ボタンを不可に設定する 2015/12/08 NayZaw Start
		if($scope.searchCondition.isPackingNo){
			directiveControl.editable($scope, 'registerBox', false);
		}else{
			directiveControl.editable($scope, 'registerBox', true);
		}
		// [C-CWMS-0051] 出荷梱包No.で検品する場合、箱登録ボタンを不可に設定する 2015/12/08 NayZaw End

		// 未検品のみ表示用にフィルタを設定
		setupGridFilter();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#deferredGetShpCheckDisplay
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShpCheckDisplay = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHP_CHECK_DISPLAY";

		owsCommon.getDataCacheable(api.shpCheckDisplay, request).then(function(response){
			// 未検品のみ表示リスト
			$scope.shpCheckDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 画面項目（表示用）の初期化処理
	var clearViewItem = function() {

		// 商品CD
		$scope.productCd = null;
		// 商品名称
		$scope.productNm = null;
		// 合計口数を設定
		$scope.shippingPackingNo = 0;
		// 検品数
		$scope.instNumT = 0;
		// 検品済数
		$scope.spgQtyOnsT = 0;
		// 指示数
		$scope.instSu = 0;
		// 総検品数
		$scope.instNum = 0;
		// 検品済総数
		$scope.spgQtyOns = 0;
		// ユーザ名称
		$scope.userNm = null;
		// ステータス
		$scope.status = status0;
		// JANCDがクリアする。
		$scope.pieceShippingInspecting.janCd = null;

		directiveControl.editable($scope, 'userCd', true);
		directiveControl.editable($scope, 'pickingWorkNo', true);
		directiveControl.editable($scope, 'janCd', false);
		directiveControl.editable($scope, 'shpCheckDisplay', false);
		// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana

		$scope.pieceShippingInspecting.shpCheckDisplay = null;

		// [EC-CT1-186] 検索エリアと入力エリアにフォームをわけて「検索」ボタンの有効無効制御を行う(不要になった処理の削除) 2015.04.06 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#shippingInterrupt
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 検品中断ボタンを押下された時に処理<br>
	 * 出荷検品中断に登録する
	 *
	 * 出荷検品データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.interrupt = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		// gridOptionMessageControl.hideAll($scope.gridOptions);

		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.pieceShippingInspectList;

		// 確認でOKを選択された場合は、処理を進める。
		if (!owsCommon.viewConfirm("interruptInspectExecuteConfirmation")) {
			return;
		}

		// WebApiのresources/shipping/pieceShippingInspect/shippingInterruptを呼び出し、中断処理を行う。
		api.pieceShippingInspect.shippingInterrupt(request).then(function(execResponse){
			// 処理結果確認
			if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
				var userCd = $scope.searchCondition.userCd;
				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
				// 画面初期化処理を実行
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata Start -->
				$scope.isopen = true;
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata End -->
				$scope.deferredGetInitData(userCd).then(function() {
					// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
		        	$scope.userCdBlur();
		        	directiveControl.firstErrorOnFocus('searchinputform');
		        	// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
				});
				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
				return;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#packingInsert
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 箱登録データの組み立てを行う<br>
	 * エラーがない場合は、データベースに梱包データを登録し、完了メッセージを設定する
	 * 更新データに次の値を設定する
	 * ・出荷ステータス
	 * ・出庫ステータス
	 *
	 */
	$scope.packingInsert = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		// gridOptionMessageControl.hideAll($scope.gridOptions);

		// 出荷検品画面用DTO
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.pieceShippingInspectList;

		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
		//request.data.defaultBox = $scope.defaultBox;
		request.data.weight = $scope.defaultBox.permitWeigh;
		// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

		// WebApiのresources/shipping/pieceShippingInspect/packingInsertを呼び出し、入力データ登録を行う。
		api.pieceShippingInspect.packingInsert(request).then(function(execResponse){

			// [Ver3.1][#5669]梱包数が変わった場合荷札再出力を促すメッセージをモーダルで表示 2018.12.13 matsumoto Start

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(execResponse,'searchinputform')) {
				// エラーダイアログ表示
				modalErrorDialog(owsCommon.convertMessage(execResponse.status.messageCode, execResponse.status.messageReplaceValue, false))
					.then(function() {

					});
				return;
			}

			// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
			// 荷札出力後処理
			var successFunc = function() {

				var userCd = $scope.searchCondition.userCd;

				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
				// 画面初期化処理を実行
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata Start -->
				$scope.isopen = true;
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata End -->
				$scope.deferredGetInitData(userCd).then(function() {
					// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
		        	$scope.userCdBlur();
		        	directiveControl.firstErrorOnFocus('searchinputform');
		        	// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
            	});
				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
			};

			if (execResponse.status.statusCode > 1) {
				// 警告メッセージあり

				modalWarnDialog(owsCommon.convertMessage(execResponse.status.messageCode, execResponse.status.messageReplaceValue, false))
				.then(function() {

					$scope.printTagLabel(successFunc);
				});
			} else {

				$scope.printTagLabel(successFunc);
			}
			// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End

			// [Ver3.1][#5669]梱包数が変わった場合荷札再出力を促すメッセージをモーダルで表示 2018.12.13 matsumoto End

			// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
			// 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
			if($scope.packingSlipAutoOutputFlg === "1"){
				$scope.printPackingSlip(successFunc);
			}
			// Bill of Lading発行
			$scope.billOfLadingPrintShow();

            var zpl = execResponse.data.zplData

            // 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
			if($scope.cesIntegationFlg === "1"){
				if (zpl != null && zpl != ""){
					var printWindow = window.open();
				    printWindow.document.open('text/plain')
				    printWindow.document.write(zpl);
				    printWindow.document.close();
				    printWindow.focus();
				    printWindow.print();
				    printWindow.close();
				}
			}
			// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#pieceShippingInspectClear
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * クリアボタンを押下された時に処理<br>
	 * 下記テーブルにデータを更新する
	 * ・出荷指示ヘッダ
	 * ・出庫ヘッダ
	 * ・出庫ボディ
	 * 下記テーブルにデータを削除する
	 *  ・梱包ヘッダ
	 *  ・梱包ボディ
	 */
	$scope.pieceShippingInspectClear = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		// gridOptionMessageControl.hideAll($scope.gridOptions);

		// 出荷検品画面用DTO
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.pieceShippingInspectList;

		if ($scope.pieceShippingInspectList.length == 0){
			return;
		};

		// 確認でOKを選択された場合は、処理を進める。
		if (!owsCommon.viewConfirm("inspectResultClearInspectingConfirmation")) {
			return;
		}

		// WebApiのresources/shipping/pieceShippingInspect/pieceShippingInspectClear を呼び出し、 クリアを行う。
		api.pieceShippingInspect.pieceShippingInspectClear(request).then(function(execResponse){
			// 処理結果確認
			if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
				var userCd = $scope.searchCondition.userCd;

				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
				// 画面初期化処理を実行
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata Start -->
				$scope.isopen = true;
				// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata End -->
				$scope.deferredGetInitData(userCd).then(function() {
					// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
		        	$scope.userCdBlur();
		        	directiveControl.firstErrorOnFocus('searchinputform');
		        	// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
            	});
				// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
				return
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#registerBox
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 箱登録ボタン押下処理<br>
	 *
	 * 選択行の出荷予定データを修正する為の画面を表示する。
	 */
	$scope.registerBox = function() {
		// 箱登録のモーダル画面を表示

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);
		// gridOptionMessageControl.hideAll($scope.gridOptions);

		// 行がない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.pieceShippingInspectList.length == 0) {
			return;
		}

		// 検品残数
		var boxOk = false;
		for(i=0;i<$scope.pieceShippingInspectList.length;i++){
			if ($scope.pieceShippingInspectList[i].shpCheckDisplay == 0 && owsCommon.isNotZero($scope.pieceShippingInspectList[i].spgQtyOns)){
				boxOk = true;
				break;
			}
		}
		// 検品残数が0の場合、エラーメッセージを表示
		if (boxOk == false ) {
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
			modalErrorDialog(owsCommon.convertMessage('boxTypeCannotRegisterInspectingDataNotFoundError', null, false))
			.then(function(response) {

			});
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
			return;
		};

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
		// 荷材選択スキップ 0：スキップしない、1：スキップする
		if($scope.isBoxSelectSkip === "0"){
			// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
			var items = {
					centerId: $scope.pieceShippingInspectList[0].centerId,
					shippingPackingNo: parseInt($scope.shippingPackingNo) + 1,
					// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
					boxCd: $scope.defaultBox.boxCd,
					// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
					// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
					cesIntegationFlg:$scope.cesIntegationFlg,
					weight:0,
					// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

			};
			var modalInstance = modalFactory.modalInstBoxInput(items);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(selectedItem){

				var request = {};
				// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
				request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
				// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
				request.boxCd = selectedItem.boxCd;
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
				$scope.defaultBox.permitWeigh = selectedItem.weight;
				// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
				api.pieceShippingInspect.boxId(request).then(function(response){
					// 合計口数
					$scope.shippingPackingNo = selectedItem.shippingPackingNo;

					for(i=0;i<$scope.pieceShippingInspectList.length;i++){
						if($scope.pieceShippingInspectList[i].shpCheckDisplay == 0 && owsCommon.isNotZero($scope.pieceShippingInspectList[i].spgQtyOns)){
							if (owsCommon.isEqual($scope.pieceShippingInspectList[i].spgQtyOns, $scope.pieceShippingInspectList[i].instNum)){
								// update Row
								$scope.pieceShippingInspectList[i].shippingPackingNo =  selectedItem.shippingPackingNo;
								$scope.pieceShippingInspectList[i].shpCheckDisplay = 1;
								// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
								$scope.pieceShippingInspectList[i].boxId = +response;
								// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
								$scope.pieceShippingInspectList[i].grossWeight = selectedItem.weight;
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
							}else{
								$scope.pieceShippingInspectList.splice(i,0,angular.copy($scope.blankRow));
								// New Row
								var perNetWeight = $scope.pieceShippingInspectList[i+1].netWeight;
								var perGrossWeight =  $scope.pieceShippingInspectList[i+1].netWeight;

								$scope.pieceShippingInspectList[i].janCd =  $scope.pieceShippingInspectList[i+1].janCd;
								$scope.pieceShippingInspectList[i].productId =  $scope.pieceShippingInspectList[i+1].productId;
								$scope.pieceShippingInspectList[i].productCd =  $scope.pieceShippingInspectList[i+1].productCd;
								$scope.pieceShippingInspectList[i].productNm =  $scope.pieceShippingInspectList[i+1].productNm;
								$scope.pieceShippingInspectList[i].productAbbr =  $scope.pieceShippingInspectList[i+1].productAbbr;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ START
								$scope.pieceShippingInspectList[i].productUnit =  $scope.pieceShippingInspectList[i+1].productUnit;
								$scope.pieceShippingInspectList[i].unitNumBreakdownP =  $scope.pieceShippingInspectList[i+1].unitNumBreakdownP;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ END
								$scope.pieceShippingInspectList[i].instNum =  $scope.pieceShippingInspectList[i+1].spgQtyOns;
								$scope.pieceShippingInspectList[i].spgQtyOns =  $scope.pieceShippingInspectList[i+1].spgQtyOns;
								$scope.pieceShippingInspectList[i].spgQtyRemain =  0;
								$scope.pieceShippingInspectList[i].shippingPackingNo =  selectedItem.shippingPackingNo;
								$scope.pieceShippingInspectList[i].shpCheckDisplay = 1;
								// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
								$scope.pieceShippingInspectList[i].boxId = +response;
								// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
								$scope.pieceShippingInspectList[i].netWeight =  perNetWeight;

								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
//								$scope.pieceShippingInspectList[i].grossWeight =  owsCommon.multiply(perGrossWeight, $scope.pieceShippingInspectList[i].instNum);
								$scope.pieceShippingInspectList[i].grossWeight =  selectedItem.weight;
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
								$scope.pieceShippingInspectList[i].unitNum =  $scope.pieceShippingInspectList[i+1].unitNum;
								$scope.pieceShippingInspectList[i].pickingWorkNo =  $scope.pieceShippingInspectList[i+1].pickingWorkNo;
								$scope.pieceShippingInspectList[i].allocInstHId =  $scope.pieceShippingInspectList[i+1].allocInstHId;

								$scope.pieceShippingInspectList[i].deliveryCourseCd =  $scope.pieceShippingInspectList[i+1].deliveryCourseCd;
								$scope.pieceShippingInspectList[i].deliveryCourseNm =  $scope.pieceShippingInspectList[i+1].deliveryCourseNm;
								$scope.pieceShippingInspectList[i].supplyCustomerCd =  $scope.pieceShippingInspectList[i+1].supplyCustomerCd;
								$scope.pieceShippingInspectList[i].supplyCustomerNm =  $scope.pieceShippingInspectList[i+1].supplyCustomerNm;
								$scope.pieceShippingInspectList[i].carrierCd =  $scope.pieceShippingInspectList[i+1].carrierCd;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ START
								$scope.pieceShippingInspectList[i].mproduct =  $scope.pieceShippingInspectList[i+1].mproduct;
								$scope.pieceShippingInspectList[i].clientId =  $scope.pieceShippingInspectList[i+1].clientId;
								$scope.pieceShippingInspectList[i].centerId =  $scope.pieceShippingInspectList[i+1].centerId;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ END


								// グリッド
								$scope.pieceShippingInspectList[i+1].instNum = owsCommon.subtract($scope.pieceShippingInspectList[i+1].instNum, $scope.pieceShippingInspectList[i+1].spgQtyOns);
								$scope.pieceShippingInspectList[i+1].spgQtyOns = 0 ;
								$scope.pieceShippingInspectList[i+1].spgQtyRemain = $scope.pieceShippingInspectList[i+1].instNum;
								$scope.pieceShippingInspectList[i+1].netWeight =  perNetWeight;
								$scope.pieceShippingInspectList[i+1].grossWeight = owsCommon.multiply(perGrossWeight, $scope.pieceShippingInspectList[i+1].instNum);

								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
								$scope.pieceShippingInspectList[i].grossWeight = selectedItem.weight;
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
							}
						}
					}

					$scope.displayChange();

					// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
					if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
						$scope.packingInsert();
					};

					// 画面ヘッダステータス
					if ($scope.status != status2){
						$scope.status = status2;
					};

					// 選択状態をクリアする
					owsCommon.toggleSelectAll($scope.gridOptions, false);
				});
			});
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
		}
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
		else{
			// 合計口数
			$scope.shippingPackingNo = parseInt($scope.shippingPackingNo) + 1;

			for(i=0;i<$scope.pieceShippingInspectList.length;i++){
				if($scope.pieceShippingInspectList[i].shpCheckDisplay == 0 && owsCommon.isNotZero($scope.pieceShippingInspectList[i].spgQtyOns)){
					if (owsCommon.isEqual($scope.pieceShippingInspectList[i].spgQtyOns, $scope.pieceShippingInspectList[i].instNum) ){
						// update Row
						$scope.pieceShippingInspectList[i].shippingPackingNo =  $scope.shippingPackingNo;
						$scope.pieceShippingInspectList[i].shpCheckDisplay = 1;
						$scope.pieceShippingInspectList[i].boxId = +$scope.defaultBox.boxId;
					}else{
						$scope.pieceShippingInspectList.splice(i,0,angular.copy($scope.blankRow));
						// New Row
						var perNetWeight = $scope.pieceShippingInspectList[i+1].netWeight;
						var perGrossWeight =  $scope.pieceShippingInspectList[i+1].netWeight;

						$scope.pieceShippingInspectList[i].janCd =  $scope.pieceShippingInspectList[i+1].janCd;
						$scope.pieceShippingInspectList[i].productId =  $scope.pieceShippingInspectList[i+1].productId;
						$scope.pieceShippingInspectList[i].productCd =  $scope.pieceShippingInspectList[i+1].productCd;
						$scope.pieceShippingInspectList[i].productNm =  $scope.pieceShippingInspectList[i+1].productNm;
						$scope.pieceShippingInspectList[i].productAbbr =  $scope.pieceShippingInspectList[i+1].productAbbr;
						// [Ver3.0] unit of measure対応 2017.11.27 ライ START
						$scope.pieceShippingInspectList[i].productUnit =  $scope.pieceShippingInspectList[i+1].productUnit;
						$scope.pieceShippingInspectList[i].unitNumBreakdownP =  $scope.pieceShippingInspectList[i+1].unitNumBreakdownP;
						// [Ver3.0] unit of measure対応 2017.11.27 ライ END
						$scope.pieceShippingInspectList[i].instNum =  $scope.pieceShippingInspectList[i+1].spgQtyOns;
						$scope.pieceShippingInspectList[i].spgQtyOns =  $scope.pieceShippingInspectList[i+1].spgQtyOns;
						$scope.pieceShippingInspectList[i].spgQtyRemain =  0;
						$scope.pieceShippingInspectList[i].shippingPackingNo =  $scope.shippingPackingNo;
						$scope.pieceShippingInspectList[i].shpCheckDisplay = 1;
						$scope.pieceShippingInspectList[i].boxId = +$scope.defaultBox.boxId;
						$scope.pieceShippingInspectList[i].netWeight =  perNetWeight;
						$scope.pieceShippingInspectList[i].grossWeight =  owsCommon.multiply(perGrossWeight, $scope.pieceShippingInspectList[i].instNum);
						$scope.pieceShippingInspectList[i].unitNum =  $scope.pieceShippingInspectList[i+1].unitNum;
						$scope.pieceShippingInspectList[i].pickingWorkNo =  $scope.pieceShippingInspectList[i+1].pickingWorkNo;
						$scope.pieceShippingInspectList[i].allocInstHId =  $scope.pieceShippingInspectList[i+1].allocInstHId;

						$scope.pieceShippingInspectList[i].deliveryCourseCd =  $scope.pieceShippingInspectList[i+1].deliveryCourseCd;
						$scope.pieceShippingInspectList[i].deliveryCourseNm =  $scope.pieceShippingInspectList[i+1].deliveryCourseNm;
						$scope.pieceShippingInspectList[i].supplyCustomerCd =  $scope.pieceShippingInspectList[i+1].supplyCustomerCd;
						$scope.pieceShippingInspectList[i].supplyCustomerNm =  $scope.pieceShippingInspectList[i+1].supplyCustomerNm;
						$scope.pieceShippingInspectList[i].carrierCd =  $scope.pieceShippingInspectList[i+1].carrierCd;

						// グリッド
						$scope.pieceShippingInspectList[i+1].instNum = owsCommon.subtract($scope.pieceShippingInspectList[i+1].instNum, $scope.pieceShippingInspectList[i+1].spgQtyOns);
						$scope.pieceShippingInspectList[i+1].spgQtyOns = 0 ;
						$scope.pieceShippingInspectList[i+1].spgQtyRemain = $scope.pieceShippingInspectList[i+1].instNum;
						$scope.pieceShippingInspectList[i+1].netWeight =  perNetWeight;
						$scope.pieceShippingInspectList[i+1].grossWeight = owsCommon.multiply(perGrossWeight, $scope.pieceShippingInspectList[i+1].instNum);
					}
				}
			}

			$scope.displayChange();

			// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
			if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
				$scope.packingInsert();
			};

			// 画面ヘッダステータス
			if ($scope.status != status2){
				$scope.status = status2;
			};

			// 選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);
		};
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#registerBox
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 数量入力ボタン押下処理<br>
	 *
	 * 選択行の出荷予定データを修正する為の画面を表示する。
	 */
	$scope.registerSu = function() {

		// 数量入力ボタンを押下された時に処理数量入力画面をモーダル表示する

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);
		// gridOptionMessageControl.hideAll($scope.gridOptions);

		// 行が選択されていない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
			modalErrorDialog(owsCommon.convertMessage('lineNotSelectError', null, false))
			.then(function(response) {

			});
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
			return;
		};
		// 複数行が選択されている場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1){
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto Start
			modalErrorDialog(owsCommon.convertMessage('onlyOneSelect', null, false))
			.then(function(response) {

			});
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.09.11 matsumoto End
			return;
		};

		// ===== 数量入力画面呼び出し =====
		var selectedRow = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		var rowIndex = -1;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.pieceShippingInspectList.indexOf(row) > -1) {
				rowIndex = $scope.pieceShippingInspectList.indexOf(row);
			}
		});

// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
		$scope.deferredGetUnitNum(selectedRow.clientId, selectedRow.centerId, selectedRow.productId).then(function() {
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End

		var spgQtyOnsTemp = selectedRow.spgQtyOns;
		var items = {
				centerId: selectedRow.centerId,
				janCd: selectedRow.janCd,
				productCd : selectedRow.productCd,
				productNm : selectedRow.productNm,
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
				productUnit:selectedRow.productUnit,
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				instNumP  : 0,
				spgQtyOnsP: selectedRow.spgQtyOns,
				instSuP   : selectedRow.instNum,
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
				unitNumBreakdownP: selectedRow.unitNumBreakdownP,
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				mproduct : selectedRow.mproduct,
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 Start
				unitNumP  : $scope.unitNumPieceShape,
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 End
				caseNumP  : null,
				boxCdP    : null,
				instNumC  : null,
				spgQtyOnsC: selectedRow.spgQtyOns,
				instSuC   : selectedRow.instNum,
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 Start
				unitNumC  : $scope.unitNumCaseShape,
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 End
				caseNumC  : 0,
				boxCdC    : null,
				shippingPackingNo: $scope.shippingPackingNo
		};
		var modalInstance = modalFactory.modalInstSuInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			if (selectedItem.curTab == "piece"){
				// {ver3.1][#5235] 音が鳴るまで次の検品を不可にする 2018.10.02 matsumoto Start
				// janCd入力不可
				directiveControl.editable($scope, 'janCd', false);
				// {ver3.1][#5235] 音が鳴るまで次の検品を不可にする 2018.10.02 matsumoto End

				// ===== 対応するJANCDのデータを以下の設定を行う。 =====
				// 商品CD
				$scope.productCd = selectedRow.productCd;
				// 商品名称
				$scope.productNm = selectedRow.productNm;
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
				// 商品?位
				$scope.productUnit = selectedRow.productUnit;
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				// 画面ヘッダ検品数
				$scope.instNumT = selectedItem.instNumP;
				// 画面ヘッダ検品済数
				$scope.spgQtyOnsT = selectedItem.spgQtyOnsP;
				// 画面ヘッダ指示数
				$scope.instSu = selectedRow.instNum;
				// 検品済総数
				$scope.spgQtyOns = owsCommon.add($scope.spgQtyOns, selectedItem.instNumP);

				selectedRow.spgQtyOns = selectedItem.spgQtyOnsP;

				selectedRow.spgQtyRemain = owsCommon.subtract(selectedRow.instNum, selectedRow.spgQtyOns);

				// 画面ヘッダステータス
				if ($scope.status == status0){
					$scope.status = status1;
				};

				if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
					// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/08 NayZaw Start
					if($scope.searchCondition.isPackingNo){
						// 出荷梱包No.で検品する場合、箱登録画面で登録しないで、梱包ボディテーブルを更新する。

						// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
						// 荷材選択スキップ 0：スキップしない、1：スキップする
						if($scope.isBoxSelectSkip === "0"){
							var itemsBoxs = {
									centerId: selectedRow.centerId,
									shippingPackingNo: parseInt($scope.shippingPackingNo) + 1,
									boxCd: $scope.defaultBox.boxCd,
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
									cesIntegationFlg:$scope.cesIntegationFlg,
									weight:0,
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
								};
							var modalInstanceBoxs = modalFactory.modalInstBoxInput(itemsBoxs);
							// モーダル画面が閉じられたら呼ばれるファンクションの登録
							modalInstanceBoxs.result.then(function(retItems){
								var request = {};
								request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
								request.boxCd = retItems.boxCd;
								api.pieceShippingInspect.boxId(request).then(function(response){
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
									// 出荷検品画面用DTO
									var request = {};
									request.data = {};
									request.data.search = $scope.searchCondition;
									request.data.list = $scope.pieceShippingInspectList;
									$scope.defaultBox.boxId = +response;
									request.data.defaultBox = $scope.defaultBox;

									// WebApiのresources/shipping/pieceShippingInspect/packingInsertを呼び出し、入力データ登録を行う。
									api.pieceShippingInspect.packingInsert(request).then(function(execResponse){
										// 処理結果確認
										if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {

											// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
											// 荷札出力後処理
											var successFunc = function() {

												var userCd = $scope.searchCondition.userCd;

												// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
												// 画面初期化処理を実行
												// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata Start -->
												$scope.isopen = true;
												// [EC-CT1-135] ヘッダー自動開閉 2015.03.20 Sakata End -->
												$scope.deferredGetInitData(userCd).then(function() {
													// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
										        	$scope.userCdBlur();
										        	directiveControl.firstErrorOnFocus('searchinputform');
										        	// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 Start
								            	});
												// [ON推-品向-484] 画面初期化処理を実行時、不備があるので、修正した。2014.12.24 許 End
											};

											// 荷札出力実行
											$scope.printTagLabel(successFunc);
											// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
											// 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
											if($scope.packingSlipAutoOutputFlg === "1"){
												$scope.printPackingSlip(successFunc);
											}
											// Bill of Lading発行
											$scope.billOfLadingPrintShow();
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
											return;
										}
									});
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
								});
							});
						}
						else{
							// 出荷検品画面用DTO
							var request = {};
							request.data = {};
							request.data.search = $scope.searchCondition;
							request.data.list = $scope.pieceShippingInspectList;
							request.data.defaultBox = $scope.defaultBox;

							// WebApiのresources/shipping/pieceShippingInspect/packingInsert を呼び出し、入力データ登録を行う。
							api.pieceShippingInspect.packingInsert(request).then(function(execResponse){
								// 処理結果確認
								if (statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {

									// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana Start
									// 荷札出力後処理
									var successFunc = function() {

										var userCd = $scope.searchCondition.userCd;
										// 画面初期化処理を実行
										$scope.isopen = true;
										$scope.deferredGetInitData(userCd).then(function() {
								        	$scope.userCdBlur();
								        	directiveControl.firstErrorOnFocus('searchinputform');
						            	});
									};

									// 荷札出力実行
									$scope.printTagLabel(successFunc);
									// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.08 kawana End
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
									// 自動発行処理はパラメータマスタ.納品明細書自動発行フラグが'1'(連携する)場合
									if($scope.packingSlipAutoOutputFlg === "1"){
										$scope.printPackingSlip(successFunc);

									}
									// Bill of Lading発行
									$scope.billOfLadingPrintShow();
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
									return;
								}
							});
						}
						// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
					}
					// 出荷梱包No以外で検品する場合、処理(出庫作業No）
					else{
						// 出荷梱包No.で検品する以外場合、
						// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
						// 荷材選択スキップ 0：スキップしない、1：スキップする
						if($scope.isBoxSelectSkip === "0"){
							// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
							var itemsBoxs = {
									centerId: selectedRow.centerId,
									shippingPackingNo: parseInt($scope.shippingPackingNo) + 1,
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
									boxCd: $scope.defaultBox.boxCd,
									// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
									cesIntegationFlg:$scope.cesIntegationFlg,
									weight:0,
									// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
								};
							var modalInstanceBoxs = modalFactory.modalInstBoxInput(itemsBoxs);
							// モーダル画面が閉じられたら呼ばれるファンクションの登録
							modalInstanceBoxs.result.then(function(retItems){

								var request = {};
								// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
								request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
								// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
								request.boxCd = retItems.boxCd;
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
								$scope.defaultBox.permitWeigh = retItems.weight;;
								// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
								api.pieceShippingInspect.boxId(request).then(function(response){
									// 合計口数
									$scope.shippingPackingNo = retItems.shippingPackingNo;

									for(j=0;j<$scope.pieceShippingInspectList.length;j++){
										if ($scope.pieceShippingInspectList[j].shpCheckDisplay == 0){
											// update Row
											$scope.pieceShippingInspectList[j].shippingPackingNo =  retItems.shippingPackingNo;
											$scope.pieceShippingInspectList[j].shpCheckDisplay = 1;
											// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
											$scope.pieceShippingInspectList[j].boxId = +response;
											// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
											$scope.pieceShippingInspectList[j].grossWeight = retItems.weight;
											// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
										}
									}

									$scope.displayChange();

									// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する

									$scope.packingInsert();
	// //選択状態をクリアする
	// $scope.gridOptions.ngGrid.rowFactory.selectionProvider.toggleSelectAll(false,
	// true);
								});
							});
						// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja Start
						}
						else{
							// 合計口数
							$scope.shippingPackingNo = parseInt($scope.shippingPackingNo) + 1;

							for(j=0;j<$scope.pieceShippingInspectList.length;j++){
								if ($scope.pieceShippingInspectList[j].shpCheckDisplay == 0){
									// update Row
									$scope.pieceShippingInspectList[j].shippingPackingNo =  $scope.shippingPackingNo;
									$scope.pieceShippingInspectList[j].shpCheckDisplay = 1;
									$scope.pieceShippingInspectList[j].boxId = +$scope.defaultBox.boxId;
								}
							}
							$scope.displayChange();
							// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
							$scope.packingInsert();
						};
						// Ver２．１向けエンハンス C-CWMS-0055 2016.06.06 sja End
					}
					// [C-CWMS-0051] 出荷梱包No．で検品する場合為処理追加 2015/12/08 NayZaw End
				};
				// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto Start
				if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
					// 1伝票分検品終了した場合
					$scope.inspCompSoundPlay();
				} else {
					$scope.inspSoundPlay();
				}
				// テキスト入力可に変更
				directiveControl.editable($scope, 'janCd', true);
				// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto End

				// 選択状態をクリアする
				owsCommon.toggleSelectAll($scope.gridOptions, false);
			}else{
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 Start
				selectedRow.unitNum = $scope.unitNumCaseShape;
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 修正 End
				var request = {};
				// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
				request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
				// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
				request.boxCd = selectedItem.boxCd;
				api.pieceShippingInspect.boxId(request).then(function(response){

					// 検品済総数
					$scope.spgQtyOns = owsCommon.add($scope.spgQtyOns, selectedItem.instNumC);
					// 画面ヘッダ検品済数
					$scope.spgQtyOnsT = selectedItem.spgQtyOnsC;
					// 画面ヘッダ検品数
					$scope.instNumT = selectedItem.instNumC;

					for(j=$scope.shippingPackingNo + 1 ;j<=selectedItem.shippingPackingNo;j++){

						if (j == selectedItem.shippingPackingNo && owsCommon.isEqual(selectedRow.spgQtyRemain, selectedRow.unitNum)  ){
							// update row
							selectedRow.spgQtyOns = selectedRow.unitNum ;
							selectedRow.spgQtyRemain = 0;
							selectedRow.shippingPackingNo =  j;
							selectedRow.shpCheckDisplay = 1;
							// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
							selectedRow.boxId = +response;
							// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End

							// 合計口数
							$scope.shippingPackingNo = $scope.shippingPackingNo + 1;


						}else{
							// insert row
							$scope.pieceShippingInspectList.splice(rowIndex,0,angular.copy($scope.blankRow));
							// New Row
							var perNetWeight = selectedRow.netWeight;
							var perGrossWeight =  selectedRow.netWeight;

							$scope.pieceShippingInspectList[rowIndex].janCd = selectedRow.janCd;
							$scope.pieceShippingInspectList[rowIndex].productId =  selectedRow.productId;
							$scope.pieceShippingInspectList[rowIndex].productCd =  selectedRow.productCd;
							$scope.pieceShippingInspectList[rowIndex].productNm =  selectedRow.productNm;
							$scope.pieceShippingInspectList[rowIndex].productAbbr =  selectedRow.productAbbr;
							// [Ver3.0] unit of measure対応 2017.11.27 ライ START
							$scope.pieceShippingInspectList[rowIndex].productUnit = selectedRow.productUnit;
							// [Ver3.0] unit of measure対応 2017.11.27 ライ END
							$scope.pieceShippingInspectList[rowIndex].instNum =  selectedRow.unitNum;
							$scope.pieceShippingInspectList[rowIndex].spgQtyOns =  selectedRow.unitNum;
							$scope.pieceShippingInspectList[rowIndex].spgQtyRemain =  0;
							$scope.pieceShippingInspectList[rowIndex].shippingPackingNo =  j;
							$scope.pieceShippingInspectList[rowIndex].shpCheckDisplay = 1;
							// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
							$scope.pieceShippingInspectList[rowIndex].boxId = +response;
							// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
							$scope.pieceShippingInspectList[rowIndex].netWeight =  perNetWeight;
							$scope.pieceShippingInspectList[rowIndex].grossWeight =  owsCommon.multiply(perGrossWeight, selectedRow.unitNum);
							$scope.pieceShippingInspectList[rowIndex].unitNum =  selectedRow.unitNum;
							$scope.pieceShippingInspectList[rowIndex].pickingWorkNo =  selectedRow.pickingWorkNo;
							$scope.pieceShippingInspectList[rowIndex].allocInstHId =  selectedRow.allocInstHId;
							$scope.pieceShippingInspectList[rowIndex].deliveryCourseCd =  selectedRow.deliveryCourseCd;
							$scope.pieceShippingInspectList[rowIndex].deliveryCourseNm =  selectedRow.deliveryCourseNm;
							$scope.pieceShippingInspectList[rowIndex].supplyCustomerCd =  selectedRow.supplyCustomerCd;
							$scope.pieceShippingInspectList[rowIndex].supplyCustomerNm =  selectedRow.supplyCustomerNm;
							$scope.pieceShippingInspectList[rowIndex].carrierCd = selectedRow.carrierCd;

							// 合計口数
							$scope.shippingPackingNo = $scope.shippingPackingNo + 1;

							// グリッド
							selectedRow.instNum = owsCommon.subtract(selectedRow.instNum, selectedRow.unitNum);
							selectedRow.spgQtyOns = 0 ;
							selectedRow.spgQtyRemain = selectedRow.instNum;
							selectedRow.netWeight =  perNetWeight;
							selectedRow.grossWeight = owsCommon.multiply(perGrossWeight, selectedRow.instNum);
						}
					}

					$scope.displayChange();

					// 検品残数
					var shiPPackingNo = false;
					for(i=0;i<$scope.pieceShippingInspectList.length;i++){
						if ($scope.pieceShippingInspectList[i].shpCheckDisplay == 0 ){
							shiPPackingNo = true;
							break;
						}
					}

					// 総検品数＝検品済総数の場合、箱登録画面をモーダルで表示する
					if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns) && shiPPackingNo == false){
						$scope.packingInsert();
					};

					// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto Start
					if (owsCommon.isEqual($scope.instNum, $scope.spgQtyOns)){
						// 1伝票分検品終了した場合
						$scope.inspCompSoundPlay();
					} else {
						$scope.inspSoundPlay();
					}
					// テキスト入力可に変更
					directiveControl.editable($scope, 'janCd', true);
					// [Ver3.1][#5117][#5235]検品数がインクリメント時に正常音を出す 2018.10.15 matsumoto End

					// 選択状態をクリアする
					owsCommon.toggleSelectAll($scope.gridOptions, false);
				});
			};
			// 画面ヘッダステータス
			if ($scope.status != status2){
				$scope.status = status2;
			};

			// ===== 対応するJANCDのデータを以下の設定を行う。 =====
			// 商品CD
			$scope.productCd = selectedRow.productCd;
			// 商品名称
			$scope.productNm = selectedRow.productNm;
			// 指示数
			$scope.instSu = selectedRow.instNum;

		});
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
	  });
// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End
	};

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#printTagLabel
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 荷札発行処理<br>
	 *
	 */
	$scope.printTagLabel = function(successFunc) {

		// [Ver3.1][#5117]荷札自動発行ロジック変更に伴い荷札出力フラグの条件文削除 2018.09.19 matsumoto Del

		var request = {};
		request.data = {
				centerId            : userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd),
				clientId            : userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd),
				targetNo            : $scope.searchCondition.pickingWorkNo,
				isShippingPackingNo : $scope.searchCondition.isPackingNo
		};

		// ===== 荷札自動印刷 =====
		api.pieceShippingInspect.printAutoTagLabel(request).then(function(response) {
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.12.13 matsumoto Start
			if (!statusInfo.isSuccess(response,'searchinputform')) {
				// エラーダイアログ表示
				modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function() {

						successFunc();
					});
			} else {

				successFunc();
			}
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.12.13 matsumoto End
		}).catch(function(response) {

			successFunc();
		});
	};

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End

	// 米国出荷ドキュメント追加対応 2017.01.16 HAN Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#printPackingSlip
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description Packing Slipの自動発行処理<br>
	 *
	 * 納品明細書自動発行フラグ='1'(連携する)はPacking Slip自動印刷をする。
	 */
	$scope.printPackingSlip = function(successFunc) {

		if ($scope.packingSlipAutoOutputFlg != '1') {
			successFunc();
			return;
		}
		optionMessageControl.hideAll($scope);
		var request = {};
		request.data = {
				centerId            : userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd),
				clientId            : userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd),
				targetNo            : $scope.searchCondition.pickingWorkNo,
				isShippingPackingNo : $scope.searchCondition.isPackingNo
		};

		// PackingSlipList発行
		api.pieceShippingInspect.printPackingSlip(request).then(function(response){
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.12.13 matsumoto Start
			if (!statusInfo.isSuccess(response,'searchinputform')) {
				// エラーダイアログ表示
				modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function() {

						successFunc();
					});
			} else {

				successFunc();
			}
			// [Ver3.1][#5117]エラーをモーダルで表示する 2018.12.13 matsumoto End
		}).catch(function(response) {

			successFunc();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#billOfLadingPrintShow
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description Bill of Lading発行画面表示<br>
	 *
	 * Bill of Lading発行画面を表示する。
	 */
	$scope.billOfLadingPrintShow = function() {
		// Bill of Lading出力対象フラグ＝１：対象の場合
		if($scope.bolOutputTargetFlg === "1"){
			// Bill of Lading発行画面へ遷移
			$location.path("wms/shipping/BillOfLadingPrint").search({});
		}

	};
	// 米国出荷ドキュメント追加対応 2017.01.16 HAN End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#gridDblClick
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("registerSu", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#getClassForRow
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color;
		if (owsCommon.isZero(row.entity.spgQtyRemain) ) {// 検品済
			color = "wmslegendlightblue";
		}else if (owsCommon.isPositive(row.entity.spgQtyRemain) && owsCommon.isPositive(row.entity.spgQtyOns) ) { // 検品中
			color = "wmslegendpink";
		}
		return color;
	};

	// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正 2015.10.07 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PieceShippingInspect.object:PieceShippingInspect#setupGridFilter
	 * @methodOf oneslogiWms.PieceShippingInspect.object:PieceShippingInspect
	 *
	 * @description グリッドオプションのフィルタを設定<br>
	 *
	 */
	var setupGridFilter = function() {

		// フィルタを有効に変更
		$scope.gridOptions.enableFiltering = true;
		for (i = 0; i < $scope.gridOptions.columnDefs.length; i++) {
			if ($scope.gridOptions.columnDefs[i].field == 'shpCheckDisplay') {

				shpCheckDisplay = $scope.gridOptions.gridApi.grid.columns[i];
			} else {
				// 非表示項目以外はフィルタを無効に設定 (有効だとフィルタ用のテキストボックスが表示される)
				$scope.gridOptions.columnDefs[i].enableFiltering = false;
			}
		}

		// 列の変更を適用
		$scope.gridOptions.gridApi.core.notifyDataChange('column');
	};
	// [ON推-品向-970] 出荷検品の列を変更すると箱登録画面が表示されない不具合を修正 2015.10.07 kawana End

// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start

	$scope.unitNumPieceShape = 0;// ピース荷姿の入数
	$scope.unitNumCaseShape = 0;// ケース荷姿の入数

	$scope.deferredGetUnitNum = function(clientId, centerId, productId) {
		var deferred = $q.defer();

		var request = {};
		request.clientId = clientId;
		request.centerId = centerId;
		request.productId = productId;

		api.pieceShippingInspect.getUnitNum(request).then(function(response) {

			$scope.unitNumPieceShape = response.data.unitNumP;
			$scope.unitNumCaseShape = response.data.unitNumC;

			deferred.resolve();
		});

		return deferred.promise;
	};

// [C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End

	// [Ver3.1][#5117]エラーをモーダルで表示する 2018.10.15 matsumoto Start
	/**
	 * エラーダイアログ表示
	 */
	var modalErrorDialog = function(message) {

		var items = {};
		items.message = message;
		if ($scope.errorSoundPlayFlg === '1') {
			// エラー音「1：再生する」場合
			items.sound = true;
		} else {
			items.sound = false;
		}
		var modalInstance = modalFactory.modalLargeErrorDialog(items);

		return modalInstance.result;
	};

	/**
	 * 警告ダイアログ表示
	 */
	var modalWarnDialog = function(message) {

		var items = {};
		items.message = message;
		if ($scope.warnSoundPlayFlg === '1') {
			// エラー音「1：再生する」場合
			items.sound = true;
		} else {
			items.sound = false;
		}
		var modalInstance = modalFactory.modalLargeWarnDialog(items);

		return modalInstance.result;
	}
	// [Ver3.1][#5117]エラーをモーダルで表示する 2018.10.15 matsumoto End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
