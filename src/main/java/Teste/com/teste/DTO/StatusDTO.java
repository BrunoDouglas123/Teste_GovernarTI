package Teste.com.teste.DTO;

import Teste.com.teste.Model.Status;

public class StatusDTO {
	
	private Long id;
	private String status;
	
	public StatusDTO() {		
	}

	public StatusDTO(Status entity) {
		this.id = entity.getId();
		this.status = entity.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
