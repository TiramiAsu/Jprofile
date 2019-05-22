package caseiii_orm.dao;

import caseiii_orm.model.Book;
import java.util.Set;

/**
 *
 * @author TiramiAsu
 */
public interface BookDAO {
    void test();
    boolean create(Book book);
    boolean update(Book book);
    boolean delete(int id);
    Set<Book> queryAllBook();
    Book queryBook(int id);
}
