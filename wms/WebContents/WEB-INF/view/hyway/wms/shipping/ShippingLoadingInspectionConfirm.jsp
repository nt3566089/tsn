<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto" %>

<%-- 積込検品(確認)画面 --%>

<%-- 配送コース --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
>${screen.itemNm("deliveryCourse")}:</text>

<%-- 配送コース名 --%>
<text mode="1"
      size="2"
      x="2"
      y="7"
>${fn:escapeXml(ShippingLoadingInspectionDto.finishDeliveryCourseNm)}</text>

<%-- の積込検品が --%>
<text mode="1"
      size="2"
      x="2"
      y="10"
>${screen.itemNm("loading1")}</text>

<%-- 終了しました --%>
<text mode="1"
      size="2"
      x="2"
      y="13"
>${screen.itemNm("loading2")}</text>


<%@ include file="../../base/HTBaseFooter.jsp" %>
