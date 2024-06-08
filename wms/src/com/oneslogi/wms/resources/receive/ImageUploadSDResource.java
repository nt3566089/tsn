package com.oneslogi.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.dto.receive.ReceiveInspectionSDDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * SD用画像アップロードサンプル画面のリソースクラス。
 */
@Path("/receive/imageUploadSD")
public class ImageUploadSDResource extends AbstractWmsResource {

	// ===== 定数定義 =====
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
	}

	// ===== 使用ロジッククラス =====

	// ===== メンバ変数 =====

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReceiveInspectionSDDto initNew() {

		ReceiveInspectionSDDto receiveInspectionSDDto = new ReceiveInspectionSDDto();
		return receiveInspectionSDDto;
	}

	/**
	 * <h2>画像データ取得。</h2>
	 * <pre>
	 * 画面で入力された検索条件で画像データを検索する。
	 *
	 * @param ReceiveInspectionSDDto 入荷検品画面用DTO
	 * @return ReceiveInspectionSDDto 入荷検品画面用DTO
	 */
	@GET
	@Path("/search")
	public ReceiveInspectionSDDto search(ReceiveInspectionSDDto receiveInspectionSDDto) {

		// Entity変換
		TReceivePlanHDtoMapper headerMapper = new TReceivePlanHDtoMapper();
		final TReceivePlanH header = headerMapper.mappingToEntity(receiveInspectionSDDto.data.head);
		header.getClientId();

		// 画像データ取得
		List<TStoreRecordB> selectList = new ArrayList<TStoreRecordB>();
		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 返信用DTO作成
		ReceiveInspectionSDDto resultDto = new ReceiveInspectionSDDto();
		TStoreRecordBDtoMapper bodyMapper = new TStoreRecordBDtoMapper();
		resultDto.data.storeBody = bodyMapper.mappingToDtoList(selectList);
		resultDto.paging = receiveInspectionSDDto.paging;

		return resultDto;
	}

	// [#1482] SD版画像アップロード機能追加 2017.04.19 Dario Add Start
	/**
	 * <h2>画像データ取込.</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ArrayList<byte[]> SD用画像アップロードデータ
	 */
	@POST
	@Path("/imageUpload")
	public List<byte[]> imageUpload(MultipartFormDataInput input) throws Exception {

		List<byte[]> returnFiles = new ArrayList<byte[]>();

//		int rows = 0;
		//アップロードデータ取得処理
		Map<String, byte[]> uploadFiles = getUploadFiles(input);

		//ここで画像の保存パスをDBから取得（M_PRODUCTにIMAGE_DIRECTORYカラムなど）
		String path = FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath();
		List<String> files = FileUtil.writeFiles(path, uploadFiles, false);

		for (Map.Entry<String, byte[]> entry: uploadFiles.entrySet()) {
			byte[] file = entry.getValue();
			returnFiles.add(file);
		}

		//test code
		files.getClass();

		// データ登録

		// 完了メッセージの設定
//		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return returnFiles;
	}
	// [#1482] SD版画像アップロード機能追加 2017.04.19 Dario Add End
}
