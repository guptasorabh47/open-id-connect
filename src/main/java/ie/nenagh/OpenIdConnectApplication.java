package ie.nenagh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@SpringBootApplication
public class OpenIdConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenIdConnectApplication.class, args);
	}

	@ControllerAdvice
	static class SecurityControllerAdvice {
		@ModelAttribute("currentUser")
		public Principal currentUser(Principal currentUser) {
			return currentUser;
		}
	}

}
