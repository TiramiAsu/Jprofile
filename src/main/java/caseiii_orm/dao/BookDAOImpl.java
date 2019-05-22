package caseiii_orm.dao;

import caseiii_orm.model.Book;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author TiramiAsu
 */
public class BookDAOImpl implements BookDAO{

    public static void main(String[] args) {
        new BookDAOImpl().test();
    }

    @Override
    public void test() {
        Configuration cfg = new Configuration().configure();
        System.out.println(cfg.configure().getProperty("hibernate.connection.datasource"));
        System.out.println(cfg.configure().getProperty("hibernate.dialect"));
        System.out.println(cfg.configure().getProperty("current_session_context_class"));
        System.out.println(cfg.configure().getProperty("cache.provider_class"));
        System.out.println(cfg.configure().getProperty("show_sql"));
    }

    @Override
    public boolean create(Book book) {
        return false;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Set<Book> queryAllBook() {
        return null;
    }

    @Override
    public Book queryBook(int id) {
//        Configuration cfg = new Configuration().configure();
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//        Book book = session.get(Book.class, id);
//        tx.commit();
//        return book;
return new Book("Harry Potter",50);
    }
    
}
