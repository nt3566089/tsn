<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(JAN入力) -->

<!-- 伝票No -->
<%-- 入荷検品(ｿｰｽCD)画面 --%>

<%-- 伝票No --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("workNo")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<!-- J/商 -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="2"
       x="10"
       y="10"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="20"
       param="productCd" default="${fn:escapeXml(ReceiveInspectionDto.janProdCd)}"></input>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("productCd")}:</text>
<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("stockType")}:</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<!-- 予定数 -->
<%-- 予数 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("planNum")}:</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<!-- 数量 -->
<%-- 数量 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      >${screen.itemNm("qty")}:</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<%@ include file="../../base/HTBaseFooter.jsp" %>
