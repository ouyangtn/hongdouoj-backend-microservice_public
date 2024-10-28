package com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy;


import com.oyjl.hongdouojbackendmodel.model.codesandbox.JudgeInfo;
import com.oyjl.hongdouojbackendmodel.model.dto.question.JudgeCase;
import com.oyjl.hongdouojbackendmodel.model.entity.Question;
import com.oyjl.hongdouojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

@Data
public class JudgeContext {

    /**
     * 上下文（用于定义在策略在传递的参数）
     */
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private  List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    /**
     * 题目提交信息
     */
    private QuestionSubmit questionSubmit;
}
