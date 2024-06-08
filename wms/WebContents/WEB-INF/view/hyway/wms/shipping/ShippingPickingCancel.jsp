<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>
<c:set var="isPackingNo" value="${ShippingPickingDto.isPackingNo }"/>
<%-- オーダピック(終了) --%>
<%-- メッセージ1 --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- メッセージ2 --%>
<text mode="1"
      size="2"
      x="4"
      y="8"
     >${screen.itemNm("msg2")}</text>
<%-- 出庫作業No --%>
<c:if test="${isPackingNo==false }">
  <text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<c:if test="${isPackingNo==true }">
<%-- 出荷梱包No --%>
  <text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<%-- 出庫作業No/出荷梱包No --%>
<text mode="1"
      size="2"
      x="4"
      y="16"
      >${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.pickingWorkNo)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
