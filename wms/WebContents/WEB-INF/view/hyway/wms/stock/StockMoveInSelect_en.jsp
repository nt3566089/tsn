<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveInDto" %>
<c:set var="list" value="${StockMoveInDto.lstTMoveInstBDto}"/>
<c:set var="pageIndex" value="${StockMoveInDto.pageIndex}"/>
<c:set var="TMoveInstBDto" value="${StockMoveInDto.lstTMoveInstBDto[pageIndex]}"/>
<c:set var="pageNow" value="${StockMoveInDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(TMoveInstBDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${TMoveInstBDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<%-- 移動入庫(選択)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(TMoveInstBDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("productCd")}:${fn:escapeXml(TMoveInstBDto.MProduct.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="10">${fn:escapeXml(TMoveInstBDto.MProduct.productNm)}</text>

<%-- 預託 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${screen.itemNm("deposit")}:${fn:escapeXml(TMoveInstBDto.MCustomerByDepositId.customerNm)}</text>

<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${screen.itemNm("stockTypeNm")}:${fn:escapeXml(TMoveInstBDto.MStockType.VDict.dictNm)}</text>

<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      >${screen.itemNm("lot")}:${fn:escapeXml(TMoveInstBDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      >${screen.itemNm("loc")}:${fn:escapeXml(TMoveInstBDto.MLocation.locationNm)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.08 王 Start --%>
<%-- 移動数 --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(TMoveInstBDto.instNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.08 王 End --%>
<%-- Page --%>
<text mode="1"
      size="1"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>