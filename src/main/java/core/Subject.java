package core;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SUBJECT")
public class Subject {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "subject")
  private String name;
  @Column(name = "subcategories")
  @OneToMany(targetEntity = Subcategory.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subject")
  private Collection<Subcategory> subcategories = new ArrayList<>();
  @Column(name = "subjectID")
  private int subjectID;

  public Subject(String name, Collection<Subcategory> subcategories, int subjectID) {
    this.name = name;
    this.subcategories = subcategories;
    this.subjectID = subjectID;
  }

  public Subject() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public int getSubjectId() {
    return this.subjectID;
  }

  public void setSubjectId(int id) {
    this.subjectID = id;
  }

  public Collection<Subcategory> getSubCategories() {
    return new ArrayList<>(this.subcategories);
  }

  public void addSubCategory(Subcategory subcategory) {
    subcategories.add(subcategory);
    subcategory.setSubject(this);
  }

  public void removeSubCategory(Subcategory subcategory) {
    subcategories.remove(subcategory);
    subcategory.setSubject(null);
  }

}
