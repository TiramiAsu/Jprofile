/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c99_web.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author USER
 */
public class DAOImpl {

    public Object query(Class cls, String code) {

        String sql = "SELECT * FROM JAVAWEB.ICPRODUCTS WHERE PD_CODE = 'A007'";
        
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Object object = session.get(cls, code);
//        Object list = session.createQuery(sql).list();
        tx.commit();
        return object;
    }

    public Set<Object> queryAll(Class cls) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tx = session.beginTransaction();

        List list = session.createQuery("from " + cls.getName()).list();
        tx.commit();
        return new LinkedHashSet<>(list);
    }

    public boolean delete(Class cls, String code) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tx = session.beginTransaction();

        session.delete(query(cls, code));
        tx.commit();
        return true;
    }

    public boolean create(Object object) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tx = session.beginTransaction();

        session.save(object);
        tx.commit();
        return true;
    }

    public boolean update(Object object) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction tx = session.beginTransaction();

        session.update(object);
        tx.commit();
        return true;
    }

}
