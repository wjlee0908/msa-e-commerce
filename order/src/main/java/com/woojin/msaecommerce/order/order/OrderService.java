package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.order.dto.OrderMessage;
import com.woojin.msaecommerce.order.order.dto.OrderRequest;
import com.woojin.msaecommerce.order.order.dto.OrderResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private static final String ORDER_TOPIC = "order-topic";

    @Autowired
    private final PulsarTemplate<OrderMessage> pulsarTemplate;

    public OrderResponse create(OrderRequest request) throws PulsarClientException {
        log.debug("create order");

        // 결제 검증
        // 결제 서비스에 요청

        // 주문 생성
        Order order = Order.fromRequest(request, Long.valueOf(1));

        // 주문 생성 이벤트 전파
        OrderMessage orderMessage = OrderMessage.fromEntity(order);
        pulsarTemplate.send(ORDER_TOPIC, orderMessage);

        return OrderResponse.fromEntity(order);
    }
}
