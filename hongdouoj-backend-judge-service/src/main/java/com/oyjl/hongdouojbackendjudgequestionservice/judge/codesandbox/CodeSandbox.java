package com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox;


import com.oyjl.hongdouojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.oyjl.hongdouojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
