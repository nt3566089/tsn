<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品(数量)画面 -->
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
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<!-- JAN -->
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 在区 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.MStockType.VDict.dictNm)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<%--[#2379][Ver3.0] 複数荷姿対応 2017.11.09 miyabe Start --%>
<!-- 予数 -->
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveInspectionDto.TReceivePlanBDto.totalPreceNum)}</text>
<!-- 数量 -->
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("qty")}:</text>
<%-- [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Mod Start --%>
<input mode="1"
       size="2"
       x="9"
       y="25"
       adjusty="0"
       width="15"
       ${screen.inputNumberAttr("qty")}
       param="qty"
       default="${screen.stripTrailingZeros(ReceiveInspectionDto.qty)}"></input>
<%-- [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Mod End --%>
<%--[#2379][Ver3.0] 複数荷姿対応 2017.11.09 miyabe End --%>
<%-- [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Add Start --%>
<button type="1"
        key=""
        x="25"
        y="25"
        adjusty="0"
        width="5"
        size="2"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%-- [#2739][Ver3.0] 複数荷姿対応（WMS共通機能） 2017.10.23 honma Add End --%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
