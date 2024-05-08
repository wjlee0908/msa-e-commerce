package com.woojin.msaecommerce.order.order.dto;

import com.woojin.msaecommerce.order.order.Order;
import com.woojin.msaecommerce.order.order.OrderItem;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class OrderResponse {
    private Long id;

    private Long customerId;

    private Long paymentId;

    private Long shipmentId;

    /**
     *  OrderItem - product 관계 테이블. 주문에 포함된 상품들의 종류와 개수.
     */
    private List<OrderResponse_Item> items;

    /**
     * OrderCoupon - 적용된 장바구니 쿠폰
     */
    private List<Long> coupons;

    private Integer totalPrice;

    private LocalDateTime orderDate;

    public static OrderResponse fromEntity(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .customerId(order.getCustomerId())
                .paymentId(order.getPaymentId())
                .shipmentId(order.getShipmentId())
                .items(order.getItems().stream().map(
                        item -> OrderResponse_Item.fromOrderItem(item)
                ).collect(Collectors.toList())
                )
                .coupons(order.getCoupons())
                .totalPrice(order.getTotalPrice())
                .orderDate(order.getOrderDate())
                .build();
    }
}
