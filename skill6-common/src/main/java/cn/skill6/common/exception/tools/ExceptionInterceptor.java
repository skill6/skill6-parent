package cn.skill6.common.exception.tools;

import cn.skill6.common.constant.ExceptionName;
import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.common.exception.db.SqlException;
import cn.skill6.common.transform.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 全局异常拦截器
 *
 * @author 何明胜
 * @since 2018年2月26日 下午11:29:05
 */
@Slf4j
public class ExceptionInterceptor implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(
        HttpServletRequest request, HttpServletResponse response,
        Object object, Exception exception) {

        log.error(StackTrace2Str.exceptionStackTrace2Str(exception));
        ResponseJson responseJson = new ResponseJson(false);

        // 判断是否ajax请求
        if (!isAjax(request)) {
            // 如果被识别为相应异常则做出相应处理, 否则统一归为系统异常
            if (exception instanceof SqlException) {
                response.setStatus(400);

                responseJson.setMessage(ExceptionName.SQL_EXCEPTION);
                log.error("捕获SQL异常", exception);
            } else {
                responseJson.setMessage(ExceptionName.SYS_EXCEPTION);
                log.error("捕获系统异常", exception);
            }

            // 对于非ajax请求,我们都统一跳转到error.jsp页面
            return new ModelAndView("redirect:/error.jsp", responseJson2Map(responseJson));
        } else {
            // 如果是ajax请求,JSON格式返回
            try {
                response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                response.setCharacterEncoding("UTF-8");
                PrintWriter writer = response.getWriter();

                // 为安全起见,只有业务异常我们对前端可见,否则统一归为系统异常
                if (exception instanceof SqlException) {
                    responseJson.setMessage(ExceptionName.SQL_EXCEPTION);
                    log.error("捕获SQL异常", exception);
                } else {
                    responseJson.setMessage(ExceptionName.SYS_EXCEPTION);
                    log.error("捕获系统异常", exception);
                }

                writer.write(JacksonUtil.toStr(responseJson));
                writer.flush();
                writer.close();

                return null;
            } catch (IOException e) {
                log.error("异常系统捕获处理时再次异常", e);

                // 异常中的异常返回到错误页面
                return new ModelAndView("redirect:/error.jsp", responseJson2Map(responseJson));
            }
        }
    }

    /**
     * 判断是否是ajax请求
     *
     * @param request
     */
    public static boolean isAjax(ServletRequest request) {
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");

        String xMLHttpRequest = "XMLHttpRequest";
        if (header != null && xMLHttpRequest.equalsIgnoreCase(header)) {
            return true;
        }

        return false;
    }

    private Map<String, ?> responseJson2Map(ResponseJson responseJson) {
        String jsonStr = JacksonUtil.toStr(responseJson);
        return JacksonUtil.toObj(jsonStr, Map.class);
    }
}
