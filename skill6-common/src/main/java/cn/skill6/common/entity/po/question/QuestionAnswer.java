package cn.skill6.common.entity.po.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 提问回答
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 01:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAnswer {
    private Long answerId;

    private Long questionId;

    private Date answerTime;

    private Integer answerThumbsUpCount;

    private Integer answerThumbsDownCount;

    private String answerContent;
}
