package com.zb.mapper;

import com.zb.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {

	public Integer insertGoods(Goods goods)throws Exception;

}
