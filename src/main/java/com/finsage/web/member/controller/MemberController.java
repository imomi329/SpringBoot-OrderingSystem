package com.finsage.web.member.controller;

import com.finsage.web.base.BaseModel;
import com.finsage.web.member.model.Member;
import com.finsage.web.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by knigh on 2017/9/22.
 */

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/saveAccount")
    public BaseModel saveAccount(Member mb){
        memberService = new MemberService();
        BaseModel bm = memberService.saveAccount(mb);
        return bm;
    }

    @GetMapping("/getMemberInfo")
    public BaseModel getMemberInfo(Member mb){
        memberService = new MemberService();
        BaseModel bm = memberService.getMemberInfo(mb.getMemberId());
        return bm;
    }

    @GetMapping("/changeMemberCostStatus")
    public BaseModel changeMemberCostStatus(Member mb){
        memberService = new MemberService();
        BaseModel bm = memberService.changeMemberCostStatus(mb.getMemberId(),1234);
        return bm;
    }

}
