<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%-- 商品棚卸（終了）--%>
<%-- 商品棚卸を --%>
<text mode="1"
      size="2"
      x="9"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%--終了しますか？ --%>
<text mode="1"
      size="2"
      x="6"
      y="8"
      >${screen.itemNm("msg2")}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
