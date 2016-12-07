import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by puchen on 12/6/16.
 */

@RestController
public class HelloWorldRestController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello Spring Boot";
    }
}
