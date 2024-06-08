<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(No)画面 --%>

<%-- ピッキンググループNo  --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("pickingGroupNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="7"
       ${screen.inputTextAttr("pickingGroupNo")}
       width="18"
       param="pickingGroupNo" default="${fn:escapeXml(SingleRowShippingNoPackingDto.getSearchDto().getPickingGroupNo())}"></input>

<%-- 仮置No  --%>
<text mode="1"
      size="1"
      x="1"
      y="11"
      >${screen.itemNm("tempNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="14"
       ${screen.inputTextAttr("tempNo")}
       width="10"
       param="tempNo" default="${fn:escapeXml(SingleRowShippingNoPackingDto.getSearchDto().getTempNo())}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
