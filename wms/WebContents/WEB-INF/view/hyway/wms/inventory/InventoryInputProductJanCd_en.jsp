<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%-- 2015/06/23 KAI UPDATE ロケの表示項目を１つに統合 --%>
<%--商品棚卸(ｿｰｽCD) --%>
<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="5"
      >${screen.itemNm("loc")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.locNm)}</text>

<%--ｿｰｽCD  --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="13"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="26"
       param="janProdCd" default="${fn:escapeXml(InventoryInputProductDto.janProdCd)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
