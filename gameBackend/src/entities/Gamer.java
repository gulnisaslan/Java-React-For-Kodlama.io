package entities;

import abstracts.Entity;

public class Gamer implements Entity{
	
	private int id;
	private long nationalId;
	private String gamerName;
	private String gamerSurname;
	private int birthYear;
	
	public Gamer() {
		// TODO Auto-generated constructor stub
	}

	public Gamer(int id, long nationalId, String gamerName, String gamerSurname, int birthYear) {
		super();
		this.id = id;
		this.nationalId = nationalId;
		this.gamerName = gamerName;
		this.gamerSurname = gamerSurname;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNationalId() {
		return nationalId;
	}

	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public String getGamerSurname() {
		return gamerSurname;
	}

	public void setGamerSurname(String gamerSurname) {
		this.gamerSurname = gamerSurname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	

}
