/*
 * package spring.core;
 * 
 * import javax.persistence.Entity;
 * import javax.persistence.FetchType;
 * import javax.persistence.Id;
 * import javax.persistence.ManyToOne;
 * import javax.persistence.JoinColumn;
 * import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType;
 * import javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnore;
 * import com.fasterxml.jackson.annotation.JsonSetter;
 * 
 * import lombok.Data;
 * 
 * @Entity
 * 
 * @Data
 * 
 * @Table(name = "Subcategory")
 * public class Subcategory {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * private Integer subId;
 * private String name;
 * 
 * @JsonIgnore
 * 
 * @ManyToOne(targetEntity = Subject.class, fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "subject")
 * private Subject subject;
 * 
 * public Subcategory(String name) {
 * this.name = name;
 * }
 * 
 * public Subcategory() {
 * 
 * }
 * 
 * public String getName() {
 * return this.name;
 * }
 * 
 * public void setName(String newName) {
 * this.name = newName;
 * }
 * 
 * @JsonIgnore
 * public Subject getSubject() {
 * return this.subject;
 * }
 * 
 * @JsonSetter
 * public void setSubject(Subject newSubject) {
 * this.subject = newSubject;
 * }
 * 
 * public Integer getSubId() {
 * return this.subId;
 * }
 * 
 * @Override
 * public boolean equals(Object o) {
 * if (this == o)
 * return true;
 * if (!(o instanceof Subcategory))
 * return false;
 * return subId != null && subId.equals(((Subcategory) o).getSubId());
 * }
 * 
 * @Override
 * public int hashCode() {
 * return getClass().hashCode();
 * }
 * }
 */