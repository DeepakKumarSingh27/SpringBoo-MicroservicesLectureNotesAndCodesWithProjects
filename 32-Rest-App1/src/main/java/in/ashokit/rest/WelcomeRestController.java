package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	//This is most recommanded approach to develop the rest api
	/*
	 * @GetMapping("/welcome") public ResponseEntity<String> getWelcome() { String
	 * respPayLoad = "welcome to rest api";
	 * 
	 * return new ResponseEntity<>(respPayLoad, HttpStatus.OK); }
	 */
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(@RequestParam("name") String name) {
		String respPayLoad = name+ ",welcome to rest api";

		return new ResponseEntity<>(respPayLoad, HttpStatus.OK);
	}

	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String respPayLoad = "Good Morning..!!";
		return respPayLoad;
	}
	

}
