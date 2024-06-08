package com.oneslogi.ht.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.WHtLoadingDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 積込検品情報を保持します
 *
 */
public class ShippingLoadingInspectionDto extends HandyBaseDto {


	public static WHtLoadingDto chaseWHtLoadingDto() {
		return chaseWHtLoadingDto(new WHtLoadingDto());
	}

	public static WHtLoadingDto chaseWHtLoadingDto(WHtLoadingDto dto){
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}


	// to delete nza start
//	public static TPackingHDto chaseTPackingHDto() {
//		return chaseTPackingHDto(new TPackingHDto());
//	}
//
//	public static TPackingHDto chaseTPackingHDto(TPackingHDto dto) {
//		if (dto.getMCenter() == null) {
//			dto.setMCenter(new MCenterDto());
//		}
//		if (dto.getMClient() == null) {
//			dto.setMClient(new MClientDto());
//		}
//		return dto;
//	}

	// to delete nza end

	public static class ShippingLoadingInspectionData implements Serializable {


		/** 梱包ヘッダ */
//		public TPackingHDto tPackingHDto = chaseTPackingHDto();

		/** 梱包ヘッダ一覧 */
//		public List<TPackingHDto> lstTPackingHDto = new ArrayList<TPackingHDto>();

		/** 配送コース */
		public MDeliveryCourseDto mDeliveryCourseDto = new MDeliveryCourseDto();

		/** 配送コースリスト */
		public List<MDeliveryCourseDto> lstMDeliveryCourseDto = new ArrayList<MDeliveryCourseDto>();

		/** 積込検品ワーク */
		public WHtLoadingDto wHtLoadingDto = chaseWHtLoadingDto();

		/** 積込検品ワーク一覧 */
		public List<WHtLoadingDto> lstWHtLoadingDto = new ArrayList<WHtLoadingDto>();

	};

	public ShippingLoadingInspectionData data = new ShippingLoadingInspectionData();

	/**
	 * 貨物追跡No/出荷梱包No
	 */
	public String traceOrPackingNo;

	/**
	 * 積込検品終了した配送コース名称
	 */
	public String finishDeliveryCourseNm;

	public int totalPage;

	/**
	 * @return traceOrPackingNo
	 */
	public String getTraceOrPackingNo() {
		return traceOrPackingNo;
	}

	/**
	 * @param traceOrPackingNo セットする traceOrPackingNo
	 */
	public void setTraceOrPackingNo(String traceOrPackingNo) {
		this.traceOrPackingNo = traceOrPackingNo;
	}

	/**
	 * @return lstDeliveryCourse
	 */
	public List<MDeliveryCourseDto> getLstMDeliveryCourseDto() {
		return data.lstMDeliveryCourseDto;
	}

	/**
	 * @param lstDeliveryCourse
	 */
	public void setLstMDeliveryCourseDto(List<MDeliveryCourseDto> lstMDeliveryCourseDto) {
		this.data.lstMDeliveryCourseDto = lstMDeliveryCourseDto;
	}

	/**
	 * @return mDeliveryCourseDto
	 */
	public MDeliveryCourseDto getmDeliveryCourseDto() {
		return data.mDeliveryCourseDto;
	}

	/**
	 * @param mDeliveryCourse セットする mDeliveryCourse
	 */
	public void setmDeliveryCourseDto(MDeliveryCourseDto mDeliveryCourseDto) {
		this.data.mDeliveryCourseDto = mDeliveryCourseDto;
	}

	/**
	 * @return wHtLoadingDto
	 */
	public WHtLoadingDto getwHtLoadingDto() {
		return data.wHtLoadingDto;
	}

	/**
	 * @param wHtLoadingDto セットする wHtLoadingDto
	 */
	public void setwHtLoadingDto(WHtLoadingDto wHtLoadingDto) {
		data.wHtLoadingDto = wHtLoadingDto;
	}

	/**
	 * @return lstWHtLoadingDto
	 */
	public List<WHtLoadingDto> getLstWHtLoadingDto() {
		return data.lstWHtLoadingDto;
	}

	/**
	 * @param lstWHtLoadingDto セットする lstWHtLoadingDto
	 */
	public void setLstWHtLoadingDto(List<WHtLoadingDto> lstWHtLoadingDto) {
		data.lstWHtLoadingDto = lstWHtLoadingDto;
	}

	/**
	 * @return finishDeliveryCourseNm
	 */
	public String getFinishDeliveryCourseNm() {
		return finishDeliveryCourseNm;
	}

	/**
	 * @param finishDeliveryCourseNm セットする finishDeliveryCourseNm
	 */
	public void setFinishDeliveryCourseNm(String finishDeliveryCourseNm) {
		this.finishDeliveryCourseNm = finishDeliveryCourseNm;
	}

	/**
	 * @return totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage セットする totalPage
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


//	/**
//	 * @return tPackingHDto
//	 */
//	public TPackingHDto getTPackingHDto() {
//		return data.tPackingHDto;
//	}
//
//	/**
//	 * @param tPackingHDto セットする tPackingHDto
//	 */
//	public void setTPackingHDto(TPackingHDto tPackingHDto) {
//		this.data.tPackingHDto = tPackingHDto;
//	}
//
//	/**
//	 * @return lstTPackingHDto
//	 */
//	public List<TPackingHDto> getLstTPackingHDtos() {
//		return data.lstTPackingHDto;
//	}
//
//	/**
//	 * @param lstTPackingHDto セットする lstTPackingHDto
//	 */
//	public void setLstTPackingHDto(List<TPackingHDto> lstTPackingHDto) {
//		this.data.lstTPackingHDto = lstTPackingHDto;
//	}

//	/**
//	 * @return deliveryCourse
//	 */
//	public String getDeliveryCourse() {
//		return deliveryCourse;
//	}
//
//	/**
//	 * @param deliveryCourse セットする deliveryCourse
//	 */
//	public void setDeliveryCourse(String deliveryCourse) {
//		this.deliveryCourse = deliveryCourse;
//	}
//
//	/**
//	 * @return deliveryCourseNm
//	 */
//	public String getDeliveryCourseNm() {
//		return deliveryCourseNm;
//	}
//
//	/**
//	 * @param deliveryCourseNm セットする deliveryCourseNm
//	 */
//	public void setDeliveryCourseNm(String deliveryCourseNm) {
//		this.deliveryCourseNm = deliveryCourseNm;
//	}


}
