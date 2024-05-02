package com.woojin.msaecommerce.shipment.shipment.dto;

import com.woojin.msaecommerce.shipment.order.dto.OrderMessage;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ShipmentCreateParam {
    private Long orderId;

    public static ShipmentCreateParam fromOrderMessage(OrderMessage orderMessage) {
        return ShipmentCreateParam.builder()
                .orderId(orderMessage.getId())
                .build();
    }
}
