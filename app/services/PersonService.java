package services;

import java.util.List;
import java.util.ArrayList;

import models.Person;

public class PersonService {

	private final List<Person> people;
	
	public PersonService() {
		people = new ArrayList<Person>();
		
		addSeedData();
	}

	public List<Person> getAll() {
		return people;
	}
	
	public Person getById(int id) {
		Person person = null;
		
		for (Person _person : people) {
			if (_person.getId() == id) {
				person = _person;
				break;
			}
		}
		
		return person;
	}
	
	public List<Person> getBySurname(String surname) {
		
		List<Person> peopleWithSurname = new ArrayList<Person>();
		
		for (Person _person : people) {
			if (_person.getSurname().equalsIgnoreCase(surname)) {
				peopleWithSurname.add(_person);
			}
		}
		
		return peopleWithSurname;
	}
	
	private void addSeedData() {
	
		String[][] peopleArray = { 
			{"1", "Garner", "Paul John", "M" },
			{"2", "Garner", "Frederick John", "M" },
			{"3", "Garner", "Frederick", "M" },
			{"4", "Garner", "Amos", "M" },
			{"5", "Garner", "William", "M" },
			{"6", "Garner", "William", "M" },
			{"7", "Garner", "John", "M" },
			{"8", "Odell", "Brenda Margaret", "F" },
			{"9", "Jennings", "Nicola", "F" }
		};
		
		for (String[] personArray : peopleArray) {
			Person person = new Person();
			
			person.setId(Integer.parseInt(personArray[0]));
			person.setSurname(personArray[1]);
			person.setForenames(personArray[2]);
			person.setGender(personArray[3]);
			
			people.add(person);
		}
		
	}	
}