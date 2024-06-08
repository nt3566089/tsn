<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(終了) -->
<%-- 入荷検品(終了)画面 --%>

<%-- 入荷検品を --%>
<text mode="1"
      size="2"
      x="7"
      y="7"
      >${screen.itemNm("msg1")}</text>

<%-- 終了しますか？ --%>
<text mode="1"
      size="2"
      x="4"
      y="10"
      >${screen.itemNm("msg2")}</text>
<!-- 伝票No -->
<%-- 伝票No --%>
<text mode="1"
      size="2"
      x="2"
      y="16"
      adjusty="0"
      >${screen.itemNm("workNo")}:</text>
<text mode="1"
      size="2"
      x="2"
      y="19"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>

<!-- 仮ロケ -->
<%-- 仮ロケ --%>
<text mode="1"
      size="2"
      x="2"
      y="22"
      adjusty="0"
      >${screen.itemNm("loc")}:</text>
<text mode="1"
      size="2"
      x="2"
      y="25"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLocationCd)}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
