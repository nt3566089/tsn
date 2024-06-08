<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<c:set var="list" value="${PrinterSelectDto.lstPUserAutoPrintSettingDto}"/>
<c:set var="pageIndex" value="${PrinterSelectDto.pageIndex}"/>
<c:set var="pUserAutoPrintSettingDto" value="${PrinterSelectDto.lstPUserAutoPrintSettingDto[pageIndex]}"/>
<c:set var="pageNow" value="${PrinterSelectDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<%-- 選択プリンタ一覧 --%>
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
      >${fn:escapeXml(pUserAutoPrintSettingDto.PReportLayoutByReportLayoutId.reportLayoutNm)}</text>
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
      >${fn:escapeXml(pUserAutoPrintSettingDto.PPrinterGroupByPrinterGroupId.printerGroupNm)}</text>
 <%-- プリンタ --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${screen.itemNm("printer")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="19"
      >${fn:escapeXml(pUserAutoPrintSettingDto.PPrinterByPrinterId.printerNm)}</text>
 <%-- トレイ --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      >${screen.itemNm("tray")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="25"
      >${fn:escapeXml(pUserAutoPrintSettingDto.PPrinterAttributeByPrinterAttributeId.trayNm)}</text>
<%-- ページ情報 --%>
<text mode="1"
      size="1"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>