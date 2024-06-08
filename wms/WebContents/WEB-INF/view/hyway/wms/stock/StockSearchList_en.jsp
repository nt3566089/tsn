<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockSearchDto" %>

<%-- 在庫検索(一覧)画面 --%>

<c:set var="list" value="${StockSearchDto.lstStockDto}"/>
<c:set var="pageIndex" value="${StockSearchDto.pageIndex}"/>
<c:set var="stockDto" value="${StockSearchDto.lstStockDto[pageIndex]}"/>
<c:set var="pageNow" value="${StockSearchDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(stockDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${stockDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<c:set var="zaikoNum" value="${stockDto.chargeNum}"/>

<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("locationCd")}:${fn:escapeXml(stockDto.MLocation.locationNm)}</text>

<%-- 入庫No --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(stockDto.TStoreNo.storeLabelNo)}</text>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${screen.itemNm("janCd")}:${fn:escapeXml(stockDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${screen.itemNm("product")}:${fn:escapeXml(stockDto.MProduct.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${fn:escapeXml(stockDto.MProduct.productNm)}</text>

<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      >${screen.itemNm("lot")}:${fn:escapeXml(stockDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- 預託 --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      >${screen.itemNm("deposit")}:${fn:escapeXml(stockDto.MCustomer.customerNm)}</text>

<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      >${screen.itemNm("stockType")}:${fn:escapeXml(stockDto.MStockType.VDict.dictNm)}</text>

<%-- 在庫数 --%>
<text mode="1"
      size="1"
      x="1"
      y="31"
      >${screen.itemNm("stockNum")}:${screen.stripTrailingZeros(zaikoNum)}</text>

<%-- ページ情報 --%>
<text mode="1"
      size="1"
      x="23"
      y="31"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
