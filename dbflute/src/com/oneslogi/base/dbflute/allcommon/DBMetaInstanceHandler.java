package com.oneslogi.base.dbflute.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.exception.DBMetaNotFoundException;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("B_ARG", "com.oneslogi.base.dbflute.bsentity.dbmeta.BArgDbm");
        tmpMap.put("B_ARG_VALID", "com.oneslogi.base.dbflute.bsentity.dbmeta.BArgValidDbm");
        tmpMap.put("B_CLASS", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassDbm");
        tmpMap.put("B_CLASS_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassDtlDbm");
        tmpMap.put("B_CLASS_DTL_SUB", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassDtlSubDbm");
        tmpMap.put("B_CLASS_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassGrpDbm");
        tmpMap.put("B_CLASS_GRP_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BClassGrpDtlDbm");
        tmpMap.put("B_COL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColDbm");
        tmpMap.put("B_COL_EXT_BASE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColExtBaseDbm");
        tmpMap.put("B_COL_EXT_USER", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColExtUserDbm");
        tmpMap.put("B_COL_ROLE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColRoleDbm");
        tmpMap.put("B_COL_VALID", "com.oneslogi.base.dbflute.bsentity.dbmeta.BColValidDbm");
        tmpMap.put("B_CULTURE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BCultureDbm");
        tmpMap.put("B_CULTURE_ATTRIBUTE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BCultureAttributeDbm");
        tmpMap.put("B_DICT", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictDbm");
        tmpMap.put("B_DICT_CULTURE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictCultureDbm");
        tmpMap.put("B_DICT_VALID", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDictValidDbm");
        tmpMap.put("B_DML_LOG", "com.oneslogi.base.dbflute.bsentity.dbmeta.BDmlLogDbm");
        tmpMap.put("B_FUNC", "com.oneslogi.base.dbflute.bsentity.dbmeta.BFuncDbm");
        tmpMap.put("B_FUNC_ROLE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BFuncRoleDbm");
        tmpMap.put("B_INFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.BInfoDbm");
        tmpMap.put("B_ITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemDbm");
        tmpMap.put("B_ITEM_ROLE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemRoleDbm");
        tmpMap.put("B_ITEM_VALID", "com.oneslogi.base.dbflute.bsentity.dbmeta.BItemValidDbm");
        tmpMap.put("B_LOG", "com.oneslogi.base.dbflute.bsentity.dbmeta.BLogDbm");
        tmpMap.put("B_LOG_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BLogDtlDbm");
        tmpMap.put("B_MENU", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMenuDbm");
        tmpMap.put("B_MENU_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMenuGrpDbm");
        tmpMap.put("B_MESSAGE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BMessageDbm");
        tmpMap.put("B_NUMBERING", "com.oneslogi.base.dbflute.bsentity.dbmeta.BNumberingDbm");
        tmpMap.put("B_PASSWORD_POLICY", "com.oneslogi.base.dbflute.bsentity.dbmeta.BPasswordPolicyDbm");
        tmpMap.put("B_PROPERTY", "com.oneslogi.base.dbflute.bsentity.dbmeta.BPropertyDbm");
        tmpMap.put("B_ROLE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleDbm");
        tmpMap.put("B_ROLE_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleGrpDbm");
        tmpMap.put("B_ROLE_GRP_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BRoleGrpDtlDbm");
        tmpMap.put("B_SCREEN", "com.oneslogi.base.dbflute.bsentity.dbmeta.BScreenDbm");
        tmpMap.put("B_SCREEN_ROLE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BScreenRoleDbm");
        tmpMap.put("B_SYSTEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.BSystemDbm");
        tmpMap.put("B_SYSTEM_LOG", "com.oneslogi.base.dbflute.bsentity.dbmeta.BSystemLogDbm");
        tmpMap.put("B_TERMINAL", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTerminalDbm");
        tmpMap.put("B_TIME_ZONE", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTimeZoneDbm");
        tmpMap.put("B_TOKEN", "com.oneslogi.base.dbflute.bsentity.dbmeta.BTokenDbm");
        tmpMap.put("B_USER", "com.oneslogi.base.dbflute.bsentity.dbmeta.BUserDbm");
        tmpMap.put("B_USER_AUTH", "com.oneslogi.base.dbflute.bsentity.dbmeta.BUserAuthDbm");
        tmpMap.put("B_USER_SUB", "com.oneslogi.base.dbflute.bsentity.dbmeta.BUserSubDbm");
        tmpMap.put("E_BARCODE_LABEL", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBarcodeLabelDbm");
        tmpMap.put("E_BONDED_RECEIVE_RECORD_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBondedReceiveRecordSendDbm");
        tmpMap.put("E_BONDED_RECEIVE_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBondedReceiveSendDbm");
        tmpMap.put("E_BONDED_SHIPPING_PLAN_BULK_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBondedShippingPlanBulkInputDbm");
        tmpMap.put("E_BONDED_WMS_RECEIVE_PLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.EBondedWmsReceivePlanDbm");
        tmpMap.put("E_CCOPAM_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECcopamSendDbm");
        tmpMap.put("E_CENTER_STOCK_INFO_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECenterStockInfoSendDbm");
        tmpMap.put("E_CORDDTAAM_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECorddtaamSendDbm");
        tmpMap.put("E_CRELAYBS", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECrelaybsDbm");
        tmpMap.put("E_CSRSTINF_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECsrstinfSendDbm");
        tmpMap.put("E_CUSTOMER", "com.oneslogi.base.dbflute.bsentity.dbmeta.ECustomerDbm");
        tmpMap.put("E_DELIVERY_SORTING", "com.oneslogi.base.dbflute.bsentity.dbmeta.EDeliverySortingDbm");
        tmpMap.put("E_DUTY_FREE_INOUT_RESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.EDutyFreeInoutResultDbm");
        tmpMap.put("E_LOCATION", "com.oneslogi.base.dbflute.bsentity.dbmeta.ELocationDbm");
        tmpMap.put("E_MFCOMPANY", "com.oneslogi.base.dbflute.bsentity.dbmeta.EMfcompanyDbm");
        tmpMap.put("E_MFCOMPANY_M_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EMfcompanyMSendDbm");
        tmpMap.put("E_MH_DRCDIZQA", "com.oneslogi.base.dbflute.bsentity.dbmeta.EMhDrcdizqaDbm");
        tmpMap.put("E_MH_SHIPPING", "com.oneslogi.base.dbflute.bsentity.dbmeta.EMhShippingDbm");
        tmpMap.put("E_MH_STOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.EMhStockDbm");
        tmpMap.put("E_NOTIFICATION_DOMESTIC", "com.oneslogi.base.dbflute.bsentity.dbmeta.ENotificationDomesticDbm");
        tmpMap.put("E_NOTIFICATION_IMPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.ENotificationImportDbm");
        tmpMap.put("E_ORDER_SPLIT_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.EOrderSplitDataDbm");
        tmpMap.put("E_PALLETIZER_INST", "com.oneslogi.base.dbflute.bsentity.dbmeta.EPalletizerInstDbm");
        tmpMap.put("E_PRIMARY_SHIPPING_DTL_INFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.EPrimaryShippingDtlInfoDbm");
        tmpMap.put("E_PRODUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductDbm");
        tmpMap.put("E_PRODUCT_CODE_CONVERSION", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductCodeConversionDbm");
        tmpMap.put("E_PRODUCT_M_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductMSendDbm");
        tmpMap.put("E_PRODUCT_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductSendDbm");
        tmpMap.put("E_PRODUCT_SHAPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductShapeDbm");
        tmpMap.put("E_PRODUCT_STOCK_INFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductStockInfoDbm");
        tmpMap.put("E_PRODUCT_SUPANDDEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductSupanddemDbm");
        tmpMap.put("E_PRODUCT_TRACKING_DOMES", "com.oneslogi.base.dbflute.bsentity.dbmeta.EProductTrackingDomesDbm");
        tmpMap.put("E_RECEIVE_PLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReceivePlanDbm");
        tmpMap.put("E_RECEIVE_RECORD_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReceiveRecordSendDbm");
        tmpMap.put("E_REPLENISH_BREAKDOWN", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReplenishBreakdownDbm");
        tmpMap.put("E_RETURNED_EXCHANGE", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReturnedExchangeDbm");
        tmpMap.put("E_RETURNED_RECEIVE_PLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.EReturnedReceivePlanDbm");
        tmpMap.put("E_SERIAL_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESerialInputDbm");
        tmpMap.put("E_SHIPPING_INOUT_PLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingInoutPlanDbm");
        tmpMap.put("E_SHIPPING_INOUT_PLAN_RECEIVE", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingInoutPlanReceiveDbm");
        tmpMap.put("E_SHIPPING_INST", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingInstDbm");
        tmpMap.put("E_SHIPPING_INST_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingInstDataDbm");
        tmpMap.put("E_SHIPPING_PLAN_BULK_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingPlanBulkInputDbm");
        tmpMap.put("E_SHIPPING_RECORD_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShippingRecordDataDbm");
        tmpMap.put("E_SHIP_INOUT_PLAN_SHIP", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShipInoutPlanShipDbm");
        tmpMap.put("E_SHIP_NOTIFICATION_INFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShipNotificationInfoDbm");
        tmpMap.put("E_SHOP_DOMESTIC_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShopDomesticSendDbm");
        tmpMap.put("E_SHOP_IMPORT_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EShopImportSendDbm");
        tmpMap.put("E_SORTING_NONCONF_STOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESortingNonconfStockDbm");
        tmpMap.put("E_SORTING_STOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESortingStockDbm");
        tmpMap.put("E_STOCKINFOIMPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStockinfoimportDbm");
        tmpMap.put("E_STOCK_INQUIRY_ANSWER", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStockInquiryAnswerDbm");
        tmpMap.put("E_STOCK_INQUIRY_REQUEST", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStockInquiryRequestDbm");
        tmpMap.put("E_STOCK_RECORD_RECEIVE", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStockRecordReceiveDbm");
        tmpMap.put("E_STORE_WORK_INFO_SEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.EStoreWorkInfoSendDbm");
        tmpMap.put("E_SYMBOL_PASTE_RECORD", "com.oneslogi.base.dbflute.bsentity.dbmeta.ESymbolPasteRecordDbm");
        tmpMap.put("E_TRACKING_INFO_IMPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETrackingInfoImportDbm");
        tmpMap.put("E_TRIFCASE", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETrifcaseDbm");
        tmpMap.put("E_TRIFCOMPANYDATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETrifcompanydataDbm");
        tmpMap.put("E_TRIFITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETrifitemDbm");
        tmpMap.put("E_TRIFITEMDATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETrifitemdataDbm");
        tmpMap.put("E_TRIFTRANPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETriftranplanDbm");
        tmpMap.put("E_TRIFTRNODR", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETriftrnodrDbm");
        tmpMap.put("E_TSN_MFCOMPANY", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETsnMfcompanyDbm");
        tmpMap.put("E_TSN_PRODUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETsnProductDbm");
        tmpMap.put("E_TSN_USER", "com.oneslogi.base.dbflute.bsentity.dbmeta.ETsnUserDbm");
        tmpMap.put("E_USER", "com.oneslogi.base.dbflute.bsentity.dbmeta.EUserDbm");
        tmpMap.put("E_ZIP", "com.oneslogi.base.dbflute.bsentity.dbmeta.EZipDbm");
        tmpMap.put("H_INVENTORY_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.HInventoryBDbm");
        tmpMap.put("H_INVENTORY_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.HInventoryHDbm");
        tmpMap.put("H_MOVE_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.HMoveBDbm");
        tmpMap.put("H_MOVE_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.HMoveHDbm");
        tmpMap.put("H_PACKING_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.HPackingBDbm");
        tmpMap.put("H_PACKING_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.HPackingHDbm");
        tmpMap.put("H_RECEIVE_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveBDbm");
        tmpMap.put("H_RECEIVE_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveHDbm");
        tmpMap.put("H_RECEIVE_SPARE", "com.oneslogi.base.dbflute.bsentity.dbmeta.HReceiveSpareDbm");
        tmpMap.put("H_SHIPPING_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingBDbm");
        tmpMap.put("H_SHIPPING_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingHDbm");
        tmpMap.put("H_SHIPPING_SPARE", "com.oneslogi.base.dbflute.bsentity.dbmeta.HShippingSpareDbm");
        tmpMap.put("H_STOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockDbm");
        tmpMap.put("H_STOCK_INOUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockInoutDbm");
        tmpMap.put("H_STOCK_REPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.HStockReportDbm");
        tmpMap.put("M_BOX", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxDbm");
        tmpMap.put("M_BOX_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxGrpDbm");
        tmpMap.put("M_BOX_GRP_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MBoxGrpDtlDbm");
        tmpMap.put("M_CARRIER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierDbm");
        tmpMap.put("M_CARRIER_BOX", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierBoxDbm");
        tmpMap.put("M_CARRIER_SLIP_CES", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipCesDbm");
        tmpMap.put("M_CARRIER_SLIP_SGW", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipSgwDbm");
        tmpMap.put("M_CARRIER_SLIP_YMT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipYmtDbm");
        tmpMap.put("M_CARRIER_SLIP_YUPK", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierSlipYupkDbm");
        tmpMap.put("M_CARRIER_ZIP", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCarrierZipDbm");
        tmpMap.put("M_CBLK", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCblkDbm");
        tmpMap.put("M_CBRCTG", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCbrctgDbm");
        tmpMap.put("M_CDRCATT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCdrcattDbm");
        tmpMap.put("M_CENTER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterDbm");
        tmpMap.put("M_CENTER_CLASS", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassDbm");
        tmpMap.put("M_CENTER_CLASS_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassDtlDbm");
        tmpMap.put("M_CENTER_CLASS_DTL_SUB", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassDtlSubDbm");
        tmpMap.put("M_CENTER_CLASS_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassGrpDbm");
        tmpMap.put("M_CENTER_CLASS_GRP_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterClassGrpDtlDbm");
        tmpMap.put("M_CENTER_COL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterColDbm");
        tmpMap.put("M_CENTER_CUSTOMER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterCustomerDbm");
        tmpMap.put("M_CENTER_ITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterItemDbm");
        tmpMap.put("M_CENTER_SCREEN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCenterScreenDbm");
        tmpMap.put("M_CLIENT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientDbm");
        tmpMap.put("M_CLIENT_CENTER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientCenterDbm");
        tmpMap.put("M_CLIENT_COL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientColDbm");
        tmpMap.put("M_CLIENT_ITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientItemDbm");
        tmpMap.put("M_CLIENT_SCREEN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClientScreenDbm");
        tmpMap.put("M_CLIN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MClinDbm");
        tmpMap.put("M_COMMON_CARRIER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCommonCarrierDbm");
        tmpMap.put("M_CORG", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCorgDbm");
        tmpMap.put("M_CRELAYBS", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCrelaybsDbm");
        tmpMap.put("M_CUSTOMER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MCustomerDbm");
        tmpMap.put("M_DATA_INPUT_TYPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDataInputTypeDbm");
        tmpMap.put("M_DATA_INPUT_TYPE_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDataInputTypeBDbm");
        tmpMap.put("M_DELIVERY_COURSE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MDeliveryCourseDbm");
        tmpMap.put("M_EDI", "com.oneslogi.base.dbflute.bsentity.dbmeta.MEdiDbm");
        tmpMap.put("M_EDI_COLUMN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MEdiColumnDbm");
        tmpMap.put("M_HT_DICT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtDictDbm");
        tmpMap.put("M_HT_DICT_CULTURE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtDictCultureDbm");
        tmpMap.put("M_HT_MESSAGE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MHtMessageDbm");
        tmpMap.put("M_IMPORT_TYPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeDbm");
        tmpMap.put("M_IMPORT_TYPE_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBDbm");
        tmpMap.put("M_IMPORT_TYPE_B_COPY_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBCopyBDbm");
        tmpMap.put("M_IMPORT_TYPE_B_COPY_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.MImportTypeBCopyHDbm");
        tmpMap.put("M_LOCATION", "com.oneslogi.base.dbflute.bsentity.dbmeta.MLocationDbm");
        tmpMap.put("M_MATCHING", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMatchingDbm");
        tmpMap.put("M_MFCOMPANY", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfcompanyDbm");
        tmpMap.put("M_MFINVOPERATION", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfinvoperationDbm");
        tmpMap.put("M_MFMONTHCHG", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfmonthchgDbm");
        tmpMap.put("M_MFMONTHSTATUS", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfmonthstatusDbm");
        tmpMap.put("M_MFPICKCTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfpickctlDbm");
        tmpMap.put("M_MFRCVDESIGN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfrcvdesignDbm");
        tmpMap.put("M_MFRCVITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfrcvitemDbm");
        tmpMap.put("M_MFSTOCKITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfstockitemDbm");
        tmpMap.put("M_MFWHSTRCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfwhstrctDbm");
        tmpMap.put("M_MFWHxITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MMfwhxitemDbm");
        tmpMap.put("M_NUMBERING_CENTER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MNumberingCenterDbm");
        tmpMap.put("M_PARAM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MParamDbm");
        tmpMap.put("M_PROCESS_TYPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProcessTypeDbm");
        tmpMap.put("M_PRODUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProductDbm");
        tmpMap.put("M_PRODUCT_SHAPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProductShapeDbm");
        tmpMap.put("M_PRODUCT_TERM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MProductTermDbm");
        tmpMap.put("M_SET_PARENT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MSetParentDbm");
        tmpMap.put("M_SET_STRUCTURE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MSetStructureDbm");
        tmpMap.put("M_SHAPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeDbm");
        tmpMap.put("M_SHAPE_GRP", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeGrpDbm");
        tmpMap.put("M_SHAPE_GRP_DTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.MShapeGrpDtlDbm");
        tmpMap.put("M_STOCK_TYPE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MStockTypeDbm");
        tmpMap.put("M_TSN_PRODUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MTsnProductDbm");
        tmpMap.put("M_USER_CENTER", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserCenterDbm");
        tmpMap.put("M_USER_CLIENT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserClientDbm");
        tmpMap.put("M_USER_DEPOSIT", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserDepositDbm");
        tmpMap.put("M_USER_LOGIN", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserLoginDbm");
        tmpMap.put("M_USER_TERM", "com.oneslogi.base.dbflute.bsentity.dbmeta.MUserTermDbm");
        tmpMap.put("M_WAREHOUSE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MWarehouseDbm");
        tmpMap.put("M_WEB_HT_INFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.MWebHtInfoDbm");
        tmpMap.put("M_ZIP", "com.oneslogi.base.dbflute.bsentity.dbmeta.MZipDbm");
        tmpMap.put("M_ZONE", "com.oneslogi.base.dbflute.bsentity.dbmeta.MZoneDbm");
        tmpMap.put("P_LAYOUT_PRINT_SETTING", "com.oneslogi.base.dbflute.bsentity.dbmeta.PLayoutPrintSettingDbm");
        tmpMap.put("P_LS_REPORT_PRINTER_BY_SITE", "com.oneslogi.base.dbflute.bsentity.dbmeta.PLsReportPrinterBySiteDbm");
        tmpMap.put("P_PRINTER", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterDbm");
        tmpMap.put("P_PRINTER_ATTRIBUTE", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterAttributeDbm");
        tmpMap.put("P_PRINTER_GROUP", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrinterGroupDbm");
        tmpMap.put("P_PRINT_QUEUE", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintQueueDbm");
        tmpMap.put("P_PRINT_REQUEST", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestDbm");
        tmpMap.put("P_PRINT_REQUEST_BINARY", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestBinaryDbm");
        tmpMap.put("P_PRINT_REQUEST_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestDataDbm");
        tmpMap.put("P_PRINT_REQUEST_HIST", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintRequestHistDbm");
        tmpMap.put("P_PRINT_SERVICE", "com.oneslogi.base.dbflute.bsentity.dbmeta.PPrintServiceDbm");
        tmpMap.put("P_REPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportDbm");
        tmpMap.put("P_REPORT_LAYOUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportLayoutDbm");
        tmpMap.put("P_REPORT_LAYOUT_ITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.PReportLayoutItemDbm");
        tmpMap.put("P_SUBREP_LAYOUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.PSubrepLayoutDbm");
        tmpMap.put("P_SUBREP_LAYOUT_ITEM", "com.oneslogi.base.dbflute.bsentity.dbmeta.PSubrepLayoutItemDbm");
        tmpMap.put("P_SVF_OUTPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.PSvfOutputDbm");
        tmpMap.put("P_TERMINAL_AUTO_PRINT_SET", "com.oneslogi.base.dbflute.bsentity.dbmeta.PTerminalAutoPrintSetDbm");
        tmpMap.put("P_TERMINAL_PRINT_SETTING", "com.oneslogi.base.dbflute.bsentity.dbmeta.PTerminalPrintSettingDbm");
        tmpMap.put("P_USER_AUTO_PRINT_SETTING", "com.oneslogi.base.dbflute.bsentity.dbmeta.PUserAutoPrintSettingDbm");
        tmpMap.put("P_USER_PRINT_SETTING", "com.oneslogi.base.dbflute.bsentity.dbmeta.PUserPrintSettingDbm");
        tmpMap.put("T_ALLOC_INST_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocInstBDbm");
        tmpMap.put("T_ALLOC_INST_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocInstHDbm");
        tmpMap.put("T_ALLOC_LOT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAllocLotDbm");
        tmpMap.put("T_AMAZON_ORDER", "com.oneslogi.base.dbflute.bsentity.dbmeta.TAmazonOrderDbm");
        tmpMap.put("T_BTRPICK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBtrpickDbm");
        tmpMap.put("T_BTRPICKDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TBtrpickdetailDbm");
        tmpMap.put("T_CCOPAM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCcopamDbm");
        tmpMap.put("T_CCUSAUINF", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCcusauinfDbm");
        tmpMap.put("T_CDRCATTSR", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCdrcattsrDbm");
        tmpMap.put("T_CDRCATTSRB", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCdrcattsrbDbm");
        tmpMap.put("T_CDRCAUINF", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCdrcauinfDbm");
        tmpMap.put("T_CDTLVMKADM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCdtlvmkadmDbm");
        tmpMap.put("T_CENTER_SYMBOL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCenterSymbolDbm");
        tmpMap.put("T_CLCKINV", "com.oneslogi.base.dbflute.bsentity.dbmeta.TClckinvDbm");
        tmpMap.put("T_CORDDTAAM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCorddtaamDbm");
        tmpMap.put("T_CORDDTAEC", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCorddtaecDbm");
        tmpMap.put("T_CORDDTASR", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCorddtasrDbm");
        tmpMap.put("T_CORDHDR", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCordhdrDbm");
        tmpMap.put("T_CSRSTINF", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCsrstinfDbm");
        tmpMap.put("T_CSRWHADM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TCsrwhadmDbm");
        tmpMap.put("T_DRCDIZQA", "com.oneslogi.base.dbflute.bsentity.dbmeta.TDrcdizqaDbm");
        tmpMap.put("T_EC_ORDER_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderBDbm");
        tmpMap.put("T_EC_ORDER_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderHDbm");
        tmpMap.put("T_EC_ORDER_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TEcOrderRDbm");
        tmpMap.put("T_HT_COMCTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.THtComctlDbm");
        tmpMap.put("T_INVENTORY_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryBDbm");
        tmpMap.put("T_INVENTORY_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryHDbm");
        tmpMap.put("T_INVENTORY_INP_HIST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryInpHistDbm");
        tmpMap.put("T_INVENTORY_INST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryInstDbm");
        tmpMap.put("T_INVENTORY_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TInventoryRDbm");
        tmpMap.put("T_KEEPING_LOT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TKeepingLotDbm");
        tmpMap.put("T_LAST_LOT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TLastLotDbm");
        tmpMap.put("T_LOT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TLotDbm");
        tmpMap.put("T_MFLASTSHIPLOT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMflastshiplotDbm");
        tmpMap.put("T_MOVE_INST_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstBDbm");
        tmpMap.put("T_MOVE_INST_B_SUB", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstBSubDbm");
        tmpMap.put("T_MOVE_INST_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstHDbm");
        tmpMap.put("T_MOVE_INST_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveInstRDbm");
        tmpMap.put("T_MOVE_RECORD_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TMoveRecordBDbm");
        tmpMap.put("T_PACKING_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingBDbm");
        tmpMap.put("T_PACKING_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingHDbm");
        tmpMap.put("T_PACKING_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPackingRDbm");
        tmpMap.put("T_PALLET", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPalletDbm");
        tmpMap.put("T_PICKING_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingBDbm");
        tmpMap.put("T_PICKING_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingHDbm");
        tmpMap.put("T_PICKING_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPickingRDbm");
        tmpMap.put("T_PICKLIST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicklistDbm");
        tmpMap.put("T_PIC_MTHD_RCMD", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdDbm");
        tmpMap.put("T_PIC_MTHD_RCMD_CART", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdCartDbm");
        tmpMap.put("T_PIC_MTHD_RCMD_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.TPicMthdRcmdDataDbm");
        tmpMap.put("T_RAKUTEN_ORDER", "com.oneslogi.base.dbflute.bsentity.dbmeta.TRakutenOrderDbm");
        tmpMap.put("T_RECEIVE_PLAN_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanBDbm");
        tmpMap.put("T_RECEIVE_PLAN_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanHDbm");
        tmpMap.put("T_RECEIVE_PLAN_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanRDbm");
        tmpMap.put("T_RECEIVE_PLAN_SPARE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TReceivePlanSpareDbm");
        tmpMap.put("T_SERIAL_NO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TSerialNoDbm");
        tmpMap.put("T_SHIPPING_INST_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstBDbm");
        tmpMap.put("T_SHIPPING_INST_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstHDbm");
        tmpMap.put("T_SHIPPING_INST_SPARE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TShippingInstSpareDbm");
        tmpMap.put("T_SPLINFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TSplinfoDbm");
        tmpMap.put("T_STOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockDbm");
        tmpMap.put("T_STOCK_INOUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockInoutDbm");
        tmpMap.put("T_STOCK_REPORT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStockReportDbm");
        tmpMap.put("T_STORE_NO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreNoDbm");
        tmpMap.put("T_STORE_NO_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreNoRDbm");
        tmpMap.put("T_STORE_RECORD_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordBDbm");
        tmpMap.put("T_STORE_RECORD_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordHDbm");
        tmpMap.put("T_STORE_RECORD_R", "com.oneslogi.base.dbflute.bsentity.dbmeta.TStoreRecordRDbm");
        tmpMap.put("T_TRACCEPT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTracceptDbm");
        tmpMap.put("T_TRALLINV", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrallinvDbm");
        tmpMap.put("T_TRALLINVHISTORY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrallinvhistoryDbm");
        tmpMap.put("T_TRALLLASTWHINVDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTralllastwhinvdetailDbm");
        tmpMap.put("T_TRASSORTORDER", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrassortorderDbm");
        tmpMap.put("T_TRBADITEMCASE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrbaditemcaseDbm");
        tmpMap.put("T_TRCASEADOPTINVDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcaseadoptinvdetailDbm");
        tmpMap.put("T_TRCASEDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcasedetailDbm");
        tmpMap.put("T_TRCASEINVENTORY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcaseinventoryDbm");
        tmpMap.put("T_TRCASENUM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcasenumDbm");
        tmpMap.put("T_TRCASESTOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcasestockDbm");
        tmpMap.put("T_TRCASESTOCKDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrcasestockdetailDbm");
        tmpMap.put("T_TRDIHYQRCASE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrdihyqrcaseDbm");
        tmpMap.put("T_TRDIRECTREST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrdirectrestDbm");
        tmpMap.put("T_TREXAMRESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrexamresultDbm");
        tmpMap.put("T_TREXAMRSLTDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrexamrsltdetailDbm");
        tmpMap.put("T_TREXCSEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrexcsendDbm");
        tmpMap.put("T_TRFLEXIBILACCEPTPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilacceptplanDbm");
        tmpMap.put("T_TRFLEXIBILITY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilityDbm");
        tmpMap.put("T_TRFLEXIBILITYBREAKDOWN", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilitybreakdownDbm");
        tmpMap.put("T_TRFLEXIBILITYDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilitydetailDbm");
        tmpMap.put("T_TRFLEXIBILITYINSTRUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilityinstructDbm");
        tmpMap.put("T_TRFLEXIBILITYPRODUCT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrflexibilityproductDbm");
        tmpMap.put("T_TRHANBAIINV", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrhanbaiinvDbm");
        tmpMap.put("T_TRIFDTLTRANS", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrifdtltransDbm");
        tmpMap.put("T_TRIFDTLTRANSEXP", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrifdtltransexpDbm");
        tmpMap.put("T_TRIMALLOCADJUST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrimallocadjustDbm");
        tmpMap.put("T_TRIMALLOCSCHKRI", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrimallocschkriDbm");
        tmpMap.put("T_TRIMALLOCSTOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrimallocstockDbm");
        tmpMap.put("T_TRIMALLOC_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrimallocHDbm");
        tmpMap.put("T_TRINVCHECKINFO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrinvcheckinfoDbm");
        tmpMap.put("T_TRINVCORRECT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrinvcorrectDbm");
        tmpMap.put("T_TRINVREANSWER", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrinvreanswerDbm");
        tmpMap.put("T_TRINVREQUEST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrinvrequestDbm");
        tmpMap.put("T_TRITEMCONVRESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTritemconvresultDbm");
        tmpMap.put("T_TRJUKYUINV", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrjukyuinvDbm");
        tmpMap.put("T_TRLEAVERESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrleaveresultDbm");
        tmpMap.put("T_TRMAKERCASECD", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrmakercasecdDbm");
        tmpMap.put("T_TRMANUFACTUREDATE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrmanufacturedateDbm");
        tmpMap.put("T_TRMANUFACTUREDATEDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrmanufacturedatedetailDbm");
        tmpMap.put("T_TRMANUFACTUREDATEHISTORY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrmanufacturedatehistoryDbm");
        tmpMap.put("T_TRPACKRMDR", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpackrmdrDbm");
        tmpMap.put("T_TRPALLET", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpalletDbm");
        tmpMap.put("T_TRPALLETDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpalletdetailDbm");
        tmpMap.put("T_TRPALLETEXP", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpalletexpDbm");
        tmpMap.put("T_TRPALLETSYMBOL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpalletsymbolDbm");
        tmpMap.put("T_TRPALLETSYMBOLJT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpalletsymboljtDbm");
        tmpMap.put("T_TRPALLETTRACE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpallettraceDbm");
        tmpMap.put("T_TRPICKDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpickdetailDbm");
        tmpMap.put("T_TRPICKLISTEXP", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpicklistexpDbm");
        tmpMap.put("T_TRPICKRESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrpickresultDbm");
        tmpMap.put("T_TRRCV", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvDbm");
        tmpMap.put("T_TRRCVBAT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvbatDbm");
        tmpMap.put("T_TRRCVDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvdetailDbm");
        tmpMap.put("T_TRRCVEXTEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvextendDbm");
        tmpMap.put("T_TRRCVINSPECT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvinspectDbm");
        tmpMap.put("T_TRRCVPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvplanDbm");
        tmpMap.put("T_TRRCVTAGDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrcvtagdetailDbm");
        tmpMap.put("T_TRREAD", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrreadDbm");
        tmpMap.put("T_TRREFNOCTL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrefnoctlDbm");
        tmpMap.put("T_TRREFNOCTLDM", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrrefnoctldmDbm");
        tmpMap.put("T_TRREVERSESTOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrreversestockDbm");
        tmpMap.put("T_TRSENDRESULT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsendresultDbm");
        tmpMap.put("T_TRSHIPINSPECT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrshipinspectDbm");
        tmpMap.put("T_TRSHIPINSPECTRMDR", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrshipinspectrmdrDbm");
        tmpMap.put("T_TRSO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsoDbm");
        tmpMap.put("T_TRSODETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsodetailDbm");
        tmpMap.put("T_TRSOJT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsojtDbm");
        tmpMap.put("T_TRSOJTDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsojtdetailDbm");
        tmpMap.put("T_TRSOLIST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsolistDbm");
        tmpMap.put("T_TRSORCVDIRECT", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsorcvdirectDbm");
        tmpMap.put("T_TRSORTCTNTRACE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsortctntraceDbm");
        tmpMap.put("T_TRSORTDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsortdetailDbm");
        tmpMap.put("T_TRSREPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsreplanDbm");
        tmpMap.put("T_TRSREPLANDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsreplandetailDbm");
        tmpMap.put("T_TRSTOCKDIFFHISTORY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrstockdiffhistoryDbm");
        tmpMap.put("T_TRSYMBOL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsymbolDbm");
        tmpMap.put("T_TRSYMBOLTRACE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsymboltraceDbm");
        tmpMap.put("T_TRSYMBOLTRACEEXTEND", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrsymboltraceextendDbm");
        tmpMap.put("T_TRTEMPALLOCATESEQ", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrtempallocateseqDbm");
        tmpMap.put("T_TRTEMPALLOCATESEQDETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrtempallocateseqdetailDbm");
        tmpMap.put("T_TRTRACE", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrtraceDbm");
        tmpMap.put("T_TRTRANPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrtranplanDbm");
        tmpMap.put("T_TRTRANPLANSO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrtranplansoDbm");
        tmpMap.put("T_TRWORK", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrworkDbm");
        tmpMap.put("T_TRZONEINVENTORY", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrzoneinventoryDbm");
        tmpMap.put("T_TR_PICKLIST", "com.oneslogi.base.dbflute.bsentity.dbmeta.TTrPicklistDbm");
        tmpMap.put("T_WORK_DATA", "com.oneslogi.base.dbflute.bsentity.dbmeta.TWorkDataDbm");
        tmpMap.put("T_WORK_LOG", "com.oneslogi.base.dbflute.bsentity.dbmeta.TWorkLogDbm");
        tmpMap.put("T_YAHOO_ORDER", "com.oneslogi.base.dbflute.bsentity.dbmeta.TYahooOrderDbm");
        tmpMap.put("T_YTRSO", "com.oneslogi.base.dbflute.bsentity.dbmeta.TYtrsoDbm");
        tmpMap.put("T_YTRSODETAIL", "com.oneslogi.base.dbflute.bsentity.dbmeta.TYtrsodetailDbm");
        tmpMap.put("V_DICT", "com.oneslogi.base.dbflute.bsentity.dbmeta.VDictDbm");
        tmpMap.put("V_HT_DICT", "com.oneslogi.base.dbflute.bsentity.dbmeta.VHtDictDbm");
        tmpMap.put("W_CARRIER_ZIP_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WCarrierZipInputDbm");
        tmpMap.put("W_CDRCATT_INST_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WCdrcattInstInputDbm");
        tmpMap.put("W_CUSTOMER_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WCustomerInputDbm");
        tmpMap.put("W_HT_INVENTORY_INPUT_PROD", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtInventoryInputProdDbm");
        tmpMap.put("W_HT_LOADING", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtLoadingDbm");
        tmpMap.put("W_HT_RECEIVE_INSPECTION", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveInspectionDbm");
        tmpMap.put("W_HT_RECEIVE_NO_PLAN_INSP", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveNoPlanInspDbm");
        tmpMap.put("W_HT_RECEIVE_STORE", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtReceiveStoreDbm");
        tmpMap.put("W_HT_SERIAL_RECEIVE_INSP", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtSerialReceiveInspDbm");
        tmpMap.put("W_HT_SERIAL_SHIPPING_INSP", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtSerialShippingInspDbm");
        tmpMap.put("W_HT_SHIPPING", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtShippingDbm");
        tmpMap.put("W_HT_SHIPPING_PICKING", "com.oneslogi.base.dbflute.bsentity.dbmeta.WHtShippingPickingDbm");
        tmpMap.put("W_LOCATION_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WLocationInputDbm");
        tmpMap.put("W_PALLET_SYMBOL_JT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WPalletSymbolJtDbm");
        tmpMap.put("W_PRODUCT_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WProductInputDbm");
        tmpMap.put("W_PRODUCT_SHAPE_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WProductShapeInputDbm");
        tmpMap.put("W_REPLENISH_INST_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WReplenishInstInputDbm");
        tmpMap.put("W_SGL_ROW_SHIP_INSP_B", "com.oneslogi.base.dbflute.bsentity.dbmeta.WSglRowShipInspBDbm");
        tmpMap.put("W_SGL_ROW_SHIP_INSP_H", "com.oneslogi.base.dbflute.bsentity.dbmeta.WSglRowShipInspHDbm");
        tmpMap.put("W_SHIPPING_INTERRUPT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WShippingInterruptDbm");
        tmpMap.put("W_STOCK_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WStockInputDbm");
        tmpMap.put("W_TRALLINV", "com.oneslogi.base.dbflute.bsentity.dbmeta.WTrallinvDbm");
        tmpMap.put("W_WKASSORTCARTON", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkassortcartonDbm");
        tmpMap.put("W_WKCUTLOCMOVE", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkcutlocmoveDbm");
        tmpMap.put("W_WKFLEXPICK", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkflexpickDbm");
        tmpMap.put("W_WKGDITMSTOCKDIFFHISTORYB", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkgditmstockdiffhistorybDbm");
        tmpMap.put("W_WKPALLET", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkpalletDbm");
        tmpMap.put("W_WKPALLETIZE", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkpalletizeDbm");
        tmpMap.put("W_WKPALLETSOALLOC", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkpalletsoallocDbm");
        tmpMap.put("W_WKPALLETSYMBOLJT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkpalletsymboljtDbm");
        tmpMap.put("W_WKRCVREVERSE", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkrcvreverseDbm");
        tmpMap.put("W_WKRECEIVEPLAN", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkreceiveplanDbm");
        tmpMap.put("W_WKREKAKUNOU", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWkrekakunouDbm");
        tmpMap.put("W_WKSOCANCELPICK1", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWksocancelpick1Dbm");
        tmpMap.put("W_WKSOCANCELPICK2", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWksocancelpick2Dbm");
        tmpMap.put("W_WKSORECEIVE", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWksoreceiveDbm");
        tmpMap.put("W_WKSORTSUB", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWksortsubDbm");
        tmpMap.put("W_WKSOSHIP", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWksoshipDbm");
        tmpMap.put("W_WKTRSOTAXLOCK", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWktrsotaxlockDbm");
        tmpMap.put("W_WORK", "com.oneslogi.base.dbflute.bsentity.dbmeta.WWorkDbm");
        tmpMap.put("W_ZIP_COMPANY_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WZipCompanyInputDbm");
        tmpMap.put("W_ZIP_INPUT", "com.oneslogi.base.dbflute.bsentity.dbmeta.WZipInputDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta. map:{tableDbName = DBMeta}
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name;
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null;
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.asTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
