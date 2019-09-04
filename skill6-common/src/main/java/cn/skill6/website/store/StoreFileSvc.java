package cn.skill6.website.store;

import cn.skill6.common.entity.enums.FileType;
import cn.skill6.common.entity.vo.ResponseJson;
import org.apache.commons.fileupload.FileUploadException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件存储接口
 *
 * @author 何明胜
 * @since 2018年9月4日 下午9:44:31
 */
public interface StoreFileSvc {
    /**
     * 上传文件
     *
     * @param request  Http请求
     * @param fileType 文件类型
     * @return 上传结果
     * @throws FileUploadException 文件上传异常
     * @throws IOException         流异常
     */
    ResponseJson uploadFile(HttpServletRequest request, FileType fileType)
        throws IOException, FileUploadException;

    /**
     * 根据文件ID下载文件
     *
     * @param fileId   文件ID
     * @param response 返回流
     */
    void downloadFileById(Long fileId, HttpServletResponse response);
}
