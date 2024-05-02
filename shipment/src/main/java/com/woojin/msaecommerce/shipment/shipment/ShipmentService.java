package com.woojin.msaecommerce.shipment.shipment;

import com.woojin.msaecommerce.shipment.shipment.dto.ShipmentCreateParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShipmentService {
    public Shipment create(ShipmentCreateParam param) {
        Shipment shipment = Shipment.fromCreateParam(param, Long.valueOf(1));

        log.trace("ShipmentService.create::" + shipment.toString());

        return shipment;
    }
}
