package com.example.demo.model.dto;

import java.util.List;

public record OrderResponse(
        String orderId,
        String customerName,
        String email,
        String status,
        java.time.LocalDateTime orderDate,
        List<OrderItemResponse> items
) {
}
