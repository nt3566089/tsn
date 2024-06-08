<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(詳細)期限日入力 -->

<!-- JAN -->
<%-- 入荷検品(詳細)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("limitDt")}:</text>
<input mode="1"
       size="2"
       x="2"
       y="19"
       adjusty="0"
       width="26"
       ${screen.inputDateAttr("limitDt", isOcrFlg)}
       param="limitDt" default="${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLimitDt)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
