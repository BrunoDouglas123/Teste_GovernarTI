package Teste.com.teste.DTO;

import java.sql.Time;

import Teste.com.teste.Model.Result;

public class ResultDTO {
	
	private Long id;
	private int number;
	private int grid;
	private int position;
	private int position_text;
	private int position_order;
	private int point;
	private String lap;
	private Time time;
	private String millisecond;
	private Time fastestlap;
	private int rank;
	private int fastestlaptime;
	private int fastestlapspeed;
	
	private StatusDTO status;
	private RaceDTO race;
	private DriverDTO driver;
	private ConstructorDTO constructor;
	
	public ResultDTO() {
	}

	public ResultDTO(Result entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.grid = entity.getGrid();
		this.position = entity.getPosition();
		this.position_text = entity.getPosition_text();
		this.position_order = entity.getPosition_order();
		this.point = entity.getPoint();
		this.lap = entity.getLap();
		this.time = entity.getTime();
		this.millisecond = entity.getMillisecond();
		this.fastestlap = entity.getFastestlap();
		this.rank = entity.getRank();
		this.fastestlaptime = entity.getFastestlaptime();
		this.fastestlapspeed = entity.getFastestlapspeed();
		this.status = new StatusDTO(entity.getStatus());
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

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}

	public RaceDTO getRace() {
		return race;
	}

	public void setRace(RaceDTO race) {
		this.race = race;
	}

	public DriverDTO getDriver() {
		return driver;
	}

	public void setDriver(DriverDTO driver) {
		this.driver = driver;
	}

	public ConstructorDTO getConstructor() {
		return constructor;
	}

	public void setConstructor(ConstructorDTO constructor) {
		this.constructor = constructor;
	}
}
