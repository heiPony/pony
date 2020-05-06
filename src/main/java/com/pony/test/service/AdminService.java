package com.pony.test.service;

import com.pony.test.pojo.Admin;

import java.util.List;

public interface AdminService {

    Admin get(String name);
    List<Admin> query();
}
