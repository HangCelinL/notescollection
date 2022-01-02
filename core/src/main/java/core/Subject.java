import java.util.ArrayList;
import java.util.Collection;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Subject")
public class Subject {

  @Id
  @Column(name = "NAME")
  private String name;
  @Column(name = "SUBCATEGORIES")
  private Collection<SubCategory> subCategories;

  public Subject(String name) {
    this.name = name;
  }

  public getName() {
    return this.name;
  }

  public setName(String newName) {
    this.name = newName; 
  }

  public getSubCategories() {
    return new ArrayList<>(this.subCategories);
  }

  public void addSubCategory(SubCategory subCategory) {
    collection.add(subCategory);
  }

  public void removeSubCategory(SubCategory subCategory) {
    collection.remove(subCategory);
  }

}
