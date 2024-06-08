<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>

<%-- ケースピック(終了)画面 --%>

<%-- ケースピッキングを --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>

<%-- 終了しますか？ --%>
<text mode="1"
      size="2"
      x="4"
      y="8"
      >${screen.itemNm("msg2")}</text>

<%-- ケースピッキングNo --%>
<%-- [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start --%>
<text mode="1"
      size="2"
      x="1"
      y="12"
      >${screen.itemNm("casePickingNo")}:</text>

<text mode="1"
      size="2"
      x="4"
      y="16"
      >${fn:escapeXml(ShippingCasePickingDto.casePickingNo)}</text>
<%-- [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End --%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
