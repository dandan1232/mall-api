package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallCarousel;

/**
 * @Entity online.danbao.mall.api.entity.MallCarousel
 */
public interface MallCarouselMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);

}




