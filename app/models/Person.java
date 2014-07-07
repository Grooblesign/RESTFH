package models;

public class Person {
	private int id;
	private String forenames;
	private String surname;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int value) {
		id = value;
	}
	public String getForenames() {
		return forenames;
	}
	public void setForenames(String value) {
		forenames = value;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String value) {
		surname = value;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String value) {
		gender = value;
	}
}