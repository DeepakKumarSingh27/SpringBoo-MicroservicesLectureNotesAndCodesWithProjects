package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String greetMsg() {
		String greetMsg = "Good Morining, ";
		String welcomeMsg = welcomeApiClient.invokeWelcomeApi();
		return greetMsg + welcomeMsg;
	}
}
