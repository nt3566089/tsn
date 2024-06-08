<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(詳細)期限日入力 -->

<!-- JAN -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.janCd)}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
>${screen.itemNm("limitDt")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="19"
       adjusty="0"
       ${screen.inputDateAttr("limitDt", isOcrFlg)}
       width="26"
       param="limitDt" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
