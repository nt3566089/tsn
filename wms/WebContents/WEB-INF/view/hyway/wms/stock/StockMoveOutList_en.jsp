<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<c:set var="list" value="${StockMoveOutDto.lstTStockDto}"/>
<c:set var="pageIndex" value="${StockMoveOutDto.pageIndex}"/>
<c:set var="TStockDto" value="${StockMoveOutDto.lstTStockDto[pageIndex]}"/>
<c:set var="pageNow" value="${StockMoveOutDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(TStockDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${TStockDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<%-- 移動出庫（選択） --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(TStockDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("productCd")}:${fn:escapeXml(TStockDto.MProduct.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${fn:escapeXml(TStockDto.MProduct.productNm)}</text>

<%-- 預託 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${screen.itemNm("deposit")}:${fn:escapeXml(TStockDto.MCustomer.customerNm)}</text>

<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${screen.itemNm("stockTypeNm")}:${fn:escapeXml(TStockDto.MStockType.VDict.dictNm)}</text>

<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      >${screen.itemNm("lot")}:${fn:escapeXml(TStockDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- 仕入先 --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      >${screen.itemNm("supplierNm")}:${fn:escapeXml(TStockDto.TStoreNo.MCustomer.customerNm)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.08 王 Start --%>
<%-- 在庫 --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      >${screen.itemNm("chargeNum")}:${screen.stripTrailingZeros(TStockDto.chargeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.08 王 Start --%>
<%-- page --%>
<text mode="1"
      size="1"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
