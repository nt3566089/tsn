<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockSearchDto" %>

<%-- 在庫検索画面 --%>

<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("locationCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="7"
       width="24"
       ${screen.inputTextAttr("locationCd")}
       param="locationCd"
       default="${fn:escapeXml(StockSearchDto.locationCd)}"></input>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="11"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="14"
       width="24"
       ${screen.inputTextAttr("janCd")}
       param="janCd" default="${fn:escapeXml(StockSearchDto.janCd)}"></input>

<%-- 入庫No --%>
<text mode="1"
      size="1"
      x="1"
      y="18"
      >${screen.itemNm("storeLabelNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="21"
       width="24"
       ${screen.inputTextAttr("storeLabelNo")}
       param="storeLabelNo" default="${fn:escapeXml(StockSearchDto.storeLabelNo)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
