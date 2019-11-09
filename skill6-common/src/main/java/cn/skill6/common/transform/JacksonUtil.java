package cn.skill6.common.transform;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Map;

/**
 * 封装jackson转换为全局方法
 *
 * @author 何明胜
 * @version 1.3
 * @since 2018年8月26日 下午11:36:57
 */
@Slf4j
public class JacksonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        // 驼峰和下划线格式自动转换
        // objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SnakeCaseStrategy.SNAKE_CASE)
        //         .setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);

        // 如果json中有新增的字段并且是实体类类中不存在的，不报错
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        // 如果存在未知属性，则忽略不报错
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许key没有双引号
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 允许key有单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 允许整数以0开头
        objectMapper.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        // 允许字符串中存在回车换行控制符
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
    }

    public static ObjectMapper getInstance() {
        return objectMapper;
    }

    public static String toStr(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("object to json error", e);
            throw new IllegalArgumentException("object to json error");
        }
    }

    public static <T> T toObj(String jsonStr, Class<T> clazz) {
        try {
            return (T) objectMapper.readValue(jsonStr, clazz);
        } catch (IOException e) {
            log.error("json to object error", e);
            throw new IllegalArgumentException("json to object error");
        }
    }

    public static <T> T toObj(String jsonStr, TypeReference<?> typeReference) {
        try {
            return objectMapper.readValue(jsonStr, typeReference);
        } catch (IOException e) {
            log.error("json to object error", e);
            throw new IllegalArgumentException("json to object error");
        }
    }

    public static <T> T str2Map(String jsonStr) {
        return toObj(jsonStr, new TypeReference<Map<String, String>>() {
        });
    }

    public static <T> T map2Obj(Map<String, String> map, Class<T> clazz) {
        return (T) objectMapper.convertValue(map, clazz);
    }

    public static <T> T toObj(Object jsonStr, TypeReference<?> typeReference) {
        return objectMapper.convertValue(jsonStr, typeReference);
    }

    public static <T> T obj2Map(Object object) {
        return toObj(object, new TypeReference<Map<String, String>>() {
        });
    }

    public static <T> T obj2Obj(Object object, Class<T> clazz) {
        return (T) objectMapper.convertValue(object, clazz);
    }

}
