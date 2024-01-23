package services;

import data.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EntryService {
    void createEntry (String title, String body, String diaryId);
    List<Entry> findEntryByDiaryId(String diaryId);

}
