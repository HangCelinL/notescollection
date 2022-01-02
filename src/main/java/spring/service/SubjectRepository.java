
package spring.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import core.Subject;

@RepositoryRestResource()
public interface SubjectRepository
    extends JpaRepository<Subject, Integer>, JpaSpecificationExecutor<Subject>,
    QuerydslPredicateExecutor<Subject> {

}
