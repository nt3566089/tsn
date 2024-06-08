<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveInDto" %>

<%-- 移動入庫(入庫No)画面 --%>

<%-- 入庫No --%>
<text mode="1"
      size="1"
      x="1"
      y="8"
      >${screen.itemNm("labelNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="11"
       ${screen.inputTextAttr("labelNo")}
       width="26"
       param="labelNo" default="${fn:escapeXml(StockMoveInDto.labelNo)}"></input>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
