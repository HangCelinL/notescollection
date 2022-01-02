package spring.hibernate;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import core.Subcategory;
import core.Subject;

public class ManageSubject {

  private static SessionFactory factory;

  /* Method to CREATE an subject in the database */
  public Integer addSubject(Subject subject) {
    Session session = factory.openSession();
    Transaction tx = null;
    Integer id = null;

    try {
      tx = session.beginTransaction();
      // Subject subject = new Subject(name, subcategories, subjectID);
      id = (Integer) session.save(subject);
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null)
        tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
    return id;
  }

  /* Method to READ all the subjects */
  public void listSubjects() {
    Session session = factory.openSession();
    Transaction tx = null;

    try {
      tx = session.beginTransaction();
      List<Subject> subjects = session.createQuery("FROM Subject").list();
      for (Iterator<Subject> iterator = subjects.iterator(); iterator.hasNext();) {
        Subject subject = (Subject) iterator.next();
        System.out.print("Name: " + subject.getName());
        System.out.print("  Subcategories: " + Arrays.toString(subject.getSubCategories().toArray()));
        System.out.println("  SubjectID: " + subject.getSubjectId());
      }
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null)
        tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  /* Method to DELETE a subject from the records */
  public void deleteSubject(Integer subjectInteger) {
    Session session = factory.openSession();
    Transaction tx = null;

    try {
      tx = session.beginTransaction();
      Subject subject = (Subject) session.get(Subject.class, subjectInteger);
      session.delete(subject);
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null)
        tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

  public static void main(String[] args) {

    try {
      factory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) {
      System.err.println("Failed to create sessionFactory object." + ex);
      throw new ExceptionInInitializerError(ex);
    }

    ManageSubject MS = new ManageSubject();

    /* Add few subject records in database */

    Collection<Subcategory> algdatSubs = new ArrayList<Subcategory>();

    Collection<Subcategory> operativSubs = new ArrayList<Subcategory>();

    Collection<Subcategory> KTNSubs = new ArrayList<Subcategory>();

    Subject algdat = new Subject("Algdat", algdatSubs, 4120);
    algdat.addSubCategory(new Subcategory("dynamisk programmering"));

    Subject operativsystemer = new Subject("Operativsystemer", operativSubs, 4186);
    operativsystemer.addSubCategory(new Subcategory("macOS"));

    Subject ktn = new Subject("KTN", KTNSubs, 4100);

    Integer id1 = MS.addSubject(algdat);
    Integer id2 = MS.addSubject(operativsystemer);
    Integer id3 = MS.addSubject(ktn);

    /* List down all the employees */
    MS.listSubjects();

    /* Delete an employee from the database */
    MS.deleteSubject(id3);

    /* List down new list of the employees */
    MS.listSubjects();
  }
}
