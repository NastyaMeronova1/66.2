package kg.megacom2._HomeWork;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = Library.class)
public class BookConfig {
    @Bean(name = "book")
    @Scope("singleton")
    public Book getBook() {
        return new Book("English grammar in use", 400);
    }

    @Bean(name = "bookTwo")
    @Scope("prototype")
    public Book getBookTwo() {
        return new Book("Martin Eden", 500);
    }
    /*Prototype можно использовать для приложений где нужно контролировать систему отслеживания транспортных средств в реальном времени,
    если у вас будет 2 000 000 автомобилей, обменивающихся информацией каждые 5 секунд. На стороне сервера вы будете работать с двумя или
    более отдельными группами конфигураций, одна для автомобилей, а другая для грузовиков. Основываясь на этом простом примере, если вы
    проектируете свое приложение для работы с отдельными группами конфигурации в памяти через шаблон прототипа, вы добьетесь лучшей
    производительности.*/

    @Bean
    public String getBookName(){
        return "Ak keme";
    }
    @Bean
    @Primary
    public String getBookNameTwo(){
        return "Kod talanta";
    }
    @Bean
    public int getPages(){
        return 800;
    }
}
