package com.pony.test.dao;

import com.pony.test.mapper.AdminMapper;
import com.pony.test.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private AdminMapper mapper;
    @Override
    public Admin get(String name) {
        return mapper.get(name);
    }

    @Override
    public List<Admin> query() {

        return mapper.query();
    }


}
