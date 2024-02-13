package data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Diary {
    @Id
    private String id;
    private String username;
    private String password;
    private boolean isLocked = true;
    List<Entry> entries;
}
