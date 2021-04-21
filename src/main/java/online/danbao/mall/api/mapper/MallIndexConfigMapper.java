package online.danbao.mall.api.mapper;

import online.danbao.mall.api.entity.MallIndexConfig;

/**
 * @Entity online.danbao.mall.api.entity.MallIndexConfig
 */
public interface MallIndexConfigMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallIndexConfig record);

    int insertSelective(MallIndexConfig record);

    MallIndexConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallIndexConfig record);

    int updateByPrimaryKey(MallIndexConfig record);

}




