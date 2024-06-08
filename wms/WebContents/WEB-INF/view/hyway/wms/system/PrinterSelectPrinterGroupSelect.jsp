<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<c:set var="list" value="${PrinterSelectDto.lstPPrinterGroupDto}"/>
<%-- プリンタグループ選択 --%>
<%-- プリンタグループ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("printerGroup")}:</text>
<select mode="1"
        size="2"
        starty="8"
        pagesize="6"
        number="1"
        url=""
        style="1">
<c:forEach var="var" items="${list}" varStatus="sts">
  <option x="2"
    url="PrinterSelectPrinterGroupSelect/select?printerGroupId=${fn:escapeXml(var.getPrinterGroupId())}">${fn:escapeXml(var.getPrinterGroupNm())}</option>
</c:forEach>
</select>
<text mode="1"
      size="2"
      x="1"
      y="29"
      >${screen.itemNm("select")}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>