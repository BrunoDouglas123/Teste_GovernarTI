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
@Table(name = "result")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "number", length = 45, nullable = false)
	private int number;
	
	@Column(name = "grid", length = 45, nullable = false)
	private int grid;
	
	@Column(name = "position", length = 45, nullable = false)
	private int position;
	
	@Column(name = "position_text", length = 45, nullable = false)
	private int position_text;
	
	@Column(name = "position_order", length = 45, nullable = false)
	private int position_order;
	
	@Column(name = "point", length = 45, nullable = false)
	private int point;
	
	@Column(name = "lap", length = 45, nullable = false)
	private String lap;
	
	@Column(name = "time", length = 45, nullable = false)
	private Time time;
	
	@Column(name = "millisecond", length = 45, nullable = false)
	private String millisecond;
	
	@Column(name = "fastestlap", length = 45, nullable = false)
	private Time fastestlap;
	
	@Column(name = "rank", length = 45, nullable = false)
	private int rank;
	
	@Column(name = "fastestlaptime", length = 45, nullable = false)
	private int fastestlaptime;
	
	@Column(name = "fastestlapspeed", length = 45, nullable = false)
	private int fastestlapspeed;
	
	@ManyToOne
	@JoinColumn(name = "id_status")
	private Status status;

	@ManyToOne
	@JoinColumn(name = "id_race")
	private Race race;
	
	@ManyToOne
	@JoinColumn(name = "id_driver")
	private Driver driver;
	
	@ManyToOne
	@JoinColumn(name = "id_constructor")
	private Constructor constructor;
	
	public Result() {		
	}

	public Result(Long id, int number, int grid, int position, int position_text, int position_order, int point,
			String lap, Time time, String millisecond, Time fastestlap, int rank, int fastestlaptime,
			int fastestlapspeed, Status status, Race race, Driver driver, Constructor constructor) {
		this.id = id;
		this.number = number;
		this.grid = grid;
		this.position = position;
		this.position_text = position_text;
		this.position_order = position_order;
		this.point = point;
		this.lap = lap;
		this.time = time;
		this.millisecond = millisecond;
		this.fastestlap = fastestlap;
		this.rank = rank;
		this.fastestlaptime = fastestlaptime;
		this.fastestlapspeed = fastestlapspeed;
		this.status = status;
		this.race = race;
		this.driver = driver;
		this.constructor = constructor;
	}

	public Result(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Result(long l, String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8, String string9, String string10, String string11, String string12,
			String string13) {
		// TODO Auto-generated constructor stub
	}

	public Result(String string) {
		// TODO Auto-generated constructor stub
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

	public int getGrid() {
		return grid;
	}

	public void setGrid(int grid) {
		this.grid = grid;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition_text() {
		return position_text;
	}

	public void setPosition_text(int position_text) {
		this.position_text = position_text;
	}

	public int getPosition_order() {
		return position_order;
	}

	public void setPosition_order(int position_order) {
		this.position_order = position_order;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getLap() {
		return lap;
	}

	public void setLap(String lap) {
		this.lap = lap;
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

	public Time getFastestlap() {
		return fastestlap;
	}

	public void setFastestlap(Time fastestlap) {
		this.fastestlap = fastestlap;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getFastestlaptime() {
		return fastestlaptime;
	}

	public void setFastestlaptime(int fastestlaptime) {
		this.fastestlaptime = fastestlaptime;
	}

	public int getFastestlapspeed() {
		return fastestlapspeed;
	}

	public void setFastestlapspeed(int fastestlapspeed) {
		this.fastestlapspeed = fastestlapspeed;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public static void add(Result rst1) {
		// TODO Auto-generated method stub
		
	}

	public Result statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}
}
