package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseFee(String cname, String tname) {
		String respBody = cname + " By " + tname + " Fee is 4000 INR";
		return new ResponseEntity<String>(respBody, HttpStatus.OK);
	}
}
