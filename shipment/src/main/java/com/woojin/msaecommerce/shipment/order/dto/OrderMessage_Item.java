package com.woojin.msaecommerce.shipment.order.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderMessage_Item {
    private Long id;

    private Long productId;

    private Integer quantity;

    private Long productCouponId;
}
