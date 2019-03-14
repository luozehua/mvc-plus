package com.lzh.mvc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzh.mvc.entity.SysAdmin;
import com.lzh.mvc.service.SysAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author luozehua
 * @since 2019-03-14
 */
@Api(description = "管理员接口")
@RestController
@RequestMapping("/sysAdmin")
public class SysAdminController {

    @Autowired
    private SysAdminService sysAdminService;
    @ApiOperation(value = "获取所有管理员" ,  notes="获取所有管理员")
    //@ApiImplicitParams({
    //        @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    //})
    @GetMapping("/getAllAdmin")
    public List<SysAdmin> getAllAdmin() {
        List<SysAdmin> sysAdmins = sysAdminService.list(new QueryWrapper<>());
        System.out.println(sysAdmins);
        return sysAdmins;
    }
}

