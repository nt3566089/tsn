<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(ｿｰｽCD)画面 --%>

<%-- ピッキンググループNo  --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("pickingGroupNo")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${fn:escapeXml(SingleRowShippingNoPackingDto.getWSglRowShipInspHDto().getPickingGroupNo())}</text>

<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(SingleRowShippingNoPackingDto.getWSglRowShipInspHDto().getMProduct().getProductCd())}</text>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${fn:escapeXml(SingleRowShippingNoPackingDto.getWSglRowShipInspHDto().getMProduct().getProductNm())}</text>

<%-- 作業指示数 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(SingleRowShippingNoPackingDto.getWSglRowShipInspHDto().getWorkInstNum())}</text>

<%-- ソースCD --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="22"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="21"
       param="janCd" default="${fn:escapeXml(SingleRowShippingNoPackingDto.getInspData().getInputJanCd())}"></input>

<%-- 検品数 --%>
<text mode="1"
      size="2"
      x="1"
      y="26"
      adjusty="0"
      >${screen.itemNm("inspectionQty")}:${screen.stripTrailingZeros(SingleRowShippingNoPackingDto.getUserInspectedQty())}</text>

<%-- 伝票残数 --%>
<text mode="1"
      size="2"
      x="1"
      y="29"
      >${screen.itemNm("slipQtyRemain")}:${screen.stripTrailingZeros(SingleRowShippingNoPackingDto.getSlipQtyRemain())}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
