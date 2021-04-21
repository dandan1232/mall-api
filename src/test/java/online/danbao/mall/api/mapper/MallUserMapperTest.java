package online.danbao.mall.api.mapper;

import lombok.extern.slf4j.Slf4j;
import online.danbao.mall.api.entity.MallUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: 蛋宝
 * @date: 2021/4/21 9:29
 * @description:
 */
@SpringBootTest
@Slf4j
class MallUserMapperTest {
    @Resource
    private MallUserMapper mallUserMapper;

    @Test
    void selectByPrimaryKey() {
        MallUser mallUser = mallUserMapper.selectByPrimaryKey(1L);
        System.out.println(mallUser);
    }

    @Test
    void selectAll() {
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }

    @Test
    void selectByLoginName() {
        MallUser mallUser = mallUserMapper.selectByLoginName("18962494510");
        log.info("用户信息：" + mallUser);
        assertEquals(mallUser.getNickName(), "林丹丹");
    }

    @Test
    void selectByLoginNameAndPasswd() {
        MallUser mallUser = mallUserMapper.selectByLoginNameAndPasswd("18962494510", "e10adc3949ba59abbe56e057f20f883e");
        log.info("用户信息：" + mallUser);
        assertEquals(mallUser.getNickName(), "林丹丹");
    }


}