package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class Order {
    private Long id;

    private Long customerId;

    private Long paymentId;

    private Long shipmentId;

    /**
     *  OrderItem - product 관계 테이블. 주문에 포함된 상품들의 종류와 개수.
     */
    private List<OrderItem> items;

    /**
     * OrderCoupon - 적용된 장바구니 쿠폰
     */
    private List<Long> coupons;

    private Integer totalPrice;

    private LocalDateTime orderDate;

    public static Order fromRequest(OrderRequest request, Long id) {
        return Order.builder()
                .id(id)
                .customerId(request.getCustomerId())
                .items(request.getItems().stream().map(
                        item -> OrderItem.fromOrderRequest(item)
                        ).collect(Collectors.toList()))
                .totalPrice(0)
                .orderDate(LocalDateTime.now())
                .build();
    }
}
