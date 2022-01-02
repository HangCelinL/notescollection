import java.util.ArrayList;
import java.util.Collection;

public class SubjectsCollection {

  private Collection<Subject> collection;

  public void addSubject(Subject subject) {
    collection.add(subject);
  }

  public void removeSubject(Subject subject) {
    collection.remove(subject);
  }

}
