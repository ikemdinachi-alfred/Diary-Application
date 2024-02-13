package services;

import data.model.Entry;
import data.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class EntryServiceImplementation implements EntryService{
   @Autowired
    EntryRepository entryRepository;

    @Override
    public void createEntry(String username, String title, String content, String entryDate) {
        Entry newEntry = new Entry();
        newEntry.setUsername(username);
        newEntry.setTitle(title);
        newEntry.setContent(content);
        newEntry.setDate(LocalDate.parse(entryDate));
        if (findEntryByTitle(title) != null) {update(newEntry);
        }
        entryRepository.save(newEntry);

    }
    private void update(Entry entry){
        Entry newEntry = findEntryByTitle(entry.getTitle());
        String oldContent = newEntry.getContent();
        entryRepository.deleteById(entry.getId());
        entry.setContent(STR."\{oldContent}/n\{entry.getContent()}");
        entryRepository.save(entry);
    }

    @Override
    public List<Entry> findEntryByDiaryId(String diaryId) {
        List<Entry> entries = new ArrayList<>();
        for (Entry entry: entryRepository.findAll()){
            if (entry.getDiaryId().equals(diaryId)) entries.add(entry);
        }
        return entries;
    }

    @Override
    public Entry findEntryByTitle(String title) {
        for (Entry entry : entryRepository.findAll()){
            if (entry.getTitle().equals(title)) return entry;
        }
        return null;
    }

}
