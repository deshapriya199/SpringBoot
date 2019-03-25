package san.springboot.starter.controller.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sdeshapriya
 *
 */
@RestController
public class WelComeController {
	
	@RequestMapping("/rest/welcome")
	public String welcome() {
		return "WelCome to Spring Boot";
	}
}
