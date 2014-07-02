package controllers;

import java.util.ArrayList;
import java.util.List;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;

import models.Person;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	
	public static Result people() {
		response().setContentType("application/json");

		List<Person> people = new ArrayList<Person>();
		
		Person person = new Person();
		person.setId(1);
		person.setForenames("Paul John");
		person.setSurname("Garner");
		
		people.add(person);
		
		person = new Person();
		person.setId(2);
		person.setForenames("Frederick John");
		person.setSurname("Garner");
		
		people.add(person);

		person = new Person();
		person.setId(3);
		person.setForenames("Frederick");
		person.setSurname("Garner");
		
		people.add(person);

		person = new Person();
		person.setId(4);
		person.setForenames("Amos");
		person.setSurname("Garner");
		
		people.add(person);

		person = new Person();
		person.setId(5);
		person.setForenames("William");
		person.setSurname("Garner");
		
		people.add(person);

		person = new Person();
		person.setId(6);
		person.setForenames("William");
		person.setSurname("Garner");
		
		people.add(person);

		Json json = new Json();
		return ok(json.toJson(people));
	}
}
