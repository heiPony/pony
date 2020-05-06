package com.pony.test.service;

import com.pony.test.dao.AdminDao;
import com.pony.test.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl  implements AdminService{

    @Autowired
    AdminDao dao;
    @Override
    public Admin get(String name) {
        return dao.get(name);
    }

    @Override
    public List<Admin> query() {
        return dao.query();
    }
}
