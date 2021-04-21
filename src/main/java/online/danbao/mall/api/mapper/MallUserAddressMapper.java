package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallUserAddress;

/**
 * @Entity online.danbao.mall.api.entity.MallUserAddress
 */
public interface MallUserAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserAddress record);

    int insertSelective(MallUserAddress record);

    MallUserAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserAddress record);

    int updateByPrimaryKey(MallUserAddress record);

}




