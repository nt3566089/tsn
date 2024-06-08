<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto" %>

<%-- 配送コース選択画面 --%>
<c:set var="list" value="${ShippingLoadingInspectionDto.lstMDeliveryCourseDto}"/>

<%-- 配送コース --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
>${screen.itemNm("deliveryCourse")}:</text>

<select mode="1"
        size="1"
        starty="8"
        pagesize="6"
        number="1"
        url=""
        style="1"
        >

<c:forEach var="var" items="${list}" varStatus="sts">
  <option x="1"
          url="ShippingLoadingInspectionDeliveryCourseSelect/select?deliveryCourse=${fn:escapeXml(var.getDeliveryCourseCd())}">${fn:escapeXml(var.getDeliveryCourseNm())}</option>
</c:forEach>
</select>

<%-- 選択後、[ENT]で確定 --%>
<text mode="1"
      size="1"
      x="1"
      y="29"
>${screen.itemNm("selectMessage")}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>