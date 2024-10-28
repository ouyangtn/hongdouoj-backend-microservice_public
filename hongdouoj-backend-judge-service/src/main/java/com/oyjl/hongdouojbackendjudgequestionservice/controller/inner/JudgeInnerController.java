package com.oyjl.hongdouojbackendjudgequestionservice.controller.inner;

import com.oyjl.hongdouojbackendjudgequestionservice.judge.JudgeService;
import com.oyjl.hongdouojbackendmodel.model.entity.QuestionSubmit;
import com.oyjl.hongdouojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}
