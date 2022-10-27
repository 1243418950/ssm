package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SelectMapperTest {
    @Test
    public void getUserById() throws IOException {
        SelectMapper sm= SqlSessionUtils.getSqlSession("mybatis-config.xml",true).getMapper(SelectMapper.class);
        List<User> u1= sm.getUserByLike("r");
        u1.forEach(u->{
            System.out.println(u);
        });
//        System.out.println(u1);


    }

}
