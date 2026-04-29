package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;
import lombok.Data;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);
		/*
		 * User u1 = new User(101, "Ramu", "Male", 25, "India"); // User u2 = new
		 * User(102, "Raju", "Male", 23, "India"); User u3 = new User(103, "Jonn",
		 * "Male", 28, "USA"); User u4 = new User(104, "Smith", "Male", 55, "Canada");
		 * User u5 = new User(105, "Ganesh", "Male", 33, "India"); User u6 = new
		 * User(106, "Orlen", "Male", 34, "Germany"); User u7 = new User(107, "Charles",
		 * "Male", 35, "Maxico"); User u8 = new User(108, "Buttler", "Male", 36,
		 * "Austalia"); User u9 = new User(109, "Cathy", "Fe-male", 29, "USA"); User u10
		 * = new User(110, "Tanny", "Fe-Male", 28, "Canada");
		 * repository.saveAll(Arrays.asList(u1, u2, u3, u4,u5, u6, u7, u8, u9, u10));
		 * 
		 * List<User> users = repository.findAll(); users.forEach(user ->
		 * {System.err.println(user);});
		 * 
		 * List<User> users =
		 * repository.findAll(Sort.by("userName","age").descending());
		 * users.forEach(user -> { System.err.println(user); });
		 * 
		 * int pageSize = 3,pageNo = 0; PageRequest pageRequest = PageRequest.of(pageNo,
		 * pageSize); Page<User> pageData = repository.findAll(pageRequest); int
		 * totalPages = pageData.getTotalPages();
		 * System.out.println("Total Pages :: "+totalPages); List<User> users =
		 * pageData.getContent(); users.forEach(user -> { System.err.println(user); });
		 */

		User entity = new User();
		entity.setCountry("India");
		entity.setAge(25);
		Example<User> example = Example.of(entity);

		List<User> users = repository.findAll(example);

		users.forEach(user -> {
			System.err.println(user);
		});
         
	}

}
