package guru.springframewordk.springwebapp.bootrap;

import guru.springframewordk.springwebapp.model.Author;
import guru.springframewordk.springwebapp.model.Book;
import guru.springframewordk.springwebapp.model.Publisher;
import guru.springframewordk.springwebapp.repositories.AuthorRepository;
import guru.springframewordk.springwebapp.repositories.BookRepository;
import guru.springframewordk.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Bartek","Wybickiego","Myślenice","Małopolska","32-400");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd =  new Book("Domain Driven", "1231231");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB =  new Book("J2EE development", "56456456");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
        System.out.println("Publisher get books size: " + publisher.getBooks().size());
    }
}
