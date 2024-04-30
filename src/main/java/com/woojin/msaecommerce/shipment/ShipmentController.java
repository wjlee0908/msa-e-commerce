package com.woojin.msaecommerce.shipment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/shipments")
@RequiredArgsConstructor
public class ShipmentController {
    private final ShipmentService shipmentService;

    @PostMapping
    public void testDeliveryRequest() {
        shipmentService.processDeliveryRequest("order1");
        shipmentService.processDeliveryRequest("order2");
        shipmentService.processDeliveryRequest("order3");
        shipmentService.processDeliveryRequest("order4");
    }
}
