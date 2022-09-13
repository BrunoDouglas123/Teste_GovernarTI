package Teste.com.teste.Model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pitstop")
public class PitStop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number", length = 45, nullable = false)
	private int lap;
	
	@Column(name = "time", length = 45, nullable = false)
	private Time time;
	
	@Column(name = "position", length = 45, nullable = false)
	private String duration;
	
	@Column(name = "millisecond", length = 45, nullable = false)
	private String millisecond;
	
	@ManyToOne
	@JoinColumn(name = "id_driver")
	private Driver driver;
	
	public PitStop() {		
	}

	public PitStop(Long id, int lap, Time time, String duration, String millisecond, Driver driver) {
		this.id = id;
		this.lap = lap;
		this.time = time;
		this.duration = duration;
		this.millisecond = millisecond;
		this.driver = driver;
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

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
