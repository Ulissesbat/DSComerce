package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrderItemDto {

	private Long product;
	private String name;
	private Double price;
	private Integer quantity;
	
	public OrderItemDto(Long product, String name, Double price, Integer quantity) {
		this.product = product;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public OrderItemDto(OrderItem entity) {
		product = entity.getProduct().getId();
		name = entity.getProduct().getName();
		price = entity.getPrice();
		quantity = entity.getQuantity();
	}

	public Long getProduct() {
		return product;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public Double getSubTotal() {
		return price * quantity;
	}
}
