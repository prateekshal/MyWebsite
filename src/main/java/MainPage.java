import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class MainPage {
  public MainPage() {}
  
  public static void main(String[] args) {
    SpringApplication.run(MainPage.class, args);
  }
  
  @RequestMapping("/")
  public String RootPage() {
    return "Hello World";
  }
}
