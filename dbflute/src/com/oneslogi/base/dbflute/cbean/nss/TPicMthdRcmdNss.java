package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPicMthdRcmdCQ;

/**
 * The nest select set-upper of T_PIC_MTHD_RCMD.
 * @author DBFlute(AutoGenerator)
 */
public class TPicMthdRcmdNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPicMthdRcmdCQ _query;
    public TPicMthdRcmdNss(TPicMthdRcmdCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RCMD_PICKING_CLS, named 'BClassDtlByRcmdPickingCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByRcmdPickingCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByRcmdPickingCls());
        return new BClassDtlNss(_query.queryBClassDtlByRcmdPickingCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmergencyFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmergencyFlg());
        return new BClassDtlNss(_query.queryBClassDtlByEmergencyFlg());
    }
}
