<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<%-- プリンタグループ --%>
<%-- 帳票レイアウト --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("reportLayout")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.reportLayoutNm)}</text>
<%-- プリンタグループ --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${screen.itemNm("printerGroup")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.printerGroupNm)}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>