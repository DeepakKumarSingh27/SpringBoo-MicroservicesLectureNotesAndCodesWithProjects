package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Player;
import in.ashokit.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		Player p1 = new Player();
		p1.setPlayerId(102);
		p1.setPlayerName("Sachin");
		p1.setPlayerAge(42);
		p1.setLocation("mumbai");

		playerRepository.save(p1);
		int x = (int) playerRepository.count();

		Iterable<Player> ls = playerRepository.findAll();
		ls.forEach(e -> System.err.println(e));
		System.out.println(x);
		System.err.println("Record Inserted..");
		System.err.println(playerRepository.getClass().getName());

	}

}
