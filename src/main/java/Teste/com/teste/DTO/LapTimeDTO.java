package Teste.com.teste.DTO;

import java.sql.Time;

import Teste.com.teste.Model.LapTime;

public class LapTimeDTO {
	
	private Long id;
	private int lap;
	private int position;
	private Time time;
	private String millisecond;
	
	private DriverDTO driver;
	

	public LapTimeDTO() {		
	}
	
	public LapTimeDTO(LapTime entity) {
		this.id = entity.getId();
		this.lap = entity.getLap();
		this.position = entity.getPosition();
		this.time = entity.getTime();
		this.millisecond = entity.getMillisecond();
		this.driver = new DriverDTO(entity.getDriver());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLap() {
		return lap;
	}

	public void setLap(int lap) {
		this.lap = lap;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getMillisecond() {
		return millisecond;
	}

	public void setMillisecond(String millisecond) {
		this.millisecond = millisecond;
	}

	public DriverDTO getDriver() {
		return driver;
	}

	public void setDriver(DriverDTO driver) {
		this.driver = driver;
	}
}
