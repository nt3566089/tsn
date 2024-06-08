<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto" %>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw Start-->
<c:set var="receiveSlipNo" value="${SerialReceiveInspectionDto.receiveSlipNo}"/>
<c:set var="supplierCd" value="${SerialReceiveInspectionDto.supplierCd }"/>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw End-->

<!-- シリアル登入(ｿｰｽCD) -->

<!-- 伝票No -->
<c:if test="${not empty receiveSlipNo}">
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
	      >${fn:escapeXml(SerialReceiveInspectionDto.receiveSlipNo)}</text>
</c:if>
<c:if test="${empty receiveSlipNo}">
	<c:if test="${empty supplierCd}">
		<text mode="1"
	      size="2"
	      x="1"
	      y="4"
	      adjusty="0"
	      >${screen.itemNm("workNo")}:</text>
	</c:if>
<!-- [#1838] プロパティ設定修正 2017.6.8 nayzaw Start -->
	<c:if test="${not empty supplierCd}">

		<text mode="1"
		      size="2"
		      x="1"
		      y="4"
		     adjusty="0"
		      >${screen.itemNm("customer")}:</text>

		<text mode="1"
		      size="2"
		      x="12"
		      y="4"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierCd)}</text>

		<text mode="1"
		      size="2"
		      x="1"
		      y="7"
		      adjusty="0"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierNm)}</text>
	</c:if>
<!-- [#1838] プロパティ設定修正 2017.6.8 nayzaw End -->
</c:if>
<!-- J/商 -->
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>

<text mode="1"
      size="2"
      x="10"
      y="10"
      >${fn:escapeXml(SerialReceiveInspectionDto.janProdCd)}</text>

<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("productCd")}:</text>

<text mode="1"
      size="2"
      x="9"
      y="13"
      >${fn:escapeXml(SerialReceiveInspectionDto.productCd)}</text>


<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(SerialReceiveInspectionDto.productNm)}</text>

<!-- ｼﾘｱﾙ -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("serialNo")}:${fn:escapeXml(SerialReceiveInspectionDto.startSerialNo)}</text>

<!-- 数量 -->
<text mode="1"
      size="2"
      x="1"
      y="23"
      >${screen.itemNm("planLot")}:</text>

<input mode="1"
       size="2"
       x="9"
       y="23"
       adjusty="0"
       width="21"
       ${screen.inputNumberAttr("planLot")}
       param="serialNum" default="${fn:escapeXml(SerialReceiveInspectionDto.serialNum)}"></input>

<!-- シリアル -->
<text mode="1"
      size="2"
      x="1"
      y="27"
      adjusty="0"
      >${screen.itemNm("planSerial")}:</text>

<!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw Start  -->
<input mode="1"
       size="2"
       x="9"
       y="27"
       adjusty="0"
       width="21"
       ${screen.inputTextAttr("planSerial", isOcrFlg)}
       param="endSerialNo" default="${fn:escapeXml(SerialReceiveInspectionDto.endSerialNo)}"></input>

 <!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw End  -->
<%@ include file="../../base/HTBaseFooter.jsp" %>
