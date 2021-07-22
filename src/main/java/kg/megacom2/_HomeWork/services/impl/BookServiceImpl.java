package kg.megacom2._HomeWork.services.impl;

import kg.megacom2._HomeWork.Book;
import kg.megacom2._HomeWork.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public Book getBook() {
        return new Book("Belie parusa", 244);
    }
}
