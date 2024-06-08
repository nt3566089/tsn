<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- %@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %-->

<!-- 入荷検品格納(詳細)ロット・期限日入力 -->

<!-- JAN -->
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- ロット -->
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
       param="lot" default="${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.planLot)}"></input>
<!-- 期限日 -->
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
       param="limitDt" default="${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.planLimitDt)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
