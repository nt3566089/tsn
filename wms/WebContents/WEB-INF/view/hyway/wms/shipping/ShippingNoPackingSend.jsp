<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto" %>
<c:set var="isPackingNo" value="${ShippingNoPackingDto.isPackingNo }"/>
<%--バラ出荷検品(確認)  --%>
<%--データを登録します。  --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%--よろしいですか？  --%>
<text mode="1"
      size="2"
      x="4"
      y="8"
      >${screen.itemNm("msg2")}</text>
<%--出庫作業No  --%>
<c:if test="${isPackingNo==false }">
<text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<%--出荷梱包No  --%>
<c:if test="${isPackingNo==true }">
<text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<text mode="1"
      size="2"
      x="4"
      y="16"
      >${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.pickingWorkNo)}</text>
 <%--総個口数  --%>
<text mode="1"
      size="2"
      x="4"
      y="20"
      >${screen.itemNm("pieceDenoRecode")}:${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.pieceNo - 1)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>