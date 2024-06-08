package com.oneslogi.wms.resources.inventory;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlInstKeyListDto;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryInstDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlInstKeyListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyList;
import com.oneslogi.base.dbflute.exentity.customize.SqlInstKeyPrint;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.inventory.InstKeyListDto;
import com.oneslogi.wms.dto.inventory.InstKeyPrintDto;
import com.oneslogi.wms.dto.report.NonconformityStockReportListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.inventory.InstKeyListSelectLogic;
import com.oneslogi.wms.logic.inventory.NonconformityStockReportPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * 在庫調査指示一覧画面のリソースクラス。
 */
@Path("/inventory/instKeyList")
public class InstKeyListResource extends AbstractWmsResource {
	
	private static final String REPORT_CD = "NonconformityStockReportList";
	private static final String CLASS_CD_SYHN_KBN = "SYHN_KBN";
	
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 在庫調査区分'不適品'以外は発行できません
		 */		
		protected static final int INVENTORY_INST_KBN_ERR = 3;

	}
	

	// ===== 使用ロジッククラス =====
	@Inject
	InstKeyListSelectLogic selectLogic;
	@Inject
	NonconformityStockReportPrintLogic selectReportLogic;
	
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InstKeyListDto 在庫調査指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public InstKeyListDto init() {
		InstKeyListDto dto = new InstKeyListDto();

		// 発行帳票を指定
		dto.data.instKeyPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return dto;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・在庫調査指示一覧を行う
	 * </pre>
	 * @param inventoryHistoryDto 在庫調査指示一覧画面用DTO
	 * @return InventoryHistoryDto 在庫調査指示一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public InstKeyListDto search(InstKeyListDto instKeyListDto) throws IOException {

		InstKeyListDto resultInstKeyListmDto = new InstKeyListDto();

		// Entity変換
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH tInventoryH = headerMapper.mappingToEntity(instKeyListDto.data.head);
		TInventoryInstDtoMapper instMapper = new TInventoryInstDtoMapper();
		TInventoryInst tInventoryInst = instMapper.mappingToEntity(instKeyListDto.data.inst);

		// ===== センタIDを取得 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tInventoryH.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if(mCenter == null) {
			this.getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		tInventoryH.setCenterId(mCenter.getCenterId());

		// =====荷主IDを取得
		MClient mClient = new MClient();
		mClient.setClientCd(tInventoryH.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if(mClient == null) {
			this.getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}		
		tInventoryH.setClientId(mClient.getClientId());

		// システム日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		if(mClientCenter == null) {
			this.getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
			return null;
		}
				
		String strLINE1_DISP = getFormatLeftAlignment("* 980 カジュアル",18);
		
		String strLINE2_DISP = getFormatLeftAlignment("  200 用度品",18);
		
		// 在庫調査指示一覧ータ取得用
		PagingResultBean<SqlInstKeyList> page = selectLogic.select(tInventoryH, tInventoryInst, instKeyListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		
		
		
		// Dto変換処理
		SqlInstKeyListDtoMapper mapper = new SqlInstKeyListDtoMapper();
		List<SqlInstKeyListDto> list = mapper.mappingToDtoList(page);

		resultInstKeyListmDto.paging = instKeyListDto.paging;
		resultInstKeyListmDto.data.bodyList = list;

		return resultInstKeyListmDto;
	}
	
	
	/**
	 * <h2>不適品在庫調査表発行。</h2>
	 * <pre>
	 * ・不適品在庫調査表データを取得する
	 * ・帳票を発行する
	 * </pre>
	 * @param inventoryDiffListPrintDto 不適品在庫調査表発行画面用DTO
	 * @return InventoryDiffListPrintDto 不適品在庫調査表発行画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/inputPrint")
	public StatusDto inputPrint(final InstKeyPrintDto instKeyPrintDto) throws Exception {
	    //明細関連チェック
		// 不適品在庫調査表データの取得のパラメータ編集
		SqlInstKeyListDtoMapper mapper = new SqlInstKeyListDtoMapper();
		SqlInstKeyList entity  = mapper.mappingToEntity(instKeyPrintDto.data.bodyList.get(0));
		
		if (!CDef.InventoryInstKbn.$06.code().equals(entity.getInventoryInstKbn())) {
			this.getErrorManager().add(new ErrorStatus(StatusCode.INVENTORY_INST_KBN_ERR), WmsMessageConst.INST_KEY_LIST_INVENTORY_INST_KBN_SELECT_SUITABLE_ERROR);
			return null;
		}

		//処理終了
		return null;
		
	}
	
	/**
	 * <h2>不適品在庫調査表発行。</h2>
	 * <pre>
	 * ・不適品在庫調査表データを取得する
	 * ・帳票を発行する
	 * </pre>
	 * @param inventoryDiffListPrintDto 不適品在庫調査表発行画面用DTO
	 * @return InventoryDiffListPrintDto 不適品在庫調査表発行画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public InstKeyPrintDto print(final InstKeyPrintDto instKeyPrintDto) throws Exception {

		// 発行帳票を指定
		instKeyPrintDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		// Entity変換
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH tInventoryH = headerMapper.mappingToEntity(instKeyPrintDto.data.head);

		// ===== センタIDを取得 =====
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(tInventoryH.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		
		BUser bUser = new BUser();
		bUser.setUserCd(instKeyPrintDto.data.getUserCd());
		bUser = userLogic.getUkEntity(bUser);
		
		// ===== 不適品在庫調査表データの取得 =====
		
		// 不適品在庫調査表データの取得のパラメータ編集
		SqlInstKeyListDtoMapper mapper = new SqlInstKeyListDtoMapper();
		SqlInstKeyList entity  = mapper.mappingToEntity(instKeyPrintDto.data.bodyList.get(0));

		// 在不適品在庫調査表データ取得クラス.作業データ取得メソッドを呼出し
		List<SqlInstKeyPrint> list= selectReportLogic.select(entity,errRetSts(StatusCode.NOT_FOUND_DATA));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 不適品在庫調査表発行取得処理
		List<NonconformityStockReportListDto> dataList = getPrintData(list, mCenter, bUser);

		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//不適品在庫調査表を発行する
		instKeyPrintDto.printBasicData.outputData = json.format(dataList);
		printLogic.print(instKeyPrintDto);

		InstKeyPrintDto ret = new InstKeyPrintDto();
		ret.output = instKeyPrintDto.output;

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		
		return ret;
	}
	
	
	/**
	 * <h2>不適品在庫調査表発行用データに変換する</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・不適品在庫調査表発行用データに変換する
	 * </pre>
	 * @param List<SqlInstKeyPrint> 不適品在庫調査表データ
	 * @return List<NonconformityStockReportDto> 不適品在庫調査表帳票用DTO
	 * @throws Exception
	 */
	private List<NonconformityStockReportListDto> getPrintData(List<SqlInstKeyPrint> list, MCenter mCenter, BUser bUser) {

		List<NonconformityStockReportListDto> retList = new ArrayList<NonconformityStockReportListDto>();
		BigDecimal decDiffqtyHenpin2 = new BigDecimal(0);
		BigDecimal decDiffqtyTaxrefond2 = new BigDecimal(0);
		BigDecimal decDiffqtyHenpin3 = new BigDecimal(0);
		BigDecimal decDiffqtyTaxrefond3 = new BigDecimal(0);
		BigDecimal decNonconformityStockTotalNum2= new BigDecimal(0);
		BigDecimal decStockCaseSu2= new BigDecimal(0);
		BigDecimal decMonthStatusSu2= new BigDecimal(0);
		BigDecimal decStockCartonSu2= new BigDecimal(0);
		BigDecimal decSuffErerQty2= new BigDecimal(0);
		BigDecimal decPackingNum2= new BigDecimal(0);
		BigDecimal decRefundItemQty2= new BigDecimal(0);
		
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		// 銘柄区分
		classCdList.add(CLASS_CD_SYHN_KBN);
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl bClassDtl : bClassList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
			} else {
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}
		
		for (SqlInstKeyPrint sqlInstKeyPrint : list) {
			// 不適品在庫調査表帳票用DTO設定
			NonconformityStockReportListDto dto = new NonconformityStockReportListDto();
			//在庫調査日
			dto.setInventoryDt(sqlInstKeyPrint.getInventoryDt());
			//銘柄区分
			String syhnKbn = "";
			if(CDef.Fcflg.$A000.code().equals(sqlInstKeyPrint.getFcflg())) {
				syhnKbn = CDef.SyhnKbn.$A000.code();
			}else {
				//商品CDの桁数>=3の場合
				if(sqlInstKeyPrint.getProductCd().length() >= 3) {
					//商品CDの左から3桁目が0の場合、商品とします
					if("0".equals(sqlInstKeyPrint.getProductCd().substring(2, 2))) {
						syhnKbn =CDef.SyhnKbn.$0000.code();
					}
					else {
						//商品CDの左から3桁目が0以外、輸入とします
						syhnKbn =CDef.SyhnKbn.$0001.code();
					}
				}else {
					//商品CDの桁数<3の場合、輸入とします
					syhnKbn =CDef.SyhnKbn.$0001.code();
				}
			}
			//銘柄名称
			if (bClassMap.containsKey(CLASS_CD_SYHN_KBN)) {
				if (bClassMap.get(CLASS_CD_SYHN_KBN).containsKey(syhnKbn)) {
					dto.setUserNum4(bClassMap.get(CLASS_CD_SYHN_KBN).get(syhnKbn));
				}
			}
			//内外区分(ソートキー)
			dto.setFcFlg(sqlInstKeyPrint.getFcflg());
			//銘柄コード
			dto.setProdctCd(sqlInstKeyPrint.getProductCd());
			//銘柄名称
			dto.setProductAbbr(sqlInstKeyPrint.getProductNm());
			//累計過不足_返品
			dto.setDiffqtyHenpin1(BigDecimal.valueOf(sqlInstKeyPrint.getDiffqtyHenpin()));
			//累計過不足_国税還付品
			dto.setDiffqtyTaxRefond1(BigDecimal.valueOf(sqlInstKeyPrint.getDiffqtyTaxrefond()));
			//不適品在庫計
			dto.setNonconformityStockTotalNum1(sqlInstKeyPrint.getChargeNum());
			//1ケース当カートン数
			Long unit1 = null;
			unit1 = WCC.longValue(sqlInstKeyPrint.getUnit1());
			//1カートン当個数
			Long unit2 = null;
			unit2 = WCC.longValue(sqlInstKeyPrint.getUnit2());
			//②引当可能数-②り災品-②不適品ラベル作成個装数-②一括登録個装数
			Long stockQty = WCC.longValue(sqlInstKeyPrint.getChargeNum().subtract(WCC.toBigDecimal(sqlInstKeyPrint.getSuffererQty())).subtract(WCC.toBigDecimal(sqlInstKeyPrint.getMonthStatussu())).subtract(WCC.toBigDecimal(sqlInstKeyPrint.getBlukRecivedQty())));
			//[TSN］共通処理： ケースを取得する処理
			//ケース取得 (共通関数未作成の為適当な値を代入)
			Long stockQtyCase = null;
			stockQtyCase = 1000L;
			//[TSN］共通処理未作成
			//stockQtyCase = XXXXX.getQtyCaseConversion(stockQtyCase, unit1, unit2);
			dto.setStockCaseSu1(WCC.toBigDecimal(stockQtyCase));
			//[TSN］共通処理：カートンを取得する処理
			//カートン取得 (共通関数未作成の為適当な値を代入)
			Long stockQtyCarton = null;
			stockQtyCarton = 1000L;
			//[TSN］共通処理未作成
			//stockQtyCarton = XXXXX.getQtyCartonConversion(stockQtyCarton, unit1, unit2);
			dto.setStockCartonSu1(WCC.toBigDecimal(stockQtyCarton));
			//個装
			Long monthStatusSu = (stockQty - (stockQtyCase*unit1) -  (stockQtyCarton*unit2));
			dto.setMonthStatusSu1(WCC.toBigDecimal(monthStatusSu));
			//り災品
			dto.setSuffErerQty1(WCC.toBigDecimal(sqlInstKeyPrint.getSuffererQty()));
			//梱包数
			dto.setPackingNum1(WCC.toBigDecimal(sqlInstKeyPrint.getMonthStatussu()).add(WCC.toBigDecimal(sqlInstKeyPrint.getBlukRecivedQty())));
			//国税還付品
			dto.setRefundItemQty1(WCC.toBigDecimal(sqlInstKeyPrint.getRefunditemQty()));
			//一般出力順
			dto.setUserNum(String.valueOf(sqlInstKeyPrint.getUsernum3()));
			
			if (sqlInstKeyPrint.getDiffqtyHenpin() > 0) {
				//過剰_返品
				decDiffqtyHenpin2 = decDiffqtyHenpin2.add(WCC.toBigDecimal(sqlInstKeyPrint.getDiffqtyHenpin()));
			} else {
				//過剰_国税還付品
				decDiffqtyHenpin3 = decDiffqtyHenpin3.add(WCC.toBigDecimal(sqlInstKeyPrint.getDiffqtyHenpin()));
			}
			
			if (sqlInstKeyPrint.getDiffqtyTaxrefond() > 0) {
				//不足_返品
				decDiffqtyTaxrefond2 = decDiffqtyTaxrefond2.add(WCC.toBigDecimal(sqlInstKeyPrint.getDiffqtyTaxrefond()));
			} else {
				//不足_国税還付品
				decDiffqtyTaxrefond3 = decDiffqtyTaxrefond3.add(WCC.toBigDecimal(sqlInstKeyPrint.getDiffqtyTaxrefond()));
			}
			//不適品在庫_合計
			decNonconformityStockTotalNum2 = decNonconformityStockTotalNum2.add(dto.getNonconformityStockTotalNum1());
			//ケース_合計
			decStockCaseSu2 = decStockCaseSu2.add(dto.getStockCaseSu1());
			//カートン_合計
			decStockCartonSu2 = decStockCartonSu2.add(dto.getStockCartonSu1());
			//個装_合計
			decMonthStatusSu2 = decMonthStatusSu2.add(dto.getMonthStatusSu1());
			//り災品_合計
			decSuffErerQty2 = decSuffErerQty2.add(dto.getSuffErerQty1());
			//梱包数_合計
			decPackingNum2 = decPackingNum2.add(dto.getPackingNum1());
			//国税還付品_合計
			decRefundItemQty2 = decRefundItemQty2.add(dto.getRefundItemQty1());
			//拠点コ－ド
			dto.setCenterCd(mCenter.getCenterCd());
			//拠点名称
			dto.setCenterNm(mCenter.getCenterNm());
			//ユーザコード
			dto.setUserCd(bUser.getUserCd());
			//ユーザ名称
			dto.setUserNm(bUser.getUserNm());
			//たばこ商品区分
			dto.setCggdId(sqlInstKeyPrint.getCggdidNm());
			//たばこ商品区分(ソートキー)
			dto.setCggdId2(sqlInstKeyPrint.getCggdid());
			
			retList.add(dto);
		}

		for (NonconformityStockReportListDto dto : retList) {
			//過剰_返品
			dto.setDiffqtyHenpin2(decDiffqtyHenpin2);
			//過剰_国税還付品
			dto.setDiffqtyHenpin3(decDiffqtyHenpin3);
			//不足_返品
			dto.setDiffqtyTaxRefond2(decDiffqtyTaxrefond2);
			//不足_国税還付品
			dto.setDiffqtyTaxRefond3(decDiffqtyTaxrefond3);
			//不適品在庫_合計
			dto.setNonconformityStockTotalNum2(decNonconformityStockTotalNum2);
			//ケース_合計
			dto.setStockCaseSu2(decStockCaseSu2);
			//カートン_合計
			dto.setStockCartonSu2(decStockCartonSu2);
			//個装_合計
			dto.setMonthStatusSu2(decMonthStatusSu2);
			//り災品_合計
			dto.setSuffErerQty2(decSuffErerQty2);
			//梱包数_合計
			dto.setPackingNum2(decPackingNum2);
			//国税還付品_合計
			dto.setRefundItemQty2(decRefundItemQty2);
		}
		
		return retList;
	}
	
	/**
     * 左寄せにした値を返却（遷移元から桁数受け取る）
     *
     * @param target         表示する名称
     * @param numberOfDigits 桁数
     * @return               左寄せした値
     * @throws Exception
     */
	public static String getFormatLeftAlignment(String target, int numberOfDigits){
		int ret = 0;
		// 全角半角判定
		char[] c = target.toCharArray();
		for(int i=0;i<c.length;i++) {
		    if(String.valueOf(c[i]).getBytes().length <= 1){
		      ret += 1; // 半角文字なら＋１
		    }else{
		      ret += 2; // 全角文字なら＋２
		    }
		  }

        int bytaget = target.length();

        if (target.length() > numberOfDigits) {
            // 指定の桁数より文字が多い場合指定文字で抜き出す
            return target.substring(0,numberOfDigits);
        }else {
            return String.format("%-"+(numberOfDigits-(ret-bytaget))+"s", target);
        }
	}
    
    private String Format_ASTERISK(String strAsterisk) {
        return strAsterisk;
    }
    
    private String Format_CATEGORY_CD(String strCATEGORY_CD) {
        strCATEGORY_CD = strCATEGORY_CD.substring(strCATEGORY_CD.length() - 3, strCATEGORY_CD.length());        
        return strCATEGORY_CD;
    }
    
    private String Format_CATEGORY_NM(String strCATEGORY_NM) {
        return strCATEGORY_NM;
    }

}