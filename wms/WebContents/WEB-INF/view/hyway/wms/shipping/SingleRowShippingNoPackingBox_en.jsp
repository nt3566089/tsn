<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(箱登録)画面 --%>

<%-- 使用した荷材CDを入力してください。--%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${fn:escapeXml(BoxMessage)}</text>
<%--荷材CD  --%>
<text mode="1"
      size="1"
      x="1"
      y="12"
      >${screen.itemNm("boxCd")}:</text>
<input mode="1"
       size="1"
       x="15"
       y="12"
       ${screen.inputTextAttr("boxCd")}
       width="16"
       param="boxCd" default="${fn:escapeXml(SingleRowShippingNoPackingDto.getDefaultBox().getBoxCd())}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
