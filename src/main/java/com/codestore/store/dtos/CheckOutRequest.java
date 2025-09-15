package com.codestore.store.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CheckOutRequest {
    @NotBlank(message = "Shipping address is required")
    private String shippingAddress;

    @NotBlank(message = "Payment method is required")
    private String paymentMethod;

    @NotNull(message = "Cart ID is required")
    private Long cartId;

    // Constructors
    public CheckOutRequest() {}

    public CheckOutRequest(String shippingAddress, String paymentMethod, Long cartId) {
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.cartId = cartId;
    }

    // Getters and Setters
    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public Long getCartId() { return cartId; }
    public void setCartId(Long cartId) { this.cartId = cartId; }
}
