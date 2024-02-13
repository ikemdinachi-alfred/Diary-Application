package dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
public class CreateEntryRequest {
    private String username;
    private String title;
    private String content;
    private LocalDateTime entryDate;

}
