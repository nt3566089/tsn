<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<c:set var="list" value="${PrinterSelectDto.lstPPrinterAttributeDto}"/>
<%-- トレイ選択 --%>
<%-- プリンタ属性 --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("printer")}:</text>
<select mode="1"
        size="1"
        starty="8"
        pagesize="6"
        number="1"
        url=""
        style="1">
<c:forEach var="var" items="${list}" varStatus="sts">
  <option x="2"
    url="PrinterSelectTraySelect/select?printerAttributeId=${fn:escapeXml(var.getPrinterAttributeId())}">${fn:escapeXml(var.getTrayNm())}</option>
</c:forEach>
</select>
<text mode="1"
      size="1"
      x="1"
      y="29">${screen.itemNm("select")}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>