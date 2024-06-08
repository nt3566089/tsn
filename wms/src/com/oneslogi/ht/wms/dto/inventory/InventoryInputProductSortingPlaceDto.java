package com.oneslogi.ht.wms.dto.inventory;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.customize.SqlTTrsymbolInventoryInputProductSortingPlaceDto;
import com.oneslogi.base.dbflute.dtomapper.MClientCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlTTrsymbolInventoryInputProductSortingPlaceDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrsymbolInventoryInputProductSortingPlace;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 在庫調査入力[仕分場]情報
 *
 */
public class InventoryInputProductSortingPlaceDto extends HandyBaseDto {

    public static class InventoryData implements Serializable {

        /** ********** No.01 d_荷主拠点マスタ ********** **/
        public MClientCenterDto mClientCenterDto = new MClientCenterDto();

        /** ********** No.07 d_棚卸ヘッダ ********** **/
        public TInventoryInstDto tInventoryHDto = new TInventoryInstDto();

        /** ********** No.13 d_段ボール情報 ********** **/
        public SqlTTrsymbolInventoryInputProductSortingPlaceDto tTrsymbolDto = new SqlTTrsymbolInventoryInputProductSortingPlaceDto();

        /** ********** No.14 d_棚卸ボディ ********** **/
        public TInventoryBDto tInventoryBDto = new TInventoryBDto();

        /** 在庫区分データ */
        //public List<MStockTypeDto> lstMStockTypeDto = new ArrayList<MStockTypeDto>();
    };

    public InventoryData data = new InventoryData();

    /** ********** No.01 d_荷主拠点マスタ ********** **/
    /** ********** No.01 d_荷主拠点マスタ ********** 
     * @return mClientCenterDto
     */
    public MClientCenterDto getMClientCenterDto() {
        return data.mClientCenterDto;
    }

    /** ********** No.01 d_荷主拠点マスタ ********** 
     * @param mClientCenterDto
     */
    public void setMClientCenterDto(MClientCenter mClientCenter) {
        this.data.mClientCenterDto = new MClientCenterDtoMapper().mappingToDto(mClientCenter);
    }

    /** ********** No.02 i_ライン ********** **/
    public String inputLine;

    /** ********** No.02 i_ライン ********** 
     * @return inputLine
     */
    public String getInputLine() {
        return inputLine;
    }

    /** ********** No.02 i_ライン ********** 
     * @param set inputLine
     */
    public void setInputLine(String inputLine) {
        this.inputLine = inputLine;
    }

    /** ********** No.03 i_ブロック ********** **/
    public String inputBlock;

    /** ********** No.03 i_ブロック ********** 
     * @return inputBlock
     */
    public String getInputBlock() {
        return inputBlock;
    }

    /** ********** No.03 i_ブロック ********** 
     * @param set inputBlock
     */
    public void setInputBlock(String inputBlock) {
        this.inputBlock = inputBlock;
    }

    /** ********** No.04 o_ライン/ブロック ********** **/
    private String outputLineBlock;

    /** ********** No.04 o_ライン/ブロック ********** 
     * @return outputLineBlock
     */
    public String getOutputLineBlock() {
        return outputLineBlock;
    }

    /** ********** No.04 o_ライン/ブロック ********** 
     * @param set outputLineBlock
     */
    public void setOutputLineBlock(String outputLineBlock) {
        this.outputLineBlock = outputLineBlock;
    }

    /** ********** No.05 i_g_在庫調査指示キー ********** **/
    private String inputOrFetchedInventoryKey;

    /** ********** No.05 i_g_在庫調査指示キー ********** 
     * @return inputOrFetchedInventoryKey
     */
    public String getInputOrFetchedInventoryKey() {
        return inputOrFetchedInventoryKey;
    }

    /** ********** No.05 i_g_在庫調査指示キー ********** 
     * @param set inputOrFetchedInventoryKey
     */
    public void setInputOrFetchedInventoryKey(String inputOrFetchedInventoryKey) {
        this.inputOrFetchedInventoryKey = inputOrFetchedInventoryKey;
    }

    /** ********** No.06 r_在庫調査区分 ********** **/
    //private StockInspectionCategory stockInspectionCategory;
    @SuppressWarnings("unused")
    private String stockInspectionCategoryValue;
    @SuppressWarnings("unused")
    private String stockInspectionCategoryName;

    /** ********** No.06 r_在庫調査区分値 ********** 
     * @return stockInspectionCategory.categoryValue
     */
//    public String getStockInspectionCategoryValue() {
//        return stockInspectionCategory.categoryValue();
//    }

    /** ********** No.06 r_在庫調査区分名 ********** 
     * @return stockInspectionCategory.categoryName
     */
//    public String getStockInspectionCategoryName() {
//        return stockInspectionCategory.categoryName();
//    }

    /** ********** No.06 r_在庫調査区分 ********** 
     * @param set StockInspectionCategory
     */
//    public void setStockInspectionCategory(String categoryValue) {
//        this.stockInspectionCategory = switch (categoryValue) {
//        case "02" -> new StockInspectionCategory("02", "中間検品");
//        case "03" -> new StockInspectionCategory("03", "終了検品");
//        default -> new StockInspectionCategory("01", "開始検品");
//        };
//    }

    /** ********** No.07 d_棚卸ヘッダ ********** **/

    /** ********** No.07 d_棚卸ヘッダ ********** 
     * @return tInventoryHDto
     */
    public TInventoryInstDto getTInventoryHDto() {
        return data.tInventoryHDto;
    }

    /** ********** No.07 d_棚卸ヘッダ ********** 
     * @param set tInventoryHDto
     */
    public void setTInventoryHDto(TInventoryInst tInventoryH) {
        this.data.tInventoryHDto = new TInventoryInstDtoMapper().mappingToDto(tInventoryH);
    }

    /** ********** No.08 i_調査ロケーションCD ********** **/
    private String inputLocationCd;

    /** ********** No.08 i_調査ロケーションCD ********** 
     * @return inputLocationCd
     */
    public String getInputLocationCd() {
        return inputLocationCd;
    }

    /** ********** No.08 i_調査ロケーションCD ********** 
     * @param set inputLocationCd
     */
    public void setInputLocationCd(String inputLocationCd) {
        this.inputLocationCd = inputLocationCd;
    }

    /** ********** No.09 o_ケース補充先 ********** **/
    private String outputSotedUnit;

    /** ********** No.09 o_ケース補充先 ********** 
     * @return outputSotedUnit
     */
    public String getOutputSotedUnit() {
        return outputSotedUnit;
    }

    /** ********** No.09 o_ケース補充先 ********** 
     * @param set outputSotedUnit
     */
    public void setOutputSotedUnit(String outputSotedUnit) {
        this.outputSotedUnit = outputSotedUnit;
    }

    /** ********** No.10 o_ロケーションNo. ********** **/
    private String outputLocationNo;

    /** ********** No.10 o_ロケーションNo. ********** 
     * @return outputLocationNo
     */
    public String getOutputLocationNo() {
        return outputLocationNo;
    }

    /** ********** No.10 o_ロケーションNo. ********** 
     * @param set outputLocationNo
     */
    public void setOutputLocationNo(String outputLocationNo) {
        this.outputLocationNo = outputLocationNo;
    }

    /** ********** No.11 i_2次元バーコード ********** **/
    private String inputBarcode;

    /** ********** No.11 i_2次元バーコード ********** 
     * @return inputBarcode
     */
    public String getInputBarcode() {
        return inputBarcode;
    }

    /** ********** No.11 i_2次元バーコード ********** 
     * @param set inputBarcode
     */
    public void setInputBarcode(String inputBarcode) {
        this.inputBarcode = inputBarcode;
    }

    /** ********** No.12 i_g_製造年月日 ********** **/
    private String inputOrFetchedManufactureDate;

    /** ********** No.12 i_g_製造年月日 ********** 
     * @return inputOrFetchedManufactureDate
     */
    public String getInputOrFetchedManufactureDate() {
        return inputOrFetchedManufactureDate;
    }

    /** ********** No.12 i_g_製造年月日 ********** 
     * @param set inputOrFetchedManufactureDate
     */
    public void setInputOrFetchedManufactureDate(String inputOrFetchedManufactureDate) {
        this.inputOrFetchedManufactureDate = inputOrFetchedManufactureDate;
    }

    /** ********** No.13 d_段ボール情報 ********** **/
    /** ********** No.13 d_段ボール情報 ********** 
     * @return tTrsymbolDto
     */
    public SqlTTrsymbolInventoryInputProductSortingPlaceDto getTTrsymbolDto() {
        return data.tTrsymbolDto;
    }

    /** ********** No.13 d_段ボール情報 ********** 
     * @param set tTTrsymbolDto
     */
    public void setTTrsymbolDto(SqlTTrsymbolInventoryInputProductSortingPlace sqlTTrsymbol) {
        this.data.tTrsymbolDto = new SqlTTrsymbolInventoryInputProductSortingPlaceDtoMapper().mappingToDto(sqlTTrsymbol);
    }

    /** ********** No.14 d_棚卸ボディ ********** **/
    /** ********** No.14 d_棚卸ボディ ********** 
     * @return tInventoryBDto
     */
    public TInventoryBDto getTInventoryBDto() {
        return data.tInventoryBDto;
    }

    /** ********** No.14 d_棚卸ボディ ********** 
     * @param set tInventoryBDto
     */
    public void setTInventoryBDto(TInventoryB tInventoryB) {
        this.data.tInventoryBDto = new TInventoryBDtoMapper().mappingToDto(tInventoryB);
    }

    /** ********** No.15 i_空ロケ押下フラグ ********** **/
    private boolean emptyButtonPressFlag;

    /** ********** No.15 i_空ロケ押下フラグ ********** 
     * @return emptyButtonPressFlag
     */
    public boolean isEmptyButtonPressFlag() {
        return emptyButtonPressFlag;
    }

    /** ********** No.15 i_空ロケ押下フラグ ********** 
     * @param set emptyButtonPressFlag
     */
    public void setEmptyButtonPressFlag(boolean emptyButtonPressFlag) {
        this.emptyButtonPressFlag = emptyButtonPressFlag;
    }

    /** ********** No.16 i_先頭ケースのカートン数 ********** **/
    private String inputHeadCaseCartonQty;

    /** ********** No.16 i_先頭ケースのカートン数 ********** 
     * @return inputHeadCaseCartonQty
     */
    public String getInputHeadCaseCartonQty() {
        return inputHeadCaseCartonQty;
    }

    /** ********** No.16 i_先頭ケースのカートン数 ********** 
     * @param set inputHeadCaseCartonQty
     */
    public void setInputHeadCaseCartonQty(String inputHeadCaseCartonQty) {
        this.inputHeadCaseCartonQty = inputHeadCaseCartonQty;
    }

    /** ********** No.17 i_ケース数 ********** **/
    private String inputCaseQty;
    @SuppressWarnings("unused")
    private String inputCaseQty4;

    /** ********** No.17 i_ケース数 ********** 
     * @return inputCaseQty
     */
    public String getInputCaseQty() {
        return inputCaseQty.trim();
    }

    public String getInputCaseQty4() {
        return inputCaseQty;
    }

    /** ********** No.17 i_ケース数 ********** 
     * @param set inputCaseQty
     */
    public void setInputCaseQty(String inputCaseQty) {
        this.inputCaseQty = String.format("%4s", inputCaseQty);
    }

    /** ********** No.18 i_カートン数 ********** **/
    private String inputCartonQty;
    @SuppressWarnings("unused")
    private String inputCartonQty4;

    /** ********** No.18 i_カートン数 ********** 
     * @return inputCartonQty
     */
    public String getInputCartonQty() {
        return inputCartonQty.trim();
    }

    public String getInputCartonQty4() {
        return inputCartonQty;
    }

    /** ********** No.18 i_カートン数 ********** 
     * @param set inputCartonQty
     */
    public void setInputCartonQty(String inputCartonQty) {
        this.inputCartonQty = String.format("%4s", inputCartonQty);
    }

    /** ********** No.19 i_製品不良数 ********** **/
    private String inputDefectiveQty;
    @SuppressWarnings("unused")
    private String inputDefectiveQty4;

    /** ********** No.19 i_製品不良数 ********** 
     * @return inputDefectiveQty
     */
    public String getInputDefectiveQty() {
        return inputDefectiveQty.trim();
    }

    public String getInputDefectiveQty4() {
        return inputDefectiveQty;
    }

    /** ********** No.19 i_製品不良数 ********** 
     * @param set inputDefectiveQty
     */
    public void setInputDefectiveQty(String inputDefectiveQty) {
        this.inputDefectiveQty = String.format("%4s", inputDefectiveQty);
    }

    /** ********** No.20 g_前回調査製造年月日 ********** **/
    private String fetchedPrevInspectionManufactureDate;

    /** ********** No.20 g_前回調査製造年月日 ********** 
     * @return fetchedPrevInspectionManufactureDate
     */
    public String getFetchedPrevInspectionManufactureDate() {
        return fetchedPrevInspectionManufactureDate;
    }

    /** ********** No.20 g_前回調査製造年月日 ********** 
     * @param set fetchedPrevInspectionManufactureDate
     */
    public void setFetchedPrevInspectionManufactureDate(String fetchedPrevInspectionManufactureDate) {
        this.fetchedPrevInspectionManufactureDate = fetchedPrevInspectionManufactureDate;
    }

    /** ********** No.21 o_仕分予定数量 ********** **/
    private long outputPlannedSortingQty;

    /** ********** No.21 o_仕分予定数量 ********** 
     * @return outputPlannedSortingQty
     */
    public long getOutputPlannedSortingQty() {
        return outputPlannedSortingQty;
    }

    /** ********** No.21 o_仕分予定数量 ********** 
     * @param set outputPlannedSortingQty
     */
    public void setOutputPlannedSortingQty(long outputPlannedSortingQty) {
        this.outputPlannedSortingQty = outputPlannedSortingQty;
    }

    /** ********** No.22 o_仕分実績数量 ********** **/
    private long outputCompletedSortingQty;

    /** ********** No.22 o_仕分実績数量 ********** 
     * @return outputCompletedSortingQty
     */
    public long getOutputCompletedSortingQty() {
        return outputCompletedSortingQty;
    }

    /** ********** No.22 o_仕分実績数量 ********** 
     * @param set outputCompletedSortingQty
     */
    public void setOutputCompletedSortingQty(long outputCompletedSortingQty) {
        this.outputCompletedSortingQty = outputCompletedSortingQty;
    }

    /** ********** No.23 o_仕分差異数量 ********** **/
    private long outputDiscrepancySortingQty;

    /** ********** No.23 o_仕分差異数量 ********** 
     * @return outputDiscrepancySortingQty
     */
    public long getOutputDiscrepancySortingQty() {
        return outputDiscrepancySortingQty;
    }

    /** ********** No.23 o_仕分差異数量 ********** 
     * @param set outputDiscrepancySortingQty
     */
    public void setOutputDiscrepancySortingQty(long outputDiscrepancySortingQty) {
        this.outputDiscrepancySortingQty = outputDiscrepancySortingQty;
    }

    /** ********** No.24 o_さしず実績順序キー ********** **/
    private long outputDirectionOrderKey;

    /** ********** No.24 o_さしず実績順序キー ********** 
     * @return outputDirectionOrderKey
     */
    public long getOutputDirectionOrderKey() {
        return outputDirectionOrderKey;
    }

    /** ********** No.24 o_さしず実績順序キー ********** 
     * @param set outputDirectionOrderKey
     */
    public void setOutputDirectionOrderKey(long outputDirectionOrderKey) {
        this.outputDirectionOrderKey = outputDirectionOrderKey;
    }

    /** ********** No.25 o_製造年月日(登録更新用) ********** **/
    private String outputRegistrationManufactureDate;

    /** ********** No.25 o_製造年月日(登録更新用) ********** 
     * @return outputRegistrationManufactureDate
     */
    public String getOutputRegistrationManufactureDate() {
        return outputRegistrationManufactureDate;
    }

    /** ********** No.25 o_製造年月日(登録更新用) ********** 
     * @param set outputRegistrationManufactureDate
     */
    public void setOutputRegistrationManufactureDate(String outputRegistrationManufactureDate) {
        this.outputRegistrationManufactureDate = outputRegistrationManufactureDate;
    }

    /** ********** No.26 o_製造年月日(作業実績用) ********** **/
    private String outputWorkManufactureDate;

    /** ********** No.26 o_製造年月日(作業実績用) ********** 
     * @return outputWorkManufactureDate
     */
    public String getOutputWorkManufactureDate() {
        return outputWorkManufactureDate;
    }

    /** ********** No.26 o_製造年月日(作業実績用) ********** 
     * @param set outputWorkManufactureDate
     */
    public void setOutputWorkManufactureDate(String outputWorkManufactureDate) {
        this.outputWorkManufactureDate = outputWorkManufactureDate;
    }

    /** ********** No.27 o_方面ピストン ********** **/
    private String outputPiston;

    /** ********** No.27 o_方面ピストン ********** 
     * @return outputPiston
     */
    public String getOutputPiston() {
        return outputPiston;
    }

    /** ********** No.27 o_方面ピストン ********** 
     * @param set outputPiston
     */
    public void setOutputPiston(String outputPiston) {
        this.outputPiston = outputPiston;
    }

    /** ********** No.28 o_銘柄CD ********** **/
    private String outputProductCd;
    @SuppressWarnings("unused")
    private String outputProductCd6;

    /** ********** No.28 o_銘柄CD ********** 
     * @return outputProductCd
     */
    public String getOutputProductCd() {
        return outputProductCd.replaceFirst("^0+(?!$)", "");
    }

    public String getOutputProductCd6() {
        return outputProductCd;
    }

    /** ********** No.28 o_銘柄CD ********** 
     * @param set outputProductCd
     */
    public void setOutputProductCd(String outputProductCd) {
        this.outputProductCd = String.format("%6s", outputProductCd).replace(" ", "0");
    }

    /** ********** No.29 o_銘柄名称 ********** **/
    private String outputProductName;

    /** ********** No.29 o_銘柄名称 ********** 
     * @return outputProductName
     */
    public String getOutputProductName() {
        return outputProductName;
    }

    /** ********** No.29 o_銘柄名称 ********** 
     * @param set outputProductName
     */
    public void setOutputProductName(String outputProductName) {
        this.outputProductName = outputProductName;
    }

}