package com.xzp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzp.pojo.po.StudentQuestion;
import com.xzp.pojo.vo.student.StudentQuestionVO;

import java.util.List;

/**
 * 学生服务
 *
 * @author 薛展鹏
 * @description 针对表【s_student_question(学生答题表)】的数据库操作Service
 * @date 2023/03/26
 */
public interface StudentQuestionService extends IService<StudentQuestion> {

    List<StudentQuestionVO> getQuestionPercen();

    List<StudentQuestion> getquestionCount();


}
