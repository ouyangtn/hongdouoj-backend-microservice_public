package com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox.impl;


import com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox.CodeSandbox;
import com.oyjl.hongdouojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.oyjl.hongdouojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱 (第哦啊有网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}


