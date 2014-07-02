package models;

public class Person {
	private int id;
	private String forenames;
	private String surname;
	
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
}