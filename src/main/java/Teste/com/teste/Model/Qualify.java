package Teste.com.teste.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qualify")
public class Qualify {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number", length = 45, nullable = false)
	private int number;
	
	@Column(name = "position", length = 45, nullable = false)
	private int position;
	
	@Column(name = "q1", length = 45, nullable = false)
	private String q1;
	
	@Column(name = "q2", length = 45, nullable = false)
	private String q2;
	
	@Column(name = "q3", length = 45, nullable = false)
	private String q3;
	
	@ManyToOne
	@JoinColumn(name = "id_race")
	private Race race;
	
	@ManyToOne
	@JoinColumn(name = "id_driver")
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name = "id_constructor")
	private Constructor constructor;
	
	public Qualify() {		
	}

	public Qualify(Long id, int number, int position, String q1, String q2, String q3, Race race, Driver driver,
			Constructor constructor) {
		super();
		this.id = id;
		this.number = number;
		this.position = position;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.race = race;
		this.driver = driver;
		this.constructor = constructor;
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

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Constructor getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}
}
