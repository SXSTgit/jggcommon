package com.zb.service;

import com.zb.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<User> getUserListByMap(Map<String,Object> param)throws Exception;
}
