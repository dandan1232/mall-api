package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallGoodsCategory;

/**
 * @Entity online.danbao.mall.api.entity.TbMallGoodsCategory
 */
public interface MallGoodsCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallGoodsCategory record);

    int insertSelective(MallGoodsCategory record);

    MallGoodsCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallGoodsCategory record);

    int updateByPrimaryKey(MallGoodsCategory record);

}




