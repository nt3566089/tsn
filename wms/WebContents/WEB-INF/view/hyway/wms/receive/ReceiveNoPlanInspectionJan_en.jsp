<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(JAN入力) -->

<!-- 顧客入荷指示No -->
<%-- 顧客入荷指示No --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("clientReceiveNo")}:</text>

<%-- ClientReceiveNoValue --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.clientReceiveNo)}</text>


<!-- J/商 -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
>${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="1"
       x="5"
       y="10"
       adjusty="0"
       width="20"
       ${screen.inputTextAttr("janCd")}
       param="productCd" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.janProdCd)}"></input>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
>${screen.itemNm("productCd")}:</text>

<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
>${screen.itemNm("stockType")}:</text>

<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<!-- 数量 -->
<%-- 数量 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
>${screen.itemNm("qty")}:</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
