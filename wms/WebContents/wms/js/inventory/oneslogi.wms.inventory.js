angular.module('oneslogiWms.Inventory',
		[
		 'oneslogiWms.InventoryDiffListPrint',
		 'oneslogiWms.InventoryWorkListPrint',
		 'oneslogiWms.InventoryCreate',
		 'oneslogiWms.InventoryHistorySearch',
		 'oneslogiWms.InventoryInput',
		 'oneslogiWms.InventoryInputAddRow',
		 'oneslogiWms.InventoryBulkUpdate',
		 // 在庫調査指示一覧画面新規作成 2024.4.24 ma Start
		 'oneslogiWms.InstKeyList',
		 // 在庫調査指示一覧画面新規作成 2024.4.24 ma End
		 // 履歴検索 棚卸履歴画面新規作成 2016.7.6 Myo Min Oo Add Start
		 'oneslogiWms.InventoryHistory'
		 // 履歴検索 棚卸履歴画面新規作成 2016.7.6 Myo Min Oo Add End
		 ]
);