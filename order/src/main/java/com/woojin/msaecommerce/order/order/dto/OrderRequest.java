package com.woojin.msaecommerce.order.order.dto;

import lombok.Getter;

@Getter
public class OrderRequest {
    private Long userId;

    private Long productId;

    private Integer quantity;
}
