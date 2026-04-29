package in.ashokit.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.binding.Address;
import in.ashokit.binding.Person;

public class ConvertjavaToXml {

	public static void main(String[] args) throws JAXBException {
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("Telangna");
		addr.setCountry("India");

		Person person = new Person();
		person.setId(101);
		person.setName("John");
		person.setAge(55);
		person.setPhno(123456789l);
		person.setType("Doctor");
		person.setAddress(addr);
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("Marshaling completed");

	}
}
