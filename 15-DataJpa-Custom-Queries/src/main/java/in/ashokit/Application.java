package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		/*
		 * User u0 = new User(101, "Deepak", "Male", 24, "India"); //
		 * repository.save(u1);
		 * 
		 * User u1 = new User(102, "Mri", "Male", 25, "Japan"); // repository.save(u1);
		 * User u2 = new User(103, "Raju", "Male", 27, "USA");
		 * 
		 * User u3 = new User(104, "smitt", "Male", 32, "CANADA");
		 * 
		 * repository.saveAll(Arrays.asList(u0,u1, u2, u3));
		 */
		 
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * Optional<User> findById = repository.findById(101); if (findById.isPresent())
		 * { System.out.println(findById.get()); }
		 */

		/*
		 * Iterable<User> ls = repository.findAllById(Arrays.asList(101,102,103));
		 * ls.forEach(e->System.err.println(e));
		 */

		/*
		 * Iterable<User> findAll = repository.findAll();
		 * findAll.forEach(e->System.err.println(e));
		 */

		/*
		 * long count = repository.count(); System.out.println(count);
		 */

		/*
		 * boolean byId = repository.existsById(101); System.out.println(byId);
		 */

		//repository.deleteById(105);
//		repository.deleteAllById(Arrays.asList(101,102));
//		System.err.println("Record deleted successfully...");
		  
		    //repository.deleteAll();
        
	}

}
