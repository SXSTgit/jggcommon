package com.zb.service.impl;

import com.zb.mapper.AdminMapper;
import com.zb.pojo.Admin;
import com.zb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> getAdminListByMap(Map<String, Object> param) throws Exception {
        return adminMapper.getAdminListByMap(param);
    }
}
