package com.study.studytest1.user.mapper;

import com.study.studytest1.user.vo.UserVo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import static org.assertj.core.api.Assertions.*;

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    @DisplayName("insertUser 테스트")
    void insertUserTest () {
        UserVo userVo = new UserVo();
        userVo.setUserId("test");
        userVo.setUserPw("testPw");
        userVo.setUserNm("testName");
        userVo.setUserPhone("testPhone");
        int result = userMapper.insertUser(userVo);
        assertThat(result).isEqualTo(1);
    }
}
