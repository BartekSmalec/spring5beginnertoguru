package guru.springframewordk.springwebapp.repositories;

import guru.springframewordk.springwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
