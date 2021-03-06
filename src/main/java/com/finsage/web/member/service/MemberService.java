package com.finsage.web.member.service;

import com.finsage.util.XMLUtil.StringUtil;
import com.finsage.web.base.BaseModel;
import com.finsage.web.base.Message;
import com.finsage.web.member.mapper.MemberInfoMapper;
import com.finsage.web.member.mapper.MemberMapper;
import com.finsage.web.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by knigh on 2017/9/22.
 */
@Service
public class MemberService {

    @Autowired
    private MemberInfoMapper memberInfoMapper;

    @Autowired
    private MemberMapper memberMapper;

    // 建立帳號
    public BaseModel saveAccount(Member member){
        // 驗證帳號是否重複
        BaseModel bm = new BaseModel();
        if (member.getAccount() == null){
            bm.setSuccess(false);
            bm.setReturnCode(Message.returnCode1008);
            bm.setReturnMessage(Message.returnMessage1008);
            return bm;
        }
        if(!checkAccount(member.getAccount())){
            bm.setSuccess(false);
            bm.setReturnCode(Message.returnCode1001);
            bm.setReturnMessage(Message.returnMessage1001);
            return bm;
        } else {
            // 驗證密碼
            if (member.getPassword() == null || !checkPassword(member.getPassword())){
                bm.setSuccess(false);
                bm.setReturnCode(Message.returnCode1002);
                bm.setReturnMessage(Message.returnMessage1002);
                return bm;
            }
            if (StringUtil.isBlank(member.getUserName()) == true){
                bm.setSuccess(false);
                bm.setReturnCode(Message.returnCode1003);
                bm.setReturnMessage(Message.returnMessage1003);
                return bm;
            }
            if (StringUtil.isBlank(member.getBirthday().toString())){
                bm.setSuccess(false);
                bm.setReturnCode(Message.returnCode1004);
                bm.setReturnMessage(Message.returnMessage1004);
                return bm;
            }
            if(!StringUtil.isBlank(member.getEmail())){
                if (!checkEmail(member.getEmail())){
                    bm.setSuccess(false);
                    bm.setReturnCode(Message.returnCode1006);
                    bm.setReturnMessage(Message.returnMessage1006);
                    return bm;
                }
            }
            if(!StringUtil.isBlank(member.getPhone())){
                if (!checkPhone(member.getPhone())){
                    bm.setSuccess(false);
                    bm.setReturnCode(Message.returnCode1007);
                    bm.setReturnMessage(Message.returnMessage1007);
                    return bm;
                }
            }
            member.setMemberId(UUID.randomUUID().toString().replace("-",""));
            Integer createMemberInfo = memberInfoMapper.creatAccount(member);
            Integer createMember = memberMapper.createAccount(member);
            if (createMemberInfo == 0 || createMember == 0){
                bm.setSuccess(false);
                bm.setReturnCode(Message.returnCode2000);
                bm.setReturnMessage(Message.returnMessage2000);
                return bm;
            }
            bm.setSuccess(true);
            bm.setReturnCode(Message.returnCode0000);
            bm.setReturnMessage(Message.returnMessage0000);
            return bm;
        }
    }


    public BaseModel getMemberInfo(String memberId){
        Member member = memberInfoMapper.getMemberInfo(memberId);
        BaseModel bm = new BaseModel();
        if (member == null){
            bm.setSuccess(false);
            bm.setReturnCode(Message.returnCode1009);
            bm.setReturnMessage(Message.returnMessage1009);
            return bm;
        }
        bm.setSuccess(true);
        bm.setReturnCode(Message.returnCode0000);
        bm.setReturnMessage(Message.returnMessage0000);
        bm.setData(member);
        return bm;
    }

    // 結帳修改狀態
    public BaseModel changeMemberCostStatus(String memberId, Integer cost){
        BaseModel bm = new BaseModel();
        if (cost == 0){
            bm.setSuccess(false);
            bm.setReturnCode(Message.returnCode3001);
            bm.setReturnMessage(Message.returnMessage3001);
            return bm;
        }
        Member member = (Member) getMemberInfo(memberId).getData();
        if (member == null){
            bm.setSuccess(false);
            bm.setReturnCode(Message.returnCode3000);
            bm.setReturnMessage(Message.returnMessage3000);
            return bm;
        } else {
            Integer costCount = member.getCostCount();
            member.setCostCount((costCount == null || cost == 0 ? 0:member.getCostCount()) + 1);
            Integer costTotal = (member.getCostTotal() == null || member.getCostTotal() == 0 ? 0 : member.getCostTotal()) + cost;
            member.setLevelId(changeMemberLevel(costTotal));
            member.setCostTotal(costTotal);
            member.setLastVisitDate(new Date());
            member.setUpdateDate(new Date());
            memberInfoMapper.updateMemberStatus(member);
            bm.setSuccess(true);
            bm.setReturnCode(Message.returnCode0000);
            bm.setReturnMessage(Message.returnMessage0000);
            return bm;
        }
    }

    private boolean checkAccount(String account){
        String memberAccount = memberMapper.selectAccount(account);
        return StringUtil.isBlank(memberAccount);
    }

    private boolean checkPassword(String password){
        if(password.length() < 10 || password.length() > 16){
            return false;
        } else {
            if(password.substring(0,1).matches("[0-9]")){
                return false;
            } else {
                return password.matches("[a-zA-Z0-9|\\\\.]*") ? true : false;
            }
        }
    }

    private boolean checkPhone(String phone){
        if(phone.length() != 10){
            return false;
        } else {
            return phone.substring(0,2).equals("09") ? true : false;
        }
    }

    private boolean checkEmail(String email){
        return email.matches("^([\\w]+)(([-\\.][\\w]+)?)*@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$") ? true :false;
    }

    private Integer changeMemberLevel(Integer totalCost){
        if (totalCost >= 5000 && totalCost < 20000){
            return 1;
        } else if (totalCost >= 20000 && totalCost < 50000){
            return 2;
        } else if (totalCost >= 50000){
            return 3;
        } else {
            return 0;
        }
    }

}
