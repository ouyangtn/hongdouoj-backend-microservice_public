package com.oyjl.hongdouojbackendjudgequestionservice.judge;


import com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy.DefaultJudgeStrategy;
import com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy.JudgeContext;
import com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy.JudgeStrategy;
import com.oyjl.hongdouojbackendmodel.model.codesandbox.JudgeInfo;
import com.oyjl.hongdouojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
