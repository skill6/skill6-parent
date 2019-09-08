package cn.skill6.common.entity.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Restful 返回json
 *
 * @author 何明胜
 * @since 2018年3月21日 下午3:52:46
 */
@Data
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ResponseJson implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean success = true;

    private Object message;

    public ResponseJson() {
    }

    /**
     * 只有结果
     *
     * @param success 结果
     */
    public ResponseJson(Boolean success) {
        super();
        this.success = success;
    }

    public ResponseJson(Object message) {
        this.message = message;
    }
}
