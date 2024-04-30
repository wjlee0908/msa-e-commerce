package com.woojin.msaecommerce.shipment;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 상품 출하 서비스.
 * 상품을 창고에서 출고해서 다른 목적지로 발송합니다.
 */
@Service
public class ShipmentService {
    /**
     * 배송 요청 이벤트 Consumer
     * Multithreading 활용 비동기 처리
     */
    @Async
    public void processDeliveryRequest(String order) {
        System.out.println("배송 요청 처리: " + order + " | Thread: " + Thread.currentThread().getName());

        for(int i=0; i<10; i++) {
            System.out.println(order + " " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (Exception err) {
                System.out.println(err);
            }
        }
    }
}
