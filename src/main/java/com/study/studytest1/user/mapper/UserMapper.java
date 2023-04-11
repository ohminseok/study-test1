package com.study.studytest1.user.mapper;

import com.study.studytest1.user.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int insertUser(UserVo userVo);
}
