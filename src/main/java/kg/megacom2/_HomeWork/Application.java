package kg.megacom2._HomeWork;

import kg.megacom2._HomeWork.services.BookService;
import kg.megacom2._HomeWork.services.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
        System.out.println("");
        System.out.println("First book with singleton");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        System.out.println("Second book with singleton");
        Book book2 = (Book) context.getBean("book");
        System.out.println(book2);
        System.out.println("Comparing singleton: " + book.equals(book2));
        System.out.println("-------------------------------------------------");
        System.out.println("First book with prototype");
        Book book1 = (Book) context.getBean("bookTwo");
        System.out.println(book1);
        System.out.println("Second book with prototype");
        Book books = (Book) context.getBean("bookTwo");
        System.out.println(books);
        System.out.println("Comparing prototype: " + book1.equals(books));
        System.out.println("-------------------------------------------------");
        System.out.println("Method used @Qualifier");
        Library library = context.getBean("library", Library.class);
        library.newBook();
        System.out.println("-------------------------------------------------");
        System.out.println(library);
        BookService bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);
        System.out.println(bookService.getBook());
    }

}
