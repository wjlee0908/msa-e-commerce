package com.woojin.msaecommerce.shipment.shipment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 배송. 상품의 이동
 */
@Getter
@Setter
@Builder
public class Shipment {
    private Long id;

    private Long orderId;

    private LocalDateTime sentAt;

    private Date estimatedArrival;

    private Date actualArrival;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
