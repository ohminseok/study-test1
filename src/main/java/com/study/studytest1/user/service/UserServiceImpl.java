package com.study.studytest1.user.service;

import com.study.studytest1.user.mapper.UserMapper;
import com.study.studytest1.user.vo.Role;
import com.study.studytest1.user.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    @Transactional(value="transactionManager")
    public int joinUser(UserVo userVo) throws  Exception{
        userVo.setUserRole(Role.USER);
        return userMapper.insertUser(userVo);
    }
}
