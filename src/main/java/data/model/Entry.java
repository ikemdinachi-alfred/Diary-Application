package data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Entry {
    private String id;
    private String title;
    private  String content;
     private LocalDate date;
     private String diaryId;
}
