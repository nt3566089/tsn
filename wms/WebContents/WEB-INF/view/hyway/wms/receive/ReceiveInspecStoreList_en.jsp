<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>
<c:set var="list" value="${ReceiveInspecStoreDto.lstWHtReceiveInspectionDto}"/>
<c:set var="pageIndex" value="${ReceiveInspecStoreDto.pageIndex}"/>
<c:set var="wHtReceiveInspectionDto" value="${ReceiveInspecStoreDto.lstWHtReceiveInspectionDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveInspecStoreDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:if test="${fn:length(wHtReceiveInspectionDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtReceiveInspectionDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- [Ver3.0] unit of measure対応 2017.11.28 王 Start--%>
<c:set var="leftQty" value="${wHtReceiveInspectionDto.pieceQtyRcvOrd - wHtReceiveInspectionDto.storeNum}"/>
<%-- [Ver3.0] unit of measure対応 2017.11.28 王 End--%>
<c:if test="${leftQty < 0}">
	<c:set var="leftQty" value="${0}"/>
</c:if>

<!-- 入荷検品格納(一覧) -->
<!-- JAN -->
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtReceiveInspectionDto.janCd)}</text>
<!-- 商品-->
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
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(wHtReceiveInspectionDto.stkClsNm)}</text>
<!-- ロット -->
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtReceiveInspectionDto.lot)}</text>
<!-- 期限日 -->
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 予定数 -->
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.pieceQtyRcvOrd)}</text>
<!-- 検品済数 -->
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.storeNum)}</text>
<!-- 検品数 -->
<text mode="1"
      size="1"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("inspectionNum")}:${screen.stripTrailingZeros(wHtReceiveInspectionDto.pieceQtyRcv)}</text>
<!-- 残数-->
<text mode="1"
      size="1"
      x="20"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyRemain")}:${screen.stripTrailingZeros(leftQty)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%-- 戻る--%>
<text mode="1"
      size="1"
      x="23"
      y="31"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
