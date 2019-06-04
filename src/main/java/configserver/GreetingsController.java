package configserver;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingsController {
	@RequestMapping("/greeting")
    String greeting();
}
