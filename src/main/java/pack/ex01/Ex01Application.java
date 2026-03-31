package pack.ex01;

import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex01Application {

    @GetMapping("/")
    public String hello() {
        System.out.println("Ex01");
        return "Ex01 project: Am 10:50";
    }

    public static void main(String[] args) {
        SpringApplication.run(Ex01Application.class, args);
    }
}
