package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallGoodsCategory;

public interface MallGoodsCategoryMapper {
    int deleteByPrimaryKey(Long categoryId);

    int insert(MallGoodsCategory record);

    int insertSelective(MallGoodsCategory record);

    MallGoodsCategory selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(MallGoodsCategory record);

    int updateByPrimaryKey(MallGoodsCategory record);
}