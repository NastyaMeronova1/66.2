package kg.megacom2._HomeWork;

import kg.megacom2._HomeWork.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Library {
    private Book book;
    @Autowired
    @Qualifier("bookServiceImpl2")
    private BookService bookService;

    public Library(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
 public void newBook(){
       Book book =  bookService.getBook();
     System.out.println("New book" + book);
 }
    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                '}';
    }
}
