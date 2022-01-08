package spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/notescollection/")
public class WelcomeController {

  private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

  @GetMapping("/")
  public String index(Model model) {
    logger.debug("Da skal det funke");
    model.addAttribute("msg", getMessage());
    model.addAttribute("vet ikke helt hva dette er");
    return "index";

  }

  private String getMessage() {
    return "NotesCollection up and coming";
  }
}
