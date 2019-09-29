package com.zb.mapper;
import com.zb.pojo.Cart;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {

	public Cart getCartById(@Param(value = "id") String  id)throws Exception;

	public List<Cart>	getCartListByuserId(@Param("userId") Integer userId)throws Exception;


	public Integer insertCart(Cart cart)throws Exception;

	public Integer updateCart(Cart cart)throws Exception;

	public Integer deleteCartById(@Param(value = "id") Long id)throws Exception;



}
