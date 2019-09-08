package cn.skill6.website.store;

import cn.skill6.common.entity.vo.ResponseJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 图片存储接口
 *
 * @author 何明胜
 * @since 2018年9月13日 上午12:46:40
 */
public interface StoreImageSvc {
    /**
     * 上传图片
     *
     * @param request Http请求
     * @return 上传结果
     */
    ResponseJson uploadImage(HttpServletRequest request);

    /**
     * 下载图片
     *
     * @param imageId  图片ID
     * @param response 返回流
     */
    void downloadImageById(Long imageId, HttpServletResponse response);
}
