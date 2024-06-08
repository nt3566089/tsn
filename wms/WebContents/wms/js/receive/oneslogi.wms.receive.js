angular.module('oneslogiWms.Receive',
		[
		 'oneslogiWms.ReceivePlanInput',
		 'oneslogiWms.SlipNoReceiveList',
		 'oneslogiWms.ProductReceiveList',
		 'oneslogiWms.ReceivePlanListPrint',
		 'oneslogiWms.ReceivePlanBulkInput',
		 'oneslogiWms.ReceivePartList',
		 'oneslogiWms.ReceiveInputNo',
		 'oneslogiWms.ReceiveInput',
		 'oneslogiWms.StoreLabelPrint',
		 'oneslogiWms.ClassLabelPrint',
		 'oneslogiWms.ReceiveStatusProgress',
		 // 履歴検索 入荷履歴画面新規作成 2016.6.29 Soe Thiha Tun Add Start
		 'oneslogiWms.ReceiveHistory',
		 // 履歴検索 入荷履歴画面新規作成 2016.6.29 Soe Thiha Tun Add End
		 //[ver3.0] [#3135] 商品別入荷一覧(参照)画面を新規作成 2017.12.11 matsumoto Start
		 'oneslogiWms.ReferenceProductReceiveList'
		 //[ver3.0] [#3135] 商品別入荷一覧(参照)画面を新規作成 2017.12.11 matsumoto End
		 ]
);