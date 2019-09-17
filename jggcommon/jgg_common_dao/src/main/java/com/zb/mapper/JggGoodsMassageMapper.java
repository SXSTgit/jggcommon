package com.zb.mapper;
import com.zb.pojo.JggGoodsMassage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JggGoodsMassageMapper {

	public JggGoodsMassage getJggGoodsMassageById(@Param(value = "id") Long id)throws Exception;

	public List<JggGoodsMassage>	getJggGoodsMassageListByMap(Map<String,Object> param)throws Exception;

	public Integer getJggGoodsMassageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertJggGoodsMassage(JggGoodsMassage jggGoodsMassage)throws Exception;

	public Integer updateJggGoodsMassage(JggGoodsMassage jggGoodsMassage)throws Exception;

	public Integer deleteJggGoodsMassageById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteJggGoodsMassage(Map<String,List<String>> params);

}
