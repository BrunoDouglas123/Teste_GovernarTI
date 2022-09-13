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
@Table(name = "constructorresult")
public class ConstructorResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "point", length = 45, nullable = false)
	private String point;
	
	@Column(name = "status", length = 45, nullable = false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "id_race")
	private Race race;
	
	@ManyToOne
	@JoinColumn(name = "id_constructor")
	private Constructor constructor;
	
	public ConstructorResult() {		
	}

	public ConstructorResult(Long id, String point, String status, Race race, Constructor constructor) {
		this.id = id;
		this.point = point;
		this.status = status;
		this.race = race;
		this.constructor = constructor;
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

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Constructor getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}
}
