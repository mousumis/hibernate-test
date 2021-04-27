package com.appian.hibernate;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
  public static void main(String[] args) {
    int id = 33;

    D1 row1 = new D1(id, "test1", UUID.randomUUID().toString());
    D1 row2 = new D1(id+1, "test2", UUID.randomUUID().toString());

    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(row1);
    session.save(row2);

    session.flush();
    session.clear();
    tx.commit();
    session.close();
    System.out.println("Done");
  }
}
