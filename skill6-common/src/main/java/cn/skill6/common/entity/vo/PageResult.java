package cn.skill6.common.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页结果模型
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-08 01:20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    private long total;

    private int pageSize;

    private int pageNum;

    private List<T> data;
}
