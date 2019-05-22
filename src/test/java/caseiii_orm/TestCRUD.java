/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseiii_orm;

import caseiii_orm.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author USER
 */
public class TestCRUD {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        // Create
        Book book1 = new Book("Java", 100);
        Book book2 = new Book("Kotlin", 120);

//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.getCurrentSession();
        Session session = cfg.buildSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        session.save(book1);
        session.save(book2);
        tx.commit();

    }
}
