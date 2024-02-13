package services;

import data.model.Entry;
import dto.request.CreateEntryRequest;
import dto.request.RegisterRequest;
import dto.request.UserLoginRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  DiaryService {
    void register(RegisterRequest registerRequest);
    void login(UserLoginRequest loginRequest);
    void createEntry(CreateEntryRequest createEntryRequest);
    Entry readEntriesBelongingTo(String username, String title);
    List<Entry> findEntriesBelongingTo(String username);
    void writeOn(String username);
}
