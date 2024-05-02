package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer quantity;

    private LocalDateTime createdAt;

    public static Order fromRequest(OrderRequest request, Long id) {
        return Order.builder()
                .id(id)
                .userId(request.getUserId())
                .productId(request.getProductId())
                .quantity(request.getQuantity())
                .build();
    }
}
