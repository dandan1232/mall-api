package online.danbao.mall.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.danbao.mall.api.entity.MallGoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 蛋宝
 * @Entity online.danbao.mall.api.entity.TbMallGoodsCategory
 */
public interface MallGoodsCategoryMapper extends BaseMapper<MallGoodsCategory> {
    /**
     * 根据分类层级和分类名称查询分类信息
     *
     * @param categoryLevel 分类层级
     * @param categoryName  分类名称
     * @return 分类信息
     */
    MallGoodsCategory selectByLevelAndName(@Param("categoryLevel") Byte categoryLevel,
                                           @Param("categoryName") String categoryName);

    /**
     * 根据分类层级和父级分类id和数量查询分类信息
     *
     * @param parentIds     父级分类id
     * @param categoryLevel 分类层级
     * @param number        数量
     * @return 分类信息
     */
    List<MallGoodsCategory> selectByLevelAndParentIdsAndNumber(@Param("parentIds") List<Long> parentIds,
                                                               @Param("categoryLevel") int categoryLevel,
                                                               @Param("number") int number);


}




