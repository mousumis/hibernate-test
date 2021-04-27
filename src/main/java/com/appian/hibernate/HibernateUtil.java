package com.appian.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  private static SessionFactory sessionFactory ;
  static {
    Configuration configuration = new Configuration().configure();
    try {
      sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
