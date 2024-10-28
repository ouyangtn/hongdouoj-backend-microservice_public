package com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox;


import com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.oyjl.hongdouojbackendjudgequestionservice.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance (String type){
        switch (type){
            case "remote" :
                return new RemoteCodeSandbox();
            case "thirtyParty":
                return new ThirdPartyCodeSandbox();
            case "example":
            default:
                return new ExampleCodeSandbox();
        }
    }
}
