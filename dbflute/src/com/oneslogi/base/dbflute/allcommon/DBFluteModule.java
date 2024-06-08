package com.oneslogi.base.dbflute.allcommon;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.UnsatisfiedResolutionException;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.AfterDeploymentValidation;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;
import javax.sql.DataSource;

import org.dbflute.bhv.AbstractBehaviorReadable;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.hook.CommonColumnAutoSetupper;

import com.oneslogi.base.dbflute.exbhv.*;

/**
 * {@link Extension} for DBFlute.
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModule implements Extension {

    // ===================================================================================
    //                                                                           Qualifier
    //                                                                           =========
    /** DBFlute qualifier. */
    @Qualifier
    @Retention(RUNTIME)
    @Target({TYPE, METHOD, FIELD, PARAMETER})
    public @interface DBFlute {}

    // ===================================================================================
    //                                                                         Set up Bean
    //                                                                         ===========
    /**
     * Register DBFlute beans to container.
     * @param event The event type after bean discovery process. (NotNull)
     * @param beanManager The manager of CDI beans. (NotNull)
     */
    public void afterBeanDiscovery(@Observes final AfterBeanDiscovery event, final BeanManager beanManager) {
        setupDfComponents(event, beanManager);
        setupBehaviors(event, beanManager);
    }

    /**
     * Register environment dependent implementations to container.
     * @param event The event type after bean discovery process. (NotNull)
     * @param beanManager The manager of CDI beans. (NotNull)
     */
    protected void setupDfComponents(final AfterBeanDiscovery event, final BeanManager beanManager) {
        event.addBean(newDBFluteBeanOfInvokerAssistant(beanManager));
        event.addBean(newDBFluteBeanOfCommonColumnAutoSetupper(beanManager));
        event.addBean(newDBFluteBeanOfBehaviorSelector(beanManager));
        event.addBean(newDBFluteBeanOfSqlClauseCreator(beanManager));
        event.addBean(newDBFluteBeanOfBehaviorCommandInvoker(beanManager));
    }

    /**
     * Register behaviors to container.
     * @param event The event type after bean discovery process. (NotNull)
     * @param beanManager The manager of CDI beans. (NotNull)
     */
    protected void setupBehaviors(final AfterBeanDiscovery event, final BeanManager beanManager) {
        final List<Class<? extends AbstractBehaviorReadable<?, ?>>> typeList = new ArrayList<Class<? extends AbstractBehaviorReadable<?, ?>>>();
        typeList.add(BArgBhv.class);
        typeList.add(BArgValidBhv.class);
        typeList.add(BClassBhv.class);
        typeList.add(BClassDtlBhv.class);
        typeList.add(BClassDtlSubBhv.class);
        typeList.add(BClassGrpBhv.class);
        typeList.add(BClassGrpDtlBhv.class);
        typeList.add(BColBhv.class);
        typeList.add(BColExtBaseBhv.class);
        typeList.add(BColExtUserBhv.class);
        typeList.add(BColRoleBhv.class);
        typeList.add(BColValidBhv.class);
        typeList.add(BCultureBhv.class);
        typeList.add(BCultureAttributeBhv.class);
        typeList.add(BDictBhv.class);
        typeList.add(BDictCultureBhv.class);
        typeList.add(BDictValidBhv.class);
        typeList.add(BDmlLogBhv.class);
        typeList.add(BFuncBhv.class);
        typeList.add(BFuncRoleBhv.class);
        typeList.add(BInfoBhv.class);
        typeList.add(BItemBhv.class);
        typeList.add(BItemRoleBhv.class);
        typeList.add(BItemValidBhv.class);
        typeList.add(BLogBhv.class);
        typeList.add(BLogDtlBhv.class);
        typeList.add(BMenuBhv.class);
        typeList.add(BMenuGrpBhv.class);
        typeList.add(BMessageBhv.class);
        typeList.add(BNumberingBhv.class);
        typeList.add(BPasswordPolicyBhv.class);
        typeList.add(BPropertyBhv.class);
        typeList.add(BRoleBhv.class);
        typeList.add(BRoleGrpBhv.class);
        typeList.add(BRoleGrpDtlBhv.class);
        typeList.add(BScreenBhv.class);
        typeList.add(BScreenRoleBhv.class);
        typeList.add(BSystemBhv.class);
        typeList.add(BSystemLogBhv.class);
        typeList.add(BTerminalBhv.class);
        typeList.add(BTimeZoneBhv.class);
        typeList.add(BTokenBhv.class);
        typeList.add(BUserBhv.class);
        typeList.add(BUserAuthBhv.class);
        typeList.add(BUserSubBhv.class);
        typeList.add(EBarcodeLabelBhv.class);
        typeList.add(EBondedReceiveRecordSendBhv.class);
        typeList.add(EBondedReceiveSendBhv.class);
        typeList.add(EBondedShippingPlanBulkInputBhv.class);
        typeList.add(EBondedWmsReceivePlanBhv.class);
        typeList.add(ECcopamSendBhv.class);
        typeList.add(ECenterStockInfoSendBhv.class);
        typeList.add(ECorddtaamSendBhv.class);
        typeList.add(ECrelaybsBhv.class);
        typeList.add(ECsrstinfSendBhv.class);
        typeList.add(ECustomerBhv.class);
        typeList.add(EDeliverySortingBhv.class);
        typeList.add(EDutyFreeInoutResultBhv.class);
        typeList.add(ELocationBhv.class);
        typeList.add(EMfcompanyBhv.class);
        typeList.add(EMfcompanyMSendBhv.class);
        typeList.add(EMhDrcdizqaBhv.class);
        typeList.add(EMhShippingBhv.class);
        typeList.add(EMhStockBhv.class);
        typeList.add(ENotificationDomesticBhv.class);
        typeList.add(ENotificationImportBhv.class);
        typeList.add(EOrderSplitDataBhv.class);
        typeList.add(EPalletizerInstBhv.class);
        typeList.add(EPrimaryShippingDtlInfoBhv.class);
        typeList.add(EProductBhv.class);
        typeList.add(EProductCodeConversionBhv.class);
        typeList.add(EProductMSendBhv.class);
        typeList.add(EProductSendBhv.class);
        typeList.add(EProductShapeBhv.class);
        typeList.add(EProductStockInfoBhv.class);
        typeList.add(EProductSupanddemBhv.class);
        typeList.add(EProductTrackingDomesBhv.class);
        typeList.add(EReceivePlanBhv.class);
        typeList.add(EReceiveRecordSendBhv.class);
        typeList.add(EReplenishBreakdownBhv.class);
        typeList.add(EReturnedExchangeBhv.class);
        typeList.add(EReturnedReceivePlanBhv.class);
        typeList.add(ESerialInputBhv.class);
        typeList.add(EShippingInoutPlanBhv.class);
        typeList.add(EShippingInoutPlanReceiveBhv.class);
        typeList.add(EShippingInstBhv.class);
        typeList.add(EShippingInstDataBhv.class);
        typeList.add(EShippingPlanBulkInputBhv.class);
        typeList.add(EShippingRecordDataBhv.class);
        typeList.add(EShipInoutPlanShipBhv.class);
        typeList.add(EShipNotificationInfoBhv.class);
        typeList.add(EShopDomesticSendBhv.class);
        typeList.add(EShopImportSendBhv.class);
        typeList.add(ESortingNonconfStockBhv.class);
        typeList.add(ESortingStockBhv.class);
        typeList.add(EStockinfoimportBhv.class);
        typeList.add(EStockInquiryAnswerBhv.class);
        typeList.add(EStockInquiryRequestBhv.class);
        typeList.add(EStockRecordReceiveBhv.class);
        typeList.add(EStoreWorkInfoSendBhv.class);
        typeList.add(ESymbolPasteRecordBhv.class);
        typeList.add(ETrackingInfoImportBhv.class);
        typeList.add(ETrifcaseBhv.class);
        typeList.add(ETrifcompanydataBhv.class);
        typeList.add(ETrifitemBhv.class);
        typeList.add(ETrifitemdataBhv.class);
        typeList.add(ETriftranplanBhv.class);
        typeList.add(ETriftrnodrBhv.class);
        typeList.add(ETsnMfcompanyBhv.class);
        typeList.add(ETsnProductBhv.class);
        typeList.add(ETsnUserBhv.class);
        typeList.add(EUserBhv.class);
        typeList.add(EZipBhv.class);
        typeList.add(HInventoryBBhv.class);
        typeList.add(HInventoryHBhv.class);
        typeList.add(HMoveBBhv.class);
        typeList.add(HMoveHBhv.class);
        typeList.add(HPackingBBhv.class);
        typeList.add(HPackingHBhv.class);
        typeList.add(HReceiveBBhv.class);
        typeList.add(HReceiveHBhv.class);
        typeList.add(HReceiveSpareBhv.class);
        typeList.add(HShippingBBhv.class);
        typeList.add(HShippingHBhv.class);
        typeList.add(HShippingSpareBhv.class);
        typeList.add(HStockBhv.class);
        typeList.add(HStockInoutBhv.class);
        typeList.add(HStockReportBhv.class);
        typeList.add(MBoxBhv.class);
        typeList.add(MBoxGrpBhv.class);
        typeList.add(MBoxGrpDtlBhv.class);
        typeList.add(MCarrierBhv.class);
        typeList.add(MCarrierBoxBhv.class);
        typeList.add(MCarrierSlipCesBhv.class);
        typeList.add(MCarrierSlipSgwBhv.class);
        typeList.add(MCarrierSlipYmtBhv.class);
        typeList.add(MCarrierSlipYupkBhv.class);
        typeList.add(MCarrierZipBhv.class);
        typeList.add(MCblkBhv.class);
        typeList.add(MCbrctgBhv.class);
        typeList.add(MCdrcattBhv.class);
        typeList.add(MCenterBhv.class);
        typeList.add(MCenterClassBhv.class);
        typeList.add(MCenterClassDtlBhv.class);
        typeList.add(MCenterClassDtlSubBhv.class);
        typeList.add(MCenterClassGrpBhv.class);
        typeList.add(MCenterClassGrpDtlBhv.class);
        typeList.add(MCenterColBhv.class);
        typeList.add(MCenterCustomerBhv.class);
        typeList.add(MCenterItemBhv.class);
        typeList.add(MCenterScreenBhv.class);
        typeList.add(MClientBhv.class);
        typeList.add(MClientCenterBhv.class);
        typeList.add(MClientColBhv.class);
        typeList.add(MClientItemBhv.class);
        typeList.add(MClientScreenBhv.class);
        typeList.add(MClinBhv.class);
        typeList.add(MCommonCarrierBhv.class);
        typeList.add(MCorgBhv.class);
        typeList.add(MCrelaybsBhv.class);
        typeList.add(MCustomerBhv.class);
        typeList.add(MDataInputTypeBhv.class);
        typeList.add(MDataInputTypeBBhv.class);
        typeList.add(MDeliveryCourseBhv.class);
        typeList.add(MEdiBhv.class);
        typeList.add(MEdiColumnBhv.class);
        typeList.add(MHtDictBhv.class);
        typeList.add(MHtDictCultureBhv.class);
        typeList.add(MHtMessageBhv.class);
        typeList.add(MImportTypeBhv.class);
        typeList.add(MImportTypeBBhv.class);
        typeList.add(MImportTypeBCopyBBhv.class);
        typeList.add(MImportTypeBCopyHBhv.class);
        typeList.add(MLocationBhv.class);
        typeList.add(MMatchingBhv.class);
        typeList.add(MMfcompanyBhv.class);
        typeList.add(MMfinvoperationBhv.class);
        typeList.add(MMfmonthchgBhv.class);
        typeList.add(MMfmonthstatusBhv.class);
        typeList.add(MMfpickctlBhv.class);
        typeList.add(MMfrcvdesignBhv.class);
        typeList.add(MMfrcvitemBhv.class);
        typeList.add(MMfstockitemBhv.class);
        typeList.add(MMfwhstrctBhv.class);
        typeList.add(MMfwhxitemBhv.class);
        typeList.add(MNumberingCenterBhv.class);
        typeList.add(MParamBhv.class);
        typeList.add(MProcessTypeBhv.class);
        typeList.add(MProductBhv.class);
        typeList.add(MProductShapeBhv.class);
        typeList.add(MProductTermBhv.class);
        typeList.add(MSetParentBhv.class);
        typeList.add(MSetStructureBhv.class);
        typeList.add(MShapeBhv.class);
        typeList.add(MShapeGrpBhv.class);
        typeList.add(MShapeGrpDtlBhv.class);
        typeList.add(MStockTypeBhv.class);
        typeList.add(MTsnProductBhv.class);
        typeList.add(MUserCenterBhv.class);
        typeList.add(MUserClientBhv.class);
        typeList.add(MUserDepositBhv.class);
        typeList.add(MUserLoginBhv.class);
        typeList.add(MUserTermBhv.class);
        typeList.add(MWarehouseBhv.class);
        typeList.add(MWebHtInfoBhv.class);
        typeList.add(MZipBhv.class);
        typeList.add(MZoneBhv.class);
        typeList.add(PLayoutPrintSettingBhv.class);
        typeList.add(PLsReportPrinterBySiteBhv.class);
        typeList.add(PPrinterBhv.class);
        typeList.add(PPrinterAttributeBhv.class);
        typeList.add(PPrinterGroupBhv.class);
        typeList.add(PPrintQueueBhv.class);
        typeList.add(PPrintRequestBhv.class);
        typeList.add(PPrintRequestBinaryBhv.class);
        typeList.add(PPrintRequestDataBhv.class);
        typeList.add(PPrintRequestHistBhv.class);
        typeList.add(PPrintServiceBhv.class);
        typeList.add(PReportBhv.class);
        typeList.add(PReportLayoutBhv.class);
        typeList.add(PReportLayoutItemBhv.class);
        typeList.add(PSubrepLayoutBhv.class);
        typeList.add(PSubrepLayoutItemBhv.class);
        typeList.add(PSvfOutputBhv.class);
        typeList.add(PTerminalAutoPrintSetBhv.class);
        typeList.add(PTerminalPrintSettingBhv.class);
        typeList.add(PUserAutoPrintSettingBhv.class);
        typeList.add(PUserPrintSettingBhv.class);
        typeList.add(TAllocInstBBhv.class);
        typeList.add(TAllocInstHBhv.class);
        typeList.add(TAllocLotBhv.class);
        typeList.add(TAmazonOrderBhv.class);
        typeList.add(TBtrpickBhv.class);
        typeList.add(TBtrpickdetailBhv.class);
        typeList.add(TCcopamBhv.class);
        typeList.add(TCcusauinfBhv.class);
        typeList.add(TCdrcattsrBhv.class);
        typeList.add(TCdrcattsrbBhv.class);
        typeList.add(TCdrcauinfBhv.class);
        typeList.add(TCdtlvmkadmBhv.class);
        typeList.add(TCenterSymbolBhv.class);
        typeList.add(TClckinvBhv.class);
        typeList.add(TCorddtaamBhv.class);
        typeList.add(TCorddtaecBhv.class);
        typeList.add(TCorddtasrBhv.class);
        typeList.add(TCordhdrBhv.class);
        typeList.add(TCsrstinfBhv.class);
        typeList.add(TCsrwhadmBhv.class);
        typeList.add(TDrcdizqaBhv.class);
        typeList.add(TEcOrderBBhv.class);
        typeList.add(TEcOrderHBhv.class);
        typeList.add(TEcOrderRBhv.class);
        typeList.add(THtComctlBhv.class);
        typeList.add(TInventoryBBhv.class);
        typeList.add(TInventoryHBhv.class);
        typeList.add(TInventoryInpHistBhv.class);
        typeList.add(TInventoryInstBhv.class);
        typeList.add(TInventoryRBhv.class);
        typeList.add(TKeepingLotBhv.class);
        typeList.add(TLastLotBhv.class);
        typeList.add(TLotBhv.class);
        typeList.add(TMflastshiplotBhv.class);
        typeList.add(TMoveInstBBhv.class);
        typeList.add(TMoveInstBSubBhv.class);
        typeList.add(TMoveInstHBhv.class);
        typeList.add(TMoveInstRBhv.class);
        typeList.add(TMoveRecordBBhv.class);
        typeList.add(TPackingBBhv.class);
        typeList.add(TPackingHBhv.class);
        typeList.add(TPackingRBhv.class);
        typeList.add(TPalletBhv.class);
        typeList.add(TPickingBBhv.class);
        typeList.add(TPickingHBhv.class);
        typeList.add(TPickingRBhv.class);
        typeList.add(TPicklistBhv.class);
        typeList.add(TPicMthdRcmdBhv.class);
        typeList.add(TPicMthdRcmdCartBhv.class);
        typeList.add(TPicMthdRcmdDataBhv.class);
        typeList.add(TRakutenOrderBhv.class);
        typeList.add(TReceivePlanBBhv.class);
        typeList.add(TReceivePlanHBhv.class);
        typeList.add(TReceivePlanRBhv.class);
        typeList.add(TReceivePlanSpareBhv.class);
        typeList.add(TSerialNoBhv.class);
        typeList.add(TShippingInstBBhv.class);
        typeList.add(TShippingInstHBhv.class);
        typeList.add(TShippingInstSpareBhv.class);
        typeList.add(TSplinfoBhv.class);
        typeList.add(TStockBhv.class);
        typeList.add(TStockInoutBhv.class);
        typeList.add(TStockReportBhv.class);
        typeList.add(TStoreNoBhv.class);
        typeList.add(TStoreNoRBhv.class);
        typeList.add(TStoreRecordBBhv.class);
        typeList.add(TStoreRecordHBhv.class);
        typeList.add(TStoreRecordRBhv.class);
        typeList.add(TTracceptBhv.class);
        typeList.add(TTrallinvBhv.class);
        typeList.add(TTrallinvhistoryBhv.class);
        typeList.add(TTralllastwhinvdetailBhv.class);
        typeList.add(TTrassortorderBhv.class);
        typeList.add(TTrbaditemcaseBhv.class);
        typeList.add(TTrcaseadoptinvdetailBhv.class);
        typeList.add(TTrcasedetailBhv.class);
        typeList.add(TTrcaseinventoryBhv.class);
        typeList.add(TTrcasenumBhv.class);
        typeList.add(TTrcasestockBhv.class);
        typeList.add(TTrcasestockdetailBhv.class);
        typeList.add(TTrdihyqrcaseBhv.class);
        typeList.add(TTrdirectrestBhv.class);
        typeList.add(TTrexamresultBhv.class);
        typeList.add(TTrexamrsltdetailBhv.class);
        typeList.add(TTrexcsendBhv.class);
        typeList.add(TTrflexibilacceptplanBhv.class);
        typeList.add(TTrflexibilityBhv.class);
        typeList.add(TTrflexibilitybreakdownBhv.class);
        typeList.add(TTrflexibilitydetailBhv.class);
        typeList.add(TTrflexibilityinstructBhv.class);
        typeList.add(TTrflexibilityproductBhv.class);
        typeList.add(TTrhanbaiinvBhv.class);
        typeList.add(TTrifdtltransBhv.class);
        typeList.add(TTrifdtltransexpBhv.class);
        typeList.add(TTrimallocadjustBhv.class);
        typeList.add(TTrimallocschkriBhv.class);
        typeList.add(TTrimallocstockBhv.class);
        typeList.add(TTrimallocHBhv.class);
        typeList.add(TTrinvcheckinfoBhv.class);
        typeList.add(TTrinvcorrectBhv.class);
        typeList.add(TTrinvreanswerBhv.class);
        typeList.add(TTrinvrequestBhv.class);
        typeList.add(TTritemconvresultBhv.class);
        typeList.add(TTrjukyuinvBhv.class);
        typeList.add(TTrleaveresultBhv.class);
        typeList.add(TTrmakercasecdBhv.class);
        typeList.add(TTrmanufacturedateBhv.class);
        typeList.add(TTrmanufacturedatedetailBhv.class);
        typeList.add(TTrmanufacturedatehistoryBhv.class);
        typeList.add(TTrpackrmdrBhv.class);
        typeList.add(TTrpalletBhv.class);
        typeList.add(TTrpalletdetailBhv.class);
        typeList.add(TTrpalletexpBhv.class);
        typeList.add(TTrpalletsymbolBhv.class);
        typeList.add(TTrpalletsymboljtBhv.class);
        typeList.add(TTrpallettraceBhv.class);
        typeList.add(TTrpickdetailBhv.class);
        typeList.add(TTrpicklistexpBhv.class);
        typeList.add(TTrpickresultBhv.class);
        typeList.add(TTrrcvBhv.class);
        typeList.add(TTrrcvbatBhv.class);
        typeList.add(TTrrcvdetailBhv.class);
        typeList.add(TTrrcvextendBhv.class);
        typeList.add(TTrrcvinspectBhv.class);
        typeList.add(TTrrcvplanBhv.class);
        typeList.add(TTrrcvtagdetailBhv.class);
        typeList.add(TTrreadBhv.class);
        typeList.add(TTrrefnoctlBhv.class);
        typeList.add(TTrrefnoctldmBhv.class);
        typeList.add(TTrreversestockBhv.class);
        typeList.add(TTrsendresultBhv.class);
        typeList.add(TTrshipinspectBhv.class);
        typeList.add(TTrshipinspectrmdrBhv.class);
        typeList.add(TTrsoBhv.class);
        typeList.add(TTrsodetailBhv.class);
        typeList.add(TTrsojtBhv.class);
        typeList.add(TTrsojtdetailBhv.class);
        typeList.add(TTrsolistBhv.class);
        typeList.add(TTrsorcvdirectBhv.class);
        typeList.add(TTrsortctntraceBhv.class);
        typeList.add(TTrsortdetailBhv.class);
        typeList.add(TTrsreplanBhv.class);
        typeList.add(TTrsreplandetailBhv.class);
        typeList.add(TTrstockdiffhistoryBhv.class);
        typeList.add(TTrsymbolBhv.class);
        typeList.add(TTrsymboltraceBhv.class);
        typeList.add(TTrsymboltraceextendBhv.class);
        typeList.add(TTrtempallocateseqBhv.class);
        typeList.add(TTrtempallocateseqdetailBhv.class);
        typeList.add(TTrtraceBhv.class);
        typeList.add(TTrtranplanBhv.class);
        typeList.add(TTrtranplansoBhv.class);
        typeList.add(TTrworkBhv.class);
        typeList.add(TTrzoneinventoryBhv.class);
        typeList.add(TTrPicklistBhv.class);
        typeList.add(TWorkDataBhv.class);
        typeList.add(TWorkLogBhv.class);
        typeList.add(TYahooOrderBhv.class);
        typeList.add(TYtrsoBhv.class);
        typeList.add(TYtrsodetailBhv.class);
        typeList.add(VDictBhv.class);
        typeList.add(VHtDictBhv.class);
        typeList.add(WCarrierZipInputBhv.class);
        typeList.add(WCdrcattInstInputBhv.class);
        typeList.add(WCustomerInputBhv.class);
        typeList.add(WHtInventoryInputProdBhv.class);
        typeList.add(WHtLoadingBhv.class);
        typeList.add(WHtReceiveInspectionBhv.class);
        typeList.add(WHtReceiveNoPlanInspBhv.class);
        typeList.add(WHtReceiveStoreBhv.class);
        typeList.add(WHtSerialReceiveInspBhv.class);
        typeList.add(WHtSerialShippingInspBhv.class);
        typeList.add(WHtShippingBhv.class);
        typeList.add(WHtShippingPickingBhv.class);
        typeList.add(WLocationInputBhv.class);
        typeList.add(WPalletSymbolJtBhv.class);
        typeList.add(WProductInputBhv.class);
        typeList.add(WProductShapeInputBhv.class);
        typeList.add(WReplenishInstInputBhv.class);
        typeList.add(WSglRowShipInspBBhv.class);
        typeList.add(WSglRowShipInspHBhv.class);
        typeList.add(WShippingInterruptBhv.class);
        typeList.add(WStockInputBhv.class);
        typeList.add(WTrallinvBhv.class);
        typeList.add(WWkassortcartonBhv.class);
        typeList.add(WWkcutlocmoveBhv.class);
        typeList.add(WWkflexpickBhv.class);
        typeList.add(WWkgditmstockdiffhistorybBhv.class);
        typeList.add(WWkpalletBhv.class);
        typeList.add(WWkpalletizeBhv.class);
        typeList.add(WWkpalletsoallocBhv.class);
        typeList.add(WWkpalletsymboljtBhv.class);
        typeList.add(WWkrcvreverseBhv.class);
        typeList.add(WWkreceiveplanBhv.class);
        typeList.add(WWkrekakunouBhv.class);
        typeList.add(WWksocancelpick1Bhv.class);
        typeList.add(WWksocancelpick2Bhv.class);
        typeList.add(WWksoreceiveBhv.class);
        typeList.add(WWksortsubBhv.class);
        typeList.add(WWksoshipBhv.class);
        typeList.add(WWktrsotaxlockBhv.class);
        typeList.add(WWorkBhv.class);
        typeList.add(WZipCompanyInputBhv.class);
        typeList.add(WZipInputBhv.class);
        doSetupBehaviors(event, beanManager, typeList);
    }

    /**
     * Actually register behaviors to container.
     * @param event The event type after bean discovery process. (NotNull)
     * @param beanManager The manager of CDI beans. (NotNull)
     * @param typeList The list of behavior types to be registered. (NotNull)
     */
    protected void doSetupBehaviors(final AfterBeanDiscovery event, final BeanManager beanManager, final List<Class<? extends AbstractBehaviorReadable<?, ?>>> typeList) {
        for (Class<? extends AbstractBehaviorReadable<?, ?>> clazz : typeList) {
            event.addBean(newBehaviorBean(beanManager, clazz));
        }
    }

    /**
     * Initialize DBFlute.
     * @param event The event type after deployment validation process. (NotNull)
     */
    public void afterDeploymentValidation(@Observes final AfterDeploymentValidation event) {
        initializeDBFlute();
    }

    /**
     * Initialize DBFlute (by creating DBFlute initializer).
     */
    protected void initializeDBFlute() {
        new com.oneslogi.base.dbflute.nogen.ExtendedDBFluteInitializer();
    }

    // ===================================================================================
    //                                                                        DBFlute Bean
    //                                                                        ============
    /**
     * New DBFlute bean for invoker assistant.
     * @param beanManager The manager of CDI beans. (NotNull)
     * @return The new-created DBFlute bean. (NotNull)
     */
    protected DBFluteBean<com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant> newDBFluteBeanOfInvokerAssistant(final BeanManager beanManager) {
        return new DBFluteBean<com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant>(
                beanManager, com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant.class, InvokerAssistant.class) {
            @Override
            protected void postInject(final com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant instance) {
                Bean<?> bean = beanManager.resolve(beanManager.getBeans(DataSource.class, createDBFluteAnnotationLiteral()));
                if (bean == null) {
                    bean = beanManager.resolve(beanManager.getBeans(DataSource.class, createDefaultAnnotationLiteral()));
                }
                if (bean == null) {
                    throw new UnsatisfiedResolutionException(String.format(
                            "Unable to resolve a bean for '%s' with qualifiers %s or %s.",
                            DataSource.class.getName(), createDBFluteAnnotationLiteral(), createDefaultAnnotationLiteral()));
                }
                DataSource dataSource = (DataSource) beanManager.getReference(bean, bean.getBeanClass(), beanManager.createCreationalContext(bean));
                instance.setDataSource(dataSource);
            }
        };
    }

    /**
     * New DBFlute bean for common column auto set-upper.
     * @param beanManager The manager of CDI beans. (NotNull)
     * @return The new-created DBFlute bean. (NotNull)
     */
    protected DBFluteBean<com.oneslogi.base.dbflute.allcommon.ImplementedCommonColumnAutoSetupper> newDBFluteBeanOfCommonColumnAutoSetupper(final BeanManager beanManager) {
        return new DBFluteBean<com.oneslogi.base.dbflute.allcommon.ImplementedCommonColumnAutoSetupper>(beanManager, com.oneslogi.base.dbflute.allcommon.ImplementedCommonColumnAutoSetupper.class, CommonColumnAutoSetupper.class);
    }

    /**
     * New DBFlute bean for behavior selector.
     * @param beanManager The manager of CDI beans. (NotNull)
     * @return The new-created DBFlute bean. (NotNull)
     */
    protected DBFluteBean<ImplementedBehaviorSelector> newDBFluteBeanOfBehaviorSelector(final BeanManager beanManager) {
        return new DBFluteBean<ImplementedBehaviorSelector>(beanManager, ImplementedBehaviorSelector.class, BehaviorSelector.class) {
            @Override
            protected void postInject(final ImplementedBehaviorSelector instance) {
                instance.setContainer(beanManager);
            }
        };
    }

    /**
     * New DBFlute bean for SQL clause creator.
     * @param beanManager The manager of CDI beans. (NotNull)
     * @return The new-created DBFlute bean. (NotNull)
     */
    protected DBFluteBean<ImplementedSqlClauseCreator> newDBFluteBeanOfSqlClauseCreator(final BeanManager beanManager) {
        return new DBFluteBean<ImplementedSqlClauseCreator>(beanManager, ImplementedSqlClauseCreator.class, SqlClauseCreator.class);
    }

    /**
     * New DBFlute bean for behavior command invoker.
     * @param beanManager The manager of CDI beans. (NotNull)
     * @return The new-created DBFlute bean. (NotNull)
     */
    protected DBFluteBean<BehaviorCommandInvoker> newDBFluteBeanOfBehaviorCommandInvoker(final BeanManager beanManager) {
        return new DBFluteBean<BehaviorCommandInvoker>(beanManager, BehaviorCommandInvoker.class) {
            @Override
            protected void postInject(final BehaviorCommandInvoker instance) {
                final Bean<?> bean = beanManager.resolve(beanManager.getBeans(InvokerAssistant.class, createDBFluteAnnotationLiteral()));
                instance.setInvokerAssistant((InvokerAssistant) beanManager.getReference(bean, bean.getBeanClass(), beanManager.createCreationalContext(bean)));
            }

            @Override
            public String getName() {
                final StringBuilder name = new StringBuilder(DBFlute.class.getPackage().getName());
                name.append(".");
                name.append(this.beanClass.getSimpleName());
                return name.toString();
            }
        };
    }

    /**
     * Simple implementation of {@link Bean}.
     * @param <T> The type of object.
     */
    public class DBFluteBean<T> implements Bean<T> {
        protected final Class<T> beanClass;
        protected final List<Class<? super T>> superTypes;
        protected final AnnotatedType<T> annotatedType;
        protected final InjectionTarget<T> injectionTarget;

        public DBFluteBean(final BeanManager beanManager, final Class<T> beanClass) {
            this(beanManager, beanClass, (List<Class<? super T>>) null);
        }

        public DBFluteBean(final BeanManager beanManager, final Class<T> beanClass, final Class<? super T> superType) {
            this(beanManager, beanClass, new ArrayList<Class<? super T>>(Arrays.asList(superType)));
        }

        public DBFluteBean(final BeanManager beanManager, final Class<T> beanClass, final List<Class<? super T>> superTypes) {
            this.beanClass = beanClass;
            this.superTypes = superTypes;
            this.annotatedType = beanManager.createAnnotatedType(beanClass);
            this.injectionTarget = beanManager.createInjectionTarget(this.annotatedType);
        }

        @Override
        public T create(final CreationalContext<T> creationalContext) {
            final T instance = this.injectionTarget.produce(creationalContext);
            this.injectionTarget.inject(instance, creationalContext);
            this.postInject(instance);
            this.injectionTarget.postConstruct(instance);
            return instance;
        }

        protected void postInject(final T instance) { // bean customization point
        }

        @Override
        public void destroy(final T instance, final CreationalContext<T> creationalContext) {
            this.injectionTarget.preDestroy(instance);
            this.injectionTarget.dispose(instance);
            creationalContext.release();
        };

        @Override
        public Class<?> getBeanClass() {
            return this.beanClass;
        }

        @Override
        public Set<InjectionPoint> getInjectionPoints() {
            return this.injectionTarget.getInjectionPoints();
        }

        @Override
        public String getName() {
            return this.beanClass.getName();
        }

        @Override
        public Set<Annotation> getQualifiers() {
            final Set<Annotation> qualifiers = new HashSet<Annotation>();
            qualifiers.add(createDBFluteAnnotationLiteral());
            qualifiers.add(createDefaultAnnotationLiteral());
            qualifiers.add(createAnyAnnotationLiteral());
            return qualifiers;
        }

        @Override
        public Class<? extends Annotation> getScope() {
            return ApplicationScoped.class;
        }

        @Override
        public Set<Class<? extends Annotation>> getStereotypes() {
            return Collections.emptySet();
        }

        @Override
        public Set<Type> getTypes() {
            final Set<Type> types = new HashSet<Type>();
            types.add(this.beanClass);
            types.add(Object.class);
            if (this.superTypes != null) {
                types.addAll(this.superTypes);
            }
            return types;
        }

        @Override
        public boolean isAlternative() {
            return false;
        }

        @Override
        public boolean isNullable() {
            return false;
        }
    }

    // ===================================================================================
    //                                                                       Behavior Bean
    //                                                                       =============
    public <BEHAVIOR extends AbstractBehaviorReadable<?, ?>> BehaviorBean<BEHAVIOR> newBehaviorBean(final BeanManager beanManager, final Class<BEHAVIOR> beanClass) {
        return new BehaviorBean<BEHAVIOR>(beanManager, beanClass);
    }

    public class BehaviorBean<BEHAVIOR extends AbstractBehaviorReadable<?, ?>> extends DBFluteBean<BEHAVIOR> {
        protected final BeanManager beanManager;

        public BehaviorBean(final BeanManager beanManager, final Class<BEHAVIOR> beanClass) {
            super(beanManager, beanClass, (List<Class<? super BEHAVIOR>>) null);
            this. beanManager = beanManager;
        }

        @Override
        protected void postInject(final BEHAVIOR instance) {
            Bean<?> bean = beanManager.resolve(beanManager.getBeans(BehaviorCommandInvoker.class, createDBFluteAnnotationLiteral()));
            instance.setBehaviorCommandInvoker((BehaviorCommandInvoker) beanManager.getReference(
                    bean, bean.getBeanClass(), beanManager.createCreationalContext(bean)));

            bean = beanManager.resolve(beanManager.getBeans(BehaviorSelector.class, createDBFluteAnnotationLiteral()));
            instance.setBehaviorSelector((BehaviorSelector) beanManager.getReference(
                    bean, bean.getBeanClass(), beanManager.createCreationalContext(bean)));

            if (instance instanceof AbstractBehaviorWritable) {
                bean = beanManager.resolve(beanManager.getBeans(CommonColumnAutoSetupper.class, createDBFluteAnnotationLiteral()));
                ((AbstractBehaviorWritable<?, ?>) instance).setCommonColumnAutoSetupper(
                        (CommonColumnAutoSetupper) beanManager.getReference(bean, bean.getBeanClass(), beanManager.createCreationalContext(bean)));
            }
        }
    }

    // ===================================================================================
    //                                                                  Annotation Literal
    //                                                                  ==================
    /**
     * Create annotation literal for DBFlute.
     * @return The new-created annotation literal. (NotNull)
     */
    protected AnnotationLiteral<DBFlute> createDBFluteAnnotationLiteral() {
        return new AnnotationLiteral<DBFlute>() {
            private static final long serialVersionUID = 1L;
        };
    }

    /**
     * Create annotation literal for default.
     * @return The new-created annotation literal. (NotNull)
     */
    protected AnnotationLiteral<Default> createDefaultAnnotationLiteral() {
        return new AnnotationLiteral<Default>() {
            private static final long serialVersionUID = 1L;
        };
    }

    /**
     * Create annotation literal for any.
     * @return The new-created annotation literal. (NotNull)
     */
    protected AnnotationLiteral<Any> createAnyAnnotationLiteral() {
        return new AnnotationLiteral<Any>() {
            private static final long serialVersionUID = 1L;
        };
    }
}
