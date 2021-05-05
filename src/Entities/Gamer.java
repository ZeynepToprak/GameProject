package Entities;

import Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	private String firtName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firtName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String string) {
		this.nationalityId = string;
	}

	
	
}
