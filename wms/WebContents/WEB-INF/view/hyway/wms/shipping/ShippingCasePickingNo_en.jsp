<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>

<%-- ケースピック（No）画面 --%>

<%-- ケース --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("casePickingNo1")}</text>

<%-- ピッキングNo --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("casePickingNo2")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="10"
       ${screen.inputTextAttr("casePickingNo2")}
       width="28"
       param="casePickingNo" default=""></input>


<%@ include file="../../base/HTBaseFooter_en.jsp" %>
