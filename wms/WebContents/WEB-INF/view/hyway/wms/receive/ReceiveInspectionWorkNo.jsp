<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(伝票ＮＯ・仮ロケ入力) -->
<%-- 入荷検品(伝票No)画面 --%>

<%-- 伝票No --%>
<text mode="1"
      size="2"
      x="1"
      y="5"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="8"
       width="26"
       ${screen.inputTextAttr("workNo")}
       param="htWorkNo" default="${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}"></input>

<%-- 仮ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="15"
      >${screen.itemNm("loc")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="18"
       width="26"
       ${screen.inputTextAttr("loc")}
       param="rcvLocCd" default="${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLocationCd)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
