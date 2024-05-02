package com.woojin.msaecommerce.order.order;

import com.woojin.msaecommerce.order.common.dto.ApiResponse;
import com.woojin.msaecommerce.order.order.dto.OrderRequest;
import com.woojin.msaecommerce.order.order.dto.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ApiResponse<OrderResponse> createOrder(@RequestBody OrderRequest request) throws PulsarClientException {
        OrderResponse orderResponse = this.orderService.create(request);

        return ApiResponse.<OrderResponse>builder()
                .code(HttpStatus.OK.value())
                .data(orderResponse)
                .build();
    }
}
