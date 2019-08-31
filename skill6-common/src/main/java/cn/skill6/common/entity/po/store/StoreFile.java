package cn.skill6.common.entity.po.store;

import cn.skill6.common.entity.enums.FileType;
import lombok.Data;

import java.util.Date;

/**
 * 文件下载实体类
 *
 * @author 何明胜
 * @since 2018年8月15日 下午11:33:07
 */
@Data
public class StoreFile {
    private Long fileId;

    private String fileName;

    private String fileFullName;

    private String fileUrl;

    private Date fileUploadTime;

    private String fileLabel;

    private FileType fileType;

    private String fileHashCode;

    private Integer fileVisitCount;

    private Integer fileCollectCount;

    private Integer fileDownloadCount;

    private String fileDesc;

    public StoreFile() {
    }

    public StoreFile(
            Long fileId,
            String fileName,
            String fileUrl,
            Date fileUploadTime,
            String fileHashCode,
            Integer fileDownloadCount) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileUploadTime = fileUploadTime;
        this.fileHashCode = fileHashCode;
        this.fileDownloadCount = fileDownloadCount;
    }

    public StoreFile(
            Long fileId,
            String fileName,
            String fileUrl,
            Date fileUploadTime,
            FileType fileType,
            String fileHashCode,
            Integer fileDownloadCount) {
        super();
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileUploadTime = fileUploadTime;
        this.fileType = fileType;
        this.fileHashCode = fileHashCode;
        this.fileDownloadCount = fileDownloadCount;
    }
}
