package cn.skill6.website.basic;

import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 网站版本
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-05 00:45
 */
public interface VersionSvc {
    /**
     * 查询分页的网站版本信息
     *
     * @param pageSize 分页大小
     * @param pageNum  页码
     * @return 查询结果
     */
    ResponseJson getVersionByPage(int pageSize, int pageNum);
}
