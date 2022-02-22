package com.lingh.mapper;

import com.lingh.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> selectUsers();

    @Insert("INSERT INTO user (name,age) values (#{name},#{age})")
    boolean addUser(@Param("name") String name, @Param("age") Integer age);

    @Delete("DELETE from user where id = #{id}")
    void deleteUserById(Long id);
}