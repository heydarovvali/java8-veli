package az.bakuCode.bookshopping.dao;

import az.bakuCode.bookshopping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book,Integer> {
}
