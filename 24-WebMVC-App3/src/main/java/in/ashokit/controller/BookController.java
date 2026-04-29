package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		// setting data to binding obj
		Book bookObj = new Book(101, "Spring", 450.00);

		// adding data to model obj to send to ui
		model.addAttribute("book", bookObj);

		// returning view name
		return "book";
	}

	@GetMapping("/books")
	public String getBooksData(Model model) {
		// setting data to binding obj
		Book b1 = new Book(102, "Spring", 450.00);
		Book b2 = new Book(103, "Java", 550.00);
		Book b3 = new Book(104, "Hibernate", 650.00);
		Book b4 = new Book(105, "Python", 850.00);

		List<Book> bookList = Arrays.asList(b1, b2, b3, b4);

		// adding data to model obj to send to ui
		model.addAttribute("books", bookList);

		// returning view name
		return "books";
	}
}
