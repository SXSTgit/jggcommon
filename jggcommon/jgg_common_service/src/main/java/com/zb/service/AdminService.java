package com.zb.service;

import com.zb.pojo.Admin;

import java.util.List;
import java.util.Map;

public interface AdminService {

    public List<Admin> getAdminListByMap(Map<String,Object> param)throws Exception;

}
