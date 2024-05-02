package com.woojin.msaecommerce.shipment.order;

import com.woojin.msaecommerce.shipment.order.dto.OrderMessage;
import com.woojin.msaecommerce.shipment.shipment.ShipmentService;
import com.woojin.msaecommerce.shipment.shipment.dto.ShipmentCreateParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.pulsar.annotation.PulsarListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderConsumer {
    private static final String SUBSCRIPTION_NAME = "shipment-order-sub";
    private static final String TOPIC_NAME = "order-topic";

    private final ShipmentService shipmentService;

    /**
     * Async 이용 멀티스레딩.
     * 기본 설정은 같은 스레드로 처리하여 이전 consume이 끝날 때 까지 대기함
     */
    @PulsarListener(subscriptionName = SUBSCRIPTION_NAME, topics = TOPIC_NAME)
    @Async
    void listenCreated(OrderMessage message) throws InterruptedException {
        log.trace("OrderConsumer.listenCreated::" + Thread.currentThread().getName());
        log.trace("OrderConsumer.listenCreated::" + message.toString());

        // Async 테스트를 위해 5초가 걸리게 설정함
        Thread.sleep(5000);

        shipmentService.create(ShipmentCreateParam.fromOrderMessage(message));
        log.trace("OrderConsumer.listenCreated::" + Thread.currentThread().getName() + "create finished" );
    }
}
