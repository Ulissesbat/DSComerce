package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClientDto {

	private Long id;
	private String Name;
	
	public ClientDto(Long id, String name) {
		this.id = id;
		this.Name = name;
	}
	
	public ClientDto(User entity) {
		id = entity.getId();
		Name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return Name;
	}
	
}
