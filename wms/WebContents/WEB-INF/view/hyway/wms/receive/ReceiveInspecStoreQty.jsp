<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 入荷検品格納(数量) -->
<!-- 伝票No -->
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
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<!-- JAN -->
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 在区 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.MStockType.VDict.dictNm)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 予定数 -->
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.TReceivePlanBDto.totalPreceNum)}</text>
<!-- 数量 -->
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("qty")}:</text>
<input mode="1"
       size="2"
       x="9"
       y="25"
       adjusty="0"
       ${screen.inputNumberAttr("qty")}
       width="15"
       param="qty" default="${screen.stripTrailingZeros(ReceiveInspecStoreDto.qty)}"></input>
<button type="1"
        key=""
        x="26"
        y="25"
        adjusty="0"
        width="5"
        size="2"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%@ include file="../../base/HTBaseFooter.jsp" %>
