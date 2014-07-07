package controllers;

import java.util.List;

import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;

import models.Person;
import services.PersonService;

public class Application extends Controller {

	private static Json json = new Json();
	
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
	
	public static Result people() {
	    Logger.info("method: people");

		PersonService personService = new PersonService();
		
		List<Person> people = personService.getAll();
		
		response().setHeader("Access-Control-Allow-Origin", "*");
		response().setContentType("application/json");

		return ok(json.toJson(people));
	}
	
	public static Result personById(int id) {
	    Logger.info("method: personById");

		PersonService personService = new PersonService();

		Person person = personService.getById(id);
		
		if (person == null) {
			return notFound(String.format("A person with id %s was not found", id));
		} else {
			response().setHeader("Access-Control-Allow-Origin", "*");
			response().setContentType("application/json");

			return ok(json.toJson(person));
		}
	}
	
	public static Result peopleBySurname(String surname) {
	    Logger.info("method: peopleBySurname");

		PersonService personService = new PersonService();

		List<Person> people = personService.getBySurname(surname);
		
		response().setHeader("Access-Control-Allow-Origin", "*");
		response().setContentType("application/json");

		return ok(json.toJson(people));
	}
}
