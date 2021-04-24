package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallAdminUser;

/**
 * @author mqxu
 * @Entity online.danbao.mall.api.entity.MallAdminUser
 */
public interface MallAdminUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallAdminUser record);

    int insertSelective(MallAdminUser record);

    MallAdminUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallAdminUser record);

    int updateByPrimaryKey(MallAdminUser record);

}




