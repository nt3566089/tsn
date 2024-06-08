<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto" %>

<%-- 積込検品(No) --%>

<%-- 配送コース --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
>${screen.itemNm("deliveryCourse")}:</text>

<%-- 配送コース名 --%>
<text mode="1"
      size="2"
      x="1"
      y="8"
>${fn:escapeXml(ShippingLoadingInspectionDto.mDeliveryCourseDto.deliveryCourseNm)}</text>

<%-- 追跡No/梱包No --%>
<text mode="1"
      size="2"
      x="1"
      y="12"
>${screen.itemNm("traceOrPackingNo")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="16"
       ${screen.inputTextAttr("traceOrPackingNo")}
       width="30"
      param="traceOrPackingNo" default="${fn:escapeXml(ShippingLoadingInspectionDto.traceOrPackingNo)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
