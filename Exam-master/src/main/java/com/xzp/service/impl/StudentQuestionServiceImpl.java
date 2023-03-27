package com.xzp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzp.pojo.po.StudentQuestion;
import com.xzp.pojo.vo.student.StudentQuestionVO;
import com.xzp.service.StudentQuestionService;
import com.xzp.mapper.StudentQuestionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author wangpeng
* @description 针对表【s_student_question(学生答题表)】的数据库操作Service实现
* @createDate 2022-04-10 13:50:27
*/
@Service
public class StudentQuestionServiceImpl extends ServiceImpl<StudentQuestionMapper, StudentQuestion>
    implements StudentQuestionService{


    @Override
    public List<StudentQuestionVO> getQuestionPercen() {
        List<StudentQuestionVO> vos= baseMapper.getQuesPercen();
        return vos;
    }

    @Override
    public List<StudentQuestion> getquestionCount() {
        return baseMapper.getquestionCount();
    }
}




