package com.cag.mapper;

import com.cag.entity.UserEntity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userName", column = "userName"),
            @Result(property = "userAge", column = "userAge")
    })
    List<UserEntity> getAll();
}
