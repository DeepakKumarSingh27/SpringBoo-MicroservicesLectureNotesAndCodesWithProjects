package in.ashokit.binding;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder
public class Book {

	@JsonProperty(value = "bookId")
	private Integer id;

	private String name;

	private Double price;

	private Author author;
}
