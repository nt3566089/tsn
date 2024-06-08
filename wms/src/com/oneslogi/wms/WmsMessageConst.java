package com.oneslogi.wms;

import com.oneslogi.base.BaseMessageConst;

public class WmsMessageConst extends BaseMessageConst {

	/** 選択した行を追加しますか？ */
	public static final String ADD_ROW_CONFIRMATION = "addRowConfirmation";
	/** 複数行選択しています。選択した行を追加しますか？ */
	public static final String ADD_ROW_MULTIPLE_CONFIRMATION = "addRowMultipleConfirmation";
	/** 住所１は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS1_CHECK_INPUT_MAX_ERROR = "address1CheckInputMaxError";
	/** 住所２は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS2_CHECK_INPUT_MAX_ERROR = "address2CheckInputMaxError";
	/** 住所３は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS3_CHECK_INPUT_MAX_ERROR = "address3CheckInputMaxError";
	/** 移動先が移動元と同じです。 */
	public static final String AFTER_LOCATION_CANNOT_INPUT_SAME_BEFORE_LOCATION_ERROR = "afterLocationCannotInputSameBeforeLocationError";
	/** 最大単位荷姿の親荷姿は設定しないで下さい。 */
	public static final String ALL_PARENT_SHAPE_CD_INPUT_ERROR = "allParentShapeCdInputError";
	/** 入荷日、伝票区分または預託在庫区分が変更されました。全行選択して更新して下さい。 */
	public static final String ALL_RECIVE_PLAN_NOT_SELECT_ERROR = "allRecivePlanNotSelectError";
	/** 全欠品データが含まれています。 */
	public static final String ALL_STOCK_OUT_DATA_FOUND_ERROR = "allStockOutDataFoundError";
	/** すべての構成品が削除済の為、登録できません。 */
	public static final String ALL_STRUCTURE_CANNOT_DELETE_ERROR = "allStructureCannotDeleteError";
	/** 引当禁止フラグが存在しません。 */
	public static final String ALLC_NG_FLG_NOT_FOUND_ERROR = "allcNgFlgNotFoundError";
	/** 出荷実績訂正の在庫データに存在しません。 */
	public static final String ALLOC_CHARGE_NUM_NOT_FOUND_ERROR = "allocChargeNumNotFoundError";
	/** 荷札情報 */
	public static final String ALLOC_INFORMATION = "allocInformation";
	/** 引当禁止フラグを入力して下さい。 */
	public static final String ALLOC_NG_FLG_NOT_INPUT_ERROR = "allocNgFlgNotInputError";
	/** 引当順序に小数は入力できません。 */
	public static final String ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR = "allocOrderCheckInputDecimalError";
	/** 引当順序は整数5桁以内を入力して下さい。 */
	public static final String ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR = "allocOrderCheckInputIntegerError";
	/** 引当順序 数値のみ */
	public static final String ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR = "allocOrderCheckNumericOnlyError";
	/** 引当順序は最小0以上を入力して下さい。 */
	public static final String ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "allocOrderInputRequestMinIsZeroError";
	/** 引当順序を入力して下さい。 */
	public static final String ALLOC_ORDER_NOT_INPUT_ERROR = "allocOrderNotInputError";
	/** 引当区分が「00:引当（標準）」「01:帳簿引当（欠品案分）」の場合、「00：マージしない」以外を選択できません。 */
	public static final String ALLOCATE_CLASS_CANNOT_SELECT_ERROR = "allocateClassCannotSelectError";
	/** 引当禁止区分が存在しません。 */
	public static final String ALLOCATE_STOP_CLASS_NOT_FOUND_ERROR = "allocateStopClassNotFoundError";
	/** 既に出勤されています。 */
	public static final String ALREADY_ATTENDANCE_ERROR = "alreadyAttendanceError";
	/** 構成セットにこの構成品があるの為、行削除は行えません。 */
	public static final String ALREADY_EXISTS_STRUCTURE_CANNOT_DELETE_ERROR = "alreadyExistsStructureCannotDeleteError";
	/** 既に退勤されています。 */
	public static final String ALREADY_LEAVE_WORK_ERROR = "alreadyLeaveWorkError";
	/** 登録済データの為、行削除は行えません。 */
	public static final String ALREADY_REGISTERED_CANNOT_DELETE_ERROR = "alreadyRegisteredCannotDeleteError";
	/** 登録済データの為、分割解除は行えません。 */
	public static final String ALREADY_REGISTERED_CANNOT_SPLIT_CANCEL_ERROR = "alreadyRegisteredCannotSplitCancelError";
	/** 登録後はメインメニューに遷移します。 */
	public static final String ANNOUNCE_CHANGE_CENTER_CLIENT = "announceChangeCenterClient";
	/** 仕分コードは最大[0]文字以下を入力して下さい。 */
	public static final String ARRIVAL_STORE_CD_CHECK_INPUT_MAX_ERROR = "arrivalStoreCdCheckInputMaxError";
	/** 仕分コードを入力して下さい。 */
	public static final String ARRIVAL_STORE_CD_NOT_INPUT_ERROR = "arrivalStoreCdNotInputError";
	/** 仕分名称は最大[0]文字以下を入力して下さい。 */
	public static final String ARRIVAL_STORE_NM_CHECK_INPUT_MAX_ERROR = "arrivalStoreNmCheckInputMaxError";
	/** 戻る */
	public static final String BACK = "back";
	/** バーコード 英数字と記号のみ */
	public static final String BARCODE_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "barcodeCheckAlphabetAndNumericAndSymbolOnlyError";
	/** バーコードは最大100文字以下を入力して下さい。 */
	public static final String BARCODE_CHECK_INPUT_MAX_ERROR = "barcodeCheckInputMaxError";
	/** バーコード名称は最大100文字以下を入力して下さい。 */
	public static final String BARCODE_NM_CHECK_INPUT_MAX_ERROR = "barcodeNmCheckInputMaxError";
	/** バーコードを入力して下さい。 */
	public static final String BARCODE_NOT_INPUT_ERROR = "barcodeNotInputError";
	/** 業務CDが重複しています。 */
	public static final String BIZ_CD_DUPLICATE_ERROR = "bizCdDuplicateError";
	/** ボール入数はケース以下を入力して下さい。 */
	public static final String BOWL_UNIT_NUM_CHECK_INPUT_MAX_ERROR = "bowlUnitNumCheckInputMaxError";
	/** 荷材グループに登録されている荷材([0])は削除できません。 */
	public static final String BOX_CANNOT_DELETE_USE_BOX_GRP_ERROR = "boxCannotDeleteUseBoxGrpError";
	/** 基準荷材CDが荷材CDで未存在。 */
	public static final String BOX_CD_CANNOT_INPUT_ANOTHER_BOX_CD_ERROR = "boxCdCannotInputAnotherBoxCdError";
	/** 荷材を選択して下さい。 */
	public static final String BOX_CD_NOT_SELECT_ERROR = "boxCdNotSelectError";
	/** 荷材CDが重複しています。 */
	public static final String BOX_CODE_DUPLICATE_ERROR = "boxCodeDuplicateError";
	/** 梱包荷材グループに設定されているため削除できません。 */
	public static final String BOX_GRP_CANNOT_DELETE_USE_PARAMETER_MASTER_ERROR = "boxGrpCannotDeleteUseParameterMasterError";
	/** 荷材グループCDが既に登録済です。 */
	public static final String BOX_GRP_CD_CODE_DUPLICATE_ERROR = "boxGrpCdCodeDuplicateError";
	/** 新規荷材 */
	public static final String BOX_NEW_INFORMATION = "boxNewInformation";
	/** 荷材マスタに存在しません。 */
	public static final String BOX_NOT_FOUND_ERROR = "boxNotFoundError";
	/** 同一の箱種・荷姿は指定できません。 */
	public static final String BOX_TYPE_AND_SHAPE_CLASS_CANNOT_SELECT_SAME_ERROR = "boxTypeAndShapeClassCannotSelectSameError";
	/** 検品中データが存在しないため、箱登録できません。 */
	public static final String BOX_TYPE_CANNOT_REGISTER_INSPECTING_DATA_NOT_FOUND_ERROR = "boxTypeCannotRegisterInspectingDataNotFoundError";
	/** 箱種が選択されていません。 */
	public static final String BOX_TYPE_NOT_SELECT_ERROR = "boxTypeNotSelectError";
	/** エントリーユニット（休憩）が登録されていません。管理者に問い合わせてください。 */
	public static final String BREAK_ENTRY_UNIT_IS_NOT_REGISTERED = "breakEntryUnitIsNotRegistered";
	/** 休憩開始が選択されていません。 */
	public static final String BREAK_START_IS_NOT_SELECTED = "breakStartIsNotSelected";
	/** エラー行番号：[0] , エラーメッセージ：[1] */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION = "bulkInputExecuteErrorCheckDtlInformation";
	/** エラー件数：[0]件 , 正常件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION = "bulkInputExecuteErrorCheckInformation";
	/** エラー件数：[銘柄マスタ][0]件 , [銘柄荷姿マスタ][1]件 , 正常件数：[銘柄マスタ][2]件 , [銘柄荷姿マスタ][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_PRODUCT_MASTER_INFORMATION = "bulkInputExecuteErrorCheckProductMasterInformation";
	/** エラー件数：[入荷予定][0]件 , [入荷予定明細][1]件 , 正常件数：[入荷予定][2]件 , [入荷予定明細][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_RECEIVE_PLAN_INFORMATION = "bulkInputExecuteErrorCheckReceivePlanInformation";
	/** エラー件数：[出荷指示][0]件 , [出荷指示明細][1]件 , 正常件数：[出荷指示][2]件 , [出荷指示明細][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_SHIPPING_PLAN_INFORMATION = "bulkInputExecuteErrorCheckShippingPlanInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 , 削除件数：[2]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_DELETE_INFORMATION = "bulkInputExecuteRegisterDeleteInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_INFORMATION = "bulkInputExecuteRegisterInformation";
	/** 登録件数：[銘柄マスタ][0]件 , [銘柄荷姿マスタ][1]件 , 更新件数：[銘柄マスタ][2]件 , [銘柄荷姿マスタ][3]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_PRODUCT_MASTER_INFORMATION = "bulkInputExecuteRegisterProductMasterInformation";
	/** 登録件数：[入荷予定][0]件 , [入荷予定明細][1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_RECEIVE_PLAN_INFORMATION = "bulkInputExecuteRegisterReceivePlanInformation";
	/** 登録件数：[出荷指示][0]件 , [出荷指示明細][1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_SHIPPING_PLAN_INFORMATION = "bulkInputExecuteRegisterShippingPlanInformation";
	/** エラーチェック */
	public static final String BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION = "bulkInputSectionNameErrorCheckInformation";
	/** データ登録 */
	public static final String BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION = "bulkInputSectionNameRegisterInformation";
	/** 拠店CD：[0] , 荷主CD：[1] , 出庫指示件数：[2] , エラー件数：[3] */
	public static final String CALL_SHIPPING_INST_BATCH_ERROR_CHECK_INFORMATION = "callShippingInstBatchErrorCheckInformation";
	/** ジョブキューNo.：[0] , コントロールNo.：[1] , [2] */
	public static final String CALL_SHIPPING_INST_BATCH_EXECUTE_INFORMATION = "callShippingInstBatchExecuteInformation";
	/** 拠店CD：[0] , 荷主CD：[1] */
	public static final String CALL_SHIPPING_INST_BATCH_PARAMETER_INFORMATION = "callShippingInstBatchParameterInformation";
	/** 自動出庫指示登録 */
	public static final String CALL_SHIPPING_INST_BATCH_PROGRAM_NAME = "callShippingInstBatchProgramName";
	/** 入庫数0のデータには[0]は入力できません。 */
	public static final String CAN_NOT_ENTER_IN_STORE_NUM_ZERO_DATA_ERROR = "canNotEnterInStoreNumZeroDataError";
	/** プリンタの設定がされていないため帳票が発行できませんでした。 */
	public static final String CAN_NOT_PRINT_PRINTER_NOT_SET_ERROR = "canNotPrintPrinterNotSetError";
	/** 閉じる */
	public static final String CANCEL = "cancel";
	/** 中断しました。 */
	public static final String CANCEL_CHANGE_CENTER_CLIENT = "cancelChangeCenterClient";
	/** 元の入荷予定日以前の日付には変更できません。 */
	public static final String CANNOT_CHANGE_BEFORE_RECEIVE_PLAN_DATE_ERROR = "cannotChangeBeforeReceivePlanDateError";
	/** 指示済以外のデータは修正できません。 */
	public static final String CANNOT_CHANGE_ERROR = "cannotChangeError";
	/** 入荷予定取込で作成されたデータのため修正は出来ません。 */
	public static final String CANNOT_CHANGE_RECEIVE_PLAN_FROM_EDI_ERROR = "cannotChangeReceivePlanFromEdiError";
	/** 入荷中のため処理できません。 */
	public static final String CANNOT_CHANGE_RECEIVING_ERROR = "cannotChangeReceivingError";
	/** 出荷指示取込で作成されたデータのため修正は出来ません。 */
	public static final String CANNOT_CHANGE_SHIP_ORDER_FROM_RECEIVED_ERROR = "cannotChangeShipOrderFromReceivedError";
	/** キャンセルのデータが含まれています。 */
	public static final String CANNOT_EXECUTE_CANCEL_DATA_INCLUDED_ERROR = "cannotExecuteCancelDataIncludedError";
	/** 出荷指示数は1以上で入力して下さい。 */
	public static final String CANNOT_INPUT_ERROR = "cannotInputError";
	/** 履歴データが選択されています。 */
	public static final String CANNOT_INPUT_HISTORY_DATA_ERROR = "cannotInputHistoryDataError";
	/** 数量をオーバーしています。 */
	public static final String CANNOT_INPUT_MORE_THAN_QTY_ERROR = "cannotInputMoreThanQtyError";
	/** 出荷銘柄明細画面で明細を登録して下さい。 */
	public static final String CANNOT_REGISTER_ERROR = "cannotRegisterError";
	/** 打切りのデータが含まれています。 */
	public static final String CANNOT_SELECT_CLOSED_RECEIVE_ERROR = "cannotSelectClosedReceiveError";
	/** 送り状データ出力済のデータが含まれています。 */
	public static final String CANNOT_SELECT_DELIVERY_NOTE_DATA_CLEATED_ERROR = "cannotSelectDeliveryNoteDataCleatedError";
	/** 異なる出荷先が選択されているため、更新できません。 */
	public static final String CANNOT_SELECT_DIFFERENT_SHIP_TO_ERROR = "cannotSelectDifferentShipToError";
	/** 行追加されたデータではないため、行削除できません。 */
	public static final String CANNOT_SELECT_EXCEPT_ADDED_DATA_ERROR = "cannotSelectExceptAddedDataError";
	/** 出庫指示済以外は発行できません。 */
	public static final String CANNOT_SELECT_EXCEPT_SHIP_INSTRUCTED_ERROR = "cannotSelectExceptShipInstructedError";
	/** 出荷停止中の納品先です。 */
	public static final String CANNOT_SELECT_STOPPED_SHIP_TO_ERROR = "cannotSelectStoppedShipToError";
	/** 仮登録の納品先は指定出来ません。 */
	public static final String CANNOT_SELECT_TEMPORARY_SHIP_TO_ERROR = "cannotSelectTemporaryShipToError";
	/** 入庫ロケーション未入力のため、処理できません。 */
	public static final String CANNOT_STOCK_MOVE_ERROR = "cannotStockMoveError";
	/** 配送コースマスタに登録されている運送業者は削除できません。 */
	public static final String CARRIER_CANNOT_DELETE_EXIST_DELIVERY_COURSE_MASTER_ERROR = "carrierCannotDeleteExistDeliveryCourseMasterError";
	/** 運送業者CDが重複しています。 */
	public static final String CARRIER_CODE_DUPLICATE_ERROR = "carrierCodeDuplicateError";
	/** 運送業者マスタに存在しません。 */
	public static final String CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR = "carrierCodeNotFoundInCarrierMasterError";
	/** 配送コースマスタに運送業者CDが登録されていません。 */
	public static final String CARRIER_CODE_NOT_FOUND_IN_COURSE_MASTER_ERROR = "carrierCodeNotFoundInCourseMasterError";
	/** 運送業者を入力して下さい。 */
	public static final String CARRIER_CODE_NOT_INPUT_ERROR = "carrierCodeNotInputError";
	/** 納品先運送リードタイムを入力して下さい。 */
	public static final String CARRIER_READ_TIME_NOT_INPUT_ERROR = "carrierReadTimeNotInputError";
	/** 該当データの配送コースには送り状データ種別が登録されていません。 */
	public static final String CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR = "carrierSlipNotFoundInDeliveryCourseMasterError";
	/** ピース検品中です。箱登録後、ケース検品を行なって下さい。 */
	public static final String CASE_INSPECT_CANNOT_SELECT_PIECE_INSPECTING_ERROR = "caseInspectCannotSelectPieceInspectingError";
	/** ケース数またはバラ数は1以上で入力して下さい。 */
	public static final String CASE_OR_PIECE_QTY_INPUT_ERROR = "caseOrPieceQtyInputError";
	/** ケース数またはバラ数を入力して下さい。 */
	public static final String CASE_OR_PIECE_QTY_NOT_INPUT_ERROR = "caseOrPieceQtyNotInputError";
	/** 最小荷姿はケースピッキング対象に設定できません。 */
	public static final String CASE_PICK_FLG_CANNOT_SET_ERROR = "casePickFlgCannotSetError";
	/** ケースピッキング対象が設定されていません。 */
	public static final String CASE_PICK_FLG_NOT_INPUT_ERROR = "casePickFlgNotInputError";
	/** ケースピッキング対象は複数の荷姿を選択できません。 */
	public static final String CASE_PICK_FLG_PLURAL_NOT_INPUT_ERROR = "casePickFlgPluralNotInputError";
	/** 荷札発行に失敗しました。PCで出力し直して下さい。検品は終了しています。 */
	public static final String CASE_PICKING_AUTO_TAG_PRINT_FAILED_WARN = "casePickingAutoTagPrintFailedWarn";
	/** ケースピッキング対象の荷姿が見つかりません。[/]荷姿グループの設定を確認してください。 */
	public static final String CASE_PICKING_FLG_NOT_FOUND_ERROR = "casePickingFlgNotFoundError";
	/** 対象のケースピッキングNo.は出荷確定済のデータが含まれています。(出庫作業No.：[0]) */
	public static final String CASE_PICKING_NO_EXISTS_FIXED_DATA_ERROR = "casePickingNoExistsFixedDataError";
	/** 拠店CDが取引先マスタに存在しません。 */
	public static final String CENTAR_CODE_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "centarCodeNotFoundInPartnerMasterError";
	/** 選択した拠点の使用権限が付与されていません。 */
	public static final String CENTER_CANNOT_USE_NO_PERMISSION_ERROR = "centerCannotUseNoPermissionError";
	/** 拠店CD 英数字と-のみ */
	public static final String CENTER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "centerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 拠店CDは最大[0]文字以下を入力して下さい。 */
	public static final String CENTER_CD_CHECK_INPUT_MAX_ERROR = "centerCdCheckInputMaxError";
	/** 拠店CDを入力して下さい。 */
	public static final String CENTER_CD_NOT_INPUT_ERROR = "centerCdNotInputError";
	/** 拠店CDが重複しています。 */
	public static final String CENTER_CODE_DUPLICATE_ERROR = "centerCodeDuplicateError";
	/** 拠点列CDが重複しています。 */
	public static final String CENTER_COL_CODE_DUPLICATE_ERROR = "centerColCodeDuplicateError";
	/** 拠点列マスタに存在しません。 */
	public static final String CENTER_COL_NOT_FOUND_ERROR = "centerColNotFoundError";
	/** 拠点項目CDが重複しています。 */
	public static final String CENTER_ITEM_CODE_DUPLICATE_ERROR = "centerItemCodeDuplicateError";
	/** 拠点項目マスタに存在しません。 */
	public static final String CENTER_ITEM_NOT_FOUND_ERROR = "centerItemNotFoundError";
	/** 拠点マスタに存在しません。 */
	public static final String CENTER_NOT_FOUND_ERROR = "centerNotFoundError";
	/** 拠点画面CDが重複しています。 */
	public static final String CENTER_SCREEN_CODE_DUPLICATE_ERROR = "centerScreenCodeDuplicateError";
	/** 拠点画面マスタに存在しません。 */
	public static final String CENTER_SCREEN_NOT_FOUND_ERROR = "centerScreenNotFoundError";
	/** 拠点 */
	public static final String CENTER_TITLE = "centerTitle";
	/** ログイン情報を変更したため、メインメニューに遷移します。続行しますか？ */
	public static final String CHANGE_CENTER_CLIENT_CONFIRM = "changeCenterClientConfirm";
	/** ケースピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CASE_CONFIRM = "clearIssueExcecuteCaseConfirm";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、ケースピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CASE_STATUS_CONFIRM = "clearIssueExcecuteCaseStatusConfirm";
	/** 1次ピッキングリストおよび2次ピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CONFIRM = "clearIssueExcecuteConfirm";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、1次ピッキングリストおよび2次ピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_STATUS_CONFIRM = "clearIssueExcecuteStatusConfirm";
	/** ケースピッキングリストが未発行の行が選択されています。 */
	public static final String CLEAR_ISSUE_EXCEPT_NOT_CASE_ISSUE_ERROR = "clearIssueExceptNotCaseIssueError";
	/** 1次ピッキングリストおよび2次ピッキングリストが未発行の行が選択されています。 */
	public static final String CLEAR_ISSUE_EXCEPT_NOT_ISSUE_ERROR = "clearIssueExceptNotIssueError";
	/** 未出荷以外の出荷指示に対して、欠品解除処理を実行できません。 */
	public static final String CLEAR_SHORTAGE_EXCEPT_NOT_SHIPPING_START_ERROR = "clearShortageExceptNotShippingStartError";
	/** 欠品がない出荷指示に対して、欠品解除処理を実行できません。 */
	public static final String CLEAR_SHORTAGE_EXCEPT_STOCK_OUT_START_ERROR = "clearShortageExceptStockOutStartError";
	/** 同一顧客入荷指示番号と仕入先CDのデータが既に存在します。 */
	public static final String CLIENT_AND_SUPPLIER_DUPLICATE_ERROR = "clientAndSupplierDuplicateError";
	/** 荷主CD 英数字と-のみ */
	public static final String CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "clientCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 荷主CDは最大[0]文字以下を入力して下さい。 */
	public static final String CLIENT_CD_CHECK_INPUT_MAX_ERROR = "clientCdCheckInputMaxError";
	/** 荷主CDを入力して下さい。 */
	public static final String CLIENT_CD_NOT_INPUT_ERROR = "clientCdNotInputError";
	/** 荷主拠点マスタに存在しません。 */
	public static final String CLIENT_CENTER_NOT_FOUND_ERROR = "clientCenterNotFoundError";
	/** 切替 */
	public static final String CLIENT_CENTER_SELECT = "clientCenterSelect";
	/** 荷主CDが重複しています。 */
	public static final String CLIENT_CODE_DUPLICATE_ERROR = "clientCodeDuplicateError";
	/** 荷主列CDが重複しています。 */
	public static final String CLIENT_COL_CODE_DUPLICATE_ERROR = "clientColCodeDuplicateError";
	/** 荷主列マスタに存在しません。 */
	public static final String CLIENT_COL_NOT_FOUND_ERROR = "clientColNotFoundError";
	/** 取込用Excelの在庫管理単位を指定するか、荷主マスタの在庫管理単位を設定してください。 */
	public static final String CLIENT_DEFAULT_SHAPE_GROUP_NOT_INPUT_ERROR = "clientDefaultShapeGroupNotInputError";
	/** 在庫管理単位を選択してください。 */
	public static final String CLIENT_DEFAULT_SHAPE_GRP_ID_NOT_INPUT_ERROR = "clientDefaultShapeGrpIdNotInputError";
	/** 荷主項目CDが重複しています。 */
	public static final String CLIENT_ITEM_CODE_DUPLICATE_ERROR = "clientItemCodeDuplicateError";
	/** 荷主項目マスタに存在しません。 */
	public static final String CLIENT_ITEM_NOT_FOUND_ERROR = "clientItemNotFoundError";
	/** 荷主マスタに存在しません。 */
	public static final String CLIENT_NOT_FOUND_ERROR = "clientNotFoundError";
	/** 同一の顧客入荷指示No.の伝票が既に登録済です。 */
	public static final String CLIENT_RECEIVE_NO_DATA_DUPLICATE_ERROR = "clientReceiveNoDataDuplicateError";
	/** 荷主画面CDが重複しています。 */
	public static final String CLIENT_SCREEN_CODE_DUPLICATE_ERROR = "clientScreenCodeDuplicateError";
	/** 荷主画面マスタに存在しません。 */
	public static final String CLIENT_SCREEN_NOT_FOUND_ERROR = "clientScreenNotFoundError";
	/** 顧客出荷指示No 英数字と-のみ */
	public static final String CLIENT_SHIPPING_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "clientShippingNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 顧客出荷指示Noは最大30文字以下を入力して下さい。 */
	public static final String CLIENT_SHIPPING_NO_CHECK_INPUT_MAX_ERROR = "clientShippingNoCheckInputMaxError";
	/** 同一の顧客出荷指示No.の伝票が既に登録済です。 */
	public static final String CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR = "clientShippingNoDataDuplicateError";
	/** 顧客出荷指示Noを入力して下さい。 */
	public static final String CLIENT_SHIPPING_NO_NOT_INPUT_ERROR = "clientShippingNoNotInputError";
	/** 荷主 */
	public static final String CLIENT_TITLE = "clientTitle";
	/** 備考は最大100文字以下を入力して下さい。 */
	public static final String COMMENT_CHECK_INPUT_MAX_ERROR = "commentCheckInputMaxError";
	/** 共通運送業者マスタに存在しません。 */
	public static final String COMMON_CARRIER_CODE_NOT_FOUND_IN_COMMON_CARRIER_MASTER_ERROR = "commonCarrierCodeNotFoundInCommonCarrierMasterError";
	/** 大口事業所フラグを入力して下さい。 */
	public static final String COMPANY_FLG_NAME_NOT_INPUT_ERROR = "companyFlgNameNotInputError";
	/** 大口事業所フラグが存在しません。 */
	public static final String COMPANY_FLG_NOT_FOUND_ERROR = "companyFlgNotFoundError";
	/** 大口事業所名カナ は最大100文字以下を入力して下さい。 */
	public static final String COMPANY_KN_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "companyKnBulkInputCheckInputMaxError";
	/** 大口事業所名カナ  半角文字のみ */
	public static final String COMPANY_KN_CHECK_HALF_WIDTH_ONLY_ERROR = "companyKnCheckHalfWidthOnlyError";
	/** 大口事業所名カナ は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_KN_CHECK_INPUT_MAX_ERROR = "companyKnCheckInputMaxError";
	/** 大口事業所名は最大80文字以下を入力して下さい。 */
	public static final String COMPANY_NM_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "companyNmBulkInputCheckInputMaxError";
	/** 大口事業所名 全角文字のみ */
	public static final String COMPANY_NM_CHECK_FULL_WIDTH_ONLY_ERROR = "companyNmCheckFullWidthOnlyError";
	/** 大口事業所名は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_NM_CHECK_INPUT_MAX_ERROR = "companyNmCheckInputMaxError";
	/** 全国地方公共団体コード（大口事業所の所在地のJISコード）は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_PUBLIC_CD_CHECK_INPUT_MAX_ERROR = "companyPublicCdCheckInputMaxError";
	/** 全国地方公共団体コード（大口事業所の所在地のJISコード） 数値のみ */
	public static final String COMPANY_PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR = "companyPublicCdCheckNumericOnlyError";
	/** 郵便番号（大口事業所個別番号）は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_ZIP_CD_CHECK_INPUT_MAX_ERROR = "companyZipCdCheckInputMaxError";
	/** 郵便番号（大口事業所個別番号） 数値のみ */
	public static final String COMPANY_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "companyZipCdCheckNumericOnlyError";
	/** 郵便番号（大口事業所個別番号）を入力して下さい。 */
	public static final String COMPANY_ZIP_CD_NOT_INPUT_ERROR = "companyZipCdNotInputError";
	/** 明細行がありません。データを削除しますか？ */
	public static final String CONFIRM_UPDATE_DATA_NON_BODY = "confirmUpdateDataNonBody";
	/** コピー元とコピー先に同一の拠点が指定されています。 */
	public static final String COPY_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR = "copyCannnotInputSameTransitCenterError";
	/** カルチャマスタ存在しません。 */
	public static final String CULTURE_ID_NOT_FOUND_IN_CULTURE_MASTER_ERROR = "cultureIdNotFoundInCultureMasterError";
	/** 取引先CDが既に登録済です。 */
	public static final String CUSTMOER_CD_CODE_DUPLICATE_ERROR = "custmoerCdCodeDuplicateError";
	/** 取引先略称は最大15文字以下を入力して下さい。 */
	public static final String CUSTOMER_ABBR_CHECK_INPUT_MAX_ERROR = "customerAbbrCheckInputMaxError";
	/** 取引先略称を入力して下さい。 */
	public static final String CUSTOMER_ABBR_NOT_INPUT_ERROR = "customerAbbrNotInputError";
	/** 既に登録されている拠点、取引先があります。 */
	public static final String CUSTOMER_CD_DUPLICATE_ERROR = "customerCdDuplicateError";
	/** 取引先CDを入力して下さい。 */
	public static final String CUSTOMER_CD_NOT_INPUT_ERROR = "customerCdNotInputError";
	/** 既に登録されている拠点、取引先があります。更新しますか？ */
	public static final String CUSTOMER_CD_REGISTER_CONFIRMATION = "customerCdRegisterConfirmation";
	/** 取引先CD 英数字と-のみ */
	public static final String CUSTOMER_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "customerCodeCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 取引先CDは最大10文字以下を入力して下さい。 */
	public static final String CUSTOMER_CODE_CHECK_INPUT_MAX_ERROR = "customerCodeCheckInputMaxError";
	/** 取引先CDが重複しています。 */
	public static final String CUSTOMER_CODE_DUPLICATE_ERROR = "customerCodeDuplicateError";
	/** 取引先マスタに存在しない取引先が含まれています。（取引先CD：[0]） */
	public static final String CUSTOMER_CODE_FOUND_DELETED_WITH_CD_ERROR = "customerCodeFoundDeletedWithCdError";
	/** 取引先マスタ取込（ワーク取込） */
	public static final String CUSTOMER_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "customerInputProgramNameInputWorkInformation";
	/** 取引先マスタ取込（データ移行） */
	public static final String CUSTOMER_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "customerInputProgramNameRegisterInformation";
	/** 取引先マスタ一括登録 */
	public static final String CUSTOMER_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "customerMasterBulkInputProgramNameInformation";
	/** 取引先名称は最大50文字以下を入力して下さい。 */
	public static final String CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "customerNmCheckInputMaxError";
	/** 取引先名称を入力して下さい。 */
	public static final String CUSTOMER_NM_NOT_INPUT_ERROR = "customerNmNotInputError";
	/** 拠点間移動の取引先が登録されていません。出荷元の拠点、納品先の拠点の取引先を登録してください。 */
	public static final String CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR = "customerNotFoundCenterTransitError";
	/** 取引先マスタに存在しません。 */
	public static final String CUSTOMER_NOT_FOUND_ERROR = "customerNotFoundError";
	/** 他の取引先に荷主取引先として登録されている取引先ですが、変更してもよろしいですか？ */
	public static final String CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION = "customerRegisterUsingClientCustomerAnotherConfirmation";
	/** 他の取引先に社内入荷拠点として登録されている拠点ですが、変更してもよろしいですか？ */
	public static final String CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION = "customerRegisterUsingOwnedCenterAnotherConfirmation";
	/** 日次締処理をキューに登録しました。キューNo.([0]) */
	public static final String DAILY_BATCH_REGISTER_INFORMATION = "dailyBatchRegisterInformation";
	/** 日次処理実行中です。 */
	public static final String DAILY_CHECK_ERROR = "dailyCheckError";
	/** 出荷確定されていない実績がありますがよろしいですか？[/][0] */
	public static final String DAILY_CONFIRMATION_NOT_COMPLETE_SHIPPING_INSPECTION = "dailyConfirmationNotCompleteShippingInspection";
	/** EC受注データの保持期間が作業データの保持期間より長く設定されています。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalOrderKeepingDaysError";
	/** 前回の日次締処理より前の日付のため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_BEFORE_LAST_BUT_ONE_ERROR = "dailyProcessCannotInputBeforeLastButOneError";
	/** 在庫受払が存在しているため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_CONTAINED_STOCK_IN_OUT_ERROR = "dailyProcessCannotInputContainedStockInOutError";
	/** システム管理日付（翌稼働日）に現在のシステム管理日付と同じ日付は入力できません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_EQUAL_DATE_ERROR = "dailyProcessCannotInputEqualDateError";
	/** 日次締処理が一度も実行されていないため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_NOT_BEFORE_SYSTEM_DT_ERROR = "dailyProcessCannotInputNotBeforeSystemDtError";
	/** 日次処理中のため、操作できません。 */
	public static final String DAILY_PROCESS_CANNOT_OPERATION_RUNNING_ERROR = "dailyProcessCannotOperationRunningError";
	/** 日次処理中の荷主は選択できません。 */
	public static final String DAILY_PROCESS_CANNOT_SELECT_BATCH_PROGRESS_ERROR = "dailyProcessCannotSelectBatchProgressError";
	/** 在庫情報が未存在のためシステム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_UPDATE_STOCK_REPORT_NOT_FOUND_ERROR = "dailyProcessCannotUpdateStockReportNotFoundError";
	/** 在庫が未存在のため復元できませんでした。(入庫ラベルNo.：[0]) */
	public static final String DAILY_PROCESS_CANNOT_UPDATE_STOCK_REPORT_NOT_FOUND_INFORMATION = "dailyProcessCannotUpdateStockReportNotFoundInformation";
	/** 日次処理中です！操作には十分注意して下さい。 */
	public static final String DAILY_PROCESS_CAUTIONS_OPERATION_RUNNING_INFORMATION = "dailyProcessCautionsOperationRunningInformation";
	/** 選択した荷主の日次締め処理を実行しますか？ */
	public static final String DAILY_PROCESS_EXECUTE_CONFIRMATION = "dailyProcessExecuteConfirmation";
	/** 拠店CD：[0] , 荷主CD：[1] , 前回システム管理日付：[2] , システム管理日付：[3] , システム管理日付（翌稼働日）：[4] */
	public static final String DAILY_PROCESS_PARAMETER = "dailyProcessParameter";
	/** 前回システム管理日付：[0] */
	public static final String DAILY_PROCESS_PARAMETER_DAILY_DATE_UPDATE = "dailyProcessParameterDailyDateUpdate";
	/** 取込み種別CD：[0] , システム管理日付：[1] , 受注保持期間：[2] , 対象日付：[3] */
	public static final String DAILY_PROCESS_PARAMETER_EC_DATA_DELETE = "dailyProcessParameterEcDataDelete";
	/** システム管理日付：[0] , システム管理日付（翌稼働日）：[1] */
	public static final String DAILY_PROCESS_PARAMETER_STOCK_DAILY = "dailyProcessParameterStockDaily";
	/** システム管理日付：[0] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT = "dailyProcessParameterSystemDt";
	/** システム管理日付：[0] , 履歴データ保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_HIST_KEEP_DAYS = "dailyProcessParameterSystemDtHistKeepDays";
	/** システム管理日付：[0] , トランザクション保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS = "dailyProcessParameterSystemDtTranKeepDays";
	/** システム管理日付：[0] , トランザクション保持期間：[1] , 履歴データ保持期間：[2] , 対象日付：[3] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS_HIST_KEEP_DAYS = "dailyProcessParameterSystemDtTranKeepDaysHistKeepDays";
	/** システム管理日付：[0] , 未処理データ保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_UNPROCESS_KEEP_DAYS = "dailyProcessParameterSystemDtUnprocessKeepDays";
	/** 日次処理 */
	public static final String DAILY_PROCESS_PROGRAM_NAME = "dailyProcessProgramName";
	/** 日次処理実行中のため、メインメニューに戻ります。 */
	public static final String DAILY_PROCESS_RUNNING_CONFIRM = "dailyProcessRunningConfirm";
	/** 前回システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_DAILY_DATE_UPDATE = "dailyProcessSectionNameDailyDateUpdate";
	/** EC受注データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EC_DATA_DELETE = "dailyProcessSectionNameEcDataDelete";
	/** EDIデータ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EDI_DATA_DELETE = "dailyProcessSectionNameEdiDataDelete";
	/** 履歴データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_DELETE = "dailyProcessSectionNameHistoryDataDelete";
	/** 履歴データ移動 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_MOVE = "dailyProcessSectionNameHistoryDataMove";
	/** シリアルNo.データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_SERIAL_NO_DELETE = "dailyProcessSectionNameSerialNoDelete";
	/** 在庫繰越 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_DAILY = "dailyProcessSectionNameStockDaily";
	/** 在庫日報復元 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_REPORT_RECOVERY = "dailyProcessSectionNameStockReportRecovery";
	/** システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_SYSTEM_DATE_UPDATE = "dailyProcessSectionNameSystemDateUpdate";
	/** 未処理データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_UNPROCESS_DATA_DELETE = "dailyProcessSectionNameUnprocessDataDelete";
	/** ワークデータ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_WORK_DELETE = "dailyProcessSectionNameWorkDelete";
	/** 削除フラグは「0」か「1」を設定して下さい。 */
	public static final String DALETE_FLAG_INPUT_EXCEPT_ZERO_OR_ONE_ERROR = "daleteFlagInputExceptZeroOrOneError";
	/** 使用中のデータが含まれている可能性があります。内容を確認して下さい。 */
	public static final String DATA_CANNNOT_DELETE_SQL_EXCEPTION_ERROR = "dataCannnotDeleteSqlExceptionError";
	/** 緊急補充は取消できません。 */
	public static final String DATA_CANNOT_CANCEL_EMERGENCY_REPLENISHMENT_DATA_ERROR = "dataCannotCancelEmergencyReplenishmentDataError";
	/** 未登録データです。 */
	public static final String DATA_CANNOT_INPUT_NOT_REGISTERED_ERROR = "dataCannotInputNotRegisteredError";
	/** WMS入荷伝票No.が同じ行を選択して下さい。 */
	public static final String DATA_CANNOT_REGISTER_ERROR = "dataCannotRegisterError";
	/** 未完了データは登録できません。 */
	public static final String DATA_CANNOT_REGISTER_UNFINISHED_ERROR = "dataCannotRegisterUnfinishedError";
	/** 緊急補充以外のデータを選択して下さい。 */
	public static final String DATA_CANNOT_SELECT_EMERGENCY_REPLENISHMENT_DATA_ERROR = "dataCannotSelectEmergencyReplenishmentDataError";
	/** 同一顧客出荷指示No.、納品先CD内で届先住所が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_ERROR = "dataCheckClientShippingNoUnmatchDelivAddressError";
	/** 同一顧客出荷指示No.、納品先CD内で届先住所補足が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_SUPPLY_ERROR = "dataCheckClientShippingNoUnmatchDelivAddressSupplyError";
	/** 同一顧客出荷指示No.、納品先CD内で届先CDが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_CD_ERROR = "dataCheckClientShippingNoUnmatchDelivCustomerCdError";
	/** 同一顧客出荷指示No.、納品先CD内で届先名称が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_NM_ERROR = "dataCheckClientShippingNoUnmatchDelivCustomerNmError";
	/** 同一顧客出荷指示No.、納品先CD内で納品指定日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_DT_ERROR = "dataCheckClientShippingNoUnmatchDelivDtError";
	/** 同一顧客出荷指示No.、納品先CD内で納品予定日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_PLAN_DT_ERROR = "dataCheckClientShippingNoUnmatchDelivPlanDtError";
	/** 同一顧客出荷指示No.、納品先CD内で届先電話番号が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TEL_NO_ERROR = "dataCheckClientShippingNoUnmatchDelivTelNoError";
	/** 同一顧客出荷指示No.、納品先CD内で納品時間帯が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TZ_ERROR = "dataCheckClientShippingNoUnmatchDelivTzError";
	/** 同一顧客出荷指示No.、納品先CD内で届先郵便番号が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ZIP_CD_ERROR = "dataCheckClientShippingNoUnmatchDelivZipCdError";
	/** 同一顧客出荷指示No.、納品先CD内で配送コースが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIVERY_COURSE_ERROR = "dataCheckClientShippingNoUnmatchDeliveryCourseError";
	/** 同一顧客出荷指示No.、納品先CD内で緊急フラグが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_EMERGENCY_FLG_ERROR = "dataCheckClientShippingNoUnmatchEmergencyFlgError";
	/** 同一顧客出荷指示No.、納品先CD内で出庫作業メッセージが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PICKING_WORK_MESSAGE_ERROR = "dataCheckClientShippingNoUnmatchPickingWorkMessageError";
	/** 同一顧客出荷指示No.、納品先CD内で処理区分が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PROCESS_TYPE_ERROR = "dataCheckClientShippingNoUnmatchProcessTypeError";
	/** 同一顧客出荷指示No.、納品先CD内で出荷日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_SHIPPING_DT_ERROR = "dataCheckClientShippingNoUnmatchShippingDtError";
	/** 同一顧客出荷指示No.、納品先CD内で合計金額が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_PRICE_ERROR = "dataCheckClientShippingNoUnmatchTotalPriceError";
	/** 同一顧客出荷指示No.、納品先CD内で合計消費税が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_TAX_ERROR = "dataCheckClientShippingNoUnmatchTotalTaxError";
	/** 同一顧客出荷指示No.、納品先CD内で作業日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_WORK_DT_ERROR = "dataCheckClientShippingNoUnmatchWorkDtError";
	/** 完納のデータが含まれています。 */
	public static final String DATA_COMPLETED_CANNOT_SELECT_ERROR = "dataCompletedCannotSelectError";
	/** [0]データ 削除 件数：[1]件 */
	public static final String DATA_DELETE_DAILY_PROCESS_INFORMATION = "dataDeleteDailyProcessInformation";
	/** 重複データが含まれています。 */
	public static final String DATA_DUPLICATE_ERROR = "dataDuplicateError";
	/** 総件数：[0]件 正常件数：[1]件 エラー件数：[2]件 */
	public static final String DATA_INPUT_REGISTER_INFORMATION = "dataInputRegisterInformation";
	/** 初期データ取込種別マスタに存在しません。 */
	public static final String DATA_INPUT_TYPE_NOT_FOUND_ERROR = "dataInputTypeNotFoundError";
	/** 該当データが複数存在しています、処理できません。 */
	public static final String DATA_PLURAL_FOUND_ERROR = "dataPluralFoundError";
	/** [0]データ 追加 件数：[1]件 */
	public static final String DATA_REGISTER_DAILY_PROCESS_INFORMATION = "dataRegisterDailyProcessInformation";
	/** [0]データ 更新 件数：[1]件 */
	public static final String DATA_UPDATE_DAILY_PROCESS_INFORMATION = "dataUpdateDailyProcessInformation";
	/** 前日以前の日付には変更できません。 */
	public static final String DATE_BEFORE_CANNOT_CHANGE_ERROR = "dateBeforeCannotChangeError";
	/** 日付は伝票番号単位で変更して下さい。(運送業者もしくは、銘柄CDを検索条件から外して下さい。) */
	public static final String DATE_CANNOT_CHANGE_SAME_DOCUMENT_NUMBER_ERROR = "dateCannotChangeSameDocumentNumberError";
	/** 前日以前の日付を入力する事は出来ません。 */
	public static final String DATE_CANNOT_INPUT_BEFORE_DATE_ERROR = "dateCannotInputBeforeDateError";
	/** 入力した日付が不正です。 */
	public static final String DATE_INPUT_ERROR = "dateInputError";
	/** 日付一括変更 */
	public static final String DATE_UPDATE_CONDITION = "dateUpdateCondition";
	/** 削除フラグが存在しません。 */
	public static final String DEL_FLG_NOT_FOUND_ERROR = "delFlgNotFoundError";
	/** 削除フラグを入力して下さい。 */
	public static final String DEL_FLG_NOT_INPUT_ERROR = "delFlgNotInputError";
	/** 複数行選択しています。選択した行を削除しますか？ */
	public static final String DELETE_ROW_MULTIPLE_CONFIRMATION = "deleteRowMultipleConfirmation";
	/** 削除済の為、修正出来ません。 */
	public static final String DELETED_CANNOT_CHANGE_ERROR = "deletedCannotChangeError";
	/** 削除済の為、削除出来ません。 */
	public static final String DELETED_CANNOT_DELETE_ERROR = "deletedCannotDeleteError";
	/** 削除済の為、処理できません。 */
	public static final String DELETED_CANNOT_EXECUTE_ERROR = "deletedCannotExecuteError";
	/** 削除済のデータが含まれている為、発行はできません。 */
	public static final String DELETED_DATA_CANNOT_OUTPUT_ERROR = "deletedDataCannotOutputError";
	/** 届先住所1は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS1_CHECK_INPUT_MAX_ERROR = "delivAddress1CheckInputMaxError";
	/** 届先住所2は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS2_CHECK_INPUT_MAX_ERROR = "delivAddress2CheckInputMaxError";
	/** 届先住所3は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS3_CHECK_INPUT_MAX_ERROR = "delivAddress3CheckInputMaxError";
	/** 届先住所を入力して下さい。 */
	public static final String DELIV_ADDRESS_NO_INPUT_ERROR = "delivAddressNoInputError";
	/** 届先住所補足は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS_SUPPLY_CHECK_INPUT_MAX_ERROR = "delivAddressSupplyCheckInputMaxError";
	/** 届先CD 英数字と-のみ */
	public static final String DELIV_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "delivCustomerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 届先CDは最大10文字以下を入力して下さい。 */
	public static final String DELIV_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR = "delivCustomerCdCheckInputMaxError";
	/** 届先CDは取引先マスタに存在しません。 */
	public static final String DELIV_CUSTOMER_CD_NOT_FOUND_ERROR = "delivCustomerCdNotFoundError";
	/** 届先CDを入力して下さい。 */
	public static final String DELIV_CUSTOMER_CD_NOT_INPUT_ERROR = "delivCustomerCdNotInputError";
	/** 届先名称は最大50文字以下を入力して下さい。 */
	public static final String DELIV_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "delivCustomerNmCheckInputMaxError";
	/** 納品指定日は出荷日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR = "delivDateCannotChangeBeforeShipDateError";
	/** 納品指定日は作業日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "delivDateCannotChangeBeforeWorkDateError";
	/** 納品指定日が日付不正(形式:yyyy/MM/dd) */
	public static final String DELIV_DT_DATE_ERROR = "delivDtDateError";
	/** 納品予定日は出荷日より前の日付に変更できません。 */
	public static final String DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR = "delivPlanDateCannotChangeBeforeShipDateError";
	/** 納品予定日は作業日より前の日付に変更できません。 */
	public static final String DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "delivPlanDateCannotChangeBeforeWorkDateError";
	/** 納品予定日が日付不正(形式:yyyy/MM/dd) */
	public static final String DELIV_PLAN_DT_DATE_ERROR = "delivPlanDtDateError";
	/** 届先電話番号は最大15文字以下を入力して下さい。 */
	public static final String DELIV_TEL_NO_CHECK_INPUT_MAX_ERROR = "delivTelNoCheckInputMaxError";
	/** 届先電話番号 数字と-のみ */
	public static final String DELIV_TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR = "delivTelNoCheckNumericAndHyphenOnlyError";
	/** 納品時間帯CDが存在しません。 */
	public static final String DELIV_TZ_NOT_FOUND_ERROR = "delivTzNotFoundError";
	/** 届先郵便番号は最大7文字以下を入力して下さい。 */
	public static final String DELIV_ZIP_CD_CHECK_INPUT_MAX_ERROR = "delivZipCdCheckInputMaxError";
	/** 届先郵便番号 数値のみ */
	public static final String DELIV_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "delivZipCdCheckNumericOnlyError";
	/** 出荷状況が複数存在しています。出庫指示一覧にて処理を進めて下さい。 */
	public static final String DELIVERY_COURSE_CANNOT_SELECT_DIFFERENT_SHIP_STATUS_ERROR = "deliveryCourseCannotSelectDifferentShipStatusError";
	/** 配送コースCD 英数字と-のみ */
	public static final String DELIVERY_COURSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "deliveryCourseCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 配送コースCDは最大5文字以下を入力して下さい。 */
	public static final String DELIVERY_COURSE_CD_CHECK_INPUT_MAX_ERROR = "deliveryCourseCdCheckInputMaxError";
	/** 配送コースCDが配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_CD_NOT_FOUND_ERROR = "deliveryCourseCdNotFoundError";
	/** 配送コースCDを入力して下さい。 */
	public static final String DELIVERY_COURSE_CD_NOT_INPUT_ERROR = "deliveryCourseCdNotInputError";
	/** 出荷確定済の出荷指示に対して、配送コースは変更できません。 */
	public static final String DELIVERY_COURSE_CHANGE_START_ERROR = "deliveryCourseChangeStartError";
	/** 配送コースCDが重複しています。 */
	public static final String DELIVERY_COURSE_CODE_DUPLICATE_ERROR = "deliveryCourseCodeDuplicateError";
	/** 配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_NOT_FOUND_ERROR = "deliveryCourseNotFoundError";
	/** 入力された配送コースが配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_NOT_FOUND_IN_COURSE_MASTER_ERROR = "deliveryCourseNotFoundInCourseMasterError";
	/** 配送コース一括変更 */
	public static final String DELIVERY_COURSE_UPDATE_CONDITION = "deliveryCourseUpdateCondition";
	/** 納品先フラグが存在しません。 */
	public static final String DELIVERY_FLG_NOT_FOUND_ERROR = "deliveryFlgNotFoundError";
	/** 納品先フラグを入力して下さい。 */
	public static final String DELIVERY_FLG_NOT_INPUT_ERROR = "deliveryFlgNotInputError";
	/** 配送順に小数は入力できません。 */
	public static final String DELIVERY_ORDER_CHECK_INPUT_DECIMAL_ERROR = "deliveryOrderCheckInputDecimalError";
	/** 配送順は整数5桁以内を入力して下さい。 */
	public static final String DELIVERY_ORDER_CHECK_INPUT_INTEGER_ERROR = "deliveryOrderCheckInputIntegerError";
	/** 配送順 数値のみ */
	public static final String DELIVERY_ORDER_CHECK_NUMERIC_ONLY_ERROR = "deliveryOrderCheckNumericOnlyError";
	/** 配送順は最小1以上を入力して下さい。 */
	public static final String DELIVERY_ORDER_INPUT_REQUEST_MIN_IS_ONE_ERROR = "deliveryOrderInputRequestMinIsOneError";
	/** 配送リードタイムは最小1以上を入力して下さい。 */
	public static final String DELIVERY_READ_TIME_INPUT_REQUEST_MIN_IS_ONE_ERROR = "deliveryReadTimeInputRequestMinIsOneError";
	/** 配送リードタイムに小数は入力できません。 */
	public static final String DELIVERY_READTIME_CHECK_INPUT_DECIMAL_ERROR = "deliveryReadtimeCheckInputDecimalError";
	/** 配送リードタイムは整数5桁以内を入力して下さい。 */
	public static final String DELIVERY_READTIME_CHECK_INPUT_INTEGER_ERROR = "deliveryReadtimeCheckInputIntegerError";
	/** 配送リードタイム 数値のみ */
	public static final String DELIVERY_READTIME_CHECK_NUMERIC_ONLY_ERROR = "deliveryReadtimeCheckNumericOnlyError";
	/** 拠点納品フラグが存在しません。 */
	public static final String DELIVERY_TO_CENTER_FLAG_NOT_FOUND_ERROR = "deliveryToCenterFlagNotFoundError";
	/** 親銘柄と構成品には同じ預託・在庫区分を指示してください。 */
	public static final String DEPOSIT_AND_LOCATION_CANNOT_EXECUTE_DIFFERENCE_ERROR = "depositAndLocationCannotExecuteDifferenceError";
	/** 預託CDは取引先マスタに存在しません。 */
	public static final String DEPOSIT_CD_NOT_FOUND_ERROR = "depositCdNotFoundError";
	/** 選択した預託の荷主が選択されていません。 */
	public static final String DEPOSIT_CLIENT_NOT_SELECT_ERROR = "depositClientNotSelectError";
	/** 預託CD 英数字と-のみ */
	public static final String DEPOSIT_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "depositCodeCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 預託CDは最大[0]文字以下を入力して下さい。 */
	public static final String DEPOSIT_CODE_CHECK_INPUT_MAX_ERROR = "depositCodeCheckInputMaxError";
	/** 預託先フラグが存在しません。 */
	public static final String DEPOSIT_FLG_NOT_FOUND_ERROR = "depositFlgNotFoundError";
	/** 預託先フラグを入力して下さい。 */
	public static final String DEPOSIT_FLG_NOT_INPUT_ERROR = "depositFlgNotInputError";
	/** 取引先マスタに預託が存在しません。 */
	public static final String DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = "depositStockClassNotFoundError";
	/** 同一伝票の明細データの預託在庫区分が不一致です。 */
	public static final String DEPOSIT_STOCK_CLASS_UNMATCH_ERROR = "depositStockClassUnmatchError";
	/** 取引先区分(預託先)が存在しません。 */
	public static final String DEPOSIT_STOCK_FLAG_NOT_FOUND_ERROR = "depositStockFlagNotFoundError";
	/** 同一の顧客入荷指示No、仕入先内で預託が不一致です。 */
	public static final String DEPOSIT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "depositUnmatchInClientReceiveNoOnBulkError";
	/** 配送指定時間が存在しません。 */
	public static final String DESIGNATED_DELIVERY_TIME_NOT_FOUND_ERROR = "designatedDeliveryTimeNotFoundError";
	/** 明細行はすべて対象外ですが、除外を確認して下さい。 */
	public static final String DETAIL_LINE_CANNOT_SELECT_EXCEPTION_ERROR = "detailLineCannotSelectExceptionError";
	/** 明細にエラーがあります。 */
	public static final String DETAIL_LINE_FOUND_ERROR = "detailLineFoundError";
	/** 明細が表示されていません。 */
	public static final String DETAIL_LINE_NOT_DISPLAY_ERROR = "detailLineNotDisplayError";
	/** 明細行を入力して下さい。 */
	public static final String DETAIL_LINE_NOT_INPUT_ERROR = "detailLineNotInputError";
	/** 次 */
	public static final String DETAIL_NEXT = "detailNext";
	/** 前 */
	public static final String DETAIL_PREVIOUS = "detailPrevious";
	/** 明細 */
	public static final String DETAIL_TITLE = "detailTitle";
	/** 違う届先コードに対して、一括Bill of Ladingは発行できません。 */
	public static final String DIFFERENT_DELIV_SELECTED = "differentDelivSelected";
	/** 伝票区分が存在しません。 */
	public static final String DOCUMENT_CLASS_NOT_FOUND_ERROR = "documentClassNotFoundError";
	/** 処理は正常終了しましたが、エラーデータが含まれています。[/]WMS入荷伝票No.：[0]で登録しました。銘柄内容が異なるため新しい入庫ラベルNo.で登録された銘柄があります。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_AND_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "documentNumberConfirmationErrorIncludedAndNewCauseStoreLabelUsedInformation";
	/** 処理は正常終了しましたが、エラーデータが含まれています。[/]WMS入荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_INFORMATION = "documentNumberConfirmationErrorIncludedInformation";
	/** WMS入荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_INFORMATION = "documentNumberConfirmationInformation";
	/** WMS入荷伝票No.：[0]で登録しました。銘柄内容が異なるため新しい入庫ラベルNo.で登録された銘柄があります。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "documentNumberConfirmationNewCauseStoreLabelUsedInformation";
	/** 伝票番号が重複しています。 */
	public static final String DOCUMENT_NUMBER_DUPLICATE_ERROR = "documentNumberDuplicateError";
	/** 伝票番号が既に存在します。 */
	public static final String DOCUMENT_NUMBER_FOUND_ERROR = "documentNumberFoundError";
	/** WMS出荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_SHIPPING_SLIP_NO_INFORMATION = "documentShippingSlipNoInformation";
	/** ユーザマスタに存在しません。 */
	public static final String DOES_NOT_EXIST_IN_THE_B_USER_ERROR = "doesNotExistInTheBUserError";
	/** 住所が変更されていますが、宜しいですか？ */
	public static final String EC_DELIV_ADDRESS_MODIFY_UPDATE_CONFIRMATION = "ecDelivAddressModifyUpdateConfirmation";
	/** 送付先住所を入力して下さい。 */
	public static final String EC_DELIV_ADDRESS_NO_INPUT_ERROR = "ecDelivAddressNoInputError";
	/** 注文ファイルの注文IDが重複しています。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_DUPLICATE_ERROR = "ecOrderBulkInputCannotUploadOrderDuplicateError";
	/** 銘柄ファイルの注文IDが注文ファイルに存在しません。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_NOT_FOUND_ERROR = "ecOrderBulkInputCannotUploadOrderNotFoundError";
	/** 注文ファイルの注文IDが銘柄ファイルに存在しません。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_PRODUCT_NOT_FOUND_ERROR = "ecOrderBulkInputCannotUploadProductNotFoundError";
	/** 未出荷以外の受注データはキャンセルできません。 */
	public static final String EC_ORDER_CANNOT_CANCEL_EXCEPT_NOT_SHIPPING_ERROR = "ecOrderCannotCancelExceptNotShippingError";
	/** 同梱する銘柄が異なる出庫作業No.で登録されています。同梱銘柄はまとめて出庫指示してください。（名寄せID：[0]） */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_DIFFERENT_PICKING_WORK_NO_ERROR = "ecOrderCannotStatementOutDifferentPickingWorkNoError";
	/** 未出荷またはキャンセルまたはエラー有または出庫指示削除の受注データは納品書を出力できません。 */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_NOT_SHIPPING_ERROR = "ecOrderCannotStatementOutNotShippingError";
	/** 同梱する銘柄の合計金額が異なります。同梱銘柄はまとめて出力してください。（名寄せID：[0]） */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_TOTAL_UNMATCH_ERROR = "ecOrderCannotStatementOutTotalUnmatchError";
	/** 未出荷以外の受注データは修正できません。 */
	public static final String EC_ORDER_CANNOT_UPDATE_EXCEPT_NOT_SHIPPING_ERROR = "ecOrderCannotUpdateExceptNotShippingError";
	/** EC受注データが既に取り込まれています。（受注番号：[0]） */
	public static final String EC_ORDER_DUPLICATE_ORDER_NO_ERROR = "ecOrderDuplicateOrderNoError";
	/** 銘柄CDが設定されていない行があるため、取込み出来ません。 */
	public static final String EC_ORDER_NECESSARY_PRODUCT_CD_ERROR = "ecOrderNecessaryProductCdError";
	/** 未出荷またはキャンセルまたはエラー有または出庫指示削除の受注データは送り状データを作成できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_INVOICE_CREATE_NOT_SHIPPING_ERROR = "ecShippingTagDataOutputCannotInvoiceCreateNotShippingError";
	/** 異なる運送業者のデータが選択されているため、出力できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_CARRIER_TO_ERROR = "ecShippingTagDataOutputCannotSelectDifferentCarrierToError";
	/** 異なる送り状データ種別のデータが選択されているため、出力できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_DATA_TYPE_ERROR = "ecShippingTagDataOutputCannotSelectDifferentTagDataTypeError";
	/** 受信CD：[0] , 荷主CD：[1] */
	public static final String EDI_PARAMETER_CLIENT_CD_ONLY_INFORMATION = "ediParameterClientCdOnlyInformation";
	/** 受信CD：[0] , 拠店CD：[1] , 荷主CD：[2] */
	public static final String EDI_PARAMETER_INFORMATION = "ediParameterInformation";
	/** 受信CD：[0] , 郵便番号種別：[1] */
	public static final String EDI_ZIP_PARAMETER_INFORMATION = "ediZipParameterInformation";
	/** 緊急補充ゾーン補充荷姿が設定されていません。 */
	public static final String EM_REPLANISH_SHAPE_FLG_NO_INPUT_ERROR = "emReplanishShapeFlgNoInputError";
	/** 緊急補充ゾーン補充荷姿は複数の荷姿を選択できません。 */
	public static final String EM_REPLANISH_SHAPE_FLG_PLURAL_NOT_INPUT_ERROR = "emReplanishShapeFlgPluralNotInputError";
	/** 緊急フラグが存在しません。 */
	public static final String EMERGENCY_FLAG_NOT_FOUND_ERROR = "emergencyFlagNotFoundError";
	/** 緊急フラグを入力して下さい。 */
	public static final String EMERGENCY_FLG_NOT_INPUT_ERROR = "emergencyFlgNotInputError";
	/** 緊急補充移動先ロケーションが補充マスタに設定しません。 */
	public static final String EMERGENCY_REPLENISHMENT_LOCATION_NOT_FOUND_IN_REPLENISHMENT_MASTER_ERROR = "emergencyReplenishmentLocationNotFoundInReplenishmentMasterError";
	/** エラーチェック処理を行います。宜しいですか？ */
	public static final String ERROR_CHECK_EXECUTE_CONFIRMATION = "errorCheckExecuteConfirmation";
	/** 未出荷またはエラー以外の出荷指示に対して、エラーチェックを実行できません。 */
	public static final String ERROR_CHECK_START_ERROR = "errorCheckStartError";
	/** エラーデータを複製することはできません。 */
	public static final String ERROR_DATA_CANNOT_COPY_ERROR = "errorDataCannotCopyError";
	/** エラーデータが含まれています。 */
	public static final String ERROR_DATA_FOUND_ERROR = "errorDataFoundError";
	/** エラー以外は削除することはできません。 */
	public static final String ERROR_DELETE_START_ERROR = "errorDeleteStartError";
	/** Excelダウンロード */
	public static final String EXCEL_DOWNLOAD_TITLE_INFORMATION = "excelDownloadTitleInformation";
	/** [0]行のデータを読み込みました。 */
	public static final String EXCEL_READ_SUCCESS_CONFIRMATION = "excelReadSuccessConfirmation";
	/** 他のユーザが変更している可能性があります。内容を確認して下さい。 */
	public static final String EXCLUSIVE_CONTROL_ERROR = "exclusiveControlError";
	/** 定点は小数3桁以内を入力して下さい。 */
	public static final String FIXED_POINT_BULK_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "fixedPointBulkCheckInputDecimalLengthError";
	/** 定点は整数7桁以内を入力して下さい。 */
	public static final String FIXED_POINT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "fixedPointBulkCheckInputIntegerLengthError";
	/** 定点は小数[0]桁以内を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "fixedPointCheckInputDecimalLengthError";
	/** 定点は整数[0]桁以内を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "fixedPointCheckInputIntegerLengthError";
	/** 定点は最小0以上を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_MIN_ERROR = "fixedPointCheckInputMinError";
	/** 定点 数値のみ */
	public static final String FIXED_POINT_CHECK_NUMERIC_ONLY_ERROR = "fixedPointCheckNumericOnlyError";
	/** フラグ1（一町域が二以上の郵便番号で表される場合の表示）が存在しません。 */
	public static final String FLG1_NOT_FOUND_ERROR = "flg1NotFoundError";
	/** フラグ2（小字毎に番地が起番されている町域の表示）が存在しません。 */
	public static final String FLG2_NOT_FOUND_ERROR = "flg2NotFoundError";
	/** フラグ3（丁目を有する町域の場合の表示）が存在しません。 */
	public static final String FLG3_NOT_FOUND_ERROR = "flg3NotFoundError";
	/** フラグ4（一つの郵便番号で二以上の町域を表す場合の表示）が存在しません。 */
	public static final String FLG4_NOT_FOUND_ERROR = "flg4NotFoundError";
	/** フラグ5（個別番号の種別の表示）が存在しません。 */
	public static final String FLG5_NOT_FOUND_ERROR = "flg5NotFoundError";
	/** フラグ6（複数番号の有無）が存在しません。 */
	public static final String FLG6_NOT_FOUND_ERROR = "flg6NotFoundError";
	/** 出庫指示済またはピッキング済以外の出庫指示に対して、強制出荷の確定はできません。 */
	public static final String FORCED_SHIP_COMPLETE_START_ERROR = "forcedShipCompleteStartError";
	/** エラーデータ以外が含まれています。 */
	public static final String FOUND_EXCEPT_ERROR_DATA_ERROR = "foundExceptErrorDataError";
	/** ロケーションマスタに存在します。 */
	public static final String FOUND_IN_LOCATION_MASTER_ERROR = "foundInLocationMasterError";
	/** 取引先マスタに既に登録されています。 */
	public static final String FOUND_IN_PARTNER_MASTER_ERROR = "foundInPartnerMasterError";
	/** 棚補充マスタに既に登録されています。 */
	public static final String FOUND_IN_REPLENISHMENT_MASTER_ERROR = "foundInReplenishmentMasterError";
	/** 分納のデータが含まれています。 */
	public static final String FOUND_INSTALLMENT_RECEIVE_DATA_ERROR = "foundInstallmentReceiveDataError";
	/** 出荷未確定のデータが含まれています。 */
	public static final String FOUND_NOT_SHIP_COMPLETED_ERROR = "foundNotShipCompletedError";
	/** 出荷確定済のデータが含まれています。 */
	public static final String FOUND_SHIP_COMPLETED_ERROR = "foundShipCompletedError";
	/** 引当禁止のロケーションが含まれています。 */
	public static final String FOUND_STOPPED_ALLOC_TO_ERROR = "foundStoppedAllocToError";
	/** 出荷停止中、または引当不可の銘柄が含まれています。 */
	public static final String FOUND_STOPPED_OR_PRODUCT_ERROR = "foundStoppedOrProductError";
	/** 出荷停止の取引先が含まれています。 */
	public static final String FOUND_STOPPED_SHIP_TO_ERROR = "foundStoppedShipToError";
	/** 出荷停止の取引先が含まれていました。出庫指示一覧で確認して下さい。 */
	public static final String FOUND_STOPPED_SHIP_TO_INFORMATION = "foundStoppedShipToInformation";
	/** 荷札未発行のデータが含まれています。 */
	public static final String FOUND_TAG_NOT_PRINTED_DATA_ERROR = "foundTagNotPrintedDataError";
	/** 梱包情報取得時にエラーが発生しました。 */
	public static final String GET_PACKING_INFORMATION_FAILED_INFORMATION = "getPackingInformationFailedInformation";
	/** 納品日の取得に失敗しました。 */
	public static final String GET_SHIPPING_DATE_FAILED_INFORMATION = "getShippingDateFailedInformation";
	/** 【在庫最小単位】銘柄総重量(g)は整数10桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "grossWeightBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】銘柄総重量(g) は小数3桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "grossWeightCheckInputDecimalLengthError";
	/** 【在庫最小単位】総重量(g) は整数[0]桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "grossWeightCheckInputIntegerLengthError";
	/** 【在庫最小単位】銘柄総重量(g) は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_MIN_ERROR = "grossWeightCheckInputMinError";
	/** 【在庫最小単位】銘柄総重量(g)  数値のみ */
	public static final String GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "grossWeightCheckNumericOnlyError";
	/** 総重量(g) は小数3桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "grossWeightInputDecimalLengthError";
	/** 総重量(g)は整数[0]桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_INTEGER_LENGTH_ERROR = "grossWeightInputIntegerLengthError";
	/** 総重量(g)は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "grossWeightInputRequestMinIsZeroError";
	/** GTIN1が重複しています。 */
	public static final String GTIN14_DUPLICATE_ERROR = "gtin14DuplicateError";
	/** 取扱局は最大20文字以下を入力して下さい。 */
	public static final String HANDLING_ADDRESS_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "handlingAddressBulkInputCheckInputMaxError";
	/** 取扱局 全角文字のみ */
	public static final String HANDLING_ADDRESS_CHECK_FULL_WIDTH_ONLY_ERROR = "handlingAddressCheckFullWidthOnlyError";
	/** 取扱局は最大[0]文字以下を入力して下さい。 */
	public static final String HANDLING_ADDRESS_CHECK_INPUT_MAX_ERROR = "handlingAddressCheckInputMaxError";
	/** 対象の追跡Noは積込検品済です。 */
	public static final String HANDY_CARRIER_TRACE_NUM_LOAD_COMPLETE = "handyCarrierTraceNumLoadComplete";
	/** 選択した拠点ーと荷主を使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_CLIENT_CENTER_AUTH_ERROR = "handyClientCenterAuthError";
	/** 中断データが存在します再開しますか？ */
	public static final String HANDY_CONFIRM_INTERRUPT_RESUME = "handyConfirmInterruptResume";
	/** 検品未完了のデータは削除できません。 */
	public static final String HANDY_COULD_NOT_DELETE_NOT_COMPLETE = "handyCouldNotDeleteNotComplete";
	/** 納品先は出荷指示に存在しません。 */
	public static final String HANDY_CUSTOMER_NOT_IN_SHIPPING_INST_ERROR = "handyCustomerNotInShippingInstError";
	/** 該当データが存在しません。 */
	public static final String HANDY_DATA_NOT_FOUND_ERROR = "handyDataNotFoundError";
	/** 日付の入力が不正です(形式:YYYYMMDD)。 */
	public static final String HANDY_DATE_ERROR = "handyDateError";
	/** 配送コースCDが異なります。確認して下さい。 */
	public static final String HANDY_DELIVERY_COURSE_CD_DIFF_ERROR = "handyDeliveryCourseCdDiffError";
	/** 預託が選択されていません。 */
	public static final String HANDY_DEPOSIT_NOT_SELECT_ERROR = "handyDepositNotSelectError";
	/** エラーの伝票Noです。 */
	public static final String HANDY_ERROR_SLIP_NO = "handyErrorSlipNo";
	/** 使用する荷材CDを入力してください。 */
	public static final String HANDY_INPUT_BOX_CD_INFO = "handyInputBoxCdInfo";
	/** 該当の棚卸データは全て在庫調整済のため、棚卸入力できません。 */
	public static final String HANDY_INVENTORY_INPUT_ERROR = "handyInventoryInputError";
	/** 銘柄が異なります。 */
	public static final String HANDY_JAN_CD_DIFFER_ERROR = "handyJanCdDifferError";
	/** 該当のアイテムの指示数を超えています。 */
	public static final String HANDY_JAN_CD_INST_NUM_OVER_ERROR = "handyJanCdInstNumOverError";
	/** 銘柄をスキャンして下さい。 */
	public static final String HANDY_JAN_CD_NOT_INPUT_ERROR = "handyJanCdNotInputError";
	/** 該当のアイテムの数量を超えています。 */
	public static final String HANDY_JAN_CD_QTY_OVER_ERROR = "handyJanCdQtyOverError";
	/** 該当のアイテムの数量が不足です。 */
	public static final String HANDY_JAN_CD_QTY_SHORTAGE_ERROR = "handyJanCdQtyShortageError";
	/** 該当のアイテムの残数を超えています。 */
	public static final String HANDY_JAN_CD_SPG_QTY_OVER_ERROR = "handyJanCdSpgQtyOverError";
	/** 完了時、ソースCDをクリアして下さい。 */
	public static final String HANDY_JAN_COMPLETE_NO_INPUT = "handyJanCompleteNoInput";
	/** 仮ロケは入庫仮ロケーションを入力してください。 */
	public static final String HANDY_LOC_NOT_NORMAL = "handyLocNotNormal";
	/** ロケーションまたはソースCDまたは入庫ラベルNo.を入力してください。 */
	public static final String HANDY_LOC_OR_JANCD_OR_STOCK_LABEL_NO_NOT_BLANK_ERROR = "handyLocOrJancdOrStockLabelNoNotBlankError";
	/** ログインできません。再度入力してください。 */
	public static final String HANDY_LOGIN_AUTH_ERROR = "handyLoginAuthError";
	/** 選択した拠点ーを使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_LOGIN_CENTER_AUTH_ERROR = "handyLoginCenterAuthError";
	/** 選択した荷主を使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_LOGIN_CLIENT_AUTH_ERROR = "handyLoginClientAuthError";
	/** メニューの設定を確認してください。 */
	public static final String HANDY_MENU_DEF_ERROR = "handyMenuDefError";
	/** 棚卸データ未作成。 */
	public static final String HANDY_NO_STOCK_COUNT = "handyNoStockCount";
	/** 出庫ロケと入庫ロケが同一です。 */
	public static final String HANDY_OUTLOC_INLOC_SAME_ERROR = "handyOutlocInlocSameError";
	/** 対象の出庫作業Noが削除されました。 */
	public static final String HANDY_PICKING_WORK_NO_DELETED = "handyPickingWorkNoDeleted";
	/** 出荷梱包Noを入力して下さい。 */
	public static final String HANDY_PICKING_WORK_NO_INPUT_ERROR = "handyPickingWorkNoInputError";
	/** すでに登録されています。 */
	public static final String HANDY_PRINTER_ALREADY_REGISTER_ERROR = "handyPrinterAlreadyRegisterError";
	/** プリンタグループを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_PRINTER_GROUP_NOT_SET = "handyPrinterSelectPrinterGroupNotSet";
	/** プリンタを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_PRINTER_NOT_SET = "handyPrinterSelectPrinterNotSet";
	/** 帳票レイアウトを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_REPORT_LAYOUT_NOT_SET = "handyPrinterSelectReportLayoutNotSet";
	/** トレイを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_TRAY_NOT_SET = "handyPrinterSelectTrayNotSet";
	/** 処理区分が選択されていません。 */
	public static final String HANDY_PROCESS_TYPE_NOT_SELECT_ERROR = "handyProcessTypeNotSelectError";
	/** 完了時、数量をクリアして下さい。 */
	public static final String HANDY_QTY_COMPLETE_NO_INPUT = "handyQtyCompleteNoInput";
	/** 数量は1以上で入力して下さい。 */
	public static final String HANDY_QTY_MUST_GREATER_THEN_ONE = "handyQtyMustGreaterThenOne";
	/** 予定無し入荷が行われていません。 */
	public static final String HANDY_RECEIVE_NO_PLAN_NOT_INPUT = "handyReceiveNoPlanNotInput";
	/** 検品が行われていません。 */
	public static final String HANDY_RECEIVE_NOT_INPUT = "handyReceiveNotInput";
	/** 検品数が予定数を超えています。 */
	public static final String HANDY_RECEIVE_QTY_OVER_ERROR = "handyReceiveQtyOverError";
	/** 該当のソースCD/銘柄CDが入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_JAN_NOT_FOUND_ERROR = "handyReceiveStoreJanNotFoundError";
	/** 該当のソースCD/銘柄CDの入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_QTY_ZERO_ERROR = "handyReceiveStoreJanQtyZeroError";
	/** 該当のソースCD/銘柄CDで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreJanStockNotFoundError";
	/** 該当のソースCD/銘柄CDの仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreJanStockQtyZeroError";
	/** 該当のソースCD/銘柄CDが全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STORED_ERROR = "handyReceiveStoreJanStoredError";
	/** 該当の仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreKariLocStockNotFoundError";
	/** 該当のラベルNOに入荷した在庫データ（仮ロケ）が存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LABEL_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLabelStockNotFoundError";
	/** 該当のラベルNOに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LABEL_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLabelStockQtyZeroError";
	/** 該当の期限日が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_NOT_FOUND_ERROR = "handyReceiveStoreLimitDtNotFoundError";
	/** 該当の期限日の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_QTY_ZERO_ERROR = "handyReceiveStoreLimitDtQtyZeroError";
	/** 該当の期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLimitDtStockNotFoundError";
	/** 該当の期限日の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLimitDtStockQtyZeroError";
	/** 該当の期限日が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STORED_ERROR = "handyReceiveStoreLimitDtStoredError";
	/** ロケは通常ロケーションを入力してください。 */
	public static final String HANDY_RECEIVE_STORE_LOC_NORMAL = "handyReceiveStoreLocNormal";
	/** 該当のロット、期限日が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_NOT_FOUND_ERROR = "handyReceiveStoreLotLimitDtNotFoundError";
	/** 該当のロット、期限日の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_QTY_ZERO_ERROR = "handyReceiveStoreLotLimitDtQtyZeroError";
	/** 該当のロット、期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLotLimitDtStockNotFoundError";
	/** 該当のロット、期限日の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLotLimitDtStockQtyZeroError";
	/** 該当のロット、期限日が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STORED_ERROR = "handyReceiveStoreLotLimitDtStoredError";
	/** 該当のロットが入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_NOT_FOUND_ERROR = "handyReceiveStoreLotNotFoundError";
	/** 該当のロットの入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_QTY_ZERO_ERROR = "handyReceiveStoreLotQtyZeroError";
	/** 該当のロットで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLotStockNotFoundError";
	/** 該当のロットの仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLotStockQtyZeroError";
	/** 該当のロットが全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STORED_ERROR = "handyReceiveStoreLotStoredError";
	/** 入荷数を超えて格納はできません。 */
	public static final String HANDY_RECEIVE_STORE_QTY_ERROR = "handyReceiveStoreQtyError";
	/** 該当の伝票No.が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_NOT_FOUND_ERROR = "handyReceiveStoreWorkNoNotFoundError";
	/** 該当の伝票No.の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_QTY_ZERO_ERROR = "handyReceiveStoreWorkNoQtyZeroError";
	/** 該当の伝票No.で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreWorkNoStockNotFoundError";
	/** 該当の伝票No.の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreWorkNoStockQtyZeroError";
	/** 該当の伝票No.が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STORED_ERROR = "handyReceiveStoreWorkNoStoredError";
	/** セッションが切断されました。再度ログインしてください。 */
	public static final String HANDY_SESSION_TIMEOUT = "handySessionTimeout";
	/** セッションが切断されました。 */
	public static final String HANDY_SESSION_TIMEOUT1 = "handySessionTimeout1";
	/** 再度ログインしてください。 */
	public static final String HANDY_SESSION_TIMEOUT2 = "handySessionTimeout2";
	/** 対象のケースピッキングNo.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_CASE_PICKING_NO_FORCE_FIXED = "handyShippingPackingCasePickingNoForceFixed";
	/** データはすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_COMPLETE = "handyShippingPackingComplete";
	/** 対象の出庫作業No.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_FORCE_FIXED = "handyShippingPackingForceFixed";
	/** 対象の出荷梱包No.はすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_ALL_COMPLETE = "handyShippingPackingNoAllComplete";
	/** 対象の出荷梱包No.が削除されました。 */
	public static final String HANDY_SHIPPING_PACKING_NO_DELETED = "handyShippingPackingNoDeleted";
	/** 対象の出荷梱包No.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_FORCE_FIXED = "handyShippingPackingNoForceFixed";
	/** 対象の梱包Noは積込検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_LOAD_COMPLETE = "handyShippingPackingNoLoadComplete";
	/** 未検品データが存在します。 */
	public static final String HANDY_SHIPPING_PACKING_NOT_COMPLETE = "handyShippingPackingNotComplete";
	/** 対象の出庫作業No.はすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_WORK_NO_ALL_COMPLETE = "handyShippingPackingWorkNoAllComplete";
	/** 対象の出庫作業No.は検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_WORK_NO_COMPLETE = "handyShippingPackingWorkNoComplete";
	/** 該当データが既にピック済です。 */
	public static final String HANDY_SHIPPING_PICKING_ALREADY = "handyShippingPickingAlready";
	/** 対象のケースピッキングNo.はすべてピッキング済です。 */
	public static final String HANDY_SHIPPING_PICKING_CASE_PICKING_NO_ALL_COMPLETE = "handyShippingPickingCasePickingNoAllComplete";
	/** 対象のケースピッキングNo.は削除されています。 */
	public static final String HANDY_SHIPPING_PICKING_CASE_PICKING_NO_DELETED = "handyShippingPickingCasePickingNoDeleted";
	/** 対象の出庫作業No.はすべてピッキング済です。 */
	public static final String HANDY_SHIPPING_PICKING_WORK_NO_ALL_COMPLETE = "handyShippingPickingWorkNoAllComplete";
	/** 対象の伝票が削除されました。 */
	public static final String HANDY_SLIP_NO_DELETED = "handySlipNoDeleted";
	/** 該当の銘柄は検品済です。 */
	public static final String HANDY_SPG_QTY_ONS_COMPLETE = "handySpgQtyOnsComplete";
	/** 該当の銘柄は検品数を超えています。 */
	public static final String HANDY_SPG_QTY_ONS_OVER_ERROR = "handySpgQtyOnsOverError";
	/** 該当のラベルNO移動が全て完了しました */
	public static final String HANDY_STOCK_LABEL_MOVE_COMPLETE = "handyStockLabelMoveComplete";
	/** 該当銘柄はすべて移動完了しました。 */
	public static final String HANDY_STOCK_MOVE_COMPLETE = "handyStockMoveComplete";
	/** 在庫区分マスタに在庫区分が存在しません。 */
	public static final String HANDY_STOCK_TYPE_FLAG_NOT_FOUND_ERROR = "handyStockTypeFlagNotFoundError";
	/** 在庫区分が選択されていません。 */
	public static final String HANDY_STOCK_TYPE_NOT_SELECT_ERROR = "handyStockTypeNotSelectError";
	/** 該当の入庫ラベルNo.は数量を超えています。 */
	public static final String HANDY_STORE_LABEL_NO_QTY_OVER_ERROR = "handyStoreLabelNoQtyOverError";
	/** 該当の入庫ラベルNo.の数量が不足です。 */
	public static final String HANDY_STORE_LABEL_NO_QTY_SHORTAGE_ERROR = "handyStoreLabelNoQtyShortageError";
	/** 入庫ラベルNo.が異なります。 */
	public static final String HANDY_STORE_NO_DIFFER_ERROR = "handyStoreNoDifferError";
	/** 入庫ラベルNo.をスキャンして下さい。 */
	public static final String HANDY_STORE_NO_NOT_INPUT_ERROR = "handyStoreNoNotInputError";
	/** 荷札/納品明細書出力エラー。PCで出力し直して下さい。検品は終了しています。 */
	public static final String HANDY_TAG_OUTPUT_ERROR = "handyTagOutputError";
	/** 取引先マスタに仕入先が存在しません。 */
	public static final String HANDY_VENDOR_FLAG_NOT_FOUND_ERROR = "handyVendorFlagNotFoundError";
	/** 【在庫最小単位】高さ(mm)は整数10桁以内を入力して下さい。 */
	public static final String HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "heightBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】高さ(mm)は小数3桁以内を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "heightCheckInputDecimalLengthError";
	/** 【在庫最小単位】高さ(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "heightCheckInputIntegerLengthError";
	/** 【在庫最小単位】高さ(mm)は最小0以上を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_MIN_ERROR = "heightCheckInputMinError";
	/** 【在庫最小単位】高さ(mm)数値のみ */
	public static final String HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "heightCheckNumericOnlyError";
	/** 高(mm)は小数3桁以内を入力して下さい。 */
	public static final String HEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "heightInputDecimalLengthError";
	/** 高さ(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String HEIGHT_INPUT_INTEGER_LENGTH_ERROR = "heightInputIntegerLengthError";
	/** 高さ(mm)は最小0以上を入力して下さい。 */
	public static final String HEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "heightInputRequestMinIsZeroError";
	/** 同じ伝票No.を選択して下さい。 */
	public static final String IDENTICAL_SHIPPING_SLIP_NO_NOT_SELECT_ERROR = "identicalShippingSlipNoNotSelectError";
	/** 親銘柄と構成品が同じです。 */
	public static final String IDENTITY_PARENT_PRODUCT_AND_STRUCTURE_PRODUCT_ERROR = "identityParentProductAndStructureProductError";
	/** 取込種別CDが重複しています。 */
	public static final String IMPORT_TYPE_DUPLICATE_ERROR = "importTypeDuplicateError";
	/** 取込み種別マスタに存在しません。 */
	public static final String IMPORT_TYPE_NOT_FOUND_ERROR = "importTypeNotFoundError";
	/** 入力内容に誤りがあります。 */
	public static final String INPUT_ERROR = "inputError";
	/** ロケーションCDFromTo逆転 */
	public static final String INPUT_LIMIT_CHECK_CD_REVERSAL_ERROR = "inputLimitCheckCdReversalError";
	/** 日付FromTo逆転 */
	public static final String INPUT_LIMIT_CHECK_REVERSAL_ERROR = "inputLimitCheckReversalError";
	/** 入力した期限日が入荷限界日を過ぎています。 */
	public static final String INPUT_LIMIT_DATE_OVER_ERROR = "inputLimitDateOverError";
	/** 数量に小数を含む銘柄は入力できません。 */
	public static final String INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR = "inputProductDecimalExistFlgError";
	/** 登録対象データが存在しません。 */
	public static final String INSERT_DATA_NOT_FOUND_INFORMATION = "insertDataNotFoundInformation";
	/** 対象の出庫作業No.／出荷梱包No.はケースのみなので、出荷検品できません。 */
	public static final String INSPECT_CANNOT_SELECT_ONLY_CASE_ERROR = "inspectCannotSelectOnlyCaseError";
	/** 一部欠品の出荷停止データが含まれています。 */
	public static final String INSPECT_CANNOT_START_SOME_STOCK_OUT_SHIPPING_STOP_DATA_ERROR = "inspectCannotStartSomeStockOutShippingStopDataError";
	/** すべての検品作業が完了しました。 */
	public static final String INSPECT_COMPLETE_ALL_INFORMATION = "inspectCompleteAllInformation";
	/** 該当銘柄は指示数を超えています。 */
	public static final String INSPECT_QTY_CANNOT_INPUT_MORE_THAN_SHIP_ODER_QTY_ERROR = "inspectQtyCannotInputMoreThanShipOderQtyError";
	/** 出荷検品処理を再開します。 */
	public static final String INSPECT_RESTART_CONFIRMATION = "inspectRestartConfirmation";
	/** 検品完了です。クリアしますか？ */
	public static final String INSPECT_RESULT_CLEAR_COMPLETED_CONFIRMATION = "inspectResultClearCompletedConfirmation";
	/** 検品クリア処理が正常終了しました。 */
	public static final String INSPECT_RESULT_CLEAR_COMPLETED_INFORMATION = "inspectResultClearCompletedInformation";
	/** 検品中です。クリアして宜しいでしょうか？ */
	public static final String INSPECT_RESULT_CLEAR_INSPECTING_CONFIRMATION = "inspectResultClearInspectingConfirmation";
	/** 該当銘柄の検品数をリセットします。宜しいですか？ */
	public static final String INSPECT_RESULT_QTY_CLEAR_CONFIRMATION = "inspectResultQtyClearConfirmation";
	/** 出荷検品済のデータが含まれています。 */
	public static final String INSPECTED_DATA_FOUND_ERROR = "inspectedDataFoundError";
	/** 検品ラベルの発行に失敗しました。ピッキングは終了しています。 */
	public static final String INSPECTION_LABEL_AUTO_PRINT_FAILED_WARN = "inspectionLabelAutoPrintFailedWarn";
	/** 構成品の指示数が超過している為、指示できません。 */
	public static final String INST_NUM_CANNOT_EXECUTE_OVERAGE_ERROR = "instNumCannotExecuteOverageError";
	/** 構成品の指示数が不足している為、指示できません。 */
	public static final String INST_NUM_CANNOT_EXECUTE_SHORTAGE_ERROR = "instNumCannotExecuteShortageError";
	/** 指示数に小数は入力できません。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_ERROR = "instNumCheckInputDecimalError";
	/** 指示数は小数3桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR = "instNumCheckInputDecimalMaxError";
	/** 指示数は0.001以上を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR = "instNumCheckInputDecimalMinError";
	/** 指示数は整数7桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_INTEGER_ERROR = "instNumCheckInputIntegerError";
	/** 指示数は整数[0]桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "instNumCheckInputIntegerLengthError";
	/** 指示数 数値のみ */
	public static final String INST_NUM_CHECK_NUMERIC_ONLY_ERROR = "instNumCheckNumericOnlyError";
	/** 指示数は[0]以上の数値を入力して下さい。 */
	public static final String INST_NUM_INPUT_REQUEST_MORE_THAN_MIN_ERROR = "instNumInputRequestMoreThanMinError";
	/** 指示数は1以上の数値を入力して下さい。 */
	public static final String INST_NUM_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "instNumInputRequestMoreThanOneError";
	/** 指示数を入力して下さい。 */
	public static final String INST_NUM_NOT_INPUT_ERROR = "instNumNotInputError";
	/** 分納の場合は分納指示日を入力して下さい。 */
	public static final String INSTALLMENT_RECEIVE_PLAN_DATE_NOT_INPUT_ERROR = "installmentReceivePlanDateNotInputError";
	/** 構成品の指示数が不足している為、解除できません。 */
	public static final String INSTRUCTION_REGISTER_SHORTAGE_ERROR = "instructionRegisterShortageError";
	/** 検品中断処理が正常終了しました。 */
	public static final String INTERRUPT_INSPECT_COMPLETE_INFORMATION = "interruptInspectCompleteInformation";
	/** 検品を中断します。宜しいですか？ */
	public static final String INTERRUPT_INSPECT_EXECUTE_CONFIRMATION = "interruptInspectExecuteConfirmation";
	/** 既に在庫調整済です、更新できません */
	public static final String INVENTORY_ALL_COMPLETE_STOCK_UPDATE_ERROR = "inventoryAllCompleteStockUpdateError";
	/** 差異が無い銘柄は更新できません */
	public static final String INVENTORY_ALL_NO_DIFF_STOCK_UPDATE_ERROR = "inventoryAllNoDiffStockUpdateError";
	/** 棚卸入力がされていないデータは更新できません。 */
	public static final String INVENTORY_BULK_UPDATE_CANNOT_UPDATE_NOT_INVENTORY_INPUT_ERROR = "inventoryBulkUpdateCannotUpdateNotInventoryInputError";
	/** 異なる送り状種別のデータが選択されているため、出力できません。 */
	public static final String INVOICE_TAG_REPORT_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_TYPE_ERROR = "invoiceTagReportOutputCannotSelectDifferentTagTypeError";
	/** 対象銘柄は検品済です。 */
	public static final String ITEM_INSPECTED_ERROR = "itemInspectedError";
	/** ソースCDは最大30文字以下を入力して下さい。 */
	public static final String JAN_CD_CHECK_INPUT_MAX_ERROR = "janCdCheckInputMaxError";
	/** ソースCDは数値で入力して下さい。 */
	public static final String JAN_CD_CHECK_NUMERIC_ONLY_ERROR = "janCdCheckNumericOnlyError";
	/** ソースCDが重複しています。 */
	public static final String JAN_CD_DUPLICATE_ERROR = "janCdDuplicateError";
	/** ソースCDの入力内容に誤りがあります。 */
	public static final String JAN_CODE_INPUT_ERROR = "janCodeInputError";
	/** 日本郵政着店マスタ取込（ワーク取込） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "jpCarrierZipInputProgramNameInputWorkInformation";
	/** 日本郵政着店マスタ取込（データ移行） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "jpCarrierZipInputProgramNameRegisterInformation";
	/** キー項目の変更はできません。 */
	public static final String KEY_ITEM_CANNOT_CHANGE_ERROR = "keyItemCannotChangeError";
	/** キーが重複しています。 */
	public static final String KEY_ITEM_DUPLICATE_ERROR = "keyItemDuplicateError";
	/** 労務マスタが登録されていません。管理者に問い合わせてください。 */
	public static final String LABOR_MASTER_IS_NOT_REGISTERED = "laborMasterIsNotRegistered";
	/** 荷姿の親子関係が不正です。 */
	public static final String LARGEST_SHAPE_CD_NOT_SELECTED_AS_PARENT_SHAPE_CD_ERROR = "largestShapeCdNotSelectedAsParentShapeCdError";
	/** 【在庫最小単位】縦(mm)は整数10桁以内を入力して下さい。 */
	public static final String LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "lengthBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】縦(mm)は小数3桁以内を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "lengthCheckInputDecimalLengthError";
	/** 【在庫最小単位】縦(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_INTEGER_LENGTH_ERROR = "lengthCheckInputIntegerLengthError";
	/** 【在庫最小単位】縦(mm)は最小0以上を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_MIN_ERROR = "lengthCheckInputMinError";
	/** 【在庫最小単位】縦(mm)数値のみ */
	public static final String LENGTH_CHECK_NUMERIC_ONLY_ERROR = "lengthCheckNumericOnlyError";
	/** 縦(mm)は小数3桁以内を入力して下さい。 */
	public static final String LENGTH_INPUT_DECIMAL_LENGTH_ERROR = "lengthInputDecimalLengthError";
	/** 縦(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String LENGTH_INPUT_INTEGER_LENGTH_ERROR = "lengthInputIntegerLengthError";
	/** 縦(mm)は最小0以上を入力して下さい。 */
	public static final String LENGTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "lengthInputRequestMinIsZeroError";
	/** この銘柄は期限日管理対象外です。期限日は入力しないで下さい。 */
	public static final String LIMIT_DATE_CANNOT_INPUT_EXCEPT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDateCannotInputExceptLimitDateManagementProductError";
	/** 期限日逆転管理フラグが存在しません。 */
	public static final String LIMIT_DATE_CLASS_NOT_FOUND_ERROR = "limitDateClassNotFoundError";
	/** 期限日を入力して下さい。 */
	public static final String LIMIT_DATE_NOT_INPUT_ERROR = "limitDateNotInputError";
	/** この銘柄は期限日管理対象です。期限日を入力して下さい。 */
	public static final String LIMIT_DATE_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDateNotInputLimitDateManagementProductError";
	/** 期限日逆転管理フラグが設定されているため、期限日数を入力して下さい。 */
	public static final String LIMIT_DAYS_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDaysNotInputLimitDateManagementProductError";
	/** 期限日が日付不正（形式：YYYYMMDD） */
	public static final String LIMIT_DT_DATE_ERROR = "limitDtDateError";
	/** 期限日管理フラグが存在しません。 */
	public static final String LIMIT_DT_MANAG_FLG_NOT_FOUND_ERROR = "limitDtManagFlgNotFoundError";
	/** 期限日管理フラグを入力して下さい。 */
	public static final String LIMIT_DT_MANAG_FLG_NOT_INPUT_ERROR = "limitDtManagFlgNotInputError";
	/** 期限日管理フラグに[管理しない]を設定した場合、期限日逆転防止フラグも[管理しない]を設定して下さい。 */
	public static final String LIMIT_DT_REVERSE_FLG_CHECK_NO_MANAG_ERROR = "limitDtReverseFlgCheckNoManagError";
	/** 期限日逆転防止フラグが存在しません。 */
	public static final String LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR = "limitDtReverseFlgNotFoundError";
	/** 期限日逆転防止フラグを入力して下さい。 */
	public static final String LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR = "limitDtReverseFlgNotInputError";
	/** 行を選択して下さい。 */
	public static final String LINE_NOT_SELECT_ERROR = "lineNotSelectError";
	/** 行番号を入力して下さい。 */
	public static final String LINE_NUMBER_NOT_INPUT_ERROR = "lineNumberNotInputError";
	/** バックロケは登録できません。 */
	public static final String LOCATION_CANNOT_REGISTER_BACK_LOCATION_ERROR = "locationCannotRegisterBackLocationError";
	/** 指定ロケーションCD 英数字のみ */
	public static final String LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "locationCdCheckAlphabetAndNumericOnlyError";
	/** 指定ロケーションCDは最大10文字以下を入力して下さい。 */
	public static final String LOCATION_CD_CHECK_INPUT_MAX_ERROR = "locationCdCheckInputMaxError";
	/** ロケーションCDを入力して下さい。 */
	public static final String LOCATION_CD_NOT_INPUT_ERROR = "locationCdNotInputError";
	/** ロケーションCD 英数字のみ */
	public static final String LOCATION_CODE_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "locationCodeCheckAlphabetAndNumericOnlyError";
	/** ロケーションCDは最大[0]文字以下を入力して下さい。 */
	public static final String LOCATION_CODE_CHECK_INPUT_MAX_ERROR = "locationCodeCheckInputMaxError";
	/** ロケーションCDが重複しています。 */
	public static final String LOCATION_CODE_DUPLICATE_ERROR = "locationCodeDuplicateError";
	/** 該当ロケーションが該当倉庫マスタに存在しません。 */
	public static final String LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR = "locationDataInWarehouseNotFoundError";
	/** ロケーションマスタ取込（ワーク取込） */
	public static final String LOCATION_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "locationInputProgramNameInputWorkInformation";
	/** ロケーションマスタ取込（データ移行） */
	public static final String LOCATION_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "locationInputProgramNameRegisterInformation";
	/** ロケーションマスタ一括登録 */
	public static final String LOCATION_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "locationMasterBulkInputProgramNameInformation";
	/** ロケーション名称が重複しています。 */
	public static final String LOCATION_NAME_DUPLICATE_ERROR = "locationNameDuplicateError";
	/** ロケーション名称は最大15文字以下を入力して下さい。 */
	public static final String LOCATION_NM_CHECK_INPUT_MAX_ERROR = "locationNmCheckInputMaxError";
	/** ロケーション名称を入力して下さい。 */
	public static final String LOCATION_NM_NOT_INPUT_ERROR = "locationNmNotInputError";
	/** ロケーションを入力して下さい。 */
	public static final String LOCATION_NOT_INPUT_ERROR = "locationNotInputError";
	/** ロケーション種別が存在しません。 */
	public static final String LOCATION_TYPE_NOT_FOUND_ERROR = "locationTypeNotFoundError";
	/** ロケーション種別を入力して下さい。 */
	public static final String LOCATION_TYPE_NOT_INPUT_ERROR = "locationTypeNotInputError";
	/** この銘柄はロット管理対象外です。ロットは入力しないで下さい。 */
	public static final String LOT_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "lotCannotInputExceptLotManagementProductError";
	/** ロットCD 半角文字のみ */
	public static final String LOT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "lotCdCheckHalfWidthOnlyError";
	/** ロットCDは最大[0]文字以下を入力して下さい。 */
	public static final String LOT_CD_CHECK_INPUT_MAX_ERROR = "lotCdCheckInputMaxError";
	/** 指定ロット 半角文字のみ */
	public static final String LOT_CHECK_HALF_WIDTH_ONLY_ERROR = "lotCheckHalfWidthOnlyError";
	/** 指定ロットは最大10文字以下を入力して下さい。 */
	public static final String LOT_CHECK_INPUT_MAX_ERROR = "lotCheckInputMaxError";
	/** ロット管理フラグが存在しません。 */
	public static final String LOT_MANAG_FLG_NOT_FOUND_ERROR = "lotManagFlgNotFoundError";
	/** ロット管理フラグを入力して下さい。 */
	public static final String LOT_MANAG_FLG_NOT_INPUT_ERROR = "lotManagFlgNotInputError";
	/** ロットマスタに存在しません。 */
	public static final String LOT_NOT_FOUND_IN_LOT_MASTER_ERROR = "lotNotFoundInLotMasterError";
	/** ロットを入力して下さい。 */
	public static final String LOT_NOT_INPUT_ERROR = "lotNotInputError";
	/** この銘柄はロット管理対象です。ロットを入力して下さい。 */
	public static final String LOT_NOT_INPUT_LOT_MANAGEMENT_PRODUCT_ERROR = "lotNotInputLotManagementProductError";
	/** ロット管理フラグに[管理しない]を設定した場合、ロット逆転防止フラグも[管理しない]を設定して下さい。 */
	public static final String LOT_REVERSE_FLG_CHECK_NO_MANAG_ERROR = "lotReverseFlgCheckNoManagError";
	/** ロット逆転防止フラグが存在しません。 */
	public static final String LOT_REVERSE_FLG_NOT_FOUND_ERROR = "lotReverseFlgNotFoundError";
	/** ロット逆転防止フラグを入力して下さい。 */
	public static final String LOT_REVERSE_FLG_NOT_INPUT_ERROR = "lotReverseFlgNotInputError";
	/** MACアドレスが重複しています。 */
	public static final String MAC_ADDRESS_DUPLICATE_ERROR = "macAddressDuplicateError";
	/** マッチング種別、キーワードが重複しています。 */
	public static final String MATCHING_DUPLICATE_ERROR = "matchingDuplicateError";
	/** マッチングマスタに存在しません。 */
	public static final String MATCHING_NOT_FOUND_ERROR = "matchingNotFoundError";
	/** 最大値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String MAX_NUMBER_LENGTH_OVER_ERROR = "maxNumberLengthOverError";
	/** 最小値には最大値未満の値を入力してください。 */
	public static final String MAX_NUMBER_SMALLER_THAN_MIN_NUMBER_ERROR = "maxNumberSmallerThanMinNumberError";
	/** 最大格納数 数値のみ */
	public static final String MAX_STORE_NUM_CHECK_DECIMAL_ONLY_ERROR = "maxStoreNumCheckDecimalOnlyError";
	/** 最大格納数に小数は入力できません。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_DECIMAL_ERROR = "maxStoreNumCheckInputDecimalError";
	/** 最大格納数は小数3桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "maxStoreNumCheckInputDecimalLengthError";
	/** 最大格納数は整数7桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_INTEGER_ERROR = "maxStoreNumCheckInputIntegerError";
	/** 最大格納数は整数[0]桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "maxStoreNumCheckInputIntegerLengthError";
	/** 最大格納数 数値のみ */
	public static final String MAX_STORE_NUM_CHECK_NUMERIC_ONLY_ERROR = "maxStoreNumCheckNumericOnlyError";
	/** 最大格納数は最小0以上を入力して下さい。 */
	public static final String MAX_STORE_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "maxStoreNumInputRequestMinIsZeroError";
	/** 最大格納数銘柄荷姿CD 英数字のみ */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "maxStoreProductShapeCdCheckAlphabetAndNumericOnlyError";
	/** 最大格納数銘柄荷姿CDは最大[0]文字以下を入力して下さい。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR = "maxStoreProductShapeCdCheckInputMaxError";
	/** 最大格納数銘柄荷姿CDは荷姿マスタに存在しません。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR = "maxStoreProductShapeCdNotFoundError";
	/** 最大格納数銘柄荷姿CDを入力して下さい。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR = "maxStoreProductShapeCdNotInputError";
	/** マージしないを選択。 */
	public static final String MERGE_CLS_CANNOT_SELECT_EXCEPTION_CASE_ERROR = "mergeClsCannotSelectExceptionCaseError";
	/** 入庫No.マージ区分が存在しません。 */
	public static final String MERGE_CLS_NOT_FOUND_ERROR = "mergeClsNotFoundError";
	/** 入庫No.マージ区分を入力して下さい。 */
	public static final String MERGE_CLS_NOT_INPUT_ERROR = "mergeClsNotInputError";
	/** 最小1以上 */
	public static final String MIN_IS_ONE_ERROR = "minIsOneError";
	/** 最小値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String MIN_NUMBER_LENGTH_OVER_ERROR = "minNumberLengthOverError";
	/** 未作業または作業中以外に対して、処理はできません。 */
	public static final String MOVE_INST_STATUS_CANNOT_EXECUTE_EXCEPT_WORKING_NONWORK_ERROR = "moveInstStatusCannotExecuteExceptWorkingNonworkError";
	/** 移動数が引当可能数を超えています。 */
	public static final String MOVE_QTY_CANNOT_INPUT_MORE_THANSTOCK_CAN_BE_ALLOCATE_ERROR = "moveQtyCannotInputMoreThanstockCanBeAllocateError";
	/** 移動数を入力して下さい。 */
	public static final String MOVE_QTY_NOT_INPUT_ERROR = "moveQtyNotInputError";
	/** 必須項目を入力して下さい。 */
	public static final String NECESSARY_ITEM_NOT_INPUT_ERROR = "necessaryItemNotInputError";
	/** 【在庫最小単位】銘柄重量(g) は整数10桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "netWeightBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】銘柄重量(g) は小数3桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "netWeightCheckInputDecimalLengthError";
	/** 【在庫最小単位】銘柄重量(g) は整数[0]桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "netWeightCheckInputIntegerLengthError";
	/** 【在庫最小単位】銘柄重量(g) は最小0以上を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_MIN_ERROR = "netWeightCheckInputMinError";
	/** 【在庫最小単位】銘柄重量(g) 数値のみ */
	public static final String NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "netWeightCheckNumericOnlyError";
	/** 銘柄重量(g) は小数3桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "netWeightInputDecimalLengthError";
	/** 銘柄重量(g)は整数[0]桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_INTEGER_LENGTH_ERROR = "netWeightInputIntegerLengthError";
	/** 銘柄重量(g)は最小0以上を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "netWeightInputRequestMinIsZeroError";
	/** 新規の削除データは登録されません。 */
	public static final String NEW_DELETE_DATA_CANNOT_REGISTER_ERROR = "newDeleteDataCannotRegisterError";
	/** 未発行データが含めるため、発行取消できません。 */
	public static final String NO_PRINTED_DATA_SELECTED = "noPrintedDataSelected";
	/** Bill of Lading Noが空白のため、貨物追跡番号登録できません。 */
	public static final String NO_PRINTED_SELECTED = "noPrintedSelected";
	/** ノード行です。 */
	public static final String NODE_LINE_CANNOT_SELECT_ERROR = "nodeLineCannotSelectError";
	/** 出勤されていません。 */
	public static final String NOT_ATTENDANCE_ERROR = "notAttendanceError";
	/** 【出勤】【退勤】【休憩開始】【休憩終了】のいずれかを選択してください。 */
	public static final String NOT_ATTENDANCE_LEAVE_WORK_REST_SELECTED_ERROR = "notAttendanceLeaveWorkRestSelectedError";
	/** 拠点：[0]、荷主：[1] */
	public static final String NOT_COMPLETE_SHIPPING_INSPECTION_CLIENT_CENTER_INFORMATION = "notCompleteShippingInspectionClientCenterInformation";
	/** 変更されたデータがありません。 */
	public static final String NOT_FOUND_CHANGED_DATA_ERROR = "notFoundChangedDataError";
	/** マスタに存在しません。 */
	public static final String NOT_FOUND_IN_MASTER_ERROR = "notFoundInMasterError";
	/** 銘柄ロケーションマスタに存在しません。 */
	public static final String NOT_FOUND_IN_PRODUCT_LOCATION_MASTER_ERROR = "notFoundInProductLocationMasterError";
	/** 補充棚マスタに存在しません。 */
	public static final String NOT_FOUND_IN_REPLENISHMENT_MASTER_ERROR = "notFoundInReplenishmentMasterError";
	/** 担当者マスタに存在しません。 */
	public static final String NOT_FOUND_IN_USER_CODE_ERROR = "notFoundInUserCodeError";
	/** 未検品のデータが含まれています。 */
	public static final String NOT_INSPECTED_FOUND_ERROR = "notInspectedFoundError";
	/** 名寄せ不可フラグが存在しません。 */
	public static final String NOT_MERGE_FLAG_NOT_FOUND_ERROR = "notMergeFlagNotFoundError";
	/** 未完了のデータを選択して下さい。 */
	public static final String NOT_SELECT_DATA_NOT_COMPLETED_ERROR = "notSelectDataNotCompletedError";
	/** 分納／打切り指示がされていません。 */
	public static final String NOT_SELECT_INSTALLMENT_OR_CLOSED_RECEIVE_ERROR = "notSelectInstallmentOrClosedReceiveError";
	/** 未入荷の行を選択して下さい。 */
	public static final String NOT_SELECT_NOT_COMPLETING_RECEIVE_ERROR = "notSelectNotCompletingReceiveError";
	/** 未出荷の場合はピッキングリスト発行画面へ遷移できません。 */
	public static final String NOT_SHIPPING_DATA_CANNOT_TRANSITION_ERROR = "notShippingDataCannotTransitionError";
	/** 配送コースマスタの追跡番号採番キーに登録されている拠点採番は削除できません。 */
	public static final String NUMBERING_CENTER_CANNOT_DELETE_USE_DELIVERY_COURSE_ERROR = "numberingCenterCannotDeleteUseDeliveryCourseError";
	/** 入力した数値が不正です。 */
	public static final String NUMERIC_VALUE_INPUT_ERROR = "numericValueInputError";
	/** 1以上の数値を入力して下さい。 */
	public static final String NUMERIC_VALUE_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "numericValueInputRequestMoreThanOneError";
	/** ワンタイムフラグが存在しません。 */
	public static final String ONETIME_FLG_NOT_FOUND_ERROR = "onetimeFlgNotFoundError";
	/** ワンタイムフラグを入力して下さい。 */
	public static final String ONETIME_FLG_NOT_INPUT_ERROR = "onetimeFlgNotInputError";
	/** 同じ入庫ラベルNo.で、異なるロケーション、期限日、ロットが入力できません。 */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_SAME_CONDITION_ERROR = "onsLabelNumberCannotInputSameConditionError";
	/** 入力された入庫ラベルNo.は銘柄入数が異なるため使用できません。（入庫ラベルNo：[0] , 銘柄CD：[1]） */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_UNIT_NUM_CHANGED_ERROR = "onsLabelNumberCannotInputUnitNumChangedError";
	/** 入力された入庫ラベルNo.([0])は異なる銘柄、在庫区分、預託、ロット、期限日、仕入先で登録されているため使用できません。[/]入庫ラベルNo.を入力しないで登録するか、新しい入庫ラベル... */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_ERROR = "onsLabelNumberCannotInputUsedOtherStockError";
	/** 入力された入庫ラベルNo.([0])は異なる銘柄、在庫区分、預託、ロット、期限日、仕入先、入庫日で登録されているため使用できません。[/]入庫ラベルNo.を入力しないで登録するか、新しい入... */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_IS_MANAGE_STORE_DT_ERROR = "onsLabelNumberCannotInputUsedOtherStockIsManageStoreDtError";
	/** 入庫ラベルNo.が重複しています。 */
	public static final String ONS_LABEL_NUMBER_DUPLICATE_ERROR = "onsLabelNumberDuplicateError";
	/** 同じ入庫ラベルNo.の在庫が異なるロケーションに存在します。 */
	public static final String ONS_LABEL_NUMBER_DUPLICATE_OTHER_LOCATION_ERROR = "onsLabelNumberDuplicateOtherLocationError";
	/** 入庫ラベルNoが存在しません。 */
	public static final String ONS_LABEL_NUMBER_NOT_FOUND_ERROR = "onsLabelNumberNotFoundError";
	/** 入庫ラベルNoに対する在庫情報は見つかりませんでした。新規登録の場合は入庫ラベルNoを消して下さい。 */
	public static final String ONS_LABEL_NUMBER_NOT_FOUND_IN_STOCK_INFORMATION_ERROR = "onsLabelNumberNotFoundInStockInformationError";
	/** 入庫ラベルNoを入力して下さい。 */
	public static final String ONS_LABEL_NUMBER_NOT_INPUT_ERROR = "onsLabelNumberNotInputError";
	/** 入庫ラベルNo.を再採番しました。入庫ラベルを印刷して下さい。 */
	public static final String ONS_NUM_RENUMBER_INFORMATION = "onsNumRenumberInformation";
	/** システム稼動時間外です！操作には十分注意して下さい。 */
	public static final String OPERATION_CAUTIONS_SYSTEM_ENDED_INFORMATION = "operationCautionsSystemEndedInformation";
	/** 他で出庫指示解除中です。 */
	public static final String OTHER_SHIP_INSTRUCTE_RELEASING = "otherShipInstructeReleasing";
	/** 他で出荷検品中です。 */
	public static final String OTHER_SHIPPING_PACKING = "otherShippingPacking";
	/** 他でピッキング中です。 */
	public static final String OTHER_SHIPPING_PICKING = "otherShippingPicking";
	/** 出力枚数に小数は入力できません。 */
	public static final String OUTPUT_CNT_CHECK_INPUT_DECIMAL_ERROR = "outputCntCheckInputDecimalError";
	/** 出力枚数は整数2桁以内を入力して下さい。 */
	public static final String OUTPUT_CNT_CHECK_INPUT_MAX_ERROR = "outputCntCheckInputMaxError";
	/** 出力枚数 数値のみ */
	public static final String OUTPUT_CNT_CHECK_NUMERIC_ONLY_ERROR = "outputCntCheckNumericOnlyError";
	/** 出力枚数は最小1以上を入力して下さい。 */
	public static final String OUTPUT_CNT_INPUT_REQUEST_MIN_IS_ONE_ERROR = "outputCntInputRequestMinIsOneError";
	/** 出力枚数を入力して下さい。 */
	public static final String OUTPUT_CNT_NOT_INPUT_ERROR = "outputCntNotInputError";
	/** 処理件数が[0]件を超えています。内容を見直し再度処理を実行して下さい。 */
	public static final String OVER_SAFETY_SIZE_TO_H_T_ERROR = "overSafetySizeToHTError";
	/** 既に最大行数[0]の為、行を追加できません。 */
	public static final String OVER_SHAPE_GROUP_DTL_ERROR = "overShapeGroupDtlError";
	/** 社内移動として既に登録されている社内入荷拠点と社内入荷倉庫です。 */
	public static final String OWNED_CENTER_AND_WAREHOUSE_FOUND_ERROR = "ownedCenterAndWarehouseFoundError";
	/** 取引先区分(社内)が存在しません。 */
	public static final String OWNED_CENTER_FLAG_NOT_FOUND_ERROR = "ownedCenterFlagNotFoundError";
	/** 社内入荷拠点が拠点マスタに存在しません。 */
	public static final String OWNED_CENTER_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "ownedCenterNotFoundInPartnerMasterError";
	/** 社内入荷拠点を入力して下さい。 */
	public static final String OWNED_CENTER_NOT_INPUT_ERROR = "ownedCenterNotInputError";
	/** 社内移動の出荷先です。取引先マスタの取引区分を社内、社内入荷拠点、社内入荷倉庫を登録して下さい。 */
	public static final String OWNED_SHIP_TO_INPUT_ERROR = "ownedShipToInputError";
	/** 社内入荷倉庫が倉庫マスタに存在しません。 */
	public static final String OWNED_WAREHOUSE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "ownedWarehouseNotFoundInWarehouseMasterError";
	/** 社内入荷倉庫を入力して下さい。 */
	public static final String OWNED_WAREHOUSE_NOT_INPUT_ERROR = "ownedWarehouseNotInputError";
	/** 総容積または総重量が大きすぎるため梱包データを登録できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_MAX_NUMBER_ERROR = "packingCalculateCannotExecuteMaxNumberError";
	/** 梱包荷材が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR = "packingCalculateCannotExecuteNotFoundBoxGroupError";
	/** 小数管理銘柄梱包単位が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_DECIMAL_PACKING_CLS_ERROR = "packingCalculateCannotExecuteNotFoundDecimalPackingClsError";
	/** 詰込区分が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PROCESS_CLS_ERROR = "packingCalculateCannotExecuteNotFoundProcessClsError";
	/** 銘柄毎別梱包が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PRODUCT_PART_PACKING_CLS_ERROR = "packingCalculateCannotExecuteNotFoundProductPartPackingClsError";
	/** 標準荷材の容積または重量が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_STANDARD_BOX_INFO_ERROR = "packingCalculateCannotExecuteNotFoundStandardBoxInfoError";
	/** 箱種のみを変更する場合は投入数を変更できません。 */
	public static final String PACKING_QTY_CANNOT_CHANGE_SAME_BOX_TYPE_ERROR = "packingQtyCannotChangeSameBoxTypeError";
	/** 入替可能な投入数を超えています。 */
	public static final String PACKING_QTY_CANNOT_INPUT_MORE_THAN_ALOWED_QTY_ERROR = "packingQtyCannotInputMoreThanAlowedQtyError";
	/** 投入数に小数は入力できません。 */
	public static final String PACKING_QTY_CHECK_INPUT_DECIMAL_ERROR = "packingQtyCheckInputDecimalError";
	/** 梱包明細の修正をクリアしました。 */
	public static final String PACKING_UPDATE_CLEAR_COMPLETED_INFORMATION = "packingUpdateClearCompletedInformation";
	/** 梱包明細を修正中です。クリアして宜しいですか？ */
	public static final String PACKING_UPDATE_CLEAR_CONFIRMATION = "packingUpdateClearConfirmation";
	/** 梱包明細修正が正常終了しました。追加した梱包の荷札を発行して下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_ADD_PACKING_INFORMATION = "packingUpdateCompleteAddPackingInformation";
	/** 梱包明細修正が正常終了しました。個口数に変更があります。送り状データの再出力および送り状、積込リストの再発行をして下さい。また、追加した梱包の荷札を発行して下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_ADD_PACKING_INFORMATION = "packingUpdateCompletePackingCountChangedAddPackingInformation";
	/** 梱包明細修正が正常終了しました。個口数に変更があります。送り状データの再出力および送り状、積込リストの再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_INFORMATION = "packingUpdateCompletePackingCountChangedInformation";
	/** 梱包明細修正が正常終了しました。個口数または届先情報に変更があります。送り状データの再出力および荷札、送り状、積込リストの再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION = "packingUpdateCompletePackingCountChangedReprintTagInformation";
	/** 梱包明細修正が正常終了しました。出荷梱包No.が変更されています。荷札の再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_REPRINT_TAG_INFORMATION = "packingUpdateCompleteReprintTagInformation";
	/** 検品済以外の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String PACKING_UPDATE_START_ERROR = "packingUpdateStartError";
	/** パラメータマスタに存在しません。 */
	public static final String PARAM_NOT_FOUND_ERROR = "paramNotFoundError";
	/** 荷姿と親荷姿が同じです。 */
	public static final String PARENT_CHILD_SHAPE_CD_INPUT_SAME_SHAPE_CD_ERROR = "parentChildShapeCdInputSameShapeCdError";
	/** 親銘柄が別の親銘柄の構成品に使用済みです。 */
	public static final String PARENT_PRODUCT_CANNOT_INPUT_ANOTHER_STRUCTURE_PRODUCT_ERROR = "parentProductCannotInputAnotherStructureProductError";
	/** 親銘柄CDが登録済みです。 */
	public static final String PARENT_PRODUCT_CODE_DUPLICATE_ERROR = "parentProductCodeDuplicateError";
	/** 親銘柄CDがセット品親マスタに存在しません。 */
	public static final String PARENT_PRODUCT_CODE_NOT_FOUND_ERROR = "parentProductCodeNotFoundError";
	/** 親荷姿が設定されていません。 */
	public static final String PARENT_SHAPE_CD_PLURAL_NOT_INPUT_ERROR = "parentShapeCdPluralNotInputError";
	/** 親銘柄の在庫が存在しません。 */
	public static final String PARENT_STOCK_NOT_FOUND_ERROR = "parentStockNotFoundError";
	/** 荷姿CDが重複しています。 */
	public static final String PARENTSHAPE_CODE_DUPLICATE_ERROR = "parentshapeCodeDuplicateError";
	/** すべてピッキング済です。 */
	public static final String PICKING_ALL_COMPLETED_ERROR = "pickingAllCompletedError";
	/** ピッキング中以外の出荷データはピッキング解除できません。 */
	public static final String PICKING_CANCEL_STATUS_ERROR = "pickingCancelStatusError";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、解除しますか？ */
	public static final String PICKING_INST_CANCEL_EXISTED_WORKING_STATE_CONFIRMATION = "pickingInstCancelExistedWorkingStateConfirmation";
	/** 出庫指示済またはピッキング中／済または検品中／済以外の出荷指示に対して、出庫指示を解除することはできません。 */
	public static final String PICKING_INST_CANCEL_START_ERROR = "pickingInstCancelStartError";
	/** 未出荷以外の出荷指示に対して、出庫指示はできません。 */
	public static final String PICKING_INST_START_ERROR = "pickingInstStartError";
	/** 選択したピッキングリストと異なる一次ピッキングリストを発行したデータが存在します。 */
	public static final String PICKING_LIST_CANNOT_PRINT_EXISTS_OTHER_LIST_PRINT_ERROR = "pickingListCannotPrintExistsOtherListPrintError";
	/** 出庫作業No.単位にピッキングリストが発行されますが宜しいですか？ */
	public static final String PICKING_LIST_PRINT_MULTIPLE_WAREHOUSE_CONFIRMATION = "pickingListPrintMultipleWarehouseConfirmation";
	/** ピックロケフラグが存在しません。 */
	public static final String PICKING_LOCATION_FLG_NOT_FOUND_ERROR = "pickingLocationFlgNotFoundError";
	/** ピックロケフラグを入力して下さい。 */
	public static final String PICKING_LOCATION_FLG_NOT_INPUT_ERROR = "pickingLocationFlgNotInputError";
	/** ピッキング提案を実施しますか？ */
	public static final String PICKING_METHOD_RECOMMENDATION_CALL_CONFIRM = "pickingMethodRecommendationCallConfirm";
	/** ピッキング提案を実施しますか？現在の提案データは削除されます。 */
	public static final String PICKING_METHOD_RECOMMENDATION_CALL_WITH_DELETE_CONFIRM = "pickingMethodRecommendationCallWithDeleteConfirm";
	/** 拠店CD：[0] , 荷主CD：[1] , 作業日：[2] , 納品先件数：[3] , ブレイクキー：[4] */
	public static final String PICKING_METHOD_RECOMMENDATION_PARAMETER_INFORMATION = "pickingMethodRecommendationParameterInformation";
	/** ピッキング提案 */
	public static final String PICKING_METHOD_RECOMMENDATION_PROGRAM_NAME = "pickingMethodRecommendationProgramName";
	/** 出庫数に小数は入力できません。 */
	public static final String PICKING_NUM_CHECK_INPUT_DECIMAL_ERROR = "pickingNumCheckInputDecimalError";
	/** ピッキング順序に小数は入力できません。 */
	public static final String PICKING_ORDER_CHECK_INPUT_DECIMAL_ERROR = "pickingOrderCheckInputDecimalError";
	/** ピッキング順序は整数5桁以内を入力して下さい。 */
	public static final String PICKING_ORDER_CHECK_INPUT_INTEGER_ERROR = "pickingOrderCheckInputIntegerError";
	/** ピッキング順序 数値のみ */
	public static final String PICKING_ORDER_CHECK_NUMERIC_ONLY_ERROR = "pickingOrderCheckNumericOnlyError";
	/** ピッキング順序は最小0以上を入力して下さい。 */
	public static final String PICKING_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "pickingOrderInputRequestMinIsZeroError";
	/** ピッキング順序を入力して下さい。 */
	public static final String PICKING_ORDER_NOT_INPUT_ERROR = "pickingOrderNotInputError";
	/** 補充銘柄CDの入力ある場合はピックロケを入力して下さい。 */
	public static final String PICKING_PICKING_LOCATION_FLG_NOT_INPUT_ERROR = "pickingPickingLocationFlgNotInputError";
	/** 出庫指示済またはピッキング中以外の出荷データはピッキングできません。 */
	public static final String PICKING_START_STATUS_ERROR = "pickingStartStatusError";
	/** 出庫作業メッセージは最大100文字以下を入力して下さい。 */
	public static final String PICKING_WORK_MESSAGE_CHECK_INPUT_MAX_ERROR = "pickingWorkMessageCheckInputMaxError";
	/** [0] (出庫作業No.：[1]) */
	public static final String PICKING_WORK_MESSAGE_INFORMATION = "pickingWorkMessageInformation";
	/** 複数の出荷伝票に出庫作業メッセージが登録されています。全ての出庫作業メッセージが上書きされますが宜しいですか？ */
	public static final String PICKING_WORK_MESSAGE_UPDATE_MULTIPLE_OVERWRITE_CONFIRM = "pickingWorkMessageUpdateMultipleOverwriteConfirm";
	/** 出庫作業No./出荷梱包No.英数字と-のみ */
	public static final String PICKING_WORK_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "pickingWorkNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 出庫作業No./出荷梱包No.は最大13文字以下を入力して下さい。 */
	public static final String PICKING_WORK_NO_CHECK_INPUT_MAX_ERROR = "pickingWorkNoCheckInputMaxError";
	/** 出庫作業No./出荷梱包No.が存在しません。 */
	public static final String PICKING_WORK_NO_NOT_FOUND_ERROR = "pickingWorkNoNotFoundError";
	/** 出庫作業No./出荷梱包No.が空白以外の行を選択して下さい。 */
	public static final String PICKING_WORK_NO_NOT_SELECT_ERROR = "pickingWorkNoNotSelectError";
	/** ピース荷姿が設定されていません。 */
	public static final String PIECE_SHAPE_NOT_FOUND_ERROR = "pieceShapeNotFoundError";
	/** 出荷検品中または出荷検品中断または出荷検品済以外の出荷指示に対して、出荷検品解除できません。 */
	public static final String PIECE_SHIPPING_INSPECT_CACEL_START_ERROR = "pieceShippingInspectCacelStartError";
	/** 出庫作業No.単位で出荷検品を解除しますが宜しいですか？ */
	public static final String PIECE_SHIPPING_INSPECT_CANCEL_CONFIRMATION = "pieceShippingInspectCancelConfirmation";
	/** 出荷検品中ですが、解除してよろしいですか？ */
	public static final String PIECE_SHIPPING_INSPECT_CANCEL_EXISTED_INSPECT_STATE_CONFIRMATION = "pieceShippingInspectCancelExistedInspectStateConfirmation";
	/** 予定顧客発注No. 英数字と-のみ */
	public static final String PLAN_CLIENT_ORDER_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planClientOrderNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 予定顧客発注No.は最大30文字以下を入力して下さい。 */
	public static final String PLAN_CLIENT_ORDER_NO_CHECK_INPUT_MAX_ERROR = "planClientOrderNoCheckInputMaxError";
	/** 予定顧客入荷指示No. 英数字と-のみ */
	public static final String PLAN_CLIENT_RECEIVE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planClientReceiveCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 予定顧客入荷指示No.は最大20文字以下を入力して下さい。 */
	public static final String PLAN_CLIENT_RECEIVE_CHECK_INPUT_MAX_ERROR = "planClientReceiveCheckInputMaxError";
	/** 同一の予定顧客入荷指示No.の伝票が既に登録済です。 */
	public static final String PLAN_CLIENT_RECEIVE_NO_CANNOT_REGISTER_ALREADY_USED_ERROR = "planClientReceiveNoCannotRegisterAlreadyUsedError";
	/** 同一の予定顧客入荷指示No.の伝票が他の行で入力されています。 */
	public static final String PLAN_CLIENT_RECEIVE_NO_DUPLICATE_ERROR = "planClientReceiveNoDuplicateError";
	/** 予定顧客入荷指示No.を入力して下さい。 */
	public static final String PLAN_CLIENT_RECEIVE_NOT_INPUT_ERROR = "planClientReceiveNotInputError";
	/** 預託は最大30文字以下を入力して下さい。 */
	public static final String PLAN_DEPOSIT_CD_CHECK_INPUT_MAX_ERROR = "planDepositCdCheckInputMaxError";
	/** 預託CDを入力して下さい。 */
	public static final String PLAN_DEPOSIT_CD_NOT_INPUT_ERROR = "planDepositCdNotInputError";
	/** 予定期限日が日付不正(形式:yyyy/MM/dd) */
	public static final String PLAN_LIMIT_DT_DATE_ERROR = "planLimitDtDateError";
	/** 予定ロケーションCD 英数字のみ */
	public static final String PLAN_LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "planLocationCdCheckAlphabetAndNumericOnlyError";
	/** 予定ロケーションCDは最大30文字以下を入力して下さい。 */
	public static final String PLAN_LOCATION_CD_CHECK_INPUT_MAX_ERROR = "planLocationCdCheckInputMaxError";
	/** 予定ロット 半角文字のみ */
	public static final String PLAN_LOT_CHECK_HALF_WIDTH_ONLY_ERROR = "planLotCheckHalfWidthOnlyError";
	/** 予定ロットは最大10文字以下を入力して下さい。 */
	public static final String PLAN_LOT_CHECK_INPUT_MAX_ERROR = "planLotCheckInputMaxError";
	/** 予定数は整数7桁以内を入力して下さい。 */
	public static final String PLAN_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "planNumBulkCheckInputIntegerLengthError";
	/** 予定数に小数は入力できません。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR = "planNumCheckInputDecimalError";
	/** 予定数は小数3桁以内を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR = "planNumCheckInputDecimalMaxError";
	/** 予定数は0.001以上を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR = "planNumCheckInputDecimalMinError";
	/** 予定数は1以上を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_MIN_ERROR = "planNumCheckInputMinError";
	/** 予定数 数値のみ */
	public static final String PLAN_NUM_CHECK_NUMERIC_ONLY_ERROR = "planNumCheckNumericOnlyError";
	/** 予定数を入力して下さい。 */
	public static final String PLAN_NUM_NOT_INPUT_ERROR = "planNumNotInputError";
	/** 予定入庫ラベルNo.が重複しています。 */
	public static final String PLAN_STORE_LABEL_NO_DUPLICATE_ERROR = "planStoreLabelNoDuplicateError";
	/** 仕入先CD 英数字と-のみ */
	public static final String PLAN_SUPPLIER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planSupplierCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 仕入先CDは最大10文字以下を入力して下さい。 */
	public static final String PLAN_SUPPLIER_CD_CHECK_INPUT_MAX_ERROR = "planSupplierCdCheckInputMaxError";
	/** 仕入先CDを入力して下さい。 */
	public static final String PLAN_SUPPLIER_CD_NOT_INPUT_ERROR = "planSupplierCdNotInputError";
	/** 予定倉庫CDは倉庫マスタに存在しません。 */
	public static final String PLAN_WAREHOUSE_CD_NOT_FOUND_ERROR = "planWarehouseCdNotFoundError";
	/** ピッキング提案のリクエストURLが未設定です。 */
	public static final String PMR_API_REQUEST_URL_NOT_FOUND_ERROR = "pmrApiRequestUrlNotFoundError";
	/** ピッキング提案システムに接続できません。 */
	public static final String PMR_API_SYSTEM_CANNOT_CONNECT_ERROR = "pmrApiSystemCannotConnectError";
	/** ピッキング提案に失敗しました。[0](問合せ番号：[1])[/][2] */
	public static final String PMR_API_SYSTEM_RESPONSE_ERROR = "pmrApiSystemResponseError";
	/** ピッキング提案は未使用に設定されています。 */
	public static final String PMR_NOT_USE_ERROR = "pmrNotUseError";
	/** ケースピッキングリスト発行済のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_CASE_ERROR = "pmrPickingListCannotPrintAlreadyPrintedCaseError";
	/** 1次ピッキングリスト発行済のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_ERROR = "pmrPickingListCannotPrintAlreadyPrintedError";
	/** 出庫指示済以外のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ILLEGAL_SHIP_STATUS_ERROR = "pmrPickingListCannotPrintIllegalShipStatusError";
	/** 郵便番号が郵便番号マスタに存在しません。 */
	public static final String POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR = "postCodeNotFoundPostCodeMasterError";
	/** 現在値には最大値よりも小さい値を入力してください。 */
	public static final String PRESENT_NUMBER_EXCEEDS_MAX_NUMBER_ERROR = "presentNumberExceedsMaxNumberError";
	/** 現在値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String PRESENT_NUMBER_LENGTH_OVER_ERROR = "presentNumberLengthOverError";
	/** 現在値には最小値-1よりも大きい値を入力してください。 */
	public static final String PRESENT_NUMBER_LESS_THAN_SUBTRACT_MIN_NUMBER2_ERROR = "presentNumberLessThanSubtractMinNumber2Error";
	/** 金額は整数7桁以内を入力して下さい。 */
	public static final String PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "priceBulkCheckInputIntegerLengthError";
	/** 金額は小数3桁以内を入力して下さい。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_ERROR = "priceCheckInputDecimalError";
	/** 金額は9999999.999以下を入力してください。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_MAX_ERROR = "priceCheckInputDecimalMaxError";
	/** 金額は0.001以上を入力してください。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "priceCheckInputDecimalMinError";
	/** 金額は9999999以下を入力してください。 */
	public static final String PRICE_CHECK_INPUT_MAX_ERROR = "priceCheckInputMaxError";
	/** 金額は0以上を入力してください。 */
	public static final String PRICE_CHECK_INPUT_MIN_ERROR = "priceCheckInputMinError";
	/** 金額 数値のみ */
	public static final String PRICE_CHECK_NUMERIC_ONLY_ERROR = "priceCheckNumericOnlyError";
	/** 処理は正常終了しましたが、エラーデータが含まれています。 */
	public static final String PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION = "processCompleteErrorIncludedInformation";
	/** 処理は正常終了しましたが、帳票の発行に失敗しました。(エラー内容：[0]) */
	public static final String PROCESS_COMPLETE_FAILED_PRINT_WARN = "processCompleteFailedPrintWarn";
	/** 処理を行いますか？ */
	public static final String PROCESS_EXECUTE_CONFIRMATION = "processExecuteConfirmation";
	/** 処理区分は最大30文字以下を入力して下さい。 */
	public static final String PROCESS_TYPE_CD_CHECK_INPUT_MAX_ERROR = "processTypeCdCheckInputMaxError";
	/** 処理区分が存在しません。 */
	public static final String PROCESS_TYPE_CD_NOT_FOUND_ERROR = "processTypeCdNotFoundError";
	/** 処理区分CDを入力して下さい。 */
	public static final String PROCESS_TYPE_CD_NOT_INPUT_ERROR = "processTypeCdNotInputError";
	/** 処理区分が24:調整(+)を指定してください。 */
	public static final String PROCESS_TYPE_CHECK_STOCK_ADJUSTMENT_PLUS_ERROR = "processTypeCheckStockAdjustmentPlusError";
	/** 処理区分CDが重複しています。 */
	public static final String PROCESS_TYPE_CODE_DUPLICATE_ERROR = "processTypeCodeDuplicateError";
	/** 処理区分マスタに存在しません。 */
	public static final String PROCESS_TYPE_NOT_FOUND_ERROR = "processTypeNotFoundError";
	/** 処理区分を入力して下さい。 */
	public static final String PROCESS_TYPE_NOT_INPUT_ERROR = "processTypeNotInputError";
	/** 同一の顧客入荷指示No、仕入先内で処理区分が不一致です。 */
	public static final String PROCESS_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "processTypeUnmatchInClientReceiveNoOnBulkError";
	/** 銘柄略称は最大35文字以下を入力して下さい。 */
	public static final String PRODUCT_ABBR_CHECK_INPUT_MAX_ERROR = "productAbbrCheckInputMaxError";
	/** 銘柄略称を入力して下さい。 */
	public static final String PRODUCT_ABBR_NOT_INPUT_ERROR = "productAbbrNotInputError";
	/** 銘柄CD、荷姿CDが重複しています。 */
	public static final String PRODUCT_AND_SHAPE_CODE_DUPLICATE_ERROR = "productAndShapeCodeDuplicateError";
	/** 出荷停止中の銘柄です。 */
	public static final String PRODUCT_CANNOT_SELECT_SHIPPING_STOP_ERROR = "productCannotSelectShippingStopError";
	/** 銘柄CDとシリアルNo.が重複しています。 */
	public static final String PRODUCT_CD_AND_SERIAL_NO_DUPLICATE_ERROR = "productCdAndSerialNoDuplicateError";
	/** 銘柄CD  英数字と記号のみ */
	public static final String PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "productCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 銘柄CDは入荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR = "productCdNotFoundReceiveDataError";
	/** 銘柄CD([0])は入荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR_DISP_CD = "productCdNotFoundReceiveDataErrorDispCd";
	/** 銘柄CDは出荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR = "productCdNotFoundShippingDataError";
	/** 銘柄CD([0])は出荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR_DISP_CD = "productCdNotFoundShippingDataErrorDispCd";
	/** 複数のロケーションに割り付いているため登録出来ません。 */
	public static final String PRODUCT_CODE_DUPLICATE_REPLENISHMENT_LOCATION_ERROR = "productCodeDuplicateReplenishmentLocationError";
	/** 銘柄マスタに存在しない銘柄が含まれています。 */
	public static final String PRODUCT_CODE_FOUND_DELETED_ERROR = "productCodeFoundDeletedError";
	/** 銘柄マスタに存在しない銘柄が含まれています。（銘柄CD：[0]） */
	public static final String PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR = "productCodeFoundDeletedWithCdError";
	/** 銘柄マスタ取込（ワーク取込） */
	public static final String PRODUCT_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "productInputProgramNameInputWorkInformation";
	/** 銘柄マスタ取込（データ移行） */
	public static final String PRODUCT_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "productInputProgramNameRegisterInformation";
	/** 銘柄ラベルの発行に失敗しました。ピッキングは終了しています。 */
	public static final String PRODUCT_LABEL_AUTO_PRINT_FAILED_WARN = "productLabelAutoPrintFailedWarn";
	/** 入荷済以外の入荷予定は銘柄ラベル発行できません。 */
	public static final String PRODUCT_LABEL_CANNOT_OUTPUT_NOT_RECEIVE_COMPLETED_ERROR = "productLabelCannotOutputNotReceiveCompletedError";
	/** 銘柄ラベルの発行に失敗しました。 */
	public static final String PRODUCT_LABEL_PRINT_ERROR = "productLabelPrintError";
	/** 銘柄マスタ一括登録 */
	public static final String PRODUCT_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "productMasterBulkInputProgramNameInformation";
	/** 銘柄名称は最大50文字以下を入力して下さい。 */
	public static final String PRODUCT_NM_CHECK_INPUT_MAX_ERROR = "productNmCheckInputMaxError";
	/** 銘柄名称を入力して下さい。 */
	public static final String PRODUCT_NM_NOT_INPUT_ERROR = "productNmNotInputError";
	/** 銘柄マスタに存在しません。 */
	public static final String PRODUCT_NOT_FOUND_ERROR = "productNotFoundError";
	/** 銘柄荷姿([0])はロケーション([1])の補充銘柄で使用しているため削除できません。 */
	public static final String PRODUCT_SHAPE_CANNOT_DELETE_USE_LOCATION_ERROR = "productShapeCannotDeleteUseLocationError";
	/** 在庫管理単位はロケーションの補充銘柄に使用しているため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_BULK_CANNOT_UPDATE_USE_LOCATION_ERROR = "productShapeGrpBulkCannotUpdateUseLocationError";
	/** 在庫管理単位はロケーション([0])の補充銘柄に使用しているため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_CANNOT_UPDATE_USE_LOCATION_ERROR = "productShapeGrpCannotUpdateUseLocationError";
	/** 最小在庫管理単位は使用中のため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_DTL_CANNOT_UPDATE_ERROR = "productShapeGrpDtlCannotUpdateError";
	/** 銘柄荷姿マスタ取込（ワーク取込） */
	public static final String PRODUCT_SHAPE_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "productShapeInputProgramNameInputWorkInformation";
	/** 銘柄荷姿マスタ取込（データ移行） */
	public static final String PRODUCT_SHAPE_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "productShapeInputProgramNameRegisterInformation";
	/** 銘柄荷姿マスタ一括登録 */
	public static final String PRODUCT_SHAPE_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "productShapeMasterBulkInputProgramNameInformation";
	/** 銘柄荷姿マスタに存在しません。 */
	public static final String PRODUCT_SHAPE_NOT_FOUND_ERROR = "productShapeNotFoundError";
	/** 全国地方公共団体コードは最大5文字以下を入力して下さい。 */
	public static final String PUBLIC_CD_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "publicCdBulkInputCheckInputMaxError";
	/** 全国地方公共団体コードは最大[0]文字以下を入力して下さい。 */
	public static final String PUBLIC_CD_CHECK_INPUT_MAX_ERROR = "publicCdCheckInputMaxError";
	/** 全国地方公共団体コード 数値のみ */
	public static final String PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR = "publicCdCheckNumericOnlyError";
	/** 数量は0より大きい値を入力してください。 */
	public static final String QTY_MUST_GREATER_THAN_ZERO = "qtyMustGreaterThanZero";
	/** 変更理由が存在しません。 */
	public static final String REASON_TYPE_NOT_FOUND_ERROR = "reasonTypeNotFoundError";
	/** 入荷済を選択して下さい。 */
	public static final String RECEIVE_COMPLETED_NOT_SELECT_ERROR = "receiveCompletedNotSelectError";
	/** 入荷納品ステータスを選択して下さい。 */
	public static final String RECEIVE_DELIVERY_STATUS_NOT_SELECT_ERROR = "receiveDeliveryStatusNotSelectError";
	/** 入荷する明細行を選択して下さい。 */
	public static final String RECEIVE_DETAIL_LINE_NOT_SELECT_ERROR = "receiveDetailLineNotSelectError";
	/** 入荷日が空白以外の行を選択して下さい。 */
	public static final String RECEIVE_DT_NOT_SELECT_ERROR = "receiveDtNotSelectError";
	/** 入荷日が変更されています。以前に入荷した銘柄の入荷日も変更されますが、登録して宜しいですか？ */
	public static final String RECEIVE_DT_UPDATE_CONFIRMATION = "receiveDtUpdateConfirmation";
	/** 未入荷またはエラー以外の入荷予定はエラーチェックできません。 */
	public static final String RECEIVE_ERROR_CHECK_START_ERROR = "receiveErrorCheckStartError";
	/** 入荷入力済です。 */
	public static final String RECEIVE_INPUT_FOUND_COMPLETED_INFORMATION = "receiveInputFoundCompletedInformation";
	/** 予定なしで登録された銘柄は検品できません。 */
	public static final String RECEIVE_INSPECTION_CANNOT_EXECUTE_NOT_FOUND_PLAN_DATA_ERROR = "receiveInspectionCannotExecuteNotFoundPlanDataError";
	/** この銘柄は期限日管理対象外です。予定期限日は入力しないで下さい。 */
	public static final String RECEIVE_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR = "receiveLimitDtManagFlgCannotInputExceptLimitDtManagementProductError";
	/** 期限日管理フラグに[管理しない]を設定した場合、入荷期限日数は入力しないで下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR = "receiveLimitNumCannotInputExceptLimitDtManagFlgProductError";
	/** 入荷期限日数に小数は入力できません。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "receiveLimitNumCheckInputDecimalError";
	/** 入荷期限日数は整数[0]桁以内を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "receiveLimitNumCheckInputIntegerLengthError";
	/** 入荷期限日数は整数5桁以内を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "receiveLimitNumCheckInputMaxError";
	/** 入荷期限日数 数値のみ */
	public static final String RECEIVE_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "receiveLimitNumCheckNumericOnlyError";
	/** 入荷期限日数は最小0以上を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "receiveLimitNumInputRequestMinIsZeroError";
	/** 入荷期限日数を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_NOT_INPUT_ERROR = "receiveLimitNumNotInputError";
	/** この銘柄はロット管理対象外です。予定ロットは入力しないで下さい。 */
	public static final String RECEIVE_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "receiveLotManagFlgCannotInputExceptLotManagementProductError";
	/** 入荷番号を入力して下さい。 */
	public static final String RECEIVE_NUMBER_NOT_INPUT_ERROR = "receiveNumberNotInputError";
	/** 入荷検品ステータスが未完以外は分納／打切りすることはできません。 */
	public static final String RECEIVE_PART_INSERT_START_ERROR = "receivePartInsertStartError";
	/** 入荷予定一括登録 */
	public static final String RECEIVE_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION = "receivePlanBulkInputProgramNameInformation";
	/** 拠点間移動の入荷予定は変更できません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_CNETER_TRANSIT_ERROR = "receivePlanCannotChangeCneterTransitError";
	/** 未入荷、エラー以外の銘柄が含まれているため、入荷予定の削除は出来ません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_EXCEPT_NOT_OR_ERROR_ERROR = "receivePlanCannotChangeExceptNotOrErrorError";
	/** 入荷中／入荷済の銘柄が含まれているため、入荷予定の変更は出来ません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_RECEIVING_OR_COMPLETED_ERROR = "receivePlanCannotChangeReceivingOrCompletedError";
	/** 拠点間移動の入荷予定は削除できません。 */
	public static final String RECEIVE_PLAN_CANNOT_DELETE_CNETER_TRANSIT_ERROR = "receivePlanCannotDeleteCneterTransitError";
	/** 同一の予定顧客入荷指示Ｎo.内で処理区分が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_PROCESS_TYPE_UNMATCH_ERROR = "receivePlanCannotRegisterProcessTypeUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で入荷予定日が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_RECEIVE_PLAN_DT_UNMATCH_ERROR = "receivePlanCannotRegisterReceivePlanDtUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で在庫区分が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_STOCK_TYPE_UNMATCH_ERROR = "receivePlanCannotRegisterStockTypeUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で仕入先が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_SUPPLIER_UNMATCH_ERROR = "receivePlanCannotRegisterSupplierUnmatchError";
	/** 入荷入力対象外です。 */
	public static final String RECEIVE_PLAN_CANNOT_SELECT_RECEIVE_COMPLETED_ERROR = "receivePlanCannotSelectReceiveCompletedError";
	/** 未入荷またはエラー以外の入荷予定は修正できません。 */
	public static final String RECEIVE_PLAN_CHANGE_START_ERROR = "receivePlanChangeStartError";
	/** 入荷データが削除されました。 */
	public static final String RECEIVE_PLAN_DATA_DELETE_INFORMATION = "receivePlanDataDeleteInformation";
	/** 未入荷またはエラー以外の入荷予定は削除できません。 */
	public static final String RECEIVE_PLAN_DELETE_START_ERROR = "receivePlanDeleteStartError";
	/** 入荷予定日が日付不正(形式:yyyy/MM/dd) */
	public static final String RECEIVE_PLAN_DT_DATE_ERROR = "receivePlanDtDateError";
	/** 入荷予定日を入力してください。 */
	public static final String RECEIVE_PLAN_DT_NOT_INOUT_ERROR = "receivePlanDtNotInoutError";
	/** 入荷予定日を入力して下さい。 */
	public static final String RECEIVE_PLAN_DT_NOT_INPUT_ERROR = "receivePlanDtNotInputError";
	/** 同一の顧客入荷指示No、仕入先内で入荷予定日が不一致です。 */
	public static final String RECEIVE_PLAN_DT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "receivePlanDtUnmatchInClientReceiveNoOnBulkError";
	/** 銘柄情報がマスタに存在しませんが、登録して宜しいですか？ */
	public static final String RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION = "receivePlanRegisterproductCodeNotFoundConfirmation";
	/** 明細行が入力されていません。対象データを削除して宜しいですか？ */
	public static final String RECEIVE_PLAN_UPDATE_DETAIL_LINE_NOT_INPUT_CONFIRMATION = "receivePlanUpdateDetailLineNotInputConfirmation";
	/** 銘柄情報がマスタに存在しませんが、更新して宜しいですか？ */
	public static final String RECEIVE_PLAN_UPDATEPRODUCT_CODE_NOT_FOUND_CONFIRMATION = "receivePlanUpdateproductCodeNotFoundConfirmation";
	/** 入荷予定数を超えていますが、登録しますか？ */
	public static final String RECEIVE_QTY_REGISTER_MORE_THAN_PLAN_CONFIRMATION = "receiveQtyRegisterMoreThanPlanConfirmation";
	/** 入荷実績を取り消しますか？ */
	public static final String RECEIVE_RESULT_CANCEL_CONFIRMATION = "receiveResultCancelConfirmation";
	/** 他端末で検品中ですが、入荷取消を行ってもよろしいですか？ */
	public static final String RECEIVE_RESULT_CANCEL_DISREGARD_EXCLUSIVE_CONTROL_CONFIRMATION = "receiveResultCancelDisregardExclusiveControlConfirmation";
	/** エラーの入荷予定に対し、実績は登録できません。 */
	public static final String RECEIVE_RESULT_INSERT_START_ERROR = "receiveResultInsertStartError";
	/** WMS入荷伝票No.英数字と-のみ */
	public static final String RECEIVE_SLIP_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "receiveSlipNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** WMS入荷伝票No.は最大13文字以下を入力して下さい。 */
	public static final String RECEIVE_SLIP_NO_CHECK_INPUT_MAX_ERROR = "receiveSlipNoCheckInputMaxError";
	/** WMS入荷伝票No.が存在しません。 */
	public static final String RECEIVE_SLIP_NO_NOT_FOUND_ERROR = "receiveSlipNoNotFoundError";
	/** WMS入荷伝票No.が空白以外の行を選択して下さい。 */
	public static final String RECEIVE_SLIP_NO_NOT_SELECT_ERROR = "receiveSlipNoNotSelectError";
	/** 入庫推奨ロケーションがロケーションマスタに存在しません。 */
	public static final String RECOMMENDED_LOCATION_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "recommendedLocationNotFoundInLocationMasterError";
	/** 推奨倉庫が倉庫マスタに存在しません。 */
	public static final String RECOMMENDED_WAREHOUSE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "recommendedWarehouseNotFoundInWarehouseMasterError";
	/** 梱包情報登録時にエラーが発生しました。 */
	public static final String REGISTERE_PACKING_INFORMATION_FAILED_INFORMATION = "registerePackingInformationFailedInformation";
	/** 登録済の行は削除は出来ません。 */
	public static final String REGISTERED_LINE_CANNOT_DELETE_ERROR = "registeredLineCannotDeleteError";
	/** 補充預託CDは取引先マスタ存在しません。 */
	public static final String REPLENISH_DEPOSIT_CD_NOT_FOUND_ERROR = "replenishDepositCdNotFoundError";
	/** 補充預託CDを入力して下さい。 */
	public static final String REPLENISH_DEPOSIT_CD_NOT_INPUT_ERROR = "replenishDepositCdNotInputError";
	/** ピックロケ以外の場合、補充情報は設定しないで下さい。 */
	public static final String REPLENISH_INFO_INPUT_ERROR = "replenishInfoInputError";
	/** 補充指示数が0以下のデータは補充できません。 */
	public static final String REPLENISH_INST_CANNNOT_REGISTER_INST_NUM_ZERO_ERROR = "replenishInstCannnotRegisterInstNumZeroError";
	/** 画面で操作しているデータが古い為、最新情報を検索してください。 */
	public static final String REPLENISH_INST_CANNNOT_REGISTER_PAGE_DATA_IS_OLD_ERROR = "replenishInstCannnotRegisterPageDataIsOldError";
	/** 補充指示が正常に終了しました。[0]にて確認して下さい。 */
	public static final String REPLENISH_INST_COMPLETE_INFORMATION = "replenishInstCompleteInformation";
	/** 補充点 数値のみ */
	public static final String REPLENISH_P_NUM_CHECK_DECIMAL_ONLY_ERROR = "replenishPNumCheckDecimalOnlyError";
	/** 補充点に小数は入力できません。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_ERROR = "replenishPNumCheckInputDecimalError";
	/** 補充点は小数3桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "replenishPNumCheckInputDecimalLengthError";
	/** 補充点は整数7桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_INTEGER_ERROR = "replenishPNumCheckInputIntegerError";
	/** 補充点は整数[0]桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "replenishPNumCheckInputIntegerLengthError";
	/** 補充点 数値のみ */
	public static final String REPLENISH_P_NUM_CHECK_NUMERIC_ONLY_ERROR = "replenishPNumCheckNumericOnlyError";
	/** 補充点荷姿CD 英数字のみ */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "replenishPProductShapeCdCheckAlphabetAndNumericOnlyError";
	/** 補充点荷姿CDは最大[0]文字以下を入力して下さい。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR = "replenishPProductShapeCdCheckInputMaxError";
	/** 補充点荷姿CDは荷姿マスタに存在しません。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR = "replenishPProductShapeCdNotFoundError";
	/** 補充点荷姿CDを入力して下さい。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR = "replenishPProductShapeCdNotInputError";
	/** 補充銘柄CD 英数字と記号のみ */
	public static final String REPLENISH_PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "replenishProductCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 補充銘柄CDは最大[0]文字以下を入力して下さい。 */
	public static final String REPLENISH_PRODUCT_CD_CHECK_INPUT_MAX_ERROR = "replenishProductCdCheckInputMaxError";
	/** 補充銘柄CDが銘柄マスタに存在しません。 */
	public static final String REPLENISH_PRODUCT_CD_NOT_FOUND_ERROR = "replenishProductCdNotFoundError";
	/** 補充銘柄CDを入力して下さい。 */
	public static final String REPLENISH_PRODUCT_CD_NOT_INPUT_ERROR = "replenishProductCdNotInputError";
	/** 補充在庫区分CDは在庫区分マスタに存在しません。 */
	public static final String REPLENISH_STOCK_TYPE_CD_NOT_FOUND_ERROR = "replenishStockTypeCdNotFoundError";
	/** 補充在庫区分CDを入力して下さい。 */
	public static final String REPLENISH_STOCK_TYPE_CD_NOT_INPUT_ERROR = "replenishStockTypeCdNotInputError";
	/** 補充指示を取消します。宜しいですか？ */
	public static final String REPLENISHMENT_CANCEL_CONFIRMATION = "replenishmentCancelConfirmation";
	/** 補充を完了します。宜しいですか？ */
	public static final String REPLENISHMENT_COMPLETE_CONFIRMATION = "replenishmentCompleteConfirmation";
	/** 補充MAXバラ数には補充MINバラ数より大きい値を設定して下さい。 */
	public static final String REPLENISHMENT_MAX_QTY_CANNOT_INPUT_LESS_THAN_MIN_QTY_ERROR = "replenishmentMaxQtyCannotInputLessThanMinQtyError";
	/** 補充MAXバラ数には補充単位以上の値を設定して下さい。 */
	public static final String REPLENISHMENT_MAX_QTY_CANNOT_INPUT_LESS_THAN_UNIT_QTY_ERROR = "replenishmentMaxQtyCannotInputLessThanUnitQtyError";
	/** 補充指示数は補充単位の倍数で入力して下さい。 */
	public static final String REPLENISHMENT_ORDER_QTY_CANNOT_INPUT_EXCEPT_MULTIPLE_UNIT_QTY_ERROR = "replenishmentOrderQtyCannotInputExceptMultipleUnitQtyError";
	/** 補充指示数は1以上で入力して下さい。 */
	public static final String REPLENISHMENT_ORDER_QTY_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "replenishmentOrderQtyInputRequestMoreThanOneError";
	/** 補充優先順位に「0」より大きい数値を入力して下さい。 */
	public static final String REPLENISHMENT_PRIORITY_INPUT_REQUEST_MORE_THAN_ZERO_ERROR = "replenishmentPriorityInputRequestMoreThanZeroError";
	/** 同一銘柄が既に存在しているため、登録できません。 */
	public static final String REPLENISHMENT_PRODUCT_CANNOT_REGISTER_EXISTED_ERROR = "replenishmentProductCannotRegisterExistedError";
	/** 補充元の在庫が存在しません。 */
	public static final String REPLENISHMENT_STOCK_NOT_FOUND_ERROR = "replenishmentStockNotFoundError";
	/** 補充先在庫数が補充数ＭＡＸを超えるため指示できません。 */
	public static final String REPLENISHMENT_UNIT_QTY_CANNOT_INPUT_MORE_THAN_MAX_QTY_ERROR = "replenishmentUnitQtyCannotInputMoreThanMaxQtyError";
	/** 送り状データ */
	public static final String REPORT_NAME_INVOICE = "reportNameInvoice";
	/** 納品明細書 */
	public static final String REPORT_NAME_PACKING = "reportNamePacking";
	/** 送り状 */
	public static final String REPORT_NAME_SLIP = "reportNameSlip";
	/** 積込リスト */
	public static final String REPORT_NAME_STW = "reportNameStw";
	/** 荷札 */
	public static final String REPORT_NAME_TAG = "reportNameTag";
	/** 発行対象を選択して下さい。 */
	public static final String REPORT_NOT_SELECT_ERROR = "reportNotSelectError";
	/** 帳票の発行に失敗しました。 */
	public static final String REPORT_PRINT_CANNOT_EXECUTE_ERROR = "reportPrintCannotExecuteError";
	/** セット品、補充、移動データ以外の指示書は出力できません。 */
	public static final String REPORT_PRINT_CANNOT_EXECUTE_EXCEPT_SET_REPLENISH_MOVE_DATA_ERROR = "reportPrintCannotExecuteExceptSetReplenishMoveDataError";
	/** 拠点が変更されました。再検索を行ってください。 */
	public static final String RESEARCH_BY_CENTER_CHANGE_WARN = "researchByCenterChangeWarn";
	/** 補充点は最小0以上を入力して下さい。 */
	public static final String RESTOCK_POINT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "restockPointInputRequestMinIsZeroError";
	/** 佐川送り状作成システムに接続できません。 */
	public static final String SAGAWA_API_SYSTEM_CANNOT_CONNECT_ERROR = "sagawaApiSystemCannotConnectError";
	/** 佐川送り状作成システムに接続できません。([0]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_CONNECT_RESPONSE_CODE_ERROR = "sagawaApiSystemCannotConnectResponseCodeError";
	/** 佐川送り状作成システムへのダウンロードURL要求でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_GET_DOWNLOAD_URL_ERROR = "sagawaApiSystemCannotExecuteGetDownloadUrlError";
	/** 佐川送り状作成システムへの荷札データ送信でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DATA_ERROR = "sagawaApiSystemCannotExecuteSendDataError";
	/** 佐川送り状作成システムへの荷物受渡書データ送信でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DELIVERY_DATA_ERROR = "sagawaApiSystemCannotExecuteSendDeliveryDataError";
	/** [0]：[1] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL = "sagawaApiSystemCannotExecuteSendErrorDetail";
	/** [0]：[1] (貨物追跡No.：[2]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_CARRIER_TRACE_NUM = "sagawaApiSystemCannotExecuteSendErrorDetailWithCarrierTraceNum";
	/** [0]：[1] (出庫作業No.：[2]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_PICKING_WORK_NO = "sagawaApiSystemCannotExecuteSendErrorDetailWithPickingWorkNo";
	/** 佐川送り状作成システムへの再発行要求でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_RETRY_ERROR = "sagawaApiSystemCannotExecuteSendRetryError";
	/** 4月 */
	public static final String SD_CALENDAR_APR = "sdCalendarApr";
	/** 8月 */
	public static final String SD_CALENDAR_AUG = "sdCalendarAug";
	/** 12月 */
	public static final String SD_CALENDAR_DEC = "sdCalendarDec";
	/** 2月 */
	public static final String SD_CALENDAR_FEB = "sdCalendarFeb";
	/** 金 */
	public static final String SD_CALENDAR_FRI = "sdCalendarFri";
	/** 1月 */
	public static final String SD_CALENDAR_JAN = "sdCalendarJan";
	/** 7月 */
	public static final String SD_CALENDAR_JUL = "sdCalendarJul";
	/** 6月 */
	public static final String SD_CALENDAR_JUN = "sdCalendarJun";
	/** 3月 */
	public static final String SD_CALENDAR_MAR = "sdCalendarMar";
	/** 5月 */
	public static final String SD_CALENDAR_MAY = "sdCalendarMay";
	/** 月 */
	public static final String SD_CALENDAR_MON = "sdCalendarMon";
	/** 11月 */
	public static final String SD_CALENDAR_NOV = "sdCalendarNov";
	/** 10月 */
	public static final String SD_CALENDAR_OCT = "sdCalendarOct";
	/** 土 */
	public static final String SD_CALENDAR_SAT = "sdCalendarSat";
	/** 9月 */
	public static final String SD_CALENDAR_SEP = "sdCalendarSep";
	/** 日 */
	public static final String SD_CALENDAR_SUN = "sdCalendarSun";
	/** 木 */
	public static final String SD_CALENDAR_THU = "sdCalendarThu";
	/** 火 */
	public static final String SD_CALENDAR_TUE = "sdCalendarTue";
	/** 水 */
	public static final String SD_CALENDAR_WED = "sdCalendarWed";
	/** シールが重複しています。 */
	public static final String SEAL_TYPE_DUPLICATE_ERROR = "sealTypeDuplicateError";
	/** 合計件数 */
	public static final String SEARCH_RESULT_TITLE = "searchResultTitle";
	/** [0]が出勤を選択しました。 */
	public static final String SELECT_ATTENDANCE_LOG = "selectAttendanceLog";
	/** 荷主拠点の取得に失敗しました。 */
	public static final String SELECT_CLIENT_CENTER_FAILED = "selectClientCenterFailed";
	/** 取引先の取得に失敗しました。 */
	public static final String SELECT_CUSTOMER_FAILED = "selectCustomerFailed";
	/** [0]が休憩終了を選択しました。 */
	public static final String SELECT_END_BREAK_LOG = "selectEndBreakLog";
	/** 選択 */
	public static final String SELECT_INFORMATION = "selectInformation";
	/** [0]が退勤を選択しました。 */
	public static final String SELECT_LEAVE_WORK_LOG = "selectLeaveWorkLog";
	/** [0]が休憩開始を選択しました。 */
	public static final String SELECT_START_BREAK_LOG = "selectStartBreakLog";
	/** シリアルNo.([0])は異なる伝票No.([1])で登録済です。 */
	public static final String SERIAL_NO_ALREADY_REGISTERED_ERROR = "serialNoAlreadyRegisteredError";
	/** シリアルNo.([0])は異なる出庫作業No./出荷梱包No.([1])で登録済です。 */
	public static final String SERIAL_NO_ALREADY_REGISTERED_ERROR_SHIPPING = "serialNoAlreadyRegisteredErrorShipping";
	/** シリアルNo.英数字と-のみ */
	public static final String SERIAL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "serialNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** シリアルNo.は最大30文字以下を入力して下さい。 */
	public static final String SERIAL_NO_CHECK_INPUT_MAX_ERROR = "serialNoCheckInputMaxError";
	/** シリアルNo.が存在しません。 */
	public static final String SERIAL_NO_NOT_FOUND_ERROR = "serialNoNotFoundError";
	/** シリアルNo.を入力して下さい。 */
	public static final String SERIAL_NO_NOT_INPUT_ERROR = "serialNoNotInputError";
	/** 入荷数を超過するためシリアルNo.を登録できません。 */
	public static final String SERIAL_NO_ORVER_RECEIVE_NUM_ERROR = "serialNoOrverReceiveNumError";
	/** 出庫数を超過するためシリアルNo.を登録できません。 */
	public static final String SERIAL_NO_ORVER_SHIPPING_NUM_ERROR = "serialNoOrverShippingNumError";
	/** シリアルNo.の範囲入力が不正です。 */
	public static final String SERIAL_NO_RANGE_FORMAT_ERROR = "serialNoRangeFormatError";
	/** 数量またはシリアルNo.のどちらかを入力してください。 */
	public static final String SERIAL_NO_RANGE_INPUT_ERROR = "serialNoRangeInputError";
	/** 小数有無フラグが「1：小数を含む」の場合、セット品の構成品として登録できません。 */
	public static final String SET_STRUCTURE_DECIMAL_EXIST_FLG_ERROR = "setStructureDecimalExistFlgError";
	/** 荷姿グループに紐付く銘柄の在庫が存在するため、削除できません。 */
	public static final String SHAPE_CANNOT_DELETE_USED_BY_PRODUCT_IN_STOCK_ERROR = "shapeCannotDeleteUsedByProductInStockError";
	/** 銘柄荷姿に登録されている荷姿です。[/]削除する場合、銘柄荷姿も削除されますが宜しいですか？ */
	public static final String SHAPE_CANNOT_DELETE_USED_BY_PRODUCT_WARN = "shapeCannotDeleteUsedByProductWarn";
	/** 銘柄荷姿は最大30文字以下を入力して下さい。 */
	public static final String SHAPE_CD_CHECK_INPUT_MAX_ERROR = "shapeCdCheckInputMaxError";
	/** 荷姿CDが荷姿マスタに存在しません。 */
	public static final String SHAPE_CD_NOT_FOUND_ERROR = "shapeCdNotFoundError";
	/** 銘柄荷姿を入力して下さい。 */
	public static final String SHAPE_CD_NOT_INPUT_ERROR = "shapeCdNotInputError";
	/** 入数の倍数以外は入力できません。 */
	public static final String SHAPE_CLASS_CANNOT_INPUT_EXCEPT_MULTIPLE_ERROR = "shapeClassCannotInputExceptMultipleError";
	/** 荷姿にケースは指定できません。 */
	public static final String SHAPE_CLASS_CANNOT_SELECT_EXCEPT_CASE_ERROR = "shapeClassCannotSelectExceptCaseError";
	/** 荷姿 英数字のみ */
	public static final String SHAPE_CLASS_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "shapeClassCheckAlphabetAndNumericOnlyError";
	/** 荷姿は最大30文字以下を入力して下さい。 */
	public static final String SHAPE_CLASS_CHECK_INPUT_MAX_ERROR = "shapeClassCheckInputMaxError";
	/** 荷姿CDを入力して下さい。 */
	public static final String SHAPE_CLASS_NOT_INPUT_ERROR = "shapeClassNotInputError";
	/** パラメータマスタに登録されている荷姿CDは削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_PARAM_MASTER_ERROR = "shapeCodeCannotDeleteInParamMasterError";
	/** 銘柄荷姿マスタに登録されている荷姿CDは削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_PRODUCT_SHAPE_MASTER_ERROR = "shapeCodeCannotDeleteInProductShapeMasterError";
	/** 荷姿グループ明細に登録されている荷姿([0])は削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_SHAPE_GROUP_MASTER_DTL_ERROR = "shapeCodeCannotDeleteInShapeGroupMasterDtlError";
	/** 荷姿CDが重複しています。 */
	public static final String SHAPE_CODE_DUPLICATE_ERROR = "shapeCodeDuplicateError";
	/** 総重量(g)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeGrossWeightBulkCheckInputIntegerLengthError";
	/** 総重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeGrossWeightCheckInputIntegerError";
	/** 総重量(g) 数値のみ */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeGrossWeightCheckNumericOnlyError";
	/** 選択中の荷姿グループは既に削除されています。 */
	public static final String SHAPE_GROUP_ALREADY_DELETED_CANNOT_SELECT = "shapeGroupAlreadyDeletedCannotSelect";
	/** 荷姿グループに紐付く銘柄が存在するため、荷姿グループを削除できません。 */
	public static final String SHAPE_GROUP_CANNOT_DELETE_USED_BY_PRODUCT_ERROR = "shapeGroupCannotDeleteUsedByProductError";
	/** 銘柄の在庫があるため、在庫管理単位を変更できません。 */
	public static final String SHAPE_GROUP_CANNOT_UPDATE_USED_BY_PRODUCT_IN_STOCK_ERROR = "shapeGroupCannotUpdateUsedByProductInStockError";
	/** 在庫が存在するため、在庫管理単位を変更できません。 */
	public static final String SHAPE_GROUP_CHANGED_ERROR = "shapeGroupChangedError";
	/** 荷姿グループに紐付く銘柄が存在しますが、荷姿を更新してよろしいですか？ */
	public static final String SHAPE_GROUP_DTL_CANNOT_CHANGE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotChangeUsedByProductError";
	/** 荷姿グループに紐付く銘柄が存在するため、荷姿を削除できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_DELETE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotDeleteUsedByProductError";
	/** 荷姿グループに紐付く銘柄が存在するため、荷姿を追加できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_INSERT_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotInsertUsedByProductError";
	/** 荷姿グループに紐付く銘柄が存在するため、荷姿の親子関係は更新できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_UPDATE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotUpdateUsedByProductError";
	/** 小数有無フラグが「1：小数を含む」の場合、複数の荷姿を登録することはできません。 */
	public static final String SHAPE_GROUP_DTL_OVER_ONE_LINE_ERROR = "shapeGroupDtlOverOneLineError";
	/** 在庫管理単位が荷姿グループマスタに存在しません。 */
	public static final String SHAPE_GROUP_NOT_FOUND_ERROR = "shapeGroupNotFoundError";
	/** 在庫管理単位 英数字のみ */
	public static final String SHAPE_GRP_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "shapeGrpCdCheckAlphabetAndNumericOnlyError";
	/** 在庫管理単位は最大30文字以下で入力して下さい。 */
	public static final String SHAPE_GRP_CD_CHECK_INPUT_MAX_ERROR = "shapeGrpCdCheckInputMaxError";
	/** 荷姿グループCDが既に登録済です。 */
	public static final String SHAPE_GRP_CD_CODE_DUPLICATE_ERROR = "shapeGrpCdCodeDuplicateError";
	/** 荷姿グループ明細マスタに存在しません。 */
	public static final String SHAPE_GRP_DTL_NOT_FOUND_ERROR = "shapeGrpDtlNotFoundError";
	/** 高さ(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeHeightBulkCheckInputIntegerLengthError";
	/** 高さ(mm) 数値のみ */
	public static final String SHAPE_HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeHeightCheckNumericOnlyError";
	/** 縦(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeLengthBulkCheckInputIntegerLengthError";
	/** 縦(mm) 数値のみ */
	public static final String SHAPE_LENGTH_CHECK_NUMERIC_ONLY_ERROR = "shapeLengthCheckNumericOnlyError";
	/** 銘柄重量(g)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeNetWeightBulkCheckInputIntegerLengthError";
	/** 銘柄重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeNetWeightCheckInputIntegerError";
	/** 銘柄重量(g) 数値のみ */
	public static final String SHAPE_NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeNetWeightCheckNumericOnlyError";
	/** 荷姿マスタに存在しません。 */
	public static final String SHAPE_NOT_FOUND_ERROR = "shapeNotFoundError";
	/** 容積(mm3)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeVolumeBulkCheckInputIntegerLengthError";
	/** 容積(mm3)は最小0以上を入力して下さい。 */
	public static final String SHAPE_VOLUME_CHECK_MIN_IS_ZERO_ERROR = "shapeVolumeCheckMinIsZeroError";
	/** 容積(mm3) 数値のみ */
	public static final String SHAPE_VOLUME_CHECK_NUMERIC_ONLY_ERROR = "shapeVolumeCheckNumericOnlyError";
	/** 容積(mm3)は小数3桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_INPUT_DECIMAL_LENGTH_ERROR = "shapeVolumeInputDecimalLengthError";
	/** 容積(mm3)は整数[0]桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_INPUT_INTEGER_LENGTH_ERROR = "shapeVolumeInputIntegerLengthError";
	/** 横(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeWidthBulkCheckInputIntegerLengthError";
	/** 横(mm) 数値のみ */
	public static final String SHAPE_WIDTH_CHECK_NUMERIC_ONLY_ERROR = "shapeWidthCheckNumericOnlyError";
	/** シフトカレンダーが登録されていません。管理者に問い合わせてください。 */
	public static final String SHIFT_CALENDAR_IS_NOT_REGISTERED = "shiftCalendarIsNotRegistered";
	/** 出荷確定以外の出庫指示に対して、出荷確定の解除はできません。 */
	public static final String SHIP_COMPLETE_CANCEL_START_ERROR = "shipCompleteCancelStartError";
	/** 検品済以外の出庫指示に対して、出荷確定はできません。 */
	public static final String SHIP_COMPLETE_START_ERROR = "shipCompleteStartError";
	/** 入荷作業が既に始まっている為、出荷確定解除は出来ません。(出庫作業No.：[0]) */
	public static final String SHIP_COMPLETED_CANNOT_CANCEL_RECEIVING_ERROR = "shipCompletedCannotCancelReceivingError";
	/** 出荷日は納品指定日より後の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_DATE_ERROR = "shipDateCannotChangeAfterDelivDateError";
	/** 出荷日は納品予定日より後の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_PLAN_DATE_ERROR = "shipDateCannotChangeAfterDelivPlanDateError";
	/** 出荷日は作業日より前の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "shipDateCannotChangeBeforeWorkDateError";
	/** 検品中断以外の出庫指示に対して、出荷検品を再開することはできません。 */
	public static final String SHIP_INSPECT_RE_START_ERROR = "shipInspectReStartError";
	/** 出庫指示済またはピッキング済以外の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_ERROR = "shipInspectStartError";
	/** 検品済の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_INSPECT_COMPLETE_ERROR = "shipInspectStartInspectCompleteError";
	/** 検品中の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_UNDER_INSPECT_ERROR = "shipInspectStartUnderInspectError";
	/** 出荷元と納品先に同一の拠点が指定されています。 */
	public static final String SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR = "shipInstCannnotInputSameTransitCenterError";
	/** 未出荷以外の出荷指示をキャンセルすることはできません。 */
	public static final String SHIP_INST_DELETE_START_ERROR = "shipInstDeleteStartError";
	/** 出庫指示処理は正常終了しました。緊急補充が発生していますので[0]にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_REPLENISH_INFORMATION = "shipInstructeCompleteReplenishInformation";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので銘柄別出荷一覧にて確認して下さい。[/]緊急補充が発生していますので[0]にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_AND_REPLENISH_INFORMATION = "shipInstructeCompleteStockOutAndReplenishInformation";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので銘柄別出荷一覧にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_INFORMATION = "shipInstructeCompleteStockOutInformation";
	/** ピッキングした在庫が別ロケーションに移動されています。在庫を確認して下さい。 */
	public static final String SHIP_INSTRUCTED_CANCEL_FORCED_MOVE_INFORMATION = "shipInstructedCancelForcedMoveInformation";
	/** 在庫数が不足している為、登録できません。 */
	public static final String SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR = "shipInstructedCannotRegisterStockShortageError";
	/** 出庫作業No.単位で指示日を設定しますが宜しいですか？ */
	public static final String SHIP_INSTRUCTED_DATE_CHANGE_SAME_WORK_ORDER_NUMBER_CONFIRMATION = "shipInstructedDateChangeSameWorkOrderNumberConfirmation";
	/** 出庫指示済のデータが含まれています。 */
	public static final String SHIP_INSTRUCTED_FOUND_ERROR = "shipInstructedFoundError";
	/** 出荷指示数が引当可能数を超えています。 */
	public static final String SHIP_ORDER_QTY_CANNOT_INPUT_MORE_THANSTOCK_CAN_BE_ALLOCATE_ERROR = "shipOrderQtyCannotInputMoreThanstockCanBeAllocateError";
	/** 出荷指示数分の梱包がされていません。 */
	public static final String SHIP_ORDER_QTY_CANNOT_INPUT_NOT_EQUAL_PACKING_QTY_TOTAL_ERROR = "shipOrderQtyCannotInputNotEqualPackingQtyTotalError";
	/** 出荷指示数が引当可能数を超えています。宜しいですか？ */
	public static final String SHIP_ORDER_QTY_REGISTER_MORE_THAN_STOCK_CONFIRMATION = "shipOrderQtyRegisterMoreThanStockConfirmation";
	/** マスタエラーが有りましたが、出荷指示は登録されました。一覧でエラー内容を確認して下さい。[/]伝票番号：[0]で登録しました。 */
	public static final String SHIP_ORDER_REGISTER_CONTAINED_MASTER_ERROR_INFORMATION = "shipOrderRegisterContainedMasterErrorInformation";
	/** EDI入力した出荷指示データの修正はできません。 */
	public static final String SHIP_ORDER_UPDATE_START_EDI_ERROR = "shipOrderUpdateStartEdiError";
	/** 未出荷以外の出荷指示データは修正できません。 */
	public static final String SHIP_ORDER_UPDATE_START_NONSHIPMENT_ERROR = "shipOrderUpdateStartNonshipmentError";
	/** ピッキング中、またはピッキング済のため、出庫検品できません。 */
	public static final String SHIP_PICK_FIRST_START_ERROR = "shipPickFirstStartError";
	/** 出庫指示済以外は、出庫検品できません。 */
	public static final String SHIP_PICK_SECOND_START_ERROR = "shipPickSecondStartError";
	/** 削除することはできません。 */
	public static final String SHIP_RESULT_CANNOT_DELETE_ERROR = "shipResultCannotDeleteError";
	/** 出荷実績入力画面へデータを上書きしますが、宜しいですか？ */
	public static final String SHIP_RESULT_OVER_WRITE_CONFIRMATION = "shipResultOverWriteConfirmation";
	/** ケース出荷中は検品終了まで修正できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_CHANGE_CASE_INSPECT_ERROR = "shipResultQtyCannotChangeCaseInspectError";
	/** 出荷検品中、検品中断中は修正できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_CHANGE_INSPECT_OR_INTERRUPT_ERROR = "shipResultQtyCannotChangeInspectOrInterruptError";
	/** 出荷停止中、または引当不可の銘柄は実績数に０以外は入力できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_EXCEPT_ZERO_ERROR = "shipResultQtyCannotInputExceptZeroError";
	/** 入荷予定数を超えています。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_PLAN_ERROR = "shipResultQtyCannotInputMoreThanPlanError";
	/** 実績数の合計が指示数を超えています。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_TOTAL_ERROR = "shipResultQtyCannotInputMoreThanTotalError";
	/** 引当可能な在庫数がありません。宜しいですか？ */
	public static final String SHIP_RESULT_QTY_REGISTER_STOCK_SHORTAGE_CONFIRMATION = "shipResultQtyRegisterStockShortageConfirmation";
	/** 引当で欠品が発生しましたが、出荷実績は登録されました。一覧で欠品内容を確認して下さい。[/]伝票番号：[0]で登録しました。 */
	public static final String SHIP_RESULT_REGISTER_CONTAINED_STOCK_OUT_INFORMATION = "shipResultRegisterContainedStockOutInformation";
	/** 納品先が存在しません。 */
	public static final String SHIP_TO_CODE_NOT_FOUND_ERROR = "shipToCodeNotFoundError";
	/** 取引先区分(納品先)が存在しません。 */
	public static final String SHIP_TO_FLAG_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "shipToFlagNotFoundInPartnerMasterError";
	/** 出庫指示済またはピッキング済または検品済以外の出荷指示に対して、出荷実績を訂正することはできません。 */
	public static final String SHIP_UPDATE_START_ERROR = "shipUpdateStartError";
	/** 入力された出庫作業No.は既に確定済です。 */
	public static final String SHIP_WOKING_NUMBER_CANNOT_SELECT_COMPLETED_ERROR = "shipWokingNumberCannotSelectCompletedError";
	/** 対象の出庫作業No.／梱包No.は検品済です。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTED_ERROR = "shipWokingOrPackingNumberCannotInputInspectedError";
	/** 出庫作業No.／梱包No.は検品中です。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTING_ERROR = "shipWokingOrPackingNumberCannotInputInspectingError";
	/** 出庫作業No.／梱包No.に誤りがあります。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_INPUT_ERROR = "shipWokingOrPackingNumberInputError";
	/** 出庫作業No.／梱包No.が入力されていません。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_NOT_INPUT_ERROR = "shipWokingOrPackingNumberNotInputError";
	/** 出荷確定済の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String SHIPPING_CONFIRM_ERROR = "shippingConfirmError";
	/** 出荷日が日付不正(形式:yyyy/MM/dd) */
	public static final String SHIPPING_DT_DATE_ERROR = "shippingDtDateError";
	/** 出荷日を入力して下さい。 */
	public static final String SHIPPING_DT_NOT_INPUT_ERROR = "shippingDtNotInputError";
	/** 出荷日が空白以外の行を選択して下さい。 */
	public static final String SHIPPING_DT_NOT_SELECT_ERROR = "shippingDtNotSelectError";
	/** 出荷日が出荷データと不一致です。 */
	public static final String SHIPPING_DT_UNMATCH_SHIPPING_DATA_ERROR = "shippingDtUnmatchShippingDataError";
	/** 出荷情報更新 */
	public static final String SHIPPING_INFO_UPDATE_CONDITION = "shippingInfoUpdateCondition";
	/** 出荷検品が完了しました。出庫指示時と梱包数が異なりますので、荷札を再出力してください。 */
	public static final String SHIPPING_INSPECTION_COMPLETE_TAG_LABEL_REISSUE_INFORMATION = "shippingInspectionCompleteTagLabelReissueInformation";
	/** 拠店CD：[0] , 荷主CD：[1] , 出庫指示バッチNo.：[2] , 処理No.：[3] , 伝票数：[4] */
	public static final String SHIPPING_INST_BATCH_PARAMETER_INFORMATION = "shippingInstBatchParameterInformation";
	/** 出庫指示 */
	public static final String SHIPPING_INST_BATCH_PROGRAM_NAME_INFORMATION = "shippingInstBatchProgramNameInformation";
	/** 出庫指示処理をキューに登録しました。キューNo.([0]) */
	public static final String SHIPPING_INST_BATCH_REGISTER_INFORMATION = "shippingInstBatchRegisterInformation";
	/** この銘柄は期限日管理対象外です。指定期限日は入力しないで下さい。 */
	public static final String SHIPPING_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR = "shippingLimitDtManagFlgCannotInputExceptLimitDtManagementProductError";
	/** 期限日管理フラグに[管理しない]を設定した場合、出荷期限日数は入力しないで下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR = "shippingLimitNumCannotInputExceptLimitDtManagFlgProductError";
	/** 出荷期限日数に小数は入力できません。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "shippingLimitNumCheckInputDecimalError";
	/** 出荷期限日数は整数[0]桁以内を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shippingLimitNumCheckInputIntegerLengthError";
	/** 出荷期限日数は整数5桁以内を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "shippingLimitNumCheckInputMaxError";
	/** 出荷期限日数 数値のみ */
	public static final String SHIPPING_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "shippingLimitNumCheckNumericOnlyError";
	/** 出荷期限日数は最小0以上を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "shippingLimitNumInputRequestMinIsZeroError";
	/** 出荷期限日数を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_NOT_INPUT_ERROR = "shippingLimitNumNotInputError";
	/** この銘柄はロット管理対象外です。指定ロットは入力しないで下さい。 */
	public static final String SHIPPING_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "shippingLotManagFlgCannotInputExceptLotManagementProductError";
	/** 対象の出荷梱包No.はケースピッキング対象です。 */
	public static final String SHIPPING_PACKING_NO_CANNOT_PICKING_TARGET_CASE_PICKING_ERROR = "shippingPackingNoCannotPickingTargetCasePickingError";
	/** 出荷予定一括取込 */
	public static final String SHIPPING_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION = "shippingPlanBulkInputProgramNameInformation";
	/** 出荷停止フラグが存在しません。 */
	public static final String SHIPPING_STOP_FLG_NOT_FOUND_ERROR = "shippingStopFlgNotFoundError";
	/** 出荷停止フラグを入力して下さい。 */
	public static final String SHIPPING_STOP_FLG_NOT_INPUT_ERROR = "shippingStopFlgNotInputError";
	/** 佐川送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_SGW_INFORMATION = "shippingTagDataOutputFileNameSgwInformation";
	/** ヤマト送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YMT_INFORMATION = "shippingTagDataOutputFileNameYmtInformation";
	/** ゆうパック送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YUPK_INFORMATION = "shippingTagDataOutputFileNameYupkInformation";
	/** 出荷実績訂正が完了しました。[0] */
	public static final String SHIPPING_UPDATE_COMPLETE = "shippingUpdateComplete";
	/** 梱包数に変更があります。梱包明細修正にて梱包内容を修正して下さい。 */
	public static final String SHIPPING_UPDATE_COMPLETE_CHANGE_PACKING = "shippingUpdateCompleteChangePacking";
	/** 次の帳票またはデータを再出力して下さい。([0]) */
	public static final String SHIPPING_UPDATE_COMPLETE_REPRINT_REPORT = "shippingUpdateCompleteReprintReport";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日・入庫ラベルNo.を入力時は、入庫日を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_DT_ERROR = "shippingUpdateSameStockNotInputStoreDtError";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日を入力時は、入庫日または入庫ラベルNo.を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_DT_OR_STORE_NO_ERROR = "shippingUpdateSameStockNotInputStoreDtOrStoreNoError";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日・入庫日を入力時は、入庫ラベルNo.を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_NO_ERROR = "shippingUpdateSameStockNotInputStoreNoError";
	/** 単行ピッキング対象です。単行出荷検品から検品を行ってください。 */
	public static final String SINGLE_ROW_PICKING_TARGET_ERROR = "singleRowPickingTargetError";
	/** 検品済の銘柄があります。検品済数を確認して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_EXISTS_INSPECTED_PRODUCT_WARN = "singleRowShippingInspectExistsInspectedProductWarn";
	/** 出荷停止の取引先が含まれていましたので検品対象から除外しました。出荷可能な取引先のみ検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_EXISTS_SHIPPING_STOP_CUSTOMER_WARN = "singleRowShippingInspectExistsShippingStopCustomerWarn";
	/** 他のピッキンググループNo.([0])を検品中です。先に検品中のピッキンググループNo.を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_PICKING_GROUP_NO_ERROR = "singleRowShippingInspectOtherPickingGroupNoError";
	/** 他の銘柄([0])を検品中です。先に検品中の銘柄を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_PRODUCT_ERROR = "singleRowShippingInspectOtherProductError";
	/** 他の仮置きNo.([0])を検品中です。先に検品中の仮置きNo.を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_TEMP_NO_ERROR = "singleRowShippingInspectOtherTempNoError";
	/** 他の倉庫([0])を検品中です。先に検品中の倉庫を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_WAREHOUSE_ERROR = "singleRowShippingInspectOtherWarehouseError";
	/** 他のゾーン([0])を検品中です。先に検品中のゾーンを検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_ZONE_ERROR = "singleRowShippingInspectOtherZoneError";
	/** 同一伝票の明細データが、他の行で入力されています。 */
	public static final String SLIP_NO_DUPLICATE_ERROR = "slipNoDuplicateError";
	/** 予備項目１（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM1_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum1BulkCheckInputIntegerLengthError";
	/** 予備項目１（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM1_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum1CheckInputDecimalMaxError";
	/** 予備項目１（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM1_CHECK_INPUT_MIN_ERROR = "spareNum1CheckInputMinError";
	/** 予備項目１（数値） 数値のみ */
	public static final String SPARE_NUM1_CHECK_NUMERIC_ONLY_ERROR = "spareNum1CheckNumericOnlyError";
	/** 予備項目２（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM2_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum2BulkCheckInputIntegerLengthError";
	/** 予備項目２（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM2_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum2CheckInputDecimalMaxError";
	/** 予備項目２（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM2_CHECK_INPUT_MIN_ERROR = "spareNum2CheckInputMinError";
	/** 予備項目２（数値） 数値のみ */
	public static final String SPARE_NUM2_CHECK_NUMERIC_ONLY_ERROR = "spareNum2CheckNumericOnlyError";
	/** 予備項目３（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM3_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum3BulkCheckInputIntegerLengthError";
	/** 予備項目３（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM3_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum3CheckInputDecimalMaxError";
	/** 予備項目３（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM3_CHECK_INPUT_MIN_ERROR = "spareNum3CheckInputMinError";
	/** 予備項目３（数値） 数値のみ */
	public static final String SPARE_NUM3_CHECK_NUMERIC_ONLY_ERROR = "spareNum3CheckNumericOnlyError";
	/** 予備項目１（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR1_CHECK_INPUT_MAX_ERROR = "spareStr1CheckInputMaxError";
	/** 予備項目２（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR2_CHECK_INPUT_MAX_ERROR = "spareStr2CheckInputMaxError";
	/** 予備項目３（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR3_CHECK_INPUT_MAX_ERROR = "spareStr3CheckInputMaxError";
	/** 標準箱に設定されているため、削除できません。 */
	public static final String STANDARD_BOX_CANNOT_DELETE_ERROR = "standardBoxCannotDeleteError";
	/** 標準箱の設定を変更します。宜しいですか？ */
	public static final String STANDARD_BOX_CHANGE_CONFIRMATION = "standardBoxChangeConfirmation";
	/** 削除された箱は標準箱に設定出来ません。 */
	public static final String STANDERD_BOX_CANNOT_SELECT_DELETED_ERROR = "standerdBoxCannotSelectDeletedError";
	/** 開始時間を終了時間前の時点に設定しなければなりません。 */
	public static final String START_TIME_INPUT_REQUEST_BEFORE_END_TIME_ERROR = "startTimeInputRequestBeforeEndTimeError";
	/** 確定済のデータは在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_COMPLETED_ERROR = "stockAdjustmentCannotExecuteCompletedError";
	/** 登録されていないデータは在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_NOT_REGISTERED_ERROR = "stockAdjustmentCannotExecuteNotRegisteredError";
	/** 棚卸数量が未登録のため在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_RESULT_QTY_NOT_REGISTERED_ERROR = "stockAdjustmentCannotExecuteResultQtyNotRegisteredError";
	/** 棚卸データ作成時より在庫に変更がある為、調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR = "stockAdjustmentCannotExecuteStockCountDataChangedError";
	/** 既に在庫が存在しています。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR = "stockAdjustmentCannotExecuteStockDataExistsError";
	/** 棚卸データ作成時より在庫に変更がある為、調整できません。詳細は運用管理情報で確認して下さい。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_QTY_CHANGED_INFORMATION = "stockAdjustmentCannotExecuteStockQtyChangedInformation";
	/** 在庫数が不足の為、調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR = "stockAdjustmentCannotExecuteStockShortageError";
	/** 既に存在する入庫ラベルNoです。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STORE_NO_EXISTS_ERROR = "stockAdjustmentCannotExecuteStoreNoExistsError";
	/** ロット管理フラグまたは期限日管理フラグが変更された為、在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_REGISTER_LOT_LIMIT_DT_FLG_CHANGED_ERROR = "stockAdjustmentCannotRegisterLotLimitDtFlgChangedError";
	/** マージ先の在庫があるため、新しい入庫ラベルNoの指定はできません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_REGISTER_MERGE_BY_NEW_STORE_LABEL_ERROR = "stockAdjustmentCannotRegisterMergeByNewStoreLabelError";
	/** 在庫調整を行いますが、宜しいですか？ */
	public static final String STOCK_ADJUSTMENT_EXECUTE_CONFIRMATION = "stockAdjustmentExecuteConfirmation";
	/** 調整数量項目の入力内容に誤りがあります。 */
	public static final String STOCK_ADJUSTMENT_INPUT_STOCK_INFORMATION_ERROR = "stockAdjustmentInputStockInformationError";
	/** 調整数量が調整前数量を超えています。 */
	public static final String STOCK_ADJUSTMENT_QTY_CANNOT_INPUT_MORE_THAN_BEFORE_ERROR = "stockAdjustmentQtyCannotInputMoreThanBeforeError";
	/** 移動、セット品、定期補充、緊急補充データ以外に対して、処理はできません。 */
	public static final String STOCK_CANNOT_EXECUTE_SET_REPLENISH_DATA_ERROR = "stockCannotExecuteSetReplenishDataError";
	/** 在庫を特定できません。指定ロケーションに複数の在庫が存在します。 */
	public static final String STOCK_CANNOT_SPECIFY_ERROR = "stockCannotSpecifyError";
	/** 在庫区分は最大30文字以下を入力して下さい。 */
	public static final String STOCK_CLASS_CHECK_INPUT_MAX_ERROR = "stockClassCheckInputMaxError";
	/** 在庫区分を入力して下さい。 */
	public static final String STOCK_CLASS_NOT_INPUT_ERROR = "stockClassNotInputError";
	/** 棚卸在庫一括更新終了 */
	public static final String STOCK_COUNT_BULK_UPDATE_COMPLETE_INFORMATION = "stockCountBulkUpdateCompleteInformation";
	/** 棚卸在庫一括更新 */
	public static final String STOCK_COUNT_BULK_UPDATE_EXECUTE_INFORMATION = "stockCountBulkUpdateExecuteInformation";
	/** 銘柄CD：[1] ,銘柄名称：[2] ,ロット：[3] ,期限日：[4] ,ロケーション：[5] ,棚卸前在庫数[6] ,棚卸数量：[7] ,棚卸差異数：[8] */
	public static final String STOCK_COUNT_BULK_UPDATE_PARAMETER_INFORMATION = "stockCountBulkUpdateParameterInformation";
	/** 処理件数：[1]件 ,更新件数：[2]件 ,エラー件数：[3]件 */
	public static final String STOCK_COUNT_BULK_UPDATE_RESULT_TRANSACTION_INFORMATION = "stockCountBulkUpdateResultTransactionInformation";
	/** 棚卸在庫一括更新開始 */
	public static final String STOCK_COUNT_BULK_UPDATE_START_INFORMATION = "stockCountBulkUpdateStartInformation";
	/** 作業中または引当済の在庫が存在しています。棚卸データを作成して宜しいですか？ */
	public static final String STOCK_COUNT_CREATE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION = "stockCountCreateCompleteContainedIntransitInformation";
	/** 棚卸データ作成終了 */
	public static final String STOCK_COUNT_CREATE_COMPLETE_INFORMATION = "stockCountCreateCompleteInformation";
	/** 棚卸データ抽出条件 */
	public static final String STOCK_COUNT_CREATE_CONDITION_INFORMATION = "stockCountCreateConditionInformation";
	/** 確定済のデータが含まれています。処理を行いますか？ */
	public static final String STOCK_COUNT_CREATE_EXECUTE_INCLUDED_COMPLETED_CONFIRMATION = "stockCountCreateExecuteIncludedCompletedConfirmation";
	/** ロケーション：[1] ,銘柄CD：[2] ,銘柄名称：[3] ,ロット：[4] ,期限日：[5] ,引当可能数：[6] ,未確定数：[7] ,作業／積送中数：[8] */
	public static final String STOCK_COUNT_CREATE_EXECUTE_INFORMATION = "stockCountCreateExecuteInformation";
	/** 既に棚卸入力されたデータがあります。データを上書きしてよろしいですか？ */
	public static final String STOCK_COUNT_CREATE_EXECUTE_OVERWRITE_CONFIRMATION = "stockCountCreateExecuteOverwriteConfirmation";
	/** 棚卸データを作成できません。（積送中、引当済の在庫あり。） */
	public static final String STOCK_COUNT_CREATE_FAILED_INFORMATION = "stockCountCreateFailedInformation";
	/** 棚卸日：[1] ,在庫区分：[2] ,ロケーション：[3]～[4] ,ゾーン：[5] ,当日受払のみ：[6] ,在庫数＞0のみ：[7] */
	public static final String STOCK_COUNT_CREATE_PARAMETER_INFORMATION = "stockCountCreateParameterInformation";
	/** 作業／積送中または未確定数の在庫件数：[1] */
	public static final String STOCK_COUNT_CREATE_RESULT_CONTAINED_INTRANSIT_INFORMATION = "stockCountCreateResultContainedIntransitInformation";
	/** 棚卸データ作成 */
	public static final String STOCK_COUNT_CREATE_RESULT_INFORMATION = "stockCountCreateResultInformation";
	/** 追加件数：[1]件 ,更新件数：[2]件 */
	public static final String STOCK_COUNT_CREATE_RESULT_TRANSACTION_INFORMATION = "stockCountCreateResultTransactionInformation";
	/** 棚卸データ作成開始 */
	public static final String STOCK_COUNT_CREATE_START_INFORMATION = "stockCountCreateStartInformation";
	/** 棚卸データチェック */
	public static final String STOCK_COUNT_DATA_CHECK_EXECUTE_INFORMATION = "stockCountDataCheckExecuteInformation";
	/** 棚卸データが既に存在します。 */
	public static final String STOCK_COUNT_DATA_FOUND_ERROR = "stockCountDataFoundError";
	/** 作業中または引当済の在庫が存在しています。棚卸データを削除して宜しいですか？ */
	public static final String STOCK_COUNT_DELETE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION = "stockCountDeleteCompleteContainedIntransitInformation";
	/** 棚卸データ削除終了 */
	public static final String STOCK_COUNT_DELETE_COMPLETE_INFORMATION = "stockCountDeleteCompleteInformation";
	/** 既に棚卸入力されたデータがあります。データを削除してよろしいですか？ */
	public static final String STOCK_COUNT_DELETE_EXECUTE_DELETE_CONFIRMATION = "stockCountDeleteExecuteDeleteConfirmation";
	/** 指定された入庫ラベルNo.は移動中の為、指定できません。 */
	public static final String STOCK_DATA_CANNOT_CHANGE_MOVING_ERROR = "stockDataCannotChangeMovingError";
	/** 在庫データが既に存在します、処理できません。 */
	public static final String STOCK_DATA_FOUND_ERROR = "stockDataFoundError";
	/** 在庫更新で同じ入庫ラベルNo.、ロケーションの現品が存在しています、在庫情報を確認して下さい。 */
	public static final String STOCK_DATA_FOUND_LOCATION_STORE_NO_ERROR = "stockDataFoundLocationStoreNoError";
	/** 複数の在庫情報(入庫ラベルNo)がある為、処理できません。 */
	public static final String STOCK_DATA_PLURAL_FOUND_ERROR = "stockDataPluralFoundError";
	/** 入出荷データが存在する為、移行できない。 */
	public static final String STOCK_INPUT_CANNOT_REGISTER_STOCK_INOUT_EXISTED_ERROR = "stockInputCannotRegisterStockInoutExistedError";
	/** 備考は最大[0]文字以下を入力して下さい。 */
	public static final String STOCK_INPUT_COMMENT_CHECK_INPUT_MAX_ERROR = "stockInputCommentCheckInputMaxError";
	/** 在庫データ取込（ワーク取込） */
	public static final String STOCK_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "stockInputProgramNameInputWorkInformation";
	/** 在庫データ取込（データ移行） */
	public static final String STOCK_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "stockInputProgramNameRegisterInformation";
	/** 在庫数が不足している為、移動できません。 */
	public static final String STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR = "stockMoveCannotExecuteStockShortageError";
	/** 処理区分を統一してください。 */
	public static final String STOCK_MOVE_DATA_CANNOT_SELECT_DIFFERENT_PROCESS_TYPE_ERROR = "stockMoveDataCannotSelectDifferentProcessTypeError";
	/** 処理区分が同一のデータのみ選択してください。 */
	public static final String STOCK_MOVE_LIST_DATA_CANNOT_SELECT_DIFFERENT_PROCESS_TYPE_ERROR = "stockMoveListDataCannotSelectDifferentProcessTypeError";
	/** <a href="#wms/stock/StockMoveList?mode=3&amp;centerCd=[0]&amp;clientCd=[1]&amp;processTypeCd=33"><b><u>在庫移動一覧</b></u></a> */
	public static final String STOCK_MOVE_LIST_EMERGENCY_REPLENISH_LINK = "stockMoveListEmergencyReplenishLink";
	/** <a href="#wms/stock/StockMoveList?mode=3&amp;centerCd=[0]&amp;clientCd=[1]&amp;processTypeCd=32"><b><u>在庫移動一覧</b></u></a> */
	public static final String STOCK_MOVE_LIST_REPLENISH_LINK = "stockMoveListReplenishLink";
	/** 移動先ロケーションに他銘柄の補充設定がされています。上書きしてしまいますがよろしいですか？ */
	public static final String STOCK_MOVE_REGISTER_REPLENISH_DATA_OVERWRITE_CONFIRMATION = "stockMoveRegisterReplenishDataOverwriteConfirmation";
	/** 棚卸差異調整 */
	public static final String STOCK_MOVE_REMARKS_INFORMATION = "stockMoveRemarksInformation";
	/** 欠品棚CDはロケーションマスタに存在しません。 */
	public static final String STOCK_OUT_LOCATION_CODE_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "stockOutLocationCodeNotFoundInLocationMasterError";
	/** 欠品倉庫CDは倉庫マスタに存在しません。 */
	public static final String STOCK_OUT_WAREHOUSE_CODE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "stockOutWarehouseCodeNotFoundInWarehouseMasterError";
	/** 正常に更新されました。銘柄内容が異なるため新しい入庫ラベルNo.で登録された銘柄があります。 */
	public static final String STOCK_REGISTER_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "stockRegisterNewCauseStoreLabelUsedInformation";
	/** 入荷したロケーションの在庫が不足している為、登録できません。入荷した時の在庫数に戻してから登録してください。 */
	public static final String STOCK_RESULT_CANNOT_CANCEL_STOCK_SHORTAGE_ERROR = "stockResultCannotCancelStockShortageError";
	/** 入荷可能な期限日を過ぎている銘柄がありますが、このまま続行しても宜しいですか？ */
	public static final String STOCK_RESULT_REGISTER_LIMIT_DATE_OVER_INFORMATION = "stockResultRegisterLimitDateOverInformation";
	/** 在庫区分CDは在庫区分マスタに存在しません。 */
	public static final String STOCK_TYPE_CD_NOT_FOUND_ERROR = "stockTypeCdNotFoundError";
	/** 在庫区分CDを入力して下さい。 */
	public static final String STOCK_TYPE_CD_NOT_INPUT_ERROR = "stockTypeCdNotInputError";
	/** 処理区分マスタに登録されている在庫区分CDは削除できません。 */
	public static final String STOCK_TYPE_CODE_CANNOT_DELETE_IN_PROCESS_TYPE_MASTER_ERROR = "stockTypeCodeCannotDeleteInProcessTypeMasterError";
	/** 在庫区分CDが重複しています。 */
	public static final String STOCK_TYPE_CODE_DUPLICATE_ERROR = "stockTypeCodeDuplicateError";
	/** 同一の顧客入荷指示No、仕入先内で在庫区分が不一致です。 */
	public static final String STOCK_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "stockTypeUnmatchInClientReceiveNoOnBulkError";
	/** ロケ、ロット、在庫区分、預託、期限日、仕入先が在庫と不一致です。確認して下さい。 */
	public static final String STORE_ITEM_UNMATCH_ERROR = "storeItemUnmatchError";
	/** 入庫ラベルNO 英数字と-のみ */
	public static final String STORE_LABEL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "storeLabelNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 入庫ラベルNOは最大[0]文字以下を入力して下さい。 */
	public static final String STORE_LABEL_NO_CHECK_INPUT_MAX_ERROR = "storeLabelNoCheckInputMaxError";
	/** 入庫ラベルの発行に失敗しました。 */
	public static final String STORE_LABEL_PRINT_ERROR = "storeLabelPrintError";
	/** 拠点間移動の移動元出庫データが存在しません。履歴に移動されたか削除されています。 */
	public static final String STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR = "storeResultCannnotRegisterNotFoundTransitPickingDataError";
	/** 実績が無いデータは取消できません。 */
	public static final String STORE_RESULT_CANNOT_CANCEL_NO_INPUT_ERROR = "storeResultCannotCancelNoInputError";
	/** 入数が異なる為、入庫できません。（銘柄CD：[0] , ロケーションCD：[1]）入数が異なる銘柄は違うロケーションに入庫して下さい。 */
	public static final String STORE_RESULT_CANNOT_REGISTER_UNIT_NUM_CHANGED_ERROR = "storeResultCannotRegisterUnitNumChangedError";
	/** 構成品が別の親銘柄に使用済みです。 */
	public static final String STRUCTURE_CANNOT_INPUT_ANOTHER_PARENT_PRODUCT_ERROR = "structureCannotInputAnotherParentProductError";
	/** 構成品CDが重複しています。 */
	public static final String STRUCTURE_CODE_DUPLICATE_ERROR = "structureCodeDuplicateError";
	/** 構成品、ロケーション、期限日、ロットが重複しています。 */
	public static final String STRUCTURE_LOCATION_LOT_LIMIT_DT_DUPLICATE_ERROR = "structureLocationLotLimitDtDuplicateError";
	/** 構成品：[0]の在庫が存在しません。 */
	public static final String STRUCTURE_PART_STOCK_NOT_FOUND_ERROR = "structurePartStockNotFoundError";
	/** 構成品の在庫が存在しません。 */
	public static final String STRUCTURE_STOCK_NOT_FOUND_ERROR = "structureStockNotFoundError";
	/** 集計行を複製することは出来ません。 */
	public static final String SUMMARY_LINE_CANNOT_COPY_ERROR = "summaryLineCannotCopyError";
	/** 補充銘柄CD、補充点荷姿CD、補充点、最大格納数銘柄荷姿CD、最大格納数いずれ入力ある場合、補充の項目が全部必須入力です。 */
	public static final String SUPPLEMENT_NO_INPUT_ERROR = "supplementNoInputError";
	/** 仕入先CDが取引先マスタに存在しません。 */
	public static final String SUPPLIER_CD_NOT_FOUND_ERROR = "supplierCdNotFoundError";
	/** 仕入先CDが入荷データと不一致です。 */
	public static final String SUPPLIER_CD_UNMATCH_RECEIVE_DATA_ERROR = "supplierCdUnmatchReceiveDataError";
	/** 納品先CDが出荷データと不一致です。 */
	public static final String SUPPLIER_CD_UNMATCH_SHIPPING_DATA_ERROR = "supplierCdUnmatchShippingDataError";
	/** 取引先区分(仕入先)が存在しません。 */
	public static final String SUPPLIER_FLAG_NOT_FOUND_ERROR = "supplierFlagNotFoundError";
	/** 仕入先名称は最大50文字以下を入力して下さい。 */
	public static final String SUPPLIER_NM_CHECK_INPUT_MAX_ERROR = "supplierNmCheckInputMaxError";
	/** 仕入先が取引先マスタに存在しません。 */
	public static final String SUPPLIER_NOT_FOUND_ERROR = "supplierNotFoundError";
	/** 納品先CD 英数字と-のみ */
	public static final String SUPPLY_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "supplyCustomerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 納品先CDは最大10文字以下を入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR = "supplyCustomerCdCheckInputMaxError";
	/** 納品先CDが取引先マスタに存在しません。 */
	public static final String SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR = "supplyCustomerCdNotFoundError";
	/** 納品先CDを入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_CD_NOT_INPUT_ERROR = "supplyCustomerCdNotInputError";
	/** 納品先名称は最大50文字以下を入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "supplyCustomerNmCheckInputMaxError";
	/** システム稼動時間外です！操作できません。 */
	public static final String SYSTEM_CANNOT_OPERATION_AFTER_HOURS_ERROR = "systemCannotOperationAfterHoursError";
	/** システム稼働日が不一致です。 */
	public static final String SYSTEM_DT_CHECK_ERROR = "systemDtCheckError";
	/** ログイン時のシステム管理日付と現在のシステム管理日付が一致しません。[/]画面を更新し、システム管理日付を取得します。 */
	public static final String SYSTEM_DT_MISMATCH_CONFIRM = "systemDtMismatchConfirm";
	/** 日次処理を実行してください。 */
	public static final String SYSTEM_DT_WARN = "systemDtWarn";
	/** トランザクション保持期間には履歴保持期間より小さい日数を入力して下さい。 */
	public static final String T_KEEPING_DAYS_CANNOT_CHANGE_H_KEEPING_DAYS_ERROR = "tKeepingDaysCannotChangeHKeepingDaysError";
	/** データ種別が重複しています。 */
	public static final String TAG_TYPE_DUPLICATE_ERROR = "tagTypeDuplicateError";
	/** 配送コース([0])の送り状種別が設定されていません。 */
	public static final String TAG_TYPE_NOT_FOUND_IN_DELIVERY_COURSE_ERROR = "tagTypeNotFoundInDeliveryCourseError";
	/** 該当データの配送コースには送り状種別が登録されていません。 */
	public static final String TAG_TYPE_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR = "tagTypeNotFoundInDeliveryCourseMasterError";
	/** 消費税は整数7桁以内を入力して下さい。 */
	public static final String TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "taxBulkCheckInputIntegerLengthError";
	/** 消費税は小数3桁以内を入力して下さい。 */
	public static final String TAX_CHECK_INPUT_DECIMAL_ERROR = "taxCheckInputDecimalError";
	/** 消費税は0.001以上を入力してください。 */
	public static final String TAX_CHECK_INPUT_DECIMAL_MIN_ERROR = "taxCheckInputDecimalMinError";
	/** 消費税は9999999以下を入力してください。 */
	public static final String TAX_CHECK_INPUT_MAX_ERROR = "taxCheckInputMaxError";
	/** 消費税は0以上を入力してください。 */
	public static final String TAX_CHECK_INPUT_MIN_ERROR = "taxCheckInputMinError";
	/** 消費税 数値のみ */
	public static final String TAX_CHECK_NUMERIC_ONLY_ERROR = "taxCheckNumericOnlyError";
	/** 電話番号は最大15文字以下を入力して下さい。 */
	public static final String TEL_NO_CHECK_INPUT_MAX_ERROR = "telNoCheckInputMaxError";
	/** 電話番号 数字と-のみ */
	public static final String TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR = "telNoCheckNumericAndHyphenOnlyError";
	/** 仮置棚CDはロケーションマスタに存在しません。 */
	public static final String TEMPORARY_WAREHOUSE_CODE_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "temporaryWarehouseCodeNotFoundInLocationMasterError";
	/** 仮置倉庫CDは倉庫マスタに存在しません。 */
	public static final String TEMPORARY_WAREHOUSE_CODE_NOT_FOUND_IN_WAREHAUSE_MASTER_ERROR = "temporaryWarehouseCodeNotFoundInWarehauseMasterError";
	/** 合計金額は整数7桁以内を入力して下さい。 */
	public static final String TOTAL_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "totalPriceBulkCheckInputIntegerLengthError";
	/** 合計金額は小数3桁以内を入力して下さい。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_DECIMAL_ERROR = "totalPriceCheckInputDecimalError";
	/** 合計金額は0.001以上を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "totalPriceCheckInputDecimalMinError";
	/** 合計金額は9999999以下を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_MAX_ERROR = "totalPriceCheckInputMaxError";
	/** 合計金額は0以上を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_MIN_ERROR = "totalPriceCheckInputMinError";
	/** 合計金額 数値のみ */
	public static final String TOTAL_PRICE_CHECK_NUMERIC_ONLY_ERROR = "totalPriceCheckNumericOnlyError";
	/** 合計消費税は整数7桁以内を入力して下さい。 */
	public static final String TOTAL_TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "totalTaxBulkCheckInputIntegerLengthError";
	/** 合計消費税は小数3桁以内を入力して下さい。 */
	public static final String TOTAL_TAX_CHECK_INPUT_DECIMAL_ERROR = "totalTaxCheckInputDecimalError";
	/** 合計消費税は0.001以上を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_DECIMAL_MIN_ERROR = "totalTaxCheckInputDecimalMinError";
	/** 合計消費税は9999999以下を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_MAX_ERROR = "totalTaxCheckInputMaxError";
	/** 合計消費税は0以上を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_MIN_ERROR = "totalTaxCheckInputMinError";
	/** 合計消費税 数値のみ */
	public static final String TOTAL_TAX_CHECK_NUMERIC_ONLY_ERROR = "totalTaxCheckNumericOnlyError";
	/** 入荷データまたは出荷データで使用されているため処理できません。 */
	public static final String TRANSACTION_DATA_FOUND_ERROR = "transactionDataFoundError";
	/** HT検品中ですが、入荷実績を登録しますか？ */
	public static final String UNDER_H_T_INSPECT_CONFIRMATION = "underHTInspectConfirmation";
	/** HT検品中ですが、入荷取消を行ってもよろしいですか？ */
	public static final String UNDER_H_T_INSPECT_RECEIVE_CANCEL_CONFIRMATION = "underHTInspectReceiveCancelConfirmation";
	/** 入数は整数5桁以内を入力して下さい。 */
	public static final String UNIT_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitNumBulkCheckInputIntegerLengthError";
	/** 入数が変更されていますがよろしいですか？ */
	public static final String UNIT_NUM_CHANGED_WARN = "unitNumChangedWarn";
	/** 入数に小数は入力できません。 */
	public static final String UNIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "unitNumCheckInputDecimalError";
	/** 入数は整数[0]桁以内を入力して下さい。 */
	public static final String UNIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitNumCheckInputIntegerLengthError";
	/** 入数 数値のみ */
	public static final String UNIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "unitNumCheckNumericOnlyError";
	/** 入数は最小1以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR = "unitNumInputRequestMinIsOneError";
	/** 入数は最小0以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "unitNumInputRequestMinIsZeroError";
	/** 最小荷姿の入数には、0を入力してください。 */
	public static final String UNIT_NUM_INPUT_REQUEST_ONLY_ZERO_ERROR = "unitNumInputRequestOnlyZeroError";
	/** 入数を入力して下さい。 */
	public static final String UNIT_NUM_NOT_INPUT_ERROR = "unitNumNotInputError";
	/** 単価は整数7桁以内を入力して下さい。 */
	public static final String UNIT_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitPriceBulkCheckInputIntegerLengthError";
	/** 単価は小数3桁以内を入力して下さい。 */
	public static final String UNIT_PRICE_CHECK_INPUT_DECIMAL_ERROR = "unitPriceCheckInputDecimalError";
	/** 単価は0.001以上を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "unitPriceCheckInputDecimalMinError";
	/** 単価は9999999以下を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_MAX_ERROR = "unitPriceCheckInputMaxError";
	/** 単価は0以上を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_MIN_ERROR = "unitPriceCheckInputMinError";
	/** 単価 数値のみ */
	public static final String UNIT_PRICE_CHECK_NUMERIC_ONLY_ERROR = "unitPriceCheckNumericOnlyError";
	/** 在庫管理単位の最小荷姿が荷姿グループ明細マスタに存在しません。 */
	public static final String UNIT_PRODUCT_SHAPE_NOT_FOUND_ERROR = "unitProductShapeNotFoundError";
	/** ロケーション、ロット、在庫区分、預託在庫区分、期限日、仕入先が在庫と不一致です。確認して下さい。 */
	public static final String UNMATCH_STOCK_DATA_ERROR = "unmatchStockDataError";
	/** 修正コードが存在しません。 */
	public static final String UPD_CD_NOT_FOUND_ERROR = "updCdNotFoundError";
	/** 更新区分が存在しません。 */
	public static final String UPD_TYPE_NOT_FOUND_ERROR = "updTypeNotFoundError";
	/** セット組指示が行われている為、変更できません。 */
	public static final String UPDATE_PRODUCT_MOVE_INST_FOUND_ERROR = "updateProductMoveInstFoundError";
	/** 該当銘柄に在庫データが存在するため変更できません。 */
	public static final String UPDATE_PRODUCT_STOCK_FOUND_ERROR = "updateProductStockFoundError";
	/** ユーザに紐づく荷主、又は拠点、又は倉庫が取得出来ませんでした。 */
	public static final String USER_INFO_GET_ERROR = "userInfoGetError";
	/** ユーザログインマスタに存在しません。 */
	public static final String USER_LOGIN_NOT_FOUND_ERROR = "userLoginNotFoundError";
	/** 仕入先フラグが存在しません。 */
	public static final String VENDOR_FLG_NOT_FOUND_ERROR = "vendorFlgNotFoundError";
	/** 仕入先フラグを入力して下さい。 */
	public static final String VENDOR_FLG_NOT_INPUT_ERROR = "vendorFlgNotInputError";
	/** 【在庫最小単位】容積(mm3)は整数10桁以内を入力して下さい。 */
	public static final String VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "volumeBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】容積(mm3) は小数3桁以内を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "volumeCheckInputDecimalLengthError";
	/** 【在庫最小単位】容積(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_INTEGER_LENGTH_ERROR = "volumeCheckInputIntegerLengthError";
	/** 【在庫最小単位】容積(mm3) は最小0以上を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_MIN_ERROR = "volumeCheckInputMinError";
	/** 【在庫最小単位】容積(mm3) 数値のみ */
	public static final String VOLUME_CHECK_NUMERIC_ONLY_ERROR = "volumeCheckNumericOnlyError";
	/** 倉庫CD 英数字と-のみ */
	public static final String WAREHOUSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "warehouseCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 倉庫CDは最大[0]文字以下を入力して下さい。 */
	public static final String WAREHOUSE_CD_CHECK_INPUT_MAX_ERROR = "warehouseCdCheckInputMaxError";
	/** 指定倉庫CDは倉庫マスタに存在しません。 */
	public static final String WAREHOUSE_CD_NOT_FOUND_ERROR = "warehouseCdNotFoundError";
	/** 倉庫CDを入力して下さい。 */
	public static final String WAREHOUSE_CD_NOT_INPUT_ERROR = "warehouseCdNotInputError";
	/** ゾーンマスタに登録されている倉庫CDは削除できません。 */
	public static final String WAREHOUSE_CODE_CANNOT_DELETE_IN_ZONE_MASTER_ERROR = "warehouseCodeCannotDeleteInZoneMasterError";
	/** 倉庫CDが重複しています。 */
	public static final String WAREHOUSE_CODE_DUPLICATE_ERROR = "warehouseCodeDuplicateError";
	/** 倉庫マスタに存在しません。 */
	public static final String WAREHOUSE_NOT_FOUND_ERROR = "warehouseNotFoundError";
	/** 倉庫 */
	public static final String WAREHOUSE_TITLE = "warehouseTitle";
	/** 荷札発行に失敗しました。便種コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_BINSYU_CODE_NOT_FOUND_ERROR = "webApiBinsyuCodeNotFoundError";
	/** 荷札発行に失敗しました。代引金額が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_COD_NOT_FOUND_ERROR = "webApiCodNotFoundError";
	/** 荷札発行に失敗しました。カスタマーIDが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_CUSTOMER_ID_NOT_FOUND_ERROR = "webApiCustomerIdNotFoundError";
	/** 荷札発行に失敗しました。代引フラグが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_DAIBIKI_FLG_NOT_FOUND_ERROR = "webApiDaibikiFlgNotFoundError";
	/** 荷札発行に失敗しました。届先住所が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_ADDRESS_NOT_FOUND_ERROR = "webApiDelivAddressNotFoundError";
	/** 荷札発行に失敗しました。届先名称が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_CUSTOMER_NM_NOT_FOUND_ERROR = "webApiDelivCustomerNmNotFoundError";
	/** 荷札発行に失敗しました。届先電話番号が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_TEL_NO_NOT_FOUND_ERROR = "webApiDelivTelNoNotFoundError";
	/** 荷札発行に失敗しました。届先郵便番号が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_ZIP_CD_NOT_FOUND_ERROR = "webApiDelivZipCdNotFoundError";
	/** 荷札発行に失敗しました。送り状コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_OKURI_CODE_NOT_FOUND_ERROR = "webApiOkuriCodeNotFoundError";
	/** 荷札発行に失敗しました。WebAPIリクエストURLが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_REQUEST_URL_NOT_FOUND_ERROR = "webApiRequestUrlNotFoundError";
	/** 荷札発行に失敗しました。お客様コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_SLIP_CUSTOMER_CD_NOT_FOUND_ERROR = "webApiSlipCustomerCdNotFoundError";
	/** 【在庫最小単位】横(mm)は整数10桁以内を入力して下さい。 */
	public static final String WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "widthBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】横(mm)は小数3桁以内を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "widthCheckInputDecimalLengthError";
	/** 【在庫最小単位】横(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_INTEGER_LENGTH_ERROR = "widthCheckInputIntegerLengthError";
	/** 【在庫最小単位】横(mm)は最小0以上を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_MIN_ERROR = "widthCheckInputMinError";
	/** 【在庫最小単位】横(mm)数値のみ */
	public static final String WIDTH_CHECK_NUMERIC_ONLY_ERROR = "widthCheckNumericOnlyError";
	/** 横(mm)は小数3桁以内を入力して下さい。 */
	public static final String WIDTH_INPUT_DECIMAL_LENGTH_ERROR = "widthInputDecimalLengthError";
	/** 横(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String WIDTH_INPUT_INTEGER_LENGTH_ERROR = "widthInputIntegerLengthError";
	/** 横(mm)は最小0以上を入力して下さい。 */
	public static final String WIDTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "widthInputRequestMinIsZeroError";
	/** WMS基盤エラー */
	public static final String WMS_BASE_ERROR = "wmsBaseError";
	/** 作業日は出荷日より後の日付に変更できません。 */
	public static final String WORK_DATE_CANNOT_CHANGE_BEFORE_SHIO_DATE_ERROR = "workDateCannotChangeBeforeShioDateError";
	/** 出荷確定またはキャンセル済の出荷指示に対して、作業日／出荷日を変更することはできません。 */
	public static final String WORK_DAY_SHIPPING_DAY_CHANGE_START_ERROR = "workDayShippingDayChangeStartError";
	/** 作業日が日付不正(形式:yyyy/MM/dd) */
	public static final String WORK_DT_DATE_ERROR = "workDtDateError";
	/** 作業日を入力して下さい。 */
	public static final String WORK_DT_NOT_INPUT_ERROR = "workDtNotInputError";
	/** 出荷確定またはキャンセル済の出荷指示に対して、作業メッセージを登録することはできません。 */
	public static final String WORK_MESSAGE_INSERT_START_ERROR = "workMessageInsertStartError";
	/** 出庫作業No.単位で指示を解除しますが宜しいですか？ */
	public static final String WORK_ORDER_CANCEL_CONFIRMATION = "workOrderCancelConfirmation";
	/** 作業中の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String WORKING_PACKING_ERROR = "workingPackingError";
	/** ヤマト着店マスタ取込（ワーク取込） */
	public static final String YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "ymtCarrierZipInputProgramNameInputWorkInformation";
	/** ヤマト着店マスタ取込（データ移行） */
	public static final String YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "ymtCarrierZipInputProgramNameRegisterInformation";
	/** 都道府県名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS1_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress1BulkInputCheckInputMaxError";
	/** 都道府県名 全角文字のみ */
	public static final String ZIP_ADDRESS1_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress1CheckFullWidthOnlyError";
	/** 都道府県名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS1_CHECK_INPUT_MAX_ERROR = "zipAddress1CheckInputMaxError";
	/** 市区町村名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS2_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress2BulkInputCheckInputMaxError";
	/** 市区町村名 全角文字のみ */
	public static final String ZIP_ADDRESS2_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress2CheckFullWidthOnlyError";
	/** 市区町村名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS2_CHECK_INPUT_MAX_ERROR = "zipAddress2CheckInputMaxError";
	/** 町域名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS3_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress3BulkInputCheckInputMaxError";
	/** 町域名 全角文字のみ */
	public static final String ZIP_ADDRESS3_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress3CheckFullWidthOnlyError";
	/** 町域名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS3_CHECK_INPUT_MAX_ERROR = "zipAddress3CheckInputMaxError";
	/** 小字（丁目、番地等）は最大62文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS4_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress4BulkInputCheckInputMaxError";
	/** 小字（丁目、番地等） 全角文字のみ */
	public static final String ZIP_ADDRESS4_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress4CheckFullWidthOnlyError";
	/** 小字（丁目、番地等）は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS4_CHECK_INPUT_MAX_ERROR = "zipAddress4CheckInputMaxError";
	/** 都道府県または市区町村または町域を入力して下さい。 */
	public static final String ZIP_ADDRESS_CHECK_NOT_INPUT_ERROR = "zipAddressCheckNotInputError";
	/** 都道府県名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN1_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn1BulkInputCheckInputMaxError";
	/** 都道府県名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN1_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn1CheckHalfWidthOnlyError";
	/** 都道府県名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN1_CHECK_INPUT_MAX_ERROR = "zipAddressKn1CheckInputMaxError";
	/** 市区町村名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN2_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn2BulkInputCheckInputMaxError";
	/** 市区町村名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN2_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn2CheckHalfWidthOnlyError";
	/** 市区町村名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN2_CHECK_INPUT_MAX_ERROR = "zipAddressKn2CheckInputMaxError";
	/** 町域名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN3_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn3BulkInputCheckInputMaxError";
	/** 町域名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN3_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn3CheckHalfWidthOnlyError";
	/** 町域名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN3_CHECK_INPUT_MAX_ERROR = "zipAddressKn3CheckInputMaxError";
	/** 旧郵便番号は最大5文字以下を入力して下さい。 */
	public static final String ZIP_CD5_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipCd5BulkInputCheckInputMaxError";
	/** 旧郵便番号は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_CD5_CHECK_INPUT_MAX_ERROR = "zipCd5CheckInputMaxError";
	/** 旧郵便番号 数値のみ */
	public static final String ZIP_CD5_CHECK_NUMERIC_ONLY_ERROR = "zipCd5CheckNumericOnlyError";
	/** 郵便番号は最大7文字以下を入力して下さい。 */
	public static final String ZIP_CD_CHECK_INPUT_MAX_ERROR = "zipCdCheckInputMaxError";
	/** 郵便番号 数値のみ */
	public static final String ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "zipCdCheckNumericOnlyError";
	/** 郵便番号CDが重複しています。 */
	public static final String ZIP_CODE_DUPLICATE_ERROR = "zipCodeDuplicateError";
	/** 郵便番号で存在しません。 */
	public static final String ZIP_CODE_NOT_FOUND_ERROR = "zipCodeNotFoundError";
	/** 郵便番号を入力して下さい。 */
	public static final String ZIP_CODE_NOT_INPUT_ERROR = "zipCodeNotInputError";
	/** 郵便番号マスタ（大口事業所）取込（ワーク取込） */
	public static final String ZIP_COMPANY_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "zipCompanyInputProgramNameInputWorkInformation";
	/** 郵便番号マスタ（大口事業所）取込（データ移行） */
	public static final String ZIP_COMPANY_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "zipCompanyInputProgramNameRegisterInformation";
	/** 郵便番号マスタ取込（ワーク取込） */
	public static final String ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "zipInputProgramNameInputWorkInformation";
	/** 郵便番号マスタ取込（データ移行） */
	public static final String ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "zipInputProgramNameRegisterInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 , 除外件数：[2]件 */
	public static final String ZIP_INSERT_BATCH_INFO = "zipInsertBatchInfo";
	/** 取込が完了しました。取込件数：[0]件、除外件数：[1]件 */
	public static final String ZIP_INSERT_INFO = "zipInsertInfo";
	/** 郵便番号マスタ一括登録 */
	public static final String ZIP_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "zipMasterBulkInputProgramNameInformation";
	/** 検索条件を入力して検索して下さい。 */
	public static final String ZIP_MASTER_CANNOT_SELECT_NOT_INPUT_ERROR = "zipMasterCannotSelectNotInputError";
	/** 未出荷またはエラー以外の出荷指示に対して、郵便番号を変更することはできません。 */
	public static final String ZIP_NO_CHANGE_START_ERROR = "zipNoChangeStartError";
	/** 郵便番号一括変更 */
	public static final String ZIP_UPDATE_CONDITION = "zipUpdateCondition";
	/** ゾーンCD 英数字のみ */
	public static final String ZONE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "zoneCdCheckAlphabetAndNumericOnlyError";
	/** ゾーンCDは最大[0]文字以下を入力して下さい。 */
	public static final String ZONE_CD_CHECK_INPUT_MAX_ERROR = "zoneCdCheckInputMaxError";
	/** 該当ゾーンCDが該当倉庫マスタに存在しません。 */
	public static final String ZONE_CD_NOT_FOUND_ERROR = "zoneCdNotFoundError";
	/** ゾーンCDを入力して下さい。 */
	public static final String ZONE_CD_NOT_INPUT_ERROR = "zoneCdNotInputError";
	/** ロケーションマスタに登録されているゾーンCDは削除できません。 */
	public static final String ZONE_CODE_CANNOT_DELETE_IN_LOCATION_MASTER_ERROR = "zoneCodeCannotDeleteInLocationMasterError";
	/** ゾーンCDが重複しています。 */
	public static final String ZONE_CODE_DUPLICATE_ERROR = "zoneCodeDuplicateError";
	/** ゾーンマスタに存在します。 */
	public static final String ZONE_CODE_FOUND_IN_ZONE_MASTER_ERROR = "zoneCodeFoundInZoneMasterError";
	/** ゾーンCDがゾーンマスタに存在しません。 */
	public static final String ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR = "zoneCodeNotFoundInZoneMasterError";
	/** ゾーン名称を入力して下さい。 */
	public static final String ZONE_NAME_NOT_INPUT_ERROR = "zoneNameNotInputError";
	/** カートンの入庫予定があります。パレットはり紙出力を実施してください。 */
	public static final String ACCEPT_INSPECTIONS_NOT_FOUND_ERROR = "acceptInspectionsNotFoundError";
	/** 入力数量が予定数量を超過しています。 */
	public static final String ACTUAL_QTY_EXCEED_PLANNED_QUANTITY_ERROR = "actualQtyExceedPlannedQuantityError";
	/** 実績数量が棚出済の数量を超過しています */
	public static final String ACTUAL_QTY_EXCEEDS_ORDER_PICKING_QTY_ERROR = "actualQtyExceedsOrderPickingQtyError";
	/** 数量が入力されていません。 */
	public static final String ACTUAL_QTY_INPUT_ERROR = "actualQtyInputError";
	/** 事前補充を完了登録する時は事前補充の伝票を全選択して実行して下さい。 */
	public static final String ALL_ADVANCE_STOCK_TRANSFER_NOT_SELECT_ERROR = "allAdvanceStockTransferNotSelectError";
	/** 全て引当済の状態にしてからでないと山出しリスト作成できません。 */
	public static final String ALL_CASE_STOCK_TRANSFER_NOT_ALLOCATED_NO_PRINT_ERROR = "allCaseStockTransferNotAllocatedNoPrintError";
	/** 引当中を全て選択した状態で再引当を行って下さい。 */
	public static final String ALL_IN_ALLOCATING_STOCK_TRANSFER_NOT_SELECT_ERROR = "allInAllocatingStockTransferNotSelectError";
	/** 引当が未完了のため、帳票を印刷できません。 */
	public static final String ALLOCATION_UNFINISHED_PICKING_LIST_PRINT_ERROR = "allocationUnfinishedPickingListPrintError";
	/** 既に検査完了しています。 */
	public static final String ALREADY_EXAM_END_STATUS_ERROR = "alreadyExamEndStatusError";
	/** 対象の段ボールはパレット管理番号が設定されているため、削除はできません。 */
	public static final String ALREADY_PALLET_NO_ENTRY_ERROR = "alreadyPalletNoEntryError";
	/** この入庫予定は既に作業が開始されています。 */
	public static final String ALREADY_STARTED_RECEIVE_PLAN_ERROR = "alreadyStartedReceivePlanError";
	/** 適用開始年月日より適用終了年月日を前にしてください。 */
	public static final String APPLICATION_START_DATE_APPLICATION_END_DATE = "applicationStartDateApplicationEndDate";
	/** 適用開始年月日が未来世代ではありません。 */
	public static final String APPLICATION_START_DATE_NOT_FUTURE = "applicationStartDateNotFuture";
	/** 「受入予定日」が「発送予定日」より前の日付に設定されています。 */
	public static final String ARRIVAL_DATE_BEFORE_ESTIMATED_SHIPPING_DATE_ERROR = "arrivalDateBeforeEstimatedShippingDateError";
	/** 「着日」が「発日」より前の日付になっています。 */
	public static final String ARRIVAL_DATE_BEFORE_SHIPPING_DATE_ERROR = "arrivalDateBeforeShippingDateError";
	/** 「着日」は「発日」から７日間までが入力可能です。 */
	public static final String ARRIVAL_DATE_RANGE_OVER_ERROR = "arrivalDateRangeOverError";
	/** 現在のステータスでは送信できません。 */
	public static final String ARRIVAL_STATUS_WORK_ORDER_SEND_ERROR = "arrivalStatusWorkOrderSendError";
	/** 認可に失敗しました。 */
	public static final String AZURE_AUTH_ERROR = "azureAuthError";
	/** この２次元バーコードのケース情報が存在しません。 */
	public static final String BARCODE2_CASE_MASTER_NOT_FOUND_ERROR = "barcode2CaseMasterNotFoundError";
	/** 別の操作により選択中のケースは既に製品移動されています。 */
	public static final String BARCODE2D_ALREADY_MOVED_ERROR = "barcode2dAlreadyMovedError";
	/** この２次元バーコードの銘柄CDは存在しません。 */
	public static final String BARCODE2D_BRAND_CD_NOT_FOUND_ERROR = "barcode2dBrandCdNotFoundError";
	/** 銘柄コードが異なる為、この２次元バーコードを読込めません。 */
	public static final String BARCODE2D_CASE_AND_PALLET_BRAND_CD_DIFFERENT_ERROR = "barcode2dCaseAndPalletBrandCdDifferentError";
	/** パレットはり紙のカートン数量とカートン数量が一致しません。 */
	public static final String BARCODE2D_CASE_AND_PALLET_CARTON_QTY_DIFFERENT_ERROR = "barcode2dCaseAndPalletCartonQtyDifferentError";
	/** 流通識別が異なる為、この２次元バーコードを読込めません。 */
	public static final String BARCODE2D_CASE_AND_PALLET_DISTRIBUTION_DIFFERENT_ERROR = "barcode2dCaseAndPalletDistributionDifferentError";
	/** この２次元バーコードは仕分場に補充されているため、ケース検品できません。 */
	public static final String BARCODE2D_CASE_CANNOT_INSPECTION_REPLENISH_SORTING_YARD_ERROR = "barcode2dCaseCannotInspectionReplenishSortingYardError";
	/** この２次元バーコードは保管場に格納されているため、ケース検品できません。 */
	public static final String BARCODE2D_CASE_CANNOT_INSPECTION_STORED_IN_STORAGE_ERROR = "barcode2dCaseCannotInspectionStoredInStorageError";
	/** この２次元バーコードのデザイン区分は存在しません。 */
	public static final String BARCODE2D_DESIGN_CD_NOT_FOUND_ERROR = "barcode2dDesignCdNotFoundError";
	/** この２次元バーコードは使用できません。 */
	public static final String BARCODE2D_ERROR = "barcode2dError";
	/** この２次元バーコードの工場CDは存在しません。 */
	public static final String BARCODE2D_FACTORY_NOT_FOUND_ERROR = "barcode2dFactoryNotFoundError";
	/** 輸送番号が異なります。 */
	public static final String BARCODE2_DIFFERENT_TRANSPORT_NUMBER_ERROR = "barcode2DifferentTransportNumberError";
	/** この２次元バーコードのはり紙検品は完了しています。 */
	public static final String BARCODE2D_INSPECTION_LINK_PALLET_COMPLETED_ERROR = "barcode2dInspectionLinkPalletCompletedError";
	/** この２次元バーコードの製造年月日は未来日です。 */
	public static final String BARCODE2D_MANUFACTURE_FUTURE_DATE_ERROR = "barcode2dManufactureFutureDateError";
	/** ラック裏または融通用ロケの在庫ではありません。 */
	public static final String BARCODE2D_NOT_BACK_OF_RACK_OR_FLEXIBLE_LOCATION_ERROR = "barcode2dNotBackOfRackOrFlexibleLocationError";
	/** 1ケース未満の製品をスキャンした場合、カートン数を入力してください。 */
	public static final String BARCODE2D_NOT_FULL_ERROR = "barcode2dNotFullError";
	/** 入力したケースは払出済または取出済ではありません。 */
	public static final String BARCODE2D_NOT_PAID_OR_PICKED_ERROR = "barcode2dNotPaidOrPickedError";
	/** このケースはケース検品を行うことができないため、パレットはり紙作成できません。 */
	public static final String BARCODE2D_PALLET_REGISTERED_ERROR = "barcode2dPalletRegisteredError";
	/** この２次元バーコードは引取場受入登録されているため、パレットはり紙作成できません。 */
	public static final String BARCODE2D_PICKUP_AREA_ACCEPT_ERROR = "barcode2dPickupAreaAcceptError";
	/** この２次元バーコードは引取場受入登録されているため、はり紙検品できません。 */
	public static final String BARCODE2D_PICKUP_AREA_ACCEPT_PALLET_INSPECTION_ERROR = "barcode2dPickupAreaAcceptPalletInspectionError";
	/** この２次元バーコードは入庫情報登録済です。 */
	public static final String BARCODE2D_RECEIPT_CASE_NO_REGISTERED_ERROR = "barcode2dReceiptCaseNoRegisteredError";
	/** この２次元バーコードは仕分場に補充されているため、パレットはり紙作成できません。 */
	public static final String BARCODE2D_REPLENISH_SORTING_YARD_ERROR = "barcode2dReplenishSortingYardError";
	/** この２次元バーコードは仕分場に補充されているため、はり紙検品できません。 */
	public static final String BARCODE2D_REPLENISH_SORTING_YARD_PALLET_INSPECTION_ERROR = "barcode2dReplenishSortingYardPalletInspectionError";
	/** この２次元バーコードは出庫されているため、はり紙検品できません。 */
	public static final String BARCODE2D_SHIPPED_PALLET_INSPECTION_ERROR = "barcode2dShippedPalletInspectionError";
	/** この２次元バーコードは仕分場に補充されたため、はり紙検品できません。 */
	public static final String BARCODE2D_SORTING_YARD_ACHIEVEMENT_PALLET_INSPECTION_ERROR = "barcode2dSortingYardAchievementPalletInspectionError";
	/** この２次元バーコードは保管場に格納されているため、パレットはり紙作成できません。 */
	public static final String BARCODE2D_STORED_IN_STORAGE_ERROR = "barcode2dStoredInStorageError";
	/** この２次元バーコードは保管場に格納されているため、はり紙検品できません。 */
	public static final String BARCODE2D_STORED_IN_STORAGE_PALLET_INSPECTION_ERROR = "barcode2dStoredInStoragePalletInspectionError";
	/** このバーコードは存在しません。 */
	public static final String BARCODE_NOT_FOUND_ERROR = "barcodeNotFoundError";
	/** 保管場以外に格納されている製品の為、この２次元バーコードは読込めません。 */
	public static final String BARCODE_STORED_IN_NOT_STORAGE_ERROR = "barcodeStoredInNotStorageError";
	/** 拠点コード’{1}’、銘柄コード’{2}’は引当禁止です。 */
	public static final String BASE_CD_AND_BRAND_CD_ALLOCATION_PROHIBITING = "BaseCdAndBrandCdAllocationProhibiting";
	/** 基本補充量が数値ではありません。 */
	public static final String BASE_RESTOCK_NUM_CHECK_NUMERIC_ONLY_ERROR = "baseRestockNumCheckNumericOnlyError";
	/** 基本補充量を入力して下さい。 */
	public static final String BASE_RESTOCK_NUM_NOT_INPUT_ERROR = "baseRestockNumNotInputError";
	/** 基本補充点を入力して下さい。 */
	public static final String BASE_RESTOCK_P_NUM_NOT_INPUT_ERROR = "baseRestockPNumNotInputError";
	/** 変更前ロケーションCDが重複しています。 */
	public static final String BEFORE_CHANGELOCATION_CODE_DUPLICATE_ERROR = "beforeChangelocationCodeDuplicateError";
	/** 変更前ロケーションCDはロケーションマスタに存在しません。 */
	public static final String BEFORE_CHANGELOCATION_NOT_FOUND_ERROR = "beforeChangelocationNotFoundError";
	/** 変更前ロケーションCDを入力して下さい。 */
	public static final String BEFORE_CHANGELOCATION_NOT_INPUT_ERROR = "beforeChangelocationNotInputError";
	/** 1桁目にB以外が入力されています。 */
	public static final String BLOCK_CD_B_ERROR = "blockCdBError";
	/** 対応ブロックに入力されたブロックがブロックテーブルに存在しません。 */
	public static final String BLOCK_NOT_ASSOCIATED_TO_BLOCK_TABLE_ERROR = "blockNotAssociatedToBlockTableError";
	/** ライン対応ブロックに設定されていないブロックCDが存在します。 */
	public static final String BLOCK_NOT_ASSOCIATED_TO_LINE_ERROR = "blockNotAssociatedToLineError";
	/** ブロックが変更されていません。 */
	public static final String BLOCK_NOT_CHANGED_ERROR = "blockNotChangedError";
	/** 棚出検品(単品)で棚出されたシンボルはスキャンできません。 */
	public static final String BONDED_ORDER_PICKING_SINGLE_SYMBOL_SCAN_ERROR = "bondedOrderPickingSingleSymbolScanError";
	/** 異なる棚出リストキーで棚出されたシンボルです。 */
	public static final String BONDED_PICKING_LIST_KEY_DIFFERENT_ERROR = "bondedPickingListKeyDifferentError";
	/** 棚出されたシンボルではありません。 */
	public static final String BONDED_PICKING_SYMBOL_ERROR = "bondedPickingSymbolError";
	/** 既に入庫完了のため、登録できません。 */
	public static final String BONDED_RECEIVE_COMPLETED_ERROR = "bondedReceiveCompletedError";
	/** レコードスキップ（入庫ステータスが既に入庫登録中） */
	public static final String BONDED_WMS_RECEIVE_PLAN_STATUS_ERROR = "bondedWmsReceivePlanStatusError";
	/** 一番下の行が選択されています。 */
	public static final String BOTTOM_ROW_SELECTED_ERROR = "bottomRowSelectedError";
	/** 該当銘柄は廃止銘柄です。 */
	public static final String BRAND_ABOLITION_ERROR = "brandAbolitionError";
	/** 該当銘柄は発売開始前です。 */
	public static final String BRAND_BEFORE_SALES_START_ERROR = "brandBeforeSalesStartError";
	/** デザイン区分と銘柄CDが変更されていません。デザイン区分か銘柄CDを変更して下さい。 */
	public static final String BRAND_C_D_ANDDESIGN_C_D_NO_CHANGE = "brandCDAnddesignCDNoChange";
	/** 変更後の銘柄コードか変更後のデザイン区分を入力してください。 */
	public static final String BRAND_CD_DESIGN_TYPE_NOTHING = "brandCdDesignTypeNothing";
	/** 同じロケーションかつ同じ銘柄CDのデータは複数登録できません。 */
	public static final String BRANDCD_DUPLICATE = "brandcdDuplicate";
	/** 銘柄CDは存在しません。 */
	public static final String BRAND_CD_NOT_FOUND_ERROR = "brandCdNotFoundError";
	/** 銘柄区分、たばこ銘柄区分が異なる製品です。 */
	public static final String BRAND_CLASS_DIFFERENT_ERROR = "brandClassDifferentError";
	/** 該当銘柄は取扱中止銘柄です。 */
	public static final String BRAND_DISCONTINUED_ERROR = "brandDiscontinuedError";
	/** 該当の銘柄コードがマスタに存在しません。 */
	public static final String BRAND_NOT_FOUND_ERROR = "brandNotFoundError";
	/** 同一ラインの対応ブロックに個口圧縮対象が3つ存在しています。 */
	public static final String BLOCK_INDIVIDUAL_LOT_COMPRESSION_SUBJECT_ERROR = "blockIndividualLotCompressionSubjectError";
	/** 入力されたカートン数量がパレット残在庫数量を上回っています。 */
	public static final String CACE_NUM_OVER_CASE_REMAINING_NUM_ERROR = "caceNumOverCaseRemainingNumError";
	/** 入力されたケース数量がパレット残在庫数量を上回っています。 */
	public static final String CACE_NUM_OVER_PALLET_REMAINING_NUM_ERROR = "caceNumOverPalletRemainingNumError";
	/** 拠点CD：[0] , 荷主CD：[1] */
	public static final String CALL_BATCH_PARAMETER_INFORMATION = "callBatchParameterInformation";
	/** このシンボルは検査中ではないため取消できません。 */
	public static final String CANCEL_TESTED_SYMBOL_CANNOT_CANCEL_ERROR = "cancelTestedSymbolCannotCancelError";
	/** ロット属性が変更されているため、正常品登録を解除できません。 */
	public static final String CANCEL_TESTED_SYMBOL_LOT_CHANGED_ERROR = "cancelTestedSymbolLotChangedError";
	/** 検査済正常品登録が未完了のシンボルが含まれています。 */
	public static final String CANCEL_TESTED_SYMBOL_NOT_COMPLETE_ERROR = "cancelTestedSymbolNotCompleteError";
	/** 検査場に存在しないシンボルが含まれています。 */
	public static final String CANCEL_TESTED_SYMBOL_NOT_EXIST_TESTED_PLACE_ERROR = "cancelTestedSymbolNotExistTestedPlaceError";
	/** 段ボール情報が存在しないシンボルが含まれています。 */
	public static final String CANCEL_TESTED_SYMBOL_NOT_FOUND_ERROR = "cancelTestedSymbolNotFoundError";
	/** このシンボルは検査済正常品登録が未完了です。 */
	public static final String CANCEL_TESTED_SYMBOL_NOT_REGISTER_ERROR = "cancelTestedSymbolNotRegisterError";
	/** 検査中ではないシンボルが含まれています。 */
	public static final String CANCEL_TESTED_SYMBOL_NOT_TESTED_ERROR = "cancelTestedSymbolNotTestedError";
	/** 対象データは完了登録できないデータが含まれています。 */
	public static final String CANNO_SELECT_REPLENISH_STOCK_TRANSFER_SHIPPING_ADDRESS_NOT_SENT_ERROR = "cannoSelectReplenishStockTransferShippingAddressNotSentError";
	/** 該当データは既に指示送信済のため修正できません。 */
	public static final String CANNOT_CHANGE_ALREADY_SEND_DATA_ERROR = "cannotChangeAlreadySendDataError";
	/** スキャンした棚出リストキーは未作業のため検品できません */
	public static final String CANNOT_INSPECTION_STATUS_ERROR = "cannotInspectionStatusError";
	/** 選択した輸送番号の融通山出しリストは在庫が無いため、発行できません。 */
	public static final String CANNOT_SELECT_REPLENISH_STOCK_TRANSFER_LIST_STOCK_NOT_SET_ERROR = "cannotSelectReplenishStockTransferListStockNotSetError";
	/** 在庫が存在しない段ボールが含まれています。 */
	public static final String CARDBOARD_STOCK_NOT_FOUND_ERROR = "cardboardStockNotFoundError";
	/** 仕分場カートン詰合せを実施してください */
	public static final String CARTON_ASSORTMENT_NOT_CARRIED_OUT_ERROR = "cartonAssortmentNotCarriedOutError";
	/** 実績数量が指示数量（カートン）に達しています。 */
	public static final String CARTON_INST_QUANTITY_EQUAL_RECORD_ERROR = "cartonInstQuantityEqualRecordError";
	/** この段ボールにはカートンは存在しません。 */
	public static final String CARTON_NOT_FOUND_ERROR = "cartonNotFoundError";
	/** カートン単位の受注番号がありません。 */
	public static final String CARTON_ORDER_INFO_NOT_FOUND_ERROR = "cartonOrderInfoNotFoundError";
	/** カートン数量がケースの残数を超えています */
	public static final String CARTON_QTY_EXCEEDS_CASE_QTY_ERROR = "cartonQtyExceedsCaseQtyError";
	/** カートン数量が受注情報カートン数を超えています。 */
	public static final String CARTON_QTY_EXCEEDS_ORDER_INFO_CARTON_ERROR = "cartonQtyExceedsOrderInfoCartonError";
	/** 1ケース当りのカートン数を超えています。 */
	public static final String CARTON_QUANTITY_OVER_ONE_CASE_ERROR = "cartonQuantityOverOneCaseError";
	/** カートン補充用のケースはり紙をスキャンして下さい。 */
	public static final String CARTON_REPLENISH_SYMBOL_BARCODE_SCAN_ERROR = "cartonReplenishSymbolBarcodeScanError";
	/** 同一シンボルで保管場にカートンが残っています */
	public static final String CARTONS_LEFT_IN_STORAGE_ERROR = "cartonsLeftInStorageError";
	/** このケースのカートン在庫は存在しません。 */
	public static final String CARTON_STOCK_NOT_FOUND_ERROR = "cartonStockNotFoundError";
	/** 入力したケースは既に山出しされています。 */
	public static final String CASE_ALREADY_STOCK_TRANSFER_ERROR = "caseAlreadyStockTransferError";
	/** 数量（ケース）または数量（カートン）に数量を入力してください。 */
	public static final String CASE_AND_CARTON_QUANTITY_ZERO_ERROR = "caseAndCartonQuantityZeroError";
	/** パレットはり紙と銘柄が異なります。 */
	public static final String CASE_AND_PALLET_BRAND_CD_DIFFERENT_ERROR = "caseAndPalletBrandCdDifferentError";
	/** パレットはり紙とデザイン区分が異なります。 */
	public static final String CASE_AND_PALLET_DESIGN_CD_DIFFERENT_ERROR = "caseAndPalletDesignCdDifferentError";
	/** パレットはり紙と製造年月日が異なります。 */
	public static final String CASE_AND_PALLET_MANUFACTURE_FUTURE_DATE_DIFFERENT_ERROR = "caseAndPalletManufactureFutureDateDifferentError";
	/** パレットはり紙と数量が異なります。 */
	public static final String CASE_AND_PALLET_QTY_DIFFERENT_ERROR = "caseAndPalletQtyDifferentError";
	/** パレットはり紙と商社搬入番号が異なります。 */
	public static final String CASE_AND_PALLET_TRADING_COMPANY_CARRY_NUMBER_DIFFERENT_ERROR = "caseAndPalletTradingCompanyCarryNumberDifferentError";
	/** パレットはり紙と輸送番号が異なります。 */
	public static final String CASE_AND_PALLET_TRANSPORT_NUMBER_DIFFERENT_ERROR = "caseAndPalletTransportNumberDifferentError";
	/** 入力されたパレットはり紙は、はり紙検品済みであるため、ケース検品できません。 */
	public static final String CASE_CANNOT_INSPECTION_PALLETIZE_ERROR = "caseCannotInspectionPalletizeError";
	/** 仕分場からカートン単位で取り出された製品は、ケース検品できません。外箱を破棄してください。 */
	public static final String CASE_CANNOT_INSPECTION_REPLENISH_SORTING_YARD_CARTON_ERROR = "caseCannotInspectionReplenishSortingYardCartonError";
	/** ケース数、カートン数を入力してください。 */
	public static final String CASE_CARTON_NUM_NOT_INPUT_ERROR = "caseCartonNumNotInputError";
	/** このケースは既にスキャンされています。 */
	public static final String CASE_DUPLICATE_ERROR = "caseDuplicateError";
	/** 入力した２次元バーコードのケース情報が存在しません。 */
	public static final String CASE_INFOMATION_NOT_REGISTERED_ERROR = "caseInfomationNotRegisteredError";
	/** このケースはケース検品を行うことができないため、はり紙検品を行って下さい。 */
	public static final String CASE_INSPECTION_CASE_PALLET_ALREADY_LINKED_ERROR = "caseInspectionCasePalletAlreadyLinkedError";
	/** 実績数量が指示数量（ケース）に達しています。 */
	public static final String CASE_INST_QUANTITY_EQUAL_RECORD_ERROR = "caseInstQuantityEqualRecordError";
	/** 入力された製品はこのパレットに積まれていません。 */
	public static final String CASE_NOT_PILE_UP_PALLET_ERROR = "caseNotPileUpPalletError";
	/** 入力された製品はこのロケに補充されていません。 */
	public static final String CASE_NOT_REPLENISH_ERROR = "caseNotReplenishError";
	/** 入力されたケース数量が山出し指示数量を上回っています。 */
	public static final String CASE_NUM_OVER_TRANSFER_LIST_NUM_ERROR = "caseNumOverTransferListNumError";
	/** パレットはり紙と２次元バーコードのパレット管理番号が異なります。 */
	public static final String CASE_OR_PALLET_DIFFERENT_PALLET_NUMBER_ERROR = "caseOrPalletDifferentPalletNumberError";
	/** 入力された製品は既に銘柄組替／デザイン変更ロケに格納されています。 */
	public static final String CASE_PRODUCT_CHANGE_DESIGN_CHANGE_LOCATION_STORED_ERROR = "caseProductChangeDesignChangeLocationStoredError";
	/** 取出ケースのカートン数量が変更されました　再度取出すケースの入力を行ってください。 */
	public static final String CASE_QTY_CHANGED_ERROR = "caseQtyChangedError";
	/** この製品は仕分済のため、取出できません。 */
	public static final String CASE_SORTED_ERROR = "caseSortedError";
	/** 未使用のケースはり紙をスキャンして下さい。 */
	public static final String CASE_SYMBOL_BARCODENOT_NOT_USER_FLG_ERROR = "caseSymbolBarcodenotNotUserFlgError";
	/** ケースの２次元バーコードをスキャンして下さい。 */
	public static final String CASE_SYMBOL_BARCODE_SCAN_ERROR = "caseSymbolBarcodeScanError";
	/** 山出し作業が完了していません。 */
	public static final String CASE_TRANSFER_NOT_COMPLETED_ERROR = "caseTransferNotCompletedError";
	/** 拠点CDが不正です。 */
	public static final String CENTER_CD_INTEGRITY_ERROR = "centerCdIntegrityError";
	/** 拠点CDが拠点マスタに存在しません。 */
	public static final String CENTER_CD_NOT_FOUND_ERROR = "centerCdNotFoundError";
	/** 工場CD、入庫キーのいずれかを入力して検索してください。 */
	public static final String CENTER_CD_OR_RCV_KEY_NOT_INPUT_ERROR = "centerCdOrRcvKeyNotInputError";
	/** 変更対象の拠点銘柄制御マスタ情報が更新されています。 */
	public static final String CENTER_PRODUCT_CONTROL_CHANGED_ERROR = "centerProductControlChangedError";
	/** 変更対象の拠点銘柄制御マスタ情報が存在しません。 */
	public static final String CENTER_PRODUCT_CONTROL_NOT_FOUND_ERROR = "centerProductControlNotFoundError";
	/** 在庫数(カートン)が数値ではありません。 */
	public static final String CHANGE_CARTON_NUM_CHECK_NUMERIC_ONLY_ERROR = "changeCartonNumCheckNumericOnlyError";
	/** 在庫数(カートン)を入力して下さい。 */
	public static final String CHANGE_CARTON_NUM_NOT_INPUT_ERROR = "changeCartonNumNotInputError";
	/** 在庫数(ケース)が数値ではありません。 */
	public static final String CHANGE_CASE_NUM_CHECK_NUMERIC_ONLY_ERROR = "changeCaseNumCheckNumericOnlyError";
	/** 在庫数(ケース)が不正です。 */
	public static final String CHANGE_CASE_NUM_INTEGRITY_ERROR = "changeCaseNumIntegrityError";
	/** 在庫数(ケース)を入力して下さい。 */
	public static final String CHANGE_CASE_NUM_NOT_INPUT_ERROR = "changeCaseNumNotInputError";
	/** 文字型以外がセットされています。 */
	public static final String CHARACTER_TYPE_EXCEPT_ERROR = "characterTypeExceptError";
	/** 自動採番の最大値を超えました。自動採番機能は使用できません。 */
	public static final String CHECK_LINE_DATE_SORTING_ORDER_ERROR = "checkLineDateSortingOrderError";
	/** 荷主CDが荷主マスタに存在しません。 */
	public static final String CLIENT_CD_NOT_FOUND_ERROR = "clientCdNotFoundError";
	/** お得意様CD、工場CD、入庫キーのいずれかを入力して検索してください。 */
	public static final String CLIENT_CD_OR_CENTER_CD_OR_RCV_KEY_NOT_INPUT_ERROR = "clientCdOrCenterCdOrRcvKeyNotInputError";
	/** エラーメッセージ：[0] */
	public static final String COMMON_ERROR_MESSAGE_INFORMATION = "commonErrorMessageInformation";
	/** メッセージ：[0] */
	public static final String COMMON_MESSAGE_INFORMATION = "commonMessageInformation";
	/** 組織CDは組織マスタに存在しません。 */
	public static final String COMPANY_CD_NOT_FOUND_ERROR = "companyCdNotFoundError";
	/** 選択した行を入庫作業情報送信しますか？ */
	public static final String CONFIRM_ARRIVAL_WORK_ORDER_SEND_ROW = "confirmArrivalWorkOrderSendRow";
	/** 継続取出可能な取出回数を超えています。 */
	public static final String CONTINUE_TAKE_OUT_OVER_ERROR = "continueTakeOutOverError";
	/** 複製する行が選択されていません。 */
	public static final String COPY_ROW_ERR_NOT_SELECT = "copyRowErrNotSelect";
	/** 削除対象のブロックCDが対応ブロックに設定されています。 */
	public static final String CORRESPONDENCE_BLOCK_NOT_BLOCK_CD_ERROR = "correspondenceBlockNotBlockCdError";
	/** 選択された方面の出庫に必要な在庫が不足しています。当日補充を実施してください。 */
	public static final String CURRENT_DAY_REPLENISH_NOT_COMPLETED_ERROR = "currentDayReplenishNotCompletedError";
	/** データを取得できませんでした。 */
	public static final String DATA_CANNOT_SELECT_ERROR = "dataCannotSelectError";
	/** 指示数量と実績数量に差があるデータが含まれています。 */
	public static final String DATA_CHECK_SELECT_REPLENISH_STOCK_TRANSFER_NO_UNMATCH_QTY_ERROR = "dataCheckSelectReplenishStockTransferNoUnmatchQtyError";
	/** 差異があります。お得意様に確認済ですか？ */
	public static final String DATA_DIFFERENT_EXSIST_CONFIRMATION = "dataDifferentExsistConfirmation";
	/** データ更新処理で異常が発生しました。 */
	public static final String DATA_UPDATE_ERROR = "dataUpdateError";
	/** 仕分曜日、配達拠点CD、方面CDが重複しています。 */
	public static final String DATE_DIRECTION_CD_DELIVERY_CENTER_CD_DUPLICATE_ERROR = "dateDirectionCdDeliveryCenterCdDuplicateError";
	/** 日付型以外がセットされています。 */
	public static final String DATE_TYPE_EXCEPT_ERROR = "dateTypeExceptError";
	/** 瑕疵品の在庫調査が未完了です。 */
	public static final String DEFECT_PRODUCT_INVENTORY_INSPECTION_NOT_COMPLETE_ERROR = "defectProductInventoryInspectionNotCompleteError";
	/** 配達拠点CDがテーブルに存在しません */
	public static final String DELIVERY_CENTER_CD_NOT_FOUND_ERROR = "deliveryCenterCdNotFoundError";
	/** デザイン区分は存在しません。 */
	public static final String DESIGN_CD_NOT_FOUND_ERROR = "designCdNotFoundError";
	/** デ変(優先)1～5のデザイン区分は前詰めで入力して下さい。 */
	public static final String DESIGN_CHANGE_MISSINGPARTS_ERROR = "designChangeMissingpartsError";
	/** デ変(優先)1～5のデザイン区分には同じ値を複数入力しないでください。 */
	public static final String DESIGN_CHANGE_MULTIPLE_ERROR = "designChangeMultipleError";
	/** デザイン区分に値がありません。 */
	public static final String DESIGN_CLS_NOT_INPUT_ERROR = "designClsNotInputError";
	/** 国産製品で指定することができないデザイン区分が設定されています。 */
	public static final String DESIGN_FLG_CANNOT_REGISTER_DOMESTIC_PRODUCT_ERROR = "designFlgCannotRegisterDomesticProductError";
	/** パレットはり紙情報とロットマスタのデザイン区分が不整合となっています。 */
	public static final String DESIGN_KUBUN_MISMATCH = "designKubunMismatch";
	/** 明細行がないデータを登録することは出来ません。 */
	public static final String DETAIL_LINE_NOT_FOUND_ERROR = "detailLineNotFoundError";
	/** 変更前と変更後の内外区分が異なります。 */
	public static final String DIFFERENT_INSIDE_AND_OUTSIDE_KUBUN = "differentInsideAndOutsideKubun";
	/** 対象年月日と同年同月の日付を入力して下さい。 */
	public static final String DIFFERENT_INVENTORY_DATE_IMPLEMENTATION_DATE_ERROR = "differentInventoryDateImplementationDateError";
	/** 方面属性テーブルに登録されていないデータが存在します｡ 方面指示は出来ません。登録後、方面指示を行ってください。 */
	public static final String DIRECTION_NOT_REGISTERED_ERROR = "directionNotRegisteredError";
	/** ロケーション「{0}」の方面別残数がマイナスとなるため変更できません。 */
	public static final String DIRECTION_REMAINING_COUNT_MINUS_ERROR = "directionRemainingCountMinusError";
	/** この２次元バーコードの流通識別は存在しません。 */
	public static final String DISTRIBUTION_IDENTIFICATION_ERROR = "distributionIdentificationError";
	/** この特約店CDは存在しません。 */
	public static final String DISTRIBUTOR_CODE_NOT_FOUND_IN_DISTRIBUTOR_MASTER_ERROR = "distributorCodeNotFoundInDistributorMasterError";
	/** 入力明細の銘柄に国産、輸入製品が混在しています。 */
	public static final String DOMESTIC_AND_IMPORTED_PRODUCT_MIXED_ERROR = "domesticAndImportedProductMixedError";
	/** 国産、輸入製品で指定できないデザイン区分が入力されています。 */
	public static final String DOMESTIC_PRODUCT_AND_IMPORTED_PRODUCT_REARRANGEMENT_TYPE_DESIGN_ERROR = "domesticProductAndImportedProductRearrangementTypeDesignError";
	/** 国産製品で設定することができないデザイン区分が設定されています。 */
	public static final String DOMESTIC_PRODUCT_REARRANGEMENT_TYPE_DESIGN_ERROR = "domesticProductRearrangementTypeDesignError";
	/** 個口圧縮区分が入力範囲を超えています。 */
	public static final String EDGE_COMPRESSION_CLASS_EXCEPT_ERROR = "edgeCompressionClassExceptError";
	/** 認証に失敗しました。キャンセルボタンを押下し、ログイン画面から再度パスワードの入力を実施して下さい。 */
	public static final String ENTRUST_AUTH_ERROR = "entrustAuthError";
	/** マイナスの値が存在します。 */
	public static final String ERROR_VALUE_MINUS = "errorValueMinus";
	/** 組織CDは組織マスタに存在しません。(行.：[0]) */
	public static final String ETL_COMPANY_CD_NOT_FOUND_ERROR = "etlCompanyCdNotFoundError";
	/** 明細が存在しません。(行：[0]) */
	public static final String ETL_CORD_BODY_NOT_FOUND_ERROR = "etlCordBodyNotFoundError";
	/** 販売年月日が不正です。(行：[0]) */
	public static final String ETL_CORD_DELIV_DT_DATE_ERROR = "etlCordDelivDtDateError";
	/** さしずヘッダの一意制約違反です。(行：[0]) */
	public static final String ETL_CORD_HEADER_UNIQUE_ERROR = "etlCordHeaderUniqueError";
	/** 販売数量異常(さしず明細)。(行：[0]) */
	public static final String ETL_CORD_SALES_PRODUCT_QTY_ERROR = "etlCordSalesProductQtyError";
	/** 伝票タイプが不正です。(行：[0]) */
	public static final String ETL_CORD_TYPE_ERROR = "etlCordTypeError";
	/** 組織CD仕分拠点管理テーブルに存在しません。(行：[0]) */
	public static final String ETL_CSRWHADM_COMPANY_CＤ_NOT_FOUND_ERROR = "etlCsrwhadmCompanyCｄNotFoundError";
	/** お得意様CDが不正です。(行：[0]) */
	public static final String ETL_CUSTOMER_CD_ERROR = "etlCustomerCdError";
	/** 販売年月日がヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_CORD_DELIV_DT_ERROR = "etlHeaderDifferentCordDelivDtError";
	/** 伝票番号がヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_CORD_NUMBER_ERROR = "etlHeaderDifferentCordNumberError";
	/** 伝票タイプがヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_CORD_TYPE_ERROR = "etlHeaderDifferentCordTypeError";
	/** 配達拠点コードがヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_DPCD_ERROR = "etlHeaderDifferentDpcdError";
	/** さしずグループがヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_ORDGR_ERROR = "etlHeaderDifferentOrdgrError";
	/** 仕分基地コードがヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_SRWHCD_ERROR = "etlHeaderDifferentSrwhcdError";
	/** お得意様コードがヘッダと異なります。(行：[0]) */
	public static final String ETL_HEADER_DIFFERENT_SSCD_ERROR = "etlHeaderDifferentSscdError";
	/** 受注数量が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_EXPECT_QTY_ERROR = "etlOrderNecessaryExpectQtyError";
	/** 指図日が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_INSTRUCTIONS_DATE_ERROR = "etlOrderNecessaryInstructionsDateError";
	/** No.が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_ITEM_LINE_NO_ERROR = "etlOrderNecessaryItemLineNoError";
	/** 受注日が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_ORDER_DATE_ERROR = "etlOrderNecessaryOrderDateError";
	/** 受注番号が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_ORDER_NUMBER_ERROR = "etlOrderNecessaryOrderNumberError";
	/** 出庫先住所1が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_ADDRESS1_ERROR = "etlOrderNecessaryPlanAddress1Error";
	/** 出庫先住所2が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_ADDRESS2_ERROR = "etlOrderNecessaryPlanAddress2Error";
	/** 出庫先名称が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_NAME_ERROR = "etlOrderNecessaryPlanNameError";
	/** 出庫先郵便番号が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_POST_ERROR = "etlOrderNecessaryPlanPostError";
	/** 単価が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_PRICE_ERROR = "etlOrderNecessaryPlanPriceError";
	/** 売上金額が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PLAN_PRICE_TOTAL_ERROR = "etlOrderNecessaryPlanPriceTotalError";
	/** 銘柄コードが設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_PRODUCT_CD_ERROR = "etlOrderNecessaryProductCdError";
	/** 売上種別が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_SALES_TYPE_ERROR = "etlOrderNecessarySalesTypeError";
	/** 出庫先コードが設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_SHIP_TO_CODE_ERROR = "etlOrderNecessaryShipToCodeError";
	/** SKU Codeが設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_SKU_CODE_ERROR = "etlOrderNecessarySkuCodeError";
	/** 合計が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_TOTAL_EXPECT_QTY_ERROR = "etlOrderNecessaryTotalExpectQtyError";
	/** 出庫プラントが設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_WARE_HOUSE_PLANT_ERROR = "etlOrderNecessaryWareHousePlantError";
	/** 出庫プラント名称が設定されていない行があるため、取込み出来ません。 */
	public static final String ETL_ORDER_NECESSARY_WARE_HOUSE_PLANT_NAME_ERROR = "etlOrderNecessaryWareHousePlantNameError";
	/** 銘柄は廃止銘柄です。(行：[0]) */
	public static final String ETL_PRODUCT_CD_ABOLITION_PRODUCT_ERROR = "etlProductCdAbolitionProductError";
	/** 銘柄CDは銘柄マスタに存在しません。(行：[0]) */
	public static final String ETL_PRODUCT_CD_NOT_FOUND_ERROR = "etlProductCdNotFoundError";
	/** 銘柄マスタの1ケース当カートン数が不正です。(行：[0]) */
	public static final String ETL_PRODUCT_MASTER_CBCT_ERROR = "etlProductMasterCbctError";
	/** 銘柄マスタのカートン容積が不正です。(行：[0]) */
	public static final String ETL_PRODUCT_MASTER_CTCC_ERROR = "etlProductMasterCtccError";
	/** 銘柄マスタのカートン形状が不正です。(行：[0]) */
	public static final String ETL_PRODUCT_MASTER_CTFM_ERROR = "etlProductMasterCtfmError";
	/** 入庫完了していないため、品質検査済に変更できません。 */
	public static final String EXAM_CANNOT_CHANGE_NOT_RECEIVE_COMPLETE_ERROR = "examCannotChangeNotReceiveCompleteError";
	/** 現在の検査ステータスでは品質検査済に変更できません。 */
	public static final String EXAM_CANNOT_CHANGE_STATUS_ERROR = "examCannotChangeStatusError";
	/** 入庫完了していないため、検査結果入力できません。 */
	public static final String EXAM_CANNOT_REGISTER_NOT_RECEIVE_COMPLETE_ERROR = "examCannotRegisterNotReceiveCompleteError";
	/** 検査日が入庫日よりも前の日付に設定されています。 */
	public static final String EXAM_DATE_BEFORE_RECEIVE_DATE_ERROR = "examDateBeforeReceiveDateError";
	/** 検査日に入庫日より前の日付は入力できません。 */
	public static final String EXAM_DATE_CANNOT_BEFORE_RECEIVE_DATE_ERROR = "examDateCannotBeforeReceiveDateError";
	/** 検査日に未来日付は入力できません。 */
	public static final String EXAM_DATE_FUTURE_DATE_ERROR = "examDateFutureDateError";
	/** 検査日が設定されていない検査明細が存在します。 */
	public static final String EXAM_DATE_NOT_REGISTERED_ERROR = "examDateNotRegisteredError";
	/** 入庫完了していないため、検査完了登録できません。 */
	public static final String EXAM_END_CANNOT_CHANGE_NOT_RECEIVE_COMPLETE_ERROR = "examEndCannotChangeNotReceiveCompleteError";
	/** 現在の検査ステータスでは検査完了登録はできません。 */
	public static final String EXAM_END_CANNOT_CHANGE_STATUS_ERROR = "examEndCannotChangeStatusError";
	/** ファイルが存在しません。 */
	public static final String FILE_NOT_FOUND_ERROR = "fileNotFoundError";
	/** 選択された操作は既に指示を満たしているため不要です。 */
	public static final String FLEXIBILITY_INST_QUANTITY_COMPLETED_ERROR = "flexibilityInstQuantityCompletedError";
	/** 融通山出しリストが変更されました　融通山出しリストを再度印刷してください */
	public static final String FLEXIBILITY_LIST_MODIFICATION_ERROR = "flexibilityListModificationError";
	/** この融通先への融通指示は存在しません */
	public static final String FLEXIBILITY_NO_NOT_FOUND_ERROR = "flexibilityNoNotFoundError";
	/** この山出しリストはすべて山出し済みです */
	public static final String FLEXIBILITY_PICKING_COMPLETED_ERROR = "flexibilityPickingCompletedError";
	/** 製造年月日には未来日付は入力できません。 */
	public static final String FUTURE_MADE_DATE_INPUT_ERROR = "futureMadeDateInputError";
	/** 世代区分が入力範囲を超えています。 */
	public static final String GENERATION_CLASS_EXCEPT_ERROR = "generationClassExceptError";
	/** 適用終了年月日に2100/12/31以外が入力されています。 */
	public static final String GENERATION_CLASSNOT_APPLICATION_END_DATE_EXCEPT_ERROR = "generationClassnotApplicationEndDateExceptError";
	/** 適用終了年月日が2100/12/31を過ぎています。 */
	public static final String GENERATION_CLASSNOT_APPLICATION_END_DATE_GREATER_ERROR = "generationClassnotApplicationEndDateGreaterError";
	/** 適品在庫実績が取り込まれていません。 */
	public static final String HANBAI_SUITABLE_PRODUCT_STOCK_TYPE_UNRECEIVED_ERROR = "hanbaiSuitableProductStockTypeUnreceivedError";
	/** 不適品在庫実績が取り込まれていません。 */
	public static final String HANBAI_UNSUITABLE_PRODUCT_STOCK_TYPE_UNRECEIVED_ERROR = "hanbaiUnsuitableProductStockTypeUnreceivedError";
	/** 同じロット情報とロケコードを持つシンボルをスキャンしてください。 */
	public static final String HANDY_CARDBOARD_DIFFERENT_LOTS_ERROR = "handyCardboardDifferentLotsError";
	/** この段ボール格納されていません。 */
	public static final String HANDY_CARDBOARD_NOT_STORED_STATE_ERROR = "handyCardboardNotStoredStateError";
	/** 他の作業で段ボール情報の残数量が更新されています。 */
	public static final String HANDY_CARDBOARD_QUANTIY_CHANGED_ERROR = "handyCardboardQuantiyChangedError";
	/** この段ボールには在庫がありません。 */
	public static final String HANDY_CARDBOARD_ZERO_CAPACITY_ERROR = "handyCardboardZeroCapacityError";
	/** ケース/カートンのいずれかに数値を入力してください。 */
	public static final String HANDY_CASE_CARTON_NOT_INPUT_ERROR = "handyCaseCartonNotInputError";
	/** ケース、カートン、個装のいずれかに数値を入力してください。 */
	public static final String HANDY_CASE_CARTON_UNIT_PACKAGING_NOT_INPUT_ERROR = "handyCaseCartonUnitPackagingNotInputError";
	/** 先に端数のケースを読込んでください。 */
	public static final String HANDY_CASE_IN_PALLET_INPUT_OTHER_FULL_CASE_ERROR = "handyCaseInPalletInputOtherFullCaseError";
	/** 選択中デザイン区分と異なります。 */
	public static final String HANDY_DESIGN_CD_DIFFERENT_SELECT_DESIGN_CD_ERROR = "handyDesignCdDifferentSelectDesignCdError";
	/** 先頭ケースが移動されました　再度先頭ケースの入力を行ってください。 */
	public static final String HANDY_HEADCASE_MOVED_ERROR = "handyHeadcaseMovedError";
	/** 先頭ケースのカートン数量が変更されました　再度先頭ケースの入力を行ってください。 */
	public static final String HANDY_HEADCASE_QUANTITY_CHANGED_ERROR = "handyHeadcaseQuantityChangedError";
	/** この製品は入庫前製品のため、仕分ラックに補充できません。 */
	public static final String HANDY_INPUT_CASE_BEFORE_RECEIPT_ERROR = "handyInputCaseBeforeReceiptError";
	/** この製品は仕分ラックに補充されていません。 */
	public static final String HANDY_INPUT_CASE_NOT_REPLENISHED_ERROR = "handyInputCaseNotReplenishedError";
	/** この製品は仕分場にないため、仕分ラックに補充できません。 */
	public static final String HANDY_INPUT_CASE_NOT_SORTING_PLACE_ERROR = "handyInputCaseNotSortingPlaceError";
	/** この製品は引取場受入登録されているため、仕分ラックに補充できません。 */
	public static final String HANDY_INPUT_CASE_PICKEDUP_ERROR = "handyInputCasePickedupError";
	/** この製品は仕分ラックに補充済です。 */
	public static final String HANDY_INPUT_CASE_REPLENISHED_ERROR = "handyInputCaseReplenishedError";
	/** この製品はこのロケに補充できません。 */
	public static final String HANDY_INPUT_CASE_UNABLE_TO_REPLENISH_LOCATION_ERROR = "handyInputCaseUnableToReplenishLocationError";
	/** この製品はこのロケに補充されたケースではありません。 */
	public static final String HANDY_INPUT_CASE_UNABLE_TO_REPLENISH_PRODUCT_IN_LOCATION_ERROR = "handyInputCaseUnableToReplenishProductInLocationError";
	/** この２次元バーコードのケース内には製品が存在しません。 */
	public static final String HANDY_INPUT_CASE_ZERO_CAPACITY_ERROR = "handyInputCaseZeroCapacityError";
	/** 残数量が先頭ケースのカートン数を超えています。 */
	public static final String HANDY_INPUT_NUMBER_EXCEEDS_STOCK_ERROR = "handyInputNumberExceedsStockError";
	/** 入力桁数が不正です。 */
	public static final String HANDY_INPUT_NUMBER_LENGTH_ERROR = "handyInputNumberLengthError";
	/** 移動数量が在庫を超えています。 */
	public static final String HANDY_INPUT_QTY_STOCK_QTY_OVER_ERROR = "handyInputQtyStockQtyOverError";
	/** ロケにこのケースは存在しません。 */
	public static final String HANDY_INPUT_SYMBOL_IN_LOCATIONC_NOT_FOUND_ERROR = "handyInputSymbolInLocationcNotFoundError";
	/** 在庫調査数にはケーススキャン数以上の数を入力して下さい。 */
	public static final String HANDY_INVENTORY_ADOPT_CASE_QTY_LIMIT_ERROR = "handyInventoryAdoptCaseQtyLimitError";
	/** このロケに在庫がありません。 */
	public static final String HANDYLOCATION_CD_STOCK_NOT_FOUND_ERROR = "handylocationCdStockNotFoundError";
	/** 選択中ロケと異なります。 */
	public static final String HANDY_LOCATION_DIFFERENT_SELECT_LOCATION_ERROR = "handyLocationDifferentSelectLocationError";
	/** 選択中ロットと異なります。 */
	public static final String HANDY_LOT_DIFFERENT_SELECT_LOT_ERROR = "handyLotDifferentSelectLotError";
	/** メーカーケースコードのバーコードをスキャンしてください。 */
	public static final String HANDY_NOT_MANUFACTURER_CASE_CODE_ERROR = "handyNotManufacturerCaseCodeError";
	/** このパレットには移動可能な段ボールが存在しません。 */
	public static final String HANDY_PALLET_CARDBOARD_EMPTY_ERROR = "handyPalletCardboardEmptyError";
	/** パレット、ケース、カートン、個装のいずれかに数値を入力してください。 */
	public static final String HANDY_PALLET_CASE_CARTON_UNIT_PACKAGING_NOT_INPUT_ERROR = "handyPalletCaseCartonUnitPackagingNotInputError";
	/** 選択中パレットはり紙と異なります。 */
	public static final String HANDY_PALLET_DIFFERENT_SELECT_PALLET_ERROR = "handyPalletDifferentSelectPalletError";
	/** パレットはり紙のロットに変更があります。 */
	public static final String HANDY_PALLET_LOT_CHANGED_ERROR = "handyPalletLotChangedError";
	/** このパレットはり紙に紐付いている段ボール情報はありません。 */
	public static final String HANDY_PALLET_NOT_RELATED_TO_CARDBOARD_ERROR = "handyPalletNotRelatedToCardboardError";
	/** このパレットはり紙には在庫がありません */
	public static final String HANDY_PALLET_OUT_OF_STOCK_ERROR = "handyPalletOutOfStockError";
	/** パレットはり紙の在庫数量に変更があります。 */
	public static final String HANDY_PALLET_STOCK_CHANGED_ERROR = "handyPalletStockChangedError";
	/** このパレットはり紙には在庫がありません。 */
	public static final String HANDY_PALLET_ZERO_CAPACITY_ERROR = "handyPalletZeroCapacityError";
	/** 入力製品情報を入力してください。 */
	public static final String HANDYPRODUCT_CD_NOT_INPUT_ERROR = "handyproductCdNotInputError";
	/** 選択中銘柄と異なります。 */
	public static final String HANDY_PRODUCT_DIFFERENT_SELECT_PRODUCT_ERROR = "handyProductDifferentSelectProductError";
	/** この製品情報、ロケに在庫がありません。 */
	public static final String HANDY_PRODUCT_INFO_ANDLOCATION_CD_STOCK_NOT_FOUND_ERROR = "handyProductInfoAndlocationCdStockNotFoundError";
	/** この製品情報は存在しません。 */
	public static final String HANDY_PRODUCT_INFO_NOT_FOUND_ERROR = "handyProductInfoNotFoundError";
	/** この製品情報の在庫がありません。 */
	public static final String HANDY_PRODUCT_INFO_STOCK_NOT_FOUND_ERROR = "handyProductInfoStockNotFoundError";
	/** 入力された銘柄は指示リスト内に存在しません。 */
	public static final String HANDY_PRODUCT_INST_LIST_NOT_FOUND_ERROR = "handyProductInstListNotFoundError";
	/** 製造年月が一致していません。 */
	public static final String HANDY_READ_MANUFACTURE_DATE_UNMATCH_ERROR = "handyReadManufactureDateUnmatchError";
	/** 銘柄が一致していません。 */
	public static final String HANDY_READ_PRODUCT_UNMATCH_ERROR = "handyReadProductUnmatchError";
	/** 補充ケースのカートン数量が変更されました 再度補充するケースの入力を行ってください。 */
	public static final String HANDY_REPLENISH_CASE_QUANTIY_CHANGED_ERROR = "handyReplenishCaseQuantiyChangedError";
	/** ロケが存在しません。 */
	public static final String HANDY_REPLENISH_LOCATION_NOT_FOUND_ERROR = "handyReplenishLocationNotFoundError";
	/** ロケが存在しないか、仕分場以外のロケを読んでいる可能性があります。 */
	public static final String HANDY_SORTING_PLACE_LOCATION_NOT_FOUND_ERROR = "handySortingPlaceLocationNotFoundError";
	/** ケース、カートン、個装の合計が1ケース当りカートン数を超過しています。 */
	public static final String HANDY_SUM_CASE_CARTON_UNIT_PACKAGING_OVER_LIMIT_ERROR = "handySumCaseCartonUnitPackagingOverLimitError";
	/** パレットはり紙と段ボールのパレット管理番号が違います。 */
	public static final String HANDY_SYMBOL_DIFFERENT_PALLET_ERROR = "handySymbolDifferentPalletError";
	/** 検査済正常品用のシンボルは貼付できません。 */
	public static final String HANDY_TESTED_SYMBOL_PASTED_ERROR = "handyTestedSymbolPastedError";
	/** 日付の入力が不正です(形式:YYMMDD)。 */
	public static final String HANDY_T_S_N_DATE_ERROR = "handyTSNDateError";
	/** 拠点関連マスタが停止しています。 */
	public static final String HANDY_WAREHOUSE_STRCT_STOPED_ERROR = "handyWarehouseStrctStopedError";
	/** 在庫実績が取り込まれていません。 */
	public static final String HOZEI_HANBAI_PRODUCT_UNRECEIVED_ERROR = "hozeiHanbaiProductUnreceivedError";
	/** 対応ブロック1～3対応ブロックには異なる値を入力してください。 */
	public static final String IDENTICAL_LINEBLOCK_CD_DUPLICATION_ERROR = "identicalLineblockCdDuplicationError";
	/** 輸入製品で設定することができないデザイン区分が設定されています。 */
	public static final String IMPORTED_PRODUCT_REARRANGEMENT_TYPE_DESIGN_ERROR = "importedProductRearrangementTypeDesignError";
	/** 輸入銘柄は登録できません。 */
	public static final String IMPORT_PRODUCT_CD_MF_RCV_DESIGN_CANNOT_REGISTER_ERROR = "importProductCdMfRcvDesignCannotRegisterError";
	/** 受入通知情報(国産)処理を開始しました。 */
	public static final String INCOMING_DOMESTIC_PROCESS_EXECUTE_START_INFORMATION = "incomingDomesticProcessExecuteStartInformation";
	/** 受入通知情報(輸入)処理を開始しました。 */
	public static final String INCOMING_IMPORT_PROCESS_EXECUTE_START_INFORMATION = "incomingImportProcessExecuteStartInformation";
	/** 適用開始日に不正な日付が入力されています。 */
	public static final String INCORRECT_START_APPLY_DATE_INPUT_ERROR = "incorrectStartApplyDateInputError";
	/** 不良品数量 + 検査対象外数量が、検査予定数量を超えています。 */
	public static final String INFERIOR_QTY_AND_NOT_EXAM_QTY_OVER_EXAM_QTY_ERROR = "inferiorQtyAndNotExamQtyOverExamQtyError";
	/** 不良品数量は1カートン当個数の単位で入力してください。 */
	public static final String INFERIOR_QTY_NOT_CARTON_QTY_ERROR = "inferiorQtyNotCartonQtyError";
	/** 入力したカートン数量が指示数量を超えています。 */
	public static final String INPUT_CARTON_EXCEEDED_INST_ERROR = "inputCartonExceededInstError";
	/** 取出数量が先頭ケースのカートン数を超えています。 */
	public static final String INPUT_CARTON_EXCEEDS_STOCK_ERROR = "inputCartonExceedsStockError";
	/** カートン数量がケース入り数を超えています */
	public static final String INPUT_COUNT_EXCEEDS_CASE_ERROR = "inputCountExceedsCaseError";
	/** 入力されたデザイン区分は本社指示情報と違います。 */
	public static final String INPUT_DESIGN_CD_NOT_INST_ERROR = "inputDesignCdNotInstError";
	/** 入力形式が不正です。 */
	public static final String INPUT_FORMAT_ERROR = "inputFormatError";
	/** Fromの値がToの値を超えています。 */
	public static final String INPUT_LIMIT_CHECK_DIRECTION_REVERSAL_ERROR = "inputLimitCheckDirectionReversalError";
	/** 入力された製造年月日は本社指示情報と違います。 */
	public static final String INPUT_MANUFACTURE_DATE_NOT_INST_ERROR = "inputManufactureDateNotInstError";
	/** カートン数量がケースの残数を超えています。 */
	public static final String INPUT_NUM_OVER_CASE_REMAINING_NUM = "inputNumOverCaseRemainingNum";
	/** 入力された残数量とパレットの残在庫数量が不一致です。 */
	public static final String INPUT_PALLET_REMAINING_DIFFERENT_PALLET_REMAINING = "inputPalletRemainingDifferentPalletRemaining";
	/** 入力した２次元バーコードと仕分ラベルの銘柄が不一致です。 */
	public static final String INPUT_PRODUCT_CD_DIFFERENTSORTING_LABEL_PRODUCT_CD = "inputProductCdDifferentsortingLabelProductCd";
	/** 入力された製品情報は本社指示情報と違います。 */
	public static final String INPUT_PRODUCT_CD_NOT_INST_ERROR = "inputProductCdNotInstError";
	/** 入力した数量は1ケース当カートン数を超えています。 */
	public static final String INPUT_QTY_CARTONPERCASE_OVER_ERROR = "inputQtyCartonpercaseOverError";
	/** 入力した数量は検査予定数量を超えています。 */
	public static final String INPUT_QTY_TESTED_QTY_OVER_ERROR = "inputQtyTestedQtyOverError";
	/** 実績数量が指示数量に達しています。 */
	public static final String INPUT_QUANTITY_EXCEEDED_INST_ERROR = "inputQuantityExceededInstError";
	/** 入力された数量は段ボールに存在しているカートン数を超えています。 */
	public static final String INPUT_QUANTITY_OVERCARTON_QUANTITY_ERROR = "inputQuantityOvercartonQuantityError";
	/** 登録件数：[{0}登録]{1}件 */
	public static final String INPUT_RECORD_INFORMATION = "inputRecordInformation";
	/** 入力された残数量とパレットの残在庫数量が違います。 */
	public static final String INPUT_REMAINING_NUM_DIFFERENT_PALLET_REMAINING_NUM_ERROR = "inputRemainingNumDifferentPalletRemainingNumError";
	/** 入力された残数量とパレットの残在庫数量が違います */
	public static final String INPUT_REMAINING_QTY_UNMATCHED_ERROR = "inputRemainingQtyUnmatchedError";
	/** JAN/ITF/UPCが不正です。 */
	public static final String INPUT_RESTRICTIONS_JAN_ITF_UPC_ERROR = "inputRestrictionsJanItfUpcError";
	/** 「製品情報」または「入庫予定日」を入力してください。 */
	public static final String INPUT_RESTRICTIONS_PRODUCT_RECEIVE_PLAN_ERROR = "inputRestrictionsProductReceivePlanError";
	/** 引当順と異なる数量入力をしています。上方にある行の残数量を正しく入力して下さい。 */
	public static final String INPUT_SR_QTY_ALLOC_NUMBER_NOT_SELECT_ERROR = "inputSrQtyAllocNumberNotSelectError";
	/** 登録件数：[販売物流在庫情報登録][0]件 */
	public static final String INPUT_TR_HANBAI_INV_INFORMATION = "inputTrHanbaiInvInformation";
	/** 更新件数：[{0}更新]{1}件 */
	public static final String INPUT_UPDATE_RECORD_INFORMATION = "inputUpdateRecordInformation";
	/** 入力された棚出数量は指示数量を上回っています */
	public static final String INPUT_VOLUME_IS_EXCEEDS_INSTRUCTIONS_ERROR = "inputVolumeIsExceedsInstructionsError";
	/** 棚出数量はパレット残在庫数量を上回っています */
	public static final String INPUT_VOLUME_IS_EXCEEDS_PALLET_STOCK_ERROR = "inputVolumeIsExceedsPalletStockError";
	/** 仕分が完了した方面より上側に割込することはできません。 */
	public static final String INSERT_INST_DATA_ABOVE_COMPLETED_DIRECTION_ERROR = "insertInstDataAboveCompletedDirectionError";
	/** 検品ケース数がパレットはり紙のケース数を超過しています。 */
	public static final String INSPECTION_CASE_EXCEEDS_PALLET_PAPER_CASE_ERROR = "inspectionCaseExceedsPalletPaperCaseError";
	/** 実績数量が予定数量を超過しています */
	public static final String INSPECTION_EXCEEDS_SCHEDULE_COUNT_ERROR = "inspectionExceedsScheduleCountError";
	/** このパレットはり紙のはり紙検品は完了しています。 */
	public static final String INSPECTION_PALLET_COMPLETED_ERROR = "inspectionPalletCompletedError";
	/** 予定数量と検品数量が一致していません。 */
	public static final String INSPECTION_QTY_AND_SCHEDULE_QTYU_UMATCH_ERROR = "inspectionQtyAndScheduleQtyuUmatchError";
	/** 入力ケースのカートン数量が、ケースあたりカートン数を満たしていません。 */
	public static final String INSPECTION_QTY_NOT_CARTON_PER_CASE_QTY_ERROR = "inspectionQtyNotCartonPerCaseQtyError";
	/** 実績数量がパレット明細(端数)数量を満たしていません */
	public static final String INSPECTION_QTY_NOT_REACHED_PALLET_DTL_QTY_ERROR = "inspectionQtyNotReachedPalletDtlQtyError";
	/** 入力されたカートン単位製品の数量が移動数量を超えています。 */
	public static final String INSPECTION_QTY_NOT_SYMBOL_PALLETE_QTY_ERROR = "inspectionQtyNotSymbolPalleteQtyError";
	/** 予期せぬエラーが発生しました。 */
	public static final String INSPECT_NUM_OVER_STOCK_NUM = "inspectNumOverStockNum";
	/** 検査場の段ボールはロット属性変更できません */
	public static final String INSPECT_PLACE_CANNOT_CHANGE_ATTRIBUTES_ERROR = "inspectPlaceCannotChangeAttributesError";
	/** 1件以上のさしずの仕分順が変更されています。該当のさしずの割付が解除されますがよろしいですか？ */
	public static final String INST_DATA_ASSIGNED_ORDER_CHANGED_WARN = "instDataAssignedOrderChangedWarn";
	/** 1件以上のさしずが割付されています。今回のさしずの割付が解除されますがよろしいですか？ */
	public static final String INST_DATA_ASSIGNED_WARN = "instDataAssignedWarn";
	/** ラインに今回指示分のさしずが割付けられておりません。さしず割付後、更新してください。 */
	public static final String INST_DATA_NOT_ASSIGNED_ERROR = "instDataNotAssignedError";
	/** 在庫調査区分'不適品'以外は発行できません。 */
	public static final String INST_KEY_LIST_INVENTORY_INST_KBN_SELECT_SUITABLE_ERROR = "instKeyListInventoryInstKbnSelectSuitableError";
	/** 在庫調査区分'不適品'は遷移できません。 */
	public static final String INST_KEY_LIST_INVENTORY_INST_KBN_SELECT_UNSUITABLE_ERROR = "instKeyListInventoryInstKbnSelectUnsuitableError";
	/** 入力されたライン、ブロックの在庫調査指示キーではありません。 */
	public static final String INST_LIST_LINE_BLOCK_DIFFERENT_ERROR = "instListLineBlockDifferentError";
	/** 在庫調査指示キーが存在しません。 */
	public static final String INST_LIST_NOT_FOUND_ERROR = "instListNotFoundError";
	/** 本日作成した在庫調査指示キーを入力してください。 */
	public static final String INST_LIST_NOT_PROCESSING_DATE_ERROR = "instListNotProcessingDateError";
	/** 通常品でカートン入数が51以上の銘柄のさしずを含むデータが存在します。 */
	public static final String INST_NORMAL_PRODUCT_DATA_OVER_FIFTY_ONE_CARTON_ERROR = "instNormalProductDataOverFiftyOneCartonError";
	/** 配達日に有効でない銘柄のさしずを含むデータが存在します。 */
	public static final String INST_PRODUCT_DATA_NOT_AVAILABLE_IN_DELIVERY_DATE_ERROR = "instProductDataNotAvailableInDeliveryDateError";
	/** 容積が0である銘柄のさしずを含む方面が存在します。 */
	public static final String INST_PRODUCT_DATA_VOLUME_ZERO_ERROR = "instProductDataVolumeZeroError";
	/** 箱割は正常に終了しましたが、不正な銘柄を含む方面が存在するため、本社に確認してください。対象の方面に対する仕分一連処理はスキップされました。 */
	public static final String INST_PRODUCT_UNAVAILABLE_WARN = "instProductUnavailableWarn";
	/** 指示数量は実績数量以上の値を入力して下さい。 */
	public static final String INST_QUANTITY_LESS_THAN_ACTUAL_QUANTITY_ERROR = "instQuantityLessThanActualQuantityError";
	/** 指示ロケが複数存在します。 */
	public static final String INSTRUCTION_LOCATION_MULTIPLE_EXISTENCE_ERROR = "instructionLocationMultipleExistenceError";
	/** 仕分場在庫調査（製造年月日調査）が完了していないか、在庫照合が実行されていません。 */
	public static final String INVENTORY_DATE_UNMATCH_ERROR = "inventoryDateUnmatchError";
	/** 在庫調査が完了していません。 */
	public static final String INVENTORY_INSPECTION_NOT_COMPLETE_ERROR = "inventoryInspectionNotCompleteError";
	/** 方面ピストン(手入力)か方面ピストン(選択)のどちらかを入力してください。 */
	public static final String INVENTORY_SORTING_WORK_C_D_NOT_INPUT_ERROR = "inventorySortingWorkCDNotInputError";
	/** 同一P/LNo.内に単品／端数区分違い又は複数の単品明細が存在します。 */
	public static final String KBN_UNMATCH_OR_MULTIPLE_SINGLE_ITEM_EXIST_ERROR = "kbnUnmatchOrMultipleSingleItemExistError";
	/** ラインまたはブロックのどちらか一方を入力してください。 */
	public static final String LINE_AND_BLOCK_COMBO_BOX_SELECT_ERROR = "lineAndBlockComboBoxSelectError";
	/** ラインとブロックの明細が選択されています。 */
	public static final String LINE_AND_BLOCK_ERROR = "lineAndBlockError";
	/** ライン、ブロックのどちらにも入力されています。 */
	public static final String LINE_BLOCK_BOTH_INPUT_ERROR = "lineBlockBothInputError";
	/** ライン「{0}」と対応ブロック「{1}」で銘柄コードが重複しています。 */
	public static final String LINE_BLOCK_LOCATION_PRODUCT_CODE_DUPLICATE_ERROR = "lineBlockLocationProductCodeDuplicateError";
	/** 入力されたライン、ブロックの在庫調査指示キーが作成されていません。 */
	public static final String LINE_BLOCK_NOT_FOUND_ERROR = "lineBlockNotFoundError";
	/** ライン、ブロックが共に未入力です。 */
	public static final String LINE_BLOCK_NOT_INPUT_ERROR = "lineBlockNotInputError";
	/** 方面ピストン(手入力)が不正です。 */
	public static final String INVENTORY_SORTING_WORK_C_D_FORMAT_ERROR = "inventorySortingWorkCDFormatError";
	/** 紐づいているラインとブロックで同じ銘柄で設定されています。 */
	public static final String LINE_BLOCK_SAME_PRODUCT_ERROR = "lineBlockSameProductError";
	/** 1桁目にL以外が入力されています。 */
	public static final String LINE_CD_L_ERROR = "lineCdLError";
	/** ラインが変更されていません。 */
	public static final String LINE_NOT_CHANGED_ERROR = "lineNotChangedError";
	/** 例外的な帳票区分が入力されました。 */
	public static final String LIST_TYPE_EXCEPTION_ERROR = "listTypeExceptionError";
	/** 同じロケを入力しています。 */
	public static final String LOCATION_CD_LEFT_AND_RIGHT_DUPLICATE_ERROR = "locationCdLeftAndRightDuplicateError";
	/** 同じライン/ブロックを選択してください。 */
	public static final String LOCATION_CD_LEFT_AND_RIGHT_LINE_BLOCK_NOT_SAME_ERROR = "locationCdLeftAndRightLineBlockNotSameError";
	/** ロケーションCD(左)は明細部に存在しません。 */
	public static final String LOCATION_CD_LEFT_IN_DETAIL_NOT_FOUND_ERROR = "locationCdLeftInDetailNotFoundError";
	/** このロケは棚出リストに存在しません */
	public static final String LOCATION_CD_NOT_FOUND_ERROR_IN_ORDER_INFO = "locationCdNotFoundErrorInOrderInfo";
	/** ロケーションCD(右)は明細部に存在しません。 */
	public static final String LOCATION_CD_RIGHT_IN_DETAIL_NOT_FOUND_ERROR = "locationCdRightInDetailNotFoundError";
	/** ロケーションCDが異なるパレットは、同時に移動できません 。 */
	public static final String LOCATION_DIFFERENT_PALLET_ERROR = "locationDifferentPalletError";
	/** 入力されたロケは指示リスト内に存在しません。 */
	public static final String LOCATION_INST_LIST_NOT_FOUND_ERROR = "locationInstListNotFoundError";
	/** ロケーション区分が存在しません。 */
	public static final String LOCATION_KBN_NOT_FOUND_ERROR = "locationKbnNotFoundError";
	/** 入力されたロケに銘柄が設定されていません。 */
	public static final String LOCATION_NO_PRODUCT_ERROR = "locationNoProductError";
	/** 棚出対象のロットは指定されたロケに存在しません */
	public static final String LOCATION_NOT_FOUND_IN_TARGET_LOT_ERROR = "locationNotFoundInTargetLotError";
	/** ロケが「保管場」でないため、カートン詰合せできません。 */
	public static final String LOCATION_NOT_WARE_HOUSE_AND_SORTING_PLACE_ERROR = "locationNotWareHouseAndSortingPlaceError";
	/** この引当ロケの山出しは終了しています。 */
	public static final String LOCATION_TRANSFER_END_ERROR = "locationTransferEndError";
	/** このロケは山出しリストに存在しません。 */
	public static final String LOCATION_TRANSFER_LIST_NOT_FOUND_ERROR = "locationTransferListNotFoundError";
	/** 固定ロケのため銘柄CDの入力が必要です。 */
	public static final String LOCATION_TYPE_FIXED_LOCATION_PRODUCT_CD_ERROR = "locationTypeFixedLocationProductCdError";
	/** 論理ロケは修正、複製できません。 */
	public static final String LOGIC_LOCATION_FLAG_ERROR = "logicLocationFlagError";
	/** ロットが異なるためカートン詰合せできません。 */
	public static final String LOT_DIFFERENT_ERROR = "lotDifferentError";
	/** 製造年月日・デザイン区分が異なるパレットは、同時に移動できません 。 */
	public static final String LOT_DIFFERENT_PALLET_ERROR = "lotDifferentPalletError";
	/** 同じ製造年月日、デザイン区分のロットが複数存在します。本社に連絡して下さい。 */
	public static final String LOT_DUPLICATION_ERROR = "lotDuplicationError";
	/** このロットは検品対象のロットと一致しません。 */
	public static final String LOT_MISMATCH_ERROR = "lotMismatchError";
	/** 製造年月日の日付には'01'を入力してください。 */
	public static final String MADE_DATE_EXCEPTION_ERROR = "MadeDateExceptionError";
	/** 読み込んだメーカーケースコードをPMメーカーケースコードのフォーマットに変換できません。 */
	public static final String MAKER_CASE_CD_FORMAT_ERROR = "makerCaseCdFormatError";
	/** 製造年月日が正しく入力されていません。 */
	public static final String MANUFACTURE_DATE_ERROR = "manufactureDateError";
	/** 製造年月日に値がありません。 */
	public static final String MANUFACTURE_DATE_NOT_INPUT_ERROR = "manufactureDateNotInputError";
	/** 製造年月日は未来日です。 */
	public static final String MANUFACTURE_FUTURE_DATE_ERROR = "manufactureFutureDateError";
	/** 適品の場合、保管場、仕分場、引取場を選択してください。 */
	public static final String MANYFEWOCCUR_AREA_SELECT_SUITABLE_ERROR = "manyfewoccurAreaSelectSuitableError";
	/** 不適品の場合、国税還付品、返品場を選択してください。 */
	public static final String MANYFEWOCCUR_AREA_SELECT_UNSUITABLE_ERROR = "manyfewoccurAreaSelectUnsuitableError";
	/** [0]は[1]桁以上[2]桁以下で入力してください。 */
	public static final String MINMAX_LENGTH_ERROR = "minmaxLengthError";
	/** 不足本数が、不正です。 */
	public static final String MISSING_QTY_INVALID_ERROR = "missingQtyInvalidError";
	/** 指示No.内の銘柄に国産、輸入製品が混在しています。 */
	public static final String MIXED_DOMESTIC_PRODUCT_AND_IMPORTED_PRODUCT_IN_PLAN_NO_ERROR = "mixedDomesticProductAndImportedProductInPlanNoError";
	/** 指示No.内に異なる受入予定日が混在しています。 */
	public static final String MIXED_RECEIVE_PLAN_DATE_IN_PLAN_NO_ERROR = "mixedReceivePlanDateInPlanNoError";
	/** 指示No.内に異なる発送元CDが混在しています。 */
	public static final String MIXED_SHIPPING_FROM_COMPANY_CD_IN_PLAN_NO_ERROR = "mixedShippingFromCompanyCdInPlanNoError";
	/** 指示No.内に異なる発送予定日が混在しています。 */
	public static final String MIXED_SHIPPING_PLAN_DATE_IN_PLAN_NO_ERROR = "mixedShippingPlanDateInPlanNoError";
	/** 指示No.内に異なる発送先CDが混在しています。 */
	public static final String MIXED_SHIPPING_TO_COMPANY_CD_IN_PLAN_NO_ERROR = "mixedShippingToCompanyCdInPlanNoError";
	/** 移動元ロケと移動先ロケが同じです。 */
	public static final String MOVE_FROM_LOC_MOVE_TO_LOC_IDENTICAL_ERROR = "moveFromLocMoveToLocIdenticalError";
	/** 移動中在庫があるためロット属性変更できません。 */
	public static final String MOVE_STOCK_CANNOT_CHANGE_ATTRIBUTES_ERROR = "moveStockCannotChangeAttributesError";
	/** 移動中の在庫が存在するため、実行できません。 */
	public static final String MOVING_PRODUCT_ERROR = "movingProductError";
	/** 移動中在庫が存在しています。 */
	public static final String MOVING_STOCK_EXIST_ERROR = "movingStockExistError";
	/** 複数行選択しています。 */
	public static final String MULTIPLE_COPY_ROW_ERROR = "multipleCopyRowError";
	/** 更新されたデータがありません｡ */
	public static final String NO_CHANGE_SORTING_DATA = "noChangeSortingData";
	/** 指示が無い補充先への数量入力は出来ません。 */
	public static final String NO_DIRECTION_LINE_BLOCK_QTY_CANNOT_INPUT_ERROR = "noDirectionLineBlockQtyCannotInputError";
	/** 棚出可能なカートンがありません */
	public static final String NO_ORDER_PICKING_CARTON_ERROR = "noOrderPickingCartonError";
	/** 正段ボールではありません。 */
	public static final String NO_REGULAR_CARDBOARD_ERROR = "noRegularCardboardError";
	/** 輸送番号内の他のパレットはり紙がすべて出力されていないため、はり紙検品できません。 */
	public static final String NOT_ALL_PALLET_TRANSPORT_NUMBER_PRINTED_ERROR = "notAllPalletTransportNumberPrintedError";
	/** 入庫完了していない段ボールが存在するため、ロット属性変更できません。 */
	public static final String NOT_COMPLETING_RECEIVE_CARDBOARD_INFORMATION_ERROR = "NotCompletingReceiveCardboardInformationError";
	/** 山出し指示数量が未調整です。山出し指示数量調整処理を行って下さい。 */
	public static final String NOT_DO_STOCK_TRANSFER_QTY_ADJUSTMENT_ERROR = "notDoStockTransferQtyAdjustmentError";
	/** 検査対象外数量は1カートン当個数の単位で入力してください。 */
	public static final String NOT_EXAM_QTY_NOT_CARTON_QTY_ERROR = "notExamQtyNotCartonQtyError";
	/** 修正対象でないロケーションが選択されています。 */
	public static final String NOT_FIXED_LOCATION_SELECTED_ERROR = "notFixedLocationSelectedError";
	/** 輸送通知情報(国産)処理を開始しました。 */
	public static final String NOTIFICATION_DOMESTIC_PROCESS_EXECUTE_START_INFORMATION = "notificationDomesticProcessExecuteStartInformation";
	/** 輸送通知情報(輸入)処理を開始しました。 */
	public static final String NOTIFICATION_IMPORT_PROCESS_EXECUTE_START_INFORMATION = "notificationImportProcessExecuteStartInformation";
	/** 使用中でない補充先が選択されているため引当できません。 */
	public static final String NOT_LINE_USER_FLG_NO_ALLOC_ERROR = "notLineUserFlgNoAllocError";
	/** パレット明細のバーコードをスキャンしてください */
	public static final String NOT_PALLET_DETAILS_BARCODE_ERROR = "notPalletDetailsBarcodeError";
	/** パレットはり紙のバーコードをスキャンしてください */
	public static final String NOT_PALLETE_BARCODE_ERROR = "notPalleteBarcodeError";
	/** 抽出対象外の曜日が設定されたため異常終了します。 */
	public static final String NOT_TEXTRACTION_DAY_ERROR = "notTextractionDayError";
	/** 拠点採番マスタに存在しません。 */
	public static final String NUMBERING_CENTER_NOT_FOUND_ERROR = "numberingCenterNotFoundError";
	/** 数値型以外がセットされています。 */
	public static final String NUMERIC_TYPE_EXCEPT_ERROR = "numericTypeExceptError";
	/** 項目数が不正です。 */
	public static final String NUM_OF_ITEMS_INCORRECT_ERROR = "numOfItemsIncorrectError";
	/** ライン（ブロック）／ラックが重複して選択されているため引当できません。 */
	public static final String ONLY_ONE_LINE_BLOCK_SELECT_ERROR = "onlyOneLineBlockSelectError";
	/** 補充区分（当日／事前／ケース）が混在して選択されているため、引当できません。 */
	public static final String ONLY_ONE_ORDER_TYPE_SELECT_ERROR = "onlyOneOrderTypeSelectError";
	/** 未開封の正段ボールをスキャンしてください。 */
	public static final String OPENED_CASE_INPUT_ERROR = "openedCaseInputError";
	/** この受注番号は未引当のため作業できません。 */
	public static final String ORDER_INFO_CANNOT_TASK_NOT_RESERVATION_ERROR = "orderInfoCannotTaskNotReservationError";
	/** 該当する受注情報が存在しません。 */
	public static final String ORDER_INFO_NOT_FOUND_ERROR = "orderInfoNotFoundError";
	/** この受注番号は仕分確定されているため、作業できません。 */
	public static final String ORDER_INFO_SORTING_CONFIRM_ERROR = "orderInfoSortingConfirmError";
	/** 受注番号が重複しています。 */
	public static final String ORDER_NUMBER_DUPLICATE_ERROR = "orderNumberDuplicateError";
	/** この受注番号は既に仕分検品済です。 */
	public static final String ORDER_NUMBER_SHIPPING_PLAN_CREATED_ERROR = "orderNumberShippingPlanCreatedError";
	/** 確定処理済の出庫伝票番号が存在します。 */
	public static final String ORDER_NUMBER_STATUS_ERROR = "orderNumberStatusError";
	/** この棚出検品は完了しています */
	public static final String ORDER_PICKING_COMPLETED_ERROR = "orderPickingCompletedError";
	/** この棚出は他の作業者が検品中です */
	public static final String ORDER_PICKING_DURING_INSPECTION_ERROR = "orderPickingDuringInspectionError";
	/** スキャンした棚出リストキーは存在しません */
	public static final String ORDER_PICKING_KEY_NOT_FOUND_ERROR = "orderPickingKeyNotFoundError";
	/** このロットは棚出対象ではありません */
	public static final String ORDER_PICKING_NOT_ELIGIBLE_ERROR = "orderPickingNotEligibleError";
	/** 棚出検品が未実施です。 */
	public static final String ORDER_PICKING_NOT_IMPLEMENTED_ERROR = "orderPickingNotImplementedError";
	/** 箱割は正常に終了しましたが、1000箱以上となった方面が存在します。対象の方面に対する仕分一連処理はスキップされました。 */
	public static final String ORDER_SPLIT_BOX_OVER_THOUSAND_WARN = "orderSplitBoxOverThousandWarn";
	/** オーダー分割区分が入力範囲を超えています。 */
	public static final String ORDER_SPLIT_CLASS_EXCEPT_ERROR = "orderSplitClassExceptError";
	/** 他の作業者が検品中です。 */
	public static final String OTHER_USER_INSPECTION_ERROR = "otherUserInspectionError";
	/** 出力件数：[オーダー分割結果データ(配達管理)]{0}件 */
	public static final String OUTPUT_ORDER_SPLIT_DATA_DELIVERY_INFORMATION = "outputOrderSplitDataDeliveryInformation";
	/** 出力件数：[オーダー分割結果データ(販売物流)][0]件 */
	public static final String OUTPUT_ORDER_SPLIT_DATA_SALES_INFORMATION = "outputOrderSplitDataSalesInformation";
	/** 出力件数：[銘柄情報][0]件 */
	public static final String OUTPUT_PRODUCT_INFORMATION = "outputProductInformation";
	/** 出力件数：[入庫実績送信(販物)(国産)]{0}件 */
	public static final String OUTPUT_RECEIVE_DOMESTIC_RECORD_INFORMATION = "outputReceiveDomesticRecordInformation";
	/** 出力件数：[入庫実績送信(販物)(輸入)]{0}件 */
	public static final String OUTPUT_RECEIVE_IMPORT_RECORD_INFORMATION = "outputReceiveImportRecordInformation";
	/** 出力件数：[[0]][1]件 */
	public static final String OUTPUT_RECORD_INFORMATION = "outputRecordInformation";
	/** 出力件数：[入庫作業情報][0]件 */
	public static final String OUTPUT_RECORD_RECEIPT_INFORMATION = "outputRecordReceiptInformation";
	/** ケース単位出庫の予定数量を超えています。 */
	public static final String OVER_SHIPPING_BY_CASE_PLAN_NUM_INPUT_ERROR = "overShippingByCasePlanNumInputError";
	/** 商社搬入番号に値がありません。 */
	public static final String OWNER_ORDER_NO_NOT_INPUT_ERROR = "ownerOrderNoNotInputError";
	/** スキャンした出庫予定の出庫場受入検品は完了しています。 */
	public static final String PALETTE_DETAIL_COMPLETION_SHIPPING_PLACE_RECEIVING_STATUS_ERROR = "paletteDetailCompletionShippingPlaceReceivingStatusError";
	/** 確認済の情報があるため、前画面に遷移できません。 */
	public static final String PALETTE_DETAILCONFIRMING_INFO_ERROR = "paletteDetailconfirmingInfoError";
	/** スキャンしたパレット明細は棚出検品（単品）または仕分検品が完了していません。 */
	public static final String PALETTE_DETAIL_NO_SHELVING_STATUS_ERROR = "paletteDetailNoShelvingStatusError";
	/** このパレット明細は無効です。 */
	public static final String PALETTE_DETAIL_NOT_FOUND_ERROR = "paletteDetailNotFoundError";
	/** このパレットはり紙は引当禁止のため、移動できません。 */
	public static final String PALLET_ALLOCATION_PROHIBITING_ERROR = "palletAllocationProhibitingError";
	/** このパレットはり紙は格納済みです。 */
	public static final String PALLET_ALREADY_STORED_ERROR = "palletAlreadyStoredError";
	/** パレットはり紙とパレット明細のロケコードが異なります */
	public static final String PALLET_AND_PALLET_DETAILS_UNMATCHED_ERROR = "palletAndPalletDetailsUnmatchedError";
	/** このパレットはり紙ははり紙検品前です。 */
	public static final String PALLET_BEFORE_ACUPUNCTURE_PAPER_INSPECTION_ERROR = "palletBeforeAcupuncturePaperInspectionError";
	/** このパレットにはこれ以上段ボールを積載できません。 */
	public static final String PALLET_CANNOT_LADING_QTY_OVER_ERROR = "palletCannotLadingQtyOverError";
	/** このパレット明細は検品済です */
	public static final String PALLET_DETAILS_INSPECTED_COMPLETED_ERROR = "palletDetailsInspectedCompletedError";
	/** パレット明細(単品)が未入力です */
	public static final String PALLET_DETAILS_MISSING_ERROR = "palletDetailsMissingError";
	/** パレット／ケース／カートンのいずれかに数値を入力してください。 */
	public static final String PALLETE_CASE_CARTON_NOT_INPUT_ERROR = "palleteCaseCartonNotInputError";
	/** このパレット明細は無効です */
	public static final String PALLETE_DTL_NOT_FOUND_ERROR = "palleteDtlNotFoundError";
	/** スキャンしたパレットはり紙のロケが選択中ロケと異なります */
	public static final String PALLETE_LOCATION_UNMATCHED_ERROR = "palleteLocationUnmatchedError";
	/** このパレットはり紙は銘柄組替又はデザイン区分変更が行われたため移動できません　再度移動元ロケをスキャンしてください */
	public static final String PALLETE_PRODUCT_CHANGE_DESIGN_CHANGE_ERROR = "palleteProductChangeDesignChangeError";
	/** このパレットはり紙は格納済ではありません */
	public static final String PALLETE_STATUS_NOT_STORED_ERROR = "palleteStatusNotStoredError";
	/** このパレットの検品は完了しています。 */
	public static final String PALLET_INSPECTION_COMPLETED_ERROR = "palletInspectionCompletedError";
	/** 無効なパレットはり紙です。 */
	public static final String PALLET_INVALID_ERROR = "palletInvalidError";
	/** このパレットはり紙はケース検品を行うことができないため、はり紙検品を行って下さい。 */
	public static final String PALLETIZE_INSPECTION_CANNOT_CASE_INSPECTION_ERROR = "palletizeInspectionCannotCaseInspectionError";
	/** ロット情報入力でスキャンしたシンボルとロケが違います。 */
	public static final String PALLETIZE_MISMATCH_LOT_ERROR = "palletizeMismatchLotError";
	/** パレットあたり積付数を超過しています。 */
	public static final String PALLETIZE_OVER_PALLETE_QTY_ERROR = "palletizeOverPalleteQtyError";
	/** 別の操作によりパレットはり紙のロケが更新されています。 */
	public static final String PALLET_LOCATION_CHANGED_ERROR = "palletLocationChangedError";
	/** 仕分場、出庫場のロケには格納できません。 */
	public static final String PALLET_LOCATION_GROUP_ERROR = "palletLocationGroupError";
	/** このパレットは保管場のロケに存在しません。 */
	public static final String PALLET_LOCATION_NOT_STORAGE_ERROR = "palletLocationNotStorageError";
	/** このパレットはり紙のロケーションは引当ロケーションと一致しません。 */
	public static final String PALLET_LOC_DIFFERENT_RESERVE_LOC_ERROR = "palletLocDifferentReserveLocError";
	/** このパレットはり紙はロット属性変更が行われたため移動できません　再度移動元ロケをスキャンしてください。 */
	public static final String PALLET_LOT_ATTRIBUTE_CHANGE_ERROR = "palletLotAttributeChangeError";
	/** このロットは引当ロットと一致しません。 */
	public static final String PALLET_LOT_DIFFERENT_RESERVE_LOT_ERROR = "palletLotDifferentReserveLotError";
	/** ロット情報の異なるパレットは複数格納できません。 */
	public static final String PALLET_LOT_INFORMATION_UNMATCH_ERROR = "palletLotInformationUnmatchError";
	/** パレットはり紙と段ボールのロットが違います。 */
	public static final String PALLET_LOT_UNMATCH_SYMBOL_LOT_ERROR = "palletLotUnmatchSymbolLotError";
	/** 入力したパレット管理番号は存在しません。 */
	public static final String PALLET_MANAGEMENT_NUMBER_NOT_FOUND_ERROR = "palletManagementNumberNotFoundError";
	/** 複数格納可能なパレット数を越えています。 */
	public static final String PALLET_MORE_THAN30_INPUTS_ERROR = "palletMoreThan30InputsError";
	/** このパレットはり紙には移動中の在庫がありません。 */
	public static final String PALLET_MOVE_STOCK_NOT_FOUND_ERROR = "palletMoveStockNotFoundError";
	/** シンボル貼付されていない段ボールが含まれています。 */
	public static final String PALLET_MULTIPLE_SYMBOL_STATUS_ERROR = "palletMultipleSymbolStatusError";
	/** パレットはり紙が入力されていません。 */
	public static final String PALLET_NOT_SINGLE_ENTRY_ENTERD_ERROR = "palletNotSingleEntryEnterdError";
	/** はり紙出力方法が既に選択されています。 */
	public static final String PALLET_OUTPUT_METHOD_SELECTED_ERROR = "palletOutputMethodSelectedError";
	/** 更新対象のパレットはり紙情報データが存在しません。 */
	public static final String PALLET_PAPER_INFO_UNREGISTERED = "palletPaperInfoUnregistered";
	/** パレットはり紙は入力できません。 */
	public static final String PALLET_PAPER_NO_ENTER_ERROR = "palletPaperNoEnterError";
	/** パレットはり紙ステータスが「格納済」でないため検品できません。 */
	public static final String PALLET_STATUS_NOT_COMPLETED_ERROR = "palletStatusNotCompletedError";
	/** このロケには格納できません。 */
	public static final String PALLET_UNABLELOCATION_ERROR = "palletUnablelocationError";
	/** 変更前または変更後の親銘柄コードが不正です。 */
	public static final String PARENT_SECURITIES_CD_AND_RECEIPTS_AND_EXPENDITURE_SECURITIES_CD_ILLEGAL = "parentSecuritiesCdAndReceiptsAndExpenditureSecuritiesCdIllegal";
	/** 未出力の山出しリストが残っている為、新しい引当はできません。 */
	public static final String PAST_SR_STATUS_ALLOCATED_NO_ALLOC_ERROR = "pastSrStatusAllocatedNoAllocError";
	/** 他の引当処理が実行中の為、新しい引当はできません。 */
	public static final String PAST_SR_STATUS_IN_ALLOCATING_NO_ALLOC_ERROR = "pastSrStatusInAllocatingNoAllocError";
	/** 適用開始日に過去の日付を入力することはできません。 */
	public static final String PAST_START_APPLY_DATE_INPUT_ERROR = "pastStartApplyDateInputError";
	/** ピッキング指示キーが取得できませんでした */
	public static final String PICKING_KEY_NOT_FOUND_ERROR = "pickingKeyNotFoundError";
	/** 棚出リストキーに該当するロットではありません */
	public static final String PICKING_LIST_KEY_DIFFERENT_LOT_ERROR = "pickingListKeyDifferentLotError";
	/** 例外的なリスト発行区分が入力されました。 */
	public static final String PICKING_LIST_TYPE_EXCEPTION_ERROR = "pickingListTypeExceptionError";
	/** 指示No.内に同一の銘柄コード、製造年月日、デザイン区分が存在します。集約してください。 */
	public static final String PLAN_NO_CANNOT_INPUT_SAME_CONDITION_ERROR = "planNoCannotInputSameConditionError";
	/** 指示No.が数値ではありません。 */
	public static final String PLAN_NO_CHECK_NUMERIC_ONLY_ERROR = "planNoCheckNumericOnlyError";
	/** 指示No.を入力して下さい。 */
	public static final String PLAN_NO_NOT_INPUT_ERROR = "planNoNotInputError";
	/** 本日より過去の製造年月日を入力してください。 */
	public static final String PREVIOUS_PRODUCTION_DATE_FUTURE_DAY_ERROR = "previousProductionDateFutureDayError";
	/** 受入予定日には過去の日付は入力できません。 */
	public static final String PREVIOUS_RECEIVE_PLAN_DATE_INPUT_ERROR = "previousReceivePlanDateInputError";
	/** 発送予定日には過去の日付は入力できません。 */
	public static final String PREVIOUS_SHIPPING_PLAN_DATE_INPUT_ERROR = "previousShippingPlanDateInputError";
	/** 印刷機番号に値がありません。 */
	public static final String PRINTER_NO_NOT_INPUT_ERROR = "printerNoNotInputError";
	/** 該当するプリンタがありません */
	public static final String PRINTER_NOT_FOUND_ERROR = "printerNotFoundError";
	/** 製造年月日が逆転していない明細を選択しています。 */
	public static final String PROCUCTION_DATE_REVERSE_LIST_STOCK_TRANSFER_NOT_SELECT_ERROR = "procuctionDateReverseListStockTransferNotSelectError";
	/** 生出番号に値がありません。 */
	public static final String PRODUCE_NO_NOT_INPUT_ERROR = "produceNoNotInputError";
	/** 銘柄カテゴリが存在しません。 */
	public static final String PRODUCT_CATEGORY_NOT_FOUND_ERROR = "productCategoryNotFoundError";
	/** 銘柄カテゴリを入力して下さい。 */
	public static final String PRODUCT_CATEGORY_NOT_INPUT_ERROR = "productCategoryNotInputError";
	/** ロケ不定の貼付銘柄カテゴリが正しく設定されていません。ライン＋対応ブロックで１～１０までが設定されるようにして下さい。 */
	public static final String PRODUCT_CATEGORY_NOT_SETTING_ERROR = "productCategoryNotSettingError";
	/** 入力した銘柄は廃止銘柄です。 */
	public static final String PRODUCT_CD_ABOLITION_PRODUCT_ERROR = "productCdAbolitionProductError";
	/** 同じ銘柄CDと適用開始日の組合わせが存在します。 */
	public static final String PRODUCT_CD_AND_START_APPLY_DATE_ALREADY_REGISTERED_CANNOT_REGISTER_ERROR = "productCdAndStartApplyDateAlreadyRegisteredCannotRegisterError";
	/** 銘柄CDが異なる為、この２次元バーコードを読込めません。 */
	public static final String PRODUCT_CD_DIFFERENT_ERROR = "productCdDifferentError";
	/** 銘柄CD、製造年月日、デザイン区分が同一の明細があります。集約して入力してください。 */
	public static final String PRODUCT_CD_MANUFACTURE_DATE_DESIGN_CD_SAME_ROW_ERROR = "productCdManufactureDateDesignCdSameRowError";
	/** 銘柄コードが存在しません。（論理エラー） */
	public static final String PRODUCT_CD_MF_RCV_DESIGN_NOT_FOUND_ERROR = "productCdMfRcvDesignNotFoundError";
	/** 入力された製品はこのロケの製品ではありません。 */
	public static final String PRODUCT_CD_MISMATCH_ERROR = "productCdMismatchError";
	/** この銘柄は国内免税品ではありません。 */
	public static final String PRODUCT_CD_NOT_TAX_EXEMPTION_PRODUCT_ERROR = "productCdNotTaxExemptionProductError";
	/** ライン/ブロックか銘柄CDを入力してください。 */
	public static final String PRODUCT_C_D_OR_LINE_BLOCK_COMBO_BOX_NOT_INPUT_ERROR = "productCDOrLineBlockComboBoxNotInputError";
	/** 入力製品情報 または 入力ロケーションCDを入力してください。 */
	public static final String PRODUCT_CD_OR_LOCATION_CD_NOT_INPUT_ERROR = "productCdOrLocationCdNotInputError";
	/** 銘柄CDか補充先のどちらかを入力して検索してください。 */
	public static final String PRODUCT_CD_OR_REPLENISHMENT_DESTINATION_NO_NOT_INPUT_ERROR = "productCdOrReplenishmentDestinationNoNotInputError";
	/** 銘柄CD または 商社搬入番号を入力してください。 */
	public static final String PRODUCT_CD_OR_TAKING_NO_NOT_INPUT_ERROR = "productCdOrTakingNoNotInputError";
	/** 製品情報が変更されています。再度検索し作業を行ってください。 */
	public static final String PRODUCT_INFO_CHANGE_ERROR = "productInfoChangeError";
	/** 製造年月日が日付不正(形式:yyyyMMdd)。 */
	public static final String PRODUCTION_DATE_ERROR = "productionDateError";
	/** 製造年月日を入力して下さい。 */
	public static final String PRODUCTION_DATE_NOT_INPUT_ERROR = "productionDateNotInputError";
	/** 数量(個数)が数値ではありません。 */
	public static final String QTY_CHECK_NUMERIC_ONLY_ERROR = "qtyCheckNumericOnlyError";
	/** 数量(個数)はケース、カートン換算値ではありません。 */
	public static final String QTY_FRACTION_CASE_UNIT_AND_CARTON_UNIT_QTY_ERROR = "qtyFractionCaseUnitAndCartonUnitQtyError";
	/** 数量(個数)が輸送番号に紐付く融通山出し実績数量未満です。 */
	public static final String QTY_SMALLER_THAN_REPLENISH_STOCK_TRANSFER_QTY_ERROR = "qtySmallerThanReplenishStockTransferQtyError";
	/** ０を入力することはできません。 */
	public static final String QUANTITY_NOT_INPUT_ZERO_ERROR = "quantityNotInputZeroError";
	/** 入庫キーに値がありません。 */
	public static final String RCVKEY_NOT_INPUT_ERROR = "rcvkeyNotInputError";
	/** 組替前または組替後の親銘柄コードが不正です。 */
	public static final String REARRANGEMENT_PRODUCT_CD_ERROR = "rearrangementProductCdError";
	/** この銘柄の入庫情報登録は完了しています。 */
	public static final String RECEIPT_BLAND_CD_REGISTERED_ERROR = "receiptBlandCdRegisteredError";
	/** 同じ輸送番号が複数存在します。本社に連絡してください。 */
	public static final String RECEIPT_TRANSPORT_NUMBER_DUPLICATION_ERROR = "receiptTransportNumberDuplicationError";
	/** 入庫情報を登録可能な輸送番号が存在しません。 */
	public static final String RECEIPT_TRANSPORT_NUMBER_NOT_FOUND_ERROR = "receiptTransportNumberNotFoundError";
	/** この輸送番号の入庫情報登録が完了しています。 */
	public static final String RECEIPT_TRANSPORT_NUMBER_REGISTERED_ERROR = "receiptTransportNumberRegisteredError";
	/** ロット情報が違うために入庫予定を作成しました。 */
	public static final String RECEIVE_PLAN_CREATE_WARN = "receivePlanCreateWarn";
	/** 入庫予定情報が存在しません。 */
	public static final String RECEIVE_PLAN_DATA_NOT_FOUND_ERROR = "receivePlanDataNotFoundError";
	/** 受入予定日が発送予定日より前になっています。 */
	public static final String RECEIVE_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIPPING_PLAN_DATE_ERROR = "receivePlanDateCannotChangeBeforeShippingPlanDateError";
	/** 受入予定日を入力して下さい。 */
	public static final String RECEIVE_PLAN_DATE_NOT_INPUT_ERROR = "receivePlanDateNotInputError";
	/** 修正期間外です。 */
	public static final String RECEIVE_PLAN_DT_MORE_THAN_SYSTE_DT_ERROR = "receivePlanDtMoreThanSysteDtError";
	/** 実績値が入力されていません。 */
	public static final String RECEIVE_QTY_NOT_INPUT_ERROR = "receiveQtyNotInputError";
	/** 入庫実績が0のため、検品登録できません。 */
	public static final String RECEIVE_RUSULT_QTY_ZERO_ERROR = "receiveRusultQtyZeroError";
	/** 受信伝票と異なる銘柄の入力はできません。 */
	public static final String RECEIVE_SLIP_PRODUCT_DIFFERENT_ERROR = "receiveSlipProductDifferentError";
	/** 受信伝票指示数量と異なる数量の銘柄があります。修正してください。 */
	public static final String RECEIVE_SLIP_QUANTITY_DIFFERENT_ERROR = "receiveSlipQuantityDifferentError";
	/** この段ボールは既に入庫完了しています。 */
	public static final String RECEIVE_STATUS_STORED_ERROR = "receiveStatusStoredError";
	/** 入庫データで使用されているため処理できません。 */
	public static final String RECEIVE_TRANSACTION_DATA_FOUND_ERROR = "receiveTransactionDataFoundError";
	/** 依頼種別・出庫経路区分に該当する受入先コードが入力されていません。 */
	public static final String RECIPIENT_CODE_UNMATCHEDREQUEST_TYPE_AND_SHIPPING_ROUTE_ERROR = "recipientCodeUnmatchedrequestTypeAndShippingRouteError";
	/** 組替前と組替後の内外区分が異なります。 */
	public static final String RECOMBINATION_INSIDE_AND_OUTSIDE_TYPE_ERROR = "recombinationInsideAndOutsideTypeError";
	/** レコード長が不正です。 */
	public static final String RECORD_LENGTH_INCORRECT_ERROR = "recordLengthIncorrectError";
	/** この製品の残数量が１ケース未満です カートン単位で取出してください。 */
	public static final String REMAINING_QTY_UNDER_ONE_CASE_ERROR = "remainingQtyUnderOneCaseError";
	/** 離島フラグが入力範囲を超えています。 */
	public static final String REMOTE_ISLAND_FLAG_EXCEPT_ERROR = "remoteIslandFlagExceptError";
	/** デザイン区分が区分値マスタに存在しません。 */
	public static final String REPLENISH_BREAKDOWN_DESIGN_CD_NOT_FOUND_ERROR = "replenishBreakdownDesignCdNotFoundError";
	/** 製造年月日が日付形式でないデータです。 */
	public static final String REPLENISH_BREAKDOWN_MANUFACTURE_DATE_FORMAT_ERROR = "replenishBreakdownManufactureDateFormatError";
	/** 発送予定日と受入予定日が逆転しているデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_CD_AND_SHIPTO_CD_REVERSED_ERROR = "replenishBreakdownShipCdAndShiptoCdReversedError";
	/** 発送元コードと受入先コードが同じデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_CD_AND_SHIPTO_CD_SAME_ERROR = "replenishBreakdownShipCdAndShiptoCdSameError";
	/** 発送元コードが拠点マスタに存在しません。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_CD_NOT_FOUND_ERROR = "replenishBreakdownShipCdNotFoundError";
	/** 同一輸送番号内の発送元コードが異なるデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_CD_UNMATCH_ERROR = "replenishBreakdownShipCdUnmatchError";
	/** 発送予定日が日付形式でないデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_SCH_DATE_FORMAT_ERROR = "replenishBreakdownShipSchDateFormatError";
	/** 同一輸送番号内の発送予定日が異なるデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIP_SCH_DATE_UNMATCH_ERROR = "replenishBreakdownShipSchDateUnmatchError";
	/** 受入先コードが拠点マスタに存在しません。 */
	public static final String REPLENISH_BREAKDOWN_SHIPTO_CD_NOT_FOUND_ERROR = "replenishBreakdownShiptoCdNotFoundError";
	/** 同一輸送番号内の受入先コードが異なるデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIPTO_CD_UNMATCH_ERROR = "replenishBreakdownShiptoCdUnmatchError";
	/** 受入予定日が日付形式でないデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIPTO_SCH_DATE_FORMAT_ERROR = "replenishBreakdownShiptoSchDateFormatError";
	/** 同一輸送番号内の受入予定日が異なるデータです。 */
	public static final String REPLENISH_BREAKDOWN_SHIPTO_SCH_DATE_UNMATCH_ERROR = "replenishBreakdownShiptoSchDateUnmatchError";
	/** 補充数に、０を入力することはできません。 */
	public static final String REPLENISH_NUM_NOT_INPUT_ZERO_ERROR = "replenishNumNotInputZeroError";
	/** 重複する融通指示データが存在します。 */
	public static final String REPLENISH_PLAN_DUPLICATE_ERRO = "replenishPlanDuplicateErro";
	/** 該当データは内訳受信済、伝票受信済または既に指示送信済です。 */
	public static final String REPLENISH_STATUS_NOT_UNINSTRUCTED_ERROR = "replenishStatusNotUninstructedError";
	/** この代表ＱＲコードのケース情報が重複しています。 */
	public static final String REPRESENTATIVE_DUPLICATE_CASE_INFORMATION_ERROR = "representativeDuplicateCaseInformationError";
	/** この代表ＱＲコードは使用できません。 */
	public static final String REPRESENTATIVE_QR_CODE_ERROR = "representativeQrCodeError";
	/** この代表ＱＲコードは入庫予定数量を超過しています。 */
	public static final String REPRESENTATIVE_RECEIVE_OVER_CASE_QTY_ERROR = "RepresentativeReceiveOverCaseQtyError";
	/** この代表ＱＲコードに、輸送番号に含まれない銘柄が存在しています。 */
	public static final String REPRESENTATIVE_TRANSPORT_NUMBER_IN_BRAND_CD_NOT_FOUND_ERROR = "RepresentativeTransportNumberInBrandCdNotFoundError";
	/** 依頼種別・出庫経路区分の組合せが正しくありません。 */
	public static final String REQUEST_TYPE_AND_SHIPPING_ROUTE_INCORRECT_ERROR = "requestTypeAndShippingRouteIncorrectError";
	/** 依頼種別が入力されていません。 */
	public static final String REQUEST_TYPE_NOT_SELECT_ERROR = "requestTypeNotSelectError";
	/** 取消数量入力行の残数への数量入力は出来ません。 */
	public static final String RESET_QUANTITY_ENTRY_INPUT_ERROR = "resetQuantityEntryInputError";
	/** 補充切り上げカートン数が数値ではありません。 */
	public static final String RESTOCK_ROUNDUP_CARTON_NUM_CHECK_NUMERIC_ONLY_ERROR = "restockRoundupCartonNumCheckNumericOnlyError";
	/** 補充切り上げカートン数を入力して下さい。 */
	public static final String RESTOCK_ROUNDUP_CARTON_NUM_NOT_INPUT_ERROR = "restockRoundupCartonNumNotInputError";
	/** 補充切り上げ単位が存在しません。 */
	public static final String RESTOCK_ROUNDUP_UNIT_NOT_FOUND_ERROR = "restockRoundupUnitNotFoundError";
	/** 補充切り上げ単位を入力して下さい。 */
	public static final String RESTOCK_ROUNDUP_UNIT_NOT_INPUT_ERROR = "restockRoundupUnitNotInputError";
	/** 事前補充方式が存在しません。 */
	public static final String RESTOCK_TYPE_ADVANCE_NOT_FOUND_ERROR = "restockTypeAdvanceNotFoundError";
	/** 事前補充方式を入力して下さい。 */
	public static final String RESTOCK_TYPE_ADVANCE_NOT_INPUT_ERROR = "restockTypeAdvanceNotInputError";
	/** 当日補充方式が存在しません。 */
	public static final String RESTOCK_TYPE_CURRENT_DAY_NOT_FOUND_ERROR = "restockTypeCurrentDayNotFoundError";
	/** 当日補充方式を入力して下さい。 */
	public static final String RESTOCK_TYPE_CURRENT_DAY_NOT_INPUT_ERROR = "restockTypeCurrentDayNotInputError";
	/** 返品入庫検品情報が保存されていませんが、戻りますか？ */
	public static final String RETURNED_RECEIVE_INSPECTION_NOT_SAVE_CONFIRMATION = "returnedReceiveInspectionNotSaveConfirmation";
	/** 状態コードが不正です。 */
	public static final String RETURNED_RECEIVE_PLAN_CONDITION_FLG_ERROR = "returnedReceivePlanConditionFlgError";
	/** 取引方法が設定できません。 */
	public static final String RETURNED_RECEIVE_PLAN_EXCHG_METHOD_ERROR = "returnedReceivePlanExchgMethodError";
	/** 返品入庫検品が完了していないため、差異リスト再発行できません。 */
	public static final String RETURNED_STATUS_CANNOT_PRINT_ERROR = "returnedStatusCannotPrintError";
	/** 返品ステータスの変更ができない伝票が含まれています。 */
	public static final String RETURNED_STATUS_CHANGE_ERROR = "returnedStatusChangeError";
	/** 現在のステータスでは、検品できません。 */
	public static final String RETURNED_STATUS_INSPECTION_ERROR = "returnedStatusInspectionError";
	/** 現在のステータスでは、実績確定できません。 */
	public static final String RETURNED_STATUS_NOT_INSPECTED_ERROR = "returnedStatusNotInspectedError";
	/** 例外的な売上種別が入力されました。 */
	public static final String SALES_TYPE_DISP_EXCEPTION_ERROR = "salesTypeDispExceptionError";
	/** 入力された売上種別は区分値明細マスタに存在しません。 */
	public static final String SALES_TYPE_INPUT_EXCEPT_ERROR = "salesTypeInputExceptError";
	/** 同一引当バッチキーが選択されていません */
	public static final String SAME_ALLOCATE_KEY_NOT_SELECTED_ERROR = "sameAllocateKeyNotSelectedError";
	/** 同一整理番号が全て選択されていません */
	public static final String SAME_REFERENCE_PLAN_NOT_SELECTED_ERROR = "sameReferencePlanNotSelectedError";
	/** 同一払出依頼番号が全て選択されていません。 */
	public static final String SAME_REQUEST_NUMBER_NOT_SELECTED_ERROR = "sameRequestNumberNotSelectedError";
	/** 既にスキャンされているバーコードである。 */
	public static final String SAME_SYMBOL_BARCODE_ERROR = "sameSymbolBarcodeError";
	/** 選択したロケとスキャンしたロケが違います。 */
	public static final String SCANNED_LOCATION_DIFFERENCE_ERROR = "scannedLocationDifferenceError";
	/** 選択したロット情報と違うパレットはり紙です。 */
	public static final String SCANNED_PALLET_LOT_DIFFERENCE_ERROR = "scannedPalletLotDifferenceError";
	/** スキャン済のシンボルとロケコードが異なっています。 */
	public static final String SCANNED_SYMBOL_LOC_MISMATCH_ERROR = "scannedSymbolLocMismatchError";
	/** スキャンされたシンボル情報は存在しません。 */
	public static final String SCAN_SYMBOL_NOT_FOUND_ERROR = "scanSymbolNotFoundError";
	/** 明細情報に変更があります。登録後に発行を行ってください。 */
	public static final String SELECTION_ITEM_UNREGISTERED = "selectionItemUnregistered";
	/** 選択した輸送番号の融通山出しリストは、既に発行済です。 */
	public static final String SELECT_REPLENISH_STOCK_TRANSFER_LIST_PRINT_FLAG_UNREGISTERED = "selectReplenishStockTransferListPrintFlagUnregistered";
	/** 発送元で融通山出し作業が完了しているため登録できません。 */
	public static final String SENDER_STATUS_STOCK_TRANSFER_COMPLETED_ERROR = "senderStatusStockTransferCompletedError";
	/** 通番印刷順(昇順 / 降順)が入力範囲を超えています。 */
	public static final String SERIAL_NM_PRINTING_ORDER_EXCEPT_ERROR = "serialNmPrintingOrderExceptError";
	/** 削除対象のラインCDが棚在庫テーブルで設定されています。 */
	public static final String SHELF_STOCK_NOT_LINE_CD_ERROR = "shelfStockNotLineCdError";
	/** 入力された棚出数量は指示数量を上回っています。 */
	public static final String SHELVING_NUM_OVER_INSTRUCTION_NUM_ERROR = "shelvingNumOverInstructionNumError";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので出庫予定一覧(詳細)にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_CANNOT_ALLOCATED_INFORMATION = "shipInstructeCompleteCannotAllocatedInformation";
	/** この仕分ラベルのお得意様コードに対するケース単位出庫は完了しています。 */
	public static final String SHIPPING_BY_CASE_OF_CUSTOMER_CD_COMPLETED_ERROR = "shippingByCaseOfCustomerCdCompletedError";
	/** 別の操作によりこのケース単位出庫の実績が既に存在します　再度仕分ラベルからスキャンしてください。 */
	public static final String SHIPPING_BY_CASE_OF_PRODUCT_CD_ANOTHER_OPERATION_RESULT_FOUND_ERROR = "shippingByCaseOfProductCdAnotherOperationResultFoundError";
	/** この銘柄CDのケース単位出庫の実績が既に存在するため、一括出庫できません。 */
	public static final String SHIPPING_BY_CASE_OF_PRODUCT_CD_RESULT_FOUND_ERROR = "shippingByCaseOfProductCdResultFoundError";
	/** この銘柄CDのスキャンが完了していないため、異なる銘柄コードのケースは入力できません。 */
	public static final String SHIPPING_BY_CASE_OF_PRODUCT_CD_WORKING_DIFFERENT_PRODUCT_CD = "shippingByCaseOfProductCdWorkingDifferentProductCd";
	/** ケース単位出庫の予定数量を満たしていません。 */
	public static final String SHIPPING_BY_CASE_PLAN_NUM_LESS_THAN_INPUT_ERROR = "ShippingByCasePlanNumLessThanInputError";
	/** この仕分ラベルのお得意様コードに対するケース単位出庫の予定はありません。 */
	public static final String SHIPPING_BY_CASE_PLAN_OF_CUSTOMER_CD_NOT_FOUND_ERROR = "shippingByCasePlanOfCustomerCdNotFoundError";
	/** この銘柄CDドのケース単位出庫の予定が１０００ケース以上存在するため、一括出庫できません。 */
	public static final String SHIPPING_BY_CASE_PLAN_OF_PRODUCT_CD_OVER_THOUSAND_CASE_ERROR = "shippingByCasePlanOfProductCdOverThousandCaseError";
	/** 発送元CDは存在しません。 */
	public static final String SHIPPING_COMPANY_CD_NOT_FOUND_ERROR = "shippingCompanyCdNotFoundError";
	/** 発送元CDが拠点マスタに存在しません。 */
	public static final String SHIPPING_FROM_COMPANY_CD_NOT_FOUND_IN_CENTER_MASTER_ERROR = "shippingFromCompanyCdNotFoundInCenterMasterError";
	/** 発送元CDを入力して下さい。 */
	public static final String SHIPPING_FROM_COMPANY_CD_NOT_INPUT_ERROR = "shippingFromCompanyCdNotInputError";
	/** レコードスキップ（倉庫間移動で既に取込済） */
	public static final String SHIPPING_IN_OUT_PLAN_RECEIVE_ALREADY_SHIPPING_ERROR = "shippingInOutPlanReceiveAlreadyShippingError";
	/** レコードスキップ（出荷ステータスが既に引当中以降） */
	public static final String SHIPPING_IN_OUT_PLAN_SHIP_STATUS_ERROR = "shippingInOutPlanShipStatusError";
	/** 該当する出庫指図情報が複数存在します。 */
	public static final String SHIPPING_INST_INFO_DUPLICATE_ERROR = "shippingInstInfoDuplicateError";
	/** 該当の出庫指示キーが出庫予定に存在しません。 */
	public static final String SHIPPING_INST_KEY_NOT_FOUND_ERROR = "shippingInstKeyNotFoundError";
	/** この出庫予定の積込検品は既に完了しています。 */
	public static final String SHIPPING_LOADING_INSPECTION_COMPLETED_ERROR = "shippingLoadingInspectionCompletedError";
	/** 積込リストのバーコードをスキャンしてください。 */
	public static final String SHIPPING_LOADING_LIST_BARCODE_NOT_INPUT_ERROR = "shippingLoadingListBarcodeNotInputError";
	/** 検品中の積込リストと出庫指示キーが一致しません。 */
	public static final String SHIPPING_LOADING_LIST_UNMATCH_SHIPPING_INST_KEY_ERROR = "shippingLoadingListUnmatchShippingInstKeyError";
	/** 新規で既に融通輸送情報に登録されているデータです。 */
	public static final String SHIPPING_NOTIFICATION_INFO_NEW_STATE_ERROR = "shippingNotificationInfoNewStateError";
	/** この仕分ラベルは既に出庫操作済みです。 */
	public static final String SHIPPING_OPERATEDSORTING_LABEL_INPUT_ERROR = "shippingOperatedsortingLabelInputError";
	/** 出庫場のロケコードが取得できませんでした。 */
	public static final String SHIPPING_PLACE_LOCATION_CD_GET_ERROR = "shippingPlaceLocationCdGetError";
	/** 発送予定日が日付不正(形式:yyyyMMdd)。 */
	public static final String SHIPPING_PLAN_DATE_ERROR = "shippingPlanDateError";
	/** 発送予定日を入力して下さい。 */
	public static final String SHIPPING_PLAN_DATE_NOT_INPUT_ERROR = "shippingPlanDateNotInputError";
	/** 予定数量の合計を０以下とする事はできません。 */
	public static final String SHIPPING_PLAN_QTY_INPUT_ZERO_ERROR = "shippingPlanQtyInputZeroError";
	/** 出庫予定数量に対する単品／端数区分が誤っています。 */
	public static final String SHIPPING_PLAN_QTY_NOT_DIVISIBLE_PALLET_QTY_ERROR = "shippingPlanQtyNotDivisiblePalletQtyError";
	/** この予定情報は作業中の為、登録・更新は出来ません。 */
	public static final String SHIPPING_STATUS_ALLOCATED_NON_DELETE_ERROR = "shippingStatusAllocatedNonDeleteError";
	/** 引当中~棚出完了以外の出庫指示に対して、引当解除することはできません。 */
	public static final String SHIPPING_STATUS_NOT_ALLOCATEDOR_PICKED_ERROR = "shippingStatusNotAllocatedorPickedError";
	/** 予定情報受信済以外の引当は行えません。 */
	public static final String SHIPPING_STATUS_NOT_PLAN_INFO_RECEIVED_ERROR = "shippingStatusNotPlanInfoReceivedError";
	/** 発送元CDと発送先CDが同じになっています。 */
	public static final String SHIPPING_TO_COMPANY_CD_CANNOT_INPUT_SAME_SHIPPING_FROM_COMPANY_CD_ERROR = "shippingToCompanyCdCannotInputSameShippingFromCompanyCdError";
	/** 発送先CDが拠点マスタに存在しません。 */
	public static final String SHIPPING_TO_COMPANY_CD_NOT_FOUND_IN_CENTER_MASTER_ERROR = "shippingToCompanyCdNotFoundInCenterMasterError";
	/** 発送先CDを入力して下さい。 */
	public static final String SHIPPING_TO_COMPANY_CD_NOT_INPUT_ERROR = "shippingToCompanyCdNotInputError";
	/** 出庫データで使用されているため処理できません。 */
	public static final String SHIPPING_TRANSACTION_DATA_FOUND_ERROR = "shippingTransactionDataFoundError";
	/** 出庫経路区分が入力されていません。 */
	public static final String SHIP_ROUTE_NOT_SELECT_ERROR = "shipRouteNotSelectError";
	/** 特約店CDは取引先マスタに存在しません。 */
	public static final String SHIP_TO_CD_NOT_FOUND_ERROR = "shipToCdNotFoundError";
	/** 着日が中継拠点の適用期間外です。 */
	public static final String SHIPTO_RELAY_BASE_OUT_OF_PERIOD_ERROR = "shiptoRelayBaseOutOfPeriodError";
	/** 受入先名称（特販指定場所名称）が入力されていません。 */
	public static final String SHIP_TO_SNAME_NOT_INPUT_ERROR = "shipToSnameNotInputError";
	/** 棚出検品(単品)で棚出されたシンボルはスキャンできません */
	public static final String SINGLE_SYMBOLS_CANNOT_SCANNED_ERROR = "singleSymbolsCannotScannedError";
	/** 例外的な仕分場・引取場が入力されました。 */
	public static final String SORTING_COLLECTION_PLACE_EXCEPTION_ERROR = "sortingCollectionPlaceExceptionError";
	/** 仕分曜日が入力範囲を超えています。 */
	public static final String SORTING_DATE_EXCEPT_ERROR = "sortingDateExceptError";
	/** 仕分曜日、仕分ライン、仕分順が重複しています。 */
	public static final String SORTING_DATE_SORTING_LINE_SORTING_ORDER_DUPLICATE_ERROR = "sortingDateSortingLineSortingOrderDuplicateError";
	/** このシンボルは既に仕分検品済です。 */
	public static final String SORTING_INSPECTION_COMPLETED_ERROR = "sortingInspectionCompletedError";
	/** このシンボルは既に仕分検品済です */
	public static final String SORTING_INSPECTION_COMPLETE_ERROR = "sortingInspectionCompleteError";
	/** このロットは仕分場受入検品が完了していません */
	public static final String SORTING_INSPECTION_NOT_COMPLETED_ERROR = "sortingInspectionNotCompletedError";
	/** 仕分場在庫調査（終了）の指示が作成されていないため、在庫調査指示が作成できません。 */
	public static final String SORTING_INVENTORY_INCOMPLETE_ERROR = "sortingInventoryIncompleteError";
	/** 仕分場の在庫調査が未完了です。 */
	public static final String SORTING_INVENTORY_INSPECTION_NOT_COMPLETE_ERROR = "sortingInventoryInspectionNotCompleteError";
	/** 別の操作により選択中の仕分ラベル／ケースは既にケース単位出庫されています。 */
	public static final String SORTING_LABEL_AND_CASE_SHIPPING_OPERATED_ERROR = "sortingLabelAndCaseShippingOperatedError";
	/** 仕分ラベルの銘柄CDが銘柄マスタに存在しません。 */
	public static final String SORTING_LABEL_PRODUCT_CD_NOT_FOUND_ERROR = "sortingLabelProductCdNotFoundError";
	/** ラインが存在しません。仕分場構成から設定して下さい。 */
	public static final String SORTING_LINE_NOT_EXISTENCE_ERROR_ERROR = "sortingLineNotExistenceErrorError";
	/** 終了後検品の指示キー作成済です。 */
	public static final String SORTING_LINE_WORK_COMPLETED_ERROR = "sortingLineWorkCompletedError";
	/** 出力するデータがありません。 */
	public static final String SORTING_NUM_ZERO_ERROR = "sortingNumZeroError";
	/** ラインの仕分順と異なる順番の方面が存在します。 */
	public static final String SORTING_ORDER_DIFFERENT_FRO_LINE_AND_BLOCK_ERROR = "sortingOrderDifferentFroLineAndBlockError";
	/** このケースは仕分場に補充されているため出庫できません。 */
	public static final String SORTING_PLACE_CASE_INPUT_ERROR = "sortingPlaceCaseInputError";
	/** スキャンした棚出リストキーの仕分場受入検品は完了しています */
	public static final String SORTING_PLACE_INCOMING_INSPECTION_COMPLETED_ERROR = "sortingPlaceIncomingInspectionCompletedError";
	/** 仕分場のロケCDが取得できませんでした。 */
	public static final String SORTING_PLACE_LOCATION_CD_NOT_FOUND_ERROR = "sortingPlaceLocationCdNotFoundError";
	/** 選択されたデータは一連処理済みのため変更できません。 */
	public static final String SORTING_PROCESS_COMPLETED_ERROR = "sortingProcessCompletedError";
	/** 選択したライン/ブロックの仕分作業が完了していません。仕分作業完了登録を実行してください。 */
	public static final String SORTING_PROCESS_INCOMPLETE_LINE_BLOCK_ERROR = "sortingProcessIncompleteLineBlockError";
	/** 現在仕分一連処理を実行できません。 */
	public static final String SORTING_PROCESS_NOT_ALLOWED_ERROR = "sortingProcessNotAllowedError";
	/** 仕分一連処理中のため実行できません */
	public static final String SORTING_PROCESS_RUNNING_ERROR = "sortingProcessRunningError";
	/** 既に仕分一連処理を実施済みのため、棚卸データを作成できません。 */
	public static final String SORTING_PROCESS_STARTED_ERROR = "sortingProcessStartedError";
	/** 仕分一連処理未実施のため、棚卸データを作成できません。 */
	public static final String SORTING_PROCESS_UNSTARTED_ERROR = "sortingProcessUnstartedError";
	/** 当日仕分完了済のため実行できません。 */
	public static final String SORTING_WORK_COMPLETED_ERROR = "sortingWorkCompletedError";
	/** 仕分作業日付が入力されていません。 */
	public static final String SORTING_WORK_DT_NOT_INPUT_ERROR = "sortingWorkDtNotInputError";
	/** 未完了の方面が存在するため実行できません。 */
	public static final String SORTING_WORK_INCOMPLETE_ERROR = "sortingWorkIncompleteError";
	/** 仕分一連処理中のため実行できません。 */
	public static final String SORTING_WORK_NOT_COMPLETED_ERROR = "sortingWorkNotCompletedError";
	/** 再引当が行われている為、数量調整は出来ません。 */
	public static final String SR_STATUS_ALREADY_AGAIN_ALLOC_ERROR = "srStatusAlreadyAgainAllocError";
	/** 引当中（山出し指示数量調整中）の為、新しい引当はできません。 */
	public static final String SR_STATUS_IN_ALLOCATING_NO_ALLOC_ERROR = "srStatusInAllocatingNoAllocError";
	/** 山出し作業完了登録できないステータスです。 */
	public static final String SR_STATUS_NOT_STOCK_TRANSFER_NOT_COMPLETED_ERROR = "srStatusNotStockTransferNotCompletedError";
	/** この状態コードでは、不足本数の登録はできません。 */
	public static final String STATUS_CD_AND_MISSING_QTY_ERROR = "statusCdAndMissingQtyError";
	/** 選択した輸送番号の融通指示のステイタスが変更された為、再度検索して下さい。 */
	public static final String STATUS_CHANGED_ERROR = "statusChangedError";
	/** 積込検品が完了していません。 */
	public static final String STATUS_NOT_CARRY_SCH_ERROR = "statusNotCarrySchError";
	/** 出庫場受入検品を完了させてください。 */
	public static final String STATUS_SHIPPING_PLACE_INCOMING_ERROR = "statusShippingPlaceIncomingError";
	/** 変更前ロケーションCDに銘柄CDの在庫が存在しません。 */
	public static final String STOCK_IN_BEFORE_CHANGELOCATION_NOT_FOUND_ERROR = "stockInBeforeChangelocationNotFoundError";
	/** 保管場の在庫が不足しているため、カートン詰合せできません。 */
	public static final String STOCK_NOT_EXIST_SORTING_PLACE_ERROR = "stockNotExistSortingPlaceError";
	/** パレットはり紙と紐付いている段ボールが含まれています。 */
	public static final String STOCK_PALLETIZE_SYMBOL_ALREADY_LINKED_PALLET_ERROR = "stockPalletizeSymbolAlreadyLinkedPalletError";
	/** 積替場に存在しない段ボールが含まれています。 */
	public static final String STOCK_PALLETIZE_SYMBOL_NOT_EXISTS_TRANSSHIPMENT_ERROR = "stockPalletizeSymbolNotExistsTransshipmentError";
	/** 段ボール情報を取得できませんでした。 */
	public static final String STOCK_PALLETIZE_SYMBOL_NOT_FOUND_ERROR = "stockPalletizeSymbolNotFoundError";
	/** 山出しが完了していないため、変更できません。 */
	public static final String STOCK_TRANSFER_NOT_COMPLETED_ERROR = "stockTransferNotCompletedError";
	/** 山出しステータスが山出し予定作成済以外の為、削除は行えません。 */
	public static final String STOCK_TRANSFER_STATUS_NOT_DELETE_ERROR = "stockTransferStatusNotDeleteError";
	/** 山出しステータスが削除済、引当中、引当済以外の為、解除は行えません。 */
	public static final String STOCK_TRANSFER_STATUS_NOT_RELEASE_ERROR = "stockTransferStatusNotReleaseError";
	/** 在庫区分が正しく入力されていません。 */
	public static final String STOCK_TYPE_INPUT_ERROR = "stockTypeInputError";
	/** 確定処理がされていませんが、戻りますか？ */
	public static final String STOCK_TYPE_LIST_NOT_SAVE_CONFIRMATION = "stockTypeListNotSaveConfirmation";
	/** 在庫区分に値がありません。 */
	public static final String STOCK_TYPE_NOT_INPUT_ERROR = "stockTypeNotInputError";
	/** 入力したゾーンはロケーションマスタに存在しません。 */
	public static final String STORE_ZONE_LOCATION_NOT_FOUND_ERROR = "storeZoneLocationNotFoundError";
	/** 格納ゾーンと変更格納ゾーンが同一のため、修正できません。 */
	public static final String STORE_ZONE_SAME_ERROR = "storeZoneSameError";
	/** 保管場在庫調査の指示が作成されていないため、在庫調査指示が作成できません。 */
	public static final String STORING_INVENTORY_INCOMPLETE_ERROR = "storingInventoryIncompleteError";
	/** 保管場の在庫調査が未完了です。 */
	public static final String STORING_INVENTORY_INSPECTION_NOT_COMPLETE_ERROR = "storingInventoryInspectionNotCompleteError";
	/** パレットの連続入力が１６パレットを超えています。 */
	public static final String SUCCESSION_LOAD_OVER_ERROR = "successionLoadOverError";
	/** 適品の実績値がさしず値を超えています。 */
	public static final String SUITABLE_PRODUCT_QTY_ERROR = "suitableProductQtyError";
	/** 適品の実績値は、販売最小数量単位（カートン）です。 */
	public static final String SUITABLE_PRODUCT_QTY_UNIT_ERROR = "suitableProductQtyUnitError";
	/** 残数量と各補充先数量の合計が在庫数量と一致しません。 */
	public static final String SUM_INPUT_LINE_BLOCK_QTY_UNMATCH_STOCK_QTY_ERROR = "sumInputLineBlockQtyUnmatchStockQtyError";
	/** 入力した数量の合計が在庫数量を超えています。 */
	public static final String SUM_INPUT_QTY_OVER_STOCK_QTY_ERROR = "sumInputQtyOverStockQtyError";
	/** 入力した数量と山出し指示数量の合計が一致しません。 */
	public static final String SUM_INPUT_QTY_UNMATCH_STOCK_QTY_ERROR = "sumInputQtyUnmatchStockQtyError";
	/** この段ボールはパレットはり紙とすでに紐付いています。 */
	public static final String SYMBOL_ALREADY_LINKED_PALLET_ERROR = "symbolAlreadyLinkedPalletError";
	/** 既に積替先パレットと紐付いているシンボルが存在します。 */
	public static final String SYMBOL_ALREADY_LINKED_TRANSSHIPMENT_PALLET_ERROR = "symbolAlreadyLinkedTransshipmentPalletError";
	/** このシンボルは既に読み込み済です。 */
	public static final String SYMBOL_ALREADY_SCANNED_ERROR = "symbolAlreadyScannedError";
	/** すでに検査が完了しています。 */
	public static final String SYMBOL_ALREADY_TESTED_COMPLETED_ERROR = "symbolAlreadyTestedCompletedError";
	/** パレットはり紙とシンボルのロットが違います。 */
	public static final String SYMBOL_AND_PALLET_LOT_NO_DIFFERENT_ERROR = "symbolAndPalletLotNoDifferentError";
	/** この段ボール情報はパレットはり紙と紐付いていません */
	public static final String SYMBOL_AND_PALLET_NOT_LINK_ERROR = "symbolAndPalletNotLinkError";
	/** 検査ステータスが未検査ではないため取消できません。 */
	public static final String SYMBOL_CANNOT_CANCEL_NOT_TESTED_ERROR = "symbolCannotCancelNotTestedError";
	/** 入庫ステータスが入庫完了のため取消できません。 */
	public static final String SYMBOL_CANNOT_CANCEL_RECEIPT_COMPLETED_ERROR = "symbolCannotCancelReceiptCompletedError";
	/** この段ボールはパレタイズできないロケにあります。 */
	public static final String SYMBOL_CANNOT_PALLETIZE_LOC_ERROR = "symbolCannotPalletizeLocError";
	/** すでにパレットはり紙と紐付いている段ボールです。 */
	public static final String SYMBOL_EXIST_PALLETE_ERROR = "symbolExistPalleteError";
	/** 入力したシンボル情報は存在しません。 */
	public static final String SYMBOLFOMATION_NOT_FOUND_ERROR = "symbolfomationNotFoundError";
	/** 既に検査中の段ボールです。 */
	public static final String SYMBOL_INSPECTING_ERROR = "symbolInspectingError";
	/** この段ボールは積替場に存在しないため検品できません。 */
	public static final String SYMBOL_NOT_EXISTS_TRANSSHIPMENT_ERROR = "symbolNotExistsTransshipmentError";
	/** このシンボルは検査場に存在しません。 */
	public static final String SYMBOL_NOT_FOUND_TESTED_ERROR = "symbolNotFoundTestedError";
	/** スキャン済のシンボルがありません。 */
	public static final String SYMBOL_NOT_INPUT_ERROR = "symbolNotInputError";
	/** 棚出されたシンボルではありません */
	public static final String SYMBOL_NOT_ORDER_PICKING_ERROR = "symbolNotOrderPickingError";
	/** 段ボール状態登録済のシンボルではありません。 */
	public static final String SYMBOL_NOT_REGISTER_ERROR = "symbolNotRegisterError";
	/** この段ボールは段ボール状態登録できないロケに存在します。 */
	public static final String SYMBOL_NOT_REGISTER_LOCATION_ERROR = "symbolNotRegisterLocationError";
	/** 品質検査済の登録が行われていません。 */
	public static final String SYMBOL_NOT_REGISTER_TESTED_ERROR = "symbolNotRegisterTestedError";
	/** 検品対象ではないシンボルが含まれています。 */
	public static final String SYMBOL_NOT_TARGET_TESTED_ERROR = "symbolNotTargetTestedError";
	/** 受注情報に該当しないシンボルです。 */
	public static final String SYMBOL_ORDER_INFO_NOT_FOUND_ERROR = "symbolOrderInfoNotFoundError";
	/** 移動数量が入力されていません。 */
	public static final String SYMBOL_PALLETE_QTY_INPUT_ERROR = "symbolPalleteQtyInputError";
	/** 移動数量がパレットの在庫を超えています。 */
	public static final String SYMBOL_PALLETE_QTY_OVER_ERROR = "symbolPalleteQtyOverError";
	/** このパレットはり紙に紐づく銘柄の山出しは終了しています。 */
	public static final String SYMBOL_PRODUCT_TRANSFER_END_ERROR = "symbolProductTransferEndError";
	/** 複数登録可能な段ボール数を超えています。 */
	public static final String SYMBOL_QTY_OVER_ERROR = "symbolQtyOverError";
	/** 既に検査対象に登録されている段ボールです。 */
	public static final String SYMBOL_REGISTERED_ERROR = "symbolRegisteredError";
	/** 他の作業で段ボール情報の残数量が更新されています */
	public static final String SYMBOL_REMAINING_QTY_UPDATED_ERROR = "symbolRemainingQtyUpdatedError";
	/** この段ボールは残数量が0のため、検品できません */
	public static final String SYMBOL_REMAINING_QTY_ZERO_ERROR = "symbolRemainingQtyZeroError";
	/** 段ボールに貼付されていないシンボルです。 */
	public static final String SYMBOL_STATUS_ERROR = "symbolStatusError";
	/** 段ボールのステータスが「シンボル作成」ではないため削除できません。 */
	public static final String SYMBOL_STATUS_NOT_CREATED_ERROR = "symbolStatusNotCreatedError";
	/** 取消する数量が検査済正常品数量を超えています。 */
	public static final String SYMBOL_TESTED_CANCEL_QTY_OVER_ERROR = "symbolTestedCancelQtyOverError";
	/** このシンボルに対する検査は完了しています。 */
	public static final String SYMBOL_TESTED_COMPLETED_ERROR = "symbolTestedCompletedError";
	/** 検査済正常品登録が完了しているシンボルが存在します。 */
	public static final String SYMBOL_TESTED_REGISTER_COMPLETED_ERROR = "symbolTestedRegisterCompletedError";
	/** このシンボルは検査済正常品登録が完了しています。 */
	public static final String SYMBOL_TESTED_REGISTERED_ERROR = "symbolTestedRegisteredError";
	/** 引取場の在庫調査が未完了です。 */
	public static final String TAKE_OFF_INVENTORY_INSPECTION_NOT_COMPLETE_ERROR = "takeOffInventoryInspectionNotCompleteError";
	/** 検査済正常品の段ボール情報が存在しません。 */
	public static final String TESTED_COMPLETED_SYMBOL_NOT_FOUND_ERROR = "testedCompletedSymbolNotFoundError";
	/** 検査済不良品数量と検査品段ボールの残数量が一致していません。 */
	public static final String TESTED_INFERIOR_QTY_UNMATCH_ERROR = "testedInferiorQtyUnmatchError";
	/** 検査場のロケコードが取得できませんでした。 */
	public static final String TESTED_LOC_NOT_FOUND_ERROR = "testedLocNotFoundError";
	/** 検査済正常品用の段ボールは削除できません。 */
	public static final String TESTED_NORMAL_SYMBOL_ERROR = "testedNormalSymbolError";
	/** 登録する数量が検査予定数量を超えています。 */
	public static final String TESTED_PLAN_QTY_OVER_ERROR = "testedPlanQtyOverError";
	/** 検査済正常品用のシンボルのため取消できません。 */
	public static final String TESTED_SYMBOL_CANNOT_CANCEL_ERROR = "testedSymbolCannotCancelError";
	/** 検品対象の検査品が複数検査場に存在します。 */
	public static final String TESTED_SYMBOL_DUPLICATE_ERROR = "testedSymbolDuplicateError";
	/** ライン「{0}」の対応ブロックで個口圧縮対象が3つ存在します。 */
	public static final String THREE_INDIVIDUAL_COMPLESSION_BLOCK_ASSOCIATED_TO_LINE_ERROR = "threeIndividualComplessionBlockAssociatedToLineError";
	/** 完了後は本日の仕分一連処理が行えなくなります。完了しますか？ */
	public static final String TODAY_SORTING_WORK_CONFIRMATION = "todaySortingWorkConfirmation";
	/** 一番上の行が選択されています。 */
	public static final String TOP_ROW_SELECTED_ERROR = "topRowSelectedError";
	/** ０ケース０カートンの棚出はできません */
	public static final String TOTAL_QTY_IS_ZERO_ERROR = "totalQtyIsZeroError";
	/** 個数が未入力です。 */
	public static final String TOTAL_QTY_NOT_INPUT_ERROR = "totalQtyNotInputError";
	/** 検査済正常品数量 + 不良品数量 + 検査対象外数量が、検査予定数量と一致していません。 */
	public static final String TOTAL_QTY_UNMATCH_EXAM_QTY_ERROR = "totalQtyUnmatchExamQtyError";
	/** 選択中の山出しリストに紐付いたケースはり紙をスキャンして下さい。 */
	public static final String TRANSFER_LIST_SYMBOL_BARCODE_SCAN_ERROR = "transferListSymbolBarcodeScanError";
	/** 山出しリスト№は存在しません。 */
	public static final String TRANSFER_NO_NOT_FOUND_ERROR = "transferNoNotFoundError";
	/** 入力された山出し数量が山出し指示数量を上回っています。 */
	public static final String TRANSFER_NUM_OVER_TRANSFER_LIST_NUM_ERROR = "transferNumOverTransferListNumError";
	/** 山出し数量が入力されていません。 */
	public static final String TRANSFER_QTY_INPUT_ERROR = "transferQtyInputError";
	/** 運送会社名取得時にエラーが発生しました。 */
	public static final String TRANSPORT_COMPANY_NOT_FOUND_ERROR = "transportCompanyNotFoundError";
	/** 輸送番号に銘柄が存在しません。 */
	public static final String TRANSPORT_NUMBER_BLAND_CD_NOT_FOUND_ERROR = "transportNumberBlandCdNotFoundError";
	/** 積替場のロケコードが取得できない。 */
	public static final String TRANSSHIPMENT_LOCATION_NOT_FOUND_ERROR = "transshipmentLocationNotFoundError";
	/** ２次元バーコードをスキャンしてください。 */
	public static final String TWO_DIMENSION_BARCODE_NOT_INPUT_ERROR = "twoDimensionBarcodeNotInputError";
	/** デザイン区分を入力して下さい。 */
	public static final String TYPE_DESIGN_NOT_INPUT_ERROR = "typeDesignNotInputError";
	/** 区分値が存在しません。 */
	public static final String TYPE_EXCEPT_ERROR = "TypeExceptError";
	/** ロケ不定の貼付銘柄カテゴリが重複しています。 */
	public static final String UNSETTLED_LOCATION_PRODUCT_CATEGORY_DUPLICATE_ERROR = "unsettledLocationProductCategoryDuplicateError";
	/** 更新件数：[引当制御マスタの有効区分]{0}件 */
	public static final String UPDATE_ALLOCATE_CONTROL_MASTER_VALID_TYPE = "updateAllocateControlMasterValidType";
	/** 更新件数：[方面属性マスタの世代区分]{0}件 */
	public static final String UPDATE_DIRECTION_ATTRIBUTE_MASTER_GRTN_ID = "updateDirectionAttributeMasterGrtnId";
	/** 更新件数：[受入デザインマスタの有効区分]{0}件 */
	public static final String UPDATE_RECEIVE_DESIGN_MASTER_VALID_TYPE = "updateReceiveDesignMasterValidType";
	/** 100箱使用区分が入力範囲を超えています。 */
	public static final String USE_CLASS_EXCEPT_ERROR = "useClassExceptError";
	/** 入力された出庫プラントは区分値明細マスタに存在しません。 */
	public static final String WARE_HOUSE_PLANT_INPUT_EXCEPT_ERROR = "wareHousePlantInputExceptError";
	/** 銘柄CD（倉庫内）、銘柄CD（ケース）のいずれかを入力して検索してください。 */
	public static final String WAREHOUSE_PRODUCT_CD_O_CASE_PRODUCT_CD_NOT_INPUT_ERROR = "warehouseProductCdOCaseProductCdNotInputError";
	/** 銘柄コードが庫内作業集約コードの場合は、銘柄コード組替指示情報への登録は登録を行いません */
	public static final String WAREHOUSE_WORK_AGGREGATION_CD_NOT_REGISTRABLE = "warehouseWorkAggregationCdNotRegistrable";
	/** 指定した在庫は作業中です。作業を終わらせてから再度実行してください。 */
	public static final String WORKING_STOCK_CANNOT_CHANGE_ATTRIBUTES_ERROR = "workingStockCannotChangeAttributesError";
	/** この予定情報は作業中の為、行追加・更新・削除は出来ません。 */
	public static final String WORK_IN_PROGRESS_CANNOT_ADD_UPDATE_DELETE_LINE_ERROR = "workInProgressCannotAddUpdateDeleteLineError";
	/** 該当データが別作業で処理されました。 */
	public static final String ZERO_TO_PROCESS_INFORMATION = "zeroToProcessInformation";
	/** この積込リストは無効です。 */
	public static final String SHIPPING_LOADING_LIST_NOT_FOUND_ERROR = "shippingLoadingListNotFoundError";
	/** 国産たばこの場合は国税還付品置場の選択ができません。 */
	public static final String DOMESTIC_TOBACCO_REGISTRATION_IMPOSSIBLE_DATA_ERROR = "domesticTobaccoRegistrationImpossibleDataError";
	/** 銘柄の場合は国税還付品置場の選択ができません。 */
	public static final String ITEM_REGISTRATION_IMPOSSIBLE_DATA_ERROR = "itemRegistrationImpossibleDataError";
	/** 異型品同梱フラグが入力範囲を超えています。 */
	public static final String LRREGULAR_PRODUDT_FLAG_EXCEPT_ERROR = "lrregularProdudtFlagExceptError";
	/** ケース数、カートン数に入庫数量を入力してください。 */
	public static final String ACTUAL_CARTON_CASE_QTY_INPUT_ERROR = "actualCartonCaseQtyInputError";
	/** 国産製品の場合、１年以上前の製造年月日は入力できません。 */
	public static final String MANUFACTURED_MORE_THAN_ONE_YEAR_AGO_ERROR = "manufacturedMoreThanOneYearAgoError";
	/** 製造年月日が有効な日付ではありません。 */
	public static final String MANUFACTUR_DATE_OF_VALID_ERROR = "manufacturDateOfValidError";
	/** 輸入製品の場合、２年以上前の製造年月日は入力できません。 */
	public static final String MANUFACTURED_MORE_THAN_TOW_YEAR_AGO_ERROR = "manufacturedMoreThanTowYearAgoError";
	/** ケース数量+カートン数量が、パレット積み付け数を超えています。 */
	public static final String PALLETE_QTY_OVER_CASE_CARTON_QTY_ERROR = "palleteQtyOverCaseCartonQtyError";
	/** ケース数量が、パレット積み付け数を超えています。 */
	public static final String PALLETE_QTY_OVER_CASE_QTY_ERROR = "palleteQtyOverCaseQtyError";
	/** カートン数量が、ケース入り数を超えています。 */
	public static final String CASE_QTY_OVER_CARTON_QTY_ERROR = "caseQtyOverCartonQtyError";
	/** 発送予定日は未来日です。 */
	public static final String EXPECT_SHIPPING_FUTURE_DATE_ERROR = "expectShippingFutureDateError";
	/** 受入予定日は未来日です。 */
	public static final String EXPECT_ACCEPTANCE_FUTURE_DATE_ERROR = "expectAcceptanceFutureDateError";
	/** 銘柄CDが重複しています。 */
	public static final String BRAND_CODE_DUPLICATE_ERROR = "brandCodeDuplicateError";
	/** 確定済の出庫予定情報が含まれています。 */
	public static final String SHIPPING_INST_ALREADY_CONFIRM_ERROR = "shippingInstAlreadyConfirmError";
	/** 出庫指図の計画受信とSD引当の両方が実行されていません。 */
	public static final String PLAN_RECEIVE_ALLOCATED_STATE_ERROR = "planReceiveAllocatedStateError";
	/** 他の作業者が出庫予定情報を確定済です。 */
	public static final String OTHER_USER_SHIPPING_INST_CONFIRM_ERROR = "otherUserShippingInstConfirmError";
	/** 出庫指図の予定数量と引当済数量が一致していません。 */
	public static final String PLAN_NUM_ALLOCATED_NUM_DIFFERENT_ERROR = "planNumAllocatedNumDifferentError";
	/** 整理番号を入力して下さい。 */
	public static final String REF_NO_NOT_INPUT_ERROR = "refNoNotInputError";
	/** 整理番号は最大[0]文字以下を入力して下さい。 */
	public static final String REF_NO_CHECK_INPUT_MAX_ERROR = "refNoCheckInputMaxError";
	/** 発送元CDは最大[0]文字以下を入力して下さい。 */
	public static final String SHIPPING_FROM_COMPANY_CD_CHECK_INPUT_MAX_ERROR = "shippingFromCompanyCdCheckInputMaxError";
	/** 発送予定年月日を入力して下さい。 */
	public static final String SHIP_SCH_DATE_NOT_INPUT_ERROR = "shipSchDateNotInputError";
	/** 発送予定年月日が日付不正(形式:yyyyMMdd)。 */
	public static final String SHIP_SCH_DATE_ERROR = "shipSchDateError";
	/** 受入先CDを入力して下さい。 */
	public static final String SHIP_TO_CD_NOT_INPUT_ERROR = "shipToCdNotInputError";
	/** 受入先CDは最大[0]文字以下を入力して下さい。 */
	public static final String SHIP_TO_CD_CHECK_INPUT_MAX_ERROR = "shipToCdCheckInputMaxError";
	/** 受入予定年月日を入力して下さい。 */
	public static final String SHIP_TO_SCH_DATE_NOT_INPUT_ERROR = "shipToSchDateNotInputError";
	/** 受入予定年月日が日付不正(形式:yyyyMMdd)。 */
	public static final String SHIP_TO_SCH_DATE_ERROR = "shipToSchDateError";
	/** 修正区分を入力して下さい。 */
	public static final String DATA_TYPE_NOT_INPUT_ERROR = "dataTypeNotInputError";
	/** 修正区分は最大[0]文字以下を入力して下さい。 */
	public static final String DATA_TYPE_CHECK_INPUT_MAX_ERROR = "dataTypeCheckInputMaxError";
	/** 個数を入力して下さい。 */
	public static final String QTY_VALUE_NOT_INPUT_ERROR = "qtyValueNotInputError";
	/** 個数が数値ではありません。 */
	public static final String QTY_VALUE_CHECK_NUMERIC_ONLY_ERROR = "qtyValueCheckNumericOnlyError";
	/** 個数は最大[0]文字以下を入力して下さい。 */
	public static final String QTY_VALUE_CHECK_INPUT_MAX_ERROR = "qtyValueCheckInputMaxError";
	/** 枝倉庫CDは最大[0]文字以下を入力して下さい。 */
	public static final String SUB_WAREHOUSE_CD_CHECK_INPUT_MAX_ERROR = "subWarehouseCdCheckInputMaxError";
	/** 拠点CDか銘柄CDのどちらかを入力して検索してください。 */
	public static final String CENTER_CD_OR_PRODUCT_CD_NOT_INPUT_ERROR = "centerCdOrProductCdNotInputError";
	/** 融通指示と同一のデータが融通輸送情報に複数存在し特定できないため登録できません。 */
	public static final String MULTIPLE_DATA_IDENTICAL_TO_FLEXIBILITY_REGIST_ERROR = "multipleDataIdenticalToFlexibilityRegistError";
	/** [0]を入力して下さい。 */
	public static final String BATCH_NOT_INPUT_ERROR = "batchNotInputError";
	/** [0]は最大[1]文字以下を入力して下さい。 */
	public static final String BATCH_INPUT_MAX_ERROR = "batchInputMaxError";
	/** [0]が日付不正(形式:yyyyMMdd)。 */
	public static final String BATCH_DATE_ERROR = "batchDateError";
	/** [0]が数値ではありません。 */
	public static final String BATCH_NUMERIC_ONLY_ERROR = "batchNumericOnlyError";
	/** [0]は[1]に存在しません。 */
	public static final String BATCH_NOT_FOUND_ERROR = "batchNotFoundError";
	/** その{0}は存在しません。 */
	public static final String BATCH_CODE_TYPE_NOT_FOUND_ERROR = "batchCodeTypeNotFoundError";
	/** 中継拠点マスタに存在しません。 */
	public static final String RLY_BS_CD_NOT_FOUND_ERROR = "rlyBsCdNotFoundError";
	/** バーコードが不正です。 */
	public static final String BARCODE_INPUT_ERROR = "BarcodeInputError";
	/** シンボルバーコードが不正です。 */
	public static final String SYMBOL_BARCODE_INPUT_ERROR = "SymbolBarcodeInputError";
	/** パレット管理番号が不正です。 */
	public static final String PALLET_NO_INPUT_ERROR = "PalletNoInputError";
	/** メーカーケースバーコードが不正です。 */
	public static final String MAKER_BARCODE_INPUT_ERROR = "MakerBarcodeInputError";
	/** 代表QRが不正です。 */
	public static final String EPRESENTATIVE_Q_R_INPUT_ERROR = "epresentativeQRInputError";
	/** パレット明細が存在しません。 */
	public static final String PALLET_DETAIL_BARCODE_NOT_FOUND_ERROR = "PalletDetailBarcodeNotFoundError";
	/** パレット明細が不正です。 */
	public static final String PALLET_DETAIL_BARCODE_INPUT_ERROR = "PalletDetailBarcodeInputError";
	/** パレット識別番号が不正です。 */
	public static final String PALLET_IDENTIFICATION_BARCODE_INPUT_ERROR = "PalletIdentificationBarcodeInputError";
	/** 選択した輸送番号の融通作業は、既に完了登録済です。 */
	public static final String ALREADY_TRANSFER_COMPLETE_REGISTERED_ERROR = "alreadyTransferCompleteRegisteredError";
	/** 選択した輸送番号の融通山出しリストは融通指示作成中のため、発行できません。 */
	public static final String CANNOT_PRINT_REPLENISH_PLAN_NO_CREATED_ERROR = "cannotPrintReplenishPlanNoCreatedError";
	/** 倉庫在庫数量の合計個装数に余りが存在するため処理を終了します。 */
	public static final String WAREHOUSE_INVENTORY_QUANTITY_TOTALNUMBEROFPIECES_THEREISAREMAINDER_TERMINATETHEPROCESS = "warehouseInventoryQuantityTotalnumberofpiecesThereisaremainderTerminatetheprocess";
	/** 保留中在庫数量の合計個装数に余りが存在するため処理を終了します。 */
	public static final String PENDING_INVENTORY_QUANTITY_TOTALNUMBEROFPIECES_THEREISAREMAINDER_TERMINATETHEPROCESS = "pendingInventoryQuantityTotalnumberofpiecesThereisaremainderTerminatetheprocess";
	/** この銘柄CDのケース単位出庫の予定がありません。 */
	public static final String CASE_ITEM_NOT_FOUND_ERROR = "caseItemNotFoundError";
	/** 受信した段ボール情報は、パレタイザー投入実績が削除されています。 */
	public static final String RECEIVED_SYMBOL_IS_DELETED_FROM_PALLETIZER_INST_ERROR = "receivedSymbolIsDeletedFromPalletizerInstError";
	/** 受信した入庫キーは段ボール情報に存在しません。 */
	public static final String RECEIVE_PLAN_H_ID_NOT_EXIST_IN_SYMBOL_ERROR = "receivePlanHIdNotExistInSymbolError";
	/** 受信データは不正なために更新できませんでした。 */
	public static final String PALLETIZER_INPUT_RECORD_IS_INVALID_CAN_NOT_UPDATE_ERROR = "palletizerInputRecordIsInvalidCanNotUpdateError";
	/** 対象データを登録しますか?[0] */
	public static final String SR_PICK_LIST_DATA_REGISTER_CONFIRMATION = "srPickListDataRegisterConfirmation";
	/** 受入予定日がが日付不正(形式:yyyyMMdd)。 */
	public static final String RECEIVE_PLAN_DATE_ERROR = "receivePlanDateError";
	/** 入力した段ボール情報は存在しません。 */
	public static final String HANDY_SYMBOL_NOT_FOUND_ERROR = "handySymbolNotFoundError";
	/** 入力済です。選択した行を削除しますか？ */
	public static final String DELETE_ROW_ALREADY_INPUT_CONFIRMATION = "deleteRowAlreadyInputConfirmation";
	/** [0]が日付不正(形式:yy/MM/dd)。 */
	public static final String BATCH_DATE_ERROR2 = "batchDateError2";
	/** 入庫実績送信（販物）[ETL/バッチ] */
	public static final String RECEIVE_RECORD_PROGRAM_NAME_INFORMATION = "receiveRecordProgramNameInformation";
	/** データ出力 */
	public static final String OUTPUT_SECTION_NAME_OUTPUT_INFORMATION = "outputSectionNameOutputInformation";
	/** 削除済の為、新しい引当はできません。 */
	public static final String SR_STATUS_IN_DELETED_NO_ALLOC_ERROR = "srStatusInDeletedNoAllocError";
	/** 山出しリストは出力済の為、解除は行えません。 */
	public static final String STOCK_TRANSFER_STATUS_PRINTED_PICK_LIST_NOT_RELEASE_ERROR = "stockTransferStatusPrintedPickListNotReleaseError";
	/** 引当中、引当済を解除する時は引当バッチキーが同一の伝票を全選択して実行して下さい。 */
	public static final String ALL_ALLOC_STOCK_TRANSFER_NOT_SELECT_ERROR = "allAllocStockTransferNotSelectError";
	/** 入力した特約店CD1と特約店CD2の値が同じです。 */
	public static final String CUSTOMER_CD1_CANNOT_INPUT_SAME_CUSTOMER_CD2_ERROR = "customerCd1CannotInputSameCustomerCd2Error";
	/** 他のユーザに変更された可能性があります。内容を確認して下さい。 */
	public static final String ENTITY_ALREADY_UPDATE_ERROR = "entityAlreadyUpdateError";
	/** 伝票タイプが不正です。(行:[0],銘柄CD:[1]) */
	public static final String BATCH_SLPTYP_ERROR = "batchSlptypError";
	/** 仮融通(輸送番号:YUZ～)である為、融通指示実行できません。 */
	public static final String CANNOT_EXECUTE_TENTATIVE_REPLENISH_INST_ERROR = "cannotExecuteTentativeReplenishInstError";
	/** 発送元で融通山出し作業が開始しているため登録できません。 */
	public static final String REPLENISH_PLAN_CANNOT_REGISTER_SENDER_STATUS_STARTED_ERROR = "replenishPlanCannotRegisterSenderStatusStartedError";
	/** 同一ライン/ブロック間以外の移動はできません。 */
	public static final String CHANGE_LINE_BLOCK_NOT_SAME_ERROR = "changeLineBlockNotSameError";
	/** 受注番号は6桁の数字を入力してください */
	public static final String ORDER_NUMBER_INTEGER_LENGTH_ERROR = "orderNumberIntegerLengthError";
	/** この出荷指図は引当が完了しています。 */
	public static final String SOJT_COMPLETED_ERROR = "sojtCompletedError";
	/** 受信した生出番号は既に登録済です。 */
	public static final String RECEIVED_MAKE_NO_DUPLICATE_ERROR = "receivedMakeNoDuplicateError";
	/** 受信した入庫キーは入庫予定に存在しません。 */
	public static final String RECEIVED_RCV_KEY_NOT_FOUND_ERROR = "receivedRcvKeyNotFoundError";
	/** メーカーケースコード内の製造年月日が不正です。入庫キー:[0] 生出番号:[1] */
	public static final String LOT4_IN_MAKER_CASE_CD_DATE_ERROR = "lot4InMakerCaseCdDateError";
	/** メーカーケースコード情報の追加・更新にてエラーが発生しました。 */
	public static final String MAKER_CASE_CD_INSERT_UPDATE_FAILED_ERROR = "makerCaseCdInsertUpdateFailedError";
	/** 既に梱包されています。 */
	public static final String ALREADY_PACK_ERROR = "alreadyPackError";
	/** 既に出庫確定されています。 */
	public static final String ALREADY_SHIP_CONFIRM_ERROR = "alreadyShipConfirmError";
	/** ピッキングの作業が完了していません。 */
	public static final String PICKING_NOT_COMPLETED_ERROR = "pickingNotCompletedError";
	/** 仕分の作業が完了していません。 */
	public static final String SORTING_NOT_COMPLETED_ERROR = "sortingNotCompletedError";
	/** 対象となる配送グループが指定されていません。 */
	public static final String TARGET_DELIVERY_GROUP_NOT_INPUT_ERROR = "targetDeliveryGroupNotInputError";
	/** 配送グループが指定されていません。 */
	public static final String DELIVERY_GROUP_NOT_INPUT_ERROR = "deliveryGroupNotInputError";
	/** 配送グループが異なるものが指定されています。 */
	public static final String DELIVERY_GROUP_DIFFERENT_INPUT_ERROR = "deliveryGroupDifferentInputError";
	/** 対象となる送り状が指定されていません。 */
	public static final String TARGET_WB_NOT_INPUT_ERROR = "targetWbNotInputError";
	/** 送り状が指定されていません。 */
	public static final String WB_NOT_INPUT_ERROR = "wbNotInputError";
	/** 送り状が異なるものが指定されています。 */
	public static final String WB_DIFFERENT_INPUT_ERROR = "wbDifferentInputError";
	/** 製造年月がNULLのため(再)引当は行えません。 */
	public static final String CANNOT_ALLOCATE_MANUFACTURE_DATE_BLANK_ERROR = "cannotAllocateManufactureDateBlankError";
	/** 既に梱包されているため、キャンセルできません。 */
	public static final String CANNOT_CANCEL_PICKED_ALREADY_PACKED_ERROR = "cannotCancelPickedAlreadyPackedError";
	/** 既に出荷検品が行われています。 */
	public static final String CANNOT_CANCEL_PICKED_ALREADY_INSPECTED_ERROR = "cannotCancelPickedAlreadyInspectedError";
	/** リマインダが存在しません。 */
	public static final String RMDR_NOT_FOUND_ERROR = "rmdrNotFoundError";
	/** リマインダが重複しています。 */
	public static final String PACK_RMDR_DUPLICATE_ERROR = "packRmdrDuplicateError";
	/** リマインダの予定数が不足しています。 */
	public static final String PACK_RMDR_EXPECT_QTY_SHORTAGE_ERROR = "packRmdrExpectQtyShortageError";
	/** リマインダが重複して登録されています。 */
	public static final String SHIP_INSPECT_RMDR_DUPLICATE_ERROR = "shipInspectRmdrDuplicateError";
	/** 予定数が不足しています。 */
	public static final String SHIP_INSPECT_RMDR_EXPECT_QTY_SHORTAGE_ERROR = "shipInspectRmdrExpectQtyShortageError";
	/** 検品可能数が不足しています。 */
	public static final String SHIP_INSPECT_RMDR_INSPECTABLE_QTY_SHORTAGE_ERROR = "shipInspectRmdrInspectableQtyShortageError";
	/** 選択されたロケは拠点別銘柄制御マスタによって指定されているため、変更できません。 */
	public static final String CENTER_PRODUCT_CONTROL_MASTER_ERROR = "CenterProductControlMasterError";
	/** 選択されたロケは拠点別銘柄制御マスタによって指定されているため、削除できません。 */
	public static final String CENTER_PRODUCT_CONTROL_MASTER_DEL_ERROR = "CenterProductControlMasterDelError";
	/** 入庫データまたは出庫データで使用されているため処理できません。 */
	public static final String RECEIVE_SHIPPING_DATA_FOUND_ERROR = "receiveShippingDataFoundError";
	/** 削除対象のラインCDがロケーションマスタテーブルで設定されています。 */
	public static final String LOCATION_MASTER_NOT_LINE_CD_ERROR = "locationMasterNotLineCdError";
	/** 削除対象のブロックCDがロケーションマスタテーブルで設定されています。 */
	public static final String LOCATION_MASTER_NOT_BLOCK_CD_ERROR = "locationMasterNotBlockCdError";
	/** 6桁以上入力されています。 */
	public static final String SORTING_LOCATION_CD_LENGTHSIX_ERROR = "sortingLocationCdLengthsixError";
	/** 入力したロケーションはロケーションマスタに存在しません。 */
	public static final String LOCATION_NOT_FOUND_ERROR = "locationNotFoundError";
	/** 過去世代、適用世代のデータは削除できません。 */
	public static final String PAST_GENERATION_APPLICABLE_GENERATION_ERROR = "pastGenerationApplicableGenerationError";
	/** 仕分が完了していないため、検品できません。 */
	public static final String HANDY_CHECKING_UNDER_INSPECTION_SYMBOL_ERROR = "handyCheckingUnderInspectionSymbolError";
	/** 積替場のロケーションCDが取得できない。 */
	public static final String HANDY_PALLET_TRANSSHIPMENT_LOCATION_NOT_FOUND_ERROR = "handyPalletTransshipmentLocationNotFoundError";
	/** たばこ商品区分が不正です。(行：[0]) */
	public static final String ETL_CGGDID_ERROR = "etlCggdidError";
	/** 不要データを受信しました。(行：[0]) */
	public static final String REJECT_DATA_RECEIVED_ERROR = "rejectDataReceivedError";
	/** 入庫予定データにＢＡＴ情報が正しく設定されていないため登録済みＢＡＴ入庫予定情報を削除しました。【削除対象】ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号(明細):{1},【IF内容】ＳＡＰデリバリー番号(ヘッダ):{2},ＳＡＰデリバリー番号(明細):{3},ＢＡＴ搬入依頼拠点CD:{4},ＢＡＴ搬入依頼保管場所CD:{5},パートナー番号（受信）:{6},パートナー番号（送信）:{7},伝票番号:{8} */
	public static final String DELETE_BAT_DUE_TO_TR_DATA_INCONSISTENCY = "deleteBatDueToTrDataInconsistency";
	/** 入庫予定データにＢＡＴ情報が正しく設定されていないため、ＢＡＴ入庫予定情報更新をスキップします。【対象】ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号(明細):{1},ＢＡＴ搬入依頼拠点CD:{2},ＢＡＴ搬入依頼保管場所CD:{3},パートナー番号（受信）:{4},パートナー番号（送信）:{5},伝票番号:{6} */
	public static final String SKIP_UPDATE_BAT_DUE_TO_INCONSISTENCY = "skipUpdateBatDueToInconsistency";
	/** 登録済のＢＡＴ入庫予定情報と一致しない項目があったため削除しました。ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号（明細）:{1} */
	public static final String DELETE_BAT_DUE_TO_DATA_INCONSISTENCY = "deleteBatDueToDataInconsistency";
	/** 登録済のＢＡＴ入庫予定情報が既に完了しているため対象外です。ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号（明細）:{1} */
	public static final String SKIP_DELETE_BAT_DUE_TO_COMPLETE = "skipDeleteBatDueToComplete";
	/** ＢＡＴ搬入依頼拠点CDが拠点と一致しません。ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号(明細):{1},ＢＡＴ搬入依頼拠点CD:{2},拠点CD:{3}, */
	public static final String BAT_WAREHOUSE_CD_NOT_MATCH = "batWarehouseCdNotMatch";
	/** ＢＡＴ搬入依頼拠点CDが存在しません。ＳＡＰデリバリー番号(ヘッダ):{0},ＳＡＰデリバリー番号(明細):{1},ＢＡＴ搬入依頼拠点CD:{2} */
	public static final String BAT_WAREHOUSE_CD_NOT_EXIST = "batWarehouseCdNotExist";
	/** ＢＡＴ入庫予定情報の伝票番号に不正があるため削除しました。ＳＡＰデリバリー番号（ヘッダ）:{0} */
	public static final String BAT_DELI_DETAIL_NUM_INVALID = "batDeliDetailNumInvalid";
	/** 入庫予定データにＢＡＴ情報が正しく設定されていません。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2},ＢＡＴ搬入依頼拠点CD:{3},ＢＡＴ搬入依頼保管場所コード:{4},パートナー番号（受信）:{5},パートナー番号（送信）:{6},伝票番号:{7} */
	public static final String TR_BAT_DATA_INVALID = "trBatDataInvalid";
	/** 登録済のＢＡＴ入庫予定情報と一致しない項目があったため削除しました。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2} */
	public static final String DELETE_BAT_DUE_TO_TR_INCONSISTENCY = "deleteBatDueToTrInconsistency";
	/** 登録済のＢＡＴ入庫予定情報が既に完了しているため対象外です。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2} */
	public static final String SKIP_INSERT_BAT = "skipInsertBat";
	/** ＢＡＴ搬入依頼拠点CDが拠点と一致しません。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2},拠点コード:{3},ＢＡＴ搬入依頼拠点CD:{4} */
	public static final String BAT_WAREHOUSE_CD_NOT_MATCH2 = "batWarehouseCdNotMatch2";
	/** ＢＡＴ搬入依頼拠点CDが存在しません。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2},ＢＡＴ搬入依頼拠点CD:{3} */
	public static final String BAT_WAREHOUSE_CD_NOT_EXIST2 = "batWarehouseCdNotExist2";
	/** ＢＡＴ搬入依頼情報の伝票番号に不正があるため削除しました。入荷予定ヘッダID:{0},【対象】ＳＡＰデリバリー番号（ヘッダ）:{1},ＳＡＰデリバリー番号（明細）:{2} */
	public static final String BAT_DELI_DETAIL_NUM_INVALID2 = "batDeliDetailNumInvalid2";
	/** 指定ロケーションCDはロケーションマスタに存在しません。 */
	public static final String LOCATION_CD_NOT_FOUND_ERROR = "locationCdNotFoundError";
	/** ログインセンタが切り替えられた為、リロードします。 */
	public static final String LOGIN_CENTER_CHANGE_INFO = "loginCenterChangeInfo";
	/** 最大格納数を入力して下さい。 */
	public static final String MAX_STORE_NUM_NOT_INPUT_ERROR = "maxStoreNumNotInputError";
	/** 該当データは梱包明細修正ができない状態に変更されました。 */
	public static final String PACKING_LIST_UPDATE_DATA_ALREADY_UPDATED_ERROR = "packingListUpdateDataAlreadyUpdatedError";
	/** 商品CDは最大30文字以下を入力して下さい。 */
	public static final String PRODUCT_CD_CHECK_INPUT_MAX_ERROR = "productCdCheckInputMaxError";
	/** 商品CDは商品マスタに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_ERROR = "productCdNotFoundError";
	/** 商品CDを入力して下さい。 */
	public static final String PRODUCT_CD_NOT_INPUT_ERROR = "productCdNotInputError";
	/** 商品CDが重複しています。 */
	public static final String PRODUCT_CODE_DUPLICATE_ERROR = "productCodeDuplicateError";
	/** 商品CDが商品マスタに存在しません。 */
	public static final String PRODUCT_CODE_NOT_FOUND_ERROR = "productCodeNotFoundError";
	/** 補充点を入力して下さい。 */
	public static final String REPLENISH_P_NUM_NOT_INPUT_ERROR = "replenishPNumNotInputError";
	/** 該当データは出荷検品できない状態に変更されました。 */
	public static final String SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR = "shippingInspectDataAlreadyUpdatedError";
	/** 引当可能な在庫がありません。 */
	public static final String STOCK_CAN_BE_ALLOCATE_NOT_FOUND_INFORMATION = "stockCanBeAllocateNotFoundInformation";
	/** 在庫区分が存在しません。 */
	public static final String STOCK_TYPE_NOT_FOUND_ERROR = "stockTypeNotFoundError";
	/** 作業者CDが存在しません。 */
	public static final String USER_CD_NOT_FOUND_ERROR = "userCdNotFoundError";
	/** 作業者CD・パスワードに誤りがあるか、作業者CDが存在しません。 */
	public static final String USER_CD_OR_PASSWORD_INPUT_ERROR = "userCdOrPasswordInputError";
	/** 既に休憩開始されています。 */
	public static final String BREAK_START_DUPLICATE_ERROR = "breakStartDuplicateError";
	/** 他センタで出勤されていますので、出勤したセンタに切り替えてください。 */
	public static final String ALREADY_ATTENDANCE_ANOTHER_ERROR = "alreadyAttendanceAnotherError";
	/** 未処理データ保持期間が設定されているため、EC受注データの保持期間を削除なしに設定できません。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_D_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalDKeepingDaysError";
	/** トランザクション保持期間が設定されているため、EC受注データの保持期間を削除なしに設定できません。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_T_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalTKeepingDaysError";
	/** EC受注データの保持期間が未処理データ保持期間より長く設定されています。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_UNPROCESS_KEEP_DAYS_ERROR = "dailyProcessCannotExecuteIllegalUnprocessKeepDaysError";
	/** 受注番号が設定されていない行があるため取込み出来ません。 */
	public static final String EC_ORDER_NECESSARY_ORDER_NO_ERROR = "ecOrderNecessaryOrderNoError";
	/** 時刻の入力が不正です(形式:hhmm)。 */
	public static final String HANDY_TIME_ERROR = "handyTimeError";
	/** マージ状態区分が「失敗」の出庫予定が存在します。 */
	public static final String MERGE_STATUS_FAILURE_ERROR = "mergeStatusFailureError";
	/** データが存在しないため、帳票を印刷できません。 */
	public static final String PRINT_DATA_NOT_FOUND_ERROR = "printDataNotFoundError";
	/** 引当制御マスタ更新[バッチ] */
	public static final String ALLOCATE_CONTROL_MASTER_UPDATE_PROGRAM_NAME_INFORMATION = "allocateControlMasterUpdateProgramNameInformation";
	/** 受入デザインマスタ更新[バッチ] */
	public static final String RECEIVE_DESIGN_MASTER_UPDATE_PROGRAM_NAME_INFORMATION = "receiveDesignMasterUpdateProgramNameInformation";
	/** 方面属性マスタ更新[バッチ] */
	public static final String DIRECTION_ATTRIBUTE_MASTER_UPDATE_PROGRAM_NAME_INFORMATION = "directionAttributeMasterUpdateProgramNameInformation";
	/** パレットはり紙のバーコードをスキャンしてください。 */
	public static final String INPUT_RESTRICTIONS_PALLET_NO_ERROR = "inputRestrictionsPalletNoError";
	/** パレットはり紙情報が存在しません。 */
	public static final String PALLET_NOT_FOUND_ERROR = "palletNotFoundError";
	/** このパレットはり紙は格納済ではありません。 */
	public static final String PALLET_STATUS_NOT_STORED_ERROR = "palletStatusNotStoredError";
	/** このパレットはり紙は既にスキャンされています。 */
	public static final String PALLET_DUPLICATE_ERROR = "palletDuplicateError";
	/** この2次元バーコードの銘柄コードは存在しません。 */
	public static final String HANDY_INPUT_BRAND_NOT_FOUND_ERROR = "handyInputBrandNotFoundError";
	/** 継続補充可能な補充回数を超えています。 */
	public static final String HANDY_EXCEEDING_MAXIMUM_NNUMBER_OF_CONTINUATIONS_ERROR = "handyExceedingMaximumNnumberOfContinuationsError";
	/** 1桁目は数字を入力してください。 */
	public static final String HEAD_INPUT_LIMIT_CHECK_NUMERIC_ERROR = "headInputLimitCheckNumericError";
	/** この２次元バーコードの流通識別に対応するデザイン区分が設定されていません。 */
	public static final String HANDY_INPUT_DISTRIBUTION_NOT_FOUND_ERROR = "handyInputDistributionNotFoundError";
	/** 一括編集 */
	public static final String BULK_UPDATE = "bulkUpdate";
	/** 返品ステータス変更 */
	public static final String RTN_STATUS_CHANGE_CONDITION = "rtnStatusChangeCondition";
	/** 返品適品チェックリスト発行 */
	public static final String CHECK_LIST_PRINT_CONDITION = "checkListPrintCondition";
	/** 利用できる不定ロケが不足しています。 */
	public static final String INDETERMINATE_LOCATION_SHORTAGE_ERROR = "indeterminateLocationShortageError";
	/** 箱跨り区拒否区分が混在しています。 */
	public static final String MIXED_BOX_CROSSING_REGECTION_ERROR = "mixedBoxCrossingRegectionError";
	/** ライン/ブロックを入力してください。 */
	public static final String LINE_BLOCK_COMBO_BOX_NOT_INPUT_ERROR = "lineBlockComboBoxNotInputError";
	/** 入力した補充方式では指定できない切り上げ単位が入力されています。 */
	public static final String REPLENISHMENT_METHODT_ERROR = "replenishmentMethodtError";
	/** ラインマスタに存在しません。 */
	public static final String LINE_NOT_FOUND_ERROR = "lineNotFoundError";
	/** ブロックマスタに存在しません。 */
	public static final String BLOCK_NOT_FOUND_ERROR = "blockNotFoundError";
	/** 過不足報告場所を入力して下さい。 */
	public static final String DIFFOCCAREA_REQUIRE_ERROR = "diffoccareaRequireError";
	/** 指示No.は整数[0]桁以内を入力して下さい。 */
	public static final String FLEXLNS_NO_CHECK_INPUT_INTEGER_ERROR = "flexlnsNoCheckInputIntegerError";
	/** 発送予定日は最大[0]文字以下を入力して下さい。 */
	public static final String SCH_DATE_CHECK_INPUT_MAX_ERROR = "schDateCheckInputMaxError";
	/** 受入予定日は最大[0]文字以下を入力して下さい。 */
	public static final String RCV_DATE_CHECK_INPUT_MAX_ERROR = "rcvDateCheckInputMaxError";
	/** 発送先CDは最大[0]文字以下を入力して下さい。 */
	public static final String SHIP_CD_CHECK_INPUT_MAX_ERROR = "shipCdCheckInputMaxError";
	/** 銘柄CDは最大[0]文字以下を入力して下さい。 */
	public static final String PRODUCT_CD_CHECK_INPUT_MAX_LENGTH_ERROR = "productCdCheckInputMaxLengthError";
	/** 製造年月日は最大[0]文字以下を入力して下さい。 */
	public static final String MANUFACTURE_DATE_CHECK_INPUT_MAX_ERROR = "manufactureDateCheckInputMaxError";
	/** デザイン区分は最大[0]文字以下を入力して下さい。 */
	public static final String DESIGN_TYPE_CHECK_INPUT_MAX_ERROR = "designTypeCheckInputMaxError";
	/** 数量(個数)は整数[0]桁以内を入力して下さい。 */
	public static final String QTY_CHECK_INPUT_INTEGER_ERROR = "qtyCheckInputIntegerError";
	/** 画面更新者は最大[0]文字以下を入力して下さい。 */
	public static final String FLEXIBITY_UPD_USER_CHECK_INPUT_MAX_ERROR = "flexibityUpdUserCheckInputMaxError";
	/** 数量(個数)を入力して下さい。 */
	public static final String QTY_NOT_INPUT_ERROR = "qtyNotInputError";
	/** 銘柄CDが銘柄マスタに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_IN_PRODUCT_MASTER_ERROR = "productCdNotFoundInProductMasterError";

}