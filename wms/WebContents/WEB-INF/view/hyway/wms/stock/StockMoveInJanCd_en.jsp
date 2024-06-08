<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveInDto" %>

<%-- 移動入庫(ｿｰｽCD)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="8"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="11"
       ${screen.inputTextAttr("janCd")}
       width="24"
       param="janCd" default="${fn:escapeXml(StockMoveInDto.janCdProd)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
