package Teste.com.teste.DTO;

import java.sql.Time;

import Teste.com.teste.Model.PitStop;

public class PitStopDTO {
	
	private Long id;
	private int lap;
	private Time time;
	private String duration;
	private String millisecond;
	
	private DriverDTO driver;
	
	public PitStopDTO() {
	}

	public PitStopDTO(PitStop entity) {
		this.id = entity.getId();
		this.lap = entity.getLap();
		this.time = entity.getTime();
		this.duration = entity.getDuration();
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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
