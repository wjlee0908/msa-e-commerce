package com.woojin.msaecommerce.shipment.order.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
public class OrderMessage {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer quantity;

    private LocalDateTime createdAt;
}
