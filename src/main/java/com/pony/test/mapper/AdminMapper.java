package com.pony.test.mapper;

import com.pony.test.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface AdminMapper {

    Admin get(String name);
    List<Admin> query();
}
