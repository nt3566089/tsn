package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MImportTypeCQ;

/**
 * The nest select set-upper of M_IMPORT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MImportTypeCQ _query;
    public MImportTypeNss(MImportTypeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * M_EDI by my EDI_ID, named 'MEdi'.
     */
    public void withMEdi() {
        _query.xdoNss(() -> _query.queryMEdi());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my GIFT_STATEMENT_TYPE, named 'BClassDtlByGiftStatementType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByGiftStatementType() {
        _query.xdoNss(() -> _query.queryBClassDtlByGiftStatementType());
        return new BClassDtlNss(_query.queryBClassDtlByGiftStatementType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my LINE_FEED_CD, named 'BClassDtlByLineFeedCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLineFeedCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByLineFeedCd());
        return new BClassDtlNss(_query.queryBClassDtlByLineFeedCd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my UPLOAD_TABLE_NM, named 'BClassDtlByUploadTableNm'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUploadTableNm() {
        _query.xdoNss(() -> _query.queryBClassDtlByUploadTableNm());
        return new BClassDtlNss(_query.queryBClassDtlByUploadTableNm());
    }
}
