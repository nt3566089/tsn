<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>

<%--入庫格納(ｿｰｽCD) --%>
<%--仮ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("locCd")}:
       ${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.kariLocCd)}</text>
<%--ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="13"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="26"
       param="janProdCd" default="${fn:escapeXml(ReceiveStoreDto.janProdCd)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>