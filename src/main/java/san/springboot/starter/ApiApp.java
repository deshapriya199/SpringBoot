package san.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author sdeshapriya
 *
 */
@SpringBootApplication
public class ApiApp{

	public static void main(String[] args) {
		SpringApplication.run(ApiApp.class, args);
	}

}
