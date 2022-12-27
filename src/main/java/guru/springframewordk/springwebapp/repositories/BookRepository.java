package guru.springframewordk.springwebapp.repositories;

import guru.springframewordk.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
