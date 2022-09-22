package com.abraham.eduservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.abraham.eduservice.entity.EduTeacher;
import com.abraham.eduservice.service.EduTeacherService;
import com.abraham.eduservice.mapper.EduTeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author Abraham
* @description 针对表【edu_teacher(讲师)】的数据库操作Service实现
* @createDate 2022-09-21 22:05:50
*/
@Service
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherMapper, EduTeacher>
    implements EduTeacherService{

}




