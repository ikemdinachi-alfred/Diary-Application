package services;
import data.model.Entry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntryService {
    void createEntry(String username, String title, String content, String entryDate);
    List<Entry> findEntryByDiaryId(String diaryId);
    Entry findEntryByTitle(String title);

}
