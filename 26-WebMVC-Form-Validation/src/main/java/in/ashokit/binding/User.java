package in.ashokit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

	@NotEmpty(message = "UName is required")
	@Size(min = 3,max = 8,message = "uname b/w 3 to 8 char")
	private String uname;
	
	@NotEmpty(message = "password is required")
	private String pwd;
	
	@NotEmpty(message = "Email is required")
	@Email(message = "Enter valid email id")
	private String email;
	
	@NotEmpty(message = "Phone is required")
	@Min(value = 10,message = "phone should be 10")
	private String phno;
	
	@NotNull(message = "Age is required")
	@Min(value = 21,message = "min age is 21 years")
	@Max(value = 60,message = "age not cross 60 years")
	private Integer age;
	
	

}
