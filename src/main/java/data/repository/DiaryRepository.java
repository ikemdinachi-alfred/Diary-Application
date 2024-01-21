package data.repository;

import data.model.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiaryRepository extends MongoRepository<Diary, String> {
}
