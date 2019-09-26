package com.zb.mapper;
import com.zb.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

	public Admin getAdminLogin(@Param(value = "loginName") String loginName, @Param(value = "passWord") String passWord);


}
