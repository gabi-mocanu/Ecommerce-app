package com.ecom.app.Eccormerce.service.interf;

import com.ecom.app.Eccormerce.dto.OrderRequest;
import com.ecom.app.Eccormerce.dto.Response;
import com.ecom.app.Eccormerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
