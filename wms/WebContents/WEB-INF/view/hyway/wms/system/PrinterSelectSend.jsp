<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<%-- プリンタ選択(確認) --%>
<%-- メッセージ --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<text mode="1"
      size="2"
      x="4"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%-- 帳票レイアウト --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${screen.itemNm("reportLayout")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.reportLayoutNm)}</text>
<%-- プリンタグループ --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("printerGroup")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.printerGroupNm)}</text>
<%-- プリンタ --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      >${screen.itemNm("printer")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.printerNm)}</text>
<%-- トレイ --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      >${screen.itemNm("tray")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="31"
      >${fn:escapeXml(PrinterSelectDto.pUserAutoPrintSettingDto.trayNm)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>