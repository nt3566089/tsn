<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<!-- 期限日確認 -->
<%-- Msg1 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
>${screen.itemNm("msg1")}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<!-- 商品名称テスト -->
<%-- 商品名 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
>${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("spgQtyOns")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeNum)}</text> --%>
>${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
