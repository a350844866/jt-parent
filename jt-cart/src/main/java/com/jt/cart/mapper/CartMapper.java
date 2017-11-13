package com.jt.cart.mapper;

import com.jt.cart.pojo.Cart;
import com.jt.common.mapper.SysMapper;

public interface CartMapper extends SysMapper<Cart> {
    void updateCartByUserIdAndItemId(Cart cart);
}
