<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(ShippingCasePickingDto.wHtShippingPickingDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ShippingCasePickingDto.wHtShippingPickingDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<c:set var="num" value="${ShippingCasePickingDto.wHtShippingPickingDto.instNum / ShippingCasePickingDto.wHtShippingPickingDto.unitNum}"/>
<c:set var="pos" value="${fn:indexOf(num , '.')}"/>
<c:set var="caseNum" value="${fn:substring(num, 0, pos)}"/>

<%-- ケースピック(ｿｰｽCD) --%>

<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("locationNm")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MLocation.locationNm)}</text>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MProduct.productCd)}</text>

<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.01 王 Start--%>
<%-- 指示数 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(ShippingCasePickingDto.wHtShippingPickingDto.instNum)}</text>

<%-- ケース数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("caseNum")}:${screen.stripTrailingZeros(caseNum)}</text>

<%-- 検品数 --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ShippingCasePickingDto.wHtShippingPickingDto.spgQtyOns)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.01 王 End--%>
<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("janCdInput")}:</text>
<input mode="1"
       size="1"
       x="5"
       y="27"
       adjusty="0"
       ${screen.inputTextAttr("janCdInput")}
       width="20"
       param="janCd" default="${fn:escapeXml(ShippingCasePickingDto.janCd)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
