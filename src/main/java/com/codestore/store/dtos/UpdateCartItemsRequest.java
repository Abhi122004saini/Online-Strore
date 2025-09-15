package com.codestore.store.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class UpdateCartItemsRequest {
    @NotNull(message = "Cart items are required")
    private List<CartItemUpdate> items;

    // Constructors
    public UpdateCartItemsRequest() {}

    public UpdateCartItemsRequest(List<CartItemUpdate> items) {
        this.items = items;
    }

    // Getters and Setters
    public List<CartItemUpdate> getItems() { return items; }
    public void setItems(List<CartItemUpdate> items) { this.items = items; }

    public static class CartItemUpdate {
        @NotNull(message = "Cart item ID is required")
        private Long cartItemId;

        @NotNull(message = "Quantity is required")
        @Min(value = 1, message = "Quantity must be at least 1")
        private Integer quantity;

        // Constructors
        public CartItemUpdate() {}

        public CartItemUpdate(Long cartItemId, Integer quantity) {
            this.cartItemId = cartItemId;
            this.quantity = quantity;
        }

        // Getters and Setters
        public Long getCartItemId() { return cartItemId; }
        public void setCartItemId(Long cartItemId) { this.cartItemId = cartItemId; }

        public Integer getQuantity() { return quantity; }
        public void setQuantity(Integer quantity) { this.quantity = quantity; }
    }
}
