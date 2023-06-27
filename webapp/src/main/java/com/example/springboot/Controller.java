package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtworks.xstream.XStream;

@RestController
public class Controller {

	public static interface Contact {

		public Integer getId();
		public void setId(Integer id);
		public String getFirstName();
		public void setFirstName(String firstName);
		public String getLastName();
		public void setLastName(String lastName);
		public String getEmail();
		public void setEmail(String email);
	}

	public static class ContactImpl implements Contact {
		private Integer id;
		private String firstName;
		private String lastName;
		private String email;

		public Integer getId(){ return id; }
		public void setId(Integer id){ this.id = id; }
		public String getFirstName(){ return firstName; }
		public void setFirstName(String firstName){ this.firstName = firstName; }
		public String getLastName(){ return lastName; }
		public void setLastName(String lastName){ this.lastName = lastName; }
		public String getEmail(){ return email; }
		public void setEmail(String email){ this.email = email; }
	}

	@GetMapping("/contacts/create")
	public String create(String serializedContact) {
		XStream xstream = new XStream();
		xstream.setClassLoader(Contact.class.getClassLoader());
		xstream.alias("contact", ContactImpl.class);
		xstream.ignoreUnknownElements();
		Contact c = (Contact)xstream.fromXML(serializedContact);
		System.out.println(c.getFirstName());
		return "Greetings from Spring Boot!";
	}
}
