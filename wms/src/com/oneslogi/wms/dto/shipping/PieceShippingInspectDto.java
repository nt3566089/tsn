package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.TAllocInstBDto;
import com.oneslogi.base.dbflute.dto.WShippingInterruptDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PieceShippingInspectDto extends PagingDto {

	public static WShippingInterruptDto chaseWShippingInterruptDto() {
		return chaseWShippingInterruptDto(new WShippingInterruptDto());
	}

	public static WShippingInterruptDto chaseWShippingInterruptDto(WShippingInterruptDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class ShippingInpectData implements Serializable {
		//検索条件を入れるDTO
		public WShippingInterruptDto search = chaseWShippingInterruptDto();
		//検索結果を入れるDTO
		public List<TAllocInstBDto> list = new ArrayList<TAllocInstBDto>();
		//blankRow
		public TAllocInstBDto blankRow = new TAllocInstBDto();

//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 Start
		//ピース荷姿入数
		public Long unitNumP = 0L;
		//ケース荷姿入数
		public Long unitNumC = 0L;
//[C-CWMS-0049]ケース検品タグの入数をケース荷姿の入数に修正 2016/1/13 chou 追加 End

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja Start
		public String isBoxSelectSkip = "0"; // 荷材選択スキップ 0：スキップしない、1：スキップする
		public MBoxDto defaultBox = new MBoxDto(); // デフォルト荷材
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.03 sja End

		// [Ver3.1][#5117]荷札自動発行ロジック変更に伴いDTOから荷札出力フラグ削除 2018.09.19 matsumoto Del

		// キャリアEDIシステム(CES)連携対応 2018.01.16 HAN Start
		// キャリアEDIシステム連携フラグ
		public String cesIntegationFlg;
		// 納品明細書自動発行フラグ
		public String packingSlipAutoOutputFlg;
		// Bill of Lading出力対象フラグ
		public String bolOutputTargetFlg;
		// Weight
		public BigDecimal weight;
		// ZPL
		public String zplData;
		// キャリアEDIシステム(CES)連携対応 2018.01.16 HAN End
	};

	public ShippingInpectData data = new ShippingInpectData();

}
