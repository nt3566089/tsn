<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<%-- シリアル登出(No)画面 --%>
<%-- 出庫作業No/梱包No --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="8"
       ${screen.inputTextAttr("workNo")}
       width="30"
       param="pickingWorkNo"
       default="${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo)}"></input>

<!-- 納品先 -->
<text mode="1"
       size="1"
       x="1"
       y="12"
      >${screen.itemNm("customerCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="16"
       ${screen.inputTextAttr("customerCd")}
       width="30"
       param="supplierCustomerCd"
       default="${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerCd)}"></input>
<!-- 納品先名称 -->
<text mode="1"
       size="1"
       x="1"
       y="20"
      adjusty="0"
      >${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerNm)}</text>
      <!-- SerialShippingInspectionDto.wHtSerialShippingInspDto.supplierNm -->

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
