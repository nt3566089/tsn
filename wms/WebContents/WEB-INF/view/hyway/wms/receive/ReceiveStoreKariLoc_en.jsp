<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>
<!-- 仮ロケ入力 -->
<!-- 仮ロケ -->
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("locCd")}:</text>

<input mode="1"
       size="1"
       x="1"
       y="7"
       ${screen.inputTextAttr("locCd")}
       width="26"
       param="kariLocCd" default="${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.kariLocCd)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>