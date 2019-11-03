package cn.skill6.common.entity.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Restful 返回json
 *
 * @author 何明胜
 * @since 2018年3月21日 下午3:52:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ResponseJson {

    private Object message;

    public static ResponseJson build(Object message) {
        return new ResponseJson(message);
    }
}
