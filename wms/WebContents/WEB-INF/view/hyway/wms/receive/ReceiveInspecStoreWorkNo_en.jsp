<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 入荷検品格納(伝票ＮＯ入力) -->
<%-- 伝票No --%>
<text mode="1"
      size="1"
      x="1"
      y="5"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="8"
       ${screen.inputTextAttr("workNo")}
       width="26"
       param="htWorkNo" default="${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}"></input>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
