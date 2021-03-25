package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author Andrii Zhytar
 */
@Mapper
public interface UserMapper {

    @Select("select * from users where email = #{email}")
    User findUserByEmail(String email);
}
