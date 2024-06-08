<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(汎用) -->

<!-- JAN -->
<%-- 入荷検品(汎用)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.MStockType.VDict.dictNm)}</text>

<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLot)}</text>
<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLimitDt)}</text>
<!-- 数量 -->
<%-- 数量 --%>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(ReceiveInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<!-- 汎用ラベルNo -->
<%-- 汎用ラベルNo --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("hanyou")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="28"
       adjusty="0"
       ${screen.inputTextAttr("hanyou")}
       width="26"
       param="storeLabelNo" default="${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planStoreLabelNo)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
