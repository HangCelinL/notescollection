package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import spring.core.Subject;
import spring.links.SubjectLinks;
import spring.service.SubjectService;

@Slf4j
@RestController
@RequestMapping("/api/")
public class SubjectController {
  @Autowired
  SubjectService subjectService;

  @GetMapping(path = SubjectLinks.LIST_Subjects)
  public ResponseEntity<?> listSubjects() {
    log.info("SubjectController:  list subjects");
    List<Subject> resource = subjectService.getSubjects();
    return ResponseEntity.ok(resource);
  }

  @PostMapping(path = SubjectLinks.ADD_SUBJECT)
  public ResponseEntity<?> saveUser(@RequestBody Subject subject) {
    log.info("SubjectController:  list subjects");
    Subject resource = subjectService.saveSubject(subject);
    return ResponseEntity.ok(resource);
  }
}
