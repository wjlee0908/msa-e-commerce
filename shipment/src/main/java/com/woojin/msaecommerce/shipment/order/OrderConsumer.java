package com.woojin.msaecommerce.shipment.order;

import com.woojin.msaecommerce.shipment.order.dto.OrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {
    private static final String SUBSCRIPTION_NAME = "shipment-order-sub";
    private static final String TOPIC_NAME = "order-topic";

    @PulsarListener(subscriptionName = SUBSCRIPTION_NAME, topics = TOPIC_NAME)
    void listenCreated(OrderMessage message) {
        log.trace("OrderConsumer::" + message.toString());
    }
}
