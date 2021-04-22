package online.danbao.mall.api.config.annotation;

import java.lang.annotation.*;

/**
 * @author 蛋宝
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TokenToMallUser {

    /**
     * 当前用户在request中的名字
     * @return String
     */
    String value() default "user";

}
