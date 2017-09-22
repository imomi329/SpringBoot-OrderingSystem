package com.finsage.web.member.controller;

import com.finsage.web.base.BaseModel;
import com.finsage.web.member.model.Member;
import com.finsage.web.member.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by knigh on 2017/9/22.
 */

@RestController
@RequestMapping("/member")
public class MemberController {

    public BaseModel save(Member mb){
        BaseModel bm = new BaseModel();
        MemberService memberService = new MemberService();
        memberService.saveAccount(mb);
        return bm;
    }
}
