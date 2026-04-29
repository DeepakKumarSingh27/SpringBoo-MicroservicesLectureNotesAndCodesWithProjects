package in.ashokit.service;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void saveUser() throws Exception {

		String imagePath = "C:\\Users\\Deepak\\Downloads\\BiofarmBegDesign.jpg";
		User user = new User();
		user.setUserName("Suresh");
		user.setUserEmail("suresh@gmail.com");

		File file = new File(imagePath);
		FileInputStream fis = new FileInputStream(file);

		byte[] arr = new byte[(int) file.length()];
		fis.read(arr);
		fis.close();

		user.setUserImage(arr);

		userRepo.save(user);
	}

}
