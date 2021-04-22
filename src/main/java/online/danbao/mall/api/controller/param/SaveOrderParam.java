package online.danbao.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: 蛋宝
 * @date: 2021/4/22 13:49
 * @description: 保存订单param
 */
@Data
public class SaveOrderParam implements Serializable {
    @ApiModelProperty("订单项id数组")
    private Long[] cartItemIds;
    @ApiModelProperty("地址id")
    private Long addressId;
}