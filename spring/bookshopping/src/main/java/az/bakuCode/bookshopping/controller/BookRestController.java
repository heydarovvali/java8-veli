package az.bakuCode.bookshopping.controller;

import az.bakuCode.bookshopping.dao.BookDAO;
import az.bakuCode.bookshopping.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookRestController {
    @Autowired
    private BookDAO bookDAO;
    @GetMapping
    public List<Book> findAll(){
        return bookDAO.findAll();
    }
}
