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
@Table(name = "constructorstanding")
public class ConstructorStanding {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "point", length = 45, nullable = false)
	private String point;
	
	@Column(name = "position", length = 45, nullable = false)
	private String position;
	
	@Column(name = "positiontext", length = 45, nullable = false)
	private int positiontext;
	
	@Column(name = "win", length = 45, nullable = false)
	private int win;
	
	@ManyToOne
	@JoinColumn(name = "id_race")
	private Race race;
	
	@ManyToOne
	@JoinColumn(name = "id_constructor")
	private Constructor constructor;
	
	public ConstructorStanding() {		
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
