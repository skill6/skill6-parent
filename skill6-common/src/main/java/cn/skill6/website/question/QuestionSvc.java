package cn.skill6.website.question;

import cn.skill6.common.entity.vo.ResponseJson;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 提问答疑接口
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 21:47
 */
public interface QuestionSvc {
    ResponseJson geQuestions(int pageSize, int pageNum);

    ResponseJson getQuestionById(@PathVariable("questionId") long questionId);
}
