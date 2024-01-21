package data.repository;

import data.model.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryRepository extends MongoRepository<Entry, String> {
}
