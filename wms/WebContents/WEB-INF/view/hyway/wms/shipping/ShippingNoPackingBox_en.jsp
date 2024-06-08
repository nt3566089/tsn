<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto" %>
<%--バラ出荷検品(箱登録)画面  --%>
<%--使用した荷材CDを  --%>
<text mode="1"
      size="1"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%--個口番号  --%>
<text mode="1"
      size="1"
      x="1"
      y="12"
      >${screen.itemNm("pieceNo")}:${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.pieceNo)}</text>
<%--荷材CD  --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${screen.itemNm("boxCd")}:</text>
<input mode="1"
       size="1"
       x="8"
       y="16"
       ${screen.inputTextAttr("boxCd")}
       width="19"
       param="boxCd" default="${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.boxCd)}"></input>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
