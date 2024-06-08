angular.module('oneslogiWms.EcOrder',
		[
		'oneslogiWms.EcOrderList',
		'oneslogiWms.EcOrderBulkInput',
		'oneslogiWms.EcShippingTagDataOutput',
		// [C-CWMS-0024]  住所変更機能を追加  2015.04.06 kyo Start
		'oneslogiWms.EcDelivAddressModify'
		// [C-CWMS-0024]  住所変更機能を追加  2015.04.06 kyo End
		 ]
);