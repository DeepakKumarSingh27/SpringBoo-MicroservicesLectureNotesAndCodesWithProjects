package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name) {
		String respBody = name + " price is 400 $";
		return new ResponseEntity<>(respBody, HttpStatus.OK);
	}
      
	@GetMapping("/book/name/{bName}/author/{aName}")
	public ResponseEntity<String> getBook(@PathVariable("bName") String bName, @PathVariable("aName") String aName) {
		String respBody = bName + " By " + aName + " is out of stock";
		return new ResponseEntity<String>(respBody, HttpStatus.OK);
	}
}
