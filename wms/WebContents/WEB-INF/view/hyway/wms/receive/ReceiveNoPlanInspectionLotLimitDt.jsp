<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- %@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %-->

<!-- 予定無し入荷(詳細)ロット・期限日入力 -->

<!-- JAN -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.janCd)}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
>${screen.itemNm("lot")}:</text>
<input mode="1"
       size="2"
       x="2"
       y="19"
       adjusty="0"
       width="26"
       ${screen.inputTextAttr("lot", isOcrFlg)}
       param="lot" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.lot)}"></input>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
>${screen.itemNm("limitDt")}:</text>
<input mode="1"
       size="2"
       x="2"
       y="28"
       adjusty="0"
       width="26"
       ${screen.inputDateAttr("limitDt", isOcrFlg)}
       param="limitDt" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt)}"></input>
<%@ include file="../../base/HTBaseFooter.jsp" %>
