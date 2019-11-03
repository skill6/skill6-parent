package cn.skill6.website.question;

import cn.skill6.common.entity.po.question.QuestionInfo;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 提问答疑接口
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:47
 */
public interface QuestionSvc {
    List<QuestionInfo> geQuestions(int pageSize, int pageNum);

    QuestionInfo getQuestionById(@PathVariable("questionId") long questionId);
}
