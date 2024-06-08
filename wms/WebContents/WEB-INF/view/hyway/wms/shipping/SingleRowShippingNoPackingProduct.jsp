<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(商品)画面 --%>

<%-- ソースCD  --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="7"
       ${screen.inputTextAttr("janCd")}
       width="21"
       param="janCd" default="${fn:escapeXml(SingleRowShippingNoPackingDto.getSearchDto().getMProduct().getProductCd())}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
