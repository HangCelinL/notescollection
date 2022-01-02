package spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import java.util.Date;

@Controller
public class WelcomeController {

  private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

  @GetMapping("/")
  public String index(Model model) {
    logger.debug("Funker dette...");
    model.addAttribute("msg", getMessage());
    // model.addAttribute("today", new Date());
    mode.addAttribute("vet ikke helt hva dette er");
    return "index";

  }

  private String getMessage() {
    return "Hello World";
  }
}
