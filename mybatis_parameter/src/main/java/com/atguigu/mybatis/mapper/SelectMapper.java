package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    /**
     * 获取用户数量
     *
     * @return
     */
    Integer getCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    // List<Map<String,Object>> getAllUserByIdToMap();
    @MapKey("id")
    Map<String, Object> getAllUserByIdToMap();

    List<User> getUserByLike(@Param("mohu") String mohu);


}
