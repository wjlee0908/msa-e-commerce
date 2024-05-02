package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderMessage;
import lombok.RequiredArgsConstructor;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProducer {
    private static final String ORDER_TOPIC = "order-topic";

    @Autowired
    private final PulsarTemplate<OrderMessage> pulsarTemplate;

    public void sendAsync(Order order) throws PulsarClientException {
        OrderMessage orderMessage = OrderMessage.fromEntity(order);
        pulsarTemplate.sendAsync(ORDER_TOPIC, orderMessage);
    }
}
