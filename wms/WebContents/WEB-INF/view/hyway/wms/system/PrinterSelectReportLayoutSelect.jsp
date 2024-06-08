<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<c:set var="list" value="${PrinterSelectDto.lstPReportLayoutDto}"/>
<%-- 帳票レイアウト選択 --%>
<%-- 帳票レイアウト --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("reportLayout")}:</text>
<select mode="1"
        size="2"
        starty="8"
        pagesize="6"
        number="1"
        url=""
        style="1">
<c:forEach var="var" items="${list}" varStatus="sts">
  <option x="2"
    url="PrinterSelectReportLayoutSelect/select?reportLayoutId=${fn:escapeXml(var.getReportLayoutId())}">${fn:escapeXml(var.getReportLayoutNm())}</option>
</c:forEach>
</select>
<text mode="1"
      size="2"
      x="1"
      y="29">${screen.itemNm("select")}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>