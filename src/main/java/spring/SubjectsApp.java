package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("spring.core")
@SpringBootApplication
public class SubjectsApp {

  public static void main(String[] args) {
    SpringApplication.run(SubjectsApp.class, args);
  }

}
