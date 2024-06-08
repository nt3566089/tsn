<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(仕入先) -->

<!-- 仕入先コード -->
<%-- 仕入先 --%>
<text mode="1"
      size="2"
      x="1"
      y="5"
>${screen.itemNm("supplierCd")}:</text>
<input mode="1"
       size="2"
       x="13"
       y="5"
       width="18"
       ${screen.inputTextAttr("supplierCd")}
       param="supplier" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.supplier)}"></input>
<!-- 仕入先名称 -->
<%-- 仕入先名称 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
>${screen.itemNm("supplierNm")}:</text>

<%-- 仕入先名称 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.supplierNm)}</text>

<!-- 顧客入荷指示No.  -->
<%-- 顧客入荷指示No. --%>
<text mode="1"
      size="2"
      x="1"
      y="17"
>${screen.itemNm("clientReceiveNo")}</text>
<input mode="1"
       size="2"
       x="1"
       y="20"
       width="30"
       ${screen.inputTextAttr("clientReceiveNo")}
       param="clientReceiveNo" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.clientReceiveNo)}"></input>

<button y="32"
        x="15"
        size="2"
        width="16"
        url="ReceiveNoPlanInspectionSupplier/supplier"
        key="d"
        type="2">F4:${screen.itemNm("option2")}</button>
<%@ include file="../../base/HTBaseFooter.jsp" %>
