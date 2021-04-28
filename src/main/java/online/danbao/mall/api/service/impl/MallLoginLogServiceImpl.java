package online.danbao.mall.api.service.impl;

import online.danbao.mall.api.entity.MallLoginLog;
import online.danbao.mall.api.mapper.MallLoginLogMapper;
import online.danbao.mall.api.service.MallLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: 蛋宝
 * @since: 2021-04-27
 **/
@Service
public class MallLoginLogServiceImpl implements MallLoginLogService {
    @Resource
    private MallLoginLogMapper mallLoginLogMapper;

    @Override
    public Boolean saveLog(MallLoginLog mallLoginLog) {
        return mallLoginLogMapper.insert(mallLoginLog) != 0;
    }
}