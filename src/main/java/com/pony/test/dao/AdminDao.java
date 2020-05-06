package com.pony.test.dao;

import com.pony.test.pojo.Admin;

import java.util.List;

public interface AdminDao {
    Admin get(String name);
    List<Admin> query();
}
