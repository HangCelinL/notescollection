package spring.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernateutil {

  SessionFactory sessionFactory;
  // configures settings from hibernate.cfg.xml
  StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
  {
    try {
      sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    } catch (Exception e) {
      // handle the exception
    }
  }
}
