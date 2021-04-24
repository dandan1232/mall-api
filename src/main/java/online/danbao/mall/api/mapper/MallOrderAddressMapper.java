package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallOrderAddress;

/**
 * @Entity online.danbao.mall.api.entity.TbMallOrderAddress
 */
public interface MallOrderAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrderAddress record);

    int insertSelective(MallOrderAddress record);

    MallOrderAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrderAddress record);

    int updateByPrimaryKey(MallOrderAddress record);

}




