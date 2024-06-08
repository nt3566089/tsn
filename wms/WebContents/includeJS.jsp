<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*" %>

<!-- システム共通 -->
<!-- build:js wms/js/oneslogi.wms.common.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/common/oneslogi.wms.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/common/SelectClient.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/common/DataInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/common/BarcodeLabelBulkPrint.js", request) %>"></script>
<!-- endbuild -->

<!-- 共通検索 -->
<!-- build:js wms/js/oneslogi.wms.assist.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/assist/oneslogi.wms.assist.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/ProductMasterSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/VendorMasterSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/DeliveryCourseSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/DeliveryMasterSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/LocationMasterSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/ZipMasterSearch.js", request) %>"></script>
<!-- endbuild -->

<!-- 入荷 -->
<!-- build:js wms/js/oneslogi.wms.receive.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/receive/oneslogi.wms.receive.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceivePlanInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/SlipNoReceiveList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ProductReceiveList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceivePlanBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceivePlanListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceivePartList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/StoreLabelPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ClassLabelPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceiveInputNo.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceiveInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceiveStatusProgress.js", request) %>"></script>
<!-- //[ver3.0] [#3135] 商品別入荷一覧(参照)画面を新規作成 2017.12.11 matsumoto Start -->
<script src="<%= appendFileUpdateDt("wms/js/receive/ReferenceProductReceiveList.js", request) %>"></script>
<!-- //[ver3.0] [#3135] 商品別入荷一覧(参照)画面を新規作成 2017.12.11 matsumoto End -->
<!-- 履歴検索 入荷履歴画面新規作成 2016.6.29 Soe Thiha Tun Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceiveHistory.js", request) %>"></script>
<!-- 履歴検索 入荷履歴画面新規作成 2016.6.29 Soe Thiha Tun Add End -->
<!-- endbuild -->

<!-- マスタ -->
<!-- build:js wms/js/oneslogi.wms.master.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/master/oneslogi.wms.master.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/WarehouseMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/LocationBarcodeListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ClientMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ProductMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ProductMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ProductMasterBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ZipMaster.js", request) %>"></script>
<!-- 2016.02.23 Zhang 一覧編集 ※4 Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/ZipMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ParameterMasterEdit.js", request) %>"></script>
<!-- 2016.02.23 Zhang 一覧編集 ※4 End -->
<!-- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierMasterEdit.js", request) %>"></script>
<!-- [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End -->
<script src="<%= appendFileUpdateDt("wms/js/master/LocationMaster.js", request) %>"></script>
<!-- 2016.02.26 Pan 一覧編集 ※4 Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/LocationMasterEdit.js", request) %>"></script>
<!-- 2016.02.26 Pan 一覧編集 ※4 End -->
<!-- [TSN] 拠点別銘柄制御マスタメンテナンス 一覧編集 2024/02/05  Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/CenterProductControlMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterProductControlMasterEdit.js", request) %>"></script>
<!-- [TSN] 拠点別銘柄制御マスタメンテナンス 一覧編集 2024/02/05  End -->
<script src="<%= appendFileUpdateDt("wms/js/master/DeliveryCourseMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/DeliveryCourseMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CustomerMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CustomerMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CustomerMasterBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ZoneMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipYmtMaster.js", request) %>"></script>
<!-- 2016.03.03 Zhang 一覧編集 ※4 Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipYmtMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipSgwMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipYupkMasterEdit.js", request) %>"></script>
<!-- 2016.03.03 Zhang 一覧編集 ※4 End -->
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipYupkMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipSgwMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ProcessTypeMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/StockTypeMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClientScreenMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClientScreenItemMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClientScreenColMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/UserEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/EdiList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/EdiEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/MatchingMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ImportTypeMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ImportTypeMasterEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClassList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClassEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClassGrpEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CenterClassGrpDtlEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ImportTypeBCopyColumnInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/SetStructureEdit.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/SetStructureSearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ShapeMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ProductShapeMasterBulkInput.js", request) %>"></script>
<!-- 2016.03.30 HDIS Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/LocationMasterBulkInput.js", request) %>"></script>
<!-- 2016.03.30 HDIS End -->
<script src="<%= appendFileUpdateDt("wms/js/master/BoxGroupMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/BoxGroupMasterEdit.js", request) %>"></script>
<!-- [Ver3.0] unit of measure対応 2017.11.21 PYM Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/ShapeGroupMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/ShapeGroupMasterEdit.js", request) %>"></script>
<!-- [Ver3.0] unit of measure対応 2017.11.21 PYM End -->
<!-- キャリアEDIシステム(CES)連携対応 2018.01.15 LSW Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipCESMaster.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/CarrierSlipCESMasterEdit.js", request) %>"></script>
<!-- キャリアEDIシステム(CES)連携対応 2018.01.15 LSW End -->
<!-- [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/ProductMasterListNum.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/master/NumberingCenterMaster.js",request) %>"></script>
<!-- //[Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End -->
<!-- センタ関連マスタ作成画面新規作成 2017.8.4 Ase Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/CenterRelatedCopy.js", request) %>"></script>
<!-- センタ関連マスタ作成画面新規作成 2017.8.4 Ase Add End -->
<!-- //[#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara Start  -->
<script src="<%= appendFileUpdateDt("wms/js/master/HTDictCultureMaster.js",request) %>"></script>
<!-- //[#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara End-->
<!-- //[#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara Start  -->
<script src="<%= appendFileUpdateDt("wms/js/master/HTMessageMaster.js",request) %>"></script>
<!-- //[#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara End  -->
<!-- //[#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara Start  -->
<script src="<%= appendFileUpdateDt("wms/js/master/HTDictMaster.js",request) %>"></script>
<!-- //[#2873] [HTマスタ化対応]  HT辞書マスタメンテナンス画面追加 2017.10.26 fujiwara End  -->
<!-- // [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/UserMasterList.js", request) %>"></script>
<!-- // [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 2017.12.05 honma Add End -->
<!-- // [#5145][Ver3.1] WEBHT管理マスタメンテナンス画面追加 2018.07.23 takeda Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/WebHTinfoMaster.js", request) %>"></script>
<!-- // [#5145][Ver3.1] WEBHT管理マスタメンテナンス画面追加 2018.07.23 takeda Add End -->
<!-- // [#5237][Ver3.1] 郵便番号マスタ一括取込画面追加 2018.08.21 takeda Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/ZipMasterBulkInput.js", request) %>"></script>
<!-- // [#5237][Ver3.1] 郵便番号マスタ一括取込画面追加 2018.08.21 takeda Add End -->
<!-- 引当制御マスタメンテナンス一覧画面追加 2024.03.06 Mawake Add Start  -->
<script src="<%= appendFileUpdateDt("wms/js/master/AllocateControlMasterList.js", request) %>"></script>
<!-- 引当制御マスタメンテナンス一覧画面追加 2024.03.06 Mawake Add End  -->
<!-- 引当制御マスタメンテナンス編集画面追加 2024.03.13 Mawake Add Start  -->
<script src="<%= appendFileUpdateDt("wms/js/master/AllocateControlMasterEdit.js", request) %>"></script>
<!-- 引当制御マスタメンテナンス編集画面追加 2024.03.13 Mawake Add End  -->
<!-- //  たな卸実施日マスタメンテナンス(一覧)画面追加 2024.03.5 urate Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/InventoryDateMasterList.js", request) %>"></script>
<!-- //  たな卸実施日マスタメンテナンス(一覧)画面追加 2024.03.5 urate Add End -->
<!-- //  たな卸実施日マスタメンテナンス(編集)画面追加 2024.03.22 urate Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/InventoryDateMasterEdit.js", request) %>"></script>
<!-- //  たな卸実施日マスタメンテナンス(編集)画面追加 2024.03.22 urate Add End -->
<!-- //  受入デザインマスタメンテナンス(一覧)画面追加 2024.04.05 urate Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/master/ReceiveDesignMasterList.js", request) %>"></script>
<!-- //  受入デザインマスタメンテナンス(一覧)画面追加 2024.04.05 urate Add End -->
<!-- endbuild -->

<!-- 棚卸 -->
<!-- build:js wms/js/oneslogi.wms.inventory.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/inventory/oneslogi.wms.inventory.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryHistorySearch.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryCreate.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryDiffListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryWorkListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryInputAddRow.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryBulkUpdate.js", request) %>"></script>
<!-- 履歴検索 棚卸履歴画面新規作成 2016.7.6 Myo Min Oo Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryHistory.js", request) %>"></script>
<!-- 履歴検索 棚卸履歴画面新規作成 2016.7.6 Myo Min Oo Add End -->
<!-- endbuild -->

<!-- 在庫 -->
<!-- build:js wms/js/oneslogi.wms.stock.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/stock/oneslogi.wms.stock.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockList.js", request) %>"></script>
<!-- [ver3.0] [#3138] 在庫問合せ(参照)画面新規追加 2017.12.26 matsumoto Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/ReferenceStockList.js", request) %>"></script>
<!-- [ver3.0] [#3138] 在庫問合せ(参照)画面新規追加 2017.12.26 matsumoto End -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockInOutList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockAdj.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockMove.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/TotalStockList.js", request) %>"></script>
<!-- [Ver3.0][#3137] トータル在庫問合せ（参照）追加 2017.12.25 Shimizu Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/ReferenceTotalStockList.js", request) %>"></script>
<!-- [Ver3.0][#3137] トータル在庫問合せ（参照）追加 2017.12.25 Shimizu Add End -->
<script src="<%= appendFileUpdateDt("wms/js/stock/MoveLabelPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockSetInst.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockSetRelease.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockMoveList.js", request) %>"></script>
<!-- [C-CWMS-0057] 2016.07.15 ATK  Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockMoveBodyList.js", request) %>"></script>
<!-- [C-CWMS-0057] 2016.07.15 ATK  End -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockMoveInstList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockSetInstListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/StockSetReleaseListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/ReplenishInstList.js", request) %>"></script>
<!-- 履歴検索 在庫移動履歴画面新規作成 2016.6.21 Kudo Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockMoveHistory.js", request) %>"></script>
<!-- 履歴検索 在庫移動履歴画面新規作成 2016.6.21 Kudo Add End -->
<!-- シリアル管理機能追加 2017.02.20 sja Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/SerialNoList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/SerialNoBulkInput.js", request) %>"></script>
<!-- //シリアル管理機能追加 2017.02.20 sja End -->
<!-- [#2233] 在庫一括移動指示機能追加 2017.08.16 Ase Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockBulkMove.js", request) %>"></script>
<!-- [#2233] 在庫一括移動指示機能追加 2017.08.16 Ase Add End -->
<!-- 仕分場構成マスタメンテナンス画面新規追加 2024.03.05 M.Sato Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/SortingPlaceMasterList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/SortingPlaceMasterEdit.js", request) %>"></script>
<!-- 仕分場構成マスタメンテナンス画面新規追加 2024.03.05 M.Sato Add End -->
<!-- 梱包箱情報マスタメンテナンス画面新規追加 2024.03.05 ka.seo.ub Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/BoxMaster.js", request) %>"></script>
<!-- 仕分場構成マスタメンテナンス画面新規追加 2024.03.05 ka.seo.ub Add End -->
<!-- 出庫パレット情報照会画面新規追加 2024.03.13 N.Okajima Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/ShippingPalleteInfoInquiry.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/stock/ShippingPalleteInfoInquiryDetail.js", request) %>"></script>
<!-- 出庫パレット情報照会画面新規追加 2024.03.13 N.Okajima Add End -->
<!-- [TSN] 国免在庫照合画面新規追加 2024.03.29 S.Kimura Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/StockCheck.js", request) %>"></script>
<!-- [TSN] 国免在庫照合画面新規追加 2024.03.29 S.Kimura Add End -->
<!-- 段ボール移動履歴画面新規追加 2024.04.04 Kim Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/stock/CardboardMoveHistory.js", request) %>"></script>
<!-- 段ボール移動履歴画面新規追加 2024.04.04 Kim Add End -->
<!-- 在庫調査関連リスト出力画面新規作成 2024.05.10 LSC Add START -->
<script src="<%= appendFileUpdateDt("wms/js/stock/InventoryReportPrint.js", request) %>"></script>
<!-- 在庫調査関連リスト出力画面新規作成 2024.05.10 LSC Add END -->


<!-- endbuild -->

<!-- 出荷 -->
<!-- build:js wms/js/oneslogi.wms.shipping.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/oneslogi.wms.shipping.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PickingListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/DeliveryCourseShippingList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ProductShippingList.js", request) %>"></script>
<!-- [Ver3.0][#3136] 商品別出荷一覧（参照）追加 2017.12.11 Shimizu Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ReferenceProductShippingList.js", request) %>"></script>
<!-- [Ver3.0][#3136] 商品別出荷一覧（参照）追加 2017.12.11 Shimizu Add End -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingInstList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingConfirmList.js", request) %>"></script>
<!-- 米国出荷ドキュメント追加対応 2018.01.05 PYM Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingConfirmListCarrierTraceNum.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/BillOfLadingPrint.js", request) %>"></script>
<!-- 米国出荷ドキュメント追加対応 2018.01.05 PYM End -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingInstDetail.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingUpdate.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingInputNoPlan.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/DeliverySlipListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/StwListPrint.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingPlanInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingWorkRefUpdate.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingPlanBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingLotList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PackingListUpdate.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PieceShippingInspect.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PieceShippingInspectBox.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PieceShippingInspectSu.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingTagDataOutput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingStatusProgress.js", request) %>"></script><script src="<%= appendFileUpdateDt("wms/js/shipping/PackingList.js", request) %>"></script>
<!-- 履歴検索 出荷履歴画面新規作成 2016.7.6 Linn Linn Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ShippingHistory.js", request) %>"></script>
<!-- 履歴検索 出荷履歴画面新規作成 2016.7.6 Linn Linn Add End -->
<!-- 履歴検索 梱包履歴画面新規作成 2016.6.20 Myo Min Oo Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/PackingHistory.js", request) %>"></script>
<!-- 履歴検索 梱包履歴画面新規作成 2016.6.20 Myo Min Oo Add End -->
<!-- [#5115][v3.1] 単行出荷検品画面 新規作成 2018/07/09 fujiwara Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/SingleRowShippingInspect.js", request) %>"></script>
<!-- [#5115][v3.1] エラーモーダル画面 新規作成 2018/07/18 fujiwara Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ModalLargeErrorDialog.js", request) %>"></script>
<!-- [#5115][v3.1] エラーモーダル画面 新規作成 2018/07/18 fujiwara End -->
<!-- [#5115][v3.1] 警告モーダル画面 新規作成 2018/07/18 fujiwara Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ModalLargeWarnDialog.js", request) %>"></script>
<!-- [#5115][v3.1] 警告モーダル画面 新規作成 2018/07/18 fujiwara End -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ModalLargeWorkInstNum.js", request) %>"></script>
<!-- [#5115][v3.1] 単行出荷検品画面 新規作成 2018/07/09 fujiwara End -->
<!-- [#5105][v3.1] ピッキング提案画面新規作成 2018.7.10 Fujiwara Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/PickingMethodRecommendation.js", request) %>"></script>
<!-- [#5105][v3.1] ピッキング提案画面新規作成 2018.7.10 Fujiwara Add End -->
<!-- [#5106][v3.1] ピッキング提案明細画面新規作成 2018.7.11 Fujiwara Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/PickingMethodRecommendationDetail.js", request) %>"></script>
<!-- [#5106][v3.1] ピッキング提案明細画面新規作成 2018.7.11 Fujiwara Add End -->
<!-- 【TSN KGL030301_保税出庫関連リスト出力】 2024.02.26 K.SATO ADD [S] -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/BondedShippingRelationListPrint.js", request) %>"></script>
<!-- 【TSN KGL030301_保税出庫関連リスト出力】 2024.02.26 K.SATO ADD [E] -->
<!-- 【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.11 K.SATO ADD [S] -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/PickingListRePrint.js", request) %>"></script>
<!-- 【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.11 K.SATO ADD [E] -->
<!-- 月替り・デザイン変更情報マスタメンテナンス画面追加 2024.03.18 Seo Add Start  -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/MonthlyDesignChangeInfoMaster.js", request) %>"></script>
<!-- 月替り・デザイン変更情報マスタメンテナンス画面追加 2024.03.18 Seo Add End  -->
<!-- 配車実績入力画面新規作成 2024.05.20 LSC Add START -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/ReplenishInstBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/DispatchRecordInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/DispatchRecordInputEdit.js", request) %>"></script>
<!-- 配車実績入力画面新規作成 2024.05.20 LSC Add END -->

<!-- endbuild -->

<!-- 【TSN 運用メニュー】 2024.03.25 Uchida ADD Start -->
<!-- 運用 -->
<!-- build:js wms/js/oneslogi.wms.operation.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/operation/oneslogi.wms.operation.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/operation/AttendanceEntry.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/operation/ModalError.js", request) %>"></script>
<!-- 【TSN KGL090107_作業量照会】 2024.03.25 Uchida ADD Start -->
<script src="<%= appendFileUpdateDt("wms/js/operation/WorkloadInquiry.js", request) %>"></script>
<!-- 【TSN KGL090107_作業量照会】 2024.03.25 Uchida ADD End -->
<!-- endbuild -->
<!-- 【TSN 運用メニュー】 2024.03.25 Uchida ADD End -->


<!-- 日次 -->
<!-- build:js wms/js/oneslogi.wms.daily.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/daily/Daily.js", request) %>"></script>
<!-- endbuild -->

<!-- ECオーダー -->
<!-- build:js wms/js/oneslogi.wms.ecorder.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/ecorder/oneslogi.wms.ecorder.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/ecorder/EcOrderList.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/ecorder/EcOrderBulkInput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/ecorder/EcShippingTagDataOutput.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/ecorder/EcDelivAddressModify.js", request) %>"></script>
<!-- endbuild -->

<!-- 返品管理 -->
<!-- build:js wms/js/oneslogi.wms.returns.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/returns/oneslogi.wms.returns.js", request) %>"></script>
<!-- 【TSN KGL040702_不適品ラベル出力】 2024.04.15 ta.ando Add Start -->
<script src="<%= appendFileUpdateDt("wms/js/returns/NonconformityLabelPrint.js", request) %>"></script>
<!-- 【TSN KGL040702_不適品ラベル出力】 2024.04.15 ta.ando Add End -->
<!-- endbuild -->

<!-- 在庫調査指示一覧画面新規作成 2024.4.24 ma Start -->
<script src="<%= appendFileUpdateDt("wms/js/inventory/InstKeyList.js", request) %>"></script>
<!-- 在庫調査指示一覧画面新規作成 2024.4.24 ma End -->

