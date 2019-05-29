package com.druid.test.controller;

import com.druid.test.abstracts.SpeechConditionVO;
import com.druid.test.beans.Speech;
import com.druid.test.service.RepSpeechService;
import com.druid.test.utils.PageResult;
import com.druid.test.utils.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likaixuna email:likaixuan(a)innodev.com.cn
 * @Date: 2019/5/20 18:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/repSpeech")
public class RestRepSpeechController {
    @Autowired
    private RepSpeechService repSpeechService;

    @PostMapping("/list")
    public PageResult getAll() {
        PageInfo<Speech> pageInfo = repSpeechService.findPageBreakByCondition();
        return PageUtil.tablePage(pageInfo);
    }


}
