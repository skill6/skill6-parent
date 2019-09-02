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

    public StoreFile(Long fileId, String fileName, String fileFullName, String fileUrl, Date fileUploadTime,
                     String fileLabel, String fileHashCode, Integer fileVisitCount, Integer fileCollectCount,
                     Integer fileDownloadCount, String fileDesc) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileFullName = fileFullName;
        this.fileUrl = fileUrl;
        this.fileUploadTime = fileUploadTime;
        this.fileLabel = fileLabel;
        this.fileHashCode = fileHashCode;
        this.fileVisitCount = fileVisitCount;
        this.fileCollectCount = fileCollectCount;
        this.fileDownloadCount = fileDownloadCount;
        this.fileDesc = fileDesc;
    }
}
