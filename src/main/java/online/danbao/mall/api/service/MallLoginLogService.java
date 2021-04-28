package online.danbao.mall.api.service;

import online.danbao.mall.api.entity.MallLoginLog;

/**
 * @description:
 * @author: 蛋宝
 * @since: 2021-04-27
 **/
public interface MallLoginLogService {
    /**
     * 保存登录日志
     *
     * @param mallLoginLog 登录日志
     * @return Boolean
     */
    Boolean saveLog(MallLoginLog mallLoginLog);
}
