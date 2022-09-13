package Teste.com.teste.DTO;

import Teste.com.teste.Model.ConstructorStanding;

public class ConstructorStandingDTO {
	
	private Long id;
	private String point;
	private String position;
	private int positiontext;
	private int win;

	private RaceDTO race;
	private ConstructorDTO constructor;
	
	public ConstructorStandingDTO() {		
	}

	public ConstructorStandingDTO(ConstructorStanding entity) {
		this.id = entity.getId();
		this.point = entity.getPoint();
		this.position = entity.getPosition();
		this.positiontext = entity.getPositiontext();
		this.win = entity.getWin();
		this.race = new RaceDTO(entity.getRace());
		this.constructor = new ConstructorDTO(entity.getConstructor());
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPositiontext() {
		return positiontext;
	}

	public void setPositiontext(int positiontext) {
		this.positiontext = positiontext;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public RaceDTO getRace() {
		return race;
	}

	public void setRace(RaceDTO race) {
		this.race = race;
	}

	public ConstructorDTO getConstructor() {
		return constructor;
	}

	public void setConstructor(ConstructorDTO constructor) {
		this.constructor = constructor;
	}
}
