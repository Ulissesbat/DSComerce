package com.devsuperior.dscommerce.dto;

import java.time.Instant;

import com.devsuperior.dscommerce.entities.Payment;

public class PaymentDto {

	private Long id;
	private Instant moment;
	
	public PaymentDto(Long id, Instant moment) {
		this.id = id;
		this.moment = moment;
	}
	
	public PaymentDto(Payment entity) {
		id = entity.getId();
		moment = entity.getMoment();
	}

	public Long getId() {
		return id;
	}

	public Instant getMoment() {
		return moment;
	}
}
