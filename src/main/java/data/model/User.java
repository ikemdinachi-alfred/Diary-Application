package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User {
    @Id
   private String id;
   private String fullName;
   private String username;
   private String phoneNumber;
   private String email;
   private String password;
   List<Diary> diaries;
}
