package com.oneslogi.base.dbflute.cbean.cq;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import com.oneslogi.base.dbflute.cbean.cq.bs.BsVDictCQ;

/**
 * The condition-query of V_DICT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class VDictCQ extends BsVDictCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // You should NOT touch with this constructor.
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (NullAllowed: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public VDictCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here. e.g. public void arrangeXxx()
}