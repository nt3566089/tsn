<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>
<c:set var="list" value="${ShippingPickingDto.lstWHtShippingPickingDto}"/>
<c:set var="pageIndex" value="${ShippingPickingDto.pageIndex}"/>
<c:set var="wHtShippingPickingDto" value="${ShippingPickingDto.lstWHtShippingPickingDto[pageIndex]}"/>
<c:set var="pageNow" value="${ShippingPickingDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(wHtShippingPickingDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtShippingPickingDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- オーダピック(一覧) --%>
<%-- 入庫No --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(wHtShippingPickingDto.storeLabelNo)}</text>
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("locationCd")}:${fn:escapeXml(wHtShippingPickingDto.locationNm)}</text>
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
     >${screen.itemNm("janCd")}:${fn:escapeXml(wHtShippingPickingDto.MProduct.janCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtShippingPickingDto.MProduct.productCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(wHtShippingPickingDto.MProduct.productNm)}</text>
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtShippingPickingDto.TLot.lot)}</text>
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.22 王  Del --%>
<%-- [Ver3.0] unit of measure対応 2017.11.22 王  Start --%>
<%-- 数量 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(wHtShippingPickingDto.spgQtyOns)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.22 王  End --%>
<%-- ページ情報 --%>
<text mode="1"
      size="2"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
