/**
 * @ngdoc overview
 * @name oneslogiWms.AttendanceEntry
 *
 * @description 出退勤・休憩入力
 */
angular.module('oneslogiWms.AttendanceEntry',[])

/**
 * @ngdoc service
 * @name oneslogiWms.AttendanceEntry.service:attendanceEntryApi
 *
 * @description 出退勤・休憩入力WebApi定義
 *
 */
.factory('attendanceEntryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		attendanceEntry: AngularAPIClient.make(
				[
				 ['init',               'GET',  'resources/operation/attendanceEntry/init'],
				 ['inputCheck',         'GET',  'resources/operation/attendanceEntry/inputCheck'],
				 ['attendanceRegister', 'POST', 'resources/operation/attendanceEntry/attendanceRegister'],
				 ['leavingRegister',   'POST', 'resources/operation/attendanceEntry/leavingRegister'],
				 ['startRestRegister',  'POST', 'resources/operation/attendanceEntry/startRestRegister'],
				 ['endRestRegister',    'POST', 'resources/operation/attendanceEntry/endRestRegister']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry
 *
 * @description 出退勤・休憩入力コントローラ
 */
.controller('AttendanceEntry', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'attendanceEntryApi', '$window', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, $window) {


	// 出退勤・休憩のステータスを管理するオブジェクト
	var StateObj = function() {
		this.STATE = Object.freeze({
			'ATTENDANCE' : 1<<0,
			'LEAVING'    : 1<<1,
			'START_REST' : 1<<2,
			'END_REST'   : 1<<3
		});
		this.status = null;
	};

	// 出退勤・休憩のステータスを管理するオブジェクトのprototype
	StateObj.prototype = {
			reset : function() {
				this.status = null;
			},
			isStatus : function() {
				return this.status;
			},
			setAttendance : function() {
				this.status = this.STATE.ATTENDANCE;
			},
			setLeaving : function() {
				this.status = this.STATE.LEAVING;
			},
			setStartRest : function() {
				this.status = this.STATE.START_REST;
			},
			setEndRest : function() {
				this.status = this.STATE.END_REST;
			},
			hasAttnedance : function() {
				return this.status & this.STATE.ATTENDANCE;
			},
			hasLeaving : function() {
				return this.status & this.STATE.LEAVING;
			},
			hasStartRest : function() {
				return this.status & this.STATE.START_REST;
			},
			hasEndRest : function() {
				return this.status & this.STATE.END_REST;
			}
	}

	// functionでの引数情報の型チェック用オブジェクト
	var TypeCheck = function() {};

	// 型チェック用オブジェクトのprototype
	TypeCheck.prototype = {
			/**
			 * 引数情報の型がDate型かのチェック関数。
			 */
			typeCheckForDate: function(date) {
				if(Object.prototype.toString.call(date).slice(8, -1) !== 'Date') {
					throw new TypeError('Please specify a Date type.\n\targument：' + Object.prototype.toString.call(date).slice(8, -1));
				}
			},
			/**
			 * 引数情報の型がString型かのチェック関数。
			 */
			typeCheckForString: function(str) {
				if(Object.prototype.toString.call(str).slice(8, -1) !== 'String') {
					throw new TypeError('Please specify a String type.\n\targument：' + Object.prototype.toString.call(date).slice(8, -1));
				}
			}
	}

	// 日時フォーマット用オブジェクト
	var Format = function(typeCheck) {
		this.format = null;
		this.date = null;

		this.registerFlg = false;

		if(!(typeCheck instanceof TypeCheck)) {
			return new Format(new TypeCheck());
		}
		this.typeCheck = typeCheck;
	}

	// 日時フォーマット用オブジェクトのprototype
	Format.prototype = {
			isFormatOfYear: function() {
				return this.format.indexOf('yyyy') !== -1;
			},
			isFormatOfMonth: function() {
				return this.format.indexOf('MM') !== -1;
			},
			isFormatOfDay: function() {
				return this.format.indexOf('dd') !== -1;
			},
			isFormatOfHour: function() {
				return this.format.indexOf('HH') !== -1;
			},
			isFormatOfMinuts: function() {
				return this.format.indexOf('mm') !== -1;
			},
			isFormatOfSecound: function() {
				return this.format.indexOf('ss') !== -1;
			},
			setFormat: function(format) {
				this.typeCheck.typeCheckForString(format);
				this.format = format;
			},
			setDate: function(date) {
				this.typeCheck.typeCheckForDate(date);
				this.date = date;
			},
			onRegister: function() {
				this.registerFlg = true;
			},
			offRegister: function() {
				this.registerFlg = false;
			},
			/**
			 * 日付のフォーマッター。
			 */
			getFormatDt: function() {

				if(this.isFormatOfYear(this.format) || this.isFormatOfMonth(this.format) || this.isFormatOfDay(this.format)) {
					this.format = this.format.replace(/yyyy/g, this.date.getFullYear());
					this.format = this.format.replace(/MM/g, ('0' + (this.date.getMonth() + 1)).substr(-2));
					this.format = this.format.replace(/dd/g, ('0' + this.date.getDate()).substr(-2));

					return this.format;
				}

				throw new SyntaxError('Be sure to set either "y", "M" or "d" for the character format\n\targument: ' + this.format);

			},
			/**
			 * 時間のフォーマッター。
			 */
			getFormatTm: function() {

				if(this.isFormatOfHour(this.format) || this.isFormatOfMinuts(this.format) || this.isFormatOfSecound(this.format)) {
					var hours = this.date.getHours();
					this.format = this.registerFlg ? this.format.replace(/HH/g, ('0' + hours).substr(-2)) : this.format.replace(/HH/g, hours);

					this.format = this.format.replace(/mm/g, ('0' + this.date.getMinutes()).substr(-2));
					this.format = this.format.replace(/ss/g, ('0' + this.date.getSeconds()).substr(-2));

					return this.format;
				}

				throw new SyntaxError('Be sure to set either "H", "m" or "s" for the character format\n\targument: ' + this.format);
			}
	}

	/**
	 * 画面に表示する時間をリアルタイムで取得し、描画する。
	 */
	function setDateTimeNow() {
		 $scope.format.setFormat('HH:mm:ss');
		 $scope.format.setDate(new Date());
		var format_time_str = $scope.format.getFormatTm();

		$('#time_now').text(format_time_str);
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#initScreen
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 出退勤・休憩でのステータスオブジェクトのインスタンス化
		$scope.STATE = new StateObj();

		//
		$scope.format = new Format();

		// 現在の時間を取得し、画面に描画する。
		setDateTimeNow(new Date());

		// 1秒単位で実行し時間を取得する。
		setInterval(function() {

			setDateTimeNow();

		}, 1000);

		$scope.head = {
				centerCd: userInfo.centerCd,
				clientCd: userInfo.clientCd
		};

		$scope.userCd = userInfo.userCd;

        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntryt#initScreenHttp
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
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
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			$scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntryt#deferredGetInitData
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 画面初期化データ設定（同期処理）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var request = {};
		request.data = {};
		request.data.head = {
				centerCd: $scope.head.centerCd
		};

		api.attendanceEntry.init(request).then(function(response){
			$scope.dto = response.data;
			//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka Start
			if ($scope.dto.head.passwordFlg == "1") {
				$scope.byPasswordisShow = true;
			} else {
				$scope.byPasswordisShow = false;
			}
			//[ONEsLOGI 労務管理][#6695]出退勤・休憩入力機能でパスワード入力機能の切替をプロパティ化 2019.09.12 tanaka End
			// オブジェクトにキーを増やせないよう設定
			Object.preventExtensions($scope.dto);
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#selectAttendance
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 出勤ボタン押下処理<br>
	 *
	 * 出勤ボタン押下で、ステータスを出勤にする。
	 */
	$scope.selectAttendance = function() {
		$scope.STATE.setAttendance();

		userCdFocus();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#selectLeaveWork
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 退勤ボタン押下処理<br>
	 *
	 * 退勤ボタン押下で、ステータスを退勤にする。
	 */
	$scope.selectLeaveWork = function() {
		$scope.STATE.setLeaving();

		userCdFocus();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#selectStartBreak
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 休憩開始ボタン押下処理<br>
	 *
	 * 休憩開始ボタン押下で、ステータスを休憩開始にする。
	 */
	$scope.selectStartBreak = function() {
		$scope.STATE.setStartRest();

		userCdFocus();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#selectEndBreak
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 休憩終了ボタン押下処理<br>
	 *
	 * 休憩終了ボタン押下で、ステータスを休憩終了にする。
	 */
	$scope.selectEndBreak = function() {
		$scope.STATE.setEndRest();

		userCdFocus();
	}

	/**
	 * ユーザCDにフォーカスをあてる。
	 */
	function userCdFocus() {
		//$('#userCd').find('input').focus();
		document.getElementById("userCdValue").focus();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#userRegister
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * ユーザ作業ログ登録処理<br>
	 *
	 * 作業ボタン押下で、ユーザ作業ログテーブルにこのユーザは、この作業をしている。というログを登録する。
	 */
	$scope.userRegister = function() {

		if(!$scope.STATE.isStatus()) {
			viewModalError("notAttendanceLeaveWorkRestSelectedError");

			// ユーザCDを未入力にする
			$scope.head.userCdValue = '';
			$scope.head.password = '';

			return ;
		}

		// 現在の日時を設定
		$scope.format.setDate(new Date());

		// dtoを定義
		var dto = angular.copy($scope.dto);
		// ヘッダ情報を格納
		dto.head.workUserCd = $scope.head.userCdValue;
		dto.head.passWord = $scope.head.password;
		dto.head.systemDt = userInfo.systemDt;

		$scope.format.setFormat('yyyyMMdd');
		dto.head.workDt = $scope.format.getFormatDt();

		$scope.format.setFormat('HH:mm:ss');
		dto.head.workTm = $scope.format.getFormatTm();

		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		dto.head.centerCd = $scope.head.centerCd;
		dto.head.clientId = userInfo.clientId;
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		// ユーザCDを未入力にする
		$scope.head.userCdValue = '';
		$scope.head.password = '';

		if($scope.STATE.hasAttnedance()) {
			attendanceRegister(dto);
		}
		else if($scope.STATE.hasLeaving()) {
			leavingRegister(dto);
		}
		else if($scope.STATE.hasStartRest()) {
			startRestRegister(dto);
		}
		else if($scope.STATE.hasEndRest()) {
			endRestRegister(dto);
		}

		// 出退勤・休憩でのステータスをリセットする
		$scope.STATE.reset();
	}

	/**
	 * 出勤処理実行。
	 * 出勤情報をオブジェクトにセットする。
	 */
	function attendanceRegister(dto) {

		$scope.format.onRegister();

		$scope.format.setFormat('yyyyMMdd');
		var localDateStr = $scope.format.getFormatDt();

		$scope.format.setFormat('HHmm');
		var localDateTimeStr = $scope.format.getFormatTm();

		dto.attendance = {
				entryStartDt: localDateStr,
				entryStartTm: localDateTimeStr
		}

		$scope.format.offRegister();

		register(api.attendanceEntry.attendanceRegister, dto);
	}

	/**
	 * 退勤処理実行。
	 * 退勤情報をオブジェクトにセットする。
	 */
	function leavingRegister(dto) {

		$scope.format.onRegister();

		$scope.format.setFormat('yyyyMMdd');
		var localDateStr = $scope.format.getFormatDt();

		$scope.format.setFormat('HHmm');
		var localDateTimeStr = $scope.format.getFormatTm();

		dto.leaving = {
				entryEndDt: localDateStr,
				entryEndTm: localDateTimeStr
		}

		$scope.format.offRegister();

		register(api.attendanceEntry.leavingRegister, dto);
	}

	/**
	 * 休憩開始処理実行。
	 * 休憩開始情報をオブジェクトにセットする。
	 */
	function startRestRegister(dto) {

		$scope.format.onRegister();

		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		$scope.format.setFormat('yyyyMMdd');
		var localDateStr = $scope.format.getFormatDt();

		$scope.format.setFormat('HHmm');
		var localDateTimeStr = $scope.format.getFormatTm();

		dto.startRest = {
				breakStartDt: localDateStr,
				breakStartTm: localDateTimeStr
		}
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		$scope.format.offRegister();

		register(api.attendanceEntry.startRestRegister, dto);
	}

	/**
	 * 休憩終了処理実行。
	 * 休憩終了情報をオブジェクトにセットする。
	 */
	function endRestRegister(dto) {

		$scope.format.onRegister();

		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka Start
		$scope.format.setFormat('yyyyMMdd');
		var localDateStr = $scope.format.getFormatDt();

		$scope.format.setFormat('HHmm');
		var localDateTimeStr = $scope.format.getFormatTm({registerFlg: true});

		dto.endRest = {
				breakEndDt: localDateStr,
				breakEndTm: localDateTimeStr
		}
		//[ONEsLOGI 労務管理][#6463]出退勤・休憩入力で日跨ぎが発生した場合に退勤出来ない問題を修正 2019.06.13 tanaka End

		$scope.format.offRegister();

		register(api.attendanceEntry.endRestRegister, dto);
	}

	/**
	 * 出退勤・休憩情報の更新。
	 */
	function register(attendanceEntryAPI, dto) {

		api.attendanceEntry.inputCheck({data:dto}).then(function(response) {

			// 処理結果確認
			if(!isProcessConfirm(response)) {
				return ;
			}

			attendanceEntryAPI({data: dto}).then(function(response) {
				// 処理結果確認
				if(!isProcessConfirm(response)) {
					return ;
				}

				dto.head.systemDt = response.data.head.systemDt;

				var $pre = $('pre');
				if(response.data.head.centerCd !== $scope.head.centerCd){
					$scope.head.centerCd = response.data.head.centerCd;
				}
				// ログ出力欄にログを出力
				$pre.append(response.data.log.logComment);
				// スクロールを一番下へ移動
				$pre.animate({scrollTop: $('pre')[0].scrollHeight}, 'fast');
			});

		});

	}

	/**
	 * 通信処理での結果判定。
	 * エラーがある場合はエラーモーダル処理へ移動。
	 */
	function isProcessConfirm(response) {

		// [ONEsLOGI 労務管理][#6741] ログインセンタが切り替えられた場合にリロードするように修正 2019.10.24 tanaka Start
		if (response.status.statusCode == 6) {
			owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
			// 再読込み（userInfoのログインセンタを更新する為）
			$window.location.reload();
			return false;
		}
		// [ONEsLOGI 労務管理][#6741] ログインセンタが切り替えられた場合にリロードするように修正 2019.10.24 tanaka End

		if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

			viewModalError(response.status.messageCode);

			return false;
		}

		return true;

	}

	/**
	 * エラーモーダル表示。
	 */
	function viewModalError(messageCd) {
		var messageFilter = $filter('owfMessage');
		var errorMessage = messageFilter(messageCd, null, false);
		var items = {
			// エラーメッセージ登録
			messageNm: errorMessage
		};

		// エラーをモーダルで表示
		var modalInstance = modalFactory.modalError(items);
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.AttendanceEntry.object:AttendanceEntry#workerCodeKeyUp
	 * @methodOf oneslogiWms.AttendanceEntry.object:AttendanceEntry
	 *
	 * @description
	 * 作業者コードキー押下時処理<br>
	 *
	 * 作業者コードでエンターキーが押下された場合は登録ボタンの処理を実行する。
	 */
	$scope.workerCodeKeyUp = function($event) {
		if($scope.searchform.$invalid) {
			return ;
		}

		const enterKey = 13;

		// エンターキーが押下されたなら
		if(enterKey === $event.keyCode) {
			$scope.userRegister();
		}
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);

