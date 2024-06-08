package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ProductReceiveListDto extends PagingDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}

		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}

		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {

		if (dto.getTStoreRecordBList().size() == 0) {
			dto.getTStoreRecordBList().add(0, new TStoreRecordBDto());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if (dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg() == null) {
			dto.getTStoreRecordBList().get(0).setBClassDtlByStoreFlg(new BClassDtlDto());
		}
		if (dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().getVDict() == null) {
			dto.getTStoreRecordBList().get(0).getBClassDtlByStoreFlg().setVDict(new VDictDto());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH() == null) {
			dto.getTStoreRecordBList().get(0).setTStoreRecordH(new TStoreRecordHDto());
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerBySupplierId() == null) {
			dto.getTStoreRecordBList().get(0).getTStoreRecordH().setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getTStoreRecordBList().get(0).getTStoreRecordH().getMCustomerByDepositId() == null) {
			dto.getTStoreRecordBList().get(0).getTStoreRecordH().setMCustomerByDepositId(new MCustomerDto());
		}

		return dto;
	}

//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//	public static class ProgressData implements Serializable {
//		//全体件数
//		public Long allCount = 0L;
//		//未入荷件数
//		public Long nonReceiveCount = 0L;
//		//入荷中件数
//		public Long receivingCount = 0L;
//		//入荷済件数
//		public Long storedCount = 0L;
//	};
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

	public static class ProductReceiveListData implements Serializable {
		//検索条件を入れるDTO
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		//検索結果を入れるDTO
		public List<TReceivePlanBDto> list = new ArrayList<TReceivePlanBDto>();
		//進捗状態を入れるDTO
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
//		public ProgressData progress = new ProgressData();
//[ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 SJA Start
		public ReceivePlanListPrintDto test = new ReceivePlanListPrintDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 SJA End
	};

	public ProductReceiveListData data = new ProductReceiveListData();
}
