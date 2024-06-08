<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto" %>
<%--バラ出荷検品（終了）  --%>
<%--出荷検品キャンセル  --%>
<c:set var="isPackingNo" value="${ShippingNoPackingDto.isPackingNo }"/>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- しますか？ --%>
<text mode="1"
      size="2"
      x="7"
      y="8"
      >${screen.itemNm("msg2")}</text>
<%--出庫作業No:  --%>
<c:if test="${isPackingNo==false }">
<text mode="1"
      size="2"
      x="7"
      y="12"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<%--出荷梱包No:  --%>
<c:if test="${isPackingNo==true }">
<text mode="1"
      size="2"
      x="7"
      y="12"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<text mode="1"
      size="2"
      x="7"
      y="16"
      >${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.pickingWorkNo)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
