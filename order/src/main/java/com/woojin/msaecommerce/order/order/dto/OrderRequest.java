package com.woojin.msaecommerce.order.order.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class OrderRequest {
    private Long customerId;

    private List<OrderRequest_Item> items;
}
