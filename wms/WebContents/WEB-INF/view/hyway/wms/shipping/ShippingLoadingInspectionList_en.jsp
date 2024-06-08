<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto" %>

<%-- 積込検品(一覧)画面 --%>
<c:set var="list" value="${ShippingLoadingInspectionDto.lstWHtLoadingDto}"/>
<c:set var="pageIndex" value="${ShippingLoadingInspectionDto.pageIndex}"/>
<c:set var="wHtLoadingDto" value="${ShippingLoadingInspectionDto.lstWHtLoadingDto[pageIndex]}"/>
<c:set var="pageNow" value="${ShippingLoadingInspectionDto.pageIndex + 1}"/>
<c:set var="totalPage" value="${ShippingLoadingInspectionDto.totalPage}"/>
<c:set var="y" value="${4}"/>
<c:set var="height" value="${3}"/>
<c:set var="max" value="${9}"/>

<%-- 追跡No/梱包No --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
>${screen.itemNm("traceOrPackingNo")}:</text>

<c:forEach var="var" items="${list}" begin="0" end="${ max - 1 }" varStatus="sts">
<c:if test="${fn:length(list) >= (pageIndex * max) + sts.index+1 }">

<c:if test="${var.carrierTraceNum!=null}">
<text mode="1"
      size="1"
      x="2"
      y="${ y + height }"
>${fn:escapeXml(pageIndex * max + sts.index+1)}.${fn:escapeXml(list[pageIndex * max + sts.index ].carrierTraceNum)}</text>

</c:if>
<c:if test="${var.shippingPackingNo!=null}">
<text mode="1"
      size="1"
      x="2"
      y="${ y + height }"
>${fn:escapeXml(pageIndex * max + sts.index+1)}.${fn:escapeXml(list[pageIndex * max + sts.index ].shippingPackingNo)}</text>

</c:if>
<c:set var="y" value="${ y + height }"/>
</c:if>
</c:forEach>

<%-- selectpage --%>
<text size="1"
      x="24"
      y="32"
      name="selectpage"
> ${pageNow}/${totalPage}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
