package online.danbao.mall.api.controller;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import online.danbao.mall.api.common.MallException;
import online.danbao.mall.api.common.ServiceResultEnum;
import online.danbao.mall.api.controller.vo.MallIndexCategoryVO;
import online.danbao.mall.api.service.MallGoodsCategoryService;
import online.danbao.mall.api.util.Result;
import online.danbao.mall.api.util.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 蛋宝
 * @date: 2021/4/26 15:27
 * @description:
 */
@RestController
@Api(value = "v1", tags = "4.楼楼商城分类页面接口")
@RequestMapping("/api/v1")
public class MallGoodsCategoryController {
    @Resource
    private MallGoodsCategoryService mallGoodsCategoryService;

    @GetMapping("/categories")
    @ApiOperation(value = "获取分类数据", notes = "分类页面使用")
    public Result getCategories() {
        List<MallIndexCategoryVO> categories = mallGoodsCategoryService.getCategoriesForIndex();
        if (CollectionUtils.isEmpty(categories)) {
            MallException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return ResultGenerator.genSuccessResult(categories);
    }
}