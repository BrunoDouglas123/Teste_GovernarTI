package Teste.com.teste.DTO;

import Teste.com.teste.Model.ConstructorResult;

public class ConstructorResultDTO {
	
	private Long id;
	private String point;
	private String status;

	private RaceDTO race;
	private ConstructorDTO constructor;
	
	public ConstructorResultDTO() {		
	}

	public ConstructorResultDTO(ConstructorResult entity) {
		this.id = entity.getId();
		this.point = entity.getPoint();
		this.status = entity.getStatus();
		this.race = new RaceDTO(entity.getRace());
		this.constructor = new ConstructorDTO (entity.getConstructor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RaceDTO getRaceDTO() {
		return race;
	}

	public void setRaceDTO(RaceDTO race) {
		this.race = race;
	}

	public ConstructorDTO getConstructorDTO() {
		return constructor;
	}

	public void setConstructorDTO(ConstructorDTO constructor) {
		this.constructor = constructor;
	}
}
