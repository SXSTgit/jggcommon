package com.zb.mapper;

import com.zb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

	//登陆
	public User getUser(@Param(value = "phone") String phone, @Param(value = "password") String password)throws Exception;

	//注册
	public int addUser(User user)throws Exception;

}
