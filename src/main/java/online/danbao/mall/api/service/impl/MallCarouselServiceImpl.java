package online.danbao.mall.api.service.impl;

import online.danbao.mall.api.controller.vo.MallIndexCarouselVO;
import online.danbao.mall.api.entity.MallCarousel;
import online.danbao.mall.api.mapper.MallCarouselMapper;
import online.danbao.mall.api.service.MallCarouselService;
import online.danbao.mall.api.util.BaseBeanUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 蛋宝
 * @since: 2021-04-24
 **/
@Service
public class MallCarouselServiceImpl  implements MallCarouselService {
    @Resource
    private MallCarouselMapper mallCarouselMapper;

    @Override
    public List<MallIndexCarouselVO> getCarouselsForIndex(int number) {
        List<MallIndexCarouselVO> list = new ArrayList<>(number);
        List<MallCarousel> carousels = mallCarouselMapper.findCarouselsByNum(number);
        if (!CollectionUtils.isEmpty(carousels)) {
            list = BaseBeanUtil.copyList(carousels, MallIndexCarouselVO.class);
        }
        return list;
    }
}
