<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto" %>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw Start-->
<c:set var="receiveSlipNo" value="${SerialReceiveInspectionDto.receiveSlipNo}"/>
<c:set var="supplierCd" value="${SerialReceiveInspectionDto.supplierCd }"/>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw End-->
<!-- シリアル登入(ｿｰｽCD) -->

<!-- 伝票No -->
<!-- 仕入先 -->
<c:if test="${empty receiveSlipNo}">
	<!-- [#1844] 追加指示-伝票Noも仕入先も設定しない場合、「伝票No」ラベルを表示する 2017.5.29 Add Start -->
	<c:if test="${empty supplierCd}">
		<!-- [#4022] xml不正 2018.03.09 kawana Start -->
		<text mode="1"
		      size="1"
		      x="1"
		      y="4"
		      adjusty="0"
		      >${screen.itemNm("workNo")}:</text>
		<!-- [#4022] xml不正 2018.03.09 kawana End -->
	<!-- [#1844] 追加指示-伝票Noも仕入先も設定しない場合、「伝票No」ラベルを表示する 2017.5.29 Add End -->
	</c:if>
	<c:if test="${not empty supplierCd }">
	<!--  [1838] プロパティ設定修正 2017.6.6 nayzaw Start -->
		<text mode="1"
		      size="1"
		      x="1"
		      y="4"
		     adjusty="0"
		     >${screen.itemNm("customer")}:</text>

	<!--  [1838] プロパティ設定修正 2017.6.6 nayzaw End -->
		<text mode="1"
		      size="1"
		      x="12"
		      y="4"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierCd)}</text>

	<!--  [#1838] シリアル登入のプロパティ設定を修正する 2017.6.6 nayzaw Start -->
		<text mode="1"
		      size="1"
		      x="1"
		      y="7"
		      adjusty="0"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierNm)}</text>

	<!--  [#1838] シリアル登入のプロパティ設定を修正する 2017.6.6 nayzaw End -->
	</c:if>
</c:if>
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
<!-- J/商 -->
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>

<input mode="1"
       size="1"
       x="1"
       y="13"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="30"
       param="productCd" default="${fn:escapeXml(SerialReceiveInspectionDto.janProdCd)}"></input>

<!-- 商品 -->
<text mode="1"
      size="1"
      x="1"
      y="17"
      >${screen.itemNm("productCd")}:</text>

<text mode="1"
      size="1"
      x="10"
      y="13"
     ></text>

<text mode="1"
      size="1"
      x="1"
      y="20"
      adjusty="0"
      ></text>

<!-- 登録数 -->
<text mode="1"
      size="1"
      x="1"
      y="23"
      >${screen.itemNm("planLot")}:</text>
<text mode="1"
      size="1"
      x="15"
      y="23"
      adjusty="0"
      ></text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
