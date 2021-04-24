package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallCarousel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity online.danbao.mall.api.entity.TbMallCarousel
 */
public interface MallCarouselMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);

    /**
     * 查询number个轮播图数据
     *
     * @param number 数量
     * @return 轮播图
     */
    List<MallCarousel> findCarouselsByNum(@Param("number") int number);

}




