<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>
<c:set var="list" value="${ReceiveNoPlanInspectionDto.lstWHtReceiveNoPlanInspDto}"/>
<c:set var="pageIndex" value="${ReceiveNoPlanInspectionDto.pageIndex}"/>
<c:set var="wHtReceiveNoPlanInspDto" value="${ReceiveNoPlanInspectionDto.lstWHtReceiveNoPlanInspDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveNoPlanInspectionDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:if test="${fn:length(wHtReceiveNoPlanInspDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtReceiveNoPlanInspDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<!-- 予定無し入荷(一覧) -->
<!-- JAN -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("janCd")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.janCd)}</text>

<!-- 商品-->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
>${fn:escapeXml(wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 預託 -->
<%-- 預託 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
>${screen.itemNm("depositNm")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.depositNm)}</text>

<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
>${screen.itemNm("stockType")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.stockTypeNm)}</text>

<!-- 仕入先 -->
<%-- 仕入先 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
>${screen.itemNm("supplier")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.supplierNm)}</text>

<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
>${screen.itemNm("lot")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.lot)}</text>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
>${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>

<!-- 検品数 -->
<%-- 検品数 --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("inspectionNum")}:${fn:escapeXml(wHtReceiveNoPlanInspDto.pieceQtyRcv)}</text> --%>
>${screen.itemNm("inspectionNum")}:${screen.stripTrailingZeros(wHtReceiveNoPlanInspDto.pieceQtyRcv)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%-- Page --%>
<text mode="1"
      size="2"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
