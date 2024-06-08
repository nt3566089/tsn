<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto" %>
<!-- [#1838] プロパティ設定修正 2017.6.7 nayzaw Start -->
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw Start-->
<c:set var="receiveSlipNo" value="${SerialReceiveInspectionDto.receiveSlipNo}"/>
<c:set var="supplierCd" value="${SerialReceiveInspectionDto.supplierCd }"/>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw End-->

<!-- シリアル登入(ｿｰｽCD) -->

<!-- 伝票No -->
<c:if test="${not empty receiveSlipNo}">
	<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      adjusty="0"
	      >${screen.itemNm("workNo")}:</text>

	<text mode="1"
	      size="1"
	      x="1"
	      y="7"
	      >${fn:escapeXml(SerialReceiveInspectionDto.receiveSlipNo)}</text>
</c:if>
<c:if test="${empty receiveSlipNo}">
	<c:if test="${empty supplierCd}">
		<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      adjusty="0"
	      >${screen.itemNm("workNo")}:</text>

	</c:if>
	<c:if test="${not empty supplierCd}">

		<text mode="1"
		      size="1"
		      x="1"
		      y="4"
		      adjusty="0"
		      >${screen.itemNm("customer")}:</text>

		<text mode="1"
		      size="1"
		      x="12"
		      y="4"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierCd)}</text>

		<text mode="1"
		      size="1"
		      x="1"
		      y="7"
		      adjusty="0"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierNm)}</text>
	</c:if>
</c:if>
<!-- J/商 -->
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>

<text mode="1"
      size="1"
      x="10"
      y="10"
      >${fn:escapeXml(SerialReceiveInspectionDto.janProdCd)}</text>

<!-- 商品 -->
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${screen.itemNm("productCd")}:</text>

<text mode="1"
      size="1"
      x="9"
      y="13"
      >${fn:escapeXml(SerialReceiveInspectionDto.productCd)}</text>

<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(SerialReceiveInspectionDto.productNm)}</text>

<!-- 登録数 -->
<text mode="1"
      size="1"
      x="1"
      y="19"
      >${screen.itemNm("planLot")}:</text>

<text mode="1"
      size="1"
      x="13"
      y="19"
      >${fn:escapeXml(SerialReceiveInspectionDto.unitNum)}</text>

<!-- シリアル -->
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planSerial")}:</text>

 <!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw Start  -->
<input mode="1"
       size="1"
       x="6"
       y="22"
       adjusty="0"
       width="21"
       ${screen.inputTextAttr("planSerial",isOcrFlg)}
       param="serialNo" default="${fn:escapeXml(SerialReceiveInspectionDto.serialNo)}"></input>
<!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw End  -->
<!-- [#1838] プロパティ設定修正 2017.6.7 nayzaw End -->

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
