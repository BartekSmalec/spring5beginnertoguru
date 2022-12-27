package guru.springframewordk.springwebapp.repositories;

import guru.springframewordk.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
