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
@Table(name = "laptime")
public class LapTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number", length = 45, nullable = false)
	private int lap;
	
	@Column(name = "position", length = 45, nullable = false)
	private int position;
	
	@Column(name = "time", length = 45, nullable = false)
	private Time time;
	
	@Column(name = "millisecond", length = 45, nullable = false)
	private String millisecond;
	
	@ManyToOne
	@JoinColumn(name = "id_driver")
	private Driver driver;
	
	public LapTime() {		
	}

	public LapTime(Long id, int lap, int position, Time time, String millisecond, Driver driver) {
		this.id = id;
		this.lap = lap;
		this.position = position;
		this.time = time;
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

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
