package dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CreateEntryRequest {
    private String content;
    private String title;
    private String username;

}
