package Teste.com.teste.DTO;

import Teste.com.teste.Model.Qualify;

public class QualifyDTO {
	
	private Long id;
	private int number;
	private int position;
	private String q1;
	private String q2;
	private String q3;
	
	private RaceDTO race;
	private DriverDTO driver;
	private ConstructorDTO constructor;

	public QualifyDTO() {		
	}

	public QualifyDTO(Qualify entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.position = entity.getPosition();
		this.q1 = entity.getQ1();
		this.q2 = entity.getQ2();
		this.q3 = entity.getQ3();
		this.race = new RaceDTO(entity.getRace());
		this.driver = new DriverDTO(entity.getDriver());
		this.constructor = new ConstructorDTO(entity.getConstructor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
	}

	public RaceDTO getRaceDTO() {
		return race;
	}

	public void setRaceDTO(RaceDTO race) {
		this.race = race;
	}

	public DriverDTO getDriverDTO() {
		return driver;
	}

	public void setDriverDTO(DriverDTO driver) {
		this.driver = driver;
	}

	public ConstructorDTO getConstructorDTO() {
		return constructor;
	}

	public void setConstructorDTO(ConstructorDTO constructor) {
		this.constructor = constructor;
	}
}
