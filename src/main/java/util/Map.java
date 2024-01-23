package util;

import data.model.Diary;
import dto.request.RegisterRequest;

public class Map {
    public static Diary mapRegisterToDiary(RegisterRequest registerRequest){
        Diary diary = new Diary();
        diary.setUsername(registerRequest.getUsername());
        diary.setPassword(registerRequest.getPassword());
        return diary;
    }
}
