package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsWHtReceiveStoreDto;

/**
 * The entity of w_ht_receive_store.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveStoreDto extends BsWHtReceiveStoreDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 格納済数 */
    private BigDecimal numOfStore;

    /**
	 * @return numOfStore
	 */
	public BigDecimal getNumOfStore() {
		return numOfStore;
	}

	/**
	 * @param numOfStore セットする numOfStore
	 */
	public void setNumOfStore(BigDecimal numOfStore) {
		this.numOfStore = numOfStore;
	}

	/** 残数 */
    private BigDecimal remnantNum;

    /**
	 * @return remnantNum
	 */
	public BigDecimal getRemnantNum() {
		return remnantNum;
	}

	/**
	 * @param remnantNum セットする remnantNum
	 */
	public void setRemnantNum(BigDecimal remnantNum) {
		this.remnantNum = remnantNum;
	}

	/** 入数 */
    private Long shapeUnitNum;

    /**
   	 * @return shapeUnitNum
   	 */
    public Long getShapeUnitNum() {
		return shapeUnitNum;
	}

    /**
	 * @param shapeUnitNum セットする shapeUnitNum
	 */
	public void setShapeUnitNum(Long shapeUnitNum) {
		this.shapeUnitNum = shapeUnitNum;
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA Start */
	/** 仮ロケ */
	public String kariLocCd;
	/** 預託ID */
	public Long depositId;
	/** 預託NM */
	public String depositNm;
	/** 仕入先ID */
	public Long supplierId;
	/** 仕入先NM */
	public String supplierNm;
	/**
   	 * @return kariLocId
   	 */
	public String getKariLocCd() {
		return kariLocCd;
	}
    /**
	 * @param kariLocCd セットする kariLocCd
	 */
	public void setKariLocCd(String kariLocCd) {
		this.kariLocCd = kariLocCd;
	}
    /**
   	 * @return depositId
   	 */
	public Long getDepositId() {
		return depositId;
	}
    /**
	 * @param depositId セットする depositId
	 */
	public void setDepositId(Long depositId) {
		this.depositId = depositId;
	}
    /**
   	 * @return depositNm
   	 */
	public String getDepositNm() {
		return depositNm;
	}
    /**
	 * @param depositNm セットする depositNm
	 */
	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}
    /**
   	 * @return supplierId
   	 */
	public Long getSupplierId() {
		return supplierId;
	}
    /**
	 * @param supplierId セットする supplierId
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
    /**
   	 * @return supplierNm
   	 */
	public String getSupplierNm() {
		return supplierNm;
	}
    /**
	 * @param supplierNm セットする supplierNm
	 */
	public void setSupplierNm(String supplierNm) {
		this.supplierNm = supplierNm;
	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.08.24 By SJA End */
}
