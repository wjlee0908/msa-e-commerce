package com.woojin.msaecommerce.order.order.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest_Item {
    private Long productId;

    private Integer quantity;

    private Long productCouponId;
}
