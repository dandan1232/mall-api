package online.danbao.mall.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 蛋宝
 */
@SpringBootApplication
@MapperScan(basePackages = {"online.danbao.mall.api.mapper"})
@EnableScheduling
public class MallApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallApiApplication.class, args);
    }
}
