package com.finsage.web.member.mapper;

import com.finsage.web.member.model.Member;

/**
 * Created by knigh on 2017/9/22.
 */
public interface MemberInfoMapper {

    public String selectAccount(String account);

    public Integer creatAccount(Member member);

    public Member getMemberInfo(String memberId);

    public void updateMemberStatus(Member member);
}
