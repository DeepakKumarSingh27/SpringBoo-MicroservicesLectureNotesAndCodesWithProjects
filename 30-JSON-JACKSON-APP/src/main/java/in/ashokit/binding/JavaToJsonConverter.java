package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		
		Author author = new Author();
		author.setAuthorName("Rod Johnson");
		author.setAuthorEmail("r.jobn@gmail.com");
		author.setAuthorPhno(12345678l);
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(300.0);
		book.setAuthor(author);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.Json"), book);
		System.err.println("Conversion completed!!");
	}
}
