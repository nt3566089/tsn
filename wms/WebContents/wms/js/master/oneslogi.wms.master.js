angular.module('oneslogiWms.Master',
		[
		 'oneslogiWms.WarehouseMaster',
		 'oneslogiWms.LocationBarcodeListPrint',
		 'oneslogiWms.CenterClassList',
		 'oneslogiWms.CenterClassEdit',
		 'oneslogiWms.CenterClassGrpEdit',
		 'oneslogiWms.CenterClassGrpDtlEdit',
		 'oneslogiWms.ClientMaster',
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		 'oneslogiWms.CarrierMasterList',
		 'oneslogiWms.CarrierMasterEdit',
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		 'oneslogiWms.LocationMaster',
		 // 2016.02.26 Pan 一覧編集 ※4 Start
		 'oneslogiWms.LocationMasterEdit',
		 // 2016.02.26 Pan 一覧編集 ※4 End
		 //[TSN] 拠点別銘柄制御マスタメンテナンス 一覧編集 2024/02/05  Start
		 'oneslogiWms.CenterProductControlMasterList',
		 'oneslogiWms.CenterProductControlMasterEdit',
		 //[TSN] 拠点別銘柄制御マスタメンテナンス 一覧編集 2024/02/05  End
		 'oneslogiWms.DeliveryCourseMasterList',
		 'oneslogiWms.DeliveryCourseMasterEdit',
		 'oneslogiWms.CustomerMasterList',
		 'oneslogiWms.CustomerMasterEdit',
		 'oneslogiWms.ZoneMaster',
		 'oneslogiWms.CarrierSlipYmtMaster',
		 // 2016.03.03 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.CarrierSlipYmtMasterEdit',
		 'oneslogiWms.CarrierSlipSgwMasterEdit',
		 'oneslogiWms.CarrierSlipYupkMasterEdit',
		 // 2016.03.03 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.CarrierSlipYupkMaster',
		 'oneslogiWms.CarrierSlipSgwMaster',
		 'oneslogiWms.ProcessTypeMaster',
		 'oneslogiWms.StockTypeMaster',
		 'oneslogiWms.ProductMasterList',
		 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
		 'oneslogiWms.ProductMasterListNum',
		 //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
		 'oneslogiWms.ZipMaster',
		 // 2016.02.23 Zhang 一覧編集 ※4 Start
		 'oneslogiWms.ZipMasterEdit',
		 'oneslogiWms.ParameterMasterEdit',
		 // 2016.02.23 Zhang 一覧編集 ※4 End
		 'oneslogiWms.ProductMasterEdit',
		 'oneslogiWms.BoxMaster',
		 'oneslogiWms.CenterMasterEdit',
		 'oneslogiWms.CenterMasterList',
		 'oneslogiWms.UserEdit',
	     'oneslogiWms.CenterClientScreenMaster',
		 'oneslogiWms.CenterClientScreenItemMaster',
		 'oneslogiWms.CenterClientScreenColMaster',
		 'oneslogiWms.EdiEdit',
		 'oneslogiWms.EdiList',
		 'oneslogiWms.MatchingMaster',
		 'oneslogiWms.ProductMasterBulkInput',
		 'oneslogiWms.ImportTypeMasterList',
		 'oneslogiWms.ImportTypeMasterEdit',
		 'oneslogiWms.ImportTypeBCopyColumnInput',
		 'oneslogiWms.CustomerMasterBulkInput',
		 'oneslogiWms.SetStructureEdit',
		 'oneslogiWms.SetStructureSearch',
		 'oneslogiWms.ShapeMaster',
		 'oneslogiWms.ProductShapeMasterBulkInput',
		 'oneslogiWms.LocationMasterBulkInput',
		 'oneslogiWms.BoxGroupMasterList',
		 'oneslogiWms.BoxGroupMasterEdit',
		// [Ver3.0] unit of measure対応 2017.11.21 PYM Start
		 'oneslogiWms.ShapeGroupMasterList',
		 'oneslogiWms.ShapeGroupMasterEdit',
		// [Ver3.0] unit of measure対応 2017.11.21 PYM End
		//キャリアEDIシステム(CES)連携対応 2018.01.15 LSW Start
		 'oneslogiWms.CarrierSlipCESMaster',
		 'oneslogiWms.CarrierSlipCESMasterEdit',
		//キャリアEDIシステム(CES)連携対応 2018.01.15 LSW End
		 'oneslogiWms.NumberingCenterMaster',
		// [#2166] 2017.8.4 ase Start
		 'oneslogiWms.CenterRelatedCopy',
		// [#2166] 2017.8.4 ase End
		// [#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara Start
		 'oneslogiWms.HTDictCultureMaster',
		// [#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara End
		// [#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara Start
		 'oneslogiWms.HTMessageMaster',
		// [#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara End
		// [#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara Start
		 'oneslogiWms.HTDictMaster',
		// [#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara End
		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add Start
		 'oneslogiWms.UserMasterList',
		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add End
		// [#5145] [Ver3.1]  WEBHT管理マスタメンテナンス画面追加 2018.07.23  takeda Start
		 'oneslogiWms.WebHTinfoMaster',
		// [#5145] [Ver3.1]  WEBHT管理マスタメンテナンス画面追加 2018.07.23  takeda End
		// [#5237] [Ver3.1]  郵便番号マスタ一括取込画面追加 2018.08.21  takeda Start
		'oneslogiWms.ZipMasterBulkInput',
		// [#5237] [Ver3.1]  郵便番号マスタ一括取込画面追加 2018.08.21  takeda End
		// 引当制御マスタメンテナンス画面追加 2024.03.06 Mawake Add Start
		 'oneslogiWms.AllocateControlMasterList',
		// 引当制御マスタメンテナンス画面追加 2024.03.06 Mawake Add End
		// 引当制御マスタメンテナンス画面追加 2024.03.13 Mawake Add Start
		 'oneslogiWms.AllocateControlMasterEdit',
		// 引当制御マスタメンテナンス画面追加 2024.03.13 Mawake Add End

		//[WMS_3.1a.2.2]たな卸実施日マスタメンテナンス一覧追加 2024/03/06 ma-urate ADD [S]
		 'oneslogiWms.InventoryDateMasterList',
		//[WMS_3.1a.2.2]たな卸実施日マスタメンテナンス一覧追加 2024/03/06 ma-urate ADD [E]
		//[WMS_3.1a.2.2]たな卸実施日マスタメンテナンス編集追加 2024/03/22 ma-urate ADD [S]
		 'oneslogiWms.InventoryDateMasterEdit',
        //[WMS_3.1a.2.2]たな卸実施日マスタメンテナンス編集追加 2024/03/22 ma-urate ADD [E]
        //[WMS_3.1a.2.2]受入デザインマスタメンテナンス(一覧)画面追加 2024.04.05 urate Add Start
		 'oneslogiWms.ReceiveDesignMasterList',
        //[WMS_3.1a.2.2]受入デザインマスタメンテナンス(一覧)画面追加 2024.04.05 urate Add End [E]
		//月替り・デザイン変更情報マスタメンテナンス画面追加 2024/03/28 ka.seo.ub ADD [S]
		 'oneslogiWms.MonthlyDesignChangeInfoMaster'
		//月替り・デザイン変更情報マスタメンテナンス画面追加 2024/03/28 ka.seo.ub ADD [E]
		 ]
);