package cn.skill6.common.entity.po.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 提问信息
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 01:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionInfo {
    private Long questionId;

    private Long categoryid;

    private Long userId;

    private Long recommendAnswerId;

    private String questionTitle;

    private String questionLabel;

    private Integer questionVisitCount;

    private Date questionCreateTime;

    private Date questionUpdateTime;

    private Boolean questionAttachFile;

    private String questionAttachIds;

    private Boolean questionValid;

    private Boolean questionSolve;

    private String questionHtmlContent;

    private String questionMdContent;
}
