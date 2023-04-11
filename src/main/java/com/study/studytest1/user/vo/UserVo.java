package com.study.studytest1.user.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserVo {

    private int userNum;
    private String userId;
    private String userPw;
    private String userNm;
    private String userNickname;
    private String userMail;
    private Role userRole;
    private Date regDate;
    private Date modiDate;

}
