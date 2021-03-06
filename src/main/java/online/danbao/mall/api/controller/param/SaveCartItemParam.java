package online.danbao.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: 蛋宝
 * @date: 2021/4/22 13:45
 * @description: 添加购物项param
 */
@Data
public class SaveCartItemParam implements Serializable {
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
    @ApiModelProperty("商品id")
    private Long goodsId;
}