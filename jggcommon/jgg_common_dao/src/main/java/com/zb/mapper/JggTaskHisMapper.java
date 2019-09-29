package com.zb.mapper;
import com.zb.pojo.JggTaskHis;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JggTaskHisMapper {

	public JggTaskHis getJggTaskHisById(@Param(value = "id") Long id)throws Exception;

	public List<JggTaskHis>	getJggTaskHisListByMap(Map<String,Object> param)throws Exception;

	public Integer getJggTaskHisCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertJggTaskHis(JggTaskHis jggTaskHis)throws Exception;

	public Integer updateJggTaskHis(JggTaskHis jggTaskHis)throws Exception;

	public Integer deleteJggTaskHisById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteJggTaskHis(Map<String,List<String>> params);

}
