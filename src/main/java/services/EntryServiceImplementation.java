package services;

import data.model.Entry;
import data.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EntryServiceImplementation implements EntryService{
   @Autowired
    EntryRepository entryRepository;
    @Override
    public void createEntry(String title, String body, String diaryId) {

    }

    @Override
    public List<Entry> findEntryByDiaryId(String diaryId) {
        return null;
    }
}
