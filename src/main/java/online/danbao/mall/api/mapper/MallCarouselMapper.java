package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallCarousel;

public interface MallCarouselMapper {
    int deleteByPrimaryKey(Integer carouselId);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Integer carouselId);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);
}