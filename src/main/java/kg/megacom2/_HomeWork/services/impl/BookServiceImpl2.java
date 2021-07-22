package kg.megacom2._HomeWork.services.impl;

import kg.megacom2._HomeWork.Book;
import kg.megacom2._HomeWork.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 implements BookService {
    @Override
    public Book getBook() {
        return new Book("Mother Earth And Other Stories", 600);
    }
}
