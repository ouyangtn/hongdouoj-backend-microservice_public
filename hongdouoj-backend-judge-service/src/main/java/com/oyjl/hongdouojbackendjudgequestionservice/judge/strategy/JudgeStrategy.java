package com.oyjl.hongdouojbackendjudgequestionservice.judge.strategy;


import com.oyjl.hongdouojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContex
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContex);
}
