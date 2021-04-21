package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallOrder;

/**
 * @Entity online.danbao.mall.api.entity.MallOrder
 */
public interface MallOrderMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);

}




