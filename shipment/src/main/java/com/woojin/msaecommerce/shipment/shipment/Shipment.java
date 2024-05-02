package com.woojin.msaecommerce.shipment.shipment;

import com.woojin.msaecommerce.shipment.shipment.dto.ShipmentCreateParam;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 배송. 상품의 이동
 */
@Getter
@Setter
@Builder
@ToString
public class Shipment {
    private Long id;

    private Long orderId;

    private LocalDateTime sentAt;

    private Date estimatedArrival;

    private Date actualArrival;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public static Shipment fromCreateParam(ShipmentCreateParam param, Long id) {
        return Shipment.builder()
                .id(id)
                .orderId(param.getOrderId())
                .build();
    }
}
