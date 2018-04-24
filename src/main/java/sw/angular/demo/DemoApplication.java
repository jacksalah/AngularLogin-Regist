package sw.angular.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sw.angular.demo.Entity.User;
import sw.angular.demo.Repository.UserReprository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserReprository userReprository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//	userReprository.save(new User("sofsof","123","email","bankaccount","address","Adminstrator"));
		//userReprository.save(new User("jack","123","email","bankaccount","address","storeOwner"));

	}
}
