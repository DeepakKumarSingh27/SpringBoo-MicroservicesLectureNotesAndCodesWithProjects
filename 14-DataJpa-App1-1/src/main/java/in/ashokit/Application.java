package in.ashokit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.e.repository.UserRepository;
import in.ashokit.entity.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		
//		  User u1 = new User(101, "Ramu", "Male", 25, "India"); //
//		  repository.save(u1); User u2 = new User(102, "Raju", "Male", 23,
//		  "India"); User u3 = new User(103, "Jonn", "Male", 28, "USA"); User u4 = new
//		  User(104, "Smith", "Male", 55, "Canada");
//		 repository.saveAll(Arrays.asList(u1, u2, u3, u4)); 
		 //Optional<User>
//		  findById = userRepository.findById(103); if(findById.isPresent())
//		  System.err.println(findById.get());
		 
		/*
		 * Iterable<User> allById = repository.findAllById(Arrays.asList(101, 102,
		 * 103)); allById.forEach(user -> { System.err.println(user); });
		 */
		/*
		 * Iterable<User> findAll = repository.findAll(); findAll.forEach(user ->{
		 * System.out.println(user); });
		 */
		/*
		 * long count = repository.count();
		 * System.out.println("Total records are: "+count);
		 * System.out.println(repository.existsById(101));
		 */
        
        //repository.deleteById(104);
        //repository.deleteAllById(Arrays.asList(102,103));
          
        
        
        
        
        
	}

}
