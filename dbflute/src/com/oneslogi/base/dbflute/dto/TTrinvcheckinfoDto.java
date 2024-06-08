package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTTrinvcheckinfoDto;

/**
 * The entity of T_TRINVCHECKINFO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TTrinvcheckinfoDto extends BsTTrinvcheckinfoDto {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;
    /* 出力帳票  **/
    public String inventoryReport;
    /* アンマッチ有 **/
    public String unmatch;
    /* 銘柄CD **/
    public String itemcd;
    /** 過不足発生場所 */
    public String diffoccarea;
    
	public String getInventoryReport() {
		return inventoryReport;
	}
	public void setInventoryReport(String inventoryReport) {
		this.inventoryReport = inventoryReport;
	}
	public String getUnmatch() {
		return unmatch;
	}
	public void setUnmatch(String unmatch) {
		this.unmatch = unmatch;
	}
	public String getItemcd() {
		return itemcd;
	}
	public void setItemcd(String itemcd) {
		this.itemcd = itemcd;
	}
	public String getDiffoccarea() {
		return diffoccarea;
	}
	public void setDiffoccarea(String diffoccarea) {
		this.diffoccarea = diffoccarea;
	}
    
    
}
