package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        student s1 = new student();
//        s1.setRollno(2);
//        s1.setSname("Anand");
//        s1.setMarks(95);

//        student s2 = null;

        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setaName("Jaadu");
        a1.setTech("dhoooop");
        a1.setLaptop(l1);

       // Configuration cfg = new Configuration();
       // cfg.addAnnotatedClass(org.example.student.class);     //It tells Hibernate which class (entity) it should map to the database.
       // cfg.configure();    //loads cononfiguration

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        //fetch data
//        s1 = session.find(student.class,1);
        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
        session.persist(a1);

        //to update data
//        session.merge(s1);

        //delete the data
//        session.remove(s1);

        transaction.commit();


        session.close();
        sf.close();

        System.out.println(a1);
    }
}