package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveInputDto extends BaseDto {

	public static TStoreRecordHDto chaseTStoreRecordHDto() {
		return chaseTStoreRecordHDto(new TStoreRecordHDto());
	}

	public static TStoreRecordHDto chaseTStoreRecordHDto(TStoreRecordHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}

		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}

		if (dto.getMCustomerBySupplierId() == null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getMCustomerByDepositId() == null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		// 【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
		if (dto.getMStockType() == null)
		{
			dto.setMStockType(new MStockTypeDto());
		}
		//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End
		return dto;
	}

	public static TStoreRecordBDto chaseTStoreRecordBDto() {
		return chaseTStoreRecordBDto(new TStoreRecordBDto());
	}

	public static TStoreRecordBDto chaseTStoreRecordBDto(TStoreRecordBDto dto) {

		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}

		MProductDto mProductDto = new MProductDto();
		if (mProductDto.getMProductShapeList() == null) {
			mProductDto.setMProductShapeList(new ArrayList<MProductShapeDto>());
		}

		TReceivePlanBDto tReceivePlanBDto = new TReceivePlanBDto();
		if (tReceivePlanBDto.getMProduct() == null) {
			tReceivePlanBDto.setMProduct(mProductDto);
		}

		if (dto.getTReceivePlanB() == null) {
			dto.setTReceivePlanB(tReceivePlanBDto);
		}

		return dto;
	}

	public static class ReceiveInputData implements Serializable {

		// 入荷実績入力(予定なし)画面ヘッダ情報(実績)
		public TStoreRecordHDto storeHead = chaseTStoreRecordHDto();

		// 入荷実績入力(予定なし)画面明細情報(実績)
		public List<TStoreRecordBDto> storeBody = new ArrayList<TStoreRecordBDto>();

		// 空行情報
		public TStoreRecordBDto blankRow = chaseTStoreRecordBDto();

		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
		// 入荷実績入力(予定なし)画面ヘッダ情報(変更前-実績)
		public TStoreRecordHDto originalStoreHead;
		// 入荷実績入力(予定なし)画面明細情報(変更前-実績)
		public List<TStoreRecordBDto> originalStoreBody;
		// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
		// 商品ラベル出力設定
		public int printFlg;
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		//public ProductLabelPrintDto reportData = new ProductLabelPrintDto();
		public ProductLabelPrintDto productLabelPrintDto = new ProductLabelPrintDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End

		public StoreLabelPrintDto storeLabelPrintDto = new StoreLabelPrintDto();

		public PrintParamDto directionsPrintParam = new PrintParamDto();

		public String resultAfterProductTarget;
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End

	};

	public ReceiveInputData data = new ReceiveInputData();
}
