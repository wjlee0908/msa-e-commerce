package com.woojin.msaecommerce.order.order.dto;

import com.woojin.msaecommerce.order.order.Order;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class OrderResponse {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer quantity;

    private LocalDateTime createdAt;

    public static OrderResponse fromEntity(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .userId(order.getUserId())
                .productId(order.getProductId())
                .quantity(order.getQuantity())
                .createdAt(order.getCreatedAt())
                .build();
    }
}
