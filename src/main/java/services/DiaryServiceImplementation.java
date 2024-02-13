package services;

import data.model.Diary;
import data.model.Entry;
import data.repository.DiaryRepository;
import dto.request.CreateEntryRequest;
import dto.request.UserLoginRequest;
import dto.request.RegisterRequest;
import dto.responds.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.Map;

import java.util.List;
@Service
public class DiaryServiceImplementation implements DiaryService{
    @Autowired
    private DiaryRepository repository;
    @Autowired
    private RegistrationResponse registrationResponse;

    @Autowired
    private EntryService entryService;


    @Override
    public void register(RegisterRequest registerRequest) {
        if (userExist(registerRequest.getEmail()));
        Diary diary = Map.mapRegisterToDiary(registerRequest);
        repository.save(diary);
        registrationResponse.setMessage("Registration successful..");
    }
    private boolean userExist(String email){
        Diary diary = repository.findByUsername(email);
        return diary != null;
    }

    @Override
    public void login(UserLoginRequest loginRequest) {

    }

    @Override
    public void createEntry(CreateEntryRequest createEntryRequest) {

    }

    @Override
    public Entry readEntriesBelongingTo(String username, String title) {
        return null;
    }

    @Override
    public List<Entry> findEntriesBelongingTo(String username) {
        return null;
    }

    @Override
    public void writeOn(String username) {

    }
}
