package online.danbao.mall.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.danbao.mall.api.entity.MallCarousel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 蛋宝
 * @Entity online.danbao.mall.api.entity.TbMallCarousel
 */
public interface MallCarouselMapper extends BaseMapper<MallCarousel> {
    /**
     * 查询number个轮播图数据
     *
     * @param number 数量
     * @return 轮播图
     */
    List<MallCarousel> findCarouselsByNum(@Param("number") int number);
}




