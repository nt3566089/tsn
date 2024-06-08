<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>
<c:set var="list" value="${ShippingCasePickingDto.lstWHtShippingPickingDto}"/>
<c:set var="pageIndex" value="${ShippingCasePickingDto.pageIndex}"/>
<c:set var="wHtShippingPickingDto" value="${ShippingCasePickingDto.lstWHtShippingPickingDto[pageIndex]}"/>
<c:set var="status" value="${ShippingCasePickingDto.pickingFlgNmList[pageIndex]}"/>

<c:set var="pageNow" value="${ShippingCasePickingDto.pageIndex + 1}"/>

<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>

<c:set var="num" value="${wHtShippingPickingDto.instNum / wHtShippingPickingDto.unitNum}"/>
<c:set var="pos" value="${fn:indexOf(num , '.')}"/>
<c:set var="caseNum" value="${fn:substring(num, 0, pos)}"/>

<c:if test="${fn:length(wHtShippingPickingDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtShippingPickingDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<%-- ケースピック(一覧) --%>

<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("locationNm")}:${fn:escapeXml(wHtShippingPickingDto.MLocation.locationNm)}</text>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtShippingPickingDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtShippingPickingDto.MProduct.productCd)}</text>

<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtShippingPickingDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<%-- [#2990][Ver3.0] HTケースピッキング検品 - 一覧画面表示内容 2017.01.26 honma Mod Start --%>
<%-- 指示数 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(wHtShippingPickingDto.instNum)}</text>

<%-- ケース数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("caseNum")}:${fn:escapeXml(caseNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.01 王 Start--%>
<%-- 検品数 --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(wHtShippingPickingDto.spgQtyOns)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.01 王 End--%>
<%-- [#2990][Ver3.0] HTケースピッキング検品 - 一覧画面表示内容 2017.01.26 honma Mod End --%>
<%-- ステータス --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("status")}:${fn:escapeXml(status)}</text>

<%-- ページ番号 --%>
<text mode="1"
      size="1"
      x="23"
      y="31"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
