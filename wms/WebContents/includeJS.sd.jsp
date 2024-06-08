<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*" %>

<!-- システム共通 -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- ファイル名変更 wms/js/oneslogi.wms.common.min.js > wms/js/oneslogi.wms.common.sd.min.js 2016/03/02 inoue -->
<!-- build:js wms/js/oneslogi.wms.common.sd.min.js -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<script src="<%= appendFileUpdateDt("wms/js/common/oneslogi.wms.sd.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/common/SelectClientSD.js", request) %>"></script>
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- 不要なので削除 2016/03/02 inoue Start -->
<!-- <script src="<%= appendFileUpdateDt("wms/js/common/DataInput.js", request) %>"></script> -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<!-- endbuild -->

<!-- 共通検索 -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- ファイル名変更 wms/js/oneslogi.wms.assist.min.js > wms/js/oneslogi.wms.assist.sd.min.js 2016/03/02 inoue -->
<!-- build:js wms/js/oneslogi.wms.assist.sd.min.js -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<script src="<%= appendFileUpdateDt("wms/js/assist/oneslogi.wms.assist.sd.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/ProductMasterSearchSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/VendorMasterSearchSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/DeliveryCourseSearchSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/DeliveryMasterSearchSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/LocationMasterSearchSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/assist/ZipMasterSearchSD.js", request) %>"></script>
<!-- endbuild -->

<!-- 入荷 -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- ファイル名変更 wms/js/oneslogi.wms.receive.min.js > wms/js/oneslogi.wms.receive.sd.min.js 2016/03/02 inoue -->
<!-- build:js wms/js/oneslogi.wms.receive.sd.min.js -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<script src="<%= appendFileUpdateDt("wms/js/receive/oneslogi.wms.receive.sd.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/receive/ReceiveInspectionSD.js", request) %>"></script>
<!-- [#1482][Ver2.2.0] SD版画像アップロード機能追加 2017.04.19 Dario Add Start -->
<!-- SD版画像アップロード機能サンプル画面 -->
<script src="<%= appendFileUpdateDt("wms/js/receive/ImageUploadSD.js", request) %>"></script>
<!-- [#1482][Ver2.2.0] SD版画像アップロード機能追加 2017.04.19 Dario Add End -->
<!-- endbuild -->

<!-- 棚卸  -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- ファイル名変更 wms/js/oneslogi.wms.inventory.min.js > wms/js/oneslogi.wms.inventory.sd.min.js 2016/03/02 inoue -->
<!-- build:js wms/js/oneslogi.wms.inventory.sd.min.js  -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<script src="<%= appendFileUpdateDt("wms/js/inventory/oneslogi.wms.inventory.sd.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/inventory/InventoryInputSD.js", request) %>"></script>
<!-- endbuild -->

<!-- 出荷 -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue Start -->
<!-- ファイル名変更 wms/js/oneslogi.wms.shipping.min.js > wms/js/oneslogi.wms.shipping.sd.min.js 2016/03/02 inoue -->
<!-- build:js wms/js/oneslogi.wms.shipping.sd.min.js -->
<!-- [SD] バグ #1131 war化して実行するとエラーが起きる 2016/03/02 inoue End -->
<script src="<%= appendFileUpdateDt("wms/js/shipping/oneslogi.wms.shipping.sd.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/PickingSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/OrderPickingSD.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/shipping/CasePickingSD.js", request) %>"></script>
<!-- endbuild -->

