package data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Entry {
    private String id;
    private String title;
    private  String body;
     private LocalDate date;
     private String diaryId;
}