package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    public static Order fromRequest(OrderRequest request, Long id) {
        return Order.builder()
                .id(id)
                .userId(request.getUserId())
                .productId(request.getProductId())
                .build();
    }
}
