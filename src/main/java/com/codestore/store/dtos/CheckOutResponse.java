package com.codestore.store.dtos;

import com.codestore.store.entities.OrderStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CheckOutResponse {
    private Long orderId;
    private OrderStatus status;
    private BigDecimal totalAmount;
    private String shippingAddress;
    private String paymentMethod;
    private LocalDateTime createdAt;
    private String message;

    // Constructors
    public CheckOutResponse() {}

    public CheckOutResponse(Long orderId, OrderStatus status, BigDecimal totalAmount, String shippingAddress, String paymentMethod, LocalDateTime createdAt, String message) {
        this.orderId = orderId;
        this.status = status;
        this.totalAmount = totalAmount;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.createdAt = createdAt;
        this.message = message;
    }

    // Getters and Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
