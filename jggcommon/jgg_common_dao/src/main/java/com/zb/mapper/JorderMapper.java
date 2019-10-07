package com.zb.mapper;
import com.zb.pojo.Jorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JorderMapper {

	public Jorder getJorderById(@Param(value = "userId") String userId ,
                                @Param(value = "orderNo")String orderNo)throws Exception;

	public List<Jorder>	getJorderListByMap(Map<String,Object> param)throws Exception;

	public Integer getJorderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertJorder(Jorder jorder)throws Exception;

	public Integer updateJorder(Jorder jorder)throws Exception;


}
