import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Test {

	public static void main(String[] args) {
		String pass ="admin";
		 PasswordEncoder encoder = new BCryptPasswordEncoder();  
		 String hashPass = encoder.encode(pass);  
		 System.out.println(hashPass);  
	}

}
