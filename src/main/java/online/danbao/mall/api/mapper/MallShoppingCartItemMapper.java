package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallShoppingCartItem;

/**
 * @Entity online.danbao.mall.api.entity.TbMallShoppingCartItem
 */
public interface MallShoppingCartItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallShoppingCartItem record);

    int insertSelective(MallShoppingCartItem record);

    MallShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallShoppingCartItem record);

    int updateByPrimaryKey(MallShoppingCartItem record);

}




