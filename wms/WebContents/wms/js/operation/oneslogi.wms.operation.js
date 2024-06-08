angular.module('oneslogiWms.Operation',
		[
		 'oneslogiWms.AttendanceEntry',
		 'oneslogiWms.ModalError'
		 // [TSN] KGL090107_作業量照会追加 2024.03.25 Uchida ADD Start
		 ,'oneslogiWms.WorkloadInquiry'
		 // [TSN] KGL090107_作業量照会追加 2024.03.25 Uchida ADD End
		 ]
);