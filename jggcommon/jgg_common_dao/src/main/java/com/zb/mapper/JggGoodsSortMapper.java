package com.zb.mapper;
import com.zb.pojo.JggGoodsSort;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JggGoodsSortMapper {

	public JggGoodsSort getJggGoodsSortById(@Param(value = "id") Long id)throws Exception;

	public List<JggGoodsSort>	getJggGoodsSortListByMap(Map<String,Object> param)throws Exception;

	public Integer getJggGoodsSortCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertJggGoodsSort(JggGoodsSort jggGoodsSort)throws Exception;

	public Integer updateJggGoodsSort(JggGoodsSort jggGoodsSort)throws Exception;

	public Integer deleteJggGoodsSortById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteJggGoodsSort(Map<String,List<String>> params);

}
