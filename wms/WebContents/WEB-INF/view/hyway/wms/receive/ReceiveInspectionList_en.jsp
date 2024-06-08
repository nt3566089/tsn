<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>
<c:set var="list" value="${ReceiveInspectionDto.lstWHtReceiveInspectionDto}"/>
<c:set var="pageIndex" value="${ReceiveInspectionDto.pageIndex}"/>
<c:set var="wHtReceiveInspectionDto" value="${ReceiveInspectionDto.lstWHtReceiveInspectionDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveInspectionDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:if test="${fn:length(wHtReceiveInspectionDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtReceiveInspectionDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<c:set var="leftQty" value="${wHtReceiveInspectionDto.pieceQtyRcvOrd - wHtReceiveInspectionDto.storeNum}"/>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<c:if test="${leftQty < 0}">
	<c:set var="leftQty" value="${0}"/>
</c:if>

<!-- 入荷検品(一覧) -->
<!-- JAN -->
<%-- 入荷検品(詳細)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtReceiveInspectionDto.janCd)}</text>
<!-- 商品-->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtReceiveInspectionDto.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(wHtReceiveInspectionDto.productNm)}</text>
<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(wHtReceiveInspectionDto.stkClsNm)}</text>
<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtReceiveInspectionDto.lot)}</text>
<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<!-- 予定数 -->
<%-- 予数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.pieceQtyRcvOrd)}</text>
<!-- 検品済数 -->
<%-- 済数 --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.storeNum)}</text>
<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("inspectionNum")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.pieceQtyRcv)}</text>
<!-- 残数-->
<%-- 残数 --%>
<text mode="1"
      size="1"
      x="20"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyRemain")}:${screen.stripTrailingZeros(leftQty)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<%-- Page --%>
<text mode="1"
      size="1"
      x="23"
      y="31"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
