package online.danbao.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: 蛋宝
 * @date: 2021/4/22 13:44
 * @description: 用户修改param
 */
@Data
public class MallUserUpdateParam implements Serializable {
    @ApiModelProperty("用户昵称")
    private String nickName;
    @ApiModelProperty("用户密码(需要MD5加密)")
    private String passwordMd5;
    @ApiModelProperty("个性签名")
    private String introduceSign;
}