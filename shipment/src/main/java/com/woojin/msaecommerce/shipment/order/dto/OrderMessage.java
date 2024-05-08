package com.woojin.msaecommerce.shipment.order.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@ToString
public class OrderMessage {
    private Long id;

    private Long customerId;

    private Long paymentId;

    private Long shipmentId;

    /**
     *  OrderItem - product 관계 테이블. 주문에 포함된 상품들의 종류와 개수.
     */
    private List<OrderMessage_Item> items;

    /**
     * OrderCoupon - 적용된 장바구니 쿠폰
     */
    private List<Long> coupons;

    private Integer totalPrice;

    private LocalDateTime orderDate;
}
