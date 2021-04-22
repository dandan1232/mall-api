package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallGoodsInfo;

public interface MallGoodsInfoMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(MallGoodsInfo record);

    int insertSelective(MallGoodsInfo record);

    MallGoodsInfo selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(MallGoodsInfo record);

    int updateByPrimaryKey(MallGoodsInfo record);
}