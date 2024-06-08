<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*" %>

<!-- システム共通 -->
<!-- build:js wms/js/oneslogi.wms.common.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/common/oneslogi.wms.js", request) %>"></script>
<!-- endbuild -->

<!-- 勤怠管理 -->
<!-- build:js wms/js/oneslogi.wms.operation.min.js -->
<script src="<%= appendFileUpdateDt("wms/js/operation/AttendanceEntry.js", request) %>"></script>
<script src="<%= appendFileUpdateDt("wms/js/operation/ModalError.js", request) %>"></script>
<!-- endbuild -->