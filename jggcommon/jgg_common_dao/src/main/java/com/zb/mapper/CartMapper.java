package com.zb.mapper;
import com.zb.pojo.Cart;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {

	public Cart getCartById(@Param(value = "id") Long id)throws Exception;

	public List<Cart>	getCartListByMap(Map<String,Object> param)throws Exception;

	public Integer getCartCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCart(Cart cart)throws Exception;

	public Integer updateCart(Cart cart)throws Exception;

	public Integer deleteCartById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCart(Map<String,List<String>> params);

}
