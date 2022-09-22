package com.abraham.eduservice.controller;

import com.abraham.commonutils.result.Result;
import com.abraham.eduservice.entity.EduTeacher;
import com.abraham.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Abraham
 * @Date 2022/9/21 22:06
 * @Version 1.0
 */
@RestController
@RequestMapping("/eduservice/teacher")
@Api(tags = "eduService")
public class EduTeacherController {

    @Autowired
    private EduTeacherService teacherService;

    // 查询讲师表中的所有数据
    @GetMapping("/findAll")
    @ApiOperation("查询所有讲师数据")
    public Result<List<EduTeacher>> findAllTeacher() {
        return Result.ok(teacherService.list(null));
    }

    // 讲师逻辑删除功能
    @DeleteMapping("/{id}")
    @ApiOperation("讲师逻辑删除")
    public Result<Boolean> removeTeacher(@PathVariable @ApiParam("讲师id") String id) {
        return Result.ok(teacherService.removeById(id));
    }
}
