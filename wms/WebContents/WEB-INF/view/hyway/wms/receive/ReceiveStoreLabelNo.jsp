<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>
<!-- 入庫ラベルNo入力 -->
<!-- 入庫ラベルNo -->
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("receiveSlipNo")}:</text>

<input mode="1"
       size="2"
       x="1"
       y="7"
       ${screen.inputTextAttr("receiveSlipNo")}
       width="26"
       param="onsNum" default="${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.onsNum)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>