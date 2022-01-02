package spring.service;

import java.util.List;

import org.springframework.stereotype.Component;

import core.Subject;

@Component
public class SubjectService {
  private SubjectRepository subjectRepository;

  public SubjectService() {

  }

  public SubjectService(SubjectRepository subjectRepository) {
    this.subjectRepository = subjectRepository;
  }

  public List<Subject> getSubjects() {
    return subjectRepository.findAll();
  }

  public Subject saveSubject(Subject subject) {
    return subjectRepository.save(subject);
  }
}
