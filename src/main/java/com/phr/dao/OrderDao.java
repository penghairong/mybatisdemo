package com.phr.dao;

import com.phr.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface OrderDao {
    @Select("select * from user")
    public List<User> query();
}
