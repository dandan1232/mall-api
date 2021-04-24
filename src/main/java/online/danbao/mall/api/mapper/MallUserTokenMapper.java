package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallUserToken;

/**
 * @Entity online.danbao.mall.api.entity.TbMallUserToken
 */
public interface MallUserTokenMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

    /**
     * 根据token查询
     *
     * @param token token
     * @return MallUserToken
     */
    MallUserToken selectByToken(String token);

}




