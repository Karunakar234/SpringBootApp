package hello;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is to run SpringBootApplication
 * @author karunakar
 *
 */

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
  /**
   * Run the spring boot container
   * @param args
   */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
