package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        student s1 = new student();
        s1.setRollno(2);
        s1.setSname("Anand");
        s1.setMarks(80);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.student.class);     //It tells Hibernate which class (entity) it should map to the database.
        cfg.configure();    //loads cononfiguration

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

        System.out.println(s1);
    }
}