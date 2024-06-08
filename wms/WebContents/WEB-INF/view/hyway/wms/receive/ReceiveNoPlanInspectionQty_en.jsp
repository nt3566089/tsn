<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(数量) -->
<!-- 顧客入荷指示No -->
<!-- [ON推-品向-991] 2015/11/13 NayZaw Start -->
<%-- 顧客入荷指示No --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("clientReceiveNo")}:</text>

<%-- 顧客入荷指示No --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.clientReceiveNo)}</text>

<!-- [ON推-品向-991] 2015/11/13 NayZaw End -->
<!-- JAN -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
>${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.janCd)}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
>${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.stockTypeNm)}</text>

<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("qty")}:</text>
<input mode="1"
       size="1"
       x="4"
       y="22"
       adjusty="0"
       width="15"
       ${screen.inputNumberAttr("qty")}
       param="qty"
       default="${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.qty)}"></input>
<button type="1"
        key=""
        x="21"
        y="22"
        adjusty="0"
        width="5"
        size="21"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
