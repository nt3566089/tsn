<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(StockMoveOutDto.TStockDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${StockMoveOutDto.TStockDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- 移動入庫(ロケ) --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(StockMoveOutDto.TStockDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("productCd")}:${fn:escapeXml(StockMoveOutDto.TStockDto.MProduct.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${fn:escapeXml(StockMoveOutDto.TStockDto.MProduct.productNm)}</text>

<%-- 預託 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("deposit")}:${fn:escapeXml(StockMoveOutDto.TStockDto.MCustomer.customerNm)}</text>

<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("stockTypeNm")}:${fn:escapeXml(StockMoveOutDto.TStockDto.MStockType.VDict.dictNm)}</text>

<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("lot")}:${fn:escapeXml(StockMoveOutDto.TStockDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${screen.itemNm("loc")}:${fn:escapeXml(StockMoveOutDto.TStockDto.MLocation.locationNm)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.21 王  Start --%>
<%-- 移動数 --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(StockMoveOutDto.qty)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.21 王  End --%>
<%-- 先ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="31"
      >${screen.itemNm("sakiLoc")}:</text>
<input mode="1"
       size="2"
       x="12"
       y="31"
       width="16"
       ${screen.inputTextAttr("sakiLoc")}
       param="locationCd" default="${fn:escapeXml(StockMoveOutDto.locationCd)}"></input>
<%@ include file="../../base/HTBaseFooter.jsp" %>
