package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {
		File jsonFile = new File("book.Json");
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(jsonFile, Book.class);
		System.out.println(book);
	}
}
