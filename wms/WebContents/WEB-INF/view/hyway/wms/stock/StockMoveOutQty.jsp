<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(StockMoveOutDto.TStockDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${StockMoveOutDto.TStockDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- 移動出庫（数量） --%>

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

<%-- 仕入先 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${screen.itemNm("supplierNm")}:${fn:escapeXml(StockMoveOutDto.TStockDto.TStoreNo.MCustomer.customerNm)}</text>

<%-- [Ver3.0] unit of measure対応 2017.11.21 王  Start --%>
<%-- 在庫 --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      >${screen.itemNm("chargeNum")}:${screen.stripTrailingZeros(StockMoveOutDto.TStockDto.chargeNum)}</text>

<%-- 数量 --%>
<text mode="1"
      size="2"
      x="1"
      y="31"
      >${screen.itemNm("instNum")}:</text>

<input mode="1"
       size="2"
       x="9"
       y="31"
       adjusty="0"
       width="14"
       ${screen.inputNumberAttr("instNum")}
       param="qty" default="${screen.stripTrailingZeros(StockMoveOutDto.qty)}"></input>

<button type="1"
        key=""
        x="24"
        y="31"
        adjusty="0"
        width="5"
        size="2"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%-- [Ver3.0] unit of measure対応 2017.11.21 王  End --%>


<%@ include file="../../base/HTBaseFooter.jsp" %>
